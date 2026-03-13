package N6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class V6 extends AbstractC6157a {
    public static final Parcelable.Creator<V6> CREATOR = new C1279d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f10104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f10105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f10106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f10107g;

    public V6() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.w(parcel, 2, this.f10101a, false);
        w6.c.w(parcel, 3, this.f10102b, false);
        w6.c.w(parcel, 4, this.f10103c, false);
        w6.c.w(parcel, 5, this.f10104d, false);
        w6.c.w(parcel, 6, this.f10105e, false);
        w6.c.w(parcel, 7, this.f10106f, false);
        w6.c.w(parcel, 8, this.f10107g, false);
        w6.c.b(parcel, iA);
    }

    public V6(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f10101a = str;
        this.f10102b = str2;
        this.f10103c = str3;
        this.f10104d = str4;
        this.f10105e = str5;
        this.f10106f = str6;
        this.f10107g = str7;
    }
}
