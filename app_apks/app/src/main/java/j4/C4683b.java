package j4;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: j4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4683b extends AbstractC4689h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4683b f38976a = new C4683b();
    public static final Parcelable.Creator<C4683b> CREATOR = new a();

    /* JADX INFO: renamed from: j4.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4683b createFromParcel(Parcel parcel) {
            AbstractC4862t.e(parcel, "parcel");
            parcel.readInt();
            return C4683b.f38976a;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C4683b[] newArray(int i10) {
            return new C4683b[i10];
        }
    }

    public C4683b() {
        super(null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "coil.size.OriginalSize";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        AbstractC4862t.e(out, "out");
        out.writeInt(1);
    }
}
