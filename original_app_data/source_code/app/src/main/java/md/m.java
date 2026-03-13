package md;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class m extends AbstractList implements RandomAccess, n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f40353b = new m().u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f40354a;

    public m() {
        this.f40354a = new ArrayList();
    }

    public static AbstractC5050d d(Object obj) {
        return obj instanceof AbstractC5050d ? (AbstractC5050d) obj : obj instanceof String ? AbstractC5050d.k((String) obj) : AbstractC5050d.f((byte[]) obj);
    }

    public static String e(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC5050d ? ((AbstractC5050d) obj).A() : j.b((byte[]) obj);
    }

    @Override // md.n
    public void G(AbstractC5050d abstractC5050d) {
        this.f40354a.add(abstractC5050d);
        ((AbstractList) this).modCount++;
    }

    @Override // md.n
    public AbstractC5050d a0(int i10) {
        Object obj = this.f40354a.get(i10);
        AbstractC5050d abstractC5050dD = d(obj);
        if (abstractC5050dD != obj) {
            this.f40354a.set(i10, abstractC5050dD);
        }
        return abstractC5050dD;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        this.f40354a.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f40354a.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f40354a.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC5050d) {
            AbstractC5050d abstractC5050d = (AbstractC5050d) obj;
            String strA = abstractC5050d.A();
            if (abstractC5050d.s()) {
                this.f40354a.set(i10, strA);
            }
            return strA;
        }
        byte[] bArr = (byte[]) obj;
        String strB = j.b(bArr);
        if (j.a(bArr)) {
            this.f40354a.set(i10, strB);
        }
        return strB;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        Object objRemove = this.f40354a.remove(i10);
        ((AbstractList) this).modCount++;
        return e(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        return e(this.f40354a.set(i10, str));
    }

    @Override // md.n
    public List o() {
        return Collections.unmodifiableList(this.f40354a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f40354a.size();
    }

    @Override // md.n
    public n u() {
        return new w(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection collection) {
        if (collection instanceof n) {
            collection = ((n) collection).o();
        }
        boolean zAddAll = this.f40354a.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    public m(n nVar) {
        this.f40354a = new ArrayList(nVar.size());
        addAll(nVar);
    }
}
