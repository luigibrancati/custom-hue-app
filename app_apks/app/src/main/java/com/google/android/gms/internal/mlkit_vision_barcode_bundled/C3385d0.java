package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.d0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3385d0 extends AbstractC6157a {
    public static final Parcelable.Creator<C3385d0> CREATOR = new C3390e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f29847e;

    public C3385d0(int i10, int i11, int i12, int i13, long j10) {
        this.f29843a = i10;
        this.f29844b = i11;
        this.f29845c = i12;
        this.f29846d = i13;
        this.f29847e = j10;
    }

    public final int d() {
        return this.f29845c;
    }

    public final int e() {
        return this.f29843a;
    }

    public final int f() {
        return this.f29846d;
    }

    public final int h() {
        return this.f29844b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, this.f29843a);
        w6.c.n(parcel, 2, this.f29844b);
        w6.c.n(parcel, 3, this.f29845c);
        w6.c.n(parcel, 4, this.f29846d);
        w6.c.s(parcel, 5, this.f29847e);
        w6.c.b(parcel, iA);
    }
}
