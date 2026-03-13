package e8;

import com.google.crypto.tink.shaded.protobuf.AbstractC3654a;
import com.google.crypto.tink.shaded.protobuf.AbstractC3676x;
import com.google.crypto.tink.shaded.protobuf.AbstractC3678z;
import com.google.crypto.tink.shaded.protobuf.C3669p;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.S;
import com.google.crypto.tink.shaded.protobuf.Z;
import e8.y;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: renamed from: e8.C, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3952C extends AbstractC3676x implements S {
    private static final C3952C DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile Z PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private AbstractC3678z.d key_ = AbstractC3676x.r();
    private int primaryKeyId_;

    /* JADX INFO: renamed from: e8.C$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33805a;

        static {
            int[] iArr = new int[AbstractC3676x.e.values().length];
            f33805a = iArr;
            try {
                iArr[AbstractC3676x.e.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33805a[AbstractC3676x.e.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33805a[AbstractC3676x.e.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33805a[AbstractC3676x.e.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33805a[AbstractC3676x.e.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33805a[AbstractC3676x.e.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33805a[AbstractC3676x.e.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: e8.C$b */
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
            ((C3952C) this.f31575b).R(cVar);
            return this;
        }

        public b u(int i10) {
            n();
            ((C3952C) this.f31575b).a0(i10);
            return this;
        }

        public b() {
            super(C3952C.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: e8.C$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends AbstractC3676x implements S {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile Z PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private int bitField0_;
        private y keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        /* JADX INFO: renamed from: e8.C$c$a */
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

            public a t(y.b bVar) {
                n();
                ((c) this.f31575b).Z((y) bVar.i());
                return this;
            }

            public a u(int i10) {
                n();
                ((c) this.f31575b).a0(i10);
                return this;
            }

            public a v(I i10) {
                n();
                ((c) this.f31575b).b0(i10);
                return this;
            }

            public a w(z zVar) {
                n();
                ((c) this.f31575b).c0(zVar);
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

        public static a Y() {
            return (a) DEFAULT_INSTANCE.o();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b0(I i10) {
            this.outputPrefixType_ = i10.getNumber();
        }

        public y T() {
            y yVar = this.keyData_;
            return yVar == null ? y.S() : yVar;
        }

        public int U() {
            return this.keyId_;
        }

        public I V() {
            I iB = I.b(this.outputPrefixType_);
            return iB == null ? I.UNRECOGNIZED : iB;
        }

        public z W() {
            z zVarB = z.b(this.status_);
            return zVarB == null ? z.UNRECOGNIZED : zVarB;
        }

        public boolean X() {
            return (this.bitField0_ & 1) != 0;
        }

        public final void Z(y yVar) {
            yVar.getClass();
            this.keyData_ = yVar;
            this.bitField0_ |= 1;
        }

        public final void a0(int i10) {
            this.keyId_ = i10;
        }

        public final void c0(z zVar) {
            this.status_ = zVar.getNumber();
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
            int i10 = a.f33805a[eVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC3676x.D(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"bitField0_", "keyData_", "status_", "keyId_", "outputPrefixType_"});
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
        C3952C c3952c = new C3952C();
        DEFAULT_INSTANCE = c3952c;
        AbstractC3676x.L(C3952C.class, c3952c);
    }

    public static b X() {
        return (b) DEFAULT_INSTANCE.o();
    }

    public static C3952C Y(InputStream inputStream, C3669p c3669p) {
        return (C3952C) AbstractC3676x.G(DEFAULT_INSTANCE, inputStream, c3669p);
    }

    public static C3952C Z(byte[] bArr, C3669p c3669p) {
        return (C3952C) AbstractC3676x.H(DEFAULT_INSTANCE, bArr, c3669p);
    }

    public final void R(c cVar) {
        cVar.getClass();
        S();
        this.key_.add(cVar);
    }

    public final void S() {
        AbstractC3678z.d dVar = this.key_;
        if (dVar.m()) {
            return;
        }
        this.key_ = AbstractC3676x.B(dVar);
    }

    public c T(int i10) {
        return (c) this.key_.get(i10);
    }

    public int U() {
        return this.key_.size();
    }

    public List V() {
        return this.key_;
    }

    public int W() {
        return this.primaryKeyId_;
    }

    public final void a0(int i10) {
        this.primaryKeyId_ = i10;
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
        int i10 = a.f33805a[eVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new C3952C();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC3676x.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Z z10 = PARSER;
                if (z10 != null) {
                    return z10;
                }
                synchronized (C3952C.class) {
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
