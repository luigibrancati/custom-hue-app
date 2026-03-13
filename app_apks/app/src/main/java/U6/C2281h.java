package U6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import v6.AbstractC6056k;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: U6.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2281h extends AbstractC6157a {
    public static final Parcelable.Creator<C2281h> CREATOR = new Y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LatLng f16674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f16675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f16676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f16679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16681h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f16682i;

    public C2281h() {
        this.f16674a = null;
        this.f16675b = 0.0d;
        this.f16676c = 10.0f;
        this.f16677d = -16777216;
        this.f16678e = 0;
        this.f16679f = 0.0f;
        this.f16680g = true;
        this.f16681h = false;
        this.f16682i = null;
    }

    public C2281h A(float f10) {
        this.f16676c = f10;
        return this;
    }

    public C2281h B(boolean z10) {
        this.f16680g = z10;
        return this;
    }

    public C2281h E(float f10) {
        this.f16679f = f10;
        return this;
    }

    public C2281h d(LatLng latLng) {
        AbstractC6056k.m(latLng, "center must not be null.");
        this.f16674a = latLng;
        return this;
    }

    public C2281h e(boolean z10) {
        this.f16681h = z10;
        return this;
    }

    public C2281h f(int i10) {
        this.f16678e = i10;
        return this;
    }

    public LatLng h() {
        return this.f16674a;
    }

    public int k() {
        return this.f16678e;
    }

    public double l() {
        return this.f16675b;
    }

    public int n() {
        return this.f16677d;
    }

    public List r() {
        return this.f16682i;
    }

    public float t() {
        return this.f16676c;
    }

    public float v() {
        return this.f16679f;
    }

    public boolean w() {
        return this.f16681h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.u(parcel, 2, h(), i10, false);
        w6.c.h(parcel, 3, l());
        w6.c.j(parcel, 4, t());
        w6.c.n(parcel, 5, n());
        w6.c.n(parcel, 6, k());
        w6.c.j(parcel, 7, v());
        w6.c.c(parcel, 8, x());
        w6.c.c(parcel, 9, w());
        w6.c.A(parcel, 10, r(), false);
        w6.c.b(parcel, iA);
    }

    public boolean x() {
        return this.f16680g;
    }

    public C2281h y(double d10) {
        this.f16675b = d10;
        return this;
    }

    public C2281h z(int i10) {
        this.f16677d = i10;
        return this;
    }

    public C2281h(LatLng latLng, double d10, float f10, int i10, int i11, float f11, boolean z10, boolean z11, List list) {
        this.f16674a = latLng;
        this.f16675b = d10;
        this.f16676c = f10;
        this.f16677d = i10;
        this.f16678e = i11;
        this.f16679f = f11;
        this.f16680g = z10;
        this.f16681h = z11;
        this.f16682i = list;
    }
}
