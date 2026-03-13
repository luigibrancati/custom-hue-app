package Ja;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.SigningInfo;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f6371d = {".debug", ".canary", ".partners", ""};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f6372e = {"25a9b2d2745c098361edaa3b87936dc29a28e7f1", "80abdd17dcc4cb3a33815d354355bf87c9378624", "88df4d670ed5e01fc7b3eff13b63258628ff5a00", "d834ae340d1e854c5f4092722f9788216d9221e5", "1cbedd9e7345f64649bad2b493a20d9eea955352", "4b3d76a2de89033ea830f476a1f815692938e33b"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f6373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.spotify.sdk.android.auth.c f6374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f6375c;

    public d(Activity activity, com.spotify.sdk.android.auth.c cVar, a aVar) {
        this.f6373a = activity;
        this.f6374b = cVar;
        this.f6375c = aVar;
    }

    public static Intent a(Context context, a aVar) {
        Intent intentD = null;
        for (String str : f6371d) {
            intentD = d(context, "com.spotify.music" + str, aVar);
            if (intentD != null) {
                return intentD;
            }
        }
        return intentD;
    }

    public static Intent d(Context context, String str, a aVar) {
        Intent intent = new Intent("com.spotify.sso.action.START_AUTH_FLOW");
        intent.setPackage(str);
        ComponentName componentNameResolveActivity = intent.resolveActivity(context.getPackageManager());
        if (componentNameResolveActivity != null && e(context, componentNameResolveActivity.getPackageName(), aVar)) {
            return intent;
        }
        return null;
    }

    public static boolean e(Context context, String str, a aVar) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 134217728);
            SigningInfo signingInfo = packageInfo.signingInfo;
            if (signingInfo == null) {
                return false;
            }
            return signingInfo.hasMultipleSigners() ? f(aVar, packageInfo.signingInfo.getApkContentsSigners()) : f(aVar, packageInfo.signingInfo.getSigningCertificateHistory());
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean f(Ja.a r8, android.content.pm.Signature[] r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L2c
            int r1 = r9.length
            if (r1 != 0) goto L7
            goto L2c
        L7:
            int r1 = r9.length
            r2 = r0
        L9:
            if (r2 >= r1) goto L2a
            r3 = r9[r2]
            java.lang.String r3 = r3.toCharsString()
            java.lang.String r3 = r8.a(r3)
            java.lang.String[] r4 = Ja.d.f6372e
            int r5 = r4.length
            r6 = r0
        L19:
            if (r6 >= r5) goto L29
            r7 = r4[r6]
            boolean r7 = r7.equalsIgnoreCase(r3)
            if (r7 == 0) goto L26
            int r2 = r2 + 1
            goto L9
        L26:
            int r6 = r6 + 1
            goto L19
        L29:
            return r0
        L2a:
            r8 = 1
            return r8
        L2c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ja.d.f(Ja.a, android.content.pm.Signature[]):boolean");
    }

    public boolean b() {
        Intent intentA = a(this.f6373a, this.f6375c);
        if (intentA == null) {
            return false;
        }
        intentA.putExtra("VERSION", 1);
        intentA.putExtra("CLIENT_ID", this.f6374b.b());
        intentA.putExtra("REDIRECT_URI", this.f6374b.c());
        intentA.putExtra("RESPONSE_TYPE", this.f6374b.d());
        intentA.putExtra("SCOPES", this.f6374b.e());
        intentA.putExtra("STATE", this.f6374b.f());
        try {
            this.f6373a.startActivityForResult(intentA, 1138);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    public void c() {
        this.f6373a.finishActivity(1138);
    }
}
