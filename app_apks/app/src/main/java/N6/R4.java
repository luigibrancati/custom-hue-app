package N6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class R4 extends AbstractC6157a {
    public static final Parcelable.Creator<R4> CREATOR = new Db();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public V6 f10023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1533w7[] f10026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public T5[] f10027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String[] f10028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1426o3[] f10029g;

    public R4() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.u(parcel, 2, this.f10023a, i10, false);
        w6.c.w(parcel, 3, this.f10024b, false);
        w6.c.w(parcel, 4, this.f10025c, false);
        w6.c.z(parcel, 5, this.f10026d, i10, false);
        w6.c.z(parcel, 6, this.f10027e, i10, false);
        w6.c.x(parcel, 7, this.f10028f, false);
        w6.c.z(parcel, 8, this.f10029g, i10, false);
        w6.c.b(parcel, iA);
    }

    public R4(V6 v62, String str, String str2, C1533w7[] c1533w7Arr, T5[] t5Arr, String[] strArr, C1426o3[] c1426o3Arr) {
        this.f10023a = v62;
        this.f10024b = str;
        this.f10025c = str2;
        this.f10026d = c1533w7Arr;
        this.f10027e = t5Arr;
        this.f10028f = strArr;
        this.f10029g = c1426o3Arr;
    }
}
