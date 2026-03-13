package com.google.ar.sceneform.rendering;

import com.google.android.filament.Box;
import com.google.android.filament.Engine;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.VertexBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class q implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IntBuffer f31349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public FloatBuffer f31350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FloatBuffer f31351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FloatBuffer f31352h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FloatBuffer f31353i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public IndexBuffer f31354j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public VertexBuffer f31355k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rb.p f31345a = rb.p.x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rb.p f31346b = rb.p.x();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f31347c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rb.p f31348d = rb.p.x();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f31356l = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f31357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f31358b;
    }

    @Override // com.google.ar.sceneform.rendering.d
    public float a() {
        return this.f31347c;
    }

    @Override // com.google.ar.sceneform.rendering.d
    public rb.p b() {
        return new rb.p(this.f31348d);
    }

    @Override // com.google.ar.sceneform.rendering.d
    public void c(rb.p pVar) {
        this.f31346b.p(pVar);
    }

    @Override // com.google.ar.sceneform.rendering.d
    public rb.p d() {
        return new rb.p(this.f31345a);
    }

    @Override // com.google.ar.sceneform.rendering.d
    public void e(VertexBuffer vertexBuffer) {
        this.f31355k = vertexBuffer;
    }

    @Override // com.google.ar.sceneform.rendering.d
    public void f(FloatBuffer floatBuffer) {
        this.f31352h = floatBuffer;
    }

    @Override // com.google.ar.sceneform.rendering.d
    public void g(FloatBuffer floatBuffer) {
        this.f31353i = floatBuffer;
    }

    @Override // com.google.ar.sceneform.rendering.d
    public void h(IndexBuffer indexBuffer) {
        this.f31354j = indexBuffer;
    }

    @Override // com.google.ar.sceneform.rendering.d
    public void i(rb.p pVar) {
        this.f31345a.p(pVar);
    }

    @Override // com.google.ar.sceneform.rendering.d
    public IndexBuffer j() {
        return this.f31354j;
    }

    @Override // com.google.ar.sceneform.rendering.d
    public VertexBuffer k() {
        return this.f31355k;
    }

    @Override // com.google.ar.sceneform.rendering.d
    public FloatBuffer l() {
        return this.f31351g;
    }

    @Override // com.google.ar.sceneform.rendering.d
    public FloatBuffer m() {
        return this.f31352h;
    }

    @Override // com.google.ar.sceneform.rendering.d
    public void n(IntBuffer intBuffer) {
        this.f31349e = intBuffer;
    }

    @Override // com.google.ar.sceneform.rendering.d
    public FloatBuffer o() {
        return this.f31350f;
    }

    @Override // com.google.ar.sceneform.rendering.d
    public void p(FloatBuffer floatBuffer) {
        this.f31350f = floatBuffer;
    }

    @Override // com.google.ar.sceneform.rendering.d
    public FloatBuffer q() {
        return this.f31353i;
    }

    @Override // com.google.ar.sceneform.rendering.d
    public void r(Engine engine, p pVar, int i10) {
        m mVarN = pVar.n();
        d dVarI = mVarN.i();
        ArrayList arrayListF = mVarN.f();
        RenderableManager renderableManager = engine.getRenderableManager();
        int renderableManager2 = renderableManager.getInstance(i10);
        int size = dVarI.v().size();
        if (renderableManager2 == 0 || renderableManager.getPrimitiveCount(renderableManager2) != size) {
            if (renderableManager2 != 0) {
                try {
                    renderableManager.destroy(i10);
                } catch (Exception unused) {
                }
            }
            RenderableManager.Builder builderReceiveShadows = new RenderableManager.Builder(size).priority(mVarN.h()).castShadows(mVarN.j()).receiveShadows(mVarN.k());
            x(builderReceiveShadows);
            builderReceiveShadows.build(engine, i10);
            renderableManager2 = renderableManager.getInstance(i10);
            if (renderableManager2 == 0) {
                throw new AssertionError("Unable to create RenderableInstance.");
            }
        } else {
            renderableManager.setPriority(renderableManager2, mVarN.h());
            renderableManager.setCastShadows(renderableManager2, mVarN.j());
            renderableManager.setReceiveShadows(renderableManager2, mVarN.k());
        }
        rb.p pVarW = dVarI.w();
        rb.p pVarD = dVarI.d();
        renderableManager.setAxisAlignedBoundingBox(renderableManager2, new Box(pVarD.f43970a, pVarD.f43971b, pVarD.f43972c, pVarW.f43970a, pVarW.f43971b, pVarW.f43972c));
        if (arrayListF.size() != size) {
            throw new AssertionError("Material Bindings are out of sync with meshes.");
        }
        RenderableManager.PrimitiveType primitiveType = RenderableManager.PrimitiveType.TRIANGLES;
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) dVarI.v().get(i11);
            VertexBuffer vertexBufferK = dVarI.k();
            IndexBuffer indexBufferJ = dVarI.j();
            if (vertexBufferK == null || indexBufferJ == null) {
                throw new AssertionError("Internal Error: Failed to get vertex or index buffer");
            }
            int i12 = aVar.f31357a;
            renderableManager.setGeometryAt(renderableManager2, i11, primitiveType, vertexBufferK, indexBufferJ, i12, aVar.f31358b - i12);
            renderableManager.setMaterialInstanceAt(renderableManager2, i11, (MaterialInstance) arrayListF.get(i11));
        }
    }

    @Override // com.google.ar.sceneform.rendering.d
    public IntBuffer s() {
        return this.f31349e;
    }

    @Override // com.google.ar.sceneform.rendering.d
    public void t(FloatBuffer floatBuffer) {
        this.f31351g = floatBuffer;
    }

    @Override // com.google.ar.sceneform.rendering.d
    public rb.p u() {
        return this.f31346b.n(2.0f);
    }

    @Override // com.google.ar.sceneform.rendering.d
    public ArrayList v() {
        return this.f31356l;
    }

    @Override // com.google.ar.sceneform.rendering.d
    public rb.p w() {
        return new rb.p(this.f31346b);
    }

    public final void x(RenderableManager.Builder builder) {
    }
}
