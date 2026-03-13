package com.google.protobuf;

import com.google.protobuf.AbstractC3704a;
import com.google.protobuf.AbstractC3716g;
import com.google.protobuf.I;
import com.google.protobuf.InterfaceC3717g0;
import com.google.protobuf.N;
import com.google.protobuf.Q0;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class GeneratedMessageLite extends AbstractC3704a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, GeneratedMessageLite> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected K0 unknownFields = K0.c();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32093a;

        static {
            int[] iArr = new int[Q0.c.values().length];
            f32093a = iArr;
            try {
                iArr[Q0.c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32093a[Q0.c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class b extends AbstractC3704a.AbstractC0382a {
        private final GeneratedMessageLite defaultInstance;
        protected GeneratedMessageLite instance;

        public b(GeneratedMessageLite generatedMessageLite) {
            this.defaultInstance = generatedMessageLite;
            if (generatedMessageLite.isMutable()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.instance = i();
        }

        public static void g(Object obj, Object obj2) {
            w0.a().d(obj).a(obj, obj2);
        }

        private GeneratedMessageLite i() {
            return this.defaultInstance.newMutableInstance();
        }

        public final void copyOnWrite() {
            if (this.instance.isMutable()) {
                return;
            }
            copyOnWriteInternal();
        }

        public void copyOnWriteInternal() {
            GeneratedMessageLite generatedMessageLiteI = i();
            g(generatedMessageLiteI, this.instance);
            this.instance = generatedMessageLiteI;
        }

        @Override // com.google.protobuf.InterfaceC3719h0
        public final boolean isInitialized() {
            return GeneratedMessageLite.isInitialized(this.instance, false);
        }

        @Override // com.google.protobuf.InterfaceC3717g0.a
        public final GeneratedMessageLite build() {
            GeneratedMessageLite generatedMessageLiteBuildPartial = buildPartial();
            if (generatedMessageLiteBuildPartial.isInitialized()) {
                return generatedMessageLiteBuildPartial;
            }
            throw AbstractC3704a.AbstractC0382a.newUninitializedMessageException(generatedMessageLiteBuildPartial);
        }

        @Override // com.google.protobuf.InterfaceC3717g0.a
        public GeneratedMessageLite buildPartial() {
            if (!this.instance.isMutable()) {
                return this.instance;
            }
            this.instance.makeImmutable();
            return this.instance;
        }

        /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] */
        public final b m234clear() {
            if (this.defaultInstance.isMutable()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.instance = i();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3719h0
        public GeneratedMessageLite getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        @Override // com.google.protobuf.AbstractC3704a.AbstractC0382a
        public b internalMergeFrom(GeneratedMessageLite generatedMessageLite) {
            return mergeFrom(generatedMessageLite);
        }

        @Override // com.google.protobuf.AbstractC3704a.AbstractC0382a
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public b mo237clone() {
            b bVarNewBuilderForType = getDefaultInstanceForType().newBuilderForType();
            bVarNewBuilderForType.instance = buildPartial();
            return bVarNewBuilderForType;
        }

        public b mergeFrom(GeneratedMessageLite generatedMessageLite) {
            if (getDefaultInstanceForType().equals(generatedMessageLite)) {
                return this;
            }
            copyOnWrite();
            g(this.instance, generatedMessageLite);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3704a.AbstractC0382a
        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public b m236mergeFrom(byte[] bArr, int i10, int i11, D d10) throws O {
            copyOnWrite();
            try {
                w0.a().d(this.instance).i(this.instance, bArr, i10, i10 + i11, new AbstractC3716g.b(d10));
                return this;
            } catch (O e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
            } catch (IndexOutOfBoundsException unused) {
                throw O.m();
            }
        }

        @Override // com.google.protobuf.AbstractC3704a.AbstractC0382a
        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public b m235mergeFrom(byte[] bArr, int i10, int i11) {
            return m236mergeFrom(bArr, i10, i11, D.b());
        }

        @Override // com.google.protobuf.AbstractC3704a.AbstractC0382a, com.google.protobuf.InterfaceC3717g0.a
        public b mergeFrom(AbstractC3724k abstractC3724k, D d10) throws IOException {
            copyOnWrite();
            try {
                w0.a().d(this.instance).h(this.instance, C3726l.P(abstractC3724k), d10);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends AbstractC3706b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final GeneratedMessageLite f32094b;

        public c(GeneratedMessageLite generatedMessageLite) {
            this.f32094b = generatedMessageLite;
        }

        @Override // com.google.protobuf.t0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public GeneratedMessageLite b(AbstractC3724k abstractC3724k, D d10) {
            return GeneratedMessageLite.parsePartialFrom(this.f32094b, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class d extends b implements InterfaceC3719h0 {
        public d(ExtendableMessage extendableMessage) {
            super(extendableMessage);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.b
        public void copyOnWriteInternal() {
            super.copyOnWriteInternal();
            if (((ExtendableMessage) this.instance).extensions != I.h()) {
                GeneratedMessageLite generatedMessageLite = this.instance;
                ((ExtendableMessage) generatedMessageLite).extensions = ((ExtendableMessage) generatedMessageLite).extensions.clone();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite.b, com.google.protobuf.InterfaceC3717g0.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final ExtendableMessage buildPartial() {
            if (!((ExtendableMessage) this.instance).isMutable()) {
                return (ExtendableMessage) this.instance;
            }
            ((ExtendableMessage) this.instance).extensions.x();
            return (ExtendableMessage) super.buildPartial();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e implements I.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final N.d f32095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f32096b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Q0.b f32097c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f32098d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f32099e;

        public e(N.d dVar, int i10, Q0.b bVar, boolean z10, boolean z11) {
            this.f32095a = dVar;
            this.f32096b = i10;
            this.f32097c = bVar;
            this.f32098d = z10;
            this.f32099e = z11;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return this.f32096b - eVar.f32096b;
        }

        public N.d b() {
            return this.f32095a;
        }

        @Override // com.google.protobuf.I.b
        public boolean f() {
            return this.f32098d;
        }

        @Override // com.google.protobuf.I.b
        public Q0.b g() {
            return this.f32097c;
        }

        @Override // com.google.protobuf.I.b
        public int getNumber() {
            return this.f32096b;
        }

        @Override // com.google.protobuf.I.b
        public boolean h() {
            return this.f32099e;
        }

        @Override // com.google.protobuf.I.b
        public Q0.c k() {
            return this.f32097c.a();
        }

        @Override // com.google.protobuf.I.b
        public InterfaceC3717g0.a n(InterfaceC3717g0.a aVar, InterfaceC3717g0 interfaceC3717g0) {
            return ((b) aVar).mergeFrom((GeneratedMessageLite) interfaceC3717g0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class f extends B {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC3717g0 f32100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f32101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterfaceC3717g0 f32102c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e f32103d;

        public f(InterfaceC3717g0 interfaceC3717g0, Object obj, InterfaceC3717g0 interfaceC3717g02, e eVar, Class cls) {
            if (interfaceC3717g0 == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (eVar.g() == Q0.b.MESSAGE && interfaceC3717g02 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f32100a = interfaceC3717g0;
            this.f32101b = obj;
            this.f32102c = interfaceC3717g02;
            this.f32103d = eVar;
        }

        public Object b(Object obj) {
            if (!this.f32103d.f()) {
                return h(obj);
            }
            if (this.f32103d.k() != Q0.c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(h(it.next()));
            }
            return arrayList;
        }

        public InterfaceC3717g0 c() {
            return this.f32100a;
        }

        public Q0.b d() {
            return this.f32103d.g();
        }

        public InterfaceC3717g0 e() {
            return this.f32102c;
        }

        public int f() {
            return this.f32103d.getNumber();
        }

        public boolean g() {
            return this.f32103d.f32098d;
        }

        public Object h(Object obj) {
            return this.f32103d.k() == Q0.c.ENUM ? this.f32103d.f32095a.findValueByNumber(((Integer) obj).intValue()) : obj;
        }

        public Object i(Object obj) {
            return this.f32103d.k() == Q0.c.ENUM ? Integer.valueOf(((N.c) obj).getNumber()) : obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum g {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static f b(B b10) {
        if (b10.a()) {
            return (f) b10;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    public static GeneratedMessageLite c(GeneratedMessageLite generatedMessageLite) throws O {
        if (generatedMessageLite == null || generatedMessageLite.isInitialized()) {
            return generatedMessageLite;
        }
        throw generatedMessageLite.newUninitializedMessageException().a().k(generatedMessageLite);
    }

    public static N.a emptyBooleanList() {
        return C3718h.k();
    }

    public static N.b emptyDoubleList() {
        return C3745y.h();
    }

    public static N.f emptyFloatList() {
        return K.k();
    }

    public static N.g emptyIntList() {
        return M.h();
    }

    public static N.i emptyLongList() {
        return X.h();
    }

    public static <E> N.j emptyProtobufList() {
        return x0.e();
    }

    public static GeneratedMessageLite f(GeneratedMessageLite generatedMessageLite, InputStream inputStream, D d10) throws O {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            AbstractC3724k abstractC3724kH = AbstractC3724k.h(new AbstractC3704a.AbstractC0382a.C0383a(inputStream, AbstractC3724k.C(i10, inputStream)));
            GeneratedMessageLite partialFrom = parsePartialFrom(generatedMessageLite, abstractC3724kH, d10);
            try {
                abstractC3724kH.a(0);
                return partialFrom;
            } catch (O e10) {
                throw e10.k(partialFrom);
            }
        } catch (O e11) {
            if (e11.a()) {
                throw new O(e11);
            }
            throw e11;
        } catch (IOException e12) {
            throw new O(e12);
        }
    }

    public static GeneratedMessageLite g(GeneratedMessageLite generatedMessageLite, AbstractC3722j abstractC3722j, D d10) throws O {
        AbstractC3724k abstractC3724kW = abstractC3722j.w();
        GeneratedMessageLite partialFrom = parsePartialFrom(generatedMessageLite, abstractC3724kW, d10);
        try {
            abstractC3724kW.a(0);
            return partialFrom;
        } catch (O e10) {
            throw e10.k(partialFrom);
        }
    }

    public static <T extends GeneratedMessageLite> T getDefaultInstance(Class<T> cls) {
        T t10 = (T) defaultInstanceMap.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 != null) {
            return t10;
        }
        T t11 = (T) ((GeneratedMessageLite) N0.l(cls)).getDefaultInstanceForType();
        if (t11 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t11);
        return t11;
    }

    public static java.lang.reflect.Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e10);
        }
    }

    public static GeneratedMessageLite h(GeneratedMessageLite generatedMessageLite, byte[] bArr, int i10, int i11, D d10) throws O {
        GeneratedMessageLite generatedMessageLiteNewMutableInstance = generatedMessageLite.newMutableInstance();
        try {
            A0 a0D = w0.a().d(generatedMessageLiteNewMutableInstance);
            a0D.i(generatedMessageLiteNewMutableInstance, bArr, i10, i10 + i11, new AbstractC3716g.b(d10));
            a0D.b(generatedMessageLiteNewMutableInstance);
            return generatedMessageLiteNewMutableInstance;
        } catch (I0 e10) {
            throw e10.a().k(generatedMessageLiteNewMutableInstance);
        } catch (O e11) {
            O o10 = e11;
            if (o10.a()) {
                o10 = new O(o10);
            }
            throw o10.k(generatedMessageLiteNewMutableInstance);
        } catch (IOException e12) {
            if (e12.getCause() instanceof O) {
                throw ((O) e12.getCause());
            }
            throw new O(e12).k(generatedMessageLiteNewMutableInstance);
        } catch (IndexOutOfBoundsException unused) {
            throw O.m().k(generatedMessageLiteNewMutableInstance);
        }
    }

    public static Object invokeOrDie(java.lang.reflect.Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static N.g mutableCopy(N.g gVar) {
        int size = gVar.size();
        return gVar.a(size == 0 ? 10 : size * 2);
    }

    public static Object newMessageInfo(InterfaceC3717g0 interfaceC3717g0, String str, Object[] objArr) {
        return new y0(interfaceC3717g0, str, objArr);
    }

    public static <ContainingType extends InterfaceC3717g0, Type> f newRepeatedGeneratedExtension(ContainingType containingtype, InterfaceC3717g0 interfaceC3717g0, N.d dVar, int i10, Q0.b bVar, boolean z10, Class cls) {
        return new f(containingtype, Collections.EMPTY_LIST, interfaceC3717g0, new e(dVar, i10, bVar, true, z10), cls);
    }

    public static <ContainingType extends InterfaceC3717g0, Type> f newSingularGeneratedExtension(ContainingType containingtype, Type type, InterfaceC3717g0 interfaceC3717g0, N.d dVar, int i10, Q0.b bVar, Class cls) {
        return new f(containingtype, type, interfaceC3717g0, new e(dVar, i10, bVar, false, false), cls);
    }

    public static <T extends GeneratedMessageLite> T parseDelimitedFrom(T t10, InputStream inputStream) {
        return (T) c(f(t10, inputStream, D.b()));
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t10, ByteBuffer byteBuffer, D d10) {
        return (T) c(parseFrom(t10, AbstractC3724k.j(byteBuffer), d10));
    }

    public static <T extends GeneratedMessageLite> T parsePartialFrom(T t10, AbstractC3724k abstractC3724k, D d10) throws O {
        T t11 = (T) t10.newMutableInstance();
        try {
            A0 a0D = w0.a().d(t11);
            a0D.h(t11, C3726l.P(abstractC3724k), d10);
            a0D.b(t11);
            return t11;
        } catch (I0 e10) {
            throw e10.a().k(t11);
        } catch (O e11) {
            e = e11;
            if (e.a()) {
                e = new O(e);
            }
            throw e.k(t11);
        } catch (IOException e12) {
            if (e12.getCause() instanceof O) {
                throw ((O) e12.getCause());
            }
            throw new O(e12).k(t11);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof O) {
                throw ((O) e13.getCause());
            }
            throw e13;
        }
    }

    public static <T extends GeneratedMessageLite> void registerDefaultInstance(Class<T> cls, T t10) {
        t10.markImmutable();
        defaultInstanceMap.put(cls, t10);
    }

    public Object buildMessageInfo() {
        return dynamicMethod(g.BUILD_MESSAGE_INFO);
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    public int computeHashCode() {
        return w0.a().d(this).e(this);
    }

    public final <MessageType extends GeneratedMessageLite, BuilderType extends b> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(g.NEW_BUILDER);
    }

    public final int d(A0 a02) {
        return a02 == null ? w0.a().d(this).d(this) : a02.d(this);
    }

    public Object dynamicMethod(g gVar, Object obj) {
        return dynamicMethod(gVar, obj, null);
    }

    public abstract Object dynamicMethod(g gVar, Object obj, Object obj2);

    public final void e() {
        if (this.unknownFields == K0.c()) {
            this.unknownFields = K0.o();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return w0.a().d(this).f(this, (GeneratedMessageLite) obj);
        }
        return false;
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    @Override // com.google.protobuf.AbstractC3704a
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.InterfaceC3717g0
    public final t0 getParserForType() {
        return (t0) dynamicMethod(g.GET_PARSER);
    }

    @Override // com.google.protobuf.AbstractC3704a
    public int getSerializedSize(A0 a02) {
        if (!isMutable()) {
            if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
                return getMemoizedSerializedSize();
            }
            int iD = d(a02);
            setMemoizedSerializedSize(iD);
            return iD;
        }
        int iD2 = d(a02);
        if (iD2 >= 0) {
            return iD2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iD2);
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    @Override // com.google.protobuf.InterfaceC3719h0
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public boolean isMutable() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public void makeImmutable() {
        w0.a().d(this).b(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public void mergeLengthDelimitedField(int i10, AbstractC3722j abstractC3722j) {
        e();
        this.unknownFields.l(i10, abstractC3722j);
    }

    public final void mergeUnknownFields(K0 k02) {
        this.unknownFields = K0.n(this.unknownFields, k02);
    }

    public void mergeVarintField(int i10, int i11) {
        e();
        this.unknownFields.m(i10, i11);
    }

    public GeneratedMessageLite newMutableInstance() {
        return (GeneratedMessageLite) dynamicMethod(g.NEW_MUTABLE_INSTANCE);
    }

    public boolean parseUnknownField(int i10, AbstractC3724k abstractC3724k) {
        if (Q0.b(i10) == 4) {
            return false;
        }
        e();
        return this.unknownFields.i(i10, abstractC3724k);
    }

    public void setMemoizedHashCode(int i10) {
        this.memoizedHashCode = i10;
    }

    @Override // com.google.protobuf.AbstractC3704a
    public void setMemoizedSerializedSize(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    public String toString() {
        return AbstractC3721i0.f(this, super.toString());
    }

    @Override // com.google.protobuf.InterfaceC3717g0
    public void writeTo(AbstractC3728m abstractC3728m) {
        w0.a().d(this).g(this, C3730n.P(abstractC3728m));
    }

    public static final <T extends GeneratedMessageLite> boolean isInitialized(T t10, boolean z10) {
        byte bByteValue = ((Byte) t10.dynamicMethod(g.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zC = w0.a().d(t10).c(t10);
        if (z10) {
            t10.dynamicMethod(g.SET_MEMOIZED_IS_INITIALIZED, zC ? t10 : null);
        }
        return zC;
    }

    public final <MessageType extends GeneratedMessageLite, BuilderType extends b> BuilderType createBuilder(MessageType messagetype) {
        return (BuilderType) createBuilder().mergeFrom((GeneratedMessageLite) messagetype);
    }

    public Object dynamicMethod(g gVar) {
        return dynamicMethod(gVar, null, null);
    }

    @Override // com.google.protobuf.InterfaceC3719h0
    public final GeneratedMessageLite getDefaultInstanceForType() {
        return (GeneratedMessageLite) dynamicMethod(g.GET_DEFAULT_INSTANCE);
    }

    @Override // com.google.protobuf.InterfaceC3717g0
    public final b newBuilderForType() {
        return (b) dynamicMethod(g.NEW_BUILDER);
    }

    @Override // com.google.protobuf.InterfaceC3717g0
    public final b toBuilder() {
        return ((b) dynamicMethod(g.NEW_BUILDER)).mergeFrom(this);
    }

    public static N.i mutableCopy(N.i iVar) {
        int size = iVar.size();
        return iVar.a(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t10, ByteBuffer byteBuffer) {
        return (T) parseFrom(t10, byteBuffer, D.b());
    }

    public static <T extends GeneratedMessageLite> T parseDelimitedFrom(T t10, InputStream inputStream, D d10) {
        return (T) c(f(t10, inputStream, d10));
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t10, AbstractC3722j abstractC3722j) {
        return (T) c(parseFrom(t10, abstractC3722j, D.b()));
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends d> extends GeneratedMessageLite implements InterfaceC3719h0 {
        protected I extensions = I.h();

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Iterator f32089a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Map.Entry f32090b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f32091c;

            public /* synthetic */ a(ExtendableMessage extendableMessage, boolean z10, a aVar) {
                this(z10);
            }

            public a(boolean z10) {
                Iterator itW = ExtendableMessage.this.extensions.w();
                this.f32089a = itW;
                if (itW.hasNext()) {
                    this.f32090b = (Map.Entry) itW.next();
                }
                this.f32091c = z10;
            }
        }

        private void eagerlyMergeMessageSetExtension(AbstractC3724k abstractC3724k, f fVar, D d10, int i10) {
            parseExtension(abstractC3724k, d10, fVar, Q0.c(i10, 2), i10);
        }

        private void mergeMessageSetExtensionFromBytes(AbstractC3722j abstractC3722j, D d10, f fVar) {
            InterfaceC3717g0 interfaceC3717g0 = (InterfaceC3717g0) this.extensions.i(fVar.f32103d);
            InterfaceC3717g0.a builder = interfaceC3717g0 != null ? interfaceC3717g0.toBuilder() : null;
            if (builder == null) {
                builder = fVar.e().newBuilderForType();
            }
            builder.mergeFrom(abstractC3722j, d10);
            ensureExtensionsAreMutable().C(fVar.f32103d, fVar.i(builder.build()));
        }

        private <MessageType extends InterfaceC3717g0> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, AbstractC3724k abstractC3724k, D d10) {
            int iK = 0;
            AbstractC3722j abstractC3722jR = null;
            f fVarA = null;
            while (true) {
                int iJ = abstractC3724k.J();
                if (iJ == 0) {
                    break;
                }
                if (iJ == Q0.f32177c) {
                    iK = abstractC3724k.K();
                    if (iK != 0) {
                        fVarA = d10.a(messagetype, iK);
                    }
                } else if (iJ == Q0.f32178d) {
                    if (iK == 0 || fVarA == null) {
                        abstractC3722jR = abstractC3724k.r();
                    } else {
                        eagerlyMergeMessageSetExtension(abstractC3724k, fVarA, d10, iK);
                        abstractC3722jR = null;
                    }
                } else if (!abstractC3724k.M(iJ)) {
                    break;
                }
            }
            abstractC3724k.a(Q0.f32176b);
            if (abstractC3722jR == null || iK == 0) {
                return;
            }
            if (fVarA != null) {
                mergeMessageSetExtensionFromBytes(abstractC3722jR, d10, fVarA);
            } else {
                mergeLengthDelimitedField(iK, abstractC3722jR);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x0008  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private boolean parseExtension(com.google.protobuf.AbstractC3724k r6, com.google.protobuf.D r7, com.google.protobuf.GeneratedMessageLite.f r8, int r9, int r10) {
            /*
                Method dump skipped, instruction units count: 293
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.GeneratedMessageLite.ExtendableMessage.parseExtension(com.google.protobuf.k, com.google.protobuf.D, com.google.protobuf.GeneratedMessageLite$f, int, int):boolean");
        }

        private void verifyExtensionContainingType(f fVar) {
            if (fVar.c() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public I ensureExtensionsAreMutable() {
            if (this.extensions.r()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.s();
        }

        public int extensionsSerializedSize() {
            return this.extensions.n();
        }

        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.j();
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.InterfaceC3719h0
        public /* bridge */ /* synthetic */ InterfaceC3717g0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        public final <Type> Type getExtension(B b10) {
            f fVarB = GeneratedMessageLite.b(b10);
            verifyExtensionContainingType(fVarB);
            Object objI = this.extensions.i(fVarB.f32103d);
            return objI == null ? (Type) fVarB.f32101b : (Type) fVarB.b(objI);
        }

        public final <Type> int getExtensionCount(B b10) {
            f fVarB = GeneratedMessageLite.b(b10);
            verifyExtensionContainingType(fVarB);
            return this.extensions.m(fVarB.f32103d);
        }

        public final <Type> boolean hasExtension(B b10) {
            f fVarB = GeneratedMessageLite.b(b10);
            verifyExtensionContainingType(fVarB);
            return this.extensions.p(fVarB.f32103d);
        }

        public final void mergeExtensionFields(MessageType messagetype) {
            if (this.extensions.r()) {
                this.extensions = this.extensions.clone();
            }
            this.extensions.y(messagetype.extensions);
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.InterfaceC3717g0
        public /* bridge */ /* synthetic */ InterfaceC3717g0.a newBuilderForType() {
            return super.newBuilderForType();
        }

        public ExtendableMessage<MessageType, BuilderType>.a newExtensionWriter() {
            return new a(this, false, null);
        }

        public ExtendableMessage<MessageType, BuilderType>.a newMessageSetExtensionWriter() {
            return new a(this, true, null);
        }

        public <MessageType extends InterfaceC3717g0> boolean parseUnknownField(MessageType messagetype, AbstractC3724k abstractC3724k, D d10, int i10) {
            int iA = Q0.a(i10);
            return parseExtension(abstractC3724k, d10, d10.a(messagetype, iA), i10, iA);
        }

        public <MessageType extends InterfaceC3717g0> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, AbstractC3724k abstractC3724k, D d10, int i10) {
            if (i10 != Q0.f32175a) {
                return Q0.b(i10) == 2 ? parseUnknownField(messagetype, abstractC3724k, d10, i10) : abstractC3724k.M(i10);
            }
            mergeMessageSetExtensionFromCodedStream(messagetype, abstractC3724k, d10);
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.InterfaceC3717g0
        public /* bridge */ /* synthetic */ InterfaceC3717g0.a toBuilder() {
            return super.toBuilder();
        }

        public final <Type> Type getExtension(B b10, int i10) {
            f fVarB = GeneratedMessageLite.b(b10);
            verifyExtensionContainingType(fVarB);
            return (Type) fVarB.h(this.extensions.l(fVarB.f32103d, i10));
        }
    }

    public static N.f mutableCopy(N.f fVar) {
        int size = fVar.size();
        return fVar.a(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t10, AbstractC3722j abstractC3722j, D d10) {
        return (T) c(g(t10, abstractC3722j, d10));
    }

    public static N.b mutableCopy(N.b bVar) {
        int size = bVar.size();
        return bVar.a(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t10, byte[] bArr) {
        return (T) c(h(t10, bArr, 0, bArr.length, D.b()));
    }

    @Override // com.google.protobuf.InterfaceC3717g0
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    public static N.a mutableCopy(N.a aVar) {
        int size = aVar.size();
        return aVar.a(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t10, byte[] bArr, D d10) {
        return (T) c(h(t10, bArr, 0, bArr.length, d10));
    }

    public static <E> N.j mutableCopy(N.j jVar) {
        int size = jVar.size();
        return jVar.a(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t10, InputStream inputStream) {
        return (T) c(parsePartialFrom(t10, AbstractC3724k.h(inputStream), D.b()));
    }

    public static <T extends GeneratedMessageLite> T parsePartialFrom(T t10, AbstractC3724k abstractC3724k) {
        return (T) parsePartialFrom(t10, abstractC3724k, D.b());
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t10, InputStream inputStream, D d10) {
        return (T) c(parsePartialFrom(t10, AbstractC3724k.h(inputStream), d10));
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t10, AbstractC3724k abstractC3724k) {
        return (T) parseFrom(t10, abstractC3724k, D.b());
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t10, AbstractC3724k abstractC3724k, D d10) {
        return (T) c(parsePartialFrom(t10, abstractC3724k, d10));
    }
}
