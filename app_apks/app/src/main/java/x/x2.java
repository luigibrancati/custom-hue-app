package x;

import E.AbstractC0807p0;
import L.AbstractC1109l0;
import L.C1136z0;
import L.InterfaceC1134y0;
import L.a1;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import y.C6378n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class x2 implements t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6378n f47206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f47207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T.e f47208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f47209d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f47210e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f47211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f47212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.camera.core.f f47213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AbstractC1109l0 f47214i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f47215j;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ImageWriter f47218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f47219b = new AtomicBoolean(true);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Executor f47220c;

        public b(Executor executor) {
            this.f47220c = executor;
        }

        public void b() {
            this.f47219b.set(false);
        }

        public boolean c(final androidx.camera.core.d dVar) {
            ImageWriter imageWriter;
            Image imageS0 = dVar.S0();
            if (this.f47219b.get() && (imageWriter = this.f47218a) != null && imageS0 != null) {
                try {
                    Q.a.d(imageWriter, imageS0);
                    Q.a.e(this.f47218a, new ImageWriter.OnImageReleasedListener() { // from class: x.y2
                        @Override // android.media.ImageWriter.OnImageReleasedListener
                        public final void onImageReleased(ImageWriter imageWriter2) {
                            dVar.close();
                        }
                    }, this.f47220c);
                    return true;
                } catch (IllegalStateException e10) {
                    AbstractC0807p0.c("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + e10.getMessage());
                }
            }
            return false;
        }

        public void d(ImageWriter imageWriter) {
            if (this.f47219b.get()) {
                if (this.f47218a != null) {
                    AbstractC0807p0.l("ZslControlImpl", "ImageWriter already existed in the ImageWriter holder. Closing the previous one.");
                    this.f47218a.close();
                }
                this.f47218a = imageWriter;
            }
        }

        public void e() {
            b();
            ImageWriter imageWriter = this.f47218a;
            if (imageWriter != null) {
                imageWriter.close();
            }
        }
    }

    public x2(C6378n c6378n, Executor executor) {
        this.f47211f = false;
        this.f47212g = false;
        this.f47206a = c6378n;
        this.f47207b = executor;
        this.f47211f = z2.a(c6378n, 4);
        this.f47212g = A.d.b(ZslDisablerQuirk.class) != null;
        this.f47208c = new T.e(3, new T.c() { // from class: x.u2
            @Override // T.c
            public final void a(Object obj) {
                ((androidx.camera.core.d) obj).close();
            }
        });
    }

    public static /* synthetic */ void i(x2 x2Var, InterfaceC1134y0 interfaceC1134y0) {
        x2Var.getClass();
        try {
            androidx.camera.core.d dVarAcquireLatestImage = interfaceC1134y0.acquireLatestImage();
            if (dVarAcquireLatestImage != null) {
                x2Var.f47208c.d(dVarAcquireLatestImage);
            }
        } catch (IllegalStateException e10) {
            AbstractC0807p0.c("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e10.getMessage());
        }
    }

    public static /* synthetic */ void j(androidx.camera.core.f fVar, b bVar) {
        fVar.i();
        bVar.e();
    }

    @Override // x.t2
    public void a(a1.b bVar) {
        k();
        if (this.f47209d) {
            bVar.y(1);
            return;
        }
        if (this.f47212g) {
            bVar.y(1);
            return;
        }
        Map mapM = m(this.f47206a);
        if (!this.f47211f || mapM.isEmpty() || !mapM.containsKey(34) || !n(this.f47206a, 34)) {
            bVar.y(1);
            return;
        }
        Size size = (Size) mapM.get(34);
        androidx.camera.core.e eVar = new androidx.camera.core.e(size.getWidth(), size.getHeight(), 34, 9);
        final androidx.camera.core.f fVar = new androidx.camera.core.f(eVar);
        Surface surface = fVar.getSurface();
        Objects.requireNonNull(surface);
        C1136z0 c1136z0 = new C1136z0(surface, new Size(fVar.getWidth(), fVar.getHeight()), 34);
        final b bVar2 = new b(this.f47207b);
        this.f47213h = fVar;
        this.f47214i = c1136z0;
        this.f47215j = bVar2;
        fVar.d(new InterfaceC1134y0.a() { // from class: x.v2
            @Override // L.InterfaceC1134y0.a
            public final void a(InterfaceC1134y0 interfaceC1134y0) {
                x2.i(this.f47181a, interfaceC1134y0);
            }
        }, N.a.c());
        c1136z0.k().b(new Runnable() { // from class: x.w2
            @Override // java.lang.Runnable
            public final void run() {
                x2.j(fVar, bVar2);
            }
        }, this.f47207b);
        bVar.l(c1136z0);
        bVar.e(eVar.l());
        bVar.k(new a(bVar2));
        bVar.u(new InputConfiguration(fVar.getWidth(), fVar.getHeight(), fVar.b()));
    }

    @Override // x.t2
    public void b() {
        k();
    }

    @Override // x.t2
    public boolean c() {
        return this.f47209d;
    }

    @Override // x.t2
    public void d(boolean z10) {
        this.f47210e = z10;
    }

    @Override // x.t2
    public void e(boolean z10) {
        if (this.f47209d != z10 && z10) {
            l();
        }
        this.f47209d = z10;
    }

    @Override // x.t2
    public androidx.camera.core.d f() {
        try {
            return (androidx.camera.core.d) this.f47208c.a();
        } catch (NoSuchElementException unused) {
            AbstractC0807p0.c("ZslControlImpl", "dequeueImageFromBuffer no such element");
            return null;
        }
    }

    @Override // x.t2
    public boolean g(androidx.camera.core.d dVar) {
        b bVar = this.f47215j;
        if (bVar != null) {
            return bVar.c(dVar);
        }
        return false;
    }

    @Override // x.t2
    public boolean h() {
        return this.f47210e;
    }

    public final void k() {
        androidx.camera.core.f fVar = this.f47213h;
        if (fVar != null) {
            fVar.c();
            this.f47213h = null;
        }
        b bVar = this.f47215j;
        if (bVar != null) {
            bVar.b();
            this.f47215j = null;
        }
        l();
        AbstractC1109l0 abstractC1109l0 = this.f47214i;
        if (abstractC1109l0 != null) {
            abstractC1109l0.d();
            this.f47214i = null;
        }
    }

    public final void l() {
        T.e eVar = this.f47208c;
        while (!eVar.c()) {
            ((androidx.camera.core.d) eVar.a()).close();
        }
    }

    public final Map m(C6378n c6378n) {
        StreamConfigurationMap streamConfigurationMap;
        try {
            streamConfigurationMap = (StreamConfigurationMap) c6378n.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e10) {
            AbstractC0807p0.c("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e10.getMessage());
            streamConfigurationMap = null;
        }
        if (streamConfigurationMap == null || streamConfigurationMap.getInputFormats() == null) {
            return new HashMap();
        }
        HashMap map = new HashMap();
        for (int i10 : streamConfigurationMap.getInputFormats()) {
            Size[] inputSizes = streamConfigurationMap.getInputSizes(i10);
            if (inputSizes != null) {
                Arrays.sort(inputSizes, new M.d(true));
                map.put(Integer.valueOf(i10), inputSizes[0]);
            }
        }
        return map;
    }

    public final boolean n(C6378n c6378n, int i10) {
        int[] validOutputFormatsForInput;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) c6378n.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null || (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(i10)) == null) {
            return false;
        }
        for (int i11 : validOutputFormatsForInput) {
            if (i11 == 256) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends CameraCaptureSession.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f47216a;

        public a(b bVar) {
            this.f47216a = bVar;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Surface inputSurface = cameraCaptureSession.getInputSurface();
            if (inputSurface != null) {
                this.f47216a.d(Q.a.c(inputSurface, 1));
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }
    }
}
