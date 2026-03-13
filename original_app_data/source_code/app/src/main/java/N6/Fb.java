package N6;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Fb extends AbstractC6157a {
    public static final Parcelable.Creator<Fb> CREATOR = new Gb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f9725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Point[] f9726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1550xb f9728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Ab f9729h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bb f9730i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Eb f9731j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Cb f9732k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1563yb f9733l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C1511ub f9734m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C1524vb f9735n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1537wb f9736o;

    public Fb(int i10, String str, String str2, byte[] bArr, Point[] pointArr, int i11, C1550xb c1550xb, Ab ab2, Bb bb2, Eb eb2, Cb cb2, C1563yb c1563yb, C1511ub c1511ub, C1524vb c1524vb, C1537wb c1537wb) {
        this.f9722a = i10;
        this.f9723b = str;
        this.f9724c = str2;
        this.f9725d = bArr;
        this.f9726e = pointArr;
        this.f9727f = i11;
        this.f9728g = c1550xb;
        this.f9729h = ab2;
        this.f9730i = bb2;
        this.f9731j = eb2;
        this.f9732k = cb2;
        this.f9733l = c1563yb;
        this.f9734m = c1511ub;
        this.f9735n = c1524vb;
        this.f9736o = c1537wb;
    }

    public final Point[] A() {
        return this.f9726e;
    }

    public final int d() {
        return this.f9722a;
    }

    public final int e() {
        return this.f9727f;
    }

    public final C1511ub f() {
        return this.f9734m;
    }

    public final C1524vb h() {
        return this.f9735n;
    }

    public final C1537wb k() {
        return this.f9736o;
    }

    public final C1550xb l() {
        return this.f9728g;
    }

    public final C1563yb n() {
        return this.f9733l;
    }

    public final Ab r() {
        return this.f9729h;
    }

    public final Bb t() {
        return this.f9730i;
    }

    public final Cb v() {
        return this.f9732k;
    }

    public final Eb w() {
        return this.f9731j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, this.f9722a);
        w6.c.w(parcel, 2, this.f9723b, false);
        w6.c.w(parcel, 3, this.f9724c, false);
        w6.c.g(parcel, 4, this.f9725d, false);
        w6.c.z(parcel, 5, this.f9726e, i10, false);
        w6.c.n(parcel, 6, this.f9727f);
        w6.c.u(parcel, 7, this.f9728g, i10, false);
        w6.c.u(parcel, 8, this.f9729h, i10, false);
        w6.c.u(parcel, 9, this.f9730i, i10, false);
        w6.c.u(parcel, 10, this.f9731j, i10, false);
        w6.c.u(parcel, 11, this.f9732k, i10, false);
        w6.c.u(parcel, 12, this.f9733l, i10, false);
        w6.c.u(parcel, 13, this.f9734m, i10, false);
        w6.c.u(parcel, 14, this.f9735n, i10, false);
        w6.c.u(parcel, 15, this.f9736o, i10, false);
        w6.c.b(parcel, iA);
    }

    public final String x() {
        return this.f9723b;
    }

    public final String y() {
        return this.f9724c;
    }

    public final byte[] z() {
        return this.f9725d;
    }
}
