package N6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: N6.tb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1498tb extends AbstractC6157a {
    public static final Parcelable.Creator<C1498tb> CREATOR = new Jb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f10485h;

    public C1498tb(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, String str) {
        this.f10478a = i10;
        this.f10479b = i11;
        this.f10480c = i12;
        this.f10481d = i13;
        this.f10482e = i14;
        this.f10483f = i15;
        this.f10484g = z10;
        this.f10485h = str;
    }

    public final int d() {
        return this.f10480c;
    }

    public final int e() {
        return this.f10481d;
    }

    public final int f() {
        return this.f10482e;
    }

    public final int h() {
        return this.f10479b;
    }

    public final int k() {
        return this.f10483f;
    }

    public final int l() {
        return this.f10478a;
    }

    public final String n() {
        return this.f10485h;
    }

    public final boolean r() {
        return this.f10484g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, this.f10478a);
        w6.c.n(parcel, 2, this.f10479b);
        w6.c.n(parcel, 3, this.f10480c);
        w6.c.n(parcel, 4, this.f10481d);
        w6.c.n(parcel, 5, this.f10482e);
        w6.c.n(parcel, 6, this.f10483f);
        w6.c.c(parcel, 7, this.f10484g);
        w6.c.w(parcel, 8, this.f10485h, false);
        w6.c.b(parcel, iA);
    }
}
