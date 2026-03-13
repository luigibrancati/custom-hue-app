package F0;

import F0.e;
import G0.b;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class f extends l {

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public E0.e f3532B0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public int f3534D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f3535E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public int f3536F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public int f3537G0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public G0.b f3552x0 = new G0.b(this);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public G0.e f3553y0 = new G0.e(this);

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public b.InterfaceC0066b f3554z0 = null;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public boolean f3531A0 = false;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public E0.d f3533C0 = new E0.d();

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public int f3538H0 = 0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public int f3539I0 = 0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public c[] f3540J0 = new c[4];

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public c[] f3541K0 = new c[4];

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public boolean f3542L0 = false;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public boolean f3543M0 = false;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public boolean f3544N0 = false;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public int f3545O0 = 0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public int f3546P0 = 0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public int f3547Q0 = 263;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public boolean f3548R0 = false;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public boolean f3549S0 = false;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public boolean f3550T0 = false;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public int f3551U0 = 0;

    @Override // F0.e
    public void F0(boolean z10, boolean z11) {
        super.F0(z10, z11);
        int size = this.f3578w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) this.f3578w0.get(i10)).F0(z10, z11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01cb A[PHI: r0 r12
      0x01cb: PHI (r0v26 int) = (r0v25 int), (r0v28 int), (r0v28 int), (r0v28 int) binds: [B:69:0x0190, B:77:0x01b3, B:78:0x01b5, B:80:0x01bb] A[DONT_GENERATE, DONT_INLINE]
      0x01cb: PHI (r12v5 boolean) = (r12v4 boolean), (r12v7 boolean), (r12v7 boolean), (r12v7 boolean) binds: [B:69:0x0190, B:77:0x01b3, B:78:0x01b5, B:80:0x01bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    @Override // F0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void H0() {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.f.H0():void");
    }

    public void K0(e eVar, int i10) {
        if (i10 == 0) {
            M0(eVar);
        } else if (i10 == 1) {
            N0(eVar);
        }
    }

    public boolean L0(E0.d dVar) {
        f(dVar);
        int size = this.f3578w0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = (e) this.f3578w0.get(i10);
            eVar.l0(0, false);
            eVar.l0(1, false);
            if (eVar instanceof a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                e eVar2 = (e) this.f3578w0.get(i11);
                if (eVar2 instanceof a) {
                    ((a) eVar2).K0();
                }
            }
        }
        for (int i12 = 0; i12 < size; i12++) {
            e eVar3 = (e) this.f3578w0.get(i12);
            if (eVar3.e()) {
                eVar3.f(dVar);
            }
        }
        for (int i13 = 0; i13 < size; i13++) {
            e eVar4 = (e) this.f3578w0.get(i13);
            if (eVar4 instanceof f) {
                e.b[] bVarArr = eVar4.f3468M;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                e.b bVar3 = e.b.WRAP_CONTENT;
                if (bVar == bVar3) {
                    eVar4.i0(e.b.FIXED);
                }
                if (bVar2 == bVar3) {
                    eVar4.x0(e.b.FIXED);
                }
                eVar4.f(dVar);
                if (bVar == bVar3) {
                    eVar4.i0(bVar);
                }
                if (bVar2 == bVar3) {
                    eVar4.x0(bVar2);
                }
            } else {
                j.a(this, dVar, eVar4);
                if (!eVar4.e()) {
                    eVar4.f(dVar);
                }
            }
        }
        if (this.f3538H0 > 0) {
            b.a(this, dVar, 0);
        }
        if (this.f3539I0 > 0) {
            b.a(this, dVar, 1);
        }
        return true;
    }

    public final void M0(e eVar) {
        int i10 = this.f3538H0 + 1;
        c[] cVarArr = this.f3541K0;
        if (i10 >= cVarArr.length) {
            this.f3541K0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f3541K0[this.f3538H0] = new c(eVar, 0, W0());
        this.f3538H0++;
    }

    public final void N0(e eVar) {
        int i10 = this.f3539I0 + 1;
        c[] cVarArr = this.f3540J0;
        if (i10 >= cVarArr.length) {
            this.f3540J0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f3540J0[this.f3539I0] = new c(eVar, 1, W0());
        this.f3539I0++;
    }

    public boolean O0(boolean z10) {
        return this.f3553y0.f(z10);
    }

    public boolean P0(boolean z10) {
        return this.f3553y0.g(z10);
    }

    public boolean Q0(boolean z10, int i10) {
        return this.f3553y0.h(z10, i10);
    }

    public b.InterfaceC0066b R0() {
        return this.f3554z0;
    }

    public int S0() {
        return this.f3547Q0;
    }

    public void T0() {
        this.f3553y0.j();
    }

    public void U0() {
        this.f3553y0.k();
    }

    public boolean V0() {
        return this.f3550T0;
    }

    @Override // F0.l, F0.e
    public void W() {
        this.f3533C0.D();
        this.f3534D0 = 0;
        this.f3536F0 = 0;
        this.f3535E0 = 0;
        this.f3537G0 = 0;
        this.f3548R0 = false;
        super.W();
    }

    public boolean W0() {
        return this.f3531A0;
    }

    public boolean X0() {
        return this.f3549S0;
    }

    public long Y0(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f3534D0 = i17;
        this.f3535E0 = i18;
        return this.f3552x0.d(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
    }

    public boolean Z0(int i10) {
        return (this.f3547Q0 & i10) == i10;
    }

    public final void a1() {
        this.f3538H0 = 0;
        this.f3539I0 = 0;
    }

    public void b1(b.InterfaceC0066b interfaceC0066b) {
        this.f3554z0 = interfaceC0066b;
        this.f3553y0.n(interfaceC0066b);
    }

    public void c1(int i10) {
        this.f3547Q0 = i10;
        E0.d.f3080s = j.b(i10, 256);
    }

    public void d1(boolean z10) {
        this.f3531A0 = z10;
    }

    public void e1(E0.d dVar, boolean[] zArr) {
        zArr[2] = false;
        G0(dVar);
        int size = this.f3578w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) this.f3578w0.get(i10)).G0(dVar);
        }
    }

    public void f1() {
        this.f3552x0.e(this);
    }
}
