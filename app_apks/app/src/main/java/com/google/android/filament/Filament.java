package com.google.android.filament;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class Filament {
    static {
        Platform.get();
        System.loadLibrary("filament-jni");
    }

    private Filament() {
    }

    public static void init() {
    }
}
