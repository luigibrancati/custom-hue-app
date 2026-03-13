package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class r extends AbstractC6157a {
    public static final Parcelable.Creator<r> CREATOR = new K();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f29915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f29916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f29917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f29918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f29919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f29920i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f29921j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f29922k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f29923l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f29924m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f29925n;

    public r(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f29912a = str;
        this.f29913b = str2;
        this.f29914c = str3;
        this.f29915d = str4;
        this.f29916e = str5;
        this.f29917f = str6;
        this.f29918g = str7;
        this.f29919h = str8;
        this.f29920i = str9;
        this.f29921j = str10;
        this.f29922k = str11;
        this.f29923l = str12;
        this.f29924m = str13;
        this.f29925n = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f29912a;
        int iA = w6.c.a(parcel);
        w6.c.w(parcel, 1, str, false);
        w6.c.w(parcel, 2, this.f29913b, false);
        w6.c.w(parcel, 3, this.f29914c, false);
        w6.c.w(parcel, 4, this.f29915d, false);
        w6.c.w(parcel, 5, this.f29916e, false);
        w6.c.w(parcel, 6, this.f29917f, false);
        w6.c.w(parcel, 7, this.f29918g, false);
        w6.c.w(parcel, 8, this.f29919h, false);
        w6.c.w(parcel, 9, this.f29920i, false);
        w6.c.w(parcel, 10, this.f29921j, false);
        w6.c.w(parcel, 11, this.f29922k, false);
        w6.c.w(parcel, 12, this.f29923l, false);
        w6.c.w(parcel, 13, this.f29924m, false);
        w6.c.w(parcel, 14, this.f29925n, false);
        w6.c.b(parcel, iA);
    }
}
