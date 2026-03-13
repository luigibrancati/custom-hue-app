package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.y1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3643y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3641y f30267a = new C3641y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Logger f30269c;

    public C3643y1(Class cls) {
        this.f30268b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.f30269c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f30267a) {
            try {
                Logger logger2 = this.f30269c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f30268b);
                this.f30269c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
