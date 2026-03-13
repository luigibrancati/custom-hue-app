package Z6;

import android.os.Parcel;
import android.os.Parcelable;
import s6.C5783b;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends AbstractC6157a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5783b f20304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.common.internal.f f20305c;

    public j(int i10, C5783b c5783b, com.google.android.gms.common.internal.f fVar) {
        this.f20303a = i10;
        this.f20304b = c5783b;
        this.f20305c = fVar;
    }

    public final C5783b d() {
        return this.f20304b;
    }

    public final com.google.android.gms.common.internal.f e() {
        return this.f20305c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, this.f20303a);
        w6.c.u(parcel, 2, this.f20304b, i10, false);
        w6.c.u(parcel, 3, this.f20305c, i10, false);
        w6.c.b(parcel, iA);
    }
}
