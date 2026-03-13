package J7;

import J7.u;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class u {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements t, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public transient Object f6310a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t f6311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile transient boolean f6312c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public transient Object f6313d;

        public a(t tVar) {
            this.f6311b = (t) n.j(tVar);
        }

        @Override // J7.t
        public Object get() {
            if (!this.f6312c) {
                synchronized (this.f6310a) {
                    try {
                        if (!this.f6312c) {
                            Object obj = this.f6311b.get();
                            this.f6313d = obj;
                            this.f6312c = true;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return i.a(this.f6313d);
        }

        public String toString() {
            Object obj;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (this.f6312c) {
                obj = "<supplier that returned " + this.f6313d + ">";
            } else {
                obj = this.f6311b;
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b implements t {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final t f6314d = new t() { // from class: J7.v
            @Override // J7.t
            public final Object get() {
                return u.b.a();
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f6315a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile t f6316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f6317c;

        public b(t tVar) {
            this.f6316b = (t) n.j(tVar);
        }

        public static /* synthetic */ Void a() {
            throw new IllegalStateException();
        }

        @Override // J7.t
        public Object get() {
            t tVar = this.f6316b;
            t tVar2 = f6314d;
            if (tVar != tVar2) {
                synchronized (this.f6315a) {
                    try {
                        if (this.f6316b != tVar2) {
                            Object obj = this.f6316b.get();
                            this.f6317c = obj;
                            this.f6316b = tVar2;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return i.a(this.f6317c);
        }

        public String toString() {
            Object obj = this.f6316b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (obj == f6314d) {
                obj = "<supplier that returned " + this.f6317c + ">";
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c implements t, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f6318a;

        public c(Object obj) {
            this.f6318a = obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return j.a(this.f6318a, ((c) obj).f6318a);
            }
            return false;
        }

        @Override // J7.t
        public Object get() {
            return this.f6318a;
        }

        public int hashCode() {
            return j.b(this.f6318a);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.f6318a + ")";
        }
    }

    public static t a(t tVar) {
        return ((tVar instanceof b) || (tVar instanceof a)) ? tVar : tVar instanceof Serializable ? new a(tVar) : new b(tVar);
    }

    public static t b(Object obj) {
        return new c(obj);
    }
}
