package v6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import s6.C5785d;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class N extends AbstractC6157a {
    public static final Parcelable.Creator<N> CREATOR = new O();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bundle f45793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5785d[] f45794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C6049d f45796d;

    public N() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.e(parcel, 1, this.f45793a, false);
        w6.c.z(parcel, 2, this.f45794b, i10, false);
        w6.c.n(parcel, 3, this.f45795c);
        w6.c.u(parcel, 4, this.f45796d, i10, false);
        w6.c.b(parcel, iA);
    }

    public N(Bundle bundle, C5785d[] c5785dArr, int i10, C6049d c6049d) {
        this.f45793a = bundle;
        this.f45794b = c5785dArr;
        this.f45795c = i10;
        this.f45796d = c6049d;
    }
}
