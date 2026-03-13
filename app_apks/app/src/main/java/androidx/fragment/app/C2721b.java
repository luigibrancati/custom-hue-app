package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.S;
import androidx.lifecycle.AbstractC2754j;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2721b implements Parcelable {
    public static final Parcelable.Creator<C2721b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f23222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f23223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f23224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f23225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f23227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f23228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f23229h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f23230i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f23231j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CharSequence f23232k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f23233l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f23234m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f23235n;

    /* JADX INFO: renamed from: androidx.fragment.app.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2721b createFromParcel(Parcel parcel) {
            return new C2721b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2721b[] newArray(int i10) {
            return new C2721b[i10];
        }
    }

    public C2721b(C2720a c2720a) {
        int size = c2720a.f23130c.size();
        this.f23222a = new int[size * 6];
        if (!c2720a.f23136i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f23223b = new ArrayList(size);
        this.f23224c = new int[size];
        this.f23225d = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            S.a aVar = (S.a) c2720a.f23130c.get(i11);
            int i12 = i10 + 1;
            this.f23222a[i10] = aVar.f23147a;
            ArrayList arrayList = this.f23223b;
            ComponentCallbacksC2736q componentCallbacksC2736q = aVar.f23148b;
            arrayList.add(componentCallbacksC2736q != null ? componentCallbacksC2736q.mWho : null);
            int[] iArr = this.f23222a;
            iArr[i12] = aVar.f23149c ? 1 : 0;
            iArr[i10 + 2] = aVar.f23150d;
            iArr[i10 + 3] = aVar.f23151e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = aVar.f23152f;
            i10 += 6;
            iArr[i13] = aVar.f23153g;
            this.f23224c[i11] = aVar.f23154h.ordinal();
            this.f23225d[i11] = aVar.f23155i.ordinal();
        }
        this.f23226e = c2720a.f23135h;
        this.f23227f = c2720a.f23138k;
        this.f23228g = c2720a.f23195v;
        this.f23229h = c2720a.f23139l;
        this.f23230i = c2720a.f23140m;
        this.f23231j = c2720a.f23141n;
        this.f23232k = c2720a.f23142o;
        this.f23233l = c2720a.f23143p;
        this.f23234m = c2720a.f23144q;
        this.f23235n = c2720a.f23145r;
    }

    public final void a(C2720a c2720a) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= this.f23222a.length) {
                c2720a.f23135h = this.f23226e;
                c2720a.f23138k = this.f23227f;
                c2720a.f23136i = true;
                c2720a.f23139l = this.f23229h;
                c2720a.f23140m = this.f23230i;
                c2720a.f23141n = this.f23231j;
                c2720a.f23142o = this.f23232k;
                c2720a.f23143p = this.f23233l;
                c2720a.f23144q = this.f23234m;
                c2720a.f23145r = this.f23235n;
                return;
            }
            S.a aVar = new S.a();
            int i12 = i10 + 1;
            aVar.f23147a = this.f23222a[i10];
            if (J.L0(2)) {
                Log.v("FragmentManager", "Instantiate " + c2720a + " op #" + i11 + " base fragment #" + this.f23222a[i12]);
            }
            aVar.f23154h = AbstractC2754j.b.values()[this.f23224c[i11]];
            aVar.f23155i = AbstractC2754j.b.values()[this.f23225d[i11]];
            int[] iArr = this.f23222a;
            int i13 = i10 + 2;
            if (iArr[i12] == 0) {
                z10 = false;
            }
            aVar.f23149c = z10;
            int i14 = iArr[i13];
            aVar.f23150d = i14;
            int i15 = iArr[i10 + 3];
            aVar.f23151e = i15;
            int i16 = i10 + 5;
            int i17 = iArr[i10 + 4];
            aVar.f23152f = i17;
            i10 += 6;
            int i18 = iArr[i16];
            aVar.f23153g = i18;
            c2720a.f23131d = i14;
            c2720a.f23132e = i15;
            c2720a.f23133f = i17;
            c2720a.f23134g = i18;
            c2720a.e(aVar);
            i11++;
        }
    }

    public C2720a b(J j10) {
        C2720a c2720a = new C2720a(j10);
        a(c2720a);
        c2720a.f23195v = this.f23228g;
        for (int i10 = 0; i10 < this.f23223b.size(); i10++) {
            String str = (String) this.f23223b.get(i10);
            if (str != null) {
                ((S.a) c2720a.f23130c.get(i10)).f23148b = j10.h0(str);
            }
        }
        c2720a.q(1);
        return c2720a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f23222a);
        parcel.writeStringList(this.f23223b);
        parcel.writeIntArray(this.f23224c);
        parcel.writeIntArray(this.f23225d);
        parcel.writeInt(this.f23226e);
        parcel.writeString(this.f23227f);
        parcel.writeInt(this.f23228g);
        parcel.writeInt(this.f23229h);
        TextUtils.writeToParcel(this.f23230i, parcel, 0);
        parcel.writeInt(this.f23231j);
        TextUtils.writeToParcel(this.f23232k, parcel, 0);
        parcel.writeStringList(this.f23233l);
        parcel.writeStringList(this.f23234m);
        parcel.writeInt(this.f23235n ? 1 : 0);
    }

    public C2721b(Parcel parcel) {
        this.f23222a = parcel.createIntArray();
        this.f23223b = parcel.createStringArrayList();
        this.f23224c = parcel.createIntArray();
        this.f23225d = parcel.createIntArray();
        this.f23226e = parcel.readInt();
        this.f23227f = parcel.readString();
        this.f23228g = parcel.readInt();
        this.f23229h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f23230i = (CharSequence) creator.createFromParcel(parcel);
        this.f23231j = parcel.readInt();
        this.f23232k = (CharSequence) creator.createFromParcel(parcel);
        this.f23233l = parcel.createStringArrayList();
        this.f23234m = parcel.createStringArrayList();
        this.f23235n = parcel.readInt() != 0;
    }
}
