package N6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: N6.xb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1550xb extends AbstractC6157a {
    public static final Parcelable.Creator<C1550xb> CREATOR = new Nb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10549d;

    public C1550xb(int i10, String str, String str2, String str3) {
        this.f10546a = i10;
        this.f10547b = str;
        this.f10548c = str2;
        this.f10549d = str3;
    }

    public final int d() {
        return this.f10546a;
    }

    public final String e() {
        return this.f10547b;
    }

    public final String f() {
        return this.f10549d;
    }

    public final String h() {
        return this.f10548c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, this.f10546a);
        w6.c.w(parcel, 2, this.f10547b, false);
        w6.c.w(parcel, 3, this.f10548c, false);
        w6.c.w(parcel, 4, this.f10549d, false);
        w6.c.b(parcel, iA);
    }
}
