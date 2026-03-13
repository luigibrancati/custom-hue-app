package U6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import v6.AbstractC6056k;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: U6.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2288o extends AbstractC6157a {
    public static final Parcelable.Creator<C2288o> CREATOR = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2276c f16692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LatLng f16693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f16694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f16695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LatLngBounds f16696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f16697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f16698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f16700i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f16701j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f16702k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f16703l;

    public C2288o() {
        this.f16699h = true;
        this.f16700i = 0.0f;
        this.f16701j = 0.5f;
        this.f16702k = 0.5f;
        this.f16703l = false;
    }

    public boolean A() {
        return this.f16699h;
    }

    public C2288o B(LatLng latLng, float f10) {
        AbstractC6056k.q(this.f16696e == null, "Position has already been set using positionFromBounds");
        AbstractC6056k.b(latLng != null, "Location must be specified");
        AbstractC6056k.b(f10 >= 0.0f, "Width must be non-negative");
        M(latLng, f10, -1.0f);
        return this;
    }

    public C2288o E(LatLng latLng, float f10, float f11) {
        AbstractC6056k.q(this.f16696e == null, "Position has already been set using positionFromBounds");
        AbstractC6056k.b(latLng != null, "Location must be specified");
        AbstractC6056k.b(f10 >= 0.0f, "Width must be non-negative");
        AbstractC6056k.b(f11 >= 0.0f, "Height must be non-negative");
        M(latLng, f10, f11);
        return this;
    }

    public C2288o H(LatLngBounds latLngBounds) {
        LatLng latLng = this.f16693b;
        AbstractC6056k.q(latLng == null, "Position has already been set using position: ".concat(String.valueOf(latLng)));
        this.f16696e = latLngBounds;
        return this;
    }

    public C2288o I(float f10) {
        boolean z10 = false;
        if (f10 >= 0.0f && f10 <= 1.0f) {
            z10 = true;
        }
        AbstractC6056k.b(z10, "Transparency must be in the range [0..1]");
        this.f16700i = f10;
        return this;
    }

    public C2288o J(boolean z10) {
        this.f16699h = z10;
        return this;
    }

    public C2288o L(float f10) {
        this.f16698g = f10;
        return this;
    }

    public final C2288o M(LatLng latLng, float f10, float f11) {
        this.f16693b = latLng;
        this.f16694c = f10;
        this.f16695d = f11;
        return this;
    }

    public C2288o d(float f10, float f11) {
        this.f16701j = f10;
        this.f16702k = f11;
        return this;
    }

    public C2288o e(float f10) {
        this.f16697f = ((f10 % 360.0f) + 360.0f) % 360.0f;
        return this;
    }

    public C2288o f(boolean z10) {
        this.f16703l = z10;
        return this;
    }

    public float h() {
        return this.f16701j;
    }

    public float k() {
        return this.f16702k;
    }

    public float l() {
        return this.f16697f;
    }

    public LatLngBounds n() {
        return this.f16696e;
    }

    public float r() {
        return this.f16695d;
    }

    public LatLng t() {
        return this.f16693b;
    }

    public float v() {
        return this.f16700i;
    }

    public float w() {
        return this.f16694c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.m(parcel, 2, this.f16692a.a().asBinder(), false);
        w6.c.u(parcel, 3, t(), i10, false);
        w6.c.j(parcel, 4, w());
        w6.c.j(parcel, 5, r());
        w6.c.u(parcel, 6, n(), i10, false);
        w6.c.j(parcel, 7, l());
        w6.c.j(parcel, 8, x());
        w6.c.c(parcel, 9, A());
        w6.c.j(parcel, 10, v());
        w6.c.j(parcel, 11, h());
        w6.c.j(parcel, 12, k());
        w6.c.c(parcel, 13, z());
        w6.c.b(parcel, iA);
    }

    public float x() {
        return this.f16698g;
    }

    public C2288o y(C2276c c2276c) {
        AbstractC6056k.m(c2276c, "imageDescriptor must not be null");
        this.f16692a = c2276c;
        return this;
    }

    public boolean z() {
        return this.f16703l;
    }

    public C2288o(IBinder iBinder, LatLng latLng, float f10, float f11, LatLngBounds latLngBounds, float f12, float f13, boolean z10, float f14, float f15, float f16, boolean z11) {
        this.f16699h = true;
        this.f16700i = 0.0f;
        this.f16701j = 0.5f;
        this.f16702k = 0.5f;
        this.f16703l = false;
        this.f16692a = new C2276c(IObjectWrapper.Stub.asInterface(iBinder));
        this.f16693b = latLng;
        this.f16694c = f10;
        this.f16695d = f11;
        this.f16696e = latLngBounds;
        this.f16697f = f12;
        this.f16698g = f13;
        this.f16699h = z10;
        this.f16700i = f14;
        this.f16701j = f15;
        this.f16702k = f16;
        this.f16703l = z11;
    }
}
