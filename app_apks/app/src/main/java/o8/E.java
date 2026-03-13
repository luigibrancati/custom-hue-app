package o8;

import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f41230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f41231b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public @interface a {
    }

    public E(Class cls, Class cls2) {
        this.f41230a = cls;
        this.f41231b = cls2;
    }

    public static E a(Class cls, Class cls2) {
        return new E(cls, cls2);
    }

    public static E b(Class cls) {
        return new E(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || E.class != obj.getClass()) {
            return false;
        }
        E e10 = (E) obj;
        if (this.f41231b.equals(e10.f41231b)) {
            return this.f41230a.equals(e10.f41230a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f41231b.hashCode() * 31) + this.f41230a.hashCode();
    }

    public String toString() {
        if (this.f41230a == a.class) {
            return this.f41231b.getName();
        }
        return "@" + this.f41230a.getName() + StringUtils.SPACE + this.f41231b.getName();
    }
}
