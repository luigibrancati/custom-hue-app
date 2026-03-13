package ue;

import Fe.C0841c;
import fc.C4015H;
import fc.C4022e;
import io.sentry.ProfilingTraceData;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC4862t;
import pe.C;
import pe.C5464A;
import pe.InterfaceC5469e;
import pe.InterfaceC5470f;
import pe.y;
import se.C5824a;
import ue.r;
import ve.C6106a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements InterfaceC5469e, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f45615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5464A f45616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f45617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f45618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pe.s f45619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f45620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f45621g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f45622h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f45623i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l f45624j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f45625k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e f45626l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f45627m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f45628n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f45629o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile boolean f45630p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile e f45631q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f45632r;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC5470f f45633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile AtomicInteger f45634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f45635c;

        public a(k kVar, InterfaceC5470f responseCallback) {
            AbstractC4862t.e(responseCallback, "responseCallback");
            this.f45635c = kVar;
            this.f45633a = responseCallback;
            this.f45634b = new AtomicInteger(0);
        }

        public static /* synthetic */ void c(a aVar, RejectedExecutionException rejectedExecutionException, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                rejectedExecutionException = null;
            }
            aVar.b(rejectedExecutionException);
        }

        public final void a(ExecutorService executorService) {
            AbstractC4862t.e(executorService, "executorService");
            pe.q qVarK = this.f45635c.p().k();
            if (qe.p.f43482e && Thread.holdsLock(qVarK)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + qVarK);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    b(e10);
                    this.f45635c.p().k().f(this);
                }
            } catch (Throwable th) {
                this.f45635c.p().k().f(this);
                throw th;
            }
        }

        public final void b(RejectedExecutionException rejectedExecutionException) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
            interruptedIOException.initCause(rejectedExecutionException);
            this.f45635c.z(interruptedIOException);
            this.f45633a.a(this.f45635c, interruptedIOException);
        }

        public final k d() {
            return this.f45635c;
        }

        public final AtomicInteger e() {
            return this.f45634b;
        }

        public final String f() {
            return this.f45635c.u().k().h();
        }

        public final void g(a other) {
            AbstractC4862t.e(other, "other");
            this.f45634b = other.f45634b;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            Throwable th;
            IOException e10;
            y yVarP;
            String str = "OkHttp " + this.f45635c.A();
            k kVar = this.f45635c;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                kVar.f45620f.v();
                try {
                    try {
                        z10 = true;
                    } catch (IOException e11) {
                        z10 = false;
                        e10 = e11;
                    } catch (Throwable th2) {
                        z10 = false;
                        th = th2;
                    }
                    try {
                        this.f45633a.b(kVar, kVar.w());
                        yVarP = kVar.p();
                    } catch (IOException e12) {
                        e10 = e12;
                        if (z10) {
                            Ae.h.f493a.g().k("Callback failure for " + kVar.F(), 4, e10);
                        } else {
                            this.f45633a.a(kVar, e10);
                        }
                        yVarP = kVar.p();
                    } catch (Throwable th3) {
                        th = th3;
                        kVar.cancel();
                        if (!z10) {
                            IOException iOException = new IOException("canceled due to " + th);
                            C4022e.a(iOException, th);
                            this.f45633a.a(kVar, iOException);
                        }
                        throw th;
                    }
                    yVarP.k().f(this);
                } catch (Throwable th4) {
                    kVar.p().k().f(this);
                    throw th4;
                }
            } finally {
                threadCurrentThread.setName(name);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends WeakReference {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f45636a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k referent, Object obj) {
            super(referent);
            AbstractC4862t.e(referent, "referent");
            this.f45636a = obj;
        }

        public final Object a() {
            return this.f45636a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends C0841c {
        public c() {
        }

        @Override // Fe.C0841c
        public void B() {
            k.this.cancel();
        }
    }

    public k(y client, C5464A originalRequest, boolean z10) {
        AbstractC4862t.e(client, "client");
        AbstractC4862t.e(originalRequest, "originalRequest");
        this.f45615a = client;
        this.f45616b = originalRequest;
        this.f45617c = z10;
        this.f45618d = client.i().a();
        this.f45619e = client.l().a(this);
        c cVar = new c();
        cVar.g(client.g(), TimeUnit.MILLISECONDS);
        this.f45620f = cVar;
        this.f45621g = new AtomicBoolean();
        this.f45629o = true;
        this.f45632r = new CopyOnWriteArrayList();
    }

    public final String A() {
        return this.f45616b.k().o();
    }

    public final Socket B() {
        l lVar = this.f45624j;
        AbstractC4862t.b(lVar);
        if (qe.p.f43482e && !Thread.holdsLock(lVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + lVar);
        }
        List listH = lVar.h();
        Iterator it = listH.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (AbstractC4862t.a(((Reference) it.next()).get(), this)) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        listH.remove(i10);
        this.f45624j = null;
        if (listH.isEmpty()) {
            lVar.v(System.nanoTime());
            if (this.f45618d.c(lVar)) {
                return lVar.x();
            }
        }
        return null;
    }

    public final boolean C() {
        e eVar = this.f45631q;
        if (eVar == null || !eVar.k()) {
            return false;
        }
        f fVar = this.f45623i;
        AbstractC4862t.b(fVar);
        r rVarB = fVar.b();
        e eVar2 = this.f45631q;
        return rVarB.a(eVar2 != null ? eVar2.h() : null);
    }

    public final void D() {
        if (this.f45625k) {
            throw new IllegalStateException("Check failed.");
        }
        this.f45625k = true;
        this.f45620f.w();
    }

    public final IOException E(IOException iOException) {
        if (this.f45625k || !this.f45620f.w()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final String F() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c() ? "canceled " : "");
        sb2.append(this.f45617c ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(A());
        return sb2.toString();
    }

    @Override // pe.InterfaceC5469e
    public boolean c() {
        return this.f45630p;
    }

    @Override // pe.InterfaceC5469e
    public void cancel() {
        if (this.f45630p) {
            return;
        }
        this.f45630p = true;
        e eVar = this.f45631q;
        if (eVar != null) {
            eVar.b();
        }
        Iterator it = this.f45632r.iterator();
        while (it.hasNext()) {
            ((r.b) it.next()).cancel();
        }
        this.f45619e.g(this);
    }

    @Override // pe.InterfaceC5469e
    public C5464A d() {
        return this.f45616b;
    }

    public final void g(l connection) {
        AbstractC4862t.e(connection, "connection");
        if (!qe.p.f43482e || Thread.holdsLock(connection)) {
            if (this.f45624j != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.f45624j = connection;
            connection.h().add(new b(this, this.f45622h));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    @Override // pe.InterfaceC5469e
    public void g0(InterfaceC5470f responseCallback) {
        AbstractC4862t.e(responseCallback, "responseCallback");
        if (!this.f45621g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        j();
        this.f45615a.k().a(new a(this, responseCallback));
    }

    public final IOException i(IOException iOException) {
        Socket socketB;
        boolean z10 = qe.p.f43482e;
        if (z10 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        l lVar = this.f45624j;
        if (lVar != null) {
            if (z10 && Thread.holdsLock(lVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + lVar);
            }
            synchronized (lVar) {
                socketB = B();
            }
            if (this.f45624j == null) {
                if (socketB != null) {
                    qe.p.f(socketB);
                }
                this.f45619e.l(this, lVar);
                lVar.i().g(lVar, this);
                if (socketB != null) {
                    lVar.i().f(lVar);
                }
            } else if (socketB != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        IOException iOExceptionE = E(iOException);
        if (iOException == null) {
            this.f45619e.d(this);
            return iOExceptionE;
        }
        pe.s sVar = this.f45619e;
        AbstractC4862t.b(iOExceptionE);
        sVar.e(this, iOExceptionE);
        return iOExceptionE;
    }

    public final void j() {
        this.f45622h = Ae.h.f493a.g().i("response.body().close()");
        this.f45619e.f(this);
    }

    @Override // pe.InterfaceC5469e
    public C l() {
        if (!this.f45621g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f45620f.v();
        j();
        try {
            this.f45615a.k().b(this);
            return w();
        } finally {
            this.f45615a.k().g(this);
        }
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public InterfaceC5469e clone() {
        return new k(this.f45615a, this.f45616b, this.f45617c);
    }

    public final void n(C5464A request, boolean z10, ve.g chain) {
        AbstractC4862t.e(request, "request");
        AbstractC4862t.e(chain, "chain");
        if (this.f45626l != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.f45628n) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.f45627m) {
                throw new IllegalStateException("Check failed.");
            }
            C4015H c4015h = C4015H.f34254a;
        }
        if (z10) {
            n nVar = new n(this.f45615a.q(), this.f45618d, this.f45615a.w(), this.f45615a.A(), chain.f(), chain.h(), this.f45615a.t(), this.f45615a.x(), this.f45615a.m(), this.f45615a.d(request.k()), this.f45615a.p(), new C6021a(this, this.f45618d.d(), chain));
            this.f45623i = this.f45615a.m() ? new h(nVar, this.f45615a.q()) : new t(nVar);
        }
    }

    public final void o(boolean z10) {
        e eVar;
        synchronized (this) {
            if (!this.f45629o) {
                throw new IllegalStateException("released");
            }
            C4015H c4015h = C4015H.f34254a;
        }
        if (z10 && (eVar = this.f45631q) != null) {
            eVar.d();
        }
        this.f45626l = null;
    }

    public final y p() {
        return this.f45615a;
    }

    public final l q() {
        return this.f45624j;
    }

    public final pe.s r() {
        return this.f45619e;
    }

    public final boolean s() {
        return this.f45617c;
    }

    public final e t() {
        return this.f45626l;
    }

    public final C5464A u() {
        return this.f45616b;
    }

    public final CopyOnWriteArrayList v() {
        return this.f45632r;
    }

    public final C w() {
        ArrayList arrayList = new ArrayList();
        gc.y.C(arrayList, this.f45615a.r());
        arrayList.add(new ve.j(this.f45615a));
        arrayList.add(new C6106a(this.f45615a.j()));
        arrayList.add(new C5824a(this.f45615a.f()));
        arrayList.add(C6022b.f45556a);
        if (!this.f45617c) {
            gc.y.C(arrayList, this.f45615a.s());
        }
        arrayList.add(new ve.b(this.f45617c));
        try {
            try {
                C cA = new ve.g(this, arrayList, 0, null, this.f45616b, this.f45615a.h(), this.f45615a.w(), this.f45615a.A()).a(this.f45616b);
                if (c()) {
                    qe.m.f(cA);
                    throw new IOException("Canceled");
                }
                z(null);
                return cA;
            } catch (IOException e10) {
                IOException iOExceptionZ = z(e10);
                AbstractC4862t.c(iOExceptionZ, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionZ;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                z(null);
            }
            throw th;
        }
    }

    public final e x(ve.g chain) throws IOException {
        AbstractC4862t.e(chain, "chain");
        synchronized (this) {
            if (!this.f45629o) {
                throw new IllegalStateException("released");
            }
            if (this.f45628n) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.f45627m) {
                throw new IllegalStateException("Check failed.");
            }
            C4015H c4015h = C4015H.f34254a;
        }
        f fVar = this.f45623i;
        AbstractC4862t.b(fVar);
        e eVar = new e(this, this.f45619e, fVar, fVar.a().r(this.f45615a, chain));
        this.f45626l = eVar;
        this.f45631q = eVar;
        synchronized (this) {
            this.f45627m = true;
            this.f45628n = true;
        }
        if (this.f45630p) {
            throw new IOException("Canceled");
        }
        return eVar;
    }

    public final IOException y(e exchange, boolean z10, boolean z11, IOException iOException) {
        boolean z12;
        boolean z13;
        AbstractC4862t.e(exchange, "exchange");
        if (AbstractC4862t.a(exchange, this.f45631q)) {
            synchronized (this) {
                z12 = false;
                if (z10) {
                    try {
                        if (!this.f45627m) {
                            if (z11 || !this.f45628n) {
                                z13 = false;
                            }
                            C4015H c4015h = C4015H.f34254a;
                        }
                        if (z10) {
                            this.f45627m = false;
                        }
                        if (z11) {
                            this.f45628n = false;
                        }
                        boolean z14 = this.f45627m;
                        boolean z15 = (z14 || this.f45628n) ? false : true;
                        if (!z14 && !this.f45628n && !this.f45629o) {
                            z12 = true;
                        }
                        z13 = z12;
                        z12 = z15;
                        C4015H c4015h2 = C4015H.f34254a;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z11) {
                    }
                    z13 = false;
                    C4015H c4015h22 = C4015H.f34254a;
                }
            }
            if (z12) {
                this.f45631q = null;
                l lVar = this.f45624j;
                if (lVar != null) {
                    lVar.n();
                }
            }
            if (z13) {
                return i(iOException);
            }
        }
        return iOException;
    }

    public final IOException z(IOException iOException) {
        boolean z10;
        synchronized (this) {
            try {
                z10 = false;
                if (this.f45629o) {
                    this.f45629o = false;
                    if (!this.f45627m && !this.f45628n) {
                        z10 = true;
                    }
                }
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10 ? i(iOException) : iOException;
    }
}
