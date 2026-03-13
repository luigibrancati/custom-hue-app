package n4;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.StatFs;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.ar.core.ImageMetadata;
import io.sentry.SentryReplayEvent;
import java.io.File;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f40574a = new n();

    public final int a(int i10, int i11, Bitmap.Config config) {
        return i10 * i11 * AbstractC5085a.b(config);
    }

    public final long b(Context context, double d10) {
        int largeMemoryClass;
        Object objK;
        AbstractC4862t.e(context, "context");
        try {
            objK = L0.a.k(context, ActivityManager.class);
        } catch (Exception unused) {
            largeMemoryClass = 256;
        }
        if (objK != null) {
            ActivityManager activityManager = (ActivityManager) objK;
            largeMemoryClass = (context.getApplicationInfo().flags & ImageMetadata.SHADING_MODE) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
            double d11 = d10 * ((double) largeMemoryClass);
            double d12 = RecognitionOptions.UPC_E;
            return (long) (d11 * d12 * d12);
        }
        throw new IllegalStateException(("System service of type " + ActivityManager.class + " was not found.").toString());
    }

    public final long c(File cacheDirectory) {
        AbstractC4862t.e(cacheDirectory, "cacheDirectory");
        try {
            StatFs statFs = new StatFs(cacheDirectory.getAbsolutePath());
            return Bc.k.l((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), SentryReplayEvent.REPLAY_VIDEO_MAX_SIZE, 262144000L);
        } catch (Exception unused) {
            return SentryReplayEvent.REPLAY_VIDEO_MAX_SIZE;
        }
    }

    public final Bitmap.Config d() {
        return Bitmap.Config.HARDWARE;
    }

    public final double e(Context context) {
        AbstractC4862t.e(context, "context");
        try {
            Object objK = L0.a.k(context, ActivityManager.class);
            if (objK != null) {
                return ((ActivityManager) objK).isLowRamDevice() ? 0.15d : 0.2d;
            }
            throw new IllegalStateException(("System service of type " + ActivityManager.class + " was not found.").toString());
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    public final double f() {
        return 0.0d;
    }

    public final File g(Context context) {
        AbstractC4862t.e(context, "context");
        File file = new File(context.getCacheDir(), "image_cache");
        file.mkdirs();
        return file;
    }
}
