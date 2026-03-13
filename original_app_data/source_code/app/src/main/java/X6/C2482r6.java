package X6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: X6.r6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2482r6 extends AbstractC6157a {
    public static final Parcelable.Creator<C2482r6> CREATOR = new C2490s6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19194c;

    public C2482r6(String str, long j10, int i10) {
        this.f19192a = str;
        this.f19193b = j10;
        this.f19194c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f19192a;
        int iA = w6.c.a(parcel);
        w6.c.w(parcel, 1, str, false);
        w6.c.s(parcel, 2, this.f19193b);
        w6.c.n(parcel, 3, this.f19194c);
        w6.c.b(parcel, iA);
    }
}
