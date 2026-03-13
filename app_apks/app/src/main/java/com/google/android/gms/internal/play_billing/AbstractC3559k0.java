package com.google.android.gms.internal.play_billing;

import io.sentry.rrweb.RRWebVideoEvent;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3559k0 implements Map, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient AbstractC3583o0 f30191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient AbstractC3583o0 f30192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient AbstractC3511c0 f30193c;

    public static AbstractC3559k0 c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        O.b("com.android.vending.billing.PURCHASES_UPDATED", obj2);
        O.b("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4);
        O.b("com.android.vending.billing.ALTERNATIVE_BILLING", obj6);
        return I0.g(3, new Object[]{"com.android.vending.billing.PURCHASES_UPDATED", obj2, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4, "com.android.vending.billing.ALTERNATIVE_BILLING", obj6}, null);
    }

    public abstract AbstractC3511c0 a();

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC3511c0 values() {
        AbstractC3511c0 abstractC3511c0 = this.f30193c;
        if (abstractC3511c0 != null) {
            return abstractC3511c0;
        }
        AbstractC3511c0 abstractC3511c0A = a();
        this.f30193c = abstractC3511c0A;
        return abstractC3511c0A;
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

    public abstract AbstractC3583o0 d();

    public abstract AbstractC3583o0 e();

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
    public final AbstractC3583o0 entrySet() {
        AbstractC3583o0 abstractC3583o0 = this.f30191a;
        if (abstractC3583o0 != null) {
            return abstractC3583o0;
        }
        AbstractC3583o0 abstractC3583o0D = d();
        this.f30191a = abstractC3583o0D;
        return abstractC3583o0D;
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
        return L0.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC3583o0 abstractC3583o0 = this.f30192b;
        if (abstractC3583o0 != null) {
            return abstractC3583o0;
        }
        AbstractC3583o0 abstractC3583o0E = e();
        this.f30192b = abstractC3583o0E;
        return abstractC3583o0E;
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
        O.a(size, RRWebVideoEvent.JsonKeys.SIZE);
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
