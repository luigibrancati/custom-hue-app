package N6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: N6.s5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1479s5 extends AbstractC6157a {
    public static final Parcelable.Creator<C1479s5> CREATOR = new Zb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f10454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f10455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f10456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f10457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f10458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f10459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f10460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f10461k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f10462l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f10463m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f10464n;

    public C1479s5() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.w(parcel, 2, this.f10451a, false);
        w6.c.w(parcel, 3, this.f10452b, false);
        w6.c.w(parcel, 4, this.f10453c, false);
        w6.c.w(parcel, 5, this.f10454d, false);
        w6.c.w(parcel, 6, this.f10455e, false);
        w6.c.w(parcel, 7, this.f10456f, false);
        w6.c.w(parcel, 8, this.f10457g, false);
        w6.c.w(parcel, 9, this.f10458h, false);
        w6.c.w(parcel, 10, this.f10459i, false);
        w6.c.w(parcel, 11, this.f10460j, false);
        w6.c.w(parcel, 12, this.f10461k, false);
        w6.c.w(parcel, 13, this.f10462l, false);
        w6.c.w(parcel, 14, this.f10463m, false);
        w6.c.w(parcel, 15, this.f10464n, false);
        w6.c.b(parcel, iA);
    }

    public C1479s5(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f10451a = str;
        this.f10452b = str2;
        this.f10453c = str3;
        this.f10454d = str4;
        this.f10455e = str5;
        this.f10456f = str6;
        this.f10457g = str7;
        this.f10458h = str8;
        this.f10459i = str9;
        this.f10460j = str10;
        this.f10461k = str11;
        this.f10462l = str12;
        this.f10463m = str13;
        this.f10464n = str14;
    }
}
