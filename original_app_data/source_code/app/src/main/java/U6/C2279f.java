package U6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.dynamic.IObjectWrapper;
import v6.AbstractC6055j;
import v6.AbstractC6056k;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: U6.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C2279f extends AbstractC6157a {
    public static final Parcelable.Creator<C2279f> CREATOR = new X();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f16669d = "f";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2276c f16671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f16672c;

    public C2279f(int i10) {
        this(i10, (C2276c) null, (Float) null);
    }

    public final C2279f d() {
        int i10 = this.f16670a;
        if (i10 == 0) {
            return new C2278e();
        }
        if (i10 == 1) {
            return new C();
        }
        if (i10 == 2) {
            return new A();
        }
        if (i10 == 3) {
            C2276c c2276c = this.f16671b;
            AbstractC6056k.q(c2276c != null, "bitmapDescriptor must not be null");
            Float f10 = this.f16672c;
            AbstractC6056k.q(f10 != null, "bitmapRefWidth must not be null");
            return new C2282i(c2276c, f10.floatValue());
        }
        Log.w(f16669d, "Unknown Cap type: " + i10);
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2279f)) {
            return false;
        }
        C2279f c2279f = (C2279f) obj;
        return this.f16670a == c2279f.f16670a && AbstractC6055j.a(this.f16671b, c2279f.f16671b) && AbstractC6055j.a(this.f16672c, c2279f.f16672c);
    }

    public int hashCode() {
        return AbstractC6055j.b(Integer.valueOf(this.f16670a), this.f16671b, this.f16672c);
    }

    public String toString() {
        return "[Cap: type=" + this.f16670a + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f16670a;
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 2, i11);
        C2276c c2276c = this.f16671b;
        w6.c.m(parcel, 3, c2276c == null ? null : c2276c.a().asBinder(), false);
        w6.c.l(parcel, 4, this.f16672c, false);
        w6.c.b(parcel, iA);
    }

    public C2279f(int i10, IBinder iBinder, Float f10) {
        this(i10, iBinder == null ? null : new C2276c(IObjectWrapper.Stub.asInterface(iBinder)), f10);
    }

    public C2279f(int i10, C2276c c2276c, Float f10) {
        boolean z10 = f10 != null && f10.floatValue() > 0.0f;
        if (i10 == 3) {
            z = c2276c != null && z10;
            i10 = 3;
        }
        AbstractC6056k.b(z, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i10), c2276c, f10));
        this.f16670a = i10;
        this.f16671b = c2276c;
        this.f16672c = f10;
    }

    public C2279f(C2276c c2276c, float f10) {
        this(3, c2276c, Float.valueOf(f10));
    }
}
