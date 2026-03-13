package Vc;

import Lc.InterfaceC1177e;
import Lc.InterfaceC1184l;
import Lc.U;
import Lc.Z;
import bd.InterfaceC2915g;
import bd.InterfaceC2920l;
import bd.InterfaceC2922n;
import bd.q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f17494a = new a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements g {
        public static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            switch (i10) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i10) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Vc.g
        public void a(InterfaceC2920l interfaceC2920l, InterfaceC1184l interfaceC1184l) {
            if (interfaceC2920l == null) {
                f(3);
            }
            if (interfaceC1184l == null) {
                f(4);
            }
        }

        @Override // Vc.g
        public void b(InterfaceC2922n interfaceC2922n, U u10) {
            if (interfaceC2922n == null) {
                f(5);
            }
            if (u10 == null) {
                f(6);
            }
        }

        @Override // Vc.g
        public void c(InterfaceC2915g interfaceC2915g, InterfaceC1177e interfaceC1177e) {
            if (interfaceC2915g == null) {
                f(7);
            }
            if (interfaceC1177e == null) {
                f(8);
            }
        }

        @Override // Vc.g
        public void d(q qVar, Z z10) {
            if (qVar == null) {
                f(1);
            }
            if (z10 == null) {
                f(2);
            }
        }

        @Override // Vc.g
        public InterfaceC1177e e(kd.c cVar) {
            if (cVar != null) {
                return null;
            }
            f(0);
            return null;
        }
    }

    void a(InterfaceC2920l interfaceC2920l, InterfaceC1184l interfaceC1184l);

    void b(InterfaceC2922n interfaceC2922n, U u10);

    void c(InterfaceC2915g interfaceC2915g, InterfaceC1177e interfaceC1177e);

    void d(q qVar, Z z10);

    InterfaceC1177e e(kd.c cVar);
}
