package nd;

import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1185m;
import Lc.K;
import Lc.f0;
import gc.z;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4862t;
import od.AbstractC5283e;

/* JADX INFO: renamed from: nd.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC5163b {

    /* JADX INFO: renamed from: nd.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements InterfaceC5163b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40774a = new a();

        @Override // nd.InterfaceC5163b
        public String a(InterfaceC1180h classifier, AbstractC5164c renderer) {
            AbstractC4862t.e(classifier, "classifier");
            AbstractC4862t.e(renderer, "renderer");
            if (classifier instanceof f0) {
                kd.f name = ((f0) classifier).getName();
                AbstractC4862t.d(name, "classifier.name");
                return renderer.v(name, false);
            }
            kd.d dVarM = AbstractC5283e.m(classifier);
            AbstractC4862t.d(dVarM, "getFqName(classifier)");
            return renderer.u(dVarM);
        }
    }

    /* JADX INFO: renamed from: nd.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0539b implements InterfaceC5163b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0539b f40775a = new C0539b();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [Lc.h, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v1, types: [Lc.I, Lc.m] */
        /* JADX WARN: Type inference failed for: r1v2, types: [Lc.m] */
        @Override // nd.InterfaceC5163b
        public String a(InterfaceC1180h classifier, AbstractC5164c renderer) {
            AbstractC4862t.e(classifier, "classifier");
            AbstractC4862t.e(renderer, "renderer");
            if (classifier instanceof f0) {
                kd.f name = ((f0) classifier).getName();
                AbstractC4862t.d(name, "classifier.name");
                return renderer.v(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(classifier.getName());
                classifier = classifier.b();
            } while (classifier instanceof InterfaceC1177e);
            return AbstractC5175n.c(z.R(arrayList));
        }
    }

    /* JADX INFO: renamed from: nd.b$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements InterfaceC5163b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f40776a = new c();

        @Override // nd.InterfaceC5163b
        public String a(InterfaceC1180h classifier, AbstractC5164c renderer) {
            AbstractC4862t.e(classifier, "classifier");
            AbstractC4862t.e(renderer, "renderer");
            return b(classifier);
        }

        public final String b(InterfaceC1180h interfaceC1180h) {
            kd.f name = interfaceC1180h.getName();
            AbstractC4862t.d(name, "descriptor.name");
            String strB = AbstractC5175n.b(name);
            if (interfaceC1180h instanceof f0) {
                return strB;
            }
            InterfaceC1185m interfaceC1185mB = interfaceC1180h.b();
            AbstractC4862t.d(interfaceC1185mB, "descriptor.containingDeclaration");
            String strC = c(interfaceC1185mB);
            if (strC == null || AbstractC4862t.a(strC, "")) {
                return strB;
            }
            return strC + '.' + strB;
        }

        public final String c(InterfaceC1185m interfaceC1185m) {
            if (interfaceC1185m instanceof InterfaceC1177e) {
                return b((InterfaceC1180h) interfaceC1185m);
            }
            if (!(interfaceC1185m instanceof K)) {
                return null;
            }
            kd.d dVarJ = ((K) interfaceC1185m).e().j();
            AbstractC4862t.d(dVarJ, "descriptor.fqName.toUnsafe()");
            return AbstractC5175n.a(dVarJ);
        }
    }

    String a(InterfaceC1180h interfaceC1180h, AbstractC5164c abstractC5164c);
}
