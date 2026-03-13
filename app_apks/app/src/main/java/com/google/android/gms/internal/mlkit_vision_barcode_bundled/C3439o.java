package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3439o extends AbstractC6157a {
    public static final Parcelable.Creator<C3439o> CREATOR = new H();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f29884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f29885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f29886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f29887h;

    public C3439o(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, String str) {
        this.f29880a = i10;
        this.f29881b = i11;
        this.f29882c = i12;
        this.f29883d = i13;
        this.f29884e = i14;
        this.f29885f = i15;
        this.f29886g = z10;
        this.f29887h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f29880a;
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, i11);
        w6.c.n(parcel, 2, this.f29881b);
        w6.c.n(parcel, 3, this.f29882c);
        w6.c.n(parcel, 4, this.f29883d);
        w6.c.n(parcel, 5, this.f29884e);
        w6.c.n(parcel, 6, this.f29885f);
        w6.c.c(parcel, 7, this.f29886g);
        w6.c.w(parcel, 8, this.f29887h, false);
        w6.c.b(parcel, iA);
    }
}
