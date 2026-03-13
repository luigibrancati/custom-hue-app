package com.braze.managers;

import Od.C;
import android.net.Uri;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {
    public static String a(String host, String mite, String auth, String str, int i10) {
        AbstractC4862t.e(host, "host");
        AbstractC4862t.e(mite, "mite");
        AbstractC4862t.e(auth, "auth");
        if (!C.P(host, "http://", false, 2, null) && !C.P(host, "https://", false, 2, null)) {
            host = "https://" + host;
        }
        Uri.Builder builderBuildUpon = Uri.parse(host).buildUpon();
        builderBuildUpon.appendPath("sse");
        builderBuildUpon.appendQueryParameter("mite", mite);
        builderBuildUpon.appendQueryParameter("auth", auth);
        builderBuildUpon.appendQueryParameter("attempts", String.valueOf(i10));
        if (str != null) {
            builderBuildUpon.appendQueryParameter("rcs", str);
        }
        String string = builderBuildUpon.build().toString();
        AbstractC4862t.d(string, "toString(...)");
        return string;
    }
}
