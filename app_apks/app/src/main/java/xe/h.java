package xe;

import Fe.H;
import Fe.J;
import Fe.K;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import pe.C;
import pe.C5464A;
import pe.u;
import pe.y;
import pe.z;
import qe.p;
import vc.InterfaceC6082a;
import ve.d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements ve.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f48236g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f48237h = p.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", RRWebVideoEvent.JsonKeys.ENCODING, "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final List f48238i = p.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", RRWebVideoEvent.JsonKeys.ENCODING, "upgrade");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d.a f48239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ve.g f48240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f48241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile j f48242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z f48243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f48244f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: xe.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0669a extends v implements InterfaceC6082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0669a f48245a = new C0669a();

            public C0669a() {
                super(0);
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final u invoke() {
                throw new IllegalStateException("trailers not available");
            }
        }

        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final List a(C5464A request) {
            AbstractC4862t.e(request, "request");
            u uVarG = request.g();
            ArrayList arrayList = new ArrayList(uVarG.size() + 4);
            arrayList.add(new d(d.f48125g, request.i()));
            arrayList.add(new d(d.f48126h, ve.i.f46055a.c(request.k())));
            String strE = request.e("Host");
            if (strE != null) {
                arrayList.add(new d(d.f48128j, strE));
            }
            arrayList.add(new d(d.f48127i, request.k().q()));
            int size = uVarG.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strE2 = uVarG.e(i10);
                Locale US = Locale.US;
                AbstractC4862t.d(US, "US");
                String lowerCase = strE2.toLowerCase(US);
                AbstractC4862t.d(lowerCase, "toLowerCase(...)");
                if (!h.f48237h.contains(lowerCase) || (AbstractC4862t.a(lowerCase, "te") && AbstractC4862t.a(uVarG.h(i10), "trailers"))) {
                    arrayList.add(new d(lowerCase, uVarG.h(i10)));
                }
            }
            return arrayList;
        }

        public final C.a b(u headerBlock, z protocol) throws ProtocolException {
            AbstractC4862t.e(headerBlock, "headerBlock");
            AbstractC4862t.e(protocol, "protocol");
            u.a aVar = new u.a();
            int size = headerBlock.size();
            ve.k kVarA = null;
            for (int i10 = 0; i10 < size; i10++) {
                String strE = headerBlock.e(i10);
                String strH = headerBlock.h(i10);
                if (AbstractC4862t.a(strE, ":status")) {
                    kVarA = ve.k.f46058d.a("HTTP/1.1 " + strH);
                } else if (!h.f48238i.contains(strE)) {
                    aVar.c(strE, strH);
                }
            }
            if (kVarA != null) {
                return new C.a().o(protocol).e(kVarA.f46060b).l(kVarA.f46061c).j(aVar.d()).C(C0669a.f48245a);
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        public a() {
        }
    }

    public h(y client, d.a carrier, ve.g chain, g http2Connection) {
        AbstractC4862t.e(client, "client");
        AbstractC4862t.e(carrier, "carrier");
        AbstractC4862t.e(chain, "chain");
        AbstractC4862t.e(http2Connection, "http2Connection");
        this.f48239a = carrier;
        this.f48240b = chain;
        this.f48241c = http2Connection;
        List listU = client.u();
        z zVar = z.H2_PRIOR_KNOWLEDGE;
        this.f48243e = listU.contains(zVar) ? zVar : z.HTTP_2;
    }

    @Override // ve.d
    public void a() {
        j jVar = this.f48242d;
        AbstractC4862t.b(jVar);
        jVar.o().close();
    }

    @Override // ve.d
    public long b(C response) {
        AbstractC4862t.e(response, "response");
        if (ve.e.b(response)) {
            return p.i(response);
        }
        return 0L;
    }

    @Override // ve.d
    public J c(C response) {
        AbstractC4862t.e(response, "response");
        j jVar = this.f48242d;
        AbstractC4862t.b(jVar);
        return jVar.q();
    }

    @Override // ve.d
    public void cancel() {
        this.f48244f = true;
        j jVar = this.f48242d;
        if (jVar != null) {
            jVar.g(b.CANCEL);
        }
    }

    @Override // ve.d
    public H d(C5464A request, long j10) {
        AbstractC4862t.e(request, "request");
        j jVar = this.f48242d;
        AbstractC4862t.b(jVar);
        return jVar.o();
    }

    @Override // ve.d
    public void e(C5464A request) throws IOException {
        AbstractC4862t.e(request, "request");
        if (this.f48242d != null) {
            return;
        }
        this.f48242d = this.f48241c.c1(f48236g.a(request), request.a() != null);
        if (this.f48244f) {
            j jVar = this.f48242d;
            AbstractC4862t.b(jVar);
            jVar.g(b.CANCEL);
            throw new IOException("Canceled");
        }
        j jVar2 = this.f48242d;
        AbstractC4862t.b(jVar2);
        K kW = jVar2.w();
        long jH = this.f48240b.h();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        kW.g(jH, timeUnit);
        j jVar3 = this.f48242d;
        AbstractC4862t.b(jVar3);
        jVar3.E().g(this.f48240b.j(), timeUnit);
    }

    @Override // ve.d
    public C.a f(boolean z10) throws IOException {
        j jVar = this.f48242d;
        if (jVar == null) {
            throw new IOException("stream wasn't created");
        }
        C.a aVarB = f48236g.b(jVar.B(z10), this.f48243e);
        if (z10 && aVarB.f() == 100) {
            return null;
        }
        return aVarB;
    }

    @Override // ve.d
    public void g() {
        this.f48241c.flush();
    }

    @Override // ve.d
    public d.a h() {
        return this.f48239a;
    }

    @Override // ve.d
    public u i() {
        j jVar = this.f48242d;
        AbstractC4862t.b(jVar);
        return jVar.C();
    }
}
