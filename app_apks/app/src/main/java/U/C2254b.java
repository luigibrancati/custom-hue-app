package U;

import L.InterfaceC1133y;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: renamed from: U.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2254b extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M.f f16502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Size f16504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f16505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Matrix f16507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC1133y f16508h;

    public C2254b(Object obj, M.f fVar, int i10, Size size, Rect rect, int i11, Matrix matrix, InterfaceC1133y interfaceC1133y) {
        if (obj == null) {
            throw new NullPointerException("Null data");
        }
        this.f16501a = obj;
        this.f16502b = fVar;
        this.f16503c = i10;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f16504d = size;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f16505e = rect;
        this.f16506f = i11;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f16507g = matrix;
        if (interfaceC1133y == null) {
            throw new NullPointerException("Null cameraCaptureResult");
        }
        this.f16508h = interfaceC1133y;
    }

    @Override // U.z
    public InterfaceC1133y a() {
        return this.f16508h;
    }

    @Override // U.z
    public Rect b() {
        return this.f16505e;
    }

    @Override // U.z
    public Object c() {
        return this.f16501a;
    }

    @Override // U.z
    public M.f d() {
        return this.f16502b;
    }

    @Override // U.z
    public int e() {
        return this.f16503c;
    }

    public boolean equals(Object obj) {
        M.f fVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f16501a.equals(zVar.c()) && ((fVar = this.f16502b) != null ? fVar.equals(zVar.d()) : zVar.d() == null) && this.f16503c == zVar.e() && this.f16504d.equals(zVar.h()) && this.f16505e.equals(zVar.b()) && this.f16506f == zVar.f() && this.f16507g.equals(zVar.g()) && this.f16508h.equals(zVar.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // U.z
    public int f() {
        return this.f16506f;
    }

    @Override // U.z
    public Matrix g() {
        return this.f16507g;
    }

    @Override // U.z
    public Size h() {
        return this.f16504d;
    }

    public int hashCode() {
        int iHashCode = (this.f16501a.hashCode() ^ 1000003) * 1000003;
        M.f fVar = this.f16502b;
        return this.f16508h.hashCode() ^ ((((((((((((iHashCode ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003) ^ this.f16503c) * 1000003) ^ this.f16504d.hashCode()) * 1000003) ^ this.f16505e.hashCode()) * 1000003) ^ this.f16506f) * 1000003) ^ this.f16507g.hashCode()) * 1000003);
    }

    public String toString() {
        return "Packet{data=" + this.f16501a + ", exif=" + this.f16502b + ", format=" + this.f16503c + ", size=" + this.f16504d + ", cropRect=" + this.f16505e + ", rotationDegrees=" + this.f16506f + ", sensorToBufferTransform=" + this.f16507g + ", cameraCaptureResult=" + this.f16508h + "}";
    }
}
