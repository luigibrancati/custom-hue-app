package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3468u extends AbstractC6157a {
    public static final Parcelable.Creator<C3468u> CREATOR = new X();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f29938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f29939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f29940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f29941g;

    public C3468u(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f29935a = str;
        this.f29936b = str2;
        this.f29937c = str3;
        this.f29938d = str4;
        this.f29939e = str5;
        this.f29940f = str6;
        this.f29941g = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f29935a;
        int iA = w6.c.a(parcel);
        w6.c.w(parcel, 1, str, false);
        w6.c.w(parcel, 2, this.f29936b, false);
        w6.c.w(parcel, 3, this.f29937c, false);
        w6.c.w(parcel, 4, this.f29938d, false);
        w6.c.w(parcel, 5, this.f29939e, false);
        w6.c.w(parcel, 6, this.f29940f, false);
        w6.c.w(parcel, 7, this.f29941g, false);
        w6.c.b(parcel, iA);
    }
}
