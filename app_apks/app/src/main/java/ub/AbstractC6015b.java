package ub;

import Bc.f;
import Bc.k;
import cb.C3090a;
import cb.C3091b;
import cb.C3092c;
import com.google.android.filament.Box;
import com.google.android.filament.Engine;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.VertexBuffer;
import fc.C4015H;
import gc.C4179C;
import gc.C4206t;
import gc.C4207u;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import ub.AbstractC6014a;
import zb.AbstractC6555a;

/* JADX INFO: renamed from: ub.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6015b {
    public static final RenderableManager.Builder a(RenderableManager.Builder builder, AbstractC6014a geometry, List offsets) {
        AbstractC4862t.e(builder, "<this>");
        AbstractC4862t.e(geometry, "geometry");
        AbstractC4862t.e(offsets, "offsets");
        int i10 = 0;
        for (Object obj : offsets) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C4206t.u();
            }
            f fVar = (f) obj;
            builder.geometry(i10, geometry.c(), geometry.e(), geometry.b(), fVar.c(), C4179C.Z(fVar));
            i10 = i11;
        }
        builder.boundingBox(geometry.a());
        return builder;
    }

    public static final boolean b(List list) {
        AbstractC4862t.e(list, "<this>");
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((AbstractC6014a.b) it.next()).a() != null) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c(List list) {
        AbstractC4862t.e(list, "<this>");
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((AbstractC6014a.b) it.next()).b() != null) {
                return true;
            }
        }
        return false;
    }

    public static final boolean d(List list) {
        AbstractC4862t.e(list, "<this>");
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((AbstractC6014a.b) it.next()).d() != null) {
                return true;
            }
        }
        return false;
    }

    public static final List e(List list) {
        AbstractC4862t.e(list, "<this>");
        ArrayList arrayList = new ArrayList(C4207u.v(list, 10));
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            List list2 = (List) it.next();
            f fVarP = k.p(size, list2.size() + size);
            size += list2.size();
            arrayList.add(fVarP);
        }
        return arrayList;
    }

    public static final void f(IndexBuffer indexBuffer, Engine engine, List indices) {
        AbstractC4862t.e(indexBuffer, "<this>");
        AbstractC4862t.e(engine, "engine");
        AbstractC4862t.e(indices, "indices");
        IntBuffer intBufferAllocate = IntBuffer.allocate(indices.size());
        Iterator it = indices.iterator();
        while (it.hasNext()) {
            intBufferAllocate.put(((Number) it.next()).intValue());
        }
        intBufferAllocate.flip();
        C4015H c4015h = C4015H.f34254a;
        indexBuffer.setBuffer(engine, intBufferAllocate);
    }

    public static final Box g(VertexBuffer vertexBuffer, Engine engine, List vertices) {
        AbstractC4862t.e(vertexBuffer, "<this>");
        AbstractC4862t.e(engine, "engine");
        AbstractC4862t.e(vertices, "vertices");
        FloatBuffer floatBufferAllocate = FloatBuffer.allocate(vertices.size() * 3);
        Iterator it = vertices.iterator();
        while (it.hasNext()) {
            floatBufferAllocate.put(((AbstractC6014a.b) it.next()).c().d());
        }
        floatBufferAllocate.flip();
        C4015H c4015h = C4015H.f34254a;
        int i10 = 0;
        vertexBuffer.setBufferAt(engine, 0, floatBufferAllocate, 0, vertices.size() * 3);
        if (c(vertices)) {
            FloatBuffer floatBufferAllocate2 = FloatBuffer.allocate(vertices.size() * 4);
            Iterator it2 = vertices.iterator();
            while (it2.hasNext()) {
                C3091b c3091bB = ((AbstractC6014a.b) it2.next()).b();
                AbstractC4862t.b(c3091bB);
                floatBufferAllocate2.put(AbstractC6555a.l(c3091bB).e());
            }
            floatBufferAllocate2.flip();
            C4015H c4015h2 = C4015H.f34254a;
            vertexBuffer.setBufferAt(engine, 1, floatBufferAllocate2, 0, vertices.size() * 4);
            i10 = 1;
        }
        if (d(vertices)) {
            int i11 = i10 + 1;
            FloatBuffer floatBufferAllocate3 = FloatBuffer.allocate(vertices.size() * 2);
            Iterator it3 = vertices.iterator();
            while (it3.hasNext()) {
                C3090a c3090aD = ((AbstractC6014a.b) it3.next()).d();
                AbstractC4862t.b(c3090aD);
                floatBufferAllocate3.put(c3090aD.c());
            }
            floatBufferAllocate3.rewind();
            C4015H c4015h3 = C4015H.f34254a;
            vertexBuffer.setBufferAt(engine, i11, floatBufferAllocate3, 0, vertices.size() * 2);
            i10 = i11;
        }
        if (b(vertices)) {
            int i12 = i10 + 1;
            FloatBuffer floatBufferAllocate4 = FloatBuffer.allocate(vertices.size() * 4);
            Iterator it4 = vertices.iterator();
            while (it4.hasNext()) {
                C3092c c3092cA = ((AbstractC6014a.b) it4.next()).a();
                AbstractC4862t.b(c3092cA);
                floatBufferAllocate4.put(c3092cA.i());
            }
            floatBufferAllocate4.rewind();
            C4015H c4015h4 = C4015H.f34254a;
            vertexBuffer.setBufferAt(engine, i12, floatBufferAllocate4, 0, vertices.size() * 4);
        }
        C3091b c3091b = new C3091b(((AbstractC6014a.b) C4179C.h0(vertices)).c());
        C3091b c3091b2 = new C3091b(((AbstractC6014a.b) C4179C.h0(vertices)).c());
        Iterator it5 = vertices.iterator();
        while (it5.hasNext()) {
            AbstractC6014a.b bVar = (AbstractC6014a.b) it5.next();
            C3091b c3091bC = bVar.c();
            C3091b c3091b3 = new C3091b(Math.min(c3091b.a(), c3091bC.a()), Math.min(c3091b.b(), c3091bC.b()), Math.min(c3091b.c(), c3091bC.c()));
            C3091b c3091bC2 = bVar.c();
            c3091b2 = new C3091b(Math.max(c3091b2.a(), c3091bC2.a()), Math.max(c3091b2.b(), c3091bC2.b()), Math.max(c3091b2.c(), c3091bC2.c()));
            c3091b = c3091b3;
        }
        C3091b c3091b4 = new C3091b(c3091b2.a() - c3091b.a(), c3091b2.b() - c3091b.b(), c3091b2.c() - c3091b.c());
        C3091b c3091b5 = new C3091b(c3091b4.a() / 2.0f, c3091b4.b() / 2.0f, c3091b4.c() / 2.0f);
        return AbstractC6555a.a(new C3091b(c3091b.a() + c3091b5.a(), c3091b.b() + c3091b5.b(), c3091b.c() + c3091b5.c()), c3091b5);
    }
}
