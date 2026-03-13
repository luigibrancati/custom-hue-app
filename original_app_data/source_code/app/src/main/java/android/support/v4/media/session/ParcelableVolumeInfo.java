package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21332e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f21328a = parcel.readInt();
        this.f21330c = parcel.readInt();
        this.f21331d = parcel.readInt();
        this.f21332e = parcel.readInt();
        this.f21329b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f21328a);
        parcel.writeInt(this.f21330c);
        parcel.writeInt(this.f21331d);
        parcel.writeInt(this.f21332e);
        parcel.writeInt(this.f21329b);
    }
}
