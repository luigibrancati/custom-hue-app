package L;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* JADX INFO: renamed from: L.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1098g extends AbstractC1096f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1 f8059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Size f8061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E.J f8062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f8063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC1099g0 f8064f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8065g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Range f8066h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f8067i;

    public C1098g(h1 h1Var, int i10, Size size, E.J j10, List list, InterfaceC1099g0 interfaceC1099g0, int i11, Range range, boolean z10) {
        if (h1Var == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.f8059a = h1Var;
        this.f8060b = i10;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f8061c = size;
        if (j10 == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.f8062d = j10;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.f8063e = list;
        this.f8064f = interfaceC1099g0;
        this.f8065g = i11;
        if (range == null) {
            throw new NullPointerException("Null targetFrameRate");
        }
        this.f8066h = range;
        this.f8067i = z10;
    }

    @Override // L.AbstractC1096f
    public List b() {
        return this.f8063e;
    }

    @Override // L.AbstractC1096f
    public E.J c() {
        return this.f8062d;
    }

    @Override // L.AbstractC1096f
    public int d() {
        return this.f8060b;
    }

    @Override // L.AbstractC1096f
    public InterfaceC1099g0 e() {
        return this.f8064f;
    }

    public boolean equals(Object obj) {
        InterfaceC1099g0 interfaceC1099g0;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1096f) {
            AbstractC1096f abstractC1096f = (AbstractC1096f) obj;
            if (this.f8059a.equals(abstractC1096f.h()) && this.f8060b == abstractC1096f.d() && this.f8061c.equals(abstractC1096f.g()) && this.f8062d.equals(abstractC1096f.c()) && this.f8063e.equals(abstractC1096f.b()) && ((interfaceC1099g0 = this.f8064f) != null ? interfaceC1099g0.equals(abstractC1096f.e()) : abstractC1096f.e() == null) && this.f8065g == abstractC1096f.f() && this.f8066h.equals(abstractC1096f.i()) && this.f8067i == abstractC1096f.j()) {
                return true;
            }
        }
        return false;
    }

    @Override // L.AbstractC1096f
    public int f() {
        return this.f8065g;
    }

    @Override // L.AbstractC1096f
    public Size g() {
        return this.f8061c;
    }

    @Override // L.AbstractC1096f
    public h1 h() {
        return this.f8059a;
    }

    public int hashCode() {
        int iHashCode = (((((((((this.f8059a.hashCode() ^ 1000003) * 1000003) ^ this.f8060b) * 1000003) ^ this.f8061c.hashCode()) * 1000003) ^ this.f8062d.hashCode()) * 1000003) ^ this.f8063e.hashCode()) * 1000003;
        InterfaceC1099g0 interfaceC1099g0 = this.f8064f;
        return (this.f8067i ? 1231 : 1237) ^ ((((((iHashCode ^ (interfaceC1099g0 == null ? 0 : interfaceC1099g0.hashCode())) * 1000003) ^ this.f8065g) * 1000003) ^ this.f8066h.hashCode()) * 1000003);
    }

    @Override // L.AbstractC1096f
    public Range i() {
        return this.f8066h;
    }

    @Override // L.AbstractC1096f
    public boolean j() {
        return this.f8067i;
    }

    public String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f8059a + ", imageFormat=" + this.f8060b + ", size=" + this.f8061c + ", dynamicRange=" + this.f8062d + ", captureTypes=" + this.f8063e + ", implementationOptions=" + this.f8064f + ", sessionType=" + this.f8065g + ", targetFrameRate=" + this.f8066h + ", strictFrameRateRequired=" + this.f8067i + "}";
    }
}
