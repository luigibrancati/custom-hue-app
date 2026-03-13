package W;

import android.opengl.EGLSurface;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static g d(EGLSurface eGLSurface, int i10, int i11) {
        return new c(eGLSurface, i10, i11);
    }

    public abstract EGLSurface a();

    public abstract int b();

    public abstract int c();
}
