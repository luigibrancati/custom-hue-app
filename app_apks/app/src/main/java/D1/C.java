package D1;

import G1.M;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C implements Comparable, Parcelable {
    public static final Parcelable.Creator<C> CREATOR = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f1435d = M.z0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f1436e = M.z0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f1437f = M.z0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1440c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C createFromParcel(Parcel parcel) {
            return new C(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C[] newArray(int i10) {
            return new C[i10];
        }
    }

    public C(int i10, int i11, int i12) {
        this.f1438a = i10;
        this.f1439b = i11;
        this.f1440c = i12;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C c10) {
        int i10 = this.f1438a - c10.f1438a;
        return (i10 == 0 && (i10 = this.f1439b - c10.f1439b) == 0) ? this.f1440c - c10.f1440c : i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C.class == obj.getClass()) {
            C c10 = (C) obj;
            if (this.f1438a == c10.f1438a && this.f1439b == c10.f1439b && this.f1440c == c10.f1440c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f1438a * 31) + this.f1439b) * 31) + this.f1440c;
    }

    public String toString() {
        return this.f1438a + "." + this.f1439b + "." + this.f1440c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f1438a);
        parcel.writeInt(this.f1439b);
        parcel.writeInt(this.f1440c);
    }

    public C(Parcel parcel) {
        this.f1438a = parcel.readInt();
        this.f1439b = parcel.readInt();
        this.f1440c = parcel.readInt();
    }
}
