package com.signify.hue.flutterreactiveble;

import com.google.protobuf.AbstractC3704a;
import com.google.protobuf.AbstractC3722j;
import com.google.protobuf.AbstractC3724k;
import com.google.protobuf.D;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3717g0;
import com.google.protobuf.InterfaceC3719h0;
import com.google.protobuf.N;
import com.google.protobuf.t0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ProtobufModel {

    /* JADX INFO: renamed from: com.signify.hue.flutterreactiveble.ProtobufModel$1, reason: invalid class name */
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
    public static final class BleStatusInfo extends GeneratedMessageLite implements BleStatusInfoOrBuilder {
        private static final BleStatusInfo DEFAULT_INSTANCE;
        private static volatile t0 PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 1;
        private int status_;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements BleStatusInfoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((BleStatusInfo) this.instance).clearStatus();
                return this;
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.BleStatusInfoOrBuilder
            public int getStatus() {
                return ((BleStatusInfo) this.instance).getStatus();
            }

            public Builder setStatus(int i10) {
                copyOnWrite();
                ((BleStatusInfo) this.instance).setStatus(i10);
                return this;
            }

            private Builder() {
                super(BleStatusInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            BleStatusInfo bleStatusInfo = new BleStatusInfo();
            DEFAULT_INSTANCE = bleStatusInfo;
            GeneratedMessageLite.registerDefaultInstance(BleStatusInfo.class, bleStatusInfo);
        }

        private BleStatusInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = 0;
        }

        public static BleStatusInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BleStatusInfo parseDelimitedFrom(InputStream inputStream) {
            return (BleStatusInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BleStatusInfo parseFrom(ByteBuffer byteBuffer) {
            return (BleStatusInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(int i10) {
            this.status_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new BleStatusInfo();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"status_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (BleStatusInfo.class) {
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

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.BleStatusInfoOrBuilder
        public int getStatus() {
            return this.status_;
        }

        public static Builder newBuilder(BleStatusInfo bleStatusInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bleStatusInfo);
        }

        public static BleStatusInfo parseDelimitedFrom(InputStream inputStream, D d10) {
            return (BleStatusInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static BleStatusInfo parseFrom(ByteBuffer byteBuffer, D d10) {
            return (BleStatusInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static BleStatusInfo parseFrom(AbstractC3722j abstractC3722j) {
            return (BleStatusInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static BleStatusInfo parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (BleStatusInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static BleStatusInfo parseFrom(byte[] bArr) {
            return (BleStatusInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BleStatusInfo parseFrom(byte[] bArr, D d10) {
            return (BleStatusInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static BleStatusInfo parseFrom(InputStream inputStream) {
            return (BleStatusInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BleStatusInfo parseFrom(InputStream inputStream, D d10) {
            return (BleStatusInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static BleStatusInfo parseFrom(AbstractC3724k abstractC3724k) {
            return (BleStatusInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static BleStatusInfo parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (BleStatusInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface BleStatusInfoOrBuilder extends InterfaceC3719h0 {
        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        int getStatus();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class ChangeConnectionPriorityInfo extends GeneratedMessageLite implements ChangeConnectionPriorityInfoOrBuilder {
        private static final ChangeConnectionPriorityInfo DEFAULT_INSTANCE;
        public static final int DEVICEID_FIELD_NUMBER = 1;
        public static final int FAILURE_FIELD_NUMBER = 2;
        private static volatile t0 PARSER;
        private int bitField0_;
        private String deviceId_ = "";
        private GenericFailure failure_;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements ChangeConnectionPriorityInfoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearDeviceId() {
                copyOnWrite();
                ((ChangeConnectionPriorityInfo) this.instance).clearDeviceId();
                return this;
            }

            public Builder clearFailure() {
                copyOnWrite();
                ((ChangeConnectionPriorityInfo) this.instance).clearFailure();
                return this;
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ChangeConnectionPriorityInfoOrBuilder
            public String getDeviceId() {
                return ((ChangeConnectionPriorityInfo) this.instance).getDeviceId();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ChangeConnectionPriorityInfoOrBuilder
            public AbstractC3722j getDeviceIdBytes() {
                return ((ChangeConnectionPriorityInfo) this.instance).getDeviceIdBytes();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ChangeConnectionPriorityInfoOrBuilder
            public GenericFailure getFailure() {
                return ((ChangeConnectionPriorityInfo) this.instance).getFailure();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ChangeConnectionPriorityInfoOrBuilder
            public boolean hasFailure() {
                return ((ChangeConnectionPriorityInfo) this.instance).hasFailure();
            }

            public Builder mergeFailure(GenericFailure genericFailure) {
                copyOnWrite();
                ((ChangeConnectionPriorityInfo) this.instance).mergeFailure(genericFailure);
                return this;
            }

            public Builder setDeviceId(String str) {
                copyOnWrite();
                ((ChangeConnectionPriorityInfo) this.instance).setDeviceId(str);
                return this;
            }

            public Builder setDeviceIdBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((ChangeConnectionPriorityInfo) this.instance).setDeviceIdBytes(abstractC3722j);
                return this;
            }

            public Builder setFailure(GenericFailure genericFailure) {
                copyOnWrite();
                ((ChangeConnectionPriorityInfo) this.instance).setFailure(genericFailure);
                return this;
            }

            private Builder() {
                super(ChangeConnectionPriorityInfo.DEFAULT_INSTANCE);
            }

            public Builder setFailure(GenericFailure.Builder builder) {
                copyOnWrite();
                ((ChangeConnectionPriorityInfo) this.instance).setFailure((GenericFailure) builder.build());
                return this;
            }
        }

        static {
            ChangeConnectionPriorityInfo changeConnectionPriorityInfo = new ChangeConnectionPriorityInfo();
            DEFAULT_INSTANCE = changeConnectionPriorityInfo;
            GeneratedMessageLite.registerDefaultInstance(ChangeConnectionPriorityInfo.class, changeConnectionPriorityInfo);
        }

        private ChangeConnectionPriorityInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceId() {
            this.deviceId_ = getDefaultInstance().getDeviceId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFailure() {
            this.failure_ = null;
            this.bitField0_ &= -2;
        }

        public static ChangeConnectionPriorityInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFailure(GenericFailure genericFailure) {
            genericFailure.getClass();
            GenericFailure genericFailure2 = this.failure_;
            if (genericFailure2 == null || genericFailure2 == GenericFailure.getDefaultInstance()) {
                this.failure_ = genericFailure;
            } else {
                this.failure_ = (GenericFailure) ((GenericFailure.Builder) GenericFailure.newBuilder(this.failure_).mergeFrom((GeneratedMessageLite) genericFailure)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ChangeConnectionPriorityInfo parseDelimitedFrom(InputStream inputStream) {
            return (ChangeConnectionPriorityInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChangeConnectionPriorityInfo parseFrom(ByteBuffer byteBuffer) {
            return (ChangeConnectionPriorityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceId(String str) {
            str.getClass();
            this.deviceId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceIdBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.deviceId_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFailure(GenericFailure genericFailure) {
            genericFailure.getClass();
            this.failure_ = genericFailure;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new ChangeConnectionPriorityInfo();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "deviceId_", "failure_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (ChangeConnectionPriorityInfo.class) {
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

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ChangeConnectionPriorityInfoOrBuilder
        public String getDeviceId() {
            return this.deviceId_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ChangeConnectionPriorityInfoOrBuilder
        public AbstractC3722j getDeviceIdBytes() {
            return AbstractC3722j.n(this.deviceId_);
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ChangeConnectionPriorityInfoOrBuilder
        public GenericFailure getFailure() {
            GenericFailure genericFailure = this.failure_;
            return genericFailure == null ? GenericFailure.getDefaultInstance() : genericFailure;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ChangeConnectionPriorityInfoOrBuilder
        public boolean hasFailure() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(ChangeConnectionPriorityInfo changeConnectionPriorityInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(changeConnectionPriorityInfo);
        }

        public static ChangeConnectionPriorityInfo parseDelimitedFrom(InputStream inputStream, D d10) {
            return (ChangeConnectionPriorityInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static ChangeConnectionPriorityInfo parseFrom(ByteBuffer byteBuffer, D d10) {
            return (ChangeConnectionPriorityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static ChangeConnectionPriorityInfo parseFrom(AbstractC3722j abstractC3722j) {
            return (ChangeConnectionPriorityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static ChangeConnectionPriorityInfo parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (ChangeConnectionPriorityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static ChangeConnectionPriorityInfo parseFrom(byte[] bArr) {
            return (ChangeConnectionPriorityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ChangeConnectionPriorityInfo parseFrom(byte[] bArr, D d10) {
            return (ChangeConnectionPriorityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static ChangeConnectionPriorityInfo parseFrom(InputStream inputStream) {
            return (ChangeConnectionPriorityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChangeConnectionPriorityInfo parseFrom(InputStream inputStream, D d10) {
            return (ChangeConnectionPriorityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static ChangeConnectionPriorityInfo parseFrom(AbstractC3724k abstractC3724k) {
            return (ChangeConnectionPriorityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static ChangeConnectionPriorityInfo parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (ChangeConnectionPriorityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface ChangeConnectionPriorityInfoOrBuilder extends InterfaceC3719h0 {
        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        String getDeviceId();

        AbstractC3722j getDeviceIdBytes();

        GenericFailure getFailure();

        boolean hasFailure();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class ChangeConnectionPriorityRequest extends GeneratedMessageLite implements ChangeConnectionPriorityRequestOrBuilder {
        private static final ChangeConnectionPriorityRequest DEFAULT_INSTANCE;
        public static final int DEVICEID_FIELD_NUMBER = 1;
        private static volatile t0 PARSER = null;
        public static final int PRIORITY_FIELD_NUMBER = 2;
        private String deviceId_ = "";
        private int priority_;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements ChangeConnectionPriorityRequestOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearDeviceId() {
                copyOnWrite();
                ((ChangeConnectionPriorityRequest) this.instance).clearDeviceId();
                return this;
            }

            public Builder clearPriority() {
                copyOnWrite();
                ((ChangeConnectionPriorityRequest) this.instance).clearPriority();
                return this;
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ChangeConnectionPriorityRequestOrBuilder
            public String getDeviceId() {
                return ((ChangeConnectionPriorityRequest) this.instance).getDeviceId();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ChangeConnectionPriorityRequestOrBuilder
            public AbstractC3722j getDeviceIdBytes() {
                return ((ChangeConnectionPriorityRequest) this.instance).getDeviceIdBytes();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ChangeConnectionPriorityRequestOrBuilder
            public int getPriority() {
                return ((ChangeConnectionPriorityRequest) this.instance).getPriority();
            }

            public Builder setDeviceId(String str) {
                copyOnWrite();
                ((ChangeConnectionPriorityRequest) this.instance).setDeviceId(str);
                return this;
            }

            public Builder setDeviceIdBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((ChangeConnectionPriorityRequest) this.instance).setDeviceIdBytes(abstractC3722j);
                return this;
            }

            public Builder setPriority(int i10) {
                copyOnWrite();
                ((ChangeConnectionPriorityRequest) this.instance).setPriority(i10);
                return this;
            }

            private Builder() {
                super(ChangeConnectionPriorityRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            ChangeConnectionPriorityRequest changeConnectionPriorityRequest = new ChangeConnectionPriorityRequest();
            DEFAULT_INSTANCE = changeConnectionPriorityRequest;
            GeneratedMessageLite.registerDefaultInstance(ChangeConnectionPriorityRequest.class, changeConnectionPriorityRequest);
        }

        private ChangeConnectionPriorityRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceId() {
            this.deviceId_ = getDefaultInstance().getDeviceId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPriority() {
            this.priority_ = 0;
        }

        public static ChangeConnectionPriorityRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ChangeConnectionPriorityRequest parseDelimitedFrom(InputStream inputStream) {
            return (ChangeConnectionPriorityRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChangeConnectionPriorityRequest parseFrom(ByteBuffer byteBuffer) {
            return (ChangeConnectionPriorityRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceId(String str) {
            str.getClass();
            this.deviceId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceIdBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.deviceId_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPriority(int i10) {
            this.priority_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new ChangeConnectionPriorityRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"deviceId_", "priority_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (ChangeConnectionPriorityRequest.class) {
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

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ChangeConnectionPriorityRequestOrBuilder
        public String getDeviceId() {
            return this.deviceId_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ChangeConnectionPriorityRequestOrBuilder
        public AbstractC3722j getDeviceIdBytes() {
            return AbstractC3722j.n(this.deviceId_);
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ChangeConnectionPriorityRequestOrBuilder
        public int getPriority() {
            return this.priority_;
        }

        public static Builder newBuilder(ChangeConnectionPriorityRequest changeConnectionPriorityRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(changeConnectionPriorityRequest);
        }

        public static ChangeConnectionPriorityRequest parseDelimitedFrom(InputStream inputStream, D d10) {
            return (ChangeConnectionPriorityRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static ChangeConnectionPriorityRequest parseFrom(ByteBuffer byteBuffer, D d10) {
            return (ChangeConnectionPriorityRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static ChangeConnectionPriorityRequest parseFrom(AbstractC3722j abstractC3722j) {
            return (ChangeConnectionPriorityRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static ChangeConnectionPriorityRequest parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (ChangeConnectionPriorityRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static ChangeConnectionPriorityRequest parseFrom(byte[] bArr) {
            return (ChangeConnectionPriorityRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ChangeConnectionPriorityRequest parseFrom(byte[] bArr, D d10) {
            return (ChangeConnectionPriorityRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static ChangeConnectionPriorityRequest parseFrom(InputStream inputStream) {
            return (ChangeConnectionPriorityRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChangeConnectionPriorityRequest parseFrom(InputStream inputStream, D d10) {
            return (ChangeConnectionPriorityRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static ChangeConnectionPriorityRequest parseFrom(AbstractC3724k abstractC3724k) {
            return (ChangeConnectionPriorityRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static ChangeConnectionPriorityRequest parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (ChangeConnectionPriorityRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface ChangeConnectionPriorityRequestOrBuilder extends InterfaceC3719h0 {
        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        String getDeviceId();

        AbstractC3722j getDeviceIdBytes();

        int getPriority();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class CharacteristicAddress extends GeneratedMessageLite implements CharacteristicAddressOrBuilder {
        public static final int CHARACTERISTICINSTANCEID_FIELD_NUMBER = 5;
        public static final int CHARACTERISTICUUID_FIELD_NUMBER = 3;
        private static final CharacteristicAddress DEFAULT_INSTANCE;
        public static final int DEVICEID_FIELD_NUMBER = 1;
        private static volatile t0 PARSER = null;
        public static final int SERVICEINSTANCEID_FIELD_NUMBER = 4;
        public static final int SERVICEUUID_FIELD_NUMBER = 2;
        private int bitField0_;
        private Uuid characteristicUuid_;
        private Uuid serviceUuid_;
        private String deviceId_ = "";
        private String serviceInstanceId_ = "";
        private String characteristicInstanceId_ = "";

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements CharacteristicAddressOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearCharacteristicInstanceId() {
                copyOnWrite();
                ((CharacteristicAddress) this.instance).clearCharacteristicInstanceId();
                return this;
            }

            public Builder clearCharacteristicUuid() {
                copyOnWrite();
                ((CharacteristicAddress) this.instance).clearCharacteristicUuid();
                return this;
            }

            public Builder clearDeviceId() {
                copyOnWrite();
                ((CharacteristicAddress) this.instance).clearDeviceId();
                return this;
            }

            public Builder clearServiceInstanceId() {
                copyOnWrite();
                ((CharacteristicAddress) this.instance).clearServiceInstanceId();
                return this;
            }

            public Builder clearServiceUuid() {
                copyOnWrite();
                ((CharacteristicAddress) this.instance).clearServiceUuid();
                return this;
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.CharacteristicAddressOrBuilder
            public String getCharacteristicInstanceId() {
                return ((CharacteristicAddress) this.instance).getCharacteristicInstanceId();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.CharacteristicAddressOrBuilder
            public AbstractC3722j getCharacteristicInstanceIdBytes() {
                return ((CharacteristicAddress) this.instance).getCharacteristicInstanceIdBytes();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.CharacteristicAddressOrBuilder
            public Uuid getCharacteristicUuid() {
                return ((CharacteristicAddress) this.instance).getCharacteristicUuid();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.CharacteristicAddressOrBuilder
            public String getDeviceId() {
                return ((CharacteristicAddress) this.instance).getDeviceId();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.CharacteristicAddressOrBuilder
            public AbstractC3722j getDeviceIdBytes() {
                return ((CharacteristicAddress) this.instance).getDeviceIdBytes();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.CharacteristicAddressOrBuilder
            public String getServiceInstanceId() {
                return ((CharacteristicAddress) this.instance).getServiceInstanceId();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.CharacteristicAddressOrBuilder
            public AbstractC3722j getServiceInstanceIdBytes() {
                return ((CharacteristicAddress) this.instance).getServiceInstanceIdBytes();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.CharacteristicAddressOrBuilder
            public Uuid getServiceUuid() {
                return ((CharacteristicAddress) this.instance).getServiceUuid();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.CharacteristicAddressOrBuilder
            public boolean hasCharacteristicUuid() {
                return ((CharacteristicAddress) this.instance).hasCharacteristicUuid();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.CharacteristicAddressOrBuilder
            public boolean hasServiceUuid() {
                return ((CharacteristicAddress) this.instance).hasServiceUuid();
            }

            public Builder mergeCharacteristicUuid(Uuid uuid) {
                copyOnWrite();
                ((CharacteristicAddress) this.instance).mergeCharacteristicUuid(uuid);
                return this;
            }

            public Builder mergeServiceUuid(Uuid uuid) {
                copyOnWrite();
                ((CharacteristicAddress) this.instance).mergeServiceUuid(uuid);
                return this;
            }

            public Builder setCharacteristicInstanceId(String str) {
                copyOnWrite();
                ((CharacteristicAddress) this.instance).setCharacteristicInstanceId(str);
                return this;
            }

            public Builder setCharacteristicInstanceIdBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((CharacteristicAddress) this.instance).setCharacteristicInstanceIdBytes(abstractC3722j);
                return this;
            }

            public Builder setCharacteristicUuid(Uuid uuid) {
                copyOnWrite();
                ((CharacteristicAddress) this.instance).setCharacteristicUuid(uuid);
                return this;
            }

            public Builder setDeviceId(String str) {
                copyOnWrite();
                ((CharacteristicAddress) this.instance).setDeviceId(str);
                return this;
            }

            public Builder setDeviceIdBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((CharacteristicAddress) this.instance).setDeviceIdBytes(abstractC3722j);
                return this;
            }

            public Builder setServiceInstanceId(String str) {
                copyOnWrite();
                ((CharacteristicAddress) this.instance).setServiceInstanceId(str);
                return this;
            }

            public Builder setServiceInstanceIdBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((CharacteristicAddress) this.instance).setServiceInstanceIdBytes(abstractC3722j);
                return this;
            }

            public Builder setServiceUuid(Uuid uuid) {
                copyOnWrite();
                ((CharacteristicAddress) this.instance).setServiceUuid(uuid);
                return this;
            }

            private Builder() {
                super(CharacteristicAddress.DEFAULT_INSTANCE);
            }

            public Builder setCharacteristicUuid(Uuid.Builder builder) {
                copyOnWrite();
                ((CharacteristicAddress) this.instance).setCharacteristicUuid((Uuid) builder.build());
                return this;
            }

            public Builder setServiceUuid(Uuid.Builder builder) {
                copyOnWrite();
                ((CharacteristicAddress) this.instance).setServiceUuid((Uuid) builder.build());
                return this;
            }
        }

        static {
            CharacteristicAddress characteristicAddress = new CharacteristicAddress();
            DEFAULT_INSTANCE = characteristicAddress;
            GeneratedMessageLite.registerDefaultInstance(CharacteristicAddress.class, characteristicAddress);
        }

        private CharacteristicAddress() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCharacteristicInstanceId() {
            this.characteristicInstanceId_ = getDefaultInstance().getCharacteristicInstanceId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCharacteristicUuid() {
            this.characteristicUuid_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceId() {
            this.deviceId_ = getDefaultInstance().getDeviceId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServiceInstanceId() {
            this.serviceInstanceId_ = getDefaultInstance().getServiceInstanceId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServiceUuid() {
            this.serviceUuid_ = null;
            this.bitField0_ &= -2;
        }

        public static CharacteristicAddress getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCharacteristicUuid(Uuid uuid) {
            uuid.getClass();
            Uuid uuid2 = this.characteristicUuid_;
            if (uuid2 == null || uuid2 == Uuid.getDefaultInstance()) {
                this.characteristicUuid_ = uuid;
            } else {
                this.characteristicUuid_ = (Uuid) ((Uuid.Builder) Uuid.newBuilder(this.characteristicUuid_).mergeFrom((GeneratedMessageLite) uuid)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeServiceUuid(Uuid uuid) {
            uuid.getClass();
            Uuid uuid2 = this.serviceUuid_;
            if (uuid2 == null || uuid2 == Uuid.getDefaultInstance()) {
                this.serviceUuid_ = uuid;
            } else {
                this.serviceUuid_ = (Uuid) ((Uuid.Builder) Uuid.newBuilder(this.serviceUuid_).mergeFrom((GeneratedMessageLite) uuid)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static CharacteristicAddress parseDelimitedFrom(InputStream inputStream) {
            return (CharacteristicAddress) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CharacteristicAddress parseFrom(ByteBuffer byteBuffer) {
            return (CharacteristicAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCharacteristicInstanceId(String str) {
            str.getClass();
            this.characteristicInstanceId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCharacteristicInstanceIdBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.characteristicInstanceId_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCharacteristicUuid(Uuid uuid) {
            uuid.getClass();
            this.characteristicUuid_ = uuid;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceId(String str) {
            str.getClass();
            this.deviceId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceIdBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.deviceId_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServiceInstanceId(String str) {
            str.getClass();
            this.serviceInstanceId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServiceInstanceIdBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.serviceInstanceId_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServiceUuid(Uuid uuid) {
            uuid.getClass();
            this.serviceUuid_ = uuid;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new CharacteristicAddress();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004Ȉ\u0005Ȉ", new Object[]{"bitField0_", "deviceId_", "serviceUuid_", "characteristicUuid_", "serviceInstanceId_", "characteristicInstanceId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (CharacteristicAddress.class) {
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

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.CharacteristicAddressOrBuilder
        public String getCharacteristicInstanceId() {
            return this.characteristicInstanceId_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.CharacteristicAddressOrBuilder
        public AbstractC3722j getCharacteristicInstanceIdBytes() {
            return AbstractC3722j.n(this.characteristicInstanceId_);
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.CharacteristicAddressOrBuilder
        public Uuid getCharacteristicUuid() {
            Uuid uuid = this.characteristicUuid_;
            return uuid == null ? Uuid.getDefaultInstance() : uuid;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.CharacteristicAddressOrBuilder
        public String getDeviceId() {
            return this.deviceId_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.CharacteristicAddressOrBuilder
        public AbstractC3722j getDeviceIdBytes() {
            return AbstractC3722j.n(this.deviceId_);
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.CharacteristicAddressOrBuilder
        public String getServiceInstanceId() {
            return this.serviceInstanceId_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.CharacteristicAddressOrBuilder
        public AbstractC3722j getServiceInstanceIdBytes() {
            return AbstractC3722j.n(this.serviceInstanceId_);
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.CharacteristicAddressOrBuilder
        public Uuid getServiceUuid() {
            Uuid uuid = this.serviceUuid_;
            return uuid == null ? Uuid.getDefaultInstance() : uuid;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.CharacteristicAddressOrBuilder
        public boolean hasCharacteristicUuid() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.CharacteristicAddressOrBuilder
        public boolean hasServiceUuid() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(CharacteristicAddress characteristicAddress) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(characteristicAddress);
        }

        public static CharacteristicAddress parseDelimitedFrom(InputStream inputStream, D d10) {
            return (CharacteristicAddress) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static CharacteristicAddress parseFrom(ByteBuffer byteBuffer, D d10) {
            return (CharacteristicAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static CharacteristicAddress parseFrom(AbstractC3722j abstractC3722j) {
            return (CharacteristicAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static CharacteristicAddress parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (CharacteristicAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static CharacteristicAddress parseFrom(byte[] bArr) {
            return (CharacteristicAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CharacteristicAddress parseFrom(byte[] bArr, D d10) {
            return (CharacteristicAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static CharacteristicAddress parseFrom(InputStream inputStream) {
            return (CharacteristicAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CharacteristicAddress parseFrom(InputStream inputStream, D d10) {
            return (CharacteristicAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static CharacteristicAddress parseFrom(AbstractC3724k abstractC3724k) {
            return (CharacteristicAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static CharacteristicAddress parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (CharacteristicAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface CharacteristicAddressOrBuilder extends InterfaceC3719h0 {
        String getCharacteristicInstanceId();

        AbstractC3722j getCharacteristicInstanceIdBytes();

        Uuid getCharacteristicUuid();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        String getDeviceId();

        AbstractC3722j getDeviceIdBytes();

        String getServiceInstanceId();

        AbstractC3722j getServiceInstanceIdBytes();

        Uuid getServiceUuid();

        boolean hasCharacteristicUuid();

        boolean hasServiceUuid();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class CharacteristicValueInfo extends GeneratedMessageLite implements CharacteristicValueInfoOrBuilder {
        public static final int CHARACTERISTIC_FIELD_NUMBER = 1;
        private static final CharacteristicValueInfo DEFAULT_INSTANCE;
        public static final int FAILURE_FIELD_NUMBER = 3;
        private static volatile t0 PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 2;
        private int bitField0_;
        private CharacteristicAddress characteristic_;
        private GenericFailure failure_;
        private AbstractC3722j value_ = AbstractC3722j.f32236b;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements CharacteristicValueInfoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearCharacteristic() {
                copyOnWrite();
                ((CharacteristicValueInfo) this.instance).clearCharacteristic();
                return this;
            }

            public Builder clearFailure() {
                copyOnWrite();
                ((CharacteristicValueInfo) this.instance).clearFailure();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((CharacteristicValueInfo) this.instance).clearValue();
                return this;
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.CharacteristicValueInfoOrBuilder
            public CharacteristicAddress getCharacteristic() {
                return ((CharacteristicValueInfo) this.instance).getCharacteristic();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.CharacteristicValueInfoOrBuilder
            public GenericFailure getFailure() {
                return ((CharacteristicValueInfo) this.instance).getFailure();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.CharacteristicValueInfoOrBuilder
            public AbstractC3722j getValue() {
                return ((CharacteristicValueInfo) this.instance).getValue();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.CharacteristicValueInfoOrBuilder
            public boolean hasCharacteristic() {
                return ((CharacteristicValueInfo) this.instance).hasCharacteristic();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.CharacteristicValueInfoOrBuilder
            public boolean hasFailure() {
                return ((CharacteristicValueInfo) this.instance).hasFailure();
            }

            public Builder mergeCharacteristic(CharacteristicAddress characteristicAddress) {
                copyOnWrite();
                ((CharacteristicValueInfo) this.instance).mergeCharacteristic(characteristicAddress);
                return this;
            }

            public Builder mergeFailure(GenericFailure genericFailure) {
                copyOnWrite();
                ((CharacteristicValueInfo) this.instance).mergeFailure(genericFailure);
                return this;
            }

            public Builder setCharacteristic(CharacteristicAddress characteristicAddress) {
                copyOnWrite();
                ((CharacteristicValueInfo) this.instance).setCharacteristic(characteristicAddress);
                return this;
            }

            public Builder setFailure(GenericFailure genericFailure) {
                copyOnWrite();
                ((CharacteristicValueInfo) this.instance).setFailure(genericFailure);
                return this;
            }

            public Builder setValue(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((CharacteristicValueInfo) this.instance).setValue(abstractC3722j);
                return this;
            }

            private Builder() {
                super(CharacteristicValueInfo.DEFAULT_INSTANCE);
            }

            public Builder setCharacteristic(CharacteristicAddress.Builder builder) {
                copyOnWrite();
                ((CharacteristicValueInfo) this.instance).setCharacteristic((CharacteristicAddress) builder.build());
                return this;
            }

            public Builder setFailure(GenericFailure.Builder builder) {
                copyOnWrite();
                ((CharacteristicValueInfo) this.instance).setFailure((GenericFailure) builder.build());
                return this;
            }
        }

        static {
            CharacteristicValueInfo characteristicValueInfo = new CharacteristicValueInfo();
            DEFAULT_INSTANCE = characteristicValueInfo;
            GeneratedMessageLite.registerDefaultInstance(CharacteristicValueInfo.class, characteristicValueInfo);
        }

        private CharacteristicValueInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCharacteristic() {
            this.characteristic_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFailure() {
            this.failure_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = getDefaultInstance().getValue();
        }

        public static CharacteristicValueInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCharacteristic(CharacteristicAddress characteristicAddress) {
            characteristicAddress.getClass();
            CharacteristicAddress characteristicAddress2 = this.characteristic_;
            if (characteristicAddress2 == null || characteristicAddress2 == CharacteristicAddress.getDefaultInstance()) {
                this.characteristic_ = characteristicAddress;
            } else {
                this.characteristic_ = (CharacteristicAddress) ((CharacteristicAddress.Builder) CharacteristicAddress.newBuilder(this.characteristic_).mergeFrom((GeneratedMessageLite) characteristicAddress)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFailure(GenericFailure genericFailure) {
            genericFailure.getClass();
            GenericFailure genericFailure2 = this.failure_;
            if (genericFailure2 == null || genericFailure2 == GenericFailure.getDefaultInstance()) {
                this.failure_ = genericFailure;
            } else {
                this.failure_ = (GenericFailure) ((GenericFailure.Builder) GenericFailure.newBuilder(this.failure_).mergeFrom((GeneratedMessageLite) genericFailure)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static CharacteristicValueInfo parseDelimitedFrom(InputStream inputStream) {
            return (CharacteristicValueInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CharacteristicValueInfo parseFrom(ByteBuffer byteBuffer) {
            return (CharacteristicValueInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCharacteristic(CharacteristicAddress characteristicAddress) {
            characteristicAddress.getClass();
            this.characteristic_ = characteristicAddress;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFailure(GenericFailure genericFailure) {
            genericFailure.getClass();
            this.failure_ = genericFailure;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(AbstractC3722j abstractC3722j) {
            abstractC3722j.getClass();
            this.value_ = abstractC3722j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new CharacteristicValueInfo();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\n\u0003ဉ\u0001", new Object[]{"bitField0_", "characteristic_", "value_", "failure_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (CharacteristicValueInfo.class) {
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

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.CharacteristicValueInfoOrBuilder
        public CharacteristicAddress getCharacteristic() {
            CharacteristicAddress characteristicAddress = this.characteristic_;
            return characteristicAddress == null ? CharacteristicAddress.getDefaultInstance() : characteristicAddress;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.CharacteristicValueInfoOrBuilder
        public GenericFailure getFailure() {
            GenericFailure genericFailure = this.failure_;
            return genericFailure == null ? GenericFailure.getDefaultInstance() : genericFailure;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.CharacteristicValueInfoOrBuilder
        public AbstractC3722j getValue() {
            return this.value_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.CharacteristicValueInfoOrBuilder
        public boolean hasCharacteristic() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.CharacteristicValueInfoOrBuilder
        public boolean hasFailure() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(CharacteristicValueInfo characteristicValueInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(characteristicValueInfo);
        }

        public static CharacteristicValueInfo parseDelimitedFrom(InputStream inputStream, D d10) {
            return (CharacteristicValueInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static CharacteristicValueInfo parseFrom(ByteBuffer byteBuffer, D d10) {
            return (CharacteristicValueInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static CharacteristicValueInfo parseFrom(AbstractC3722j abstractC3722j) {
            return (CharacteristicValueInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static CharacteristicValueInfo parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (CharacteristicValueInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static CharacteristicValueInfo parseFrom(byte[] bArr) {
            return (CharacteristicValueInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CharacteristicValueInfo parseFrom(byte[] bArr, D d10) {
            return (CharacteristicValueInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static CharacteristicValueInfo parseFrom(InputStream inputStream) {
            return (CharacteristicValueInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CharacteristicValueInfo parseFrom(InputStream inputStream, D d10) {
            return (CharacteristicValueInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static CharacteristicValueInfo parseFrom(AbstractC3724k abstractC3724k) {
            return (CharacteristicValueInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static CharacteristicValueInfo parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (CharacteristicValueInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface CharacteristicValueInfoOrBuilder extends InterfaceC3719h0 {
        CharacteristicAddress getCharacteristic();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        GenericFailure getFailure();

        AbstractC3722j getValue();

        boolean hasCharacteristic();

        boolean hasFailure();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class ClearGattCacheInfo extends GeneratedMessageLite implements ClearGattCacheInfoOrBuilder {
        private static final ClearGattCacheInfo DEFAULT_INSTANCE;
        public static final int FAILURE_FIELD_NUMBER = 1;
        private static volatile t0 PARSER;
        private int bitField0_;
        private GenericFailure failure_;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements ClearGattCacheInfoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearFailure() {
                copyOnWrite();
                ((ClearGattCacheInfo) this.instance).clearFailure();
                return this;
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ClearGattCacheInfoOrBuilder
            public GenericFailure getFailure() {
                return ((ClearGattCacheInfo) this.instance).getFailure();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ClearGattCacheInfoOrBuilder
            public boolean hasFailure() {
                return ((ClearGattCacheInfo) this.instance).hasFailure();
            }

            public Builder mergeFailure(GenericFailure genericFailure) {
                copyOnWrite();
                ((ClearGattCacheInfo) this.instance).mergeFailure(genericFailure);
                return this;
            }

            public Builder setFailure(GenericFailure genericFailure) {
                copyOnWrite();
                ((ClearGattCacheInfo) this.instance).setFailure(genericFailure);
                return this;
            }

            private Builder() {
                super(ClearGattCacheInfo.DEFAULT_INSTANCE);
            }

            public Builder setFailure(GenericFailure.Builder builder) {
                copyOnWrite();
                ((ClearGattCacheInfo) this.instance).setFailure((GenericFailure) builder.build());
                return this;
            }
        }

        static {
            ClearGattCacheInfo clearGattCacheInfo = new ClearGattCacheInfo();
            DEFAULT_INSTANCE = clearGattCacheInfo;
            GeneratedMessageLite.registerDefaultInstance(ClearGattCacheInfo.class, clearGattCacheInfo);
        }

        private ClearGattCacheInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFailure() {
            this.failure_ = null;
            this.bitField0_ &= -2;
        }

        public static ClearGattCacheInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFailure(GenericFailure genericFailure) {
            genericFailure.getClass();
            GenericFailure genericFailure2 = this.failure_;
            if (genericFailure2 == null || genericFailure2 == GenericFailure.getDefaultInstance()) {
                this.failure_ = genericFailure;
            } else {
                this.failure_ = (GenericFailure) ((GenericFailure.Builder) GenericFailure.newBuilder(this.failure_).mergeFrom((GeneratedMessageLite) genericFailure)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ClearGattCacheInfo parseDelimitedFrom(InputStream inputStream) {
            return (ClearGattCacheInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClearGattCacheInfo parseFrom(ByteBuffer byteBuffer) {
            return (ClearGattCacheInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFailure(GenericFailure genericFailure) {
            genericFailure.getClass();
            this.failure_ = genericFailure;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new ClearGattCacheInfo();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "failure_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (ClearGattCacheInfo.class) {
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

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ClearGattCacheInfoOrBuilder
        public GenericFailure getFailure() {
            GenericFailure genericFailure = this.failure_;
            return genericFailure == null ? GenericFailure.getDefaultInstance() : genericFailure;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ClearGattCacheInfoOrBuilder
        public boolean hasFailure() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(ClearGattCacheInfo clearGattCacheInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(clearGattCacheInfo);
        }

        public static ClearGattCacheInfo parseDelimitedFrom(InputStream inputStream, D d10) {
            return (ClearGattCacheInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static ClearGattCacheInfo parseFrom(ByteBuffer byteBuffer, D d10) {
            return (ClearGattCacheInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static ClearGattCacheInfo parseFrom(AbstractC3722j abstractC3722j) {
            return (ClearGattCacheInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static ClearGattCacheInfo parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (ClearGattCacheInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static ClearGattCacheInfo parseFrom(byte[] bArr) {
            return (ClearGattCacheInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ClearGattCacheInfo parseFrom(byte[] bArr, D d10) {
            return (ClearGattCacheInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static ClearGattCacheInfo parseFrom(InputStream inputStream) {
            return (ClearGattCacheInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClearGattCacheInfo parseFrom(InputStream inputStream, D d10) {
            return (ClearGattCacheInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static ClearGattCacheInfo parseFrom(AbstractC3724k abstractC3724k) {
            return (ClearGattCacheInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static ClearGattCacheInfo parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (ClearGattCacheInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface ClearGattCacheInfoOrBuilder extends InterfaceC3719h0 {
        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        GenericFailure getFailure();

        boolean hasFailure();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class ClearGattCacheRequest extends GeneratedMessageLite implements ClearGattCacheRequestOrBuilder {
        private static final ClearGattCacheRequest DEFAULT_INSTANCE;
        public static final int DEVICEID_FIELD_NUMBER = 1;
        private static volatile t0 PARSER;
        private String deviceId_ = "";

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements ClearGattCacheRequestOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearDeviceId() {
                copyOnWrite();
                ((ClearGattCacheRequest) this.instance).clearDeviceId();
                return this;
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ClearGattCacheRequestOrBuilder
            public String getDeviceId() {
                return ((ClearGattCacheRequest) this.instance).getDeviceId();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ClearGattCacheRequestOrBuilder
            public AbstractC3722j getDeviceIdBytes() {
                return ((ClearGattCacheRequest) this.instance).getDeviceIdBytes();
            }

            public Builder setDeviceId(String str) {
                copyOnWrite();
                ((ClearGattCacheRequest) this.instance).setDeviceId(str);
                return this;
            }

            public Builder setDeviceIdBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((ClearGattCacheRequest) this.instance).setDeviceIdBytes(abstractC3722j);
                return this;
            }

            private Builder() {
                super(ClearGattCacheRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            ClearGattCacheRequest clearGattCacheRequest = new ClearGattCacheRequest();
            DEFAULT_INSTANCE = clearGattCacheRequest;
            GeneratedMessageLite.registerDefaultInstance(ClearGattCacheRequest.class, clearGattCacheRequest);
        }

        private ClearGattCacheRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceId() {
            this.deviceId_ = getDefaultInstance().getDeviceId();
        }

        public static ClearGattCacheRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ClearGattCacheRequest parseDelimitedFrom(InputStream inputStream) {
            return (ClearGattCacheRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClearGattCacheRequest parseFrom(ByteBuffer byteBuffer) {
            return (ClearGattCacheRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceId(String str) {
            str.getClass();
            this.deviceId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceIdBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.deviceId_ = abstractC3722j.J();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new ClearGattCacheRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"deviceId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (ClearGattCacheRequest.class) {
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

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ClearGattCacheRequestOrBuilder
        public String getDeviceId() {
            return this.deviceId_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ClearGattCacheRequestOrBuilder
        public AbstractC3722j getDeviceIdBytes() {
            return AbstractC3722j.n(this.deviceId_);
        }

        public static Builder newBuilder(ClearGattCacheRequest clearGattCacheRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(clearGattCacheRequest);
        }

        public static ClearGattCacheRequest parseDelimitedFrom(InputStream inputStream, D d10) {
            return (ClearGattCacheRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static ClearGattCacheRequest parseFrom(ByteBuffer byteBuffer, D d10) {
            return (ClearGattCacheRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static ClearGattCacheRequest parseFrom(AbstractC3722j abstractC3722j) {
            return (ClearGattCacheRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static ClearGattCacheRequest parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (ClearGattCacheRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static ClearGattCacheRequest parseFrom(byte[] bArr) {
            return (ClearGattCacheRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ClearGattCacheRequest parseFrom(byte[] bArr, D d10) {
            return (ClearGattCacheRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static ClearGattCacheRequest parseFrom(InputStream inputStream) {
            return (ClearGattCacheRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClearGattCacheRequest parseFrom(InputStream inputStream, D d10) {
            return (ClearGattCacheRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static ClearGattCacheRequest parseFrom(AbstractC3724k abstractC3724k) {
            return (ClearGattCacheRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static ClearGattCacheRequest parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (ClearGattCacheRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface ClearGattCacheRequestOrBuilder extends InterfaceC3719h0 {
        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        String getDeviceId();

        AbstractC3722j getDeviceIdBytes();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class ConnectToDeviceRequest extends GeneratedMessageLite implements ConnectToDeviceRequestOrBuilder {
        private static final ConnectToDeviceRequest DEFAULT_INSTANCE;
        public static final int DEVICEID_FIELD_NUMBER = 1;
        private static volatile t0 PARSER = null;
        public static final int SERVICESWITHCHARACTERISTICSTODISCOVER_FIELD_NUMBER = 2;
        public static final int TIMEOUTINMS_FIELD_NUMBER = 3;
        private int bitField0_;
        private String deviceId_ = "";
        private ServicesWithCharacteristics servicesWithCharacteristicsToDiscover_;
        private int timeoutInMs_;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements ConnectToDeviceRequestOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearDeviceId() {
                copyOnWrite();
                ((ConnectToDeviceRequest) this.instance).clearDeviceId();
                return this;
            }

            public Builder clearServicesWithCharacteristicsToDiscover() {
                copyOnWrite();
                ((ConnectToDeviceRequest) this.instance).clearServicesWithCharacteristicsToDiscover();
                return this;
            }

            public Builder clearTimeoutInMs() {
                copyOnWrite();
                ((ConnectToDeviceRequest) this.instance).clearTimeoutInMs();
                return this;
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ConnectToDeviceRequestOrBuilder
            public String getDeviceId() {
                return ((ConnectToDeviceRequest) this.instance).getDeviceId();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ConnectToDeviceRequestOrBuilder
            public AbstractC3722j getDeviceIdBytes() {
                return ((ConnectToDeviceRequest) this.instance).getDeviceIdBytes();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ConnectToDeviceRequestOrBuilder
            public ServicesWithCharacteristics getServicesWithCharacteristicsToDiscover() {
                return ((ConnectToDeviceRequest) this.instance).getServicesWithCharacteristicsToDiscover();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ConnectToDeviceRequestOrBuilder
            public int getTimeoutInMs() {
                return ((ConnectToDeviceRequest) this.instance).getTimeoutInMs();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ConnectToDeviceRequestOrBuilder
            public boolean hasServicesWithCharacteristicsToDiscover() {
                return ((ConnectToDeviceRequest) this.instance).hasServicesWithCharacteristicsToDiscover();
            }

            public Builder mergeServicesWithCharacteristicsToDiscover(ServicesWithCharacteristics servicesWithCharacteristics) {
                copyOnWrite();
                ((ConnectToDeviceRequest) this.instance).mergeServicesWithCharacteristicsToDiscover(servicesWithCharacteristics);
                return this;
            }

            public Builder setDeviceId(String str) {
                copyOnWrite();
                ((ConnectToDeviceRequest) this.instance).setDeviceId(str);
                return this;
            }

            public Builder setDeviceIdBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((ConnectToDeviceRequest) this.instance).setDeviceIdBytes(abstractC3722j);
                return this;
            }

            public Builder setServicesWithCharacteristicsToDiscover(ServicesWithCharacteristics servicesWithCharacteristics) {
                copyOnWrite();
                ((ConnectToDeviceRequest) this.instance).setServicesWithCharacteristicsToDiscover(servicesWithCharacteristics);
                return this;
            }

            public Builder setTimeoutInMs(int i10) {
                copyOnWrite();
                ((ConnectToDeviceRequest) this.instance).setTimeoutInMs(i10);
                return this;
            }

            private Builder() {
                super(ConnectToDeviceRequest.DEFAULT_INSTANCE);
            }

            public Builder setServicesWithCharacteristicsToDiscover(ServicesWithCharacteristics.Builder builder) {
                copyOnWrite();
                ((ConnectToDeviceRequest) this.instance).setServicesWithCharacteristicsToDiscover((ServicesWithCharacteristics) builder.build());
                return this;
            }
        }

        static {
            ConnectToDeviceRequest connectToDeviceRequest = new ConnectToDeviceRequest();
            DEFAULT_INSTANCE = connectToDeviceRequest;
            GeneratedMessageLite.registerDefaultInstance(ConnectToDeviceRequest.class, connectToDeviceRequest);
        }

        private ConnectToDeviceRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceId() {
            this.deviceId_ = getDefaultInstance().getDeviceId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServicesWithCharacteristicsToDiscover() {
            this.servicesWithCharacteristicsToDiscover_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeoutInMs() {
            this.timeoutInMs_ = 0;
        }

        public static ConnectToDeviceRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeServicesWithCharacteristicsToDiscover(ServicesWithCharacteristics servicesWithCharacteristics) {
            servicesWithCharacteristics.getClass();
            ServicesWithCharacteristics servicesWithCharacteristics2 = this.servicesWithCharacteristicsToDiscover_;
            if (servicesWithCharacteristics2 == null || servicesWithCharacteristics2 == ServicesWithCharacteristics.getDefaultInstance()) {
                this.servicesWithCharacteristicsToDiscover_ = servicesWithCharacteristics;
            } else {
                this.servicesWithCharacteristicsToDiscover_ = (ServicesWithCharacteristics) ((ServicesWithCharacteristics.Builder) ServicesWithCharacteristics.newBuilder(this.servicesWithCharacteristicsToDiscover_).mergeFrom((GeneratedMessageLite) servicesWithCharacteristics)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ConnectToDeviceRequest parseDelimitedFrom(InputStream inputStream) {
            return (ConnectToDeviceRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ConnectToDeviceRequest parseFrom(ByteBuffer byteBuffer) {
            return (ConnectToDeviceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceId(String str) {
            str.getClass();
            this.deviceId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceIdBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.deviceId_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServicesWithCharacteristicsToDiscover(ServicesWithCharacteristics servicesWithCharacteristics) {
            servicesWithCharacteristics.getClass();
            this.servicesWithCharacteristicsToDiscover_ = servicesWithCharacteristics;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeoutInMs(int i10) {
            this.timeoutInMs_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new ConnectToDeviceRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0004", new Object[]{"bitField0_", "deviceId_", "servicesWithCharacteristicsToDiscover_", "timeoutInMs_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (ConnectToDeviceRequest.class) {
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

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ConnectToDeviceRequestOrBuilder
        public String getDeviceId() {
            return this.deviceId_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ConnectToDeviceRequestOrBuilder
        public AbstractC3722j getDeviceIdBytes() {
            return AbstractC3722j.n(this.deviceId_);
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ConnectToDeviceRequestOrBuilder
        public ServicesWithCharacteristics getServicesWithCharacteristicsToDiscover() {
            ServicesWithCharacteristics servicesWithCharacteristics = this.servicesWithCharacteristicsToDiscover_;
            return servicesWithCharacteristics == null ? ServicesWithCharacteristics.getDefaultInstance() : servicesWithCharacteristics;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ConnectToDeviceRequestOrBuilder
        public int getTimeoutInMs() {
            return this.timeoutInMs_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ConnectToDeviceRequestOrBuilder
        public boolean hasServicesWithCharacteristicsToDiscover() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(ConnectToDeviceRequest connectToDeviceRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(connectToDeviceRequest);
        }

        public static ConnectToDeviceRequest parseDelimitedFrom(InputStream inputStream, D d10) {
            return (ConnectToDeviceRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static ConnectToDeviceRequest parseFrom(ByteBuffer byteBuffer, D d10) {
            return (ConnectToDeviceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static ConnectToDeviceRequest parseFrom(AbstractC3722j abstractC3722j) {
            return (ConnectToDeviceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static ConnectToDeviceRequest parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (ConnectToDeviceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static ConnectToDeviceRequest parseFrom(byte[] bArr) {
            return (ConnectToDeviceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ConnectToDeviceRequest parseFrom(byte[] bArr, D d10) {
            return (ConnectToDeviceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static ConnectToDeviceRequest parseFrom(InputStream inputStream) {
            return (ConnectToDeviceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ConnectToDeviceRequest parseFrom(InputStream inputStream, D d10) {
            return (ConnectToDeviceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static ConnectToDeviceRequest parseFrom(AbstractC3724k abstractC3724k) {
            return (ConnectToDeviceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static ConnectToDeviceRequest parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (ConnectToDeviceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface ConnectToDeviceRequestOrBuilder extends InterfaceC3719h0 {
        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        String getDeviceId();

        AbstractC3722j getDeviceIdBytes();

        ServicesWithCharacteristics getServicesWithCharacteristicsToDiscover();

        int getTimeoutInMs();

        boolean hasServicesWithCharacteristicsToDiscover();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class DeviceInfo extends GeneratedMessageLite implements DeviceInfoOrBuilder {
        public static final int CONNECTIONSTATE_FIELD_NUMBER = 2;
        private static final DeviceInfo DEFAULT_INSTANCE;
        public static final int FAILURE_FIELD_NUMBER = 3;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile t0 PARSER;
        private int bitField0_;
        private int connectionState_;
        private GenericFailure failure_;
        private String id_ = "";

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements DeviceInfoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearConnectionState() {
                copyOnWrite();
                ((DeviceInfo) this.instance).clearConnectionState();
                return this;
            }

            public Builder clearFailure() {
                copyOnWrite();
                ((DeviceInfo) this.instance).clearFailure();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((DeviceInfo) this.instance).clearId();
                return this;
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceInfoOrBuilder
            public int getConnectionState() {
                return ((DeviceInfo) this.instance).getConnectionState();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceInfoOrBuilder
            public GenericFailure getFailure() {
                return ((DeviceInfo) this.instance).getFailure();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceInfoOrBuilder
            public String getId() {
                return ((DeviceInfo) this.instance).getId();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceInfoOrBuilder
            public AbstractC3722j getIdBytes() {
                return ((DeviceInfo) this.instance).getIdBytes();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceInfoOrBuilder
            public boolean hasFailure() {
                return ((DeviceInfo) this.instance).hasFailure();
            }

            public Builder mergeFailure(GenericFailure genericFailure) {
                copyOnWrite();
                ((DeviceInfo) this.instance).mergeFailure(genericFailure);
                return this;
            }

            public Builder setConnectionState(int i10) {
                copyOnWrite();
                ((DeviceInfo) this.instance).setConnectionState(i10);
                return this;
            }

            public Builder setFailure(GenericFailure genericFailure) {
                copyOnWrite();
                ((DeviceInfo) this.instance).setFailure(genericFailure);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((DeviceInfo) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((DeviceInfo) this.instance).setIdBytes(abstractC3722j);
                return this;
            }

            private Builder() {
                super(DeviceInfo.DEFAULT_INSTANCE);
            }

            public Builder setFailure(GenericFailure.Builder builder) {
                copyOnWrite();
                ((DeviceInfo) this.instance).setFailure((GenericFailure) builder.build());
                return this;
            }
        }

        static {
            DeviceInfo deviceInfo = new DeviceInfo();
            DEFAULT_INSTANCE = deviceInfo;
            GeneratedMessageLite.registerDefaultInstance(DeviceInfo.class, deviceInfo);
        }

        private DeviceInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnectionState() {
            this.connectionState_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFailure() {
            this.failure_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        public static DeviceInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFailure(GenericFailure genericFailure) {
            genericFailure.getClass();
            GenericFailure genericFailure2 = this.failure_;
            if (genericFailure2 == null || genericFailure2 == GenericFailure.getDefaultInstance()) {
                this.failure_ = genericFailure;
            } else {
                this.failure_ = (GenericFailure) ((GenericFailure.Builder) GenericFailure.newBuilder(this.failure_).mergeFrom((GeneratedMessageLite) genericFailure)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DeviceInfo parseDelimitedFrom(InputStream inputStream) {
            return (DeviceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeviceInfo parseFrom(ByteBuffer byteBuffer) {
            return (DeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionState(int i10) {
            this.connectionState_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFailure(GenericFailure genericFailure) {
            genericFailure.getClass();
            this.failure_ = genericFailure;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.id_ = abstractC3722j.J();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new DeviceInfo();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003ဉ\u0000", new Object[]{"bitField0_", "id_", "connectionState_", "failure_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (DeviceInfo.class) {
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

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceInfoOrBuilder
        public int getConnectionState() {
            return this.connectionState_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceInfoOrBuilder
        public GenericFailure getFailure() {
            GenericFailure genericFailure = this.failure_;
            return genericFailure == null ? GenericFailure.getDefaultInstance() : genericFailure;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceInfoOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceInfoOrBuilder
        public AbstractC3722j getIdBytes() {
            return AbstractC3722j.n(this.id_);
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceInfoOrBuilder
        public boolean hasFailure() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(DeviceInfo deviceInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(deviceInfo);
        }

        public static DeviceInfo parseDelimitedFrom(InputStream inputStream, D d10) {
            return (DeviceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static DeviceInfo parseFrom(ByteBuffer byteBuffer, D d10) {
            return (DeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static DeviceInfo parseFrom(AbstractC3722j abstractC3722j) {
            return (DeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static DeviceInfo parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (DeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static DeviceInfo parseFrom(byte[] bArr) {
            return (DeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DeviceInfo parseFrom(byte[] bArr, D d10) {
            return (DeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static DeviceInfo parseFrom(InputStream inputStream) {
            return (DeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeviceInfo parseFrom(InputStream inputStream, D d10) {
            return (DeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static DeviceInfo parseFrom(AbstractC3724k abstractC3724k) {
            return (DeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static DeviceInfo parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (DeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface DeviceInfoOrBuilder extends InterfaceC3719h0 {
        int getConnectionState();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        GenericFailure getFailure();

        String getId();

        AbstractC3722j getIdBytes();

        boolean hasFailure();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class DeviceScanInfo extends GeneratedMessageLite implements DeviceScanInfoOrBuilder {
        private static final DeviceScanInfo DEFAULT_INSTANCE;
        public static final int FAILURE_FIELD_NUMBER = 3;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int ISCONNECTABLE_FIELD_NUMBER = 8;
        public static final int MANUFACTURERDATA_FIELD_NUMBER = 6;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile t0 PARSER = null;
        public static final int RSSI_FIELD_NUMBER = 5;
        public static final int SERVICEDATA_FIELD_NUMBER = 4;
        public static final int SERVICEUUIDS_FIELD_NUMBER = 7;
        private int bitField0_;
        private GenericFailure failure_;
        private IsConnectable isConnectable_;
        private int rssi_;
        private String id_ = "";
        private String name_ = "";
        private N.j serviceData_ = GeneratedMessageLite.emptyProtobufList();
        private AbstractC3722j manufacturerData_ = AbstractC3722j.f32236b;
        private N.j serviceUuids_ = GeneratedMessageLite.emptyProtobufList();

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements DeviceScanInfoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllServiceData(Iterable<? extends ServiceDataEntry> iterable) {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).addAllServiceData(iterable);
                return this;
            }

            public Builder addAllServiceUuids(Iterable<? extends Uuid> iterable) {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).addAllServiceUuids(iterable);
                return this;
            }

            public Builder addServiceData(ServiceDataEntry serviceDataEntry) {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).addServiceData(serviceDataEntry);
                return this;
            }

            public Builder addServiceUuids(Uuid uuid) {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).addServiceUuids(uuid);
                return this;
            }

            public Builder clearFailure() {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).clearFailure();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).clearId();
                return this;
            }

            public Builder clearIsConnectable() {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).clearIsConnectable();
                return this;
            }

            public Builder clearManufacturerData() {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).clearManufacturerData();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).clearName();
                return this;
            }

            public Builder clearRssi() {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).clearRssi();
                return this;
            }

            public Builder clearServiceData() {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).clearServiceData();
                return this;
            }

            public Builder clearServiceUuids() {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).clearServiceUuids();
                return this;
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
            public GenericFailure getFailure() {
                return ((DeviceScanInfo) this.instance).getFailure();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
            public String getId() {
                return ((DeviceScanInfo) this.instance).getId();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
            public AbstractC3722j getIdBytes() {
                return ((DeviceScanInfo) this.instance).getIdBytes();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
            public IsConnectable getIsConnectable() {
                return ((DeviceScanInfo) this.instance).getIsConnectable();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
            public AbstractC3722j getManufacturerData() {
                return ((DeviceScanInfo) this.instance).getManufacturerData();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
            public String getName() {
                return ((DeviceScanInfo) this.instance).getName();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
            public AbstractC3722j getNameBytes() {
                return ((DeviceScanInfo) this.instance).getNameBytes();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
            public int getRssi() {
                return ((DeviceScanInfo) this.instance).getRssi();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
            public ServiceDataEntry getServiceData(int i10) {
                return ((DeviceScanInfo) this.instance).getServiceData(i10);
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
            public int getServiceDataCount() {
                return ((DeviceScanInfo) this.instance).getServiceDataCount();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
            public List<ServiceDataEntry> getServiceDataList() {
                return Collections.unmodifiableList(((DeviceScanInfo) this.instance).getServiceDataList());
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
            public Uuid getServiceUuids(int i10) {
                return ((DeviceScanInfo) this.instance).getServiceUuids(i10);
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
            public int getServiceUuidsCount() {
                return ((DeviceScanInfo) this.instance).getServiceUuidsCount();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
            public List<Uuid> getServiceUuidsList() {
                return Collections.unmodifiableList(((DeviceScanInfo) this.instance).getServiceUuidsList());
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
            public boolean hasFailure() {
                return ((DeviceScanInfo) this.instance).hasFailure();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
            public boolean hasIsConnectable() {
                return ((DeviceScanInfo) this.instance).hasIsConnectable();
            }

            public Builder mergeFailure(GenericFailure genericFailure) {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).mergeFailure(genericFailure);
                return this;
            }

            public Builder mergeIsConnectable(IsConnectable isConnectable) {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).mergeIsConnectable(isConnectable);
                return this;
            }

            public Builder removeServiceData(int i10) {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).removeServiceData(i10);
                return this;
            }

            public Builder removeServiceUuids(int i10) {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).removeServiceUuids(i10);
                return this;
            }

            public Builder setFailure(GenericFailure genericFailure) {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).setFailure(genericFailure);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).setIdBytes(abstractC3722j);
                return this;
            }

            public Builder setIsConnectable(IsConnectable isConnectable) {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).setIsConnectable(isConnectable);
                return this;
            }

            public Builder setManufacturerData(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).setManufacturerData(abstractC3722j);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).setNameBytes(abstractC3722j);
                return this;
            }

            public Builder setRssi(int i10) {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).setRssi(i10);
                return this;
            }

            public Builder setServiceData(int i10, ServiceDataEntry serviceDataEntry) {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).setServiceData(i10, serviceDataEntry);
                return this;
            }

            public Builder setServiceUuids(int i10, Uuid uuid) {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).setServiceUuids(i10, uuid);
                return this;
            }

            private Builder() {
                super(DeviceScanInfo.DEFAULT_INSTANCE);
            }

            public Builder addServiceData(int i10, ServiceDataEntry serviceDataEntry) {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).addServiceData(i10, serviceDataEntry);
                return this;
            }

            public Builder addServiceUuids(int i10, Uuid uuid) {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).addServiceUuids(i10, uuid);
                return this;
            }

            public Builder setFailure(GenericFailure.Builder builder) {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).setFailure((GenericFailure) builder.build());
                return this;
            }

            public Builder setIsConnectable(IsConnectable.Builder builder) {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).setIsConnectable((IsConnectable) builder.build());
                return this;
            }

            public Builder setServiceData(int i10, ServiceDataEntry.Builder builder) {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).setServiceData(i10, (ServiceDataEntry) builder.build());
                return this;
            }

            public Builder setServiceUuids(int i10, Uuid.Builder builder) {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).setServiceUuids(i10, (Uuid) builder.build());
                return this;
            }

            public Builder addServiceData(ServiceDataEntry.Builder builder) {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).addServiceData((ServiceDataEntry) builder.build());
                return this;
            }

            public Builder addServiceUuids(Uuid.Builder builder) {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).addServiceUuids((Uuid) builder.build());
                return this;
            }

            public Builder addServiceData(int i10, ServiceDataEntry.Builder builder) {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).addServiceData(i10, (ServiceDataEntry) builder.build());
                return this;
            }

            public Builder addServiceUuids(int i10, Uuid.Builder builder) {
                copyOnWrite();
                ((DeviceScanInfo) this.instance).addServiceUuids(i10, (Uuid) builder.build());
                return this;
            }
        }

        static {
            DeviceScanInfo deviceScanInfo = new DeviceScanInfo();
            DEFAULT_INSTANCE = deviceScanInfo;
            GeneratedMessageLite.registerDefaultInstance(DeviceScanInfo.class, deviceScanInfo);
        }

        private DeviceScanInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllServiceData(Iterable<? extends ServiceDataEntry> iterable) {
            ensureServiceDataIsMutable();
            AbstractC3704a.addAll((Iterable) iterable, (List) this.serviceData_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllServiceUuids(Iterable<? extends Uuid> iterable) {
            ensureServiceUuidsIsMutable();
            AbstractC3704a.addAll((Iterable) iterable, (List) this.serviceUuids_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addServiceData(ServiceDataEntry serviceDataEntry) {
            serviceDataEntry.getClass();
            ensureServiceDataIsMutable();
            this.serviceData_.add(serviceDataEntry);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addServiceUuids(Uuid uuid) {
            uuid.getClass();
            ensureServiceUuidsIsMutable();
            this.serviceUuids_.add(uuid);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFailure() {
            this.failure_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsConnectable() {
            this.isConnectable_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearManufacturerData() {
            this.manufacturerData_ = getDefaultInstance().getManufacturerData();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRssi() {
            this.rssi_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServiceData() {
            this.serviceData_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServiceUuids() {
            this.serviceUuids_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureServiceDataIsMutable() {
            N.j jVar = this.serviceData_;
            if (jVar.m()) {
                return;
            }
            this.serviceData_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        private void ensureServiceUuidsIsMutable() {
            N.j jVar = this.serviceUuids_;
            if (jVar.m()) {
                return;
            }
            this.serviceUuids_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        public static DeviceScanInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFailure(GenericFailure genericFailure) {
            genericFailure.getClass();
            GenericFailure genericFailure2 = this.failure_;
            if (genericFailure2 == null || genericFailure2 == GenericFailure.getDefaultInstance()) {
                this.failure_ = genericFailure;
            } else {
                this.failure_ = (GenericFailure) ((GenericFailure.Builder) GenericFailure.newBuilder(this.failure_).mergeFrom((GeneratedMessageLite) genericFailure)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeIsConnectable(IsConnectable isConnectable) {
            isConnectable.getClass();
            IsConnectable isConnectable2 = this.isConnectable_;
            if (isConnectable2 == null || isConnectable2 == IsConnectable.getDefaultInstance()) {
                this.isConnectable_ = isConnectable;
            } else {
                this.isConnectable_ = (IsConnectable) ((IsConnectable.Builder) IsConnectable.newBuilder(this.isConnectable_).mergeFrom((GeneratedMessageLite) isConnectable)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DeviceScanInfo parseDelimitedFrom(InputStream inputStream) {
            return (DeviceScanInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeviceScanInfo parseFrom(ByteBuffer byteBuffer) {
            return (DeviceScanInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeServiceData(int i10) {
            ensureServiceDataIsMutable();
            this.serviceData_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeServiceUuids(int i10) {
            ensureServiceUuidsIsMutable();
            this.serviceUuids_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFailure(GenericFailure genericFailure) {
            genericFailure.getClass();
            this.failure_ = genericFailure;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.id_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsConnectable(IsConnectable isConnectable) {
            isConnectable.getClass();
            this.isConnectable_ = isConnectable;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setManufacturerData(AbstractC3722j abstractC3722j) {
            abstractC3722j.getClass();
            this.manufacturerData_ = abstractC3722j;
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
        public void setRssi(int i10) {
            this.rssi_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServiceData(int i10, ServiceDataEntry serviceDataEntry) {
            serviceDataEntry.getClass();
            ensureServiceDataIsMutable();
            this.serviceData_.set(i10, serviceDataEntry);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServiceUuids(int i10, Uuid uuid) {
            uuid.getClass();
            ensureServiceUuidsIsMutable();
            this.serviceUuids_.set(i10, uuid);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new DeviceScanInfo();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004\u001b\u0005\u0004\u0006\n\u0007\u001b\bဉ\u0001", new Object[]{"bitField0_", "id_", "name_", "failure_", "serviceData_", ServiceDataEntry.class, "rssi_", "manufacturerData_", "serviceUuids_", Uuid.class, "isConnectable_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (DeviceScanInfo.class) {
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

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
        public GenericFailure getFailure() {
            GenericFailure genericFailure = this.failure_;
            return genericFailure == null ? GenericFailure.getDefaultInstance() : genericFailure;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
        public AbstractC3722j getIdBytes() {
            return AbstractC3722j.n(this.id_);
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
        public IsConnectable getIsConnectable() {
            IsConnectable isConnectable = this.isConnectable_;
            return isConnectable == null ? IsConnectable.getDefaultInstance() : isConnectable;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
        public AbstractC3722j getManufacturerData() {
            return this.manufacturerData_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
        public AbstractC3722j getNameBytes() {
            return AbstractC3722j.n(this.name_);
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
        public int getRssi() {
            return this.rssi_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
        public ServiceDataEntry getServiceData(int i10) {
            return (ServiceDataEntry) this.serviceData_.get(i10);
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
        public int getServiceDataCount() {
            return this.serviceData_.size();
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
        public List<ServiceDataEntry> getServiceDataList() {
            return this.serviceData_;
        }

        public ServiceDataEntryOrBuilder getServiceDataOrBuilder(int i10) {
            return (ServiceDataEntryOrBuilder) this.serviceData_.get(i10);
        }

        public List<? extends ServiceDataEntryOrBuilder> getServiceDataOrBuilderList() {
            return this.serviceData_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
        public Uuid getServiceUuids(int i10) {
            return (Uuid) this.serviceUuids_.get(i10);
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
        public int getServiceUuidsCount() {
            return this.serviceUuids_.size();
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
        public List<Uuid> getServiceUuidsList() {
            return this.serviceUuids_;
        }

        public UuidOrBuilder getServiceUuidsOrBuilder(int i10) {
            return (UuidOrBuilder) this.serviceUuids_.get(i10);
        }

        public List<? extends UuidOrBuilder> getServiceUuidsOrBuilderList() {
            return this.serviceUuids_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
        public boolean hasFailure() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DeviceScanInfoOrBuilder
        public boolean hasIsConnectable() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(DeviceScanInfo deviceScanInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(deviceScanInfo);
        }

        public static DeviceScanInfo parseDelimitedFrom(InputStream inputStream, D d10) {
            return (DeviceScanInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static DeviceScanInfo parseFrom(ByteBuffer byteBuffer, D d10) {
            return (DeviceScanInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static DeviceScanInfo parseFrom(AbstractC3722j abstractC3722j) {
            return (DeviceScanInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addServiceData(int i10, ServiceDataEntry serviceDataEntry) {
            serviceDataEntry.getClass();
            ensureServiceDataIsMutable();
            this.serviceData_.add(i10, serviceDataEntry);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addServiceUuids(int i10, Uuid uuid) {
            uuid.getClass();
            ensureServiceUuidsIsMutable();
            this.serviceUuids_.add(i10, uuid);
        }

        public static DeviceScanInfo parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (DeviceScanInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static DeviceScanInfo parseFrom(byte[] bArr) {
            return (DeviceScanInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DeviceScanInfo parseFrom(byte[] bArr, D d10) {
            return (DeviceScanInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static DeviceScanInfo parseFrom(InputStream inputStream) {
            return (DeviceScanInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeviceScanInfo parseFrom(InputStream inputStream, D d10) {
            return (DeviceScanInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static DeviceScanInfo parseFrom(AbstractC3724k abstractC3724k) {
            return (DeviceScanInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static DeviceScanInfo parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (DeviceScanInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface DeviceScanInfoOrBuilder extends InterfaceC3719h0 {
        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        GenericFailure getFailure();

        String getId();

        AbstractC3722j getIdBytes();

        IsConnectable getIsConnectable();

        AbstractC3722j getManufacturerData();

        String getName();

        AbstractC3722j getNameBytes();

        int getRssi();

        ServiceDataEntry getServiceData(int i10);

        int getServiceDataCount();

        List<ServiceDataEntry> getServiceDataList();

        Uuid getServiceUuids(int i10);

        int getServiceUuidsCount();

        List<Uuid> getServiceUuidsList();

        boolean hasFailure();

        boolean hasIsConnectable();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class DisconnectFromDeviceRequest extends GeneratedMessageLite implements DisconnectFromDeviceRequestOrBuilder {
        private static final DisconnectFromDeviceRequest DEFAULT_INSTANCE;
        public static final int DEVICEID_FIELD_NUMBER = 1;
        private static volatile t0 PARSER;
        private String deviceId_ = "";

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements DisconnectFromDeviceRequestOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearDeviceId() {
                copyOnWrite();
                ((DisconnectFromDeviceRequest) this.instance).clearDeviceId();
                return this;
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DisconnectFromDeviceRequestOrBuilder
            public String getDeviceId() {
                return ((DisconnectFromDeviceRequest) this.instance).getDeviceId();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DisconnectFromDeviceRequestOrBuilder
            public AbstractC3722j getDeviceIdBytes() {
                return ((DisconnectFromDeviceRequest) this.instance).getDeviceIdBytes();
            }

            public Builder setDeviceId(String str) {
                copyOnWrite();
                ((DisconnectFromDeviceRequest) this.instance).setDeviceId(str);
                return this;
            }

            public Builder setDeviceIdBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((DisconnectFromDeviceRequest) this.instance).setDeviceIdBytes(abstractC3722j);
                return this;
            }

            private Builder() {
                super(DisconnectFromDeviceRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            DisconnectFromDeviceRequest disconnectFromDeviceRequest = new DisconnectFromDeviceRequest();
            DEFAULT_INSTANCE = disconnectFromDeviceRequest;
            GeneratedMessageLite.registerDefaultInstance(DisconnectFromDeviceRequest.class, disconnectFromDeviceRequest);
        }

        private DisconnectFromDeviceRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceId() {
            this.deviceId_ = getDefaultInstance().getDeviceId();
        }

        public static DisconnectFromDeviceRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DisconnectFromDeviceRequest parseDelimitedFrom(InputStream inputStream) {
            return (DisconnectFromDeviceRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DisconnectFromDeviceRequest parseFrom(ByteBuffer byteBuffer) {
            return (DisconnectFromDeviceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceId(String str) {
            str.getClass();
            this.deviceId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceIdBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.deviceId_ = abstractC3722j.J();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new DisconnectFromDeviceRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"deviceId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (DisconnectFromDeviceRequest.class) {
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

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DisconnectFromDeviceRequestOrBuilder
        public String getDeviceId() {
            return this.deviceId_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DisconnectFromDeviceRequestOrBuilder
        public AbstractC3722j getDeviceIdBytes() {
            return AbstractC3722j.n(this.deviceId_);
        }

        public static Builder newBuilder(DisconnectFromDeviceRequest disconnectFromDeviceRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(disconnectFromDeviceRequest);
        }

        public static DisconnectFromDeviceRequest parseDelimitedFrom(InputStream inputStream, D d10) {
            return (DisconnectFromDeviceRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static DisconnectFromDeviceRequest parseFrom(ByteBuffer byteBuffer, D d10) {
            return (DisconnectFromDeviceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static DisconnectFromDeviceRequest parseFrom(AbstractC3722j abstractC3722j) {
            return (DisconnectFromDeviceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static DisconnectFromDeviceRequest parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (DisconnectFromDeviceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static DisconnectFromDeviceRequest parseFrom(byte[] bArr) {
            return (DisconnectFromDeviceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DisconnectFromDeviceRequest parseFrom(byte[] bArr, D d10) {
            return (DisconnectFromDeviceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static DisconnectFromDeviceRequest parseFrom(InputStream inputStream) {
            return (DisconnectFromDeviceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DisconnectFromDeviceRequest parseFrom(InputStream inputStream, D d10) {
            return (DisconnectFromDeviceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static DisconnectFromDeviceRequest parseFrom(AbstractC3724k abstractC3724k) {
            return (DisconnectFromDeviceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static DisconnectFromDeviceRequest parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (DisconnectFromDeviceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface DisconnectFromDeviceRequestOrBuilder extends InterfaceC3719h0 {
        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        String getDeviceId();

        AbstractC3722j getDeviceIdBytes();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class DiscoverServicesInfo extends GeneratedMessageLite implements DiscoverServicesInfoOrBuilder {
        private static final DiscoverServicesInfo DEFAULT_INSTANCE;
        public static final int DEVICEID_FIELD_NUMBER = 1;
        private static volatile t0 PARSER = null;
        public static final int SERVICES_FIELD_NUMBER = 2;
        private String deviceId_ = "";
        private N.j services_ = GeneratedMessageLite.emptyProtobufList();

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements DiscoverServicesInfoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllServices(Iterable<? extends DiscoveredService> iterable) {
                copyOnWrite();
                ((DiscoverServicesInfo) this.instance).addAllServices(iterable);
                return this;
            }

            public Builder addServices(DiscoveredService discoveredService) {
                copyOnWrite();
                ((DiscoverServicesInfo) this.instance).addServices(discoveredService);
                return this;
            }

            public Builder clearDeviceId() {
                copyOnWrite();
                ((DiscoverServicesInfo) this.instance).clearDeviceId();
                return this;
            }

            public Builder clearServices() {
                copyOnWrite();
                ((DiscoverServicesInfo) this.instance).clearServices();
                return this;
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoverServicesInfoOrBuilder
            public String getDeviceId() {
                return ((DiscoverServicesInfo) this.instance).getDeviceId();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoverServicesInfoOrBuilder
            public AbstractC3722j getDeviceIdBytes() {
                return ((DiscoverServicesInfo) this.instance).getDeviceIdBytes();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoverServicesInfoOrBuilder
            public DiscoveredService getServices(int i10) {
                return ((DiscoverServicesInfo) this.instance).getServices(i10);
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoverServicesInfoOrBuilder
            public int getServicesCount() {
                return ((DiscoverServicesInfo) this.instance).getServicesCount();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoverServicesInfoOrBuilder
            public List<DiscoveredService> getServicesList() {
                return Collections.unmodifiableList(((DiscoverServicesInfo) this.instance).getServicesList());
            }

            public Builder removeServices(int i10) {
                copyOnWrite();
                ((DiscoverServicesInfo) this.instance).removeServices(i10);
                return this;
            }

            public Builder setDeviceId(String str) {
                copyOnWrite();
                ((DiscoverServicesInfo) this.instance).setDeviceId(str);
                return this;
            }

            public Builder setDeviceIdBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((DiscoverServicesInfo) this.instance).setDeviceIdBytes(abstractC3722j);
                return this;
            }

            public Builder setServices(int i10, DiscoveredService discoveredService) {
                copyOnWrite();
                ((DiscoverServicesInfo) this.instance).setServices(i10, discoveredService);
                return this;
            }

            private Builder() {
                super(DiscoverServicesInfo.DEFAULT_INSTANCE);
            }

            public Builder addServices(int i10, DiscoveredService discoveredService) {
                copyOnWrite();
                ((DiscoverServicesInfo) this.instance).addServices(i10, discoveredService);
                return this;
            }

            public Builder setServices(int i10, DiscoveredService.Builder builder) {
                copyOnWrite();
                ((DiscoverServicesInfo) this.instance).setServices(i10, (DiscoveredService) builder.build());
                return this;
            }

            public Builder addServices(DiscoveredService.Builder builder) {
                copyOnWrite();
                ((DiscoverServicesInfo) this.instance).addServices((DiscoveredService) builder.build());
                return this;
            }

            public Builder addServices(int i10, DiscoveredService.Builder builder) {
                copyOnWrite();
                ((DiscoverServicesInfo) this.instance).addServices(i10, (DiscoveredService) builder.build());
                return this;
            }
        }

        static {
            DiscoverServicesInfo discoverServicesInfo = new DiscoverServicesInfo();
            DEFAULT_INSTANCE = discoverServicesInfo;
            GeneratedMessageLite.registerDefaultInstance(DiscoverServicesInfo.class, discoverServicesInfo);
        }

        private DiscoverServicesInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllServices(Iterable<? extends DiscoveredService> iterable) {
            ensureServicesIsMutable();
            AbstractC3704a.addAll((Iterable) iterable, (List) this.services_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addServices(DiscoveredService discoveredService) {
            discoveredService.getClass();
            ensureServicesIsMutable();
            this.services_.add(discoveredService);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceId() {
            this.deviceId_ = getDefaultInstance().getDeviceId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServices() {
            this.services_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureServicesIsMutable() {
            N.j jVar = this.services_;
            if (jVar.m()) {
                return;
            }
            this.services_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        public static DiscoverServicesInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DiscoverServicesInfo parseDelimitedFrom(InputStream inputStream) {
            return (DiscoverServicesInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiscoverServicesInfo parseFrom(ByteBuffer byteBuffer) {
            return (DiscoverServicesInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeServices(int i10) {
            ensureServicesIsMutable();
            this.services_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceId(String str) {
            str.getClass();
            this.deviceId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceIdBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.deviceId_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServices(int i10, DiscoveredService discoveredService) {
            discoveredService.getClass();
            ensureServicesIsMutable();
            this.services_.set(i10, discoveredService);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new DiscoverServicesInfo();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"deviceId_", "services_", DiscoveredService.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (DiscoverServicesInfo.class) {
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

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoverServicesInfoOrBuilder
        public String getDeviceId() {
            return this.deviceId_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoverServicesInfoOrBuilder
        public AbstractC3722j getDeviceIdBytes() {
            return AbstractC3722j.n(this.deviceId_);
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoverServicesInfoOrBuilder
        public DiscoveredService getServices(int i10) {
            return (DiscoveredService) this.services_.get(i10);
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoverServicesInfoOrBuilder
        public int getServicesCount() {
            return this.services_.size();
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoverServicesInfoOrBuilder
        public List<DiscoveredService> getServicesList() {
            return this.services_;
        }

        public DiscoveredServiceOrBuilder getServicesOrBuilder(int i10) {
            return (DiscoveredServiceOrBuilder) this.services_.get(i10);
        }

        public List<? extends DiscoveredServiceOrBuilder> getServicesOrBuilderList() {
            return this.services_;
        }

        public static Builder newBuilder(DiscoverServicesInfo discoverServicesInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(discoverServicesInfo);
        }

        public static DiscoverServicesInfo parseDelimitedFrom(InputStream inputStream, D d10) {
            return (DiscoverServicesInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static DiscoverServicesInfo parseFrom(ByteBuffer byteBuffer, D d10) {
            return (DiscoverServicesInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static DiscoverServicesInfo parseFrom(AbstractC3722j abstractC3722j) {
            return (DiscoverServicesInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addServices(int i10, DiscoveredService discoveredService) {
            discoveredService.getClass();
            ensureServicesIsMutable();
            this.services_.add(i10, discoveredService);
        }

        public static DiscoverServicesInfo parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (DiscoverServicesInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static DiscoverServicesInfo parseFrom(byte[] bArr) {
            return (DiscoverServicesInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DiscoverServicesInfo parseFrom(byte[] bArr, D d10) {
            return (DiscoverServicesInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static DiscoverServicesInfo parseFrom(InputStream inputStream) {
            return (DiscoverServicesInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiscoverServicesInfo parseFrom(InputStream inputStream, D d10) {
            return (DiscoverServicesInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static DiscoverServicesInfo parseFrom(AbstractC3724k abstractC3724k) {
            return (DiscoverServicesInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static DiscoverServicesInfo parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (DiscoverServicesInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface DiscoverServicesInfoOrBuilder extends InterfaceC3719h0 {
        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        String getDeviceId();

        AbstractC3722j getDeviceIdBytes();

        DiscoveredService getServices(int i10);

        int getServicesCount();

        List<DiscoveredService> getServicesList();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class DiscoverServicesRequest extends GeneratedMessageLite implements DiscoverServicesRequestOrBuilder {
        private static final DiscoverServicesRequest DEFAULT_INSTANCE;
        public static final int DEVICEID_FIELD_NUMBER = 1;
        private static volatile t0 PARSER;
        private String deviceId_ = "";

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements DiscoverServicesRequestOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearDeviceId() {
                copyOnWrite();
                ((DiscoverServicesRequest) this.instance).clearDeviceId();
                return this;
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoverServicesRequestOrBuilder
            public String getDeviceId() {
                return ((DiscoverServicesRequest) this.instance).getDeviceId();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoverServicesRequestOrBuilder
            public AbstractC3722j getDeviceIdBytes() {
                return ((DiscoverServicesRequest) this.instance).getDeviceIdBytes();
            }

            public Builder setDeviceId(String str) {
                copyOnWrite();
                ((DiscoverServicesRequest) this.instance).setDeviceId(str);
                return this;
            }

            public Builder setDeviceIdBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((DiscoverServicesRequest) this.instance).setDeviceIdBytes(abstractC3722j);
                return this;
            }

            private Builder() {
                super(DiscoverServicesRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            DiscoverServicesRequest discoverServicesRequest = new DiscoverServicesRequest();
            DEFAULT_INSTANCE = discoverServicesRequest;
            GeneratedMessageLite.registerDefaultInstance(DiscoverServicesRequest.class, discoverServicesRequest);
        }

        private DiscoverServicesRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceId() {
            this.deviceId_ = getDefaultInstance().getDeviceId();
        }

        public static DiscoverServicesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DiscoverServicesRequest parseDelimitedFrom(InputStream inputStream) {
            return (DiscoverServicesRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiscoverServicesRequest parseFrom(ByteBuffer byteBuffer) {
            return (DiscoverServicesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceId(String str) {
            str.getClass();
            this.deviceId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceIdBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.deviceId_ = abstractC3722j.J();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new DiscoverServicesRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"deviceId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (DiscoverServicesRequest.class) {
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

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoverServicesRequestOrBuilder
        public String getDeviceId() {
            return this.deviceId_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoverServicesRequestOrBuilder
        public AbstractC3722j getDeviceIdBytes() {
            return AbstractC3722j.n(this.deviceId_);
        }

        public static Builder newBuilder(DiscoverServicesRequest discoverServicesRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(discoverServicesRequest);
        }

        public static DiscoverServicesRequest parseDelimitedFrom(InputStream inputStream, D d10) {
            return (DiscoverServicesRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static DiscoverServicesRequest parseFrom(ByteBuffer byteBuffer, D d10) {
            return (DiscoverServicesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static DiscoverServicesRequest parseFrom(AbstractC3722j abstractC3722j) {
            return (DiscoverServicesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static DiscoverServicesRequest parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (DiscoverServicesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static DiscoverServicesRequest parseFrom(byte[] bArr) {
            return (DiscoverServicesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DiscoverServicesRequest parseFrom(byte[] bArr, D d10) {
            return (DiscoverServicesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static DiscoverServicesRequest parseFrom(InputStream inputStream) {
            return (DiscoverServicesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiscoverServicesRequest parseFrom(InputStream inputStream, D d10) {
            return (DiscoverServicesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static DiscoverServicesRequest parseFrom(AbstractC3724k abstractC3724k) {
            return (DiscoverServicesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static DiscoverServicesRequest parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (DiscoverServicesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface DiscoverServicesRequestOrBuilder extends InterfaceC3719h0 {
        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        String getDeviceId();

        AbstractC3722j getDeviceIdBytes();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class DiscoveredCharacteristic extends GeneratedMessageLite implements DiscoveredCharacteristicOrBuilder {
        public static final int CHARACTERISTICID_FIELD_NUMBER = 1;
        public static final int CHARACTERISTICINSTANCEID_FIELD_NUMBER = 8;
        private static final DiscoveredCharacteristic DEFAULT_INSTANCE;
        public static final int ISINDICATABLE_FIELD_NUMBER = 7;
        public static final int ISNOTIFIABLE_FIELD_NUMBER = 6;
        public static final int ISREADABLE_FIELD_NUMBER = 3;
        public static final int ISWRITABLEWITHOUTRESPONSE_FIELD_NUMBER = 5;
        public static final int ISWRITABLEWITHRESPONSE_FIELD_NUMBER = 4;
        private static volatile t0 PARSER = null;
        public static final int SERVICEID_FIELD_NUMBER = 2;
        private int bitField0_;
        private Uuid characteristicId_;
        private String characteristicInstanceId_ = "";
        private boolean isIndicatable_;
        private boolean isNotifiable_;
        private boolean isReadable_;
        private boolean isWritableWithResponse_;
        private boolean isWritableWithoutResponse_;
        private Uuid serviceId_;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements DiscoveredCharacteristicOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearCharacteristicId() {
                copyOnWrite();
                ((DiscoveredCharacteristic) this.instance).clearCharacteristicId();
                return this;
            }

            public Builder clearCharacteristicInstanceId() {
                copyOnWrite();
                ((DiscoveredCharacteristic) this.instance).clearCharacteristicInstanceId();
                return this;
            }

            public Builder clearIsIndicatable() {
                copyOnWrite();
                ((DiscoveredCharacteristic) this.instance).clearIsIndicatable();
                return this;
            }

            public Builder clearIsNotifiable() {
                copyOnWrite();
                ((DiscoveredCharacteristic) this.instance).clearIsNotifiable();
                return this;
            }

            public Builder clearIsReadable() {
                copyOnWrite();
                ((DiscoveredCharacteristic) this.instance).clearIsReadable();
                return this;
            }

            public Builder clearIsWritableWithResponse() {
                copyOnWrite();
                ((DiscoveredCharacteristic) this.instance).clearIsWritableWithResponse();
                return this;
            }

            public Builder clearIsWritableWithoutResponse() {
                copyOnWrite();
                ((DiscoveredCharacteristic) this.instance).clearIsWritableWithoutResponse();
                return this;
            }

            public Builder clearServiceId() {
                copyOnWrite();
                ((DiscoveredCharacteristic) this.instance).clearServiceId();
                return this;
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredCharacteristicOrBuilder
            public Uuid getCharacteristicId() {
                return ((DiscoveredCharacteristic) this.instance).getCharacteristicId();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredCharacteristicOrBuilder
            public String getCharacteristicInstanceId() {
                return ((DiscoveredCharacteristic) this.instance).getCharacteristicInstanceId();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredCharacteristicOrBuilder
            public AbstractC3722j getCharacteristicInstanceIdBytes() {
                return ((DiscoveredCharacteristic) this.instance).getCharacteristicInstanceIdBytes();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredCharacteristicOrBuilder
            public boolean getIsIndicatable() {
                return ((DiscoveredCharacteristic) this.instance).getIsIndicatable();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredCharacteristicOrBuilder
            public boolean getIsNotifiable() {
                return ((DiscoveredCharacteristic) this.instance).getIsNotifiable();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredCharacteristicOrBuilder
            public boolean getIsReadable() {
                return ((DiscoveredCharacteristic) this.instance).getIsReadable();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredCharacteristicOrBuilder
            public boolean getIsWritableWithResponse() {
                return ((DiscoveredCharacteristic) this.instance).getIsWritableWithResponse();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredCharacteristicOrBuilder
            public boolean getIsWritableWithoutResponse() {
                return ((DiscoveredCharacteristic) this.instance).getIsWritableWithoutResponse();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredCharacteristicOrBuilder
            public Uuid getServiceId() {
                return ((DiscoveredCharacteristic) this.instance).getServiceId();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredCharacteristicOrBuilder
            public boolean hasCharacteristicId() {
                return ((DiscoveredCharacteristic) this.instance).hasCharacteristicId();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredCharacteristicOrBuilder
            public boolean hasServiceId() {
                return ((DiscoveredCharacteristic) this.instance).hasServiceId();
            }

            public Builder mergeCharacteristicId(Uuid uuid) {
                copyOnWrite();
                ((DiscoveredCharacteristic) this.instance).mergeCharacteristicId(uuid);
                return this;
            }

            public Builder mergeServiceId(Uuid uuid) {
                copyOnWrite();
                ((DiscoveredCharacteristic) this.instance).mergeServiceId(uuid);
                return this;
            }

            public Builder setCharacteristicId(Uuid uuid) {
                copyOnWrite();
                ((DiscoveredCharacteristic) this.instance).setCharacteristicId(uuid);
                return this;
            }

            public Builder setCharacteristicInstanceId(String str) {
                copyOnWrite();
                ((DiscoveredCharacteristic) this.instance).setCharacteristicInstanceId(str);
                return this;
            }

            public Builder setCharacteristicInstanceIdBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((DiscoveredCharacteristic) this.instance).setCharacteristicInstanceIdBytes(abstractC3722j);
                return this;
            }

            public Builder setIsIndicatable(boolean z10) {
                copyOnWrite();
                ((DiscoveredCharacteristic) this.instance).setIsIndicatable(z10);
                return this;
            }

            public Builder setIsNotifiable(boolean z10) {
                copyOnWrite();
                ((DiscoveredCharacteristic) this.instance).setIsNotifiable(z10);
                return this;
            }

            public Builder setIsReadable(boolean z10) {
                copyOnWrite();
                ((DiscoveredCharacteristic) this.instance).setIsReadable(z10);
                return this;
            }

            public Builder setIsWritableWithResponse(boolean z10) {
                copyOnWrite();
                ((DiscoveredCharacteristic) this.instance).setIsWritableWithResponse(z10);
                return this;
            }

            public Builder setIsWritableWithoutResponse(boolean z10) {
                copyOnWrite();
                ((DiscoveredCharacteristic) this.instance).setIsWritableWithoutResponse(z10);
                return this;
            }

            public Builder setServiceId(Uuid uuid) {
                copyOnWrite();
                ((DiscoveredCharacteristic) this.instance).setServiceId(uuid);
                return this;
            }

            private Builder() {
                super(DiscoveredCharacteristic.DEFAULT_INSTANCE);
            }

            public Builder setCharacteristicId(Uuid.Builder builder) {
                copyOnWrite();
                ((DiscoveredCharacteristic) this.instance).setCharacteristicId((Uuid) builder.build());
                return this;
            }

            public Builder setServiceId(Uuid.Builder builder) {
                copyOnWrite();
                ((DiscoveredCharacteristic) this.instance).setServiceId((Uuid) builder.build());
                return this;
            }
        }

        static {
            DiscoveredCharacteristic discoveredCharacteristic = new DiscoveredCharacteristic();
            DEFAULT_INSTANCE = discoveredCharacteristic;
            GeneratedMessageLite.registerDefaultInstance(DiscoveredCharacteristic.class, discoveredCharacteristic);
        }

        private DiscoveredCharacteristic() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCharacteristicId() {
            this.characteristicId_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCharacteristicInstanceId() {
            this.characteristicInstanceId_ = getDefaultInstance().getCharacteristicInstanceId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsIndicatable() {
            this.isIndicatable_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsNotifiable() {
            this.isNotifiable_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsReadable() {
            this.isReadable_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsWritableWithResponse() {
            this.isWritableWithResponse_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsWritableWithoutResponse() {
            this.isWritableWithoutResponse_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServiceId() {
            this.serviceId_ = null;
            this.bitField0_ &= -3;
        }

        public static DiscoveredCharacteristic getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCharacteristicId(Uuid uuid) {
            uuid.getClass();
            Uuid uuid2 = this.characteristicId_;
            if (uuid2 == null || uuid2 == Uuid.getDefaultInstance()) {
                this.characteristicId_ = uuid;
            } else {
                this.characteristicId_ = (Uuid) ((Uuid.Builder) Uuid.newBuilder(this.characteristicId_).mergeFrom((GeneratedMessageLite) uuid)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeServiceId(Uuid uuid) {
            uuid.getClass();
            Uuid uuid2 = this.serviceId_;
            if (uuid2 == null || uuid2 == Uuid.getDefaultInstance()) {
                this.serviceId_ = uuid;
            } else {
                this.serviceId_ = (Uuid) ((Uuid.Builder) Uuid.newBuilder(this.serviceId_).mergeFrom((GeneratedMessageLite) uuid)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DiscoveredCharacteristic parseDelimitedFrom(InputStream inputStream) {
            return (DiscoveredCharacteristic) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiscoveredCharacteristic parseFrom(ByteBuffer byteBuffer) {
            return (DiscoveredCharacteristic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCharacteristicId(Uuid uuid) {
            uuid.getClass();
            this.characteristicId_ = uuid;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCharacteristicInstanceId(String str) {
            str.getClass();
            this.characteristicInstanceId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCharacteristicInstanceIdBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.characteristicInstanceId_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsIndicatable(boolean z10) {
            this.isIndicatable_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsNotifiable(boolean z10) {
            this.isNotifiable_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsReadable(boolean z10) {
            this.isReadable_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsWritableWithResponse(boolean z10) {
            this.isWritableWithResponse_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsWritableWithoutResponse(boolean z10) {
            this.isWritableWithoutResponse_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServiceId(Uuid uuid) {
            uuid.getClass();
            this.serviceId_ = uuid;
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new DiscoveredCharacteristic();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0007\bȈ", new Object[]{"bitField0_", "characteristicId_", "serviceId_", "isReadable_", "isWritableWithResponse_", "isWritableWithoutResponse_", "isNotifiable_", "isIndicatable_", "characteristicInstanceId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (DiscoveredCharacteristic.class) {
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

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredCharacteristicOrBuilder
        public Uuid getCharacteristicId() {
            Uuid uuid = this.characteristicId_;
            return uuid == null ? Uuid.getDefaultInstance() : uuid;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredCharacteristicOrBuilder
        public String getCharacteristicInstanceId() {
            return this.characteristicInstanceId_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredCharacteristicOrBuilder
        public AbstractC3722j getCharacteristicInstanceIdBytes() {
            return AbstractC3722j.n(this.characteristicInstanceId_);
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredCharacteristicOrBuilder
        public boolean getIsIndicatable() {
            return this.isIndicatable_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredCharacteristicOrBuilder
        public boolean getIsNotifiable() {
            return this.isNotifiable_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredCharacteristicOrBuilder
        public boolean getIsReadable() {
            return this.isReadable_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredCharacteristicOrBuilder
        public boolean getIsWritableWithResponse() {
            return this.isWritableWithResponse_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredCharacteristicOrBuilder
        public boolean getIsWritableWithoutResponse() {
            return this.isWritableWithoutResponse_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredCharacteristicOrBuilder
        public Uuid getServiceId() {
            Uuid uuid = this.serviceId_;
            return uuid == null ? Uuid.getDefaultInstance() : uuid;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredCharacteristicOrBuilder
        public boolean hasCharacteristicId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredCharacteristicOrBuilder
        public boolean hasServiceId() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(DiscoveredCharacteristic discoveredCharacteristic) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(discoveredCharacteristic);
        }

        public static DiscoveredCharacteristic parseDelimitedFrom(InputStream inputStream, D d10) {
            return (DiscoveredCharacteristic) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static DiscoveredCharacteristic parseFrom(ByteBuffer byteBuffer, D d10) {
            return (DiscoveredCharacteristic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static DiscoveredCharacteristic parseFrom(AbstractC3722j abstractC3722j) {
            return (DiscoveredCharacteristic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static DiscoveredCharacteristic parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (DiscoveredCharacteristic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static DiscoveredCharacteristic parseFrom(byte[] bArr) {
            return (DiscoveredCharacteristic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DiscoveredCharacteristic parseFrom(byte[] bArr, D d10) {
            return (DiscoveredCharacteristic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static DiscoveredCharacteristic parseFrom(InputStream inputStream) {
            return (DiscoveredCharacteristic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiscoveredCharacteristic parseFrom(InputStream inputStream, D d10) {
            return (DiscoveredCharacteristic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static DiscoveredCharacteristic parseFrom(AbstractC3724k abstractC3724k) {
            return (DiscoveredCharacteristic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static DiscoveredCharacteristic parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (DiscoveredCharacteristic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface DiscoveredCharacteristicOrBuilder extends InterfaceC3719h0 {
        Uuid getCharacteristicId();

        String getCharacteristicInstanceId();

        AbstractC3722j getCharacteristicInstanceIdBytes();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        boolean getIsIndicatable();

        boolean getIsNotifiable();

        boolean getIsReadable();

        boolean getIsWritableWithResponse();

        boolean getIsWritableWithoutResponse();

        Uuid getServiceId();

        boolean hasCharacteristicId();

        boolean hasServiceId();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class DiscoveredService extends GeneratedMessageLite implements DiscoveredServiceOrBuilder {
        public static final int CHARACTERISTICS_FIELD_NUMBER = 4;
        public static final int CHARACTERISTICUUIDS_FIELD_NUMBER = 2;
        private static final DiscoveredService DEFAULT_INSTANCE;
        public static final int INCLUDEDSERVICES_FIELD_NUMBER = 3;
        private static volatile t0 PARSER = null;
        public static final int SERVICEINSTANCEID_FIELD_NUMBER = 5;
        public static final int SERVICEUUID_FIELD_NUMBER = 1;
        private int bitField0_;
        private Uuid serviceUuid_;
        private N.j characteristicUuids_ = GeneratedMessageLite.emptyProtobufList();
        private N.j includedServices_ = GeneratedMessageLite.emptyProtobufList();
        private N.j characteristics_ = GeneratedMessageLite.emptyProtobufList();
        private String serviceInstanceId_ = "";

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements DiscoveredServiceOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllCharacteristicUuids(Iterable<? extends Uuid> iterable) {
                copyOnWrite();
                ((DiscoveredService) this.instance).addAllCharacteristicUuids(iterable);
                return this;
            }

            public Builder addAllCharacteristics(Iterable<? extends DiscoveredCharacteristic> iterable) {
                copyOnWrite();
                ((DiscoveredService) this.instance).addAllCharacteristics(iterable);
                return this;
            }

            public Builder addAllIncludedServices(Iterable<? extends DiscoveredService> iterable) {
                copyOnWrite();
                ((DiscoveredService) this.instance).addAllIncludedServices(iterable);
                return this;
            }

            public Builder addCharacteristicUuids(Uuid uuid) {
                copyOnWrite();
                ((DiscoveredService) this.instance).addCharacteristicUuids(uuid);
                return this;
            }

            public Builder addCharacteristics(DiscoveredCharacteristic discoveredCharacteristic) {
                copyOnWrite();
                ((DiscoveredService) this.instance).addCharacteristics(discoveredCharacteristic);
                return this;
            }

            public Builder addIncludedServices(DiscoveredService discoveredService) {
                copyOnWrite();
                ((DiscoveredService) this.instance).addIncludedServices(discoveredService);
                return this;
            }

            public Builder clearCharacteristicUuids() {
                copyOnWrite();
                ((DiscoveredService) this.instance).clearCharacteristicUuids();
                return this;
            }

            public Builder clearCharacteristics() {
                copyOnWrite();
                ((DiscoveredService) this.instance).clearCharacteristics();
                return this;
            }

            public Builder clearIncludedServices() {
                copyOnWrite();
                ((DiscoveredService) this.instance).clearIncludedServices();
                return this;
            }

            public Builder clearServiceInstanceId() {
                copyOnWrite();
                ((DiscoveredService) this.instance).clearServiceInstanceId();
                return this;
            }

            public Builder clearServiceUuid() {
                copyOnWrite();
                ((DiscoveredService) this.instance).clearServiceUuid();
                return this;
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredServiceOrBuilder
            public Uuid getCharacteristicUuids(int i10) {
                return ((DiscoveredService) this.instance).getCharacteristicUuids(i10);
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredServiceOrBuilder
            public int getCharacteristicUuidsCount() {
                return ((DiscoveredService) this.instance).getCharacteristicUuidsCount();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredServiceOrBuilder
            public List<Uuid> getCharacteristicUuidsList() {
                return Collections.unmodifiableList(((DiscoveredService) this.instance).getCharacteristicUuidsList());
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredServiceOrBuilder
            public DiscoveredCharacteristic getCharacteristics(int i10) {
                return ((DiscoveredService) this.instance).getCharacteristics(i10);
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredServiceOrBuilder
            public int getCharacteristicsCount() {
                return ((DiscoveredService) this.instance).getCharacteristicsCount();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredServiceOrBuilder
            public List<DiscoveredCharacteristic> getCharacteristicsList() {
                return Collections.unmodifiableList(((DiscoveredService) this.instance).getCharacteristicsList());
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredServiceOrBuilder
            public DiscoveredService getIncludedServices(int i10) {
                return ((DiscoveredService) this.instance).getIncludedServices(i10);
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredServiceOrBuilder
            public int getIncludedServicesCount() {
                return ((DiscoveredService) this.instance).getIncludedServicesCount();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredServiceOrBuilder
            public List<DiscoveredService> getIncludedServicesList() {
                return Collections.unmodifiableList(((DiscoveredService) this.instance).getIncludedServicesList());
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredServiceOrBuilder
            public String getServiceInstanceId() {
                return ((DiscoveredService) this.instance).getServiceInstanceId();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredServiceOrBuilder
            public AbstractC3722j getServiceInstanceIdBytes() {
                return ((DiscoveredService) this.instance).getServiceInstanceIdBytes();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredServiceOrBuilder
            public Uuid getServiceUuid() {
                return ((DiscoveredService) this.instance).getServiceUuid();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredServiceOrBuilder
            public boolean hasServiceUuid() {
                return ((DiscoveredService) this.instance).hasServiceUuid();
            }

            public Builder mergeServiceUuid(Uuid uuid) {
                copyOnWrite();
                ((DiscoveredService) this.instance).mergeServiceUuid(uuid);
                return this;
            }

            public Builder removeCharacteristicUuids(int i10) {
                copyOnWrite();
                ((DiscoveredService) this.instance).removeCharacteristicUuids(i10);
                return this;
            }

            public Builder removeCharacteristics(int i10) {
                copyOnWrite();
                ((DiscoveredService) this.instance).removeCharacteristics(i10);
                return this;
            }

            public Builder removeIncludedServices(int i10) {
                copyOnWrite();
                ((DiscoveredService) this.instance).removeIncludedServices(i10);
                return this;
            }

            public Builder setCharacteristicUuids(int i10, Uuid uuid) {
                copyOnWrite();
                ((DiscoveredService) this.instance).setCharacteristicUuids(i10, uuid);
                return this;
            }

            public Builder setCharacteristics(int i10, DiscoveredCharacteristic discoveredCharacteristic) {
                copyOnWrite();
                ((DiscoveredService) this.instance).setCharacteristics(i10, discoveredCharacteristic);
                return this;
            }

            public Builder setIncludedServices(int i10, DiscoveredService discoveredService) {
                copyOnWrite();
                ((DiscoveredService) this.instance).setIncludedServices(i10, discoveredService);
                return this;
            }

            public Builder setServiceInstanceId(String str) {
                copyOnWrite();
                ((DiscoveredService) this.instance).setServiceInstanceId(str);
                return this;
            }

            public Builder setServiceInstanceIdBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((DiscoveredService) this.instance).setServiceInstanceIdBytes(abstractC3722j);
                return this;
            }

            public Builder setServiceUuid(Uuid uuid) {
                copyOnWrite();
                ((DiscoveredService) this.instance).setServiceUuid(uuid);
                return this;
            }

            private Builder() {
                super(DiscoveredService.DEFAULT_INSTANCE);
            }

            public Builder addCharacteristicUuids(int i10, Uuid uuid) {
                copyOnWrite();
                ((DiscoveredService) this.instance).addCharacteristicUuids(i10, uuid);
                return this;
            }

            public Builder addCharacteristics(int i10, DiscoveredCharacteristic discoveredCharacteristic) {
                copyOnWrite();
                ((DiscoveredService) this.instance).addCharacteristics(i10, discoveredCharacteristic);
                return this;
            }

            public Builder addIncludedServices(int i10, DiscoveredService discoveredService) {
                copyOnWrite();
                ((DiscoveredService) this.instance).addIncludedServices(i10, discoveredService);
                return this;
            }

            public Builder setCharacteristicUuids(int i10, Uuid.Builder builder) {
                copyOnWrite();
                ((DiscoveredService) this.instance).setCharacteristicUuids(i10, (Uuid) builder.build());
                return this;
            }

            public Builder setCharacteristics(int i10, DiscoveredCharacteristic.Builder builder) {
                copyOnWrite();
                ((DiscoveredService) this.instance).setCharacteristics(i10, (DiscoveredCharacteristic) builder.build());
                return this;
            }

            public Builder setIncludedServices(int i10, Builder builder) {
                copyOnWrite();
                ((DiscoveredService) this.instance).setIncludedServices(i10, (DiscoveredService) builder.build());
                return this;
            }

            public Builder setServiceUuid(Uuid.Builder builder) {
                copyOnWrite();
                ((DiscoveredService) this.instance).setServiceUuid((Uuid) builder.build());
                return this;
            }

            public Builder addCharacteristicUuids(Uuid.Builder builder) {
                copyOnWrite();
                ((DiscoveredService) this.instance).addCharacteristicUuids((Uuid) builder.build());
                return this;
            }

            public Builder addCharacteristics(DiscoveredCharacteristic.Builder builder) {
                copyOnWrite();
                ((DiscoveredService) this.instance).addCharacteristics((DiscoveredCharacteristic) builder.build());
                return this;
            }

            public Builder addIncludedServices(Builder builder) {
                copyOnWrite();
                ((DiscoveredService) this.instance).addIncludedServices((DiscoveredService) builder.build());
                return this;
            }

            public Builder addCharacteristicUuids(int i10, Uuid.Builder builder) {
                copyOnWrite();
                ((DiscoveredService) this.instance).addCharacteristicUuids(i10, (Uuid) builder.build());
                return this;
            }

            public Builder addCharacteristics(int i10, DiscoveredCharacteristic.Builder builder) {
                copyOnWrite();
                ((DiscoveredService) this.instance).addCharacteristics(i10, (DiscoveredCharacteristic) builder.build());
                return this;
            }

            public Builder addIncludedServices(int i10, Builder builder) {
                copyOnWrite();
                ((DiscoveredService) this.instance).addIncludedServices(i10, (DiscoveredService) builder.build());
                return this;
            }
        }

        static {
            DiscoveredService discoveredService = new DiscoveredService();
            DEFAULT_INSTANCE = discoveredService;
            GeneratedMessageLite.registerDefaultInstance(DiscoveredService.class, discoveredService);
        }

        private DiscoveredService() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCharacteristicUuids(Iterable<? extends Uuid> iterable) {
            ensureCharacteristicUuidsIsMutable();
            AbstractC3704a.addAll((Iterable) iterable, (List) this.characteristicUuids_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCharacteristics(Iterable<? extends DiscoveredCharacteristic> iterable) {
            ensureCharacteristicsIsMutable();
            AbstractC3704a.addAll((Iterable) iterable, (List) this.characteristics_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllIncludedServices(Iterable<? extends DiscoveredService> iterable) {
            ensureIncludedServicesIsMutable();
            AbstractC3704a.addAll((Iterable) iterable, (List) this.includedServices_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCharacteristicUuids(Uuid uuid) {
            uuid.getClass();
            ensureCharacteristicUuidsIsMutable();
            this.characteristicUuids_.add(uuid);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCharacteristics(DiscoveredCharacteristic discoveredCharacteristic) {
            discoveredCharacteristic.getClass();
            ensureCharacteristicsIsMutable();
            this.characteristics_.add(discoveredCharacteristic);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addIncludedServices(DiscoveredService discoveredService) {
            discoveredService.getClass();
            ensureIncludedServicesIsMutable();
            this.includedServices_.add(discoveredService);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCharacteristicUuids() {
            this.characteristicUuids_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCharacteristics() {
            this.characteristics_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIncludedServices() {
            this.includedServices_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServiceInstanceId() {
            this.serviceInstanceId_ = getDefaultInstance().getServiceInstanceId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServiceUuid() {
            this.serviceUuid_ = null;
            this.bitField0_ &= -2;
        }

        private void ensureCharacteristicUuidsIsMutable() {
            N.j jVar = this.characteristicUuids_;
            if (jVar.m()) {
                return;
            }
            this.characteristicUuids_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        private void ensureCharacteristicsIsMutable() {
            N.j jVar = this.characteristics_;
            if (jVar.m()) {
                return;
            }
            this.characteristics_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        private void ensureIncludedServicesIsMutable() {
            N.j jVar = this.includedServices_;
            if (jVar.m()) {
                return;
            }
            this.includedServices_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        public static DiscoveredService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeServiceUuid(Uuid uuid) {
            uuid.getClass();
            Uuid uuid2 = this.serviceUuid_;
            if (uuid2 == null || uuid2 == Uuid.getDefaultInstance()) {
                this.serviceUuid_ = uuid;
            } else {
                this.serviceUuid_ = (Uuid) ((Uuid.Builder) Uuid.newBuilder(this.serviceUuid_).mergeFrom((GeneratedMessageLite) uuid)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DiscoveredService parseDelimitedFrom(InputStream inputStream) {
            return (DiscoveredService) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiscoveredService parseFrom(ByteBuffer byteBuffer) {
            return (DiscoveredService) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeCharacteristicUuids(int i10) {
            ensureCharacteristicUuidsIsMutable();
            this.characteristicUuids_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeCharacteristics(int i10) {
            ensureCharacteristicsIsMutable();
            this.characteristics_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeIncludedServices(int i10) {
            ensureIncludedServicesIsMutable();
            this.includedServices_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCharacteristicUuids(int i10, Uuid uuid) {
            uuid.getClass();
            ensureCharacteristicUuidsIsMutable();
            this.characteristicUuids_.set(i10, uuid);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCharacteristics(int i10, DiscoveredCharacteristic discoveredCharacteristic) {
            discoveredCharacteristic.getClass();
            ensureCharacteristicsIsMutable();
            this.characteristics_.set(i10, discoveredCharacteristic);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIncludedServices(int i10, DiscoveredService discoveredService) {
            discoveredService.getClass();
            ensureIncludedServicesIsMutable();
            this.includedServices_.set(i10, discoveredService);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServiceInstanceId(String str) {
            str.getClass();
            this.serviceInstanceId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServiceInstanceIdBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.serviceInstanceId_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServiceUuid(Uuid uuid) {
            uuid.getClass();
            this.serviceUuid_ = uuid;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new DiscoveredService();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b\u0004\u001b\u0005Ȉ", new Object[]{"bitField0_", "serviceUuid_", "characteristicUuids_", Uuid.class, "includedServices_", DiscoveredService.class, "characteristics_", DiscoveredCharacteristic.class, "serviceInstanceId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (DiscoveredService.class) {
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

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredServiceOrBuilder
        public Uuid getCharacteristicUuids(int i10) {
            return (Uuid) this.characteristicUuids_.get(i10);
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredServiceOrBuilder
        public int getCharacteristicUuidsCount() {
            return this.characteristicUuids_.size();
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredServiceOrBuilder
        public List<Uuid> getCharacteristicUuidsList() {
            return this.characteristicUuids_;
        }

        public UuidOrBuilder getCharacteristicUuidsOrBuilder(int i10) {
            return (UuidOrBuilder) this.characteristicUuids_.get(i10);
        }

        public List<? extends UuidOrBuilder> getCharacteristicUuidsOrBuilderList() {
            return this.characteristicUuids_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredServiceOrBuilder
        public DiscoveredCharacteristic getCharacteristics(int i10) {
            return (DiscoveredCharacteristic) this.characteristics_.get(i10);
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredServiceOrBuilder
        public int getCharacteristicsCount() {
            return this.characteristics_.size();
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredServiceOrBuilder
        public List<DiscoveredCharacteristic> getCharacteristicsList() {
            return this.characteristics_;
        }

        public DiscoveredCharacteristicOrBuilder getCharacteristicsOrBuilder(int i10) {
            return (DiscoveredCharacteristicOrBuilder) this.characteristics_.get(i10);
        }

        public List<? extends DiscoveredCharacteristicOrBuilder> getCharacteristicsOrBuilderList() {
            return this.characteristics_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredServiceOrBuilder
        public DiscoveredService getIncludedServices(int i10) {
            return (DiscoveredService) this.includedServices_.get(i10);
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredServiceOrBuilder
        public int getIncludedServicesCount() {
            return this.includedServices_.size();
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredServiceOrBuilder
        public List<DiscoveredService> getIncludedServicesList() {
            return this.includedServices_;
        }

        public DiscoveredServiceOrBuilder getIncludedServicesOrBuilder(int i10) {
            return (DiscoveredServiceOrBuilder) this.includedServices_.get(i10);
        }

        public List<? extends DiscoveredServiceOrBuilder> getIncludedServicesOrBuilderList() {
            return this.includedServices_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredServiceOrBuilder
        public String getServiceInstanceId() {
            return this.serviceInstanceId_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredServiceOrBuilder
        public AbstractC3722j getServiceInstanceIdBytes() {
            return AbstractC3722j.n(this.serviceInstanceId_);
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredServiceOrBuilder
        public Uuid getServiceUuid() {
            Uuid uuid = this.serviceUuid_;
            return uuid == null ? Uuid.getDefaultInstance() : uuid;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.DiscoveredServiceOrBuilder
        public boolean hasServiceUuid() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(DiscoveredService discoveredService) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(discoveredService);
        }

        public static DiscoveredService parseDelimitedFrom(InputStream inputStream, D d10) {
            return (DiscoveredService) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static DiscoveredService parseFrom(ByteBuffer byteBuffer, D d10) {
            return (DiscoveredService) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static DiscoveredService parseFrom(AbstractC3722j abstractC3722j) {
            return (DiscoveredService) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCharacteristicUuids(int i10, Uuid uuid) {
            uuid.getClass();
            ensureCharacteristicUuidsIsMutable();
            this.characteristicUuids_.add(i10, uuid);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCharacteristics(int i10, DiscoveredCharacteristic discoveredCharacteristic) {
            discoveredCharacteristic.getClass();
            ensureCharacteristicsIsMutable();
            this.characteristics_.add(i10, discoveredCharacteristic);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addIncludedServices(int i10, DiscoveredService discoveredService) {
            discoveredService.getClass();
            ensureIncludedServicesIsMutable();
            this.includedServices_.add(i10, discoveredService);
        }

        public static DiscoveredService parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (DiscoveredService) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static DiscoveredService parseFrom(byte[] bArr) {
            return (DiscoveredService) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DiscoveredService parseFrom(byte[] bArr, D d10) {
            return (DiscoveredService) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static DiscoveredService parseFrom(InputStream inputStream) {
            return (DiscoveredService) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiscoveredService parseFrom(InputStream inputStream, D d10) {
            return (DiscoveredService) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static DiscoveredService parseFrom(AbstractC3724k abstractC3724k) {
            return (DiscoveredService) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static DiscoveredService parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (DiscoveredService) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface DiscoveredServiceOrBuilder extends InterfaceC3719h0 {
        Uuid getCharacteristicUuids(int i10);

        int getCharacteristicUuidsCount();

        List<Uuid> getCharacteristicUuidsList();

        DiscoveredCharacteristic getCharacteristics(int i10);

        int getCharacteristicsCount();

        List<DiscoveredCharacteristic> getCharacteristicsList();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        DiscoveredService getIncludedServices(int i10);

        int getIncludedServicesCount();

        List<DiscoveredService> getIncludedServicesList();

        String getServiceInstanceId();

        AbstractC3722j getServiceInstanceIdBytes();

        Uuid getServiceUuid();

        boolean hasServiceUuid();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class GenericFailure extends GeneratedMessageLite implements GenericFailureOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        private static final GenericFailure DEFAULT_INSTANCE;
        public static final int MESSAGE_FIELD_NUMBER = 2;
        private static volatile t0 PARSER;
        private int code_;
        private String message_ = "";

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements GenericFailureOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearCode() {
                copyOnWrite();
                ((GenericFailure) this.instance).clearCode();
                return this;
            }

            public Builder clearMessage() {
                copyOnWrite();
                ((GenericFailure) this.instance).clearMessage();
                return this;
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.GenericFailureOrBuilder
            public int getCode() {
                return ((GenericFailure) this.instance).getCode();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.GenericFailureOrBuilder
            public String getMessage() {
                return ((GenericFailure) this.instance).getMessage();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.GenericFailureOrBuilder
            public AbstractC3722j getMessageBytes() {
                return ((GenericFailure) this.instance).getMessageBytes();
            }

            public Builder setCode(int i10) {
                copyOnWrite();
                ((GenericFailure) this.instance).setCode(i10);
                return this;
            }

            public Builder setMessage(String str) {
                copyOnWrite();
                ((GenericFailure) this.instance).setMessage(str);
                return this;
            }

            public Builder setMessageBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((GenericFailure) this.instance).setMessageBytes(abstractC3722j);
                return this;
            }

            private Builder() {
                super(GenericFailure.DEFAULT_INSTANCE);
            }
        }

        static {
            GenericFailure genericFailure = new GenericFailure();
            DEFAULT_INSTANCE = genericFailure;
            GeneratedMessageLite.registerDefaultInstance(GenericFailure.class, genericFailure);
        }

        private GenericFailure() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCode() {
            this.code_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessage() {
            this.message_ = getDefaultInstance().getMessage();
        }

        public static GenericFailure getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static GenericFailure parseDelimitedFrom(InputStream inputStream) {
            return (GenericFailure) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GenericFailure parseFrom(ByteBuffer byteBuffer) {
            return (GenericFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCode(int i10) {
            this.code_ = i10;
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new GenericFailure();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"code_", "message_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (GenericFailure.class) {
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

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.GenericFailureOrBuilder
        public int getCode() {
            return this.code_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.GenericFailureOrBuilder
        public String getMessage() {
            return this.message_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.GenericFailureOrBuilder
        public AbstractC3722j getMessageBytes() {
            return AbstractC3722j.n(this.message_);
        }

        public static Builder newBuilder(GenericFailure genericFailure) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(genericFailure);
        }

        public static GenericFailure parseDelimitedFrom(InputStream inputStream, D d10) {
            return (GenericFailure) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static GenericFailure parseFrom(ByteBuffer byteBuffer, D d10) {
            return (GenericFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static GenericFailure parseFrom(AbstractC3722j abstractC3722j) {
            return (GenericFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static GenericFailure parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (GenericFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static GenericFailure parseFrom(byte[] bArr) {
            return (GenericFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GenericFailure parseFrom(byte[] bArr, D d10) {
            return (GenericFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static GenericFailure parseFrom(InputStream inputStream) {
            return (GenericFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GenericFailure parseFrom(InputStream inputStream, D d10) {
            return (GenericFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static GenericFailure parseFrom(AbstractC3724k abstractC3724k) {
            return (GenericFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static GenericFailure parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (GenericFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface GenericFailureOrBuilder extends InterfaceC3719h0 {
        int getCode();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        String getMessage();

        AbstractC3722j getMessageBytes();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class IsConnectable extends GeneratedMessageLite implements IsConnectableOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        private static final IsConnectable DEFAULT_INSTANCE;
        private static volatile t0 PARSER;
        private int code_;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements IsConnectableOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearCode() {
                copyOnWrite();
                ((IsConnectable) this.instance).clearCode();
                return this;
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.IsConnectableOrBuilder
            public int getCode() {
                return ((IsConnectable) this.instance).getCode();
            }

            public Builder setCode(int i10) {
                copyOnWrite();
                ((IsConnectable) this.instance).setCode(i10);
                return this;
            }

            private Builder() {
                super(IsConnectable.DEFAULT_INSTANCE);
            }
        }

        static {
            IsConnectable isConnectable = new IsConnectable();
            DEFAULT_INSTANCE = isConnectable;
            GeneratedMessageLite.registerDefaultInstance(IsConnectable.class, isConnectable);
        }

        private IsConnectable() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCode() {
            this.code_ = 0;
        }

        public static IsConnectable getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IsConnectable parseDelimitedFrom(InputStream inputStream) {
            return (IsConnectable) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IsConnectable parseFrom(ByteBuffer byteBuffer) {
            return (IsConnectable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCode(int i10) {
            this.code_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new IsConnectable();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"code_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (IsConnectable.class) {
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

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.IsConnectableOrBuilder
        public int getCode() {
            return this.code_;
        }

        public static Builder newBuilder(IsConnectable isConnectable) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(isConnectable);
        }

        public static IsConnectable parseDelimitedFrom(InputStream inputStream, D d10) {
            return (IsConnectable) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static IsConnectable parseFrom(ByteBuffer byteBuffer, D d10) {
            return (IsConnectable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static IsConnectable parseFrom(AbstractC3722j abstractC3722j) {
            return (IsConnectable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static IsConnectable parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (IsConnectable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static IsConnectable parseFrom(byte[] bArr) {
            return (IsConnectable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IsConnectable parseFrom(byte[] bArr, D d10) {
            return (IsConnectable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static IsConnectable parseFrom(InputStream inputStream) {
            return (IsConnectable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IsConnectable parseFrom(InputStream inputStream, D d10) {
            return (IsConnectable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static IsConnectable parseFrom(AbstractC3724k abstractC3724k) {
            return (IsConnectable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static IsConnectable parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (IsConnectable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface IsConnectableOrBuilder extends InterfaceC3719h0 {
        int getCode();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class NegotiateMtuInfo extends GeneratedMessageLite implements NegotiateMtuInfoOrBuilder {
        private static final NegotiateMtuInfo DEFAULT_INSTANCE;
        public static final int DEVICEID_FIELD_NUMBER = 1;
        public static final int FAILURE_FIELD_NUMBER = 3;
        public static final int MTUSIZE_FIELD_NUMBER = 2;
        private static volatile t0 PARSER;
        private int bitField0_;
        private String deviceId_ = "";
        private GenericFailure failure_;
        private int mtuSize_;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements NegotiateMtuInfoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearDeviceId() {
                copyOnWrite();
                ((NegotiateMtuInfo) this.instance).clearDeviceId();
                return this;
            }

            public Builder clearFailure() {
                copyOnWrite();
                ((NegotiateMtuInfo) this.instance).clearFailure();
                return this;
            }

            public Builder clearMtuSize() {
                copyOnWrite();
                ((NegotiateMtuInfo) this.instance).clearMtuSize();
                return this;
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.NegotiateMtuInfoOrBuilder
            public String getDeviceId() {
                return ((NegotiateMtuInfo) this.instance).getDeviceId();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.NegotiateMtuInfoOrBuilder
            public AbstractC3722j getDeviceIdBytes() {
                return ((NegotiateMtuInfo) this.instance).getDeviceIdBytes();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.NegotiateMtuInfoOrBuilder
            public GenericFailure getFailure() {
                return ((NegotiateMtuInfo) this.instance).getFailure();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.NegotiateMtuInfoOrBuilder
            public int getMtuSize() {
                return ((NegotiateMtuInfo) this.instance).getMtuSize();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.NegotiateMtuInfoOrBuilder
            public boolean hasFailure() {
                return ((NegotiateMtuInfo) this.instance).hasFailure();
            }

            public Builder mergeFailure(GenericFailure genericFailure) {
                copyOnWrite();
                ((NegotiateMtuInfo) this.instance).mergeFailure(genericFailure);
                return this;
            }

            public Builder setDeviceId(String str) {
                copyOnWrite();
                ((NegotiateMtuInfo) this.instance).setDeviceId(str);
                return this;
            }

            public Builder setDeviceIdBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((NegotiateMtuInfo) this.instance).setDeviceIdBytes(abstractC3722j);
                return this;
            }

            public Builder setFailure(GenericFailure genericFailure) {
                copyOnWrite();
                ((NegotiateMtuInfo) this.instance).setFailure(genericFailure);
                return this;
            }

            public Builder setMtuSize(int i10) {
                copyOnWrite();
                ((NegotiateMtuInfo) this.instance).setMtuSize(i10);
                return this;
            }

            private Builder() {
                super(NegotiateMtuInfo.DEFAULT_INSTANCE);
            }

            public Builder setFailure(GenericFailure.Builder builder) {
                copyOnWrite();
                ((NegotiateMtuInfo) this.instance).setFailure((GenericFailure) builder.build());
                return this;
            }
        }

        static {
            NegotiateMtuInfo negotiateMtuInfo = new NegotiateMtuInfo();
            DEFAULT_INSTANCE = negotiateMtuInfo;
            GeneratedMessageLite.registerDefaultInstance(NegotiateMtuInfo.class, negotiateMtuInfo);
        }

        private NegotiateMtuInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceId() {
            this.deviceId_ = getDefaultInstance().getDeviceId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFailure() {
            this.failure_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMtuSize() {
            this.mtuSize_ = 0;
        }

        public static NegotiateMtuInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFailure(GenericFailure genericFailure) {
            genericFailure.getClass();
            GenericFailure genericFailure2 = this.failure_;
            if (genericFailure2 == null || genericFailure2 == GenericFailure.getDefaultInstance()) {
                this.failure_ = genericFailure;
            } else {
                this.failure_ = (GenericFailure) ((GenericFailure.Builder) GenericFailure.newBuilder(this.failure_).mergeFrom((GeneratedMessageLite) genericFailure)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static NegotiateMtuInfo parseDelimitedFrom(InputStream inputStream) {
            return (NegotiateMtuInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NegotiateMtuInfo parseFrom(ByteBuffer byteBuffer) {
            return (NegotiateMtuInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceId(String str) {
            str.getClass();
            this.deviceId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceIdBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.deviceId_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFailure(GenericFailure genericFailure) {
            genericFailure.getClass();
            this.failure_ = genericFailure;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMtuSize(int i10) {
            this.mtuSize_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new NegotiateMtuInfo();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003ဉ\u0000", new Object[]{"bitField0_", "deviceId_", "mtuSize_", "failure_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (NegotiateMtuInfo.class) {
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

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.NegotiateMtuInfoOrBuilder
        public String getDeviceId() {
            return this.deviceId_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.NegotiateMtuInfoOrBuilder
        public AbstractC3722j getDeviceIdBytes() {
            return AbstractC3722j.n(this.deviceId_);
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.NegotiateMtuInfoOrBuilder
        public GenericFailure getFailure() {
            GenericFailure genericFailure = this.failure_;
            return genericFailure == null ? GenericFailure.getDefaultInstance() : genericFailure;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.NegotiateMtuInfoOrBuilder
        public int getMtuSize() {
            return this.mtuSize_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.NegotiateMtuInfoOrBuilder
        public boolean hasFailure() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(NegotiateMtuInfo negotiateMtuInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(negotiateMtuInfo);
        }

        public static NegotiateMtuInfo parseDelimitedFrom(InputStream inputStream, D d10) {
            return (NegotiateMtuInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static NegotiateMtuInfo parseFrom(ByteBuffer byteBuffer, D d10) {
            return (NegotiateMtuInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static NegotiateMtuInfo parseFrom(AbstractC3722j abstractC3722j) {
            return (NegotiateMtuInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static NegotiateMtuInfo parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (NegotiateMtuInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static NegotiateMtuInfo parseFrom(byte[] bArr) {
            return (NegotiateMtuInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NegotiateMtuInfo parseFrom(byte[] bArr, D d10) {
            return (NegotiateMtuInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static NegotiateMtuInfo parseFrom(InputStream inputStream) {
            return (NegotiateMtuInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NegotiateMtuInfo parseFrom(InputStream inputStream, D d10) {
            return (NegotiateMtuInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static NegotiateMtuInfo parseFrom(AbstractC3724k abstractC3724k) {
            return (NegotiateMtuInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static NegotiateMtuInfo parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (NegotiateMtuInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface NegotiateMtuInfoOrBuilder extends InterfaceC3719h0 {
        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        String getDeviceId();

        AbstractC3722j getDeviceIdBytes();

        GenericFailure getFailure();

        int getMtuSize();

        boolean hasFailure();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class NegotiateMtuRequest extends GeneratedMessageLite implements NegotiateMtuRequestOrBuilder {
        private static final NegotiateMtuRequest DEFAULT_INSTANCE;
        public static final int DEVICEID_FIELD_NUMBER = 1;
        public static final int MTUSIZE_FIELD_NUMBER = 2;
        private static volatile t0 PARSER;
        private String deviceId_ = "";
        private int mtuSize_;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements NegotiateMtuRequestOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearDeviceId() {
                copyOnWrite();
                ((NegotiateMtuRequest) this.instance).clearDeviceId();
                return this;
            }

            public Builder clearMtuSize() {
                copyOnWrite();
                ((NegotiateMtuRequest) this.instance).clearMtuSize();
                return this;
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.NegotiateMtuRequestOrBuilder
            public String getDeviceId() {
                return ((NegotiateMtuRequest) this.instance).getDeviceId();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.NegotiateMtuRequestOrBuilder
            public AbstractC3722j getDeviceIdBytes() {
                return ((NegotiateMtuRequest) this.instance).getDeviceIdBytes();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.NegotiateMtuRequestOrBuilder
            public int getMtuSize() {
                return ((NegotiateMtuRequest) this.instance).getMtuSize();
            }

            public Builder setDeviceId(String str) {
                copyOnWrite();
                ((NegotiateMtuRequest) this.instance).setDeviceId(str);
                return this;
            }

            public Builder setDeviceIdBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((NegotiateMtuRequest) this.instance).setDeviceIdBytes(abstractC3722j);
                return this;
            }

            public Builder setMtuSize(int i10) {
                copyOnWrite();
                ((NegotiateMtuRequest) this.instance).setMtuSize(i10);
                return this;
            }

            private Builder() {
                super(NegotiateMtuRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            NegotiateMtuRequest negotiateMtuRequest = new NegotiateMtuRequest();
            DEFAULT_INSTANCE = negotiateMtuRequest;
            GeneratedMessageLite.registerDefaultInstance(NegotiateMtuRequest.class, negotiateMtuRequest);
        }

        private NegotiateMtuRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceId() {
            this.deviceId_ = getDefaultInstance().getDeviceId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMtuSize() {
            this.mtuSize_ = 0;
        }

        public static NegotiateMtuRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static NegotiateMtuRequest parseDelimitedFrom(InputStream inputStream) {
            return (NegotiateMtuRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NegotiateMtuRequest parseFrom(ByteBuffer byteBuffer) {
            return (NegotiateMtuRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceId(String str) {
            str.getClass();
            this.deviceId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceIdBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.deviceId_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMtuSize(int i10) {
            this.mtuSize_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new NegotiateMtuRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"deviceId_", "mtuSize_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (NegotiateMtuRequest.class) {
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

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.NegotiateMtuRequestOrBuilder
        public String getDeviceId() {
            return this.deviceId_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.NegotiateMtuRequestOrBuilder
        public AbstractC3722j getDeviceIdBytes() {
            return AbstractC3722j.n(this.deviceId_);
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.NegotiateMtuRequestOrBuilder
        public int getMtuSize() {
            return this.mtuSize_;
        }

        public static Builder newBuilder(NegotiateMtuRequest negotiateMtuRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(negotiateMtuRequest);
        }

        public static NegotiateMtuRequest parseDelimitedFrom(InputStream inputStream, D d10) {
            return (NegotiateMtuRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static NegotiateMtuRequest parseFrom(ByteBuffer byteBuffer, D d10) {
            return (NegotiateMtuRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static NegotiateMtuRequest parseFrom(AbstractC3722j abstractC3722j) {
            return (NegotiateMtuRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static NegotiateMtuRequest parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (NegotiateMtuRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static NegotiateMtuRequest parseFrom(byte[] bArr) {
            return (NegotiateMtuRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NegotiateMtuRequest parseFrom(byte[] bArr, D d10) {
            return (NegotiateMtuRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static NegotiateMtuRequest parseFrom(InputStream inputStream) {
            return (NegotiateMtuRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NegotiateMtuRequest parseFrom(InputStream inputStream, D d10) {
            return (NegotiateMtuRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static NegotiateMtuRequest parseFrom(AbstractC3724k abstractC3724k) {
            return (NegotiateMtuRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static NegotiateMtuRequest parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (NegotiateMtuRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface NegotiateMtuRequestOrBuilder extends InterfaceC3719h0 {
        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        String getDeviceId();

        AbstractC3722j getDeviceIdBytes();

        int getMtuSize();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class NotifyCharacteristicRequest extends GeneratedMessageLite implements NotifyCharacteristicRequestOrBuilder {
        public static final int CHARACTERISTIC_FIELD_NUMBER = 1;
        private static final NotifyCharacteristicRequest DEFAULT_INSTANCE;
        private static volatile t0 PARSER;
        private int bitField0_;
        private CharacteristicAddress characteristic_;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements NotifyCharacteristicRequestOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearCharacteristic() {
                copyOnWrite();
                ((NotifyCharacteristicRequest) this.instance).clearCharacteristic();
                return this;
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.NotifyCharacteristicRequestOrBuilder
            public CharacteristicAddress getCharacteristic() {
                return ((NotifyCharacteristicRequest) this.instance).getCharacteristic();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.NotifyCharacteristicRequestOrBuilder
            public boolean hasCharacteristic() {
                return ((NotifyCharacteristicRequest) this.instance).hasCharacteristic();
            }

            public Builder mergeCharacteristic(CharacteristicAddress characteristicAddress) {
                copyOnWrite();
                ((NotifyCharacteristicRequest) this.instance).mergeCharacteristic(characteristicAddress);
                return this;
            }

            public Builder setCharacteristic(CharacteristicAddress characteristicAddress) {
                copyOnWrite();
                ((NotifyCharacteristicRequest) this.instance).setCharacteristic(characteristicAddress);
                return this;
            }

            private Builder() {
                super(NotifyCharacteristicRequest.DEFAULT_INSTANCE);
            }

            public Builder setCharacteristic(CharacteristicAddress.Builder builder) {
                copyOnWrite();
                ((NotifyCharacteristicRequest) this.instance).setCharacteristic((CharacteristicAddress) builder.build());
                return this;
            }
        }

        static {
            NotifyCharacteristicRequest notifyCharacteristicRequest = new NotifyCharacteristicRequest();
            DEFAULT_INSTANCE = notifyCharacteristicRequest;
            GeneratedMessageLite.registerDefaultInstance(NotifyCharacteristicRequest.class, notifyCharacteristicRequest);
        }

        private NotifyCharacteristicRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCharacteristic() {
            this.characteristic_ = null;
            this.bitField0_ &= -2;
        }

        public static NotifyCharacteristicRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCharacteristic(CharacteristicAddress characteristicAddress) {
            characteristicAddress.getClass();
            CharacteristicAddress characteristicAddress2 = this.characteristic_;
            if (characteristicAddress2 == null || characteristicAddress2 == CharacteristicAddress.getDefaultInstance()) {
                this.characteristic_ = characteristicAddress;
            } else {
                this.characteristic_ = (CharacteristicAddress) ((CharacteristicAddress.Builder) CharacteristicAddress.newBuilder(this.characteristic_).mergeFrom((GeneratedMessageLite) characteristicAddress)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static NotifyCharacteristicRequest parseDelimitedFrom(InputStream inputStream) {
            return (NotifyCharacteristicRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyCharacteristicRequest parseFrom(ByteBuffer byteBuffer) {
            return (NotifyCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCharacteristic(CharacteristicAddress characteristicAddress) {
            characteristicAddress.getClass();
            this.characteristic_ = characteristicAddress;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new NotifyCharacteristicRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "characteristic_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (NotifyCharacteristicRequest.class) {
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

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.NotifyCharacteristicRequestOrBuilder
        public CharacteristicAddress getCharacteristic() {
            CharacteristicAddress characteristicAddress = this.characteristic_;
            return characteristicAddress == null ? CharacteristicAddress.getDefaultInstance() : characteristicAddress;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.NotifyCharacteristicRequestOrBuilder
        public boolean hasCharacteristic() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(NotifyCharacteristicRequest notifyCharacteristicRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(notifyCharacteristicRequest);
        }

        public static NotifyCharacteristicRequest parseDelimitedFrom(InputStream inputStream, D d10) {
            return (NotifyCharacteristicRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static NotifyCharacteristicRequest parseFrom(ByteBuffer byteBuffer, D d10) {
            return (NotifyCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static NotifyCharacteristicRequest parseFrom(AbstractC3722j abstractC3722j) {
            return (NotifyCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static NotifyCharacteristicRequest parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (NotifyCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static NotifyCharacteristicRequest parseFrom(byte[] bArr) {
            return (NotifyCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NotifyCharacteristicRequest parseFrom(byte[] bArr, D d10) {
            return (NotifyCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static NotifyCharacteristicRequest parseFrom(InputStream inputStream) {
            return (NotifyCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyCharacteristicRequest parseFrom(InputStream inputStream, D d10) {
            return (NotifyCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static NotifyCharacteristicRequest parseFrom(AbstractC3724k abstractC3724k) {
            return (NotifyCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static NotifyCharacteristicRequest parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (NotifyCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface NotifyCharacteristicRequestOrBuilder extends InterfaceC3719h0 {
        CharacteristicAddress getCharacteristic();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        boolean hasCharacteristic();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class NotifyNoMoreCharacteristicRequest extends GeneratedMessageLite implements NotifyNoMoreCharacteristicRequestOrBuilder {
        public static final int CHARACTERISTIC_FIELD_NUMBER = 1;
        private static final NotifyNoMoreCharacteristicRequest DEFAULT_INSTANCE;
        private static volatile t0 PARSER;
        private int bitField0_;
        private CharacteristicAddress characteristic_;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements NotifyNoMoreCharacteristicRequestOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearCharacteristic() {
                copyOnWrite();
                ((NotifyNoMoreCharacteristicRequest) this.instance).clearCharacteristic();
                return this;
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.NotifyNoMoreCharacteristicRequestOrBuilder
            public CharacteristicAddress getCharacteristic() {
                return ((NotifyNoMoreCharacteristicRequest) this.instance).getCharacteristic();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.NotifyNoMoreCharacteristicRequestOrBuilder
            public boolean hasCharacteristic() {
                return ((NotifyNoMoreCharacteristicRequest) this.instance).hasCharacteristic();
            }

            public Builder mergeCharacteristic(CharacteristicAddress characteristicAddress) {
                copyOnWrite();
                ((NotifyNoMoreCharacteristicRequest) this.instance).mergeCharacteristic(characteristicAddress);
                return this;
            }

            public Builder setCharacteristic(CharacteristicAddress characteristicAddress) {
                copyOnWrite();
                ((NotifyNoMoreCharacteristicRequest) this.instance).setCharacteristic(characteristicAddress);
                return this;
            }

            private Builder() {
                super(NotifyNoMoreCharacteristicRequest.DEFAULT_INSTANCE);
            }

            public Builder setCharacteristic(CharacteristicAddress.Builder builder) {
                copyOnWrite();
                ((NotifyNoMoreCharacteristicRequest) this.instance).setCharacteristic((CharacteristicAddress) builder.build());
                return this;
            }
        }

        static {
            NotifyNoMoreCharacteristicRequest notifyNoMoreCharacteristicRequest = new NotifyNoMoreCharacteristicRequest();
            DEFAULT_INSTANCE = notifyNoMoreCharacteristicRequest;
            GeneratedMessageLite.registerDefaultInstance(NotifyNoMoreCharacteristicRequest.class, notifyNoMoreCharacteristicRequest);
        }

        private NotifyNoMoreCharacteristicRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCharacteristic() {
            this.characteristic_ = null;
            this.bitField0_ &= -2;
        }

        public static NotifyNoMoreCharacteristicRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCharacteristic(CharacteristicAddress characteristicAddress) {
            characteristicAddress.getClass();
            CharacteristicAddress characteristicAddress2 = this.characteristic_;
            if (characteristicAddress2 == null || characteristicAddress2 == CharacteristicAddress.getDefaultInstance()) {
                this.characteristic_ = characteristicAddress;
            } else {
                this.characteristic_ = (CharacteristicAddress) ((CharacteristicAddress.Builder) CharacteristicAddress.newBuilder(this.characteristic_).mergeFrom((GeneratedMessageLite) characteristicAddress)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static NotifyNoMoreCharacteristicRequest parseDelimitedFrom(InputStream inputStream) {
            return (NotifyNoMoreCharacteristicRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyNoMoreCharacteristicRequest parseFrom(ByteBuffer byteBuffer) {
            return (NotifyNoMoreCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCharacteristic(CharacteristicAddress characteristicAddress) {
            characteristicAddress.getClass();
            this.characteristic_ = characteristicAddress;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new NotifyNoMoreCharacteristicRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "characteristic_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (NotifyNoMoreCharacteristicRequest.class) {
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

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.NotifyNoMoreCharacteristicRequestOrBuilder
        public CharacteristicAddress getCharacteristic() {
            CharacteristicAddress characteristicAddress = this.characteristic_;
            return characteristicAddress == null ? CharacteristicAddress.getDefaultInstance() : characteristicAddress;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.NotifyNoMoreCharacteristicRequestOrBuilder
        public boolean hasCharacteristic() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(NotifyNoMoreCharacteristicRequest notifyNoMoreCharacteristicRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(notifyNoMoreCharacteristicRequest);
        }

        public static NotifyNoMoreCharacteristicRequest parseDelimitedFrom(InputStream inputStream, D d10) {
            return (NotifyNoMoreCharacteristicRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static NotifyNoMoreCharacteristicRequest parseFrom(ByteBuffer byteBuffer, D d10) {
            return (NotifyNoMoreCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static NotifyNoMoreCharacteristicRequest parseFrom(AbstractC3722j abstractC3722j) {
            return (NotifyNoMoreCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static NotifyNoMoreCharacteristicRequest parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (NotifyNoMoreCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static NotifyNoMoreCharacteristicRequest parseFrom(byte[] bArr) {
            return (NotifyNoMoreCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NotifyNoMoreCharacteristicRequest parseFrom(byte[] bArr, D d10) {
            return (NotifyNoMoreCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static NotifyNoMoreCharacteristicRequest parseFrom(InputStream inputStream) {
            return (NotifyNoMoreCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyNoMoreCharacteristicRequest parseFrom(InputStream inputStream, D d10) {
            return (NotifyNoMoreCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static NotifyNoMoreCharacteristicRequest parseFrom(AbstractC3724k abstractC3724k) {
            return (NotifyNoMoreCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static NotifyNoMoreCharacteristicRequest parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (NotifyNoMoreCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface NotifyNoMoreCharacteristicRequestOrBuilder extends InterfaceC3719h0 {
        CharacteristicAddress getCharacteristic();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        boolean hasCharacteristic();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class ReadCharacteristicRequest extends GeneratedMessageLite implements ReadCharacteristicRequestOrBuilder {
        public static final int CHARACTERISTIC_FIELD_NUMBER = 1;
        private static final ReadCharacteristicRequest DEFAULT_INSTANCE;
        private static volatile t0 PARSER;
        private int bitField0_;
        private CharacteristicAddress characteristic_;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements ReadCharacteristicRequestOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearCharacteristic() {
                copyOnWrite();
                ((ReadCharacteristicRequest) this.instance).clearCharacteristic();
                return this;
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ReadCharacteristicRequestOrBuilder
            public CharacteristicAddress getCharacteristic() {
                return ((ReadCharacteristicRequest) this.instance).getCharacteristic();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ReadCharacteristicRequestOrBuilder
            public boolean hasCharacteristic() {
                return ((ReadCharacteristicRequest) this.instance).hasCharacteristic();
            }

            public Builder mergeCharacteristic(CharacteristicAddress characteristicAddress) {
                copyOnWrite();
                ((ReadCharacteristicRequest) this.instance).mergeCharacteristic(characteristicAddress);
                return this;
            }

            public Builder setCharacteristic(CharacteristicAddress characteristicAddress) {
                copyOnWrite();
                ((ReadCharacteristicRequest) this.instance).setCharacteristic(characteristicAddress);
                return this;
            }

            private Builder() {
                super(ReadCharacteristicRequest.DEFAULT_INSTANCE);
            }

            public Builder setCharacteristic(CharacteristicAddress.Builder builder) {
                copyOnWrite();
                ((ReadCharacteristicRequest) this.instance).setCharacteristic((CharacteristicAddress) builder.build());
                return this;
            }
        }

        static {
            ReadCharacteristicRequest readCharacteristicRequest = new ReadCharacteristicRequest();
            DEFAULT_INSTANCE = readCharacteristicRequest;
            GeneratedMessageLite.registerDefaultInstance(ReadCharacteristicRequest.class, readCharacteristicRequest);
        }

        private ReadCharacteristicRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCharacteristic() {
            this.characteristic_ = null;
            this.bitField0_ &= -2;
        }

        public static ReadCharacteristicRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCharacteristic(CharacteristicAddress characteristicAddress) {
            characteristicAddress.getClass();
            CharacteristicAddress characteristicAddress2 = this.characteristic_;
            if (characteristicAddress2 == null || characteristicAddress2 == CharacteristicAddress.getDefaultInstance()) {
                this.characteristic_ = characteristicAddress;
            } else {
                this.characteristic_ = (CharacteristicAddress) ((CharacteristicAddress.Builder) CharacteristicAddress.newBuilder(this.characteristic_).mergeFrom((GeneratedMessageLite) characteristicAddress)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ReadCharacteristicRequest parseDelimitedFrom(InputStream inputStream) {
            return (ReadCharacteristicRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReadCharacteristicRequest parseFrom(ByteBuffer byteBuffer) {
            return (ReadCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCharacteristic(CharacteristicAddress characteristicAddress) {
            characteristicAddress.getClass();
            this.characteristic_ = characteristicAddress;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new ReadCharacteristicRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "characteristic_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (ReadCharacteristicRequest.class) {
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

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ReadCharacteristicRequestOrBuilder
        public CharacteristicAddress getCharacteristic() {
            CharacteristicAddress characteristicAddress = this.characteristic_;
            return characteristicAddress == null ? CharacteristicAddress.getDefaultInstance() : characteristicAddress;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ReadCharacteristicRequestOrBuilder
        public boolean hasCharacteristic() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(ReadCharacteristicRequest readCharacteristicRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(readCharacteristicRequest);
        }

        public static ReadCharacteristicRequest parseDelimitedFrom(InputStream inputStream, D d10) {
            return (ReadCharacteristicRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static ReadCharacteristicRequest parseFrom(ByteBuffer byteBuffer, D d10) {
            return (ReadCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static ReadCharacteristicRequest parseFrom(AbstractC3722j abstractC3722j) {
            return (ReadCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static ReadCharacteristicRequest parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (ReadCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static ReadCharacteristicRequest parseFrom(byte[] bArr) {
            return (ReadCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ReadCharacteristicRequest parseFrom(byte[] bArr, D d10) {
            return (ReadCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static ReadCharacteristicRequest parseFrom(InputStream inputStream) {
            return (ReadCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReadCharacteristicRequest parseFrom(InputStream inputStream, D d10) {
            return (ReadCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static ReadCharacteristicRequest parseFrom(AbstractC3724k abstractC3724k) {
            return (ReadCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static ReadCharacteristicRequest parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (ReadCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface ReadCharacteristicRequestOrBuilder extends InterfaceC3719h0 {
        CharacteristicAddress getCharacteristic();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        boolean hasCharacteristic();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class ReadRssiRequest extends GeneratedMessageLite implements ReadRssiRequestOrBuilder {
        private static final ReadRssiRequest DEFAULT_INSTANCE;
        public static final int DEVICEID_FIELD_NUMBER = 1;
        private static volatile t0 PARSER;
        private String deviceId_ = "";

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements ReadRssiRequestOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearDeviceId() {
                copyOnWrite();
                ((ReadRssiRequest) this.instance).clearDeviceId();
                return this;
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ReadRssiRequestOrBuilder
            public String getDeviceId() {
                return ((ReadRssiRequest) this.instance).getDeviceId();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ReadRssiRequestOrBuilder
            public AbstractC3722j getDeviceIdBytes() {
                return ((ReadRssiRequest) this.instance).getDeviceIdBytes();
            }

            public Builder setDeviceId(String str) {
                copyOnWrite();
                ((ReadRssiRequest) this.instance).setDeviceId(str);
                return this;
            }

            public Builder setDeviceIdBytes(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((ReadRssiRequest) this.instance).setDeviceIdBytes(abstractC3722j);
                return this;
            }

            private Builder() {
                super(ReadRssiRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            ReadRssiRequest readRssiRequest = new ReadRssiRequest();
            DEFAULT_INSTANCE = readRssiRequest;
            GeneratedMessageLite.registerDefaultInstance(ReadRssiRequest.class, readRssiRequest);
        }

        private ReadRssiRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceId() {
            this.deviceId_ = getDefaultInstance().getDeviceId();
        }

        public static ReadRssiRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ReadRssiRequest parseDelimitedFrom(InputStream inputStream) {
            return (ReadRssiRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReadRssiRequest parseFrom(ByteBuffer byteBuffer) {
            return (ReadRssiRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceId(String str) {
            str.getClass();
            this.deviceId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceIdBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.deviceId_ = abstractC3722j.J();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new ReadRssiRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"deviceId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (ReadRssiRequest.class) {
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

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ReadRssiRequestOrBuilder
        public String getDeviceId() {
            return this.deviceId_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ReadRssiRequestOrBuilder
        public AbstractC3722j getDeviceIdBytes() {
            return AbstractC3722j.n(this.deviceId_);
        }

        public static Builder newBuilder(ReadRssiRequest readRssiRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(readRssiRequest);
        }

        public static ReadRssiRequest parseDelimitedFrom(InputStream inputStream, D d10) {
            return (ReadRssiRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static ReadRssiRequest parseFrom(ByteBuffer byteBuffer, D d10) {
            return (ReadRssiRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static ReadRssiRequest parseFrom(AbstractC3722j abstractC3722j) {
            return (ReadRssiRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static ReadRssiRequest parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (ReadRssiRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static ReadRssiRequest parseFrom(byte[] bArr) {
            return (ReadRssiRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ReadRssiRequest parseFrom(byte[] bArr, D d10) {
            return (ReadRssiRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static ReadRssiRequest parseFrom(InputStream inputStream) {
            return (ReadRssiRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReadRssiRequest parseFrom(InputStream inputStream, D d10) {
            return (ReadRssiRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static ReadRssiRequest parseFrom(AbstractC3724k abstractC3724k) {
            return (ReadRssiRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static ReadRssiRequest parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (ReadRssiRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface ReadRssiRequestOrBuilder extends InterfaceC3719h0 {
        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        String getDeviceId();

        AbstractC3722j getDeviceIdBytes();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class ReadRssiResult extends GeneratedMessageLite implements ReadRssiResultOrBuilder {
        private static final ReadRssiResult DEFAULT_INSTANCE;
        private static volatile t0 PARSER = null;
        public static final int RSSI_FIELD_NUMBER = 1;
        private int rssi_;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements ReadRssiResultOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearRssi() {
                copyOnWrite();
                ((ReadRssiResult) this.instance).clearRssi();
                return this;
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ReadRssiResultOrBuilder
            public int getRssi() {
                return ((ReadRssiResult) this.instance).getRssi();
            }

            public Builder setRssi(int i10) {
                copyOnWrite();
                ((ReadRssiResult) this.instance).setRssi(i10);
                return this;
            }

            private Builder() {
                super(ReadRssiResult.DEFAULT_INSTANCE);
            }
        }

        static {
            ReadRssiResult readRssiResult = new ReadRssiResult();
            DEFAULT_INSTANCE = readRssiResult;
            GeneratedMessageLite.registerDefaultInstance(ReadRssiResult.class, readRssiResult);
        }

        private ReadRssiResult() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRssi() {
            this.rssi_ = 0;
        }

        public static ReadRssiResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ReadRssiResult parseDelimitedFrom(InputStream inputStream) {
            return (ReadRssiResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReadRssiResult parseFrom(ByteBuffer byteBuffer) {
            return (ReadRssiResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRssi(int i10) {
            this.rssi_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new ReadRssiResult();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"rssi_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (ReadRssiResult.class) {
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

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ReadRssiResultOrBuilder
        public int getRssi() {
            return this.rssi_;
        }

        public static Builder newBuilder(ReadRssiResult readRssiResult) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(readRssiResult);
        }

        public static ReadRssiResult parseDelimitedFrom(InputStream inputStream, D d10) {
            return (ReadRssiResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static ReadRssiResult parseFrom(ByteBuffer byteBuffer, D d10) {
            return (ReadRssiResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static ReadRssiResult parseFrom(AbstractC3722j abstractC3722j) {
            return (ReadRssiResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static ReadRssiResult parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (ReadRssiResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static ReadRssiResult parseFrom(byte[] bArr) {
            return (ReadRssiResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ReadRssiResult parseFrom(byte[] bArr, D d10) {
            return (ReadRssiResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static ReadRssiResult parseFrom(InputStream inputStream) {
            return (ReadRssiResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReadRssiResult parseFrom(InputStream inputStream, D d10) {
            return (ReadRssiResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static ReadRssiResult parseFrom(AbstractC3724k abstractC3724k) {
            return (ReadRssiResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static ReadRssiResult parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (ReadRssiResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface ReadRssiResultOrBuilder extends InterfaceC3719h0 {
        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        int getRssi();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class ScanForDevicesRequest extends GeneratedMessageLite implements ScanForDevicesRequestOrBuilder {
        private static final ScanForDevicesRequest DEFAULT_INSTANCE;
        private static volatile t0 PARSER = null;
        public static final int REQUIRELOCATIONSERVICESENABLED_FIELD_NUMBER = 3;
        public static final int SCANMODE_FIELD_NUMBER = 2;
        public static final int SERVICEUUIDS_FIELD_NUMBER = 1;
        private boolean requireLocationServicesEnabled_;
        private int scanMode_;
        private N.j serviceUuids_ = GeneratedMessageLite.emptyProtobufList();

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements ScanForDevicesRequestOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllServiceUuids(Iterable<? extends Uuid> iterable) {
                copyOnWrite();
                ((ScanForDevicesRequest) this.instance).addAllServiceUuids(iterable);
                return this;
            }

            public Builder addServiceUuids(Uuid uuid) {
                copyOnWrite();
                ((ScanForDevicesRequest) this.instance).addServiceUuids(uuid);
                return this;
            }

            public Builder clearRequireLocationServicesEnabled() {
                copyOnWrite();
                ((ScanForDevicesRequest) this.instance).clearRequireLocationServicesEnabled();
                return this;
            }

            public Builder clearScanMode() {
                copyOnWrite();
                ((ScanForDevicesRequest) this.instance).clearScanMode();
                return this;
            }

            public Builder clearServiceUuids() {
                copyOnWrite();
                ((ScanForDevicesRequest) this.instance).clearServiceUuids();
                return this;
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ScanForDevicesRequestOrBuilder
            public boolean getRequireLocationServicesEnabled() {
                return ((ScanForDevicesRequest) this.instance).getRequireLocationServicesEnabled();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ScanForDevicesRequestOrBuilder
            public int getScanMode() {
                return ((ScanForDevicesRequest) this.instance).getScanMode();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ScanForDevicesRequestOrBuilder
            public Uuid getServiceUuids(int i10) {
                return ((ScanForDevicesRequest) this.instance).getServiceUuids(i10);
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ScanForDevicesRequestOrBuilder
            public int getServiceUuidsCount() {
                return ((ScanForDevicesRequest) this.instance).getServiceUuidsCount();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ScanForDevicesRequestOrBuilder
            public List<Uuid> getServiceUuidsList() {
                return Collections.unmodifiableList(((ScanForDevicesRequest) this.instance).getServiceUuidsList());
            }

            public Builder removeServiceUuids(int i10) {
                copyOnWrite();
                ((ScanForDevicesRequest) this.instance).removeServiceUuids(i10);
                return this;
            }

            public Builder setRequireLocationServicesEnabled(boolean z10) {
                copyOnWrite();
                ((ScanForDevicesRequest) this.instance).setRequireLocationServicesEnabled(z10);
                return this;
            }

            public Builder setScanMode(int i10) {
                copyOnWrite();
                ((ScanForDevicesRequest) this.instance).setScanMode(i10);
                return this;
            }

            public Builder setServiceUuids(int i10, Uuid uuid) {
                copyOnWrite();
                ((ScanForDevicesRequest) this.instance).setServiceUuids(i10, uuid);
                return this;
            }

            private Builder() {
                super(ScanForDevicesRequest.DEFAULT_INSTANCE);
            }

            public Builder addServiceUuids(int i10, Uuid uuid) {
                copyOnWrite();
                ((ScanForDevicesRequest) this.instance).addServiceUuids(i10, uuid);
                return this;
            }

            public Builder setServiceUuids(int i10, Uuid.Builder builder) {
                copyOnWrite();
                ((ScanForDevicesRequest) this.instance).setServiceUuids(i10, (Uuid) builder.build());
                return this;
            }

            public Builder addServiceUuids(Uuid.Builder builder) {
                copyOnWrite();
                ((ScanForDevicesRequest) this.instance).addServiceUuids((Uuid) builder.build());
                return this;
            }

            public Builder addServiceUuids(int i10, Uuid.Builder builder) {
                copyOnWrite();
                ((ScanForDevicesRequest) this.instance).addServiceUuids(i10, (Uuid) builder.build());
                return this;
            }
        }

        static {
            ScanForDevicesRequest scanForDevicesRequest = new ScanForDevicesRequest();
            DEFAULT_INSTANCE = scanForDevicesRequest;
            GeneratedMessageLite.registerDefaultInstance(ScanForDevicesRequest.class, scanForDevicesRequest);
        }

        private ScanForDevicesRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllServiceUuids(Iterable<? extends Uuid> iterable) {
            ensureServiceUuidsIsMutable();
            AbstractC3704a.addAll((Iterable) iterable, (List) this.serviceUuids_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addServiceUuids(Uuid uuid) {
            uuid.getClass();
            ensureServiceUuidsIsMutable();
            this.serviceUuids_.add(uuid);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequireLocationServicesEnabled() {
            this.requireLocationServicesEnabled_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScanMode() {
            this.scanMode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServiceUuids() {
            this.serviceUuids_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureServiceUuidsIsMutable() {
            N.j jVar = this.serviceUuids_;
            if (jVar.m()) {
                return;
            }
            this.serviceUuids_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        public static ScanForDevicesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ScanForDevicesRequest parseDelimitedFrom(InputStream inputStream) {
            return (ScanForDevicesRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ScanForDevicesRequest parseFrom(ByteBuffer byteBuffer) {
            return (ScanForDevicesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeServiceUuids(int i10) {
            ensureServiceUuidsIsMutable();
            this.serviceUuids_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequireLocationServicesEnabled(boolean z10) {
            this.requireLocationServicesEnabled_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScanMode(int i10) {
            this.scanMode_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServiceUuids(int i10, Uuid uuid) {
            uuid.getClass();
            ensureServiceUuidsIsMutable();
            this.serviceUuids_.set(i10, uuid);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new ScanForDevicesRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u0004\u0003\u0007", new Object[]{"serviceUuids_", Uuid.class, "scanMode_", "requireLocationServicesEnabled_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (ScanForDevicesRequest.class) {
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

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ScanForDevicesRequestOrBuilder
        public boolean getRequireLocationServicesEnabled() {
            return this.requireLocationServicesEnabled_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ScanForDevicesRequestOrBuilder
        public int getScanMode() {
            return this.scanMode_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ScanForDevicesRequestOrBuilder
        public Uuid getServiceUuids(int i10) {
            return (Uuid) this.serviceUuids_.get(i10);
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ScanForDevicesRequestOrBuilder
        public int getServiceUuidsCount() {
            return this.serviceUuids_.size();
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ScanForDevicesRequestOrBuilder
        public List<Uuid> getServiceUuidsList() {
            return this.serviceUuids_;
        }

        public UuidOrBuilder getServiceUuidsOrBuilder(int i10) {
            return (UuidOrBuilder) this.serviceUuids_.get(i10);
        }

        public List<? extends UuidOrBuilder> getServiceUuidsOrBuilderList() {
            return this.serviceUuids_;
        }

        public static Builder newBuilder(ScanForDevicesRequest scanForDevicesRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(scanForDevicesRequest);
        }

        public static ScanForDevicesRequest parseDelimitedFrom(InputStream inputStream, D d10) {
            return (ScanForDevicesRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static ScanForDevicesRequest parseFrom(ByteBuffer byteBuffer, D d10) {
            return (ScanForDevicesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static ScanForDevicesRequest parseFrom(AbstractC3722j abstractC3722j) {
            return (ScanForDevicesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addServiceUuids(int i10, Uuid uuid) {
            uuid.getClass();
            ensureServiceUuidsIsMutable();
            this.serviceUuids_.add(i10, uuid);
        }

        public static ScanForDevicesRequest parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (ScanForDevicesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static ScanForDevicesRequest parseFrom(byte[] bArr) {
            return (ScanForDevicesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ScanForDevicesRequest parseFrom(byte[] bArr, D d10) {
            return (ScanForDevicesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static ScanForDevicesRequest parseFrom(InputStream inputStream) {
            return (ScanForDevicesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ScanForDevicesRequest parseFrom(InputStream inputStream, D d10) {
            return (ScanForDevicesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static ScanForDevicesRequest parseFrom(AbstractC3724k abstractC3724k) {
            return (ScanForDevicesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static ScanForDevicesRequest parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (ScanForDevicesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface ScanForDevicesRequestOrBuilder extends InterfaceC3719h0 {
        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        boolean getRequireLocationServicesEnabled();

        int getScanMode();

        Uuid getServiceUuids(int i10);

        int getServiceUuidsCount();

        List<Uuid> getServiceUuidsList();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class ServiceDataEntry extends GeneratedMessageLite implements ServiceDataEntryOrBuilder {
        public static final int DATA_FIELD_NUMBER = 2;
        private static final ServiceDataEntry DEFAULT_INSTANCE;
        private static volatile t0 PARSER = null;
        public static final int SERVICEUUID_FIELD_NUMBER = 1;
        private int bitField0_;
        private AbstractC3722j data_ = AbstractC3722j.f32236b;
        private Uuid serviceUuid_;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements ServiceDataEntryOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearData() {
                copyOnWrite();
                ((ServiceDataEntry) this.instance).clearData();
                return this;
            }

            public Builder clearServiceUuid() {
                copyOnWrite();
                ((ServiceDataEntry) this.instance).clearServiceUuid();
                return this;
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ServiceDataEntryOrBuilder
            public AbstractC3722j getData() {
                return ((ServiceDataEntry) this.instance).getData();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ServiceDataEntryOrBuilder
            public Uuid getServiceUuid() {
                return ((ServiceDataEntry) this.instance).getServiceUuid();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ServiceDataEntryOrBuilder
            public boolean hasServiceUuid() {
                return ((ServiceDataEntry) this.instance).hasServiceUuid();
            }

            public Builder mergeServiceUuid(Uuid uuid) {
                copyOnWrite();
                ((ServiceDataEntry) this.instance).mergeServiceUuid(uuid);
                return this;
            }

            public Builder setData(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((ServiceDataEntry) this.instance).setData(abstractC3722j);
                return this;
            }

            public Builder setServiceUuid(Uuid uuid) {
                copyOnWrite();
                ((ServiceDataEntry) this.instance).setServiceUuid(uuid);
                return this;
            }

            private Builder() {
                super(ServiceDataEntry.DEFAULT_INSTANCE);
            }

            public Builder setServiceUuid(Uuid.Builder builder) {
                copyOnWrite();
                ((ServiceDataEntry) this.instance).setServiceUuid((Uuid) builder.build());
                return this;
            }
        }

        static {
            ServiceDataEntry serviceDataEntry = new ServiceDataEntry();
            DEFAULT_INSTANCE = serviceDataEntry;
            GeneratedMessageLite.registerDefaultInstance(ServiceDataEntry.class, serviceDataEntry);
        }

        private ServiceDataEntry() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.data_ = getDefaultInstance().getData();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServiceUuid() {
            this.serviceUuid_ = null;
            this.bitField0_ &= -2;
        }

        public static ServiceDataEntry getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeServiceUuid(Uuid uuid) {
            uuid.getClass();
            Uuid uuid2 = this.serviceUuid_;
            if (uuid2 == null || uuid2 == Uuid.getDefaultInstance()) {
                this.serviceUuid_ = uuid;
            } else {
                this.serviceUuid_ = (Uuid) ((Uuid.Builder) Uuid.newBuilder(this.serviceUuid_).mergeFrom((GeneratedMessageLite) uuid)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ServiceDataEntry parseDelimitedFrom(InputStream inputStream) {
            return (ServiceDataEntry) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServiceDataEntry parseFrom(ByteBuffer byteBuffer) {
            return (ServiceDataEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
        public void setServiceUuid(Uuid uuid) {
            uuid.getClass();
            this.serviceUuid_ = uuid;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new ServiceDataEntry();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\n", new Object[]{"bitField0_", "serviceUuid_", "data_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (ServiceDataEntry.class) {
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

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ServiceDataEntryOrBuilder
        public AbstractC3722j getData() {
            return this.data_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ServiceDataEntryOrBuilder
        public Uuid getServiceUuid() {
            Uuid uuid = this.serviceUuid_;
            return uuid == null ? Uuid.getDefaultInstance() : uuid;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ServiceDataEntryOrBuilder
        public boolean hasServiceUuid() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(ServiceDataEntry serviceDataEntry) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(serviceDataEntry);
        }

        public static ServiceDataEntry parseDelimitedFrom(InputStream inputStream, D d10) {
            return (ServiceDataEntry) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static ServiceDataEntry parseFrom(ByteBuffer byteBuffer, D d10) {
            return (ServiceDataEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static ServiceDataEntry parseFrom(AbstractC3722j abstractC3722j) {
            return (ServiceDataEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static ServiceDataEntry parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (ServiceDataEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static ServiceDataEntry parseFrom(byte[] bArr) {
            return (ServiceDataEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ServiceDataEntry parseFrom(byte[] bArr, D d10) {
            return (ServiceDataEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static ServiceDataEntry parseFrom(InputStream inputStream) {
            return (ServiceDataEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServiceDataEntry parseFrom(InputStream inputStream, D d10) {
            return (ServiceDataEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static ServiceDataEntry parseFrom(AbstractC3724k abstractC3724k) {
            return (ServiceDataEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static ServiceDataEntry parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (ServiceDataEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface ServiceDataEntryOrBuilder extends InterfaceC3719h0 {
        AbstractC3722j getData();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        Uuid getServiceUuid();

        boolean hasServiceUuid();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class ServiceWithCharacteristics extends GeneratedMessageLite implements ServiceWithCharacteristicsOrBuilder {
        public static final int CHARACTERISTICS_FIELD_NUMBER = 2;
        private static final ServiceWithCharacteristics DEFAULT_INSTANCE;
        private static volatile t0 PARSER = null;
        public static final int SERVICEID_FIELD_NUMBER = 1;
        private int bitField0_;
        private N.j characteristics_ = GeneratedMessageLite.emptyProtobufList();
        private Uuid serviceId_;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements ServiceWithCharacteristicsOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllCharacteristics(Iterable<? extends Uuid> iterable) {
                copyOnWrite();
                ((ServiceWithCharacteristics) this.instance).addAllCharacteristics(iterable);
                return this;
            }

            public Builder addCharacteristics(Uuid uuid) {
                copyOnWrite();
                ((ServiceWithCharacteristics) this.instance).addCharacteristics(uuid);
                return this;
            }

            public Builder clearCharacteristics() {
                copyOnWrite();
                ((ServiceWithCharacteristics) this.instance).clearCharacteristics();
                return this;
            }

            public Builder clearServiceId() {
                copyOnWrite();
                ((ServiceWithCharacteristics) this.instance).clearServiceId();
                return this;
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ServiceWithCharacteristicsOrBuilder
            public Uuid getCharacteristics(int i10) {
                return ((ServiceWithCharacteristics) this.instance).getCharacteristics(i10);
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ServiceWithCharacteristicsOrBuilder
            public int getCharacteristicsCount() {
                return ((ServiceWithCharacteristics) this.instance).getCharacteristicsCount();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ServiceWithCharacteristicsOrBuilder
            public List<Uuid> getCharacteristicsList() {
                return Collections.unmodifiableList(((ServiceWithCharacteristics) this.instance).getCharacteristicsList());
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ServiceWithCharacteristicsOrBuilder
            public Uuid getServiceId() {
                return ((ServiceWithCharacteristics) this.instance).getServiceId();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ServiceWithCharacteristicsOrBuilder
            public boolean hasServiceId() {
                return ((ServiceWithCharacteristics) this.instance).hasServiceId();
            }

            public Builder mergeServiceId(Uuid uuid) {
                copyOnWrite();
                ((ServiceWithCharacteristics) this.instance).mergeServiceId(uuid);
                return this;
            }

            public Builder removeCharacteristics(int i10) {
                copyOnWrite();
                ((ServiceWithCharacteristics) this.instance).removeCharacteristics(i10);
                return this;
            }

            public Builder setCharacteristics(int i10, Uuid uuid) {
                copyOnWrite();
                ((ServiceWithCharacteristics) this.instance).setCharacteristics(i10, uuid);
                return this;
            }

            public Builder setServiceId(Uuid uuid) {
                copyOnWrite();
                ((ServiceWithCharacteristics) this.instance).setServiceId(uuid);
                return this;
            }

            private Builder() {
                super(ServiceWithCharacteristics.DEFAULT_INSTANCE);
            }

            public Builder addCharacteristics(int i10, Uuid uuid) {
                copyOnWrite();
                ((ServiceWithCharacteristics) this.instance).addCharacteristics(i10, uuid);
                return this;
            }

            public Builder setCharacteristics(int i10, Uuid.Builder builder) {
                copyOnWrite();
                ((ServiceWithCharacteristics) this.instance).setCharacteristics(i10, (Uuid) builder.build());
                return this;
            }

            public Builder setServiceId(Uuid.Builder builder) {
                copyOnWrite();
                ((ServiceWithCharacteristics) this.instance).setServiceId((Uuid) builder.build());
                return this;
            }

            public Builder addCharacteristics(Uuid.Builder builder) {
                copyOnWrite();
                ((ServiceWithCharacteristics) this.instance).addCharacteristics((Uuid) builder.build());
                return this;
            }

            public Builder addCharacteristics(int i10, Uuid.Builder builder) {
                copyOnWrite();
                ((ServiceWithCharacteristics) this.instance).addCharacteristics(i10, (Uuid) builder.build());
                return this;
            }
        }

        static {
            ServiceWithCharacteristics serviceWithCharacteristics = new ServiceWithCharacteristics();
            DEFAULT_INSTANCE = serviceWithCharacteristics;
            GeneratedMessageLite.registerDefaultInstance(ServiceWithCharacteristics.class, serviceWithCharacteristics);
        }

        private ServiceWithCharacteristics() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCharacteristics(Iterable<? extends Uuid> iterable) {
            ensureCharacteristicsIsMutable();
            AbstractC3704a.addAll((Iterable) iterable, (List) this.characteristics_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCharacteristics(Uuid uuid) {
            uuid.getClass();
            ensureCharacteristicsIsMutable();
            this.characteristics_.add(uuid);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCharacteristics() {
            this.characteristics_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServiceId() {
            this.serviceId_ = null;
            this.bitField0_ &= -2;
        }

        private void ensureCharacteristicsIsMutable() {
            N.j jVar = this.characteristics_;
            if (jVar.m()) {
                return;
            }
            this.characteristics_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        public static ServiceWithCharacteristics getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeServiceId(Uuid uuid) {
            uuid.getClass();
            Uuid uuid2 = this.serviceId_;
            if (uuid2 == null || uuid2 == Uuid.getDefaultInstance()) {
                this.serviceId_ = uuid;
            } else {
                this.serviceId_ = (Uuid) ((Uuid.Builder) Uuid.newBuilder(this.serviceId_).mergeFrom((GeneratedMessageLite) uuid)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ServiceWithCharacteristics parseDelimitedFrom(InputStream inputStream) {
            return (ServiceWithCharacteristics) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServiceWithCharacteristics parseFrom(ByteBuffer byteBuffer) {
            return (ServiceWithCharacteristics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeCharacteristics(int i10) {
            ensureCharacteristicsIsMutable();
            this.characteristics_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCharacteristics(int i10, Uuid uuid) {
            uuid.getClass();
            ensureCharacteristicsIsMutable();
            this.characteristics_.set(i10, uuid);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServiceId(Uuid uuid) {
            uuid.getClass();
            this.serviceId_ = uuid;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new ServiceWithCharacteristics();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "serviceId_", "characteristics_", Uuid.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (ServiceWithCharacteristics.class) {
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

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ServiceWithCharacteristicsOrBuilder
        public Uuid getCharacteristics(int i10) {
            return (Uuid) this.characteristics_.get(i10);
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ServiceWithCharacteristicsOrBuilder
        public int getCharacteristicsCount() {
            return this.characteristics_.size();
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ServiceWithCharacteristicsOrBuilder
        public List<Uuid> getCharacteristicsList() {
            return this.characteristics_;
        }

        public UuidOrBuilder getCharacteristicsOrBuilder(int i10) {
            return (UuidOrBuilder) this.characteristics_.get(i10);
        }

        public List<? extends UuidOrBuilder> getCharacteristicsOrBuilderList() {
            return this.characteristics_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ServiceWithCharacteristicsOrBuilder
        public Uuid getServiceId() {
            Uuid uuid = this.serviceId_;
            return uuid == null ? Uuid.getDefaultInstance() : uuid;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ServiceWithCharacteristicsOrBuilder
        public boolean hasServiceId() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(ServiceWithCharacteristics serviceWithCharacteristics) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(serviceWithCharacteristics);
        }

        public static ServiceWithCharacteristics parseDelimitedFrom(InputStream inputStream, D d10) {
            return (ServiceWithCharacteristics) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static ServiceWithCharacteristics parseFrom(ByteBuffer byteBuffer, D d10) {
            return (ServiceWithCharacteristics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static ServiceWithCharacteristics parseFrom(AbstractC3722j abstractC3722j) {
            return (ServiceWithCharacteristics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCharacteristics(int i10, Uuid uuid) {
            uuid.getClass();
            ensureCharacteristicsIsMutable();
            this.characteristics_.add(i10, uuid);
        }

        public static ServiceWithCharacteristics parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (ServiceWithCharacteristics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static ServiceWithCharacteristics parseFrom(byte[] bArr) {
            return (ServiceWithCharacteristics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ServiceWithCharacteristics parseFrom(byte[] bArr, D d10) {
            return (ServiceWithCharacteristics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static ServiceWithCharacteristics parseFrom(InputStream inputStream) {
            return (ServiceWithCharacteristics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServiceWithCharacteristics parseFrom(InputStream inputStream, D d10) {
            return (ServiceWithCharacteristics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static ServiceWithCharacteristics parseFrom(AbstractC3724k abstractC3724k) {
            return (ServiceWithCharacteristics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static ServiceWithCharacteristics parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (ServiceWithCharacteristics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface ServiceWithCharacteristicsOrBuilder extends InterfaceC3719h0 {
        Uuid getCharacteristics(int i10);

        int getCharacteristicsCount();

        List<Uuid> getCharacteristicsList();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        Uuid getServiceId();

        boolean hasServiceId();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class ServicesWithCharacteristics extends GeneratedMessageLite implements ServicesWithCharacteristicsOrBuilder {
        private static final ServicesWithCharacteristics DEFAULT_INSTANCE;
        public static final int ITEMS_FIELD_NUMBER = 1;
        private static volatile t0 PARSER;
        private N.j items_ = GeneratedMessageLite.emptyProtobufList();

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements ServicesWithCharacteristicsOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllItems(Iterable<? extends ServiceWithCharacteristics> iterable) {
                copyOnWrite();
                ((ServicesWithCharacteristics) this.instance).addAllItems(iterable);
                return this;
            }

            public Builder addItems(ServiceWithCharacteristics serviceWithCharacteristics) {
                copyOnWrite();
                ((ServicesWithCharacteristics) this.instance).addItems(serviceWithCharacteristics);
                return this;
            }

            public Builder clearItems() {
                copyOnWrite();
                ((ServicesWithCharacteristics) this.instance).clearItems();
                return this;
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ServicesWithCharacteristicsOrBuilder
            public ServiceWithCharacteristics getItems(int i10) {
                return ((ServicesWithCharacteristics) this.instance).getItems(i10);
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ServicesWithCharacteristicsOrBuilder
            public int getItemsCount() {
                return ((ServicesWithCharacteristics) this.instance).getItemsCount();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ServicesWithCharacteristicsOrBuilder
            public List<ServiceWithCharacteristics> getItemsList() {
                return Collections.unmodifiableList(((ServicesWithCharacteristics) this.instance).getItemsList());
            }

            public Builder removeItems(int i10) {
                copyOnWrite();
                ((ServicesWithCharacteristics) this.instance).removeItems(i10);
                return this;
            }

            public Builder setItems(int i10, ServiceWithCharacteristics serviceWithCharacteristics) {
                copyOnWrite();
                ((ServicesWithCharacteristics) this.instance).setItems(i10, serviceWithCharacteristics);
                return this;
            }

            private Builder() {
                super(ServicesWithCharacteristics.DEFAULT_INSTANCE);
            }

            public Builder addItems(int i10, ServiceWithCharacteristics serviceWithCharacteristics) {
                copyOnWrite();
                ((ServicesWithCharacteristics) this.instance).addItems(i10, serviceWithCharacteristics);
                return this;
            }

            public Builder setItems(int i10, ServiceWithCharacteristics.Builder builder) {
                copyOnWrite();
                ((ServicesWithCharacteristics) this.instance).setItems(i10, (ServiceWithCharacteristics) builder.build());
                return this;
            }

            public Builder addItems(ServiceWithCharacteristics.Builder builder) {
                copyOnWrite();
                ((ServicesWithCharacteristics) this.instance).addItems((ServiceWithCharacteristics) builder.build());
                return this;
            }

            public Builder addItems(int i10, ServiceWithCharacteristics.Builder builder) {
                copyOnWrite();
                ((ServicesWithCharacteristics) this.instance).addItems(i10, (ServiceWithCharacteristics) builder.build());
                return this;
            }
        }

        static {
            ServicesWithCharacteristics servicesWithCharacteristics = new ServicesWithCharacteristics();
            DEFAULT_INSTANCE = servicesWithCharacteristics;
            GeneratedMessageLite.registerDefaultInstance(ServicesWithCharacteristics.class, servicesWithCharacteristics);
        }

        private ServicesWithCharacteristics() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllItems(Iterable<? extends ServiceWithCharacteristics> iterable) {
            ensureItemsIsMutable();
            AbstractC3704a.addAll((Iterable) iterable, (List) this.items_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addItems(ServiceWithCharacteristics serviceWithCharacteristics) {
            serviceWithCharacteristics.getClass();
            ensureItemsIsMutable();
            this.items_.add(serviceWithCharacteristics);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearItems() {
            this.items_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureItemsIsMutable() {
            N.j jVar = this.items_;
            if (jVar.m()) {
                return;
            }
            this.items_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        public static ServicesWithCharacteristics getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ServicesWithCharacteristics parseDelimitedFrom(InputStream inputStream) {
            return (ServicesWithCharacteristics) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServicesWithCharacteristics parseFrom(ByteBuffer byteBuffer) {
            return (ServicesWithCharacteristics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeItems(int i10) {
            ensureItemsIsMutable();
            this.items_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setItems(int i10, ServiceWithCharacteristics serviceWithCharacteristics) {
            serviceWithCharacteristics.getClass();
            ensureItemsIsMutable();
            this.items_.set(i10, serviceWithCharacteristics);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new ServicesWithCharacteristics();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"items_", ServiceWithCharacteristics.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (ServicesWithCharacteristics.class) {
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

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ServicesWithCharacteristicsOrBuilder
        public ServiceWithCharacteristics getItems(int i10) {
            return (ServiceWithCharacteristics) this.items_.get(i10);
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ServicesWithCharacteristicsOrBuilder
        public int getItemsCount() {
            return this.items_.size();
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.ServicesWithCharacteristicsOrBuilder
        public List<ServiceWithCharacteristics> getItemsList() {
            return this.items_;
        }

        public ServiceWithCharacteristicsOrBuilder getItemsOrBuilder(int i10) {
            return (ServiceWithCharacteristicsOrBuilder) this.items_.get(i10);
        }

        public List<? extends ServiceWithCharacteristicsOrBuilder> getItemsOrBuilderList() {
            return this.items_;
        }

        public static Builder newBuilder(ServicesWithCharacteristics servicesWithCharacteristics) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(servicesWithCharacteristics);
        }

        public static ServicesWithCharacteristics parseDelimitedFrom(InputStream inputStream, D d10) {
            return (ServicesWithCharacteristics) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static ServicesWithCharacteristics parseFrom(ByteBuffer byteBuffer, D d10) {
            return (ServicesWithCharacteristics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static ServicesWithCharacteristics parseFrom(AbstractC3722j abstractC3722j) {
            return (ServicesWithCharacteristics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addItems(int i10, ServiceWithCharacteristics serviceWithCharacteristics) {
            serviceWithCharacteristics.getClass();
            ensureItemsIsMutable();
            this.items_.add(i10, serviceWithCharacteristics);
        }

        public static ServicesWithCharacteristics parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (ServicesWithCharacteristics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static ServicesWithCharacteristics parseFrom(byte[] bArr) {
            return (ServicesWithCharacteristics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ServicesWithCharacteristics parseFrom(byte[] bArr, D d10) {
            return (ServicesWithCharacteristics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static ServicesWithCharacteristics parseFrom(InputStream inputStream) {
            return (ServicesWithCharacteristics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServicesWithCharacteristics parseFrom(InputStream inputStream, D d10) {
            return (ServicesWithCharacteristics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static ServicesWithCharacteristics parseFrom(AbstractC3724k abstractC3724k) {
            return (ServicesWithCharacteristics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static ServicesWithCharacteristics parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (ServicesWithCharacteristics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface ServicesWithCharacteristicsOrBuilder extends InterfaceC3719h0 {
        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        ServiceWithCharacteristics getItems(int i10);

        int getItemsCount();

        List<ServiceWithCharacteristics> getItemsList();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Uuid extends GeneratedMessageLite implements UuidOrBuilder {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final Uuid DEFAULT_INSTANCE;
        private static volatile t0 PARSER;
        private AbstractC3722j data_ = AbstractC3722j.f32236b;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements UuidOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearData() {
                copyOnWrite();
                ((Uuid) this.instance).clearData();
                return this;
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.UuidOrBuilder
            public AbstractC3722j getData() {
                return ((Uuid) this.instance).getData();
            }

            public Builder setData(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((Uuid) this.instance).setData(abstractC3722j);
                return this;
            }

            private Builder() {
                super(Uuid.DEFAULT_INSTANCE);
            }
        }

        static {
            Uuid uuid = new Uuid();
            DEFAULT_INSTANCE = uuid;
            GeneratedMessageLite.registerDefaultInstance(Uuid.class, uuid);
        }

        private Uuid() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.data_ = getDefaultInstance().getData();
        }

        public static Uuid getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Uuid parseDelimitedFrom(InputStream inputStream) {
            return (Uuid) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Uuid parseFrom(ByteBuffer byteBuffer) {
            return (Uuid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(AbstractC3722j abstractC3722j) {
            abstractC3722j.getClass();
            this.data_ = abstractC3722j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new Uuid();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"data_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (Uuid.class) {
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

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.UuidOrBuilder
        public AbstractC3722j getData() {
            return this.data_;
        }

        public static Builder newBuilder(Uuid uuid) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(uuid);
        }

        public static Uuid parseDelimitedFrom(InputStream inputStream, D d10) {
            return (Uuid) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static Uuid parseFrom(ByteBuffer byteBuffer, D d10) {
            return (Uuid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static Uuid parseFrom(AbstractC3722j abstractC3722j) {
            return (Uuid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static Uuid parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (Uuid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static Uuid parseFrom(byte[] bArr) {
            return (Uuid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Uuid parseFrom(byte[] bArr, D d10) {
            return (Uuid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static Uuid parseFrom(InputStream inputStream) {
            return (Uuid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Uuid parseFrom(InputStream inputStream, D d10) {
            return (Uuid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static Uuid parseFrom(AbstractC3724k abstractC3724k) {
            return (Uuid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static Uuid parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (Uuid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface UuidOrBuilder extends InterfaceC3719h0 {
        AbstractC3722j getData();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class WriteCharacteristicInfo extends GeneratedMessageLite implements WriteCharacteristicInfoOrBuilder {
        public static final int CHARACTERISTIC_FIELD_NUMBER = 1;
        private static final WriteCharacteristicInfo DEFAULT_INSTANCE;
        public static final int FAILURE_FIELD_NUMBER = 3;
        private static volatile t0 PARSER;
        private int bitField0_;
        private CharacteristicAddress characteristic_;
        private GenericFailure failure_;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements WriteCharacteristicInfoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearCharacteristic() {
                copyOnWrite();
                ((WriteCharacteristicInfo) this.instance).clearCharacteristic();
                return this;
            }

            public Builder clearFailure() {
                copyOnWrite();
                ((WriteCharacteristicInfo) this.instance).clearFailure();
                return this;
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.WriteCharacteristicInfoOrBuilder
            public CharacteristicAddress getCharacteristic() {
                return ((WriteCharacteristicInfo) this.instance).getCharacteristic();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.WriteCharacteristicInfoOrBuilder
            public GenericFailure getFailure() {
                return ((WriteCharacteristicInfo) this.instance).getFailure();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.WriteCharacteristicInfoOrBuilder
            public boolean hasCharacteristic() {
                return ((WriteCharacteristicInfo) this.instance).hasCharacteristic();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.WriteCharacteristicInfoOrBuilder
            public boolean hasFailure() {
                return ((WriteCharacteristicInfo) this.instance).hasFailure();
            }

            public Builder mergeCharacteristic(CharacteristicAddress characteristicAddress) {
                copyOnWrite();
                ((WriteCharacteristicInfo) this.instance).mergeCharacteristic(characteristicAddress);
                return this;
            }

            public Builder mergeFailure(GenericFailure genericFailure) {
                copyOnWrite();
                ((WriteCharacteristicInfo) this.instance).mergeFailure(genericFailure);
                return this;
            }

            public Builder setCharacteristic(CharacteristicAddress characteristicAddress) {
                copyOnWrite();
                ((WriteCharacteristicInfo) this.instance).setCharacteristic(characteristicAddress);
                return this;
            }

            public Builder setFailure(GenericFailure genericFailure) {
                copyOnWrite();
                ((WriteCharacteristicInfo) this.instance).setFailure(genericFailure);
                return this;
            }

            private Builder() {
                super(WriteCharacteristicInfo.DEFAULT_INSTANCE);
            }

            public Builder setCharacteristic(CharacteristicAddress.Builder builder) {
                copyOnWrite();
                ((WriteCharacteristicInfo) this.instance).setCharacteristic((CharacteristicAddress) builder.build());
                return this;
            }

            public Builder setFailure(GenericFailure.Builder builder) {
                copyOnWrite();
                ((WriteCharacteristicInfo) this.instance).setFailure((GenericFailure) builder.build());
                return this;
            }
        }

        static {
            WriteCharacteristicInfo writeCharacteristicInfo = new WriteCharacteristicInfo();
            DEFAULT_INSTANCE = writeCharacteristicInfo;
            GeneratedMessageLite.registerDefaultInstance(WriteCharacteristicInfo.class, writeCharacteristicInfo);
        }

        private WriteCharacteristicInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCharacteristic() {
            this.characteristic_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFailure() {
            this.failure_ = null;
            this.bitField0_ &= -3;
        }

        public static WriteCharacteristicInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCharacteristic(CharacteristicAddress characteristicAddress) {
            characteristicAddress.getClass();
            CharacteristicAddress characteristicAddress2 = this.characteristic_;
            if (characteristicAddress2 == null || characteristicAddress2 == CharacteristicAddress.getDefaultInstance()) {
                this.characteristic_ = characteristicAddress;
            } else {
                this.characteristic_ = (CharacteristicAddress) ((CharacteristicAddress.Builder) CharacteristicAddress.newBuilder(this.characteristic_).mergeFrom((GeneratedMessageLite) characteristicAddress)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFailure(GenericFailure genericFailure) {
            genericFailure.getClass();
            GenericFailure genericFailure2 = this.failure_;
            if (genericFailure2 == null || genericFailure2 == GenericFailure.getDefaultInstance()) {
                this.failure_ = genericFailure;
            } else {
                this.failure_ = (GenericFailure) ((GenericFailure.Builder) GenericFailure.newBuilder(this.failure_).mergeFrom((GeneratedMessageLite) genericFailure)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static WriteCharacteristicInfo parseDelimitedFrom(InputStream inputStream) {
            return (WriteCharacteristicInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WriteCharacteristicInfo parseFrom(ByteBuffer byteBuffer) {
            return (WriteCharacteristicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCharacteristic(CharacteristicAddress characteristicAddress) {
            characteristicAddress.getClass();
            this.characteristic_ = characteristicAddress;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFailure(GenericFailure genericFailure) {
            genericFailure.getClass();
            this.failure_ = genericFailure;
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new WriteCharacteristicInfo();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "characteristic_", "failure_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (WriteCharacteristicInfo.class) {
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

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.WriteCharacteristicInfoOrBuilder
        public CharacteristicAddress getCharacteristic() {
            CharacteristicAddress characteristicAddress = this.characteristic_;
            return characteristicAddress == null ? CharacteristicAddress.getDefaultInstance() : characteristicAddress;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.WriteCharacteristicInfoOrBuilder
        public GenericFailure getFailure() {
            GenericFailure genericFailure = this.failure_;
            return genericFailure == null ? GenericFailure.getDefaultInstance() : genericFailure;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.WriteCharacteristicInfoOrBuilder
        public boolean hasCharacteristic() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.WriteCharacteristicInfoOrBuilder
        public boolean hasFailure() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(WriteCharacteristicInfo writeCharacteristicInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(writeCharacteristicInfo);
        }

        public static WriteCharacteristicInfo parseDelimitedFrom(InputStream inputStream, D d10) {
            return (WriteCharacteristicInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static WriteCharacteristicInfo parseFrom(ByteBuffer byteBuffer, D d10) {
            return (WriteCharacteristicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static WriteCharacteristicInfo parseFrom(AbstractC3722j abstractC3722j) {
            return (WriteCharacteristicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static WriteCharacteristicInfo parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (WriteCharacteristicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static WriteCharacteristicInfo parseFrom(byte[] bArr) {
            return (WriteCharacteristicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static WriteCharacteristicInfo parseFrom(byte[] bArr, D d10) {
            return (WriteCharacteristicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static WriteCharacteristicInfo parseFrom(InputStream inputStream) {
            return (WriteCharacteristicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WriteCharacteristicInfo parseFrom(InputStream inputStream, D d10) {
            return (WriteCharacteristicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static WriteCharacteristicInfo parseFrom(AbstractC3724k abstractC3724k) {
            return (WriteCharacteristicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static WriteCharacteristicInfo parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (WriteCharacteristicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface WriteCharacteristicInfoOrBuilder extends InterfaceC3719h0 {
        CharacteristicAddress getCharacteristic();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        GenericFailure getFailure();

        boolean hasCharacteristic();

        boolean hasFailure();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class WriteCharacteristicRequest extends GeneratedMessageLite implements WriteCharacteristicRequestOrBuilder {
        public static final int CHARACTERISTIC_FIELD_NUMBER = 1;
        private static final WriteCharacteristicRequest DEFAULT_INSTANCE;
        private static volatile t0 PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 2;
        private int bitField0_;
        private CharacteristicAddress characteristic_;
        private AbstractC3722j value_ = AbstractC3722j.f32236b;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder extends GeneratedMessageLite.b implements WriteCharacteristicRequestOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearCharacteristic() {
                copyOnWrite();
                ((WriteCharacteristicRequest) this.instance).clearCharacteristic();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((WriteCharacteristicRequest) this.instance).clearValue();
                return this;
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.WriteCharacteristicRequestOrBuilder
            public CharacteristicAddress getCharacteristic() {
                return ((WriteCharacteristicRequest) this.instance).getCharacteristic();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.WriteCharacteristicRequestOrBuilder
            public AbstractC3722j getValue() {
                return ((WriteCharacteristicRequest) this.instance).getValue();
            }

            @Override // com.signify.hue.flutterreactiveble.ProtobufModel.WriteCharacteristicRequestOrBuilder
            public boolean hasCharacteristic() {
                return ((WriteCharacteristicRequest) this.instance).hasCharacteristic();
            }

            public Builder mergeCharacteristic(CharacteristicAddress characteristicAddress) {
                copyOnWrite();
                ((WriteCharacteristicRequest) this.instance).mergeCharacteristic(characteristicAddress);
                return this;
            }

            public Builder setCharacteristic(CharacteristicAddress characteristicAddress) {
                copyOnWrite();
                ((WriteCharacteristicRequest) this.instance).setCharacteristic(characteristicAddress);
                return this;
            }

            public Builder setValue(AbstractC3722j abstractC3722j) {
                copyOnWrite();
                ((WriteCharacteristicRequest) this.instance).setValue(abstractC3722j);
                return this;
            }

            private Builder() {
                super(WriteCharacteristicRequest.DEFAULT_INSTANCE);
            }

            public Builder setCharacteristic(CharacteristicAddress.Builder builder) {
                copyOnWrite();
                ((WriteCharacteristicRequest) this.instance).setCharacteristic((CharacteristicAddress) builder.build());
                return this;
            }
        }

        static {
            WriteCharacteristicRequest writeCharacteristicRequest = new WriteCharacteristicRequest();
            DEFAULT_INSTANCE = writeCharacteristicRequest;
            GeneratedMessageLite.registerDefaultInstance(WriteCharacteristicRequest.class, writeCharacteristicRequest);
        }

        private WriteCharacteristicRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCharacteristic() {
            this.characteristic_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = getDefaultInstance().getValue();
        }

        public static WriteCharacteristicRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCharacteristic(CharacteristicAddress characteristicAddress) {
            characteristicAddress.getClass();
            CharacteristicAddress characteristicAddress2 = this.characteristic_;
            if (characteristicAddress2 == null || characteristicAddress2 == CharacteristicAddress.getDefaultInstance()) {
                this.characteristic_ = characteristicAddress;
            } else {
                this.characteristic_ = (CharacteristicAddress) ((CharacteristicAddress.Builder) CharacteristicAddress.newBuilder(this.characteristic_).mergeFrom((GeneratedMessageLite) characteristicAddress)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static WriteCharacteristicRequest parseDelimitedFrom(InputStream inputStream) {
            return (WriteCharacteristicRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WriteCharacteristicRequest parseFrom(ByteBuffer byteBuffer) {
            return (WriteCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCharacteristic(CharacteristicAddress characteristicAddress) {
            characteristicAddress.getClass();
            this.characteristic_ = characteristicAddress;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(AbstractC3722j abstractC3722j) {
            abstractC3722j.getClass();
            this.value_ = abstractC3722j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[gVar.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i10) {
                case 1:
                    return new WriteCharacteristicRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\n", new Object[]{"bitField0_", "characteristic_", "value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (WriteCharacteristicRequest.class) {
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

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.WriteCharacteristicRequestOrBuilder
        public CharacteristicAddress getCharacteristic() {
            CharacteristicAddress characteristicAddress = this.characteristic_;
            return characteristicAddress == null ? CharacteristicAddress.getDefaultInstance() : characteristicAddress;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.WriteCharacteristicRequestOrBuilder
        public AbstractC3722j getValue() {
            return this.value_;
        }

        @Override // com.signify.hue.flutterreactiveble.ProtobufModel.WriteCharacteristicRequestOrBuilder
        public boolean hasCharacteristic() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(WriteCharacteristicRequest writeCharacteristicRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(writeCharacteristicRequest);
        }

        public static WriteCharacteristicRequest parseDelimitedFrom(InputStream inputStream, D d10) {
            return (WriteCharacteristicRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static WriteCharacteristicRequest parseFrom(ByteBuffer byteBuffer, D d10) {
            return (WriteCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static WriteCharacteristicRequest parseFrom(AbstractC3722j abstractC3722j) {
            return (WriteCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static WriteCharacteristicRequest parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (WriteCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static WriteCharacteristicRequest parseFrom(byte[] bArr) {
            return (WriteCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static WriteCharacteristicRequest parseFrom(byte[] bArr, D d10) {
            return (WriteCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static WriteCharacteristicRequest parseFrom(InputStream inputStream) {
            return (WriteCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WriteCharacteristicRequest parseFrom(InputStream inputStream, D d10) {
            return (WriteCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static WriteCharacteristicRequest parseFrom(AbstractC3724k abstractC3724k) {
            return (WriteCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static WriteCharacteristicRequest parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (WriteCharacteristicRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface WriteCharacteristicRequestOrBuilder extends InterfaceC3719h0 {
        CharacteristicAddress getCharacteristic();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType();

        AbstractC3722j getValue();

        boolean hasCharacteristic();

        @Override // com.google.protobuf.InterfaceC3719h0
        /* synthetic */ boolean isInitialized();
    }

    private ProtobufModel() {
    }

    public static void registerAllExtensions(D d10) {
    }
}
