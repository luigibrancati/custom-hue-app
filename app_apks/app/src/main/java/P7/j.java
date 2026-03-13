package P7;

import Z7.C2602l;
import Z7.H;
import Z7.M;
import e8.C3950A;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3950A f13136a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f13137b;

    public j(v vVar) {
        this.f13137b = vVar;
    }

    public static j a(v vVar) {
        return new j(vVar);
    }

    public C3950A b() {
        try {
            return c();
        } catch (GeneralSecurityException e10) {
            throw new M("Parsing parameters failed in getProto(). You probably want to call some Tink register function for " + this.f13137b, e10);
        }
    }

    public C3950A c() {
        C3950A c3950a = this.f13136a;
        if (c3950a != null) {
            return c3950a;
        }
        v vVar = this.f13137b;
        return vVar instanceof C2602l ? ((C2602l) vVar).b().d() : ((H) Z7.x.c().o(this.f13137b, H.class)).d();
    }

    public v d() {
        v vVar = this.f13137b;
        return vVar != null ? vVar : y.a(b().g());
    }
}
