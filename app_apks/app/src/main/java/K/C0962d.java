package K;

import K.P;
import U.C2272u;
import java.util.List;

/* JADX INFO: renamed from: K.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0962d extends P.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2272u f6599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2272u f6600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f6602d;

    public C0962d(C2272u c2272u, C2272u c2272u2, int i10, List list) {
        if (c2272u == null) {
            throw new NullPointerException("Null edge");
        }
        this.f6599a = c2272u;
        if (c2272u2 == null) {
            throw new NullPointerException("Null postviewEdge");
        }
        this.f6600b = c2272u2;
        this.f6601c = i10;
        if (list == null) {
            throw new NullPointerException("Null outputFormats");
        }
        this.f6602d = list;
    }

    @Override // K.P.a
    public C2272u a() {
        return this.f6599a;
    }

    @Override // K.P.a
    public int b() {
        return this.f6601c;
    }

    @Override // K.P.a
    public List c() {
        return this.f6602d;
    }

    @Override // K.P.a
    public C2272u d() {
        return this.f6600b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof P.a) {
            P.a aVar = (P.a) obj;
            if (this.f6599a.equals(aVar.a()) && this.f6600b.equals(aVar.d()) && this.f6601c == aVar.b() && this.f6602d.equals(aVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f6602d.hashCode() ^ ((((((this.f6599a.hashCode() ^ 1000003) * 1000003) ^ this.f6600b.hashCode()) * 1000003) ^ this.f6601c) * 1000003);
    }

    public String toString() {
        return "In{edge=" + this.f6599a + ", postviewEdge=" + this.f6600b + ", inputFormat=" + this.f6601c + ", outputFormats=" + this.f6602d + "}";
    }
}
