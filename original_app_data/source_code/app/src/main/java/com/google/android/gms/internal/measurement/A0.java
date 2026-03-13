package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class A0 extends AbstractC6157a {
    public static final Parcelable.Creator<A0> CREATOR = new B0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f29137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f29138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f29139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f29140e;

    public A0(long j10, long j11, boolean z10, Bundle bundle, String str) {
        this.f29136a = j10;
        this.f29137b = j11;
        this.f29138c = z10;
        this.f29139d = bundle;
        this.f29140e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f29136a;
        int iA = w6.c.a(parcel);
        w6.c.s(parcel, 1, j10);
        w6.c.s(parcel, 2, this.f29137b);
        w6.c.c(parcel, 3, this.f29138c);
        w6.c.e(parcel, 7, this.f29139d, false);
        w6.c.w(parcel, 8, this.f29140e, false);
        w6.c.b(parcel, iA);
    }
}
