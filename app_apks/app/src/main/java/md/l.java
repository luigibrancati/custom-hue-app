package md;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class l implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f40352a;

    public l(Iterator it) {
        this.f40352a = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f40352a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f40352a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f40352a.remove();
    }
}
