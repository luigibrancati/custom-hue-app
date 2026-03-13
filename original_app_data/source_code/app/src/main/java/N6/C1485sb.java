package N6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: N6.sb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1485sb extends AbstractC6157a {
    public static final Parcelable.Creator<C1485sb> CREATOR = new C1472rb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f10468b;

    public C1485sb(int i10, String[] strArr) {
        this.f10467a = i10;
        this.f10468b = strArr;
    }

    public final int d() {
        return this.f10467a;
    }

    public final String[] e() {
        return this.f10468b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, this.f10467a);
        w6.c.x(parcel, 2, this.f10468b, false);
        w6.c.b(parcel, iA);
    }
}
