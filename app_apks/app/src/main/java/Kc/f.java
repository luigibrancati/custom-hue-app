package Kc;

import Bd.m;
import Bd.n;
import Lc.G;
import Oc.x;
import gc.C4179C;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.v;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends Ic.g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ Cc.l[] f7824k = {M.g(new E(M.b(f.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f7825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InterfaceC6082a f7826i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Bd.i f7827j;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final G f7828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f7829b;

        public b(G ownerModuleDescriptor, boolean z10) {
            AbstractC4862t.e(ownerModuleDescriptor, "ownerModuleDescriptor");
            this.f7828a = ownerModuleDescriptor;
            this.f7829b = z10;
        }

        public final G a() {
            return this.f7828a;
        }

        public final boolean b() {
            return this.f7829b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7830a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.FROM_DEPENDENCIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.FROM_CLASS_LOADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.FALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7830a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f7832b;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends v implements InterfaceC6082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f f7833a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar) {
                super(0);
                this.f7833a = fVar;
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b invoke() {
                InterfaceC6082a interfaceC6082a = this.f7833a.f7826i;
                if (interfaceC6082a == null) {
                    throw new AssertionError("JvmBuiltins instance has not been initialized properly");
                }
                b bVar = (b) interfaceC6082a.invoke();
                this.f7833a.f7826i = null;
                return bVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(n nVar) {
            super(0);
            this.f7832b = nVar;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i invoke() {
            x builtInsModule = f.this.r();
            AbstractC4862t.d(builtInsModule, "builtInsModule");
            return new i(builtInsModule, this.f7832b, new a(f.this));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ G f7834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f7835b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(G g10, boolean z10) {
            super(0);
            this.f7834a = g10;
            this.f7835b = z10;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            return new b(this.f7834a, this.f7835b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(n storageManager, a kind) {
        super(storageManager);
        AbstractC4862t.e(storageManager, "storageManager");
        AbstractC4862t.e(kind, "kind");
        this.f7825h = kind;
        this.f7827j = storageManager.f(new d(storageManager));
        int i10 = c.f7830a[kind.ordinal()];
        if (i10 == 2) {
            f(false);
        } else {
            if (i10 != 3) {
                return;
            }
            f(true);
        }
    }

    @Override // Ic.g
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public List v() {
        Iterable iterableV = super.v();
        AbstractC4862t.d(iterableV, "super.getClassDescriptorFactories()");
        n storageManager = U();
        AbstractC4862t.d(storageManager, "storageManager");
        x builtInsModule = r();
        AbstractC4862t.d(builtInsModule, "builtInsModule");
        return C4179C.B0(iterableV, new Kc.e(storageManager, builtInsModule, null, 4, null));
    }

    public final i H0() {
        return (i) m.a(this.f7827j, this, f7824k[0]);
    }

    public final void I0(G moduleDescriptor, boolean z10) {
        AbstractC4862t.e(moduleDescriptor, "moduleDescriptor");
        J0(new e(moduleDescriptor, z10));
    }

    public final void J0(InterfaceC6082a computation) {
        AbstractC4862t.e(computation, "computation");
        this.f7826i = computation;
    }

    @Override // Ic.g
    public Nc.c M() {
        return H0();
    }

    @Override // Ic.g
    public Nc.a g() {
        return H0();
    }
}
