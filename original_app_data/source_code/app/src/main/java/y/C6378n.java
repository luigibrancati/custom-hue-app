package y;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: y.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C6378n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f48317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48318c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f48316a = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f48319d = null;

    /* JADX INFO: renamed from: y.n$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        CameraCharacteristics a();

        Object b(CameraCharacteristics.Key key);
    }

    public C6378n(CameraCharacteristics cameraCharacteristics, String str) {
        this.f48317b = new C6373i(cameraCharacteristics);
        this.f48318c = str;
    }

    public static C6378n k(CameraCharacteristics cameraCharacteristics, String str) {
        return new C6378n(cameraCharacteristics, str);
    }

    public Object a(CameraCharacteristics.Key key) {
        if (g(key)) {
            return this.f48317b.b(key);
        }
        synchronized (this) {
            try {
                Object obj = this.f48316a.get(key);
                if (obj != null) {
                    return obj;
                }
                Object objB = this.f48317b.b(key);
                if (objB != null) {
                    this.f48316a.put(key, objB);
                }
                return objB;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String b() {
        return this.f48318c;
    }

    public int c() {
        Integer num = (!f() || Build.VERSION.SDK_INT < 35) ? null : (Integer) a(CameraCharacteristics.FLASH_TORCH_STRENGTH_DEFAULT_LEVEL);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public int d() {
        Integer num = (!f() || Build.VERSION.SDK_INT < 35) ? null : (Integer) a(CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public y e() {
        if (this.f48319d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                this.f48319d = y.h(streamConfigurationMap, new B.m(this.f48318c));
            } catch (AssertionError | NullPointerException e10) {
                throw new IllegalArgumentException(e10.getMessage());
            }
        }
        return this.f48319d;
    }

    public final boolean f() {
        Boolean bool = (Boolean) a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        return bool != null && bool.booleanValue();
    }

    public final boolean g(CameraCharacteristics.Key key) {
        return key.equals(CameraCharacteristics.SENSOR_ORIENTATION);
    }

    public boolean h() {
        return f() && Build.VERSION.SDK_INT >= 35 && d() > 1;
    }

    public boolean i() {
        int[] iArr;
        if (Build.VERSION.SDK_INT >= 34 && (iArr = (int[]) this.f48317b.b(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES)) != null) {
            for (int i10 : iArr) {
                if (i10 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public CameraCharacteristics j() {
        return this.f48317b.a();
    }
}
