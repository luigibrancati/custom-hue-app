package P2;

import D1.C0748f;
import D1.o;
import G1.AbstractC0853a;
import G1.AbstractC0861i;
import H1.g;
import P2.L;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class p implements InterfaceC1853m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f12927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12930d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f12934h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f12936j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i2.O f12937k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f12938l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f12939m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f12941o;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean[] f12935i = new boolean[3];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f12931e = new w(7, 128);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f12932f = new w(8, 128);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f12933g = new w(6, 128);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f12940n = -9223372036854775807L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final G1.C f12942p = new G1.C();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i2.O f12943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f12944b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f12945c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray f12946d = new SparseArray();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray f12947e = new SparseArray();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final H1.i f12948f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[] f12949g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f12950h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f12951i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f12952j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f12953k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f12954l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public a f12955m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public a f12956n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f12957o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f12958p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public long f12959q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f12960r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f12961s;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f12962a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f12963b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public g.m f12964c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f12965d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f12966e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f12967f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f12968g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public boolean f12969h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public boolean f12970i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public boolean f12971j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public boolean f12972k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f12973l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public int f12974m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public int f12975n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public int f12976o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public int f12977p;

            public a() {
            }

            public void b() {
                this.f12963b = false;
                this.f12962a = false;
            }

            public final boolean c(a aVar) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                if (!this.f12962a) {
                    return false;
                }
                if (!aVar.f12962a) {
                    return true;
                }
                g.m mVar = (g.m) AbstractC0853a.i(this.f12964c);
                g.m mVar2 = (g.m) AbstractC0853a.i(aVar.f12964c);
                return (this.f12967f == aVar.f12967f && this.f12968g == aVar.f12968g && this.f12969h == aVar.f12969h && (!this.f12970i || !aVar.f12970i || this.f12971j == aVar.f12971j) && (((i10 = this.f12965d) == (i11 = aVar.f12965d) || (i10 != 0 && i11 != 0)) && (((i12 = mVar.f5207n) != 0 || mVar2.f5207n != 0 || (this.f12974m == aVar.f12974m && this.f12975n == aVar.f12975n)) && ((i12 != 1 || mVar2.f5207n != 1 || (this.f12976o == aVar.f12976o && this.f12977p == aVar.f12977p)) && (z10 = this.f12972k) == aVar.f12972k && (!z10 || this.f12973l == aVar.f12973l))))) ? false : true;
            }

            public boolean d() {
                if (!this.f12963b) {
                    return false;
                }
                int i10 = this.f12966e;
                return i10 == 7 || i10 == 2;
            }

            public void e(g.m mVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f12964c = mVar;
                this.f12965d = i10;
                this.f12966e = i11;
                this.f12967f = i12;
                this.f12968g = i13;
                this.f12969h = z10;
                this.f12970i = z11;
                this.f12971j = z12;
                this.f12972k = z13;
                this.f12973l = i14;
                this.f12974m = i15;
                this.f12975n = i16;
                this.f12976o = i17;
                this.f12977p = i18;
                this.f12962a = true;
                this.f12963b = true;
            }

            public void f(int i10) {
                this.f12966e = i10;
                this.f12963b = true;
            }
        }

        public b(i2.O o10, boolean z10, boolean z11) {
            this.f12943a = o10;
            this.f12944b = z10;
            this.f12945c = z11;
            this.f12955m = new a();
            this.f12956n = new a();
            byte[] bArr = new byte[128];
            this.f12949g = bArr;
            this.f12948f = new H1.i(bArr, 0, 0);
            g();
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0161  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instruction units count: 426
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: P2.p.b.a(byte[], int, int):void");
        }

        public boolean b(long j10, int i10, boolean z10) {
            if (this.f12951i == 9 || (this.f12945c && this.f12956n.c(this.f12955m))) {
                if (z10 && this.f12957o) {
                    d(i10 + ((int) (j10 - this.f12952j)));
                }
                this.f12958p = this.f12952j;
                this.f12959q = this.f12954l;
                this.f12960r = false;
                this.f12957o = true;
            }
            h();
            this.f12951i = 24;
            return this.f12960r;
        }

        public boolean c() {
            return this.f12945c;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void d(int i10) {
            long j10 = this.f12959q;
            if (j10 != -9223372036854775807L) {
                long j11 = this.f12952j;
                long j12 = this.f12958p;
                if (j11 == j12) {
                    return;
                }
                int i11 = (int) (j11 - j12);
                this.f12943a.d(j10, this.f12960r ? 1 : 0, i11, i10, null);
            }
        }

        public void e(g.l lVar) {
            this.f12947e.append(lVar.f5191a, lVar);
        }

        public void f(g.m mVar) {
            this.f12946d.append(mVar.f5197d, mVar);
        }

        public void g() {
            this.f12953k = false;
            this.f12957o = false;
            this.f12956n.b();
        }

        public final void h() {
            boolean zD = this.f12944b ? this.f12956n.d() : this.f12961s;
            boolean z10 = this.f12960r;
            int i10 = this.f12951i;
            boolean z11 = true;
            if (i10 != 5 && (!zD || i10 != 1)) {
                z11 = false;
            }
            this.f12960r = z10 | z11;
        }

        public void i(long j10, int i10, long j11, boolean z10) {
            this.f12951i = i10;
            this.f12954l = j11;
            this.f12952j = j10;
            this.f12961s = z10;
            if (!this.f12944b || i10 != 1) {
                if (!this.f12945c) {
                    return;
                }
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            }
            a aVar = this.f12955m;
            this.f12955m = this.f12956n;
            this.f12956n = aVar;
            aVar.b();
            this.f12950h = 0;
            this.f12953k = true;
        }
    }

    public p(G g10, boolean z10, boolean z11, String str) {
        this.f12927a = g10;
        this.f12928b = z10;
        this.f12929c = z11;
        this.f12930d = str;
    }

    private void f() {
        AbstractC0853a.i(this.f12937k);
        G1.M.i(this.f12938l);
    }

    @Override // P2.InterfaceC1853m
    public void a(G1.C c10) {
        int i10;
        f();
        int iG = c10.g();
        int iJ = c10.j();
        byte[] bArrF = c10.f();
        this.f12934h += (long) c10.a();
        this.f12937k.b(c10, c10.a());
        while (true) {
            int iE = H1.g.e(bArrF, iG, iJ, this.f12935i);
            if (iE == iJ) {
                h(bArrF, iG, iJ);
                return;
            }
            int iJ2 = H1.g.j(bArrF, iE);
            if (iE <= 0 || bArrF[iE - 1] != 0) {
                i10 = 3;
            } else {
                iE--;
                i10 = 4;
            }
            int i11 = iE;
            int i12 = i10;
            int i13 = i11 - iG;
            if (i13 > 0) {
                h(bArrF, iG, i11);
            }
            int i14 = iJ - i11;
            long j10 = this.f12934h - ((long) i14);
            g(j10, i14, i13 < 0 ? -i13 : 0, this.f12940n);
            i(j10, iJ2, this.f12940n);
            iG = i11 + i12;
        }
    }

    @Override // P2.InterfaceC1853m
    public void b() {
        this.f12934h = 0L;
        this.f12941o = false;
        this.f12940n = -9223372036854775807L;
        H1.g.c(this.f12935i);
        this.f12931e.d();
        this.f12932f.d();
        this.f12933g.d();
        this.f12927a.b();
        b bVar = this.f12938l;
        if (bVar != null) {
            bVar.g();
        }
    }

    @Override // P2.InterfaceC1853m
    public void c(boolean z10) {
        f();
        if (z10) {
            this.f12927a.e();
            g(this.f12934h, 0, 0, this.f12940n);
            i(this.f12934h, 9, this.f12940n);
            g(this.f12934h, 0, 0, this.f12940n);
        }
    }

    @Override // P2.InterfaceC1853m
    public void d(i2.r rVar, L.d dVar) {
        dVar.a();
        this.f12936j = dVar.b();
        i2.O oF = rVar.f(dVar.c(), 2);
        this.f12937k = oF;
        this.f12938l = new b(oF, this.f12928b, this.f12929c);
        this.f12927a.d(rVar, dVar);
    }

    @Override // P2.InterfaceC1853m
    public void e(long j10, int i10) {
        this.f12940n = j10;
        this.f12941o |= (i10 & 2) != 0;
    }

    public final void g(long j10, int i10, int i11, long j11) {
        if (!this.f12939m || this.f12938l.c()) {
            this.f12931e.b(i11);
            this.f12932f.b(i11);
            if (this.f12939m) {
                if (this.f12931e.c()) {
                    w wVar = this.f12931e;
                    g.m mVarC = H1.g.C(wVar.f13082d, 3, wVar.f13083e);
                    this.f12927a.f(mVarC.f5213t);
                    this.f12938l.f(mVarC);
                    this.f12931e.d();
                } else if (this.f12932f.c()) {
                    w wVar2 = this.f12932f;
                    this.f12938l.e(H1.g.A(wVar2.f13082d, 3, wVar2.f13083e));
                    this.f12932f.d();
                }
            } else if (this.f12931e.c() && this.f12932f.c()) {
                ArrayList arrayList = new ArrayList();
                w wVar3 = this.f12931e;
                arrayList.add(Arrays.copyOf(wVar3.f13082d, wVar3.f13083e));
                w wVar4 = this.f12932f;
                arrayList.add(Arrays.copyOf(wVar4.f13082d, wVar4.f13083e));
                w wVar5 = this.f12931e;
                g.m mVarC2 = H1.g.C(wVar5.f13082d, 3, wVar5.f13083e);
                w wVar6 = this.f12932f;
                g.l lVarA = H1.g.A(wVar6.f13082d, 3, wVar6.f13083e);
                this.f12937k.e(new o.b().j0(this.f12936j).W(this.f12930d).y0("video/avc").U(AbstractC0861i.f(mVarC2.f5194a, mVarC2.f5195b, mVarC2.f5196c)).F0(mVarC2.f5199f).h0(mVarC2.f5200g).V(new C0748f.b().d(mVarC2.f5210q).c(mVarC2.f5211r).e(mVarC2.f5212s).g(mVarC2.f5202i + 8).b(mVarC2.f5203j + 8).a()).u0(mVarC2.f5201h).k0(arrayList).p0(mVarC2.f5213t).P());
                this.f12939m = true;
                this.f12927a.f(mVarC2.f5213t);
                this.f12938l.f(mVarC2);
                this.f12938l.e(lVarA);
                this.f12931e.d();
                this.f12932f.d();
            }
        }
        if (this.f12933g.b(i11)) {
            w wVar7 = this.f12933g;
            this.f12942p.Y(this.f12933g.f13082d, H1.g.L(wVar7.f13082d, wVar7.f13083e));
            this.f12942p.a0(4);
            this.f12927a.c(j11, this.f12942p);
        }
        if (this.f12938l.b(j10, i10, this.f12939m)) {
            this.f12941o = false;
        }
    }

    public final void h(byte[] bArr, int i10, int i11) {
        if (!this.f12939m || this.f12938l.c()) {
            this.f12931e.a(bArr, i10, i11);
            this.f12932f.a(bArr, i10, i11);
        }
        this.f12933g.a(bArr, i10, i11);
        this.f12938l.a(bArr, i10, i11);
    }

    public final void i(long j10, int i10, long j11) {
        if (!this.f12939m || this.f12938l.c()) {
            this.f12931e.e(i10);
            this.f12932f.e(i10);
        }
        this.f12933g.e(i10);
        this.f12938l.i(j10, i10, j11, this.f12941o);
    }
}
