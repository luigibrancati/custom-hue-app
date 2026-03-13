package X6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: X6.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2388g extends AbstractC6157a {
    public static final Parcelable.Creator<C2388g> CREATOR = new C2396h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18949c;

    public C2388g(long j10, int i10, long j11) {
        this.f18947a = j10;
        this.f18948b = i10;
        this.f18949c = j11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f18947a;
        int iA = w6.c.a(parcel);
        w6.c.s(parcel, 1, j10);
        w6.c.n(parcel, 2, this.f18948b);
        w6.c.s(parcel, 3, this.f18949c);
        w6.c.b(parcel, iA);
    }
}
