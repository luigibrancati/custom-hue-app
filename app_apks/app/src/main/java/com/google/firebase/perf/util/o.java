package com.google.firebase.perf.util;

import android.content.Context;
import android.content.pm.PackageManager;
import b9.C2898a;
import pe.v;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f31869a;

    public static void a(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean b(Context context) {
        Boolean bool = f31869a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean boolValueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            f31869a = boolValueOf;
            return boolValueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            C2898a.e().a("No perf logcat meta data found " + e10.getMessage());
            return false;
        }
    }

    public static int c(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static String d(String str) {
        v vVarL = v.l(str);
        return vVarL != null ? vVarL.j().D("").k("").p(null).d(null).toString() : str;
    }

    public static String e(String str, int i10) {
        int iLastIndexOf;
        if (str.length() <= i10) {
            return str;
        }
        if (str.charAt(i10) == '/') {
            return str.substring(0, i10);
        }
        v vVarL = v.l(str);
        return vVarL == null ? str.substring(0, i10) : (vVarL.c().lastIndexOf(47) < 0 || (iLastIndexOf = str.lastIndexOf(47, i10 + (-1))) < 0) ? str.substring(0, i10) : str.substring(0, iLastIndexOf);
    }
}
