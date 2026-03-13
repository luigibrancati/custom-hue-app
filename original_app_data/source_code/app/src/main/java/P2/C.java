package P2;

import G1.AbstractC0853a;
import P2.L;
import android.util.SparseArray;
import com.google.android.libraries.barhopper.RecognitionOptions;
import i2.InterfaceC4336p;
import i2.InterfaceC4337q;
import i2.J;
import io.sentry.SentryOptions;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C implements InterfaceC4336p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final i2.u f12686l = new i2.u() { // from class: P2.B
        @Override // i2.u
        public final InterfaceC4336p[] f() {
            return C.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G1.H f12687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f12688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G1.C f12689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A f12690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f12694h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public z f12695i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i2.r f12696j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f12697k;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC1853m f12698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final G1.H f12699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final G1.B f12700c = new G1.B(new byte[64]);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f12701d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f12702e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f12703f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f12704g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f12705h;

        public a(InterfaceC1853m interfaceC1853m, G1.H h10) {
            this.f12698a = interfaceC1853m;
            this.f12699b = h10;
        }

        public void a(G1.C c10) {
            c10.q(this.f12700c.f4234a, 0, 3);
            this.f12700c.p(0);
            b();
            c10.q(this.f12700c.f4234a, 0, this.f12704g);
            this.f12700c.p(0);
            c();
            this.f12698a.e(this.f12705h, 4);
            this.f12698a.a(c10);
            this.f12698a.c(false);
        }

        public final void b() {
            this.f12700c.r(8);
            this.f12701d = this.f12700c.g();
            this.f12702e = this.f12700c.g();
            this.f12700c.r(6);
            this.f12704g = this.f12700c.h(8);
        }

        public final void c() {
            this.f12705h = 0L;
            if (this.f12701d) {
                this.f12700c.r(4);
                long jH = ((long) this.f12700c.h(3)) << 30;
                this.f12700c.r(1);
                long jH2 = jH | ((long) (this.f12700c.h(15) << 15));
                this.f12700c.r(1);
                long jH3 = jH2 | ((long) this.f12700c.h(15));
                this.f12700c.r(1);
                if (!this.f12703f && this.f12702e) {
                    this.f12700c.r(4);
                    long jH4 = ((long) this.f12700c.h(3)) << 30;
                    this.f12700c.r(1);
                    long jH5 = jH4 | ((long) (this.f12700c.h(15) << 15));
                    this.f12700c.r(1);
                    long jH6 = jH5 | ((long) this.f12700c.h(15));
                    this.f12700c.r(1);
                    this.f12699b.b(jH6);
                    this.f12703f = true;
                }
                this.f12705h = this.f12699b.b(jH3);
            }
        }

        public void d() {
            this.f12703f = false;
            this.f12698a.b();
        }
    }

    public C() {
        this(new G1.H(0L));
    }

    public static /* synthetic */ InterfaceC4336p[] b() {
        return new InterfaceC4336p[]{new C()};
    }

    @Override // i2.InterfaceC4336p
    public void a(long j10, long j11) {
        boolean z10 = this.f12687a.f() == -9223372036854775807L;
        if (!z10) {
            long jD = this.f12687a.d();
            z10 = (jD == -9223372036854775807L || jD == 0 || jD == j11) ? false : true;
        }
        if (z10) {
            this.f12687a.i(j11);
        }
        z zVar = this.f12695i;
        if (zVar != null) {
            zVar.h(j11);
        }
        for (int i10 = 0; i10 < this.f12688b.size(); i10++) {
            ((a) this.f12688b.valueAt(i10)).d();
        }
    }

    @Override // i2.InterfaceC4336p
    public void c(i2.r rVar) {
        this.f12696j = rVar;
    }

    public final void d(long j10) {
        if (this.f12697k) {
            return;
        }
        this.f12697k = true;
        if (this.f12690d.c() == -9223372036854775807L) {
            this.f12696j.v(new J.b(this.f12690d.c()));
            return;
        }
        z zVar = new z(this.f12690d.d(), this.f12690d.c(), j10);
        this.f12695i = zVar;
        this.f12696j.v(zVar.b());
    }

    @Override // i2.InterfaceC4336p
    public int i(InterfaceC4337q interfaceC4337q, i2.I i10) {
        InterfaceC1853m c1854n;
        AbstractC0853a.i(this.f12696j);
        long length = interfaceC4337q.getLength();
        if (length != -1 && !this.f12690d.e()) {
            return this.f12690d.g(interfaceC4337q, i10);
        }
        d(length);
        z zVar = this.f12695i;
        if (zVar != null && zVar.d()) {
            return this.f12695i.c(interfaceC4337q, i10);
        }
        interfaceC4337q.i();
        long jM = length != -1 ? length - interfaceC4337q.m() : -1L;
        if ((jM != -1 && jM < 4) || !interfaceC4337q.e(this.f12689c.f(), 0, 4, true)) {
            return -1;
        }
        this.f12689c.a0(0);
        int iU = this.f12689c.u();
        if (iU == 441) {
            return -1;
        }
        if (iU == 442) {
            interfaceC4337q.s(this.f12689c.f(), 0, 10);
            this.f12689c.a0(9);
            interfaceC4337q.q((this.f12689c.L() & 7) + 14);
            return 0;
        }
        if (iU == 443) {
            interfaceC4337q.s(this.f12689c.f(), 0, 2);
            this.f12689c.a0(0);
            interfaceC4337q.q(this.f12689c.T() + 6);
            return 0;
        }
        if (((iU & (-256)) >> 8) != 1) {
            interfaceC4337q.q(1);
            return 0;
        }
        int i11 = iU & 255;
        a aVar = (a) this.f12688b.get(i11);
        if (!this.f12691e) {
            if (aVar == null) {
                if (i11 == 189) {
                    c1854n = new C1843c("video/mp2p");
                    this.f12692f = true;
                    this.f12694h = interfaceC4337q.getPosition();
                } else if ((iU & 224) == 192) {
                    c1854n = new t("video/mp2p");
                    this.f12692f = true;
                    this.f12694h = interfaceC4337q.getPosition();
                } else if ((iU & 240) == 224) {
                    c1854n = new C1854n("video/mp2p");
                    this.f12693g = true;
                    this.f12694h = interfaceC4337q.getPosition();
                } else {
                    c1854n = null;
                }
                if (c1854n != null) {
                    c1854n.d(this.f12696j, new L.d(i11, 256));
                    aVar = new a(c1854n, this.f12687a);
                    this.f12688b.put(i11, aVar);
                }
            }
            if (interfaceC4337q.getPosition() > ((this.f12692f && this.f12693g) ? this.f12694h + 8192 : SentryOptions.MAX_EVENT_SIZE_BYTES)) {
                this.f12691e = true;
                this.f12696j.n();
            }
        }
        interfaceC4337q.s(this.f12689c.f(), 0, 2);
        this.f12689c.a0(0);
        int iT = this.f12689c.T() + 6;
        if (aVar == null) {
            interfaceC4337q.q(iT);
        } else {
            this.f12689c.W(iT);
            interfaceC4337q.readFully(this.f12689c.f(), 0, iT);
            this.f12689c.a0(6);
            aVar.a(this.f12689c);
            G1.C c10 = this.f12689c;
            c10.Z(c10.b());
        }
        return 0;
    }

    @Override // i2.InterfaceC4336p
    public boolean j(InterfaceC4337q interfaceC4337q) {
        byte[] bArr = new byte[14];
        interfaceC4337q.s(bArr, 0, 14);
        if (442 != (((bArr[0] & ForkServer.ERROR) << 24) | ((bArr[1] & ForkServer.ERROR) << 16) | ((bArr[2] & ForkServer.ERROR) << 8) | (bArr[3] & ForkServer.ERROR)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        interfaceC4337q.o(bArr[13] & 7);
        interfaceC4337q.s(bArr, 0, 3);
        return 1 == ((((bArr[0] & ForkServer.ERROR) << 16) | ((bArr[1] & ForkServer.ERROR) << 8)) | (bArr[2] & ForkServer.ERROR));
    }

    public C(G1.H h10) {
        this.f12687a = h10;
        this.f12689c = new G1.C(RecognitionOptions.AZTEC);
        this.f12688b = new SparseArray();
        this.f12690d = new A();
    }

    @Override // i2.InterfaceC4336p
    public void release() {
    }
}
