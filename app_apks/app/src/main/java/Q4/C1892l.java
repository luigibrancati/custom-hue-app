package Q4;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Q4.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1892l extends AbstractC1902w {
    public C1892l() {
        super("BaseDirectory", new vc.l() { // from class: Q4.j
            @Override // vc.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(C1892l.g((EnumC1889i) obj));
            }
        }, new vc.l() { // from class: Q4.k
            @Override // vc.l
            public final Object invoke(Object obj) {
                return C1892l.h(((Integer) obj).intValue());
            }
        });
    }

    public static final int g(EnumC1889i it) {
        AbstractC4862t.e(it, "it");
        return it.ordinal();
    }

    public static final EnumC1889i h(int i10) {
        for (EnumC1889i enumC1889i : EnumC1889i.q()) {
            if (enumC1889i.ordinal() == i10) {
                return enumC1889i;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
