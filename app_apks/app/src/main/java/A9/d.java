package A9;

import java.sql.Date;
import java.sql.Timestamp;
import u9.x;
import x9.C6331c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C6331c.b f256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C6331c.b f257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x f259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x f260f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends C6331c.b {
        public a(Class cls) {
            super(cls);
        }

        @Override // x9.C6331c.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Date d(java.util.Date date) {
            return new Date(date.getTime());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends C6331c.b {
        public b(Class cls) {
            super(cls);
        }

        @Override // x9.C6331c.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Timestamp d(java.util.Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f255a = z10;
        if (z10) {
            f256b = new a(Date.class);
            f257c = new b(Timestamp.class);
            f258d = A9.a.f249b;
            f259e = A9.b.f251b;
            f260f = c.f253b;
            return;
        }
        f256b = null;
        f257c = null;
        f258d = null;
        f259e = null;
        f260f = null;
    }
}
