package Mc;

import gc.C4206t;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6184a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface g extends Iterable, InterfaceC6184a {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final a f9435K = a.f9436a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f9436a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f9437b = new C0143a();

        /* JADX INFO: renamed from: Mc.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0143a implements g {
            @Override // Mc.g
            public boolean K(kd.c cVar) {
                return b.b(this, cVar);
            }

            public Void c(kd.c fqName) {
                AbstractC4862t.e(fqName, "fqName");
                return null;
            }

            @Override // Mc.g
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return C4206t.k().iterator();
            }

            @Override // Mc.g
            public /* bridge */ /* synthetic */ c j(kd.c cVar) {
                return (c) c(cVar);
            }

            public String toString() {
                return "EMPTY";
            }
        }

        public final g a(List annotations) {
            AbstractC4862t.e(annotations, "annotations");
            return annotations.isEmpty() ? f9437b : new h(annotations);
        }

        public final g b() {
            return f9437b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public static c a(g gVar, kd.c fqName) {
            Object next;
            AbstractC4862t.e(fqName, "fqName");
            Iterator it = gVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC4862t.a(((c) next).e(), fqName)) {
                    break;
                }
            }
            return (c) next;
        }

        public static boolean b(g gVar, kd.c fqName) {
            AbstractC4862t.e(fqName, "fqName");
            return gVar.j(fqName) != null;
        }
    }

    boolean K(kd.c cVar);

    boolean isEmpty();

    c j(kd.c cVar);
}
