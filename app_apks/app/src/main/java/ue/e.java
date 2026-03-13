package ue;

import Fe.AbstractC0851m;
import Fe.AbstractC0852n;
import Fe.C0843e;
import Fe.H;
import Fe.J;
import Fe.v;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.metadata.HttpHeaders;
import pe.B;
import pe.C;
import pe.C5464A;
import pe.D;
import pe.u;
import ve.d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f45587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pe.s f45588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f45589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ve.d f45590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45592f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class a extends AbstractC0851m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f45593b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f45594c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f45595d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f45596e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ e f45597f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, H delegate, long j10) {
            super(delegate);
            AbstractC4862t.e(delegate, "delegate");
            this.f45597f = eVar;
            this.f45593b = j10;
        }

        private final IOException a(IOException iOException) {
            if (this.f45594c) {
                return iOException;
            }
            this.f45594c = true;
            return this.f45597f.a(this.f45595d, false, true, iOException);
        }

        @Override // Fe.AbstractC0851m, Fe.H
        public void J(C0843e source, long j10) throws IOException {
            AbstractC4862t.e(source, "source");
            if (this.f45596e) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f45593b;
            if (j11 == -1 || this.f45595d + j10 <= j11) {
                try {
                    super.J(source, j10);
                    this.f45595d += j10;
                    return;
                } catch (IOException e10) {
                    throw a(e10);
                }
            }
            throw new ProtocolException("expected " + this.f45593b + " bytes but received " + (this.f45595d + j10));
        }

        @Override // Fe.AbstractC0851m, Fe.H, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() throws IOException {
            if (this.f45596e) {
                return;
            }
            this.f45596e = true;
            long j10 = this.f45593b;
            if (j10 != -1 && this.f45595d != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e10) {
                throw a(e10);
            }
        }

        @Override // Fe.AbstractC0851m, Fe.H, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e10) {
                throw a(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class b extends AbstractC0852n {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f45598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f45599c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f45600d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f45601e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f45602f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ e f45603g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar, J delegate, long j10) {
            super(delegate);
            AbstractC4862t.e(delegate, "delegate");
            this.f45603g = eVar;
            this.f45598b = j10;
            this.f45600d = true;
            if (j10 == 0) {
                b(null);
            }
        }

        @Override // Fe.AbstractC0852n, Fe.J
        public long V0(C0843e sink, long j10) throws IOException {
            AbstractC4862t.e(sink, "sink");
            if (this.f45602f) {
                throw new IllegalStateException("closed");
            }
            try {
                long jV0 = a().V0(sink, j10);
                if (this.f45600d) {
                    this.f45600d = false;
                    this.f45603g.i().w(this.f45603g.g());
                }
                if (jV0 == -1) {
                    b(null);
                    return -1L;
                }
                long j11 = this.f45599c + jV0;
                long j12 = this.f45598b;
                if (j12 != -1 && j11 > j12) {
                    throw new ProtocolException("expected " + this.f45598b + " bytes but received " + j11);
                }
                this.f45599c = j11;
                if (j11 == j12) {
                    b(null);
                }
                return jV0;
            } catch (IOException e10) {
                throw b(e10);
            }
        }

        public final IOException b(IOException iOException) {
            if (this.f45601e) {
                return iOException;
            }
            this.f45601e = true;
            if (iOException == null && this.f45600d) {
                this.f45600d = false;
                this.f45603g.i().w(this.f45603g.g());
            }
            return this.f45603g.a(this.f45599c, true, false, iOException);
        }

        @Override // Fe.AbstractC0852n, Fe.J, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f45602f) {
                return;
            }
            this.f45602f = true;
            try {
                super.close();
                b(null);
            } catch (IOException e10) {
                throw b(e10);
            }
        }
    }

    public e(k call, pe.s eventListener, f finder, ve.d codec) {
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(eventListener, "eventListener");
        AbstractC4862t.e(finder, "finder");
        AbstractC4862t.e(codec, "codec");
        this.f45587a = call;
        this.f45588b = eventListener;
        this.f45589c = finder;
        this.f45590d = codec;
    }

    public final IOException a(long j10, boolean z10, boolean z11, IOException iOException) {
        if (iOException != null) {
            t(iOException);
        }
        if (z11) {
            if (iOException != null) {
                this.f45588b.s(this.f45587a, iOException);
            } else {
                this.f45588b.q(this.f45587a, j10);
            }
        }
        if (z10) {
            if (iOException != null) {
                this.f45588b.x(this.f45587a, iOException);
            } else {
                this.f45588b.v(this.f45587a, j10);
            }
        }
        return this.f45587a.y(this, z11, z10, iOException);
    }

    public final void b() {
        this.f45590d.cancel();
    }

    public final H c(C5464A request, boolean z10) {
        AbstractC4862t.e(request, "request");
        this.f45591e = z10;
        B bA = request.a();
        AbstractC4862t.b(bA);
        long jA = bA.a();
        this.f45588b.r(this.f45587a);
        return new a(this, this.f45590d.d(request, jA), jA);
    }

    public final void d() {
        this.f45590d.cancel();
        this.f45587a.y(this, true, true, null);
    }

    public final void e() throws IOException {
        try {
            this.f45590d.a();
        } catch (IOException e10) {
            this.f45588b.s(this.f45587a, e10);
            t(e10);
            throw e10;
        }
    }

    public final void f() throws IOException {
        try {
            this.f45590d.g();
        } catch (IOException e10) {
            this.f45588b.s(this.f45587a, e10);
            t(e10);
            throw e10;
        }
    }

    public final k g() {
        return this.f45587a;
    }

    public final l h() {
        d.a aVarH = this.f45590d.h();
        l lVar = aVarH instanceof l ? (l) aVarH : null;
        if (lVar != null) {
            return lVar;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    public final pe.s i() {
        return this.f45588b;
    }

    public final f j() {
        return this.f45589c;
    }

    public final boolean k() {
        return this.f45592f;
    }

    public final boolean l() {
        return !AbstractC4862t.a(this.f45589c.b().getAddress().l().h(), this.f45590d.h().e().a().l().h());
    }

    public final boolean m() {
        return this.f45591e;
    }

    public final void n() {
        this.f45590d.h().c();
    }

    public final void o() {
        this.f45587a.y(this, true, false, null);
    }

    public final D p(C response) throws IOException {
        AbstractC4862t.e(response, "response");
        try {
            String strM = C.m(response, HttpHeaders.CONTENT_TYPE, null, 2, null);
            long jB = this.f45590d.b(response);
            return new ve.h(strM, jB, v.c(new b(this, this.f45590d.c(response), jB)));
        } catch (IOException e10) {
            this.f45588b.x(this.f45587a, e10);
            t(e10);
            throw e10;
        }
    }

    public final C.a q(boolean z10) throws IOException {
        try {
            C.a aVarF = this.f45590d.f(z10);
            if (aVarF == null) {
                return aVarF;
            }
            aVarF.k(this);
            return aVarF;
        } catch (IOException e10) {
            this.f45588b.x(this.f45587a, e10);
            t(e10);
            throw e10;
        }
    }

    public final void r(C response) {
        AbstractC4862t.e(response, "response");
        this.f45588b.y(this.f45587a, response);
    }

    public final void s() {
        this.f45588b.z(this.f45587a);
    }

    public final void t(IOException iOException) {
        this.f45592f = true;
        this.f45590d.h().b(this.f45587a, iOException);
    }

    public final u u() {
        return this.f45590d.i();
    }

    public final void v(C5464A request) throws IOException {
        AbstractC4862t.e(request, "request");
        try {
            this.f45588b.u(this.f45587a);
            this.f45590d.e(request);
            this.f45588b.t(this.f45587a, request);
        } catch (IOException e10) {
            this.f45588b.s(this.f45587a, e10);
            t(e10);
            throw e10;
        }
    }
}
