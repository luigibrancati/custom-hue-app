package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class D1 extends LinkedHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D1 f29749b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f29750a;

    static {
        D1 d12 = new D1();
        f29749b = d12;
        d12.f29750a = false;
    }

    public D1() {
        this.f29750a = true;
    }

    public static D1 a() {
        return f29749b;
    }

    public static int m(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof InterfaceC3416j1) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int iB = AbstractC3446p1.b(length, bArr, 0, length);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        n();
        super.clear();
    }

    public final D1 e() {
        return isEmpty() ? new D1() : new D1(this);
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

    public final void g() {
        this.f29750a = false;
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

    public final void i(D1 d12) {
        n();
        if (d12.isEmpty()) {
            return;
        }
        putAll(d12);
    }

    public final boolean j() {
        return this.f29750a;
    }

    public final void n() {
        if (!this.f29750a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        n();
        Charset charset = AbstractC3446p1.f29896a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        n();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC3446p1.f29896a;
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

    public D1(Map map) {
        super(map);
        this.f29750a = true;
    }
}
