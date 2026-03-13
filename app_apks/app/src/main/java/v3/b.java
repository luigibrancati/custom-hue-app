package v3;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import b0.C2777a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class b extends AbstractC6037a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f45760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f45761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f45762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f45763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f45764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f45765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f45766j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45767k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C2777a(), new C2777a(), new C2777a());
    }

    @Override // v3.AbstractC6037a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f45761e.writeInt(-1);
        } else {
            this.f45761e.writeInt(bArr.length);
            this.f45761e.writeByteArray(bArr);
        }
    }

    @Override // v3.AbstractC6037a
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f45761e, 0);
    }

    @Override // v3.AbstractC6037a
    public void E(int i10) {
        this.f45761e.writeInt(i10);
    }

    @Override // v3.AbstractC6037a
    public void G(Parcelable parcelable) {
        this.f45761e.writeParcelable(parcelable, 0);
    }

    @Override // v3.AbstractC6037a
    public void I(String str) {
        this.f45761e.writeString(str);
    }

    @Override // v3.AbstractC6037a
    public void a() {
        int i10 = this.f45765i;
        if (i10 >= 0) {
            int i11 = this.f45760d.get(i10);
            int iDataPosition = this.f45761e.dataPosition();
            this.f45761e.setDataPosition(i11);
            this.f45761e.writeInt(iDataPosition - i11);
            this.f45761e.setDataPosition(iDataPosition);
        }
    }

    @Override // v3.AbstractC6037a
    public AbstractC6037a b() {
        Parcel parcel = this.f45761e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f45766j;
        if (i10 == this.f45762f) {
            i10 = this.f45763g;
        }
        return new b(parcel, iDataPosition, i10, this.f45764h + "  ", this.f45757a, this.f45758b, this.f45759c);
    }

    @Override // v3.AbstractC6037a
    public boolean g() {
        return this.f45761e.readInt() != 0;
    }

    @Override // v3.AbstractC6037a
    public byte[] i() {
        int i10 = this.f45761e.readInt();
        if (i10 < 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        this.f45761e.readByteArray(bArr);
        return bArr;
    }

    @Override // v3.AbstractC6037a
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f45761e);
    }

    @Override // v3.AbstractC6037a
    public boolean m(int i10) {
        while (this.f45766j < this.f45763g) {
            int i11 = this.f45767k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f45761e.setDataPosition(this.f45766j);
            int i12 = this.f45761e.readInt();
            this.f45767k = this.f45761e.readInt();
            this.f45766j += i12;
        }
        return this.f45767k == i10;
    }

    @Override // v3.AbstractC6037a
    public int o() {
        return this.f45761e.readInt();
    }

    @Override // v3.AbstractC6037a
    public Parcelable q() {
        return this.f45761e.readParcelable(getClass().getClassLoader());
    }

    @Override // v3.AbstractC6037a
    public String s() {
        return this.f45761e.readString();
    }

    @Override // v3.AbstractC6037a
    public void w(int i10) {
        a();
        this.f45765i = i10;
        this.f45760d.put(i10, this.f45761e.dataPosition());
        E(0);
        E(i10);
    }

    @Override // v3.AbstractC6037a
    public void y(boolean z10) {
        this.f45761e.writeInt(z10 ? 1 : 0);
    }

    public b(Parcel parcel, int i10, int i11, String str, C2777a c2777a, C2777a c2777a2, C2777a c2777a3) {
        super(c2777a, c2777a2, c2777a3);
        this.f45760d = new SparseIntArray();
        this.f45765i = -1;
        this.f45767k = -1;
        this.f45761e = parcel;
        this.f45762f = i10;
        this.f45763g = i11;
        this.f45766j = i10;
        this.f45764h = str;
    }
}
