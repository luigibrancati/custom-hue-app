package com.google.android.gms.location;

import R6.s;
import R6.z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import v6.AbstractC6055j;
import w6.AbstractC6157a;
import w6.c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class LocationAvailability extends AbstractC6157a implements ReflectedParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f30284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f30285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z[] f30286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final LocationAvailability f30280f = new LocationAvailability(0, 1, 1, 0, null, true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final LocationAvailability f30281g = new LocationAvailability(1000, 1, 1, 0, null, false);
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new s();

    public LocationAvailability(int i10, int i11, int i12, long j10, z[] zVarArr, boolean z10) {
        this.f30285d = i10 < 1000 ? 0 : 1000;
        this.f30282a = i11;
        this.f30283b = i12;
        this.f30284c = j10;
        this.f30286e = zVarArr;
    }

    public boolean d() {
        return this.f30285d < 1000;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f30282a == locationAvailability.f30282a && this.f30283b == locationAvailability.f30283b && this.f30284c == locationAvailability.f30284c && this.f30285d == locationAvailability.f30285d && Arrays.equals(this.f30286e, locationAvailability.f30286e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return AbstractC6055j.b(Integer.valueOf(this.f30285d));
    }

    public String toString() {
        boolean zD = d();
        StringBuilder sb2 = new StringBuilder(String.valueOf(zD).length() + 22);
        sb2.append("LocationAvailability[");
        sb2.append(zD);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f30282a;
        int iA = c.a(parcel);
        c.n(parcel, 1, i11);
        c.n(parcel, 2, this.f30283b);
        c.s(parcel, 3, this.f30284c);
        c.n(parcel, 4, this.f30285d);
        c.z(parcel, 5, this.f30286e, i10, false);
        c.c(parcel, 6, d());
        c.b(parcel, iA);
    }
}
