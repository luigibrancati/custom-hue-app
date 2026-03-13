package j1;

import androidx.datastore.preferences.protobuf.AbstractC2713t;
import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.E;
import androidx.datastore.preferences.protobuf.L;
import androidx.datastore.preferences.protobuf.T;
import androidx.datastore.preferences.protobuf.l0;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: j1.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4676h extends AbstractC2713t implements L {
    private static final C4676h DEFAULT_INSTANCE;
    private static volatile T PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private E preferences_ = E.i();

    /* JADX INFO: renamed from: j1.h$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC2713t.a implements L {
        public /* synthetic */ a(AbstractC4675g abstractC4675g) {
            this();
        }

        public a u(String str, j jVar) {
            str.getClass();
            jVar.getClass();
            p();
            ((C4676h) this.f22904b).M().put(str, jVar);
            return this;
        }

        public a() {
            super(C4676h.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: j1.h$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final D f38934a = D.d(l0.b.STRING, "", l0.b.MESSAGE, j.V());
    }

    static {
        C4676h c4676h = new C4676h();
        DEFAULT_INSTANCE = c4676h;
        AbstractC2713t.I(C4676h.class, c4676h);
    }

    public static a Q() {
        return (a) DEFAULT_INSTANCE.o();
    }

    public static C4676h R(InputStream inputStream) {
        return (C4676h) AbstractC2713t.G(DEFAULT_INSTANCE, inputStream);
    }

    public final Map M() {
        return O();
    }

    public Map N() {
        return Collections.unmodifiableMap(P());
    }

    public final E O() {
        if (!this.preferences_.o()) {
            this.preferences_ = this.preferences_.r();
        }
        return this.preferences_;
    }

    public final E P() {
        return this.preferences_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2713t
    public final Object r(AbstractC2713t.e eVar, Object obj, Object obj2) {
        T bVar;
        int i10 = AbstractC4675g.f38933a[eVar.ordinal()];
        AbstractC4675g abstractC4675g = null;
        switch (i10) {
            case 1:
                return new C4676h();
            case 2:
                return new a(abstractC4675g);
            case 3:
                return AbstractC2713t.E(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f38934a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                T t10 = PARSER;
                if (t10 != null) {
                    return t10;
                }
                synchronized (C4676h.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new AbstractC2713t.b(DEFAULT_INSTANCE);
                            PARSER = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
