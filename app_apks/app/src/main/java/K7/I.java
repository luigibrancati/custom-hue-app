package K7;

import java.util.AbstractCollection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class I {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractC1063c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public transient J7.t f7591g;

        public a(Map map, J7.t tVar) {
            super(map);
            this.f7591g = (J7.t) J7.n.j(tVar);
        }

        @Override // K7.AbstractC1064d
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public List r() {
            return (List) this.f7591g.get();
        }

        @Override // K7.AbstractC1066f
        public Map e() {
            return t();
        }

        @Override // K7.AbstractC1066f
        public Set g() {
            return u();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class b extends AbstractCollection {
        public abstract G c();

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            c().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return c().c(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return c().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return c().size();
        }
    }

    public static boolean a(G g10, Object obj) {
        if (obj == g10) {
            return true;
        }
        if (obj instanceof G) {
            return g10.b().equals(((G) obj).b());
        }
        return false;
    }

    public static C b(Map map, J7.t tVar) {
        return new a(map, tVar);
    }
}
