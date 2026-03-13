package U6;

import android.os.Parcel;
import android.os.Parcelable;
import v6.AbstractC6055j;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class E extends AbstractC6157a {
    public static final Parcelable.Creator<E> CREATOR = new n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f16632b;

    public E(String str, float f10) {
        this.f16631a = str;
        this.f16632b = (((double) f10) <= 0.0d ? (f10 % 360.0f) + 360.0f : f10) % 360.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        return this.f16631a.equals(e10.f16631a) && Float.floatToIntBits(this.f16632b) == Float.floatToIntBits(e10.f16632b);
    }

    public int hashCode() {
        return AbstractC6055j.b(this.f16631a, Float.valueOf(this.f16632b));
    }

    public String toString() {
        return AbstractC6055j.c(this).a("panoId", this.f16631a).a("bearing", Float.valueOf(this.f16632b)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        String str = this.f16631a;
        int iA = w6.c.a(parcel);
        w6.c.w(parcel, 2, str, false);
        w6.c.j(parcel, 3, this.f16632b);
        w6.c.b(parcel, iA);
    }
}
