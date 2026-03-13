package e8;

import com.google.crypto.tink.shaded.protobuf.AbstractC3654a;
import com.google.crypto.tink.shaded.protobuf.AbstractC3661h;
import com.google.crypto.tink.shaded.protobuf.AbstractC3676x;
import com.google.crypto.tink.shaded.protobuf.C3669p;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.S;
import com.google.crypto.tink.shaded.protobuf.Z;

/* JADX INFO: renamed from: e8.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3950A extends AbstractC3676x implements S {
    private static final C3950A DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile Z PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private AbstractC3661h value_ = AbstractC3661h.f31448b;

    /* JADX INFO: renamed from: e8.A$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33803a;

        static {
            int[] iArr = new int[AbstractC3676x.e.values().length];
            f33803a = iArr;
            try {
                iArr[AbstractC3676x.e.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33803a[AbstractC3676x.e.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33803a[AbstractC3676x.e.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33803a[AbstractC3676x.e.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33803a[AbstractC3676x.e.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33803a[AbstractC3676x.e.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33803a[AbstractC3676x.e.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: e8.A$b */
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

        public b t(I i10) {
            n();
            ((C3950A) this.f31575b).Z(i10);
            return this;
        }

        public b u(String str) {
            n();
            ((C3950A) this.f31575b).a0(str);
            return this;
        }

        public b v(AbstractC3661h abstractC3661h) {
            n();
            ((C3950A) this.f31575b).b0(abstractC3661h);
            return this;
        }

        public b() {
            super(C3950A.DEFAULT_INSTANCE);
        }
    }

    static {
        C3950A c3950a = new C3950A();
        DEFAULT_INSTANCE = c3950a;
        AbstractC3676x.L(C3950A.class, c3950a);
    }

    public static C3950A S() {
        return DEFAULT_INSTANCE;
    }

    public static b W() {
        return (b) DEFAULT_INSTANCE.o();
    }

    public static b X(C3950A c3950a) {
        return (b) DEFAULT_INSTANCE.p(c3950a);
    }

    public static C3950A Y(byte[] bArr, C3669p c3669p) {
        return (C3950A) AbstractC3676x.H(DEFAULT_INSTANCE, bArr, c3669p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(AbstractC3661h abstractC3661h) {
        abstractC3661h.getClass();
        this.value_ = abstractC3661h;
    }

    public I T() {
        I iB = I.b(this.outputPrefixType_);
        return iB == null ? I.UNRECOGNIZED : iB;
    }

    public String U() {
        return this.typeUrl_;
    }

    public AbstractC3661h V() {
        return this.value_;
    }

    public final void Z(I i10) {
        this.outputPrefixType_ = i10.getNumber();
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
        int i10 = a.f33803a[eVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new C3950A();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC3676x.D(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Z z10 = PARSER;
                if (z10 != null) {
                    return z10;
                }
                synchronized (C3950A.class) {
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
