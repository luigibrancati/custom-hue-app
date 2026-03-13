package y1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: y1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6382a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0671a f48333b = new C0671a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f48334a = new LinkedHashMap();

    /* JADX INFO: renamed from: y1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0671a {
        public /* synthetic */ C0671a(AbstractC4854k abstractC4854k) {
            this();
        }

        public C0671a() {
        }
    }

    /* JADX INFO: renamed from: y1.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC6382a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f48335c = new b();

        @Override // y1.AbstractC6382a
        public Object a(c key) {
            AbstractC4862t.e(key, "key");
            return null;
        }
    }

    /* JADX INFO: renamed from: y1.a$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c {
    }

    public abstract Object a(c cVar);

    public final Map b() {
        return this.f48334a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC6382a) && AbstractC4862t.a(this.f48334a, ((AbstractC6382a) obj).f48334a);
    }

    public int hashCode() {
        return this.f48334a.hashCode();
    }

    public String toString() {
        return "CreationExtras(extras=" + this.f48334a + ')';
    }
}
