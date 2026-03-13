package y;

import android.hardware.camera2.CameraAccessException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: y.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C6369e extends Exception {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f48308c = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f48309d = Collections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraAccessException f48311b;

    public C6369e(int i10, String str, Throwable th) {
        super(a(i10, str), th);
        this.f48310a = i10;
        this.f48311b = f48308c.contains(Integer.valueOf(i10)) ? new CameraAccessException(i10, str, th) : null;
    }

    public static String a(int i10, String str) {
        return String.format("%s (%d): %s", b(i10), Integer.valueOf(i10), str);
    }

    public static String b(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 != 1000 ? i10 != 10001 ? i10 != 10002 ? "<UNKNOWN ERROR>" : "CAMERA_CHARACTERISTICS_CREATION_ERROR" : "CAMERA_UNAVAILABLE_DO_NOT_DISTURB" : "CAMERA_DEPRECATED_HAL" : "MAX_CAMERAS_IN_USE" : "CAMERA_IN_USE" : "CAMERA_ERROR" : "CAMERA_DISCONNECTED" : "CAMERA_DISABLED";
    }

    public static C6369e d(CameraAccessException cameraAccessException) {
        if (cameraAccessException != null) {
            return new C6369e(cameraAccessException);
        }
        throw new NullPointerException("cameraAccessException should not be null");
    }

    public final int c() {
        return this.f48310a;
    }

    public C6369e(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f48310a = cameraAccessException.getReason();
        this.f48311b = cameraAccessException;
    }
}
