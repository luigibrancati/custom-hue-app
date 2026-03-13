package Fe;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class B implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0845g f4051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0843e f4052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public E f4053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f4056f;

    public B(InterfaceC0845g upstream) {
        AbstractC4862t.e(upstream, "upstream");
        this.f4051a = upstream;
        C0843e c0843eE = upstream.e();
        this.f4052b = c0843eE;
        E e10 = c0843eE.f4108a;
        this.f4053c = e10;
        this.f4054d = e10 != null ? e10.f4066b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r4.f4066b) goto L15;
     */
    @Override // Fe.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long V0(Fe.C0843e r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.AbstractC4862t.e(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L74
            boolean r3 = r8.f4055e
            if (r3 != 0) goto L6c
            Fe.E r3 = r8.f4053c
            if (r3 == 0) goto L2b
            Fe.e r4 = r8.f4052b
            Fe.E r4 = r4.f4108a
            if (r3 != r4) goto L23
            int r3 = r8.f4054d
            kotlin.jvm.internal.AbstractC4862t.b(r4)
            int r4 = r4.f4066b
            if (r3 != r4) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Peek source is invalid because upstream source was used"
            r8.<init>(r9)
            throw r8
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            Fe.g r0 = r8.f4051a
            long r1 = r8.f4056f
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.p(r1)
            if (r0 != 0) goto L3e
            r8 = -1
            return r8
        L3e:
            Fe.E r0 = r8.f4053c
            if (r0 != 0) goto L51
            Fe.e r0 = r8.f4052b
            Fe.E r0 = r0.f4108a
            if (r0 == 0) goto L51
            r8.f4053c = r0
            kotlin.jvm.internal.AbstractC4862t.b(r0)
            int r0 = r0.f4066b
            r8.f4054d = r0
        L51:
            Fe.e r0 = r8.f4052b
            long r0 = r0.size()
            long r2 = r8.f4056f
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            Fe.e r2 = r8.f4052b
            long r4 = r8.f4056f
            r3 = r9
            r2.m(r3, r4, r6)
            long r9 = r8.f4056f
            long r9 = r9 + r6
            r8.f4056f = r9
            return r6
        L6c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "closed"
            r8.<init>(r9)
            throw r8
        L74:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "byteCount < 0: "
            r8.append(r9)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Fe.B.V0(Fe.e, long):long");
    }

    @Override // Fe.J, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4055e = true;
    }

    @Override // Fe.J
    public K n() {
        return this.f4051a.n();
    }
}
