package com.github.dart_lang.jni;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class JniUtils {
    static {
        System.loadLibrary("dartjni");
    }

    public static native Object fromReferenceAddress(long j10);
}
