package P2;

import G1.AbstractC0853a;
import P2.L;
import java.util.Arrays;

/* JADX INFO: renamed from: P2.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1854n implements InterfaceC1853m {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final double[] f12877r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f12878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i2.O f12879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O f12880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final G1.C f12882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f12883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f12884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f12885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f12886i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12887j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f12888k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f12889l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f12890m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f12891n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f12892o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f12893p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f12894q;

    /* JADX INFO: renamed from: P2.n$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final byte[] f12895e = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f12896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12897b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f12898c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f12899d;

        public a(int i10) {
            this.f12899d = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f12896a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f12899d;
                int length = bArr2.length;
                int i13 = this.f12897b;
                if (length < i13 + i12) {
                    this.f12899d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f12899d, this.f12897b, i12);
                this.f12897b += i12;
            }
        }

        public boolean b(int i10, int i11) {
            if (this.f12896a) {
                int i12 = this.f12897b - i11;
                this.f12897b = i12;
                if (this.f12898c != 0 || i10 != 181) {
                    this.f12896a = false;
                    return true;
                }
                this.f12898c = i12;
            } else if (i10 == 179) {
                this.f12896a = true;
            }
            byte[] bArr = f12895e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f12896a = false;
            this.f12897b = 0;
            this.f12898c = 0;
        }
    }

    public C1854n(String str) {
        this(null, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair f(P2.C1854n.a r8, java.lang.String r9, java.lang.String r10) {
        /*
            byte[] r0 = r8.f12899d
            int r1 = r8.f12897b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            r4 = r0[r3]
            r5 = r4 & 255(0xff, float:3.57E-43)
            r6 = 6
            r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r5 = r5 >> r1
            r2 = r2 | r5
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r6
            r5 = 7
            r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L3e
            r7 = 3
            if (r6 == r7) goto L38
            if (r6 == r1) goto L30
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L44
        L30:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
        L35:
            float r6 = (float) r6
            float r1 = r1 / r6
            goto L44
        L38:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L35
        L3e:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
            goto L35
        L44:
            D1.o$b r6 = new D1.o$b
            r6.<init>()
            D1.o$b r9 = r6.j0(r9)
            D1.o$b r9 = r9.W(r10)
            java.lang.String r10 = "video/mpeg2"
            D1.o$b r9 = r9.y0(r10)
            D1.o$b r9 = r9.F0(r2)
            D1.o$b r9 = r9.h0(r4)
            D1.o$b r9 = r9.u0(r1)
            java.util.List r10 = java.util.Collections.singletonList(r0)
            D1.o$b r9 = r9.k0(r10)
            D1.o r9 = r9.P()
            r10 = r0[r5]
            r10 = r10 & 15
            int r10 = r10 + (-1)
            if (r10 < 0) goto L9c
            double[] r1 = P2.C1854n.f12877r
            int r2 = r1.length
            if (r10 >= r2) goto L9c
            r1 = r1[r10]
            int r8 = r8.f12898c
            int r8 = r8 + 9
            r8 = r0[r8]
            r10 = r8 & 96
            int r10 = r10 >> r3
            r8 = r8 & 31
            if (r10 == r8) goto L94
            double r3 = (double) r10
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L94:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r0 = (long) r3
            goto L9e
        L9c:
            r0 = 0
        L9e:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.C1854n.f(P2.n$a, java.lang.String, java.lang.String):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0144  */
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
    @Override // P2.InterfaceC1853m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(G1.C r20) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.C1854n.a(G1.C):void");
    }

    @Override // P2.InterfaceC1853m
    public void b() {
        H1.g.c(this.f12884g);
        this.f12885h.c();
        w wVar = this.f12883f;
        if (wVar != null) {
            wVar.d();
        }
        this.f12886i = 0L;
        this.f12887j = false;
        this.f12890m = -9223372036854775807L;
        this.f12892o = -9223372036854775807L;
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
    @Override // P2.InterfaceC1853m
    public void c(boolean z10) {
        AbstractC0853a.i(this.f12879b);
        if (z10) {
            boolean z11 = this.f12893p;
            this.f12879b.d(this.f12892o, z11 ? 1 : 0, (int) (this.f12886i - this.f12891n), 0, null);
        }
    }

    @Override // P2.InterfaceC1853m
    public void d(i2.r rVar, L.d dVar) {
        dVar.a();
        this.f12878a = dVar.b();
        this.f12879b = rVar.f(dVar.c(), 2);
        O o10 = this.f12880c;
        if (o10 != null) {
            o10.c(rVar, dVar);
        }
    }

    @Override // P2.InterfaceC1853m
    public void e(long j10, int i10) {
        this.f12890m = j10;
    }

    public C1854n(O o10, String str) {
        this.f12880c = o10;
        this.f12881d = str;
        this.f12884g = new boolean[4];
        this.f12885h = new a(128);
        if (o10 != null) {
            this.f12883f = new w(178, 128);
            this.f12882e = new G1.C();
        } else {
            this.f12883f = null;
            this.f12882e = null;
        }
        this.f12890m = -9223372036854775807L;
        this.f12892o = -9223372036854775807L;
    }
}
