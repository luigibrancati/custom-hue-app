package j1;

import androidx.datastore.preferences.protobuf.AbstractC2700f;
import androidx.datastore.preferences.protobuf.AbstractC2713t;
import androidx.datastore.preferences.protobuf.L;
import androidx.datastore.preferences.protobuf.T;
import j1.i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractC2713t implements L {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final j DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile T PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC2713t.a implements L {
        public /* synthetic */ a(AbstractC4675g abstractC4675g) {
            this();
        }

        public a A(String str) {
            p();
            ((j) this.f22904b).k0(str);
            return this;
        }

        public a B(i.a aVar) {
            p();
            ((j) this.f22904b).l0((i) aVar.m());
            return this;
        }

        public a u(boolean z10) {
            p();
            ((j) this.f22904b).e0(z10);
            return this;
        }

        public a v(AbstractC2700f abstractC2700f) {
            p();
            ((j) this.f22904b).f0(abstractC2700f);
            return this;
        }

        public a w(double d10) {
            p();
            ((j) this.f22904b).g0(d10);
            return this;
        }

        public a x(float f10) {
            p();
            ((j) this.f22904b).h0(f10);
            return this;
        }

        public a y(int i10) {
            p();
            ((j) this.f22904b).i0(i10);
            return this;
        }

        public a z(long j10) {
            p();
            ((j) this.f22904b).j0(j10);
            return this;
        }

        public a() {
            super(j.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        BYTES(8),
        VALUE_NOT_SET(0);

        private final int value;

        b(int i10) {
            this.value = i10;
        }

        public static b b(int i10) {
            switch (i10) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                case 8:
                    return BYTES;
                default:
                    return null;
            }
        }
    }

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        AbstractC2713t.I(j.class, jVar);
    }

    public static j V() {
        return DEFAULT_INSTANCE;
    }

    public static a d0() {
        return (a) DEFAULT_INSTANCE.o();
    }

    public boolean T() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public AbstractC2700f U() {
        return this.valueCase_ == 8 ? (AbstractC2700f) this.value_ : AbstractC2700f.f22793b;
    }

    public double W() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float X() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int Y() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long Z() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public String a0() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public i b0() {
        return this.valueCase_ == 6 ? (i) this.value_ : i.O();
    }

    public b c0() {
        return b.b(this.valueCase_);
    }

    public final void e0(boolean z10) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z10);
    }

    public final void f0(AbstractC2700f abstractC2700f) {
        abstractC2700f.getClass();
        this.valueCase_ = 8;
        this.value_ = abstractC2700f;
    }

    public final void g0(double d10) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d10);
    }

    public final void h0(float f10) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f10);
    }

    public final void i0(int i10) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i10);
    }

    public final void j0(long j10) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j10);
    }

    public final void k0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    public final void l0(i iVar) {
        iVar.getClass();
        this.value_ = iVar;
        this.valueCase_ = 6;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2713t
    public final Object r(AbstractC2713t.e eVar, Object obj, Object obj2) {
        T bVar;
        int i10 = AbstractC4675g.f38933a[eVar.ordinal()];
        AbstractC4675g abstractC4675g = null;
        switch (i10) {
            case 1:
                return new j();
            case 2:
                return new a(abstractC4675g);
            case 3:
                return AbstractC2713t.E(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", i.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                T t10 = PARSER;
                if (t10 != null) {
                    return t10;
                }
                synchronized (j.class) {
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
