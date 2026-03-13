package Q4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Q4.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1899t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1899t f13896a = new C1899t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static MethodChannel.Result f13897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f13898c;

    public final boolean a(Context context, int i10, int i11, Intent intent) {
        AbstractC4862t.e(context, "context");
        if (i10 != 165465106) {
            return false;
        }
        if (i11 == -1) {
            Uri data = intent != null ? intent.getData() : null;
            if (f13898c && data != null) {
                context.getContentResolver().takePersistableUriPermission(data, 3);
            }
            MethodChannel.Result result = f13897b;
            if (result != null) {
                result.success(data != null ? data.toString() : null);
            }
        } else {
            MethodChannel.Result result2 = f13897b;
            if (result2 != null) {
                result2.success(null);
            }
        }
        f13897b = null;
        return true;
    }

    public final boolean b(Activity activity, P p10, Uri uri, boolean z10, MethodChannel.Result result) {
        AbstractC4862t.e(activity, "activity");
        AbstractC4862t.e(result, "result");
        if (f13897b != null) {
            Log.w("DirectoryPicker", "Directory picker already in progress");
            return false;
        }
        f13897b = result;
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        intent.setFlags(3);
        if (z10) {
            intent.setFlags(intent.getFlags() | 64);
        }
        if (p10 != null || uri != null) {
            if (uri == null) {
                AbstractC4862t.b(p10);
                uri = t0.b(p10);
            }
            intent.putExtra("android.provider.extra.INITIAL_URI", uri);
        }
        f13898c = z10;
        activity.startActivityForResult(intent, 165465106);
        return true;
    }
}
