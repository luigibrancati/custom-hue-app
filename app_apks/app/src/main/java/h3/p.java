package h3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k3.InterfaceC4792b;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f36223e = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f36225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f36226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f36227d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C0470a f36228h = new C0470a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f36229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f36230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f36231c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f36232d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f36233e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f36234f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f36235g;

        /* JADX INFO: renamed from: h3.p$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0470a {
            public /* synthetic */ C0470a(AbstractC4854k abstractC4854k) {
                this();
            }

            public C0470a() {
            }
        }

        public a(String name, String type, boolean z10, int i10, String str, int i11) {
            AbstractC4862t.e(name, "name");
            AbstractC4862t.e(type, "type");
            this.f36229a = name;
            this.f36230b = type;
            this.f36231c = z10;
            this.f36232d = i10;
            this.f36233e = str;
            this.f36234f = i11;
            this.f36235g = n.a(type);
        }

        public final boolean a() {
            return this.f36232d > 0;
        }

        public boolean equals(Object obj) {
            return q.c(this, obj);
        }

        public int hashCode() {
            return q.h(this);
        }

        public String toString() {
            return q.n(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public final p a(InterfaceC4792b connection, String tableName) {
            AbstractC4862t.e(connection, "connection");
            AbstractC4862t.e(tableName, "tableName");
            return n.g(connection, tableName);
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f36236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f36237b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f36238c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f36239d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f36240e;

        public c(String referenceTable, String onDelete, String onUpdate, List columnNames, List referenceColumnNames) {
            AbstractC4862t.e(referenceTable, "referenceTable");
            AbstractC4862t.e(onDelete, "onDelete");
            AbstractC4862t.e(onUpdate, "onUpdate");
            AbstractC4862t.e(columnNames, "columnNames");
            AbstractC4862t.e(referenceColumnNames, "referenceColumnNames");
            this.f36236a = referenceTable;
            this.f36237b = onDelete;
            this.f36238c = onUpdate;
            this.f36239d = columnNames;
            this.f36240e = referenceColumnNames;
        }

        public boolean equals(Object obj) {
            return q.d(this, obj);
        }

        public int hashCode() {
            return q.i(this);
        }

        public String toString() {
            return q.o(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f36241e = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f36242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f36243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f36244c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List f36245d;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a {
            public /* synthetic */ a(AbstractC4854k abstractC4854k) {
                this();
            }

            public a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
        public d(String name, boolean z10, List columns, List orders) {
            AbstractC4862t.e(name, "name");
            AbstractC4862t.e(columns, "columns");
            AbstractC4862t.e(orders, "orders");
            this.f36242a = name;
            this.f36243b = z10;
            this.f36244c = columns;
            this.f36245d = orders;
            if (orders.isEmpty()) {
                int size = columns.size();
                orders = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    orders.add("ASC");
                }
            }
            this.f36245d = orders;
        }

        public boolean equals(Object obj) {
            return q.e(this, obj);
        }

        public int hashCode() {
            return q.j(this);
        }

        public String toString() {
            return q.p(this);
        }
    }

    public p(String name, Map columns, Set foreignKeys, Set set) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(columns, "columns");
        AbstractC4862t.e(foreignKeys, "foreignKeys");
        this.f36224a = name;
        this.f36225b = columns;
        this.f36226c = foreignKeys;
        this.f36227d = set;
    }

    public boolean equals(Object obj) {
        return q.f(this, obj);
    }

    public int hashCode() {
        return q.k(this);
    }

    public String toString() {
        return q.q(this);
    }
}
