package I3;

import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class J {
    public static final Object a(I i10, String label, InterfaceC6082a block) {
        AbstractC4862t.e(i10, "<this>");
        AbstractC4862t.e(label, "label");
        AbstractC4862t.e(block, "block");
        boolean zIsEnabled = i10.isEnabled();
        if (zIsEnabled) {
            try {
                i10.a(label);
            } catch (Throwable th) {
                kotlin.jvm.internal.r.b(1);
                if (zIsEnabled) {
                    i10.d();
                }
                kotlin.jvm.internal.r.a(1);
                throw th;
            }
        }
        Object objInvoke = block.invoke();
        kotlin.jvm.internal.r.b(1);
        if (zIsEnabled) {
            i10.d();
        }
        kotlin.jvm.internal.r.a(1);
        return objInvoke;
    }
}
