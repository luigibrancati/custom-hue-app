package com.google.rpc;

import com.google.protobuf.AbstractC3704a;
import com.google.protobuf.AbstractC3722j;
import com.google.protobuf.AbstractC3724k;
import com.google.protobuf.D;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3719h0;
import com.google.protobuf.N;
import com.google.protobuf.t0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Help extends GeneratedMessageLite implements InterfaceC3719h0 {
    private static final Help DEFAULT_INSTANCE;
    public static final int LINKS_FIELD_NUMBER = 1;
    private static volatile t0 PARSER;
    private N.j links_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Link extends GeneratedMessageLite implements c {
        private static final Link DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 1;
        private static volatile t0 PARSER = null;
        public static final int URL_FIELD_NUMBER = 2;
        private String description_ = "";
        private String url_ = "";

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends GeneratedMessageLite.b implements c {
            public /* synthetic */ a(a aVar) {
                this();
            }

            public a() {
                super(Link.DEFAULT_INSTANCE);
            }
        }

        static {
            Link link = new Link();
            DEFAULT_INSTANCE = link;
            GeneratedMessageLite.registerDefaultInstance(Link.class, link);
        }

        private Link() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDescription() {
            this.description_ = getDefaultInstance().getDescription();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        public static Link getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Link parseDelimitedFrom(InputStream inputStream) {
            return (Link) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Link parseFrom(ByteBuffer byteBuffer) {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescription(String str) {
            str.getClass();
            this.description_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescriptionBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.description_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrl(String str) {
            str.getClass();
            this.url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.url_ = abstractC3722j.J();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = a.f32346a[gVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new Link();
                case 2:
                    return new a(aVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"description_", "url_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (Link.class) {
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

        public String getDescription() {
            return this.description_;
        }

        public AbstractC3722j getDescriptionBytes() {
            return AbstractC3722j.n(this.description_);
        }

        public String getUrl() {
            return this.url_;
        }

        public AbstractC3722j getUrlBytes() {
            return AbstractC3722j.n(this.url_);
        }

        public static a newBuilder(Link link) {
            return (a) DEFAULT_INSTANCE.createBuilder(link);
        }

        public static Link parseDelimitedFrom(InputStream inputStream, D d10) {
            return (Link) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static Link parseFrom(ByteBuffer byteBuffer, D d10) {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static Link parseFrom(AbstractC3722j abstractC3722j) {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static Link parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static Link parseFrom(byte[] bArr) {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Link parseFrom(byte[] bArr, D d10) {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static Link parseFrom(InputStream inputStream) {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Link parseFrom(InputStream inputStream, D d10) {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static Link parseFrom(AbstractC3724k abstractC3724k) {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static Link parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32346a;

        static {
            int[] iArr = new int[GeneratedMessageLite.g.values().length];
            f32346a = iArr;
            try {
                iArr[GeneratedMessageLite.g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32346a[GeneratedMessageLite.g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32346a[GeneratedMessageLite.g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32346a[GeneratedMessageLite.g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32346a[GeneratedMessageLite.g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32346a[GeneratedMessageLite.g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32346a[GeneratedMessageLite.g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
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
            super(Help.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c extends InterfaceC3719h0 {
    }

    static {
        Help help = new Help();
        DEFAULT_INSTANCE = help;
        GeneratedMessageLite.registerDefaultInstance(Help.class, help);
    }

    private Help() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLinks(Iterable<? extends Link> iterable) {
        ensureLinksIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.links_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLinks(Link link) {
        link.getClass();
        ensureLinksIsMutable();
        this.links_.add(link);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinks() {
        this.links_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureLinksIsMutable() {
        N.j jVar = this.links_;
        if (jVar.m()) {
            return;
        }
        this.links_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static Help getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static Help parseDelimitedFrom(InputStream inputStream) {
        return (Help) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Help parseFrom(ByteBuffer byteBuffer) {
        return (Help) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLinks(int i10) {
        ensureLinksIsMutable();
        this.links_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinks(int i10, Link link) {
        link.getClass();
        ensureLinksIsMutable();
        this.links_.set(i10, link);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        int i10 = a.f32346a[gVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new Help();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"links_", Link.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (Help.class) {
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

    public Link getLinks(int i10) {
        return (Link) this.links_.get(i10);
    }

    public int getLinksCount() {
        return this.links_.size();
    }

    public List<Link> getLinksList() {
        return this.links_;
    }

    public c getLinksOrBuilder(int i10) {
        return (c) this.links_.get(i10);
    }

    public List<? extends c> getLinksOrBuilderList() {
        return this.links_;
    }

    public static b newBuilder(Help help) {
        return (b) DEFAULT_INSTANCE.createBuilder(help);
    }

    public static Help parseDelimitedFrom(InputStream inputStream, D d10) {
        return (Help) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static Help parseFrom(ByteBuffer byteBuffer, D d10) {
        return (Help) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static Help parseFrom(AbstractC3722j abstractC3722j) {
        return (Help) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLinks(int i10, Link link) {
        link.getClass();
        ensureLinksIsMutable();
        this.links_.add(i10, link);
    }

    public static Help parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (Help) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static Help parseFrom(byte[] bArr) {
        return (Help) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Help parseFrom(byte[] bArr, D d10) {
        return (Help) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static Help parseFrom(InputStream inputStream) {
        return (Help) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Help parseFrom(InputStream inputStream, D d10) {
        return (Help) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static Help parseFrom(AbstractC3724k abstractC3724k) {
        return (Help) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static Help parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (Help) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
