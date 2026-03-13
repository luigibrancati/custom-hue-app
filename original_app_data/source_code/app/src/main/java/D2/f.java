package D2;

import D1.w;
import G1.C;
import i2.AbstractC4338s;
import i2.InterfaceC4337q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f2175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f2177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f2178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2181i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f2182j = new int[255];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C f2183k = new C(255);

    public boolean a(InterfaceC4337q interfaceC4337q, boolean z10) throws w {
        b();
        this.f2183k.W(27);
        if (!AbstractC4338s.c(interfaceC4337q, this.f2183k.f(), 0, 27, z10) || this.f2183k.N() != 1332176723) {
            return false;
        }
        int iL = this.f2183k.L();
        this.f2173a = iL;
        if (iL != 0) {
            if (z10) {
                return false;
            }
            throw w.e("unsupported bit stream revision");
        }
        this.f2174b = this.f2183k.L();
        this.f2175c = this.f2183k.z();
        this.f2176d = this.f2183k.B();
        this.f2177e = this.f2183k.B();
        this.f2178f = this.f2183k.B();
        int iL2 = this.f2183k.L();
        this.f2179g = iL2;
        this.f2180h = iL2 + 27;
        this.f2183k.W(iL2);
        if (!AbstractC4338s.c(interfaceC4337q, this.f2183k.f(), 0, this.f2179g, z10)) {
            return false;
        }
        for (int i10 = 0; i10 < this.f2179g; i10++) {
            this.f2182j[i10] = this.f2183k.L();
            this.f2181i += this.f2182j[i10];
        }
        return true;
    }

    public void b() {
        this.f2173a = 0;
        this.f2174b = 0;
        this.f2175c = 0L;
        this.f2176d = 0L;
        this.f2177e = 0L;
        this.f2178f = 0L;
        this.f2179g = 0;
        this.f2180h = 0;
        this.f2181i = 0;
    }

    public boolean c(InterfaceC4337q interfaceC4337q) {
        return d(interfaceC4337q, -1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r10 == (-1)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r9.getPosition() >= r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r9.a(1) == (-1)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(i2.InterfaceC4337q r9, long r10) {
        /*
            r8 = this;
            long r0 = r9.getPosition()
            long r2 = r9.m()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            G1.AbstractC0853a.a(r0)
            G1.C r0 = r8.f2183k
            r3 = 4
            r0.W(r3)
        L1a:
            r4 = -1
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L2b
            long r4 = r9.getPosition()
            r6 = 4
            long r4 = r4 + r6
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 >= 0) goto L51
        L2b:
            G1.C r4 = r8.f2183k
            byte[] r4 = r4.f()
            boolean r4 = i2.AbstractC4338s.c(r9, r4, r1, r3, r2)
            if (r4 == 0) goto L51
            G1.C r0 = r8.f2183k
            r0.a0(r1)
            G1.C r0 = r8.f2183k
            long r4 = r0.N()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L4d
            r9.i()
            return r2
        L4d:
            r9.q(r2)
            goto L1a
        L51:
            if (r0 == 0) goto L5b
            long r3 = r9.getPosition()
            int r8 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r8 >= 0) goto L63
        L5b:
            int r8 = r9.a(r2)
            r3 = -1
            if (r8 == r3) goto L63
            goto L51
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.f.d(i2.q, long):boolean");
    }
}
