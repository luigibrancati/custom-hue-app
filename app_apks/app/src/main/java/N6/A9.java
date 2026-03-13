package N6;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class A9 extends AbstractC6157a {
    public static final Parcelable.Creator<A9> CREATOR = new C1264ba();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f9649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f9650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Point[] f9652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public T5 f9653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1533w7 f9654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public X7 f9655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Z8 f9656i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C1560y8 f9657j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C1506u6 f9658k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C1453q4 f9659l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public R4 f9660m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C1479s5 f9661n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f9662o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f9663p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public double f9664q;

    public A9() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 2, this.f9648a);
        w6.c.w(parcel, 3, this.f9649b, false);
        w6.c.w(parcel, 4, this.f9650c, false);
        w6.c.n(parcel, 5, this.f9651d);
        w6.c.z(parcel, 6, this.f9652e, i10, false);
        w6.c.u(parcel, 7, this.f9653f, i10, false);
        w6.c.u(parcel, 8, this.f9654g, i10, false);
        w6.c.u(parcel, 9, this.f9655h, i10, false);
        w6.c.u(parcel, 10, this.f9656i, i10, false);
        w6.c.u(parcel, 11, this.f9657j, i10, false);
        w6.c.u(parcel, 12, this.f9658k, i10, false);
        w6.c.u(parcel, 13, this.f9659l, i10, false);
        w6.c.u(parcel, 14, this.f9660m, i10, false);
        w6.c.u(parcel, 15, this.f9661n, i10, false);
        w6.c.g(parcel, 16, this.f9662o, false);
        w6.c.c(parcel, 17, this.f9663p);
        w6.c.h(parcel, 18, this.f9664q);
        w6.c.b(parcel, iA);
    }

    public A9(int i10, String str, String str2, int i11, Point[] pointArr, T5 t52, C1533w7 c1533w7, X7 x72, Z8 z82, C1560y8 c1560y8, C1506u6 c1506u6, C1453q4 c1453q4, R4 r42, C1479s5 c1479s5, byte[] bArr, boolean z10, double d10) {
        this.f9648a = i10;
        this.f9649b = str;
        this.f9662o = bArr;
        this.f9650c = str2;
        this.f9651d = i11;
        this.f9652e = pointArr;
        this.f9663p = z10;
        this.f9664q = d10;
        this.f9653f = t52;
        this.f9654g = c1533w7;
        this.f9655h = x72;
        this.f9656i = z82;
        this.f9657j = c1560y8;
        this.f9658k = c1506u6;
        this.f9659l = c1453q4;
        this.f9660m = r42;
        this.f9661n = c1479s5;
    }
}
