package Z7;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: Z7.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2603m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2603m f20377b = b().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f20378a;

    /* JADX INFO: renamed from: Z7.m$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HashMap f20379a = new HashMap();

        public C2603m a() {
            if (this.f20379a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            C2603m c2603m = new C2603m(Collections.unmodifiableMap(this.f20379a));
            this.f20379a = null;
            return c2603m;
        }
    }

    public static b b() {
        return new b();
    }

    public boolean a() {
        return this.f20378a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2603m) {
            return this.f20378a.equals(((C2603m) obj).f20378a);
        }
        return false;
    }

    public int hashCode() {
        return this.f20378a.hashCode();
    }

    public String toString() {
        return this.f20378a.toString();
    }

    public C2603m(Map map) {
        this.f20378a = map;
    }
}
