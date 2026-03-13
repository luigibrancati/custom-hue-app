package F0;

import F0.e;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f3425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f3426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f3427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f3428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f3429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f3430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f3431g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f3432h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3433i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3434j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f3435k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3436l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3437m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3438n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f3439o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3440p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3441q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f3442r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3443s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3444t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f3445u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f3446v;

    public c(e eVar, int i10, boolean z10) {
        this.f3425a = eVar;
        this.f3440p = i10;
        this.f3441q = z10;
    }

    public static boolean c(e eVar, int i10) {
        if (eVar.M() == 8 || eVar.f3468M[i10] != e.b.MATCH_CONSTRAINT) {
            return false;
        }
        int i11 = eVar.f3508n[i10];
        return i11 == 0 || i11 == 3;
    }

    public void a() {
        if (!this.f3446v) {
            b();
        }
        this.f3446v = true;
    }

    public final void b() {
        int i10 = this.f3440p * 2;
        e eVar = this.f3425a;
        this.f3439o = true;
        e eVar2 = eVar;
        boolean z10 = false;
        while (!z10) {
            this.f3433i++;
            e[] eVarArr = eVar.f3519s0;
            int i11 = this.f3440p;
            e eVar3 = null;
            eVarArr[i11] = null;
            eVar.f3517r0[i11] = null;
            if (eVar.M() != 8) {
                this.f3436l++;
                e.b bVarQ = eVar.q(this.f3440p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarQ != bVar) {
                    this.f3437m += eVar.y(this.f3440p);
                }
                int iB = this.f3437m + eVar.f3465J[i10].b();
                this.f3437m = iB;
                int i12 = i10 + 1;
                this.f3437m = iB + eVar.f3465J[i12].b();
                int iB2 = this.f3438n + eVar.f3465J[i10].b();
                this.f3438n = iB2;
                this.f3438n = iB2 + eVar.f3465J[i12].b();
                if (this.f3426b == null) {
                    this.f3426b = eVar;
                }
                this.f3428d = eVar;
                e.b[] bVarArr = eVar.f3468M;
                int i13 = this.f3440p;
                if (bVarArr[i13] == bVar) {
                    int i14 = eVar.f3508n[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f3434j++;
                        float f10 = eVar.f3515q0[i13];
                        if (f10 > 0.0f) {
                            this.f3435k += f10;
                        }
                        if (c(eVar, i13)) {
                            if (f10 < 0.0f) {
                                this.f3442r = true;
                            } else {
                                this.f3443s = true;
                            }
                            if (this.f3432h == null) {
                                this.f3432h = new ArrayList();
                            }
                            this.f3432h.add(eVar);
                        }
                        if (this.f3430f == null) {
                            this.f3430f = eVar;
                        }
                        e eVar4 = this.f3431g;
                        if (eVar4 != null) {
                            eVar4.f3517r0[this.f3440p] = eVar;
                        }
                        this.f3431g = eVar;
                    }
                    if (this.f3440p == 0) {
                        if (eVar.f3504l != 0 || eVar.f3510o != 0 || eVar.f3512p != 0) {
                            this.f3439o = false;
                        }
                    } else if (eVar.f3506m != 0 || eVar.f3516r != 0 || eVar.f3518s != 0) {
                        this.f3439o = false;
                    }
                    if (eVar.f3472Q != 0.0f) {
                        this.f3439o = false;
                        this.f3445u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f3519s0[this.f3440p] = eVar;
            }
            d dVar = eVar.f3465J[i10 + 1].f3450d;
            if (dVar != null) {
                e eVar5 = dVar.f3448b;
                d dVar2 = eVar5.f3465J[i10].f3450d;
                if (dVar2 != null && dVar2.f3448b == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z10 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f3426b;
        if (eVar6 != null) {
            this.f3437m -= eVar6.f3465J[i10].b();
        }
        e eVar7 = this.f3428d;
        if (eVar7 != null) {
            this.f3437m -= eVar7.f3465J[i10 + 1].b();
        }
        this.f3427c = eVar;
        if (this.f3440p == 0 && this.f3441q) {
            this.f3429e = eVar;
        } else {
            this.f3429e = this.f3425a;
        }
        this.f3444t = this.f3443s && this.f3442r;
    }
}
