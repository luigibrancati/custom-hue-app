package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C3256m5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile C5 f29548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile E4 f29549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f29550c;

    public final int a() {
        if (this.f29549b != null) {
            return ((D4) this.f29549b).f29159c.length;
        }
        if (this.f29548a != null) {
            return this.f29548a.a();
        }
        return 0;
    }

    public final E4 b() {
        if (this.f29549b != null) {
            return this.f29549b;
        }
        synchronized (this) {
            try {
                if (this.f29549b != null) {
                    return this.f29549b;
                }
                if (this.f29548a == null) {
                    this.f29549b = E4.f29169b;
                } else {
                    this.f29549b = this.f29548a.e();
                }
                return this.f29549b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(C5 c52) {
        if (this.f29548a != null) {
            return;
        }
        synchronized (this) {
            if (this.f29548a != null) {
                return;
            }
            try {
                this.f29548a = c52;
                this.f29549b = E4.f29169b;
            } catch (C3229j5 unused) {
                this.f29550c = true;
                this.f29548a = c52;
                this.f29549b = E4.f29169b;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3256m5)) {
            return false;
        }
        C3256m5 c3256m5 = (C3256m5) obj;
        C5 c52 = this.f29548a;
        C5 c53 = c3256m5.f29548a;
        if (c52 == null && c53 == null) {
            return b().equals(c3256m5.b());
        }
        if (c52 != null && c53 != null) {
            return c52.equals(c53);
        }
        if (c52 != null) {
            c3256m5.c(c52.j());
            return c52.equals(c3256m5.f29548a);
        }
        c(c53.j());
        return this.f29548a.equals(c53);
    }

    public int hashCode() {
        return 1;
    }
}
