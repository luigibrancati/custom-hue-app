package N6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: N6.o3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1426o3 extends AbstractC6157a {
    public static final Parcelable.Creator<C1426o3> CREATOR = new N2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String[] f10407b;

    public C1426o3() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 2, this.f10406a);
        w6.c.x(parcel, 3, this.f10407b, false);
        w6.c.b(parcel, iA);
    }

    public C1426o3(int i10, String[] strArr) {
        this.f10406a = i10;
        this.f10407b = strArr;
    }
}
