package i2;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final K f36876c = new K(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36878b;

    public K(long j10, long j11) {
        this.f36877a = j10;
        this.f36878b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && K.class == obj.getClass()) {
            K k10 = (K) obj;
            if (this.f36877a == k10.f36877a && this.f36878b == k10.f36878b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f36877a) * 31) + ((int) this.f36878b);
    }

    public String toString() {
        return "[timeUs=" + this.f36877a + ", position=" + this.f36878b + "]";
    }
}
