package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.J;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class L implements Parcelable {
    public static final Parcelable.Creator<L> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f23085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f23086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C2721b[] f23087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f23089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f23090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f23091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f23092h;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public L createFromParcel(Parcel parcel) {
            return new L(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public L[] newArray(int i10) {
            return new L[i10];
        }
    }

    public L() {
        this.f23089e = null;
        this.f23090f = new ArrayList();
        this.f23091g = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f23085a);
        parcel.writeStringList(this.f23086b);
        parcel.writeTypedArray(this.f23087c, i10);
        parcel.writeInt(this.f23088d);
        parcel.writeString(this.f23089e);
        parcel.writeStringList(this.f23090f);
        parcel.writeTypedList(this.f23091g);
        parcel.writeTypedList(this.f23092h);
    }

    public L(Parcel parcel) {
        this.f23089e = null;
        this.f23090f = new ArrayList();
        this.f23091g = new ArrayList();
        this.f23085a = parcel.createStringArrayList();
        this.f23086b = parcel.createStringArrayList();
        this.f23087c = (C2721b[]) parcel.createTypedArray(C2721b.CREATOR);
        this.f23088d = parcel.readInt();
        this.f23089e = parcel.readString();
        this.f23090f = parcel.createStringArrayList();
        this.f23091g = parcel.createTypedArrayList(C2722c.CREATOR);
        this.f23092h = parcel.createTypedArrayList(J.l.CREATOR);
    }
}
