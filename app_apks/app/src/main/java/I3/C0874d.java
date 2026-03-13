package I3;

import android.net.NetworkRequest;
import android.net.Uri;
import gc.C4179C;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: I3.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0874d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f5594j = new b(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0874d f5595k = new C0874d(null, false, false, false, 15, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC0891v f5596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R3.p f5597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f5602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f5603h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Set f5604i;

    /* JADX INFO: renamed from: I3.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f5605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f5606b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f5609e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f5610f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public R3.p f5607c = new R3.p(null, 1, null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public EnumC0891v f5608d = EnumC0891v.NOT_REQUIRED;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f5611g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f5612h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Set f5613i = new LinkedHashSet();

        public final C0874d a() {
            Set setZ0 = C4179C.Z0(this.f5613i);
            return new C0874d(this.f5607c, this.f5608d, this.f5605a, this.f5606b, this.f5609e, this.f5610f, this.f5611g, this.f5612h, setZ0);
        }

        public final a b(EnumC0891v networkType) {
            AbstractC4862t.e(networkType, "networkType");
            this.f5608d = networkType;
            this.f5607c = new R3.p(null, 1, null);
            return this;
        }
    }

    /* JADX INFO: renamed from: I3.d$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: I3.d$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f5614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f5615b;

        public c(Uri uri, boolean z10) {
            AbstractC4862t.e(uri, "uri");
            this.f5614a = uri;
            this.f5615b = z10;
        }

        public final Uri a() {
            return this.f5614a;
        }

        public final boolean b() {
            return this.f5615b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!AbstractC4862t.a(c.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            AbstractC4862t.c(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            c cVar = (c) obj;
            return AbstractC4862t.a(this.f5614a, cVar.f5614a) && this.f5615b == cVar.f5615b;
        }

        public int hashCode() {
            return (this.f5614a.hashCode() * 31) + Boolean.hashCode(this.f5615b);
        }
    }

    public /* synthetic */ C0874d(EnumC0891v enumC0891v, boolean z10, boolean z11, boolean z12, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? EnumC0891v.NOT_REQUIRED : enumC0891v, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12);
    }

    public final long a() {
        return this.f5603h;
    }

    public final long b() {
        return this.f5602g;
    }

    public final Set c() {
        return this.f5604i;
    }

    public final NetworkRequest d() {
        return this.f5597b.b();
    }

    public final R3.p e() {
        return this.f5597b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC4862t.a(C0874d.class, obj.getClass())) {
            return false;
        }
        C0874d c0874d = (C0874d) obj;
        if (this.f5598c == c0874d.f5598c && this.f5599d == c0874d.f5599d && this.f5600e == c0874d.f5600e && this.f5601f == c0874d.f5601f && this.f5602g == c0874d.f5602g && this.f5603h == c0874d.f5603h && AbstractC4862t.a(d(), c0874d.d()) && this.f5596a == c0874d.f5596a) {
            return AbstractC4862t.a(this.f5604i, c0874d.f5604i);
        }
        return false;
    }

    public final EnumC0891v f() {
        return this.f5596a;
    }

    public final boolean g() {
        return !this.f5604i.isEmpty();
    }

    public final boolean h() {
        return this.f5600e;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f5596a.hashCode() * 31) + (this.f5598c ? 1 : 0)) * 31) + (this.f5599d ? 1 : 0)) * 31) + (this.f5600e ? 1 : 0)) * 31) + (this.f5601f ? 1 : 0)) * 31;
        long j10 = this.f5602g;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f5603h;
        int iHashCode2 = (((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f5604i.hashCode()) * 31;
        NetworkRequest networkRequestD = d();
        return iHashCode2 + (networkRequestD != null ? networkRequestD.hashCode() : 0);
    }

    public final boolean i() {
        return this.f5598c;
    }

    public final boolean j() {
        return this.f5599d;
    }

    public final boolean k() {
        return this.f5601f;
    }

    public String toString() {
        return "Constraints{requiredNetworkType=" + this.f5596a + ", requiresCharging=" + this.f5598c + ", requiresDeviceIdle=" + this.f5599d + ", requiresBatteryNotLow=" + this.f5600e + ", requiresStorageNotLow=" + this.f5601f + ", contentTriggerUpdateDelayMillis=" + this.f5602g + ", contentTriggerMaxDelayMillis=" + this.f5603h + ", contentUriTriggers=" + this.f5604i + ", }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0874d(EnumC0891v requiredNetworkType, boolean z10, boolean z11, boolean z12) {
        this(requiredNetworkType, z10, false, z11, z12);
        AbstractC4862t.e(requiredNetworkType, "requiredNetworkType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0874d(EnumC0891v requiredNetworkType, boolean z10, boolean z11, boolean z12, boolean z13) {
        this(requiredNetworkType, z10, z11, z12, z13, -1L, 0L, null, 192, null);
        AbstractC4862t.e(requiredNetworkType, "requiredNetworkType");
    }

    public /* synthetic */ C0874d(EnumC0891v enumC0891v, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set set, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? EnumC0891v.NOT_REQUIRED : enumC0891v, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) != 0 ? false : z13, (i10 & 32) != 0 ? -1L : j10, (i10 & 64) != 0 ? -1L : j11, (i10 & 128) != 0 ? gc.U.d() : set);
    }

    public C0874d(EnumC0891v requiredNetworkType, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set contentUriTriggers) {
        AbstractC4862t.e(requiredNetworkType, "requiredNetworkType");
        AbstractC4862t.e(contentUriTriggers, "contentUriTriggers");
        this.f5597b = new R3.p(null, 1, null);
        this.f5596a = requiredNetworkType;
        this.f5598c = z10;
        this.f5599d = z11;
        this.f5600e = z12;
        this.f5601f = z13;
        this.f5602g = j10;
        this.f5603h = j11;
        this.f5604i = contentUriTriggers;
    }

    public C0874d(R3.p requiredNetworkRequestCompat, EnumC0891v requiredNetworkType, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set contentUriTriggers) {
        AbstractC4862t.e(requiredNetworkRequestCompat, "requiredNetworkRequestCompat");
        AbstractC4862t.e(requiredNetworkType, "requiredNetworkType");
        AbstractC4862t.e(contentUriTriggers, "contentUriTriggers");
        this.f5597b = requiredNetworkRequestCompat;
        this.f5596a = requiredNetworkType;
        this.f5598c = z10;
        this.f5599d = z11;
        this.f5600e = z12;
        this.f5601f = z13;
        this.f5602g = j10;
        this.f5603h = j11;
        this.f5604i = contentUriTriggers;
    }

    public C0874d(C0874d other) {
        AbstractC4862t.e(other, "other");
        this.f5598c = other.f5598c;
        this.f5599d = other.f5599d;
        this.f5597b = other.f5597b;
        this.f5596a = other.f5596a;
        this.f5600e = other.f5600e;
        this.f5601f = other.f5601f;
        this.f5604i = other.f5604i;
        this.f5602g = other.f5602g;
        this.f5603h = other.f5603h;
    }
}
