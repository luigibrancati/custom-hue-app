package j4;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: j4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4684c extends AbstractC4689h {
    public static final Parcelable.Creator<C4684c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38978b;

    /* JADX INFO: renamed from: j4.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4684c createFromParcel(Parcel parcel) {
            AbstractC4862t.e(parcel, "parcel");
            return new C4684c(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C4684c[] newArray(int i10) {
            return new C4684c[i10];
        }
    }

    public C4684c(int i10, int i11) {
        super(null);
        this.f38977a = i10;
        this.f38978b = i11;
        if (!(i10 > 0 && i11 > 0)) {
            throw new IllegalArgumentException("width and height must be > 0.");
        }
    }

    public final int a() {
        return this.f38977a;
    }

    public final int b() {
        return this.f38978b;
    }

    public final int c() {
        return this.f38978b;
    }

    public final int d() {
        return this.f38977a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4684c)) {
            return false;
        }
        C4684c c4684c = (C4684c) obj;
        return this.f38977a == c4684c.f38977a && this.f38978b == c4684c.f38978b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f38977a) * 31) + Integer.hashCode(this.f38978b);
    }

    public String toString() {
        return "PixelSize(width=" + this.f38977a + ", height=" + this.f38978b + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        AbstractC4862t.e(out, "out");
        out.writeInt(this.f38977a);
        out.writeInt(this.f38978b);
    }
}
