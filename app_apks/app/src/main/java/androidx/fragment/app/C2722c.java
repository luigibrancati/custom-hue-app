package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C2722c implements Parcelable {
    public static final Parcelable.Creator<C2722c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f23237b;

    /* JADX INFO: renamed from: androidx.fragment.app.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2722c createFromParcel(Parcel parcel) {
            return new C2722c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2722c[] newArray(int i10) {
            return new C2722c[i10];
        }
    }

    public C2722c(Parcel parcel) {
        this.f23236a = parcel.createStringArrayList();
        this.f23237b = parcel.createTypedArrayList(C2721b.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f23236a);
        parcel.writeTypedList(this.f23237b);
    }
}
