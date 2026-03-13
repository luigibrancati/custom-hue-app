package gc;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;
import wc.InterfaceC6184a;

/* JADX INFO: renamed from: gc.K, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4187K implements Iterable, InterfaceC6184a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC6082a f35584a;

    public C4187K(InterfaceC6082a iteratorFactory) {
        AbstractC4862t.e(iteratorFactory, "iteratorFactory");
        this.f35584a = iteratorFactory;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new L((Iterator) this.f35584a.invoke());
    }
}
