package N6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: N6.wb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1537wb extends AbstractC6157a {
    public static final Parcelable.Creator<C1537wb> CREATOR = new Mb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f10527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f10528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f10529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f10530i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f10531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f10532k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f10533l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f10534m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f10535n;

    public C1537wb(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f10522a = str;
        this.f10523b = str2;
        this.f10524c = str3;
        this.f10525d = str4;
        this.f10526e = str5;
        this.f10527f = str6;
        this.f10528g = str7;
        this.f10529h = str8;
        this.f10530i = str9;
        this.f10531j = str10;
        this.f10532k = str11;
        this.f10533l = str12;
        this.f10534m = str13;
        this.f10535n = str14;
    }

    public final String d() {
        return this.f10528g;
    }

    public final String e() {
        return this.f10529h;
    }

    public final String f() {
        return this.f10527f;
    }

    public final String h() {
        return this.f10530i;
    }

    public final String k() {
        return this.f10534m;
    }

    public final String l() {
        return this.f10522a;
    }

    public final String n() {
        return this.f10533l;
    }

    public final String r() {
        return this.f10523b;
    }

    public final String t() {
        return this.f10526e;
    }

    public final String v() {
        return this.f10532k;
    }

    public final String w() {
        return this.f10535n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f10522a;
        int iA = w6.c.a(parcel);
        w6.c.w(parcel, 1, str, false);
        w6.c.w(parcel, 2, this.f10523b, false);
        w6.c.w(parcel, 3, this.f10524c, false);
        w6.c.w(parcel, 4, this.f10525d, false);
        w6.c.w(parcel, 5, this.f10526e, false);
        w6.c.w(parcel, 6, this.f10527f, false);
        w6.c.w(parcel, 7, this.f10528g, false);
        w6.c.w(parcel, 8, this.f10529h, false);
        w6.c.w(parcel, 9, this.f10530i, false);
        w6.c.w(parcel, 10, this.f10531j, false);
        w6.c.w(parcel, 11, this.f10532k, false);
        w6.c.w(parcel, 12, this.f10533l, false);
        w6.c.w(parcel, 13, this.f10534m, false);
        w6.c.w(parcel, 14, this.f10535n, false);
        w6.c.b(parcel, iA);
    }

    public final String x() {
        return this.f10525d;
    }

    public final String y() {
        return this.f10531j;
    }

    public final String z() {
        return this.f10524c;
    }
}
