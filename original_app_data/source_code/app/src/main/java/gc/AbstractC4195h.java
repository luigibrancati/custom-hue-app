package gc;

import java.util.AbstractList;
import java.util.List;
import wc.InterfaceC6185b;

/* JADX INFO: renamed from: gc.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4195h extends AbstractList implements List, InterfaceC6185b {
    public abstract int c();

    public abstract Object d(int i10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i10) {
        return d(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return c();
    }
}
