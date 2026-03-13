package com.google.ar.sceneform.rendering;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rb.p f31372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rb.p f31373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.google.ar.sceneform.rendering.a f31374c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final rb.p f31375a = rb.p.x();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public rb.p f31376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public com.google.ar.sceneform.rendering.a f31377c;

        public static /* bridge */ /* synthetic */ b d(a aVar) {
            aVar.getClass();
            return null;
        }

        public u e() {
            return new u(this);
        }

        public a f(rb.p pVar) {
            this.f31376b = pVar;
            return this;
        }

        public a g(rb.p pVar) {
            this.f31375a.p(pVar);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
    }

    public static a a() {
        return new a();
    }

    public com.google.ar.sceneform.rendering.a b() {
        return this.f31374c;
    }

    public rb.p c() {
        return this.f31373b;
    }

    public rb.p d() {
        return this.f31372a;
    }

    public b e() {
        return null;
    }

    public u(a aVar) {
        rb.p pVarX = rb.p.x();
        this.f31372a = pVarX;
        pVarX.p(aVar.f31375a);
        this.f31373b = aVar.f31376b;
        a.d(aVar);
        this.f31374c = aVar.f31377c;
    }
}
