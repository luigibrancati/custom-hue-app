package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Y implements B0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC3715f0 f32204b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3715f0 f32205a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements InterfaceC3715f0 {
        @Override // com.google.protobuf.InterfaceC3715f0
        public InterfaceC3713e0 a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.protobuf.InterfaceC3715f0
        public boolean b(Class cls) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32206a;

        static {
            int[] iArr = new int[v0.values().length];
            f32206a = iArr;
            try {
                iArr[v0.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c implements InterfaceC3715f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InterfaceC3715f0[] f32207a;

        public c(InterfaceC3715f0... interfaceC3715f0Arr) {
            this.f32207a = interfaceC3715f0Arr;
        }

        @Override // com.google.protobuf.InterfaceC3715f0
        public InterfaceC3713e0 a(Class cls) {
            for (InterfaceC3715f0 interfaceC3715f0 : this.f32207a) {
                if (interfaceC3715f0.b(cls)) {
                    return interfaceC3715f0.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.protobuf.InterfaceC3715f0
        public boolean b(Class cls) {
            for (InterfaceC3715f0 interfaceC3715f0 : this.f32207a) {
                if (interfaceC3715f0.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public Y() {
        this(c());
    }

    public static boolean b(InterfaceC3713e0 interfaceC3713e0) {
        return b.f32206a[interfaceC3713e0.c().ordinal()] != 1;
    }

    public static InterfaceC3715f0 c() {
        return new c(L.c(), d());
    }

    public static InterfaceC3715f0 d() {
        try {
            return (InterfaceC3715f0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f32204b;
        }
    }

    public static A0 e(Class cls, InterfaceC3713e0 interfaceC3713e0) {
        return GeneratedMessageLite.class.isAssignableFrom(cls) ? b(interfaceC3713e0) ? C3723j0.S(cls, interfaceC3713e0, AbstractC3735p0.b(), W.b(), C0.L(), G.b(), AbstractC3711d0.b()) : C3723j0.S(cls, interfaceC3713e0, AbstractC3735p0.b(), W.b(), C0.L(), null, AbstractC3711d0.b()) : b(interfaceC3713e0) ? C3723j0.S(cls, interfaceC3713e0, AbstractC3735p0.a(), W.a(), C0.K(), G.a(), AbstractC3711d0.a()) : C3723j0.S(cls, interfaceC3713e0, AbstractC3735p0.a(), W.a(), C0.K(), null, AbstractC3711d0.a());
    }

    @Override // com.google.protobuf.B0
    public A0 a(Class cls) {
        C0.H(cls);
        InterfaceC3713e0 interfaceC3713e0A = this.f32205a.a(cls);
        return interfaceC3713e0A.a() ? GeneratedMessageLite.class.isAssignableFrom(cls) ? C3725k0.l(C0.L(), G.b(), interfaceC3713e0A.b()) : C3725k0.l(C0.K(), G.a(), interfaceC3713e0A.b()) : e(cls, interfaceC3713e0A);
    }

    public Y(InterfaceC3715f0 interfaceC3715f0) {
        this.f32205a = (InterfaceC3715f0) N.b(interfaceC3715f0, "messageInfoFactory");
    }
}
