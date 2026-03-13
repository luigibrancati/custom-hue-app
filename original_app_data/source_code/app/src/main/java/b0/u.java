package b0;

import java.util.Map;
import wc.InterfaceC6184a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class u implements Map.Entry, InterfaceC6184a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f24955b;

    public u(Object obj, Object obj2) {
        this.f24954a = obj;
        this.f24955b = obj2;
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f24954a;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f24955b;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
