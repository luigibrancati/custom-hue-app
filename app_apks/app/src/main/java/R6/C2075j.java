package R6;

import K6.T;
import android.os.Parcel;
import android.os.Parcelable;
import v6.AbstractC6055j;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: R6.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2075j extends AbstractC6157a {
    public static final Parcelable.Creator<C2075j> CREATOR = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final K6.H f14812d;

    /* JADX INFO: renamed from: R6.j$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f14813a = Long.MAX_VALUE;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14814b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f14815c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final K6.H f14816d = null;

        public C2075j a() {
            return new C2075j(this.f14813a, this.f14814b, this.f14815c, this.f14816d);
        }
    }

    public C2075j(long j10, int i10, boolean z10, K6.H h10) {
        this.f14809a = j10;
        this.f14810b = i10;
        this.f14811c = z10;
        this.f14812d = h10;
    }

    public int d() {
        return this.f14810b;
    }

    public long e() {
        return this.f14809a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2075j)) {
            return false;
        }
        C2075j c2075j = (C2075j) obj;
        return this.f14809a == c2075j.f14809a && this.f14810b == c2075j.f14810b && this.f14811c == c2075j.f14811c && AbstractC6055j.a(this.f14812d, c2075j.f14812d);
    }

    public int hashCode() {
        return AbstractC6055j.b(Long.valueOf(this.f14809a), Integer.valueOf(this.f14810b), Boolean.valueOf(this.f14811c));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LastLocationRequest[");
        if (this.f14809a != Long.MAX_VALUE) {
            sb2.append("maxAge=");
            T.c(this.f14809a, sb2);
        }
        if (this.f14810b != 0) {
            sb2.append(", ");
            sb2.append(G.b(this.f14810b));
        }
        if (this.f14811c) {
            sb2.append(", bypass");
        }
        if (this.f14812d != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f14812d);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.s(parcel, 1, e());
        w6.c.n(parcel, 2, d());
        w6.c.c(parcel, 3, this.f14811c);
        w6.c.u(parcel, 5, this.f14812d, i10, false);
        w6.c.b(parcel, iA);
    }
}
