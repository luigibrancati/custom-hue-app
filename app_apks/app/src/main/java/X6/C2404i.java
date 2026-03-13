package X6;

import android.os.Parcel;
import android.os.Parcelable;
import v6.AbstractC6056k;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: X6.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2404i extends AbstractC6157a {
    public static final Parcelable.Creator<C2404i> CREATOR = new C2412j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f18977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public W6 f18979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f18982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final I f18983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f18984h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public I f18985i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f18986j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final I f18987k;

    public C2404i(C2404i c2404i) {
        AbstractC6056k.l(c2404i);
        this.f18977a = c2404i.f18977a;
        this.f18978b = c2404i.f18978b;
        this.f18979c = c2404i.f18979c;
        this.f18980d = c2404i.f18980d;
        this.f18981e = c2404i.f18981e;
        this.f18982f = c2404i.f18982f;
        this.f18983g = c2404i.f18983g;
        this.f18984h = c2404i.f18984h;
        this.f18985i = c2404i.f18985i;
        this.f18986j = c2404i.f18986j;
        this.f18987k = c2404i.f18987k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.w(parcel, 2, this.f18977a, false);
        w6.c.w(parcel, 3, this.f18978b, false);
        w6.c.u(parcel, 4, this.f18979c, i10, false);
        w6.c.s(parcel, 5, this.f18980d);
        w6.c.c(parcel, 6, this.f18981e);
        w6.c.w(parcel, 7, this.f18982f, false);
        w6.c.u(parcel, 8, this.f18983g, i10, false);
        w6.c.s(parcel, 9, this.f18984h);
        w6.c.u(parcel, 10, this.f18985i, i10, false);
        w6.c.s(parcel, 11, this.f18986j);
        w6.c.u(parcel, 12, this.f18987k, i10, false);
        w6.c.b(parcel, iA);
    }

    public C2404i(String str, String str2, W6 w62, long j10, boolean z10, String str3, I i10, long j11, I i11, long j12, I i12) {
        this.f18977a = str;
        this.f18978b = str2;
        this.f18979c = w62;
        this.f18980d = j10;
        this.f18981e = z10;
        this.f18982f = str3;
        this.f18983g = i10;
        this.f18984h = j11;
        this.f18985i = i11;
        this.f18986j = j12;
        this.f18987k = i12;
    }
}
