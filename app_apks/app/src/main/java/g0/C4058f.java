package g0;

import f0.InterfaceC3984b;
import gc.AbstractC4197j;
import java.util.Iterator;

/* JADX INFO: renamed from: g0.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4058f extends AbstractC4197j implements InterfaceC3984b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4054b f34797b;

    public C4058f(C4054b c4054b) {
        this.f34797b = c4054b;
    }

    @Override // gc.AbstractC4189b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f34797b.containsKey(obj);
    }

    @Override // gc.AbstractC4189b
    public int d() {
        return this.f34797b.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C4059g(this.f34797b.n());
    }
}
