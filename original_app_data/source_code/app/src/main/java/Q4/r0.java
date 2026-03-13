package Q4;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends AbstractC1902w {
    public r0() {
        super("Updates", new vc.l() { // from class: Q4.p0
            @Override // vc.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(r0.g((o0) obj));
            }
        }, new vc.l() { // from class: Q4.q0
            @Override // vc.l
            public final Object invoke(Object obj) {
                return r0.h(((Integer) obj).intValue());
            }
        });
    }

    public static final int g(o0 it) {
        AbstractC4862t.e(it, "it");
        return it.ordinal();
    }

    public static final o0 h(int i10) {
        for (o0 o0Var : o0.q()) {
            if (o0Var.ordinal() == i10) {
                return o0Var;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
