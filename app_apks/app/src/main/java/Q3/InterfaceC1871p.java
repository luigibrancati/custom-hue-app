package Q3;

import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Q3.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1871p {
    void a(C1870o c1870o);

    default C1870o b(C1877w id2) {
        AbstractC4862t.e(id2, "id");
        return c(id2.b(), id2.a());
    }

    C1870o c(String str, int i10);

    List d();

    void e(String str);
}
