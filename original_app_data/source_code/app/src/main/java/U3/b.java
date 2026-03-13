package U3;

import android.util.Log;
import android.view.Surface;
import app.rive.rive_native.RiveNativePluginKt;
import fc.C4015H;
import io.flutter.view.TextureRegistry;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b implements TextureRegistry.SurfaceProducer.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextureRegistry.SurfaceProducer f16600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Surface f16601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16602c;

    public b(TextureRegistry.SurfaceProducer surfaceProducer, int i10, int i11) {
        AbstractC4862t.e(surfaceProducer, "surfaceProducer");
        this.f16600a = surfaceProducer;
        surfaceProducer.setSize(i10, i11);
        surfaceProducer.setCallback(this);
        Surface surface = surfaceProducer.getSurface();
        AbstractC4862t.d(surface, "getSurface(...)");
        this.f16601b = surface;
        this.f16602c = RiveNativePluginKt.createRiveRenderer(surface, i10, i11);
    }

    public final long a() {
        return this.f16602c;
    }

    public final void b() {
        synchronized (this) {
            try {
                long j10 = this.f16602c;
                if (j10 != 0) {
                    RiveNativePluginKt.markDestroyedRiveRenderer(j10);
                }
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this) {
            long j10 = this.f16602c;
            if (j10 != 0) {
                RiveNativePluginKt.destroyRiveRenderer(j10);
                this.f16602c = 0L;
            }
            try {
                this.f16601b.release();
                this.f16600a.release();
                C4015H c4015h = C4015H.f34254a;
            } catch (Exception e10) {
                Log.w("RiveNativePlugin", "release: error releasing surface: " + e10);
            }
        }
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer.Callback
    public void onSurfaceAvailable() {
        b();
        Surface surface = this.f16600a.getSurface();
        AbstractC4862t.d(surface, "getSurface(...)");
        this.f16601b = surface;
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer.Callback
    public void onSurfaceCleanup() {
        b();
    }
}
