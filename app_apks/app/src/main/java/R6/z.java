package R6;

import android.os.Parcel;
import android.os.Parcelable;
import v6.AbstractC6055j;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class z extends AbstractC6157a {
    public static final Parcelable.Creator<z> CREATOR = new A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14837d;

    public z(int i10, int i11, long j10, long j11) {
        this.f14834a = i10;
        this.f14835b = i11;
        this.f14836c = j10;
        this.f14837d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f14834a == zVar.f14834a && this.f14835b == zVar.f14835b && this.f14836c == zVar.f14836c && this.f14837d == zVar.f14837d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC6055j.b(Integer.valueOf(this.f14835b), Integer.valueOf(this.f14834a), Long.valueOf(this.f14837d), Long.valueOf(this.f14836c));
    }

    public final String toString() {
        int i10 = this.f14834a;
        int length = String.valueOf(i10).length();
        int i11 = this.f14835b;
        int length2 = String.valueOf(i11).length();
        long j10 = this.f14837d;
        int length3 = String.valueOf(j10).length();
        long j11 = this.f14836c;
        StringBuilder sb2 = new StringBuilder(length + 50 + length2 + 18 + length3 + 17 + String.valueOf(j11).length());
        sb2.append("NetworkLocationStatus: Wifi status: ");
        sb2.append(i10);
        sb2.append(" Cell status: ");
        sb2.append(i11);
        sb2.append(" elapsed time NS: ");
        sb2.append(j10);
        sb2.append(" system time ms: ");
        sb2.append(j11);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f14834a;
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, i11);
        w6.c.n(parcel, 2, this.f14835b);
        w6.c.s(parcel, 3, this.f14836c);
        w6.c.s(parcel, 4, this.f14837d);
        w6.c.b(parcel, iA);
    }
}
