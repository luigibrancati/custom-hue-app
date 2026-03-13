package gc;

import java.util.AbstractCollection;
import java.util.Collection;
import wc.InterfaceC6185b;

/* JADX INFO: renamed from: gc.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4194g extends AbstractCollection implements Collection, InterfaceC6185b {
    public abstract int c();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return c();
    }
}
