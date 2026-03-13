package e8;

import com.google.crypto.tink.shaded.protobuf.AbstractC3654a;
import com.google.crypto.tink.shaded.protobuf.AbstractC3661h;
import com.google.crypto.tink.shaded.protobuf.AbstractC3676x;
import com.google.crypto.tink.shaded.protobuf.C3669p;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.S;
import com.google.crypto.tink.shaded.protobuf.Z;

/* JADX INFO: renamed from: e8.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3957d extends AbstractC3676x implements S {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final C3957d DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile Z PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C3959f aesCtrKey_;
    private int bitField0_;
    private v hmacKey_;
    private int version_;

    /* JADX INFO: renamed from: e8.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33820a;

        static {
            int[] iArr = new int[AbstractC3676x.e.values().length];
            f33820a = iArr;
            try {
                iArr[AbstractC3676x.e.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33820a[AbstractC3676x.e.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33820a[AbstractC3676x.e.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33820a[AbstractC3676x.e.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33820a[AbstractC3676x.e.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33820a[AbstractC3676x.e.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33820a[AbstractC3676x.e.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: e8.d$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC3676x.a implements S {
        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Q.a
        public /* bridge */ /* synthetic */ Q buildPartial() {
            return super.j();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3654a.AbstractC0368a
        public /* bridge */ /* synthetic */ Object clone() {
            return super.m();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3654a.AbstractC0368a
        /* JADX INFO: renamed from: e */
        public /* bridge */ /* synthetic */ AbstractC3654a.AbstractC0368a clone() {
            return super.m();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.S
        public /* bridge */ /* synthetic */ Q getDefaultInstanceForType() {
            return super.p();
        }

        public b t(C3959f c3959f) {
            n();
            ((C3957d) this.f31575b).X(c3959f);
            return this;
        }

        public b u(v vVar) {
            n();
            ((C3957d) this.f31575b).Y(vVar);
            return this;
        }

        public b() {
            super(C3957d.DEFAULT_INSTANCE);
        }
    }

    static {
        C3957d c3957d = new C3957d();
        DEFAULT_INSTANCE = c3957d;
        AbstractC3676x.L(C3957d.class, c3957d);
    }

    public static b U() {
        return (b) DEFAULT_INSTANCE.o();
    }

    public static C3957d V(AbstractC3661h abstractC3661h, C3669p c3669p) {
        return (C3957d) AbstractC3676x.F(DEFAULT_INSTANCE, abstractC3661h, c3669p);
    }

    public static Z W() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public C3959f R() {
        C3959f c3959f = this.aesCtrKey_;
        return c3959f == null ? C3959f.R() : c3959f;
    }

    public v S() {
        v vVar = this.hmacKey_;
        return vVar == null ? v.R() : vVar;
    }

    public int T() {
        return this.version_;
    }

    public final void X(C3959f c3959f) {
        c3959f.getClass();
        this.aesCtrKey_ = c3959f;
        this.bitField0_ |= 1;
    }

    public final void Y(v vVar) {
        vVar.getClass();
        this.hmacKey_ = vVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3676x, com.google.crypto.tink.shaded.protobuf.S
    public /* bridge */ /* synthetic */ Q getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3676x, com.google.crypto.tink.shaded.protobuf.Q
    public /* bridge */ /* synthetic */ Q.a newBuilderForType() {
        return super.newBuilderForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3676x
    public final Object q(AbstractC3676x.e eVar, Object obj, Object obj2) {
        Z bVar;
        int i10 = a.f33820a[eVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new C3957d();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC3676x.D(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "version_", "aesCtrKey_", "hmacKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Z z10 = PARSER;
                if (z10 != null) {
                    return z10;
                }
                synchronized (C3957d.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new AbstractC3676x.b(DEFAULT_INSTANCE);
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
            default:
                throw null;
        }
    }
}
