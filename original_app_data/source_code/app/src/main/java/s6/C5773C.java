package s6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: s6.C, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5773C extends AbstractC6157a {
    public static final Parcelable.Creator<C5773C> CREATOR = new C5774D();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f44126e;

    public C5773C(boolean z10, String str, int i10, int i11, long j10) {
        this.f44122a = z10;
        this.f44123b = str;
        this.f44124c = AbstractC5781K.a(i10) - 1;
        this.f44125d = AbstractC5795n.a(i11) - 1;
        this.f44126e = j10;
    }

    public final String d() {
        return this.f44123b;
    }

    public final long e() {
        return this.f44126e;
    }

    public final int f() {
        return AbstractC5781K.a(this.f44124c);
    }

    public final int h() {
        return AbstractC5795n.a(this.f44125d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.c(parcel, 1, this.f44122a);
        w6.c.w(parcel, 2, this.f44123b, false);
        w6.c.n(parcel, 3, this.f44124c);
        w6.c.n(parcel, 4, this.f44125d);
        w6.c.s(parcel, 5, this.f44126e);
        w6.c.b(parcel, iA);
    }

    public final boolean zza() {
        return this.f44122a;
    }
}
