package z;

import E.J;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import java.util.Set;
import w.C6110d;
import y.C6378n;

/* JADX INFO: renamed from: z.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6485e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f48666a;

    /* JADX INFO: renamed from: z.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        DynamicRangeProfiles a();

        Set b();

        Set c(J j10);
    }

    public C6485e(a aVar) {
        this.f48666a = aVar;
    }

    public static C6485e a(C6378n c6378n) {
        C6485e c6485eE = Build.VERSION.SDK_INT >= 33 ? e(C6110d.a(c6378n.a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) : null;
        return c6485eE == null ? g.f48668a : c6485eE;
    }

    public static C6485e e(DynamicRangeProfiles dynamicRangeProfiles) {
        if (dynamicRangeProfiles == null) {
            return null;
        }
        X0.h.j(Build.VERSION.SDK_INT >= 33, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.");
        return new C6485e(new C6486f(dynamicRangeProfiles));
    }

    public Set b(J j10) {
        return this.f48666a.c(j10);
    }

    public Set c() {
        return this.f48666a.b();
    }

    public DynamicRangeProfiles d() {
        X0.h.j(Build.VERSION.SDK_INT >= 33, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
        return this.f48666a.a();
    }
}
