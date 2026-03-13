package Ic;

import Lc.G;
import Lc.L;
import fc.C4029l;
import fc.EnumC4031n;
import fc.InterfaceC4028k;
import gc.C4179C;
import java.util.ServiceLoader;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0096a f5679a = C0096a.f5680a;

    /* JADX INFO: renamed from: Ic.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0096a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ C0096a f5680a = new C0096a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final InterfaceC4028k f5681b = C4029l.a(EnumC4031n.PUBLICATION, C0097a.f5682a);

        /* JADX INFO: renamed from: Ic.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0097a extends v implements InterfaceC6082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0097a f5682a = new C0097a();

            public C0097a() {
                super(0);
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a invoke() {
                ServiceLoader implementations = ServiceLoader.load(a.class, a.class.getClassLoader());
                AbstractC4862t.d(implementations, "implementations");
                a aVar = (a) C4179C.i0(implementations);
                if (aVar != null) {
                    return aVar;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }
        }

        public final a a() {
            return (a) f5681b.getValue();
        }
    }

    L a(Bd.n nVar, G g10, Iterable iterable, Nc.c cVar, Nc.a aVar, boolean z10);
}
