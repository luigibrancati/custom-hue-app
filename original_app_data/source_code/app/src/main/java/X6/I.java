package X6;

import android.os.Parcel;
import android.os.Parcelable;
import v6.AbstractC6056k;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class I extends AbstractC6157a {
    public static final Parcelable.Creator<I> CREATOR = new J();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G f18344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18346d;

    public I(I i10, long j10) {
        AbstractC6056k.l(i10);
        this.f18343a = i10.f18343a;
        this.f18344b = i10.f18344b;
        this.f18345c = i10.f18345c;
        this.f18346d = j10;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f18344b);
        String str = this.f18345c;
        int length = String.valueOf(str).length();
        String str2 = this.f18343a;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(strValueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        J.a(this, parcel, i10);
    }

    public I(String str, G g10, String str2, long j10) {
        this.f18343a = str;
        this.f18344b = g10;
        this.f18345c = str2;
        this.f18346d = j10;
    }
}
