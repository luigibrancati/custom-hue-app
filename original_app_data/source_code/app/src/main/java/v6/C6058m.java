package v6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: v6.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C6058m extends AbstractC6157a {
    public static final Parcelable.Creator<C6058m> CREATOR = new I();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f45870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f45871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f45872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f45873e;

    public C6058m(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f45869a = i10;
        this.f45870b = z10;
        this.f45871c = z11;
        this.f45872d = i11;
        this.f45873e = i12;
    }

    public int d() {
        return this.f45872d;
    }

    public int e() {
        return this.f45873e;
    }

    public boolean f() {
        return this.f45870b;
    }

    public boolean h() {
        return this.f45871c;
    }

    public int k() {
        return this.f45869a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, k());
        w6.c.c(parcel, 2, f());
        w6.c.c(parcel, 3, h());
        w6.c.n(parcel, 4, d());
        w6.c.n(parcel, 5, e());
        w6.c.b(parcel, iA);
    }
}
