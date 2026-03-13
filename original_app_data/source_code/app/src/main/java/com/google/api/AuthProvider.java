package com.google.api;

import com.google.protobuf.AbstractC3704a;
import com.google.protobuf.AbstractC3722j;
import com.google.protobuf.AbstractC3724k;
import com.google.protobuf.D;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.N;
import com.google.protobuf.t0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class AuthProvider extends GeneratedMessageLite implements E7.b {
    public static final int AUDIENCES_FIELD_NUMBER = 4;
    public static final int AUTHORIZATION_URL_FIELD_NUMBER = 5;
    private static final AuthProvider DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ISSUER_FIELD_NUMBER = 2;
    public static final int JWKS_URI_FIELD_NUMBER = 3;
    public static final int JWT_LOCATIONS_FIELD_NUMBER = 6;
    private static volatile t0 PARSER;
    private String id_ = "";
    private String issuer_ = "";
    private String jwksUri_ = "";
    private String audiences_ = "";
    private String authorizationUrl_ = "";
    private N.j jwtLocations_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31031a;

        static {
            int[] iArr = new int[GeneratedMessageLite.g.values().length];
            f31031a = iArr;
            try {
                iArr[GeneratedMessageLite.g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31031a[GeneratedMessageLite.g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31031a[GeneratedMessageLite.g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31031a[GeneratedMessageLite.g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31031a[GeneratedMessageLite.g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31031a[GeneratedMessageLite.g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31031a[GeneratedMessageLite.g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends GeneratedMessageLite.b implements E7.b {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(AuthProvider.DEFAULT_INSTANCE);
        }
    }

    static {
        AuthProvider authProvider = new AuthProvider();
        DEFAULT_INSTANCE = authProvider;
        GeneratedMessageLite.registerDefaultInstance(AuthProvider.class, authProvider);
    }

    private AuthProvider() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllJwtLocations(Iterable<? extends JwtLocation> iterable) {
        ensureJwtLocationsIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.jwtLocations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addJwtLocations(JwtLocation jwtLocation) {
        jwtLocation.getClass();
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.add(jwtLocation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudiences() {
        this.audiences_ = getDefaultInstance().getAudiences();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthorizationUrl() {
        this.authorizationUrl_ = getDefaultInstance().getAuthorizationUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIssuer() {
        this.issuer_ = getDefaultInstance().getIssuer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJwksUri() {
        this.jwksUri_ = getDefaultInstance().getJwksUri();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJwtLocations() {
        this.jwtLocations_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureJwtLocationsIsMutable() {
        N.j jVar = this.jwtLocations_;
        if (jVar.m()) {
            return;
        }
        this.jwtLocations_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static AuthProvider getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static AuthProvider parseDelimitedFrom(InputStream inputStream) {
        return (AuthProvider) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthProvider parseFrom(ByteBuffer byteBuffer) {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeJwtLocations(int i10) {
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudiences(String str) {
        str.getClass();
        this.audiences_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudiencesBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        this.audiences_ = abstractC3722j.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthorizationUrl(String str) {
        str.getClass();
        this.authorizationUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthorizationUrlBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        this.authorizationUrl_ = abstractC3722j.J();
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
    public void setIssuer(String str) {
        str.getClass();
        this.issuer_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIssuerBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        this.issuer_ = abstractC3722j.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJwksUri(String str) {
        str.getClass();
        this.jwksUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJwksUriBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        this.jwksUri_ = abstractC3722j.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJwtLocations(int i10, JwtLocation jwtLocation) {
        jwtLocation.getClass();
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.set(i10, jwtLocation);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        int i10 = a.f31031a[gVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new AuthProvider();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u001b", new Object[]{"id_", "issuer_", "jwksUri_", "audiences_", "authorizationUrl_", "jwtLocations_", JwtLocation.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (AuthProvider.class) {
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

    public String getAudiences() {
        return this.audiences_;
    }

    public AbstractC3722j getAudiencesBytes() {
        return AbstractC3722j.n(this.audiences_);
    }

    public String getAuthorizationUrl() {
        return this.authorizationUrl_;
    }

    public AbstractC3722j getAuthorizationUrlBytes() {
        return AbstractC3722j.n(this.authorizationUrl_);
    }

    public String getId() {
        return this.id_;
    }

    public AbstractC3722j getIdBytes() {
        return AbstractC3722j.n(this.id_);
    }

    public String getIssuer() {
        return this.issuer_;
    }

    public AbstractC3722j getIssuerBytes() {
        return AbstractC3722j.n(this.issuer_);
    }

    public String getJwksUri() {
        return this.jwksUri_;
    }

    public AbstractC3722j getJwksUriBytes() {
        return AbstractC3722j.n(this.jwksUri_);
    }

    public JwtLocation getJwtLocations(int i10) {
        return (JwtLocation) this.jwtLocations_.get(i10);
    }

    public int getJwtLocationsCount() {
        return this.jwtLocations_.size();
    }

    public List<JwtLocation> getJwtLocationsList() {
        return this.jwtLocations_;
    }

    public c getJwtLocationsOrBuilder(int i10) {
        return (c) this.jwtLocations_.get(i10);
    }

    public List<? extends c> getJwtLocationsOrBuilderList() {
        return this.jwtLocations_;
    }

    public static b newBuilder(AuthProvider authProvider) {
        return (b) DEFAULT_INSTANCE.createBuilder(authProvider);
    }

    public static AuthProvider parseDelimitedFrom(InputStream inputStream, D d10) {
        return (AuthProvider) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static AuthProvider parseFrom(ByteBuffer byteBuffer, D d10) {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static AuthProvider parseFrom(AbstractC3722j abstractC3722j) {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addJwtLocations(int i10, JwtLocation jwtLocation) {
        jwtLocation.getClass();
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.add(i10, jwtLocation);
    }

    public static AuthProvider parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static AuthProvider parseFrom(byte[] bArr) {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AuthProvider parseFrom(byte[] bArr, D d10) {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static AuthProvider parseFrom(InputStream inputStream) {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthProvider parseFrom(InputStream inputStream, D d10) {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static AuthProvider parseFrom(AbstractC3724k abstractC3724k) {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static AuthProvider parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
