package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class H3 extends Exception {
    public H3() {
    }

    public H3(String str) {
        super(str);
    }

    public H3(String str, Throwable th) {
        super("ContentProvider query failed", th);
    }
}
