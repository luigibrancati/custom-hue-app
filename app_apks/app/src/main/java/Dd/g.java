package Dd;

import Cd.AbstractC0725h;
import Cd.E;
import Cd.e0;
import Lc.G;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1185m;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g extends AbstractC0725h {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2666a = new a();

        @Override // Dd.g
        public InterfaceC1177e b(kd.b classId) {
            AbstractC4862t.e(classId, "classId");
            return null;
        }

        @Override // Dd.g
        public InterfaceC6099h c(InterfaceC1177e classDescriptor, InterfaceC6082a compute) {
            AbstractC4862t.e(classDescriptor, "classDescriptor");
            AbstractC4862t.e(compute, "compute");
            return (InterfaceC6099h) compute.invoke();
        }

        @Override // Dd.g
        public boolean d(G moduleDescriptor) {
            AbstractC4862t.e(moduleDescriptor, "moduleDescriptor");
            return false;
        }

        @Override // Dd.g
        public boolean e(e0 typeConstructor) {
            AbstractC4862t.e(typeConstructor, "typeConstructor");
            return false;
        }

        @Override // Dd.g
        public Collection g(InterfaceC1177e classDescriptor) {
            AbstractC4862t.e(classDescriptor, "classDescriptor");
            Collection collectionO = classDescriptor.k().o();
            AbstractC4862t.d(collectionO, "classDescriptor.typeConstructor.supertypes");
            return collectionO;
        }

        @Override // Cd.AbstractC0725h
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public E a(Gd.i type) {
            AbstractC4862t.e(type, "type");
            return (E) type;
        }

        @Override // Dd.g
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public InterfaceC1177e f(InterfaceC1185m descriptor) {
            AbstractC4862t.e(descriptor, "descriptor");
            return null;
        }
    }

    public abstract InterfaceC1177e b(kd.b bVar);

    public abstract InterfaceC6099h c(InterfaceC1177e interfaceC1177e, InterfaceC6082a interfaceC6082a);

    public abstract boolean d(G g10);

    public abstract boolean e(e0 e0Var);

    public abstract InterfaceC1180h f(InterfaceC1185m interfaceC1185m);

    public abstract Collection g(InterfaceC1177e interfaceC1177e);

    /* JADX INFO: renamed from: h */
    public abstract E a(Gd.i iVar);
}
