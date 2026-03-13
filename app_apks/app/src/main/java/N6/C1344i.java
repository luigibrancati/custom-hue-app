package N6;

import android.os.Parcel;
import android.os.Parcelable;
import v6.AbstractC6055j;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: N6.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1344i extends AbstractC6157a {
    public static final Parcelable.Creator<C1344i> CREATOR = new C1357j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10304b;

    public C1344i() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1344i)) {
            return false;
        }
        C1344i c1344i = (C1344i) obj;
        return this.f10303a == c1344i.f10303a && AbstractC6055j.a(Boolean.valueOf(this.f10304b), Boolean.valueOf(c1344i.f10304b));
    }

    public final int hashCode() {
        return AbstractC6055j.b(Integer.valueOf(this.f10303a), Boolean.valueOf(this.f10304b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 2, this.f10303a);
        w6.c.c(parcel, 3, this.f10304b);
        w6.c.b(parcel, iA);
    }

    public C1344i(int i10, boolean z10) {
        this.f10303a = i10;
        this.f10304b = z10;
    }
}
