package com.google.android.gms.internal.measurement;

import android.net.Uri;
import b0.C2777a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2777a f29391a = new C2777a();

    public static synchronized Uri a(String str) {
        C2777a c2777a = f29391a;
        Uri uri = (Uri) c2777a.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        c2777a.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
