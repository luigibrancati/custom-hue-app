package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class V implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q f31419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f31420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f31421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC3670q f31422d;

    public V(m0 m0Var, AbstractC3670q abstractC3670q, Q q10) {
        this.f31420b = m0Var;
        this.f31421c = abstractC3670q.e(q10);
        this.f31422d = abstractC3670q;
        this.f31419a = q10;
    }

    private int j(m0 m0Var, Object obj) {
        return m0Var.i(m0Var.g(obj));
    }

    private void k(m0 m0Var, AbstractC3670q abstractC3670q, Object obj, e0 e0Var, C3669p c3669p) throws Throwable {
        m0 m0Var2;
        V v10;
        AbstractC3670q abstractC3670q2;
        e0 e0Var2;
        C3669p c3669p2;
        Object objF = m0Var.f(obj);
        C3672t c3672tD = abstractC3670q.d(obj);
        while (e0Var.z() != Integer.MAX_VALUE) {
            try {
                v10 = this;
                m0Var2 = m0Var;
                abstractC3670q2 = abstractC3670q;
                e0Var2 = e0Var;
                c3669p2 = c3669p;
            } catch (Throwable th) {
                th = th;
                m0Var2 = m0Var;
            }
            try {
                if (!v10.m(e0Var2, c3669p2, abstractC3670q2, c3672tD, m0Var2, objF)) {
                    m0Var2.o(obj, objF);
                    return;
                }
                this = v10;
                e0Var = e0Var2;
                c3669p = c3669p2;
                abstractC3670q = abstractC3670q2;
                m0Var = m0Var2;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                m0Var2.o(obj, objF);
                throw th3;
            }
        }
        m0Var.o(obj, objF);
    }

    public static V l(m0 m0Var, AbstractC3670q abstractC3670q, Q q10) {
        return new V(m0Var, abstractC3670q, q10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public void a(Object obj, Object obj2) {
        h0.H(this.f31420b, obj, obj2);
        if (this.f31421c) {
            h0.F(this.f31422d, obj, obj2);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public void b(Object obj) {
        this.f31420b.j(obj);
        this.f31422d.f(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final boolean c(Object obj) {
        return this.f31422d.c(obj).l();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public int d(Object obj) {
        int iJ = j(this.f31420b, obj);
        return this.f31421c ? iJ + this.f31422d.c(obj).g() : iJ;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public int e(Object obj) {
        int iHashCode = this.f31420b.g(obj).hashCode();
        return this.f31421c ? (iHashCode * 53) + this.f31422d.c(obj).hashCode() : iHashCode;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public boolean f(Object obj, Object obj2) {
        if (!this.f31420b.g(obj).equals(this.f31420b.g(obj2))) {
            return false;
        }
        if (this.f31421c) {
            return this.f31422d.c(obj).equals(this.f31422d.c(obj2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092 A[EDGE_INSN: B:52:0x0092->B:29:0x0092 BREAK  A[LOOP:1: B:14:0x0050->B:55:0x0050], SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(java.lang.Object r9, byte[] r10, int r11, int r12, com.google.crypto.tink.shaded.protobuf.AbstractC3658e.a r13) throws com.google.crypto.tink.shaded.protobuf.A {
        /*
            r8 = this;
            r0 = r9
            com.google.crypto.tink.shaded.protobuf.x r0 = (com.google.crypto.tink.shaded.protobuf.AbstractC3676x) r0
            com.google.crypto.tink.shaded.protobuf.n0 r1 = r0.unknownFields
            com.google.crypto.tink.shaded.protobuf.n0 r2 = com.google.crypto.tink.shaded.protobuf.n0.c()
            if (r1 != r2) goto L11
            com.google.crypto.tink.shaded.protobuf.n0 r1 = com.google.crypto.tink.shaded.protobuf.n0.k()
            r0.unknownFields = r1
        L11:
            r6 = r1
            com.google.crypto.tink.shaded.protobuf.x$c r9 = (com.google.crypto.tink.shaded.protobuf.AbstractC3676x.c) r9
            r9.O()
        L17:
            if (r11 >= r12) goto La1
            int r4 = com.google.crypto.tink.shaded.protobuf.AbstractC3658e.I(r10, r11, r13)
            int r2 = r13.f31443a
            int r9 = com.google.crypto.tink.shaded.protobuf.r0.f31559a
            r11 = 2
            if (r2 == r9) goto L4b
            int r9 = com.google.crypto.tink.shaded.protobuf.r0.b(r2)
            if (r9 != r11) goto L43
            com.google.crypto.tink.shaded.protobuf.q r9 = r8.f31422d
            com.google.crypto.tink.shaded.protobuf.p r11 = r13.f31446d
            com.google.crypto.tink.shaded.protobuf.Q r0 = r8.f31419a
            int r1 = com.google.crypto.tink.shaded.protobuf.r0.a(r2)
            java.lang.Object r9 = r9.b(r11, r0, r1)
            android.support.v4.media.session.a.a(r9)
            r3 = r10
            r5 = r12
            r7 = r13
            int r11 = com.google.crypto.tink.shaded.protobuf.AbstractC3658e.G(r2, r3, r4, r5, r6, r7)
            goto L17
        L43:
            r3 = r10
            r5 = r12
            r7 = r13
            int r11 = com.google.crypto.tink.shaded.protobuf.AbstractC3658e.P(r2, r3, r4, r5, r7)
            goto L17
        L4b:
            r3 = r10
            r5 = r12
            r7 = r13
            r9 = 0
            r10 = 0
        L50:
            if (r4 >= r5) goto L91
            int r12 = com.google.crypto.tink.shaded.protobuf.AbstractC3658e.I(r3, r4, r7)
            int r13 = r7.f31443a
            int r0 = com.google.crypto.tink.shaded.protobuf.r0.a(r13)
            int r1 = com.google.crypto.tink.shaded.protobuf.r0.b(r13)
            if (r0 == r11) goto L71
            r2 = 3
            if (r0 == r2) goto L66
            goto L87
        L66:
            if (r1 != r11) goto L87
            int r4 = com.google.crypto.tink.shaded.protobuf.AbstractC3658e.c(r3, r12, r7)
            java.lang.Object r10 = r7.f31445c
            com.google.crypto.tink.shaded.protobuf.h r10 = (com.google.crypto.tink.shaded.protobuf.AbstractC3661h) r10
            goto L50
        L71:
            if (r1 != 0) goto L87
            int r4 = com.google.crypto.tink.shaded.protobuf.AbstractC3658e.I(r3, r12, r7)
            int r9 = r7.f31443a
            com.google.crypto.tink.shaded.protobuf.q r12 = r8.f31422d
            com.google.crypto.tink.shaded.protobuf.p r13 = r7.f31446d
            com.google.crypto.tink.shaded.protobuf.Q r0 = r8.f31419a
            java.lang.Object r12 = r12.b(r13, r0, r9)
            android.support.v4.media.session.a.a(r12)
            goto L50
        L87:
            int r0 = com.google.crypto.tink.shaded.protobuf.r0.f31560b
            if (r13 != r0) goto L8c
            goto L92
        L8c:
            int r4 = com.google.crypto.tink.shaded.protobuf.AbstractC3658e.P(r13, r3, r12, r5, r7)
            goto L50
        L91:
            r12 = r4
        L92:
            if (r10 == 0) goto L9b
            int r9 = com.google.crypto.tink.shaded.protobuf.r0.c(r9, r11)
            r6.n(r9, r10)
        L9b:
            r11 = r12
            r10 = r3
            r12 = r5
            r13 = r7
            goto L17
        La1:
            r5 = r12
            if (r11 != r5) goto La5
            return
        La5:
            com.google.crypto.tink.shaded.protobuf.A r8 = com.google.crypto.tink.shaded.protobuf.A.h()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.V.g(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$a):void");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public void h(Object obj, e0 e0Var, C3669p c3669p) throws Throwable {
        k(this.f31420b, this.f31422d, obj, e0Var, c3669p);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public void i(Object obj, s0 s0Var) {
        Iterator itO = this.f31422d.c(obj).o();
        if (itO.hasNext()) {
            android.support.v4.media.session.a.a(((Map.Entry) itO.next()).getKey());
            throw null;
        }
        n(this.f31420b, obj, s0Var);
    }

    public final boolean m(e0 e0Var, C3669p c3669p, AbstractC3670q abstractC3670q, C3672t c3672t, m0 m0Var, Object obj) throws A {
        int tag = e0Var.getTag();
        int iG = 0;
        if (tag != r0.f31559a) {
            if (r0.b(tag) != 2) {
                return e0Var.C();
            }
            Object objB = abstractC3670q.b(c3669p, this.f31419a, r0.a(tag));
            if (objB == null) {
                return m0Var.m(obj, e0Var, 0);
            }
            abstractC3670q.h(e0Var, objB, c3669p, c3672t);
            return true;
        }
        Object objB2 = null;
        AbstractC3661h abstractC3661hN = null;
        while (e0Var.z() != Integer.MAX_VALUE) {
            int tag2 = e0Var.getTag();
            if (tag2 != r0.f31561c) {
                if (tag2 != r0.f31562d) {
                    if (tag2 == r0.f31560b || !e0Var.C()) {
                        break;
                    }
                } else if (objB2 != null) {
                    abstractC3670q.h(e0Var, objB2, c3669p, c3672t);
                } else {
                    abstractC3661hN = e0Var.n();
                }
            } else {
                iG = e0Var.g();
                objB2 = abstractC3670q.b(c3669p, this.f31419a, iG);
            }
        }
        if (e0Var.getTag() != r0.f31560b) {
            throw A.b();
        }
        if (abstractC3661hN != null) {
            if (objB2 != null) {
                abstractC3670q.i(abstractC3661hN, objB2, c3669p, c3672t);
            } else {
                m0Var.d(obj, iG, abstractC3661hN);
            }
        }
        return true;
    }

    public final void n(m0 m0Var, Object obj, s0 s0Var) {
        m0Var.s(m0Var.g(obj), s0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public Object newInstance() {
        Q q10 = this.f31419a;
        return q10 instanceof AbstractC3676x ? ((AbstractC3676x) q10).E() : q10.newBuilderForType().buildPartial();
    }
}
