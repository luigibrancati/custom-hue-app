package N6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Xb extends AbstractC6157a {
    public static final Parcelable.Creator<Xb> CREATOR = new Yb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10135e;

    public Xb(int i10, int i11, int i12, int i13, long j10) {
        this.f10131a = i10;
        this.f10132b = i11;
        this.f10133c = i12;
        this.f10134d = i13;
        this.f10135e = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f10131a;
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, i11);
        w6.c.n(parcel, 2, this.f10132b);
        w6.c.n(parcel, 3, this.f10133c);
        w6.c.n(parcel, 4, this.f10134d);
        w6.c.s(parcel, 5, this.f10135e);
        w6.c.b(parcel, iA);
    }
}
