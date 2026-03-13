package com.google.ar.sceneform.rendering;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static s f31363f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f31364a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F7.c f31365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F7.c f31366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F7.c f31367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F7.c f31368e;

    public s() {
        F7.c cVar = new F7.c();
        this.f31365b = cVar;
        F7.c cVar2 = new F7.c();
        this.f31366c = cVar2;
        F7.c cVar3 = new F7.c();
        this.f31367d = cVar3;
        this.f31368e = new F7.c();
        a(cVar);
        a(cVar2);
        a(cVar3);
        b();
    }

    public static s c() {
        if (f31363f == null) {
            f31363f = new s();
        }
        return f31363f;
    }

    public void a(F7.a aVar) {
        this.f31364a.add(aVar);
    }

    public final void b() {
        a(this.f31368e);
    }

    public F7.c d() {
        return this.f31367d;
    }
}
