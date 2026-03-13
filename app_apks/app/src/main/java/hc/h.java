package hc;

import gc.AbstractC4196i;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6188e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends AbstractC4196i implements Set, Serializable, InterfaceC6188e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f36514b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f36515c = new h(d.f36489n.e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f36516a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public h(d backing) {
        AbstractC4862t.e(backing, "backing");
        this.f36516a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        return this.f36516a.i(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC4862t.e(elements, "elements");
        this.f36516a.m();
        return super.addAll(elements);
    }

    @Override // gc.AbstractC4196i
    public int c() {
        return this.f36516a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f36516a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f36516a.containsKey(obj);
    }

    public final Set d() {
        this.f36516a.l();
        return size() > 0 ? this : f36515c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f36516a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f36516a.D();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f36516a.O(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC4862t.e(elements, "elements");
        this.f36516a.m();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC4862t.e(elements, "elements");
        this.f36516a.m();
        return super.retainAll(elements);
    }

    public h() {
        this(new d());
    }
}
