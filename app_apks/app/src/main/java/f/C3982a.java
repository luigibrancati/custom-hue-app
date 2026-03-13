package f;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: f.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C3982a implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f34075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f34073c = new b(null);
    public static final Parcelable.Creator<C3982a> CREATOR = new C0437a();

    /* JADX INFO: renamed from: f.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0437a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3982a createFromParcel(Parcel parcel) {
            AbstractC4862t.e(parcel, "parcel");
            return new C3982a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3982a[] newArray(int i10) {
            return new C3982a[i10];
        }
    }

    /* JADX INFO: renamed from: f.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public final String a(int i10) {
            return i10 != -1 ? i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED" : "RESULT_OK";
        }

        public b() {
        }
    }

    public C3982a(int i10, Intent intent) {
        this.f34074a = i10;
        this.f34075b = intent;
    }

    public final Intent a() {
        return this.f34075b;
    }

    public final int b() {
        return this.f34074a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + f34073c.a(this.f34074a) + ", data=" + this.f34075b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        AbstractC4862t.e(dest, "dest");
        dest.writeInt(this.f34074a);
        dest.writeInt(this.f34075b == null ? 0 : 1);
        Intent intent = this.f34075b;
        if (intent != null) {
            intent.writeToParcel(dest, i10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3982a(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        AbstractC4862t.e(parcel, "parcel");
    }
}
