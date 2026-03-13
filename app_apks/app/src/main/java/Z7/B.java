package Z7;

import g8.C4160a;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C4160a f20309b = C4160a.a(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f20310a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Iterable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f20311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f20312b;

        public a(List list, List list2) {
            this.f20311a = list;
            this.f20312b = list2;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new c(this.f20311a.iterator(), this.f20312b.iterator(), null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f20314a = new HashMap();

        public B a() {
            return new B(this.f20314a, null);
        }

        public b b(C4160a c4160a, Object obj) throws GeneralSecurityException {
            List list;
            if (c4160a.c() != 0 && c4160a.c() != 5) {
                throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
            }
            if (this.f20314a.containsKey(c4160a)) {
                list = (List) this.f20314a.get(c4160a);
            } else {
                ArrayList arrayList = new ArrayList();
                this.f20314a.put(c4160a, arrayList);
                list = arrayList;
            }
            list.add(obj);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator f20315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator f20316b;

        public /* synthetic */ c(Iterator it, Iterator it2, a aVar) {
            this(it, it2);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20315a.hasNext() || this.f20316b.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.f20315a.hasNext() ? this.f20315a.next() : this.f20316b.next();
        }

        public c(Iterator it, Iterator it2) {
            this.f20315a = it;
            this.f20316b = it2;
        }
    }

    public /* synthetic */ B(Map map, a aVar) {
        this(map);
    }

    public Iterable a(byte[] bArr) {
        List list = (List) this.f20310a.get(f20309b);
        List list2 = bArr.length >= 5 ? (List) this.f20310a.get(C4160a.b(bArr, 0, 5)) : null;
        return (list == null && list2 == null) ? new ArrayList() : list == null ? list2 : list2 == null ? list : new a(list2, list);
    }

    public B(Map map) {
        this.f20310a = map;
    }
}
