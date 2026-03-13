package f;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntentSender f34099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f34100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f34102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f34098e = new c(null);
    public static final Parcelable.Creator<h> CREATOR = new b();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IntentSender f34103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Intent f34104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f34105c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f34106d;

        public a(IntentSender intentSender) {
            AbstractC4862t.e(intentSender, "intentSender");
            this.f34103a = intentSender;
        }

        public final h a() {
            return new h(this.f34103a, this.f34104b, this.f34105c, this.f34106d);
        }

        public final a b(Intent intent) {
            this.f34104b = intent;
            return this;
        }

        public final a c(int i10, int i11) {
            this.f34106d = i10;
            this.f34105c = i11;
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(PendingIntent pendingIntent) {
            AbstractC4862t.e(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            AbstractC4862t.d(intentSender, "getIntentSender(...)");
            this(intentSender);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h createFromParcel(Parcel inParcel) {
            AbstractC4862t.e(inParcel, "inParcel");
            return new h(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h[] newArray(int i10) {
            return new h[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {
        public /* synthetic */ c(AbstractC4854k abstractC4854k) {
            this();
        }

        public c() {
        }
    }

    public h(IntentSender intentSender, Intent intent, int i10, int i11) {
        AbstractC4862t.e(intentSender, "intentSender");
        this.f34099a = intentSender;
        this.f34100b = intent;
        this.f34101c = i10;
        this.f34102d = i11;
    }

    public final Intent a() {
        return this.f34100b;
    }

    public final int b() {
        return this.f34101c;
    }

    public final int c() {
        return this.f34102d;
    }

    public final IntentSender d() {
        return this.f34099a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        AbstractC4862t.e(dest, "dest");
        dest.writeParcelable(this.f34099a, i10);
        dest.writeParcelable(this.f34100b, i10);
        dest.writeInt(this.f34101c);
        dest.writeInt(this.f34102d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(Parcel parcel) {
        AbstractC4862t.e(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        AbstractC4862t.b(parcelable);
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }
}
