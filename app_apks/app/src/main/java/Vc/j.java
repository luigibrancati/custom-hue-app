package Vc;

import Cd.E;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1177e;
import bd.r;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f17501a = new a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements j {
        public static /* synthetic */ void c(int i10) {
            Object[] objArr = new Object[3];
            switch (i10) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i10 == 5 || i10 == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Vc.j
        public void a(InterfaceC1174b interfaceC1174b, List list) {
            if (interfaceC1174b == null) {
                c(5);
            }
            if (list == null) {
                c(6);
            }
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // Vc.j
        public b b(r rVar, InterfaceC1177e interfaceC1177e, E e10, E e11, List list, List list2) {
            if (rVar == null) {
                c(0);
            }
            if (interfaceC1177e == null) {
                c(1);
            }
            if (e10 == null) {
                c(2);
            }
            if (list == null) {
                c(3);
            }
            if (list2 == null) {
                c(4);
            }
            return new b(e10, e11, list, list2, Collections.EMPTY_LIST, false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final E f17502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final E f17503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f17504c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f17505d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f17506e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f17507f;

        public b(E e10, E e11, List list, List list2, List list3, boolean z10) {
            if (e10 == null) {
                a(0);
            }
            if (list == null) {
                a(1);
            }
            if (list2 == null) {
                a(2);
            }
            if (list3 == null) {
                a(3);
            }
            this.f17502a = e10;
            this.f17503b = e11;
            this.f17504c = list;
            this.f17505d = list2;
            this.f17506e = list3;
            this.f17507f = z10;
        }

        public static /* synthetic */ void a(int i10) {
            String str = (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
            switch (i10) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i10 == 4) {
                objArr[1] = "getReturnType";
            } else if (i10 == 5) {
                objArr[1] = "getValueParameters";
            } else if (i10 == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i10 != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public List b() {
            List list = this.f17506e;
            if (list == null) {
                a(7);
            }
            return list;
        }

        public E c() {
            return this.f17503b;
        }

        public E d() {
            E e10 = this.f17502a;
            if (e10 == null) {
                a(4);
            }
            return e10;
        }

        public List e() {
            List list = this.f17505d;
            if (list == null) {
                a(6);
            }
            return list;
        }

        public List f() {
            List list = this.f17504c;
            if (list == null) {
                a(5);
            }
            return list;
        }

        public boolean g() {
            return this.f17507f;
        }
    }

    void a(InterfaceC1174b interfaceC1174b, List list);

    b b(r rVar, InterfaceC1177e interfaceC1177e, E e10, E e11, List list, List list2);
}
