package y6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class g extends AbstractC6157a {
    public static final Parcelable.Creator<g> CREATOR = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f48485b;

    public g(int i10) {
        this(i10, false);
    }

    public int d() {
        return this.f48484a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, d());
        w6.c.c(parcel, 2, this.f48485b);
        w6.c.b(parcel, iA);
    }

    public g(int i10, boolean z10) {
        this.f48484a = i10;
        this.f48485b = z10;
    }
}
