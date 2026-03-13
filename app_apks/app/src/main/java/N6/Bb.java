package N6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Bb extends AbstractC6157a {
    public static final Parcelable.Creator<Bb> CREATOR = new Ub();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9683b;

    public Bb(String str, String str2) {
        this.f9682a = str;
        this.f9683b = str2;
    }

    public final String d() {
        return this.f9682a;
    }

    public final String e() {
        return this.f9683b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f9682a;
        int iA = w6.c.a(parcel);
        w6.c.w(parcel, 1, str, false);
        w6.c.w(parcel, 2, this.f9683b, false);
        w6.c.b(parcel, iA);
    }
}
