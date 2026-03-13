package z3;

import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;
import kotlin.jvm.internal.M;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f48718a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f48719b = M.b(e.class).l();

    public final int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            if (c.f48710a.a() != j.LOG) {
                return 0;
            }
            Log.d(f48719b, "Embedding extension version not found");
            return 0;
        } catch (NullPointerException unused2) {
            if (c.f48710a.a() != j.LOG) {
                return 0;
            }
            Log.d(f48719b, "Error with Extension implementation");
            return 0;
        } catch (UnsupportedOperationException unused3) {
            if (c.f48710a.a() != j.LOG) {
                return 0;
            }
            Log.d(f48719b, "Stub Extension");
            return 0;
        }
    }
}
