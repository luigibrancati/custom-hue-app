package Td;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f16409b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f16410c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16411a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f16412a;

        public a(Throwable th) {
            this.f16412a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && AbstractC4862t.a(this.f16412a, ((a) obj).f16412a);
        }

        public int hashCode() {
            Throwable th = this.f16412a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // Td.k.c
        public String toString() {
            return "Closed(" + this.f16412a + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public final Object a(Throwable th) {
            return k.c(new a(th));
        }

        public final Object b() {
            return k.c(k.f16410c);
        }

        public final Object c(Object obj) {
            return k.c(obj);
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    public /* synthetic */ k(Object obj) {
        this.f16411a = obj;
    }

    public static final /* synthetic */ k b(Object obj) {
        return new k(obj);
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof k) && AbstractC4862t.a(obj, ((k) obj2).l());
    }

    public static final Throwable e(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f16412a;
        }
        return null;
    }

    public static final Object f(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj instanceof a;
    }

    public static final boolean i(Object obj) {
        return obj instanceof c;
    }

    public static final boolean j(Object obj) {
        return !(obj instanceof c);
    }

    public static String k(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f16411a, obj);
    }

    public int hashCode() {
        return g(this.f16411a);
    }

    public final /* synthetic */ Object l() {
        return this.f16411a;
    }

    public String toString() {
        return k(this.f16411a);
    }

    public static Object c(Object obj) {
        return obj;
    }
}
