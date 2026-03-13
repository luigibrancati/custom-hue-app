package Q4;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends AbstractC1902w {
    public j0() {
        super("TaskStatus", new vc.l() { // from class: Q4.h0
            @Override // vc.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(j0.g((g0) obj));
            }
        }, new vc.l() { // from class: Q4.i0
            @Override // vc.l
            public final Object invoke(Object obj) {
                return j0.h(((Integer) obj).intValue());
            }
        });
    }

    public static final int g(g0 it) {
        AbstractC4862t.e(it, "it");
        return it.ordinal();
    }

    public static final g0 h(int i10) {
        for (g0 g0Var : g0.q()) {
            if (g0Var.ordinal() == i10) {
                return g0Var;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
