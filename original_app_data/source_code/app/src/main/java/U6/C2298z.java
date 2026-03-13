package U6;

import U6.G;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v6.AbstractC6056k;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: U6.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2298z extends AbstractC6157a {
    public static final Parcelable.Creator<C2298z> CREATOR = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f16754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f16756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C2279f f16760h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C2279f f16761i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16762j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f16763k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f16764l;

    public C2298z() {
        this.f16754b = 10.0f;
        this.f16755c = -16777216;
        this.f16756d = 0.0f;
        this.f16757e = true;
        this.f16758f = false;
        this.f16759g = false;
        this.f16760h = new C2278e();
        this.f16761i = new C2278e();
        this.f16762j = 0;
        this.f16763k = null;
        this.f16764l = new ArrayList();
        this.f16753a = new ArrayList();
    }

    public boolean A() {
        return this.f16758f;
    }

    public boolean B() {
        return this.f16757e;
    }

    public C2298z E(int i10) {
        this.f16762j = i10;
        return this;
    }

    public C2298z H(List list) {
        this.f16763k = list;
        return this;
    }

    public C2298z I(C2279f c2279f) {
        this.f16760h = (C2279f) AbstractC6056k.m(c2279f, "startCap must not be null");
        return this;
    }

    public C2298z J(boolean z10) {
        this.f16757e = z10;
        return this;
    }

    public C2298z L(float f10) {
        this.f16754b = f10;
        return this;
    }

    public C2298z M(float f10) {
        this.f16756d = f10;
        return this;
    }

    public C2298z d(Iterable iterable) {
        AbstractC6056k.m(iterable, "points must not be null.");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f16753a.add((LatLng) it.next());
        }
        return this;
    }

    public C2298z e(boolean z10) {
        this.f16759g = z10;
        return this;
    }

    public C2298z f(int i10) {
        this.f16755c = i10;
        return this;
    }

    public C2298z h(C2279f c2279f) {
        this.f16761i = (C2279f) AbstractC6056k.m(c2279f, "endCap must not be null");
        return this;
    }

    public C2298z k(boolean z10) {
        this.f16758f = z10;
        return this;
    }

    public int l() {
        return this.f16755c;
    }

    public C2279f n() {
        return this.f16761i.d();
    }

    public int r() {
        return this.f16762j;
    }

    public List t() {
        return this.f16763k;
    }

    public List v() {
        return this.f16753a;
    }

    public C2279f w() {
        return this.f16760h.d();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.A(parcel, 2, v(), false);
        w6.c.j(parcel, 3, x());
        w6.c.n(parcel, 4, l());
        w6.c.j(parcel, 5, y());
        w6.c.c(parcel, 6, B());
        w6.c.c(parcel, 7, A());
        w6.c.c(parcel, 8, z());
        w6.c.u(parcel, 9, w(), i10, false);
        w6.c.u(parcel, 10, n(), i10, false);
        w6.c.n(parcel, 11, r());
        w6.c.A(parcel, 12, t(), false);
        ArrayList arrayList = new ArrayList(this.f16764l.size());
        for (H h10 : this.f16764l) {
            G.a aVar = new G.a(h10.e());
            aVar.c(this.f16754b);
            aVar.b(this.f16757e);
            arrayList.add(new H(aVar.a(), h10.d()));
        }
        w6.c.A(parcel, 13, arrayList, false);
        w6.c.b(parcel, iA);
    }

    public float x() {
        return this.f16754b;
    }

    public float y() {
        return this.f16756d;
    }

    public boolean z() {
        return this.f16759g;
    }

    public C2298z(List list, float f10, int i10, float f11, boolean z10, boolean z11, boolean z12, C2279f c2279f, C2279f c2279f2, int i11, List list2, List list3) {
        this.f16754b = 10.0f;
        this.f16755c = -16777216;
        this.f16756d = 0.0f;
        this.f16757e = true;
        this.f16758f = false;
        this.f16759g = false;
        this.f16760h = new C2278e();
        this.f16761i = new C2278e();
        this.f16762j = 0;
        this.f16763k = null;
        this.f16764l = new ArrayList();
        this.f16753a = list;
        this.f16754b = f10;
        this.f16755c = i10;
        this.f16756d = f11;
        this.f16757e = z10;
        this.f16758f = z11;
        this.f16759g = z12;
        if (c2279f != null) {
            this.f16760h = c2279f;
        }
        if (c2279f2 != null) {
            this.f16761i = c2279f2;
        }
        this.f16762j = i11;
        this.f16763k = list2;
        if (list3 != null) {
            this.f16764l = list3;
        }
    }
}
