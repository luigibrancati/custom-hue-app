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
public final class AndroidApplicationInfo extends GeneratedMessageLite implements InterfaceC3719h0 {
    private static final AndroidApplicationInfo DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile t0 PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31870a;

        static {
            int[] iArr = new int[GeneratedMessageLite.g.values().length];
            f31870a = iArr;
            try {
                iArr[GeneratedMessageLite.g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31870a[GeneratedMessageLite.g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31870a[GeneratedMessageLite.g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31870a[GeneratedMessageLite.g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31870a[GeneratedMessageLite.g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31870a[GeneratedMessageLite.g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31870a[GeneratedMessageLite.g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends GeneratedMessageLite.b implements InterfaceC3719h0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b j(String str) {
            copyOnWrite();
            ((AndroidApplicationInfo) this.instance).setPackageName(str);
            return this;
        }

        public b m(String str) {
            copyOnWrite();
            ((AndroidApplicationInfo) this.instance).setSdkVersion(str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            ((AndroidApplicationInfo) this.instance).setVersionName(str);
            return this;
        }

        public b() {
            super(AndroidApplicationInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        AndroidApplicationInfo androidApplicationInfo = new AndroidApplicationInfo();
        DEFAULT_INSTANCE = androidApplicationInfo;
        GeneratedMessageLite.registerDefaultInstance(AndroidApplicationInfo.class, androidApplicationInfo);
    }

    private AndroidApplicationInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPackageName() {
        this.bitField0_ &= -2;
        this.packageName_ = getDefaultInstance().getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdkVersion() {
        this.bitField0_ &= -3;
        this.sdkVersion_ = getDefaultInstance().getSdkVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersionName() {
        this.bitField0_ &= -5;
        this.versionName_ = getDefaultInstance().getVersionName();
    }

    public static AndroidApplicationInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static AndroidApplicationInfo parseDelimitedFrom(InputStream inputStream) {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AndroidApplicationInfo parseFrom(ByteBuffer byteBuffer) {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.packageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageNameBytes(AbstractC3722j abstractC3722j) {
        this.packageName_ = abstractC3722j.J();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersion(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.sdkVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersionBytes(AbstractC3722j abstractC3722j) {
        this.sdkVersion_ = abstractC3722j.J();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionName(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.versionName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionNameBytes(AbstractC3722j abstractC3722j) {
        this.versionName_ = abstractC3722j.J();
        this.bitField0_ |= 4;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        int i10 = a.f31870a[gVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new AndroidApplicationInfo();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (AndroidApplicationInfo.class) {
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

    public String getPackageName() {
        return this.packageName_;
    }

    public AbstractC3722j getPackageNameBytes() {
        return AbstractC3722j.n(this.packageName_);
    }

    public String getSdkVersion() {
        return this.sdkVersion_;
    }

    public AbstractC3722j getSdkVersionBytes() {
        return AbstractC3722j.n(this.sdkVersion_);
    }

    public String getVersionName() {
        return this.versionName_;
    }

    public AbstractC3722j getVersionNameBytes() {
        return AbstractC3722j.n(this.versionName_);
    }

    public boolean hasPackageName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSdkVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasVersionName() {
        return (this.bitField0_ & 4) != 0;
    }

    public static b newBuilder(AndroidApplicationInfo androidApplicationInfo) {
        return (b) DEFAULT_INSTANCE.createBuilder(androidApplicationInfo);
    }

    public static AndroidApplicationInfo parseDelimitedFrom(InputStream inputStream, D d10) {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static AndroidApplicationInfo parseFrom(ByteBuffer byteBuffer, D d10) {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static AndroidApplicationInfo parseFrom(AbstractC3722j abstractC3722j) {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    public static AndroidApplicationInfo parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static AndroidApplicationInfo parseFrom(byte[] bArr) {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AndroidApplicationInfo parseFrom(byte[] bArr, D d10) {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static AndroidApplicationInfo parseFrom(InputStream inputStream) {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AndroidApplicationInfo parseFrom(InputStream inputStream, D d10) {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static AndroidApplicationInfo parseFrom(AbstractC3724k abstractC3724k) {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static AndroidApplicationInfo parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
