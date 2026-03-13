package ve;

import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import pe.C;
import pe.C5464A;
import pe.InterfaceC5469e;
import pe.w;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements w.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue.k f46043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f46044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ue.e f46046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C5464A f46047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f46048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f46049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f46050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f46051i;

    public g(ue.k call, List interceptors, int i10, ue.e eVar, C5464A request, int i11, int i12, int i13) {
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(interceptors, "interceptors");
        AbstractC4862t.e(request, "request");
        this.f46043a = call;
        this.f46044b = interceptors;
        this.f46045c = i10;
        this.f46046d = eVar;
        this.f46047e = request;
        this.f46048f = i11;
        this.f46049g = i12;
        this.f46050h = i13;
    }

    public static /* synthetic */ g c(g gVar, int i10, ue.e eVar, C5464A c5464a, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = gVar.f46045c;
        }
        if ((i14 & 2) != 0) {
            eVar = gVar.f46046d;
        }
        if ((i14 & 4) != 0) {
            c5464a = gVar.f46047e;
        }
        if ((i14 & 8) != 0) {
            i11 = gVar.f46048f;
        }
        if ((i14 & 16) != 0) {
            i12 = gVar.f46049g;
        }
        if ((i14 & 32) != 0) {
            i13 = gVar.f46050h;
        }
        int i15 = i12;
        int i16 = i13;
        return gVar.b(i10, eVar, c5464a, i11, i15, i16);
    }

    @Override // pe.w.a
    public C a(C5464A request) {
        AbstractC4862t.e(request, "request");
        if (this.f46045c >= this.f46044b.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.f46051i++;
        ue.e eVar = this.f46046d;
        if (eVar != null) {
            if (!eVar.j().b().e(request.k())) {
                throw new IllegalStateException(("network interceptor " + this.f46044b.get(this.f46045c - 1) + " must retain the same host and port").toString());
            }
            if (this.f46051i != 1) {
                throw new IllegalStateException(("network interceptor " + this.f46044b.get(this.f46045c - 1) + " must call proceed() exactly once").toString());
            }
        }
        g gVarC = c(this, this.f46045c + 1, null, request, 0, 0, 0, 58, null);
        w wVar = (w) this.f46044b.get(this.f46045c);
        C cA = wVar.a(gVarC);
        if (cA == null) {
            throw new NullPointerException("interceptor " + wVar + " returned null");
        }
        if (this.f46046d == null || this.f46045c + 1 >= this.f46044b.size() || gVarC.f46051i == 1) {
            return cA;
        }
        throw new IllegalStateException(("network interceptor " + wVar + " must call proceed() exactly once").toString());
    }

    public final g b(int i10, ue.e eVar, C5464A request, int i11, int i12, int i13) {
        AbstractC4862t.e(request, "request");
        return new g(this.f46043a, this.f46044b, i10, eVar, request, i11, i12, i13);
    }

    @Override // pe.w.a
    public InterfaceC5469e call() {
        return this.f46043a;
    }

    @Override // pe.w.a
    public C5464A d() {
        return this.f46047e;
    }

    public final ue.k e() {
        return this.f46043a;
    }

    public final int f() {
        return this.f46048f;
    }

    public final ue.e g() {
        return this.f46046d;
    }

    public final int h() {
        return this.f46049g;
    }

    public final C5464A i() {
        return this.f46047e;
    }

    public final int j() {
        return this.f46050h;
    }

    public int k() {
        return this.f46049g;
    }
}
