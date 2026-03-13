package a2;

import G1.AbstractC0853a;
import i2.InterfaceC4336p;
import i2.InterfaceC4337q;

/* JADX INFO: renamed from: a2.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2618d implements Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2.u f20737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC4336p f20738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC4337q f20739c;

    public C2618d(i2.u uVar) {
        this.f20737a = uVar;
    }

    @Override // a2.Q
    public void a(long j10, long j11) {
        ((InterfaceC4336p) AbstractC0853a.e(this.f20738b)).a(j10, j11);
    }

    @Override // a2.Q
    public void b() {
        InterfaceC4336p interfaceC4336p = this.f20738b;
        if (interfaceC4336p == null) {
            return;
        }
        InterfaceC4336p interfaceC4336pF = interfaceC4336p.f();
        if (interfaceC4336pF instanceof B2.f) {
            ((B2.f) interfaceC4336pF).l();
        }
    }

    @Override // a2.Q
    public int c(i2.I i10) {
        return ((InterfaceC4336p) AbstractC0853a.e(this.f20738b)).i((InterfaceC4337q) AbstractC0853a.e(this.f20739c), i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    @Override // a2.Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(D1.InterfaceC0749g r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, i2.r r15) throws a2.o0 {
        /*
            r7 = this;
            i2.j r1 = new i2.j
            r2 = r8
            r3 = r11
            r5 = r13
            r1.<init>(r2, r3, r5)
            r7.f20739c = r1
            i2.p r8 = r7.f20738b
            if (r8 == 0) goto Lf
            return
        Lf:
            i2.u r8 = r7.f20737a
            i2.p[] r8 = r8.d(r9, r10)
            int r10 = r8.length
            K7.v$a r10 = K7.AbstractC1081v.s(r10)
            int r11 = r8.length
            r12 = 0
            r13 = 1
            if (r11 != r13) goto L25
            r8 = r8[r12]
            r7.f20738b = r8
            goto L83
        L25:
            int r11 = r8.length
            r14 = r12
        L27:
            if (r14 >= r11) goto L7f
            r0 = r8[r14]
            boolean r2 = r0.j(r1)     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6f
            if (r2 == 0) goto L3d
            r7.f20738b = r0     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6f
            G1.AbstractC0853a.g(r13)
            r1.i()
            goto L7f
        L3a:
            r0 = move-exception
            r8 = r0
            goto L5b
        L3d:
            java.util.List r0 = r0.k()     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6f
            r10.j(r0)     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6f
            i2.p r0 = r7.f20738b
            if (r0 != 0) goto L53
            long r5 = r1.getPosition()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L51
            goto L53
        L51:
            r0 = r12
            goto L54
        L53:
            r0 = r13
        L54:
            G1.AbstractC0853a.g(r0)
            r1.i()
            goto L7c
        L5b:
            i2.p r7 = r7.f20738b
            if (r7 != 0) goto L67
            long r9 = r1.getPosition()
            int r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r7 != 0) goto L68
        L67:
            r12 = r13
        L68:
            G1.AbstractC0853a.g(r12)
            r1.i()
            throw r8
        L6f:
            i2.p r0 = r7.f20738b
            if (r0 != 0) goto L53
            long r5 = r1.getPosition()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L51
            goto L53
        L7c:
            int r14 = r14 + 1
            goto L27
        L7f:
            i2.p r11 = r7.f20738b
            if (r11 == 0) goto L89
        L83:
            i2.p r7 = r7.f20738b
            r7.c(r15)
            return
        L89:
            a2.o0 r7 = new a2.o0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            java.lang.String r12 = ", "
            J7.g r12 = J7.g.g(r12)
            K7.v r8 = K7.AbstractC1081v.w(r8)
            a2.c r13 = new a2.c
            r13.<init>()
            java.util.List r8 = K7.D.k(r8, r13)
            java.lang.String r8 = r12.d(r8)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            java.lang.Object r9 = G1.AbstractC0853a.e(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            K7.v r10 = r10.k()
            r7.<init>(r8, r9, r10)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.C2618d.d(D1.g, android.net.Uri, java.util.Map, long, long, i2.r):void");
    }

    @Override // a2.Q
    public long e() {
        InterfaceC4337q interfaceC4337q = this.f20739c;
        if (interfaceC4337q != null) {
            return interfaceC4337q.getPosition();
        }
        return -1L;
    }

    @Override // a2.Q
    public void release() {
        InterfaceC4336p interfaceC4336p = this.f20738b;
        if (interfaceC4336p != null) {
            interfaceC4336p.release();
            this.f20738b = null;
        }
        this.f20739c = null;
    }
}
