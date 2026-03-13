package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class I implements g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final P f31392b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f31393a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements P {
        @Override // com.google.crypto.tink.shaded.protobuf.P
        public O a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.P
        public boolean b(Class cls) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31394a;

        static {
            int[] iArr = new int[a0.values().length];
            f31394a = iArr;
            try {
                iArr[a0.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c implements P {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public P[] f31395a;

        public c(P... pArr) {
            this.f31395a = pArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.P
        public O a(Class cls) {
            for (P p10 : this.f31395a) {
                if (p10.b(cls)) {
                    return p10.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.P
        public boolean b(Class cls) {
            for (P p10 : this.f31395a) {
                if (p10.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public I() {
        this(c());
    }

    public static boolean b(O o10) {
        return b.f31394a[o10.c().ordinal()] != 1;
    }

    public static P c() {
        return new c(C3675w.c(), d());
    }

    public static P d() {
        if (b0.f31427d) {
            return f31392b;
        }
        try {
            return (P) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f31392b;
        }
    }

    public static f0 e(Class cls, O o10) {
        if (f(cls)) {
            return U.Q(cls, o10, Y.b(), G.b(), h0.M(), b(o10) ? AbstractC3671s.b() : null, N.b());
        }
        W wA = Y.a();
        AbstractC3670q abstractC3670qA = null;
        E eA = G.a();
        m0 m0VarL = h0.L();
        if (b(o10)) {
            abstractC3670qA = AbstractC3671s.a();
        }
        return U.Q(cls, o10, wA, eA, m0VarL, abstractC3670qA, N.a());
    }

    public static boolean f(Class cls) {
        return b0.f31427d || AbstractC3676x.class.isAssignableFrom(cls);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public f0 a(Class cls) {
        h0.I(cls);
        O oA = this.f31393a.a(cls);
        return oA.a() ? f(cls) ? V.l(h0.M(), AbstractC3671s.b(), oA.b()) : V.l(h0.L(), AbstractC3671s.a(), oA.b()) : e(cls, oA);
    }

    public I(P p10) {
        this.f31393a = (P) AbstractC3678z.b(p10, "messageInfoFactory");
    }
}
