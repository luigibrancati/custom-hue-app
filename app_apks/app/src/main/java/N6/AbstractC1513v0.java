package N6;

import io.sentry.rrweb.RRWebVideoEvent;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: N6.v0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1513v0 implements Map, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient AbstractC1526w0 f10501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient AbstractC1526w0 f10502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient AbstractC1423o0 f10503c;

    public static AbstractC1513v0 c(Object obj, Object obj2) {
        Y.b("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return P0.g(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    public abstract AbstractC1423o0 a();

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC1423o0 values() {
        AbstractC1423o0 abstractC1423o0 = this.f10503c;
        if (abstractC1423o0 != null) {
            return abstractC1423o0;
        }
        AbstractC1423o0 abstractC1423o0A = a();
        this.f10503c = abstractC1423o0A;
        return abstractC1423o0A;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract AbstractC1526w0 d();

    public abstract AbstractC1526w0 e();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final AbstractC1526w0 entrySet() {
        AbstractC1526w0 abstractC1526w0 = this.f10501a;
        if (abstractC1526w0 != null) {
            return abstractC1526w0;
        }
        AbstractC1526w0 abstractC1526w0D = d();
        this.f10501a = abstractC1526w0D;
        return abstractC1526w0D;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return R0.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC1526w0 abstractC1526w0 = this.f10502b;
        if (abstractC1526w0 != null) {
            return abstractC1526w0;
        }
        AbstractC1526w0 abstractC1526w0E = e();
        this.f10502b = abstractC1526w0E;
        return abstractC1526w0E;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        Y.a(size, RRWebVideoEvent.JsonKeys.SIZE);
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }
}
