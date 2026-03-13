package E;

import L.InterfaceC1134y0;
import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: E.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C0780c implements InterfaceC1134y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageReader f2946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2947b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2948c = true;

    public C0780c(ImageReader imageReader) {
        this.f2946a = imageReader;
    }

    public static /* synthetic */ void a(final C0780c c0780c, Executor executor, final InterfaceC1134y0.a aVar, ImageReader imageReader) {
        synchronized (c0780c.f2947b) {
            try {
                if (!c0780c.f2948c) {
                    executor.execute(new Runnable() { // from class: E.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0780c.g(this.f2944a, aVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void g(C0780c c0780c, InterfaceC1134y0.a aVar) {
        c0780c.getClass();
        aVar.a(c0780c);
    }

    @Override // L.InterfaceC1134y0
    public androidx.camera.core.d acquireLatestImage() {
        Image imageAcquireLatestImage;
        synchronized (this.f2947b) {
            try {
                imageAcquireLatestImage = this.f2946a.acquireLatestImage();
            } catch (RuntimeException e10) {
                if (!this.h(e10)) {
                    throw e10;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new androidx.camera.core.a(imageAcquireLatestImage);
        }
    }

    @Override // L.InterfaceC1134y0
    public int b() {
        int imageFormat;
        synchronized (this.f2947b) {
            imageFormat = this.f2946a.getImageFormat();
        }
        return imageFormat;
    }

    @Override // L.InterfaceC1134y0
    public void c() {
        synchronized (this.f2947b) {
            this.f2948c = true;
            this.f2946a.setOnImageAvailableListener(null, null);
        }
    }

    @Override // L.InterfaceC1134y0
    public void close() {
        synchronized (this.f2947b) {
            this.f2946a.close();
        }
    }

    @Override // L.InterfaceC1134y0
    public void d(final InterfaceC1134y0.a aVar, final Executor executor) {
        synchronized (this.f2947b) {
            this.f2948c = false;
            this.f2946a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: E.a
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    C0780c.a(this.f2941a, executor, aVar, imageReader);
                }
            }, M.m.a());
        }
    }

    @Override // L.InterfaceC1134y0
    public int e() {
        int maxImages;
        synchronized (this.f2947b) {
            maxImages = this.f2946a.getMaxImages();
        }
        return maxImages;
    }

    @Override // L.InterfaceC1134y0
    public androidx.camera.core.d f() {
        Image imageAcquireNextImage;
        synchronized (this.f2947b) {
            try {
                imageAcquireNextImage = this.f2946a.acquireNextImage();
            } catch (RuntimeException e10) {
                if (!this.h(e10)) {
                    throw e10;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new androidx.camera.core.a(imageAcquireNextImage);
        }
    }

    @Override // L.InterfaceC1134y0
    public int getHeight() {
        int height;
        synchronized (this.f2947b) {
            height = this.f2946a.getHeight();
        }
        return height;
    }

    @Override // L.InterfaceC1134y0
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f2947b) {
            surface = this.f2946a.getSurface();
        }
        return surface;
    }

    @Override // L.InterfaceC1134y0
    public int getWidth() {
        int width;
        synchronized (this.f2947b) {
            width = this.f2946a.getWidth();
        }
        return width;
    }

    public final boolean h(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }
}
