package H8;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f5329b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map f5331b = null;

        public b(String str) {
            this.f5330a = str;
        }

        public d a() {
            return new d(this.f5330a, this.f5331b == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(this.f5331b)));
        }

        public b b(Annotation annotation) {
            if (this.f5331b == null) {
                this.f5331b = new HashMap();
            }
            this.f5331b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    public static b a(String str) {
        return new b(str);
    }

    public static d d(String str) {
        return new d(str, Collections.EMPTY_MAP);
    }

    public String b() {
        return this.f5328a;
    }

    public Annotation c(Class cls) {
        return (Annotation) this.f5329b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f5328a.equals(dVar.f5328a) && this.f5329b.equals(dVar.f5329b);
    }

    public int hashCode() {
        return (this.f5328a.hashCode() * 31) + this.f5329b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f5328a + ", properties=" + this.f5329b.values() + "}";
    }

    public d(String str, Map map) {
        this.f5328a = str;
        this.f5329b = map;
    }
}
