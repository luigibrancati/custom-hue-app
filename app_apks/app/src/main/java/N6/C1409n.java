package N6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: N6.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1409n extends AbstractC6157a {
    public static final Parcelable.Creator<C1409n> CREATOR = new C1422o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f10375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10376e;

    public C1409n() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 2, this.f10372a);
        w6.c.n(parcel, 3, this.f10373b);
        w6.c.n(parcel, 4, this.f10374c);
        w6.c.s(parcel, 5, this.f10375d);
        w6.c.n(parcel, 6, this.f10376e);
        w6.c.b(parcel, iA);
    }

    public C1409n(int i10, int i11, int i12, long j10, int i13) {
        this.f10372a = i10;
        this.f10373b = i11;
        this.f10374c = i12;
        this.f10375d = j10;
        this.f10376e = i13;
    }
}
