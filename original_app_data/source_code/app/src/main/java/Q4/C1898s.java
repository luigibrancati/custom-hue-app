package Q4;

import android.content.Context;
import android.net.Uri;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import kotlin.jvm.internal.AbstractC4862t;
import l1.AbstractC4870a;

/* JADX INFO: renamed from: Q4.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1898s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1898s f13894a = new C1898s();

    public final void a(Context context, Uri parentDirectoryUri, String newDirectoryName, boolean z10, MethodChannel.Result result) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(parentDirectoryUri, "parentDirectoryUri");
        AbstractC4862t.e(newDirectoryName, "newDirectoryName");
        AbstractC4862t.e(result, "result");
        if (AbstractC4862t.a(parentDirectoryUri.getScheme(), Constants.FILE)) {
            String path = parentDirectoryUri.getPath();
            AbstractC4862t.b(path);
            File file = new File(path);
            if (!file.exists() || !file.isDirectory()) {
                result.error("INVALID_PARENT_URI", "Invalid or inaccessible parent directory URI", null);
                return;
            }
            File file2 = new File(file, Od.F.f1(newDirectoryName, File.separatorChar));
            try {
                if (file2.exists() || file2.mkdirs()) {
                    result.success(Uri.fromFile(file2).toString());
                    return;
                }
                result.error("CREATE_FAILED", "Failed to create directory: " + file2.getAbsolutePath(), null);
                return;
            } catch (Exception e10) {
                result.error("CREATE_FAILED", "Error creating directory: " + e10.getMessage(), null);
                return;
            }
        }
        AbstractC4870a abstractC4870aG = AbstractC4870a.g(context, parentDirectoryUri);
        if (abstractC4870aG == null || !abstractC4870aG.d() || !abstractC4870aG.k()) {
            result.error("INVALID_PARENT_URI", "Invalid or inaccessible parent directory URI", null);
            return;
        }
        char c10 = File.separatorChar;
        try {
            for (String str : Od.F.H0(Od.F.f1(newDirectoryName, c10), new char[]{c10}, false, 0, 6, null)) {
                AbstractC4870a abstractC4870aE = abstractC4870aG.e(str);
                if (abstractC4870aE == null || !abstractC4870aE.d()) {
                    abstractC4870aG = abstractC4870aG.a(str);
                } else {
                    if (!abstractC4870aE.k()) {
                        result.error("INVALID_PATH", "Invalid path: " + str + " is not a directory", null);
                        return;
                    }
                    abstractC4870aG = abstractC4870aE;
                }
                if (abstractC4870aG == null) {
                    result.error("CREATE_FAILED", "Failed to create directory: " + str, null);
                    return;
                }
                if (z10) {
                    context.getContentResolver().takePersistableUriPermission(abstractC4870aG.j(), 3);
                }
            }
            result.success(abstractC4870aG.j().toString());
        } catch (Exception e11) {
            result.error("CREATE_FAILED", "Error creating directory: " + e11.getMessage(), null);
        }
    }
}
