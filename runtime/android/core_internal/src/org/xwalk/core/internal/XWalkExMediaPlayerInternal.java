// Copyright (c) 2013-2014 Intel Corporation. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.xwalk.core.internal;

import android.content.Context;
import android.net.Uri;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.util.Log;
import android.view.Surface;

import java.io.FileDescriptor;
import java.util.HashMap;
import java.util.Map;

import org.chromium.media.ExMediaPlayer;

@XWalkAPI(createExternally = true)
public class XWalkExMediaPlayerInternal extends ExMediaPlayer {
	private final static String TAG = "XWalkExMediaPlayerInternal";

    private void unsupported() {
        Log.e(TAG, "ERROR: The function must be implemented");
        throw new UnsupportedOperationException();
    }

	@XWalkAPI
	public void setSurface(Surface surface) {
        unsupported();
    }

    @XWalkAPI
    public void setDataSource(Context context, Uri uri, Map<String, String> headers) {
        unsupported();
    }

    @XWalkAPI
    public void setDataSource (FileDescriptor fd, long offset, long length) {
        unsupported();
    }

    @XWalkAPI
    public void setDataSource (Context context, Uri uri) {
        unsupported();
    }

    @XWalkAPI
    public void prepareAsync() {
        unsupported();
    }

    @XWalkAPI
    public boolean isPlaying() {
        unsupported();
        return false;
    }

    @XWalkAPI
    public int getVideoWidth() {
        unsupported();
        return 0;
    }

    @XWalkAPI
    public int getVideoHeight() {
        unsupported();
        return 0;
    }

    @XWalkAPI
    public int getCurrentPosition() {
        unsupported();
        return 0;
    }

    @XWalkAPI
    public int getDuration() {
        unsupported();
        return 0;
    }

    @XWalkAPI
    public void release() {
        unsupported();
    }

    @XWalkAPI
    public void setVolume(float volume1, float volume2) {
        unsupported();
    }

    @XWalkAPI
    public void start() {
        unsupported();
    }

    @XWalkAPI
    public void pause() {
        unsupported();
    }

    @XWalkAPI
    public void seekTo(int msec) {
        unsupported();
    }

    @XWalkAPI
    public void setOnBufferingUpdateListener(OnBufferingUpdateListener listener) {
        unsupported();
    }

    @XWalkAPI
    public void setOnCompletionListener(OnCompletionListener listener) {
        unsupported();
    }

    @XWalkAPI
    public void setOnErrorListener(OnErrorListener listener) {
        unsupported();
    }

    @XWalkAPI
    public void setOnPreparedListener(OnPreparedListener listener) {
        unsupported();
    }

    @XWalkAPI
    public void setOnSeekCompleteListener(OnSeekCompleteListener listener) {
        unsupported();
    }

    @XWalkAPI
    public void setOnVideoSizeChangedListener(OnVideoSizeChangedListener listener) {
        unsupported();
    }
}
