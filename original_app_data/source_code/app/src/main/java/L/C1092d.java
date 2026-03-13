package L;

import androidx.lifecycle.AbstractC2763t;

/* JADX INFO: renamed from: L.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C1092d extends AbstractC1122s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f8016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B f8019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AbstractC2763t f8020f;

    public C1092d(I i10, B b10) {
        super(i10);
        this.f8017c = false;
        this.f8018d = false;
        this.f8020f = null;
        this.f8016b = i10;
        this.f8019e = b10;
        b10.q(null);
        x(b10.L());
        w(b10.X());
    }

    public static float t(float f10, float f11, float f12) {
        if (f12 == f11) {
            return 0.0f;
        }
        if (f10 == f12) {
            return 1.0f;
        }
        if (f10 == f11) {
            return 0.0f;
        }
        float f13 = 1.0f / f11;
        return ((1.0f / f10) - f13) / ((1.0f / f12) - f13);
    }

    public static float v(float f10, float f11, float f12) {
        if (f10 == 1.0f) {
            return f12;
        }
        if (f10 == 0.0f) {
            return f11;
        }
        double d10 = 1.0f / f11;
        return (float) S0.a.a(1.0d / (d10 + ((((double) (1.0f / f12)) - d10) * ((double) f10))), f11, f12);
    }

    @Override // L.AbstractC1122s0, L.I
    public I getImplementation() {
        return this.f8016b;
    }

    @Override // L.AbstractC1122s0, E.InterfaceC0815u
    public boolean i() {
        if (M.v.b(null, 5)) {
            return this.f8016b.i();
        }
        return false;
    }

    @Override // L.AbstractC1122s0, E.InterfaceC0815u
    public AbstractC2763t n() {
        return !M.v.b(null, 6) ? new androidx.lifecycle.w(0) : this.f8016b.n();
    }

    @Override // L.AbstractC1122s0, E.InterfaceC0815u
    public AbstractC2763t q() {
        return !M.v.b(null, 0) ? new androidx.lifecycle.w(P.h.e(1.0f, 1.0f, 1.0f, 0.0f)) : this.f8016b.q();
    }

    public B s() {
        return this.f8019e;
    }

    public c1 u() {
        return null;
    }

    public void w(boolean z10) {
        this.f8018d = z10;
    }

    public void x(boolean z10) {
        this.f8017c = z10;
    }
}
