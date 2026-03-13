package e8;

import com.google.crypto.tink.shaded.protobuf.AbstractC3654a;
import com.google.crypto.tink.shaded.protobuf.AbstractC3676x;
import com.google.crypto.tink.shaded.protobuf.AbstractC3678z;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.S;
import com.google.crypto.tink.shaded.protobuf.Z;

/* JADX INFO: renamed from: e8.D, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3953D extends AbstractC3676x implements S {
    private static final C3953D DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile Z PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private AbstractC3678z.d keyInfo_ = AbstractC3676x.r();
    private int primaryKeyId_;

    /* JADX INFO: renamed from: e8.D$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33806a;

        static {
            int[] iArr = new int[AbstractC3676x.e.values().length];
            f33806a = iArr;
            try {
                iArr[AbstractC3676x.e.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33806a[AbstractC3676x.e.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33806a[AbstractC3676x.e.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33806a[AbstractC3676x.e.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33806a[AbstractC3676x.e.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33806a[AbstractC3676x.e.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33806a[AbstractC3676x.e.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: e8.D$b */
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

        public b t(c cVar) {
            n();
            ((C3953D) this.f31575b).R(cVar);
            return this;
        }

        public b u(int i10) {
            n();
            ((C3953D) this.f31575b).U(i10);
            return this;
        }

        public b() {
            super(C3953D.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: e8.D$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends AbstractC3676x implements S {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile Z PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        /* JADX INFO: renamed from: e8.D$c$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends AbstractC3676x.a implements S {
            public /* synthetic */ a(a aVar) {
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

            public a t(int i10) {
                n();
                ((c) this.f31575b).U(i10);
                return this;
            }

            public a u(I i10) {
                n();
                ((c) this.f31575b).V(i10);
                return this;
            }

            public a v(z zVar) {
                n();
                ((c) this.f31575b).W(zVar);
                return this;
            }

            public a w(String str) {
                n();
                ((c) this.f31575b).X(str);
                return this;
            }

            public a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            AbstractC3676x.L(c.class, cVar);
        }

        public static a T() {
            return (a) DEFAULT_INSTANCE.o();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void U(int i10) {
            this.keyId_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void V(I i10) {
            this.outputPrefixType_ = i10.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void W(z zVar) {
            this.status_ = zVar.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void X(String str) {
            str.getClass();
            this.typeUrl_ = str;
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
            int i10 = a.f33806a[eVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC3676x.D(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Z z10 = PARSER;
                    if (z10 != null) {
                        return z10;
                    }
                    synchronized (c.class) {
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

    static {
        C3953D c3953d = new C3953D();
        DEFAULT_INSTANCE = c3953d;
        AbstractC3676x.L(C3953D.class, c3953d);
    }

    public static b T() {
        return (b) DEFAULT_INSTANCE.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(int i10) {
        this.primaryKeyId_ = i10;
    }

    public final void R(c cVar) {
        cVar.getClass();
        S();
        this.keyInfo_.add(cVar);
    }

    public final void S() {
        AbstractC3678z.d dVar = this.keyInfo_;
        if (dVar.m()) {
            return;
        }
        this.keyInfo_ = AbstractC3676x.B(dVar);
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
        int i10 = a.f33806a[eVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new C3953D();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC3676x.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Z z10 = PARSER;
                if (z10 != null) {
                    return z10;
                }
                synchronized (C3953D.class) {
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
