package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.AndroidApplicationInfo;
import com.google.protobuf.AbstractC3722j;
import com.google.protobuf.AbstractC3724k;
import com.google.protobuf.C3705a0;
import com.google.protobuf.D;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3719h0;
import com.google.protobuf.Q0;
import com.google.protobuf.Z;
import com.google.protobuf.t0;
import i9.EnumC4369b;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class ApplicationInfo extends GeneratedMessageLite implements InterfaceC3719h0 {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final ApplicationInfo DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile t0 PARSER;
    private AndroidApplicationInfo androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private C3705a0 customAttributes_ = C3705a0.i();
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31872a;

        static {
            int[] iArr = new int[GeneratedMessageLite.g.values().length];
            f31872a = iArr;
            try {
                iArr[GeneratedMessageLite.g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31872a[GeneratedMessageLite.g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31872a[GeneratedMessageLite.g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31872a[GeneratedMessageLite.g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31872a[GeneratedMessageLite.g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31872a[GeneratedMessageLite.g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31872a[GeneratedMessageLite.g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends GeneratedMessageLite.b implements InterfaceC3719h0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public boolean j() {
            return ((ApplicationInfo) this.instance).hasAppInstanceId();
        }

        public b m(Map map) {
            copyOnWrite();
            ((ApplicationInfo) this.instance).getMutableCustomAttributesMap().putAll(map);
            return this;
        }

        public b n(AndroidApplicationInfo.b bVar) {
            copyOnWrite();
            ((ApplicationInfo) this.instance).setAndroidAppInfo((AndroidApplicationInfo) bVar.build());
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            ((ApplicationInfo) this.instance).setAppInstanceId(str);
            return this;
        }

        public b p(EnumC4369b enumC4369b) {
            copyOnWrite();
            ((ApplicationInfo) this.instance).setApplicationProcessState(enumC4369b);
            return this;
        }

        public b q(String str) {
            copyOnWrite();
            ((ApplicationInfo) this.instance).setGoogleAppId(str);
            return this;
        }

        public b() {
            super(ApplicationInfo.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Z f31873a;

        static {
            Q0.b bVar = Q0.b.STRING;
            f31873a = Z.d(bVar, "", bVar, "");
        }
    }

    static {
        ApplicationInfo applicationInfo = new ApplicationInfo();
        DEFAULT_INSTANCE = applicationInfo;
        GeneratedMessageLite.registerDefaultInstance(ApplicationInfo.class, applicationInfo);
    }

    private ApplicationInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAndroidAppInfo() {
        this.androidAppInfo_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppInstanceId() {
        this.bitField0_ &= -3;
        this.appInstanceId_ = getDefaultInstance().getAppInstanceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApplicationProcessState() {
        this.bitField0_ &= -9;
        this.applicationProcessState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAppId() {
        this.bitField0_ &= -2;
        this.googleAppId_ = getDefaultInstance().getGoogleAppId();
    }

    public static ApplicationInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableCustomAttributesMap() {
        return internalGetMutableCustomAttributes();
    }

    private C3705a0 internalGetCustomAttributes() {
        return this.customAttributes_;
    }

    private C3705a0 internalGetMutableCustomAttributes() {
        if (!this.customAttributes_.o()) {
            this.customAttributes_ = this.customAttributes_.r();
        }
        return this.customAttributes_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAndroidAppInfo(AndroidApplicationInfo androidApplicationInfo) {
        androidApplicationInfo.getClass();
        AndroidApplicationInfo androidApplicationInfo2 = this.androidAppInfo_;
        if (androidApplicationInfo2 == null || androidApplicationInfo2 == AndroidApplicationInfo.getDefaultInstance()) {
            this.androidAppInfo_ = androidApplicationInfo;
        } else {
            this.androidAppInfo_ = (AndroidApplicationInfo) ((AndroidApplicationInfo.b) AndroidApplicationInfo.newBuilder(this.androidAppInfo_).mergeFrom((GeneratedMessageLite) androidApplicationInfo)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static ApplicationInfo parseDelimitedFrom(InputStream inputStream) {
        return (ApplicationInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ApplicationInfo parseFrom(ByteBuffer byteBuffer) {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndroidAppInfo(AndroidApplicationInfo androidApplicationInfo) {
        androidApplicationInfo.getClass();
        this.androidAppInfo_ = androidApplicationInfo;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppInstanceId(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.appInstanceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppInstanceIdBytes(AbstractC3722j abstractC3722j) {
        this.appInstanceId_ = abstractC3722j.J();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationProcessState(EnumC4369b enumC4369b) {
        this.applicationProcessState_ = enumC4369b.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAppId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAppIdBytes(AbstractC3722j abstractC3722j) {
        this.googleAppId_ = abstractC3722j.J();
        this.bitField0_ |= 1;
    }

    public boolean containsCustomAttributes(String str) {
        str.getClass();
        return internalGetCustomAttributes().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        int i10 = a.f31872a[gVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new ApplicationInfo();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005᠌\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", EnumC4369b.j(), "customAttributes_", c.f31873a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (ApplicationInfo.class) {
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

    public AndroidApplicationInfo getAndroidAppInfo() {
        AndroidApplicationInfo androidApplicationInfo = this.androidAppInfo_;
        return androidApplicationInfo == null ? AndroidApplicationInfo.getDefaultInstance() : androidApplicationInfo;
    }

    public String getAppInstanceId() {
        return this.appInstanceId_;
    }

    public AbstractC3722j getAppInstanceIdBytes() {
        return AbstractC3722j.n(this.appInstanceId_);
    }

    public EnumC4369b getApplicationProcessState() {
        EnumC4369b enumC4369bB = EnumC4369b.b(this.applicationProcessState_);
        return enumC4369bB == null ? EnumC4369b.APPLICATION_PROCESS_STATE_UNKNOWN : enumC4369bB;
    }

    @Deprecated
    public Map<String, String> getCustomAttributes() {
        return getCustomAttributesMap();
    }

    public int getCustomAttributesCount() {
        return internalGetCustomAttributes().size();
    }

    public Map<String, String> getCustomAttributesMap() {
        return Collections.unmodifiableMap(internalGetCustomAttributes());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String getCustomAttributesOrDefault(String str, String str2) {
        str.getClass();
        C3705a0 c3705a0InternalGetCustomAttributes = internalGetCustomAttributes();
        return c3705a0InternalGetCustomAttributes.containsKey(str) ? (String) c3705a0InternalGetCustomAttributes.get(str) : str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String getCustomAttributesOrThrow(String str) {
        str.getClass();
        C3705a0 c3705a0InternalGetCustomAttributes = internalGetCustomAttributes();
        if (c3705a0InternalGetCustomAttributes.containsKey(str)) {
            return (String) c3705a0InternalGetCustomAttributes.get(str);
        }
        throw new IllegalArgumentException();
    }

    public String getGoogleAppId() {
        return this.googleAppId_;
    }

    public AbstractC3722j getGoogleAppIdBytes() {
        return AbstractC3722j.n(this.googleAppId_);
    }

    public boolean hasAndroidAppInfo() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasAppInstanceId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasApplicationProcessState() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasGoogleAppId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static b newBuilder(ApplicationInfo applicationInfo) {
        return (b) DEFAULT_INSTANCE.createBuilder(applicationInfo);
    }

    public static ApplicationInfo parseDelimitedFrom(InputStream inputStream, D d10) {
        return (ApplicationInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static ApplicationInfo parseFrom(ByteBuffer byteBuffer, D d10) {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static ApplicationInfo parseFrom(AbstractC3722j abstractC3722j) {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    public static ApplicationInfo parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static ApplicationInfo parseFrom(byte[] bArr) {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ApplicationInfo parseFrom(byte[] bArr, D d10) {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static ApplicationInfo parseFrom(InputStream inputStream) {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ApplicationInfo parseFrom(InputStream inputStream, D d10) {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static ApplicationInfo parseFrom(AbstractC3724k abstractC3724k) {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static ApplicationInfo parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
