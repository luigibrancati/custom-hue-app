package R6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends AbstractC6157a {
    public static final Parcelable.Creator<o> CREATOR = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f14830f;

    public o(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f14825a = z10;
        this.f14826b = z11;
        this.f14827c = z12;
        this.f14828d = z13;
        this.f14829e = z14;
        this.f14830f = z15;
    }

    public boolean d() {
        return this.f14830f;
    }

    public boolean e() {
        return this.f14827c;
    }

    public boolean f() {
        return this.f14828d;
    }

    public boolean h() {
        return this.f14825a;
    }

    public boolean k() {
        return this.f14829e;
    }

    public boolean l() {
        return this.f14826b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.c(parcel, 1, h());
        w6.c.c(parcel, 2, l());
        w6.c.c(parcel, 3, e());
        w6.c.c(parcel, 4, f());
        w6.c.c(parcel, 5, k());
        w6.c.c(parcel, 6, d());
        w6.c.b(parcel, iA);
    }
}
