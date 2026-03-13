package Q3;

import I3.AbstractC0890u;
import I3.C0874d;
import I3.EnumC0871a;
import I3.L;
import androidx.work.OverwritingInputMerger;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.ar.core.ImageMetadata;
import gc.C4207u;
import io.sentry.TransactionOptions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import s.InterfaceC5702a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String f13585A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final InterfaceC5702a f13586B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final a f13587z = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public L.c f13589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f13591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.work.b f13592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.work.b f13593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f13594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f13595h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f13596i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0874d f13597j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13598k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public EnumC0871a f13599l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f13600m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f13601n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f13602o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f13603p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f13604q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public I3.D f13605r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13606s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f13607t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f13608u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f13609v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f13610w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f13611x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Boolean f13612y;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final long a(boolean z10, int i10, EnumC0871a backoffPolicy, long j10, long j11, int i11, boolean z11, long j12, long j13, long j14, long j15) {
            AbstractC4862t.e(backoffPolicy, "backoffPolicy");
            if (j15 != Long.MAX_VALUE && z11) {
                return i11 == 0 ? j15 : Bc.k.f(j15, 900000 + j11);
            }
            if (z10) {
                return Bc.k.i(backoffPolicy == EnumC0871a.LINEAR ? j10 * ((long) i10) : (long) Math.scalb(j10, i10 - 1), 18000000L) + j11;
            }
            if (z11) {
                long j16 = i11 == 0 ? j11 + j12 : j11 + j14;
                return (j13 == j14 || i11 != 0) ? j16 : j16 + (j14 - j13);
            }
            if (j11 == -1) {
                return Long.MAX_VALUE;
            }
            return j11 + j12;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f13613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public L.c f13614b;

        public b(String id2, L.c state) {
            AbstractC4862t.e(id2, "id");
            AbstractC4862t.e(state, "state");
            this.f13613a = id2;
            this.f13614b = state;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC4862t.a(this.f13613a, bVar.f13613a) && this.f13614b == bVar.f13614b;
        }

        public int hashCode() {
            return (this.f13613a.hashCode() * 31) + this.f13614b.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.f13613a + ", state=" + this.f13614b + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f13615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final L.c f13616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final androidx.work.b f13617c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f13618d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f13619e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f13620f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final C0874d f13621g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f13622h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public EnumC0871a f13623i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f13624j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f13625k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f13626l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f13627m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final long f13628n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f13629o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final List f13630p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final List f13631q;

        public c(String id2, L.c state, androidx.work.b output, long j10, long j11, long j12, C0874d constraints, int i10, EnumC0871a backoffPolicy, long j13, long j14, int i11, int i12, long j15, int i13, List tags, List progress) {
            AbstractC4862t.e(id2, "id");
            AbstractC4862t.e(state, "state");
            AbstractC4862t.e(output, "output");
            AbstractC4862t.e(constraints, "constraints");
            AbstractC4862t.e(backoffPolicy, "backoffPolicy");
            AbstractC4862t.e(tags, "tags");
            AbstractC4862t.e(progress, "progress");
            this.f13615a = id2;
            this.f13616b = state;
            this.f13617c = output;
            this.f13618d = j10;
            this.f13619e = j11;
            this.f13620f = j12;
            this.f13621g = constraints;
            this.f13622h = i10;
            this.f13623i = backoffPolicy;
            this.f13624j = j13;
            this.f13625k = j14;
            this.f13626l = i11;
            this.f13627m = i12;
            this.f13628n = j15;
            this.f13629o = i13;
            this.f13630p = tags;
            this.f13631q = progress;
        }

        public final long a() {
            if (this.f13616b == L.c.ENQUEUED) {
                return I.f13587z.a(c(), this.f13622h, this.f13623i, this.f13624j, this.f13625k, this.f13626l, d(), this.f13618d, this.f13620f, this.f13619e, this.f13628n);
            }
            return Long.MAX_VALUE;
        }

        public final L.b b() {
            long j10 = this.f13619e;
            if (j10 != 0) {
                return new L.b(j10, this.f13620f);
            }
            return null;
        }

        public final boolean c() {
            return this.f13616b == L.c.ENQUEUED && this.f13622h > 0;
        }

        public final boolean d() {
            return this.f13619e != 0;
        }

        public final I3.L e() {
            androidx.work.b bVar = !this.f13631q.isEmpty() ? (androidx.work.b) this.f13631q.get(0) : androidx.work.b.f24769c;
            UUID uuidFromString = UUID.fromString(this.f13615a);
            AbstractC4862t.d(uuidFromString, "fromString(...)");
            return new I3.L(uuidFromString, this.f13616b, new HashSet(this.f13630p), this.f13617c, bVar, this.f13622h, this.f13627m, this.f13621g, this.f13618d, b(), a(), this.f13629o);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC4862t.a(this.f13615a, cVar.f13615a) && this.f13616b == cVar.f13616b && AbstractC4862t.a(this.f13617c, cVar.f13617c) && this.f13618d == cVar.f13618d && this.f13619e == cVar.f13619e && this.f13620f == cVar.f13620f && AbstractC4862t.a(this.f13621g, cVar.f13621g) && this.f13622h == cVar.f13622h && this.f13623i == cVar.f13623i && this.f13624j == cVar.f13624j && this.f13625k == cVar.f13625k && this.f13626l == cVar.f13626l && this.f13627m == cVar.f13627m && this.f13628n == cVar.f13628n && this.f13629o == cVar.f13629o && AbstractC4862t.a(this.f13630p, cVar.f13630p) && AbstractC4862t.a(this.f13631q, cVar.f13631q);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((this.f13615a.hashCode() * 31) + this.f13616b.hashCode()) * 31) + this.f13617c.hashCode()) * 31) + Long.hashCode(this.f13618d)) * 31) + Long.hashCode(this.f13619e)) * 31) + Long.hashCode(this.f13620f)) * 31) + this.f13621g.hashCode()) * 31) + Integer.hashCode(this.f13622h)) * 31) + this.f13623i.hashCode()) * 31) + Long.hashCode(this.f13624j)) * 31) + Long.hashCode(this.f13625k)) * 31) + Integer.hashCode(this.f13626l)) * 31) + Integer.hashCode(this.f13627m)) * 31) + Long.hashCode(this.f13628n)) * 31) + Integer.hashCode(this.f13629o)) * 31) + this.f13630p.hashCode()) * 31) + this.f13631q.hashCode();
        }

        public String toString() {
            return "WorkInfoPojo(id=" + this.f13615a + ", state=" + this.f13616b + ", output=" + this.f13617c + ", initialDelay=" + this.f13618d + ", intervalDuration=" + this.f13619e + ", flexDuration=" + this.f13620f + ", constraints=" + this.f13621g + ", runAttemptCount=" + this.f13622h + ", backoffPolicy=" + this.f13623i + ", backoffDelayDuration=" + this.f13624j + ", lastEnqueueTime=" + this.f13625k + ", periodCount=" + this.f13626l + ", generation=" + this.f13627m + ", nextScheduleTimeOverride=" + this.f13628n + ", stopReason=" + this.f13629o + ", tags=" + this.f13630p + ", progress=" + this.f13631q + ')';
        }
    }

    static {
        String strI = AbstractC0890u.i("WorkSpec");
        AbstractC4862t.d(strI, "tagWithPrefix(...)");
        f13585A = strI;
        f13586B = new InterfaceC5702a() { // from class: Q3.H
            @Override // s.InterfaceC5702a
            public final Object apply(Object obj) {
                return I.b((List) obj);
            }
        };
    }

    public I(String id2, L.c state, String workerClassName, String inputMergerClassName, androidx.work.b input, androidx.work.b output, long j10, long j11, long j12, C0874d constraints, int i10, EnumC0871a backoffPolicy, long j13, long j14, long j15, long j16, boolean z10, I3.D outOfQuotaPolicy, int i11, int i12, long j17, int i13, int i14, String str, Boolean bool) {
        AbstractC4862t.e(id2, "id");
        AbstractC4862t.e(state, "state");
        AbstractC4862t.e(workerClassName, "workerClassName");
        AbstractC4862t.e(inputMergerClassName, "inputMergerClassName");
        AbstractC4862t.e(input, "input");
        AbstractC4862t.e(output, "output");
        AbstractC4862t.e(constraints, "constraints");
        AbstractC4862t.e(backoffPolicy, "backoffPolicy");
        AbstractC4862t.e(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.f13588a = id2;
        this.f13589b = state;
        this.f13590c = workerClassName;
        this.f13591d = inputMergerClassName;
        this.f13592e = input;
        this.f13593f = output;
        this.f13594g = j10;
        this.f13595h = j11;
        this.f13596i = j12;
        this.f13597j = constraints;
        this.f13598k = i10;
        this.f13599l = backoffPolicy;
        this.f13600m = j13;
        this.f13601n = j14;
        this.f13602o = j15;
        this.f13603p = j16;
        this.f13604q = z10;
        this.f13605r = outOfQuotaPolicy;
        this.f13606s = i11;
        this.f13607t = i12;
        this.f13608u = j17;
        this.f13609v = i13;
        this.f13610w = i14;
        this.f13611x = str;
        this.f13612y = bool;
    }

    public static final List b(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C4207u.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((c) it.next()).e());
        }
        return arrayList;
    }

    public static /* synthetic */ I e(I i10, String str, L.c cVar, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j10, long j11, long j12, C0874d c0874d, int i11, EnumC0871a enumC0871a, long j13, long j14, long j15, long j16, boolean z10, I3.D d10, int i12, int i13, long j17, int i14, int i15, String str4, Boolean bool, int i16, Object obj) {
        Boolean bool2;
        String str5;
        long j18;
        long j19;
        long j20;
        long j21;
        I3.D d11;
        int i17;
        int i18;
        long j22;
        int i19;
        L.c cVar2;
        int i20;
        boolean z11;
        String str6;
        String str7;
        androidx.work.b bVar3;
        androidx.work.b bVar4;
        long j23;
        long j24;
        long j25;
        C0874d c0874d2;
        int i21;
        EnumC0871a enumC0871a2;
        String str8 = (i16 & 1) != 0 ? i10.f13588a : str;
        L.c cVar3 = (i16 & 2) != 0 ? i10.f13589b : cVar;
        String str9 = (i16 & 4) != 0 ? i10.f13590c : str2;
        String str10 = (i16 & 8) != 0 ? i10.f13591d : str3;
        androidx.work.b bVar5 = (i16 & 16) != 0 ? i10.f13592e : bVar;
        androidx.work.b bVar6 = (i16 & 32) != 0 ? i10.f13593f : bVar2;
        long j26 = (i16 & 64) != 0 ? i10.f13594g : j10;
        long j27 = (i16 & 128) != 0 ? i10.f13595h : j11;
        long j28 = (i16 & 256) != 0 ? i10.f13596i : j12;
        C0874d c0874d3 = (i16 & 512) != 0 ? i10.f13597j : c0874d;
        int i22 = (i16 & RecognitionOptions.UPC_E) != 0 ? i10.f13598k : i11;
        String str11 = str8;
        EnumC0871a enumC0871a3 = (i16 & RecognitionOptions.PDF417) != 0 ? i10.f13599l : enumC0871a;
        L.c cVar4 = cVar3;
        long j29 = (i16 & RecognitionOptions.AZTEC) != 0 ? i10.f13600m : j13;
        long j30 = (i16 & 8192) != 0 ? i10.f13601n : j14;
        long j31 = (i16 & 16384) != 0 ? i10.f13602o : j15;
        long j32 = (i16 & 32768) != 0 ? i10.f13603p : j16;
        boolean z12 = (i16 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? i10.f13604q : z10;
        long j33 = j32;
        I3.D d12 = (i16 & 131072) != 0 ? i10.f13605r : d10;
        int i23 = (i16 & 262144) != 0 ? i10.f13606s : i12;
        I3.D d13 = d12;
        int i24 = (i16 & ImageMetadata.LENS_APERTURE) != 0 ? i10.f13607t : i13;
        int i25 = i23;
        long j34 = (i16 & ImageMetadata.SHADING_MODE) != 0 ? i10.f13608u : j17;
        int i26 = (i16 & 2097152) != 0 ? i10.f13609v : i14;
        int i27 = (i16 & 4194304) != 0 ? i10.f13610w : i15;
        int i28 = i26;
        String str12 = (i16 & 8388608) != 0 ? i10.f13611x : str4;
        if ((i16 & 16777216) != 0) {
            str5 = str12;
            bool2 = i10.f13612y;
            j19 = j30;
            j20 = j31;
            j21 = j33;
            d11 = d13;
            i17 = i25;
            i18 = i24;
            j22 = j34;
            i19 = i28;
            i20 = i27;
            z11 = z12;
            str7 = str10;
            bVar3 = bVar5;
            bVar4 = bVar6;
            j23 = j26;
            j24 = j27;
            j25 = j28;
            c0874d2 = c0874d3;
            i21 = i22;
            enumC0871a2 = enumC0871a3;
            j18 = j29;
            cVar2 = cVar4;
            str6 = str9;
        } else {
            bool2 = bool;
            str5 = str12;
            j18 = j29;
            j19 = j30;
            j20 = j31;
            j21 = j33;
            d11 = d13;
            i17 = i25;
            i18 = i24;
            j22 = j34;
            i19 = i28;
            cVar2 = cVar4;
            i20 = i27;
            z11 = z12;
            str6 = str9;
            str7 = str10;
            bVar3 = bVar5;
            bVar4 = bVar6;
            j23 = j26;
            j24 = j27;
            j25 = j28;
            c0874d2 = c0874d3;
            i21 = i22;
            enumC0871a2 = enumC0871a3;
        }
        return i10.d(str11, cVar2, str6, str7, bVar3, bVar4, j23, j24, j25, c0874d2, i21, enumC0871a2, j18, j19, j20, j21, z11, d11, i17, i18, j22, i19, i20, str5, bool2);
    }

    public final long c() {
        return f13587z.a(n(), this.f13598k, this.f13599l, this.f13600m, this.f13601n, this.f13606s, o(), this.f13594g, this.f13596i, this.f13595h, this.f13608u);
    }

    public final I d(String id2, L.c state, String workerClassName, String inputMergerClassName, androidx.work.b input, androidx.work.b output, long j10, long j11, long j12, C0874d constraints, int i10, EnumC0871a backoffPolicy, long j13, long j14, long j15, long j16, boolean z10, I3.D outOfQuotaPolicy, int i11, int i12, long j17, int i13, int i14, String str, Boolean bool) {
        AbstractC4862t.e(id2, "id");
        AbstractC4862t.e(state, "state");
        AbstractC4862t.e(workerClassName, "workerClassName");
        AbstractC4862t.e(inputMergerClassName, "inputMergerClassName");
        AbstractC4862t.e(input, "input");
        AbstractC4862t.e(output, "output");
        AbstractC4862t.e(constraints, "constraints");
        AbstractC4862t.e(backoffPolicy, "backoffPolicy");
        AbstractC4862t.e(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new I(id2, state, workerClassName, inputMergerClassName, input, output, j10, j11, j12, constraints, i10, backoffPolicy, j13, j14, j15, j16, z10, outOfQuotaPolicy, i11, i12, j17, i13, i14, str, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i10 = (I) obj;
        return AbstractC4862t.a(this.f13588a, i10.f13588a) && this.f13589b == i10.f13589b && AbstractC4862t.a(this.f13590c, i10.f13590c) && AbstractC4862t.a(this.f13591d, i10.f13591d) && AbstractC4862t.a(this.f13592e, i10.f13592e) && AbstractC4862t.a(this.f13593f, i10.f13593f) && this.f13594g == i10.f13594g && this.f13595h == i10.f13595h && this.f13596i == i10.f13596i && AbstractC4862t.a(this.f13597j, i10.f13597j) && this.f13598k == i10.f13598k && this.f13599l == i10.f13599l && this.f13600m == i10.f13600m && this.f13601n == i10.f13601n && this.f13602o == i10.f13602o && this.f13603p == i10.f13603p && this.f13604q == i10.f13604q && this.f13605r == i10.f13605r && this.f13606s == i10.f13606s && this.f13607t == i10.f13607t && this.f13608u == i10.f13608u && this.f13609v == i10.f13609v && this.f13610w == i10.f13610w && AbstractC4862t.a(this.f13611x, i10.f13611x) && AbstractC4862t.a(this.f13612y, i10.f13612y);
    }

    public final Boolean f() {
        return this.f13612y;
    }

    public final int g() {
        return this.f13607t;
    }

    public final long h() {
        return this.f13608u;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((this.f13588a.hashCode() * 31) + this.f13589b.hashCode()) * 31) + this.f13590c.hashCode()) * 31) + this.f13591d.hashCode()) * 31) + this.f13592e.hashCode()) * 31) + this.f13593f.hashCode()) * 31) + Long.hashCode(this.f13594g)) * 31) + Long.hashCode(this.f13595h)) * 31) + Long.hashCode(this.f13596i)) * 31) + this.f13597j.hashCode()) * 31) + Integer.hashCode(this.f13598k)) * 31) + this.f13599l.hashCode()) * 31) + Long.hashCode(this.f13600m)) * 31) + Long.hashCode(this.f13601n)) * 31) + Long.hashCode(this.f13602o)) * 31) + Long.hashCode(this.f13603p)) * 31) + Boolean.hashCode(this.f13604q)) * 31) + this.f13605r.hashCode()) * 31) + Integer.hashCode(this.f13606s)) * 31) + Integer.hashCode(this.f13607t)) * 31) + Long.hashCode(this.f13608u)) * 31) + Integer.hashCode(this.f13609v)) * 31) + Integer.hashCode(this.f13610w)) * 31;
        String str = this.f13611x;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f13612y;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final int i() {
        return this.f13609v;
    }

    public final int j() {
        return this.f13606s;
    }

    public final int k() {
        return this.f13610w;
    }

    public final String l() {
        return this.f13611x;
    }

    public final boolean m() {
        return !AbstractC4862t.a(C0874d.f5595k, this.f13597j);
    }

    public final boolean n() {
        return this.f13589b == L.c.ENQUEUED && this.f13598k > 0;
    }

    public final boolean o() {
        return this.f13595h != 0;
    }

    public final void p(String str) {
        this.f13611x = str;
    }

    public String toString() {
        return "{WorkSpec: " + this.f13588a + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ I(String str, L.c cVar, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j10, long j11, long j12, C0874d c0874d, int i10, EnumC0871a enumC0871a, long j13, long j14, long j15, long j16, boolean z10, I3.D d10, int i11, int i12, long j17, int i13, int i14, String str4, Boolean bool, int i15, AbstractC4854k abstractC4854k) {
        String str5;
        L.c cVar2 = (i15 & 2) != 0 ? L.c.ENQUEUED : cVar;
        if ((i15 & 8) != 0) {
            String name = OverwritingInputMerger.class.getName();
            AbstractC4862t.d(name, "getName(...)");
            str5 = name;
        } else {
            str5 = str3;
        }
        this(str, cVar2, str2, str5, (i15 & 16) != 0 ? androidx.work.b.f24769c : bVar, (i15 & 32) != 0 ? androidx.work.b.f24769c : bVar2, (i15 & 64) != 0 ? 0L : j10, (i15 & 128) != 0 ? 0L : j11, (i15 & 256) != 0 ? 0L : j12, (i15 & 512) != 0 ? C0874d.f5595k : c0874d, (i15 & RecognitionOptions.UPC_E) != 0 ? 0 : i10, (i15 & RecognitionOptions.PDF417) != 0 ? EnumC0871a.EXPONENTIAL : enumC0871a, (i15 & RecognitionOptions.AZTEC) != 0 ? TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION : j13, (i15 & 8192) != 0 ? -1L : j14, (i15 & 16384) == 0 ? j15 : 0L, (32768 & i15) != 0 ? -1L : j16, (65536 & i15) != 0 ? false : z10, (131072 & i15) != 0 ? I3.D.RUN_AS_NON_EXPEDITED_WORK_REQUEST : d10, (262144 & i15) != 0 ? 0 : i11, (524288 & i15) != 0 ? 0 : i12, (1048576 & i15) != 0 ? Long.MAX_VALUE : j17, (2097152 & i15) != 0 ? 0 : i13, (4194304 & i15) != 0 ? -256 : i14, (8388608 & i15) != 0 ? null : str4, (i15 & 16777216) != 0 ? Boolean.FALSE : bool);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public I(String id2, String workerClassName_) {
        this(id2, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554426, null);
        AbstractC4862t.e(id2, "id");
        AbstractC4862t.e(workerClassName_, "workerClassName_");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public I(String newId, I other) {
        this(newId, other.f13589b, other.f13590c, other.f13591d, new androidx.work.b(other.f13592e), new androidx.work.b(other.f13593f), other.f13594g, other.f13595h, other.f13596i, new C0874d(other.f13597j), other.f13598k, other.f13599l, other.f13600m, other.f13601n, other.f13602o, other.f13603p, other.f13604q, other.f13605r, other.f13606s, 0, other.f13608u, other.f13609v, other.f13610w, other.f13611x, other.f13612y, ImageMetadata.LENS_APERTURE, null);
        AbstractC4862t.e(newId, "newId");
        AbstractC4862t.e(other, "other");
    }
}
