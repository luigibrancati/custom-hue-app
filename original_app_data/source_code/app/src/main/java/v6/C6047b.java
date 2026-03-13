package v6;

import android.os.Parcel;
import android.os.Parcelable;
import org.apache.tika.metadata.TikaCoreProperties;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: v6.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C6047b extends AbstractC6157a {
    public static final Parcelable.Creator<C6047b> CREATOR = new C6063s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45822b;

    public C6047b(int i10, String str) {
        this.f45821a = i10;
        this.f45822b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6047b)) {
            return false;
        }
        C6047b c6047b = (C6047b) obj;
        return c6047b.f45821a == this.f45821a && AbstractC6055j.a(c6047b.f45822b, this.f45822b);
    }

    public final int hashCode() {
        return this.f45821a;
    }

    public final String toString() {
        int i10 = this.f45821a;
        int length = String.valueOf(i10).length();
        String str = this.f45822b;
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(str).length());
        sb2.append(i10);
        sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f45821a;
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, i11);
        w6.c.w(parcel, 2, this.f45822b, false);
        w6.c.b(parcel, iA);
    }
}
