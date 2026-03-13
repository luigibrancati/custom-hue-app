package e8;

import com.google.crypto.tink.shaded.protobuf.AbstractC3654a;
import com.google.crypto.tink.shaded.protobuf.AbstractC3676x;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.S;
import com.google.crypto.tink.shaded.protobuf.Z;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class M extends AbstractC3676x implements S {
    private static final M DEFAULT_INSTANCE;
    private static volatile Z PARSER = null;
    public static final int SALT_SIZE_FIELD_NUMBER = 1;
    private int saltSize_;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33814a;

        static {
            int[] iArr = new int[AbstractC3676x.e.values().length];
            f33814a = iArr;
            try {
                iArr[AbstractC3676x.e.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33814a[AbstractC3676x.e.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33814a[AbstractC3676x.e.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33814a[AbstractC3676x.e.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33814a[AbstractC3676x.e.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33814a[AbstractC3676x.e.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33814a[AbstractC3676x.e.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

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

        public b t(int i10) {
            n();
            ((M) this.f31575b).T(i10);
            return this;
        }

        public b() {
            super(M.DEFAULT_INSTANCE);
        }
    }

    static {
        M m10 = new M();
        DEFAULT_INSTANCE = m10;
        AbstractC3676x.L(M.class, m10);
    }

    public static M Q() {
        return DEFAULT_INSTANCE;
    }

    public static b S() {
        return (b) DEFAULT_INSTANCE.o();
    }

    public int R() {
        return this.saltSize_;
    }

    public final void T(int i10) {
        this.saltSize_ = i10;
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
        int i10 = a.f33814a[eVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new M();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC3676x.D(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"saltSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Z z10 = PARSER;
                if (z10 != null) {
                    return z10;
                }
                synchronized (M.class) {
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
