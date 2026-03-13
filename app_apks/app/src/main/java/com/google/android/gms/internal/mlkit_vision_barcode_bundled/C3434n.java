package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3434n extends AbstractC6157a {
    public static final Parcelable.Creator<C3434n> CREATOR = new C3429m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f29878b;

    public C3434n(int i10, String[] strArr) {
        this.f29877a = i10;
        this.f29878b = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, this.f29877a);
        w6.c.x(parcel, 2, this.f29878b, false);
        w6.c.b(parcel, iA);
    }
}
