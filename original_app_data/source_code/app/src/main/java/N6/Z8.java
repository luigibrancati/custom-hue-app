package N6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Z8 extends AbstractC6157a {
    public static final Parcelable.Creator<Z8> CREATOR = new C1331h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10163c;

    public Z8() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.w(parcel, 2, this.f10161a, false);
        w6.c.w(parcel, 3, this.f10162b, false);
        w6.c.n(parcel, 4, this.f10163c);
        w6.c.b(parcel, iA);
    }

    public Z8(String str, String str2, int i10) {
        this.f10161a = str;
        this.f10162b = str2;
        this.f10163c = i10;
    }
}
