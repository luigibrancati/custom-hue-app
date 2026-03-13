package u8;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.List;
import r8.C5677f;

/* JADX INFO: renamed from: u8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5984a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f45315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f45316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f45317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f45318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f45319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C5677f f45320h;

    public C5984a(String str, String str2, List list, String str3, String str4, String str5, String str6, C5677f c5677f) {
        this.f45313a = str;
        this.f45314b = str2;
        this.f45315c = list;
        this.f45316d = str3;
        this.f45317e = str4;
        this.f45318f = str5;
        this.f45319g = str6;
        this.f45320h = c5677f;
    }

    public static C5984a a(Context context, M m10, String str, String str2, List list, C5677f c5677f) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String strG = m10.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strB = b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C5984a(str, str2, list, strG, packageName, strB, str3, c5677f);
    }

    public static String b(PackageInfo packageInfo) {
        return Long.toString(packageInfo.getLongVersionCode());
    }
}
