package Ge;

import Fe.A;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f4749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f4753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f4754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f4756h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f4757i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f4758j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Long f4759k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Long f4760l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Long f4761m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f4762n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Integer f4763o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f4764p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f4765q;

    public i(A canonicalPath, boolean z10, String comment, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3) {
        AbstractC4862t.e(canonicalPath, "canonicalPath");
        AbstractC4862t.e(comment, "comment");
        this.f4749a = canonicalPath;
        this.f4750b = z10;
        this.f4751c = comment;
        this.f4752d = j10;
        this.f4753e = j11;
        this.f4754f = j12;
        this.f4755g = i10;
        this.f4756h = j13;
        this.f4757i = i11;
        this.f4758j = i12;
        this.f4759k = l10;
        this.f4760l = l11;
        this.f4761m = l12;
        this.f4762n = num;
        this.f4763o = num2;
        this.f4764p = num3;
        this.f4765q = new ArrayList();
    }

    public final i a(Integer num, Integer num2, Integer num3) {
        return new i(this.f4749a, this.f4750b, this.f4751c, this.f4752d, this.f4753e, this.f4754f, this.f4755g, this.f4756h, this.f4757i, this.f4758j, this.f4759k, this.f4760l, this.f4761m, num, num2, num3);
    }

    public final A b() {
        return this.f4749a;
    }

    public final List c() {
        return this.f4765q;
    }

    public final long d() {
        return this.f4753e;
    }

    public final int e() {
        return this.f4755g;
    }

    public final Long f() {
        Long l10 = this.f4761m;
        if (l10 != null) {
            return Long.valueOf(j.d(l10.longValue()));
        }
        Integer num = this.f4764p;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        return null;
    }

    public final Long g() {
        Long l10 = this.f4760l;
        if (l10 != null) {
            return Long.valueOf(j.d(l10.longValue()));
        }
        Integer num = this.f4763o;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        return null;
    }

    public final Long h() {
        Long l10 = this.f4759k;
        if (l10 != null) {
            return Long.valueOf(j.d(l10.longValue()));
        }
        Integer num = this.f4762n;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        int i10 = this.f4758j;
        if (i10 != -1) {
            return j.c(this.f4757i, i10);
        }
        return null;
    }

    public final long i() {
        return this.f4756h;
    }

    public final long j() {
        return this.f4754f;
    }

    public final boolean k() {
        return this.f4750b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ i(A a10, boolean z10, String str, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3, int i13, AbstractC4854k abstractC4854k) {
        Integer num4;
        boolean z11;
        Integer num5;
        boolean z12 = (i13 & 2) != 0 ? false : z10;
        String str2 = (i13 & 4) != 0 ? "" : str;
        long j14 = (i13 & 8) != 0 ? -1L : j10;
        long j15 = (i13 & 16) != 0 ? -1L : j11;
        long j16 = (i13 & 32) != 0 ? -1L : j12;
        int i14 = (i13 & 64) != 0 ? -1 : i10;
        long j17 = (i13 & 128) == 0 ? j13 : -1L;
        int i15 = (i13 & 256) != 0 ? -1 : i11;
        int i16 = (i13 & 512) == 0 ? i12 : -1;
        Long l13 = (i13 & RecognitionOptions.UPC_E) != 0 ? null : l10;
        Long l14 = (i13 & RecognitionOptions.PDF417) != 0 ? null : l11;
        boolean z13 = z12;
        Long l15 = (i13 & RecognitionOptions.AZTEC) != 0 ? null : l12;
        Integer num6 = (i13 & 8192) != 0 ? null : num;
        Integer num7 = (i13 & 16384) != 0 ? null : num2;
        if ((i13 & 32768) != 0) {
            num4 = num6;
            z11 = z13;
            num5 = null;
        } else {
            num4 = num6;
            z11 = z13;
            num5 = num3;
        }
        this(a10, z11, str2, j14, j15, j16, i14, j17, i15, i16, l13, l14, l15, num4, num7, num5);
    }
}
