package L;

import android.util.Size;
import java.util.Map;

/* JADX INFO: renamed from: L.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1112n extends i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f8146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f8147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Size f8148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f8149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f8150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f8151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f8152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f8153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f8154i;

    public C1112n(Size size, Map map, Size size2, Map map2, Size size3, Map map3, Map map4, Map map5, Map map6) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.f8146a = size;
        if (map == null) {
            throw new NullPointerException("Null s720pSizeMap");
        }
        this.f8147b = map;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.f8148c = size2;
        if (map2 == null) {
            throw new NullPointerException("Null s1440pSizeMap");
        }
        this.f8149d = map2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.f8150e = size3;
        if (map3 == null) {
            throw new NullPointerException("Null maximumSizeMap");
        }
        this.f8151f = map3;
        if (map4 == null) {
            throw new NullPointerException("Null maximum4x3SizeMap");
        }
        this.f8152g = map4;
        if (map5 == null) {
            throw new NullPointerException("Null maximum16x9SizeMap");
        }
        this.f8153h = map5;
        if (map6 == null) {
            throw new NullPointerException("Null ultraMaximumSizeMap");
        }
        this.f8154i = map6;
    }

    @Override // L.i1
    public Size b() {
        return this.f8146a;
    }

    @Override // L.i1
    public Map d() {
        return this.f8153h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            if (this.f8146a.equals(i1Var.b()) && this.f8147b.equals(i1Var.n()) && this.f8148c.equals(i1Var.i()) && this.f8149d.equals(i1Var.l()) && this.f8150e.equals(i1Var.j()) && this.f8151f.equals(i1Var.h()) && this.f8152g.equals(i1Var.f()) && this.f8153h.equals(i1Var.d()) && this.f8154i.equals(i1Var.p())) {
                return true;
            }
        }
        return false;
    }

    @Override // L.i1
    public Map f() {
        return this.f8152g;
    }

    @Override // L.i1
    public Map h() {
        return this.f8151f;
    }

    public int hashCode() {
        return this.f8154i.hashCode() ^ ((((((((((((((((this.f8146a.hashCode() ^ 1000003) * 1000003) ^ this.f8147b.hashCode()) * 1000003) ^ this.f8148c.hashCode()) * 1000003) ^ this.f8149d.hashCode()) * 1000003) ^ this.f8150e.hashCode()) * 1000003) ^ this.f8151f.hashCode()) * 1000003) ^ this.f8152g.hashCode()) * 1000003) ^ this.f8153h.hashCode()) * 1000003);
    }

    @Override // L.i1
    public Size i() {
        return this.f8148c;
    }

    @Override // L.i1
    public Size j() {
        return this.f8150e;
    }

    @Override // L.i1
    public Map l() {
        return this.f8149d;
    }

    @Override // L.i1
    public Map n() {
        return this.f8147b;
    }

    @Override // L.i1
    public Map p() {
        return this.f8154i;
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f8146a + ", s720pSizeMap=" + this.f8147b + ", previewSize=" + this.f8148c + ", s1440pSizeMap=" + this.f8149d + ", recordSize=" + this.f8150e + ", maximumSizeMap=" + this.f8151f + ", maximum4x3SizeMap=" + this.f8152g + ", maximum16x9SizeMap=" + this.f8153h + ", ultraMaximumSizeMap=" + this.f8154i + "}";
    }
}
