package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class F extends AbstractC6157a {
    public static final Parcelable.Creator<F> CREATOR = new G();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q f29751a;

    public F(Q q10) {
        this.f29751a = q10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Q q10 = this.f29751a;
        int iA = w6.c.a(parcel);
        w6.c.u(parcel, 1, q10, i10, false);
        w6.c.b(parcel, iA);
    }
}
