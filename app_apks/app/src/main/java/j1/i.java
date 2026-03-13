package j1;

import androidx.datastore.preferences.protobuf.AbstractC2695a;
import androidx.datastore.preferences.protobuf.AbstractC2713t;
import androidx.datastore.preferences.protobuf.AbstractC2714u;
import androidx.datastore.preferences.protobuf.L;
import androidx.datastore.preferences.protobuf.T;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractC2713t implements L {
    private static final i DEFAULT_INSTANCE;
    private static volatile T PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private AbstractC2714u.b strings_ = AbstractC2713t.s();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC2713t.a implements L {
        public /* synthetic */ a(AbstractC4675g abstractC4675g) {
            this();
        }

        public a u(Iterable iterable) {
            p();
            ((i) this.f22904b).M(iterable);
            return this;
        }

        public a() {
            super(i.DEFAULT_INSTANCE);
        }
    }

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        AbstractC2713t.I(i.class, iVar);
    }

    public static i O() {
        return DEFAULT_INSTANCE;
    }

    public static a Q() {
        return (a) DEFAULT_INSTANCE.o();
    }

    public final void M(Iterable iterable) {
        N();
        AbstractC2695a.b(iterable, this.strings_);
    }

    public final void N() {
        AbstractC2714u.b bVar = this.strings_;
        if (bVar.m()) {
            return;
        }
        this.strings_ = AbstractC2713t.C(bVar);
    }

    public List P() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2713t
    public final Object r(AbstractC2713t.e eVar, Object obj, Object obj2) {
        T bVar;
        int i10 = AbstractC4675g.f38933a[eVar.ordinal()];
        AbstractC4675g abstractC4675g = null;
        switch (i10) {
            case 1:
                return new i();
            case 2:
                return new a(abstractC4675g);
            case 3:
                return AbstractC2713t.E(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                T t10 = PARSER;
                if (t10 != null) {
                    return t10;
                }
                synchronized (i.class) {
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
