package com.google.rpc;

import com.google.protobuf.AbstractC3722j;
import com.google.protobuf.AbstractC3724k;
import com.google.protobuf.D;
import com.google.protobuf.Duration;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3719h0;
import com.google.protobuf.t0;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RetryInfo extends GeneratedMessageLite implements InterfaceC3719h0 {
    private static final RetryInfo DEFAULT_INSTANCE;
    private static volatile t0 PARSER = null;
    public static final int RETRY_DELAY_FIELD_NUMBER = 1;
    private int bitField0_;
    private Duration retryDelay_;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32352a;

        static {
            int[] iArr = new int[GeneratedMessageLite.g.values().length];
            f32352a = iArr;
            try {
                iArr[GeneratedMessageLite.g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32352a[GeneratedMessageLite.g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32352a[GeneratedMessageLite.g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32352a[GeneratedMessageLite.g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32352a[GeneratedMessageLite.g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32352a[GeneratedMessageLite.g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32352a[GeneratedMessageLite.g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
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
            super(RetryInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        RetryInfo retryInfo = new RetryInfo();
        DEFAULT_INSTANCE = retryInfo;
        GeneratedMessageLite.registerDefaultInstance(RetryInfo.class, retryInfo);
    }

    private RetryInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRetryDelay() {
        this.retryDelay_ = null;
        this.bitField0_ &= -2;
    }

    public static RetryInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRetryDelay(Duration duration) {
        duration.getClass();
        Duration duration2 = this.retryDelay_;
        if (duration2 == null || duration2 == Duration.getDefaultInstance()) {
            this.retryDelay_ = duration;
        } else {
            this.retryDelay_ = (Duration) ((Duration.b) Duration.newBuilder(this.retryDelay_).mergeFrom((GeneratedMessageLite) duration)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static RetryInfo parseDelimitedFrom(InputStream inputStream) {
        return (RetryInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RetryInfo parseFrom(ByteBuffer byteBuffer) {
        return (RetryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetryDelay(Duration duration) {
        duration.getClass();
        this.retryDelay_ = duration;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        int i10 = a.f32352a[gVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new RetryInfo();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "retryDelay_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (RetryInfo.class) {
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

    public Duration getRetryDelay() {
        Duration duration = this.retryDelay_;
        return duration == null ? Duration.getDefaultInstance() : duration;
    }

    public boolean hasRetryDelay() {
        return (this.bitField0_ & 1) != 0;
    }

    public static b newBuilder(RetryInfo retryInfo) {
        return (b) DEFAULT_INSTANCE.createBuilder(retryInfo);
    }

    public static RetryInfo parseDelimitedFrom(InputStream inputStream, D d10) {
        return (RetryInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static RetryInfo parseFrom(ByteBuffer byteBuffer, D d10) {
        return (RetryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static RetryInfo parseFrom(AbstractC3722j abstractC3722j) {
        return (RetryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    public static RetryInfo parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (RetryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static RetryInfo parseFrom(byte[] bArr) {
        return (RetryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RetryInfo parseFrom(byte[] bArr, D d10) {
        return (RetryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static RetryInfo parseFrom(InputStream inputStream) {
        return (RetryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RetryInfo parseFrom(InputStream inputStream, D d10) {
        return (RetryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static RetryInfo parseFrom(AbstractC3724k abstractC3724k) {
        return (RetryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static RetryInfo parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (RetryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
