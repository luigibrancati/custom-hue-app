package g0;

import f0.InterfaceC3983a;
import gc.AbstractC4189b;
import java.util.Iterator;

/* JADX INFO: renamed from: g0.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4060h extends AbstractC4189b implements InterfaceC3983a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4054b f34798a;

    public C4060h(C4054b c4054b) {
        this.f34798a = c4054b;
    }

    @Override // gc.AbstractC4189b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f34798a.containsValue(obj);
    }

    @Override // gc.AbstractC4189b
    public int d() {
        return this.f34798a.size();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C4061i(this.f34798a.n());
    }
}
