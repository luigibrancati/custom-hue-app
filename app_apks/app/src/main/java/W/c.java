package W;

import android.opengl.EGLSurface;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EGLSurface f17611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17613c;

    public c(EGLSurface eGLSurface, int i10, int i11) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.f17611a = eGLSurface;
        this.f17612b = i10;
        this.f17613c = i11;
    }

    @Override // W.g
    public EGLSurface a() {
        return this.f17611a;
    }

    @Override // W.g
    public int b() {
        return this.f17613c;
    }

    @Override // W.g
    public int c() {
        return this.f17612b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f17611a.equals(gVar.a()) && this.f17612b == gVar.c() && this.f17613c == gVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f17613c ^ ((((this.f17611a.hashCode() ^ 1000003) * 1000003) ^ this.f17612b) * 1000003);
    }

    public String toString() {
        return "OutputSurface{eglSurface=" + this.f17611a + ", width=" + this.f17612b + ", height=" + this.f17613c + "}";
    }
}
