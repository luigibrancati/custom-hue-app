package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3444p extends AbstractC6157a {
    public static final Parcelable.Creator<C3444p> CREATOR = new I();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f29892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f29893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3439o f29894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3439o f29895g;

    public C3444p(String str, String str2, String str3, String str4, String str5, C3439o c3439o, C3439o c3439o2) {
        this.f29889a = str;
        this.f29890b = str2;
        this.f29891c = str3;
        this.f29892d = str4;
        this.f29893e = str5;
        this.f29894f = c3439o;
        this.f29895g = c3439o2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f29889a;
        int iA = w6.c.a(parcel);
        w6.c.w(parcel, 1, str, false);
        w6.c.w(parcel, 2, this.f29890b, false);
        w6.c.w(parcel, 3, this.f29891c, false);
        w6.c.w(parcel, 4, this.f29892d, false);
        w6.c.w(parcel, 5, this.f29893e, false);
        w6.c.u(parcel, 6, this.f29894f, i10, false);
        w6.c.u(parcel, 7, this.f29895g, i10, false);
        w6.c.b(parcel, iA);
    }
}
