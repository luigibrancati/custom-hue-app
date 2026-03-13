package Z7;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: Z7.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2593c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f20352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f20353b;

    /* JADX INFO: renamed from: Z7.c$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map f20354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map f20355b;

        public b a(Enum r22, Object obj) {
            this.f20354a.put(r22, obj);
            this.f20355b.put(obj, r22);
            return this;
        }

        public C2593c b() {
            return new C2593c(Collections.unmodifiableMap(this.f20354a), Collections.unmodifiableMap(this.f20355b));
        }

        public b() {
            this.f20354a = new HashMap();
            this.f20355b = new HashMap();
        }
    }

    public static b a() {
        return new b();
    }

    public Object b(Enum r32) throws GeneralSecurityException {
        Object obj = this.f20352a.get(r32);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: " + r32);
    }

    public Enum c(Object obj) throws GeneralSecurityException {
        Enum r22 = (Enum) this.f20353b.get(obj);
        if (r22 != null) {
            return r22;
        }
        throw new GeneralSecurityException("Unable to convert object enum: " + obj);
    }

    public C2593c(Map map, Map map2) {
        this.f20352a = map;
        this.f20353b = map2;
    }
}
