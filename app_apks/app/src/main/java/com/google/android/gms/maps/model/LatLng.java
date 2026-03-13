package com.google.android.gms.maps.model;

import U6.d0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import w6.AbstractC6157a;
import w6.c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class LatLng extends AbstractC6157a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f30350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f30351b;

    public LatLng(double d10, double d11) {
        if (d11 < -180.0d || d11 >= 180.0d) {
            this.f30351b = ((((d11 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.f30351b = d11;
        }
        this.f30350a = Math.max(-90.0d, Math.min(90.0d, d10));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f30350a) == Double.doubleToLongBits(latLng.f30350a) && Double.doubleToLongBits(this.f30351b) == Double.doubleToLongBits(latLng.f30351b);
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f30350a);
        long j10 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f30351b);
        return ((((int) j10) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public String toString() {
        return "lat/lng: (" + this.f30350a + "," + this.f30351b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        double d10 = this.f30350a;
        int iA = c.a(parcel);
        c.h(parcel, 2, d10);
        c.h(parcel, 3, this.f30351b);
        c.b(parcel, iA);
    }
}
