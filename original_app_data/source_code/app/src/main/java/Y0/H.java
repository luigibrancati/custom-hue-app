package Y0;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import io.sentry.ProfileChunk;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class H {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static float a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        public static float b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {
        public static boolean a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {
        public static int a(ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i10, i11, i12);
        }

        public static int b(ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i10, i11, i12);
        }
    }

    public static int a(Resources resources, int i10, X0.j jVar, int i11) {
        int dimensionPixelSize;
        return i10 != -1 ? (i10 == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i10)) < 0) ? i11 : dimensionPixelSize : ((Integer) jVar.get()).intValue();
    }

    public static int b(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, ProfileChunk.PLATFORM_ANDROID);
    }

    public static int c(Resources resources, int i10, int i11) {
        if (i10 == 4194304 && i11 == 26) {
            return b(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static int d(Resources resources, int i10, int i11) {
        if (i10 == 4194304 && i11 == 26) {
            return b(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static float e(ViewConfiguration viewConfiguration, Context context) {
        return a.a(viewConfiguration);
    }

    public static int f(Context context, final ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.a(viewConfiguration, i10, i11, i12);
        }
        if (!i(i10, i11, i12)) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int iC = c(resources, i12, i11);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, iC, new X0.j() { // from class: Y0.F
            @Override // X0.j
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
            }
        }, Integer.MIN_VALUE);
    }

    public static int g(Context context, final ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.b(viewConfiguration, i10, i11, i12);
        }
        if (!i(i10, i11, i12)) {
            return Integer.MAX_VALUE;
        }
        Resources resources = context.getResources();
        int iD = d(resources, i12, i11);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, iD, new X0.j() { // from class: Y0.G
            @Override // X0.j
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
            }
        }, Integer.MAX_VALUE);
    }

    public static float h(ViewConfiguration viewConfiguration, Context context) {
        return a.b(viewConfiguration);
    }

    public static boolean i(int i10, int i11, int i12) {
        InputDevice device = InputDevice.getDevice(i10);
        return (device == null || device.getMotionRange(i11, i12) == null) ? false : true;
    }

    public static boolean j(ViewConfiguration viewConfiguration, Context context) {
        return b.a(viewConfiguration);
    }
}
