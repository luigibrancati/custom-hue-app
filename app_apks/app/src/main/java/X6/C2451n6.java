package X6;

import K7.AbstractC1081v;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.webrtc.WebrtcBuildVersion;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: X6.n6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2451n6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f19133a;

    public C2451n6(Map map) {
        HashMap map2 = new HashMap();
        this.f19133a = map2;
        map2.putAll(map);
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        AbstractC1081v abstractC1081v = AbstractC2467p6.f19159a;
        int size = abstractC1081v.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = (String) abstractC1081v.get(i10);
            Map map = this.f19133a;
            if (map.containsKey(str)) {
                if (sb2.length() > 0) {
                    sb2.append(";");
                }
                sb2.append(str);
                sb2.append("=");
                sb2.append((String) map.get(str));
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle b() {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.C2451n6.b():android.os.Bundle");
    }

    public final String c() {
        String str = (String) this.f19133a.get("PurposeDiagnostics");
        return TextUtils.isEmpty(str) ? "200000" : str;
    }

    public final String d(C2451n6 c2451n6) {
        Map map = c2451n6.f19133a;
        boolean zIsEmpty = map.isEmpty();
        String str = WebrtcBuildVersion.maint_version;
        String str2 = (zIsEmpty || ((String) map.get("Version")) != null) ? WebrtcBuildVersion.maint_version : "1";
        Bundle bundleB = b();
        Bundle bundleB2 = c2451n6.b();
        if (bundleB.size() != bundleB2.size() || !Objects.equals(bundleB.getString("ad_storage"), bundleB2.getString("ad_storage")) || !Objects.equals(bundleB.getString("ad_personalization"), bundleB2.getString("ad_personalization")) || !Objects.equals(bundleB.getString("ad_user_data"), bundleB2.getString("ad_user_data"))) {
            str = "1";
        }
        return str2.concat(str);
    }

    public final String e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("1");
        int i10 = -1;
        try {
            String str = (String) this.f19133a.get("CmpSdkID");
            if (!TextUtils.isEmpty(str)) {
                i10 = Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        if (i10 < 0 || i10 > 4095) {
            sb2.append("00");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 >> 6));
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 & 63));
        }
        int iG = g();
        if (iG < 0 || iG > 63) {
            sb2.append(WebrtcBuildVersion.maint_version);
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iG));
        }
        AbstractC6056k.a(true);
        Map map = this.f19133a;
        int i11 = true != "1".equals(map.get("gdprApplies")) ? 0 : 2;
        int i12 = i11 | 4;
        if ("1".equals(map.get("EnableAdvertiserConsentMode"))) {
            i12 = i11 | 12;
        }
        sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i12));
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2451n6) {
            return a().equalsIgnoreCase(((C2451n6) obj).a());
        }
        return false;
    }

    public final Bundle f() {
        int iG;
        Map map = this.f19133a;
        if ("1".equals(map.get("GoogleConsent")) && (iG = g()) >= 0) {
            String str = (String) map.get("PurposeConsents");
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle = new Bundle();
                String str2 = "denied";
                if (str.length() > 0) {
                    bundle.putString(R3.AD_STORAGE.zze, str.charAt(0) == '1' ? "granted" : "denied");
                }
                if (str.length() > 3) {
                    bundle.putString(R3.AD_PERSONALIZATION.zze, (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
                }
                if (str.length() > 6 && iG >= 4) {
                    String str3 = R3.AD_USER_DATA.zze;
                    if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                        str2 = "granted";
                    }
                    bundle.putString(str3, str2);
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    public final int g() {
        try {
            String str = (String) this.f19133a.get("PolicyVersion");
            if (!TextUtils.isEmpty(str)) {
                return Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        return -1;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }
}
