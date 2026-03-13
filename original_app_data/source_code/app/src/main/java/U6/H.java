package U6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class H extends AbstractC6157a {
    public static final Parcelable.Creator<H> CREATOR = new Q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f16646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f16647b;

    public H(G g10, double d10) {
        if (d10 <= 0.0d) {
            throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
        }
        this.f16646a = g10;
        this.f16647b = d10;
    }

    public double d() {
        return this.f16647b;
    }

    public G e() {
        return this.f16646a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.u(parcel, 2, e(), i10, false);
        w6.c.h(parcel, 3, d());
        w6.c.b(parcel, iA);
    }
}
