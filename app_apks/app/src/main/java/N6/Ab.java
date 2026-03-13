package N6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Ab extends AbstractC6157a {
    public static final Parcelable.Creator<Ab> CREATOR = new Tb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9666b;

    public Ab(int i10, String str) {
        this.f9665a = i10;
        this.f9666b = str;
    }

    public final int d() {
        return this.f9665a;
    }

    public final String e() {
        return this.f9666b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, this.f9665a);
        w6.c.w(parcel, 2, this.f9666b, false);
        w6.c.b(parcel, iA);
    }
}
