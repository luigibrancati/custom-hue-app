package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3343w5 extends LinkedHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3343w5 f29716b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f29717a;

    static {
        C3343w5 c3343w5 = new C3343w5();
        f29716b = c3343w5;
        c3343w5.f29717a = false;
    }

    public C3343w5() {
        this.f29717a = true;
    }

    public static C3343w5 a() {
        return f29716b;
    }

    public static int m(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof InterfaceC3166c5) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int iC = AbstractC3211h5.c(length, bArr, 0, length);
        if (iC == 0) {
            return 1;
        }
        return iC;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        n();
        super.clear();
    }

    public final void e(C3343w5 c3343w5) {
        n();
        if (c3343w5.isEmpty()) {
            return;
        }
        putAll(c3343w5);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final C3343w5 g() {
        return isEmpty() ? new C3343w5() : new C3343w5(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int iM = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iM += m(entry.getValue()) ^ m(entry.getKey());
        }
        return iM;
    }

    public final void i() {
        this.f29717a = false;
    }

    public final boolean j() {
        return this.f29717a;
    }

    public final void n() {
        if (!this.f29717a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        n();
        Charset charset = AbstractC3211h5.f29486a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        n();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC3211h5.f29486a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        n();
        return super.remove(obj);
    }

    public C3343w5(Map map) {
        super(map);
        this.f29717a = true;
    }
}
