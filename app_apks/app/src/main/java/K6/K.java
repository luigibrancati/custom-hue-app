package K6;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
import java.util.Iterator;
import java.util.List;
import v6.AbstractC6055j;
import v6.C6047b;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class K extends AbstractC6157a {
    public static final Parcelable.Creator<K> CREATOR = new L();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LocationRequest f7507a;

    public K(LocationRequest locationRequest, List list, boolean z10, boolean z11, boolean z12, boolean z13, String str, long j10) {
        WorkSource workSource;
        LocationRequest.a aVar = new LocationRequest.a(locationRequest);
        if (list != null) {
            if (list.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C6047b c6047b = (C6047b) it.next();
                    B6.p.a(workSource, c6047b.f45821a, c6047b.f45822b);
                }
            }
            aVar.n(workSource);
        }
        if (z10) {
            aVar.c(1);
        }
        if (z11) {
            aVar.l(2);
        }
        if (z12) {
            aVar.m(true);
        }
        if (z13) {
            aVar.k(true);
        }
        if (j10 != Long.MAX_VALUE) {
            aVar.e(j10);
        }
        this.f7507a = aVar.a();
    }

    public static K d(String str, LocationRequest locationRequest) {
        return new K(locationRequest, null, false, false, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof K) {
            return AbstractC6055j.a(this.f7507a, ((K) obj).f7507a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7507a.hashCode();
    }

    public final String toString() {
        return this.f7507a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.u(parcel, 1, this.f7507a, i10, false);
        w6.c.b(parcel, iA);
    }
}
