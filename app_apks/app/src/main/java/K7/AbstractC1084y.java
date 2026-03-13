package K7;

import K7.AbstractC1079t;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: K7.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1084y extends AbstractC1067g implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient AbstractC1083x f7732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f7733f;

    /* JADX INFO: renamed from: K7.y$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends Y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator f7734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f7735b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator f7736c = B.f();

        public a() {
            this.f7734a = AbstractC1084y.this.f7732e.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!this.f7736c.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f7734a.next();
                this.f7735b = entry.getKey();
                this.f7736c = ((AbstractC1079t) entry.getValue()).iterator();
            }
            Object obj = this.f7735b;
            Objects.requireNonNull(obj);
            return F.d(obj, this.f7736c.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7736c.hasNext() || this.f7734a.hasNext();
        }
    }

    /* JADX INFO: renamed from: K7.y$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends Y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterator f7738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Iterator f7739b = B.f();

        public b() {
            this.f7738a = AbstractC1084y.this.f7732e.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7739b.hasNext() || this.f7738a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f7739b.hasNext()) {
                this.f7739b = ((AbstractC1079t) this.f7738a.next()).iterator();
            }
            return this.f7739b.next();
        }
    }

    /* JADX INFO: renamed from: K7.y$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map f7741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Comparator f7742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Comparator f7743c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f7744d = 4;

        public AbstractC1084y a() {
            Map map = this.f7741a;
            if (map == null) {
                return C1082w.u();
            }
            Collection collectionEntrySet = map.entrySet();
            Comparator comparator = this.f7742b;
            if (comparator != null) {
                collectionEntrySet = M.b(comparator).e().c(collectionEntrySet);
            }
            return C1082w.s(collectionEntrySet, this.f7743c);
        }

        public Map b() {
            Map map = this.f7741a;
            if (map != null) {
                return map;
            }
            Map mapD = N.d();
            this.f7741a = mapD;
            return mapD;
        }

        public AbstractC1079t.b c(int i10) {
            return AbstractC1081v.s(i10);
        }

        public c d(Object obj, Object obj2) {
            AbstractC1069i.a(obj, obj2);
            AbstractC1079t.b bVarC = (AbstractC1079t.b) b().get(obj);
            if (bVarC == null) {
                bVarC = c(this.f7744d);
                b().put(obj, bVarC);
            }
            bVarC.a(obj2);
            return this;
        }
    }

    /* JADX INFO: renamed from: K7.y$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d extends AbstractC1079t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC1084y f7745b;

        public d(AbstractC1084y abstractC1084y) {
            this.f7745b = abstractC1084y;
        }

        @Override // K7.AbstractC1079t, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f7745b.c(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* JADX INFO: renamed from: l */
        public Y iterator() {
            return this.f7745b.i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f7745b.size();
        }
    }

    /* JADX INFO: renamed from: K7.y$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends AbstractC1079t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final transient AbstractC1084y f7746b;

        public e(AbstractC1084y abstractC1084y) {
            this.f7746b = abstractC1084y;
        }

        @Override // K7.AbstractC1079t, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f7746b.d(obj);
        }

        @Override // K7.AbstractC1079t
        public int d(Object[] objArr, int i10) {
            Y it = this.f7746b.f7732e.values().iterator();
            while (it.hasNext()) {
                i10 = ((AbstractC1079t) it.next()).d(objArr, i10);
            }
            return i10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* JADX INFO: renamed from: l */
        public Y iterator() {
            return this.f7746b.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f7746b.size();
        }
    }

    public AbstractC1084y(AbstractC1083x abstractC1083x, int i10) {
        this.f7732e = abstractC1083x;
        this.f7733f = i10;
    }

    @Override // K7.AbstractC1066f, K7.G
    public /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return super.c(obj, obj2);
    }

    @Override // K7.G
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // K7.AbstractC1066f
    public boolean d(Object obj) {
        return obj != null && super.d(obj);
    }

    @Override // K7.AbstractC1066f
    public Map e() {
        throw new AssertionError("should never be called");
    }

    @Override // K7.AbstractC1066f
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // K7.AbstractC1066f
    public Set g() {
        throw new AssertionError("unreachable");
    }

    @Override // K7.AbstractC1066f
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // K7.AbstractC1066f, K7.G
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC1083x b() {
        return this.f7732e;
    }

    @Override // K7.AbstractC1066f
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC1079t f() {
        return new d(this);
    }

    @Override // K7.AbstractC1066f
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC1079t h() {
        return new e(this);
    }

    @Override // K7.AbstractC1066f, K7.G
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public AbstractC1079t a() {
        return (AbstractC1079t) super.a();
    }

    @Override // K7.AbstractC1066f
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Y i() {
        return new a();
    }

    @Override // K7.AbstractC1066f, K7.G
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public AbstractC1085z keySet() {
        return this.f7732e.keySet();
    }

    @Override // K7.G
    public final boolean put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // K7.AbstractC1066f
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Y j() {
        return new b();
    }

    @Override // K7.AbstractC1066f, K7.G
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public AbstractC1079t values() {
        return (AbstractC1079t) super.values();
    }

    @Override // K7.AbstractC1066f, K7.G
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // K7.G
    public int size() {
        return this.f7733f;
    }

    @Override // K7.AbstractC1066f
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
