package ua;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f45508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f45509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45512g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i10) {
            return new g[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f45513a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f45514b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f45515c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f45516d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f45517e = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f45518f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f45519g = true;

        public static boolean b(int i10) {
            return i10 == 1 || i10 == 2 || i10 == 4 || i10 == 6;
        }

        public g a() {
            return new g(this.f45513a, this.f45514b, this.f45515c, this.f45516d, this.f45517e, this.f45518f, this.f45519g);
        }

        public b c(int i10) {
            if (b(i10)) {
                this.f45514b = i10;
                return this;
            }
            throw new IllegalArgumentException("invalid callback type - " + i10);
        }

        public b d(boolean z10) {
            this.f45518f = z10;
            return this;
        }

        public b e(int i10) {
            if (i10 >= -1 && i10 <= 2) {
                this.f45513a = i10;
                return this;
            }
            throw new IllegalArgumentException("invalid scan mode " + i10);
        }

        public b f(boolean z10) {
            this.f45519g = z10;
            return this;
        }
    }

    public g(int i10, int i11, long j10, int i12, int i13, boolean z10, boolean z11) {
        this.f45506a = i10;
        this.f45507b = i11;
        this.f45508c = j10;
        this.f45510e = i13;
        this.f45509d = i12;
        this.f45511f = z10;
        this.f45512g = z11;
    }

    public g a(int i10) {
        return new g(this.f45506a, i10, this.f45508c, this.f45509d, this.f45510e, this.f45511f, this.f45512g);
    }

    public int b() {
        return this.f45507b;
    }

    public boolean c() {
        return this.f45511f;
    }

    public int d() {
        return this.f45509d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f45510e;
    }

    public long f() {
        return this.f45508c;
    }

    public int g() {
        return this.f45506a;
    }

    public boolean h() {
        return this.f45512g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f45506a);
        parcel.writeInt(this.f45507b);
        parcel.writeLong(this.f45508c);
        parcel.writeInt(this.f45509d);
        parcel.writeInt(this.f45510e);
        parcel.writeInt(this.f45511f ? 1 : 0);
        parcel.writeInt(this.f45512g ? 1 : 0);
    }

    public g(Parcel parcel) {
        this.f45506a = parcel.readInt();
        this.f45507b = parcel.readInt();
        this.f45508c = parcel.readLong();
        this.f45509d = parcel.readInt();
        this.f45510e = parcel.readInt();
        this.f45511f = parcel.readInt() != 0;
        this.f45512g = parcel.readInt() != 0;
    }
}
