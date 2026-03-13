package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC3654a;
import com.google.crypto.tink.shaded.protobuf.AbstractC3658e;
import com.google.crypto.tink.shaded.protobuf.AbstractC3678z;
import com.google.crypto.tink.shaded.protobuf.Q;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3676x extends AbstractC3654a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Class<?>, AbstractC3676x> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected n0 unknownFields = n0.c();

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.x$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class a extends AbstractC3654a.AbstractC0368a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC3676x f31574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AbstractC3676x f31575b;

        public a(AbstractC3676x abstractC3676x) {
            this.f31574a = abstractC3676x;
            if (abstractC3676x.y()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f31575b = s();
        }

        public static void r(Object obj, Object obj2) {
            b0.a().d(obj).a(obj, obj2);
        }

        private AbstractC3676x s() {
            return this.f31574a.E();
        }

        public final AbstractC3676x i() {
            AbstractC3676x abstractC3676xJ = j();
            if (abstractC3676xJ.isInitialized()) {
                return abstractC3676xJ;
            }
            throw AbstractC3654a.AbstractC0368a.g(abstractC3676xJ);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.S
        public final boolean isInitialized() {
            return AbstractC3676x.x(this.f31575b, false);
        }

        public AbstractC3676x j() {
            if (!this.f31575b.y()) {
                return this.f31575b;
            }
            this.f31575b.z();
            return this.f31575b;
        }

        public a m() {
            a aVarNewBuilderForType = p().newBuilderForType();
            aVarNewBuilderForType.f31575b = j();
            return aVarNewBuilderForType;
        }

        public final void n() {
            if (this.f31575b.y()) {
                return;
            }
            o();
        }

        public void o() {
            AbstractC3676x abstractC3676xS = s();
            r(abstractC3676xS, this.f31575b);
            this.f31575b = abstractC3676xS;
        }

        public AbstractC3676x p() {
            return this.f31574a;
        }

        public a q(AbstractC3676x abstractC3676x) {
            if (p().equals(abstractC3676x)) {
                return this;
            }
            n();
            r(this.f31575b, abstractC3676x);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.x$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends AbstractC3655b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC3676x f31576b;

        public b(AbstractC3676x abstractC3676x) {
            this.f31576b = abstractC3676x;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Z
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public AbstractC3676x a(AbstractC3662i abstractC3662i, C3669p c3669p) {
            return AbstractC3676x.J(this.f31576b, abstractC3662i, c3669p);
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.x$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class c extends AbstractC3676x implements S {
        protected C3672t extensions = C3672t.f();

        public C3672t O() {
            if (this.extensions.k()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3676x, com.google.crypto.tink.shaded.protobuf.S
        public /* bridge */ /* synthetic */ Q getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3676x, com.google.crypto.tink.shaded.protobuf.Q
        public /* bridge */ /* synthetic */ Q.a newBuilderForType() {
            return super.newBuilderForType();
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.x$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d extends AbstractC3667n {
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.x$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum e {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static AbstractC3678z.d B(AbstractC3678z.d dVar) {
        return dVar.a(dVar.size() * 2);
    }

    public static Object D(Q q10, String str, Object[] objArr) {
        return new d0(q10, str, objArr);
    }

    public static AbstractC3676x F(AbstractC3676x abstractC3676x, AbstractC3661h abstractC3661h, C3669p c3669p) {
        return j(I(abstractC3676x, abstractC3661h, c3669p));
    }

    public static AbstractC3676x G(AbstractC3676x abstractC3676x, InputStream inputStream, C3669p c3669p) {
        return j(J(abstractC3676x, AbstractC3662i.h(inputStream), c3669p));
    }

    public static AbstractC3676x H(AbstractC3676x abstractC3676x, byte[] bArr, C3669p c3669p) {
        return j(K(abstractC3676x, bArr, 0, bArr.length, c3669p));
    }

    public static AbstractC3676x I(AbstractC3676x abstractC3676x, AbstractC3661h abstractC3661h, C3669p c3669p) throws A {
        AbstractC3662i abstractC3662iT = abstractC3661h.t();
        AbstractC3676x abstractC3676xJ = J(abstractC3676x, abstractC3662iT, c3669p);
        try {
            abstractC3662iT.a(0);
            return abstractC3676xJ;
        } catch (A e10) {
            throw e10.k(abstractC3676xJ);
        }
    }

    public static AbstractC3676x J(AbstractC3676x abstractC3676x, AbstractC3662i abstractC3662i, C3669p c3669p) throws A {
        AbstractC3676x abstractC3676xE = abstractC3676x.E();
        try {
            f0 f0VarD = b0.a().d(abstractC3676xE);
            f0VarD.h(abstractC3676xE, C3663j.N(abstractC3662i), c3669p);
            f0VarD.b(abstractC3676xE);
            return abstractC3676xE;
        } catch (A e10) {
            e = e10;
            if (e.a()) {
                e = new A(e);
            }
            throw e.k(abstractC3676xE);
        } catch (l0 e11) {
            throw e11.a().k(abstractC3676xE);
        } catch (IOException e12) {
            if (e12.getCause() instanceof A) {
                throw ((A) e12.getCause());
            }
            throw new A(e12).k(abstractC3676xE);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof A) {
                throw ((A) e13.getCause());
            }
            throw e13;
        }
    }

    public static AbstractC3676x K(AbstractC3676x abstractC3676x, byte[] bArr, int i10, int i11, C3669p c3669p) throws A {
        if (i11 == 0) {
            return abstractC3676x;
        }
        AbstractC3676x abstractC3676xE = abstractC3676x.E();
        try {
            f0 f0VarD = b0.a().d(abstractC3676xE);
            f0VarD.g(abstractC3676xE, bArr, i10, i10 + i11, new AbstractC3658e.a(c3669p));
            f0VarD.b(abstractC3676xE);
            return abstractC3676xE;
        } catch (A e10) {
            A a10 = e10;
            if (a10.a()) {
                a10 = new A(a10);
            }
            throw a10.k(abstractC3676xE);
        } catch (l0 e11) {
            throw e11.a().k(abstractC3676xE);
        } catch (IOException e12) {
            if (e12.getCause() instanceof A) {
                throw ((A) e12.getCause());
            }
            throw new A(e12).k(abstractC3676xE);
        } catch (IndexOutOfBoundsException unused) {
            throw A.m().k(abstractC3676xE);
        }
    }

    public static void L(Class cls, AbstractC3676x abstractC3676x) {
        abstractC3676x.A();
        defaultInstanceMap.put(cls, abstractC3676x);
    }

    public static AbstractC3676x j(AbstractC3676x abstractC3676x) throws A {
        if (abstractC3676x == null || abstractC3676x.isInitialized()) {
            return abstractC3676x;
        }
        throw abstractC3676x.e().a().k(abstractC3676x);
    }

    public static AbstractC3678z.d r() {
        return c0.e();
    }

    public static AbstractC3676x s(Class cls) {
        AbstractC3676x abstractC3676x = defaultInstanceMap.get(cls);
        if (abstractC3676x == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC3676x = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC3676x != null) {
            return abstractC3676x;
        }
        AbstractC3676x defaultInstanceForType = ((AbstractC3676x) p0.k(cls)).getDefaultInstanceForType();
        if (defaultInstanceForType == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, defaultInstanceForType);
        return defaultInstanceForType;
    }

    public static Object w(Method method, Object obj, Object... objArr) {
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

    public static final boolean x(AbstractC3676x abstractC3676x, boolean z10) {
        byte bByteValue = ((Byte) abstractC3676x.q(e.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zC = b0.a().d(abstractC3676x).c(abstractC3676x);
        if (z10) {
            abstractC3676x.q(e.SET_MEMOIZED_IS_INITIALIZED, zC ? abstractC3676x : null, null);
        }
        return zC;
    }

    public void A() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Q
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final a newBuilderForType() {
        return (a) q(e.NEW_BUILDER, null, null);
    }

    public AbstractC3676x E() {
        return (AbstractC3676x) q(e.NEW_MUTABLE_INSTANCE, null, null);
    }

    public void M(int i10) {
        this.memoizedHashCode = i10;
    }

    public final a N() {
        return ((a) q(e.NEW_BUILDER, null, null)).q(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Q
    public void a(AbstractC3664k abstractC3664k) {
        b0.a().d(this).i(this, C3665l.P(abstractC3664k));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3654a
    public int b() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3654a
    public int c(f0 f0Var) {
        if (!y()) {
            if (b() != Integer.MAX_VALUE) {
                return b();
            }
            int iN = n(f0Var);
            f(iN);
            return iN;
        }
        int iN2 = n(f0Var);
        if (iN2 >= 0) {
            return iN2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iN2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return b0.a().d(this).f(this, (AbstractC3676x) obj);
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3654a
    public void f(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Q
    public final Z getParserForType() {
        return (Z) q(e.GET_PARSER, null, null);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Q
    public int getSerializedSize() {
        return c(null);
    }

    public int hashCode() {
        if (y()) {
            return m();
        }
        if (v()) {
            M(m());
        }
        return u();
    }

    public Object i() {
        return q(e.BUILD_MESSAGE_INFO, null, null);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.S
    public final boolean isInitialized() {
        return x(this, true);
    }

    public void k() {
        this.memoizedHashCode = 0;
    }

    public void l() {
        f(Integer.MAX_VALUE);
    }

    public int m() {
        return b0.a().d(this).e(this);
    }

    public final int n(f0 f0Var) {
        return f0Var == null ? b0.a().d(this).d(this) : f0Var.d(this);
    }

    public final a o() {
        return (a) q(e.NEW_BUILDER, null, null);
    }

    public final a p(AbstractC3676x abstractC3676x) {
        return o().q(abstractC3676x);
    }

    public abstract Object q(e eVar, Object obj, Object obj2);

    @Override // com.google.crypto.tink.shaded.protobuf.S
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final AbstractC3676x getDefaultInstanceForType() {
        return (AbstractC3676x) q(e.GET_DEFAULT_INSTANCE, null, null);
    }

    public String toString() {
        return T.f(this, super.toString());
    }

    public int u() {
        return this.memoizedHashCode;
    }

    public boolean v() {
        return u() == 0;
    }

    public boolean y() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public void z() {
        b0.a().d(this).b(this);
        A();
    }
}
