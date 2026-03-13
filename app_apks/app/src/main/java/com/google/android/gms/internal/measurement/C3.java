package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class C3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E3 f29150a;

    static {
        Uri uri = D3.f29155a;
        f29150a = F3.b();
    }

    public static String a(ContentResolver contentResolver, String str, String str2) {
        return f29150a.a(contentResolver, str, null);
    }
}
