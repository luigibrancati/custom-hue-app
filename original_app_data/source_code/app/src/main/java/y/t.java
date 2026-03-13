package y;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.util.ArrayMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f48323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f48324b = new ArrayMap(4);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        static a h(Context context, Handler handler) {
            return new w(context);
        }

        CameraManager a();

        void b(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        CameraCharacteristics c(String str);

        Set d();

        void e(String str, Executor executor, CameraDevice.StateCallback stateCallback);

        String[] f();

        void g(CameraManager.AvailabilityCallback availabilityCallback);
    }

    public t(a aVar) {
        this.f48323a = aVar;
    }

    public static t a(Context context) {
        return b(context, M.m.a());
    }

    public static t b(Context context, Handler handler) {
        return new t(a.h(context, handler));
    }

    public C6378n c(String str) {
        C6378n c6378nK;
        synchronized (this.f48324b) {
            c6378nK = (C6378n) this.f48324b.get(str);
            if (c6378nK == null) {
                try {
                    c6378nK = C6378n.k(this.f48323a.c(str), str);
                    this.f48324b.put(str, c6378nK);
                } catch (AssertionError e10) {
                    throw new C6369e(10002, e10.getMessage(), e10);
                }
            }
        }
        return c6378nK;
    }

    public String[] d() {
        return this.f48323a.f();
    }

    public Set e() {
        return this.f48323a.d();
    }

    public void f(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        this.f48323a.e(str, executor, stateCallback);
    }

    public void g(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f48323a.b(executor, availabilityCallback);
    }

    public void h(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f48323a.g(availabilityCallback);
    }

    public CameraManager i() {
        return this.f48323a.a();
    }
}
