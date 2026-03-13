package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3488y extends AbstractC6157a {
    public static final Parcelable.Creator<C3488y> CREATOR = new C3380c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29970c;

    public C3488y(String str, String str2, int i10) {
        this.f29968a = str;
        this.f29969b = str2;
        this.f29970c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f29968a;
        int iA = w6.c.a(parcel);
        w6.c.w(parcel, 1, str, false);
        w6.c.w(parcel, 2, this.f29969b, false);
        w6.c.n(parcel, 3, this.f29970c);
        w6.c.b(parcel, iA);
    }
}
