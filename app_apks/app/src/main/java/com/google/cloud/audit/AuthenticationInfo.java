package com.google.cloud.audit;

import com.google.protobuf.AbstractC3704a;
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
public final class AuthenticationInfo extends GeneratedMessageLite implements InterfaceC3719h0 {
    private static final AuthenticationInfo DEFAULT_INSTANCE;
    private static volatile t0 PARSER = null;
    public static final int PRINCIPAL_EMAIL_FIELD_NUMBER = 1;
    private String principalEmail_ = "";

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31379a;

        static {
            int[] iArr = new int[GeneratedMessageLite.g.values().length];
            f31379a = iArr;
            try {
                iArr[GeneratedMessageLite.g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31379a[GeneratedMessageLite.g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31379a[GeneratedMessageLite.g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31379a[GeneratedMessageLite.g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31379a[GeneratedMessageLite.g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31379a[GeneratedMessageLite.g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31379a[GeneratedMessageLite.g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
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
            super(AuthenticationInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        AuthenticationInfo authenticationInfo = new AuthenticationInfo();
        DEFAULT_INSTANCE = authenticationInfo;
        GeneratedMessageLite.registerDefaultInstance(AuthenticationInfo.class, authenticationInfo);
    }

    private AuthenticationInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrincipalEmail() {
        this.principalEmail_ = getDefaultInstance().getPrincipalEmail();
    }

    public static AuthenticationInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static AuthenticationInfo parseDelimitedFrom(InputStream inputStream) {
        return (AuthenticationInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthenticationInfo parseFrom(ByteBuffer byteBuffer) {
        return (AuthenticationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrincipalEmail(String str) {
        str.getClass();
        this.principalEmail_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrincipalEmailBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        this.principalEmail_ = abstractC3722j.J();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        int i10 = a.f31379a[gVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new AuthenticationInfo();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"principalEmail_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (AuthenticationInfo.class) {
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

    public String getPrincipalEmail() {
        return this.principalEmail_;
    }

    public AbstractC3722j getPrincipalEmailBytes() {
        return AbstractC3722j.n(this.principalEmail_);
    }

    public static b newBuilder(AuthenticationInfo authenticationInfo) {
        return (b) DEFAULT_INSTANCE.createBuilder(authenticationInfo);
    }

    public static AuthenticationInfo parseDelimitedFrom(InputStream inputStream, D d10) {
        return (AuthenticationInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static AuthenticationInfo parseFrom(ByteBuffer byteBuffer, D d10) {
        return (AuthenticationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static AuthenticationInfo parseFrom(AbstractC3722j abstractC3722j) {
        return (AuthenticationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    public static AuthenticationInfo parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (AuthenticationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static AuthenticationInfo parseFrom(byte[] bArr) {
        return (AuthenticationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AuthenticationInfo parseFrom(byte[] bArr, D d10) {
        return (AuthenticationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static AuthenticationInfo parseFrom(InputStream inputStream) {
        return (AuthenticationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthenticationInfo parseFrom(InputStream inputStream, D d10) {
        return (AuthenticationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static AuthenticationInfo parseFrom(AbstractC3724k abstractC3724k) {
        return (AuthenticationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static AuthenticationInfo parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (AuthenticationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
