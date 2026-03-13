package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Q extends AbstractC6157a {
    public static final Parcelable.Creator<Q> CREATOR = new S();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f29788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f29789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f29790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f29791e;

    public Q(boolean z10, byte[] bArr, boolean z11, float f10, boolean z12) {
        this.f29787a = z10;
        this.f29788b = bArr;
        this.f29789c = z11;
        this.f29790d = f10;
        this.f29791e = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.f29787a;
        int iA = w6.c.a(parcel);
        w6.c.c(parcel, 1, z10);
        w6.c.g(parcel, 2, this.f29788b, false);
        w6.c.c(parcel, 3, this.f29789c);
        w6.c.j(parcel, 4, this.f29790d);
        w6.c.c(parcel, 5, this.f29791e);
        w6.c.b(parcel, iA);
    }
}
