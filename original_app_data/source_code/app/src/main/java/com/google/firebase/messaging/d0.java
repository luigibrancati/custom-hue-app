package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;
import v6.AbstractC6055j;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f31721d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f31724c;

    public d0(String str, String str2) {
        this.f31722a = d(str2, str);
        this.f31723b = str;
        this.f31724c = str + "!" + str2;
    }

    public static d0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("!", -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new d0(strArrSplit[0], strArrSplit[1]);
    }

    public static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f31721d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public static d0 f(String str) {
        return new d0("S", str);
    }

    public static d0 g(String str) {
        return new d0("U", str);
    }

    public String b() {
        return this.f31723b;
    }

    public String c() {
        return this.f31722a;
    }

    public String e() {
        return this.f31724c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f31722a.equals(d0Var.f31722a) && this.f31723b.equals(d0Var.f31723b);
    }

    public int hashCode() {
        return AbstractC6055j.b(this.f31723b, this.f31722a);
    }
}
