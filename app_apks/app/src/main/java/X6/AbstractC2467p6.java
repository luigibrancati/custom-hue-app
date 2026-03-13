package X6;

import K7.AbstractC1081v;
import K7.AbstractC1083x;
import K7.AbstractC1085z;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.EnumC3255m4;
import com.google.android.gms.internal.measurement.EnumC3264n4;
import java.util.Map;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: renamed from: X6.p6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2467p6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC1081v f19159a = AbstractC1081v.L("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static int b(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public static final boolean c(EnumC3255m4 enumC3255m4, AbstractC1083x abstractC1083x, AbstractC1083x abstractC1083x2, AbstractC1085z abstractC1085z, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        int i15;
        int i16;
        AbstractC1085z abstractC1085z2;
        String str4;
        EnumC2459o6 enumC2459o6;
        char c10;
        int iE = e(enumC3255m4, abstractC1083x, abstractC1083x2, abstractC1085z, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (iE > 0) {
            i16 = i12;
            if (i16 == 1) {
                i15 = i11;
                if (i15 != 1) {
                    i16 = 1;
                } else {
                    i15 = 1;
                    i16 = 1;
                }
            } else {
                i15 = i11;
            }
            cArr[iE] = '2';
        } else {
            i15 = i11;
            i16 = i12;
        }
        if (i(enumC3255m4, abstractC1083x, abstractC1083x2, abstractC1085z, cArr, i10, i15, i16, i13, i14, str, str2, str3, z10, z11, true) == EnumC3264n4.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c10 = '3';
        } else {
            int i17 = i14;
            if (enumC3255m4 == EnumC3255m4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
                abstractC1085z2 = abstractC1085z;
                str4 = str;
                if (i17 == 1) {
                    if (abstractC1085z2.contains(str4)) {
                        if (iE > 0 && cArr[iE] != '2') {
                            cArr[iE] = '1';
                        }
                        return true;
                    }
                    i17 = 1;
                }
            } else {
                abstractC1085z2 = abstractC1085z;
                str4 = str;
            }
            if (abstractC1083x.containsKey(enumC3255m4) && (enumC2459o6 = (EnumC2459o6) abstractC1083x.get(enumC3255m4)) != null) {
                int iOrdinal = enumC2459o6.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return i(enumC3255m4, abstractC1083x, abstractC1083x2, abstractC1085z, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) == EnumC3264n4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? h(enumC3255m4, abstractC1083x, abstractC1083x2, abstractC1085z, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) : g(enumC3255m4, abstractC1083x, abstractC1083x2, abstractC1085z, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                        }
                        if (iOrdinal == 3) {
                            return i(enumC3255m4, abstractC1083x, abstractC1083x2, abstractC1085z2, cArr, i10, i15, i16, i13, i17, str4, str2, str3, z10, z11, true) == EnumC3264n4.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? g(enumC3255m4, abstractC1083x, abstractC1083x2, abstractC1085z, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) : h(enumC3255m4, abstractC1083x, abstractC1083x2, abstractC1085z, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                        }
                        c10 = '0';
                    } else if (i(enumC3255m4, abstractC1083x, abstractC1083x2, abstractC1085z, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) != EnumC3264n4.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return h(enumC3255m4, abstractC1083x, abstractC1083x2, abstractC1085z, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                    }
                } else if (i(enumC3255m4, abstractC1083x, abstractC1083x2, abstractC1085z, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) != EnumC3264n4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return g(enumC3255m4, abstractC1083x, abstractC1083x2, abstractC1085z, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                }
                c10 = '8';
            } else {
                c10 = '0';
            }
        }
        if (iE <= 0 || cArr[iE] == '2') {
            return false;
        }
        cArr[iE] = c10;
        return false;
    }

    public static final Map d(AbstractC1083x abstractC1083x, AbstractC1083x abstractC1083x2, AbstractC1085z abstractC1085z, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        if (!z12) {
            return AbstractC1083x.j();
        }
        EnumC3255m4 enumC3255m4 = EnumC3255m4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        EnumC3264n4 enumC3264n4 = (EnumC3264n4) abstractC1083x2.get(enumC3255m4);
        EnumC3255m4 enumC3255m42 = EnumC3255m4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        EnumC3264n4 enumC3264n42 = (EnumC3264n4) abstractC1083x2.get(enumC3255m42);
        EnumC3255m4 enumC3255m43 = EnumC3255m4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        EnumC3264n4 enumC3264n43 = (EnumC3264n4) abstractC1083x2.get(enumC3255m43);
        EnumC3255m4 enumC3255m44 = EnumC3255m4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        EnumC3264n4 enumC3264n44 = (EnumC3264n4) abstractC1083x2.get(enumC3255m44);
        return AbstractC1083x.a().f("Version", "2").f("VendorConsent", true != z10 ? WebrtcBuildVersion.maint_version : "1").f("VendorLegitimateInterest", true != z11 ? WebrtcBuildVersion.maint_version : "1").f("gdprApplies", i12 != 1 ? WebrtcBuildVersion.maint_version : "1").f("EnableAdvertiserConsentMode", i11 != 1 ? WebrtcBuildVersion.maint_version : "1").f("PolicyVersion", String.valueOf(i13)).f("CmpSdkID", String.valueOf(i10)).f("PurposeOneTreatment", i14 != 1 ? WebrtcBuildVersion.maint_version : "1").f("PublisherCC", str).f("PublisherRestrictions1", String.valueOf(enumC3264n4 != null ? enumC3264n4.zza() : EnumC3264n4.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions3", String.valueOf(enumC3264n42 != null ? enumC3264n42.zza() : EnumC3264n4.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions4", String.valueOf(enumC3264n43 != null ? enumC3264n43.zza() : EnumC3264n4.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions7", String.valueOf(enumC3264n44 != null ? enumC3264n44.zza() : EnumC3264n4.PURPOSE_RESTRICTION_UNDEFINED.zza())).i(AbstractC1083x.l("Purpose1", f(enumC3255m4, abstractC1083x, abstractC1083x2, abstractC1085z, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose3", f(enumC3255m42, abstractC1083x, abstractC1083x2, abstractC1085z, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose4", f(enumC3255m43, abstractC1083x, abstractC1083x2, abstractC1085z, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose7", f(enumC3255m44, abstractC1083x, abstractC1083x2, abstractC1085z, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true))).i(AbstractC1083x.m("AuthorizePurpose1", true != c(enumC3255m4, abstractC1083x, abstractC1083x2, abstractC1085z, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? WebrtcBuildVersion.maint_version : "1", "AuthorizePurpose3", true != c(enumC3255m42, abstractC1083x, abstractC1083x2, abstractC1085z, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? WebrtcBuildVersion.maint_version : "1", "AuthorizePurpose4", true != c(enumC3255m43, abstractC1083x, abstractC1083x2, abstractC1085z, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? WebrtcBuildVersion.maint_version : "1", "AuthorizePurpose7", true != c(enumC3255m44, abstractC1083x, abstractC1083x2, abstractC1085z, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? WebrtcBuildVersion.maint_version : "1", "PurposeDiagnostics", new String(cArr))).c();
    }

    public static final int e(EnumC3255m4 enumC3255m4, AbstractC1083x abstractC1083x, AbstractC1083x abstractC1083x2, AbstractC1085z abstractC1085z, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        if (enumC3255m4 == EnumC3255m4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (enumC3255m4 == EnumC3255m4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (enumC3255m4 == EnumC3255m4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return enumC3255m4 == EnumC3255m4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final String f(EnumC3255m4 enumC3255m4, AbstractC1083x abstractC1083x, AbstractC1083x abstractC1083x2, AbstractC1085z abstractC1085z, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        String strValueOf = WebrtcBuildVersion.maint_version;
        String strValueOf2 = (zIsEmpty || str2.length() < enumC3255m4.zza()) ? WebrtcBuildVersion.maint_version : String.valueOf(str2.charAt(enumC3255m4.zza() - 1));
        if (!TextUtils.isEmpty(str3) && str3.length() >= enumC3255m4.zza()) {
            strValueOf = String.valueOf(str3.charAt(enumC3255m4.zza() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    public static final boolean g(EnumC3255m4 enumC3255m4, AbstractC1083x abstractC1083x, AbstractC1083x abstractC1083x2, AbstractC1085z abstractC1085z, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        char c10;
        int iE = e(enumC3255m4, abstractC1083x, abstractC1083x2, abstractC1085z, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (!z10) {
            c10 = '4';
        } else {
            if (str2.length() >= enumC3255m4.zza()) {
                char cCharAt = str2.charAt(enumC3255m4.zza() - 1);
                boolean z13 = cCharAt == '1';
                if (iE > 0 && cArr[iE] != '2') {
                    cArr[iE] = cCharAt != '1' ? '6' : '1';
                }
                return z13;
            }
            c10 = '0';
        }
        if (iE > 0 && cArr[iE] != '2') {
            cArr[iE] = c10;
        }
        return false;
    }

    public static final boolean h(EnumC3255m4 enumC3255m4, AbstractC1083x abstractC1083x, AbstractC1083x abstractC1083x2, AbstractC1085z abstractC1085z, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        char c10;
        int iE = e(enumC3255m4, abstractC1083x, abstractC1083x2, abstractC1085z, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (!z11) {
            c10 = '5';
        } else {
            if (str3.length() >= enumC3255m4.zza()) {
                char cCharAt = str3.charAt(enumC3255m4.zza() - 1);
                boolean z13 = cCharAt == '1';
                if (iE > 0 && cArr[iE] != '2') {
                    cArr[iE] = cCharAt != '1' ? '7' : '1';
                }
                return z13;
            }
            c10 = '0';
        }
        if (iE > 0 && cArr[iE] != '2') {
            cArr[iE] = c10;
        }
        return false;
    }

    public static final EnumC3264n4 i(EnumC3255m4 enumC3255m4, AbstractC1083x abstractC1083x, AbstractC1083x abstractC1083x2, AbstractC1085z abstractC1085z, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        return (EnumC3264n4) abstractC1083x2.getOrDefault(enumC3255m4, EnumC3264n4.PURPOSE_RESTRICTION_UNDEFINED);
    }
}
