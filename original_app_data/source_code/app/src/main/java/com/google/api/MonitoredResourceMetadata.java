package com.google.api;

import com.google.protobuf.AbstractC3722j;
import com.google.protobuf.AbstractC3724k;
import com.google.protobuf.C3705a0;
import com.google.protobuf.D;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3719h0;
import com.google.protobuf.Q0;
import com.google.protobuf.Struct;
import com.google.protobuf.Z;
import com.google.protobuf.t0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class MonitoredResourceMetadata extends GeneratedMessageLite implements InterfaceC3719h0 {
    private static final MonitoredResourceMetadata DEFAULT_INSTANCE;
    private static volatile t0 PARSER = null;
    public static final int SYSTEM_LABELS_FIELD_NUMBER = 1;
    public static final int USER_LABELS_FIELD_NUMBER = 2;
    private int bitField0_;
    private Struct systemLabels_;
    private C3705a0 userLabels_ = C3705a0.i();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31062a;

        static {
            int[] iArr = new int[GeneratedMessageLite.g.values().length];
            f31062a = iArr;
            try {
                iArr[GeneratedMessageLite.g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31062a[GeneratedMessageLite.g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31062a[GeneratedMessageLite.g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31062a[GeneratedMessageLite.g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31062a[GeneratedMessageLite.g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31062a[GeneratedMessageLite.g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31062a[GeneratedMessageLite.g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
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
            super(MonitoredResourceMetadata.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Z f31063a;

        static {
            Q0.b bVar = Q0.b.STRING;
            f31063a = Z.d(bVar, "", bVar, "");
        }
    }

    static {
        MonitoredResourceMetadata monitoredResourceMetadata = new MonitoredResourceMetadata();
        DEFAULT_INSTANCE = monitoredResourceMetadata;
        GeneratedMessageLite.registerDefaultInstance(MonitoredResourceMetadata.class, monitoredResourceMetadata);
    }

    private MonitoredResourceMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSystemLabels() {
        this.systemLabels_ = null;
        this.bitField0_ &= -2;
    }

    public static MonitoredResourceMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableUserLabelsMap() {
        return internalGetMutableUserLabels();
    }

    private C3705a0 internalGetMutableUserLabels() {
        if (!this.userLabels_.o()) {
            this.userLabels_ = this.userLabels_.r();
        }
        return this.userLabels_;
    }

    private C3705a0 internalGetUserLabels() {
        return this.userLabels_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSystemLabels(Struct struct) {
        struct.getClass();
        Struct struct2 = this.systemLabels_;
        if (struct2 == null || struct2 == Struct.getDefaultInstance()) {
            this.systemLabels_ = struct;
        } else {
            this.systemLabels_ = (Struct) ((Struct.b) Struct.newBuilder(this.systemLabels_).mergeFrom((GeneratedMessageLite) struct)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static MonitoredResourceMetadata parseDelimitedFrom(InputStream inputStream) {
        return (MonitoredResourceMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MonitoredResourceMetadata parseFrom(ByteBuffer byteBuffer) {
        return (MonitoredResourceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemLabels(Struct struct) {
        struct.getClass();
        this.systemLabels_ = struct;
        this.bitField0_ |= 1;
    }

    public boolean containsUserLabels(String str) {
        str.getClass();
        return internalGetUserLabels().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        int i10 = a.f31062a[gVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new MonitoredResourceMetadata();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဉ\u0000\u00022", new Object[]{"bitField0_", "systemLabels_", "userLabels_", c.f31063a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (MonitoredResourceMetadata.class) {
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

    public Struct getSystemLabels() {
        Struct struct = this.systemLabels_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Deprecated
    public Map<String, String> getUserLabels() {
        return getUserLabelsMap();
    }

    public int getUserLabelsCount() {
        return internalGetUserLabels().size();
    }

    public Map<String, String> getUserLabelsMap() {
        return Collections.unmodifiableMap(internalGetUserLabels());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String getUserLabelsOrDefault(String str, String str2) {
        str.getClass();
        C3705a0 c3705a0InternalGetUserLabels = internalGetUserLabels();
        return c3705a0InternalGetUserLabels.containsKey(str) ? (String) c3705a0InternalGetUserLabels.get(str) : str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String getUserLabelsOrThrow(String str) {
        str.getClass();
        C3705a0 c3705a0InternalGetUserLabels = internalGetUserLabels();
        if (c3705a0InternalGetUserLabels.containsKey(str)) {
            return (String) c3705a0InternalGetUserLabels.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean hasSystemLabels() {
        return (this.bitField0_ & 1) != 0;
    }

    public static b newBuilder(MonitoredResourceMetadata monitoredResourceMetadata) {
        return (b) DEFAULT_INSTANCE.createBuilder(monitoredResourceMetadata);
    }

    public static MonitoredResourceMetadata parseDelimitedFrom(InputStream inputStream, D d10) {
        return (MonitoredResourceMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static MonitoredResourceMetadata parseFrom(ByteBuffer byteBuffer, D d10) {
        return (MonitoredResourceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static MonitoredResourceMetadata parseFrom(AbstractC3722j abstractC3722j) {
        return (MonitoredResourceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    public static MonitoredResourceMetadata parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (MonitoredResourceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static MonitoredResourceMetadata parseFrom(byte[] bArr) {
        return (MonitoredResourceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MonitoredResourceMetadata parseFrom(byte[] bArr, D d10) {
        return (MonitoredResourceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static MonitoredResourceMetadata parseFrom(InputStream inputStream) {
        return (MonitoredResourceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MonitoredResourceMetadata parseFrom(InputStream inputStream, D d10) {
        return (MonitoredResourceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static MonitoredResourceMetadata parseFrom(AbstractC3724k abstractC3724k) {
        return (MonitoredResourceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static MonitoredResourceMetadata parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (MonitoredResourceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
