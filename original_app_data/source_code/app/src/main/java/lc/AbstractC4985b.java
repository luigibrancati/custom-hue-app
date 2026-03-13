package lc;

import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4992i;
import vc.l;

/* JADX INFO: renamed from: lc.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4985b implements InterfaceC4992i.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f40082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4992i.c f40083b;

    public AbstractC4985b(InterfaceC4992i.c baseKey, l safeCast) {
        AbstractC4862t.e(baseKey, "baseKey");
        AbstractC4862t.e(safeCast, "safeCast");
        this.f40082a = safeCast;
        this.f40083b = baseKey instanceof AbstractC4985b ? ((AbstractC4985b) baseKey).f40083b : baseKey;
    }

    public final boolean a(InterfaceC4992i.c key) {
        AbstractC4862t.e(key, "key");
        return key == this || this.f40083b == key;
    }

    public final InterfaceC4992i.b b(InterfaceC4992i.b element) {
        AbstractC4862t.e(element, "element");
        return (InterfaceC4992i.b) this.f40082a.invoke(element);
    }
}
