package g4;

import g4.o;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4.c f35469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f35470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f35471c;

    public m(a4.c referenceCounter, t strongMemoryCache, x weakMemoryCache) {
        AbstractC4862t.e(referenceCounter, "referenceCounter");
        AbstractC4862t.e(strongMemoryCache, "strongMemoryCache");
        AbstractC4862t.e(weakMemoryCache, "weakMemoryCache");
        this.f35469a = referenceCounter;
        this.f35470b = strongMemoryCache;
        this.f35471c = weakMemoryCache;
    }

    public final o.a a(l lVar) {
        if (lVar == null) {
            return null;
        }
        o.a aVarB = this.f35470b.b(lVar);
        if (aVarB == null) {
            aVarB = this.f35471c.b(lVar);
        }
        if (aVarB != null) {
            this.f35469a.c(aVarB.getBitmap());
        }
        return aVarB;
    }
}
