package androidx.lifecycle;

import android.view.View;
import kotlin.jvm.internal.AbstractC4862t;
import x1.AbstractC6290a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class S {
    public static final InterfaceC2758n a(View view) {
        AbstractC4862t.e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(AbstractC6290a.f47337a);
            InterfaceC2758n interfaceC2758n = tag instanceof InterfaceC2758n ? (InterfaceC2758n) tag : null;
            if (interfaceC2758n != null) {
                return interfaceC2758n;
            }
            Object objA = b1.b.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    public static final void b(View view, InterfaceC2758n interfaceC2758n) {
        AbstractC4862t.e(view, "<this>");
        view.setTag(AbstractC6290a.f47337a, interfaceC2758n);
    }
}
