package k1;

import gc.Q;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: k1.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4785h {

    /* JADX INFO: renamed from: k1.h$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f39198a;

        public a(String name) {
            AbstractC4862t.e(name, "name");
            this.f39198a = name;
        }

        public final String a() {
            return this.f39198a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return AbstractC4862t.a(this.f39198a, ((a) obj).f39198a);
            }
            return false;
        }

        public int hashCode() {
            return this.f39198a.hashCode();
        }

        public String toString() {
            return this.f39198a;
        }
    }

    /* JADX INFO: renamed from: k1.h$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
    }

    public abstract Map a();

    public abstract boolean b(a aVar);

    public abstract Object c(a aVar);

    public final C4781d d() {
        return new C4781d(Q.w(a()), false);
    }

    public final AbstractC4785h e() {
        return new C4781d(Q.w(a()), true);
    }
}
