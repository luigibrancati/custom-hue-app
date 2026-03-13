package com.hiennv.flutter_callkit_incoming;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, d2 = {"Lcom/hiennv/flutter_callkit_incoming/AppUtils;", "", "<init>", "()V", "getAppIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "action", "", "data", "Landroid/os/Bundle;", "flutter_callkit_incoming_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AppUtils {
    public static final AppUtils INSTANCE = new AppUtils();

    private AppUtils() {
    }

    public static /* synthetic */ Intent getAppIntent$default(AppUtils appUtils, Context context, String str, Bundle bundle, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            bundle = null;
        }
        return appUtils.getAppIntent(context, str, bundle);
    }

    public final Intent getAppIntent(Context context, String action, Bundle data) {
        AbstractC4862t.e(context, "context");
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        Intent intentCloneFilter = launchIntentForPackage != null ? launchIntentForPackage.cloneFilter() : null;
        if (intentCloneFilter != null) {
            intentCloneFilter.addFlags(604110848);
        }
        if (intentCloneFilter != null) {
            intentCloneFilter.putExtra(FlutterCallkitIncomingPlugin.EXTRA_CALLKIT_CALL_DATA, data);
        }
        if (intentCloneFilter != null) {
            intentCloneFilter.setAction(action);
        }
        return intentCloneFilter;
    }
}
