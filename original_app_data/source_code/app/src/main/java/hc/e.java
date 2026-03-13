package hc;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends AbstractC4296a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f36511a;

    public e(d backing) {
        AbstractC4862t.e(backing, "backing");
        this.f36511a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC4862t.e(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // gc.AbstractC4196i
    public int c() {
        return this.f36511a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f36511a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        AbstractC4862t.e(elements, "elements");
        return this.f36511a.o(elements);
    }

    @Override // hc.AbstractC4296a
    public boolean e(Map.Entry element) {
        AbstractC4862t.e(element, "element");
        return this.f36511a.p(element);
    }

    @Override // hc.AbstractC4296a
    public boolean f(Map.Entry element) {
        AbstractC4862t.e(element, "element");
        return this.f36511a.L(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry element) {
        AbstractC4862t.e(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f36511a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f36511a.t();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC4862t.e(elements, "elements");
        this.f36511a.m();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC4862t.e(elements, "elements");
        this.f36511a.m();
        return super.retainAll(elements);
    }
}
