package com.google.android.gms.location;

import B6.p;
import K6.H;
import K6.T;
import R6.B;
import R6.C;
import R6.G;
import R6.t;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import org.apache.tika.utils.StringUtils;
import v6.AbstractC6055j;
import v6.AbstractC6056k;
import w6.AbstractC6157a;
import w6.c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class LocationRequest extends AbstractC6157a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f30288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f30289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f30290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f30291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f30292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f30293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f30294h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f30295i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f30296j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f30297k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f30298l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final WorkSource f30299m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final H f30300n;

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }

    public static String M(long j10) {
        return j10 == Long.MAX_VALUE ? "∞" : T.b(j10);
    }

    public static LocationRequest d() {
        return new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }

    public LocationRequest A(long j10) {
        AbstractC6056k.b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
        long j11 = this.f30289c;
        long j12 = this.f30288b;
        if (j11 == j12 / 6) {
            this.f30289c = j10 / 6;
        }
        if (this.f30295i == j12) {
            this.f30295i = j10;
        }
        this.f30288b = j10;
        return this;
    }

    public LocationRequest B(int i10) {
        B.a(i10);
        this.f30287a = i10;
        return this;
    }

    public LocationRequest E(float f10) {
        if (f10 >= 0.0f) {
            this.f30293g = f10;
            return this;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(f10).length() + 22);
        sb2.append("invalid displacement: ");
        sb2.append(f10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final int H() {
        return this.f30297k;
    }

    public final boolean I() {
        return this.f30298l;
    }

    public final WorkSource J() {
        return this.f30299m;
    }

    public final H L() {
        return this.f30300n;
    }

    public long e() {
        return this.f30291e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f30287a == locationRequest.f30287a && ((x() || this.f30288b == locationRequest.f30288b) && this.f30289c == locationRequest.f30289c && w() == locationRequest.w() && ((!w() || this.f30290d == locationRequest.f30290d) && this.f30291e == locationRequest.f30291e && this.f30292f == locationRequest.f30292f && this.f30293g == locationRequest.f30293g && this.f30294h == locationRequest.f30294h && this.f30296j == locationRequest.f30296j && this.f30297k == locationRequest.f30297k && this.f30298l == locationRequest.f30298l && this.f30299m.equals(locationRequest.f30299m) && AbstractC6055j.a(this.f30300n, locationRequest.f30300n)))) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.f30296j;
    }

    public long h() {
        return this.f30288b;
    }

    public int hashCode() {
        return AbstractC6055j.b(Integer.valueOf(this.f30287a), Long.valueOf(this.f30288b), Long.valueOf(this.f30289c), this.f30299m);
    }

    public long k() {
        return this.f30295i;
    }

    public long l() {
        return this.f30290d;
    }

    public int n() {
        return this.f30292f;
    }

    public float r() {
        return this.f30293g;
    }

    public long t() {
        return this.f30289c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request[");
        if (x()) {
            sb2.append(B.b(this.f30287a));
            if (this.f30290d > 0) {
                sb2.append("/");
                T.c(this.f30290d, sb2);
            }
        } else {
            sb2.append("@");
            if (w()) {
                T.c(this.f30288b, sb2);
                sb2.append("/");
                T.c(this.f30290d, sb2);
            } else {
                T.c(this.f30288b, sb2);
            }
            sb2.append(StringUtils.SPACE);
            sb2.append(B.b(this.f30287a));
        }
        if (x() || this.f30289c != this.f30288b) {
            sb2.append(", minUpdateInterval=");
            sb2.append(M(this.f30289c));
        }
        if (this.f30293g > 0.0d) {
            sb2.append(", minUpdateDistance=");
            sb2.append(this.f30293g);
        }
        if (!x() ? this.f30295i != this.f30288b : this.f30295i != Long.MAX_VALUE) {
            sb2.append(", maxUpdateAge=");
            sb2.append(M(this.f30295i));
        }
        if (this.f30291e != Long.MAX_VALUE) {
            sb2.append(", duration=");
            T.c(this.f30291e, sb2);
        }
        if (this.f30292f != Integer.MAX_VALUE) {
            sb2.append(", maxUpdates=");
            sb2.append(this.f30292f);
        }
        if (this.f30297k != 0) {
            sb2.append(", ");
            sb2.append(C.b(this.f30297k));
        }
        if (this.f30296j != 0) {
            sb2.append(", ");
            sb2.append(G.b(this.f30296j));
        }
        if (this.f30294h) {
            sb2.append(", waitForAccurateLocation");
        }
        if (this.f30298l) {
            sb2.append(", bypass");
        }
        if (!p.d(this.f30299m)) {
            sb2.append(", ");
            sb2.append(this.f30299m);
        }
        if (this.f30300n != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f30300n);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public int v() {
        return this.f30287a;
    }

    public boolean w() {
        long j10 = this.f30290d;
        return j10 > 0 && (j10 >> 1) >= this.f30288b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.n(parcel, 1, v());
        c.s(parcel, 2, h());
        c.s(parcel, 3, t());
        c.n(parcel, 6, n());
        c.j(parcel, 7, r());
        c.s(parcel, 8, l());
        c.c(parcel, 9, y());
        c.s(parcel, 10, e());
        c.s(parcel, 11, k());
        c.n(parcel, 12, f());
        c.n(parcel, 13, this.f30297k);
        c.c(parcel, 15, this.f30298l);
        c.u(parcel, 16, this.f30299m, i10, false);
        c.u(parcel, 17, this.f30300n, i10, false);
        c.b(parcel, iA);
    }

    public boolean x() {
        return this.f30287a == 105;
    }

    public boolean y() {
        return this.f30294h;
    }

    public LocationRequest z(long j10) {
        AbstractC6056k.c(j10 >= 0, "illegal fastest interval: %d", Long.valueOf(j10));
        this.f30289c = j10;
        return this;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f30301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f30302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f30303c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f30304d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f30305e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f30306f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f30307g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f30308h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f30309i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f30310j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f30311k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f30312l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public WorkSource f30313m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public H f30314n;

        public a(int i10, long j10) {
            this(j10);
            j(i10);
        }

        public LocationRequest a() {
            int i10 = this.f30301a;
            long j10 = this.f30302b;
            long jMin = this.f30303c;
            if (jMin == -1) {
                jMin = j10;
            } else if (i10 != 105) {
                jMin = Math.min(jMin, j10);
            }
            long jMax = Math.max(this.f30304d, this.f30302b);
            long j11 = jMin;
            long j12 = this.f30305e;
            int i11 = this.f30306f;
            float f10 = this.f30307g;
            boolean z10 = this.f30308h;
            long j13 = this.f30309i;
            if (j13 == -1) {
                j13 = this.f30302b;
            }
            return new LocationRequest(i10, j10, j11, jMax, Long.MAX_VALUE, j12, i11, f10, z10, j13, this.f30310j, this.f30311k, this.f30312l, new WorkSource(this.f30313m), this.f30314n);
        }

        public a b(long j10) {
            AbstractC6056k.b(j10 > 0, "durationMillis must be greater than 0");
            this.f30305e = j10;
            return this;
        }

        public a c(int i10) {
            G.a(i10);
            this.f30310j = i10;
            return this;
        }

        public a d(long j10) {
            AbstractC6056k.b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
            this.f30302b = j10;
            return this;
        }

        public a e(long j10) {
            boolean z10 = true;
            if (j10 != -1 && j10 < 0) {
                z10 = false;
            }
            AbstractC6056k.b(z10, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            this.f30309i = j10;
            return this;
        }

        public a f(long j10) {
            AbstractC6056k.b(j10 >= 0, "maxUpdateDelayMillis must be greater than or equal to 0");
            this.f30304d = j10;
            return this;
        }

        public a g(int i10) {
            AbstractC6056k.b(i10 > 0, "maxUpdates must be greater than 0");
            this.f30306f = i10;
            return this;
        }

        public a h(float f10) {
            AbstractC6056k.b(f10 >= 0.0f, "minUpdateDistanceMeters must be greater than or equal to 0");
            this.f30307g = f10;
            return this;
        }

        public a i(long j10) {
            boolean z10 = true;
            if (j10 != -1 && j10 < 0) {
                z10 = false;
            }
            AbstractC6056k.b(z10, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
            this.f30303c = j10;
            return this;
        }

        public a j(int i10) {
            B.a(i10);
            this.f30301a = i10;
            return this;
        }

        public a k(boolean z10) {
            this.f30308h = z10;
            return this;
        }

        public final a l(int i10) {
            C.a(i10);
            this.f30311k = i10;
            return this;
        }

        public final a m(boolean z10) {
            this.f30312l = z10;
            return this;
        }

        public final a n(WorkSource workSource) {
            this.f30313m = workSource;
            return this;
        }

        public a(long j10) {
            this.f30301a = 102;
            this.f30303c = -1L;
            this.f30304d = 0L;
            this.f30305e = Long.MAX_VALUE;
            this.f30306f = Integer.MAX_VALUE;
            this.f30307g = 0.0f;
            this.f30308h = true;
            this.f30309i = -1L;
            this.f30310j = 0;
            this.f30311k = 0;
            this.f30312l = false;
            this.f30313m = null;
            this.f30314n = null;
            d(j10);
        }

        public a(LocationRequest locationRequest) {
            this(locationRequest.v(), locationRequest.h());
            i(locationRequest.t());
            f(locationRequest.l());
            b(locationRequest.e());
            g(locationRequest.n());
            h(locationRequest.r());
            k(locationRequest.y());
            e(locationRequest.k());
            c(locationRequest.f());
            int iH = locationRequest.H();
            C.a(iH);
            this.f30311k = iH;
            this.f30312l = locationRequest.I();
            this.f30313m = locationRequest.J();
            H hL = locationRequest.L();
            boolean z10 = true;
            if (hL != null && hL.zza()) {
                z10 = false;
            }
            AbstractC6056k.a(z10);
            this.f30314n = hL;
        }
    }

    public LocationRequest(int i10, long j10, long j11, long j12, long j13, long j14, int i11, float f10, boolean z10, long j15, int i12, int i13, boolean z11, WorkSource workSource, H h10) {
        this.f30287a = i10;
        if (i10 == 105) {
            this.f30288b = Long.MAX_VALUE;
        } else {
            this.f30288b = j10;
        }
        this.f30289c = j11;
        this.f30290d = j12;
        this.f30291e = j13 == Long.MAX_VALUE ? j14 : Math.min(Math.max(1L, j13 - SystemClock.elapsedRealtime()), j14);
        this.f30292f = i11;
        this.f30293g = f10;
        this.f30294h = z10;
        this.f30295i = j15 != -1 ? j15 : j10;
        this.f30296j = i12;
        this.f30297k = i13;
        this.f30298l = z11;
        this.f30299m = workSource;
        this.f30300n = h10;
    }
}
