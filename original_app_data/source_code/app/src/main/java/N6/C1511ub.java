package N6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: N6.ub, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1511ub extends AbstractC6157a {
    public static final Parcelable.Creator<C1511ub> CREATOR = new Kb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1498tb f10496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1498tb f10497g;

    public C1511ub(String str, String str2, String str3, String str4, String str5, C1498tb c1498tb, C1498tb c1498tb2) {
        this.f10491a = str;
        this.f10492b = str2;
        this.f10493c = str3;
        this.f10494d = str4;
        this.f10495e = str5;
        this.f10496f = c1498tb;
        this.f10497g = c1498tb2;
    }

    public final C1498tb d() {
        return this.f10497g;
    }

    public final C1498tb e() {
        return this.f10496f;
    }

    public final String f() {
        return this.f10492b;
    }

    public final String h() {
        return this.f10493c;
    }

    public final String k() {
        return this.f10494d;
    }

    public final String l() {
        return this.f10495e;
    }

    public final String n() {
        return this.f10491a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f10491a;
        int iA = w6.c.a(parcel);
        w6.c.w(parcel, 1, str, false);
        w6.c.w(parcel, 2, this.f10492b, false);
        w6.c.w(parcel, 3, this.f10493c, false);
        w6.c.w(parcel, 4, this.f10494d, false);
        w6.c.w(parcel, 5, this.f10495e, false);
        w6.c.u(parcel, 6, this.f10496f, i10, false);
        w6.c.u(parcel, 7, this.f10497g, i10, false);
        w6.c.b(parcel, iA);
    }
}
