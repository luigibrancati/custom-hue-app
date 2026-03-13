package ee;

import gc.C4206t;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface e {
    default boolean b() {
        return false;
    }

    int c(String str);

    int d();

    String e(int i10);

    k f();

    List g(int i10);

    default List getAnnotations() {
        return C4206t.k();
    }

    e h(int i10);

    String i();

    default boolean isInline() {
        return false;
    }

    boolean j(int i10);
}
