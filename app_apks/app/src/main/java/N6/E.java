package N6;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class E extends S implements InterfaceC1565z0 {
    public E(Map map) {
        super(map);
    }

    @Override // N6.InterfaceC1565z0
    public final List a(Object obj) {
        return (List) super.n(obj);
    }

    @Override // N6.S
    public final /* synthetic */ Collection i() {
        return Collections.EMPTY_LIST;
    }

    @Override // N6.S
    public final Collection j(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // N6.S
    public final Collection k(Object obj, Collection collection) {
        return p(obj, (List) collection, null);
    }

    public final List y(Object obj) {
        return (List) super.o(obj);
    }
}
