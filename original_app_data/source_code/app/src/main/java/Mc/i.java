package Mc;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i {
    public static final g a(g first, g second) {
        AbstractC4862t.e(first, "first");
        AbstractC4862t.e(second, "second");
        return first.isEmpty() ? second : second.isEmpty() ? first : new k(first, second);
    }
}
