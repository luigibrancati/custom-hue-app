package E;

import E.V0;
import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: renamed from: E.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0798l extends V0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f3001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Matrix f3005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3006f;

    public C0798l(Rect rect, int i10, int i11, boolean z10, Matrix matrix, boolean z11) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f3001a = rect;
        this.f3002b = i10;
        this.f3003c = i11;
        this.f3004d = z10;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.f3005e = matrix;
        this.f3006f = z11;
    }

    @Override // E.V0.h
    public Rect a() {
        return this.f3001a;
    }

    @Override // E.V0.h
    public int b() {
        return this.f3002b;
    }

    @Override // E.V0.h
    public Matrix c() {
        return this.f3005e;
    }

    @Override // E.V0.h
    public int d() {
        return this.f3003c;
    }

    @Override // E.V0.h
    public boolean e() {
        return this.f3004d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof V0.h) {
            V0.h hVar = (V0.h) obj;
            if (this.f3001a.equals(hVar.a()) && this.f3002b == hVar.b() && this.f3003c == hVar.d() && this.f3004d == hVar.e() && this.f3005e.equals(hVar.c()) && this.f3006f == hVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // E.V0.h
    public boolean f() {
        return this.f3006f;
    }

    public int hashCode() {
        return ((((((((((this.f3001a.hashCode() ^ 1000003) * 1000003) ^ this.f3002b) * 1000003) ^ this.f3003c) * 1000003) ^ (this.f3004d ? 1231 : 1237)) * 1000003) ^ this.f3005e.hashCode()) * 1000003) ^ (this.f3006f ? 1231 : 1237);
    }

    public String toString() {
        return "TransformationInfo{getCropRect=" + this.f3001a + ", getRotationDegrees=" + this.f3002b + ", getTargetRotation=" + this.f3003c + ", hasCameraTransform=" + this.f3004d + ", getSensorToBufferTransform=" + this.f3005e + ", isMirroring=" + this.f3006f + "}";
    }
}
