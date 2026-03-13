package com.google.ar.sceneform.rendering;

import android.net.Uri;
import android.util.Log;
import com.google.android.filament.Box;
import com.google.android.filament.Engine;
import com.google.android.filament.EntityManager;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.TransformManager;
import com.google.android.filament.gltfio.Animator;
import com.google.android.filament.gltfio.AssetLoader;
import com.google.android.filament.gltfio.FilamentAsset;
import com.google.android.filament.gltfio.ResourceLoader;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.function.Function;
import kb.C4836b;
import kb.InterfaceC4835a;
import rb.C5692a;
import rb.C5693b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class p implements InterfaceC4835a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f31327r = "p";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Engine f31328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AssetLoader f31329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ResourceLoader f31330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rb.o f31331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f31332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f31333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f31334g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FilamentAsset f31336i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Animator f31337j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f31342o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f31343p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public rb.j f31344q;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f31335h = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f31338k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f31339l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f31340m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f31341n = true;

    public p(Engine engine, AssetLoader assetLoader, ResourceLoader resourceLoader, rb.o oVar, m mVar) {
        this.f31333f = 0;
        this.f31334g = 0;
        this.f31328a = engine;
        this.f31329b = assetLoader;
        this.f31330c = resourceLoader;
        rb.k.d(oVar, "Parameter \"transformProvider\" was null.");
        rb.k.d(mVar, "Parameter \"renderable\" was null.");
        this.f31331d = oVar;
        this.f31332e = mVar;
        this.f31342o = new ArrayList(mVar.f());
        this.f31343p = new ArrayList(mVar.g());
        this.f31333f = e(engine);
        rb.j jVarM = m();
        if (jVarM != null) {
            this.f31334g = d(engine, this.f31333f, jVarM);
        }
        f();
        c();
    }

    public static int d(Engine engine, int i10, rb.j jVar) {
        int iCreate = EntityManager.get().create();
        TransformManager transformManager = engine.getTransformManager();
        transformManager.create(iCreate, transformManager.getInstance(i10), jVar.f43961a);
        return iCreate;
    }

    public static int e(Engine engine) {
        int iCreate = EntityManager.get().create();
        engine.getTransformManager().create(iCreate);
        return iCreate;
    }

    @Override // kb.InterfaceC4835a
    public boolean a(C4836b c4836b) {
        return false;
    }

    public void c() {
        if (this.f31332e.i() instanceof r) {
            r rVar = (r) this.f31332e.i();
            FilamentAsset filamentAssetCreateAsset = this.f31329b.createAsset(rVar.f31360b);
            if (filamentAssetCreateAsset == null) {
                throw new IllegalStateException("Failed to load gltf");
            }
            if (this.f31332e.f31302i == null) {
                Box boundingBox = filamentAssetCreateAsset.getBoundingBox();
                float[] halfExtent = boundingBox.getHalfExtent();
                float[] center = boundingBox.getCenter();
                this.f31332e.f31302i = new C5692a(new rb.p(halfExtent[0], halfExtent[1], halfExtent[2]).n(2.0f), new rb.p(center[0], center[1], center[2]));
            }
            Function function = rVar.f31362d;
            for (String str : filamentAssetCreateAsset.getResourceUris()) {
                if (function == null) {
                    Log.e(f31327r, "Failed to download uri " + str + " no url resolver.");
                } else {
                    Uri uri = (Uri) function.apply(str);
                    try {
                        this.f31330c.addResourceData(str, ByteBuffer.wrap(G7.h.b(G7.g.k(rVar.f31359a, uri))));
                    } catch (Exception e10) {
                        Log.e(f31327r, "Failed to download data uri " + uri, e10);
                    }
                }
            }
            if (this.f31332e.f31295b) {
                this.f31330c.asyncBeginLoad(filamentAssetCreateAsset);
            } else {
                this.f31330c.loadResources(filamentAssetCreateAsset);
            }
            RenderableManager renderableManager = this.f31328a.getRenderableManager();
            this.f31342o.clear();
            this.f31343p.clear();
            for (int i10 : filamentAssetCreateAsset.getEntities()) {
                int renderableManager2 = renderableManager.getInstance(i10);
                if (renderableManager2 != 0) {
                    MaterialInstance materialInstanceAt = renderableManager.getMaterialInstanceAt(renderableManager2, 0);
                    this.f31343p.add(materialInstanceAt.getName());
                    this.f31342o.add(materialInstanceAt);
                }
            }
            TransformManager transformManager = this.f31328a.getTransformManager();
            int transformManager2 = transformManager.getInstance(filamentAssetCreateAsset.getRoot());
            int i11 = this.f31334g;
            if (i11 == 0) {
                i11 = this.f31333f;
            }
            transformManager.setParent(transformManager2, transformManager.getInstance(i11));
            this.f31336i = filamentAssetCreateAsset;
            s(this.f31332e.h());
            t(this.f31332e.j());
            u(this.f31332e.k());
            this.f31337j = filamentAssetCreateAsset.getInstance().getAnimator();
            this.f31338k = new ArrayList();
            for (int i12 = 0; i12 < this.f31337j.getAnimationCount(); i12++) {
                this.f31338k.add(new C4836b(this, this.f31337j.getAnimationName(i12), i12, this.f31337j.getAnimationDuration(i12), n().c()));
            }
        }
    }

    public void g() {
        FilamentAsset filamentAsset = this.f31336i;
        if (filamentAsset != null) {
            try {
                this.f31329b.destroyAsset(filamentAsset);
            } catch (Exception unused) {
            }
            this.f31336i = null;
        }
        RenderableManager renderableManager = this.f31328a.getRenderableManager();
        int i10 = this.f31334g;
        if (i10 != 0) {
            try {
                renderableManager.destroy(i10);
            } catch (Exception unused2) {
            }
            this.f31334g = 0;
        }
        int i11 = this.f31333f;
        if (i11 != 0) {
            try {
                renderableManager.destroy(i11);
            } catch (Exception unused3) {
            }
            this.f31333f = 0;
        }
    }

    public C4836b h(int i10) {
        rb.k.b(i10, i(), "No animation found at the given index");
        return (C4836b) this.f31338k.get(i10);
    }

    public int i() {
        return this.f31338k.size();
    }

    public int j() {
        return this.f31333f;
    }

    public Animator k() {
        return this.f31337j;
    }

    public FilamentAsset l() {
        return this.f31336i;
    }

    public rb.j m() {
        rb.j jVar = this.f31344q;
        if (jVar != null) {
            return jVar;
        }
        d dVarI = this.f31332e.i();
        float fA = dVarI.a();
        rb.p pVarB = dVarI.b();
        if (fA == 1.0f && rb.p.d(pVarB, rb.p.x())) {
            return null;
        }
        rb.j jVar2 = new rb.j();
        this.f31344q = jVar2;
        jVar2.d(fA);
        this.f31344q.g(pVarB);
        return this.f31344q;
    }

    public m n() {
        return this.f31332e;
    }

    public int o() {
        int i10 = this.f31334g;
        return i10 == 0 ? this.f31333f : i10;
    }

    public rb.j p() {
        return this.f31332e.d(this.f31331d.p());
    }

    public void q(Engine engine) {
        this.f31332e.m(engine);
        C5693b c5693bE = this.f31332e.e();
        if (!c5693bE.a(this.f31335h)) {
            if (w(false)) {
                x();
            }
        } else {
            d dVarI = this.f31332e.i();
            v(dVarI);
            dVarI.r(engine, this, o());
            this.f31335h = c5693bE.b();
            x();
        }
    }

    public void r(int i10, int i11) {
        RenderableManager renderableManager = this.f31328a.getRenderableManager();
        renderableManager.setBlendOrderAt(renderableManager.getInstance(o()), i10, i11);
    }

    public void s(int i10) {
        this.f31339l = Math.min(7, Math.max(0, i10));
        RenderableManager renderableManager = this.f31328a.getRenderableManager();
        for (int i11 : l().getEntities()) {
            int renderableManager2 = renderableManager.getInstance(i11);
            if (renderableManager2 != 0) {
                renderableManager.setPriority(renderableManager2, this.f31339l);
            }
        }
    }

    public void t(boolean z10) {
        this.f31340m = z10;
        RenderableManager renderableManager = this.f31328a.getRenderableManager();
        int renderableManager2 = renderableManager.getInstance(j());
        if (renderableManager2 != 0) {
            renderableManager.setCastShadows(renderableManager2, z10);
        }
        FilamentAsset filamentAssetL = l();
        if (filamentAssetL == null) {
            return;
        }
        for (int i10 : filamentAssetL.getEntities()) {
            int renderableManager3 = renderableManager.getInstance(i10);
            if (renderableManager3 != 0) {
                renderableManager.setCastShadows(renderableManager3, z10);
            }
        }
    }

    public void u(boolean z10) {
        this.f31341n = z10;
        RenderableManager renderableManager = this.f31328a.getRenderableManager();
        int renderableManager2 = renderableManager.getInstance(j());
        if (renderableManager2 != 0) {
            renderableManager.setReceiveShadows(renderableManager2, z10);
        }
        FilamentAsset filamentAssetL = l();
        if (filamentAssetL == null) {
            return;
        }
        for (int i10 : filamentAssetL.getEntities()) {
            int renderableManager3 = renderableManager.getInstance(i10);
            if (renderableManager3 != 0) {
                renderableManager.setReceiveShadows(renderableManager3, z10);
            }
        }
    }

    public boolean w(boolean z10) {
        boolean z11 = false;
        for (int i10 = 0; i10 < i(); i10++) {
            C4836b c4836bH = h(i10);
            if (z10 || c4836bH.l()) {
                if (k() != null) {
                    k().applyAnimation(i10, c4836bH.k());
                }
                c4836bH.m(false);
                z11 = true;
            }
        }
        return z11;
    }

    public final void x() {
        if (k() != null) {
            k().updateBoneMatrices();
        }
    }

    public void f() {
    }

    public final void v(d dVar) {
    }
}
