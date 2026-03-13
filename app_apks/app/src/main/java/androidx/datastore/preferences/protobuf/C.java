package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C implements a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final J f22714b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f22715a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements J {
        @Override // androidx.datastore.preferences.protobuf.J
        public I a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.J
        public boolean b(Class cls) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22716a;

        static {
            int[] iArr = new int[U.values().length];
            f22716a = iArr;
            try {
                iArr[U.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c implements J {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public J[] f22717a;

        public c(J... jArr) {
            this.f22717a = jArr;
        }

        @Override // androidx.datastore.preferences.protobuf.J
        public I a(Class cls) {
            for (J j10 : this.f22717a) {
                if (j10.b(cls)) {
                    return j10.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // androidx.datastore.preferences.protobuf.J
        public boolean b(Class cls) {
            for (J j10 : this.f22717a) {
                if (j10.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C() {
        this(c());
    }

    public static boolean b(I i10) {
        return b.f22716a[i10.c().ordinal()] != 1;
    }

    public static J c() {
        return new c(C2712s.c(), d());
    }

    public static J d() {
        if (V.f22756d) {
            return f22714b;
        }
        try {
            return (J) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f22714b;
        }
    }

    public static Z e(Class cls, I i10) {
        if (f(cls)) {
            return N.M(cls, i10, S.b(), B.b(), b0.K(), b(i10) ? AbstractC2710p.b() : null, H.b());
        }
        P pA = S.a();
        AbstractC2708n abstractC2708nA = null;
        InterfaceC2719z interfaceC2719zA = B.a();
        g0 g0VarJ = b0.J();
        if (b(i10)) {
            abstractC2708nA = AbstractC2710p.a();
        }
        return N.M(cls, i10, pA, interfaceC2719zA, g0VarJ, abstractC2708nA, H.a());
    }

    public static boolean f(Class cls) {
        return V.f22756d || AbstractC2713t.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public Z a(Class cls) {
        b0.G(cls);
        I iA = this.f22715a.a(cls);
        return iA.a() ? f(cls) ? O.k(b0.K(), AbstractC2710p.b(), iA.b()) : O.k(b0.J(), AbstractC2710p.a(), iA.b()) : e(cls, iA);
    }

    public C(J j10) {
        this.f22715a = (J) AbstractC2714u.b(j10, "messageInfoFactory");
    }
}
