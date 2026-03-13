package y1;

import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import y1.AbstractC6382a;

/* JADX INFO: renamed from: y1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6383b extends AbstractC6382a {
    public C6383b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // y1.AbstractC6382a
    public Object a(AbstractC6382a.c key) {
        AbstractC4862t.e(key, "key");
        return b().get(key);
    }

    public final void c(AbstractC6382a.c key, Object obj) {
        AbstractC4862t.e(key, "key");
        b().put(key, obj);
    }

    public C6383b(Map initialExtras) {
        AbstractC4862t.e(initialExtras, "initialExtras");
        b().putAll(initialExtras);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6383b(AbstractC6382a initialExtras) {
        this(initialExtras.b());
        AbstractC4862t.e(initialExtras, "initialExtras");
    }

    public /* synthetic */ C6383b(AbstractC6382a abstractC6382a, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? AbstractC6382a.b.f48335c : abstractC6382a);
    }
}
