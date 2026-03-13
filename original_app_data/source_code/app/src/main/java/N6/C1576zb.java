package N6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: N6.zb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1576zb extends AbstractC6157a {
    public static final Parcelable.Creator<C1576zb> CREATOR = new Sb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f10581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f10582g;

    public C1576zb(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f10576a = str;
        this.f10577b = str2;
        this.f10578c = str3;
        this.f10579d = str4;
        this.f10580e = str5;
        this.f10581f = str6;
        this.f10582g = str7;
    }

    public final String d() {
        return this.f10579d;
    }

    public final String e() {
        return this.f10576a;
    }

    public final String f() {
        return this.f10581f;
    }

    public final String h() {
        return this.f10580e;
    }

    public final String k() {
        return this.f10578c;
    }

    public final String l() {
        return this.f10577b;
    }

    public final String n() {
        return this.f10582g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f10576a;
        int iA = w6.c.a(parcel);
        w6.c.w(parcel, 1, str, false);
        w6.c.w(parcel, 2, this.f10577b, false);
        w6.c.w(parcel, 3, this.f10578c, false);
        w6.c.w(parcel, 4, this.f10579d, false);
        w6.c.w(parcel, 5, this.f10580e, false);
        w6.c.w(parcel, 6, this.f10581f, false);
        w6.c.w(parcel, 7, this.f10582g, false);
        w6.c.b(parcel, iA);
    }
}
