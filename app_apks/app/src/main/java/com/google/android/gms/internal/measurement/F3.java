package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class F3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static E3 f29178a;

    public static synchronized void a(E3 e32) {
        if (f29178a != null) {
            throw new IllegalStateException("init() already called");
        }
        f29178a = e32;
    }

    public static synchronized E3 b() {
        try {
            if (f29178a == null) {
                a(new I3());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f29178a;
    }
}
