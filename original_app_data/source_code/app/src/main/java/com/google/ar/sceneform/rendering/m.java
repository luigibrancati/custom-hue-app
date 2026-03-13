package com.google.ar.sceneform.rendering;

import android.content.Context;
import android.net.Uri;
import com.google.android.filament.Engine;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.gltfio.AssetLoader;
import com.google.android.filament.gltfio.ResourceLoader;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import rb.AbstractC5695d;
import rb.C5692a;
import rb.C5693b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f31293k = TimeUnit.DAYS.toSeconds(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f31294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f31295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f31296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f31297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f31299f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f31300g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f31301h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AbstractC5695d f31302i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C5693b f31303j;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f31304a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Context f31305b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Uri f31306c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Callable f31307d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public n f31308e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f31309f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f31310g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f31311h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Function f31312i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public byte[] f31313j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f31314k = 24;

        public CompletableFuture h(Engine engine) {
            CompletableFuture completableFutureQ;
            CompletableFuture completableFutureB;
            try {
                i();
                Object obj = this.f31304a;
                if (obj != null && (completableFutureB = k().b(obj)) != null) {
                    return completableFutureB.thenApply(new Function() { // from class: com.google.ar.sceneform.rendering.k
                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return this.f31291a.n((m) obj2);
                        }
                    });
                }
                m mVarR = r(engine);
                if (this.f31308e != null) {
                    return CompletableFuture.completedFuture(mVarR);
                }
                if (this.f31307d == null) {
                    CompletableFuture completableFuture = new CompletableFuture();
                    completableFuture.completeExceptionally(new AssertionError("Input Stream Creator is null."));
                    c.b(j().getSimpleName(), completableFuture, "Unable to load Renderable registryId='" + obj + "'");
                    return completableFuture;
                }
                if (this.f31310g) {
                    Context context = this.f31305b;
                    if (context == null) {
                        throw new AssertionError("Gltf Renderable.Builder must have a valid context.");
                    }
                    completableFutureQ = p(context, mVarR);
                } else if (this.f31309f) {
                    Context context2 = this.f31305b;
                    if (context2 == null) {
                        throw new AssertionError("Gltf Renderable.Builder must have a valid context.");
                    }
                    completableFutureQ = q(context2, mVarR, this.f31313j);
                } else {
                    completableFutureQ = null;
                }
                if (obj != null) {
                    k().d(obj, completableFutureQ);
                }
                c.b(j().getSimpleName(), completableFutureQ, "Unable to load Renderable registryId='" + obj + "'");
                return completableFutureQ.thenApply(new Function() { // from class: com.google.ar.sceneform.rendering.l
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return this.f31292a.o((m) obj2);
                    }
                });
            } catch (Throwable th) {
                CompletableFuture completableFuture2 = new CompletableFuture();
                completableFuture2.completeExceptionally(th);
                c.b(j().getSimpleName(), completableFuture2, "Unable to load Renderable registryId='" + this.f31304a + "'");
                return completableFuture2;
            }
        }

        public void i() {
            G7.a.c();
            if (!m().booleanValue()) {
                throw new AssertionError("ModelRenderable must have a source.");
            }
        }

        public abstract Class j();

        public abstract F7.c k();

        public abstract a l();

        public Boolean m() {
            return Boolean.valueOf((this.f31306c == null && this.f31307d == null && this.f31308e == null) ? false : true);
        }

        public final /* synthetic */ m n(m mVar) {
            return (m) j().cast(mVar.l());
        }

        public final /* synthetic */ m o(m mVar) {
            return (m) j().cast(mVar.l());
        }

        public final CompletableFuture p(Context context, m mVar) {
            return new h(mVar, context, (Uri) rb.k.c(this.f31306c), this.f31312i).d((Callable) rb.k.c(this.f31307d));
        }

        public final CompletableFuture q(Context context, m mVar, byte[] bArr) {
            return null;
        }

        public abstract m r(Engine engine);

        public a s(n nVar) {
            this.f31308e = nVar;
            this.f31304a = null;
            this.f31306c = null;
            return l();
        }
    }

    public m(a aVar) {
        this.f31296c = new ArrayList();
        this.f31297d = new ArrayList();
        this.f31298e = 4;
        this.f31299f = true;
        this.f31300g = true;
        this.f31303j = new C5693b();
        rb.k.d(aVar, "Parameter \"builder\" was null.");
        if (aVar.f31310g) {
            this.f31294a = new r();
        } else if (aVar.f31309f) {
            this.f31294a = b();
        } else {
            this.f31294a = new q();
        }
        if (aVar.f31308e != null) {
            p(aVar.f31308e);
        }
        this.f31295b = aVar.f31311h;
        this.f31301h = aVar.f31314k;
    }

    public p a(Engine engine, AssetLoader assetLoader, ResourceLoader resourceLoader, rb.o oVar) {
        return new p(engine, assetLoader, resourceLoader, oVar, this);
    }

    public final d b() {
        return null;
    }

    public int c() {
        return this.f31301h;
    }

    public rb.j d(rb.j jVar) {
        rb.k.d(jVar, "Parameter \"originalMatrix\" was null.");
        return jVar;
    }

    public C5693b e() {
        return this.f31303j;
    }

    public ArrayList f() {
        return this.f31296c;
    }

    public ArrayList g() {
        return this.f31297d;
    }

    public int h() {
        return this.f31298e;
    }

    public d i() {
        return this.f31294a;
    }

    public boolean j() {
        return this.f31299f;
    }

    public boolean k() {
        return this.f31300g;
    }

    public abstract m l();

    public void n(boolean z10) {
        this.f31299f = z10;
        this.f31303j.d();
    }

    public void o(boolean z10) {
        this.f31300g = z10;
        this.f31303j.d();
    }

    public void p(n nVar) {
        rb.k.e(!nVar.i().isEmpty());
        this.f31303j.d();
        nVar.d(this.f31294a, this.f31296c, this.f31297d);
        this.f31302i = new C5692a(this.f31294a.u(), this.f31294a.d());
    }

    public m(m mVar) {
        this.f31296c = new ArrayList();
        this.f31297d = new ArrayList();
        this.f31298e = 4;
        this.f31299f = true;
        this.f31300g = true;
        this.f31303j = new C5693b();
        if (!mVar.e().c()) {
            this.f31294a = mVar.f31294a;
            rb.k.e(mVar.f31297d.size() == mVar.f31296c.size());
            for (int i10 = 0; i10 < mVar.f31296c.size(); i10++) {
                this.f31296c.add(((MaterialInstance) mVar.f31296c.get(i10)).getMaterial().createInstance());
                this.f31297d.add((String) mVar.f31297d.get(i10));
            }
            this.f31298e = mVar.f31298e;
            this.f31299f = mVar.f31299f;
            this.f31300g = mVar.f31300g;
            AbstractC5695d abstractC5695d = mVar.f31302i;
            if (abstractC5695d != null) {
                this.f31302i = abstractC5695d.b();
            }
            this.f31295b = mVar.f31295b;
            this.f31301h = mVar.f31301h;
            this.f31303j.d();
            return;
        }
        throw new AssertionError("Cannot copy uninitialized Renderable.");
    }

    public void m(Engine engine) {
    }
}
