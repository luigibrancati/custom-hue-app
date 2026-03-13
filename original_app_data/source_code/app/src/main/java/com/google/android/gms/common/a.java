package com.google.android.gms.common;

import B6.i;
import D6.d;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.t;
import com.google.ar.core.ImageMetadata;
import io.sentry.protocol.SentryStackFrame;
import s6.AbstractC5788g;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f29014a = AbstractC5788g.f44160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f29015b = new a();

    public static a f() {
        return f29015b;
    }

    public int a(Context context) {
        return AbstractC5788g.a(context);
    }

    public Intent b(Context context, int i10, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts(SentryStackFrame.JsonKeys.PACKAGE, "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && i.d(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("gcore_");
        sb2.append(f29014a);
        sb2.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append("-");
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append("-");
        if (context != null) {
            try {
                sb2.append(d.a(context).e(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb2.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(ImageMetadata.LENS_APERTURE);
        return intent3;
    }

    public PendingIntent c(Context context, int i10, int i11) {
        return d(context, i10, i11, null);
    }

    public PendingIntent d(Context context, int i10, int i11, String str) {
        Intent intentB = b(context, i10, str);
        if (intentB == null) {
            return null;
        }
        return t.b(context, i11, intentB, 134217728, false);
    }

    public String e(int i10) {
        return AbstractC5788g.b(i10);
    }

    public int g(Context context) {
        return h(context, f29014a);
    }

    public int h(Context context, int i10) {
        int iF = AbstractC5788g.f(context, i10);
        if (AbstractC5788g.g(context, iF)) {
            return 18;
        }
        return iF;
    }

    public boolean i(Context context, String str) {
        return AbstractC5788g.k(context, str);
    }

    public boolean j(int i10) {
        return AbstractC5788g.i(i10);
    }
}
