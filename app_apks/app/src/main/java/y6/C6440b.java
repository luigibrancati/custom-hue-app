package y6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: y6.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C6440b extends AbstractC6157a {
    public static final Parcelable.Creator<C6440b> CREATOR = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f48477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48478b;

    public C6440b(boolean z10, int i10) {
        this.f48477a = z10;
        this.f48478b = i10;
    }

    public boolean d() {
        return this.f48477a;
    }

    public int e() {
        return this.f48478b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.c(parcel, 1, d());
        w6.c.n(parcel, 2, e());
        w6.c.b(parcel, iA);
    }
}
