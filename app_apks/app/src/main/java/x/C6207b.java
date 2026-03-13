package x;

import android.util.Size;
import java.util.List;
import x.S;

/* JADX INFO: renamed from: x.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6207b extends S.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f46884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L.a1 f46885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L.s1 f46886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f46887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final L.e1 f46888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f46889g;

    public C6207b(String str, Class cls, L.a1 a1Var, L.s1 s1Var, Size size, L.e1 e1Var, List list) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f46883a = str;
        if (cls == null) {
            throw new NullPointerException("Null useCaseType");
        }
        this.f46884b = cls;
        if (a1Var == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.f46885c = a1Var;
        if (s1Var == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.f46886d = s1Var;
        this.f46887e = size;
        this.f46888f = e1Var;
        this.f46889g = list;
    }

    @Override // x.S.k
    public List c() {
        return this.f46889g;
    }

    @Override // x.S.k
    public L.a1 d() {
        return this.f46885c;
    }

    @Override // x.S.k
    public L.e1 e() {
        return this.f46888f;
    }

    public boolean equals(Object obj) {
        Size size;
        L.e1 e1Var;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof S.k) {
            S.k kVar = (S.k) obj;
            if (this.f46883a.equals(kVar.h()) && this.f46884b.equals(kVar.i()) && this.f46885c.equals(kVar.d()) && this.f46886d.equals(kVar.g()) && ((size = this.f46887e) != null ? size.equals(kVar.f()) : kVar.f() == null) && ((e1Var = this.f46888f) != null ? e1Var.equals(kVar.e()) : kVar.e() == null) && ((list = this.f46889g) != null ? list.equals(kVar.c()) : kVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // x.S.k
    public Size f() {
        return this.f46887e;
    }

    @Override // x.S.k
    public L.s1 g() {
        return this.f46886d;
    }

    @Override // x.S.k
    public String h() {
        return this.f46883a;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f46883a.hashCode() ^ 1000003) * 1000003) ^ this.f46884b.hashCode()) * 1000003) ^ this.f46885c.hashCode()) * 1000003) ^ this.f46886d.hashCode()) * 1000003;
        Size size = this.f46887e;
        int iHashCode2 = (iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        L.e1 e1Var = this.f46888f;
        int iHashCode3 = (iHashCode2 ^ (e1Var == null ? 0 : e1Var.hashCode())) * 1000003;
        List list = this.f46889g;
        return iHashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // x.S.k
    public Class i() {
        return this.f46884b;
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.f46883a + ", useCaseType=" + this.f46884b + ", sessionConfig=" + this.f46885c + ", useCaseConfig=" + this.f46886d + ", surfaceResolution=" + this.f46887e + ", streamSpec=" + this.f46888f + ", captureTypes=" + this.f46889g + "}";
    }
}
