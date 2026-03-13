package yd;

import Lc.InterfaceC1174b;
import Lc.InterfaceC1177e;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f48611a = new a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements r {
        public static /* synthetic */ void c(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i10 != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // yd.r
        public void a(InterfaceC1177e interfaceC1177e, List list) {
            if (interfaceC1177e == null) {
                c(0);
            }
            if (list == null) {
                c(1);
            }
        }

        @Override // yd.r
        public void b(InterfaceC1174b interfaceC1174b) {
            if (interfaceC1174b == null) {
                c(2);
            }
        }
    }

    void a(InterfaceC1177e interfaceC1177e, List list);

    void b(InterfaceC1174b interfaceC1174b);
}
