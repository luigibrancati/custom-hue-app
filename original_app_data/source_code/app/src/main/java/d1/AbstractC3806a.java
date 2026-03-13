package d1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: d1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3806a implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f32789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC3806a f32788b = new C0393a();
    public static final Parcelable.Creator<AbstractC3806a> CREATOR = new b();

    /* JADX INFO: renamed from: d1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0393a extends AbstractC3806a {
        public C0393a() {
            super((C0393a) null);
        }
    }

    /* JADX INFO: renamed from: d1.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Parcelable.ClassLoaderCreator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC3806a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC3806a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC3806a.f32788b;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbstractC3806a[] newArray(int i10) {
            return new AbstractC3806a[i10];
        }
    }

    public /* synthetic */ AbstractC3806a(C0393a c0393a) {
        this();
    }

    public final Parcelable a() {
        return this.f32789a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f32789a, i10);
    }

    public AbstractC3806a() {
        this.f32789a = null;
    }

    public AbstractC3806a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f32789a = parcelable == f32788b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC3806a(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f32789a = parcelable == null ? f32788b : parcelable;
    }
}
