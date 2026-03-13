package com.google.protobuf;

import com.google.protobuf.O;
import com.google.protobuf.Q0;
import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3726l implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC3724k f32305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f32308d = 0;

    /* JADX INFO: renamed from: com.google.protobuf.l$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32309a;

        static {
            int[] iArr = new int[Q0.b.values().length];
            f32309a = iArr;
            try {
                iArr[Q0.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32309a[Q0.b.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32309a[Q0.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32309a[Q0.b.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32309a[Q0.b.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32309a[Q0.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32309a[Q0.b.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f32309a[Q0.b.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f32309a[Q0.b.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f32309a[Q0.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f32309a[Q0.b.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f32309a[Q0.b.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f32309a[Q0.b.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f32309a[Q0.b.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f32309a[Q0.b.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f32309a[Q0.b.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f32309a[Q0.b.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C3726l(AbstractC3724k abstractC3724k) {
        AbstractC3724k abstractC3724k2 = (AbstractC3724k) N.b(abstractC3724k, "input");
        this.f32305a = abstractC3724k2;
        abstractC3724k2.f32272d = this;
    }

    public static C3726l P(AbstractC3724k abstractC3724k) {
        C3726l c3726l = abstractC3724k.f32272d;
        return c3726l != null ? c3726l : new C3726l(abstractC3724k);
    }

    @Override // com.google.protobuf.z0
    public void A(List list) throws O.a {
        V(list, false);
    }

    @Override // com.google.protobuf.z0
    public void B(List list) throws O {
        int iJ;
        int iJ2;
        if (!(list instanceof K)) {
            int iB = Q0.b(this.f32306b);
            if (iB == 2) {
                int iK = this.f32305a.K();
                Y(iK);
                int iF = this.f32305a.f() + iK;
                do {
                    list.add(Float.valueOf(this.f32305a.w()));
                } while (this.f32305a.f() < iF);
                return;
            }
            if (iB != 5) {
                throw O.e();
            }
            do {
                list.add(Float.valueOf(this.f32305a.w()));
                if (this.f32305a.g()) {
                    return;
                } else {
                    iJ = this.f32305a.J();
                }
            } while (iJ == this.f32306b);
            this.f32308d = iJ;
            return;
        }
        K k10 = (K) list;
        int iB2 = Q0.b(this.f32306b);
        if (iB2 == 2) {
            int iK2 = this.f32305a.K();
            Y(iK2);
            int iF2 = this.f32305a.f() + iK2;
            do {
                k10.f(this.f32305a.w());
            } while (this.f32305a.f() < iF2);
            return;
        }
        if (iB2 != 5) {
            throw O.e();
        }
        do {
            k10.f(this.f32305a.w());
            if (this.f32305a.g()) {
                return;
            } else {
                iJ2 = this.f32305a.J();
            }
        } while (iJ2 == this.f32306b);
        this.f32308d = iJ2;
    }

    @Override // com.google.protobuf.z0
    public boolean C() {
        int i10;
        if (this.f32305a.g() || (i10 = this.f32306b) == this.f32307c) {
            return false;
        }
        return this.f32305a.M(i10);
    }

    @Override // com.google.protobuf.z0
    public int D() throws O.a {
        X(5);
        return this.f32305a.D();
    }

    @Override // com.google.protobuf.z0
    public void E(List list) throws O.a {
        int iJ;
        if (Q0.b(this.f32306b) != 2) {
            throw O.e();
        }
        do {
            list.add(n());
            if (this.f32305a.g()) {
                return;
            } else {
                iJ = this.f32305a.J();
            }
        } while (iJ == this.f32306b);
        this.f32308d = iJ;
    }

    @Override // com.google.protobuf.z0
    public void F(List list) throws O {
        int iJ;
        int iJ2;
        if (!(list instanceof C3745y)) {
            int iB = Q0.b(this.f32306b);
            if (iB == 1) {
                do {
                    list.add(Double.valueOf(this.f32305a.s()));
                    if (this.f32305a.g()) {
                        return;
                    } else {
                        iJ = this.f32305a.J();
                    }
                } while (iJ == this.f32306b);
                this.f32308d = iJ;
                return;
            }
            if (iB != 2) {
                throw O.e();
            }
            int iK = this.f32305a.K();
            Z(iK);
            int iF = this.f32305a.f() + iK;
            do {
                list.add(Double.valueOf(this.f32305a.s()));
            } while (this.f32305a.f() < iF);
            return;
        }
        C3745y c3745y = (C3745y) list;
        int iB2 = Q0.b(this.f32306b);
        if (iB2 == 1) {
            do {
                c3745y.G0(this.f32305a.s());
                if (this.f32305a.g()) {
                    return;
                } else {
                    iJ2 = this.f32305a.J();
                }
            } while (iJ2 == this.f32306b);
            this.f32308d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw O.e();
        }
        int iK2 = this.f32305a.K();
        Z(iK2);
        int iF2 = this.f32305a.f() + iK2;
        do {
            c3745y.G0(this.f32305a.s());
        } while (this.f32305a.f() < iF2);
    }

    @Override // com.google.protobuf.z0
    public long G() throws O.a {
        X(0);
        return this.f32305a.z();
    }

    @Override // com.google.protobuf.z0
    public String H() throws O.a {
        X(2);
        return this.f32305a.I();
    }

    @Override // com.google.protobuf.z0
    public void I(List list, A0 a02, D d10) throws O.a {
        int iJ;
        if (Q0.b(this.f32306b) != 3) {
            throw O.e();
        }
        int i10 = this.f32306b;
        do {
            list.add(T(a02, d10));
            if (this.f32305a.g() || this.f32308d != 0) {
                return;
            } else {
                iJ = this.f32305a.J();
            }
        } while (iJ == i10);
        this.f32308d = iJ;
    }

    @Override // com.google.protobuf.z0
    public void J(List list, A0 a02, D d10) throws O.a {
        int iJ;
        if (Q0.b(this.f32306b) != 2) {
            throw O.e();
        }
        int i10 = this.f32306b;
        do {
            list.add(U(a02, d10));
            if (this.f32305a.g() || this.f32308d != 0) {
                return;
            } else {
                iJ = this.f32305a.J();
            }
        } while (iJ == i10);
        this.f32308d = iJ;
    }

    @Override // com.google.protobuf.z0
    public Object K(Class cls, D d10) throws O.a {
        X(3);
        return T(w0.a().c(cls), d10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r7.f32305a.o(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return;
     */
    @Override // com.google.protobuf.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void L(java.util.Map r8, com.google.protobuf.Z.a r9, com.google.protobuf.D r10) throws com.google.protobuf.O.a {
        /*
            r7 = this;
            r0 = 2
            r7.X(r0)
            com.google.protobuf.k r1 = r7.f32305a
            int r1 = r1.K()
            com.google.protobuf.k r2 = r7.f32305a
            int r1 = r2.p(r1)
            java.lang.Object r2 = r9.f32212b
            java.lang.Object r3 = r9.f32214d
        L14:
            int r4 = r7.z()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            com.google.protobuf.k r5 = r7.f32305a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.g()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.C()     // Catch: java.lang.Throwable -> L3a com.google.protobuf.O.a -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            com.google.protobuf.O r4 = new com.google.protobuf.O     // Catch: java.lang.Throwable -> L3a com.google.protobuf.O.a -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.O.a -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a com.google.protobuf.O.a -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            com.google.protobuf.Q0$b r4 = r9.f32213c     // Catch: java.lang.Throwable -> L3a com.google.protobuf.O.a -> L51
            java.lang.Object r5 = r9.f32214d     // Catch: java.lang.Throwable -> L3a com.google.protobuf.O.a -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a com.google.protobuf.O.a -> L51
            java.lang.Object r3 = r7.S(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.O.a -> L51
            goto L14
        L49:
            com.google.protobuf.Q0$b r4 = r9.f32211a     // Catch: java.lang.Throwable -> L3a com.google.protobuf.O.a -> L51
            r5 = 0
            java.lang.Object r2 = r7.S(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.O.a -> L51
            goto L14
        L51:
            boolean r4 = r7.C()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            com.google.protobuf.O r8 = new com.google.protobuf.O     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            com.google.protobuf.k r7 = r7.f32305a
            r7.o(r1)
            return
        L67:
            com.google.protobuf.k r7 = r7.f32305a
            r7.o(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C3726l.L(java.util.Map, com.google.protobuf.Z$a, com.google.protobuf.D):void");
    }

    @Override // com.google.protobuf.z0
    public Object M(Class cls, D d10) throws O.a {
        X(2);
        return U(w0.a().c(cls), d10);
    }

    @Override // com.google.protobuf.z0
    public void N(Object obj, A0 a02, D d10) throws O.a {
        X(3);
        Q(obj, a02, d10);
    }

    @Override // com.google.protobuf.z0
    public void O(Object obj, A0 a02, D d10) throws O {
        X(2);
        R(obj, a02, d10);
    }

    public final void Q(Object obj, A0 a02, D d10) {
        int i10 = this.f32307c;
        this.f32307c = Q0.c(Q0.a(this.f32306b), 4);
        try {
            a02.h(obj, this, d10);
            if (this.f32306b == this.f32307c) {
            } else {
                throw O.h();
            }
        } finally {
            this.f32307c = i10;
        }
    }

    public final void R(Object obj, A0 a02, D d10) throws O {
        int iK = this.f32305a.K();
        AbstractC3724k abstractC3724k = this.f32305a;
        if (abstractC3724k.f32269a >= abstractC3724k.f32270b) {
            throw O.i();
        }
        int iP = abstractC3724k.p(iK);
        this.f32305a.f32269a++;
        a02.h(obj, this, d10);
        this.f32305a.a(0);
        r4.f32269a--;
        this.f32305a.o(iP);
    }

    public final Object S(Q0.b bVar, Class cls, D d10) {
        switch (a.f32309a[bVar.ordinal()]) {
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
                return M(cls, d10);
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

    public final Object T(A0 a02, D d10) {
        Object objNewInstance = a02.newInstance();
        Q(objNewInstance, a02, d10);
        a02.b(objNewInstance);
        return objNewInstance;
    }

    public final Object U(A0 a02, D d10) throws O {
        Object objNewInstance = a02.newInstance();
        R(objNewInstance, a02, d10);
        a02.b(objNewInstance);
        return objNewInstance;
    }

    public void V(List list, boolean z10) throws O.a {
        int iJ;
        int iJ2;
        if (Q0.b(this.f32306b) != 2) {
            throw O.e();
        }
        if (!(list instanceof V) || z10) {
            do {
                list.add(z10 ? H() : y());
                if (this.f32305a.g()) {
                    return;
                } else {
                    iJ = this.f32305a.J();
                }
            } while (iJ == this.f32306b);
            this.f32308d = iJ;
            return;
        }
        V v10 = (V) list;
        do {
            v10.F(n());
            if (this.f32305a.g()) {
                return;
            } else {
                iJ2 = this.f32305a.J();
            }
        } while (iJ2 == this.f32306b);
        this.f32308d = iJ2;
    }

    public final void W(int i10) throws O {
        if (this.f32305a.f() != i10) {
            throw O.m();
        }
    }

    public final void X(int i10) throws O.a {
        if (Q0.b(this.f32306b) != i10) {
            throw O.e();
        }
    }

    public final void Y(int i10) throws O {
        if ((i10 & 3) != 0) {
            throw O.h();
        }
    }

    public final void Z(int i10) throws O {
        if ((i10 & 7) != 0) {
            throw O.h();
        }
    }

    @Override // com.google.protobuf.z0
    public long a() throws O.a {
        X(1);
        return this.f32305a.v();
    }

    @Override // com.google.protobuf.z0
    public void b(List list) throws O {
        int iJ;
        int iJ2;
        if (!(list instanceof M)) {
            int iB = Q0.b(this.f32306b);
            if (iB == 2) {
                int iK = this.f32305a.K();
                Y(iK);
                int iF = this.f32305a.f() + iK;
                do {
                    list.add(Integer.valueOf(this.f32305a.D()));
                } while (this.f32305a.f() < iF);
                return;
            }
            if (iB != 5) {
                throw O.e();
            }
            do {
                list.add(Integer.valueOf(this.f32305a.D()));
                if (this.f32305a.g()) {
                    return;
                } else {
                    iJ = this.f32305a.J();
                }
            } while (iJ == this.f32306b);
            this.f32308d = iJ;
            return;
        }
        M m10 = (M) list;
        int iB2 = Q0.b(this.f32306b);
        if (iB2 == 2) {
            int iK2 = this.f32305a.K();
            Y(iK2);
            int iF2 = this.f32305a.f() + iK2;
            do {
                m10.x0(this.f32305a.D());
            } while (this.f32305a.f() < iF2);
            return;
        }
        if (iB2 != 5) {
            throw O.e();
        }
        do {
            m10.x0(this.f32305a.D());
            if (this.f32305a.g()) {
                return;
            } else {
                iJ2 = this.f32305a.J();
            }
        } while (iJ2 == this.f32306b);
        this.f32308d = iJ2;
    }

    @Override // com.google.protobuf.z0
    public void c(List list) throws O {
        int iJ;
        int iJ2;
        if (!(list instanceof X)) {
            int iB = Q0.b(this.f32306b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f32305a.G()));
                    if (this.f32305a.g()) {
                        return;
                    } else {
                        iJ = this.f32305a.J();
                    }
                } while (iJ == this.f32306b);
                this.f32308d = iJ;
                return;
            }
            if (iB != 2) {
                throw O.e();
            }
            int iF = this.f32305a.f() + this.f32305a.K();
            do {
                list.add(Long.valueOf(this.f32305a.G()));
            } while (this.f32305a.f() < iF);
            W(iF);
            return;
        }
        X x10 = (X) list;
        int iB2 = Q0.b(this.f32306b);
        if (iB2 == 0) {
            do {
                x10.C0(this.f32305a.G());
                if (this.f32305a.g()) {
                    return;
                } else {
                    iJ2 = this.f32305a.J();
                }
            } while (iJ2 == this.f32306b);
            this.f32308d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw O.e();
        }
        int iF2 = this.f32305a.f() + this.f32305a.K();
        do {
            x10.C0(this.f32305a.G());
        } while (this.f32305a.f() < iF2);
        W(iF2);
    }

    @Override // com.google.protobuf.z0
    public boolean d() throws O.a {
        X(0);
        return this.f32305a.q();
    }

    @Override // com.google.protobuf.z0
    public long e() throws O.a {
        X(1);
        return this.f32305a.E();
    }

    @Override // com.google.protobuf.z0
    public void f(List list) throws O {
        int iJ;
        int iJ2;
        if (!(list instanceof X)) {
            int iB = Q0.b(this.f32306b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f32305a.L()));
                    if (this.f32305a.g()) {
                        return;
                    } else {
                        iJ = this.f32305a.J();
                    }
                } while (iJ == this.f32306b);
                this.f32308d = iJ;
                return;
            }
            if (iB != 2) {
                throw O.e();
            }
            int iF = this.f32305a.f() + this.f32305a.K();
            do {
                list.add(Long.valueOf(this.f32305a.L()));
            } while (this.f32305a.f() < iF);
            W(iF);
            return;
        }
        X x10 = (X) list;
        int iB2 = Q0.b(this.f32306b);
        if (iB2 == 0) {
            do {
                x10.C0(this.f32305a.L());
                if (this.f32305a.g()) {
                    return;
                } else {
                    iJ2 = this.f32305a.J();
                }
            } while (iJ2 == this.f32306b);
            this.f32308d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw O.e();
        }
        int iF2 = this.f32305a.f() + this.f32305a.K();
        do {
            x10.C0(this.f32305a.L());
        } while (this.f32305a.f() < iF2);
        W(iF2);
    }

    @Override // com.google.protobuf.z0
    public int g() throws O.a {
        X(0);
        return this.f32305a.K();
    }

    @Override // com.google.protobuf.z0
    public int getTag() {
        return this.f32306b;
    }

    @Override // com.google.protobuf.z0
    public void h(List list) throws O {
        int iJ;
        int iJ2;
        if (!(list instanceof X)) {
            int iB = Q0.b(this.f32306b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f32305a.z()));
                    if (this.f32305a.g()) {
                        return;
                    } else {
                        iJ = this.f32305a.J();
                    }
                } while (iJ == this.f32306b);
                this.f32308d = iJ;
                return;
            }
            if (iB != 2) {
                throw O.e();
            }
            int iF = this.f32305a.f() + this.f32305a.K();
            do {
                list.add(Long.valueOf(this.f32305a.z()));
            } while (this.f32305a.f() < iF);
            W(iF);
            return;
        }
        X x10 = (X) list;
        int iB2 = Q0.b(this.f32306b);
        if (iB2 == 0) {
            do {
                x10.C0(this.f32305a.z());
                if (this.f32305a.g()) {
                    return;
                } else {
                    iJ2 = this.f32305a.J();
                }
            } while (iJ2 == this.f32306b);
            this.f32308d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw O.e();
        }
        int iF2 = this.f32305a.f() + this.f32305a.K();
        do {
            x10.C0(this.f32305a.z());
        } while (this.f32305a.f() < iF2);
        W(iF2);
    }

    @Override // com.google.protobuf.z0
    public void i(List list) throws O {
        int iJ;
        int iJ2;
        if (!(list instanceof M)) {
            int iB = Q0.b(this.f32306b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f32305a.t()));
                    if (this.f32305a.g()) {
                        return;
                    } else {
                        iJ = this.f32305a.J();
                    }
                } while (iJ == this.f32306b);
                this.f32308d = iJ;
                return;
            }
            if (iB != 2) {
                throw O.e();
            }
            int iF = this.f32305a.f() + this.f32305a.K();
            do {
                list.add(Integer.valueOf(this.f32305a.t()));
            } while (this.f32305a.f() < iF);
            W(iF);
            return;
        }
        M m10 = (M) list;
        int iB2 = Q0.b(this.f32306b);
        if (iB2 == 0) {
            do {
                m10.x0(this.f32305a.t());
                if (this.f32305a.g()) {
                    return;
                } else {
                    iJ2 = this.f32305a.J();
                }
            } while (iJ2 == this.f32306b);
            this.f32308d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw O.e();
        }
        int iF2 = this.f32305a.f() + this.f32305a.K();
        do {
            m10.x0(this.f32305a.t());
        } while (this.f32305a.f() < iF2);
        W(iF2);
    }

    @Override // com.google.protobuf.z0
    public int j() throws O.a {
        X(0);
        return this.f32305a.t();
    }

    @Override // com.google.protobuf.z0
    public int k() throws O.a {
        X(0);
        return this.f32305a.F();
    }

    @Override // com.google.protobuf.z0
    public void l(List list) throws O {
        int iJ;
        int iJ2;
        if (!(list instanceof C3718h)) {
            int iB = Q0.b(this.f32306b);
            if (iB == 0) {
                do {
                    list.add(Boolean.valueOf(this.f32305a.q()));
                    if (this.f32305a.g()) {
                        return;
                    } else {
                        iJ = this.f32305a.J();
                    }
                } while (iJ == this.f32306b);
                this.f32308d = iJ;
                return;
            }
            if (iB != 2) {
                throw O.e();
            }
            int iF = this.f32305a.f() + this.f32305a.K();
            do {
                list.add(Boolean.valueOf(this.f32305a.q()));
            } while (this.f32305a.f() < iF);
            W(iF);
            return;
        }
        C3718h c3718h = (C3718h) list;
        int iB2 = Q0.b(this.f32306b);
        if (iB2 == 0) {
            do {
                c3718h.h(this.f32305a.q());
                if (this.f32305a.g()) {
                    return;
                } else {
                    iJ2 = this.f32305a.J();
                }
            } while (iJ2 == this.f32306b);
            this.f32308d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw O.e();
        }
        int iF2 = this.f32305a.f() + this.f32305a.K();
        do {
            c3718h.h(this.f32305a.q());
        } while (this.f32305a.f() < iF2);
        W(iF2);
    }

    @Override // com.google.protobuf.z0
    public void m(List list) throws O.a {
        V(list, true);
    }

    @Override // com.google.protobuf.z0
    public AbstractC3722j n() throws O.a {
        X(2);
        return this.f32305a.r();
    }

    @Override // com.google.protobuf.z0
    public int o() throws O.a {
        X(0);
        return this.f32305a.y();
    }

    @Override // com.google.protobuf.z0
    public void p(List list) throws O {
        int iJ;
        int iJ2;
        if (!(list instanceof X)) {
            int iB = Q0.b(this.f32306b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f32305a.v()));
                    if (this.f32305a.g()) {
                        return;
                    } else {
                        iJ = this.f32305a.J();
                    }
                } while (iJ == this.f32306b);
                this.f32308d = iJ;
                return;
            }
            if (iB != 2) {
                throw O.e();
            }
            int iK = this.f32305a.K();
            Z(iK);
            int iF = this.f32305a.f() + iK;
            do {
                list.add(Long.valueOf(this.f32305a.v()));
            } while (this.f32305a.f() < iF);
            return;
        }
        X x10 = (X) list;
        int iB2 = Q0.b(this.f32306b);
        if (iB2 == 1) {
            do {
                x10.C0(this.f32305a.v());
                if (this.f32305a.g()) {
                    return;
                } else {
                    iJ2 = this.f32305a.J();
                }
            } while (iJ2 == this.f32306b);
            this.f32308d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw O.e();
        }
        int iK2 = this.f32305a.K();
        Z(iK2);
        int iF2 = this.f32305a.f() + iK2;
        do {
            x10.C0(this.f32305a.v());
        } while (this.f32305a.f() < iF2);
    }

    @Override // com.google.protobuf.z0
    public void q(List list) throws O {
        int iJ;
        int iJ2;
        if (!(list instanceof M)) {
            int iB = Q0.b(this.f32306b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f32305a.F()));
                    if (this.f32305a.g()) {
                        return;
                    } else {
                        iJ = this.f32305a.J();
                    }
                } while (iJ == this.f32306b);
                this.f32308d = iJ;
                return;
            }
            if (iB != 2) {
                throw O.e();
            }
            int iF = this.f32305a.f() + this.f32305a.K();
            do {
                list.add(Integer.valueOf(this.f32305a.F()));
            } while (this.f32305a.f() < iF);
            W(iF);
            return;
        }
        M m10 = (M) list;
        int iB2 = Q0.b(this.f32306b);
        if (iB2 == 0) {
            do {
                m10.x0(this.f32305a.F());
                if (this.f32305a.g()) {
                    return;
                } else {
                    iJ2 = this.f32305a.J();
                }
            } while (iJ2 == this.f32306b);
            this.f32308d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw O.e();
        }
        int iF2 = this.f32305a.f() + this.f32305a.K();
        do {
            m10.x0(this.f32305a.F());
        } while (this.f32305a.f() < iF2);
        W(iF2);
    }

    @Override // com.google.protobuf.z0
    public long r() throws O.a {
        X(0);
        return this.f32305a.L();
    }

    @Override // com.google.protobuf.z0
    public double readDouble() throws O.a {
        X(1);
        return this.f32305a.s();
    }

    @Override // com.google.protobuf.z0
    public float readFloat() throws O.a {
        X(5);
        return this.f32305a.w();
    }

    @Override // com.google.protobuf.z0
    public void s(List list) throws O {
        int iJ;
        int iJ2;
        if (!(list instanceof M)) {
            int iB = Q0.b(this.f32306b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f32305a.K()));
                    if (this.f32305a.g()) {
                        return;
                    } else {
                        iJ = this.f32305a.J();
                    }
                } while (iJ == this.f32306b);
                this.f32308d = iJ;
                return;
            }
            if (iB != 2) {
                throw O.e();
            }
            int iF = this.f32305a.f() + this.f32305a.K();
            do {
                list.add(Integer.valueOf(this.f32305a.K()));
            } while (this.f32305a.f() < iF);
            W(iF);
            return;
        }
        M m10 = (M) list;
        int iB2 = Q0.b(this.f32306b);
        if (iB2 == 0) {
            do {
                m10.x0(this.f32305a.K());
                if (this.f32305a.g()) {
                    return;
                } else {
                    iJ2 = this.f32305a.J();
                }
            } while (iJ2 == this.f32306b);
            this.f32308d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw O.e();
        }
        int iF2 = this.f32305a.f() + this.f32305a.K();
        do {
            m10.x0(this.f32305a.K());
        } while (this.f32305a.f() < iF2);
        W(iF2);
    }

    @Override // com.google.protobuf.z0
    public int t() throws O.a {
        X(5);
        return this.f32305a.u();
    }

    @Override // com.google.protobuf.z0
    public void u(List list) throws O {
        int iJ;
        int iJ2;
        if (!(list instanceof X)) {
            int iB = Q0.b(this.f32306b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f32305a.E()));
                    if (this.f32305a.g()) {
                        return;
                    } else {
                        iJ = this.f32305a.J();
                    }
                } while (iJ == this.f32306b);
                this.f32308d = iJ;
                return;
            }
            if (iB != 2) {
                throw O.e();
            }
            int iK = this.f32305a.K();
            Z(iK);
            int iF = this.f32305a.f() + iK;
            do {
                list.add(Long.valueOf(this.f32305a.E()));
            } while (this.f32305a.f() < iF);
            return;
        }
        X x10 = (X) list;
        int iB2 = Q0.b(this.f32306b);
        if (iB2 == 1) {
            do {
                x10.C0(this.f32305a.E());
                if (this.f32305a.g()) {
                    return;
                } else {
                    iJ2 = this.f32305a.J();
                }
            } while (iJ2 == this.f32306b);
            this.f32308d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw O.e();
        }
        int iK2 = this.f32305a.K();
        Z(iK2);
        int iF2 = this.f32305a.f() + iK2;
        do {
            x10.C0(this.f32305a.E());
        } while (this.f32305a.f() < iF2);
    }

    @Override // com.google.protobuf.z0
    public void v(List list) throws O {
        int iJ;
        int iJ2;
        if (!(list instanceof M)) {
            int iB = Q0.b(this.f32306b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f32305a.y()));
                    if (this.f32305a.g()) {
                        return;
                    } else {
                        iJ = this.f32305a.J();
                    }
                } while (iJ == this.f32306b);
                this.f32308d = iJ;
                return;
            }
            if (iB != 2) {
                throw O.e();
            }
            int iF = this.f32305a.f() + this.f32305a.K();
            do {
                list.add(Integer.valueOf(this.f32305a.y()));
            } while (this.f32305a.f() < iF);
            W(iF);
            return;
        }
        M m10 = (M) list;
        int iB2 = Q0.b(this.f32306b);
        if (iB2 == 0) {
            do {
                m10.x0(this.f32305a.y());
                if (this.f32305a.g()) {
                    return;
                } else {
                    iJ2 = this.f32305a.J();
                }
            } while (iJ2 == this.f32306b);
            this.f32308d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw O.e();
        }
        int iF2 = this.f32305a.f() + this.f32305a.K();
        do {
            m10.x0(this.f32305a.y());
        } while (this.f32305a.f() < iF2);
        W(iF2);
    }

    @Override // com.google.protobuf.z0
    public void w(List list) throws O {
        int iJ;
        int iJ2;
        if (!(list instanceof M)) {
            int iB = Q0.b(this.f32306b);
            if (iB == 2) {
                int iK = this.f32305a.K();
                Y(iK);
                int iF = this.f32305a.f() + iK;
                do {
                    list.add(Integer.valueOf(this.f32305a.u()));
                } while (this.f32305a.f() < iF);
                return;
            }
            if (iB != 5) {
                throw O.e();
            }
            do {
                list.add(Integer.valueOf(this.f32305a.u()));
                if (this.f32305a.g()) {
                    return;
                } else {
                    iJ = this.f32305a.J();
                }
            } while (iJ == this.f32306b);
            this.f32308d = iJ;
            return;
        }
        M m10 = (M) list;
        int iB2 = Q0.b(this.f32306b);
        if (iB2 == 2) {
            int iK2 = this.f32305a.K();
            Y(iK2);
            int iF2 = this.f32305a.f() + iK2;
            do {
                m10.x0(this.f32305a.u());
            } while (this.f32305a.f() < iF2);
            return;
        }
        if (iB2 != 5) {
            throw O.e();
        }
        do {
            m10.x0(this.f32305a.u());
            if (this.f32305a.g()) {
                return;
            } else {
                iJ2 = this.f32305a.J();
            }
        } while (iJ2 == this.f32306b);
        this.f32308d = iJ2;
    }

    @Override // com.google.protobuf.z0
    public long x() throws O.a {
        X(0);
        return this.f32305a.G();
    }

    @Override // com.google.protobuf.z0
    public String y() throws O.a {
        X(2);
        return this.f32305a.H();
    }

    @Override // com.google.protobuf.z0
    public int z() {
        int i10 = this.f32308d;
        if (i10 != 0) {
            this.f32306b = i10;
            this.f32308d = 0;
        } else {
            this.f32306b = this.f32305a.J();
        }
        int i11 = this.f32306b;
        if (i11 == 0 || i11 == this.f32307c) {
            return Integer.MAX_VALUE;
        }
        return Q0.a(i11);
    }
}
