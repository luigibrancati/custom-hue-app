package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3493z extends AbstractC6157a {
    public static final Parcelable.Creator<C3493z> CREATOR = new A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f29977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Point[] f29978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f29979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3458s f29980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3473v f29981h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C3478w f29982i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3488y f29983j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C3483x f29984k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C3463t f29985l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C3444p f29986m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C3449q f29987n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r f29988o;

    public C3493z(int i10, String str, String str2, byte[] bArr, Point[] pointArr, int i11, C3458s c3458s, C3473v c3473v, C3478w c3478w, C3488y c3488y, C3483x c3483x, C3463t c3463t, C3444p c3444p, C3449q c3449q, r rVar) {
        this.f29974a = i10;
        this.f29975b = str;
        this.f29976c = str2;
        this.f29977d = bArr;
        this.f29978e = pointArr;
        this.f29979f = i11;
        this.f29980g = c3458s;
        this.f29981h = c3473v;
        this.f29982i = c3478w;
        this.f29983j = c3488y;
        this.f29984k = c3483x;
        this.f29985l = c3463t;
        this.f29986m = c3444p;
        this.f29987n = c3449q;
        this.f29988o = rVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f29974a;
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, i11);
        w6.c.w(parcel, 2, this.f29975b, false);
        w6.c.w(parcel, 3, this.f29976c, false);
        w6.c.g(parcel, 4, this.f29977d, false);
        w6.c.z(parcel, 5, this.f29978e, i10, false);
        w6.c.n(parcel, 6, this.f29979f);
        w6.c.u(parcel, 7, this.f29980g, i10, false);
        w6.c.u(parcel, 8, this.f29981h, i10, false);
        w6.c.u(parcel, 9, this.f29982i, i10, false);
        w6.c.u(parcel, 10, this.f29983j, i10, false);
        w6.c.u(parcel, 11, this.f29984k, i10, false);
        w6.c.u(parcel, 12, this.f29985l, i10, false);
        w6.c.u(parcel, 13, this.f29986m, i10, false);
        w6.c.u(parcel, 14, this.f29987n, i10, false);
        w6.c.u(parcel, 15, this.f29988o, i10, false);
        w6.c.b(parcel, iA);
    }
}
