package N6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: N6.u6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1506u6 extends AbstractC6157a {
    public static final Parcelable.Creator<C1506u6> CREATOR = new C1266c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f10489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f10490b;

    public C1506u6() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.h(parcel, 2, this.f10489a);
        w6.c.h(parcel, 3, this.f10490b);
        w6.c.b(parcel, iA);
    }

    public C1506u6(double d10, double d11) {
        this.f10489a = d10;
        this.f10490b = d11;
    }
}
