package com.google.ar.sceneform.rendering;

import com.google.android.filament.Engine;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.VertexBuffer;
import com.google.ar.sceneform.rendering.q;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import jb.AbstractC4754a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final rb.j f31315d = new rb.j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Engine f31316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f31317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f31318c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f31319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f31320b = new ArrayList();

        public n c(Engine engine) {
            return new n(engine, this);
        }

        public a d(List list) {
            this.f31319a = list;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f31321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MaterialInstance f31322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f31323c;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public List f31324a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public MaterialInstance f31325b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public String f31326c;

            public b d(Engine engine) {
                return new b(engine, this);
            }

            public a e(MaterialInstance materialInstance) {
                this.f31325b = materialInstance;
                return this;
            }

            public a f(List list) {
                this.f31324a = list;
                return this;
            }
        }

        public static a a() {
            return new a();
        }

        public MaterialInstance b() {
            return this.f31322b;
        }

        public String c() {
            return this.f31323c;
        }

        public List d() {
            return this.f31321a;
        }

        public void e(MaterialInstance materialInstance) {
            this.f31322b = materialInstance;
        }

        public b(Engine engine, a aVar) {
            this.f31321a = (List) rb.k.c(aVar.f31324a);
            this.f31322b = (MaterialInstance) rb.k.c(aVar.f31325b);
            this.f31323c = aVar.f31326c;
        }
    }

    public static void a(com.google.ar.sceneform.rendering.a aVar, FloatBuffer floatBuffer) {
        floatBuffer.put(aVar.f31278a);
        floatBuffer.put(aVar.f31279b);
        floatBuffer.put(aVar.f31280c);
        floatBuffer.put(aVar.f31281d);
    }

    public static void b(rb.l lVar, FloatBuffer floatBuffer) {
        floatBuffer.put(lVar.f43962a);
        floatBuffer.put(lVar.f43963b);
        floatBuffer.put(lVar.f43964c);
        floatBuffer.put(lVar.f43965d);
    }

    public static void c(rb.p pVar, FloatBuffer floatBuffer) {
        floatBuffer.put(pVar.f43970a);
        floatBuffer.put(pVar.f43971b);
        floatBuffer.put(pVar.f43972c);
    }

    public static a g() {
        return new a();
    }

    public static VertexBuffer h(Engine engine, int i10, EnumSet enumSet) {
        VertexBuffer.Builder builder = new VertexBuffer.Builder();
        builder.vertexCount(i10).bufferCount(enumSet.size());
        int i11 = 0;
        builder.attribute(VertexBuffer.VertexAttribute.POSITION, 0, VertexBuffer.AttributeType.FLOAT3, 0, 12);
        VertexBuffer.VertexAttribute vertexAttribute = VertexBuffer.VertexAttribute.TANGENTS;
        if (enumSet.contains(vertexAttribute)) {
            i11 = 1;
            builder.attribute(vertexAttribute, 1, VertexBuffer.AttributeType.FLOAT4, 0, 16);
        }
        VertexBuffer.VertexAttribute vertexAttribute2 = VertexBuffer.VertexAttribute.UV0;
        if (enumSet.contains(vertexAttribute2)) {
            i11++;
            builder.attribute(vertexAttribute2, i11, VertexBuffer.AttributeType.FLOAT2, 0, 8);
        }
        VertexBuffer.VertexAttribute vertexAttribute3 = VertexBuffer.VertexAttribute.COLOR;
        if (enumSet.contains(vertexAttribute3)) {
            builder.attribute(vertexAttribute3, i11 + 1, VertexBuffer.AttributeType.FLOAT4, 0, 16);
        }
        return builder.build(engine);
    }

    public static rb.l j(rb.p pVar) {
        rb.p pVarK;
        rb.p pVarB = rb.p.b(rb.p.w(), pVar);
        if (rb.i.a(rb.p.c(pVarB, pVarB), 0.0f)) {
            rb.p pVarK2 = rb.p.b(pVar, rb.p.m()).k();
            pVarK = pVarK2;
            pVarB = rb.p.b(pVarK2, pVar).k();
        } else {
            pVarB.p(pVarB.k());
            pVarK = rb.p.b(pVar, pVarB).k();
        }
        rb.j jVar = f31315d;
        float[] fArr = jVar.f43961a;
        fArr[0] = pVarB.f43970a;
        fArr[1] = pVarB.f43971b;
        fArr[2] = pVarB.f43972c;
        fArr[4] = pVarK.f43970a;
        fArr[5] = pVarK.f43971b;
        fArr[6] = pVarK.f43972c;
        fArr[8] = pVar.f43970a;
        fArr[9] = pVar.f43971b;
        fArr[10] = pVar.f43972c;
        rb.l lVar = new rb.l();
        jVar.c(lVar);
        return lVar;
    }

    public void d(d dVar, ArrayList arrayList, ArrayList arrayList2) {
        q.a aVar;
        G7.a.c();
        e(dVar);
        f(dVar);
        arrayList.clear();
        arrayList2.clear();
        int size = 0;
        for (int i10 = 0; i10 < this.f31318c.size(); i10++) {
            b bVar = (b) this.f31318c.get(i10);
            if (i10 < dVar.v().size()) {
                aVar = (q.a) dVar.v().get(i10);
            } else {
                aVar = new q.a();
                dVar.v().add(aVar);
            }
            aVar.f31357a = size;
            size += bVar.d().size();
            aVar.f31358b = size;
            arrayList.add(bVar.b());
            String strC = bVar.c();
            if (strC == null) {
                strC = "";
            }
            arrayList2.add(strC);
        }
        while (dVar.v().size() > this.f31318c.size()) {
            dVar.v().remove(dVar.v().size() - 1);
        }
    }

    public final void e(d dVar) {
        int size = 0;
        for (int i10 = 0; i10 < this.f31318c.size(); i10++) {
            size += ((b) this.f31318c.get(i10)).d().size();
        }
        IntBuffer intBufferS = dVar.s();
        if (intBufferS == null || intBufferS.capacity() < size) {
            intBufferS = IntBuffer.allocate(size);
            dVar.n(intBufferS);
        } else {
            intBufferS.rewind();
        }
        for (int i11 = 0; i11 < this.f31318c.size(); i11++) {
            List listD = ((b) this.f31318c.get(i11)).d();
            for (int i12 = 0; i12 < listD.size(); i12++) {
                intBufferS.put(((Integer) listD.get(i12)).intValue());
            }
        }
        intBufferS.rewind();
        IndexBuffer indexBufferJ = dVar.j();
        if (indexBufferJ == null || indexBufferJ.getIndexCount() < size) {
            if (indexBufferJ != null) {
                AbstractC4754a.j(this.f31316a, indexBufferJ);
            }
            indexBufferJ = new IndexBuffer.Builder().indexCount(size).bufferType(IndexBuffer.Builder.IndexType.UINT).build(this.f31316a);
            dVar.h(indexBufferJ);
        }
        indexBufferJ.setBuffer(this.f31316a, intBufferS, 0, size);
    }

    public final void f(d dVar) {
        boolean z10;
        if (this.f31317b.isEmpty()) {
            throw new IllegalArgumentException("RenderableDescription must have at least one vertex.");
        }
        int size = this.f31317b.size();
        u uVar = (u) this.f31317b.get(0);
        VertexBuffer.VertexAttribute vertexAttribute = VertexBuffer.VertexAttribute.POSITION;
        EnumSet enumSetOf = EnumSet.of(vertexAttribute);
        if (uVar.c() != null) {
            enumSetOf.add(VertexBuffer.VertexAttribute.TANGENTS);
        }
        uVar.e();
        if (uVar.b() != null) {
            enumSetOf.add(VertexBuffer.VertexAttribute.COLOR);
        }
        VertexBuffer vertexBufferK = dVar.k();
        if (vertexBufferK != null) {
            EnumSet enumSetOf2 = EnumSet.of(vertexAttribute);
            if (dVar.l() != null) {
                enumSetOf2.add(VertexBuffer.VertexAttribute.TANGENTS);
            }
            if (dVar.m() != null) {
                enumSetOf2.add(VertexBuffer.VertexAttribute.UV0);
            }
            if (dVar.q() != null) {
                enumSetOf2.add(VertexBuffer.VertexAttribute.COLOR);
            }
            z10 = !enumSetOf2.equals(enumSetOf) || vertexBufferK.getVertexCount() < size;
            if (z10) {
                this.f31316a.destroyVertexBuffer(vertexBufferK);
            }
        } else {
            z10 = true;
        }
        if (z10) {
            vertexBufferK = h(this.f31316a, size, enumSetOf);
            dVar.e(vertexBufferK);
        }
        VertexBuffer vertexBuffer = vertexBufferK;
        FloatBuffer floatBufferO = dVar.o();
        if (floatBufferO == null || floatBufferO.capacity() < size * 3) {
            floatBufferO = FloatBuffer.allocate(size * 3);
            dVar.p(floatBufferO);
        } else {
            floatBufferO.rewind();
        }
        FloatBuffer floatBuffer = floatBufferO;
        FloatBuffer floatBufferL = dVar.l();
        if (enumSetOf.contains(VertexBuffer.VertexAttribute.TANGENTS) && (floatBufferL == null || floatBufferL.capacity() < size * 4)) {
            floatBufferL = FloatBuffer.allocate(size * 4);
            dVar.t(floatBufferL);
        } else if (floatBufferL != null) {
            floatBufferL.rewind();
        }
        FloatBuffer floatBufferM = dVar.m();
        if (enumSetOf.contains(VertexBuffer.VertexAttribute.UV0) && (floatBufferM == null || floatBufferM.capacity() < size * 2)) {
            floatBufferM = FloatBuffer.allocate(size * 2);
            dVar.f(floatBufferM);
        } else if (floatBufferM != null) {
            floatBufferM.rewind();
        }
        FloatBuffer floatBufferQ = dVar.q();
        if (enumSetOf.contains(VertexBuffer.VertexAttribute.COLOR) && (floatBufferQ == null || floatBufferQ.capacity() < size * 4)) {
            floatBufferQ = FloatBuffer.allocate(size * 4);
            dVar.g(floatBufferQ);
        } else if (floatBufferQ != null) {
            floatBufferQ.rewind();
        }
        FloatBuffer floatBuffer2 = floatBufferQ;
        rb.p pVar = new rb.p();
        rb.p pVar2 = new rb.p();
        rb.p pVarD = uVar.d();
        pVar.p(pVarD);
        pVar2.p(pVarD);
        for (int i10 = 0; i10 < this.f31317b.size(); i10++) {
            u uVar2 = (u) this.f31317b.get(i10);
            rb.p pVarD2 = uVar2.d();
            pVar.p(rb.p.i(pVar, pVarD2));
            pVar2.p(rb.p.h(pVar2, pVarD2));
            c(pVarD2, floatBuffer);
            if (floatBufferL != null) {
                rb.p pVarC = uVar2.c();
                if (pVarC == null) {
                    throw new IllegalArgumentException("Missing normal: If any Vertex in a RenderableDescription has a normal, all vertices must have one.");
                }
                b(j(pVarC), floatBufferL);
            }
            if (floatBufferM != null) {
                uVar2.e();
                throw new IllegalArgumentException("Missing UV Coordinate: If any Vertex in a RenderableDescription has a UV Coordinate, all vertices must have one.");
            }
            if (floatBuffer2 != null) {
                com.google.ar.sceneform.rendering.a aVarB = uVar2.b();
                if (aVarB == null) {
                    throw new IllegalArgumentException("Missing Color: If any Vertex in a RenderableDescription has a Color, all vertices must have one.");
                }
                a(aVarB, floatBuffer2);
            }
        }
        rb.p pVarN = rb.p.v(pVar2, pVar).n(0.5f);
        rb.p pVarA = rb.p.a(pVar, pVarN);
        dVar.c(pVarN);
        dVar.i(pVarA);
        if (vertexBuffer == null) {
            throw new AssertionError("VertexBuffer is null.");
        }
        floatBuffer.rewind();
        int i11 = 0;
        vertexBuffer.setBufferAt(this.f31316a, 0, floatBuffer, 0, size * 3);
        if (floatBufferL != null) {
            floatBufferL.rewind();
            i11 = 1;
            vertexBuffer.setBufferAt(this.f31316a, 1, floatBufferL, 0, size * 4);
        }
        if (floatBufferM != null) {
            floatBufferM.rewind();
            i11++;
            vertexBuffer.setBufferAt(this.f31316a, i11, floatBufferM, 0, size * 2);
        }
        if (floatBuffer2 != null) {
            floatBuffer2.rewind();
            vertexBuffer.setBufferAt(this.f31316a, i11 + 1, floatBuffer2, 0, size * 4);
        }
    }

    public List i() {
        return this.f31318c;
    }

    public n(Engine engine, a aVar) {
        this.f31316a = engine;
        this.f31317b = (List) rb.k.c(aVar.f31319a);
        this.f31318c = (List) rb.k.c(aVar.f31320b);
    }
}
