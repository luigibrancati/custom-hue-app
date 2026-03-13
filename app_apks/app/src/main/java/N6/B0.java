package N6;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class B0 extends S0 {
    public B0(Iterator it) {
        super(it);
    }

    @Override // N6.S0
    public final /* synthetic */ Object a(Object obj) {
        return ((Map.Entry) obj).getValue();
    }
}
