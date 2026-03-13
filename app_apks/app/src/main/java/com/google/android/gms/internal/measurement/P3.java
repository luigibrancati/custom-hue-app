package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class P3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0.J f29312a;

    public P3(b0.J j10) {
        this.f29312a = j10;
    }

    public final String a(Uri uri, String str, String str2, String str3) {
        b0.J j10 = uri != null ? (b0.J) this.f29312a.get(uri.toString()) : null;
        if (j10 == null) {
            return null;
        }
        return (String) j10.get("".concat(str3));
    }
}
