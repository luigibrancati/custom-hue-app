package N6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: N6.yb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1563yb extends AbstractC6157a {
    public static final Parcelable.Creator<C1563yb> CREATOR = new Ob();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f10562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f10563b;

    public C1563yb(double d10, double d11) {
        this.f10562a = d10;
        this.f10563b = d11;
    }

    public final double d() {
        return this.f10562a;
    }

    public final double e() {
        return this.f10563b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.h(parcel, 1, this.f10562a);
        w6.c.h(parcel, 2, this.f10563b);
        w6.c.b(parcel, iA);
    }
}
