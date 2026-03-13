package T1;

import D1.o;
import T1.z;
import android.media.MediaCodecInfo;
import android.os.Build;
import io.flutter.plugin.platform.PlatformPlugin;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f15974a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
            List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            int iC = c(supportedPerformancePoints, new MediaCodecInfo.VideoCapabilities.PerformancePoint(i10, i11, (int) d10));
            if (iC == 1 && q.f15974a == null) {
                Boolean unused = q.f15974a = Boolean.valueOf(d());
                if (q.f15974a.booleanValue()) {
                    return 0;
                }
            }
            return iC;
        }

        public static int b(boolean z10) {
            MediaCodecInfo.VideoCapabilities videoCapabilities;
            List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
            try {
                D1.o oVarP = new o.b().y0("video/avc").P();
                if (oVarP.f1805o != null) {
                    List listM = z.m(u.f16055a, oVarP, z10, false);
                    for (int i10 = 0; i10 < listM.size(); i10++) {
                        if (((p) listM.get(i10)).f15962d != null && (videoCapabilities = ((p) listM.get(i10)).f15962d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                            return c(supportedPerformancePoints, new MediaCodecInfo.VideoCapabilities.PerformancePoint(PlatformPlugin.DEFAULT_SYSTEM_UI, 720, 60));
                        }
                    }
                }
            } catch (z.c unused) {
            }
            return 0;
        }

        public static int c(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (((MediaCodecInfo.VideoCapabilities.PerformancePoint) list.get(i10)).covers(performancePoint)) {
                    return 2;
                }
            }
            return 1;
        }

        public static boolean d() {
            if (Build.VERSION.SDK_INT >= 35) {
                return false;
            }
            int iB = b(false);
            int iB2 = b(true);
            if (iB == 0) {
                return true;
            }
            return iB2 == 0 ? iB != 2 : (iB == 2 && iB2 == 2) ? false : true;
        }
    }

    public static int c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Boolean bool = f15974a;
        if (bool == null || !bool.booleanValue()) {
            return a.a(videoCapabilities, i10, i11, d10);
        }
        return 0;
    }
}
