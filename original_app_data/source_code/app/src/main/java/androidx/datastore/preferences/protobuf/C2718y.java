package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C2718y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC2700f f22915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C2707m f22916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile K f22917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile AbstractC2700f f22918d;

    public void a(K k10) {
        if (this.f22917c != null) {
            return;
        }
        synchronized (this) {
            if (this.f22917c != null) {
                return;
            }
            try {
                if (this.f22915a != null) {
                    this.f22917c = (K) k10.getParserForType().a(this.f22915a, this.f22916b);
                    this.f22918d = this.f22915a;
                } else {
                    this.f22917c = k10;
                    this.f22918d = AbstractC2700f.f22793b;
                }
            } catch (C2715v unused) {
                this.f22917c = k10;
                this.f22918d = AbstractC2700f.f22793b;
            }
        }
    }

    public int b() {
        if (this.f22918d != null) {
            return this.f22918d.size();
        }
        AbstractC2700f abstractC2700f = this.f22915a;
        if (abstractC2700f != null) {
            return abstractC2700f.size();
        }
        if (this.f22917c != null) {
            return this.f22917c.getSerializedSize();
        }
        return 0;
    }

    public K c(K k10) {
        a(k10);
        return this.f22917c;
    }

    public AbstractC2700f d() {
        if (this.f22918d != null) {
            return this.f22918d;
        }
        AbstractC2700f abstractC2700f = this.f22915a;
        if (abstractC2700f != null) {
            return abstractC2700f;
        }
        synchronized (this) {
            try {
                if (this.f22918d != null) {
                    return this.f22918d;
                }
                if (this.f22917c == null) {
                    this.f22918d = AbstractC2700f.f22793b;
                } else {
                    this.f22918d = this.f22917c.toByteString();
                }
                return this.f22918d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2718y)) {
            return false;
        }
        C2718y c2718y = (C2718y) obj;
        K k10 = this.f22917c;
        K k11 = c2718y.f22917c;
        return (k10 == null && k11 == null) ? d().equals(c2718y.d()) : (k10 == null || k11 == null) ? k10 != null ? k10.equals(c2718y.c(k10.getDefaultInstanceForType())) : c(k11.getDefaultInstanceForType()).equals(k11) : k10.equals(k11);
    }

    public int hashCode() {
        return 1;
    }
}
