package E;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class G0 extends androidx.camera.core.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC0787f0 f2778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Rect f2779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2781h;

    public G0(androidx.camera.core.d dVar, InterfaceC0787f0 interfaceC0787f0) {
        this(dVar, null, interfaceC0787f0);
    }

    @Override // androidx.camera.core.b, androidx.camera.core.d
    public InterfaceC0787f0 L0() {
        return this.f2778e;
    }

    @Override // androidx.camera.core.b, androidx.camera.core.d
    public int getHeight() {
        return this.f2781h;
    }

    @Override // androidx.camera.core.b, androidx.camera.core.d
    public int getWidth() {
        return this.f2780g;
    }

    @Override // androidx.camera.core.b, androidx.camera.core.d
    public void setCropRect(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, getWidth(), getHeight())) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        synchronized (this.f2777d) {
            this.f2779f = rect;
        }
    }

    public G0(androidx.camera.core.d dVar, Size size, InterfaceC0787f0 interfaceC0787f0) {
        super(dVar);
        this.f2777d = new Object();
        if (size == null) {
            this.f2780g = super.getWidth();
            this.f2781h = super.getHeight();
        } else {
            this.f2780g = size.getWidth();
            this.f2781h = size.getHeight();
        }
        this.f2778e = interfaceC0787f0;
    }
}
