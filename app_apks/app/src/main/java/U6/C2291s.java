package U6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: U6.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C2291s extends AbstractC6157a {
    public static final Parcelable.Creator<C2291s> CREATOR = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LatLng f16707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f16708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2276c f16710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f16711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f16712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16714h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f16715i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f16716j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f16717k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f16718l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f16719m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f16720n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f16721o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f16722p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16723q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f16724r;

    public C2291s() {
        this.f16711e = 0.5f;
        this.f16712f = 1.0f;
        this.f16714h = true;
        this.f16715i = false;
        this.f16716j = 0.0f;
        this.f16717k = 0.5f;
        this.f16718l = 0.0f;
        this.f16719m = 1.0f;
        this.f16721o = 0;
    }

    public float A() {
        return this.f16720n;
    }

    public C2291s B(C2276c c2276c) {
        this.f16710d = c2276c;
        return this;
    }

    public C2291s E(float f10, float f11) {
        this.f16717k = f10;
        this.f16718l = f11;
        return this;
    }

    public boolean H() {
        return this.f16713g;
    }

    public boolean I() {
        return this.f16715i;
    }

    public boolean J() {
        return this.f16714h;
    }

    public C2291s L(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        this.f16707a = latLng;
        return this;
    }

    public C2291s M(float f10) {
        this.f16716j = f10;
        return this;
    }

    public C2291s N(String str) {
        this.f16709c = str;
        return this;
    }

    public C2291s O(String str) {
        this.f16708b = str;
        return this;
    }

    public C2291s P(boolean z10) {
        this.f16714h = z10;
        return this;
    }

    public C2291s Q(float f10) {
        this.f16720n = f10;
        return this;
    }

    public final int R() {
        return this.f16723q;
    }

    public final C2291s T(int i10) {
        this.f16721o = i10;
        return this;
    }

    public final C2291s U(int i10) {
        this.f16723q = 1;
        return this;
    }

    public C2291s d(float f10) {
        this.f16719m = f10;
        return this;
    }

    public C2291s e(float f10, float f11) {
        this.f16711e = f10;
        this.f16712f = f11;
        return this;
    }

    public C2291s f(boolean z10) {
        this.f16713g = z10;
        return this;
    }

    public C2291s h(boolean z10) {
        this.f16715i = z10;
        return this;
    }

    public float k() {
        return this.f16719m;
    }

    public float l() {
        return this.f16711e;
    }

    public float n() {
        return this.f16712f;
    }

    public C2276c r() {
        return this.f16710d;
    }

    public float t() {
        return this.f16717k;
    }

    public float v() {
        return this.f16718l;
    }

    public LatLng w() {
        return this.f16707a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.u(parcel, 2, w(), i10, false);
        w6.c.w(parcel, 3, z(), false);
        w6.c.w(parcel, 4, y(), false);
        C2276c c2276c = this.f16710d;
        w6.c.m(parcel, 5, c2276c == null ? null : c2276c.a().asBinder(), false);
        w6.c.j(parcel, 6, l());
        w6.c.j(parcel, 7, n());
        w6.c.c(parcel, 8, H());
        w6.c.c(parcel, 9, J());
        w6.c.c(parcel, 10, I());
        w6.c.j(parcel, 11, x());
        w6.c.j(parcel, 12, t());
        w6.c.j(parcel, 13, v());
        w6.c.j(parcel, 14, k());
        w6.c.j(parcel, 15, A());
        w6.c.n(parcel, 17, this.f16721o);
        w6.c.m(parcel, 18, ObjectWrapper.wrap(this.f16722p).asBinder(), false);
        w6.c.n(parcel, 19, this.f16723q);
        w6.c.w(parcel, 20, this.f16724r, false);
        w6.c.b(parcel, iA);
    }

    public float x() {
        return this.f16716j;
    }

    public String y() {
        return this.f16709c;
    }

    public String z() {
        return this.f16708b;
    }

    public C2291s(LatLng latLng, String str, String str2, IBinder iBinder, float f10, float f11, boolean z10, boolean z11, boolean z12, float f12, float f13, float f14, float f15, float f16, int i10, IBinder iBinder2, int i11, String str3) {
        this.f16711e = 0.5f;
        this.f16712f = 1.0f;
        this.f16714h = true;
        this.f16715i = false;
        this.f16716j = 0.0f;
        this.f16717k = 0.5f;
        this.f16718l = 0.0f;
        this.f16719m = 1.0f;
        this.f16721o = 0;
        this.f16707a = latLng;
        this.f16708b = str;
        this.f16709c = str2;
        if (iBinder == null) {
            this.f16710d = null;
        } else {
            this.f16710d = new C2276c(IObjectWrapper.Stub.asInterface(iBinder));
        }
        this.f16711e = f10;
        this.f16712f = f11;
        this.f16713g = z10;
        this.f16714h = z11;
        this.f16715i = z12;
        this.f16716j = f12;
        this.f16717k = f13;
        this.f16718l = f14;
        this.f16719m = f15;
        this.f16720n = f16;
        this.f16723q = i11;
        this.f16721o = i10;
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(iBinder2);
        this.f16722p = iObjectWrapperAsInterface != null ? (View) ObjectWrapper.unwrap(iObjectWrapperAsInterface) : null;
        this.f16724r = str3;
    }
}
