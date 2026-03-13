package com.google.android.gms.location;

import R6.u;
import R6.y;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import v6.AbstractC6055j;
import w6.AbstractC6157a;
import w6.c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class LocationResult extends AbstractC6157a implements ReflectedParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f30316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f30315b = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<LocationResult> CREATOR = new u();

    public LocationResult(List list) {
        this.f30316a = list;
    }

    public Location d() {
        int size = this.f30316a.size();
        if (size == 0) {
            return null;
        }
        return (Location) this.f30316a.get(size - 1);
    }

    public List e() {
        return this.f30316a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationResult) {
            return this.f30316a.equals(((LocationResult) obj).f30316a);
        }
        return false;
    }

    public int hashCode() {
        return AbstractC6055j.b(this.f30316a);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LocationResult");
        DecimalFormat decimalFormat = y.f14831a;
        List list = this.f30316a;
        sb2.ensureCapacity(list.size() * 100);
        sb2.append("[");
        Iterator it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            y.a((Location) it.next(), sb2);
            sb2.append(", ");
            z10 = true;
        }
        if (z10) {
            sb2.setLength(sb2.length() - 2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.A(parcel, 1, e(), false);
        c.b(parcel, iA);
    }
}
