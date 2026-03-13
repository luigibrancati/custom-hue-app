package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC2754j;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class O implements Parcelable {
    public static final Parcelable.Creator<O> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f23103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f23104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f23106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f23107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f23108h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f23109i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f23110j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f23111k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f23112l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f23113m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f23114n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f23115o;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public O createFromParcel(Parcel parcel) {
            return new O(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public O[] newArray(int i10) {
            return new O[i10];
        }
    }

    public O(ComponentCallbacksC2736q componentCallbacksC2736q) {
        this.f23101a = componentCallbacksC2736q.getClass().getName();
        this.f23102b = componentCallbacksC2736q.mWho;
        this.f23103c = componentCallbacksC2736q.mFromLayout;
        this.f23104d = componentCallbacksC2736q.mInDynamicContainer;
        this.f23105e = componentCallbacksC2736q.mFragmentId;
        this.f23106f = componentCallbacksC2736q.mContainerId;
        this.f23107g = componentCallbacksC2736q.mTag;
        this.f23108h = componentCallbacksC2736q.mRetainInstance;
        this.f23109i = componentCallbacksC2736q.mRemoving;
        this.f23110j = componentCallbacksC2736q.mDetached;
        this.f23111k = componentCallbacksC2736q.mHidden;
        this.f23112l = componentCallbacksC2736q.mMaxState.ordinal();
        this.f23113m = componentCallbacksC2736q.mTargetWho;
        this.f23114n = componentCallbacksC2736q.mTargetRequestCode;
        this.f23115o = componentCallbacksC2736q.mUserVisibleHint;
    }

    public ComponentCallbacksC2736q a(C2744z c2744z, ClassLoader classLoader) {
        ComponentCallbacksC2736q componentCallbacksC2736qA = c2744z.a(classLoader, this.f23101a);
        componentCallbacksC2736qA.mWho = this.f23102b;
        componentCallbacksC2736qA.mFromLayout = this.f23103c;
        componentCallbacksC2736qA.mInDynamicContainer = this.f23104d;
        componentCallbacksC2736qA.mRestored = true;
        componentCallbacksC2736qA.mFragmentId = this.f23105e;
        componentCallbacksC2736qA.mContainerId = this.f23106f;
        componentCallbacksC2736qA.mTag = this.f23107g;
        componentCallbacksC2736qA.mRetainInstance = this.f23108h;
        componentCallbacksC2736qA.mRemoving = this.f23109i;
        componentCallbacksC2736qA.mDetached = this.f23110j;
        componentCallbacksC2736qA.mHidden = this.f23111k;
        componentCallbacksC2736qA.mMaxState = AbstractC2754j.b.values()[this.f23112l];
        componentCallbacksC2736qA.mTargetWho = this.f23113m;
        componentCallbacksC2736qA.mTargetRequestCode = this.f23114n;
        componentCallbacksC2736qA.mUserVisibleHint = this.f23115o;
        return componentCallbacksC2736qA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f23101a);
        sb2.append(" (");
        sb2.append(this.f23102b);
        sb2.append(")}:");
        if (this.f23103c) {
            sb2.append(" fromLayout");
        }
        if (this.f23104d) {
            sb2.append(" dynamicContainer");
        }
        if (this.f23106f != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f23106f));
        }
        String str = this.f23107g;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f23107g);
        }
        if (this.f23108h) {
            sb2.append(" retainInstance");
        }
        if (this.f23109i) {
            sb2.append(" removing");
        }
        if (this.f23110j) {
            sb2.append(" detached");
        }
        if (this.f23111k) {
            sb2.append(" hidden");
        }
        if (this.f23113m != null) {
            sb2.append(" targetWho=");
            sb2.append(this.f23113m);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f23114n);
        }
        if (this.f23115o) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f23101a);
        parcel.writeString(this.f23102b);
        parcel.writeInt(this.f23103c ? 1 : 0);
        parcel.writeInt(this.f23104d ? 1 : 0);
        parcel.writeInt(this.f23105e);
        parcel.writeInt(this.f23106f);
        parcel.writeString(this.f23107g);
        parcel.writeInt(this.f23108h ? 1 : 0);
        parcel.writeInt(this.f23109i ? 1 : 0);
        parcel.writeInt(this.f23110j ? 1 : 0);
        parcel.writeInt(this.f23111k ? 1 : 0);
        parcel.writeInt(this.f23112l);
        parcel.writeString(this.f23113m);
        parcel.writeInt(this.f23114n);
        parcel.writeInt(this.f23115o ? 1 : 0);
    }

    public O(Parcel parcel) {
        this.f23101a = parcel.readString();
        this.f23102b = parcel.readString();
        this.f23103c = parcel.readInt() != 0;
        this.f23104d = parcel.readInt() != 0;
        this.f23105e = parcel.readInt();
        this.f23106f = parcel.readInt();
        this.f23107g = parcel.readString();
        this.f23108h = parcel.readInt() != 0;
        this.f23109i = parcel.readInt() != 0;
        this.f23110j = parcel.readInt() != 0;
        this.f23111k = parcel.readInt() != 0;
        this.f23112l = parcel.readInt();
        this.f23113m = parcel.readString();
        this.f23114n = parcel.readInt();
        this.f23115o = parcel.readInt() != 0;
    }
}
