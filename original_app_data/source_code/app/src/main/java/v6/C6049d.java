package v6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: v6.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C6049d extends AbstractC6157a {
    public static final Parcelable.Creator<C6049d> CREATOR = new P();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6058m f45838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f45839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f45840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f45841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f45842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f45843f;

    public C6049d(C6058m c6058m, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f45838a = c6058m;
        this.f45839b = z10;
        this.f45840c = z11;
        this.f45841d = iArr;
        this.f45842e = i10;
        this.f45843f = iArr2;
    }

    public int d() {
        return this.f45842e;
    }

    public int[] e() {
        return this.f45841d;
    }

    public int[] f() {
        return this.f45843f;
    }

    public boolean h() {
        return this.f45839b;
    }

    public boolean k() {
        return this.f45840c;
    }

    public final C6058m l() {
        return this.f45838a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.u(parcel, 1, this.f45838a, i10, false);
        w6.c.c(parcel, 2, h());
        w6.c.c(parcel, 3, k());
        w6.c.o(parcel, 4, e(), false);
        w6.c.n(parcel, 5, d());
        w6.c.o(parcel, 6, f(), false);
        w6.c.b(parcel, iA);
    }
}
