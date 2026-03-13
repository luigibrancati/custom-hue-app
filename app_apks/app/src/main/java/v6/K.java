package v6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class K extends AbstractC6157a {
    public static final Parcelable.Creator<K> CREATOR = new L();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45789a;

    public K(int i10) {
        this.f45789a = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f45789a;
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, i11);
        w6.c.b(parcel, iA);
    }
}
