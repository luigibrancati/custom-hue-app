package P2;

import D1.o;
import G1.AbstractC0853a;
import P2.L;
import java.util.Arrays;
import java.util.Collections;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: renamed from: P2.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1855o implements InterfaceC1853m {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float[] f12900m = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O f12901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G1.C f12903c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f12906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f12907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f12908h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f12909i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i2.O f12910j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f12911k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean[] f12904d = new boolean[4];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f12905e = new a(128);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f12912l = -9223372036854775807L;

    /* JADX INFO: renamed from: P2.o$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final byte[] f12913f = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f12914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f12916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f12917d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f12918e;

        public a(int i10) {
            this.f12918e = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f12914a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f12918e;
                int length = bArr2.length;
                int i13 = this.f12916c;
                if (length < i13 + i12) {
                    this.f12918e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f12918e, this.f12916c, i12);
                this.f12916c += i12;
            }
        }

        public boolean b(int i10, int i11) {
            int i12 = this.f12915b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i10 == 179 || i10 == 181) {
                                this.f12916c -= i11;
                                this.f12914a = false;
                                return true;
                            }
                        } else if ((i10 & 240) != 32) {
                            G1.t.h("H263Reader", "Unexpected start code value");
                            c();
                        } else {
                            this.f12917d = this.f12916c;
                            this.f12915b = 4;
                        }
                    } else if (i10 > 31) {
                        G1.t.h("H263Reader", "Unexpected start code value");
                        c();
                    } else {
                        this.f12915b = 3;
                    }
                } else if (i10 != 181) {
                    G1.t.h("H263Reader", "Unexpected start code value");
                    c();
                } else {
                    this.f12915b = 2;
                }
            } else if (i10 == 176) {
                this.f12915b = 1;
                this.f12914a = true;
            }
            byte[] bArr = f12913f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f12914a = false;
            this.f12916c = 0;
            this.f12915b = 0;
        }
    }

    /* JADX INFO: renamed from: P2.o$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i2.O f12919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f12920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f12921c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f12922d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f12923e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f12924f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f12925g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f12926h;

        public b(i2.O o10) {
            this.f12919a = o10;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f12921c) {
                int i12 = this.f12924f;
                int i13 = (i10 + 1) - i12;
                if (i13 >= i11) {
                    this.f12924f = i12 + (i11 - i10);
                } else {
                    this.f12922d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f12921c = false;
                }
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
        public void b(long j10, int i10, boolean z10) {
            AbstractC0853a.g(this.f12926h != -9223372036854775807L);
            if (this.f12923e == 182 && z10 && this.f12920b) {
                this.f12919a.d(this.f12926h, this.f12922d ? 1 : 0, (int) (j10 - this.f12925g), i10, null);
            }
            if (this.f12923e != 179) {
                this.f12925g = j10;
            }
        }

        public void c(int i10, long j10) {
            this.f12923e = i10;
            this.f12922d = false;
            this.f12920b = i10 == 182 || i10 == 179;
            this.f12921c = i10 == 182;
            this.f12924f = 0;
            this.f12926h = j10;
        }

        public void d() {
            this.f12920b = false;
            this.f12921c = false;
            this.f12922d = false;
            this.f12923e = -1;
        }
    }

    public C1855o(O o10, String str) {
        this.f12901a = o10;
        this.f12902b = str;
        if (o10 != null) {
            this.f12906f = new w(178, 128);
            this.f12903c = new G1.C();
        } else {
            this.f12906f = null;
            this.f12903c = null;
        }
    }

    public static D1.o f(a aVar, int i10, String str, String str2) {
        byte[] bArrCopyOf = Arrays.copyOf(aVar.f12918e, aVar.f12916c);
        G1.B b10 = new G1.B(bArrCopyOf);
        b10.s(i10);
        b10.s(4);
        b10.q();
        b10.r(8);
        if (b10.g()) {
            b10.r(4);
            b10.r(3);
        }
        int iH = b10.h(4);
        float f10 = 1.0f;
        if (iH == 15) {
            int iH2 = b10.h(8);
            int iH3 = b10.h(8);
            if (iH3 == 0) {
                G1.t.h("H263Reader", "Invalid aspect ratio");
            } else {
                f10 = iH2 / iH3;
            }
        } else {
            float[] fArr = f12900m;
            if (iH < fArr.length) {
                f10 = fArr[iH];
            } else {
                G1.t.h("H263Reader", "Invalid aspect ratio");
            }
        }
        if (b10.g()) {
            b10.r(2);
            b10.r(1);
            if (b10.g()) {
                b10.r(15);
                b10.q();
                b10.r(15);
                b10.q();
                b10.r(15);
                b10.q();
                b10.r(3);
                b10.r(11);
                b10.q();
                b10.r(15);
                b10.q();
            }
        }
        if (b10.h(2) != 0) {
            G1.t.h("H263Reader", "Unhandled video object layer shape");
        }
        b10.q();
        int iH4 = b10.h(16);
        b10.q();
        if (b10.g()) {
            if (iH4 == 0) {
                G1.t.h("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i11 = 0;
                for (int i12 = iH4 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                b10.r(i11);
            }
        }
        b10.q();
        int iH5 = b10.h(13);
        b10.q();
        int iH6 = b10.h(13);
        b10.q();
        b10.q();
        return new o.b().j0(str).W(str2).y0("video/mp4v-es").F0(iH5).h0(iH6).u0(f10).k0(Collections.singletonList(bArrCopyOf)).P();
    }

    @Override // P2.InterfaceC1853m
    public void a(G1.C c10) {
        AbstractC0853a.i(this.f12907g);
        AbstractC0853a.i(this.f12910j);
        int iG = c10.g();
        int iJ = c10.j();
        byte[] bArrF = c10.f();
        this.f12908h += (long) c10.a();
        this.f12910j.b(c10, c10.a());
        while (true) {
            int iE = H1.g.e(bArrF, iG, iJ, this.f12904d);
            if (iE == iJ) {
                break;
            }
            int i10 = iE + 3;
            int i11 = c10.f()[i10] & ForkServer.ERROR;
            int i12 = iE - iG;
            int i13 = 0;
            if (!this.f12911k) {
                if (i12 > 0) {
                    this.f12905e.a(bArrF, iG, iE);
                }
                if (this.f12905e.b(i11, i12 < 0 ? -i12 : 0)) {
                    i2.O o10 = this.f12910j;
                    a aVar = this.f12905e;
                    o10.e(f(aVar, aVar.f12917d, (String) AbstractC0853a.e(this.f12909i), this.f12902b));
                    this.f12911k = true;
                }
            }
            this.f12907g.a(bArrF, iG, iE);
            w wVar = this.f12906f;
            if (wVar != null) {
                if (i12 > 0) {
                    wVar.a(bArrF, iG, iE);
                } else {
                    i13 = -i12;
                }
                if (this.f12906f.b(i13)) {
                    w wVar2 = this.f12906f;
                    ((G1.C) G1.M.i(this.f12903c)).Y(this.f12906f.f13082d, H1.g.L(wVar2.f13082d, wVar2.f13083e));
                    ((O) G1.M.i(this.f12901a)).b(this.f12912l, this.f12903c);
                }
                if (i11 == 178 && c10.f()[iE + 2] == 1) {
                    this.f12906f.e(i11);
                }
            }
            int i14 = iJ - iE;
            this.f12907g.b(this.f12908h - ((long) i14), i14, this.f12911k);
            this.f12907g.c(i11, this.f12912l);
            iG = i10;
        }
        if (!this.f12911k) {
            this.f12905e.a(bArrF, iG, iJ);
        }
        this.f12907g.a(bArrF, iG, iJ);
        w wVar3 = this.f12906f;
        if (wVar3 != null) {
            wVar3.a(bArrF, iG, iJ);
        }
    }

    @Override // P2.InterfaceC1853m
    public void b() {
        H1.g.c(this.f12904d);
        this.f12905e.c();
        b bVar = this.f12907g;
        if (bVar != null) {
            bVar.d();
        }
        w wVar = this.f12906f;
        if (wVar != null) {
            wVar.d();
        }
        this.f12908h = 0L;
        this.f12912l = -9223372036854775807L;
    }

    @Override // P2.InterfaceC1853m
    public void c(boolean z10) {
        AbstractC0853a.i(this.f12907g);
        if (z10) {
            this.f12907g.b(this.f12908h, 0, this.f12911k);
            this.f12907g.d();
        }
    }

    @Override // P2.InterfaceC1853m
    public void d(i2.r rVar, L.d dVar) {
        dVar.a();
        this.f12909i = dVar.b();
        i2.O oF = rVar.f(dVar.c(), 2);
        this.f12910j = oF;
        this.f12907g = new b(oF);
        O o10 = this.f12901a;
        if (o10 != null) {
            o10.c(rVar, dVar);
        }
    }

    @Override // P2.InterfaceC1853m
    public void e(long j10, int i10) {
        this.f12912l = j10;
    }
}
