package I3;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: I3.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0883m {
    public abstract AbstractC0882l a(String str);

    public final AbstractC0882l b(String className) {
        AbstractC4862t.e(className, "className");
        AbstractC0882l abstractC0882lA = a(className);
        return abstractC0882lA == null ? AbstractC0884n.a(className) : abstractC0882lA;
    }
}
