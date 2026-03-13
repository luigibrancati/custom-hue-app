package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.AbstractC3704a;
import com.google.protobuf.AbstractC3722j;
import com.google.protobuf.AbstractC3724k;
import com.google.protobuf.C3705a0;
import com.google.protobuf.D;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3717g0;
import com.google.protobuf.InterfaceC3719h0;
import com.google.protobuf.N;
import com.google.protobuf.Q0;
import com.google.protobuf.Z;
import com.google.protobuf.t0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class TombstoneProtos {

    /* JADX INFO: renamed from: io.sentry.android.core.internal.tombstone.TombstoneProtos$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.g.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum Architecture implements N.c {
        ARM32(0),
        ARM64(1),
        X86(2),
        X86_64(3),
        RISCV64(4),
        NONE(5),
        UNRECOGNIZED(-1);

        public static final int ARM32_VALUE = 0;
        public static final int ARM64_VALUE = 1;
        public static final int NONE_VALUE = 5;
        public static final int RISCV64_VALUE = 4;
        public static final int X86_64_VALUE = 3;
        public static final int X86_VALUE = 2;
        private static final N.d internalValueMap = new N.d() { // from class: io.sentry.android.core.internal.tombstone.TombstoneProtos.Architecture.1
            @Override // com.google.protobuf.N.d
            public Architecture findValueByNumber(int i10) {
                return Architecture.forNumber(i10);
            }
        };
        private final int value;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class ArchitectureVerifier implements N.e {
            static final N.e INSTANCE = new ArchitectureVerifier();

            private ArchitectureVerifier() {
            }

            @Override // com.google.protobuf.N.e
            public boolean isInRange(int i10) {
                return Architecture.forNumber(i10) != null;
            }
        }

        Architecture(int i10) {
            this.value = i10;
        }

        public static Architecture forNumber(int i10) {
            if (i10 == 0) {
                return ARM32;
            }
            if (i10 == 1) {
                return ARM64;
            }
            if (i10 == 2) {
                return X86;
            }
            if (i10 == 3) {
                return X86_64;
            }
            if (i10 == 4) {
                return RISCV64;
            }
            if (i10 != 5) {
                return null;
            }
            return NONE;
        }

        public static N.d internalGetValueMap() {
            return internalValueMap;
        }

        public static N.e internalGetVerifier() {
            return ArchitectureVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.N.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static Architecture valueOf(int i10) {
            return forNumber(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class ArmMTEMetadata extends GeneratedMessageLite implements ArmMTEMetadataOrBuilder {
        private static final ArmMTEMetadata DEFAULT_INSTANCE;
        public static final int MEMORY_TAGS_FIELD_NUMBER = 1;
        private static volatile t0 PARSER;
        private AbstractC3722j memoryTags_ = AbstractC3722j.f32236b;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements ArmMTEMetadataOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearMemoryTags() {
                copyOnWrite();
                ((ArmMTEMetadata) this.instance).clearMemoryTags();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ArmMTEMetadataOrBuilder
            public AbstractC3722j getMemoryTags() {
                return ((ArmMTEMetadata) this.instance).getMemoryTags();
            }

            public Builder setMemoryTags(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((ArmMTEMetadata) this.instance).setMemoryTags(abstractC3722j);
                return this;
            }

            private Builder() {
                super(ArmMTEMetadata.DEFAULT_INSTANCE);
            }
        }

        static {
            ArmMTEMetadata armMTEMetadata = new ArmMTEMetadata();
            DEFAULT_INSTANCE = armMTEMetadata;
            GeneratedMessageLite.registerDefaultInstance(ArmMTEMetadata.class, armMTEMetadata);
        }

        private ArmMTEMetadata() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMemoryTags() {
            this.memoryTags_ = getDefaultInstance().getMemoryTags();
        }

        public static ArmMTEMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ArmMTEMetadata parseDelimitedFrom(InputStream inputStream) {
            return (ArmMTEMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ArmMTEMetadata parseFrom(ByteBuffer byteBuffer) {
            return (ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMemoryTags(AbstractC3722j abstractC3722j) {
            abstractC3722j.getClass();
            this.memoryTags_ = abstractC3722j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new ArmMTEMetadata();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"memoryTags_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (ArmMTEMetadata.class) {
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

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ArmMTEMetadataOrBuilder
        public AbstractC3722j getMemoryTags() {
            return this.memoryTags_;
        }

        public static Builder newBuilder(ArmMTEMetadata armMTEMetadata) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(armMTEMetadata);
        }

        public static ArmMTEMetadata parseDelimitedFrom(InputStream inputStream, D d10) {
            return (ArmMTEMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static ArmMTEMetadata parseFrom(ByteBuffer byteBuffer, D d10) {
            return (ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static ArmMTEMetadata parseFrom(AbstractC3722j abstractC3722j) {
            return (ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static ArmMTEMetadata parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static ArmMTEMetadata parseFrom(byte[] bArr) {
            return (ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ArmMTEMetadata parseFrom(byte[] bArr, D d10) {
            return (ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static ArmMTEMetadata parseFrom(InputStream inputStream) {
            return (ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ArmMTEMetadata parseFrom(InputStream inputStream, D d10) {
            return (ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static ArmMTEMetadata parseFrom(AbstractC3724k abstractC3724k) {
            return (ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static ArmMTEMetadata parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface ArmMTEMetadataOrBuilder extends InterfaceC3719h0 {
        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        AbstractC3722j getMemoryTags();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class BacktraceFrame extends GeneratedMessageLite implements BacktraceFrameOrBuilder {
        public static final int BUILD_ID_FIELD_NUMBER = 8;
        private static final BacktraceFrame DEFAULT_INSTANCE;
        public static final int FILE_MAP_OFFSET_FIELD_NUMBER = 7;
        public static final int FILE_NAME_FIELD_NUMBER = 6;
        public static final int FUNCTION_NAME_FIELD_NUMBER = 4;
        public static final int FUNCTION_OFFSET_FIELD_NUMBER = 5;
        private static volatile t0 PARSER = null;
        public static final int PC_FIELD_NUMBER = 2;
        public static final int REL_PC_FIELD_NUMBER = 1;
        public static final int SP_FIELD_NUMBER = 3;
        private long fileMapOffset_;
        private long functionOffset_;
        private long pc_;
        private long relPc_;
        private long sp_;
        private String functionName_ = "";
        private String fileName_ = "";
        private String buildId_ = "";

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements BacktraceFrameOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearBuildId() {
                copyOnWrite();
                ((BacktraceFrame) this.instance).clearBuildId();
                return this;
            }

            public Builder clearFileMapOffset() {
                copyOnWrite();
                ((BacktraceFrame) this.instance).clearFileMapOffset();
                return this;
            }

            public Builder clearFileName() {
                copyOnWrite();
                ((BacktraceFrame) this.instance).clearFileName();
                return this;
            }

            public Builder clearFunctionName() {
                copyOnWrite();
                ((BacktraceFrame) this.instance).clearFunctionName();
                return this;
            }

            public Builder clearFunctionOffset() {
                copyOnWrite();
                ((BacktraceFrame) this.instance).clearFunctionOffset();
                return this;
            }

            public Builder clearPc() {
                copyOnWrite();
                ((BacktraceFrame) this.instance).clearPc();
                return this;
            }

            public Builder clearRelPc() {
                copyOnWrite();
                ((BacktraceFrame) this.instance).clearRelPc();
                return this;
            }

            public Builder clearSp() {
                copyOnWrite();
                ((BacktraceFrame) this.instance).clearSp();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
            public String getBuildId() {
                return ((BacktraceFrame) this.instance).getBuildId();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
            public AbstractC3722j getBuildIdBytes() {
                return ((BacktraceFrame) this.instance).getBuildIdBytes();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
            public long getFileMapOffset() {
                return ((BacktraceFrame) this.instance).getFileMapOffset();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
            public String getFileName() {
                return ((BacktraceFrame) this.instance).getFileName();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
            public AbstractC3722j getFileNameBytes() {
                return ((BacktraceFrame) this.instance).getFileNameBytes();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
            public String getFunctionName() {
                return ((BacktraceFrame) this.instance).getFunctionName();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
            public AbstractC3722j getFunctionNameBytes() {
                return ((BacktraceFrame) this.instance).getFunctionNameBytes();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
            public long getFunctionOffset() {
                return ((BacktraceFrame) this.instance).getFunctionOffset();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
            public long getPc() {
                return ((BacktraceFrame) this.instance).getPc();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
            public long getRelPc() {
                return ((BacktraceFrame) this.instance).getRelPc();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
            public long getSp() {
                return ((BacktraceFrame) this.instance).getSp();
            }

            public Builder setBuildId(String str) {
                copyOnWrite();
                ((BacktraceFrame) this.instance).setBuildId(str);
                return this;
            }

            public Builder setBuildIdBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((BacktraceFrame) this.instance).setBuildIdBytes(abstractC3722j);
                return this;
            }

            public Builder setFileMapOffset(long j10) {
                copyOnWrite();
                ((BacktraceFrame) this.instance).setFileMapOffset(j10);
                return this;
            }

            public Builder setFileName(String str) {
                copyOnWrite();
                ((BacktraceFrame) this.instance).setFileName(str);
                return this;
            }

            public Builder setFileNameBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((BacktraceFrame) this.instance).setFileNameBytes(abstractC3722j);
                return this;
            }

            public Builder setFunctionName(String str) {
                copyOnWrite();
                ((BacktraceFrame) this.instance).setFunctionName(str);
                return this;
            }

            public Builder setFunctionNameBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((BacktraceFrame) this.instance).setFunctionNameBytes(abstractC3722j);
                return this;
            }

            public Builder setFunctionOffset(long j10) {
                copyOnWrite();
                ((BacktraceFrame) this.instance).setFunctionOffset(j10);
                return this;
            }

            public Builder setPc(long j10) {
                copyOnWrite();
                ((BacktraceFrame) this.instance).setPc(j10);
                return this;
            }

            public Builder setRelPc(long j10) {
                copyOnWrite();
                ((BacktraceFrame) this.instance).setRelPc(j10);
                return this;
            }

            public Builder setSp(long j10) {
                copyOnWrite();
                ((BacktraceFrame) this.instance).setSp(j10);
                return this;
            }

            private Builder() {
                super(BacktraceFrame.DEFAULT_INSTANCE);
            }
        }

        static {
            BacktraceFrame backtraceFrame = new BacktraceFrame();
            DEFAULT_INSTANCE = backtraceFrame;
            GeneratedMessageLite.registerDefaultInstance(BacktraceFrame.class, backtraceFrame);
        }

        private BacktraceFrame() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBuildId() {
            this.buildId_ = getDefaultInstance().getBuildId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFileMapOffset() {
            this.fileMapOffset_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFileName() {
            this.fileName_ = getDefaultInstance().getFileName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFunctionName() {
            this.functionName_ = getDefaultInstance().getFunctionName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFunctionOffset() {
            this.functionOffset_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPc() {
            this.pc_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRelPc() {
            this.relPc_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSp() {
            this.sp_ = 0L;
        }

        public static BacktraceFrame getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BacktraceFrame parseDelimitedFrom(InputStream inputStream) {
            return (BacktraceFrame) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BacktraceFrame parseFrom(ByteBuffer byteBuffer) {
            return (BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildId(String str) {
            str.getClass();
            this.buildId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildIdBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.buildId_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileMapOffset(long j10) {
            this.fileMapOffset_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileName(String str) {
            str.getClass();
            this.fileName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileNameBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.fileName_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFunctionName(String str) {
            str.getClass();
            this.functionName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFunctionNameBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.functionName_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFunctionOffset(long j10) {
            this.functionOffset_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPc(long j10) {
            this.pc_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRelPc(long j10) {
            this.relPc_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSp(long j10) {
            this.sp_ = j10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new BacktraceFrame();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0003\u0002\u0003\u0003\u0003\u0004Ȉ\u0005\u0003\u0006Ȉ\u0007\u0003\bȈ", new Object[]{"relPc_", "pc_", "sp_", "functionName_", "functionOffset_", "fileName_", "fileMapOffset_", "buildId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (BacktraceFrame.class) {
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

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
        public String getBuildId() {
            return this.buildId_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
        public AbstractC3722j getBuildIdBytes() {
            return AbstractC3722j.n(this.buildId_);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
        public long getFileMapOffset() {
            return this.fileMapOffset_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
        public String getFileName() {
            return this.fileName_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
        public AbstractC3722j getFileNameBytes() {
            return AbstractC3722j.n(this.fileName_);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
        public String getFunctionName() {
            return this.functionName_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
        public AbstractC3722j getFunctionNameBytes() {
            return AbstractC3722j.n(this.functionName_);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
        public long getFunctionOffset() {
            return this.functionOffset_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
        public long getPc() {
            return this.pc_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
        public long getRelPc() {
            return this.relPc_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
        public long getSp() {
            return this.sp_;
        }

        public static Builder newBuilder(BacktraceFrame backtraceFrame) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(backtraceFrame);
        }

        public static BacktraceFrame parseDelimitedFrom(InputStream inputStream, D d10) {
            return (BacktraceFrame) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static BacktraceFrame parseFrom(ByteBuffer byteBuffer, D d10) {
            return (BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static BacktraceFrame parseFrom(AbstractC3722j abstractC3722j) {
            return (BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static BacktraceFrame parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static BacktraceFrame parseFrom(byte[] bArr) {
            return (BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BacktraceFrame parseFrom(byte[] bArr, D d10) {
            return (BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static BacktraceFrame parseFrom(InputStream inputStream) {
            return (BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BacktraceFrame parseFrom(InputStream inputStream, D d10) {
            return (BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static BacktraceFrame parseFrom(AbstractC3724k abstractC3724k) {
            return (BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static BacktraceFrame parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface BacktraceFrameOrBuilder extends InterfaceC3719h0 {
        String getBuildId();

        AbstractC3722j getBuildIdBytes();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        long getFileMapOffset();

        String getFileName();

        AbstractC3722j getFileNameBytes();

        String getFunctionName();

        AbstractC3722j getFunctionNameBytes();

        long getFunctionOffset();

        long getPc();

        long getRelPc();

        long getSp();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Cause extends GeneratedMessageLite implements CauseOrBuilder {
        private static final Cause DEFAULT_INSTANCE;
        public static final int HUMAN_READABLE_FIELD_NUMBER = 1;
        public static final int MEMORY_ERROR_FIELD_NUMBER = 2;
        private static volatile t0 PARSER;
        private Object details_;
        private int detailsCase_ = 0;
        private String humanReadable_ = "";

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements CauseOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearDetails() {
                copyOnWrite();
                ((Cause) this.instance).clearDetails();
                return this;
            }

            public Builder clearHumanReadable() {
                copyOnWrite();
                ((Cause) this.instance).clearHumanReadable();
                return this;
            }

            public Builder clearMemoryError() {
                copyOnWrite();
                ((Cause) this.instance).clearMemoryError();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.CauseOrBuilder
            public DetailsCase getDetailsCase() {
                return ((Cause) this.instance).getDetailsCase();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.CauseOrBuilder
            public String getHumanReadable() {
                return ((Cause) this.instance).getHumanReadable();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.CauseOrBuilder
            public AbstractC3722j getHumanReadableBytes() {
                return ((Cause) this.instance).getHumanReadableBytes();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.CauseOrBuilder
            public MemoryError getMemoryError() {
                return ((Cause) this.instance).getMemoryError();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.CauseOrBuilder
            public boolean hasMemoryError() {
                return ((Cause) this.instance).hasMemoryError();
            }

            public Builder mergeMemoryError(MemoryError memoryError) {
                copyOnWrite();
                ((Cause) this.instance).mergeMemoryError(memoryError);
                return this;
            }

            public Builder setHumanReadable(String str) {
                copyOnWrite();
                ((Cause) this.instance).setHumanReadable(str);
                return this;
            }

            public Builder setHumanReadableBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((Cause) this.instance).setHumanReadableBytes(abstractC3722j);
                return this;
            }

            public Builder setMemoryError(MemoryError memoryError) {
                copyOnWrite();
                ((Cause) this.instance).setMemoryError(memoryError);
                return this;
            }

            private Builder() {
                super(Cause.DEFAULT_INSTANCE);
            }

            public Builder setMemoryError(MemoryError.Builder builder) {
                copyOnWrite();
                ((Cause) this.instance).setMemoryError((MemoryError) builder.build());
                return this;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum DetailsCase {
            MEMORY_ERROR(2),
            DETAILS_NOT_SET(0);

            private final int value;

            DetailsCase(int i10) {
                this.value = i10;
            }

            public static DetailsCase forNumber(int i10) {
                if (i10 == 0) {
                    return DETAILS_NOT_SET;
                }
                if (i10 != 2) {
                    return null;
                }
                return MEMORY_ERROR;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static DetailsCase valueOf(int i10) {
                return forNumber(i10);
            }
        }

        static {
            Cause cause = new Cause();
            DEFAULT_INSTANCE = cause;
            GeneratedMessageLite.registerDefaultInstance(Cause.class, cause);
        }

        private Cause() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDetails() {
            this.detailsCase_ = 0;
            this.details_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHumanReadable() {
            this.humanReadable_ = getDefaultInstance().getHumanReadable();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMemoryError() {
            if (this.detailsCase_ == 2) {
                this.detailsCase_ = 0;
                this.details_ = null;
            }
        }

        public static Cause getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMemoryError(MemoryError memoryError) {
            memoryError.getClass();
            if (this.detailsCase_ != 2 || this.details_ == MemoryError.getDefaultInstance()) {
                this.details_ = memoryError;
            } else {
                this.details_ = ((MemoryError.Builder) MemoryError.newBuilder((MemoryError) this.details_).mergeFrom((GeneratedMessageLite) memoryError)).buildPartial();
            }
            this.detailsCase_ = 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Cause parseDelimitedFrom(InputStream inputStream) {
            return (Cause) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Cause parseFrom(ByteBuffer byteBuffer) {
            return (Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHumanReadable(String str) {
            str.getClass();
            this.humanReadable_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHumanReadableBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.humanReadable_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMemoryError(MemoryError memoryError) {
            memoryError.getClass();
            this.details_ = memoryError;
            this.detailsCase_ = 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new Cause();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"details_", "detailsCase_", "humanReadable_", MemoryError.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (Cause.class) {
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

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.CauseOrBuilder
        public DetailsCase getDetailsCase() {
            return DetailsCase.forNumber(this.detailsCase_);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.CauseOrBuilder
        public String getHumanReadable() {
            return this.humanReadable_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.CauseOrBuilder
        public AbstractC3722j getHumanReadableBytes() {
            return AbstractC3722j.n(this.humanReadable_);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.CauseOrBuilder
        public MemoryError getMemoryError() {
            return this.detailsCase_ == 2 ? (MemoryError) this.details_ : MemoryError.getDefaultInstance();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.CauseOrBuilder
        public boolean hasMemoryError() {
            return this.detailsCase_ == 2;
        }

        public static Builder newBuilder(Cause cause) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(cause);
        }

        public static Cause parseDelimitedFrom(InputStream inputStream, D d10) {
            return (Cause) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static Cause parseFrom(ByteBuffer byteBuffer, D d10) {
            return (Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static Cause parseFrom(AbstractC3722j abstractC3722j) {
            return (Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static Cause parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static Cause parseFrom(byte[] bArr) {
            return (Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Cause parseFrom(byte[] bArr, D d10) {
            return (Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static Cause parseFrom(InputStream inputStream) {
            return (Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Cause parseFrom(InputStream inputStream, D d10) {
            return (Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static Cause parseFrom(AbstractC3724k abstractC3724k) {
            return (Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static Cause parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface CauseOrBuilder extends InterfaceC3719h0 {
        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        Cause.DetailsCase getDetailsCase();

        String getHumanReadable();

        AbstractC3722j getHumanReadableBytes();

        MemoryError getMemoryError();

        boolean hasMemoryError();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class CrashDetail extends GeneratedMessageLite implements CrashDetailOrBuilder {
        public static final int DATA_FIELD_NUMBER = 2;
        private static final CrashDetail DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile t0 PARSER;
        private AbstractC3722j data_;
        private AbstractC3722j name_;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements CrashDetailOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearData() {
                copyOnWrite();
                ((CrashDetail) this.instance).clearData();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((CrashDetail) this.instance).clearName();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.CrashDetailOrBuilder
            public AbstractC3722j getData() {
                return ((CrashDetail) this.instance).getData();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.CrashDetailOrBuilder
            public AbstractC3722j getName() {
                return ((CrashDetail) this.instance).getName();
            }

            public Builder setData(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((CrashDetail) this.instance).setData(abstractC3722j);
                return this;
            }

            public Builder setName(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((CrashDetail) this.instance).setName(abstractC3722j);
                return this;
            }

            private Builder() {
                super(CrashDetail.DEFAULT_INSTANCE);
            }
        }

        static {
            CrashDetail crashDetail = new CrashDetail();
            DEFAULT_INSTANCE = crashDetail;
            GeneratedMessageLite.registerDefaultInstance(CrashDetail.class, crashDetail);
        }

        private CrashDetail() {
            AbstractC3722j abstractC3722j = AbstractC3722j.f32236b;
            this.name_ = abstractC3722j;
            this.data_ = abstractC3722j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.data_ = getDefaultInstance().getData();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        public static CrashDetail getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static CrashDetail parseDelimitedFrom(InputStream inputStream) {
            return (CrashDetail) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CrashDetail parseFrom(ByteBuffer byteBuffer) {
            return (CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(AbstractC3722j abstractC3722j) {
            abstractC3722j.getClass();
            this.data_ = abstractC3722j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(AbstractC3722j abstractC3722j) {
            abstractC3722j.getClass();
            this.name_ = abstractC3722j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new CrashDetail();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"name_", "data_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (CrashDetail.class) {
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

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.CrashDetailOrBuilder
        public AbstractC3722j getData() {
            return this.data_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.CrashDetailOrBuilder
        public AbstractC3722j getName() {
            return this.name_;
        }

        public static Builder newBuilder(CrashDetail crashDetail) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(crashDetail);
        }

        public static CrashDetail parseDelimitedFrom(InputStream inputStream, D d10) {
            return (CrashDetail) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static CrashDetail parseFrom(ByteBuffer byteBuffer, D d10) {
            return (CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static CrashDetail parseFrom(AbstractC3722j abstractC3722j) {
            return (CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static CrashDetail parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static CrashDetail parseFrom(byte[] bArr) {
            return (CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CrashDetail parseFrom(byte[] bArr, D d10) {
            return (CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static CrashDetail parseFrom(InputStream inputStream) {
            return (CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CrashDetail parseFrom(InputStream inputStream, D d10) {
            return (CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static CrashDetail parseFrom(AbstractC3724k abstractC3724k) {
            return (CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static CrashDetail parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface CrashDetailOrBuilder extends InterfaceC3719h0 {
        AbstractC3722j getData();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        AbstractC3722j getName();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class FD extends GeneratedMessageLite implements FDOrBuilder {
        private static final FD DEFAULT_INSTANCE;
        public static final int FD_FIELD_NUMBER = 1;
        public static final int OWNER_FIELD_NUMBER = 3;
        private static volatile t0 PARSER = null;
        public static final int PATH_FIELD_NUMBER = 2;
        public static final int TAG_FIELD_NUMBER = 4;
        private int fd_;
        private long tag_;
        private String path_ = "";
        private String owner_ = "";

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements FDOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearFd() {
                copyOnWrite();
                ((FD) this.instance).clearFd();
                return this;
            }

            public Builder clearOwner() {
                copyOnWrite();
                ((FD) this.instance).clearOwner();
                return this;
            }

            public Builder clearPath() {
                copyOnWrite();
                ((FD) this.instance).clearPath();
                return this;
            }

            public Builder clearTag() {
                copyOnWrite();
                ((FD) this.instance).clearTag();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.FDOrBuilder
            public int getFd() {
                return ((FD) this.instance).getFd();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.FDOrBuilder
            public String getOwner() {
                return ((FD) this.instance).getOwner();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.FDOrBuilder
            public AbstractC3722j getOwnerBytes() {
                return ((FD) this.instance).getOwnerBytes();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.FDOrBuilder
            public String getPath() {
                return ((FD) this.instance).getPath();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.FDOrBuilder
            public AbstractC3722j getPathBytes() {
                return ((FD) this.instance).getPathBytes();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.FDOrBuilder
            public long getTag() {
                return ((FD) this.instance).getTag();
            }

            public Builder setFd(int i10) {
                copyOnWrite();
                ((FD) this.instance).setFd(i10);
                return this;
            }

            public Builder setOwner(String str) {
                copyOnWrite();
                ((FD) this.instance).setOwner(str);
                return this;
            }

            public Builder setOwnerBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((FD) this.instance).setOwnerBytes(abstractC3722j);
                return this;
            }

            public Builder setPath(String str) {
                copyOnWrite();
                ((FD) this.instance).setPath(str);
                return this;
            }

            public Builder setPathBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((FD) this.instance).setPathBytes(abstractC3722j);
                return this;
            }

            public Builder setTag(long j10) {
                copyOnWrite();
                ((FD) this.instance).setTag(j10);
                return this;
            }

            private Builder() {
                super(FD.DEFAULT_INSTANCE);
            }
        }

        static {
            FD fd2 = new FD();
            DEFAULT_INSTANCE = fd2;
            GeneratedMessageLite.registerDefaultInstance(FD.class, fd2);
        }

        private FD() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFd() {
            this.fd_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOwner() {
            this.owner_ = getDefaultInstance().getOwner();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPath() {
            this.path_ = getDefaultInstance().getPath();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTag() {
            this.tag_ = 0L;
        }

        public static FD getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FD parseDelimitedFrom(InputStream inputStream) {
            return (FD) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FD parseFrom(ByteBuffer byteBuffer) {
            return (FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFd(int i10) {
            this.fd_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwner(String str) {
            str.getClass();
            this.owner_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.owner_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPath(String str) {
            str.getClass();
            this.path_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPathBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.path_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTag(long j10) {
            this.tag_ = j10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new FD();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004\u0003", new Object[]{"fd_", "path_", "owner_", "tag_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (FD.class) {
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

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.FDOrBuilder
        public int getFd() {
            return this.fd_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.FDOrBuilder
        public String getOwner() {
            return this.owner_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.FDOrBuilder
        public AbstractC3722j getOwnerBytes() {
            return AbstractC3722j.n(this.owner_);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.FDOrBuilder
        public String getPath() {
            return this.path_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.FDOrBuilder
        public AbstractC3722j getPathBytes() {
            return AbstractC3722j.n(this.path_);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.FDOrBuilder
        public long getTag() {
            return this.tag_;
        }

        public static Builder newBuilder(FD fd2) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(fd2);
        }

        public static FD parseDelimitedFrom(InputStream inputStream, D d10) {
            return (FD) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static FD parseFrom(ByteBuffer byteBuffer, D d10) {
            return (FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static FD parseFrom(AbstractC3722j abstractC3722j) {
            return (FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static FD parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static FD parseFrom(byte[] bArr) {
            return (FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FD parseFrom(byte[] bArr, D d10) {
            return (FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static FD parseFrom(InputStream inputStream) {
            return (FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FD parseFrom(InputStream inputStream, D d10) {
            return (FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static FD parseFrom(AbstractC3724k abstractC3724k) {
            return (FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static FD parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface FDOrBuilder extends InterfaceC3719h0 {
        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        int getFd();

        String getOwner();

        AbstractC3722j getOwnerBytes();

        String getPath();

        AbstractC3722j getPathBytes();

        long getTag();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class HeapObject extends GeneratedMessageLite implements HeapObjectOrBuilder {
        public static final int ADDRESS_FIELD_NUMBER = 1;
        public static final int ALLOCATION_BACKTRACE_FIELD_NUMBER = 4;
        public static final int ALLOCATION_TID_FIELD_NUMBER = 3;
        public static final int DEALLOCATION_BACKTRACE_FIELD_NUMBER = 6;
        public static final int DEALLOCATION_TID_FIELD_NUMBER = 5;
        private static final HeapObject DEFAULT_INSTANCE;
        private static volatile t0 PARSER = null;
        public static final int SIZE_FIELD_NUMBER = 2;
        private long address_;
        private long allocationTid_;
        private long deallocationTid_;
        private long size_;
        private N.j allocationBacktrace_ = GeneratedMessageLite.emptyProtobufList();
        private N.j deallocationBacktrace_ = GeneratedMessageLite.emptyProtobufList();

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements HeapObjectOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllAllocationBacktrace(Iterable<? extends BacktraceFrame> iterable) {
                copyOnWrite();
                ((HeapObject) this.instance).addAllAllocationBacktrace(iterable);
                return this;
            }

            public Builder addAllDeallocationBacktrace(Iterable<? extends BacktraceFrame> iterable) {
                copyOnWrite();
                ((HeapObject) this.instance).addAllDeallocationBacktrace(iterable);
                return this;
            }

            public Builder addAllocationBacktrace(BacktraceFrame backtraceFrame) {
                copyOnWrite();
                ((HeapObject) this.instance).addAllocationBacktrace(backtraceFrame);
                return this;
            }

            public Builder addDeallocationBacktrace(BacktraceFrame backtraceFrame) {
                copyOnWrite();
                ((HeapObject) this.instance).addDeallocationBacktrace(backtraceFrame);
                return this;
            }

            public Builder clearAddress() {
                copyOnWrite();
                ((HeapObject) this.instance).clearAddress();
                return this;
            }

            public Builder clearAllocationBacktrace() {
                copyOnWrite();
                ((HeapObject) this.instance).clearAllocationBacktrace();
                return this;
            }

            public Builder clearAllocationTid() {
                copyOnWrite();
                ((HeapObject) this.instance).clearAllocationTid();
                return this;
            }

            public Builder clearDeallocationBacktrace() {
                copyOnWrite();
                ((HeapObject) this.instance).clearDeallocationBacktrace();
                return this;
            }

            public Builder clearDeallocationTid() {
                copyOnWrite();
                ((HeapObject) this.instance).clearDeallocationTid();
                return this;
            }

            public Builder clearSize() {
                copyOnWrite();
                ((HeapObject) this.instance).clearSize();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
            public long getAddress() {
                return ((HeapObject) this.instance).getAddress();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
            public BacktraceFrame getAllocationBacktrace(int i10) {
                return ((HeapObject) this.instance).getAllocationBacktrace(i10);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
            public int getAllocationBacktraceCount() {
                return ((HeapObject) this.instance).getAllocationBacktraceCount();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
            public List<BacktraceFrame> getAllocationBacktraceList() {
                return Collections.unmodifiableList(((HeapObject) this.instance).getAllocationBacktraceList());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
            public long getAllocationTid() {
                return ((HeapObject) this.instance).getAllocationTid();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
            public BacktraceFrame getDeallocationBacktrace(int i10) {
                return ((HeapObject) this.instance).getDeallocationBacktrace(i10);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
            public int getDeallocationBacktraceCount() {
                return ((HeapObject) this.instance).getDeallocationBacktraceCount();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
            public List<BacktraceFrame> getDeallocationBacktraceList() {
                return Collections.unmodifiableList(((HeapObject) this.instance).getDeallocationBacktraceList());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
            public long getDeallocationTid() {
                return ((HeapObject) this.instance).getDeallocationTid();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
            public long getSize() {
                return ((HeapObject) this.instance).getSize();
            }

            public Builder removeAllocationBacktrace(int i10) {
                copyOnWrite();
                ((HeapObject) this.instance).removeAllocationBacktrace(i10);
                return this;
            }

            public Builder removeDeallocationBacktrace(int i10) {
                copyOnWrite();
                ((HeapObject) this.instance).removeDeallocationBacktrace(i10);
                return this;
            }

            public Builder setAddress(long j10) {
                copyOnWrite();
                ((HeapObject) this.instance).setAddress(j10);
                return this;
            }

            public Builder setAllocationBacktrace(int i10, BacktraceFrame backtraceFrame) {
                copyOnWrite();
                ((HeapObject) this.instance).setAllocationBacktrace(i10, backtraceFrame);
                return this;
            }

            public Builder setAllocationTid(long j10) {
                copyOnWrite();
                ((HeapObject) this.instance).setAllocationTid(j10);
                return this;
            }

            public Builder setDeallocationBacktrace(int i10, BacktraceFrame backtraceFrame) {
                copyOnWrite();
                ((HeapObject) this.instance).setDeallocationBacktrace(i10, backtraceFrame);
                return this;
            }

            public Builder setDeallocationTid(long j10) {
                copyOnWrite();
                ((HeapObject) this.instance).setDeallocationTid(j10);
                return this;
            }

            public Builder setSize(long j10) {
                copyOnWrite();
                ((HeapObject) this.instance).setSize(j10);
                return this;
            }

            private Builder() {
                super(HeapObject.DEFAULT_INSTANCE);
            }

            public Builder addAllocationBacktrace(int i10, BacktraceFrame backtraceFrame) {
                copyOnWrite();
                ((HeapObject) this.instance).addAllocationBacktrace(i10, backtraceFrame);
                return this;
            }

            public Builder addDeallocationBacktrace(int i10, BacktraceFrame backtraceFrame) {
                copyOnWrite();
                ((HeapObject) this.instance).addDeallocationBacktrace(i10, backtraceFrame);
                return this;
            }

            public Builder setAllocationBacktrace(int i10, BacktraceFrame.Builder builder) {
                copyOnWrite();
                ((HeapObject) this.instance).setAllocationBacktrace(i10, (BacktraceFrame) builder.build());
                return this;
            }

            public Builder setDeallocationBacktrace(int i10, BacktraceFrame.Builder builder) {
                copyOnWrite();
                ((HeapObject) this.instance).setDeallocationBacktrace(i10, (BacktraceFrame) builder.build());
                return this;
            }

            public Builder addAllocationBacktrace(BacktraceFrame.Builder builder) {
                copyOnWrite();
                ((HeapObject) this.instance).addAllocationBacktrace((BacktraceFrame) builder.build());
                return this;
            }

            public Builder addDeallocationBacktrace(BacktraceFrame.Builder builder) {
                copyOnWrite();
                ((HeapObject) this.instance).addDeallocationBacktrace((BacktraceFrame) builder.build());
                return this;
            }

            public Builder addAllocationBacktrace(int i10, BacktraceFrame.Builder builder) {
                copyOnWrite();
                ((HeapObject) this.instance).addAllocationBacktrace(i10, (BacktraceFrame) builder.build());
                return this;
            }

            public Builder addDeallocationBacktrace(int i10, BacktraceFrame.Builder builder) {
                copyOnWrite();
                ((HeapObject) this.instance).addDeallocationBacktrace(i10, (BacktraceFrame) builder.build());
                return this;
            }
        }

        static {
            HeapObject heapObject = new HeapObject();
            DEFAULT_INSTANCE = heapObject;
            GeneratedMessageLite.registerDefaultInstance(HeapObject.class, heapObject);
        }

        private HeapObject() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAllocationBacktrace(Iterable<? extends BacktraceFrame> iterable) {
            ensureAllocationBacktraceIsMutable();
            AbstractC3704a.addAll((Iterable) iterable, (List) this.allocationBacktrace_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDeallocationBacktrace(Iterable<? extends BacktraceFrame> iterable) {
            ensureDeallocationBacktraceIsMutable();
            AbstractC3704a.addAll((Iterable) iterable, (List) this.deallocationBacktrace_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllocationBacktrace(BacktraceFrame backtraceFrame) {
            backtraceFrame.getClass();
            ensureAllocationBacktraceIsMutable();
            this.allocationBacktrace_.add(backtraceFrame);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDeallocationBacktrace(BacktraceFrame backtraceFrame) {
            backtraceFrame.getClass();
            ensureDeallocationBacktraceIsMutable();
            this.deallocationBacktrace_.add(backtraceFrame);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAddress() {
            this.address_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAllocationBacktrace() {
            this.allocationBacktrace_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAllocationTid() {
            this.allocationTid_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeallocationBacktrace() {
            this.deallocationBacktrace_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeallocationTid() {
            this.deallocationTid_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSize() {
            this.size_ = 0L;
        }

        private void ensureAllocationBacktraceIsMutable() {
            N.j jVar = this.allocationBacktrace_;
            if (jVar.m()) {
                return;
            }
            this.allocationBacktrace_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        private void ensureDeallocationBacktraceIsMutable() {
            N.j jVar = this.deallocationBacktrace_;
            if (jVar.m()) {
                return;
            }
            this.deallocationBacktrace_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        public static HeapObject getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static HeapObject parseDelimitedFrom(InputStream inputStream) {
            return (HeapObject) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeapObject parseFrom(ByteBuffer byteBuffer) {
            return (HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAllocationBacktrace(int i10) {
            ensureAllocationBacktraceIsMutable();
            this.allocationBacktrace_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeDeallocationBacktrace(int i10) {
            ensureDeallocationBacktraceIsMutable();
            this.deallocationBacktrace_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddress(long j10) {
            this.address_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAllocationBacktrace(int i10, BacktraceFrame backtraceFrame) {
            backtraceFrame.getClass();
            ensureAllocationBacktraceIsMutable();
            this.allocationBacktrace_.set(i10, backtraceFrame);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAllocationTid(long j10) {
            this.allocationTid_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeallocationBacktrace(int i10, BacktraceFrame backtraceFrame) {
            backtraceFrame.getClass();
            ensureDeallocationBacktraceIsMutable();
            this.deallocationBacktrace_.set(i10, backtraceFrame);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeallocationTid(long j10) {
            this.deallocationTid_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSize(long j10) {
            this.size_ = j10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new HeapObject();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0003\u0002\u0003\u0003\u0003\u0004\u001b\u0005\u0003\u0006\u001b", new Object[]{"address_", "size_", "allocationTid_", "allocationBacktrace_", BacktraceFrame.class, "deallocationTid_", "deallocationBacktrace_", BacktraceFrame.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (HeapObject.class) {
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

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
        public long getAddress() {
            return this.address_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
        public BacktraceFrame getAllocationBacktrace(int i10) {
            return (BacktraceFrame) this.allocationBacktrace_.get(i10);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
        public int getAllocationBacktraceCount() {
            return this.allocationBacktrace_.size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
        public List<BacktraceFrame> getAllocationBacktraceList() {
            return this.allocationBacktrace_;
        }

        public BacktraceFrameOrBuilder getAllocationBacktraceOrBuilder(int i10) {
            return (BacktraceFrameOrBuilder) this.allocationBacktrace_.get(i10);
        }

        public List<? extends BacktraceFrameOrBuilder> getAllocationBacktraceOrBuilderList() {
            return this.allocationBacktrace_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
        public long getAllocationTid() {
            return this.allocationTid_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
        public BacktraceFrame getDeallocationBacktrace(int i10) {
            return (BacktraceFrame) this.deallocationBacktrace_.get(i10);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
        public int getDeallocationBacktraceCount() {
            return this.deallocationBacktrace_.size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
        public List<BacktraceFrame> getDeallocationBacktraceList() {
            return this.deallocationBacktrace_;
        }

        public BacktraceFrameOrBuilder getDeallocationBacktraceOrBuilder(int i10) {
            return (BacktraceFrameOrBuilder) this.deallocationBacktrace_.get(i10);
        }

        public List<? extends BacktraceFrameOrBuilder> getDeallocationBacktraceOrBuilderList() {
            return this.deallocationBacktrace_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
        public long getDeallocationTid() {
            return this.deallocationTid_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
        public long getSize() {
            return this.size_;
        }

        public static Builder newBuilder(HeapObject heapObject) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(heapObject);
        }

        public static HeapObject parseDelimitedFrom(InputStream inputStream, D d10) {
            return (HeapObject) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static HeapObject parseFrom(ByteBuffer byteBuffer, D d10) {
            return (HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static HeapObject parseFrom(AbstractC3722j abstractC3722j) {
            return (HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllocationBacktrace(int i10, BacktraceFrame backtraceFrame) {
            backtraceFrame.getClass();
            ensureAllocationBacktraceIsMutable();
            this.allocationBacktrace_.add(i10, backtraceFrame);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDeallocationBacktrace(int i10, BacktraceFrame backtraceFrame) {
            backtraceFrame.getClass();
            ensureDeallocationBacktraceIsMutable();
            this.deallocationBacktrace_.add(i10, backtraceFrame);
        }

        public static HeapObject parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static HeapObject parseFrom(byte[] bArr) {
            return (HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HeapObject parseFrom(byte[] bArr, D d10) {
            return (HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static HeapObject parseFrom(InputStream inputStream) {
            return (HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeapObject parseFrom(InputStream inputStream, D d10) {
            return (HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static HeapObject parseFrom(AbstractC3724k abstractC3724k) {
            return (HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static HeapObject parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface HeapObjectOrBuilder extends InterfaceC3719h0 {
        long getAddress();

        BacktraceFrame getAllocationBacktrace(int i10);

        int getAllocationBacktraceCount();

        List<BacktraceFrame> getAllocationBacktraceList();

        long getAllocationTid();

        BacktraceFrame getDeallocationBacktrace(int i10);

        int getDeallocationBacktraceCount();

        List<BacktraceFrame> getDeallocationBacktraceList();

        long getDeallocationTid();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        long getSize();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class LogBuffer extends GeneratedMessageLite implements LogBufferOrBuilder {
        private static final LogBuffer DEFAULT_INSTANCE;
        public static final int LOGS_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile t0 PARSER;
        private String name_ = "";
        private N.j logs_ = GeneratedMessageLite.emptyProtobufList();

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements LogBufferOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllLogs(Iterable<? extends LogMessage> iterable) {
                copyOnWrite();
                ((LogBuffer) this.instance).addAllLogs(iterable);
                return this;
            }

            public Builder addLogs(LogMessage logMessage) {
                copyOnWrite();
                ((LogBuffer) this.instance).addLogs(logMessage);
                return this;
            }

            public Builder clearLogs() {
                copyOnWrite();
                ((LogBuffer) this.instance).clearLogs();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((LogBuffer) this.instance).clearName();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogBufferOrBuilder
            public LogMessage getLogs(int i10) {
                return ((LogBuffer) this.instance).getLogs(i10);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogBufferOrBuilder
            public int getLogsCount() {
                return ((LogBuffer) this.instance).getLogsCount();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogBufferOrBuilder
            public List<LogMessage> getLogsList() {
                return Collections.unmodifiableList(((LogBuffer) this.instance).getLogsList());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogBufferOrBuilder
            public String getName() {
                return ((LogBuffer) this.instance).getName();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogBufferOrBuilder
            public AbstractC3722j getNameBytes() {
                return ((LogBuffer) this.instance).getNameBytes();
            }

            public Builder removeLogs(int i10) {
                copyOnWrite();
                ((LogBuffer) this.instance).removeLogs(i10);
                return this;
            }

            public Builder setLogs(int i10, LogMessage logMessage) {
                copyOnWrite();
                ((LogBuffer) this.instance).setLogs(i10, logMessage);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((LogBuffer) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((LogBuffer) this.instance).setNameBytes(abstractC3722j);
                return this;
            }

            private Builder() {
                super(LogBuffer.DEFAULT_INSTANCE);
            }

            public Builder addLogs(int i10, LogMessage logMessage) {
                copyOnWrite();
                ((LogBuffer) this.instance).addLogs(i10, logMessage);
                return this;
            }

            public Builder setLogs(int i10, LogMessage.Builder builder) {
                copyOnWrite();
                ((LogBuffer) this.instance).setLogs(i10, (LogMessage) builder.build());
                return this;
            }

            public Builder addLogs(LogMessage.Builder builder) {
                copyOnWrite();
                ((LogBuffer) this.instance).addLogs((LogMessage) builder.build());
                return this;
            }

            public Builder addLogs(int i10, LogMessage.Builder builder) {
                copyOnWrite();
                ((LogBuffer) this.instance).addLogs(i10, (LogMessage) builder.build());
                return this;
            }
        }

        static {
            LogBuffer logBuffer = new LogBuffer();
            DEFAULT_INSTANCE = logBuffer;
            GeneratedMessageLite.registerDefaultInstance(LogBuffer.class, logBuffer);
        }

        private LogBuffer() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLogs(Iterable<? extends LogMessage> iterable) {
            ensureLogsIsMutable();
            AbstractC3704a.addAll((Iterable) iterable, (List) this.logs_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLogs(LogMessage logMessage) {
            logMessage.getClass();
            ensureLogsIsMutable();
            this.logs_.add(logMessage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLogs() {
            this.logs_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        private void ensureLogsIsMutable() {
            N.j jVar = this.logs_;
            if (jVar.m()) {
                return;
            }
            this.logs_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        public static LogBuffer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static LogBuffer parseDelimitedFrom(InputStream inputStream) {
            return (LogBuffer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LogBuffer parseFrom(ByteBuffer byteBuffer) {
            return (LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeLogs(int i10) {
            ensureLogsIsMutable();
            this.logs_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLogs(int i10, LogMessage logMessage) {
            logMessage.getClass();
            ensureLogsIsMutable();
            this.logs_.set(i10, logMessage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.name_ = abstractC3722j.J();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new LogBuffer();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"name_", "logs_", LogMessage.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (LogBuffer.class) {
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

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogBufferOrBuilder
        public LogMessage getLogs(int i10) {
            return (LogMessage) this.logs_.get(i10);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogBufferOrBuilder
        public int getLogsCount() {
            return this.logs_.size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogBufferOrBuilder
        public List<LogMessage> getLogsList() {
            return this.logs_;
        }

        public LogMessageOrBuilder getLogsOrBuilder(int i10) {
            return (LogMessageOrBuilder) this.logs_.get(i10);
        }

        public List<? extends LogMessageOrBuilder> getLogsOrBuilderList() {
            return this.logs_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogBufferOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogBufferOrBuilder
        public AbstractC3722j getNameBytes() {
            return AbstractC3722j.n(this.name_);
        }

        public static Builder newBuilder(LogBuffer logBuffer) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(logBuffer);
        }

        public static LogBuffer parseDelimitedFrom(InputStream inputStream, D d10) {
            return (LogBuffer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static LogBuffer parseFrom(ByteBuffer byteBuffer, D d10) {
            return (LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static LogBuffer parseFrom(AbstractC3722j abstractC3722j) {
            return (LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLogs(int i10, LogMessage logMessage) {
            logMessage.getClass();
            ensureLogsIsMutable();
            this.logs_.add(i10, logMessage);
        }

        public static LogBuffer parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static LogBuffer parseFrom(byte[] bArr) {
            return (LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LogBuffer parseFrom(byte[] bArr, D d10) {
            return (LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static LogBuffer parseFrom(InputStream inputStream) {
            return (LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LogBuffer parseFrom(InputStream inputStream, D d10) {
            return (LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static LogBuffer parseFrom(AbstractC3724k abstractC3724k) {
            return (LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static LogBuffer parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface LogBufferOrBuilder extends InterfaceC3719h0 {
        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        LogMessage getLogs(int i10);

        int getLogsCount();

        List<LogMessage> getLogsList();

        String getName();

        AbstractC3722j getNameBytes();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class LogMessage extends GeneratedMessageLite implements LogMessageOrBuilder {
        private static final LogMessage DEFAULT_INSTANCE;
        public static final int MESSAGE_FIELD_NUMBER = 6;
        private static volatile t0 PARSER = null;
        public static final int PID_FIELD_NUMBER = 2;
        public static final int PRIORITY_FIELD_NUMBER = 4;
        public static final int TAG_FIELD_NUMBER = 5;
        public static final int TID_FIELD_NUMBER = 3;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        private int pid_;
        private int priority_;
        private int tid_;
        private String timestamp_ = "";
        private String tag_ = "";
        private String message_ = "";

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements LogMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearMessage() {
                copyOnWrite();
                ((LogMessage) this.instance).clearMessage();
                return this;
            }

            public Builder clearPid() {
                copyOnWrite();
                ((LogMessage) this.instance).clearPid();
                return this;
            }

            public Builder clearPriority() {
                copyOnWrite();
                ((LogMessage) this.instance).clearPriority();
                return this;
            }

            public Builder clearTag() {
                copyOnWrite();
                ((LogMessage) this.instance).clearTag();
                return this;
            }

            public Builder clearTid() {
                copyOnWrite();
                ((LogMessage) this.instance).clearTid();
                return this;
            }

            public Builder clearTimestamp() {
                copyOnWrite();
                ((LogMessage) this.instance).clearTimestamp();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
            public String getMessage() {
                return ((LogMessage) this.instance).getMessage();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
            public AbstractC3722j getMessageBytes() {
                return ((LogMessage) this.instance).getMessageBytes();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
            public int getPid() {
                return ((LogMessage) this.instance).getPid();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
            public int getPriority() {
                return ((LogMessage) this.instance).getPriority();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
            public String getTag() {
                return ((LogMessage) this.instance).getTag();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
            public AbstractC3722j getTagBytes() {
                return ((LogMessage) this.instance).getTagBytes();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
            public int getTid() {
                return ((LogMessage) this.instance).getTid();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
            public String getTimestamp() {
                return ((LogMessage) this.instance).getTimestamp();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
            public AbstractC3722j getTimestampBytes() {
                return ((LogMessage) this.instance).getTimestampBytes();
            }

            public Builder setMessage(String str) {
                copyOnWrite();
                ((LogMessage) this.instance).setMessage(str);
                return this;
            }

            public Builder setMessageBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((LogMessage) this.instance).setMessageBytes(abstractC3722j);
                return this;
            }

            public Builder setPid(int i10) {
                copyOnWrite();
                ((LogMessage) this.instance).setPid(i10);
                return this;
            }

            public Builder setPriority(int i10) {
                copyOnWrite();
                ((LogMessage) this.instance).setPriority(i10);
                return this;
            }

            public Builder setTag(String str) {
                copyOnWrite();
                ((LogMessage) this.instance).setTag(str);
                return this;
            }

            public Builder setTagBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((LogMessage) this.instance).setTagBytes(abstractC3722j);
                return this;
            }

            public Builder setTid(int i10) {
                copyOnWrite();
                ((LogMessage) this.instance).setTid(i10);
                return this;
            }

            public Builder setTimestamp(String str) {
                copyOnWrite();
                ((LogMessage) this.instance).setTimestamp(str);
                return this;
            }

            public Builder setTimestampBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((LogMessage) this.instance).setTimestampBytes(abstractC3722j);
                return this;
            }

            private Builder() {
                super(LogMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            LogMessage logMessage = new LogMessage();
            DEFAULT_INSTANCE = logMessage;
            GeneratedMessageLite.registerDefaultInstance(LogMessage.class, logMessage);
        }

        private LogMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessage() {
            this.message_ = getDefaultInstance().getMessage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPid() {
            this.pid_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPriority() {
            this.priority_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTag() {
            this.tag_ = getDefaultInstance().getTag();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTid() {
            this.tid_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestamp() {
            this.timestamp_ = getDefaultInstance().getTimestamp();
        }

        public static LogMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static LogMessage parseDelimitedFrom(InputStream inputStream) {
            return (LogMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LogMessage parseFrom(ByteBuffer byteBuffer) {
            return (LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessage(String str) {
            str.getClass();
            this.message_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessageBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.message_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPid(int i10) {
            this.pid_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPriority(int i10) {
            this.priority_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTag(String str) {
            str.getClass();
            this.tag_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTagBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.tag_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTid(int i10) {
            this.tid_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamp(String str) {
            str.getClass();
            this.timestamp_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestampBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.timestamp_ = abstractC3722j.J();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new LogMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u000b\u0004\u000b\u0005Ȉ\u0006Ȉ", new Object[]{"timestamp_", "pid_", "tid_", "priority_", "tag_", "message_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (LogMessage.class) {
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

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
        public String getMessage() {
            return this.message_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
        public AbstractC3722j getMessageBytes() {
            return AbstractC3722j.n(this.message_);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
        public int getPid() {
            return this.pid_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
        public int getPriority() {
            return this.priority_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
        public String getTag() {
            return this.tag_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
        public AbstractC3722j getTagBytes() {
            return AbstractC3722j.n(this.tag_);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
        public int getTid() {
            return this.tid_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
        public String getTimestamp() {
            return this.timestamp_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
        public AbstractC3722j getTimestampBytes() {
            return AbstractC3722j.n(this.timestamp_);
        }

        public static Builder newBuilder(LogMessage logMessage) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(logMessage);
        }

        public static LogMessage parseDelimitedFrom(InputStream inputStream, D d10) {
            return (LogMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static LogMessage parseFrom(ByteBuffer byteBuffer, D d10) {
            return (LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static LogMessage parseFrom(AbstractC3722j abstractC3722j) {
            return (LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static LogMessage parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static LogMessage parseFrom(byte[] bArr) {
            return (LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LogMessage parseFrom(byte[] bArr, D d10) {
            return (LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static LogMessage parseFrom(InputStream inputStream) {
            return (LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LogMessage parseFrom(InputStream inputStream, D d10) {
            return (LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static LogMessage parseFrom(AbstractC3724k abstractC3724k) {
            return (LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static LogMessage parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface LogMessageOrBuilder extends InterfaceC3719h0 {
        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        String getMessage();

        AbstractC3722j getMessageBytes();

        int getPid();

        int getPriority();

        String getTag();

        AbstractC3722j getTagBytes();

        int getTid();

        String getTimestamp();

        AbstractC3722j getTimestampBytes();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class MemoryDump extends GeneratedMessageLite implements MemoryDumpOrBuilder {
        public static final int ARM_MTE_METADATA_FIELD_NUMBER = 6;
        public static final int BEGIN_ADDRESS_FIELD_NUMBER = 3;
        private static final MemoryDump DEFAULT_INSTANCE;
        public static final int MAPPING_NAME_FIELD_NUMBER = 2;
        public static final int MEMORY_FIELD_NUMBER = 4;
        private static volatile t0 PARSER = null;
        public static final int REGISTER_NAME_FIELD_NUMBER = 1;
        private long beginAddress_;
        private Object metadata_;
        private int metadataCase_ = 0;
        private String registerName_ = "";
        private String mappingName_ = "";
        private AbstractC3722j memory_ = AbstractC3722j.f32236b;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements MemoryDumpOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearArmMteMetadata() {
                copyOnWrite();
                ((MemoryDump) this.instance).clearArmMteMetadata();
                return this;
            }

            public Builder clearBeginAddress() {
                copyOnWrite();
                ((MemoryDump) this.instance).clearBeginAddress();
                return this;
            }

            public Builder clearMappingName() {
                copyOnWrite();
                ((MemoryDump) this.instance).clearMappingName();
                return this;
            }

            public Builder clearMemory() {
                copyOnWrite();
                ((MemoryDump) this.instance).clearMemory();
                return this;
            }

            public Builder clearMetadata() {
                copyOnWrite();
                ((MemoryDump) this.instance).clearMetadata();
                return this;
            }

            public Builder clearRegisterName() {
                copyOnWrite();
                ((MemoryDump) this.instance).clearRegisterName();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
            public ArmMTEMetadata getArmMteMetadata() {
                return ((MemoryDump) this.instance).getArmMteMetadata();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
            public long getBeginAddress() {
                return ((MemoryDump) this.instance).getBeginAddress();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
            public String getMappingName() {
                return ((MemoryDump) this.instance).getMappingName();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
            public AbstractC3722j getMappingNameBytes() {
                return ((MemoryDump) this.instance).getMappingNameBytes();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
            public AbstractC3722j getMemory() {
                return ((MemoryDump) this.instance).getMemory();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
            public MetadataCase getMetadataCase() {
                return ((MemoryDump) this.instance).getMetadataCase();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
            public String getRegisterName() {
                return ((MemoryDump) this.instance).getRegisterName();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
            public AbstractC3722j getRegisterNameBytes() {
                return ((MemoryDump) this.instance).getRegisterNameBytes();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
            public boolean hasArmMteMetadata() {
                return ((MemoryDump) this.instance).hasArmMteMetadata();
            }

            public Builder mergeArmMteMetadata(ArmMTEMetadata armMTEMetadata) {
                copyOnWrite();
                ((MemoryDump) this.instance).mergeArmMteMetadata(armMTEMetadata);
                return this;
            }

            public Builder setArmMteMetadata(ArmMTEMetadata armMTEMetadata) {
                copyOnWrite();
                ((MemoryDump) this.instance).setArmMteMetadata(armMTEMetadata);
                return this;
            }

            public Builder setBeginAddress(long j10) {
                copyOnWrite();
                ((MemoryDump) this.instance).setBeginAddress(j10);
                return this;
            }

            public Builder setMappingName(String str) {
                copyOnWrite();
                ((MemoryDump) this.instance).setMappingName(str);
                return this;
            }

            public Builder setMappingNameBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((MemoryDump) this.instance).setMappingNameBytes(abstractC3722j);
                return this;
            }

            public Builder setMemory(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((MemoryDump) this.instance).setMemory(abstractC3722j);
                return this;
            }

            public Builder setRegisterName(String str) {
                copyOnWrite();
                ((MemoryDump) this.instance).setRegisterName(str);
                return this;
            }

            public Builder setRegisterNameBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((MemoryDump) this.instance).setRegisterNameBytes(abstractC3722j);
                return this;
            }

            private Builder() {
                super(MemoryDump.DEFAULT_INSTANCE);
            }

            public Builder setArmMteMetadata(ArmMTEMetadata.Builder builder) {
                copyOnWrite();
                ((MemoryDump) this.instance).setArmMteMetadata((ArmMTEMetadata) builder.build());
                return this;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum MetadataCase {
            ARM_MTE_METADATA(6),
            METADATA_NOT_SET(0);

            private final int value;

            MetadataCase(int i10) {
                this.value = i10;
            }

            public static MetadataCase forNumber(int i10) {
                if (i10 == 0) {
                    return METADATA_NOT_SET;
                }
                if (i10 != 6) {
                    return null;
                }
                return ARM_MTE_METADATA;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static MetadataCase valueOf(int i10) {
                return forNumber(i10);
            }
        }

        static {
            MemoryDump memoryDump = new MemoryDump();
            DEFAULT_INSTANCE = memoryDump;
            GeneratedMessageLite.registerDefaultInstance(MemoryDump.class, memoryDump);
        }

        private MemoryDump() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearArmMteMetadata() {
            if (this.metadataCase_ == 6) {
                this.metadataCase_ = 0;
                this.metadata_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBeginAddress() {
            this.beginAddress_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMappingName() {
            this.mappingName_ = getDefaultInstance().getMappingName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMemory() {
            this.memory_ = getDefaultInstance().getMemory();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMetadata() {
            this.metadataCase_ = 0;
            this.metadata_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRegisterName() {
            this.registerName_ = getDefaultInstance().getRegisterName();
        }

        public static MemoryDump getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeArmMteMetadata(ArmMTEMetadata armMTEMetadata) {
            armMTEMetadata.getClass();
            if (this.metadataCase_ != 6 || this.metadata_ == ArmMTEMetadata.getDefaultInstance()) {
                this.metadata_ = armMTEMetadata;
            } else {
                this.metadata_ = ((ArmMTEMetadata.Builder) ArmMTEMetadata.newBuilder((ArmMTEMetadata) this.metadata_).mergeFrom((GeneratedMessageLite) armMTEMetadata)).buildPartial();
            }
            this.metadataCase_ = 6;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MemoryDump parseDelimitedFrom(InputStream inputStream) {
            return (MemoryDump) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MemoryDump parseFrom(ByteBuffer byteBuffer) {
            return (MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setArmMteMetadata(ArmMTEMetadata armMTEMetadata) {
            armMTEMetadata.getClass();
            this.metadata_ = armMTEMetadata;
            this.metadataCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBeginAddress(long j10) {
            this.beginAddress_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMappingName(String str) {
            str.getClass();
            this.mappingName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMappingNameBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.mappingName_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMemory(AbstractC3722j abstractC3722j) {
            abstractC3722j.getClass();
            this.memory_ = abstractC3722j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRegisterName(String str) {
            str.getClass();
            this.registerName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRegisterNameBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.registerName_ = abstractC3722j.J();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new MemoryDump();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0003\u0004\n\u0006<\u0000", new Object[]{"metadata_", "metadataCase_", "registerName_", "mappingName_", "beginAddress_", "memory_", ArmMTEMetadata.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (MemoryDump.class) {
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

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
        public ArmMTEMetadata getArmMteMetadata() {
            return this.metadataCase_ == 6 ? (ArmMTEMetadata) this.metadata_ : ArmMTEMetadata.getDefaultInstance();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
        public long getBeginAddress() {
            return this.beginAddress_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
        public String getMappingName() {
            return this.mappingName_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
        public AbstractC3722j getMappingNameBytes() {
            return AbstractC3722j.n(this.mappingName_);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
        public AbstractC3722j getMemory() {
            return this.memory_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
        public MetadataCase getMetadataCase() {
            return MetadataCase.forNumber(this.metadataCase_);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
        public String getRegisterName() {
            return this.registerName_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
        public AbstractC3722j getRegisterNameBytes() {
            return AbstractC3722j.n(this.registerName_);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
        public boolean hasArmMteMetadata() {
            return this.metadataCase_ == 6;
        }

        public static Builder newBuilder(MemoryDump memoryDump) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(memoryDump);
        }

        public static MemoryDump parseDelimitedFrom(InputStream inputStream, D d10) {
            return (MemoryDump) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static MemoryDump parseFrom(ByteBuffer byteBuffer, D d10) {
            return (MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static MemoryDump parseFrom(AbstractC3722j abstractC3722j) {
            return (MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static MemoryDump parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static MemoryDump parseFrom(byte[] bArr) {
            return (MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MemoryDump parseFrom(byte[] bArr, D d10) {
            return (MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static MemoryDump parseFrom(InputStream inputStream) {
            return (MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MemoryDump parseFrom(InputStream inputStream, D d10) {
            return (MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static MemoryDump parseFrom(AbstractC3724k abstractC3724k) {
            return (MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static MemoryDump parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface MemoryDumpOrBuilder extends InterfaceC3719h0 {
        ArmMTEMetadata getArmMteMetadata();

        long getBeginAddress();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        String getMappingName();

        AbstractC3722j getMappingNameBytes();

        AbstractC3722j getMemory();

        MemoryDump.MetadataCase getMetadataCase();

        String getRegisterName();

        AbstractC3722j getRegisterNameBytes();

        boolean hasArmMteMetadata();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class MemoryError extends GeneratedMessageLite implements MemoryErrorOrBuilder {
        private static final MemoryError DEFAULT_INSTANCE;
        public static final int HEAP_FIELD_NUMBER = 3;
        private static volatile t0 PARSER = null;
        public static final int TOOL_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 2;
        private int locationCase_ = 0;
        private Object location_;
        private int tool_;
        private int type_;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements MemoryErrorOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearHeap() {
                copyOnWrite();
                ((MemoryError) this.instance).clearHeap();
                return this;
            }

            public Builder clearLocation() {
                copyOnWrite();
                ((MemoryError) this.instance).clearLocation();
                return this;
            }

            public Builder clearTool() {
                copyOnWrite();
                ((MemoryError) this.instance).clearTool();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((MemoryError) this.instance).clearType();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryErrorOrBuilder
            public HeapObject getHeap() {
                return ((MemoryError) this.instance).getHeap();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryErrorOrBuilder
            public LocationCase getLocationCase() {
                return ((MemoryError) this.instance).getLocationCase();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryErrorOrBuilder
            public Tool getTool() {
                return ((MemoryError) this.instance).getTool();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryErrorOrBuilder
            public int getToolValue() {
                return ((MemoryError) this.instance).getToolValue();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryErrorOrBuilder
            public Type getType() {
                return ((MemoryError) this.instance).getType();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryErrorOrBuilder
            public int getTypeValue() {
                return ((MemoryError) this.instance).getTypeValue();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryErrorOrBuilder
            public boolean hasHeap() {
                return ((MemoryError) this.instance).hasHeap();
            }

            public Builder mergeHeap(HeapObject heapObject) {
                copyOnWrite();
                ((MemoryError) this.instance).mergeHeap(heapObject);
                return this;
            }

            public Builder setHeap(HeapObject heapObject) {
                copyOnWrite();
                ((MemoryError) this.instance).setHeap(heapObject);
                return this;
            }

            public Builder setTool(Tool tool) {
                copyOnWrite();
                ((MemoryError) this.instance).setTool(tool);
                return this;
            }

            public Builder setToolValue(int i10) {
                copyOnWrite();
                ((MemoryError) this.instance).setToolValue(i10);
                return this;
            }

            public Builder setType(Type type) {
                copyOnWrite();
                ((MemoryError) this.instance).setType(type);
                return this;
            }

            public Builder setTypeValue(int i10) {
                copyOnWrite();
                ((MemoryError) this.instance).setTypeValue(i10);
                return this;
            }

            private Builder() {
                super(MemoryError.DEFAULT_INSTANCE);
            }

            public Builder setHeap(HeapObject.Builder builder) {
                copyOnWrite();
                ((MemoryError) this.instance).setHeap((HeapObject) builder.build());
                return this;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum LocationCase {
            HEAP(3),
            LOCATION_NOT_SET(0);

            private final int value;

            LocationCase(int i10) {
                this.value = i10;
            }

            public static LocationCase forNumber(int i10) {
                if (i10 == 0) {
                    return LOCATION_NOT_SET;
                }
                if (i10 != 3) {
                    return null;
                }
                return HEAP;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static LocationCase valueOf(int i10) {
                return forNumber(i10);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum Tool implements N.c {
            GWP_ASAN(0),
            SCUDO(1),
            UNRECOGNIZED(-1);

            public static final int GWP_ASAN_VALUE = 0;
            public static final int SCUDO_VALUE = 1;
            private static final N.d internalValueMap = new N.d() { // from class: io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryError.Tool.1
                @Override // com.google.protobuf.N.d
                public Tool findValueByNumber(int i10) {
                    return Tool.forNumber(i10);
                }
            };
            private final int value;

            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public static final class ToolVerifier implements N.e {
                static final N.e INSTANCE = new ToolVerifier();

                private ToolVerifier() {
                }

                @Override // com.google.protobuf.N.e
                public boolean isInRange(int i10) {
                    return Tool.forNumber(i10) != null;
                }
            }

            Tool(int i10) {
                this.value = i10;
            }

            public static Tool forNumber(int i10) {
                if (i10 == 0) {
                    return GWP_ASAN;
                }
                if (i10 != 1) {
                    return null;
                }
                return SCUDO;
            }

            public static N.d internalGetValueMap() {
                return internalValueMap;
            }

            public static N.e internalGetVerifier() {
                return ToolVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.N.c
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static Tool valueOf(int i10) {
                return forNumber(i10);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum Type implements N.c {
            UNKNOWN(0),
            USE_AFTER_FREE(1),
            DOUBLE_FREE(2),
            INVALID_FREE(3),
            BUFFER_OVERFLOW(4),
            BUFFER_UNDERFLOW(5),
            UNRECOGNIZED(-1);

            public static final int BUFFER_OVERFLOW_VALUE = 4;
            public static final int BUFFER_UNDERFLOW_VALUE = 5;
            public static final int DOUBLE_FREE_VALUE = 2;
            public static final int INVALID_FREE_VALUE = 3;
            public static final int UNKNOWN_VALUE = 0;
            public static final int USE_AFTER_FREE_VALUE = 1;
            private static final N.d internalValueMap = new N.d() { // from class: io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryError.Type.1
                @Override // com.google.protobuf.N.d
                public Type findValueByNumber(int i10) {
                    return Type.forNumber(i10);
                }
            };
            private final int value;

            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public static final class TypeVerifier implements N.e {
                static final N.e INSTANCE = new TypeVerifier();

                private TypeVerifier() {
                }

                @Override // com.google.protobuf.N.e
                public boolean isInRange(int i10) {
                    return Type.forNumber(i10) != null;
                }
            }

            Type(int i10) {
                this.value = i10;
            }

            public static Type forNumber(int i10) {
                if (i10 == 0) {
                    return UNKNOWN;
                }
                if (i10 == 1) {
                    return USE_AFTER_FREE;
                }
                if (i10 == 2) {
                    return DOUBLE_FREE;
                }
                if (i10 == 3) {
                    return INVALID_FREE;
                }
                if (i10 == 4) {
                    return BUFFER_OVERFLOW;
                }
                if (i10 != 5) {
                    return null;
                }
                return BUFFER_UNDERFLOW;
            }

            public static N.d internalGetValueMap() {
                return internalValueMap;
            }

            public static N.e internalGetVerifier() {
                return TypeVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.N.c
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static Type valueOf(int i10) {
                return forNumber(i10);
            }
        }

        static {
            MemoryError memoryError = new MemoryError();
            DEFAULT_INSTANCE = memoryError;
            GeneratedMessageLite.registerDefaultInstance(MemoryError.class, memoryError);
        }

        private MemoryError() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeap() {
            if (this.locationCase_ == 3) {
                this.locationCase_ = 0;
                this.location_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLocation() {
            this.locationCase_ = 0;
            this.location_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTool() {
            this.tool_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static MemoryError getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeHeap(HeapObject heapObject) {
            heapObject.getClass();
            if (this.locationCase_ != 3 || this.location_ == HeapObject.getDefaultInstance()) {
                this.location_ = heapObject;
            } else {
                this.location_ = ((HeapObject.Builder) HeapObject.newBuilder((HeapObject) this.location_).mergeFrom((GeneratedMessageLite) heapObject)).buildPartial();
            }
            this.locationCase_ = 3;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MemoryError parseDelimitedFrom(InputStream inputStream) {
            return (MemoryError) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MemoryError parseFrom(ByteBuffer byteBuffer) {
            return (MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeap(HeapObject heapObject) {
            heapObject.getClass();
            this.location_ = heapObject;
            this.locationCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTool(Tool tool) {
            this.tool_ = tool.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToolValue(int i10) {
            this.tool_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(Type type) {
            this.type_ = type.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i10) {
            this.type_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new MemoryError();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003<\u0000", new Object[]{"location_", "locationCase_", "tool_", "type_", HeapObject.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (MemoryError.class) {
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

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryErrorOrBuilder
        public HeapObject getHeap() {
            return this.locationCase_ == 3 ? (HeapObject) this.location_ : HeapObject.getDefaultInstance();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryErrorOrBuilder
        public LocationCase getLocationCase() {
            return LocationCase.forNumber(this.locationCase_);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryErrorOrBuilder
        public Tool getTool() {
            Tool toolForNumber = Tool.forNumber(this.tool_);
            return toolForNumber == null ? Tool.UNRECOGNIZED : toolForNumber;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryErrorOrBuilder
        public int getToolValue() {
            return this.tool_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryErrorOrBuilder
        public Type getType() {
            Type typeForNumber = Type.forNumber(this.type_);
            return typeForNumber == null ? Type.UNRECOGNIZED : typeForNumber;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryErrorOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryErrorOrBuilder
        public boolean hasHeap() {
            return this.locationCase_ == 3;
        }

        public static Builder newBuilder(MemoryError memoryError) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(memoryError);
        }

        public static MemoryError parseDelimitedFrom(InputStream inputStream, D d10) {
            return (MemoryError) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static MemoryError parseFrom(ByteBuffer byteBuffer, D d10) {
            return (MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static MemoryError parseFrom(AbstractC3722j abstractC3722j) {
            return (MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static MemoryError parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static MemoryError parseFrom(byte[] bArr) {
            return (MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MemoryError parseFrom(byte[] bArr, D d10) {
            return (MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static MemoryError parseFrom(InputStream inputStream) {
            return (MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MemoryError parseFrom(InputStream inputStream, D d10) {
            return (MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static MemoryError parseFrom(AbstractC3724k abstractC3724k) {
            return (MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static MemoryError parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface MemoryErrorOrBuilder extends InterfaceC3719h0 {
        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        HeapObject getHeap();

        MemoryError.LocationCase getLocationCase();

        MemoryError.Tool getTool();

        int getToolValue();

        MemoryError.Type getType();

        int getTypeValue();

        boolean hasHeap();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class MemoryMapping extends GeneratedMessageLite implements MemoryMappingOrBuilder {
        public static final int BEGIN_ADDRESS_FIELD_NUMBER = 1;
        public static final int BUILD_ID_FIELD_NUMBER = 8;
        private static final MemoryMapping DEFAULT_INSTANCE;
        public static final int END_ADDRESS_FIELD_NUMBER = 2;
        public static final int EXECUTE_FIELD_NUMBER = 6;
        public static final int LOAD_BIAS_FIELD_NUMBER = 9;
        public static final int MAPPING_NAME_FIELD_NUMBER = 7;
        public static final int OFFSET_FIELD_NUMBER = 3;
        private static volatile t0 PARSER = null;
        public static final int READ_FIELD_NUMBER = 4;
        public static final int WRITE_FIELD_NUMBER = 5;
        private long beginAddress_;
        private long endAddress_;
        private boolean execute_;
        private long loadBias_;
        private long offset_;
        private boolean read_;
        private boolean write_;
        private String mappingName_ = "";
        private String buildId_ = "";

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements MemoryMappingOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearBeginAddress() {
                copyOnWrite();
                ((MemoryMapping) this.instance).clearBeginAddress();
                return this;
            }

            public Builder clearBuildId() {
                copyOnWrite();
                ((MemoryMapping) this.instance).clearBuildId();
                return this;
            }

            public Builder clearEndAddress() {
                copyOnWrite();
                ((MemoryMapping) this.instance).clearEndAddress();
                return this;
            }

            public Builder clearExecute() {
                copyOnWrite();
                ((MemoryMapping) this.instance).clearExecute();
                return this;
            }

            public Builder clearLoadBias() {
                copyOnWrite();
                ((MemoryMapping) this.instance).clearLoadBias();
                return this;
            }

            public Builder clearMappingName() {
                copyOnWrite();
                ((MemoryMapping) this.instance).clearMappingName();
                return this;
            }

            public Builder clearOffset() {
                copyOnWrite();
                ((MemoryMapping) this.instance).clearOffset();
                return this;
            }

            public Builder clearRead() {
                copyOnWrite();
                ((MemoryMapping) this.instance).clearRead();
                return this;
            }

            public Builder clearWrite() {
                copyOnWrite();
                ((MemoryMapping) this.instance).clearWrite();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
            public long getBeginAddress() {
                return ((MemoryMapping) this.instance).getBeginAddress();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
            public String getBuildId() {
                return ((MemoryMapping) this.instance).getBuildId();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
            public AbstractC3722j getBuildIdBytes() {
                return ((MemoryMapping) this.instance).getBuildIdBytes();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
            public long getEndAddress() {
                return ((MemoryMapping) this.instance).getEndAddress();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
            public boolean getExecute() {
                return ((MemoryMapping) this.instance).getExecute();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
            public long getLoadBias() {
                return ((MemoryMapping) this.instance).getLoadBias();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
            public String getMappingName() {
                return ((MemoryMapping) this.instance).getMappingName();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
            public AbstractC3722j getMappingNameBytes() {
                return ((MemoryMapping) this.instance).getMappingNameBytes();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
            public long getOffset() {
                return ((MemoryMapping) this.instance).getOffset();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
            public boolean getRead() {
                return ((MemoryMapping) this.instance).getRead();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
            public boolean getWrite() {
                return ((MemoryMapping) this.instance).getWrite();
            }

            public Builder setBeginAddress(long j10) {
                copyOnWrite();
                ((MemoryMapping) this.instance).setBeginAddress(j10);
                return this;
            }

            public Builder setBuildId(String str) {
                copyOnWrite();
                ((MemoryMapping) this.instance).setBuildId(str);
                return this;
            }

            public Builder setBuildIdBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((MemoryMapping) this.instance).setBuildIdBytes(abstractC3722j);
                return this;
            }

            public Builder setEndAddress(long j10) {
                copyOnWrite();
                ((MemoryMapping) this.instance).setEndAddress(j10);
                return this;
            }

            public Builder setExecute(boolean z10) {
                copyOnWrite();
                ((MemoryMapping) this.instance).setExecute(z10);
                return this;
            }

            public Builder setLoadBias(long j10) {
                copyOnWrite();
                ((MemoryMapping) this.instance).setLoadBias(j10);
                return this;
            }

            public Builder setMappingName(String str) {
                copyOnWrite();
                ((MemoryMapping) this.instance).setMappingName(str);
                return this;
            }

            public Builder setMappingNameBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((MemoryMapping) this.instance).setMappingNameBytes(abstractC3722j);
                return this;
            }

            public Builder setOffset(long j10) {
                copyOnWrite();
                ((MemoryMapping) this.instance).setOffset(j10);
                return this;
            }

            public Builder setRead(boolean z10) {
                copyOnWrite();
                ((MemoryMapping) this.instance).setRead(z10);
                return this;
            }

            public Builder setWrite(boolean z10) {
                copyOnWrite();
                ((MemoryMapping) this.instance).setWrite(z10);
                return this;
            }

            private Builder() {
                super(MemoryMapping.DEFAULT_INSTANCE);
            }
        }

        static {
            MemoryMapping memoryMapping = new MemoryMapping();
            DEFAULT_INSTANCE = memoryMapping;
            GeneratedMessageLite.registerDefaultInstance(MemoryMapping.class, memoryMapping);
        }

        private MemoryMapping() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBeginAddress() {
            this.beginAddress_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBuildId() {
            this.buildId_ = getDefaultInstance().getBuildId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndAddress() {
            this.endAddress_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExecute() {
            this.execute_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLoadBias() {
            this.loadBias_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMappingName() {
            this.mappingName_ = getDefaultInstance().getMappingName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOffset() {
            this.offset_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRead() {
            this.read_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWrite() {
            this.write_ = false;
        }

        public static MemoryMapping getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MemoryMapping parseDelimitedFrom(InputStream inputStream) {
            return (MemoryMapping) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MemoryMapping parseFrom(ByteBuffer byteBuffer) {
            return (MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBeginAddress(long j10) {
            this.beginAddress_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildId(String str) {
            str.getClass();
            this.buildId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildIdBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.buildId_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndAddress(long j10) {
            this.endAddress_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExecute(boolean z10) {
            this.execute_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadBias(long j10) {
            this.loadBias_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMappingName(String str) {
            str.getClass();
            this.mappingName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMappingNameBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.mappingName_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOffset(long j10) {
            this.offset_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRead(boolean z10) {
            this.read_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWrite(boolean z10) {
            this.write_ = z10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new MemoryMapping();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0003\u0002\u0003\u0003\u0003\u0004\u0007\u0005\u0007\u0006\u0007\u0007Ȉ\bȈ\t\u0003", new Object[]{"beginAddress_", "endAddress_", "offset_", "read_", "write_", "execute_", "mappingName_", "buildId_", "loadBias_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (MemoryMapping.class) {
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

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
        public long getBeginAddress() {
            return this.beginAddress_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
        public String getBuildId() {
            return this.buildId_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
        public AbstractC3722j getBuildIdBytes() {
            return AbstractC3722j.n(this.buildId_);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
        public long getEndAddress() {
            return this.endAddress_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
        public boolean getExecute() {
            return this.execute_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
        public long getLoadBias() {
            return this.loadBias_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
        public String getMappingName() {
            return this.mappingName_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
        public AbstractC3722j getMappingNameBytes() {
            return AbstractC3722j.n(this.mappingName_);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
        public long getOffset() {
            return this.offset_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
        public boolean getRead() {
            return this.read_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
        public boolean getWrite() {
            return this.write_;
        }

        public static Builder newBuilder(MemoryMapping memoryMapping) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(memoryMapping);
        }

        public static MemoryMapping parseDelimitedFrom(InputStream inputStream, D d10) {
            return (MemoryMapping) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static MemoryMapping parseFrom(ByteBuffer byteBuffer, D d10) {
            return (MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static MemoryMapping parseFrom(AbstractC3722j abstractC3722j) {
            return (MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static MemoryMapping parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static MemoryMapping parseFrom(byte[] bArr) {
            return (MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MemoryMapping parseFrom(byte[] bArr, D d10) {
            return (MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static MemoryMapping parseFrom(InputStream inputStream) {
            return (MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MemoryMapping parseFrom(InputStream inputStream, D d10) {
            return (MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static MemoryMapping parseFrom(AbstractC3724k abstractC3724k) {
            return (MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static MemoryMapping parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface MemoryMappingOrBuilder extends InterfaceC3719h0 {
        long getBeginAddress();

        String getBuildId();

        AbstractC3722j getBuildIdBytes();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        long getEndAddress();

        boolean getExecute();

        long getLoadBias();

        String getMappingName();

        AbstractC3722j getMappingNameBytes();

        long getOffset();

        boolean getRead();

        boolean getWrite();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Register extends GeneratedMessageLite implements RegisterOrBuilder {
        private static final Register DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile t0 PARSER = null;
        public static final int U64_FIELD_NUMBER = 2;
        private String name_ = "";
        private long u64_;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements RegisterOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearName() {
                copyOnWrite();
                ((Register) this.instance).clearName();
                return this;
            }

            public Builder clearU64() {
                copyOnWrite();
                ((Register) this.instance).clearU64();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.RegisterOrBuilder
            public String getName() {
                return ((Register) this.instance).getName();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.RegisterOrBuilder
            public AbstractC3722j getNameBytes() {
                return ((Register) this.instance).getNameBytes();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.RegisterOrBuilder
            public long getU64() {
                return ((Register) this.instance).getU64();
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((Register) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((Register) this.instance).setNameBytes(abstractC3722j);
                return this;
            }

            public Builder setU64(long j10) {
                copyOnWrite();
                ((Register) this.instance).setU64(j10);
                return this;
            }

            private Builder() {
                super(Register.DEFAULT_INSTANCE);
            }
        }

        static {
            Register register = new Register();
            DEFAULT_INSTANCE = register;
            GeneratedMessageLite.registerDefaultInstance(Register.class, register);
        }

        private Register() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearU64() {
            this.u64_ = 0L;
        }

        public static Register getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Register parseDelimitedFrom(InputStream inputStream) {
            return (Register) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Register parseFrom(ByteBuffer byteBuffer) {
            return (Register) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.name_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setU64(long j10) {
            this.u64_ = j10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new Register();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0003", new Object[]{"name_", "u64_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (Register.class) {
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

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.RegisterOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.RegisterOrBuilder
        public AbstractC3722j getNameBytes() {
            return AbstractC3722j.n(this.name_);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.RegisterOrBuilder
        public long getU64() {
            return this.u64_;
        }

        public static Builder newBuilder(Register register) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(register);
        }

        public static Register parseDelimitedFrom(InputStream inputStream, D d10) {
            return (Register) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static Register parseFrom(ByteBuffer byteBuffer, D d10) {
            return (Register) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static Register parseFrom(AbstractC3722j abstractC3722j) {
            return (Register) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static Register parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (Register) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static Register parseFrom(byte[] bArr) {
            return (Register) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Register parseFrom(byte[] bArr, D d10) {
            return (Register) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static Register parseFrom(InputStream inputStream) {
            return (Register) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Register parseFrom(InputStream inputStream, D d10) {
            return (Register) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static Register parseFrom(AbstractC3724k abstractC3724k) {
            return (Register) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static Register parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (Register) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface RegisterOrBuilder extends InterfaceC3719h0 {
        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        String getName();

        AbstractC3722j getNameBytes();

        long getU64();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Signal extends GeneratedMessageLite implements SignalOrBuilder {
        public static final int CODE_FIELD_NUMBER = 3;
        public static final int CODE_NAME_FIELD_NUMBER = 4;
        private static final Signal DEFAULT_INSTANCE;
        public static final int FAULT_ADDRESS_FIELD_NUMBER = 9;
        public static final int FAULT_ADJACENT_METADATA_FIELD_NUMBER = 10;
        public static final int HAS_FAULT_ADDRESS_FIELD_NUMBER = 8;
        public static final int HAS_SENDER_FIELD_NUMBER = 5;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int NUMBER_FIELD_NUMBER = 1;
        private static volatile t0 PARSER = null;
        public static final int SENDER_PID_FIELD_NUMBER = 7;
        public static final int SENDER_UID_FIELD_NUMBER = 6;
        private int bitField0_;
        private int code_;
        private long faultAddress_;
        private MemoryDump faultAdjacentMetadata_;
        private boolean hasFaultAddress_;
        private boolean hasSender_;
        private int number_;
        private int senderPid_;
        private int senderUid_;
        private String name_ = "";
        private String codeName_ = "";

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements SignalOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearCode() {
                copyOnWrite();
                ((Signal) this.instance).clearCode();
                return this;
            }

            public Builder clearCodeName() {
                copyOnWrite();
                ((Signal) this.instance).clearCodeName();
                return this;
            }

            public Builder clearFaultAddress() {
                copyOnWrite();
                ((Signal) this.instance).clearFaultAddress();
                return this;
            }

            public Builder clearFaultAdjacentMetadata() {
                copyOnWrite();
                ((Signal) this.instance).clearFaultAdjacentMetadata();
                return this;
            }

            public Builder clearHasFaultAddress() {
                copyOnWrite();
                ((Signal) this.instance).clearHasFaultAddress();
                return this;
            }

            public Builder clearHasSender() {
                copyOnWrite();
                ((Signal) this.instance).clearHasSender();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((Signal) this.instance).clearName();
                return this;
            }

            public Builder clearNumber() {
                copyOnWrite();
                ((Signal) this.instance).clearNumber();
                return this;
            }

            public Builder clearSenderPid() {
                copyOnWrite();
                ((Signal) this.instance).clearSenderPid();
                return this;
            }

            public Builder clearSenderUid() {
                copyOnWrite();
                ((Signal) this.instance).clearSenderUid();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
            public int getCode() {
                return ((Signal) this.instance).getCode();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
            public String getCodeName() {
                return ((Signal) this.instance).getCodeName();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
            public AbstractC3722j getCodeNameBytes() {
                return ((Signal) this.instance).getCodeNameBytes();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
            public long getFaultAddress() {
                return ((Signal) this.instance).getFaultAddress();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
            public MemoryDump getFaultAdjacentMetadata() {
                return ((Signal) this.instance).getFaultAdjacentMetadata();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
            public boolean getHasFaultAddress() {
                return ((Signal) this.instance).getHasFaultAddress();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
            public boolean getHasSender() {
                return ((Signal) this.instance).getHasSender();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
            public String getName() {
                return ((Signal) this.instance).getName();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
            public AbstractC3722j getNameBytes() {
                return ((Signal) this.instance).getNameBytes();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
            public int getNumber() {
                return ((Signal) this.instance).getNumber();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
            public int getSenderPid() {
                return ((Signal) this.instance).getSenderPid();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
            public int getSenderUid() {
                return ((Signal) this.instance).getSenderUid();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
            public boolean hasFaultAdjacentMetadata() {
                return ((Signal) this.instance).hasFaultAdjacentMetadata();
            }

            public Builder mergeFaultAdjacentMetadata(MemoryDump memoryDump) {
                copyOnWrite();
                ((Signal) this.instance).mergeFaultAdjacentMetadata(memoryDump);
                return this;
            }

            public Builder setCode(int i10) {
                copyOnWrite();
                ((Signal) this.instance).setCode(i10);
                return this;
            }

            public Builder setCodeName(String str) {
                copyOnWrite();
                ((Signal) this.instance).setCodeName(str);
                return this;
            }

            public Builder setCodeNameBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((Signal) this.instance).setCodeNameBytes(abstractC3722j);
                return this;
            }

            public Builder setFaultAddress(long j10) {
                copyOnWrite();
                ((Signal) this.instance).setFaultAddress(j10);
                return this;
            }

            public Builder setFaultAdjacentMetadata(MemoryDump memoryDump) {
                copyOnWrite();
                ((Signal) this.instance).setFaultAdjacentMetadata(memoryDump);
                return this;
            }

            public Builder setHasFaultAddress(boolean z10) {
                copyOnWrite();
                ((Signal) this.instance).setHasFaultAddress(z10);
                return this;
            }

            public Builder setHasSender(boolean z10) {
                copyOnWrite();
                ((Signal) this.instance).setHasSender(z10);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((Signal) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((Signal) this.instance).setNameBytes(abstractC3722j);
                return this;
            }

            public Builder setNumber(int i10) {
                copyOnWrite();
                ((Signal) this.instance).setNumber(i10);
                return this;
            }

            public Builder setSenderPid(int i10) {
                copyOnWrite();
                ((Signal) this.instance).setSenderPid(i10);
                return this;
            }

            public Builder setSenderUid(int i10) {
                copyOnWrite();
                ((Signal) this.instance).setSenderUid(i10);
                return this;
            }

            private Builder() {
                super(Signal.DEFAULT_INSTANCE);
            }

            public Builder setFaultAdjacentMetadata(MemoryDump.Builder builder) {
                copyOnWrite();
                ((Signal) this.instance).setFaultAdjacentMetadata((MemoryDump) builder.build());
                return this;
            }
        }

        static {
            Signal signal = new Signal();
            DEFAULT_INSTANCE = signal;
            GeneratedMessageLite.registerDefaultInstance(Signal.class, signal);
        }

        private Signal() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCode() {
            this.code_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCodeName() {
            this.codeName_ = getDefaultInstance().getCodeName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFaultAddress() {
            this.faultAddress_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFaultAdjacentMetadata() {
            this.faultAdjacentMetadata_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHasFaultAddress() {
            this.hasFaultAddress_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHasSender() {
            this.hasSender_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNumber() {
            this.number_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSenderPid() {
            this.senderPid_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSenderUid() {
            this.senderUid_ = 0;
        }

        public static Signal getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFaultAdjacentMetadata(MemoryDump memoryDump) {
            memoryDump.getClass();
            MemoryDump memoryDump2 = this.faultAdjacentMetadata_;
            if (memoryDump2 == null || memoryDump2 == MemoryDump.getDefaultInstance()) {
                this.faultAdjacentMetadata_ = memoryDump;
            } else {
                this.faultAdjacentMetadata_ = (MemoryDump) ((MemoryDump.Builder) MemoryDump.newBuilder(this.faultAdjacentMetadata_).mergeFrom((GeneratedMessageLite) memoryDump)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Signal parseDelimitedFrom(InputStream inputStream) {
            return (Signal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Signal parseFrom(ByteBuffer byteBuffer) {
            return (Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCode(int i10) {
            this.code_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCodeName(String str) {
            str.getClass();
            this.codeName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCodeNameBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.codeName_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFaultAddress(long j10) {
            this.faultAddress_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFaultAdjacentMetadata(MemoryDump memoryDump) {
            memoryDump.getClass();
            this.faultAdjacentMetadata_ = memoryDump;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHasFaultAddress(boolean z10) {
            this.hasFaultAddress_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHasSender(boolean z10) {
            this.hasSender_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.name_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNumber(int i10) {
            this.number_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSenderPid(int i10) {
            this.senderPid_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSenderUid(int i10) {
            this.senderUid_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new Signal();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\u0004\u0004Ȉ\u0005\u0007\u0006\u0004\u0007\u0004\b\u0007\t\u0003\nဉ\u0000", new Object[]{"bitField0_", "number_", "name_", "code_", "codeName_", "hasSender_", "senderUid_", "senderPid_", "hasFaultAddress_", "faultAddress_", "faultAdjacentMetadata_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (Signal.class) {
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

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
        public int getCode() {
            return this.code_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
        public String getCodeName() {
            return this.codeName_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
        public AbstractC3722j getCodeNameBytes() {
            return AbstractC3722j.n(this.codeName_);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
        public long getFaultAddress() {
            return this.faultAddress_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
        public MemoryDump getFaultAdjacentMetadata() {
            MemoryDump memoryDump = this.faultAdjacentMetadata_;
            return memoryDump == null ? MemoryDump.getDefaultInstance() : memoryDump;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
        public boolean getHasFaultAddress() {
            return this.hasFaultAddress_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
        public boolean getHasSender() {
            return this.hasSender_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
        public AbstractC3722j getNameBytes() {
            return AbstractC3722j.n(this.name_);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
        public int getNumber() {
            return this.number_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
        public int getSenderPid() {
            return this.senderPid_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
        public int getSenderUid() {
            return this.senderUid_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
        public boolean hasFaultAdjacentMetadata() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(Signal signal) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(signal);
        }

        public static Signal parseDelimitedFrom(InputStream inputStream, D d10) {
            return (Signal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static Signal parseFrom(ByteBuffer byteBuffer, D d10) {
            return (Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static Signal parseFrom(AbstractC3722j abstractC3722j) {
            return (Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static Signal parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static Signal parseFrom(byte[] bArr) {
            return (Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Signal parseFrom(byte[] bArr, D d10) {
            return (Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static Signal parseFrom(InputStream inputStream) {
            return (Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Signal parseFrom(InputStream inputStream, D d10) {
            return (Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static Signal parseFrom(AbstractC3724k abstractC3724k) {
            return (Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static Signal parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface SignalOrBuilder extends InterfaceC3719h0 {
        int getCode();

        String getCodeName();

        AbstractC3722j getCodeNameBytes();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        long getFaultAddress();

        MemoryDump getFaultAdjacentMetadata();

        boolean getHasFaultAddress();

        boolean getHasSender();

        String getName();

        AbstractC3722j getNameBytes();

        int getNumber();

        int getSenderPid();

        int getSenderUid();

        boolean hasFaultAdjacentMetadata();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class StackHistoryBuffer extends GeneratedMessageLite implements StackHistoryBufferOrBuilder {
        private static final StackHistoryBuffer DEFAULT_INSTANCE;
        public static final int ENTRIES_FIELD_NUMBER = 2;
        private static volatile t0 PARSER = null;
        public static final int TID_FIELD_NUMBER = 1;
        private N.j entries_ = GeneratedMessageLite.emptyProtobufList();
        private long tid_;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements StackHistoryBufferOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllEntries(Iterable<? extends StackHistoryBufferEntry> iterable) {
                copyOnWrite();
                ((StackHistoryBuffer) this.instance).addAllEntries(iterable);
                return this;
            }

            public Builder addEntries(StackHistoryBufferEntry stackHistoryBufferEntry) {
                copyOnWrite();
                ((StackHistoryBuffer) this.instance).addEntries(stackHistoryBufferEntry);
                return this;
            }

            public Builder clearEntries() {
                copyOnWrite();
                ((StackHistoryBuffer) this.instance).clearEntries();
                return this;
            }

            public Builder clearTid() {
                copyOnWrite();
                ((StackHistoryBuffer) this.instance).clearTid();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferOrBuilder
            public StackHistoryBufferEntry getEntries(int i10) {
                return ((StackHistoryBuffer) this.instance).getEntries(i10);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferOrBuilder
            public int getEntriesCount() {
                return ((StackHistoryBuffer) this.instance).getEntriesCount();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferOrBuilder
            public List<StackHistoryBufferEntry> getEntriesList() {
                return Collections.unmodifiableList(((StackHistoryBuffer) this.instance).getEntriesList());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferOrBuilder
            public long getTid() {
                return ((StackHistoryBuffer) this.instance).getTid();
            }

            public Builder removeEntries(int i10) {
                copyOnWrite();
                ((StackHistoryBuffer) this.instance).removeEntries(i10);
                return this;
            }

            public Builder setEntries(int i10, StackHistoryBufferEntry stackHistoryBufferEntry) {
                copyOnWrite();
                ((StackHistoryBuffer) this.instance).setEntries(i10, stackHistoryBufferEntry);
                return this;
            }

            public Builder setTid(long j10) {
                copyOnWrite();
                ((StackHistoryBuffer) this.instance).setTid(j10);
                return this;
            }

            private Builder() {
                super(StackHistoryBuffer.DEFAULT_INSTANCE);
            }

            public Builder addEntries(int i10, StackHistoryBufferEntry stackHistoryBufferEntry) {
                copyOnWrite();
                ((StackHistoryBuffer) this.instance).addEntries(i10, stackHistoryBufferEntry);
                return this;
            }

            public Builder setEntries(int i10, StackHistoryBufferEntry.Builder builder) {
                copyOnWrite();
                ((StackHistoryBuffer) this.instance).setEntries(i10, (StackHistoryBufferEntry) builder.build());
                return this;
            }

            public Builder addEntries(StackHistoryBufferEntry.Builder builder) {
                copyOnWrite();
                ((StackHistoryBuffer) this.instance).addEntries((StackHistoryBufferEntry) builder.build());
                return this;
            }

            public Builder addEntries(int i10, StackHistoryBufferEntry.Builder builder) {
                copyOnWrite();
                ((StackHistoryBuffer) this.instance).addEntries(i10, (StackHistoryBufferEntry) builder.build());
                return this;
            }
        }

        static {
            StackHistoryBuffer stackHistoryBuffer = new StackHistoryBuffer();
            DEFAULT_INSTANCE = stackHistoryBuffer;
            GeneratedMessageLite.registerDefaultInstance(StackHistoryBuffer.class, stackHistoryBuffer);
        }

        private StackHistoryBuffer() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllEntries(Iterable<? extends StackHistoryBufferEntry> iterable) {
            ensureEntriesIsMutable();
            AbstractC3704a.addAll((Iterable) iterable, (List) this.entries_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEntries(StackHistoryBufferEntry stackHistoryBufferEntry) {
            stackHistoryBufferEntry.getClass();
            ensureEntriesIsMutable();
            this.entries_.add(stackHistoryBufferEntry);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEntries() {
            this.entries_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTid() {
            this.tid_ = 0L;
        }

        private void ensureEntriesIsMutable() {
            N.j jVar = this.entries_;
            if (jVar.m()) {
                return;
            }
            this.entries_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        public static StackHistoryBuffer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static StackHistoryBuffer parseDelimitedFrom(InputStream inputStream) {
            return (StackHistoryBuffer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StackHistoryBuffer parseFrom(ByteBuffer byteBuffer) {
            return (StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeEntries(int i10) {
            ensureEntriesIsMutable();
            this.entries_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEntries(int i10, StackHistoryBufferEntry stackHistoryBufferEntry) {
            stackHistoryBufferEntry.getClass();
            ensureEntriesIsMutable();
            this.entries_.set(i10, stackHistoryBufferEntry);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTid(long j10) {
            this.tid_ = j10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new StackHistoryBuffer();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0003\u0002\u001b", new Object[]{"tid_", "entries_", StackHistoryBufferEntry.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (StackHistoryBuffer.class) {
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

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferOrBuilder
        public StackHistoryBufferEntry getEntries(int i10) {
            return (StackHistoryBufferEntry) this.entries_.get(i10);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferOrBuilder
        public int getEntriesCount() {
            return this.entries_.size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferOrBuilder
        public List<StackHistoryBufferEntry> getEntriesList() {
            return this.entries_;
        }

        public StackHistoryBufferEntryOrBuilder getEntriesOrBuilder(int i10) {
            return (StackHistoryBufferEntryOrBuilder) this.entries_.get(i10);
        }

        public List<? extends StackHistoryBufferEntryOrBuilder> getEntriesOrBuilderList() {
            return this.entries_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferOrBuilder
        public long getTid() {
            return this.tid_;
        }

        public static Builder newBuilder(StackHistoryBuffer stackHistoryBuffer) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(stackHistoryBuffer);
        }

        public static StackHistoryBuffer parseDelimitedFrom(InputStream inputStream, D d10) {
            return (StackHistoryBuffer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static StackHistoryBuffer parseFrom(ByteBuffer byteBuffer, D d10) {
            return (StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static StackHistoryBuffer parseFrom(AbstractC3722j abstractC3722j) {
            return (StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEntries(int i10, StackHistoryBufferEntry stackHistoryBufferEntry) {
            stackHistoryBufferEntry.getClass();
            ensureEntriesIsMutable();
            this.entries_.add(i10, stackHistoryBufferEntry);
        }

        public static StackHistoryBuffer parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static StackHistoryBuffer parseFrom(byte[] bArr) {
            return (StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StackHistoryBuffer parseFrom(byte[] bArr, D d10) {
            return (StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static StackHistoryBuffer parseFrom(InputStream inputStream) {
            return (StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StackHistoryBuffer parseFrom(InputStream inputStream, D d10) {
            return (StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static StackHistoryBuffer parseFrom(AbstractC3724k abstractC3724k) {
            return (StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static StackHistoryBuffer parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class StackHistoryBufferEntry extends GeneratedMessageLite implements StackHistoryBufferEntryOrBuilder {
        public static final int ADDR_FIELD_NUMBER = 1;
        private static final StackHistoryBufferEntry DEFAULT_INSTANCE;
        public static final int FP_FIELD_NUMBER = 2;
        private static volatile t0 PARSER = null;
        public static final int TAG_FIELD_NUMBER = 3;
        private BacktraceFrame addr_;
        private int bitField0_;
        private long fp_;
        private long tag_;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements StackHistoryBufferEntryOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAddr() {
                copyOnWrite();
                ((StackHistoryBufferEntry) this.instance).clearAddr();
                return this;
            }

            public Builder clearFp() {
                copyOnWrite();
                ((StackHistoryBufferEntry) this.instance).clearFp();
                return this;
            }

            public Builder clearTag() {
                copyOnWrite();
                ((StackHistoryBufferEntry) this.instance).clearTag();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferEntryOrBuilder
            public BacktraceFrame getAddr() {
                return ((StackHistoryBufferEntry) this.instance).getAddr();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferEntryOrBuilder
            public long getFp() {
                return ((StackHistoryBufferEntry) this.instance).getFp();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferEntryOrBuilder
            public long getTag() {
                return ((StackHistoryBufferEntry) this.instance).getTag();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferEntryOrBuilder
            public boolean hasAddr() {
                return ((StackHistoryBufferEntry) this.instance).hasAddr();
            }

            public Builder mergeAddr(BacktraceFrame backtraceFrame) {
                copyOnWrite();
                ((StackHistoryBufferEntry) this.instance).mergeAddr(backtraceFrame);
                return this;
            }

            public Builder setAddr(BacktraceFrame backtraceFrame) {
                copyOnWrite();
                ((StackHistoryBufferEntry) this.instance).setAddr(backtraceFrame);
                return this;
            }

            public Builder setFp(long j10) {
                copyOnWrite();
                ((StackHistoryBufferEntry) this.instance).setFp(j10);
                return this;
            }

            public Builder setTag(long j10) {
                copyOnWrite();
                ((StackHistoryBufferEntry) this.instance).setTag(j10);
                return this;
            }

            private Builder() {
                super(StackHistoryBufferEntry.DEFAULT_INSTANCE);
            }

            public Builder setAddr(BacktraceFrame.Builder builder) {
                copyOnWrite();
                ((StackHistoryBufferEntry) this.instance).setAddr((BacktraceFrame) builder.build());
                return this;
            }
        }

        static {
            StackHistoryBufferEntry stackHistoryBufferEntry = new StackHistoryBufferEntry();
            DEFAULT_INSTANCE = stackHistoryBufferEntry;
            GeneratedMessageLite.registerDefaultInstance(StackHistoryBufferEntry.class, stackHistoryBufferEntry);
        }

        private StackHistoryBufferEntry() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAddr() {
            this.addr_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFp() {
            this.fp_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTag() {
            this.tag_ = 0L;
        }

        public static StackHistoryBufferEntry getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAddr(BacktraceFrame backtraceFrame) {
            backtraceFrame.getClass();
            BacktraceFrame backtraceFrame2 = this.addr_;
            if (backtraceFrame2 == null || backtraceFrame2 == BacktraceFrame.getDefaultInstance()) {
                this.addr_ = backtraceFrame;
            } else {
                this.addr_ = (BacktraceFrame) ((BacktraceFrame.Builder) BacktraceFrame.newBuilder(this.addr_).mergeFrom((GeneratedMessageLite) backtraceFrame)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static StackHistoryBufferEntry parseDelimitedFrom(InputStream inputStream) {
            return (StackHistoryBufferEntry) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StackHistoryBufferEntry parseFrom(ByteBuffer byteBuffer) {
            return (StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddr(BacktraceFrame backtraceFrame) {
            backtraceFrame.getClass();
            this.addr_ = backtraceFrame;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFp(long j10) {
            this.fp_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTag(long j10) {
            this.tag_ = j10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new StackHistoryBufferEntry();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0003\u0003\u0003", new Object[]{"bitField0_", "addr_", "fp_", "tag_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (StackHistoryBufferEntry.class) {
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

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferEntryOrBuilder
        public BacktraceFrame getAddr() {
            BacktraceFrame backtraceFrame = this.addr_;
            return backtraceFrame == null ? BacktraceFrame.getDefaultInstance() : backtraceFrame;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferEntryOrBuilder
        public long getFp() {
            return this.fp_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferEntryOrBuilder
        public long getTag() {
            return this.tag_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferEntryOrBuilder
        public boolean hasAddr() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(StackHistoryBufferEntry stackHistoryBufferEntry) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(stackHistoryBufferEntry);
        }

        public static StackHistoryBufferEntry parseDelimitedFrom(InputStream inputStream, D d10) {
            return (StackHistoryBufferEntry) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static StackHistoryBufferEntry parseFrom(ByteBuffer byteBuffer, D d10) {
            return (StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static StackHistoryBufferEntry parseFrom(AbstractC3722j abstractC3722j) {
            return (StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static StackHistoryBufferEntry parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static StackHistoryBufferEntry parseFrom(byte[] bArr) {
            return (StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StackHistoryBufferEntry parseFrom(byte[] bArr, D d10) {
            return (StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static StackHistoryBufferEntry parseFrom(InputStream inputStream) {
            return (StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StackHistoryBufferEntry parseFrom(InputStream inputStream, D d10) {
            return (StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static StackHistoryBufferEntry parseFrom(AbstractC3724k abstractC3724k) {
            return (StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static StackHistoryBufferEntry parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface StackHistoryBufferEntryOrBuilder extends InterfaceC3719h0 {
        BacktraceFrame getAddr();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        long getFp();

        long getTag();

        boolean hasAddr();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface StackHistoryBufferOrBuilder extends InterfaceC3719h0 {
        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        StackHistoryBufferEntry getEntries(int i10);

        int getEntriesCount();

        List<StackHistoryBufferEntry> getEntriesList();

        long getTid();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Thread extends GeneratedMessageLite implements ThreadOrBuilder {
        public static final int BACKTRACE_NOTE_FIELD_NUMBER = 7;
        public static final int CURRENT_BACKTRACE_FIELD_NUMBER = 4;
        private static final Thread DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int MEMORY_DUMP_FIELD_NUMBER = 5;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int PAC_ENABLED_KEYS_FIELD_NUMBER = 8;
        private static volatile t0 PARSER = null;
        public static final int REGISTERS_FIELD_NUMBER = 3;
        public static final int TAGGED_ADDR_CTRL_FIELD_NUMBER = 6;
        public static final int UNREADABLE_ELF_FILES_FIELD_NUMBER = 9;
        private int id_;
        private long pacEnabledKeys_;
        private long taggedAddrCtrl_;
        private String name_ = "";
        private N.j registers_ = GeneratedMessageLite.emptyProtobufList();
        private N.j backtraceNote_ = GeneratedMessageLite.emptyProtobufList();
        private N.j unreadableElfFiles_ = GeneratedMessageLite.emptyProtobufList();
        private N.j currentBacktrace_ = GeneratedMessageLite.emptyProtobufList();
        private N.j memoryDump_ = GeneratedMessageLite.emptyProtobufList();

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements ThreadOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllBacktraceNote(Iterable<String> iterable) {
                copyOnWrite();
                ((Thread) this.instance).addAllBacktraceNote(iterable);
                return this;
            }

            public Builder addAllCurrentBacktrace(Iterable<? extends BacktraceFrame> iterable) {
                copyOnWrite();
                ((Thread) this.instance).addAllCurrentBacktrace(iterable);
                return this;
            }

            public Builder addAllMemoryDump(Iterable<? extends MemoryDump> iterable) {
                copyOnWrite();
                ((Thread) this.instance).addAllMemoryDump(iterable);
                return this;
            }

            public Builder addAllRegisters(Iterable<? extends Register> iterable) {
                copyOnWrite();
                ((Thread) this.instance).addAllRegisters(iterable);
                return this;
            }

            public Builder addAllUnreadableElfFiles(Iterable<String> iterable) {
                copyOnWrite();
                ((Thread) this.instance).addAllUnreadableElfFiles(iterable);
                return this;
            }

            public Builder addBacktraceNote(String str) {
                copyOnWrite();
                ((Thread) this.instance).addBacktraceNote(str);
                return this;
            }

            public Builder addBacktraceNoteBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((Thread) this.instance).addBacktraceNoteBytes(abstractC3722j);
                return this;
            }

            public Builder addCurrentBacktrace(BacktraceFrame backtraceFrame) {
                copyOnWrite();
                ((Thread) this.instance).addCurrentBacktrace(backtraceFrame);
                return this;
            }

            public Builder addMemoryDump(MemoryDump memoryDump) {
                copyOnWrite();
                ((Thread) this.instance).addMemoryDump(memoryDump);
                return this;
            }

            public Builder addRegisters(Register register) {
                copyOnWrite();
                ((Thread) this.instance).addRegisters(register);
                return this;
            }

            public Builder addUnreadableElfFiles(String str) {
                copyOnWrite();
                ((Thread) this.instance).addUnreadableElfFiles(str);
                return this;
            }

            public Builder addUnreadableElfFilesBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((Thread) this.instance).addUnreadableElfFilesBytes(abstractC3722j);
                return this;
            }

            public Builder clearBacktraceNote() {
                copyOnWrite();
                ((Thread) this.instance).clearBacktraceNote();
                return this;
            }

            public Builder clearCurrentBacktrace() {
                copyOnWrite();
                ((Thread) this.instance).clearCurrentBacktrace();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((Thread) this.instance).clearId();
                return this;
            }

            public Builder clearMemoryDump() {
                copyOnWrite();
                ((Thread) this.instance).clearMemoryDump();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((Thread) this.instance).clearName();
                return this;
            }

            public Builder clearPacEnabledKeys() {
                copyOnWrite();
                ((Thread) this.instance).clearPacEnabledKeys();
                return this;
            }

            public Builder clearRegisters() {
                copyOnWrite();
                ((Thread) this.instance).clearRegisters();
                return this;
            }

            public Builder clearTaggedAddrCtrl() {
                copyOnWrite();
                ((Thread) this.instance).clearTaggedAddrCtrl();
                return this;
            }

            public Builder clearUnreadableElfFiles() {
                copyOnWrite();
                ((Thread) this.instance).clearUnreadableElfFiles();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public String getBacktraceNote(int i10) {
                return ((Thread) this.instance).getBacktraceNote(i10);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public AbstractC3722j getBacktraceNoteBytes(int i10) {
                return ((Thread) this.instance).getBacktraceNoteBytes(i10);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public int getBacktraceNoteCount() {
                return ((Thread) this.instance).getBacktraceNoteCount();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public List<String> getBacktraceNoteList() {
                return Collections.unmodifiableList(((Thread) this.instance).getBacktraceNoteList());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public BacktraceFrame getCurrentBacktrace(int i10) {
                return ((Thread) this.instance).getCurrentBacktrace(i10);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public int getCurrentBacktraceCount() {
                return ((Thread) this.instance).getCurrentBacktraceCount();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public List<BacktraceFrame> getCurrentBacktraceList() {
                return Collections.unmodifiableList(((Thread) this.instance).getCurrentBacktraceList());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public int getId() {
                return ((Thread) this.instance).getId();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public MemoryDump getMemoryDump(int i10) {
                return ((Thread) this.instance).getMemoryDump(i10);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public int getMemoryDumpCount() {
                return ((Thread) this.instance).getMemoryDumpCount();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public List<MemoryDump> getMemoryDumpList() {
                return Collections.unmodifiableList(((Thread) this.instance).getMemoryDumpList());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public String getName() {
                return ((Thread) this.instance).getName();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public AbstractC3722j getNameBytes() {
                return ((Thread) this.instance).getNameBytes();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public long getPacEnabledKeys() {
                return ((Thread) this.instance).getPacEnabledKeys();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public Register getRegisters(int i10) {
                return ((Thread) this.instance).getRegisters(i10);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public int getRegistersCount() {
                return ((Thread) this.instance).getRegistersCount();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public List<Register> getRegistersList() {
                return Collections.unmodifiableList(((Thread) this.instance).getRegistersList());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public long getTaggedAddrCtrl() {
                return ((Thread) this.instance).getTaggedAddrCtrl();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public String getUnreadableElfFiles(int i10) {
                return ((Thread) this.instance).getUnreadableElfFiles(i10);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public AbstractC3722j getUnreadableElfFilesBytes(int i10) {
                return ((Thread) this.instance).getUnreadableElfFilesBytes(i10);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public int getUnreadableElfFilesCount() {
                return ((Thread) this.instance).getUnreadableElfFilesCount();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public List<String> getUnreadableElfFilesList() {
                return Collections.unmodifiableList(((Thread) this.instance).getUnreadableElfFilesList());
            }

            public Builder removeCurrentBacktrace(int i10) {
                copyOnWrite();
                ((Thread) this.instance).removeCurrentBacktrace(i10);
                return this;
            }

            public Builder removeMemoryDump(int i10) {
                copyOnWrite();
                ((Thread) this.instance).removeMemoryDump(i10);
                return this;
            }

            public Builder removeRegisters(int i10) {
                copyOnWrite();
                ((Thread) this.instance).removeRegisters(i10);
                return this;
            }

            public Builder setBacktraceNote(int i10, String str) {
                copyOnWrite();
                ((Thread) this.instance).setBacktraceNote(i10, str);
                return this;
            }

            public Builder setCurrentBacktrace(int i10, BacktraceFrame backtraceFrame) {
                copyOnWrite();
                ((Thread) this.instance).setCurrentBacktrace(i10, backtraceFrame);
                return this;
            }

            public Builder setId(int i10) {
                copyOnWrite();
                ((Thread) this.instance).setId(i10);
                return this;
            }

            public Builder setMemoryDump(int i10, MemoryDump memoryDump) {
                copyOnWrite();
                ((Thread) this.instance).setMemoryDump(i10, memoryDump);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((Thread) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((Thread) this.instance).setNameBytes(abstractC3722j);
                return this;
            }

            public Builder setPacEnabledKeys(long j10) {
                copyOnWrite();
                ((Thread) this.instance).setPacEnabledKeys(j10);
                return this;
            }

            public Builder setRegisters(int i10, Register register) {
                copyOnWrite();
                ((Thread) this.instance).setRegisters(i10, register);
                return this;
            }

            public Builder setTaggedAddrCtrl(long j10) {
                copyOnWrite();
                ((Thread) this.instance).setTaggedAddrCtrl(j10);
                return this;
            }

            public Builder setUnreadableElfFiles(int i10, String str) {
                copyOnWrite();
                ((Thread) this.instance).setUnreadableElfFiles(i10, str);
                return this;
            }

            private Builder() {
                super(Thread.DEFAULT_INSTANCE);
            }

            public Builder addCurrentBacktrace(int i10, BacktraceFrame backtraceFrame) {
                copyOnWrite();
                ((Thread) this.instance).addCurrentBacktrace(i10, backtraceFrame);
                return this;
            }

            public Builder addMemoryDump(int i10, MemoryDump memoryDump) {
                copyOnWrite();
                ((Thread) this.instance).addMemoryDump(i10, memoryDump);
                return this;
            }

            public Builder addRegisters(int i10, Register register) {
                copyOnWrite();
                ((Thread) this.instance).addRegisters(i10, register);
                return this;
            }

            public Builder setCurrentBacktrace(int i10, BacktraceFrame.Builder builder) {
                copyOnWrite();
                ((Thread) this.instance).setCurrentBacktrace(i10, (BacktraceFrame) builder.build());
                return this;
            }

            public Builder setMemoryDump(int i10, MemoryDump.Builder builder) {
                copyOnWrite();
                ((Thread) this.instance).setMemoryDump(i10, (MemoryDump) builder.build());
                return this;
            }

            public Builder setRegisters(int i10, Register.Builder builder) {
                copyOnWrite();
                ((Thread) this.instance).setRegisters(i10, (Register) builder.build());
                return this;
            }

            public Builder addCurrentBacktrace(BacktraceFrame.Builder builder) {
                copyOnWrite();
                ((Thread) this.instance).addCurrentBacktrace((BacktraceFrame) builder.build());
                return this;
            }

            public Builder addMemoryDump(MemoryDump.Builder builder) {
                copyOnWrite();
                ((Thread) this.instance).addMemoryDump((MemoryDump) builder.build());
                return this;
            }

            public Builder addRegisters(Register.Builder builder) {
                copyOnWrite();
                ((Thread) this.instance).addRegisters((Register) builder.build());
                return this;
            }

            public Builder addCurrentBacktrace(int i10, BacktraceFrame.Builder builder) {
                copyOnWrite();
                ((Thread) this.instance).addCurrentBacktrace(i10, (BacktraceFrame) builder.build());
                return this;
            }

            public Builder addMemoryDump(int i10, MemoryDump.Builder builder) {
                copyOnWrite();
                ((Thread) this.instance).addMemoryDump(i10, (MemoryDump) builder.build());
                return this;
            }

            public Builder addRegisters(int i10, Register.Builder builder) {
                copyOnWrite();
                ((Thread) this.instance).addRegisters(i10, (Register) builder.build());
                return this;
            }
        }

        static {
            Thread thread = new Thread();
            DEFAULT_INSTANCE = thread;
            GeneratedMessageLite.registerDefaultInstance(Thread.class, thread);
        }

        private Thread() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllBacktraceNote(Iterable<String> iterable) {
            ensureBacktraceNoteIsMutable();
            AbstractC3704a.addAll((Iterable) iterable, (List) this.backtraceNote_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCurrentBacktrace(Iterable<? extends BacktraceFrame> iterable) {
            ensureCurrentBacktraceIsMutable();
            AbstractC3704a.addAll((Iterable) iterable, (List) this.currentBacktrace_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMemoryDump(Iterable<? extends MemoryDump> iterable) {
            ensureMemoryDumpIsMutable();
            AbstractC3704a.addAll((Iterable) iterable, (List) this.memoryDump_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllRegisters(Iterable<? extends Register> iterable) {
            ensureRegistersIsMutable();
            AbstractC3704a.addAll((Iterable) iterable, (List) this.registers_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUnreadableElfFiles(Iterable<String> iterable) {
            ensureUnreadableElfFilesIsMutable();
            AbstractC3704a.addAll((Iterable) iterable, (List) this.unreadableElfFiles_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBacktraceNote(String str) {
            str.getClass();
            ensureBacktraceNoteIsMutable();
            this.backtraceNote_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBacktraceNoteBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            ensureBacktraceNoteIsMutable();
            this.backtraceNote_.add(abstractC3722j.J());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCurrentBacktrace(BacktraceFrame backtraceFrame) {
            backtraceFrame.getClass();
            ensureCurrentBacktraceIsMutable();
            this.currentBacktrace_.add(backtraceFrame);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMemoryDump(MemoryDump memoryDump) {
            memoryDump.getClass();
            ensureMemoryDumpIsMutable();
            this.memoryDump_.add(memoryDump);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRegisters(Register register) {
            register.getClass();
            ensureRegistersIsMutable();
            this.registers_.add(register);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUnreadableElfFiles(String str) {
            str.getClass();
            ensureUnreadableElfFilesIsMutable();
            this.unreadableElfFiles_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUnreadableElfFilesBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            ensureUnreadableElfFilesIsMutable();
            this.unreadableElfFiles_.add(abstractC3722j.J());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBacktraceNote() {
            this.backtraceNote_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentBacktrace() {
            this.currentBacktrace_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMemoryDump() {
            this.memoryDump_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPacEnabledKeys() {
            this.pacEnabledKeys_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRegisters() {
            this.registers_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTaggedAddrCtrl() {
            this.taggedAddrCtrl_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUnreadableElfFiles() {
            this.unreadableElfFiles_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureBacktraceNoteIsMutable() {
            N.j jVar = this.backtraceNote_;
            if (jVar.m()) {
                return;
            }
            this.backtraceNote_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        private void ensureCurrentBacktraceIsMutable() {
            N.j jVar = this.currentBacktrace_;
            if (jVar.m()) {
                return;
            }
            this.currentBacktrace_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        private void ensureMemoryDumpIsMutable() {
            N.j jVar = this.memoryDump_;
            if (jVar.m()) {
                return;
            }
            this.memoryDump_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        private void ensureRegistersIsMutable() {
            N.j jVar = this.registers_;
            if (jVar.m()) {
                return;
            }
            this.registers_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        private void ensureUnreadableElfFilesIsMutable() {
            N.j jVar = this.unreadableElfFiles_;
            if (jVar.m()) {
                return;
            }
            this.unreadableElfFiles_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        public static Thread getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Thread parseDelimitedFrom(InputStream inputStream) {
            return (Thread) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Thread parseFrom(ByteBuffer byteBuffer) {
            return (Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeCurrentBacktrace(int i10) {
            ensureCurrentBacktraceIsMutable();
            this.currentBacktrace_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMemoryDump(int i10) {
            ensureMemoryDumpIsMutable();
            this.memoryDump_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeRegisters(int i10) {
            ensureRegistersIsMutable();
            this.registers_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBacktraceNote(int i10, String str) {
            str.getClass();
            ensureBacktraceNoteIsMutable();
            this.backtraceNote_.set(i10, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentBacktrace(int i10, BacktraceFrame backtraceFrame) {
            backtraceFrame.getClass();
            ensureCurrentBacktraceIsMutable();
            this.currentBacktrace_.set(i10, backtraceFrame);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(int i10) {
            this.id_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMemoryDump(int i10, MemoryDump memoryDump) {
            memoryDump.getClass();
            ensureMemoryDumpIsMutable();
            this.memoryDump_.set(i10, memoryDump);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.name_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPacEnabledKeys(long j10) {
            this.pacEnabledKeys_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRegisters(int i10, Register register) {
            register.getClass();
            ensureRegistersIsMutable();
            this.registers_.set(i10, register);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTaggedAddrCtrl(long j10) {
            this.taggedAddrCtrl_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnreadableElfFiles(int i10, String str) {
            str.getClass();
            ensureUnreadableElfFilesIsMutable();
            this.unreadableElfFiles_.set(i10, str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new Thread();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0005\u0000\u0001\u0004\u0002Ȉ\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u0002\u0007Ț\b\u0002\tȚ", new Object[]{"id_", "name_", "registers_", Register.class, "currentBacktrace_", BacktraceFrame.class, "memoryDump_", MemoryDump.class, "taggedAddrCtrl_", "backtraceNote_", "pacEnabledKeys_", "unreadableElfFiles_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (Thread.class) {
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

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public String getBacktraceNote(int i10) {
            return (String) this.backtraceNote_.get(i10);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public AbstractC3722j getBacktraceNoteBytes(int i10) {
            return AbstractC3722j.n((String) this.backtraceNote_.get(i10));
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public int getBacktraceNoteCount() {
            return this.backtraceNote_.size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public List<String> getBacktraceNoteList() {
            return this.backtraceNote_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public BacktraceFrame getCurrentBacktrace(int i10) {
            return (BacktraceFrame) this.currentBacktrace_.get(i10);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public int getCurrentBacktraceCount() {
            return this.currentBacktrace_.size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public List<BacktraceFrame> getCurrentBacktraceList() {
            return this.currentBacktrace_;
        }

        public BacktraceFrameOrBuilder getCurrentBacktraceOrBuilder(int i10) {
            return (BacktraceFrameOrBuilder) this.currentBacktrace_.get(i10);
        }

        public List<? extends BacktraceFrameOrBuilder> getCurrentBacktraceOrBuilderList() {
            return this.currentBacktrace_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public MemoryDump getMemoryDump(int i10) {
            return (MemoryDump) this.memoryDump_.get(i10);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public int getMemoryDumpCount() {
            return this.memoryDump_.size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public List<MemoryDump> getMemoryDumpList() {
            return this.memoryDump_;
        }

        public MemoryDumpOrBuilder getMemoryDumpOrBuilder(int i10) {
            return (MemoryDumpOrBuilder) this.memoryDump_.get(i10);
        }

        public List<? extends MemoryDumpOrBuilder> getMemoryDumpOrBuilderList() {
            return this.memoryDump_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public AbstractC3722j getNameBytes() {
            return AbstractC3722j.n(this.name_);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public long getPacEnabledKeys() {
            return this.pacEnabledKeys_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public Register getRegisters(int i10) {
            return (Register) this.registers_.get(i10);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public int getRegistersCount() {
            return this.registers_.size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public List<Register> getRegistersList() {
            return this.registers_;
        }

        public RegisterOrBuilder getRegistersOrBuilder(int i10) {
            return (RegisterOrBuilder) this.registers_.get(i10);
        }

        public List<? extends RegisterOrBuilder> getRegistersOrBuilderList() {
            return this.registers_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public long getTaggedAddrCtrl() {
            return this.taggedAddrCtrl_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public String getUnreadableElfFiles(int i10) {
            return (String) this.unreadableElfFiles_.get(i10);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public AbstractC3722j getUnreadableElfFilesBytes(int i10) {
            return AbstractC3722j.n((String) this.unreadableElfFiles_.get(i10));
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public int getUnreadableElfFilesCount() {
            return this.unreadableElfFiles_.size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public List<String> getUnreadableElfFilesList() {
            return this.unreadableElfFiles_;
        }

        public static Builder newBuilder(Thread thread) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(thread);
        }

        public static Thread parseDelimitedFrom(InputStream inputStream, D d10) {
            return (Thread) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static Thread parseFrom(ByteBuffer byteBuffer, D d10) {
            return (Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static Thread parseFrom(AbstractC3722j abstractC3722j) {
            return (Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCurrentBacktrace(int i10, BacktraceFrame backtraceFrame) {
            backtraceFrame.getClass();
            ensureCurrentBacktraceIsMutable();
            this.currentBacktrace_.add(i10, backtraceFrame);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMemoryDump(int i10, MemoryDump memoryDump) {
            memoryDump.getClass();
            ensureMemoryDumpIsMutable();
            this.memoryDump_.add(i10, memoryDump);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRegisters(int i10, Register register) {
            register.getClass();
            ensureRegistersIsMutable();
            this.registers_.add(i10, register);
        }

        public static Thread parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static Thread parseFrom(byte[] bArr) {
            return (Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Thread parseFrom(byte[] bArr, D d10) {
            return (Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static Thread parseFrom(InputStream inputStream) {
            return (Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Thread parseFrom(InputStream inputStream, D d10) {
            return (Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static Thread parseFrom(AbstractC3724k abstractC3724k) {
            return (Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static Thread parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface ThreadOrBuilder extends InterfaceC3719h0 {
        String getBacktraceNote(int i10);

        AbstractC3722j getBacktraceNoteBytes(int i10);

        int getBacktraceNoteCount();

        List<String> getBacktraceNoteList();

        BacktraceFrame getCurrentBacktrace(int i10);

        int getCurrentBacktraceCount();

        List<BacktraceFrame> getCurrentBacktraceList();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        int getId();

        MemoryDump getMemoryDump(int i10);

        int getMemoryDumpCount();

        List<MemoryDump> getMemoryDumpList();

        String getName();

        AbstractC3722j getNameBytes();

        long getPacEnabledKeys();

        Register getRegisters(int i10);

        int getRegistersCount();

        List<Register> getRegistersList();

        long getTaggedAddrCtrl();

        String getUnreadableElfFiles(int i10);

        AbstractC3722j getUnreadableElfFilesBytes(int i10);

        int getUnreadableElfFilesCount();

        List<String> getUnreadableElfFilesList();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Tombstone extends GeneratedMessageLite implements TombstoneOrBuilder {
        public static final int ABORT_MESSAGE_FIELD_NUMBER = 14;
        public static final int ARCH_FIELD_NUMBER = 1;
        public static final int BUILD_FINGERPRINT_FIELD_NUMBER = 2;
        public static final int CAUSES_FIELD_NUMBER = 15;
        public static final int COMMAND_LINE_FIELD_NUMBER = 9;
        public static final int CRASH_DETAILS_FIELD_NUMBER = 21;
        private static final Tombstone DEFAULT_INSTANCE;
        public static final int GUEST_ARCH_FIELD_NUMBER = 24;
        public static final int GUEST_THREADS_FIELD_NUMBER = 25;
        public static final int HAS_BEEN_16KB_MODE_FIELD_NUMBER = 23;
        public static final int LOG_BUFFERS_FIELD_NUMBER = 18;
        public static final int MEMORY_MAPPINGS_FIELD_NUMBER = 17;
        public static final int OPEN_FDS_FIELD_NUMBER = 19;
        public static final int PAGE_SIZE_FIELD_NUMBER = 22;
        private static volatile t0 PARSER = null;
        public static final int PID_FIELD_NUMBER = 5;
        public static final int PROCESS_UPTIME_FIELD_NUMBER = 20;
        public static final int REVISION_FIELD_NUMBER = 3;
        public static final int SELINUX_LABEL_FIELD_NUMBER = 8;
        public static final int SIGNAL_INFO_FIELD_NUMBER = 10;
        public static final int STACK_HISTORY_BUFFER_FIELD_NUMBER = 26;
        public static final int THREADS_FIELD_NUMBER = 16;
        public static final int TID_FIELD_NUMBER = 6;
        public static final int TIMESTAMP_FIELD_NUMBER = 4;
        public static final int UID_FIELD_NUMBER = 7;
        private int arch_;
        private int bitField0_;
        private int guestArch_;
        private boolean hasBeen16KbMode_;
        private int pageSize_;
        private int pid_;
        private int processUptime_;
        private Signal signalInfo_;
        private StackHistoryBuffer stackHistoryBuffer_;
        private int tid_;
        private int uid_;
        private C3705a0 threads_ = C3705a0.i();
        private C3705a0 guestThreads_ = C3705a0.i();
        private String buildFingerprint_ = "";
        private String revision_ = "";
        private String timestamp_ = "";
        private String selinuxLabel_ = "";
        private N.j commandLine_ = GeneratedMessageLite.emptyProtobufList();
        private String abortMessage_ = "";
        private N.j crashDetails_ = GeneratedMessageLite.emptyProtobufList();
        private N.j causes_ = GeneratedMessageLite.emptyProtobufList();
        private N.j memoryMappings_ = GeneratedMessageLite.emptyProtobufList();
        private N.j logBuffers_ = GeneratedMessageLite.emptyProtobufList();
        private N.j openFds_ = GeneratedMessageLite.emptyProtobufList();

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements TombstoneOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllCauses(Iterable<? extends Cause> iterable) {
                copyOnWrite();
                ((Tombstone) this.instance).addAllCauses(iterable);
                return this;
            }

            public Builder addAllCommandLine(Iterable<String> iterable) {
                copyOnWrite();
                ((Tombstone) this.instance).addAllCommandLine(iterable);
                return this;
            }

            public Builder addAllCrashDetails(Iterable<? extends CrashDetail> iterable) {
                copyOnWrite();
                ((Tombstone) this.instance).addAllCrashDetails(iterable);
                return this;
            }

            public Builder addAllLogBuffers(Iterable<? extends LogBuffer> iterable) {
                copyOnWrite();
                ((Tombstone) this.instance).addAllLogBuffers(iterable);
                return this;
            }

            public Builder addAllMemoryMappings(Iterable<? extends MemoryMapping> iterable) {
                copyOnWrite();
                ((Tombstone) this.instance).addAllMemoryMappings(iterable);
                return this;
            }

            public Builder addAllOpenFds(Iterable<? extends FD> iterable) {
                copyOnWrite();
                ((Tombstone) this.instance).addAllOpenFds(iterable);
                return this;
            }

            public Builder addCauses(Cause cause) {
                copyOnWrite();
                ((Tombstone) this.instance).addCauses(cause);
                return this;
            }

            public Builder addCommandLine(String str) {
                copyOnWrite();
                ((Tombstone) this.instance).addCommandLine(str);
                return this;
            }

            public Builder addCommandLineBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((Tombstone) this.instance).addCommandLineBytes(abstractC3722j);
                return this;
            }

            public Builder addCrashDetails(CrashDetail crashDetail) {
                copyOnWrite();
                ((Tombstone) this.instance).addCrashDetails(crashDetail);
                return this;
            }

            public Builder addLogBuffers(LogBuffer logBuffer) {
                copyOnWrite();
                ((Tombstone) this.instance).addLogBuffers(logBuffer);
                return this;
            }

            public Builder addMemoryMappings(MemoryMapping memoryMapping) {
                copyOnWrite();
                ((Tombstone) this.instance).addMemoryMappings(memoryMapping);
                return this;
            }

            public Builder addOpenFds(FD fd2) {
                copyOnWrite();
                ((Tombstone) this.instance).addOpenFds(fd2);
                return this;
            }

            public Builder clearAbortMessage() {
                copyOnWrite();
                ((Tombstone) this.instance).clearAbortMessage();
                return this;
            }

            public Builder clearArch() {
                copyOnWrite();
                ((Tombstone) this.instance).clearArch();
                return this;
            }

            public Builder clearBuildFingerprint() {
                copyOnWrite();
                ((Tombstone) this.instance).clearBuildFingerprint();
                return this;
            }

            public Builder clearCauses() {
                copyOnWrite();
                ((Tombstone) this.instance).clearCauses();
                return this;
            }

            public Builder clearCommandLine() {
                copyOnWrite();
                ((Tombstone) this.instance).clearCommandLine();
                return this;
            }

            public Builder clearCrashDetails() {
                copyOnWrite();
                ((Tombstone) this.instance).clearCrashDetails();
                return this;
            }

            public Builder clearGuestArch() {
                copyOnWrite();
                ((Tombstone) this.instance).clearGuestArch();
                return this;
            }

            public Builder clearGuestThreads() {
                copyOnWrite();
                ((Tombstone) this.instance).getMutableGuestThreadsMap().clear();
                return this;
            }

            public Builder clearHasBeen16KbMode() {
                copyOnWrite();
                ((Tombstone) this.instance).clearHasBeen16KbMode();
                return this;
            }

            public Builder clearLogBuffers() {
                copyOnWrite();
                ((Tombstone) this.instance).clearLogBuffers();
                return this;
            }

            public Builder clearMemoryMappings() {
                copyOnWrite();
                ((Tombstone) this.instance).clearMemoryMappings();
                return this;
            }

            public Builder clearOpenFds() {
                copyOnWrite();
                ((Tombstone) this.instance).clearOpenFds();
                return this;
            }

            public Builder clearPageSize() {
                copyOnWrite();
                ((Tombstone) this.instance).clearPageSize();
                return this;
            }

            public Builder clearPid() {
                copyOnWrite();
                ((Tombstone) this.instance).clearPid();
                return this;
            }

            public Builder clearProcessUptime() {
                copyOnWrite();
                ((Tombstone) this.instance).clearProcessUptime();
                return this;
            }

            public Builder clearRevision() {
                copyOnWrite();
                ((Tombstone) this.instance).clearRevision();
                return this;
            }

            public Builder clearSelinuxLabel() {
                copyOnWrite();
                ((Tombstone) this.instance).clearSelinuxLabel();
                return this;
            }

            public Builder clearSignalInfo() {
                copyOnWrite();
                ((Tombstone) this.instance).clearSignalInfo();
                return this;
            }

            public Builder clearStackHistoryBuffer() {
                copyOnWrite();
                ((Tombstone) this.instance).clearStackHistoryBuffer();
                return this;
            }

            public Builder clearThreads() {
                copyOnWrite();
                ((Tombstone) this.instance).getMutableThreadsMap().clear();
                return this;
            }

            public Builder clearTid() {
                copyOnWrite();
                ((Tombstone) this.instance).clearTid();
                return this;
            }

            public Builder clearTimestamp() {
                copyOnWrite();
                ((Tombstone) this.instance).clearTimestamp();
                return this;
            }

            public Builder clearUid() {
                copyOnWrite();
                ((Tombstone) this.instance).clearUid();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public boolean containsGuestThreads(int i10) {
                return ((Tombstone) this.instance).getGuestThreadsMap().containsKey(Integer.valueOf(i10));
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public boolean containsThreads(int i10) {
                return ((Tombstone) this.instance).getThreadsMap().containsKey(Integer.valueOf(i10));
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public String getAbortMessage() {
                return ((Tombstone) this.instance).getAbortMessage();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public AbstractC3722j getAbortMessageBytes() {
                return ((Tombstone) this.instance).getAbortMessageBytes();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public Architecture getArch() {
                return ((Tombstone) this.instance).getArch();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public int getArchValue() {
                return ((Tombstone) this.instance).getArchValue();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public String getBuildFingerprint() {
                return ((Tombstone) this.instance).getBuildFingerprint();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public AbstractC3722j getBuildFingerprintBytes() {
                return ((Tombstone) this.instance).getBuildFingerprintBytes();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public Cause getCauses(int i10) {
                return ((Tombstone) this.instance).getCauses(i10);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public int getCausesCount() {
                return ((Tombstone) this.instance).getCausesCount();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public List<Cause> getCausesList() {
                return Collections.unmodifiableList(((Tombstone) this.instance).getCausesList());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public String getCommandLine(int i10) {
                return ((Tombstone) this.instance).getCommandLine(i10);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public AbstractC3722j getCommandLineBytes(int i10) {
                return ((Tombstone) this.instance).getCommandLineBytes(i10);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public int getCommandLineCount() {
                return ((Tombstone) this.instance).getCommandLineCount();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public List<String> getCommandLineList() {
                return Collections.unmodifiableList(((Tombstone) this.instance).getCommandLineList());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public CrashDetail getCrashDetails(int i10) {
                return ((Tombstone) this.instance).getCrashDetails(i10);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public int getCrashDetailsCount() {
                return ((Tombstone) this.instance).getCrashDetailsCount();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public List<CrashDetail> getCrashDetailsList() {
                return Collections.unmodifiableList(((Tombstone) this.instance).getCrashDetailsList());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public Architecture getGuestArch() {
                return ((Tombstone) this.instance).getGuestArch();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public int getGuestArchValue() {
                return ((Tombstone) this.instance).getGuestArchValue();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            @Deprecated
            public Map<Integer, Thread> getGuestThreads() {
                return getGuestThreadsMap();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public int getGuestThreadsCount() {
                return ((Tombstone) this.instance).getGuestThreadsMap().size();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public Map<Integer, Thread> getGuestThreadsMap() {
                return Collections.unmodifiableMap(((Tombstone) this.instance).getGuestThreadsMap());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public Thread getGuestThreadsOrDefault(int i10, Thread thread) {
                Map<Integer, Thread> guestThreadsMap = ((Tombstone) this.instance).getGuestThreadsMap();
                return guestThreadsMap.containsKey(Integer.valueOf(i10)) ? guestThreadsMap.get(Integer.valueOf(i10)) : thread;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public Thread getGuestThreadsOrThrow(int i10) {
                Map<Integer, Thread> guestThreadsMap = ((Tombstone) this.instance).getGuestThreadsMap();
                if (guestThreadsMap.containsKey(Integer.valueOf(i10))) {
                    return guestThreadsMap.get(Integer.valueOf(i10));
                }
                throw new IllegalArgumentException();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public boolean getHasBeen16KbMode() {
                return ((Tombstone) this.instance).getHasBeen16KbMode();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public LogBuffer getLogBuffers(int i10) {
                return ((Tombstone) this.instance).getLogBuffers(i10);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public int getLogBuffersCount() {
                return ((Tombstone) this.instance).getLogBuffersCount();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public List<LogBuffer> getLogBuffersList() {
                return Collections.unmodifiableList(((Tombstone) this.instance).getLogBuffersList());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public MemoryMapping getMemoryMappings(int i10) {
                return ((Tombstone) this.instance).getMemoryMappings(i10);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public int getMemoryMappingsCount() {
                return ((Tombstone) this.instance).getMemoryMappingsCount();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public List<MemoryMapping> getMemoryMappingsList() {
                return Collections.unmodifiableList(((Tombstone) this.instance).getMemoryMappingsList());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public FD getOpenFds(int i10) {
                return ((Tombstone) this.instance).getOpenFds(i10);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public int getOpenFdsCount() {
                return ((Tombstone) this.instance).getOpenFdsCount();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public List<FD> getOpenFdsList() {
                return Collections.unmodifiableList(((Tombstone) this.instance).getOpenFdsList());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public int getPageSize() {
                return ((Tombstone) this.instance).getPageSize();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public int getPid() {
                return ((Tombstone) this.instance).getPid();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public int getProcessUptime() {
                return ((Tombstone) this.instance).getProcessUptime();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public String getRevision() {
                return ((Tombstone) this.instance).getRevision();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public AbstractC3722j getRevisionBytes() {
                return ((Tombstone) this.instance).getRevisionBytes();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public String getSelinuxLabel() {
                return ((Tombstone) this.instance).getSelinuxLabel();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public AbstractC3722j getSelinuxLabelBytes() {
                return ((Tombstone) this.instance).getSelinuxLabelBytes();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public Signal getSignalInfo() {
                return ((Tombstone) this.instance).getSignalInfo();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public StackHistoryBuffer getStackHistoryBuffer() {
                return ((Tombstone) this.instance).getStackHistoryBuffer();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            @Deprecated
            public Map<Integer, Thread> getThreads() {
                return getThreadsMap();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public int getThreadsCount() {
                return ((Tombstone) this.instance).getThreadsMap().size();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public Map<Integer, Thread> getThreadsMap() {
                return Collections.unmodifiableMap(((Tombstone) this.instance).getThreadsMap());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public Thread getThreadsOrDefault(int i10, Thread thread) {
                Map<Integer, Thread> threadsMap = ((Tombstone) this.instance).getThreadsMap();
                return threadsMap.containsKey(Integer.valueOf(i10)) ? threadsMap.get(Integer.valueOf(i10)) : thread;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public Thread getThreadsOrThrow(int i10) {
                Map<Integer, Thread> threadsMap = ((Tombstone) this.instance).getThreadsMap();
                if (threadsMap.containsKey(Integer.valueOf(i10))) {
                    return threadsMap.get(Integer.valueOf(i10));
                }
                throw new IllegalArgumentException();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public int getTid() {
                return ((Tombstone) this.instance).getTid();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public String getTimestamp() {
                return ((Tombstone) this.instance).getTimestamp();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public AbstractC3722j getTimestampBytes() {
                return ((Tombstone) this.instance).getTimestampBytes();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public int getUid() {
                return ((Tombstone) this.instance).getUid();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public boolean hasSignalInfo() {
                return ((Tombstone) this.instance).hasSignalInfo();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public boolean hasStackHistoryBuffer() {
                return ((Tombstone) this.instance).hasStackHistoryBuffer();
            }

            public Builder mergeSignalInfo(Signal signal) {
                copyOnWrite();
                ((Tombstone) this.instance).mergeSignalInfo(signal);
                return this;
            }

            public Builder mergeStackHistoryBuffer(StackHistoryBuffer stackHistoryBuffer) {
                copyOnWrite();
                ((Tombstone) this.instance).mergeStackHistoryBuffer(stackHistoryBuffer);
                return this;
            }

            public Builder putAllGuestThreads(Map<Integer, Thread> map) {
                copyOnWrite();
                ((Tombstone) this.instance).getMutableGuestThreadsMap().putAll(map);
                return this;
            }

            public Builder putAllThreads(Map<Integer, Thread> map) {
                copyOnWrite();
                ((Tombstone) this.instance).getMutableThreadsMap().putAll(map);
                return this;
            }

            public Builder putGuestThreads(int i10, Thread thread) {
                thread.getClass();
                copyOnWrite();
                ((Tombstone) this.instance).getMutableGuestThreadsMap().put(Integer.valueOf(i10), thread);
                return this;
            }

            public Builder putThreads(int i10, Thread thread) {
                thread.getClass();
                copyOnWrite();
                ((Tombstone) this.instance).getMutableThreadsMap().put(Integer.valueOf(i10), thread);
                return this;
            }

            public Builder removeCauses(int i10) {
                copyOnWrite();
                ((Tombstone) this.instance).removeCauses(i10);
                return this;
            }

            public Builder removeCrashDetails(int i10) {
                copyOnWrite();
                ((Tombstone) this.instance).removeCrashDetails(i10);
                return this;
            }

            public Builder removeGuestThreads(int i10) {
                copyOnWrite();
                ((Tombstone) this.instance).getMutableGuestThreadsMap().remove(Integer.valueOf(i10));
                return this;
            }

            public Builder removeLogBuffers(int i10) {
                copyOnWrite();
                ((Tombstone) this.instance).removeLogBuffers(i10);
                return this;
            }

            public Builder removeMemoryMappings(int i10) {
                copyOnWrite();
                ((Tombstone) this.instance).removeMemoryMappings(i10);
                return this;
            }

            public Builder removeOpenFds(int i10) {
                copyOnWrite();
                ((Tombstone) this.instance).removeOpenFds(i10);
                return this;
            }

            public Builder removeThreads(int i10) {
                copyOnWrite();
                ((Tombstone) this.instance).getMutableThreadsMap().remove(Integer.valueOf(i10));
                return this;
            }

            public Builder setAbortMessage(String str) {
                copyOnWrite();
                ((Tombstone) this.instance).setAbortMessage(str);
                return this;
            }

            public Builder setAbortMessageBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((Tombstone) this.instance).setAbortMessageBytes(abstractC3722j);
                return this;
            }

            public Builder setArch(Architecture architecture) {
                copyOnWrite();
                ((Tombstone) this.instance).setArch(architecture);
                return this;
            }

            public Builder setArchValue(int i10) {
                copyOnWrite();
                ((Tombstone) this.instance).setArchValue(i10);
                return this;
            }

            public Builder setBuildFingerprint(String str) {
                copyOnWrite();
                ((Tombstone) this.instance).setBuildFingerprint(str);
                return this;
            }

            public Builder setBuildFingerprintBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((Tombstone) this.instance).setBuildFingerprintBytes(abstractC3722j);
                return this;
            }

            public Builder setCauses(int i10, Cause cause) {
                copyOnWrite();
                ((Tombstone) this.instance).setCauses(i10, cause);
                return this;
            }

            public Builder setCommandLine(int i10, String str) {
                copyOnWrite();
                ((Tombstone) this.instance).setCommandLine(i10, str);
                return this;
            }

            public Builder setCrashDetails(int i10, CrashDetail crashDetail) {
                copyOnWrite();
                ((Tombstone) this.instance).setCrashDetails(i10, crashDetail);
                return this;
            }

            public Builder setGuestArch(Architecture architecture) {
                copyOnWrite();
                ((Tombstone) this.instance).setGuestArch(architecture);
                return this;
            }

            public Builder setGuestArchValue(int i10) {
                copyOnWrite();
                ((Tombstone) this.instance).setGuestArchValue(i10);
                return this;
            }

            public Builder setHasBeen16KbMode(boolean z10) {
                copyOnWrite();
                ((Tombstone) this.instance).setHasBeen16KbMode(z10);
                return this;
            }

            public Builder setLogBuffers(int i10, LogBuffer logBuffer) {
                copyOnWrite();
                ((Tombstone) this.instance).setLogBuffers(i10, logBuffer);
                return this;
            }

            public Builder setMemoryMappings(int i10, MemoryMapping memoryMapping) {
                copyOnWrite();
                ((Tombstone) this.instance).setMemoryMappings(i10, memoryMapping);
                return this;
            }

            public Builder setOpenFds(int i10, FD fd2) {
                copyOnWrite();
                ((Tombstone) this.instance).setOpenFds(i10, fd2);
                return this;
            }

            public Builder setPageSize(int i10) {
                copyOnWrite();
                ((Tombstone) this.instance).setPageSize(i10);
                return this;
            }

            public Builder setPid(int i10) {
                copyOnWrite();
                ((Tombstone) this.instance).setPid(i10);
                return this;
            }

            public Builder setProcessUptime(int i10) {
                copyOnWrite();
                ((Tombstone) this.instance).setProcessUptime(i10);
                return this;
            }

            public Builder setRevision(String str) {
                copyOnWrite();
                ((Tombstone) this.instance).setRevision(str);
                return this;
            }

            public Builder setRevisionBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((Tombstone) this.instance).setRevisionBytes(abstractC3722j);
                return this;
            }

            public Builder setSelinuxLabel(String str) {
                copyOnWrite();
                ((Tombstone) this.instance).setSelinuxLabel(str);
                return this;
            }

            public Builder setSelinuxLabelBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((Tombstone) this.instance).setSelinuxLabelBytes(abstractC3722j);
                return this;
            }

            public Builder setSignalInfo(Signal signal) {
                copyOnWrite();
                ((Tombstone) this.instance).setSignalInfo(signal);
                return this;
            }

            public Builder setStackHistoryBuffer(StackHistoryBuffer stackHistoryBuffer) {
                copyOnWrite();
                ((Tombstone) this.instance).setStackHistoryBuffer(stackHistoryBuffer);
                return this;
            }

            public Builder setTid(int i10) {
                copyOnWrite();
                ((Tombstone) this.instance).setTid(i10);
                return this;
            }

            public Builder setTimestamp(String str) {
                copyOnWrite();
                ((Tombstone) this.instance).setTimestamp(str);
                return this;
            }

            public Builder setTimestampBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((Tombstone) this.instance).setTimestampBytes(abstractC3722j);
                return this;
            }

            public Builder setUid(int i10) {
                copyOnWrite();
                ((Tombstone) this.instance).setUid(i10);
                return this;
            }

            private Builder() {
                super(Tombstone.DEFAULT_INSTANCE);
            }

            public Builder addCauses(int i10, Cause cause) {
                copyOnWrite();
                ((Tombstone) this.instance).addCauses(i10, cause);
                return this;
            }

            public Builder addCrashDetails(int i10, CrashDetail crashDetail) {
                copyOnWrite();
                ((Tombstone) this.instance).addCrashDetails(i10, crashDetail);
                return this;
            }

            public Builder addLogBuffers(int i10, LogBuffer logBuffer) {
                copyOnWrite();
                ((Tombstone) this.instance).addLogBuffers(i10, logBuffer);
                return this;
            }

            public Builder addMemoryMappings(int i10, MemoryMapping memoryMapping) {
                copyOnWrite();
                ((Tombstone) this.instance).addMemoryMappings(i10, memoryMapping);
                return this;
            }

            public Builder addOpenFds(int i10, FD fd2) {
                copyOnWrite();
                ((Tombstone) this.instance).addOpenFds(i10, fd2);
                return this;
            }

            public Builder setCauses(int i10, Cause.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).setCauses(i10, (Cause) builder.build());
                return this;
            }

            public Builder setCrashDetails(int i10, CrashDetail.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).setCrashDetails(i10, (CrashDetail) builder.build());
                return this;
            }

            public Builder setLogBuffers(int i10, LogBuffer.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).setLogBuffers(i10, (LogBuffer) builder.build());
                return this;
            }

            public Builder setMemoryMappings(int i10, MemoryMapping.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).setMemoryMappings(i10, (MemoryMapping) builder.build());
                return this;
            }

            public Builder setOpenFds(int i10, FD.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).setOpenFds(i10, (FD) builder.build());
                return this;
            }

            public Builder setSignalInfo(Signal.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).setSignalInfo((Signal) builder.build());
                return this;
            }

            public Builder setStackHistoryBuffer(StackHistoryBuffer.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).setStackHistoryBuffer((StackHistoryBuffer) builder.build());
                return this;
            }

            public Builder addCauses(Cause.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).addCauses((Cause) builder.build());
                return this;
            }

            public Builder addCrashDetails(CrashDetail.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).addCrashDetails((CrashDetail) builder.build());
                return this;
            }

            public Builder addLogBuffers(LogBuffer.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).addLogBuffers((LogBuffer) builder.build());
                return this;
            }

            public Builder addMemoryMappings(MemoryMapping.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).addMemoryMappings((MemoryMapping) builder.build());
                return this;
            }

            public Builder addOpenFds(FD.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).addOpenFds((FD) builder.build());
                return this;
            }

            public Builder addCauses(int i10, Cause.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).addCauses(i10, (Cause) builder.build());
                return this;
            }

            public Builder addCrashDetails(int i10, CrashDetail.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).addCrashDetails(i10, (CrashDetail) builder.build());
                return this;
            }

            public Builder addLogBuffers(int i10, LogBuffer.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).addLogBuffers(i10, (LogBuffer) builder.build());
                return this;
            }

            public Builder addMemoryMappings(int i10, MemoryMapping.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).addMemoryMappings(i10, (MemoryMapping) builder.build());
                return this;
            }

            public Builder addOpenFds(int i10, FD.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).addOpenFds(i10, (FD) builder.build());
                return this;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class GuestThreadsDefaultEntryHolder {
            static final Z defaultEntry = Z.d(Q0.b.UINT32, 0, Q0.b.MESSAGE, Thread.getDefaultInstance());

            private GuestThreadsDefaultEntryHolder() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class ThreadsDefaultEntryHolder {
            static final Z defaultEntry = Z.d(Q0.b.UINT32, 0, Q0.b.MESSAGE, Thread.getDefaultInstance());

            private ThreadsDefaultEntryHolder() {
            }
        }

        static {
            Tombstone tombstone = new Tombstone();
            DEFAULT_INSTANCE = tombstone;
            GeneratedMessageLite.registerDefaultInstance(Tombstone.class, tombstone);
        }

        private Tombstone() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCauses(Iterable<? extends Cause> iterable) {
            ensureCausesIsMutable();
            AbstractC3704a.addAll((Iterable) iterable, (List) this.causes_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCommandLine(Iterable<String> iterable) {
            ensureCommandLineIsMutable();
            AbstractC3704a.addAll((Iterable) iterable, (List) this.commandLine_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCrashDetails(Iterable<? extends CrashDetail> iterable) {
            ensureCrashDetailsIsMutable();
            AbstractC3704a.addAll((Iterable) iterable, (List) this.crashDetails_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLogBuffers(Iterable<? extends LogBuffer> iterable) {
            ensureLogBuffersIsMutable();
            AbstractC3704a.addAll((Iterable) iterable, (List) this.logBuffers_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMemoryMappings(Iterable<? extends MemoryMapping> iterable) {
            ensureMemoryMappingsIsMutable();
            AbstractC3704a.addAll((Iterable) iterable, (List) this.memoryMappings_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOpenFds(Iterable<? extends FD> iterable) {
            ensureOpenFdsIsMutable();
            AbstractC3704a.addAll((Iterable) iterable, (List) this.openFds_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCauses(Cause cause) {
            cause.getClass();
            ensureCausesIsMutable();
            this.causes_.add(cause);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCommandLine(String str) {
            str.getClass();
            ensureCommandLineIsMutable();
            this.commandLine_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCommandLineBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            ensureCommandLineIsMutable();
            this.commandLine_.add(abstractC3722j.J());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCrashDetails(CrashDetail crashDetail) {
            crashDetail.getClass();
            ensureCrashDetailsIsMutable();
            this.crashDetails_.add(crashDetail);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLogBuffers(LogBuffer logBuffer) {
            logBuffer.getClass();
            ensureLogBuffersIsMutable();
            this.logBuffers_.add(logBuffer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMemoryMappings(MemoryMapping memoryMapping) {
            memoryMapping.getClass();
            ensureMemoryMappingsIsMutable();
            this.memoryMappings_.add(memoryMapping);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOpenFds(FD fd2) {
            fd2.getClass();
            ensureOpenFdsIsMutable();
            this.openFds_.add(fd2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAbortMessage() {
            this.abortMessage_ = getDefaultInstance().getAbortMessage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearArch() {
            this.arch_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBuildFingerprint() {
            this.buildFingerprint_ = getDefaultInstance().getBuildFingerprint();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCauses() {
            this.causes_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCommandLine() {
            this.commandLine_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCrashDetails() {
            this.crashDetails_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGuestArch() {
            this.guestArch_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHasBeen16KbMode() {
            this.hasBeen16KbMode_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLogBuffers() {
            this.logBuffers_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMemoryMappings() {
            this.memoryMappings_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOpenFds() {
            this.openFds_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPageSize() {
            this.pageSize_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPid() {
            this.pid_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProcessUptime() {
            this.processUptime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRevision() {
            this.revision_ = getDefaultInstance().getRevision();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSelinuxLabel() {
            this.selinuxLabel_ = getDefaultInstance().getSelinuxLabel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSignalInfo() {
            this.signalInfo_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStackHistoryBuffer() {
            this.stackHistoryBuffer_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTid() {
            this.tid_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestamp() {
            this.timestamp_ = getDefaultInstance().getTimestamp();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUid() {
            this.uid_ = 0;
        }

        private void ensureCausesIsMutable() {
            N.j jVar = this.causes_;
            if (jVar.m()) {
                return;
            }
            this.causes_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        private void ensureCommandLineIsMutable() {
            N.j jVar = this.commandLine_;
            if (jVar.m()) {
                return;
            }
            this.commandLine_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        private void ensureCrashDetailsIsMutable() {
            N.j jVar = this.crashDetails_;
            if (jVar.m()) {
                return;
            }
            this.crashDetails_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        private void ensureLogBuffersIsMutable() {
            N.j jVar = this.logBuffers_;
            if (jVar.m()) {
                return;
            }
            this.logBuffers_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        private void ensureMemoryMappingsIsMutable() {
            N.j jVar = this.memoryMappings_;
            if (jVar.m()) {
                return;
            }
            this.memoryMappings_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        private void ensureOpenFdsIsMutable() {
            N.j jVar = this.openFds_;
            if (jVar.m()) {
                return;
            }
            this.openFds_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        public static Tombstone getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<Integer, Thread> getMutableGuestThreadsMap() {
            return internalGetMutableGuestThreads();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<Integer, Thread> getMutableThreadsMap() {
            return internalGetMutableThreads();
        }

        private C3705a0 internalGetGuestThreads() {
            return this.guestThreads_;
        }

        private C3705a0 internalGetMutableGuestThreads() {
            if (!this.guestThreads_.o()) {
                this.guestThreads_ = this.guestThreads_.r();
            }
            return this.guestThreads_;
        }

        private C3705a0 internalGetMutableThreads() {
            if (!this.threads_.o()) {
                this.threads_ = this.threads_.r();
            }
            return this.threads_;
        }

        private C3705a0 internalGetThreads() {
            return this.threads_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSignalInfo(Signal signal) {
            signal.getClass();
            Signal signal2 = this.signalInfo_;
            if (signal2 == null || signal2 == Signal.getDefaultInstance()) {
                this.signalInfo_ = signal;
            } else {
                this.signalInfo_ = (Signal) ((Signal.Builder) Signal.newBuilder(this.signalInfo_).mergeFrom((GeneratedMessageLite) signal)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStackHistoryBuffer(StackHistoryBuffer stackHistoryBuffer) {
            stackHistoryBuffer.getClass();
            StackHistoryBuffer stackHistoryBuffer2 = this.stackHistoryBuffer_;
            if (stackHistoryBuffer2 == null || stackHistoryBuffer2 == StackHistoryBuffer.getDefaultInstance()) {
                this.stackHistoryBuffer_ = stackHistoryBuffer;
            } else {
                this.stackHistoryBuffer_ = (StackHistoryBuffer) ((StackHistoryBuffer.Builder) StackHistoryBuffer.newBuilder(this.stackHistoryBuffer_).mergeFrom((GeneratedMessageLite) stackHistoryBuffer)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Tombstone parseDelimitedFrom(InputStream inputStream) {
            return (Tombstone) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Tombstone parseFrom(ByteBuffer byteBuffer) {
            return (Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeCauses(int i10) {
            ensureCausesIsMutable();
            this.causes_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeCrashDetails(int i10) {
            ensureCrashDetailsIsMutable();
            this.crashDetails_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeLogBuffers(int i10) {
            ensureLogBuffersIsMutable();
            this.logBuffers_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMemoryMappings(int i10) {
            ensureMemoryMappingsIsMutable();
            this.memoryMappings_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeOpenFds(int i10) {
            ensureOpenFdsIsMutable();
            this.openFds_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAbortMessage(String str) {
            str.getClass();
            this.abortMessage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAbortMessageBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.abortMessage_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setArch(Architecture architecture) {
            this.arch_ = architecture.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setArchValue(int i10) {
            this.arch_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildFingerprint(String str) {
            str.getClass();
            this.buildFingerprint_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildFingerprintBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.buildFingerprint_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCauses(int i10, Cause cause) {
            cause.getClass();
            ensureCausesIsMutable();
            this.causes_.set(i10, cause);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCommandLine(int i10, String str) {
            str.getClass();
            ensureCommandLineIsMutable();
            this.commandLine_.set(i10, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCrashDetails(int i10, CrashDetail crashDetail) {
            crashDetail.getClass();
            ensureCrashDetailsIsMutable();
            this.crashDetails_.set(i10, crashDetail);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGuestArch(Architecture architecture) {
            this.guestArch_ = architecture.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGuestArchValue(int i10) {
            this.guestArch_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHasBeen16KbMode(boolean z10) {
            this.hasBeen16KbMode_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLogBuffers(int i10, LogBuffer logBuffer) {
            logBuffer.getClass();
            ensureLogBuffersIsMutable();
            this.logBuffers_.set(i10, logBuffer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMemoryMappings(int i10, MemoryMapping memoryMapping) {
            memoryMapping.getClass();
            ensureMemoryMappingsIsMutable();
            this.memoryMappings_.set(i10, memoryMapping);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpenFds(int i10, FD fd2) {
            fd2.getClass();
            ensureOpenFdsIsMutable();
            this.openFds_.set(i10, fd2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPageSize(int i10) {
            this.pageSize_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPid(int i10) {
            this.pid_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProcessUptime(int i10) {
            this.processUptime_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRevision(String str) {
            str.getClass();
            this.revision_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRevisionBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.revision_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSelinuxLabel(String str) {
            str.getClass();
            this.selinuxLabel_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSelinuxLabelBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.selinuxLabel_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSignalInfo(Signal signal) {
            signal.getClass();
            this.signalInfo_ = signal;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStackHistoryBuffer(StackHistoryBuffer stackHistoryBuffer) {
            stackHistoryBuffer.getClass();
            this.stackHistoryBuffer_ = stackHistoryBuffer;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTid(int i10) {
            this.tid_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamp(String str) {
            str.getClass();
            this.timestamp_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestampBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.timestamp_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUid(int i10) {
            this.uid_ = i10;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public boolean containsGuestThreads(int i10) {
            return internalGetGuestThreads().containsKey(Integer.valueOf(i10));
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public boolean containsThreads(int i10) {
            return internalGetThreads().containsKey(Integer.valueOf(i10));
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()]) {
                case 1:
                    return new Tombstone();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0017\u0000\u0001\u0001\u001a\u0017\u0002\u0006\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u000b\u0006\u000b\u0007\u000b\bȈ\tȚ\nဉ\u0000\u000eȈ\u000f\u001b\u00102\u0011\u001b\u0012\u001b\u0013\u001b\u0014\u000b\u0015\u001b\u0016\u000b\u0017\u0007\u0018\f\u00192\u001aဉ\u0001", new Object[]{"bitField0_", "arch_", "buildFingerprint_", "revision_", "timestamp_", "pid_", "tid_", "uid_", "selinuxLabel_", "commandLine_", "signalInfo_", "abortMessage_", "causes_", Cause.class, "threads_", ThreadsDefaultEntryHolder.defaultEntry, "memoryMappings_", MemoryMapping.class, "logBuffers_", LogBuffer.class, "openFds_", FD.class, "processUptime_", "crashDetails_", CrashDetail.class, "pageSize_", "hasBeen16KbMode_", "guestArch_", "guestThreads_", GuestThreadsDefaultEntryHolder.defaultEntry, "stackHistoryBuffer_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (Tombstone.class) {
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

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public String getAbortMessage() {
            return this.abortMessage_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public AbstractC3722j getAbortMessageBytes() {
            return AbstractC3722j.n(this.abortMessage_);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public Architecture getArch() {
            Architecture architectureForNumber = Architecture.forNumber(this.arch_);
            return architectureForNumber == null ? Architecture.UNRECOGNIZED : architectureForNumber;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public int getArchValue() {
            return this.arch_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public String getBuildFingerprint() {
            return this.buildFingerprint_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public AbstractC3722j getBuildFingerprintBytes() {
            return AbstractC3722j.n(this.buildFingerprint_);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public Cause getCauses(int i10) {
            return (Cause) this.causes_.get(i10);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public int getCausesCount() {
            return this.causes_.size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public List<Cause> getCausesList() {
            return this.causes_;
        }

        public CauseOrBuilder getCausesOrBuilder(int i10) {
            return (CauseOrBuilder) this.causes_.get(i10);
        }

        public List<? extends CauseOrBuilder> getCausesOrBuilderList() {
            return this.causes_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public String getCommandLine(int i10) {
            return (String) this.commandLine_.get(i10);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public AbstractC3722j getCommandLineBytes(int i10) {
            return AbstractC3722j.n((String) this.commandLine_.get(i10));
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public int getCommandLineCount() {
            return this.commandLine_.size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public List<String> getCommandLineList() {
            return this.commandLine_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public CrashDetail getCrashDetails(int i10) {
            return (CrashDetail) this.crashDetails_.get(i10);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public int getCrashDetailsCount() {
            return this.crashDetails_.size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public List<CrashDetail> getCrashDetailsList() {
            return this.crashDetails_;
        }

        public CrashDetailOrBuilder getCrashDetailsOrBuilder(int i10) {
            return (CrashDetailOrBuilder) this.crashDetails_.get(i10);
        }

        public List<? extends CrashDetailOrBuilder> getCrashDetailsOrBuilderList() {
            return this.crashDetails_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public Architecture getGuestArch() {
            Architecture architectureForNumber = Architecture.forNumber(this.guestArch_);
            return architectureForNumber == null ? Architecture.UNRECOGNIZED : architectureForNumber;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public int getGuestArchValue() {
            return this.guestArch_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        @Deprecated
        public Map<Integer, Thread> getGuestThreads() {
            return getGuestThreadsMap();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public int getGuestThreadsCount() {
            return internalGetGuestThreads().size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public Map<Integer, Thread> getGuestThreadsMap() {
            return Collections.unmodifiableMap(internalGetGuestThreads());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public Thread getGuestThreadsOrDefault(int i10, Thread thread) {
            C3705a0 c3705a0InternalGetGuestThreads = internalGetGuestThreads();
            return c3705a0InternalGetGuestThreads.containsKey(Integer.valueOf(i10)) ? (Thread) c3705a0InternalGetGuestThreads.get(Integer.valueOf(i10)) : thread;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public Thread getGuestThreadsOrThrow(int i10) {
            C3705a0 c3705a0InternalGetGuestThreads = internalGetGuestThreads();
            if (c3705a0InternalGetGuestThreads.containsKey(Integer.valueOf(i10))) {
                return (Thread) c3705a0InternalGetGuestThreads.get(Integer.valueOf(i10));
            }
            throw new IllegalArgumentException();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public boolean getHasBeen16KbMode() {
            return this.hasBeen16KbMode_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public LogBuffer getLogBuffers(int i10) {
            return (LogBuffer) this.logBuffers_.get(i10);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public int getLogBuffersCount() {
            return this.logBuffers_.size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public List<LogBuffer> getLogBuffersList() {
            return this.logBuffers_;
        }

        public LogBufferOrBuilder getLogBuffersOrBuilder(int i10) {
            return (LogBufferOrBuilder) this.logBuffers_.get(i10);
        }

        public List<? extends LogBufferOrBuilder> getLogBuffersOrBuilderList() {
            return this.logBuffers_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public MemoryMapping getMemoryMappings(int i10) {
            return (MemoryMapping) this.memoryMappings_.get(i10);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public int getMemoryMappingsCount() {
            return this.memoryMappings_.size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public List<MemoryMapping> getMemoryMappingsList() {
            return this.memoryMappings_;
        }

        public MemoryMappingOrBuilder getMemoryMappingsOrBuilder(int i10) {
            return (MemoryMappingOrBuilder) this.memoryMappings_.get(i10);
        }

        public List<? extends MemoryMappingOrBuilder> getMemoryMappingsOrBuilderList() {
            return this.memoryMappings_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public FD getOpenFds(int i10) {
            return (FD) this.openFds_.get(i10);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public int getOpenFdsCount() {
            return this.openFds_.size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public List<FD> getOpenFdsList() {
            return this.openFds_;
        }

        public FDOrBuilder getOpenFdsOrBuilder(int i10) {
            return (FDOrBuilder) this.openFds_.get(i10);
        }

        public List<? extends FDOrBuilder> getOpenFdsOrBuilderList() {
            return this.openFds_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public int getPageSize() {
            return this.pageSize_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public int getPid() {
            return this.pid_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public int getProcessUptime() {
            return this.processUptime_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public String getRevision() {
            return this.revision_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public AbstractC3722j getRevisionBytes() {
            return AbstractC3722j.n(this.revision_);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public String getSelinuxLabel() {
            return this.selinuxLabel_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public AbstractC3722j getSelinuxLabelBytes() {
            return AbstractC3722j.n(this.selinuxLabel_);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public Signal getSignalInfo() {
            Signal signal = this.signalInfo_;
            return signal == null ? Signal.getDefaultInstance() : signal;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public StackHistoryBuffer getStackHistoryBuffer() {
            StackHistoryBuffer stackHistoryBuffer = this.stackHistoryBuffer_;
            return stackHistoryBuffer == null ? StackHistoryBuffer.getDefaultInstance() : stackHistoryBuffer;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        @Deprecated
        public Map<Integer, Thread> getThreads() {
            return getThreadsMap();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public int getThreadsCount() {
            return internalGetThreads().size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public Map<Integer, Thread> getThreadsMap() {
            return Collections.unmodifiableMap(internalGetThreads());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public Thread getThreadsOrDefault(int i10, Thread thread) {
            C3705a0 c3705a0InternalGetThreads = internalGetThreads();
            return c3705a0InternalGetThreads.containsKey(Integer.valueOf(i10)) ? (Thread) c3705a0InternalGetThreads.get(Integer.valueOf(i10)) : thread;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public Thread getThreadsOrThrow(int i10) {
            C3705a0 c3705a0InternalGetThreads = internalGetThreads();
            if (c3705a0InternalGetThreads.containsKey(Integer.valueOf(i10))) {
                return (Thread) c3705a0InternalGetThreads.get(Integer.valueOf(i10));
            }
            throw new IllegalArgumentException();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public int getTid() {
            return this.tid_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public String getTimestamp() {
            return this.timestamp_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public AbstractC3722j getTimestampBytes() {
            return AbstractC3722j.n(this.timestamp_);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public int getUid() {
            return this.uid_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public boolean hasSignalInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public boolean hasStackHistoryBuffer() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(Tombstone tombstone) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tombstone);
        }

        public static Tombstone parseDelimitedFrom(InputStream inputStream, D d10) {
            return (Tombstone) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static Tombstone parseFrom(ByteBuffer byteBuffer, D d10) {
            return (Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static Tombstone parseFrom(AbstractC3722j abstractC3722j) {
            return (Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCauses(int i10, Cause cause) {
            cause.getClass();
            ensureCausesIsMutable();
            this.causes_.add(i10, cause);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCrashDetails(int i10, CrashDetail crashDetail) {
            crashDetail.getClass();
            ensureCrashDetailsIsMutable();
            this.crashDetails_.add(i10, crashDetail);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLogBuffers(int i10, LogBuffer logBuffer) {
            logBuffer.getClass();
            ensureLogBuffersIsMutable();
            this.logBuffers_.add(i10, logBuffer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMemoryMappings(int i10, MemoryMapping memoryMapping) {
            memoryMapping.getClass();
            ensureMemoryMappingsIsMutable();
            this.memoryMappings_.add(i10, memoryMapping);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOpenFds(int i10, FD fd2) {
            fd2.getClass();
            ensureOpenFdsIsMutable();
            this.openFds_.add(i10, fd2);
        }

        public static Tombstone parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static Tombstone parseFrom(byte[] bArr) {
            return (Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Tombstone parseFrom(byte[] bArr, D d10) {
            return (Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static Tombstone parseFrom(InputStream inputStream) {
            return (Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Tombstone parseFrom(InputStream inputStream, D d10) {
            return (Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static Tombstone parseFrom(AbstractC3724k abstractC3724k) {
            return (Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static Tombstone parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface TombstoneOrBuilder extends InterfaceC3719h0 {
        boolean containsGuestThreads(int i10);

        boolean containsThreads(int i10);

        String getAbortMessage();

        AbstractC3722j getAbortMessageBytes();

        Architecture getArch();

        int getArchValue();

        String getBuildFingerprint();

        AbstractC3722j getBuildFingerprintBytes();

        Cause getCauses(int i10);

        int getCausesCount();

        List<Cause> getCausesList();

        String getCommandLine(int i10);

        AbstractC3722j getCommandLineBytes(int i10);

        int getCommandLineCount();

        List<String> getCommandLineList();

        CrashDetail getCrashDetails(int i10);

        int getCrashDetailsCount();

        List<CrashDetail> getCrashDetailsList();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        Architecture getGuestArch();

        int getGuestArchValue();

        @Deprecated
        Map<Integer, Thread> getGuestThreads();

        int getGuestThreadsCount();

        Map<Integer, Thread> getGuestThreadsMap();

        Thread getGuestThreadsOrDefault(int i10, Thread thread);

        Thread getGuestThreadsOrThrow(int i10);

        boolean getHasBeen16KbMode();

        LogBuffer getLogBuffers(int i10);

        int getLogBuffersCount();

        List<LogBuffer> getLogBuffersList();

        MemoryMapping getMemoryMappings(int i10);

        int getMemoryMappingsCount();

        List<MemoryMapping> getMemoryMappingsList();

        FD getOpenFds(int i10);

        int getOpenFdsCount();

        List<FD> getOpenFdsList();

        int getPageSize();

        int getPid();

        int getProcessUptime();

        String getRevision();

        AbstractC3722j getRevisionBytes();

        String getSelinuxLabel();

        AbstractC3722j getSelinuxLabelBytes();

        Signal getSignalInfo();

        StackHistoryBuffer getStackHistoryBuffer();

        @Deprecated
        Map<Integer, Thread> getThreads();

        int getThreadsCount();

        Map<Integer, Thread> getThreadsMap();

        Thread getThreadsOrDefault(int i10, Thread thread);

        Thread getThreadsOrThrow(int i10);

        int getTid();

        String getTimestamp();

        AbstractC3722j getTimestampBytes();

        int getUid();

        boolean hasSignalInfo();

        boolean hasStackHistoryBuffer();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    private TombstoneProtos() {
    }

    public static void registerAllExtensions(D d10) {
    }
}
