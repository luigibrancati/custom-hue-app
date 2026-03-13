package S1;

import D1.o;
import G1.AbstractC0853a;
import G1.I;
import K1.AbstractC1001i;
import K1.C0;
import K1.C1030x;
import K1.f1;
import S1.b;
import android.graphics.Bitmap;
import io.sentry.TransactionOptions;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class f extends AbstractC1001i {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f15234A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f15235B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public o f15236C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public S1.b f15237D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public J1.f f15238E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public d f15239F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Bitmap f15240G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f15241H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public b f15242I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public b f15243J;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f15244P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f15245Q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b.a f15246s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final J1.f f15247t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayDeque f15248u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f15249v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f15250w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a f15251x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f15252y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f15253z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f15254c = new a(-9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f15255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f15256b;

        public a(long j10, long j11) {
            this.f15255a = j10;
            this.f15256b = j11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f15257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f15258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Bitmap f15259c;

        public b(int i10, long j10) {
            this.f15257a = i10;
            this.f15258b = j10;
        }

        public long a() {
            return this.f15258b;
        }

        public Bitmap b() {
            return this.f15259c;
        }

        public int c() {
            return this.f15257a;
        }

        public boolean d() {
            return this.f15259c != null;
        }

        public void e(Bitmap bitmap) {
            this.f15259c = bitmap;
        }
    }

    public f(b.a aVar, d dVar) {
        super(4);
        this.f15246s = aVar;
        this.f15239F = v0(dVar);
        this.f15247t = J1.f.G();
        this.f15251x = a.f15254c;
        this.f15248u = new ArrayDeque();
        this.f15253z = -9223372036854775807L;
        this.f15252y = -9223372036854775807L;
        this.f15234A = 0;
        this.f15235B = 1;
    }

    private void B0(long j10) {
        this.f15252y = j10;
        while (!this.f15248u.isEmpty() && j10 >= ((a) this.f15248u.peek()).f15255a) {
            this.f15251x = (a) this.f15248u.removeFirst();
        }
    }

    public static d v0(d dVar) {
        return dVar == null ? d.f15232a : dVar;
    }

    public boolean A0() {
        return true;
    }

    public boolean C0(long j10, long j11, Bitmap bitmap, long j12) {
        long j13 = j12 - j10;
        if (!F0() && j13 >= TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION) {
            return false;
        }
        this.f15239F.b(j12 - this.f15251x.f15256b, bitmap);
        return true;
    }

    public final void D0() {
        this.f15238E = null;
        this.f15234A = 0;
        this.f15253z = -9223372036854775807L;
        S1.b bVar = this.f15237D;
        if (bVar != null) {
            bVar.release();
            this.f15237D = null;
        }
    }

    public final void E0(d dVar) {
        this.f15239F = v0(dVar);
    }

    public final boolean F0() {
        boolean z10 = getState() == 2;
        int i10 = this.f15235B;
        if (i10 == 0) {
            return z10;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 3) {
            return false;
        }
        throw new IllegalStateException();
    }

    @Override // K1.f1
    public int a(o oVar) {
        return this.f15246s.a(oVar);
    }

    @Override // K1.e1
    public boolean b() {
        return this.f15250w;
    }

    @Override // K1.AbstractC1001i
    public void d0() {
        this.f15236C = null;
        this.f15251x = a.f15254c;
        this.f15248u.clear();
        D0();
        this.f15239F.a();
    }

    @Override // K1.AbstractC1001i
    public void e0(boolean z10, boolean z11) {
        this.f15235B = z11 ? 1 : 0;
    }

    @Override // K1.e1
    public void g(long j10, long j11) throws C1030x {
        if (this.f15250w) {
            return;
        }
        if (this.f15236C == null) {
            C0 c0V = V();
            this.f15247t.s();
            int iO0 = o0(c0V, this.f15247t, 2);
            if (iO0 != -5) {
                if (iO0 == -4) {
                    AbstractC0853a.g(this.f15247t.w());
                    this.f15249v = true;
                    this.f15250w = true;
                    return;
                }
                return;
            }
            this.f15236C = (o) AbstractC0853a.i(c0V.f6835b);
            this.f15245Q = true;
        }
        if (this.f15237D != null || z0()) {
            try {
                I.a("drainAndFeedDecoder");
                while (t0(j10, j11)) {
                }
                while (u0(j10)) {
                }
                I.b();
            } catch (c e10) {
                throw R(e10, null, 4003);
            }
        }
    }

    @Override // K1.AbstractC1001i
    public void g0(long j10, boolean z10) {
        x0(1);
        this.f15250w = false;
        this.f15249v = false;
        this.f15240G = null;
        this.f15242I = null;
        this.f15243J = null;
        this.f15241H = false;
        this.f15238E = null;
        S1.b bVar = this.f15237D;
        if (bVar != null) {
            bVar.flush();
        }
        this.f15248u.clear();
    }

    @Override // K1.e1, K1.f1
    public String getName() {
        return "ImageRenderer";
    }

    @Override // K1.AbstractC1001i
    public void h0() {
        D0();
    }

    @Override // K1.e1
    public boolean isReady() {
        int i10 = this.f15235B;
        if (i10 != 3) {
            return i10 == 0 && this.f15241H;
        }
        return true;
    }

    @Override // K1.AbstractC1001i
    public void j0() {
        D0();
        x0(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r2 >= r5) goto L15;
     */
    @Override // K1.AbstractC1001i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m0(D1.o[] r5, long r6, long r8, a2.InterfaceC2611D.b r10) {
        /*
            r4 = this;
            super.m0(r5, r6, r8, r10)
            S1.f$a r5 = r4.f15251x
            long r5 = r5.f15256b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L36
            java.util.ArrayDeque r5 = r4.f15248u
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L29
            long r5 = r4.f15253z
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 == 0) goto L36
            long r2 = r4.f15252y
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L29
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 < 0) goto L29
            goto L36
        L29:
            java.util.ArrayDeque r5 = r4.f15248u
            S1.f$a r6 = new S1.f$a
            long r0 = r4.f15253z
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L36:
            S1.f$a r5 = new S1.f$a
            r5.<init>(r0, r8)
            r4.f15251x = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.f.m0(D1.o[], long, long, a2.D$b):void");
    }

    public final boolean r0(o oVar) {
        int iA = this.f15246s.a(oVar);
        return iA == f1.u(4) || iA == f1.u(3);
    }

    public final Bitmap s0(int i10) {
        AbstractC0853a.i(this.f15240G);
        int width = this.f15240G.getWidth() / ((o) AbstractC0853a.i(this.f15236C)).f1787N;
        int height = this.f15240G.getHeight() / ((o) AbstractC0853a.i(this.f15236C)).f1788O;
        int i11 = this.f15236C.f1787N;
        return Bitmap.createBitmap(this.f15240G, (i10 % i11) * width, (i10 / i11) * height, width, height);
    }

    public final boolean t0(long j10, long j11) throws C1030x {
        if (this.f15240G != null && this.f15242I == null) {
            return false;
        }
        if (this.f15235B == 0 && getState() != 2) {
            return false;
        }
        if (this.f15240G == null) {
            AbstractC0853a.i(this.f15237D);
            e eVarA = this.f15237D.a();
            if (eVarA == null) {
                return false;
            }
            if (((e) AbstractC0853a.i(eVarA)).w()) {
                if (this.f15234A == 3) {
                    D0();
                    AbstractC0853a.i(this.f15236C);
                    z0();
                } else {
                    ((e) AbstractC0853a.i(eVarA)).C();
                    if (this.f15248u.isEmpty()) {
                        this.f15250w = true;
                    }
                }
                return false;
            }
            AbstractC0853a.j(eVarA.f15233e, "Non-EOS buffer came back from the decoder without bitmap.");
            this.f15240G = eVarA.f15233e;
            ((e) AbstractC0853a.i(eVarA)).C();
        }
        if (!this.f15241H || this.f15240G == null || this.f15242I == null) {
            return false;
        }
        AbstractC0853a.i(this.f15236C);
        o oVar = this.f15236C;
        int i10 = oVar.f1787N;
        boolean z10 = ((i10 == 1 && oVar.f1788O == 1) || i10 == -1 || oVar.f1788O == -1) ? false : true;
        if (!this.f15242I.d()) {
            b bVar = this.f15242I;
            bVar.e(z10 ? s0(bVar.c()) : (Bitmap) AbstractC0853a.i(this.f15240G));
        }
        if (!C0(j10, j11, (Bitmap) AbstractC0853a.i(this.f15242I.b()), this.f15242I.a())) {
            return false;
        }
        B0(((b) AbstractC0853a.i(this.f15242I)).a());
        this.f15235B = 3;
        if (!z10 || ((b) AbstractC0853a.i(this.f15242I)).c() == (((o) AbstractC0853a.i(this.f15236C)).f1788O * ((o) AbstractC0853a.i(this.f15236C)).f1787N) - 1) {
            this.f15240G = null;
        }
        this.f15242I = this.f15243J;
        this.f15243J = null;
        return true;
    }

    public final boolean u0(long j10) {
        if (this.f15241H && this.f15242I != null) {
            return false;
        }
        C0 c0V = V();
        S1.b bVar = this.f15237D;
        if (bVar == null || this.f15234A == 3 || this.f15249v) {
            return false;
        }
        if (this.f15238E == null) {
            J1.f fVar = (J1.f) bVar.e();
            this.f15238E = fVar;
            if (fVar == null) {
                return false;
            }
        }
        if (this.f15234A == 2) {
            AbstractC0853a.i(this.f15238E);
            this.f15238E.B(4);
            ((S1.b) AbstractC0853a.i(this.f15237D)).f(this.f15238E);
            this.f15238E = null;
            this.f15234A = 3;
            return false;
        }
        int iO0 = o0(c0V, this.f15238E, 0);
        if (iO0 == -5) {
            this.f15236C = (o) AbstractC0853a.i(c0V.f6835b);
            this.f15245Q = true;
            this.f15234A = 2;
            return true;
        }
        if (iO0 != -4) {
            if (iO0 == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        this.f15238E.E();
        ByteBuffer byteBuffer = this.f15238E.f5878d;
        boolean z10 = (byteBuffer != null && byteBuffer.remaining() > 0) || ((J1.f) AbstractC0853a.i(this.f15238E)).w();
        if (z10) {
            ((J1.f) AbstractC0853a.i(this.f15238E)).f5876b = this.f15236C;
            ((S1.b) AbstractC0853a.i(this.f15237D)).f((J1.f) AbstractC0853a.i(this.f15238E));
            this.f15244P = 0;
        }
        y0(j10, (J1.f) AbstractC0853a.i(this.f15238E));
        if (((J1.f) AbstractC0853a.i(this.f15238E)).w()) {
            this.f15249v = true;
            this.f15238E = null;
            return false;
        }
        this.f15253z = Math.max(this.f15253z, ((J1.f) AbstractC0853a.i(this.f15238E)).f5880f);
        if (z10) {
            this.f15238E = null;
        } else {
            ((J1.f) AbstractC0853a.i(this.f15238E)).s();
        }
        return !this.f15241H;
    }

    @Override // K1.AbstractC1001i, K1.c1.b
    public void w(int i10, Object obj) {
        if (i10 != 15) {
            super.w(i10, obj);
        } else {
            E0(obj instanceof d ? (d) obj : null);
        }
    }

    public final boolean w0(b bVar) {
        return ((o) AbstractC0853a.i(this.f15236C)).f1787N == -1 || this.f15236C.f1788O == -1 || bVar.c() == (((o) AbstractC0853a.i(this.f15236C)).f1788O * this.f15236C.f1787N) - 1;
    }

    public final void x0(int i10) {
        this.f15235B = Math.min(this.f15235B, i10);
    }

    public final void y0(long j10, J1.f fVar) {
        boolean z10 = true;
        if (fVar.w()) {
            this.f15241H = true;
            return;
        }
        b bVar = new b(this.f15244P, fVar.f5880f);
        this.f15243J = bVar;
        this.f15244P++;
        if (!this.f15241H) {
            long jA = bVar.a();
            boolean z11 = jA - TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION <= j10 && j10 <= TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION + jA;
            b bVar2 = this.f15242I;
            boolean z12 = bVar2 != null && bVar2.a() <= j10 && j10 < jA;
            boolean zW0 = w0((b) AbstractC0853a.i(this.f15243J));
            if (!z11 && !z12 && !zW0) {
                z10 = false;
            }
            this.f15241H = z10;
            if (z12 && !z11) {
                return;
            }
        }
        this.f15242I = this.f15243J;
        this.f15243J = null;
    }

    public final boolean z0() throws C1030x {
        if (!A0()) {
            return false;
        }
        if (!this.f15245Q) {
            return true;
        }
        if (!r0((o) AbstractC0853a.e(this.f15236C))) {
            throw R(new c("Provided decoder factory can't create decoder for format."), this.f15236C, 4005);
        }
        S1.b bVar = this.f15237D;
        if (bVar != null) {
            bVar.release();
        }
        this.f15237D = this.f15246s.b();
        this.f15245Q = false;
        return true;
    }
}
