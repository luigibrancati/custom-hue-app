package N6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class J implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f9781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9782b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f9783c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f9784d = EnumC1539x0.INSTANCE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S f9785e;

    public J(S s10) {
        this.f9785e = s10;
        this.f9781a = s10.f10032d.entrySet().iterator();
    }

    public abstract Object a(Object obj, Object obj2);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9781a.hasNext() || this.f9784d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f9784d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f9781a.next();
            this.f9782b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f9783c = collection;
            this.f9784d = collection.iterator();
        }
        return a(this.f9782b, this.f9784d.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f9784d.remove();
        Collection collection = this.f9783c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f9781a.remove();
        }
        S s10 = this.f9785e;
        s10.f10033e--;
    }
}
