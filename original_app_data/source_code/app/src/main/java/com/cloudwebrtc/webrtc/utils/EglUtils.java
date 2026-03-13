package com.cloudwebrtc.webrtc.utils;

import org.webrtc.EglBase;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class EglUtils {
    private static EglBase rootEglBase;

    public static synchronized EglBase getRootEglBase() {
        try {
            if (rootEglBase == null) {
                rootEglBase = EglBase.create();
            }
        } catch (Throwable th) {
            throw th;
        }
        return rootEglBase;
    }

    public static EglBase.Context getRootEglBaseContext() {
        EglBase rootEglBase2 = getRootEglBase();
        if (rootEglBase2 == null) {
            return null;
        }
        return rootEglBase2.getEglBaseContext();
    }
}
