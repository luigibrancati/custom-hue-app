package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.f3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3532f3 extends LinkedHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3532f3 f30165b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f30166a;

    static {
        C3532f3 c3532f3 = new C3532f3();
        f30165b = c3532f3;
        c3532f3.f30166a = false;
    }

    public C3532f3() {
        this.f30166a = true;
    }

    public static C3532f3 a() {
        return f30165b;
    }

    public static int m(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof EnumC3581n4) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int iB = T2.b(length, bArr, 0, length);
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

    public final C3532f3 e() {
        return isEmpty() ? new C3532f3() : new C3532f3(this);
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
        this.f30166a = false;
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

    public final void i(C3532f3 c3532f3) {
        n();
        if (c3532f3.isEmpty()) {
            return;
        }
        putAll(c3532f3);
    }

    public final boolean j() {
        return this.f30166a;
    }

    public final void n() {
        if (!this.f30166a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        n();
        Charset charset = T2.f30091a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        n();
        for (Object obj : map.keySet()) {
            Charset charset = T2.f30091a;
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

    public C3532f3(Map map) {
        super(map);
        this.f30166a = true;
    }
}
