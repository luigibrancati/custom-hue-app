package U6;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class I extends AbstractC6157a {
    public static final Parcelable.Creator<I> CREATOR = new S();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f16650c;

    public I(int i10, int i11, byte[] bArr) {
        this.f16648a = i10;
        this.f16649b = i11;
        this.f16650c = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f16648a;
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 2, i11);
        w6.c.n(parcel, 3, this.f16649b);
        w6.c.g(parcel, 4, this.f16650c, false);
        w6.c.b(parcel, iA);
    }
}
