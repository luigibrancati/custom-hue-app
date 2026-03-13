package i2;

import G1.AbstractC0853a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface J {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f36872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f36873b;

        public a(K k10) {
            this(k10, k10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f36872a.equals(aVar.f36872a) && this.f36873b.equals(aVar.f36873b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f36872a.hashCode() * 31) + this.f36873b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            sb2.append(this.f36872a);
            if (this.f36872a.equals(this.f36873b)) {
                str = "";
            } else {
                str = ", " + this.f36873b;
            }
            sb2.append(str);
            sb2.append("]");
            return sb2.toString();
        }

        public a(K k10, K k11) {
            this.f36872a = (K) AbstractC0853a.e(k10);
            this.f36873b = (K) AbstractC0853a.e(k11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b implements J {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f36874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f36875b;

        public b(long j10) {
            this(j10, 0L);
        }

        @Override // i2.J
        public a e(long j10) {
            return this.f36875b;
        }

        @Override // i2.J
        public boolean h() {
            return false;
        }

        @Override // i2.J
        public long m() {
            return this.f36874a;
        }

        public b(long j10, long j11) {
            this.f36874a = j10;
            this.f36875b = new a(j11 == 0 ? K.f36876c : new K(0L, j11));
        }
    }

    a e(long j10);

    boolean h();

    long m();
}
