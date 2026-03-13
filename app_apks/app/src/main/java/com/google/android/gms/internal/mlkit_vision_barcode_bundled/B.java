package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class B extends AbstractC6157a {
    public static final Parcelable.Creator<B> CREATOR = new C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f29738b;

    public B(int i10, boolean z10) {
        this.f29737a = i10;
        this.f29738b = z10;
    }

    public final int d() {
        return this.f29737a;
    }

    public final boolean e() {
        return this.f29738b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, this.f29737a);
        w6.c.c(parcel, 2, this.f29738b);
        w6.c.b(parcel, iA);
    }
}
