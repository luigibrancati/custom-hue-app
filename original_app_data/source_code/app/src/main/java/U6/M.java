package U6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import v6.AbstractC6055j;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class M extends AbstractC6157a {
    public static final Parcelable.Creator<M> CREATOR = new W();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f16659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LatLng f16660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LatLng f16661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LatLng f16662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LatLngBounds f16663e;

    public M(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f16659a = latLng;
        this.f16660b = latLng2;
        this.f16661c = latLng3;
        this.f16662d = latLng4;
        this.f16663e = latLngBounds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m10 = (M) obj;
        return this.f16659a.equals(m10.f16659a) && this.f16660b.equals(m10.f16660b) && this.f16661c.equals(m10.f16661c) && this.f16662d.equals(m10.f16662d) && this.f16663e.equals(m10.f16663e);
    }

    public int hashCode() {
        return AbstractC6055j.b(this.f16659a, this.f16660b, this.f16661c, this.f16662d, this.f16663e);
    }

    public String toString() {
        return AbstractC6055j.c(this).a("nearLeft", this.f16659a).a("nearRight", this.f16660b).a("farLeft", this.f16661c).a("farRight", this.f16662d).a("latLngBounds", this.f16663e).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        LatLng latLng = this.f16659a;
        int iA = w6.c.a(parcel);
        w6.c.u(parcel, 2, latLng, i10, false);
        w6.c.u(parcel, 3, this.f16660b, i10, false);
        w6.c.u(parcel, 4, this.f16661c, i10, false);
        w6.c.u(parcel, 5, this.f16662d, i10, false);
        w6.c.u(parcel, 6, this.f16663e, i10, false);
        w6.c.b(parcel, iA);
    }
}
