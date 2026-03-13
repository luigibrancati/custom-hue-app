package g0;

import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6184a;

/* JADX INFO: renamed from: g0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C4053a implements Map.Entry, InterfaceC6184a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f34786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f34787b;

    public C4053a(Object obj, Object obj2) {
        this.f34786a = obj;
        this.f34787b = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && AbstractC4862t.a(entry.getKey(), getKey()) && AbstractC4862t.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f34786a;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f34787b;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
