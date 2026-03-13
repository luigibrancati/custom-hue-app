package com.google.firebase.perf.v1;

import com.google.protobuf.AbstractC3722j;
import com.google.protobuf.AbstractC3724k;
import com.google.protobuf.D;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3719h0;
import com.google.protobuf.N;
import com.google.protobuf.t0;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class TransportInfo extends GeneratedMessageLite implements InterfaceC3719h0 {
    private static final TransportInfo DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile t0 PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31889a;

        static {
            int[] iArr = new int[GeneratedMessageLite.g.values().length];
            f31889a = iArr;
            try {
                iArr[GeneratedMessageLite.g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31889a[GeneratedMessageLite.g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31889a[GeneratedMessageLite.g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31889a[GeneratedMessageLite.g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31889a[GeneratedMessageLite.g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31889a[GeneratedMessageLite.g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31889a[GeneratedMessageLite.g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends GeneratedMessageLite.b implements InterfaceC3719h0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(TransportInfo.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum c implements N.c {
        SOURCE_UNKNOWN(0),
        FL_LEGACY_V1(1);

        public static final int FL_LEGACY_V1_VALUE = 1;
        public static final int SOURCE_UNKNOWN_VALUE = 0;
        private static final N.d internalValueMap = new a();
        private final int value;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements N.d {
            @Override // com.google.protobuf.N.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c findValueByNumber(int i10) {
                return c.b(i10);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b implements N.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final N.e f31890a = new b();

            @Override // com.google.protobuf.N.e
            public boolean isInRange(int i10) {
                return c.b(i10) != null;
            }
        }

        c(int i10) {
            this.value = i10;
        }

        public static c b(int i10) {
            if (i10 == 0) {
                return SOURCE_UNKNOWN;
            }
            if (i10 != 1) {
                return null;
            }
            return FL_LEGACY_V1;
        }

        public static N.e j() {
            return b.f31890a;
        }

        @Override // com.google.protobuf.N.c
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        TransportInfo transportInfo = new TransportInfo();
        DEFAULT_INSTANCE = transportInfo;
        GeneratedMessageLite.registerDefaultInstance(TransportInfo.class, transportInfo);
    }

    private TransportInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDispatchDestination() {
        this.bitField0_ &= -2;
        this.dispatchDestination_ = 0;
    }

    public static TransportInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static TransportInfo parseDelimitedFrom(InputStream inputStream) {
        return (TransportInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TransportInfo parseFrom(ByteBuffer byteBuffer) {
        return (TransportInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDispatchDestination(c cVar) {
        this.dispatchDestination_ = cVar.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        int i10 = a.f31889a[gVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new TransportInfo();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "dispatchDestination_", c.j()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (TransportInfo.class) {
                    try {
                        cVar = PARSER;
                        if (cVar == null) {
                            cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                            PARSER = cVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return cVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public c getDispatchDestination() {
        c cVarB = c.b(this.dispatchDestination_);
        return cVarB == null ? c.SOURCE_UNKNOWN : cVarB;
    }

    public boolean hasDispatchDestination() {
        return (this.bitField0_ & 1) != 0;
    }

    public static b newBuilder(TransportInfo transportInfo) {
        return (b) DEFAULT_INSTANCE.createBuilder(transportInfo);
    }

    public static TransportInfo parseDelimitedFrom(InputStream inputStream, D d10) {
        return (TransportInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static TransportInfo parseFrom(ByteBuffer byteBuffer, D d10) {
        return (TransportInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static TransportInfo parseFrom(AbstractC3722j abstractC3722j) {
        return (TransportInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    public static TransportInfo parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (TransportInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static TransportInfo parseFrom(byte[] bArr) {
        return (TransportInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TransportInfo parseFrom(byte[] bArr, D d10) {
        return (TransportInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static TransportInfo parseFrom(InputStream inputStream) {
        return (TransportInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TransportInfo parseFrom(InputStream inputStream, D d10) {
        return (TransportInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static TransportInfo parseFrom(AbstractC3724k abstractC3724k) {
        return (TransportInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static TransportInfo parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (TransportInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
