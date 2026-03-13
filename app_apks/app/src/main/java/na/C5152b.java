package na;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import na.C5154d;

/* JADX INFO: renamed from: na.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5152b implements Map {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f40742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5154d.a f40743b;

    /* JADX INFO: renamed from: na.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements C5154d.a {
        @Override // na.C5154d.a
        public C5154d a(ma.b bVar) {
            return new C5154d(bVar);
        }
    }

    public C5152b() {
        this(new a());
    }

    public final void a() {
        Iterator it = this.f40742a.entrySet().iterator();
        while (it.hasNext()) {
            if (((C5154d) ((Map.Entry) it.next()).getValue()).b()) {
                it.remove();
            }
        }
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ma.b get(Object obj) {
        C5154d c5154d = (C5154d) this.f40742a.get(obj);
        if (c5154d != null) {
            return (ma.b) c5154d.get();
        }
        return null;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ma.b put(String str, ma.b bVar) {
        this.f40742a.put(str, this.f40743b.a(bVar));
        a();
        return bVar;
    }

    @Override // java.util.Map
    public void clear() {
        this.f40742a.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f40742a.containsKey(obj) && get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Iterator it = this.f40742a.values().iterator();
        while (it.hasNext()) {
            if (((C5154d) it.next()).a(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ma.b remove(Object obj) {
        C5154d c5154d = (C5154d) this.f40742a.remove(obj);
        a();
        if (c5154d != null) {
            return (ma.b) c5154d.get();
        }
        return null;
    }

    @Override // java.util.Map
    public Set entrySet() {
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : this.f40742a.entrySet()) {
            C5154d c5154d = (C5154d) entry.getValue();
            if (!c5154d.b()) {
                hashSet.add(new C5151a((String) entry.getKey(), this.f40743b.a((ma.b) c5154d.get())));
            }
        }
        return hashSet;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        a();
        return this.f40742a.isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return this.f40742a.keySet();
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put((String) entry.getKey(), (ma.b) entry.getValue());
        }
    }

    @Override // java.util.Map
    public int size() {
        a();
        return this.f40742a.size();
    }

    @Override // java.util.Map
    public Collection values() {
        ArrayList arrayList = new ArrayList();
        for (C5154d c5154d : this.f40742a.values()) {
            if (!c5154d.b()) {
                arrayList.add((ma.b) c5154d.get());
            }
        }
        return arrayList;
    }

    public C5152b(C5154d.a aVar) {
        this.f40742a = new HashMap();
        this.f40743b = aVar;
    }
}
