package X6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: X6.w6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2522w6 extends AbstractC6157a {
    public static final Parcelable.Creator<C2522w6> CREATOR = new C2530x6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f19293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f19295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f19297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f19298g;

    public C2522w6(long j10, byte[] bArr, String str, Bundle bundle, int i10, long j11, String str2) {
        this.f19292a = j10;
        this.f19293b = bArr;
        this.f19294c = str;
        this.f19295d = bundle;
        this.f19296e = i10;
        this.f19297f = j11;
        this.f19298g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f19292a;
        int iA = w6.c.a(parcel);
        w6.c.s(parcel, 1, j10);
        w6.c.g(parcel, 2, this.f19293b, false);
        w6.c.w(parcel, 3, this.f19294c, false);
        w6.c.e(parcel, 4, this.f19295d, false);
        w6.c.n(parcel, 5, this.f19296e);
        w6.c.s(parcel, 6, this.f19297f);
        w6.c.w(parcel, 7, this.f19298g, false);
        w6.c.b(parcel, iA);
    }
}
