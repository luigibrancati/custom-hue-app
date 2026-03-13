package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC2695a;
import androidx.datastore.preferences.protobuf.AbstractC2714u;
import androidx.datastore.preferences.protobuf.K;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2713t extends AbstractC2695a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC2713t> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected h0 unknownFields = h0.c();

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class a extends AbstractC2695a.AbstractC0285a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC2713t f22903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AbstractC2713t f22904b;

        public a(AbstractC2713t abstractC2713t) {
            this.f22903a = abstractC2713t;
            if (abstractC2713t.z()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f22904b = t();
        }

        public static void s(Object obj, Object obj2) {
            V.a().d(obj).a(obj, obj2);
        }

        private AbstractC2713t t() {
            return this.f22903a.F();
        }

        @Override // androidx.datastore.preferences.protobuf.L
        public final boolean isInitialized() {
            return AbstractC2713t.y(this.f22904b, false);
        }

        public final AbstractC2713t m() {
            AbstractC2713t abstractC2713tBuildPartial = buildPartial();
            if (abstractC2713tBuildPartial.isInitialized()) {
                return abstractC2713tBuildPartial;
            }
            throw AbstractC2695a.AbstractC0285a.j(abstractC2713tBuildPartial);
        }

        @Override // androidx.datastore.preferences.protobuf.K.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public AbstractC2713t buildPartial() {
            if (!this.f22904b.z()) {
                return this.f22904b;
            }
            this.f22904b.A();
            return this.f22904b;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2695a.AbstractC0285a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public a i() {
            a aVarNewBuilderForType = getDefaultInstanceForType().newBuilderForType();
            aVarNewBuilderForType.f22904b = buildPartial();
            return aVarNewBuilderForType;
        }

        public final void p() {
            if (this.f22904b.z()) {
                return;
            }
            q();
        }

        public void q() {
            AbstractC2713t abstractC2713tT = t();
            s(abstractC2713tT, this.f22904b);
            this.f22904b = abstractC2713tT;
        }

        @Override // androidx.datastore.preferences.protobuf.L
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public AbstractC2713t getDefaultInstanceForType() {
            return this.f22903a;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends AbstractC2696b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC2713t f22905b;

        public b(AbstractC2713t abstractC2713t) {
            this.f22905b = abstractC2713t;
        }

        @Override // androidx.datastore.preferences.protobuf.T
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public AbstractC2713t b(AbstractC2701g abstractC2701g, C2707m c2707m) {
            return AbstractC2713t.H(this.f22905b, abstractC2701g, c2707m);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class c extends AbstractC2713t implements L {
        protected C2711q extensions = C2711q.f();

        public C2711q K() {
            if (this.extensions.l()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2713t, androidx.datastore.preferences.protobuf.L
        public /* bridge */ /* synthetic */ K getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2713t, androidx.datastore.preferences.protobuf.K
        public /* bridge */ /* synthetic */ K.a newBuilderForType() {
            return super.newBuilderForType();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d extends AbstractC2705k {
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$e */
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

    public static AbstractC2714u.b C(AbstractC2714u.b bVar) {
        int size = bVar.size();
        return bVar.a(size == 0 ? 10 : size * 2);
    }

    public static Object E(K k10, String str, Object[] objArr) {
        return new X(k10, str, objArr);
    }

    public static AbstractC2713t G(AbstractC2713t abstractC2713t, InputStream inputStream) {
        return j(H(abstractC2713t, AbstractC2701g.g(inputStream), C2707m.b()));
    }

    public static AbstractC2713t H(AbstractC2713t abstractC2713t, AbstractC2701g abstractC2701g, C2707m c2707m) throws C2715v {
        AbstractC2713t abstractC2713tF = abstractC2713t.F();
        try {
            Z zD = V.a().d(abstractC2713tF);
            zD.g(abstractC2713tF, C2702h.N(abstractC2701g), c2707m);
            zD.b(abstractC2713tF);
            return abstractC2713tF;
        } catch (f0 e10) {
            throw e10.a().k(abstractC2713tF);
        } catch (C2715v e11) {
            e = e11;
            if (e.a()) {
                e = new C2715v(e);
            }
            throw e.k(abstractC2713tF);
        } catch (IOException e12) {
            if (e12.getCause() instanceof C2715v) {
                throw ((C2715v) e12.getCause());
            }
            throw new C2715v(e12).k(abstractC2713tF);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof C2715v) {
                throw ((C2715v) e13.getCause());
            }
            throw e13;
        }
    }

    public static void I(Class cls, AbstractC2713t abstractC2713t) {
        abstractC2713t.B();
        defaultInstanceMap.put(cls, abstractC2713t);
    }

    public static AbstractC2713t j(AbstractC2713t abstractC2713t) throws C2715v {
        if (abstractC2713t == null || abstractC2713t.isInitialized()) {
            return abstractC2713t;
        }
        throw abstractC2713t.f().a().k(abstractC2713t);
    }

    public static AbstractC2714u.b s() {
        return W.e();
    }

    public static AbstractC2713t t(Class cls) {
        AbstractC2713t abstractC2713t = defaultInstanceMap.get(cls);
        if (abstractC2713t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2713t = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC2713t != null) {
            return abstractC2713t;
        }
        AbstractC2713t defaultInstanceForType = ((AbstractC2713t) j0.i(cls)).getDefaultInstanceForType();
        if (defaultInstanceForType == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, defaultInstanceForType);
        return defaultInstanceForType;
    }

    public static Object x(Method method, Object obj, Object... objArr) {
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

    public static final boolean y(AbstractC2713t abstractC2713t, boolean z10) {
        byte bByteValue = ((Byte) abstractC2713t.p(e.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zC = V.a().d(abstractC2713t).c(abstractC2713t);
        if (z10) {
            abstractC2713t.q(e.SET_MEMOIZED_IS_INITIALIZED, zC ? abstractC2713t : null);
        }
        return zC;
    }

    public void A() {
        V.a().d(this).b(this);
        B();
    }

    public void B() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final a newBuilderForType() {
        return (a) p(e.NEW_BUILDER);
    }

    public AbstractC2713t F() {
        return (AbstractC2713t) p(e.NEW_MUTABLE_INSTANCE);
    }

    public void J(int i10) {
        this.memoizedHashCode = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public void a(AbstractC2703i abstractC2703i) {
        V.a().d(this).h(this, C2704j.P(abstractC2703i));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2695a
    public int c() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2695a
    public int d(Z z10) {
        if (!z()) {
            if (c() != Integer.MAX_VALUE) {
                return c();
            }
            int iN = n(z10);
            g(iN);
            return iN;
        }
        int iN2 = n(z10);
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
            return V.a().d(this).f(this, (AbstractC2713t) obj);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2695a
    public void g(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final T getParserForType() {
        return (T) p(e.GET_PARSER);
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public int getSerializedSize() {
        return d(null);
    }

    public int hashCode() {
        if (z()) {
            return m();
        }
        if (w()) {
            J(m());
        }
        return v();
    }

    public Object i() {
        return p(e.BUILD_MESSAGE_INFO);
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final boolean isInitialized() {
        return y(this, true);
    }

    public void k() {
        this.memoizedHashCode = 0;
    }

    public void l() {
        g(Integer.MAX_VALUE);
    }

    public int m() {
        return V.a().d(this).e(this);
    }

    public final int n(Z z10) {
        return z10 == null ? V.a().d(this).d(this) : z10.d(this);
    }

    public final a o() {
        return (a) p(e.NEW_BUILDER);
    }

    public Object p(e eVar) {
        return r(eVar, null, null);
    }

    public Object q(e eVar, Object obj) {
        return r(eVar, obj, null);
    }

    public abstract Object r(e eVar, Object obj, Object obj2);

    public String toString() {
        return M.f(this, super.toString());
    }

    @Override // androidx.datastore.preferences.protobuf.L
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final AbstractC2713t getDefaultInstanceForType() {
        return (AbstractC2713t) p(e.GET_DEFAULT_INSTANCE);
    }

    public int v() {
        return this.memoizedHashCode;
    }

    public boolean w() {
        return v() == 0;
    }

    public boolean z() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }
}
