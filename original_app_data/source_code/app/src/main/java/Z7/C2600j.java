package Z7;

import com.google.crypto.tink.shaded.protobuf.AbstractC3661h;
import com.google.crypto.tink.shaded.protobuf.Z;
import e8.C3950A;
import e8.y;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: Z7.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C2600j implements P7.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f20367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y.c f20368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z f20369d;

    public C2600j(String str, Class cls, y.c cVar, Z z10) {
        this.f20369d = z10;
        this.f20366a = str;
        this.f20367b = cls;
        this.f20368c = cVar;
    }

    public static P7.h e(String str, Class cls, y.c cVar, Z z10) {
        return new C2600j(str, cls, cVar, z10);
    }

    @Override // P7.h
    public final Class a() {
        return this.f20367b;
    }

    @Override // P7.h
    public final e8.y b(AbstractC3661h abstractC3661h) {
        G g10 = (G) x.c().n(q.f().c(x.c().h(H.b((C3950A) C3950A.W().u(this.f20366a).v(abstractC3661h).t(e8.I.RAW).i())), null), G.class, P7.f.a());
        return (e8.y) e8.y.W().u(g10.f()).v(g10.g()).t(g10.d()).i();
    }

    @Override // P7.h
    public final String c() {
        return this.f20366a;
    }

    @Override // P7.h
    public Object d(AbstractC3661h abstractC3661h) throws GeneralSecurityException {
        return u.b().a(x.c().f(G.b(this.f20366a, abstractC3661h, this.f20368c, e8.I.RAW, null), P7.f.a()), this.f20367b);
    }
}
