package N6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: N6.vb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1524vb extends AbstractC6157a {
    public static final Parcelable.Creator<C1524vb> CREATOR = new Lb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1576zb f10508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ab[] f10511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1550xb[] f10512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f10513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1485sb[] f10514g;

    public C1524vb(C1576zb c1576zb, String str, String str2, Ab[] abArr, C1550xb[] c1550xbArr, String[] strArr, C1485sb[] c1485sbArr) {
        this.f10508a = c1576zb;
        this.f10509b = str;
        this.f10510c = str2;
        this.f10511d = abArr;
        this.f10512e = c1550xbArr;
        this.f10513f = strArr;
        this.f10514g = c1485sbArr;
    }

    public final C1576zb d() {
        return this.f10508a;
    }

    public final String e() {
        return this.f10509b;
    }

    public final String f() {
        return this.f10510c;
    }

    public final C1485sb[] h() {
        return this.f10514g;
    }

    public final C1550xb[] k() {
        return this.f10512e;
    }

    public final Ab[] l() {
        return this.f10511d;
    }

    public final String[] n() {
        return this.f10513f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.u(parcel, 1, this.f10508a, i10, false);
        w6.c.w(parcel, 2, this.f10509b, false);
        w6.c.w(parcel, 3, this.f10510c, false);
        w6.c.z(parcel, 4, this.f10511d, i10, false);
        w6.c.z(parcel, 5, this.f10512e, i10, false);
        w6.c.x(parcel, 6, this.f10513f, false);
        w6.c.z(parcel, 7, this.f10514g, i10, false);
        w6.c.b(parcel, iA);
    }
}
