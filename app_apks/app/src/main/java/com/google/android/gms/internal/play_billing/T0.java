package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class T0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T0 f30089b = new T0(new a("Failure occurred while trying to finish a future."));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f30090a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends Throwable {
        public a(String str) {
            super("Failure occurred while trying to finish a future.");
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public T0(Throwable th) {
        th.getClass();
        this.f30090a = th;
    }
}
