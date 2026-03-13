package m1;

import m1.AbstractC5003b;

/* JADX INFO: renamed from: m1.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5006e extends AbstractC5003b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C5007f f40148A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f40149B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f40150C;

    public C5006e(C5005d c5005d) {
        super(c5005d);
        this.f40148A = null;
        this.f40149B = Float.MAX_VALUE;
        this.f40150C = false;
    }

    @Override // m1.AbstractC5003b
    public void p() {
        u();
        this.f40148A.g(f());
        super.p();
    }

    @Override // m1.AbstractC5003b
    public boolean r(long j10) {
        if (this.f40150C) {
            float f10 = this.f40149B;
            if (f10 != Float.MAX_VALUE) {
                this.f40148A.e(f10);
                this.f40149B = Float.MAX_VALUE;
            }
            this.f40131b = this.f40148A.a();
            this.f40130a = 0.0f;
            this.f40150C = false;
            return true;
        }
        if (this.f40149B != Float.MAX_VALUE) {
            this.f40148A.a();
            long j11 = j10 / 2;
            AbstractC5003b.p pVarH = this.f40148A.h(this.f40131b, this.f40130a, j11);
            this.f40148A.e(this.f40149B);
            this.f40149B = Float.MAX_VALUE;
            AbstractC5003b.p pVarH2 = this.f40148A.h(pVarH.f40144a, pVarH.f40145b, j11);
            this.f40131b = pVarH2.f40144a;
            this.f40130a = pVarH2.f40145b;
        } else {
            AbstractC5003b.p pVarH3 = this.f40148A.h(this.f40131b, this.f40130a, j10);
            this.f40131b = pVarH3.f40144a;
            this.f40130a = pVarH3.f40145b;
        }
        float fMax = Math.max(this.f40131b, this.f40137h);
        this.f40131b = fMax;
        float fMin = Math.min(fMax, this.f40136g);
        this.f40131b = fMin;
        if (!t(fMin, this.f40130a)) {
            return false;
        }
        this.f40131b = this.f40148A.a();
        this.f40130a = 0.0f;
        return true;
    }

    public void s(float f10) {
        if (g()) {
            this.f40149B = f10;
            return;
        }
        if (this.f40148A == null) {
            this.f40148A = new C5007f(f10);
        }
        this.f40148A.e(f10);
        p();
    }

    public boolean t(float f10, float f11) {
        return this.f40148A.c(f10, f11);
    }

    public final void u() {
        C5007f c5007f = this.f40148A;
        if (c5007f == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dA = c5007f.a();
        if (dA > this.f40136g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dA < this.f40137h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    public C5006e v(C5007f c5007f) {
        this.f40148A = c5007f;
        return this;
    }

    @Override // m1.AbstractC5003b
    public void o(float f10) {
    }
}
