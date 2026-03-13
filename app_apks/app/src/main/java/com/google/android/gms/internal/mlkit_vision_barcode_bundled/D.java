package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class D extends AbstractC6157a {
    public static final Parcelable.Creator<D> CREATOR = new E();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f29745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f29746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f29747c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f29748d;

    public D(T t10, V v10, boolean z10, boolean z11) {
        this.f29745a = t10;
        this.f29746b = v10;
        this.f29748d = z11;
    }

    public final T d() {
        return this.f29745a;
    }

    public final boolean e() {
        return this.f29748d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.u(parcel, 1, this.f29745a, i10, false);
        w6.c.u(parcel, 2, this.f29746b, i10, false);
        w6.c.c(parcel, 3, this.f29747c);
        w6.c.c(parcel, 4, this.f29748d);
        w6.c.b(parcel, iA);
    }
}
