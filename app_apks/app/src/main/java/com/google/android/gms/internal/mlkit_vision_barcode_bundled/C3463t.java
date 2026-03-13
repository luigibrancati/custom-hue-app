package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3463t extends AbstractC6157a {
    public static final Parcelable.Creator<C3463t> CREATOR = new M();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f29932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f29933b;

    public C3463t(double d10, double d11) {
        this.f29932a = d10;
        this.f29933b = d11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        double d10 = this.f29932a;
        int iA = w6.c.a(parcel);
        w6.c.h(parcel, 1, d10);
        w6.c.h(parcel, 2, this.f29933b);
        w6.c.b(parcel, iA);
    }
}
