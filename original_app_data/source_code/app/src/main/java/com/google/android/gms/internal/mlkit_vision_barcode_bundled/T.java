package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class T extends AbstractC6157a {
    public static final Parcelable.Creator<T> CREATOR = new U();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f29805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f29807c;

    public T(float[] fArr, int i10, boolean z10) {
        this.f29805a = fArr;
        this.f29806b = i10;
        this.f29807c = z10;
    }

    public final int d() {
        return this.f29806b;
    }

    public final boolean e() {
        return this.f29807c;
    }

    public final float[] f() {
        return this.f29805a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        float[] fArr = this.f29805a;
        int iA = w6.c.a(parcel);
        w6.c.k(parcel, 1, fArr, false);
        w6.c.n(parcel, 2, this.f29806b);
        w6.c.c(parcel, 3, this.f29807c);
        w6.c.b(parcel, iA);
    }
}
