package N6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class T5 extends AbstractC6157a {
    public static final Parcelable.Creator<T5> CREATOR = new C1253b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f10071d;

    public T5() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 2, this.f10068a);
        w6.c.w(parcel, 3, this.f10069b, false);
        w6.c.w(parcel, 4, this.f10070c, false);
        w6.c.w(parcel, 5, this.f10071d, false);
        w6.c.b(parcel, iA);
    }

    public T5(int i10, String str, String str2, String str3) {
        this.f10068a = i10;
        this.f10069b = str;
        this.f10070c = str2;
        this.f10071d = str3;
    }
}
