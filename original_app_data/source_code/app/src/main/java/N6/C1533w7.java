package N6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: N6.w7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1533w7 extends AbstractC6157a {
    public static final Parcelable.Creator<C1533w7> CREATOR = new C1292e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10521b;

    public C1533w7() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 2, this.f10520a);
        w6.c.w(parcel, 3, this.f10521b, false);
        w6.c.b(parcel, iA);
    }

    public C1533w7(int i10, String str) {
        this.f10520a = i10;
        this.f10521b = str;
    }
}
