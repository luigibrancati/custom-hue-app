package c9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f26380b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public /* synthetic */ f(Parcel parcel, a aVar) {
        this(parcel);
    }

    public long a() {
        return this.f26380b.get();
    }

    public String b() {
        return this.f26379a;
    }

    public void c(long j10) {
        this.f26380b.addAndGet(j10);
    }

    public void d(long j10) {
        this.f26380b.set(j10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f26379a);
        parcel.writeLong(this.f26380b.get());
    }

    public f(String str) {
        this.f26379a = str;
        this.f26380b = new AtomicLong(0L);
    }

    public f(Parcel parcel) {
        this.f26379a = parcel.readString();
        this.f26380b = new AtomicLong(parcel.readLong());
    }
}
