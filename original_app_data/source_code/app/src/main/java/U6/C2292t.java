package U6;

import android.os.Parcel;
import android.os.Parcelable;
import v6.AbstractC6055j;
import v6.AbstractC6056k;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: U6.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C2292t extends AbstractC6157a {
    public static final Parcelable.Creator<C2292t> CREATOR = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Float f16726b;

    public C2292t(int i10, Float f10) {
        boolean z10 = true;
        if (i10 != 1 && (f10 == null || f10.floatValue() < 0.0f)) {
            z10 = false;
        }
        AbstractC6056k.b(z10, "Invalid PatternItem: type=" + i10 + " length=" + f10);
        this.f16725a = i10;
        this.f16726b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2292t)) {
            return false;
        }
        C2292t c2292t = (C2292t) obj;
        return this.f16725a == c2292t.f16725a && AbstractC6055j.a(this.f16726b, c2292t.f16726b);
    }

    public int hashCode() {
        return AbstractC6055j.b(Integer.valueOf(this.f16725a), this.f16726b);
    }

    public String toString() {
        return "[PatternItem: type=" + this.f16725a + " length=" + this.f16726b + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f16725a;
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 2, i11);
        w6.c.l(parcel, 3, this.f16726b, false);
        w6.c.b(parcel, iA);
    }
}
