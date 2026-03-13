package R6;

import K6.O;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: R6.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC2069d {

    /* JADX INFO: renamed from: R6.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public double f14795e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public double f14796f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f14797g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f14791a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14792b = 3;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f14793c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public short f14794d = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f14798h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f14799i = -1;

        public InterfaceC2069d a() {
            if (this.f14791a == null) {
                throw new IllegalArgumentException("Request ID not set.");
            }
            int i10 = this.f14792b;
            if (i10 == 0) {
                throw new IllegalArgumentException("Transitions types not set.");
            }
            if ((i10 & 4) != 0 && this.f14799i < 0) {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELL.");
            }
            if (this.f14793c == Long.MIN_VALUE) {
                throw new IllegalArgumentException("Expiration not set.");
            }
            if (this.f14794d == -1) {
                throw new IllegalArgumentException("Geofence region not set.");
            }
            if (this.f14798h >= 0) {
                return new O(this.f14791a, this.f14792b, (short) 1, this.f14795e, this.f14796f, this.f14797g, this.f14793c, this.f14798h, this.f14799i);
            }
            throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
        }

        public a b(double d10, double d11, float f10) {
            boolean z10 = d10 >= -90.0d && d10 <= 90.0d;
            StringBuilder sb2 = new StringBuilder(String.valueOf(d10).length() + 18);
            sb2.append("Invalid latitude: ");
            sb2.append(d10);
            AbstractC6056k.b(z10, sb2.toString());
            boolean z11 = d11 >= -180.0d && d11 <= 180.0d;
            StringBuilder sb3 = new StringBuilder(String.valueOf(d11).length() + 19);
            sb3.append("Invalid longitude: ");
            sb3.append(d11);
            AbstractC6056k.b(z11, sb3.toString());
            boolean z12 = f10 > 0.0f;
            StringBuilder sb4 = new StringBuilder(String.valueOf(f10).length() + 16);
            sb4.append("Invalid radius: ");
            sb4.append(f10);
            AbstractC6056k.b(z12, sb4.toString());
            this.f14794d = (short) 1;
            this.f14795e = d10;
            this.f14796f = d11;
            this.f14797g = f10;
            return this;
        }

        public a c(long j10) {
            if (j10 < 0) {
                this.f14793c = -1L;
                return this;
            }
            this.f14793c = B6.h.d().c() + j10;
            return this;
        }

        public a d(String str) {
            this.f14791a = (String) AbstractC6056k.m(str, "Request ID can't be set to null");
            return this;
        }

        public a e(int i10) {
            this.f14792b = i10;
            return this;
        }
    }

    String c();
}
