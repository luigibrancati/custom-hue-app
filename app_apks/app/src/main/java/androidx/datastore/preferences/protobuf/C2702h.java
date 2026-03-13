package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C2715v;
import androidx.datastore.preferences.protobuf.l0;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2702h implements Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2701g f22830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22833d = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22834a;

        static {
            int[] iArr = new int[l0.b.values().length];
            f22834a = iArr;
            try {
                iArr[l0.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22834a[l0.b.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22834a[l0.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22834a[l0.b.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22834a[l0.b.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22834a[l0.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22834a[l0.b.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22834a[l0.b.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22834a[l0.b.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22834a[l0.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22834a[l0.b.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22834a[l0.b.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f22834a[l0.b.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f22834a[l0.b.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f22834a[l0.b.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f22834a[l0.b.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f22834a[l0.b.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C2702h(AbstractC2701g abstractC2701g) {
        AbstractC2701g abstractC2701g2 = (AbstractC2701g) AbstractC2714u.b(abstractC2701g, "input");
        this.f22830a = abstractC2701g2;
        abstractC2701g2.f22810d = this;
    }

    public static C2702h N(AbstractC2701g abstractC2701g) {
        C2702h c2702h = abstractC2701g.f22810d;
        return c2702h != null ? c2702h : new C2702h(abstractC2701g);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void A(List list) throws C2715v.a {
        U(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void B(List list) throws C2715v {
        int iC;
        int iB = l0.b(this.f22831b);
        if (iB == 2) {
            int iD = this.f22830a.D();
            X(iD);
            int iE = this.f22830a.e() + iD;
            do {
                list.add(Float.valueOf(this.f22830a.t()));
            } while (this.f22830a.e() < iE);
            return;
        }
        if (iB != 5) {
            throw C2715v.e();
        }
        do {
            list.add(Float.valueOf(this.f22830a.t()));
            if (this.f22830a.f()) {
                return;
            } else {
                iC = this.f22830a.C();
            }
        } while (iC == this.f22831b);
        this.f22833d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public boolean C() {
        int i10;
        if (this.f22830a.f() || (i10 = this.f22831b) == this.f22832c) {
            return false;
        }
        return this.f22830a.F(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public int D() throws C2715v.a {
        W(5);
        return this.f22830a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void E(List list) throws C2715v.a {
        int iC;
        if (l0.b(this.f22831b) != 2) {
            throw C2715v.e();
        }
        do {
            list.add(n());
            if (this.f22830a.f()) {
                return;
            } else {
                iC = this.f22830a.C();
            }
        } while (iC == this.f22831b);
        this.f22833d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void F(List list) throws C2715v {
        int iC;
        int iB = l0.b(this.f22831b);
        if (iB == 1) {
            do {
                list.add(Double.valueOf(this.f22830a.p()));
                if (this.f22830a.f()) {
                    return;
                } else {
                    iC = this.f22830a.C();
                }
            } while (iC == this.f22831b);
            this.f22833d = iC;
            return;
        }
        if (iB != 2) {
            throw C2715v.e();
        }
        int iD = this.f22830a.D();
        Y(iD);
        int iE = this.f22830a.e() + iD;
        do {
            list.add(Double.valueOf(this.f22830a.p()));
        } while (this.f22830a.e() < iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public long G() throws C2715v.a {
        W(0);
        return this.f22830a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public String H() throws C2715v.a {
        W(2);
        return this.f22830a.B();
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void I(Object obj, Z z10, C2707m c2707m) throws C2715v {
        W(2);
        P(obj, z10, c2707m);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void J(List list, Z z10, C2707m c2707m) throws C2715v.a {
        int iC;
        if (l0.b(this.f22831b) != 2) {
            throw C2715v.e();
        }
        int i10 = this.f22831b;
        do {
            list.add(S(z10, c2707m));
            if (this.f22830a.f() || this.f22833d != 0) {
                return;
            } else {
                iC = this.f22830a.C();
            }
        } while (iC == i10);
        this.f22833d = iC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r7.f22830a.l(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return;
     */
    @Override // androidx.datastore.preferences.protobuf.Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void K(java.util.Map r8, androidx.datastore.preferences.protobuf.D.a r9, androidx.datastore.preferences.protobuf.C2707m r10) throws androidx.datastore.preferences.protobuf.C2715v.a {
        /*
            r7 = this;
            r0 = 2
            r7.W(r0)
            androidx.datastore.preferences.protobuf.g r1 = r7.f22830a
            int r1 = r1.D()
            androidx.datastore.preferences.protobuf.g r2 = r7.f22830a
            int r1 = r2.m(r1)
            java.lang.Object r2 = r9.f22722b
            java.lang.Object r3 = r9.f22724d
        L14:
            int r4 = r7.z()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            androidx.datastore.preferences.protobuf.g r5 = r7.f22830a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.f()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.C()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C2715v.a -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            androidx.datastore.preferences.protobuf.v r4 = new androidx.datastore.preferences.protobuf.v     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C2715v.a -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C2715v.a -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C2715v.a -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            androidx.datastore.preferences.protobuf.l0$b r4 = r9.f22723c     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C2715v.a -> L51
            java.lang.Object r5 = r9.f22724d     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C2715v.a -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C2715v.a -> L51
            java.lang.Object r3 = r7.Q(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C2715v.a -> L51
            goto L14
        L49:
            androidx.datastore.preferences.protobuf.l0$b r4 = r9.f22721a     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C2715v.a -> L51
            r5 = 0
            java.lang.Object r2 = r7.Q(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C2715v.a -> L51
            goto L14
        L51:
            boolean r4 = r7.C()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            androidx.datastore.preferences.protobuf.v r8 = new androidx.datastore.preferences.protobuf.v     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            androidx.datastore.preferences.protobuf.g r7 = r7.f22830a
            r7.l(r1)
            return
        L67:
            androidx.datastore.preferences.protobuf.g r7 = r7.f22830a
            r7.l(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2702h.K(java.util.Map, androidx.datastore.preferences.protobuf.D$a, androidx.datastore.preferences.protobuf.m):void");
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void L(Object obj, Z z10, C2707m c2707m) throws C2715v.a {
        W(3);
        O(obj, z10, c2707m);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void M(List list, Z z10, C2707m c2707m) throws C2715v.a {
        int iC;
        if (l0.b(this.f22831b) != 3) {
            throw C2715v.e();
        }
        int i10 = this.f22831b;
        do {
            list.add(R(z10, c2707m));
            if (this.f22830a.f() || this.f22833d != 0) {
                return;
            } else {
                iC = this.f22830a.C();
            }
        } while (iC == i10);
        this.f22833d = iC;
    }

    public final void O(Object obj, Z z10, C2707m c2707m) {
        int i10 = this.f22832c;
        this.f22832c = l0.c(l0.a(this.f22831b), 4);
        try {
            z10.g(obj, this, c2707m);
            if (this.f22831b == this.f22832c) {
            } else {
                throw C2715v.h();
            }
        } finally {
            this.f22832c = i10;
        }
    }

    public final void P(Object obj, Z z10, C2707m c2707m) throws C2715v {
        int iD = this.f22830a.D();
        AbstractC2701g abstractC2701g = this.f22830a;
        if (abstractC2701g.f22807a >= abstractC2701g.f22808b) {
            throw C2715v.i();
        }
        int iM = abstractC2701g.m(iD);
        this.f22830a.f22807a++;
        z10.g(obj, this, c2707m);
        this.f22830a.a(0);
        r4.f22807a--;
        this.f22830a.l(iM);
    }

    public final Object Q(l0.b bVar, Class cls, C2707m c2707m) {
        switch (a.f22834a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(d());
            case 2:
                return n();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(j());
            case 5:
                return Integer.valueOf(t());
            case 6:
                return Long.valueOf(a());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(o());
            case 9:
                return Long.valueOf(G());
            case 10:
                return T(cls, c2707m);
            case 11:
                return Integer.valueOf(D());
            case 12:
                return Long.valueOf(e());
            case 13:
                return Integer.valueOf(k());
            case 14:
                return Long.valueOf(x());
            case 15:
                return H();
            case 16:
                return Integer.valueOf(g());
            case 17:
                return Long.valueOf(r());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public final Object R(Z z10, C2707m c2707m) {
        Object objNewInstance = z10.newInstance();
        O(objNewInstance, z10, c2707m);
        z10.b(objNewInstance);
        return objNewInstance;
    }

    public final Object S(Z z10, C2707m c2707m) throws C2715v {
        Object objNewInstance = z10.newInstance();
        P(objNewInstance, z10, c2707m);
        z10.b(objNewInstance);
        return objNewInstance;
    }

    public Object T(Class cls, C2707m c2707m) throws C2715v.a {
        W(2);
        return S(V.a().c(cls), c2707m);
    }

    public void U(List list, boolean z10) throws C2715v.a {
        int iC;
        if (l0.b(this.f22831b) != 2) {
            throw C2715v.e();
        }
        do {
            list.add(z10 ? H() : y());
            if (this.f22830a.f()) {
                return;
            } else {
                iC = this.f22830a.C();
            }
        } while (iC == this.f22831b);
        this.f22833d = iC;
    }

    public final void V(int i10) throws C2715v {
        if (this.f22830a.e() != i10) {
            throw C2715v.m();
        }
    }

    public final void W(int i10) throws C2715v.a {
        if (l0.b(this.f22831b) != i10) {
            throw C2715v.e();
        }
    }

    public final void X(int i10) throws C2715v {
        if ((i10 & 3) != 0) {
            throw C2715v.h();
        }
    }

    public final void Y(int i10) throws C2715v {
        if ((i10 & 7) != 0) {
            throw C2715v.h();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public long a() throws C2715v.a {
        W(1);
        return this.f22830a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void b(List list) throws C2715v {
        int iC;
        int iB = l0.b(this.f22831b);
        if (iB == 2) {
            int iD = this.f22830a.D();
            X(iD);
            int iE = this.f22830a.e() + iD;
            do {
                list.add(Integer.valueOf(this.f22830a.w()));
            } while (this.f22830a.e() < iE);
            return;
        }
        if (iB != 5) {
            throw C2715v.e();
        }
        do {
            list.add(Integer.valueOf(this.f22830a.w()));
            if (this.f22830a.f()) {
                return;
            } else {
                iC = this.f22830a.C();
            }
        } while (iC == this.f22831b);
        this.f22833d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void c(List list) throws C2715v {
        int iC;
        int iB = l0.b(this.f22831b);
        if (iB == 0) {
            do {
                list.add(Long.valueOf(this.f22830a.z()));
                if (this.f22830a.f()) {
                    return;
                } else {
                    iC = this.f22830a.C();
                }
            } while (iC == this.f22831b);
            this.f22833d = iC;
            return;
        }
        if (iB != 2) {
            throw C2715v.e();
        }
        int iE = this.f22830a.e() + this.f22830a.D();
        do {
            list.add(Long.valueOf(this.f22830a.z()));
        } while (this.f22830a.e() < iE);
        V(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public boolean d() throws C2715v.a {
        W(0);
        return this.f22830a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public long e() throws C2715v.a {
        W(1);
        return this.f22830a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void f(List list) throws C2715v {
        int iC;
        int iB = l0.b(this.f22831b);
        if (iB == 0) {
            do {
                list.add(Long.valueOf(this.f22830a.E()));
                if (this.f22830a.f()) {
                    return;
                } else {
                    iC = this.f22830a.C();
                }
            } while (iC == this.f22831b);
            this.f22833d = iC;
            return;
        }
        if (iB != 2) {
            throw C2715v.e();
        }
        int iE = this.f22830a.e() + this.f22830a.D();
        do {
            list.add(Long.valueOf(this.f22830a.E()));
        } while (this.f22830a.e() < iE);
        V(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public int g() throws C2715v.a {
        W(0);
        return this.f22830a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public int getTag() {
        return this.f22831b;
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void h(List list) throws C2715v {
        int iC;
        int iB = l0.b(this.f22831b);
        if (iB == 0) {
            do {
                list.add(Long.valueOf(this.f22830a.v()));
                if (this.f22830a.f()) {
                    return;
                } else {
                    iC = this.f22830a.C();
                }
            } while (iC == this.f22831b);
            this.f22833d = iC;
            return;
        }
        if (iB != 2) {
            throw C2715v.e();
        }
        int iE = this.f22830a.e() + this.f22830a.D();
        do {
            list.add(Long.valueOf(this.f22830a.v()));
        } while (this.f22830a.e() < iE);
        V(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void i(List list) throws C2715v {
        int iC;
        int iB = l0.b(this.f22831b);
        if (iB == 0) {
            do {
                list.add(Integer.valueOf(this.f22830a.q()));
                if (this.f22830a.f()) {
                    return;
                } else {
                    iC = this.f22830a.C();
                }
            } while (iC == this.f22831b);
            this.f22833d = iC;
            return;
        }
        if (iB != 2) {
            throw C2715v.e();
        }
        int iE = this.f22830a.e() + this.f22830a.D();
        do {
            list.add(Integer.valueOf(this.f22830a.q()));
        } while (this.f22830a.e() < iE);
        V(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public int j() throws C2715v.a {
        W(0);
        return this.f22830a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public int k() throws C2715v.a {
        W(0);
        return this.f22830a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void l(List list) throws C2715v {
        int iC;
        int iB = l0.b(this.f22831b);
        if (iB == 0) {
            do {
                list.add(Boolean.valueOf(this.f22830a.n()));
                if (this.f22830a.f()) {
                    return;
                } else {
                    iC = this.f22830a.C();
                }
            } while (iC == this.f22831b);
            this.f22833d = iC;
            return;
        }
        if (iB != 2) {
            throw C2715v.e();
        }
        int iE = this.f22830a.e() + this.f22830a.D();
        do {
            list.add(Boolean.valueOf(this.f22830a.n()));
        } while (this.f22830a.e() < iE);
        V(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void m(List list) throws C2715v.a {
        U(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public AbstractC2700f n() throws C2715v.a {
        W(2);
        return this.f22830a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public int o() throws C2715v.a {
        W(0);
        return this.f22830a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void p(List list) throws C2715v {
        int iC;
        int iB = l0.b(this.f22831b);
        if (iB == 1) {
            do {
                list.add(Long.valueOf(this.f22830a.s()));
                if (this.f22830a.f()) {
                    return;
                } else {
                    iC = this.f22830a.C();
                }
            } while (iC == this.f22831b);
            this.f22833d = iC;
            return;
        }
        if (iB != 2) {
            throw C2715v.e();
        }
        int iD = this.f22830a.D();
        Y(iD);
        int iE = this.f22830a.e() + iD;
        do {
            list.add(Long.valueOf(this.f22830a.s()));
        } while (this.f22830a.e() < iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void q(List list) throws C2715v {
        int iC;
        int iB = l0.b(this.f22831b);
        if (iB == 0) {
            do {
                list.add(Integer.valueOf(this.f22830a.y()));
                if (this.f22830a.f()) {
                    return;
                } else {
                    iC = this.f22830a.C();
                }
            } while (iC == this.f22831b);
            this.f22833d = iC;
            return;
        }
        if (iB != 2) {
            throw C2715v.e();
        }
        int iE = this.f22830a.e() + this.f22830a.D();
        do {
            list.add(Integer.valueOf(this.f22830a.y()));
        } while (this.f22830a.e() < iE);
        V(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public long r() throws C2715v.a {
        W(0);
        return this.f22830a.E();
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public double readDouble() throws C2715v.a {
        W(1);
        return this.f22830a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public float readFloat() throws C2715v.a {
        W(5);
        return this.f22830a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void s(List list) throws C2715v {
        int iC;
        int iB = l0.b(this.f22831b);
        if (iB == 0) {
            do {
                list.add(Integer.valueOf(this.f22830a.D()));
                if (this.f22830a.f()) {
                    return;
                } else {
                    iC = this.f22830a.C();
                }
            } while (iC == this.f22831b);
            this.f22833d = iC;
            return;
        }
        if (iB != 2) {
            throw C2715v.e();
        }
        int iE = this.f22830a.e() + this.f22830a.D();
        do {
            list.add(Integer.valueOf(this.f22830a.D()));
        } while (this.f22830a.e() < iE);
        V(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public int t() throws C2715v.a {
        W(5);
        return this.f22830a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void u(List list) throws C2715v {
        int iC;
        int iB = l0.b(this.f22831b);
        if (iB == 1) {
            do {
                list.add(Long.valueOf(this.f22830a.x()));
                if (this.f22830a.f()) {
                    return;
                } else {
                    iC = this.f22830a.C();
                }
            } while (iC == this.f22831b);
            this.f22833d = iC;
            return;
        }
        if (iB != 2) {
            throw C2715v.e();
        }
        int iD = this.f22830a.D();
        Y(iD);
        int iE = this.f22830a.e() + iD;
        do {
            list.add(Long.valueOf(this.f22830a.x()));
        } while (this.f22830a.e() < iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void v(List list) throws C2715v {
        int iC;
        int iB = l0.b(this.f22831b);
        if (iB == 0) {
            do {
                list.add(Integer.valueOf(this.f22830a.u()));
                if (this.f22830a.f()) {
                    return;
                } else {
                    iC = this.f22830a.C();
                }
            } while (iC == this.f22831b);
            this.f22833d = iC;
            return;
        }
        if (iB != 2) {
            throw C2715v.e();
        }
        int iE = this.f22830a.e() + this.f22830a.D();
        do {
            list.add(Integer.valueOf(this.f22830a.u()));
        } while (this.f22830a.e() < iE);
        V(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void w(List list) throws C2715v {
        int iC;
        int iB = l0.b(this.f22831b);
        if (iB == 2) {
            int iD = this.f22830a.D();
            X(iD);
            int iE = this.f22830a.e() + iD;
            do {
                list.add(Integer.valueOf(this.f22830a.r()));
            } while (this.f22830a.e() < iE);
            return;
        }
        if (iB != 5) {
            throw C2715v.e();
        }
        do {
            list.add(Integer.valueOf(this.f22830a.r()));
            if (this.f22830a.f()) {
                return;
            } else {
                iC = this.f22830a.C();
            }
        } while (iC == this.f22831b);
        this.f22833d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public long x() throws C2715v.a {
        W(0);
        return this.f22830a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public String y() throws C2715v.a {
        W(2);
        return this.f22830a.A();
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public int z() {
        int i10 = this.f22833d;
        if (i10 != 0) {
            this.f22831b = i10;
            this.f22833d = 0;
        } else {
            this.f22831b = this.f22830a.C();
        }
        int i11 = this.f22831b;
        if (i11 == 0 || i11 == this.f22832c) {
            return Integer.MAX_VALUE;
        }
        return l0.a(i11);
    }
}
