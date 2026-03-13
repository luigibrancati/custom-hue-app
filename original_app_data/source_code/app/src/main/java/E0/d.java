package E0;

import E0.i;
import F0.d;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f3078q = 1000;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static e f3079r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static boolean f3080s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static long f3081t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static long f3082u;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f3085c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public E0.b[] f3088f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f3095m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a f3098p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3083a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap f3084b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3086d = 32;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3087e = 32;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3089g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3090h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean[] f3091i = new boolean[32];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3092j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3093k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3094l = 32;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i[] f3096n = new i[f3078q];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3097o = 0;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void a(i iVar);

        i b(d dVar, boolean[] zArr);

        void c(a aVar);

        void clear();

        i getKey();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends E0.b {
        public b(c cVar) {
            this.f3072e = new j(this, cVar);
        }
    }

    public d() {
        this.f3088f = null;
        this.f3088f = new E0.b[32];
        C();
        c cVar = new c();
        this.f3095m = cVar;
        this.f3085c = new h(cVar);
        if (f3080s) {
            this.f3098p = new b(cVar);
        } else {
            this.f3098p = new E0.b(cVar);
        }
    }

    public static E0.b s(d dVar, i iVar, i iVar2, float f10) {
        return dVar.r().j(iVar, iVar2, f10);
    }

    public static e w() {
        return f3079r;
    }

    public void A(a aVar) {
        e eVar = f3079r;
        if (eVar != null) {
            eVar.f3123t++;
            eVar.f3124u = Math.max(eVar.f3124u, this.f3092j);
            e eVar2 = f3079r;
            eVar2.f3125v = Math.max(eVar2.f3125v, this.f3093k);
        }
        u(aVar);
        B(aVar, false);
        n();
    }

    public final int B(a aVar, boolean z10) {
        e eVar = f3079r;
        if (eVar != null) {
            eVar.f3111h++;
        }
        for (int i10 = 0; i10 < this.f3092j; i10++) {
            this.f3091i[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            e eVar2 = f3079r;
            if (eVar2 != null) {
                eVar2.f3112i++;
            }
            i11++;
            if (i11 < this.f3092j * 2) {
                if (aVar.getKey() != null) {
                    this.f3091i[aVar.getKey().f3145c] = true;
                }
                i iVarB = aVar.b(this, this.f3091i);
                if (iVarB != null) {
                    boolean[] zArr = this.f3091i;
                    int i12 = iVarB.f3145c;
                    if (!zArr[i12]) {
                        zArr[i12] = true;
                    }
                }
                if (iVarB != null) {
                    float f10 = Float.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < this.f3093k; i14++) {
                        E0.b bVar = this.f3088f[i14];
                        if (bVar.f3068a.f3152j != i.a.UNRESTRICTED && !bVar.f3073f && bVar.t(iVarB)) {
                            float fD = bVar.f3072e.d(iVarB);
                            if (fD < 0.0f) {
                                float f11 = (-bVar.f3069b) / fD;
                                if (f11 < f10) {
                                    i13 = i14;
                                    f10 = f11;
                                }
                            }
                        }
                    }
                    if (i13 > -1) {
                        E0.b bVar2 = this.f3088f[i13];
                        bVar2.f3068a.f3146d = -1;
                        e eVar3 = f3079r;
                        if (eVar3 != null) {
                            eVar3.f3113j++;
                        }
                        bVar2.y(iVarB);
                        i iVar = bVar2.f3068a;
                        iVar.f3146d = i13;
                        iVar.g(bVar2);
                    }
                } else {
                    z11 = true;
                }
            }
            return i11;
        }
        return i11;
    }

    public final void C() {
        int i10 = 0;
        if (f3080s) {
            while (true) {
                E0.b[] bVarArr = this.f3088f;
                if (i10 >= bVarArr.length) {
                    return;
                }
                E0.b bVar = bVarArr[i10];
                if (bVar != null) {
                    this.f3095m.f3074a.a(bVar);
                }
                this.f3088f[i10] = null;
                i10++;
            }
        } else {
            while (true) {
                E0.b[] bVarArr2 = this.f3088f;
                if (i10 >= bVarArr2.length) {
                    return;
                }
                E0.b bVar2 = bVarArr2[i10];
                if (bVar2 != null) {
                    this.f3095m.f3075b.a(bVar2);
                }
                this.f3088f[i10] = null;
                i10++;
            }
        }
    }

    public void D() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f3095m;
            i[] iVarArr = cVar.f3077d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.d();
            }
            i10++;
        }
        cVar.f3076c.c(this.f3096n, this.f3097o);
        this.f3097o = 0;
        Arrays.fill(this.f3095m.f3077d, (Object) null);
        HashMap map = this.f3084b;
        if (map != null) {
            map.clear();
        }
        this.f3083a = 0;
        this.f3085c.clear();
        this.f3092j = 1;
        for (int i11 = 0; i11 < this.f3093k; i11++) {
            this.f3088f[i11].f3070c = false;
        }
        C();
        this.f3093k = 0;
        if (f3080s) {
            this.f3098p = new b(this.f3095m);
        } else {
            this.f3098p = new E0.b(this.f3095m);
        }
    }

    public final i a(i.a aVar, String str) {
        i iVar = (i) this.f3095m.f3076c.b();
        if (iVar == null) {
            iVar = new i(aVar, str);
            iVar.f(aVar, str);
        } else {
            iVar.d();
            iVar.f(aVar, str);
        }
        int i10 = this.f3097o;
        int i11 = f3078q;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f3078q = i12;
            this.f3096n = (i[]) Arrays.copyOf(this.f3096n, i12);
        }
        i[] iVarArr = this.f3096n;
        int i13 = this.f3097o;
        this.f3097o = i13 + 1;
        iVarArr[i13] = iVar;
        return iVar;
    }

    public void b(F0.e eVar, F0.e eVar2, float f10, int i10) {
        d.b bVar = d.b.LEFT;
        i iVarQ = q(eVar.k(bVar));
        d.b bVar2 = d.b.TOP;
        i iVarQ2 = q(eVar.k(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i iVarQ3 = q(eVar.k(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i iVarQ4 = q(eVar.k(bVar4));
        i iVarQ5 = q(eVar2.k(bVar));
        i iVarQ6 = q(eVar2.k(bVar2));
        i iVarQ7 = q(eVar2.k(bVar3));
        i iVarQ8 = q(eVar2.k(bVar4));
        E0.b bVarR = r();
        double d10 = f10;
        double d11 = i10;
        bVarR.q(iVarQ2, iVarQ4, iVarQ6, iVarQ8, (float) (Math.sin(d10) * d11));
        d(bVarR);
        E0.b bVarR2 = r();
        bVarR2.q(iVarQ, iVarQ3, iVarQ5, iVarQ7, (float) (Math.cos(d10) * d11));
        d(bVarR2);
    }

    public void c(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        E0.b bVarR = r();
        bVarR.h(iVar, iVar2, i10, f10, iVar3, iVar4, i11);
        if (i12 != 8) {
            bVarR.d(this, i12);
        }
        d(bVarR);
    }

    public void d(E0.b bVar) {
        i iVarW;
        if (bVar == null) {
            return;
        }
        e eVar = f3079r;
        if (eVar != null) {
            eVar.f3109f++;
            if (bVar.f3073f) {
                eVar.f3110g++;
            }
        }
        boolean z10 = true;
        if (this.f3093k + 1 >= this.f3094l || this.f3092j + 1 >= this.f3087e) {
            y();
        }
        boolean z11 = false;
        if (!bVar.f3073f) {
            bVar.D(this);
            if (bVar.u()) {
                return;
            }
            bVar.r();
            if (bVar.f(this)) {
                i iVarP = p();
                bVar.f3068a = iVarP;
                l(bVar);
                this.f3098p.c(bVar);
                B(this.f3098p, true);
                if (iVarP.f3146d == -1) {
                    if (bVar.f3068a == iVarP && (iVarW = bVar.w(iVarP)) != null) {
                        e eVar2 = f3079r;
                        if (eVar2 != null) {
                            eVar2.f3113j++;
                        }
                        bVar.y(iVarW);
                    }
                    if (!bVar.f3073f) {
                        bVar.f3068a.g(bVar);
                    }
                    this.f3093k--;
                }
            } else {
                z10 = false;
            }
            if (!bVar.s()) {
                return;
            } else {
                z11 = z10;
            }
        }
        if (z11) {
            return;
        }
        l(bVar);
    }

    public E0.b e(i iVar, i iVar2, int i10, int i11) {
        if (i11 == 8 && iVar2.f3149g && iVar.f3146d == -1) {
            iVar.e(this, iVar2.f3148f + i10);
            return null;
        }
        E0.b bVarR = r();
        bVarR.n(iVar, iVar2, i10);
        if (i11 != 8) {
            bVarR.d(this, i11);
        }
        d(bVarR);
        return bVarR;
    }

    public void f(i iVar, int i10) {
        int i11 = iVar.f3146d;
        if (i11 == -1) {
            iVar.e(this, i10);
            return;
        }
        if (i11 == -1) {
            E0.b bVarR = r();
            bVarR.i(iVar, i10);
            d(bVarR);
            return;
        }
        E0.b bVar = this.f3088f[i11];
        if (bVar.f3073f) {
            bVar.f3069b = i10;
            return;
        }
        if (bVar.f3072e.h() == 0) {
            bVar.f3073f = true;
            bVar.f3069b = i10;
        } else {
            E0.b bVarR2 = r();
            bVarR2.m(iVar, i10);
            d(bVarR2);
        }
    }

    public void g(i iVar, i iVar2, int i10, boolean z10) {
        E0.b bVarR = r();
        i iVarT = t();
        iVarT.f3147e = 0;
        bVarR.o(iVar, iVar2, iVarT, i10);
        d(bVarR);
    }

    public void h(i iVar, i iVar2, int i10, int i11) {
        E0.b bVarR = r();
        i iVarT = t();
        iVarT.f3147e = 0;
        bVarR.o(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f3072e.d(iVarT) * (-1.0f)), i11);
        }
        d(bVarR);
    }

    public void i(i iVar, i iVar2, int i10, boolean z10) {
        E0.b bVarR = r();
        i iVarT = t();
        iVarT.f3147e = 0;
        bVarR.p(iVar, iVar2, iVarT, i10);
        d(bVarR);
    }

    public void j(i iVar, i iVar2, int i10, int i11) {
        E0.b bVarR = r();
        i iVarT = t();
        iVarT.f3147e = 0;
        bVarR.p(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f3072e.d(iVarT) * (-1.0f)), i11);
        }
        d(bVarR);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f10, int i10) {
        E0.b bVarR = r();
        bVarR.k(iVar, iVar2, iVar3, iVar4, f10);
        if (i10 != 8) {
            bVarR.d(this, i10);
        }
        d(bVarR);
    }

    public final void l(E0.b bVar) {
        if (f3080s) {
            E0.b bVar2 = this.f3088f[this.f3093k];
            if (bVar2 != null) {
                this.f3095m.f3074a.a(bVar2);
            }
        } else {
            E0.b bVar3 = this.f3088f[this.f3093k];
            if (bVar3 != null) {
                this.f3095m.f3075b.a(bVar3);
            }
        }
        E0.b[] bVarArr = this.f3088f;
        int i10 = this.f3093k;
        bVarArr[i10] = bVar;
        i iVar = bVar.f3068a;
        iVar.f3146d = i10;
        this.f3093k = i10 + 1;
        iVar.g(bVar);
    }

    public void m(E0.b bVar, int i10, int i11) {
        bVar.e(o(i11, null), i10);
    }

    public final void n() {
        for (int i10 = 0; i10 < this.f3093k; i10++) {
            E0.b bVar = this.f3088f[i10];
            bVar.f3068a.f3148f = bVar.f3069b;
        }
    }

    public i o(int i10, String str) {
        e eVar = f3079r;
        if (eVar != null) {
            eVar.f3115l++;
        }
        if (this.f3092j + 1 >= this.f3087e) {
            y();
        }
        i iVarA = a(i.a.ERROR, str);
        int i11 = this.f3083a + 1;
        this.f3083a = i11;
        this.f3092j++;
        iVarA.f3145c = i11;
        iVarA.f3147e = i10;
        this.f3095m.f3077d[i11] = iVarA;
        this.f3085c.a(iVarA);
        return iVarA;
    }

    public i p() {
        e eVar = f3079r;
        if (eVar != null) {
            eVar.f3117n++;
        }
        if (this.f3092j + 1 >= this.f3087e) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f3083a + 1;
        this.f3083a = i10;
        this.f3092j++;
        iVarA.f3145c = i10;
        this.f3095m.f3077d[i10] = iVarA;
        return iVarA;
    }

    public i q(Object obj) {
        i iVarE = null;
        if (obj == null) {
            return null;
        }
        if (this.f3092j + 1 >= this.f3087e) {
            y();
        }
        if (obj instanceof F0.d) {
            F0.d dVar = (F0.d) obj;
            iVarE = dVar.e();
            if (iVarE == null) {
                dVar.l(this.f3095m);
                iVarE = dVar.e();
            }
            int i10 = iVarE.f3145c;
            if (i10 != -1 && i10 <= this.f3083a && this.f3095m.f3077d[i10] != null) {
                return iVarE;
            }
            if (i10 != -1) {
                iVarE.d();
            }
            int i11 = this.f3083a + 1;
            this.f3083a = i11;
            this.f3092j++;
            iVarE.f3145c = i11;
            iVarE.f3152j = i.a.UNRESTRICTED;
            this.f3095m.f3077d[i11] = iVarE;
        }
        return iVarE;
    }

    public E0.b r() {
        E0.b bVar;
        if (f3080s) {
            bVar = (E0.b) this.f3095m.f3074a.b();
            if (bVar == null) {
                bVar = new b(this.f3095m);
                f3082u++;
            } else {
                bVar.z();
            }
        } else {
            bVar = (E0.b) this.f3095m.f3075b.b();
            if (bVar == null) {
                bVar = new E0.b(this.f3095m);
                f3081t++;
            } else {
                bVar.z();
            }
        }
        i.b();
        return bVar;
    }

    public i t() {
        e eVar = f3079r;
        if (eVar != null) {
            eVar.f3116m++;
        }
        if (this.f3092j + 1 >= this.f3087e) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f3083a + 1;
        this.f3083a = i10;
        this.f3092j++;
        iVarA.f3145c = i10;
        this.f3095m.f3077d[i10] = iVarA;
        return iVarA;
    }

    public final int u(a aVar) {
        long j10;
        for (int i10 = 0; i10 < this.f3093k; i10++) {
            E0.b bVar = this.f3088f[i10];
            if (bVar.f3068a.f3152j != i.a.UNRESTRICTED) {
                float f10 = 0.0f;
                if (bVar.f3069b < 0.0f) {
                    boolean z10 = false;
                    int i11 = 0;
                    while (!z10) {
                        e eVar = f3079r;
                        long j11 = 1;
                        if (eVar != null) {
                            eVar.f3114k++;
                        }
                        i11++;
                        float f11 = Float.MAX_VALUE;
                        int i12 = -1;
                        int i13 = -1;
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            int i16 = 1;
                            if (i14 >= this.f3093k) {
                                break;
                            }
                            E0.b bVar2 = this.f3088f[i14];
                            if (bVar2.f3068a.f3152j != i.a.UNRESTRICTED && !bVar2.f3073f && bVar2.f3069b < f10) {
                                while (i16 < this.f3092j) {
                                    i iVar = this.f3095m.f3077d[i16];
                                    float fD = bVar2.f3072e.d(iVar);
                                    if (fD <= f10) {
                                        j10 = j11;
                                    } else {
                                        j10 = j11;
                                        for (int i17 = 0; i17 < 9; i17++) {
                                            float f12 = iVar.f3150h[i17] / fD;
                                            if ((f12 < f11 && i17 == i15) || i17 > i15) {
                                                i15 = i17;
                                                f11 = f12;
                                                i12 = i14;
                                                i13 = i16;
                                            }
                                        }
                                    }
                                    i16++;
                                    j11 = j10;
                                    f10 = 0.0f;
                                }
                            }
                            i14++;
                            j11 = j11;
                            f10 = 0.0f;
                        }
                        long j12 = j11;
                        if (i12 != -1) {
                            E0.b bVar3 = this.f3088f[i12];
                            bVar3.f3068a.f3146d = -1;
                            e eVar2 = f3079r;
                            if (eVar2 != null) {
                                eVar2.f3113j += j12;
                            }
                            bVar3.y(this.f3095m.f3077d[i13]);
                            i iVar2 = bVar3.f3068a;
                            iVar2.f3146d = i12;
                            iVar2.g(bVar3);
                        } else {
                            z10 = true;
                        }
                        if (i11 > this.f3092j / 2) {
                            z10 = true;
                        }
                        f10 = 0.0f;
                    }
                    return i11;
                }
            }
        }
        return 0;
    }

    public c v() {
        return this.f3095m;
    }

    public int x(Object obj) {
        i iVarE = ((F0.d) obj).e();
        if (iVarE != null) {
            return (int) (iVarE.f3148f + 0.5f);
        }
        return 0;
    }

    public final void y() {
        int i10 = this.f3086d * 2;
        this.f3086d = i10;
        this.f3088f = (E0.b[]) Arrays.copyOf(this.f3088f, i10);
        c cVar = this.f3095m;
        cVar.f3077d = (i[]) Arrays.copyOf(cVar.f3077d, this.f3086d);
        int i11 = this.f3086d;
        this.f3091i = new boolean[i11];
        this.f3087e = i11;
        this.f3094l = i11;
        e eVar = f3079r;
        if (eVar != null) {
            eVar.f3107d++;
            eVar.f3118o = Math.max(eVar.f3118o, i11);
            e eVar2 = f3079r;
            eVar2.f3128y = eVar2.f3118o;
        }
    }

    public void z() {
        e eVar = f3079r;
        if (eVar != null) {
            eVar.f3108e++;
        }
        if (!this.f3089g && !this.f3090h) {
            A(this.f3085c);
            return;
        }
        if (eVar != null) {
            eVar.f3120q++;
        }
        for (int i10 = 0; i10 < this.f3093k; i10++) {
            if (!this.f3088f[i10].f3073f) {
                A(this.f3085c);
                return;
            }
        }
        e eVar2 = f3079r;
        if (eVar2 != null) {
            eVar2.f3119p++;
        }
        n();
    }
}
