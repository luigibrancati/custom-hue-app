package s6;

import android.os.Parcel;
import android.os.Parcelable;
import v6.AbstractC6055j;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: s6.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5785d extends AbstractC6157a {
    public static final Parcelable.Creator<C5785d> CREATOR = new C5794m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f44156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f44157d;

    public C5785d(String str, int i10, long j10, boolean z10) {
        this.f44154a = str;
        this.f44155b = i10;
        this.f44156c = j10;
        this.f44157d = z10;
    }

    public boolean d() {
        return this.f44157d;
    }

    public String e() {
        return this.f44154a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5785d) {
            C5785d c5785d = (C5785d) obj;
            if (AbstractC6055j.a(e(), c5785d.e()) && f() == c5785d.f() && d() == c5785d.d()) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        long j10 = this.f44156c;
        return j10 == -1 ? this.f44155b : j10;
    }

    public final int hashCode() {
        return AbstractC6055j.b(e(), Long.valueOf(f()), Boolean.valueOf(d()));
    }

    public final String toString() {
        AbstractC6055j.a aVarC = AbstractC6055j.c(this);
        aVarC.a("name", e());
        aVarC.a("version", Long.valueOf(f()));
        aVarC.a("is_fully_rolled_out", Boolean.valueOf(d()));
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.w(parcel, 1, e(), false);
        w6.c.n(parcel, 2, this.f44155b);
        w6.c.s(parcel, 3, f());
        w6.c.c(parcel, 4, d());
        w6.c.b(parcel, iA);
    }

    public C5785d(String str, long j10) {
        this(str, -1, j10, false);
    }
}
