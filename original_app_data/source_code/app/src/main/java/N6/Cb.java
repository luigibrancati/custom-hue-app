package N6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Cb extends AbstractC6157a {
    public static final Parcelable.Creator<Cb> CREATOR = new Vb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9691b;

    public Cb(String str, String str2) {
        this.f9690a = str;
        this.f9691b = str2;
    }

    public final String d() {
        return this.f9690a;
    }

    public final String e() {
        return this.f9691b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f9690a;
        int iA = w6.c.a(parcel);
        w6.c.w(parcel, 1, str, false);
        w6.c.w(parcel, 2, this.f9691b, false);
        w6.c.b(parcel, iA);
    }
}
