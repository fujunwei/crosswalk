// Copyright 2015 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.xwalk.core.internal;

@XWalkAPI(impl = XWalkGeolocationCallbackInternal.class, createInternally = true)
public class XWalkGeolocationCallbackHandlerInternal implements XWalkGeolocationCallbackInternal {
    private final XWalkContent mContent;

    XWalkGeolocationCallbackHandlerInternal() {
        mContent = null;
    }

    XWalkGeolocationCallbackHandlerInternal(XWalkContent content) {
        mContent = content;
    }

    @Override
    @XWalkAPI
    public void invoke(String origin, boolean allow, boolean retain) {
//        mContent.invokeGeolocationCallback(origin, allow, retain);
    }
}
