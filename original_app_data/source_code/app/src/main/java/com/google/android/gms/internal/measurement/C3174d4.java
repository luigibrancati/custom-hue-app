package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3174d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f29438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f29441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f29442e;

    public C3174d4(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, J7.f fVar) {
        this.f29438a = uri;
        this.f29439b = "";
        this.f29440c = "";
        this.f29441d = z10;
        this.f29442e = z12;
    }

    public final C3174d4 a() {
        String str = this.f29439b;
        if (str.isEmpty()) {
            return new C3174d4(null, this.f29438a, str, this.f29440c, true, false, this.f29442e, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final C3174d4 b() {
        return new C3174d4(null, this.f29438a, this.f29439b, this.f29440c, this.f29441d, false, true, false, null);
    }

    public final AbstractC3228j4 c(String str, long j10) {
        Long lValueOf = Long.valueOf(j10);
        Object obj = AbstractC3228j4.f29510g;
        return new Z3(this, str, lValueOf, true);
    }

    public final AbstractC3228j4 d(String str, boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        Object obj = AbstractC3228j4.f29510g;
        return new C3147a4(this, str, boolValueOf, true);
    }

    public final AbstractC3228j4 e(String str, double d10) {
        Double dValueOf = Double.valueOf(-3.0d);
        Object obj = AbstractC3228j4.f29510g;
        return new C3156b4(this, "measurement.test.double_flag", dValueOf, true);
    }

    public final AbstractC3228j4 f(String str, String str2) {
        Object obj = AbstractC3228j4.f29510g;
        return new C3165c4(this, str, str2, true);
    }

    public C3174d4(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
}
