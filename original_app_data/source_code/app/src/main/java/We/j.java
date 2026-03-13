package We;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends f implements We.a, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f17966a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map.Entry f17967a;

        public a(Map.Entry entry) {
            this.f17967a = entry;
        }

        @Override // We.h
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry d() {
            return this.f17967a;
        }

        @Override // We.g, java.util.Map.Entry
        public Object setValue(Object obj) {
            return super.setValue(j.h((Class) getKey(), obj));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends i {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a extends n {
            public a(b bVar, Iterator it) {
                super(it);
            }

            @Override // We.n
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry a(Map.Entry entry) {
                return j.k(entry);
            }
        }

        public b() {
        }

        @Override // We.e
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public Set d() {
            return j.this.d().entrySet();
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a(this, c().iterator());
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set
        public Spliterator spliterator() {
            return d.a(c().spliterator(), new Function() { // from class: We.k
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return j.k((Map.Entry) obj);
                }
            });
        }

        @Override // java.util.Collection, java.util.Set
        public Object[] toArray() {
            return e();
        }

        @Override // We.e, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return f(objArr);
        }
    }

    public j(Map map) {
        this.f17966a = (Map) Ve.a.a(map);
    }

    public static Object h(Class cls, Object obj) {
        return Xe.a.b(cls).cast(obj);
    }

    public static Map.Entry k(Map.Entry entry) {
        return new a(entry);
    }

    public static j l() {
        return new j(new HashMap());
    }

    @Override // We.h
    public Map d() {
        return this.f17966a;
    }

    @Override // java.util.Map
    public Set entrySet() {
        return new b();
    }

    @Override // We.f, java.util.Map
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Object put(Class cls, Object obj) {
        return super.put(cls, h(cls, obj));
    }

    @Override // We.f, java.util.Map
    public void putAll(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            h((Class) entry.getKey(), entry.getValue());
        }
        super.putAll(linkedHashMap);
    }
}
