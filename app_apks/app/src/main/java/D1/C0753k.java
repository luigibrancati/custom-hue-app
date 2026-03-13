package D1;

import G1.AbstractC0853a;
import G1.M;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: renamed from: D1.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0753k implements Comparator, Parcelable {
    public static final Parcelable.Creator<C0753k> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b[] f1724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1727d;

    /* JADX INFO: renamed from: D1.k$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0753k createFromParcel(Parcel parcel) {
            return new C0753k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0753k[] newArray(int i10) {
            return new C0753k[i10];
        }
    }

    /* JADX INFO: renamed from: D1.k$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f1729b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f1730c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f1731d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f1732e;

        /* JADX INFO: renamed from: D1.k$b$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public boolean a(b bVar) {
            return c() && !bVar.c() && d(bVar.f1729b);
        }

        public b b(byte[] bArr) {
            return new b(this.f1729b, this.f1730c, this.f1731d, bArr);
        }

        public boolean c() {
            return this.f1732e != null;
        }

        public boolean d(UUID uuid) {
            return AbstractC0747e.f1684a.equals(this.f1729b) || uuid.equals(this.f1729b);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return Objects.equals(this.f1730c, bVar.f1730c) && Objects.equals(this.f1731d, bVar.f1731d) && Objects.equals(this.f1729b, bVar.f1729b) && Arrays.equals(this.f1732e, bVar.f1732e);
        }

        public int hashCode() {
            if (this.f1728a == 0) {
                int iHashCode = this.f1729b.hashCode() * 31;
                String str = this.f1730c;
                this.f1728a = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f1731d.hashCode()) * 31) + Arrays.hashCode(this.f1732e);
            }
            return this.f1728a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f1729b.getMostSignificantBits());
            parcel.writeLong(this.f1729b.getLeastSignificantBits());
            parcel.writeString(this.f1730c);
            parcel.writeString(this.f1731d);
            parcel.writeByteArray(this.f1732e);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f1729b = (UUID) AbstractC0853a.e(uuid);
            this.f1730c = str;
            this.f1731d = v.u((String) AbstractC0853a.e(str2));
            this.f1732e = bArr;
        }

        public b(Parcel parcel) {
            this.f1729b = new UUID(parcel.readLong(), parcel.readLong());
            this.f1730c = parcel.readString();
            this.f1731d = (String) M.i(parcel.readString());
            this.f1732e = parcel.createByteArray();
        }
    }

    public C0753k(List list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    public static boolean b(ArrayList arrayList, int i10, UUID uuid) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (((b) arrayList.get(i11)).f1729b.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static C0753k d(C0753k c0753k, C0753k c0753k2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (c0753k != null) {
            str = c0753k.f1726c;
            for (b bVar : c0753k.f1724a) {
                if (bVar.c()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (c0753k2 != null) {
            if (str == null) {
                str = c0753k2.f1726c;
            }
            int size = arrayList.size();
            for (b bVar2 : c0753k2.f1724a) {
                if (bVar2.c() && !b(arrayList, size, bVar2.f1729b)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C0753k(str, arrayList);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(b bVar, b bVar2) {
        UUID uuid = AbstractC0747e.f1684a;
        return uuid.equals(bVar.f1729b) ? uuid.equals(bVar2.f1729b) ? 0 : 1 : bVar.f1729b.compareTo(bVar2.f1729b);
    }

    public C0753k c(String str) {
        return Objects.equals(this.f1726c, str) ? this : new C0753k(str, false, this.f1724a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public b e(int i10) {
        return this.f1724a[i10];
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0753k.class == obj.getClass()) {
            C0753k c0753k = (C0753k) obj;
            if (Objects.equals(this.f1726c, c0753k.f1726c) && Arrays.equals(this.f1724a, c0753k.f1724a)) {
                return true;
            }
        }
        return false;
    }

    public C0753k f(C0753k c0753k) {
        String str;
        String str2 = this.f1726c;
        AbstractC0853a.g(str2 == null || (str = c0753k.f1726c) == null || TextUtils.equals(str2, str));
        String str3 = this.f1726c;
        if (str3 == null) {
            str3 = c0753k.f1726c;
        }
        return new C0753k(str3, (b[]) M.R0(this.f1724a, c0753k.f1724a));
    }

    public int hashCode() {
        if (this.f1725b == 0) {
            String str = this.f1726c;
            this.f1725b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f1724a);
        }
        return this.f1725b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1726c);
        parcel.writeTypedArray(this.f1724a, 0);
    }

    public C0753k(String str, List list) {
        this(str, false, (b[]) list.toArray(new b[0]));
    }

    public C0753k(b... bVarArr) {
        this((String) null, bVarArr);
    }

    public C0753k(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    public C0753k(String str, boolean z10, b... bVarArr) {
        this.f1726c = str;
        bVarArr = z10 ? (b[]) bVarArr.clone() : bVarArr;
        this.f1724a = bVarArr;
        this.f1727d = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public C0753k(Parcel parcel) {
        this.f1726c = parcel.readString();
        b[] bVarArr = (b[]) M.i((b[]) parcel.createTypedArray(b.CREATOR));
        this.f1724a = bVarArr;
        this.f1727d = bVarArr.length;
    }
}
