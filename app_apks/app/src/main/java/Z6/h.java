package Z6;

import android.os.Parcel;
import android.os.Parcelable;
import v6.C6043A;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends AbstractC6157a {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C6043A f20302b;

    public h(int i10, C6043A c6043a) {
        this.f20301a = i10;
        this.f20302b = c6043a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, this.f20301a);
        w6.c.u(parcel, 2, this.f20302b, i10, false);
        w6.c.b(parcel, iA);
    }
}
