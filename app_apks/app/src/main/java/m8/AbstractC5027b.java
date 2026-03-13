package m8;

import K7.AbstractC1081v;
import K7.AbstractC1085z;
import X6.V3;
import android.os.Bundle;
import io.sentry.protocol.App;

/* JADX INFO: renamed from: m8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5027b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC1085z f40202a = AbstractC1085z.I("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC1081v f40203b = AbstractC1081v.J("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC1081v f40204c = AbstractC1081v.E("auto", App.TYPE, "am");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC1081v f40205d = AbstractC1081v.B("_r", "_dbg");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC1081v f40206e = new AbstractC1081v.a().i(V3.f18616a).i(V3.f18617b).k();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC1081v f40207f = AbstractC1081v.B("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static boolean a(String str) {
        return !f40204c.contains(str);
    }

    public static boolean b(String str, Bundle bundle) {
        if (f40203b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        AbstractC1081v abstractC1081v = f40205d;
        int size = abstractC1081v.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zContainsKey = bundle.containsKey((String) abstractC1081v.get(i10));
            i10++;
            if (zContainsKey) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(String str) {
        return !f40202a.contains(str);
    }

    public static boolean d(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f40206e.contains(str2)) {
            return false;
        }
        AbstractC1081v abstractC1081v = f40207f;
        int size = abstractC1081v.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zMatches = str2.matches((String) abstractC1081v.get(i10));
            i10++;
            if (zMatches) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!a(str) || bundle == null) {
            return false;
        }
        AbstractC1081v abstractC1081v = f40205d;
        int size = abstractC1081v.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zContainsKey = bundle.containsKey((String) abstractC1081v.get(i10));
            i10++;
            if (zContainsKey) {
                return false;
            }
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 101200) {
            if (iHashCode != 101230) {
                if (iHashCode == 3142703 && str.equals("fiam")) {
                    bundle.putString("_cis", "fiam_integration");
                    return true;
                }
            } else if (str.equals("fdl")) {
                bundle.putString("_cis", "fdl_integration");
                return true;
            }
        } else if (str.equals("fcm")) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        return false;
    }
}
