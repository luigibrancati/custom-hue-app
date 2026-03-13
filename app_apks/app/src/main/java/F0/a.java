package F0;

import F0.e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class a extends i {

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f3423y0 = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f3424z0 = true;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public int f3422A0 = 0;

    public boolean H0() {
        return this.f3424z0;
    }

    public int I0() {
        return this.f3423y0;
    }

    public int J0() {
        return this.f3422A0;
    }

    public void K0() {
        for (int i10 = 0; i10 < this.f3563x0; i10++) {
            e eVar = this.f3562w0[i10];
            int i11 = this.f3423y0;
            if (i11 == 0 || i11 == 1) {
                eVar.l0(0, true);
            } else if (i11 == 2 || i11 == 3) {
                eVar.l0(1, true);
            }
        }
    }

    public void L0(boolean z10) {
        this.f3424z0 = z10;
    }

    public void M0(int i10) {
        this.f3423y0 = i10;
    }

    public void N0(int i10) {
        this.f3422A0 = i10;
    }

    @Override // F0.e
    public void f(E0.d dVar) {
        d[] dVarArr;
        boolean z10;
        int i10;
        int i11;
        int i12;
        d[] dVarArr2 = this.f3465J;
        dVarArr2[0] = this.f3457B;
        dVarArr2[2] = this.f3458C;
        dVarArr2[1] = this.f3459D;
        dVarArr2[3] = this.f3460E;
        int i13 = 0;
        while (true) {
            dVarArr = this.f3465J;
            if (i13 >= dVarArr.length) {
                break;
            }
            d dVar2 = dVarArr[i13];
            dVar2.f3453g = dVar.q(dVar2);
            i13++;
        }
        int i14 = this.f3423y0;
        if (i14 < 0 || i14 >= 4) {
            return;
        }
        d dVar3 = dVarArr[i14];
        for (int i15 = 0; i15 < this.f3563x0; i15++) {
            e eVar = this.f3562w0[i15];
            if ((this.f3424z0 || eVar.g()) && ((((i11 = this.f3423y0) == 0 || i11 == 1) && eVar.w() == e.b.MATCH_CONSTRAINT && eVar.f3457B.f3450d != null && eVar.f3459D.f3450d != null) || (((i12 = this.f3423y0) == 2 || i12 == 3) && eVar.K() == e.b.MATCH_CONSTRAINT && eVar.f3458C.f3450d != null && eVar.f3460E.f3450d != null))) {
                z10 = true;
                break;
            }
        }
        z10 = false;
        boolean z11 = this.f3457B.h() || this.f3459D.h();
        boolean z12 = this.f3458C.h() || this.f3460E.h();
        int i16 = !(!z10 && (((i10 = this.f3423y0) == 0 && z11) || ((i10 == 2 && z12) || ((i10 == 1 && z11) || (i10 == 3 && z12))))) ? 4 : 5;
        for (int i17 = 0; i17 < this.f3563x0; i17++) {
            e eVar2 = this.f3562w0[i17];
            if (this.f3424z0 || eVar2.g()) {
                E0.i iVarQ = dVar.q(eVar2.f3465J[this.f3423y0]);
                d[] dVarArr3 = eVar2.f3465J;
                int i18 = this.f3423y0;
                d dVar4 = dVarArr3[i18];
                dVar4.f3453g = iVarQ;
                d dVar5 = dVar4.f3450d;
                int i19 = (dVar5 == null || dVar5.f3448b != this) ? 0 : dVar4.f3451e;
                if (i18 == 0 || i18 == 2) {
                    dVar.i(dVar3.f3453g, iVarQ, this.f3422A0 - i19, z10);
                } else {
                    dVar.g(dVar3.f3453g, iVarQ, this.f3422A0 + i19, z10);
                }
                dVar.e(dVar3.f3453g, iVarQ, this.f3422A0 + i19, i16);
            }
        }
        int i20 = this.f3423y0;
        if (i20 == 0) {
            dVar.e(this.f3459D.f3453g, this.f3457B.f3453g, 0, 8);
            dVar.e(this.f3457B.f3453g, this.f3469N.f3459D.f3453g, 0, 4);
            dVar.e(this.f3457B.f3453g, this.f3469N.f3457B.f3453g, 0, 0);
            return;
        }
        if (i20 == 1) {
            dVar.e(this.f3457B.f3453g, this.f3459D.f3453g, 0, 8);
            dVar.e(this.f3457B.f3453g, this.f3469N.f3457B.f3453g, 0, 4);
            dVar.e(this.f3457B.f3453g, this.f3469N.f3459D.f3453g, 0, 0);
        } else if (i20 == 2) {
            dVar.e(this.f3460E.f3453g, this.f3458C.f3453g, 0, 8);
            dVar.e(this.f3458C.f3453g, this.f3469N.f3460E.f3453g, 0, 4);
            dVar.e(this.f3458C.f3453g, this.f3469N.f3458C.f3453g, 0, 0);
        } else if (i20 == 3) {
            dVar.e(this.f3458C.f3453g, this.f3460E.f3453g, 0, 8);
            dVar.e(this.f3458C.f3453g, this.f3469N.f3458C.f3453g, 0, 4);
            dVar.e(this.f3458C.f3453g, this.f3469N.f3460E.f3453g, 0, 0);
        }
    }

    @Override // F0.e
    public boolean g() {
        return true;
    }

    @Override // F0.e
    public String toString() {
        String str = "[Barrier] " + p() + " {";
        for (int i10 = 0; i10 < this.f3563x0; i10++) {
            e eVar = this.f3562w0[i10];
            if (i10 > 0) {
                str = str + ", ";
            }
            str = str + eVar.p();
        }
        return str + "}";
    }
}
