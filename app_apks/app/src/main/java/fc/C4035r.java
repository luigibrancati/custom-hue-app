package fc;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: fc.r, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4035r implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f34274b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f34275a;

    /* JADX INFO: renamed from: fc.r$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: fc.r$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f34276a;

        public b(Throwable exception) {
            AbstractC4862t.e(exception, "exception");
            this.f34276a = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && AbstractC4862t.a(this.f34276a, ((b) obj).f34276a);
        }

        public int hashCode() {
            return this.f34276a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f34276a + ')';
        }
    }

    public /* synthetic */ C4035r(Object obj) {
        this.f34275a = obj;
    }

    public static final /* synthetic */ C4035r a(Object obj) {
        return new C4035r(obj);
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof C4035r) && AbstractC4862t.a(obj, ((C4035r) obj2).j());
    }

    public static final boolean d(Object obj, Object obj2) {
        return AbstractC4862t.a(obj, obj2);
    }

    public static final Throwable e(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f34276a;
        }
        return null;
    }

    public static int f(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean g(Object obj) {
        return obj instanceof b;
    }

    public static final boolean h(Object obj) {
        return !(obj instanceof b);
    }

    public static String i(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f34275a, obj);
    }

    public int hashCode() {
        return f(this.f34275a);
    }

    public final /* synthetic */ Object j() {
        return this.f34275a;
    }

    public String toString() {
        return i(this.f34275a);
    }

    public static Object b(Object obj) {
        return obj;
    }
}
