package e8;

import com.google.crypto.tink.shaded.protobuf.AbstractC3654a;
import com.google.crypto.tink.shaded.protobuf.AbstractC3661h;
import com.google.crypto.tink.shaded.protobuf.AbstractC3676x;
import com.google.crypto.tink.shaded.protobuf.C3669p;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.S;
import com.google.crypto.tink.shaded.protobuf.Z;

/* JADX INFO: renamed from: e8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3955b extends AbstractC3676x implements S {
    private static final C3955b DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Z PARSER;
    private int bitField0_;
    private int keySize_;
    private C3956c params_;

    /* JADX INFO: renamed from: e8.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33818a;

        static {
            int[] iArr = new int[AbstractC3676x.e.values().length];
            f33818a = iArr;
            try {
                iArr[AbstractC3676x.e.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33818a[AbstractC3676x.e.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33818a[AbstractC3676x.e.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33818a[AbstractC3676x.e.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33818a[AbstractC3676x.e.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33818a[AbstractC3676x.e.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33818a[AbstractC3676x.e.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: e8.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0426b extends AbstractC3676x.a implements S {
        public /* synthetic */ C0426b(a aVar) {
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

        public C0426b t(int i10) {
            n();
            ((C3955b) this.f31575b).V(i10);
            return this;
        }

        public C0426b u(C3956c c3956c) {
            n();
            ((C3955b) this.f31575b).W(c3956c);
            return this;
        }

        public C0426b() {
            super(C3955b.DEFAULT_INSTANCE);
        }
    }

    static {
        C3955b c3955b = new C3955b();
        DEFAULT_INSTANCE = c3955b;
        AbstractC3676x.L(C3955b.class, c3955b);
    }

    public static C0426b T() {
        return (C0426b) DEFAULT_INSTANCE.o();
    }

    public static C3955b U(AbstractC3661h abstractC3661h, C3669p c3669p) {
        return (C3955b) AbstractC3676x.F(DEFAULT_INSTANCE, abstractC3661h, c3669p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(C3956c c3956c) {
        c3956c.getClass();
        this.params_ = c3956c;
        this.bitField0_ |= 1;
    }

    public int R() {
        return this.keySize_;
    }

    public C3956c S() {
        C3956c c3956c = this.params_;
        return c3956c == null ? C3956c.Q() : c3956c;
    }

    public final void V(int i10) {
        this.keySize_ = i10;
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
        int i10 = a.f33818a[eVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new C3955b();
            case 2:
                return new C0426b(aVar);
            case 3:
                return AbstractC3676x.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "keySize_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Z z10 = PARSER;
                if (z10 != null) {
                    return z10;
                }
                synchronized (C3955b.class) {
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
