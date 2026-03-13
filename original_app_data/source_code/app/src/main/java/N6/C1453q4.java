package N6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: N6.q4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1453q4 extends AbstractC6157a {
    public static final Parcelable.Creator<C1453q4> CREATOR = new C1291db();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f10427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f10428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public P3 f10429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public P3 f10430g;

    public C1453q4() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.w(parcel, 2, this.f10424a, false);
        w6.c.w(parcel, 3, this.f10425b, false);
        w6.c.w(parcel, 4, this.f10426c, false);
        w6.c.w(parcel, 5, this.f10427d, false);
        w6.c.w(parcel, 6, this.f10428e, false);
        w6.c.u(parcel, 7, this.f10429f, i10, false);
        w6.c.u(parcel, 8, this.f10430g, i10, false);
        w6.c.b(parcel, iA);
    }

    public C1453q4(String str, String str2, String str3, String str4, String str5, P3 p32, P3 p33) {
        this.f10424a = str;
        this.f10425b = str2;
        this.f10426c = str3;
        this.f10427d = str4;
        this.f10428e = str5;
        this.f10429f = p32;
        this.f10430g = p33;
    }
}
