package ua;

import android.bluetooth.BluetoothAdapter;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import ma.r;
import pa.AbstractC5451b;
import ra.p;

/* JADX INFO: renamed from: ua.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C6013d implements Parcelable, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ParcelUuid f45478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ParcelUuid f45479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ParcelUuid f45480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ParcelUuid f45481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ParcelUuid f45482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f45483h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f45484i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f45485j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f45486k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final byte[] f45487l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C6013d f45475m = new b().a();
    public static final Parcelable.Creator<C6013d> CREATOR = new a();

    /* JADX INFO: renamed from: ua.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C6013d createFromParcel(Parcel parcel) {
            b bVar = new b();
            if (parcel.readInt() == 1) {
                bVar.c(parcel.readString());
            }
            if (parcel.readInt() == 1) {
                bVar.b(parcel.readString());
            }
            if (parcel.readInt() == 1) {
                ParcelUuid parcelUuid = (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader());
                bVar.j(parcelUuid);
                if (parcel.readInt() == 1) {
                    bVar.k(parcelUuid, (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader()));
                }
            }
            if (parcel.readInt() == 1) {
                ParcelUuid parcelUuid2 = (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader());
                bVar.h(parcelUuid2);
                if (parcel.readInt() == 1) {
                    bVar.i(parcelUuid2, (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader()));
                }
            }
            if (parcel.readInt() == 1) {
                ParcelUuid parcelUuid3 = (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader());
                if (parcel.readInt() == 1) {
                    byte[] bArr = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr);
                    if (parcel.readInt() == 0) {
                        bVar.f(parcelUuid3, bArr);
                    } else {
                        byte[] bArr2 = new byte[parcel.readInt()];
                        parcel.readByteArray(bArr2);
                        bVar.g(parcelUuid3, bArr, bArr2);
                    }
                }
            }
            int i10 = parcel.readInt();
            if (parcel.readInt() == 1) {
                byte[] bArr3 = new byte[parcel.readInt()];
                parcel.readByteArray(bArr3);
                if (parcel.readInt() == 0) {
                    bVar.d(i10, bArr3);
                } else {
                    byte[] bArr4 = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr4);
                    bVar.e(i10, bArr3, bArr4);
                }
            }
            return bVar.a();
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C6013d[] newArray(int i10) {
            return new C6013d[i10];
        }
    }

    /* JADX INFO: renamed from: ua.d$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f45488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f45489b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ParcelUuid f45490c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ParcelUuid f45491d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ParcelUuid f45492e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ParcelUuid f45493f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ParcelUuid f45494g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public byte[] f45495h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public byte[] f45496i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f45497j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public byte[] f45498k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public byte[] f45499l;

        public C6013d a() {
            return new C6013d(this.f45488a, this.f45489b, this.f45490c, this.f45491d, this.f45492e, this.f45493f, this.f45494g, this.f45495h, this.f45496i, this.f45497j, this.f45498k, this.f45499l);
        }

        public b b(String str) {
            if (str == null || BluetoothAdapter.checkBluetoothAddress(str)) {
                this.f45489b = str;
                return this;
            }
            throw new IllegalArgumentException("invalid device address " + str);
        }

        public b c(String str) {
            this.f45488a = str;
            return this;
        }

        public b d(int i10, byte[] bArr) {
            if (bArr != null && i10 < 0) {
                throw new IllegalArgumentException("invalid manufacture id");
            }
            this.f45497j = i10;
            this.f45498k = bArr;
            this.f45499l = null;
            return this;
        }

        public b e(int i10, byte[] bArr, byte[] bArr2) {
            if (bArr != null && i10 < 0) {
                throw new IllegalArgumentException("invalid manufacture id");
            }
            byte[] bArr3 = this.f45499l;
            if (bArr3 != null) {
                byte[] bArr4 = this.f45498k;
                if (bArr4 == null) {
                    throw new IllegalArgumentException("manufacturerData is null while manufacturerDataMask is not null");
                }
                if (bArr4.length != bArr3.length) {
                    throw new IllegalArgumentException("size mismatch for manufacturerData and manufacturerDataMask");
                }
            }
            this.f45497j = i10;
            this.f45498k = bArr;
            this.f45499l = bArr2;
            return this;
        }

        public b f(ParcelUuid parcelUuid, byte[] bArr) {
            if (parcelUuid == null) {
                throw new IllegalArgumentException("serviceDataUuid is null");
            }
            this.f45494g = parcelUuid;
            this.f45495h = bArr;
            this.f45496i = null;
            return this;
        }

        public b g(ParcelUuid parcelUuid, byte[] bArr, byte[] bArr2) {
            if (parcelUuid == null) {
                throw new IllegalArgumentException("serviceDataUuid is null");
            }
            byte[] bArr3 = this.f45496i;
            if (bArr3 != null) {
                byte[] bArr4 = this.f45495h;
                if (bArr4 == null) {
                    throw new IllegalArgumentException("serviceData is null while serviceDataMask is not null");
                }
                if (bArr4.length != bArr3.length) {
                    throw new IllegalArgumentException("size mismatch for service data and service data mask");
                }
            }
            this.f45494g = parcelUuid;
            this.f45495h = bArr;
            this.f45496i = bArr2;
            return this;
        }

        public b h(ParcelUuid parcelUuid) {
            this.f45492e = parcelUuid;
            this.f45493f = null;
            return this;
        }

        public b i(ParcelUuid parcelUuid, ParcelUuid parcelUuid2) {
            if (parcelUuid2 != null && parcelUuid == null) {
                throw new IllegalArgumentException("SolicitationUuid is null while SolicitationUuidMask is not null!");
            }
            this.f45492e = parcelUuid;
            this.f45493f = parcelUuid2;
            return this;
        }

        public b j(ParcelUuid parcelUuid) {
            this.f45490c = parcelUuid;
            this.f45491d = null;
            return this;
        }

        public b k(ParcelUuid parcelUuid, ParcelUuid parcelUuid2) {
            if (this.f45491d != null && this.f45490c == null) {
                throw new IllegalArgumentException("uuid is null while uuidMask is not null!");
            }
            this.f45490c = parcelUuid;
            this.f45491d = parcelUuid2;
            return this;
        }
    }

    public C6013d(String str, String str2, ParcelUuid parcelUuid, ParcelUuid parcelUuid2, ParcelUuid parcelUuid3, ParcelUuid parcelUuid4, ParcelUuid parcelUuid5, byte[] bArr, byte[] bArr2, int i10, byte[] bArr3, byte[] bArr4) {
        this.f45476a = str;
        this.f45478c = parcelUuid;
        this.f45479d = parcelUuid2;
        this.f45480e = parcelUuid3;
        this.f45481f = parcelUuid4;
        this.f45477b = str2;
        this.f45482g = parcelUuid5;
        this.f45483h = bArr;
        this.f45484i = bArr2;
        this.f45485j = i10;
        this.f45486k = bArr3;
        this.f45487l = bArr4;
    }

    public static boolean c(byte[] bArr, byte[] bArr2) {
        if (bArr != bArr2) {
            return (bArr == null || bArr2 == null || !Arrays.equals(bArr, bArr2)) ? false : true;
        }
        return true;
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static boolean o(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr3 == null || bArr3.length < bArr.length) {
            return false;
        }
        if (bArr2 == null) {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                if (bArr3[i10] != bArr[i10]) {
                    return false;
                }
            }
            return true;
        }
        for (int i11 = 0; i11 < bArr.length; i11++) {
            byte b10 = bArr2[i11];
            if ((bArr3[i11] & b10) != (b10 & bArr[i11])) {
                return false;
            }
        }
        return true;
    }

    public static boolean q(ParcelUuid parcelUuid, ParcelUuid parcelUuid2, List list) {
        if (parcelUuid == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (r(parcelUuid.getUuid(), parcelUuid2 == null ? null : parcelUuid2.getUuid(), ((ParcelUuid) it.next()).getUuid())) {
                return true;
            }
        }
        return false;
    }

    public static boolean r(UUID uuid, UUID uuid2, UUID uuid3) {
        if (uuid2 == null) {
            return uuid.equals(uuid3);
        }
        if ((uuid.getLeastSignificantBits() & uuid2.getLeastSignificantBits()) != (uuid3.getLeastSignificantBits() & uuid2.getLeastSignificantBits())) {
            return false;
        }
        return (uuid.getMostSignificantBits() & uuid2.getMostSignificantBits()) == (uuid2.getMostSignificantBits() & uuid3.getMostSignificantBits());
    }

    public static boolean t(ParcelUuid parcelUuid, ParcelUuid parcelUuid2, List list) {
        if (parcelUuid == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (r(parcelUuid.getUuid(), parcelUuid2 == null ? null : parcelUuid2.getUuid(), ((ParcelUuid) it.next()).getUuid())) {
                return true;
            }
        }
        return false;
    }

    @Override // ra.p
    public boolean a(r rVar) {
        if (rVar == null) {
            return false;
        }
        String address = rVar.getAddress();
        String str = this.f45477b;
        if (str != null && !str.equals(address)) {
            return false;
        }
        e eVarB = rVar.b();
        String str2 = this.f45476a;
        if (str2 != null && !str2.equals(rVar.a()) && (eVarB == null || !this.f45476a.equals(eVarB.a()))) {
            return false;
        }
        if (eVarB == null) {
            return this.f45478c == null && this.f45486k == null && this.f45483h == null;
        }
        ParcelUuid parcelUuid = this.f45478c;
        if (parcelUuid != null && !t(parcelUuid, this.f45479d, eVarB.d())) {
            return false;
        }
        ParcelUuid parcelUuid2 = this.f45480e;
        if (parcelUuid2 != null && !q(parcelUuid2, this.f45481f, eVarB.g())) {
            return false;
        }
        ParcelUuid parcelUuid3 = this.f45482g;
        if (parcelUuid3 != null && !o(this.f45483h, this.f45484i, eVarB.h(parcelUuid3))) {
            return false;
        }
        int i10 = this.f45485j;
        return i10 < 0 || o(this.f45486k, this.f45487l, eVarB.b(i10));
    }

    @Override // ra.p
    public boolean b() {
        return equals(f45475m);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f45477b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C6013d c6013d = (C6013d) obj;
            if (d(this.f45476a, c6013d.f45476a) && d(this.f45477b, c6013d.f45477b) && this.f45485j == c6013d.f45485j && c(this.f45486k, c6013d.f45486k) && c(this.f45487l, c6013d.f45487l) && d(this.f45482g, c6013d.f45482g) && c(this.f45483h, c6013d.f45483h) && c(this.f45484i, c6013d.f45484i) && d(this.f45478c, c6013d.f45478c) && d(this.f45479d, c6013d.f45479d) && d(this.f45480e, c6013d.f45480e) && d(this.f45481f, c6013d.f45481f)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.f45476a;
    }

    public byte[] g() {
        return this.f45486k;
    }

    public byte[] h() {
        return this.f45487l;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45476a, this.f45477b, Integer.valueOf(this.f45485j), Integer.valueOf(Arrays.hashCode(this.f45486k)), Integer.valueOf(Arrays.hashCode(this.f45487l)), this.f45482g, Integer.valueOf(Arrays.hashCode(this.f45483h)), Integer.valueOf(Arrays.hashCode(this.f45484i)), this.f45478c, this.f45479d, this.f45480e, this.f45481f});
    }

    public int i() {
        return this.f45485j;
    }

    public byte[] j() {
        return this.f45483h;
    }

    public byte[] k() {
        return this.f45484i;
    }

    public ParcelUuid l() {
        return this.f45482g;
    }

    public ParcelUuid m() {
        return this.f45478c;
    }

    public ParcelUuid n() {
        return this.f45479d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BluetoothLeScanFilter [mDeviceName=");
        sb2.append(this.f45476a);
        sb2.append(", ");
        sb2.append(AbstractC5451b.d(this.f45477b));
        sb2.append(", mUuid=");
        ParcelUuid parcelUuid = this.f45478c;
        sb2.append(parcelUuid == null ? null : AbstractC5451b.g(parcelUuid.getUuid()));
        sb2.append(", mUuidMask=");
        ParcelUuid parcelUuid2 = this.f45479d;
        sb2.append(parcelUuid2 == null ? null : AbstractC5451b.g(parcelUuid2.getUuid()));
        sb2.append(", mSolicitedUuid=");
        ParcelUuid parcelUuid3 = this.f45480e;
        sb2.append(parcelUuid3 == null ? null : AbstractC5451b.g(parcelUuid3.getUuid()));
        sb2.append(", mSolicitedUuidMask=");
        ParcelUuid parcelUuid4 = this.f45481f;
        sb2.append(parcelUuid4 == null ? null : AbstractC5451b.g(parcelUuid4.getUuid()));
        sb2.append(", mServiceDataUuid=");
        ParcelUuid parcelUuid5 = this.f45482g;
        sb2.append(parcelUuid5 != null ? AbstractC5451b.g(parcelUuid5.getUuid()) : null);
        sb2.append(", mServiceData=");
        sb2.append(Arrays.toString(this.f45483h));
        sb2.append(", mServiceDataMask=");
        sb2.append(Arrays.toString(this.f45484i));
        sb2.append(", mManufacturerId=");
        sb2.append(this.f45485j);
        sb2.append(", mManufacturerData=");
        sb2.append(Arrays.toString(this.f45486k));
        sb2.append(", mManufacturerDataMask=");
        sb2.append(Arrays.toString(this.f45487l));
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f45476a == null ? 0 : 1);
        String str = this.f45476a;
        if (str != null) {
            parcel.writeString(str);
        }
        parcel.writeInt(this.f45477b == null ? 0 : 1);
        String str2 = this.f45477b;
        if (str2 != null) {
            parcel.writeString(str2);
        }
        parcel.writeInt(this.f45478c == null ? 0 : 1);
        ParcelUuid parcelUuid = this.f45478c;
        if (parcelUuid != null) {
            parcel.writeParcelable(parcelUuid, i10);
            parcel.writeInt(this.f45479d == null ? 0 : 1);
            ParcelUuid parcelUuid2 = this.f45479d;
            if (parcelUuid2 != null) {
                parcel.writeParcelable(parcelUuid2, i10);
            }
        }
        parcel.writeInt(this.f45480e == null ? 0 : 1);
        ParcelUuid parcelUuid3 = this.f45480e;
        if (parcelUuid3 != null) {
            parcel.writeParcelable(parcelUuid3, i10);
            parcel.writeInt(this.f45481f == null ? 0 : 1);
            ParcelUuid parcelUuid4 = this.f45481f;
            if (parcelUuid4 != null) {
                parcel.writeParcelable(parcelUuid4, i10);
            }
        }
        parcel.writeInt(this.f45482g == null ? 0 : 1);
        ParcelUuid parcelUuid5 = this.f45482g;
        if (parcelUuid5 != null) {
            parcel.writeParcelable(parcelUuid5, i10);
            parcel.writeInt(this.f45483h == null ? 0 : 1);
            byte[] bArr = this.f45483h;
            if (bArr != null) {
                parcel.writeInt(bArr.length);
                parcel.writeByteArray(this.f45483h);
                parcel.writeInt(this.f45484i == null ? 0 : 1);
                byte[] bArr2 = this.f45484i;
                if (bArr2 != null) {
                    parcel.writeInt(bArr2.length);
                    parcel.writeByteArray(this.f45484i);
                }
            }
        }
        parcel.writeInt(this.f45485j);
        parcel.writeInt(this.f45486k == null ? 0 : 1);
        byte[] bArr3 = this.f45486k;
        if (bArr3 != null) {
            parcel.writeInt(bArr3.length);
            parcel.writeByteArray(this.f45486k);
            parcel.writeInt(this.f45487l == null ? 0 : 1);
            byte[] bArr4 = this.f45487l;
            if (bArr4 != null) {
                parcel.writeInt(bArr4.length);
                parcel.writeByteArray(this.f45487l);
            }
        }
    }
}
