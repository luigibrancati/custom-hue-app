package xe;

import Fe.C0841c;
import Fe.C0843e;
import Fe.H;
import Fe.InterfaceC0845g;
import Fe.J;
import Fe.K;
import fc.C4015H;
import io.sentry.ProfilingTraceData;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import pe.u;
import qe.p;
import ye.C6480a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f48258n = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f48260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C6480a f48261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f48262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f48263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f48264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f48265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f48266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f48267i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f48268j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f48269k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public xe.b f48270l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IOException f48271m;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class b implements H {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f48272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C0843e f48273b = new C0843e();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public u f48274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f48275d;

        public b(boolean z10) {
            this.f48272a = z10;
        }

        @Override // Fe.H
        public void J(C0843e source, long j10) throws IOException {
            AbstractC4862t.e(source, "source");
            j jVar = j.this;
            if (!p.f43482e || !Thread.holdsLock(jVar)) {
                this.f48273b.J(source, j10);
                while (this.f48273b.size() >= 16384) {
                    a(false);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + jVar);
            }
        }

        /* JADX WARN: Finally extract failed */
        public final void a(boolean z10) throws IOException {
            long jMin;
            boolean z11;
            j jVar = j.this;
            synchronized (jVar) {
                try {
                    jVar.t().v();
                    while (jVar.s() >= jVar.r() && !this.f48272a && !this.f48275d && jVar.j() == null) {
                        try {
                            jVar.D();
                        } catch (Throwable th) {
                            jVar.t().C();
                            throw th;
                        }
                    }
                    jVar.t().C();
                    jVar.d();
                    jMin = Math.min(jVar.r() - jVar.s(), this.f48273b.size());
                    jVar.A(jVar.s() + jMin);
                    z11 = z10 && jMin == this.f48273b.size();
                    C4015H c4015h = C4015H.f34254a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            j.this.t().v();
            try {
                j.this.i().q1(j.this.l(), z11, this.f48273b, jMin);
            } finally {
                j.this.t().C();
            }
        }

        public final boolean b() {
            return this.f48275d;
        }

        public final boolean c() {
            return this.f48272a;
        }

        @Override // Fe.H, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() throws IOException {
            j jVar = j.this;
            if (p.f43482e && Thread.holdsLock(jVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + jVar);
            }
            j jVar2 = j.this;
            synchronized (jVar2) {
                if (this.f48275d) {
                    return;
                }
                boolean z10 = jVar2.j() == null;
                C4015H c4015h = C4015H.f34254a;
                if (!j.this.p().f48272a) {
                    boolean z11 = this.f48273b.size() > 0;
                    if (this.f48274c != null) {
                        while (this.f48273b.size() > 0) {
                            a(false);
                        }
                        g gVarI = j.this.i();
                        int iL = j.this.l();
                        u uVar = this.f48274c;
                        AbstractC4862t.b(uVar);
                        gVarI.r1(iL, z10, p.o(uVar));
                    } else if (z11) {
                        while (this.f48273b.size() > 0) {
                            a(true);
                        }
                    } else if (z10) {
                        j.this.i().q1(j.this.l(), true, null, 0L);
                    }
                }
                j jVar3 = j.this;
                synchronized (jVar3) {
                    this.f48275d = true;
                    AbstractC4862t.c(jVar3, "null cannot be cast to non-null type java.lang.Object");
                    jVar3.notifyAll();
                    C4015H c4015h2 = C4015H.f34254a;
                }
                j.this.i().flush();
                j.this.c();
            }
        }

        @Override // Fe.H, java.io.Flushable
        public void flush() throws IOException {
            j jVar = j.this;
            if (p.f43482e && Thread.holdsLock(jVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + jVar);
            }
            j jVar2 = j.this;
            synchronized (jVar2) {
                jVar2.d();
                C4015H c4015h = C4015H.f34254a;
            }
            while (this.f48273b.size() > 0) {
                a(false);
                j.this.i().flush();
            }
        }

        @Override // Fe.H
        public K n() {
            return j.this.t();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class c implements J {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f48277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f48278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C0843e f48279c = new C0843e();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C0843e f48280d = new C0843e();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public u f48281e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f48282f;

        public c(long j10, boolean z10) {
            this.f48277a = j10;
            this.f48278b = z10;
        }

        @Override // Fe.J
        public long V0(C0843e sink, long j10) throws IOException {
            IOException iOExceptionK;
            boolean z10;
            long jV0;
            AbstractC4862t.e(sink, "sink");
            long j11 = 0;
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            while (true) {
                j jVar = j.this;
                synchronized (jVar) {
                    boolean zH = jVar.h();
                    if (zH) {
                        jVar.n().v();
                    }
                    try {
                        if (jVar.j() == null || this.f48278b) {
                            iOExceptionK = null;
                        } else {
                            iOExceptionK = jVar.k();
                            if (iOExceptionK == null) {
                                xe.b bVarJ = jVar.j();
                                AbstractC4862t.b(bVarJ);
                                iOExceptionK = new o(bVarJ);
                            }
                        }
                        if (this.f48282f) {
                            throw new IOException("stream closed");
                        }
                        z10 = false;
                        if (this.f48280d.size() > j11) {
                            C0843e c0843e = this.f48280d;
                            jV0 = c0843e.V0(sink, Math.min(j10, c0843e.size()));
                            C6480a.c(jVar.m(), jV0, 0L, 2, null);
                            long jA = jVar.m().a();
                            if (iOExceptionK == null && jA >= jVar.i().v0().c() / 2) {
                                jVar.i().v1(jVar.l(), jA);
                                C6480a.c(jVar.m(), 0L, jA, 1, null);
                            }
                        } else {
                            if (!this.f48278b && iOExceptionK == null) {
                                jVar.D();
                                z10 = true;
                            }
                            jV0 = -1;
                        }
                        if (zH) {
                            jVar.n().C();
                        }
                        C4015H c4015h = C4015H.f34254a;
                    } finally {
                    }
                }
                j.this.i().a0().b(j.this.l(), j.this.m(), this.f48280d.size());
                if (!z10) {
                    if (jV0 != -1) {
                        return jV0;
                    }
                    if (iOExceptionK == null) {
                        return -1L;
                    }
                    throw iOExceptionK;
                }
                j11 = 0;
            }
        }

        public final boolean a() {
            return this.f48282f;
        }

        public final boolean b() {
            return this.f48278b;
        }

        public final C0843e c() {
            return this.f48280d;
        }

        @Override // Fe.J, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long size;
            j jVar = j.this;
            synchronized (jVar) {
                this.f48282f = true;
                size = this.f48280d.size();
                this.f48280d.a();
                AbstractC4862t.c(jVar, "null cannot be cast to non-null type java.lang.Object");
                jVar.notifyAll();
                C4015H c4015h = C4015H.f34254a;
            }
            if (size > 0) {
                j(size);
            }
            j.this.c();
        }

        public final C0843e d() {
            return this.f48279c;
        }

        public final u f() {
            return this.f48281e;
        }

        public final void g(InterfaceC0845g source, long j10) throws EOFException {
            boolean z10;
            boolean z11;
            AbstractC4862t.e(source, "source");
            j jVar = j.this;
            if (p.f43482e && Thread.holdsLock(jVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + jVar);
            }
            long j11 = j10;
            while (j11 > 0) {
                synchronized (j.this) {
                    z10 = this.f48278b;
                    z11 = this.f48280d.size() + j11 > this.f48277a;
                    C4015H c4015h = C4015H.f34254a;
                }
                if (z11) {
                    source.skip(j11);
                    j.this.g(xe.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z10) {
                    source.skip(j11);
                    return;
                }
                long jV0 = source.V0(this.f48279c, j11);
                if (jV0 == -1) {
                    throw new EOFException();
                }
                j11 -= jV0;
                j jVar2 = j.this;
                synchronized (jVar2) {
                    try {
                        if (this.f48282f) {
                            this.f48279c.a();
                        } else {
                            boolean z12 = this.f48280d.size() == 0;
                            this.f48280d.f1(this.f48279c);
                            if (z12) {
                                AbstractC4862t.c(jVar2, "null cannot be cast to non-null type java.lang.Object");
                                jVar2.notifyAll();
                            }
                        }
                    } finally {
                    }
                }
            }
            j(j10);
            j.this.i().a0().b(j.this.l(), j.this.m(), this.f48280d.size());
        }

        public final void h(boolean z10) {
            this.f48278b = z10;
        }

        public final void i(u uVar) {
            this.f48281e = uVar;
        }

        public final void j(long j10) {
            j jVar = j.this;
            if (!p.f43482e || !Thread.holdsLock(jVar)) {
                j.this.i().p1(j10);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + jVar);
        }

        @Override // Fe.J
        public K n() {
            return j.this.n();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class d extends C0841c {
        public d() {
        }

        @Override // Fe.C0841c
        public void B() {
            j.this.g(xe.b.CANCEL);
            j.this.i().j1();
        }

        public final void C() throws IOException {
            if (w()) {
                throw x(null);
            }
        }

        @Override // Fe.C0841c
        public IOException x(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    public j(int i10, g connection, boolean z10, boolean z11, u uVar) {
        AbstractC4862t.e(connection, "connection");
        this.f48259a = i10;
        this.f48260b = connection;
        this.f48261c = new C6480a(i10);
        this.f48263e = connection.x0().c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f48264f = arrayDeque;
        this.f48266h = new c(connection.v0().c(), z11);
        this.f48267i = new b(z10);
        this.f48268j = new d();
        this.f48269k = new d();
        if (uVar == null) {
            if (!u()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (u()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(uVar);
        }
    }

    public final void A(long j10) {
        this.f48262d = j10;
    }

    public final synchronized u B(boolean z10) {
        Object objRemoveFirst;
        while (this.f48264f.isEmpty() && this.f48270l == null) {
            try {
                boolean z11 = z10 || h();
                if (z11) {
                    this.f48268j.v();
                }
                try {
                    D();
                    if (z11) {
                        this.f48268j.C();
                    }
                } catch (Throwable th) {
                    if (z11) {
                        this.f48268j.C();
                    }
                    throw th;
                }
            } finally {
            }
        }
        if (this.f48264f.isEmpty()) {
            IOException iOException = this.f48271m;
            if (iOException != null) {
                throw iOException;
            }
            xe.b bVar = this.f48270l;
            AbstractC4862t.b(bVar);
            throw new o(bVar);
        }
        objRemoveFirst = this.f48264f.removeFirst();
        AbstractC4862t.d(objRemoveFirst, "removeFirst(...)");
        return (u) objRemoveFirst;
    }

    public final synchronized u C() throws IOException {
        u uVarF;
        if (!this.f48266h.b() || !this.f48266h.d().z0() || !this.f48266h.c().z0()) {
            if (this.f48270l == null) {
                throw new IllegalStateException("too early; can't read the trailers yet");
            }
            IOException iOException = this.f48271m;
            if (iOException != null) {
                throw iOException;
            }
            xe.b bVar = this.f48270l;
            AbstractC4862t.b(bVar);
            throw new o(bVar);
        }
        uVarF = this.f48266h.f();
        if (uVarF == null) {
            uVarF = p.f43478a;
        }
        return uVarF;
    }

    public final void D() throws InterruptedIOException {
        try {
            AbstractC4862t.c(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final K E() {
        return this.f48269k;
    }

    public final void b(long j10) {
        this.f48263e += j10;
        if (j10 > 0) {
            AbstractC4862t.c(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void c() {
        boolean z10;
        boolean zV;
        if (p.f43482e && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                z10 = !this.f48266h.b() && this.f48266h.a() && (this.f48267i.c() || this.f48267i.b());
                zV = v();
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            e(xe.b.CANCEL, null);
        } else {
            if (zV) {
                return;
            }
            this.f48260b.i1(this.f48259a);
        }
    }

    public final void d() throws IOException {
        if (this.f48267i.b()) {
            throw new IOException("stream closed");
        }
        if (this.f48267i.c()) {
            throw new IOException("stream finished");
        }
        if (this.f48270l != null) {
            IOException iOException = this.f48271m;
            if (iOException != null) {
                throw iOException;
            }
            xe.b bVar = this.f48270l;
            AbstractC4862t.b(bVar);
            throw new o(bVar);
        }
    }

    public final void e(xe.b rstStatusCode, IOException iOException) {
        AbstractC4862t.e(rstStatusCode, "rstStatusCode");
        if (f(rstStatusCode, iOException)) {
            this.f48260b.t1(this.f48259a, rstStatusCode);
        }
    }

    public final boolean f(xe.b bVar, IOException iOException) {
        if (p.f43482e && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.f48270l != null) {
                return false;
            }
            this.f48270l = bVar;
            this.f48271m = iOException;
            AbstractC4862t.c(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (this.f48266h.b() && this.f48267i.c()) {
                return false;
            }
            C4015H c4015h = C4015H.f34254a;
            this.f48260b.i1(this.f48259a);
            return true;
        }
    }

    public final void g(xe.b errorCode) {
        AbstractC4862t.e(errorCode, "errorCode");
        if (f(errorCode, null)) {
            this.f48260b.u1(this.f48259a, errorCode);
        }
    }

    public final boolean h() {
        return !this.f48260b.S() || this.f48267i.b() || this.f48267i.c();
    }

    public final g i() {
        return this.f48260b;
    }

    public final synchronized xe.b j() {
        return this.f48270l;
    }

    public final IOException k() {
        return this.f48271m;
    }

    public final int l() {
        return this.f48259a;
    }

    public final C6480a m() {
        return this.f48261c;
    }

    public final d n() {
        return this.f48268j;
    }

    public final H o() {
        synchronized (this) {
            try {
                if (!this.f48265g && !u()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f48267i;
    }

    public final b p() {
        return this.f48267i;
    }

    public final c q() {
        return this.f48266h;
    }

    public final long r() {
        return this.f48263e;
    }

    public final long s() {
        return this.f48262d;
    }

    public final d t() {
        return this.f48269k;
    }

    public final boolean u() {
        return this.f48260b.S() == ((this.f48259a & 1) == 1);
    }

    public final synchronized boolean v() {
        try {
            if (this.f48270l != null) {
                return false;
            }
            if (this.f48266h.b() || this.f48266h.a()) {
                if (this.f48267i.c() || this.f48267i.b()) {
                    if (this.f48265g) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final K w() {
        return this.f48268j;
    }

    public final void x(InterfaceC0845g source, int i10) {
        AbstractC4862t.e(source, "source");
        if (!p.f43482e || !Thread.holdsLock(this)) {
            this.f48266h.g(source, i10);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final void y(u headers, boolean z10) {
        boolean zV;
        AbstractC4862t.e(headers, "headers");
        if (p.f43482e && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.f48265g && headers.c(":status") == null && headers.c(":method") == null) {
                    this.f48266h.i(headers);
                } else {
                    this.f48265g = true;
                    this.f48264f.add(headers);
                }
                if (z10) {
                    this.f48266h.h(true);
                }
                zV = v();
                AbstractC4862t.c(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zV) {
            return;
        }
        this.f48260b.i1(this.f48259a);
    }

    public final synchronized void z(xe.b errorCode) {
        AbstractC4862t.e(errorCode, "errorCode");
        if (this.f48270l == null) {
            this.f48270l = errorCode;
            AbstractC4862t.c(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }
}
