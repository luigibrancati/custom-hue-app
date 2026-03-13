package cd;

import Mc.g;
import gc.C4206t;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: cd.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3099c implements Mc.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kd.c f26501a;

    public C3099c(kd.c fqNameToMatch) {
        AbstractC4862t.e(fqNameToMatch, "fqNameToMatch");
        this.f26501a = fqNameToMatch;
    }

    @Override // Mc.g
    public boolean K(kd.c cVar) {
        return g.b.b(this, cVar);
    }

    @Override // Mc.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C3098b j(kd.c fqName) {
        AbstractC4862t.e(fqName, "fqName");
        if (AbstractC4862t.a(fqName, this.f26501a)) {
            return C3098b.f26500a;
        }
        return null;
    }

    @Override // Mc.g
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return C4206t.k().iterator();
    }
}
