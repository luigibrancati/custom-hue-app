package u8;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f45296a;

    public static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    public synchronized String a(Context context) {
        try {
            if (this.f45296a == null) {
                this.f45296a = b(context);
            }
        } finally {
        }
        return "".equals(this.f45296a) ? null : this.f45296a;
    }
}
