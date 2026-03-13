package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.w1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C3480w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile J1 f29956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile G0 f29957b;

    public final int a() {
        if (this.f29957b != null) {
            return ((F0) this.f29957b).f29752c.length;
        }
        if (this.f29956a != null) {
            return this.f29956a.a();
        }
        return 0;
    }

    public final G0 b() {
        if (this.f29957b != null) {
            return this.f29957b;
        }
        synchronized (this) {
            try {
                if (this.f29957b != null) {
                    return this.f29957b;
                }
                if (this.f29956a == null) {
                    this.f29957b = G0.f29754b;
                } else {
                    this.f29957b = this.f29956a.w();
                }
                return this.f29957b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(J1 j12) {
        if (this.f29956a != null) {
            return;
        }
        synchronized (this) {
            if (this.f29956a != null) {
                return;
            }
            try {
                this.f29956a = j12;
                this.f29957b = G0.f29754b;
            } catch (C3455r1 unused) {
                this.f29956a = j12;
                this.f29957b = G0.f29754b;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3480w1)) {
            return false;
        }
        C3480w1 c3480w1 = (C3480w1) obj;
        J1 j12 = this.f29956a;
        J1 j13 = c3480w1.f29956a;
        if (j12 == null && j13 == null) {
            return b().equals(c3480w1.b());
        }
        if (j12 != null && j13 != null) {
            return j12.equals(j13);
        }
        if (j12 != null) {
            c3480w1.c(j12.t());
            return j12.equals(c3480w1.f29956a);
        }
        c(j13.t());
        return this.f29956a.equals(j13);
    }

    public int hashCode() {
        return 1;
    }
}
