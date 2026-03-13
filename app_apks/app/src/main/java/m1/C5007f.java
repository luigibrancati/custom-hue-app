package m1;

import m1.AbstractC5003b;

/* JADX INFO: renamed from: m1.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5007f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f40151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f40152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f40153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f40154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f40155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f40156f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f40157g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f40158h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f40159i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AbstractC5003b.p f40160j;

    public C5007f() {
        this.f40151a = Math.sqrt(1500.0d);
        this.f40152b = 0.5d;
        this.f40153c = false;
        this.f40159i = Double.MAX_VALUE;
        this.f40160j = new AbstractC5003b.p();
    }

    public float a() {
        return (float) this.f40159i;
    }

    public final void b() {
        if (this.f40153c) {
            return;
        }
        if (this.f40159i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d10 = this.f40152b;
        if (d10 > 1.0d) {
            double d11 = this.f40151a;
            this.f40156f = ((-d10) * d11) + (d11 * Math.sqrt((d10 * d10) - 1.0d));
            double d12 = this.f40152b;
            double d13 = this.f40151a;
            this.f40157g = ((-d12) * d13) - (d13 * Math.sqrt((d12 * d12) - 1.0d));
        } else if (d10 >= 0.0d && d10 < 1.0d) {
            this.f40158h = this.f40151a * Math.sqrt(1.0d - (d10 * d10));
        }
        this.f40153c = true;
    }

    public boolean c(float f10, float f11) {
        return ((double) Math.abs(f11)) < this.f40155e && ((double) Math.abs(f10 - a())) < this.f40154d;
    }

    public C5007f d(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f40152b = f10;
        this.f40153c = false;
        return this;
    }

    public C5007f e(float f10) {
        this.f40159i = f10;
        return this;
    }

    public C5007f f(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f40151a = Math.sqrt(f10);
        this.f40153c = false;
        return this;
    }

    public void g(double d10) {
        double dAbs = Math.abs(d10);
        this.f40154d = dAbs;
        this.f40155e = dAbs * 62.5d;
    }

    public AbstractC5003b.p h(double d10, double d11, long j10) {
        double dPow;
        double dCos;
        b();
        double d12 = j10 / 1000.0d;
        double d13 = d10 - this.f40159i;
        double d14 = this.f40152b;
        if (d14 > 1.0d) {
            double d15 = this.f40157g;
            double d16 = this.f40156f;
            double d17 = d13 - (((d15 * d13) - d11) / (d15 - d16));
            double d18 = ((d13 * d15) - d11) / (d15 - d16);
            dPow = (Math.pow(2.718281828459045d, d15 * d12) * d17) + (Math.pow(2.718281828459045d, this.f40156f * d12) * d18);
            double d19 = this.f40157g;
            double dPow2 = d17 * d19 * Math.pow(2.718281828459045d, d19 * d12);
            double d20 = this.f40156f;
            dCos = dPow2 + (d18 * d20 * Math.pow(2.718281828459045d, d20 * d12));
        } else if (d14 == 1.0d) {
            double d21 = this.f40151a;
            double d22 = d11 + (d21 * d13);
            double d23 = d13 + (d22 * d12);
            dPow = Math.pow(2.718281828459045d, (-d21) * d12) * d23;
            double dPow3 = d23 * Math.pow(2.718281828459045d, (-this.f40151a) * d12);
            double d24 = this.f40151a;
            dCos = (d22 * Math.pow(2.718281828459045d, (-d24) * d12)) + (dPow3 * (-d24));
        } else {
            double d25 = 1.0d / this.f40158h;
            double d26 = this.f40151a;
            double d27 = d25 * ((d14 * d26 * d13) + d11);
            dPow = Math.pow(2.718281828459045d, (-d14) * d26 * d12) * ((Math.cos(this.f40158h * d12) * d13) + (Math.sin(this.f40158h * d12) * d27));
            double d28 = this.f40151a;
            double d29 = this.f40152b;
            double dPow4 = Math.pow(2.718281828459045d, (-d29) * d28 * d12);
            double d30 = this.f40158h;
            double dSin = (-d30) * d13 * Math.sin(d30 * d12);
            double d31 = this.f40158h;
            dCos = ((-d28) * dPow * d29) + (dPow4 * (dSin + (d27 * d31 * Math.cos(d31 * d12))));
        }
        AbstractC5003b.p pVar = this.f40160j;
        pVar.f40144a = (float) (dPow + this.f40159i);
        pVar.f40145b = (float) dCos;
        return pVar;
    }

    public C5007f(float f10) {
        this.f40151a = Math.sqrt(1500.0d);
        this.f40152b = 0.5d;
        this.f40153c = false;
        this.f40159i = Double.MAX_VALUE;
        this.f40160j = new AbstractC5003b.p();
        this.f40159i = f10;
    }
}
