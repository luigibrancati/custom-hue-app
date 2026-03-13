package N6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: N6.y8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1560y8 extends AbstractC6157a {
    public static final Parcelable.Creator<C1560y8> CREATOR = new C1318g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10561b;

    public C1560y8() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.w(parcel, 2, this.f10560a, false);
        w6.c.w(parcel, 3, this.f10561b, false);
        w6.c.b(parcel, iA);
    }

    public C1560y8(String str, String str2) {
        this.f10560a = str;
        this.f10561b = str2;
    }
}
