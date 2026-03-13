package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.IAccountAccessor;
import s6.C5783b;
import v6.AbstractC6055j;
import v6.C6045C;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends AbstractC6157a {
    public static final Parcelable.Creator<f> CREATOR = new C6045C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f29095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5783b f29096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f29097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f29098e;

    public f(int i10, IBinder iBinder, C5783b c5783b, boolean z10, boolean z11) {
        this.f29094a = i10;
        this.f29095b = iBinder;
        this.f29096c = c5783b;
        this.f29097d = z10;
        this.f29098e = z11;
    }

    public final IAccountAccessor d() {
        IBinder iBinder = this.f29095b;
        if (iBinder == null) {
            return null;
        }
        return IAccountAccessor.Stub.asInterface(iBinder);
    }

    public final C5783b e() {
        return this.f29096c;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f29096c.equals(fVar.f29096c) && AbstractC6055j.a(d(), fVar.d());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, this.f29094a);
        w6.c.m(parcel, 2, this.f29095b, false);
        w6.c.u(parcel, 3, this.f29096c, i10, false);
        w6.c.c(parcel, 4, this.f29097d);
        w6.c.c(parcel, 5, this.f29098e);
        w6.c.b(parcel, iA);
    }
}
