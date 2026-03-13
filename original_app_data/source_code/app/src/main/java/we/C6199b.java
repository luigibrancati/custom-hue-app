package we;

import Fe.C0843e;
import Fe.H;
import Fe.InterfaceC0844f;
import Fe.InterfaceC0845g;
import Fe.J;
import Fe.K;
import Fe.o;
import Od.C;
import Od.F;
import com.fasterxml.jackson.core.JsonFactory;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import pe.B;
import pe.C;
import pe.C5464A;
import pe.u;
import pe.v;
import pe.y;
import qe.m;
import qe.p;
import vc.InterfaceC6082a;
import ve.d;
import ve.i;
import ve.k;

/* JADX INFO: renamed from: we.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C6199b implements ve.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f46541h = new d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f46542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d.a f46543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0845g f46544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0844f f46545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C6198a f46547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u f46548g;

    /* JADX INFO: renamed from: we.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public abstract class a implements J {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f46549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f46550b;

        public a() {
            this.f46549a = new o(C6199b.this.f46544c.n());
        }

        @Override // Fe.J
        public long V0(C0843e sink, long j10) throws IOException {
            AbstractC4862t.e(sink, "sink");
            try {
                return C6199b.this.f46544c.V0(sink, j10);
            } catch (IOException e10) {
                C6199b.this.h().c();
                this.b();
                throw e10;
            }
        }

        public final boolean a() {
            return this.f46550b;
        }

        public final void b() {
            if (C6199b.this.f46546e == 6) {
                return;
            }
            if (C6199b.this.f46546e == 5) {
                C6199b.this.s(this.f46549a);
                C6199b.this.f46546e = 6;
            } else {
                throw new IllegalStateException("state: " + C6199b.this.f46546e);
            }
        }

        public final void c(boolean z10) {
            this.f46550b = z10;
        }

        @Override // Fe.J
        public K n() {
            return this.f46549a;
        }
    }

    /* JADX INFO: renamed from: we.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class C0641b implements H {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f46552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f46553b;

        public C0641b() {
            this.f46552a = new o(C6199b.this.f46545d.n());
        }

        @Override // Fe.H
        public void J(C0843e source, long j10) {
            AbstractC4862t.e(source, "source");
            if (this.f46553b) {
                throw new IllegalStateException("closed");
            }
            if (j10 == 0) {
                return;
            }
            C6199b.this.f46545d.I0(j10);
            C6199b.this.f46545d.T("\r\n");
            C6199b.this.f46545d.J(source, j10);
            C6199b.this.f46545d.T("\r\n");
        }

        @Override // Fe.H, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public synchronized void close() {
            if (this.f46553b) {
                return;
            }
            this.f46553b = true;
            C6199b.this.f46545d.T("0\r\n\r\n");
            C6199b.this.s(this.f46552a);
            C6199b.this.f46546e = 3;
        }

        @Override // Fe.H, java.io.Flushable
        public synchronized void flush() {
            if (this.f46553b) {
                return;
            }
            C6199b.this.f46545d.flush();
        }

        @Override // Fe.H
        public K n() {
            return this.f46552a;
        }
    }

    /* JADX INFO: renamed from: we.b$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class c extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final v f46555d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f46556e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f46557f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ C6199b f46558g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C6199b c6199b, v url) {
            super();
            AbstractC4862t.e(url, "url");
            this.f46558g = c6199b;
            this.f46555d = url;
            this.f46556e = -1L;
            this.f46557f = true;
        }

        @Override // we.C6199b.a, Fe.J
        public long V0(C0843e sink, long j10) throws IOException {
            AbstractC4862t.e(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (a()) {
                throw new IllegalStateException("closed");
            }
            if (!this.f46557f) {
                return -1L;
            }
            long j11 = this.f46556e;
            if (j11 == 0 || j11 == -1) {
                d();
                if (!this.f46557f) {
                    return -1L;
                }
            }
            long jV0 = super.V0(sink, Math.min(j10, this.f46556e));
            if (jV0 != -1) {
                this.f46556e -= jV0;
                return jV0;
            }
            this.f46558g.h().c();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }

        @Override // Fe.J, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (this.f46557f && !p.g(this, 100, TimeUnit.MILLISECONDS)) {
                this.f46558g.h().c();
                b();
            }
            c(true);
        }

        public final void d() throws ProtocolException {
            if (this.f46556e != -1) {
                this.f46558g.f46544c.Z();
            }
            try {
                this.f46556e = this.f46558g.f46544c.Z0();
                String string = F.e1(this.f46558g.f46544c.Z()).toString();
                if (this.f46556e < 0 || (string.length() > 0 && !C.P(string, ";", false, 2, null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f46556e + string + JsonFactory.DEFAULT_QUOTE_CHAR);
                }
                if (this.f46556e == 0) {
                    this.f46557f = false;
                    C6199b c6199b = this.f46558g;
                    c6199b.f46548g = c6199b.f46547f.a();
                    y yVar = this.f46558g.f46542a;
                    AbstractC4862t.b(yVar);
                    pe.o oVarJ = yVar.j();
                    v vVar = this.f46555d;
                    u uVar = this.f46558g.f46548g;
                    AbstractC4862t.b(uVar);
                    ve.e.f(oVarJ, vVar, uVar);
                    b();
                }
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: we.b$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {
        public /* synthetic */ d(AbstractC4854k abstractC4854k) {
            this();
        }

        public d() {
        }
    }

    /* JADX INFO: renamed from: we.b$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class e extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f46559d;

        public e(long j10) {
            super();
            this.f46559d = j10;
            if (j10 == 0) {
                b();
            }
        }

        @Override // we.C6199b.a, Fe.J
        public long V0(C0843e sink, long j10) throws IOException {
            AbstractC4862t.e(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (a()) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f46559d;
            if (j11 == 0) {
                return -1L;
            }
            long jV0 = super.V0(sink, Math.min(j11, j10));
            if (jV0 == -1) {
                C6199b.this.h().c();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b();
                throw protocolException;
            }
            long j12 = this.f46559d - jV0;
            this.f46559d = j12;
            if (j12 == 0) {
                b();
            }
            return jV0;
        }

        @Override // Fe.J, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (this.f46559d != 0 && !p.g(this, 100, TimeUnit.MILLISECONDS)) {
                C6199b.this.h().c();
                b();
            }
            c(true);
        }
    }

    /* JADX INFO: renamed from: we.b$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class f implements H {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f46561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f46562b;

        public f() {
            this.f46561a = new o(C6199b.this.f46545d.n());
        }

        @Override // Fe.H
        public void J(C0843e source, long j10) {
            AbstractC4862t.e(source, "source");
            if (this.f46562b) {
                throw new IllegalStateException("closed");
            }
            m.e(source.size(), 0L, j10);
            C6199b.this.f46545d.J(source, j10);
        }

        @Override // Fe.H, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() {
            if (this.f46562b) {
                return;
            }
            this.f46562b = true;
            C6199b.this.s(this.f46561a);
            C6199b.this.f46546e = 3;
        }

        @Override // Fe.H, java.io.Flushable
        public void flush() {
            if (this.f46562b) {
                return;
            }
            C6199b.this.f46545d.flush();
        }

        @Override // Fe.H
        public K n() {
            return this.f46561a;
        }
    }

    /* JADX INFO: renamed from: we.b$g */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class g extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f46564d;

        public g() {
            super();
        }

        @Override // we.C6199b.a, Fe.J
        public long V0(C0843e sink, long j10) throws IOException {
            AbstractC4862t.e(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (a()) {
                throw new IllegalStateException("closed");
            }
            if (this.f46564d) {
                return -1L;
            }
            long jV0 = super.V0(sink, j10);
            if (jV0 != -1) {
                return jV0;
            }
            this.f46564d = true;
            b();
            return -1L;
        }

        @Override // Fe.J, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (!this.f46564d) {
                b();
            }
            c(true);
        }
    }

    /* JADX INFO: renamed from: we.b$h */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class h extends kotlin.jvm.internal.v implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f46566a = new h();

        public h() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u invoke() {
            throw new IllegalStateException("trailers not available");
        }
    }

    public C6199b(y yVar, d.a carrier, InterfaceC0845g source, InterfaceC0844f sink) {
        AbstractC4862t.e(carrier, "carrier");
        AbstractC4862t.e(source, "source");
        AbstractC4862t.e(sink, "sink");
        this.f46542a = yVar;
        this.f46543b = carrier;
        this.f46544c = source;
        this.f46545d = sink;
        this.f46547f = new C6198a(source);
    }

    public final void A(pe.C response) {
        AbstractC4862t.e(response, "response");
        long jI = p.i(response);
        if (jI == -1) {
            return;
        }
        J jX = x(jI);
        p.l(jX, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        jX.close();
    }

    public final void B(u headers, String requestLine) {
        AbstractC4862t.e(headers, "headers");
        AbstractC4862t.e(requestLine, "requestLine");
        if (this.f46546e != 0) {
            throw new IllegalStateException(("state: " + this.f46546e).toString());
        }
        this.f46545d.T(requestLine).T("\r\n");
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f46545d.T(headers.e(i10)).T(": ").T(headers.h(i10)).T("\r\n");
        }
        this.f46545d.T("\r\n");
        this.f46546e = 1;
    }

    @Override // ve.d
    public void a() {
        this.f46545d.flush();
    }

    @Override // ve.d
    public long b(pe.C response) {
        AbstractC4862t.e(response, "response");
        if (!ve.e.b(response)) {
            return 0L;
        }
        if (u(response)) {
            return -1L;
        }
        return p.i(response);
    }

    @Override // ve.d
    public J c(pe.C response) {
        AbstractC4862t.e(response, "response");
        if (!ve.e.b(response)) {
            return x(0L);
        }
        if (u(response)) {
            return w(response.K().k());
        }
        long jI = p.i(response);
        return jI != -1 ? x(jI) : z();
    }

    @Override // ve.d
    public void cancel() {
        h().cancel();
    }

    @Override // ve.d
    public H d(C5464A request, long j10) throws ProtocolException {
        AbstractC4862t.e(request, "request");
        B bA = request.a();
        if (bA != null && bA.c()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (t(request)) {
            return v();
        }
        if (j10 != -1) {
            return y();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // ve.d
    public void e(C5464A request) {
        AbstractC4862t.e(request, "request");
        i iVar = i.f46055a;
        Proxy.Type type = h().e().b().type();
        AbstractC4862t.d(type, "type(...)");
        B(request.g(), iVar.a(request, type));
    }

    @Override // ve.d
    public C.a f(boolean z10) throws IOException {
        int i10 = this.f46546e;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalStateException(("state: " + this.f46546e).toString());
        }
        try {
            k kVarA = k.f46058d.a(this.f46547f.b());
            C.a aVarC = new C.a().o(kVarA.f46059a).e(kVarA.f46060b).l(kVarA.f46061c).j(this.f46547f.a()).C(h.f46566a);
            if (z10 && kVarA.f46060b == 100) {
                return null;
            }
            int i11 = kVarA.f46060b;
            if (i11 == 100) {
                this.f46546e = 3;
                return aVarC;
            }
            if (102 > i11 || i11 >= 200) {
                this.f46546e = 4;
                return aVarC;
            }
            this.f46546e = 3;
            return aVarC;
        } catch (EOFException e10) {
            throw new IOException("unexpected end of stream on " + h().e().a().l().o(), e10);
        }
    }

    @Override // ve.d
    public void g() {
        this.f46545d.flush();
    }

    @Override // ve.d
    public d.a h() {
        return this.f46543b;
    }

    @Override // ve.d
    public u i() {
        if (this.f46546e != 6) {
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        u uVar = this.f46548g;
        return uVar == null ? p.f43478a : uVar;
    }

    public final void s(o oVar) {
        K kI = oVar.i();
        oVar.j(K.f4081e);
        kI.a();
        kI.b();
    }

    public final boolean t(C5464A c5464a) {
        return Od.C.E("chunked", c5464a.e("Transfer-Encoding"), true);
    }

    public final boolean u(pe.C c10) {
        return Od.C.E("chunked", pe.C.m(c10, "Transfer-Encoding", null, 2, null), true);
    }

    public final H v() {
        if (this.f46546e == 1) {
            this.f46546e = 2;
            return new C0641b();
        }
        throw new IllegalStateException(("state: " + this.f46546e).toString());
    }

    public final J w(v vVar) {
        if (this.f46546e == 4) {
            this.f46546e = 5;
            return new c(this, vVar);
        }
        throw new IllegalStateException(("state: " + this.f46546e).toString());
    }

    public final J x(long j10) {
        if (this.f46546e == 4) {
            this.f46546e = 5;
            return new e(j10);
        }
        throw new IllegalStateException(("state: " + this.f46546e).toString());
    }

    public final H y() {
        if (this.f46546e == 1) {
            this.f46546e = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.f46546e).toString());
    }

    public final J z() {
        if (this.f46546e == 4) {
            this.f46546e = 5;
            h().c();
            return new g();
        }
        throw new IllegalStateException(("state: " + this.f46546e).toString());
    }
}
