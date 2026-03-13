package com.google.ar.sceneform.rendering;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f31278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f31279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f31280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f31281d;

    public a() {
        c();
    }

    public void a(float f10, float f11, float f12) {
        b(f10, f11, f12, 1.0f);
    }

    public void b(float f10, float f11, float f12, float f13) {
        this.f31278a = Math.max(0.0f, Math.min(1.0f, f10));
        this.f31279b = Math.max(0.0f, Math.min(1.0f, f11));
        this.f31280c = Math.max(0.0f, Math.min(1.0f, f12));
        this.f31281d = Math.max(0.0f, Math.min(1.0f, f13));
    }

    public final void c() {
        a(1.0f, 1.0f, 1.0f);
    }
}
