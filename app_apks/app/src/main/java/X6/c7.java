package X6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;
import v6.AbstractC6056k;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class c7 extends AbstractC6157a {
    public static final Parcelable.Creator<c7> CREATOR = new d7();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final long f18738A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final String f18739B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final String f18740C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final long f18741D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f18742E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f18748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f18749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f18750h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f18751i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f18752j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f18753k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f18754l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f18755m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f18756n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f18757o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Boolean f18758p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f18759q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f18760r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f18761s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f18762t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f18763u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f18764v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f18765w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f18766x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f18767y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f18768z;

    public c7(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, int i10, boolean z12, boolean z13, Boolean bool, long j14, List list, String str7, String str8, String str9, boolean z14, long j15, int i11, String str10, int i12, long j16, String str11, String str12, long j17, int i13) {
        AbstractC6056k.f(str);
        this.f18743a = str;
        this.f18744b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f18745c = str3;
        this.f18752j = j10;
        this.f18746d = str4;
        this.f18747e = j11;
        this.f18748f = j12;
        this.f18749g = str5;
        this.f18750h = z10;
        this.f18751i = z11;
        this.f18753k = str6;
        this.f18754l = j13;
        this.f18755m = i10;
        this.f18756n = z12;
        this.f18757o = z13;
        this.f18758p = bool;
        this.f18759q = j14;
        this.f18760r = list;
        this.f18761s = str7;
        this.f18762t = str8;
        this.f18763u = str9;
        this.f18764v = z14;
        this.f18765w = j15;
        this.f18766x = i11;
        this.f18767y = str10;
        this.f18768z = i12;
        this.f18738A = j16;
        this.f18739B = str11;
        this.f18740C = str12;
        this.f18741D = j17;
        this.f18742E = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f18743a;
        int iA = w6.c.a(parcel);
        w6.c.w(parcel, 2, str, false);
        w6.c.w(parcel, 3, this.f18744b, false);
        w6.c.w(parcel, 4, this.f18745c, false);
        w6.c.w(parcel, 5, this.f18746d, false);
        w6.c.s(parcel, 6, this.f18747e);
        w6.c.s(parcel, 7, this.f18748f);
        w6.c.w(parcel, 8, this.f18749g, false);
        w6.c.c(parcel, 9, this.f18750h);
        w6.c.c(parcel, 10, this.f18751i);
        w6.c.s(parcel, 11, this.f18752j);
        w6.c.w(parcel, 12, this.f18753k, false);
        w6.c.s(parcel, 14, this.f18754l);
        w6.c.n(parcel, 15, this.f18755m);
        w6.c.c(parcel, 16, this.f18756n);
        w6.c.c(parcel, 18, this.f18757o);
        w6.c.d(parcel, 21, this.f18758p, false);
        w6.c.s(parcel, 22, this.f18759q);
        w6.c.y(parcel, 23, this.f18760r, false);
        w6.c.w(parcel, 25, this.f18761s, false);
        w6.c.w(parcel, 26, this.f18762t, false);
        w6.c.w(parcel, 27, this.f18763u, false);
        w6.c.c(parcel, 28, this.f18764v);
        w6.c.s(parcel, 29, this.f18765w);
        w6.c.n(parcel, 30, this.f18766x);
        w6.c.w(parcel, 31, this.f18767y, false);
        w6.c.n(parcel, 32, this.f18768z);
        w6.c.s(parcel, 34, this.f18738A);
        w6.c.w(parcel, 35, this.f18739B, false);
        w6.c.w(parcel, 36, this.f18740C, false);
        w6.c.s(parcel, 37, this.f18741D);
        w6.c.n(parcel, 38, this.f18742E);
        w6.c.b(parcel, iA);
    }

    public c7(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, int i10, boolean z12, boolean z13, Boolean bool, long j14, List list, String str7, String str8, String str9, boolean z14, long j15, int i11, String str10, int i12, long j16, String str11, String str12, long j17, int i13) {
        this.f18743a = str;
        this.f18744b = str2;
        this.f18745c = str3;
        this.f18752j = j12;
        this.f18746d = str4;
        this.f18747e = j10;
        this.f18748f = j11;
        this.f18749g = str5;
        this.f18750h = z10;
        this.f18751i = z11;
        this.f18753k = str6;
        this.f18754l = j13;
        this.f18755m = i10;
        this.f18756n = z12;
        this.f18757o = z13;
        this.f18758p = bool;
        this.f18759q = j14;
        this.f18760r = list;
        this.f18761s = str7;
        this.f18762t = str8;
        this.f18763u = str9;
        this.f18764v = z14;
        this.f18765w = j15;
        this.f18766x = i11;
        this.f18767y = str10;
        this.f18768z = i12;
        this.f18738A = j16;
        this.f18739B = str11;
        this.f18740C = str12;
        this.f18741D = j17;
        this.f18742E = i13;
    }
}
