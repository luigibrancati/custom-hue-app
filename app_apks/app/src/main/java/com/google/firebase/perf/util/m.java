package com.google.firebase.perf.util;

import android.content.Context;
import android.content.res.Resources;
import b9.C2898a;
import java.net.URI;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String[] f31867a;

    public static boolean a(URI uri, Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier == 0) {
            return true;
        }
        C2898a.e().a("Detected domain allowlist, only allowlisted domains will be measured.");
        if (f31867a == null) {
            f31867a = resources.getStringArray(identifier);
        }
        String host = uri.getHost();
        if (host == null) {
            return true;
        }
        for (String str : f31867a) {
            if (host.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
