package L;

import android.view.Surface;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: L.y0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1134y0 {

    /* JADX INFO: renamed from: L.y0$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void a(InterfaceC1134y0 interfaceC1134y0);
    }

    androidx.camera.core.d acquireLatestImage();

    int b();

    void c();

    void close();

    void d(a aVar, Executor executor);

    int e();

    androidx.camera.core.d f();

    int getHeight();

    Surface getSurface();

    int getWidth();
}
