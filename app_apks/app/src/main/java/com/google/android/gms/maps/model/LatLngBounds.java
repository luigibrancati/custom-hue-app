package com.google.android.gms.maps.model;

import U6.c0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import v6.AbstractC6055j;
import v6.AbstractC6056k;
import w6.AbstractC6157a;
import w6.c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class LatLngBounds extends AbstractC6157a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f30352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LatLng f30353b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f30354a = Double.POSITIVE_INFINITY;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f30355b = Double.NEGATIVE_INFINITY;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f30356c = Double.NaN;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public double f30357d = Double.NaN;

        public LatLngBounds a() {
            AbstractC6056k.q(!Double.isNaN(this.f30356c), "no included points");
            return new LatLngBounds(new LatLng(this.f30354a, this.f30356c), new LatLng(this.f30355b, this.f30357d));
        }

        public a b(LatLng latLng) {
            AbstractC6056k.m(latLng, "point must not be null");
            this.f30354a = Math.min(this.f30354a, latLng.f30350a);
            this.f30355b = Math.max(this.f30355b, latLng.f30350a);
            double d10 = latLng.f30351b;
            if (Double.isNaN(this.f30356c)) {
                this.f30356c = d10;
                this.f30357d = d10;
                return this;
            }
            double d11 = this.f30356c;
            double d12 = this.f30357d;
            if (d11 > d12 ? !(d11 <= d10 || d10 <= d12) : !(d11 <= d10 && d10 <= d12)) {
                Parcelable.Creator<LatLngBounds> creator = LatLngBounds.CREATOR;
                if (((d11 - d10) + 360.0d) % 360.0d < ((d10 - d12) + 360.0d) % 360.0d) {
                    this.f30356c = d10;
                    return this;
                }
                this.f30357d = d10;
            }
            return this;
        }
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        AbstractC6056k.m(latLng, "southwest must not be null.");
        AbstractC6056k.m(latLng2, "northeast must not be null.");
        double d10 = latLng2.f30350a;
        double d11 = latLng.f30350a;
        AbstractC6056k.c(d10 >= d11, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d11), Double.valueOf(latLng2.f30350a));
        this.f30352a = latLng;
        this.f30353b = latLng2;
    }

    public static a d() {
        return new a();
    }

    public boolean e(LatLng latLng) {
        LatLng latLng2 = (LatLng) AbstractC6056k.m(latLng, "point must not be null.");
        double d10 = latLng2.f30350a;
        return this.f30352a.f30350a <= d10 && d10 <= this.f30353b.f30350a && f(latLng2.f30351b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f30352a.equals(latLngBounds.f30352a) && this.f30353b.equals(latLngBounds.f30353b);
    }

    public final boolean f(double d10) {
        LatLng latLng = this.f30353b;
        double d11 = this.f30352a.f30351b;
        double d12 = latLng.f30351b;
        return d11 <= d12 ? d11 <= d10 && d10 <= d12 : d11 <= d10 || d10 <= d12;
    }

    public int hashCode() {
        return AbstractC6055j.b(this.f30352a, this.f30353b);
    }

    public String toString() {
        return AbstractC6055j.c(this).a("southwest", this.f30352a).a("northeast", this.f30353b).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        LatLng latLng = this.f30352a;
        int iA = c.a(parcel);
        c.u(parcel, 2, latLng, i10, false);
        c.u(parcel, 3, this.f30353b, i10, false);
        c.b(parcel, iA);
    }
}
