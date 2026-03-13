package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class A0 extends B0 implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final A0 f29990c = new A0(W.f30107b, V.f30101b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X f29991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X f29992b;

    public A0(X x10, X x11) {
        this.f29991a = x10;
        this.f29992b = x11;
        if (x10.a(x11) > 0 || x10 == V.f30101b || x11 == W.f30107b) {
            throw new IllegalArgumentException("Invalid range: ".concat(e(x10, x11)));
        }
    }

    public static A0 a() {
        return f29990c;
    }

    public static String e(X x10, X x11) {
        StringBuilder sb2 = new StringBuilder(16);
        x10.b(sb2);
        sb2.append("..");
        x11.j(sb2);
        return sb2.toString();
    }

    public final A0 b(A0 a02) {
        int iA = this.f29991a.a(a02.f29991a);
        int iA2 = this.f29992b.a(a02.f29992b);
        if (iA >= 0 && iA2 <= 0) {
            return this;
        }
        if (iA <= 0 && iA2 >= 0) {
            return a02;
        }
        X x10 = iA >= 0 ? this.f29991a : a02.f29991a;
        X x11 = iA2 <= 0 ? this.f29992b : a02.f29992b;
        AbstractC3629w.d(x10.a(x11) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, a02);
        return new A0(x10, x11);
    }

    public final A0 c(A0 a02) {
        int iA = this.f29991a.a(a02.f29991a);
        int iA2 = this.f29992b.a(a02.f29992b);
        if (iA <= 0 && iA2 >= 0) {
            return this;
        }
        if (iA >= 0 && iA2 <= 0) {
            return a02;
        }
        X x10 = iA <= 0 ? this.f29991a : a02.f29991a;
        if (iA2 < 0) {
            this = a02;
        }
        return new A0(x10, this.f29992b);
    }

    public final boolean d() {
        return this.f29991a.equals(this.f29992b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof A0) {
            A0 a02 = (A0) obj;
            if (this.f29991a.equals(a02.f29991a) && this.f29992b.equals(a02.f29992b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f29991a.hashCode() * 31) + this.f29992b.hashCode();
    }

    public final String toString() {
        return e(this.f29991a, this.f29992b);
    }
}
