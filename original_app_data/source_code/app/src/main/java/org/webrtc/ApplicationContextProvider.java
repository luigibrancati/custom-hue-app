package org.webrtc;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class ApplicationContextProvider {
    @CalledByNative
    public static Context getApplicationContext() {
        return ContextUtils.getApplicationContext();
    }
}
