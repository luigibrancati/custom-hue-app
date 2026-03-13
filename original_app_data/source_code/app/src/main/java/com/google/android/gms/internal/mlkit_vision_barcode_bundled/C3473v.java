package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3473v extends AbstractC6157a {
    public static final Parcelable.Creator<C3473v> CREATOR = new Y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29946b;

    public C3473v(int i10, String str) {
        this.f29945a = i10;
        this.f29946b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f29945a;
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, i11);
        w6.c.w(parcel, 2, this.f29946b, false);
        w6.c.b(parcel, iA);
    }
}
