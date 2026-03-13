package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.IResultReceiver;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0268a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21352a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f21353b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IResultReceiver f21354c;

    /* JADX INFO: renamed from: android.support.v4.os.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0268a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends IResultReceiver.Stub {
        public b() {
        }

        @Override // android.support.v4.os.IResultReceiver
        public void L(int i10, Bundle bundle) {
            a aVar = a.this;
            Handler handler = aVar.f21353b;
            if (handler != null) {
                handler.post(aVar.new c(i10, bundle));
            } else {
                aVar.a(i10, bundle);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bundle f21357b;

        public c(int i10, Bundle bundle) {
            this.f21356a = i10;
            this.f21357b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.a(this.f21356a, this.f21357b);
        }
    }

    public a(Parcel parcel) {
        this.f21354c = IResultReceiver.Stub.asInterface(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            try {
                if (this.f21354c == null) {
                    this.f21354c = new b();
                }
                parcel.writeStrongBinder(this.f21354c.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i10, Bundle bundle) {
    }
}
