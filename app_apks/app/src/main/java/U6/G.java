package U6;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class G extends AbstractC6157a {
    public static final Parcelable.Creator<G> CREATOR = new P();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f16636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f16639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final D f16640e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f16641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16642b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16643c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f16644d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public D f16645e;

        public a(G g10) {
            this.f16641a = g10.f();
            Pair pairH = g10.h();
            this.f16642b = ((Integer) pairH.first).intValue();
            this.f16643c = ((Integer) pairH.second).intValue();
            this.f16644d = g10.e();
            this.f16645e = g10.d();
        }

        public G a() {
            return new G(this.f16641a, this.f16642b, this.f16643c, this.f16644d, this.f16645e);
        }

        public final a b(boolean z10) {
            this.f16644d = z10;
            return this;
        }

        public final a c(float f10) {
            this.f16641a = f10;
            return this;
        }
    }

    public G(float f10, int i10, int i11, boolean z10, D d10) {
        this.f16636a = f10;
        this.f16637b = i10;
        this.f16638c = i11;
        this.f16639d = z10;
        this.f16640e = d10;
    }

    public D d() {
        return this.f16640e;
    }

    public boolean e() {
        return this.f16639d;
    }

    public final float f() {
        return this.f16636a;
    }

    public final Pair h() {
        return new Pair(Integer.valueOf(this.f16637b), Integer.valueOf(this.f16638c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.j(parcel, 2, this.f16636a);
        w6.c.n(parcel, 3, this.f16637b);
        w6.c.n(parcel, 4, this.f16638c);
        w6.c.c(parcel, 5, e());
        w6.c.u(parcel, 6, d(), i10, false);
        w6.c.b(parcel, iA);
    }
}
