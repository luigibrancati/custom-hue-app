package com.google.firebase.perf.v1;

import com.google.protobuf.AbstractC3722j;
import com.google.protobuf.AbstractC3724k;
import com.google.protobuf.D;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3719h0;
import com.google.protobuf.t0;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class GaugeMetadata extends GeneratedMessageLite implements InterfaceC3719h0 {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    private static final GaugeMetadata DEFAULT_INSTANCE;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile t0 PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_ = "";

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31875a;

        static {
            int[] iArr = new int[GeneratedMessageLite.g.values().length];
            f31875a = iArr;
            try {
                iArr[GeneratedMessageLite.g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31875a[GeneratedMessageLite.g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31875a[GeneratedMessageLite.g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31875a[GeneratedMessageLite.g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31875a[GeneratedMessageLite.g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31875a[GeneratedMessageLite.g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31875a[GeneratedMessageLite.g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends GeneratedMessageLite.b implements InterfaceC3719h0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b j(int i10) {
            copyOnWrite();
            ((GaugeMetadata) this.instance).setDeviceRamSizeKb(i10);
            return this;
        }

        public b m(int i10) {
            copyOnWrite();
            ((GaugeMetadata) this.instance).setMaxAppJavaHeapMemoryKb(i10);
            return this;
        }

        public b n(int i10) {
            copyOnWrite();
            ((GaugeMetadata) this.instance).setMaxEncouragedAppJavaHeapMemoryKb(i10);
            return this;
        }

        public b() {
            super(GaugeMetadata.DEFAULT_INSTANCE);
        }
    }

    static {
        GaugeMetadata gaugeMetadata = new GaugeMetadata();
        DEFAULT_INSTANCE = gaugeMetadata;
        GeneratedMessageLite.registerDefaultInstance(GaugeMetadata.class, gaugeMetadata);
    }

    private GaugeMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCpuClockRateKhz() {
        this.bitField0_ &= -3;
        this.cpuClockRateKhz_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCpuProcessorCount() {
        this.bitField0_ &= -5;
        this.cpuProcessorCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceRamSizeKb() {
        this.bitField0_ &= -9;
        this.deviceRamSizeKb_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxAppJavaHeapMemoryKb() {
        this.bitField0_ &= -17;
        this.maxAppJavaHeapMemoryKb_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxEncouragedAppJavaHeapMemoryKb() {
        this.bitField0_ &= -33;
        this.maxEncouragedAppJavaHeapMemoryKb_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProcessName() {
        this.bitField0_ &= -2;
        this.processName_ = getDefaultInstance().getProcessName();
    }

    public static GaugeMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static GaugeMetadata parseDelimitedFrom(InputStream inputStream) {
        return (GaugeMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GaugeMetadata parseFrom(ByteBuffer byteBuffer) {
        return (GaugeMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCpuClockRateKhz(int i10) {
        this.bitField0_ |= 2;
        this.cpuClockRateKhz_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCpuProcessorCount(int i10) {
        this.bitField0_ |= 4;
        this.cpuProcessorCount_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceRamSizeKb(int i10) {
        this.bitField0_ |= 8;
        this.deviceRamSizeKb_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxAppJavaHeapMemoryKb(int i10) {
        this.bitField0_ |= 16;
        this.maxAppJavaHeapMemoryKb_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxEncouragedAppJavaHeapMemoryKb(int i10) {
        this.bitField0_ |= 32;
        this.maxEncouragedAppJavaHeapMemoryKb_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProcessName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.processName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProcessNameBytes(AbstractC3722j abstractC3722j) {
        this.processName_ = abstractC3722j.J();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        int i10 = a.f31875a[gVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new GaugeMetadata();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (GaugeMetadata.class) {
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

    public int getCpuClockRateKhz() {
        return this.cpuClockRateKhz_;
    }

    public int getCpuProcessorCount() {
        return this.cpuProcessorCount_;
    }

    public int getDeviceRamSizeKb() {
        return this.deviceRamSizeKb_;
    }

    public int getMaxAppJavaHeapMemoryKb() {
        return this.maxAppJavaHeapMemoryKb_;
    }

    public int getMaxEncouragedAppJavaHeapMemoryKb() {
        return this.maxEncouragedAppJavaHeapMemoryKb_;
    }

    @Deprecated
    public String getProcessName() {
        return this.processName_;
    }

    @Deprecated
    public AbstractC3722j getProcessNameBytes() {
        return AbstractC3722j.n(this.processName_);
    }

    public boolean hasCpuClockRateKhz() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasCpuProcessorCount() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasDeviceRamSizeKb() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasMaxAppJavaHeapMemoryKb() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasMaxEncouragedAppJavaHeapMemoryKb() {
        return (this.bitField0_ & 32) != 0;
    }

    @Deprecated
    public boolean hasProcessName() {
        return (this.bitField0_ & 1) != 0;
    }

    public static b newBuilder(GaugeMetadata gaugeMetadata) {
        return (b) DEFAULT_INSTANCE.createBuilder(gaugeMetadata);
    }

    public static GaugeMetadata parseDelimitedFrom(InputStream inputStream, D d10) {
        return (GaugeMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static GaugeMetadata parseFrom(ByteBuffer byteBuffer, D d10) {
        return (GaugeMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static GaugeMetadata parseFrom(AbstractC3722j abstractC3722j) {
        return (GaugeMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    public static GaugeMetadata parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (GaugeMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static GaugeMetadata parseFrom(byte[] bArr) {
        return (GaugeMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GaugeMetadata parseFrom(byte[] bArr, D d10) {
        return (GaugeMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static GaugeMetadata parseFrom(InputStream inputStream) {
        return (GaugeMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GaugeMetadata parseFrom(InputStream inputStream, D d10) {
        return (GaugeMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static GaugeMetadata parseFrom(AbstractC3724k abstractC3724k) {
        return (GaugeMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static GaugeMetadata parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (GaugeMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
