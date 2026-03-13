package U6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v6.AbstractC6056k;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: U6.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2296x extends AbstractC6157a {
    public static final Parcelable.Creator<C2296x> CREATOR = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f16742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f16743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f16746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16748h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f16749i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16750j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f16751k;

    public C2296x() {
        this.f16743c = 10.0f;
        this.f16744d = -16777216;
        this.f16745e = 0;
        this.f16746f = 0.0f;
        this.f16747g = true;
        this.f16748h = false;
        this.f16749i = false;
        this.f16750j = 0;
        this.f16751k = null;
        this.f16741a = new ArrayList();
        this.f16742b = new ArrayList();
    }

    public boolean A() {
        return this.f16747g;
    }

    public C2296x B(int i10) {
        this.f16744d = i10;
        return this;
    }

    public C2296x E(float f10) {
        this.f16743c = f10;
        return this;
    }

    public C2296x H(boolean z10) {
        this.f16747g = z10;
        return this;
    }

    public C2296x I(float f10) {
        this.f16746f = f10;
        return this;
    }

    public C2296x d(Iterable iterable) {
        AbstractC6056k.m(iterable, "points must not be null.");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f16741a.add((LatLng) it.next());
        }
        return this;
    }

    public C2296x e(Iterable iterable) {
        AbstractC6056k.m(iterable, "points must not be null.");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add((LatLng) it.next());
        }
        this.f16742b.add(arrayList);
        return this;
    }

    public C2296x f(boolean z10) {
        this.f16749i = z10;
        return this;
    }

    public C2296x h(int i10) {
        this.f16745e = i10;
        return this;
    }

    public C2296x k(boolean z10) {
        this.f16748h = z10;
        return this;
    }

    public int l() {
        return this.f16745e;
    }

    public List n() {
        return this.f16741a;
    }

    public int r() {
        return this.f16744d;
    }

    public int t() {
        return this.f16750j;
    }

    public List v() {
        return this.f16751k;
    }

    public float w() {
        return this.f16743c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.A(parcel, 2, n(), false);
        w6.c.r(parcel, 3, this.f16742b, false);
        w6.c.j(parcel, 4, w());
        w6.c.n(parcel, 5, r());
        w6.c.n(parcel, 6, l());
        w6.c.j(parcel, 7, x());
        w6.c.c(parcel, 8, A());
        w6.c.c(parcel, 9, z());
        w6.c.c(parcel, 10, y());
        w6.c.n(parcel, 11, t());
        w6.c.A(parcel, 12, v(), false);
        w6.c.b(parcel, iA);
    }

    public float x() {
        return this.f16746f;
    }

    public boolean y() {
        return this.f16749i;
    }

    public boolean z() {
        return this.f16748h;
    }

    public C2296x(List list, List list2, float f10, int i10, int i11, float f11, boolean z10, boolean z11, boolean z12, int i12, List list3) {
        this.f16741a = list;
        this.f16742b = list2;
        this.f16743c = f10;
        this.f16744d = i10;
        this.f16745e = i11;
        this.f16746f = f11;
        this.f16747g = z10;
        this.f16748h = z11;
        this.f16749i = z12;
        this.f16750j = i12;
        this.f16751k = list3;
    }
}
