package N6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Hb extends AbstractC6157a {
    public static final Parcelable.Creator<Hb> CREATOR = new Ib();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9760b;

    public Hb(int i10, boolean z10) {
        this.f9759a = i10;
        this.f9760b = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f9759a;
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, i11);
        w6.c.c(parcel, 2, this.f9760b);
        w6.c.b(parcel, iA);
    }
}
