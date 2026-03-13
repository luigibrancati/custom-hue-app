package d0;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final Object a(f fVar, AbstractC3805a abstractC3805a) {
        AbstractC4862t.c(abstractC3805a, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Object objA = fVar.get(abstractC3805a);
        if (objA == null) {
            objA = abstractC3805a.a();
        }
        return ((i) objA).a(fVar);
    }
}
