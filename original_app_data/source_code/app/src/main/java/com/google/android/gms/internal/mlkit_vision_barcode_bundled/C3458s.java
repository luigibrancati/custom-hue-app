package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3458s extends AbstractC6157a {
    public static final Parcelable.Creator<C3458s> CREATOR = new L();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f29930d;

    public C3458s(int i10, String str, String str2, String str3) {
        this.f29927a = i10;
        this.f29928b = str;
        this.f29929c = str2;
        this.f29930d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f29927a;
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, i11);
        w6.c.w(parcel, 2, this.f29928b, false);
        w6.c.w(parcel, 3, this.f29929c, false);
        w6.c.w(parcel, 4, this.f29930d, false);
        w6.c.b(parcel, iA);
    }
}
