package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class V extends AbstractC6157a {
    public static final Parcelable.Creator<V> CREATOR = new W();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f29816a;

    public V(float[] fArr) {
        this.f29816a = fArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        float[] fArr = this.f29816a;
        int iA = w6.c.a(parcel);
        w6.c.k(parcel, 1, fArr, false);
        w6.c.b(parcel, iA);
    }
}
