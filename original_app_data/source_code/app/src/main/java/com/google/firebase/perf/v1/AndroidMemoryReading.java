package com.google.firebase.perf.v1;

import com.google.protobuf.AbstractC3722j;
import com.google.protobuf.AbstractC3724k;
import com.google.protobuf.D;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.t0;
import i9.InterfaceC4368a;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class AndroidMemoryReading extends GeneratedMessageLite implements InterfaceC4368a {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final AndroidMemoryReading DEFAULT_INSTANCE;
    private static volatile t0 PARSER = null;
    public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int usedAppJavaHeapMemoryKb_;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31871a;

        static {
            int[] iArr = new int[GeneratedMessageLite.g.values().length];
            f31871a = iArr;
            try {
                iArr[GeneratedMessageLite.g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31871a[GeneratedMessageLite.g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31871a[GeneratedMessageLite.g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31871a[GeneratedMessageLite.g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31871a[GeneratedMessageLite.g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31871a[GeneratedMessageLite.g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31871a[GeneratedMessageLite.g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends GeneratedMessageLite.b implements InterfaceC4368a {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b j(long j10) {
            copyOnWrite();
            ((AndroidMemoryReading) this.instance).setClientTimeUs(j10);
            return this;
        }

        public b m(int i10) {
            copyOnWrite();
            ((AndroidMemoryReading) this.instance).setUsedAppJavaHeapMemoryKb(i10);
            return this;
        }

        public b() {
            super(AndroidMemoryReading.DEFAULT_INSTANCE);
        }
    }

    static {
        AndroidMemoryReading androidMemoryReading = new AndroidMemoryReading();
        DEFAULT_INSTANCE = androidMemoryReading;
        GeneratedMessageLite.registerDefaultInstance(AndroidMemoryReading.class, androidMemoryReading);
    }

    private AndroidMemoryReading() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientTimeUs() {
        this.bitField0_ &= -2;
        this.clientTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsedAppJavaHeapMemoryKb() {
        this.bitField0_ &= -3;
        this.usedAppJavaHeapMemoryKb_ = 0;
    }

    public static AndroidMemoryReading getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static AndroidMemoryReading parseDelimitedFrom(InputStream inputStream) {
        return (AndroidMemoryReading) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AndroidMemoryReading parseFrom(ByteBuffer byteBuffer) {
        return (AndroidMemoryReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setUsedAppJavaHeapMemoryKb(int i10) {
        this.bitField0_ |= 2;
        this.usedAppJavaHeapMemoryKb_ = i10;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        int i10 = a.f31871a[gVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new AndroidMemoryReading();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "clientTimeUs_", "usedAppJavaHeapMemoryKb_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (AndroidMemoryReading.class) {
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

    public int getUsedAppJavaHeapMemoryKb() {
        return this.usedAppJavaHeapMemoryKb_;
    }

    public boolean hasClientTimeUs() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUsedAppJavaHeapMemoryKb() {
        return (this.bitField0_ & 2) != 0;
    }

    public static b newBuilder(AndroidMemoryReading androidMemoryReading) {
        return (b) DEFAULT_INSTANCE.createBuilder(androidMemoryReading);
    }

    public static AndroidMemoryReading parseDelimitedFrom(InputStream inputStream, D d10) {
        return (AndroidMemoryReading) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static AndroidMemoryReading parseFrom(ByteBuffer byteBuffer, D d10) {
        return (AndroidMemoryReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static AndroidMemoryReading parseFrom(AbstractC3722j abstractC3722j) {
        return (AndroidMemoryReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    public static AndroidMemoryReading parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (AndroidMemoryReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static AndroidMemoryReading parseFrom(byte[] bArr) {
        return (AndroidMemoryReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AndroidMemoryReading parseFrom(byte[] bArr, D d10) {
        return (AndroidMemoryReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static AndroidMemoryReading parseFrom(InputStream inputStream) {
        return (AndroidMemoryReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AndroidMemoryReading parseFrom(InputStream inputStream, D d10) {
        return (AndroidMemoryReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static AndroidMemoryReading parseFrom(AbstractC3724k abstractC3724k) {
        return (AndroidMemoryReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static AndroidMemoryReading parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (AndroidMemoryReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
