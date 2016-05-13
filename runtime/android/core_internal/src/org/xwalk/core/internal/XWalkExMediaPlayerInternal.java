// Copyright (c) 2013-2014 Intel Corporation. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.xwalk.core.internal;

import org.chromium.media.ExMediaPlayer;
import android.view.Surface;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import java.io.FileDescriptor;
import java.util.HashMap;
import java.util.Map;
import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import android.util.Log;

@XWalkAPI(createExternally = true)
public class XWalkExMediaPlayerInternal extends ExMediaPlayer {
	private final static String TAG = "XWalkExMediaPlayerInternal";
	@XWalkAPI
	public void setSurface(Surface surface) {
		// super.setSurface(surface);
		Log.e(TAG, "==== ERROR: setSurface Must be implemented");
    }

    @XWalkAPI
    public void setDataSource(Context context, Uri uri, Map<String, String> headers) {
    	// super.setDataSource(context, uri, headers);
    	Log.e(TAG, "==== ERROR: setDataSource Must be implemented");
    }

    @XWalkAPI
    public void setDataSource (FileDescriptor fd, long offset, long length) {
    	// super.setDataSource(fd, offset, length);
    	Log.e(TAG, "==== ERROR: setDataSource Must be implemented");
    }

    @XWalkAPI
    public void setDataSource (Context context, Uri uri) {
    	// super.setDataSource(context, uri);
    	Log.e(TAG, "==== ERROR: setDataSource Must be implemented");
    }

    @XWalkAPI
    public void prepareAsync() {
    	// super.prepareAsync();
    	Log.e(TAG, "==== ERROR: prepareAsync Must be implemented");
    }

    @XWalkAPI
    public boolean isPlaying() {
    	Log.e(TAG, "==== ERROR: isPlaying Must be implemented");
    	return false;//super.isPlaying();
    }

    @XWalkAPI
    public int getVideoWidth() {
    	Log.e(TAG, "==== ERROR: getVideoWidth Must be implemented");
    	return 0;//super.getVideoWidth();
    }

    @XWalkAPI
    public int getVideoHeight() {
    	Log.e(TAG, "==== ERROR: getVideoHeight Must be implemented");
    	return 0;//super.getVideoHeight();
    }

    @XWalkAPI
    public int getCurrentPosition() {
    	Log.e(TAG, "==== ERROR: getCurrentPosition Must be implemented");
    	return 0;//super.getCurrentPosition();
    }

    @XWalkAPI
    public int getDuration() {
    	Log.e(TAG, "==== ERROR: getDuration Must be implemented");
    	return 0;//super.getDuration();
    }

    @XWalkAPI
    public void release() {
    	Log.e(TAG, "==== ERROR: release Must be implemented");
    	// super.release();
    }

    @XWalkAPI
    public void setVolume(float volume1, float volume2) {
    	// super.setVolume(volume1, volume2);
    	Log.e(TAG, "==== ERROR: setVolume Must be implemented");
    }

    @XWalkAPI
    public void start() {
    	// super.start();
    	Log.e(TAG, "==== ERROR: start Must be implemented");
    }

    @XWalkAPI
    public void pause() {
    	// super.pause();
    	Log.e(TAG, "==== ERROR: pause Must be implemented");
    }

    @XWalkAPI
    public void seekTo(int msec) {
    	// super.seekTo(msec);
    	Log.e(TAG, "==== ERROR: seekTo Must be implemented");
    }

    @XWalkAPI
    public void setOnBufferingUpdateListener(OnBufferingUpdateListener listener) {
    	// super.setOnBufferingUpdateListener(listener);
    	Log.e(TAG, "==== ERROR: setOnBufferingUpdateListener Must be implemented");
    }

    @XWalkAPI
    public void setOnCompletionListener(OnCompletionListener listener) {
    	// super.setOnCompletionListener(listener);
    	Log.e(TAG, "==== ERROR: setOnCompletionListener Must be implemented");
    }

    @XWalkAPI
    public void setOnErrorListener(OnErrorListener listener) {
    	// super.setOnErrorListener(listener);
    	Log.e(TAG, "==== ERROR: setOnErrorListener Must be implemented");
    }

    @XWalkAPI
    public void setOnPreparedListener(OnPreparedListener listener) {
    	// super.setOnPreparedListener(listener);
    	Log.e(TAG, "==== ERROR: setOnPreparedListener Must be implemented");
    }

    @XWalkAPI
    public void setOnSeekCompleteListener(OnSeekCompleteListener listener) {
    	// super.setOnSeekCompleteListener(listener);
    	Log.e(TAG, "==== ERROR: setOnSeekCompleteListener Must be implemented");
    }

    @XWalkAPI
    public void setOnVideoSizeChangedListener(OnVideoSizeChangedListener listener) {
    	// super.setOnVideoSizeChangedListener(listener);
    	Log.e(TAG, "==== ERROR: setOnVideoSizeChangedListener Must be implemented");
    }
}
