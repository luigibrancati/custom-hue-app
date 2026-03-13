package g2;

import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class j extends T1.o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f35173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f35174e;

    public j(Throwable th, T1.p pVar, Surface surface) {
        super(th, pVar);
        this.f35173d = System.identityHashCode(surface);
        this.f35174e = surface == null || surface.isValid();
    }
}
