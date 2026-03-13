package E;

import E.J0;
import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: renamed from: E.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0792i extends J0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f2992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f2993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L.J f2994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f2996e;

    public C0792i(Size size, Rect rect, L.J j10, int i10, boolean z10) {
        if (size == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.f2992a = size;
        if (rect == null) {
            throw new NullPointerException("Null inputCropRect");
        }
        this.f2993b = rect;
        this.f2994c = j10;
        this.f2995d = i10;
        this.f2996e = z10;
    }

    @Override // E.J0.a
    public L.J a() {
        return this.f2994c;
    }

    @Override // E.J0.a
    public Rect b() {
        return this.f2993b;
    }

    @Override // E.J0.a
    public Size c() {
        return this.f2992a;
    }

    @Override // E.J0.a
    public boolean d() {
        return this.f2996e;
    }

    @Override // E.J0.a
    public int e() {
        return this.f2995d;
    }

    public boolean equals(Object obj) {
        L.J j10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof J0.a) {
            J0.a aVar = (J0.a) obj;
            if (this.f2992a.equals(aVar.c()) && this.f2993b.equals(aVar.b()) && ((j10 = this.f2994c) != null ? j10.equals(aVar.a()) : aVar.a() == null) && this.f2995d == aVar.e() && this.f2996e == aVar.d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f2992a.hashCode() ^ 1000003) * 1000003) ^ this.f2993b.hashCode()) * 1000003;
        L.J j10 = this.f2994c;
        return (this.f2996e ? 1231 : 1237) ^ ((((iHashCode ^ (j10 == null ? 0 : j10.hashCode())) * 1000003) ^ this.f2995d) * 1000003);
    }

    public String toString() {
        return "CameraInputInfo{inputSize=" + this.f2992a + ", inputCropRect=" + this.f2993b + ", cameraInternal=" + this.f2994c + ", rotationDegrees=" + this.f2995d + ", mirroring=" + this.f2996e + "}";
    }
}
