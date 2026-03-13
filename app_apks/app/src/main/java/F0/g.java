package F0;

import F0.d;
import F0.e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class g extends e {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public float f3557w0 = -1.0f;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f3558x0 = -1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f3559y0 = -1;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public d f3560z0 = this.f3458C;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public int f3555A0 = 0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public int f3556B0 = 0;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3561a;

        static {
            int[] iArr = new int[d.b.values().length];
            f3561a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3561a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3561a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3561a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3561a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3561a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3561a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3561a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3561a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public g() {
        this.f3466K.clear();
        this.f3466K.add(this.f3560z0);
        int length = this.f3465J.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f3465J[i10] = this.f3560z0;
        }
    }

    @Override // F0.e
    public void G0(E0.d dVar) {
        if (E() == null) {
            return;
        }
        int iX = dVar.x(this.f3560z0);
        if (this.f3555A0 == 1) {
            C0(iX);
            D0(0);
            e0(E().t());
            B0(0);
            return;
        }
        C0(0);
        D0(iX);
        B0(E().N());
        e0(0);
    }

    public int H0() {
        return this.f3555A0;
    }

    public int I0() {
        return this.f3558x0;
    }

    public int J0() {
        return this.f3559y0;
    }

    public float K0() {
        return this.f3557w0;
    }

    public void L0(int i10) {
        if (i10 > -1) {
            this.f3557w0 = -1.0f;
            this.f3558x0 = i10;
            this.f3559y0 = -1;
        }
    }

    public void M0(int i10) {
        if (i10 > -1) {
            this.f3557w0 = -1.0f;
            this.f3558x0 = -1;
            this.f3559y0 = i10;
        }
    }

    public void N0(float f10) {
        if (f10 > -1.0f) {
            this.f3557w0 = f10;
            this.f3558x0 = -1;
            this.f3559y0 = -1;
        }
    }

    public void O0(int i10) {
        if (this.f3555A0 == i10) {
            return;
        }
        this.f3555A0 = i10;
        this.f3466K.clear();
        if (this.f3555A0 == 1) {
            this.f3560z0 = this.f3457B;
        } else {
            this.f3560z0 = this.f3458C;
        }
        this.f3466K.add(this.f3560z0);
        int length = this.f3465J.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f3465J[i11] = this.f3560z0;
        }
    }

    @Override // F0.e
    public void f(E0.d dVar) {
        f fVar = (f) E();
        if (fVar == null) {
            return;
        }
        d dVarK = fVar.k(d.b.LEFT);
        d dVarK2 = fVar.k(d.b.RIGHT);
        e eVar = this.f3469N;
        boolean z10 = eVar != null && eVar.f3468M[0] == e.b.WRAP_CONTENT;
        if (this.f3555A0 == 0) {
            dVarK = fVar.k(d.b.TOP);
            dVarK2 = fVar.k(d.b.BOTTOM);
            e eVar2 = this.f3469N;
            z10 = eVar2 != null && eVar2.f3468M[1] == e.b.WRAP_CONTENT;
        }
        if (this.f3558x0 != -1) {
            E0.i iVarQ = dVar.q(this.f3560z0);
            dVar.e(iVarQ, dVar.q(dVarK), this.f3558x0, 8);
            if (z10) {
                dVar.h(dVar.q(dVarK2), iVarQ, 0, 5);
                return;
            }
            return;
        }
        if (this.f3559y0 == -1) {
            if (this.f3557w0 != -1.0f) {
                dVar.d(E0.d.s(dVar, dVar.q(this.f3560z0), dVar.q(dVarK2), this.f3557w0));
                return;
            }
            return;
        }
        E0.i iVarQ2 = dVar.q(this.f3560z0);
        E0.i iVarQ3 = dVar.q(dVarK2);
        dVar.e(iVarQ2, iVarQ3, -this.f3559y0, 8);
        if (z10) {
            dVar.h(iVarQ2, dVar.q(dVarK), 0, 5);
            dVar.h(iVarQ3, iVarQ2, 0, 5);
        }
    }

    @Override // F0.e
    public boolean g() {
        return true;
    }

    @Override // F0.e
    public d k(d.b bVar) {
        switch (a.f3561a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f3555A0 == 1) {
                    return this.f3560z0;
                }
                break;
            case 3:
            case 4:
                if (this.f3555A0 == 0) {
                    return this.f3560z0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }
}
