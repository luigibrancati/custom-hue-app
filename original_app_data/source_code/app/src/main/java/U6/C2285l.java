package U6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: U6.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2285l extends AbstractC6157a {
    public static final Parcelable.Creator<C2285l> CREATOR = new Z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f16686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f16687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f16688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Float f16689d;

    public C2285l(Integer num, Integer num2, Float f10, Float f11) {
        this.f16686a = num;
        this.f16687b = num2;
        this.f16688c = f10;
        this.f16689d = f11;
    }

    public Integer d() {
        return this.f16686a;
    }

    public Float e() {
        return this.f16689d;
    }

    public Integer f() {
        return this.f16687b;
    }

    public Float h() {
        return this.f16688c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.q(parcel, 1, d(), false);
        w6.c.q(parcel, 2, f(), false);
        w6.c.l(parcel, 3, h(), false);
        w6.c.l(parcel, 4, e(), false);
        w6.c.b(parcel, iA);
    }
}
