package x;

import L.t1;
import androidx.camera.camera2.internal.compat.quirk.PreviewUnderExposureQuirk;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class g2 {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47003a;

        static {
            int[] iArr = new int[t1.b.values().length];
            f47003a = iArr;
            try {
                iArr[t1.b.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47003a[t1.b.VIDEO_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47003a[t1.b.STREAM_SHARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47003a[t1.b.PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47003a[t1.b.IMAGE_ANALYSIS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static int a(t1.b bVar, int i10) {
        int i11 = a.f47003a[bVar.ordinal()];
        return i11 != 1 ? (i11 == 2 && A.d.b(PreviewUnderExposureQuirk.class) == null) ? 3 : 1 : i10 == 2 ? 5 : 2;
    }

    public static int b(t1.b bVar, int i10) {
        int i11 = a.f47003a[bVar.ordinal()];
        return i11 != 1 ? (i11 == 2 && A.d.b(PreviewUnderExposureQuirk.class) == null) ? 3 : 1 : i10 == 2 ? 5 : 1;
    }
}
