package V;

import U.L;
import V.r;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b extends r.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L f17137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L f17138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f17139c;

    public b(L l10, L l11, List list) {
        if (l10 == null) {
            throw new NullPointerException("Null primarySurfaceEdge");
        }
        this.f17137a = l10;
        if (l11 == null) {
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        this.f17138b = l11;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f17139c = list;
    }

    @Override // V.r.b
    public List a() {
        return this.f17139c;
    }

    @Override // V.r.b
    public L b() {
        return this.f17137a;
    }

    @Override // V.r.b
    public L c() {
        return this.f17138b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r.b) {
            r.b bVar = (r.b) obj;
            if (this.f17137a.equals(bVar.b()) && this.f17138b.equals(bVar.c()) && this.f17139c.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f17139c.hashCode() ^ ((((this.f17137a.hashCode() ^ 1000003) * 1000003) ^ this.f17138b.hashCode()) * 1000003);
    }

    public String toString() {
        return "In{primarySurfaceEdge=" + this.f17137a + ", secondarySurfaceEdge=" + this.f17138b + ", outConfigs=" + this.f17139c + "}";
    }
}
