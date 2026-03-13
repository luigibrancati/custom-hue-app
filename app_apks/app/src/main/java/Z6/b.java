package Z6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import t6.InterfaceC5851i;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends AbstractC6157a implements InterfaceC5851i {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Intent f20298c;

    public b() {
        this(2, 0, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f20296a;
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, i11);
        w6.c.n(parcel, 2, this.f20297b);
        w6.c.u(parcel, 3, this.f20298c, i10, false);
        w6.c.b(parcel, iA);
    }

    public b(int i10, int i11, Intent intent) {
        this.f20296a = i10;
        this.f20297b = i11;
        this.f20298c = intent;
    }
}
