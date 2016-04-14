// Copyright (c) 2014 Intel Corporation. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.xwalk.core.internal;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.net.Uri;

import org.chromium.media.MediaPlayerBridge;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class inherits from MediaPlayerBridge.ResourceLoadingFilter to
 * customize the resource loading process in xwalk.
 */

class XWalkMediaPlayerResourceLoadingFilter extends
        MediaPlayerBridge.ResourceLoadingFilter {
    XWalkContentsClientBridge mContentsClientBridge;

    XWalkMediaPlayerResourceLoadingFilter(XWalkContentsClientBridge clientBridge) {
        mContentsClientBridge = clientBridge;
    }

    @Override
    public boolean shouldOverrideResourceLoading(MediaPlayer mediaPlayer,
            Context context, Uri uri, Map<String, String> headers) {
        String scheme = uri.getScheme();
        if (scheme == null) return false;
        if (scheme.equals(AndroidProtocolHandler.APP_SCHEME)) {
            uri = AndroidProtocolHandler.appUriToFileUri(uri);
        }

        scheme = uri.getScheme();
        if (scheme.equals(AndroidProtocolHandler.FILE_SCHEME)) {
            try {
                AssetFileDescriptor afd =
                        context.getAssets().openFd(AndroidProtocolHandler.getAssetPath(uri));
                mediaPlayer.setDataSource(
                        afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());

                return true;
            } catch (Exception e) {
                return false;
            }
        } else if (scheme.equals("http")) {
            // Send to XWalkResourceClient
            return mContentsClientBridge.shouldOverrideResourceLoading(mediaPlayer, context, uri, headers);
        }

        return false;
    }
}
