package v6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: v6.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C6054i extends AbstractC6157a {
    public static final Parcelable.Creator<C6054i> CREATOR = new C6070z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f45858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f45859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f45860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f45861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f45862h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f45863i;

    public C6054i(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f45855a = i10;
        this.f45856b = i11;
        this.f45857c = i12;
        this.f45858d = j10;
        this.f45859e = j11;
        this.f45860f = str;
        this.f45861g = str2;
        this.f45862h = i13;
        this.f45863i = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f45855a;
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, i11);
        w6.c.n(parcel, 2, this.f45856b);
        w6.c.n(parcel, 3, this.f45857c);
        w6.c.s(parcel, 4, this.f45858d);
        w6.c.s(parcel, 5, this.f45859e);
        w6.c.w(parcel, 6, this.f45860f, false);
        w6.c.w(parcel, 7, this.f45861g, false);
        w6.c.n(parcel, 8, this.f45862h);
        w6.c.n(parcel, 9, this.f45863i);
        w6.c.b(parcel, iA);
    }
}
