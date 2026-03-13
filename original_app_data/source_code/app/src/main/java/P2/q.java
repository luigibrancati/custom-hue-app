package P2;

import D1.C0748f;
import D1.o;
import G1.AbstractC0853a;
import G1.AbstractC0861i;
import H1.g;
import P2.L;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class q implements InterfaceC1853m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f12978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f12980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i2.O f12981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f12982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12983f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f12990m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f12984g = new boolean[3];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w f12985h = new w(32, 128);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f12986i = new w(33, 128);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w f12987j = new w(34, 128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w f12988k = new w(39, 128);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w f12989l = new w(40, 128);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f12991n = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final G1.C f12992o = new G1.C();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i2.O f12993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f12994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f12995c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f12996d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f12997e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f12998f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f12999g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f13000h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f13001i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f13002j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f13003k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f13004l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f13005m;

        public a(i2.O o10) {
            this.f12993a = o10;
        }

        public static boolean b(int i10) {
            return (32 <= i10 && i10 <= 35) || i10 == 39;
        }

        public static boolean c(int i10) {
            return i10 < 32 || i10 == 40;
        }

        public void a(long j10, int i10, boolean z10) {
            if (this.f13002j && this.f12999g) {
                this.f13005m = this.f12995c;
                this.f13002j = false;
            } else if (this.f13000h || this.f12999g) {
                if (z10 && this.f13001i) {
                    d(i10 + ((int) (j10 - this.f12994b)));
                }
                this.f13003k = this.f12994b;
                this.f13004l = this.f12997e;
                this.f13005m = this.f12995c;
                this.f13001i = true;
            }
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
            long j10 = this.f13004l;
            if (j10 != -9223372036854775807L) {
                long j11 = this.f12994b;
                long j12 = this.f13003k;
                if (j11 == j12) {
                    return;
                }
                int i11 = (int) (j11 - j12);
                this.f12993a.d(j10, this.f13005m ? 1 : 0, i11, i10, null);
            }
        }

        public void e(byte[] bArr, int i10, int i11) {
            if (this.f12998f) {
                int i12 = this.f12996d;
                int i13 = (i10 + 2) - i12;
                if (i13 >= i11) {
                    this.f12996d = i12 + (i11 - i10);
                } else {
                    this.f12999g = (bArr[i13] & 128) != 0;
                    this.f12998f = false;
                }
            }
        }

        public void f() {
            this.f12998f = false;
            this.f12999g = false;
            this.f13000h = false;
            this.f13001i = false;
            this.f13002j = false;
        }

        public void g(long j10, int i10, int i11, long j11, boolean z10) {
            this.f12999g = false;
            this.f13000h = false;
            this.f12997e = j11;
            this.f12996d = 0;
            this.f12994b = j10;
            if (!c(i11)) {
                if (this.f13001i && !this.f13002j) {
                    if (z10) {
                        d(i10);
                    }
                    this.f13001i = false;
                }
                if (b(i11)) {
                    this.f13000h = !this.f13002j;
                    this.f13002j = true;
                }
            }
            boolean z11 = i11 >= 16 && i11 <= 21;
            this.f12995c = z11;
            this.f12998f = z11 || i11 <= 9;
        }
    }

    public q(G g10, String str) {
        this.f12978a = g10;
        this.f12979b = str;
    }

    private void f() {
        AbstractC0853a.i(this.f12981d);
        G1.M.i(this.f12982e);
    }

    private void g(long j10, int i10, int i11, long j11) {
        this.f12982e.a(j10, i10, this.f12983f);
        if (!this.f12983f) {
            this.f12985h.b(i11);
            this.f12986i.b(i11);
            this.f12987j.b(i11);
            if (this.f12985h.c() && this.f12986i.c() && this.f12987j.c()) {
                D1.o oVarI = i(this.f12980c, this.f12985h, this.f12986i, this.f12987j, this.f12979b);
                this.f12981d.e(oVarI);
                J7.n.o(oVarI.f1807q != -1);
                this.f12978a.f(oVarI.f1807q);
                this.f12983f = true;
            }
        }
        if (this.f12988k.b(i11)) {
            w wVar = this.f12988k;
            this.f12992o.Y(this.f12988k.f13082d, H1.g.L(wVar.f13082d, wVar.f13083e));
            this.f12992o.b0(5);
            this.f12978a.c(j11, this.f12992o);
        }
        if (this.f12989l.b(i11)) {
            w wVar2 = this.f12989l;
            this.f12992o.Y(this.f12989l.f13082d, H1.g.L(wVar2.f13082d, wVar2.f13083e));
            this.f12992o.b0(5);
            this.f12978a.c(j11, this.f12992o);
        }
    }

    private void h(byte[] bArr, int i10, int i11) {
        this.f12982e.e(bArr, i10, i11);
        if (!this.f12983f) {
            this.f12985h.a(bArr, i10, i11);
            this.f12986i.a(bArr, i10, i11);
            this.f12987j.a(bArr, i10, i11);
        }
        this.f12988k.a(bArr, i10, i11);
        this.f12989l.a(bArr, i10, i11);
    }

    public static D1.o i(String str, w wVar, w wVar2, w wVar3, String str2) {
        int i10 = wVar.f13083e;
        byte[] bArr = new byte[wVar2.f13083e + i10 + wVar3.f13083e];
        System.arraycopy(wVar.f13082d, 0, bArr, 0, i10);
        System.arraycopy(wVar2.f13082d, 0, bArr, wVar.f13083e, wVar2.f13083e);
        System.arraycopy(wVar3.f13082d, 0, bArr, wVar.f13083e + wVar2.f13083e, wVar3.f13083e);
        g.h hVarU = H1.g.u(wVar2.f13082d, 3, wVar2.f13083e, null);
        g.c cVar = hVarU.f5167c;
        return new o.b().j0(str).W(str2).y0("video/hevc").U(cVar != null ? AbstractC0861i.h(cVar.f5141a, cVar.f5142b, cVar.f5143c, cVar.f5144d, cVar.f5145e, cVar.f5146f) : null).F0(hVarU.f5172h).h0(hVarU.f5173i).b0(hVarU.f5174j).a0(hVarU.f5175k).V(new C0748f.b().d(hVarU.f5178n).c(hVarU.f5179o).e(hVarU.f5180p).g(hVarU.f5169e + 8).b(hVarU.f5170f + 8).a()).u0(hVarU.f5176l).p0(hVarU.f5177m).q0(hVarU.f5166b + 1).k0(Collections.singletonList(bArr)).P();
    }

    @Override // P2.InterfaceC1853m
    public void a(G1.C c10) {
        int i10;
        f();
        while (c10.a() > 0) {
            int iG = c10.g();
            int iJ = c10.j();
            byte[] bArrF = c10.f();
            this.f12990m += (long) c10.a();
            this.f12981d.b(c10, c10.a());
            while (iG < iJ) {
                int iE = H1.g.e(bArrF, iG, iJ, this.f12984g);
                if (iE == iJ) {
                    h(bArrF, iG, iJ);
                    return;
                }
                int i11 = H1.g.i(bArrF, iE);
                if (iE <= 0 || bArrF[iE - 1] != 0) {
                    i10 = 3;
                } else {
                    iE--;
                    i10 = 4;
                }
                int i12 = iE;
                int i13 = i10;
                int i14 = i12 - iG;
                if (i14 > 0) {
                    h(bArrF, iG, i12);
                }
                int i15 = iJ - i12;
                long j10 = this.f12990m - ((long) i15);
                g(j10, i15, i14 < 0 ? -i14 : 0, this.f12991n);
                j(j10, i15, i11, this.f12991n);
                iG = i12 + i13;
            }
        }
    }

    @Override // P2.InterfaceC1853m
    public void b() {
        this.f12990m = 0L;
        this.f12991n = -9223372036854775807L;
        H1.g.c(this.f12984g);
        this.f12985h.d();
        this.f12986i.d();
        this.f12987j.d();
        this.f12988k.d();
        this.f12989l.d();
        this.f12978a.b();
        a aVar = this.f12982e;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // P2.InterfaceC1853m
    public void c(boolean z10) {
        f();
        if (z10) {
            this.f12978a.e();
            g(this.f12990m, 0, 0, this.f12991n);
            j(this.f12990m, 0, 48, this.f12991n);
        }
    }

    @Override // P2.InterfaceC1853m
    public void d(i2.r rVar, L.d dVar) {
        dVar.a();
        this.f12980c = dVar.b();
        i2.O oF = rVar.f(dVar.c(), 2);
        this.f12981d = oF;
        this.f12982e = new a(oF);
        this.f12978a.d(rVar, dVar);
    }

    @Override // P2.InterfaceC1853m
    public void e(long j10, int i10) {
        this.f12991n = j10;
    }

    public final void j(long j10, int i10, int i11, long j11) {
        this.f12982e.g(j10, i10, i11, j11, this.f12983f);
        if (!this.f12983f) {
            this.f12985h.e(i11);
            this.f12986i.e(i11);
            this.f12987j.e(i11);
        }
        this.f12988k.e(i11);
        this.f12989l.e(i11);
    }
}
