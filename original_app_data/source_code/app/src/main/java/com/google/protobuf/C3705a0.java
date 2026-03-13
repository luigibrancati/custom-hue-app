package com.google.protobuf;

import com.google.protobuf.N;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.protobuf.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3705a0 extends LinkedHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3705a0 f32216b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f32217a;

    static {
        C3705a0 c3705a0 = new C3705a0();
        f32216b = c3705a0;
        c3705a0.p();
    }

    public C3705a0() {
        this.f32217a = true;
    }

    public static int a(Map map) {
        int iE = 0;
        for (Map.Entry entry : map.entrySet()) {
            iE += e(entry.getValue()) ^ e(entry.getKey());
        }
        return iE;
    }

    public static int e(Object obj) {
        if (obj instanceof byte[]) {
            return N.d((byte[]) obj);
        }
        if (obj instanceof N.c) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public static void g(Map map) {
        for (Object obj : map.keySet()) {
            N.a(obj);
            N.a(map.get(obj));
        }
    }

    public static C3705a0 i() {
        return f32216b;
    }

    public static boolean m(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    public static boolean n(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !m(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        j();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && n(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return a(this);
    }

    public final void j() {
        if (!o()) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean o() {
        return this.f32217a;
    }

    public void p() {
        this.f32217a = false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        j();
        N.a(obj);
        N.a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        j();
        g(map);
        super.putAll(map);
    }

    public void q(C3705a0 c3705a0) {
        j();
        if (c3705a0.isEmpty()) {
            return;
        }
        putAll(c3705a0);
    }

    public C3705a0 r() {
        return isEmpty() ? new C3705a0() : new C3705a0(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        j();
        return super.remove(obj);
    }

    public C3705a0(Map map) {
        super(map);
        this.f32217a = true;
    }
}
