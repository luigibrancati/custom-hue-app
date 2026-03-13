package fb;

import fc.C4032o;
import io.flutter.embedding.engine.systemchannels.PlatformChannel;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34239a;

        static {
            int[] iArr = new int[PlatformChannel.DeviceOrientation.values().length];
            try {
                iArr[PlatformChannel.DeviceOrientation.PORTRAIT_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlatformChannel.DeviceOrientation.PORTRAIT_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlatformChannel.DeviceOrientation.LANDSCAPE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlatformChannel.DeviceOrientation.LANDSCAPE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f34239a = iArr;
        }
    }

    public static final String a(PlatformChannel.DeviceOrientation deviceOrientation) {
        AbstractC4862t.e(deviceOrientation, "<this>");
        int i10 = a.f34239a[deviceOrientation.ordinal()];
        if (i10 == 1) {
            return "PORTRAIT_UP";
        }
        if (i10 == 2) {
            return "PORTRAIT_DOWN";
        }
        if (i10 == 3) {
            return "LANDSCAPE_LEFT";
        }
        if (i10 == 4) {
            return "LANDSCAPE_RIGHT";
        }
        throw new C4032o();
    }
}
