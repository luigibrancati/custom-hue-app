package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3160c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3151b f29426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3151b f29427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f29428c;

    public C3160c() {
        this.f29426a = new C3151b("", 0L, null);
        this.f29427b = new C3151b("", 0L, null);
        this.f29428c = new ArrayList();
    }

    public final C3151b a() {
        return this.f29426a;
    }

    public final void b(C3151b c3151b) {
        this.f29426a = c3151b;
        this.f29427b = c3151b.clone();
        this.f29428c.clear();
    }

    public final C3151b c() {
        return this.f29427b;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C3160c c3160c = new C3160c(this.f29426a.clone());
        Iterator it = this.f29428c.iterator();
        while (it.hasNext()) {
            c3160c.f29428c.add(((C3151b) it.next()).clone());
        }
        return c3160c;
    }

    public final void d(C3151b c3151b) {
        this.f29427b = c3151b;
    }

    public final void e(String str, long j10, Map map) {
        HashMap map2 = new HashMap();
        for (String str2 : map.keySet()) {
            map2.put(str2, C3151b.h(str2, this.f29426a.e(str2), map.get(str2)));
        }
        this.f29428c.add(new C3151b(str, j10, map2));
    }

    public final List f() {
        return this.f29428c;
    }

    public C3160c(C3151b c3151b) {
        this.f29426a = c3151b;
        this.f29427b = c3151b.clone();
        this.f29428c = new ArrayList();
    }
}
