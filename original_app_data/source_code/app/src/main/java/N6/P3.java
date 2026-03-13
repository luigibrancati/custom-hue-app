package N6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class P3 extends AbstractC6157a {
    public static final Parcelable.Creator<P3> CREATOR = new Ca();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f9996h;

    public P3() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 2, this.f9989a);
        w6.c.n(parcel, 3, this.f9990b);
        w6.c.n(parcel, 4, this.f9991c);
        w6.c.n(parcel, 5, this.f9992d);
        w6.c.n(parcel, 6, this.f9993e);
        w6.c.n(parcel, 7, this.f9994f);
        w6.c.c(parcel, 8, this.f9995g);
        w6.c.w(parcel, 9, this.f9996h, false);
        w6.c.b(parcel, iA);
    }

    public P3(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, String str) {
        this.f9989a = i10;
        this.f9990b = i11;
        this.f9991c = i12;
        this.f9992d = i13;
        this.f9993e = i14;
        this.f9994f = i15;
        this.f9995g = z10;
        this.f9996h = str;
    }
}
