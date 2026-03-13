package hd;

import fd.c;
import fd.k;
import fd.x;
import md.j;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C0476b f36523A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final C0476b f36524B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final C0476b f36525C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final C0476b f36526D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final C0476b f36527E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final C0476b f36528F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final C0476b f36529G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final C0476b f36530H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final C0476b f36531I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final C0476b f36532J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final C0476b f36533K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final C0476b f36534L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final C0476b f36535M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final C0476b f36536N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final C0476b f36537O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0476b f36538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0476b f36539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0476b f36540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f36541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f36542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f36543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0476b f36544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0476b f36545h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0476b f36546i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0476b f36547j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0476b f36548k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0476b f36549l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C0476b f36550m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0476b f36551n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f36552o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0476b f36553p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0476b f36554q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0476b f36555r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0476b f36556s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0476b f36557t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0476b f36558u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0476b f36559v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0476b f36560w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0476b f36561x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0476b f36562y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0476b f36563z;

    /* JADX INFO: renamed from: hd.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class C0476b extends d {
        public C0476b(int i10) {
            super(i10, 1);
        }

        @Override // hd.b.d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Boolean d(int i10) {
            return Boolean.valueOf(((1 << this.f36565a) & i10) != 0);
        }

        @Override // hd.b.d
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public int e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f36565a;
            }
            return 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j.a[] f36564c;

        public c(int i10, j.a[] aVarArr) {
            super(i10, g(aVarArr));
            this.f36564c = aVarArr;
        }

        private static /* synthetic */ void f(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
        }

        public static int g(Object[] objArr) {
            if (objArr == null) {
                f(0);
            }
            int length = objArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i10 = 31; i10 >= 0; i10--) {
                if (((1 << i10) & length) != 0) {
                    return i10 + 1;
                }
            }
            throw new IllegalStateException("Empty enum: " + objArr.getClass());
        }

        @Override // hd.b.d
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public j.a d(int i10) {
            int i11 = (1 << this.f36566b) - 1;
            int i12 = this.f36565a;
            int i13 = (i10 & (i11 << i12)) >> i12;
            for (j.a aVar : this.f36564c) {
                if (aVar.getNumber() == i13) {
                    return aVar;
                }
            }
            return null;
        }

        @Override // hd.b.d
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public int e(j.a aVar) {
            return aVar.getNumber() << this.f36565a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36566b;

        public static d a(d dVar, j.a[] aVarArr) {
            return new c(dVar.f36565a + dVar.f36566b, aVarArr);
        }

        public static C0476b b(d dVar) {
            return new C0476b(dVar.f36565a + dVar.f36566b);
        }

        public static C0476b c() {
            return new C0476b(0);
        }

        public abstract Object d(int i10);

        public abstract int e(Object obj);

        public d(int i10, int i11) {
            this.f36565a = i10;
            this.f36566b = i11;
        }
    }

    static {
        C0476b c0476bC = d.c();
        f36538a = c0476bC;
        f36539b = d.b(c0476bC);
        C0476b c0476bC2 = d.c();
        f36540c = c0476bC2;
        d dVarA = d.a(c0476bC2, x.values());
        f36541d = dVarA;
        d dVarA2 = d.a(dVarA, k.values());
        f36542e = dVarA2;
        d dVarA3 = d.a(dVarA2, c.EnumC0446c.values());
        f36543f = dVarA3;
        C0476b c0476bB = d.b(dVarA3);
        f36544g = c0476bB;
        C0476b c0476bB2 = d.b(c0476bB);
        f36545h = c0476bB2;
        C0476b c0476bB3 = d.b(c0476bB2);
        f36546i = c0476bB3;
        C0476b c0476bB4 = d.b(c0476bB3);
        f36547j = c0476bB4;
        C0476b c0476bB5 = d.b(c0476bB4);
        f36548k = c0476bB5;
        f36549l = d.b(c0476bB5);
        C0476b c0476bB6 = d.b(dVarA);
        f36550m = c0476bB6;
        f36551n = d.b(c0476bB6);
        d dVarA4 = d.a(dVarA2, fd.j.values());
        f36552o = dVarA4;
        C0476b c0476bB7 = d.b(dVarA4);
        f36553p = c0476bB7;
        C0476b c0476bB8 = d.b(c0476bB7);
        f36554q = c0476bB8;
        C0476b c0476bB9 = d.b(c0476bB8);
        f36555r = c0476bB9;
        C0476b c0476bB10 = d.b(c0476bB9);
        f36556s = c0476bB10;
        C0476b c0476bB11 = d.b(c0476bB10);
        f36557t = c0476bB11;
        C0476b c0476bB12 = d.b(c0476bB11);
        f36558u = c0476bB12;
        C0476b c0476bB13 = d.b(c0476bB12);
        f36559v = c0476bB13;
        f36560w = d.b(c0476bB13);
        C0476b c0476bB14 = d.b(dVarA4);
        f36561x = c0476bB14;
        C0476b c0476bB15 = d.b(c0476bB14);
        f36562y = c0476bB15;
        C0476b c0476bB16 = d.b(c0476bB15);
        f36563z = c0476bB16;
        C0476b c0476bB17 = d.b(c0476bB16);
        f36523A = c0476bB17;
        C0476b c0476bB18 = d.b(c0476bB17);
        f36524B = c0476bB18;
        C0476b c0476bB19 = d.b(c0476bB18);
        f36525C = c0476bB19;
        C0476b c0476bB20 = d.b(c0476bB19);
        f36526D = c0476bB20;
        C0476b c0476bB21 = d.b(c0476bB20);
        f36527E = c0476bB21;
        f36528F = d.b(c0476bB21);
        C0476b c0476bB22 = d.b(c0476bC2);
        f36529G = c0476bB22;
        C0476b c0476bB23 = d.b(c0476bB22);
        f36530H = c0476bB23;
        f36531I = d.b(c0476bB23);
        C0476b c0476bB24 = d.b(dVarA2);
        f36532J = c0476bB24;
        C0476b c0476bB25 = d.b(c0476bB24);
        f36533K = c0476bB25;
        f36534L = d.b(c0476bB25);
        C0476b c0476bC3 = d.c();
        f36535M = c0476bC3;
        f36536N = d.b(c0476bC3);
        f36537O = d.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r2 = 2
            r3 = 1
            if (r5 == r3) goto L2b
            if (r5 == r2) goto L26
            r4 = 5
            if (r5 == r4) goto L2b
            r4 = 6
            if (r5 == r4) goto L21
            r4 = 8
            if (r5 == r4) goto L2b
            r4 = 9
            if (r5 == r4) goto L21
            r4 = 11
            if (r5 == r4) goto L2b
            java.lang.String r4 = "visibility"
            r0[r1] = r4
            goto L2f
        L21:
            java.lang.String r4 = "memberKind"
            r0[r1] = r4
            goto L2f
        L26:
            java.lang.String r4 = "kind"
            r0[r1] = r4
            goto L2f
        L2b:
            java.lang.String r4 = "modality"
            r0[r1] = r4
        L2f:
            java.lang.String r1 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r3] = r1
            switch(r5) {
                case 3: goto L4a;
                case 4: goto L45;
                case 5: goto L45;
                case 6: goto L45;
                case 7: goto L40;
                case 8: goto L40;
                case 9: goto L40;
                case 10: goto L3b;
                case 11: goto L3b;
                default: goto L36;
            }
        L36:
            java.lang.String r5 = "getClassFlags"
            r0[r2] = r5
            goto L4e
        L3b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r2] = r5
            goto L4e
        L40:
            java.lang.String r5 = "getPropertyFlags"
            r0[r2] = r5
            goto L4e
        L45:
            java.lang.String r5 = "getFunctionFlags"
            r0[r2] = r5
            goto L4e
        L4a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r2] = r5
        L4e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.b.a(int):void");
    }

    public static int b(boolean z10, x xVar, k kVar, boolean z11, boolean z12, boolean z13) {
        if (xVar == null) {
            a(10);
        }
        if (kVar == null) {
            a(11);
        }
        return f36540c.e(Boolean.valueOf(z10)) | f36542e.e(kVar) | f36541d.e(xVar) | f36532J.e(Boolean.valueOf(z11)) | f36533K.e(Boolean.valueOf(z12)) | f36534L.e(Boolean.valueOf(z13));
    }
}
