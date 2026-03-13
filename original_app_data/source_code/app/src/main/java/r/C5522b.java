package r;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: r.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5522b implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f43485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f43486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakHashMap f43487c = new WeakHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43488d = 0;

    /* JADX INFO: renamed from: r.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends e {
        public a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // r.C5522b.e
        public c b(c cVar) {
            return cVar.f43492d;
        }

        @Override // r.C5522b.e
        public c c(c cVar) {
            return cVar.f43491c;
        }
    }

    /* JADX INFO: renamed from: r.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class C0584b extends e {
        public C0584b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // r.C5522b.e
        public c b(c cVar) {
            return cVar.f43491c;
        }

        @Override // r.C5522b.e
        public c c(c cVar) {
            return cVar.f43492d;
        }
    }

    /* JADX INFO: renamed from: r.b$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c implements Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f43489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f43490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f43491c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f43492d;

        public c(Object obj, Object obj2) {
            this.f43489a = obj;
            this.f43490b = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f43489a.equals(cVar.f43489a) && this.f43490b.equals(cVar.f43490b);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f43489a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f43490b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f43490b.hashCode() ^ this.f43489a.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f43489a + "=" + this.f43490b;
        }
    }

    /* JADX INFO: renamed from: r.b$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d extends f implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f43493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f43494b = true;

        public d() {
        }

        @Override // r.C5522b.f
        public void a(c cVar) {
            c cVar2 = this.f43493a;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f43492d;
                this.f43493a = cVar3;
                this.f43494b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (this.f43494b) {
                this.f43494b = false;
                this.f43493a = C5522b.this.f43485a;
            } else {
                c cVar = this.f43493a;
                this.f43493a = cVar != null ? cVar.f43491c : null;
            }
            return this.f43493a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f43494b) {
                return C5522b.this.f43485a != null;
            }
            c cVar = this.f43493a;
            return (cVar == null || cVar.f43491c == null) ? false : true;
        }
    }

    /* JADX INFO: renamed from: r.b$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class e extends f implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f43496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f43497b;

        public e(c cVar, c cVar2) {
            this.f43496a = cVar2;
            this.f43497b = cVar;
        }

        @Override // r.C5522b.f
        public void a(c cVar) {
            if (this.f43496a == cVar && cVar == this.f43497b) {
                this.f43497b = null;
                this.f43496a = null;
            }
            c cVar2 = this.f43496a;
            if (cVar2 == cVar) {
                this.f43496a = b(cVar2);
            }
            if (this.f43497b == cVar) {
                this.f43497b = e();
            }
        }

        public abstract c b(c cVar);

        public abstract c c(c cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f43497b;
            this.f43497b = e();
            return cVar;
        }

        public final c e() {
            c cVar = this.f43497b;
            c cVar2 = this.f43496a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f43497b != null;
        }
    }

    /* JADX INFO: renamed from: r.b$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class f {
        public abstract void a(c cVar);
    }

    public Map.Entry c() {
        return this.f43485a;
    }

    public c d(Object obj) {
        c cVar = this.f43485a;
        while (cVar != null && !cVar.f43489a.equals(obj)) {
            cVar = cVar.f43491c;
        }
        return cVar;
    }

    public Iterator descendingIterator() {
        C0584b c0584b = new C0584b(this.f43486b, this.f43485a);
        this.f43487c.put(c0584b, Boolean.FALSE);
        return c0584b;
    }

    public d e() {
        d dVar = new d();
        this.f43487c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5522b)) {
            return false;
        }
        C5522b c5522b = (C5522b) obj;
        if (size() != c5522b.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c5522b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public Map.Entry f() {
        return this.f43486b;
    }

    public c h(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f43488d++;
        c cVar2 = this.f43486b;
        if (cVar2 == null) {
            this.f43485a = cVar;
            this.f43486b = cVar;
            return cVar;
        }
        cVar2.f43491c = cVar;
        cVar.f43492d = cVar2;
        this.f43486b = cVar;
        return cVar;
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f43485a, this.f43486b);
        this.f43487c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public Object k(Object obj, Object obj2) {
        c cVarD = d(obj);
        if (cVarD != null) {
            return cVarD.f43490b;
        }
        h(obj, obj2);
        return null;
    }

    public Object l(Object obj) {
        c cVarD = d(obj);
        if (cVarD == null) {
            return null;
        }
        this.f43488d--;
        if (!this.f43487c.isEmpty()) {
            Iterator it = this.f43487c.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(cVarD);
            }
        }
        c cVar = cVarD.f43492d;
        if (cVar != null) {
            cVar.f43491c = cVarD.f43491c;
        } else {
            this.f43485a = cVarD.f43491c;
        }
        c cVar2 = cVarD.f43491c;
        if (cVar2 != null) {
            cVar2.f43492d = cVar;
        } else {
            this.f43486b = cVar;
        }
        cVarD.f43491c = null;
        cVarD.f43492d = null;
        return cVarD.f43490b;
    }

    public int size() {
        return this.f43488d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb2.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
