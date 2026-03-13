package w9;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class z extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Comparator f46441i = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator f46442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f46443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f46444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f46447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f46448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f46449h;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends AbstractSet {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a extends d {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                return a();
            }
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            z.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && z.this.c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e eVarC;
            if (!(obj instanceof Map.Entry) || (eVarC = z.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            z.this.f(eVarC, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return z.this.f46445d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class c extends AbstractSet {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a extends d {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return a().f46463f;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            z.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return z.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return z.this.g(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return z.this.f46445d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public abstract class d implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f46454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e f46455b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f46456c;

        public d() {
            this.f46454a = z.this.f46447f.f46461d;
            this.f46456c = z.this.f46446e;
        }

        public final e a() {
            e eVar = this.f46454a;
            z zVar = z.this;
            if (eVar == zVar.f46447f) {
                throw new NoSuchElementException();
            }
            if (zVar.f46446e != this.f46456c) {
                throw new ConcurrentModificationException();
            }
            this.f46454a = eVar.f46461d;
            this.f46455b = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f46454a != z.this.f46447f;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e eVar = this.f46455b;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            z.this.f(eVar, true);
            this.f46455b = null;
            this.f46456c = z.this.f46446e;
        }
    }

    public z() {
        this(f46441i, true);
    }

    public static boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public e b(Object obj, boolean z10) {
        int iCompareTo;
        e eVar;
        Comparator comparator = this.f46442a;
        e eVar2 = this.f46444c;
        if (eVar2 != null) {
            Comparable comparable = comparator == f46441i ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(eVar2.f46463f) : comparator.compare(obj, eVar2.f46463f);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e eVar3 = iCompareTo < 0 ? eVar2.f46459b : eVar2.f46460c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        e eVar4 = eVar2;
        if (!z10) {
            return null;
        }
        e eVar5 = this.f46447f;
        if (eVar4 != null) {
            eVar = new e(this.f46443b, eVar4, obj, eVar5, eVar5.f46462e);
            if (iCompareTo < 0) {
                eVar4.f46459b = eVar;
            } else {
                eVar4.f46460c = eVar;
            }
            e(eVar4, true);
        } else {
            if (comparator == f46441i && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
            }
            eVar = new e(this.f46443b, eVar4, obj, eVar5, eVar5.f46462e);
            this.f46444c = eVar;
        }
        this.f46445d++;
        this.f46446e++;
        return eVar;
    }

    public e c(Map.Entry entry) {
        e eVarD = d(entry.getKey());
        if (eVarD == null || !a(eVarD.f46465h, entry.getValue())) {
            return null;
        }
        return eVarD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f46444c = null;
        this.f46445d = 0;
        this.f46446e++;
        e eVar = this.f46447f;
        eVar.f46462e = eVar;
        eVar.f46461d = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    public e d(Object obj) {
        if (obj != null) {
            try {
                return b(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public final void e(e eVar, boolean z10) {
        while (eVar != null) {
            e eVar2 = eVar.f46459b;
            e eVar3 = eVar.f46460c;
            int i10 = eVar2 != null ? eVar2.f46466i : 0;
            int i11 = eVar3 != null ? eVar3.f46466i : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                e eVar4 = eVar3.f46459b;
                e eVar5 = eVar3.f46460c;
                int i13 = (eVar4 != null ? eVar4.f46466i : 0) - (eVar5 != null ? eVar5.f46466i : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    i(eVar);
                } else {
                    j(eVar3);
                    i(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                e eVar6 = eVar2.f46459b;
                e eVar7 = eVar2.f46460c;
                int i14 = (eVar6 != null ? eVar6.f46466i : 0) - (eVar7 != null ? eVar7.f46466i : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    j(eVar);
                } else {
                    i(eVar2);
                    j(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                eVar.f46466i = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f46466i = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f46458a;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        b bVar = this.f46448g;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.f46448g = bVar2;
        return bVar2;
    }

    public void f(e eVar, boolean z10) {
        int i10;
        if (z10) {
            e eVar2 = eVar.f46462e;
            eVar2.f46461d = eVar.f46461d;
            eVar.f46461d.f46462e = eVar2;
        }
        e eVar3 = eVar.f46459b;
        e eVar4 = eVar.f46460c;
        e eVar5 = eVar.f46458a;
        int i11 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                h(eVar, eVar3);
                eVar.f46459b = null;
            } else if (eVar4 != null) {
                h(eVar, eVar4);
                eVar.f46460c = null;
            } else {
                h(eVar, null);
            }
            e(eVar5, false);
            this.f46445d--;
            this.f46446e++;
            return;
        }
        e eVarB = eVar3.f46466i > eVar4.f46466i ? eVar3.b() : eVar4.a();
        f(eVarB, false);
        e eVar6 = eVar.f46459b;
        if (eVar6 != null) {
            i10 = eVar6.f46466i;
            eVarB.f46459b = eVar6;
            eVar6.f46458a = eVarB;
            eVar.f46459b = null;
        } else {
            i10 = 0;
        }
        e eVar7 = eVar.f46460c;
        if (eVar7 != null) {
            i11 = eVar7.f46466i;
            eVarB.f46460c = eVar7;
            eVar7.f46458a = eVarB;
            eVar.f46460c = null;
        }
        eVarB.f46466i = Math.max(i10, i11) + 1;
        h(eVar, eVarB);
    }

    public e g(Object obj) {
        e eVarD = d(obj);
        if (eVarD != null) {
            f(eVarD, true);
        }
        return eVarD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        e eVarD = d(obj);
        if (eVarD != null) {
            return eVarD.f46465h;
        }
        return null;
    }

    public final void h(e eVar, e eVar2) {
        e eVar3 = eVar.f46458a;
        eVar.f46458a = null;
        if (eVar2 != null) {
            eVar2.f46458a = eVar3;
        }
        if (eVar3 == null) {
            this.f46444c = eVar2;
        } else if (eVar3.f46459b == eVar) {
            eVar3.f46459b = eVar2;
        } else {
            eVar3.f46460c = eVar2;
        }
    }

    public final void i(e eVar) {
        e eVar2 = eVar.f46459b;
        e eVar3 = eVar.f46460c;
        e eVar4 = eVar3.f46459b;
        e eVar5 = eVar3.f46460c;
        eVar.f46460c = eVar4;
        if (eVar4 != null) {
            eVar4.f46458a = eVar;
        }
        h(eVar, eVar3);
        eVar3.f46459b = eVar;
        eVar.f46458a = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.f46466i : 0, eVar4 != null ? eVar4.f46466i : 0) + 1;
        eVar.f46466i = iMax;
        eVar3.f46466i = Math.max(iMax, eVar5 != null ? eVar5.f46466i : 0) + 1;
    }

    public final void j(e eVar) {
        e eVar2 = eVar.f46459b;
        e eVar3 = eVar.f46460c;
        e eVar4 = eVar2.f46459b;
        e eVar5 = eVar2.f46460c;
        eVar.f46459b = eVar5;
        if (eVar5 != null) {
            eVar5.f46458a = eVar;
        }
        h(eVar, eVar2);
        eVar2.f46460c = eVar;
        eVar.f46458a = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.f46466i : 0, eVar5 != null ? eVar5.f46466i : 0) + 1;
        eVar.f46466i = iMax;
        eVar2.f46466i = Math.max(iMax, eVar4 != null ? eVar4.f46466i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        c cVar = this.f46449h;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f46449h = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f46443b) {
            throw new NullPointerException("value == null");
        }
        e eVarB = b(obj, true);
        Object obj3 = eVarB.f46465h;
        eVarB.f46465h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        e eVarG = g(obj);
        if (eVarG != null) {
            return eVarG.f46465h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f46445d;
    }

    public z(boolean z10) {
        this(f46441i, z10);
    }

    public z(Comparator comparator, boolean z10) {
        this.f46445d = 0;
        this.f46446e = 0;
        this.f46442a = comparator == null ? f46441i : comparator;
        this.f46443b = z10;
        this.f46447f = new e(z10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e implements Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f46458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e f46459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e f46460c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public e f46461d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public e f46462e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Object f46463f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f46464g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Object f46465h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f46466i;

        public e(boolean z10) {
            this.f46463f = null;
            this.f46464g = z10;
            this.f46462e = this;
            this.f46461d = this;
        }

        public e a() {
            e eVar = this.f46459b;
            while (true) {
                e eVar2 = eVar;
                e eVar3 = this;
                this = eVar2;
                if (this == null) {
                    return eVar3;
                }
                eVar = this.f46459b;
            }
        }

        public e b() {
            e eVar = this.f46460c;
            while (true) {
                e eVar2 = eVar;
                e eVar3 = this;
                this = eVar2;
                if (this == null) {
                    return eVar3;
                }
                eVar = this.f46460c;
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = this.f46463f;
                if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                    Object obj3 = this.f46465h;
                    if (obj3 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (obj3.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f46463f;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f46465h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f46463f;
            int iHashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.f46465h;
            return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj == null && !this.f46464g) {
                throw new NullPointerException("value == null");
            }
            Object obj2 = this.f46465h;
            this.f46465h = obj;
            return obj2;
        }

        public String toString() {
            return this.f46463f + "=" + this.f46465h;
        }

        public e(boolean z10, e eVar, Object obj, e eVar2, e eVar3) {
            this.f46458a = eVar;
            this.f46463f = obj;
            this.f46464g = z10;
            this.f46466i = 1;
            this.f46461d = eVar2;
            this.f46462e = eVar3;
            eVar3.f46461d = this;
            eVar2.f46462e = this;
        }
    }
}
