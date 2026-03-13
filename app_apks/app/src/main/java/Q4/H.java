package Q4;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class H {
    public static final boolean a(Activity activity, String filePathOrUriString, String mimeType) {
        AbstractC4862t.e(activity, "activity");
        AbstractC4862t.e(filePathOrUriString, "filePathOrUriString");
        AbstractC4862t.e(mimeType, "mimeType");
        Uri uriForFile = Uri.parse(filePathOrUriString);
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            if (!AbstractC4862t.a(uriForFile.getScheme(), "content") && !AbstractC4862t.a(uriForFile.getScheme(), Constants.FILE)) {
                uriForFile = L0.b.getUriForFile(activity, activity.getPackageName() + ".com.bbflight.background_downloader.fileprovider", new File(filePathOrUriString));
            }
            intent.setDataAndType(uriForFile, mimeType);
            intent.addFlags(268435459);
            activity.startActivity(intent);
            return true;
        } catch (Exception e10) {
            Log.i("BackgroundDownloader", "Failed to open file " + filePathOrUriString + ": " + e10);
            return false;
        }
    }
}
