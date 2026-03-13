package N6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Eb extends AbstractC6157a {
    public static final Parcelable.Creator<Eb> CREATOR = new Wb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9715c;

    public Eb(String str, String str2, int i10) {
        this.f9713a = str;
        this.f9714b = str2;
        this.f9715c = i10;
    }

    public final int d() {
        return this.f9715c;
    }

    public final String e() {
        return this.f9714b;
    }

    public final String f() {
        return this.f9713a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f9713a;
        int iA = w6.c.a(parcel);
        w6.c.w(parcel, 1, str, false);
        w6.c.w(parcel, 2, this.f9714b, false);
        w6.c.n(parcel, 3, this.f9715c);
        w6.c.b(parcel, iA);
    }
}
