/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.xwalk.core.internal;

/**
 * Encompasses parameters to the {@link XWalkUIClient#onGeolocationPermissionsShowPrompt} method.
 */
@XWalkAPI(instance = XWalkGeolocationCallbackHandlerInternal.class)
public interface XWalkGeolocationCallbackInternal {
    /**
     * Gets the URL for which the resource request was made.
     *
     * @return the URL for which the resource request was made.
     * @since 6.0
     */
    @XWalkAPI
    public void invoke(String origin, boolean allow, boolean remember);
}
