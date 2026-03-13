package U;

import U.U;
import java.util.List;

/* JADX INFO: renamed from: U.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2255c extends U.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L f16509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f16510b;

    public C2255c(L l10, List list) {
        if (l10 == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.f16509a = l10;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f16510b = list;
    }

    @Override // U.U.b
    public List a() {
        return this.f16510b;
    }

    @Override // U.U.b
    public L b() {
        return this.f16509a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof U.b) {
            U.b bVar = (U.b) obj;
            if (this.f16509a.equals(bVar.b()) && this.f16510b.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f16510b.hashCode() ^ ((this.f16509a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "In{surfaceEdge=" + this.f16509a + ", outConfigs=" + this.f16510b + "}";
    }
}
