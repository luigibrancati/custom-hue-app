package E6;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f3326a;

    public d(a aVar) {
        Objects.requireNonNull(aVar);
        this.f3326a = aVar;
    }

    @Override // E6.c
    public final void a(b bVar) {
        a aVar = this.f3326a;
        aVar.l(bVar);
        Iterator it = aVar.n().iterator();
        while (it.hasNext()) {
            ((i) it.next()).b(aVar.k());
        }
        aVar.n().clear();
        aVar.m(null);
    }
}
