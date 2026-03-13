package N6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class X7 extends AbstractC6157a {
    public static final Parcelable.Creator<X7> CREATOR = new C1305f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10129b;

    public X7() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.w(parcel, 2, this.f10128a, false);
        w6.c.w(parcel, 3, this.f10129b, false);
        w6.c.b(parcel, iA);
    }

    public X7(String str, String str2) {
        this.f10128a = str;
        this.f10129b = str2;
    }
}
