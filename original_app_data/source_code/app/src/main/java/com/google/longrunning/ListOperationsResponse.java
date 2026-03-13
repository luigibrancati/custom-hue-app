package com.google.longrunning;

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
public final class ListOperationsResponse extends GeneratedMessageLite implements InterfaceC3719h0 {
    private static final ListOperationsResponse DEFAULT_INSTANCE;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    public static final int OPERATIONS_FIELD_NUMBER = 1;
    private static volatile t0 PARSER;
    private N.j operations_ = GeneratedMessageLite.emptyProtobufList();
    private String nextPageToken_ = "";

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32030a;

        static {
            int[] iArr = new int[GeneratedMessageLite.g.values().length];
            f32030a = iArr;
            try {
                iArr[GeneratedMessageLite.g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32030a[GeneratedMessageLite.g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32030a[GeneratedMessageLite.g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32030a[GeneratedMessageLite.g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32030a[GeneratedMessageLite.g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32030a[GeneratedMessageLite.g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32030a[GeneratedMessageLite.g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
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
            super(ListOperationsResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        ListOperationsResponse listOperationsResponse = new ListOperationsResponse();
        DEFAULT_INSTANCE = listOperationsResponse;
        GeneratedMessageLite.registerDefaultInstance(ListOperationsResponse.class, listOperationsResponse);
    }

    private ListOperationsResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOperations(Iterable<? extends Operation> iterable) {
        ensureOperationsIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.operations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOperations(Operation operation) {
        operation.getClass();
        ensureOperationsIsMutable();
        this.operations_.add(operation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNextPageToken() {
        this.nextPageToken_ = getDefaultInstance().getNextPageToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOperations() {
        this.operations_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureOperationsIsMutable() {
        N.j jVar = this.operations_;
        if (jVar.m()) {
            return;
        }
        this.operations_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static ListOperationsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static ListOperationsResponse parseDelimitedFrom(InputStream inputStream) {
        return (ListOperationsResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListOperationsResponse parseFrom(ByteBuffer byteBuffer) {
        return (ListOperationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOperations(int i10) {
        ensureOperationsIsMutable();
        this.operations_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextPageToken(String str) {
        str.getClass();
        this.nextPageToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextPageTokenBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        this.nextPageToken_ = abstractC3722j.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOperations(int i10, Operation operation) {
        operation.getClass();
        ensureOperationsIsMutable();
        this.operations_.set(i10, operation);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        int i10 = a.f32030a[gVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new ListOperationsResponse();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"operations_", Operation.class, "nextPageToken_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (ListOperationsResponse.class) {
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

    public String getNextPageToken() {
        return this.nextPageToken_;
    }

    public AbstractC3722j getNextPageTokenBytes() {
        return AbstractC3722j.n(this.nextPageToken_);
    }

    public Operation getOperations(int i10) {
        return (Operation) this.operations_.get(i10);
    }

    public int getOperationsCount() {
        return this.operations_.size();
    }

    public List<Operation> getOperationsList() {
        return this.operations_;
    }

    public com.google.longrunning.a getOperationsOrBuilder(int i10) {
        return (com.google.longrunning.a) this.operations_.get(i10);
    }

    public List<? extends com.google.longrunning.a> getOperationsOrBuilderList() {
        return this.operations_;
    }

    public static b newBuilder(ListOperationsResponse listOperationsResponse) {
        return (b) DEFAULT_INSTANCE.createBuilder(listOperationsResponse);
    }

    public static ListOperationsResponse parseDelimitedFrom(InputStream inputStream, D d10) {
        return (ListOperationsResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static ListOperationsResponse parseFrom(ByteBuffer byteBuffer, D d10) {
        return (ListOperationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static ListOperationsResponse parseFrom(AbstractC3722j abstractC3722j) {
        return (ListOperationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOperations(int i10, Operation operation) {
        operation.getClass();
        ensureOperationsIsMutable();
        this.operations_.add(i10, operation);
    }

    public static ListOperationsResponse parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (ListOperationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static ListOperationsResponse parseFrom(byte[] bArr) {
        return (ListOperationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ListOperationsResponse parseFrom(byte[] bArr, D d10) {
        return (ListOperationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static ListOperationsResponse parseFrom(InputStream inputStream) {
        return (ListOperationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListOperationsResponse parseFrom(InputStream inputStream, D d10) {
        return (ListOperationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static ListOperationsResponse parseFrom(AbstractC3724k abstractC3724k) {
        return (ListOperationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static ListOperationsResponse parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (ListOperationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
