package com.google.firebase.perf.v1;

import com.google.protobuf.AbstractC3722j;
import com.google.protobuf.AbstractC3724k;
import com.google.protobuf.D;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.t0;
import i9.c;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class CpuMetricReading extends GeneratedMessageLite implements c {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final CpuMetricReading DEFAULT_INSTANCE;
    private static volatile t0 PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31874a;

        static {
            int[] iArr = new int[GeneratedMessageLite.g.values().length];
            f31874a = iArr;
            try {
                iArr[GeneratedMessageLite.g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31874a[GeneratedMessageLite.g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31874a[GeneratedMessageLite.g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31874a[GeneratedMessageLite.g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31874a[GeneratedMessageLite.g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31874a[GeneratedMessageLite.g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31874a[GeneratedMessageLite.g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends GeneratedMessageLite.b implements c {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b j(long j10) {
            copyOnWrite();
            ((CpuMetricReading) this.instance).setClientTimeUs(j10);
            return this;
        }

        public b m(long j10) {
            copyOnWrite();
            ((CpuMetricReading) this.instance).setSystemTimeUs(j10);
            return this;
        }

        public b n(long j10) {
            copyOnWrite();
            ((CpuMetricReading) this.instance).setUserTimeUs(j10);
            return this;
        }

        public b() {
            super(CpuMetricReading.DEFAULT_INSTANCE);
        }
    }

    static {
        CpuMetricReading cpuMetricReading = new CpuMetricReading();
        DEFAULT_INSTANCE = cpuMetricReading;
        GeneratedMessageLite.registerDefaultInstance(CpuMetricReading.class, cpuMetricReading);
    }

    private CpuMetricReading() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientTimeUs() {
        this.bitField0_ &= -2;
        this.clientTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSystemTimeUs() {
        this.bitField0_ &= -5;
        this.systemTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserTimeUs() {
        this.bitField0_ &= -3;
        this.userTimeUs_ = 0L;
    }

    public static CpuMetricReading getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static CpuMetricReading parseDelimitedFrom(InputStream inputStream) {
        return (CpuMetricReading) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CpuMetricReading parseFrom(ByteBuffer byteBuffer) {
        return (CpuMetricReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientTimeUs(long j10) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemTimeUs(long j10) {
        this.bitField0_ |= 4;
        this.systemTimeUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserTimeUs(long j10) {
        this.bitField0_ |= 2;
        this.userTimeUs_ = j10;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        int i10 = a.f31874a[gVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new CpuMetricReading();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (CpuMetricReading.class) {
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

    public long getClientTimeUs() {
        return this.clientTimeUs_;
    }

    public long getSystemTimeUs() {
        return this.systemTimeUs_;
    }

    public long getUserTimeUs() {
        return this.userTimeUs_;
    }

    public boolean hasClientTimeUs() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSystemTimeUs() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasUserTimeUs() {
        return (this.bitField0_ & 2) != 0;
    }

    public static b newBuilder(CpuMetricReading cpuMetricReading) {
        return (b) DEFAULT_INSTANCE.createBuilder(cpuMetricReading);
    }

    public static CpuMetricReading parseDelimitedFrom(InputStream inputStream, D d10) {
        return (CpuMetricReading) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static CpuMetricReading parseFrom(ByteBuffer byteBuffer, D d10) {
        return (CpuMetricReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static CpuMetricReading parseFrom(AbstractC3722j abstractC3722j) {
        return (CpuMetricReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    public static CpuMetricReading parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (CpuMetricReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static CpuMetricReading parseFrom(byte[] bArr) {
        return (CpuMetricReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CpuMetricReading parseFrom(byte[] bArr, D d10) {
        return (CpuMetricReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static CpuMetricReading parseFrom(InputStream inputStream) {
        return (CpuMetricReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CpuMetricReading parseFrom(InputStream inputStream, D d10) {
        return (CpuMetricReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static CpuMetricReading parseFrom(AbstractC3724k abstractC3724k) {
        return (CpuMetricReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static CpuMetricReading parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (CpuMetricReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
