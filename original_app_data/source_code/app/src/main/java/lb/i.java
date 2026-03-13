package lb;

import com.google.android.filament.Engine;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.Scene;
import com.google.android.filament.TransformManager;
import com.google.ar.core.Plane;
import com.google.ar.core.TrackingState;
import com.google.ar.sceneform.rendering.i;
import com.google.ar.sceneform.rendering.n;
import com.google.ar.sceneform.rendering.p;
import com.google.ar.sceneform.rendering.u;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import rb.o;
import wb.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class i implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Engine f40065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f40066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Scene f40067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Plane f40068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final rb.j f40069e = new rb.j();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f40070f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f40071g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f40072h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f40073i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.google.ar.sceneform.rendering.i f40074j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p f40075k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f40076l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f40077m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n f40078n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n.b f40079o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public n.b f40080p;

    public i(Engine engine, l lVar, Scene scene, Plane plane) {
        ArrayList arrayList = new ArrayList();
        this.f40076l = arrayList;
        this.f40077m = new ArrayList();
        this.f40065a = engine;
        this.f40066b = lVar;
        this.f40067c = scene;
        this.f40068d = plane;
        this.f40078n = n.g().d(arrayList).c(engine);
    }

    public final void a() {
        p pVar;
        if (this.f40070f || (pVar = this.f40075k) == null) {
            return;
        }
        this.f40067c.addEntity(pVar.o());
        this.f40070f = true;
    }

    public void b() {
        c();
        p pVar = this.f40075k;
        if (pVar != null) {
            pVar.g();
        }
        this.f40074j = null;
    }

    public final void c() {
        p pVar;
        if (!this.f40070f || (pVar = this.f40075k) == null) {
            return;
        }
        this.f40067c.removeEntity(pVar.o());
        this.f40070f = false;
    }

    public void d(boolean z10) {
        if (this.f40071g != z10) {
            this.f40071g = z10;
            i();
        }
    }

    public void e(MaterialInstance materialInstance) {
        n.b bVar = this.f40079o;
        if (bVar == null) {
            this.f40079o = n.b.a().f(this.f40077m).e(materialInstance).d(this.f40065a);
        } else {
            bVar.e(materialInstance);
        }
        if (this.f40074j != null) {
            j();
        }
    }

    public void f(MaterialInstance materialInstance) {
        n.b bVar = this.f40080p;
        if (bVar == null) {
            this.f40080p = n.b.a().f(this.f40077m).e(materialInstance).d(this.f40065a);
        } else {
            bVar.e(materialInstance);
        }
        if (this.f40074j != null) {
            j();
        }
    }

    public void g(boolean z10) {
        if (this.f40072h != z10) {
            this.f40072h = z10;
            i();
        }
    }

    public void h(boolean z10) {
        if (this.f40073i != z10) {
            this.f40073i = z10;
            i();
        }
    }

    public void i() {
        if (!this.f40071g || (!this.f40073i && !this.f40072h)) {
            c();
            return;
        }
        if (this.f40068d.getTrackingState() != TrackingState.TRACKING) {
            c();
            return;
        }
        this.f40068d.getCenterPose().toMatrix(this.f40069e.f43961a, 0);
        if (!k()) {
            c();
        } else {
            j();
            a();
        }
    }

    public void j() {
        n.b bVar;
        n.b bVar2;
        List listI = this.f40078n.i();
        listI.clear();
        if (this.f40073i && (bVar2 = this.f40079o) != null) {
            listI.add(bVar2);
        }
        if (this.f40072h && (bVar = this.f40080p) != null) {
            listI.add(bVar);
        }
        if (listI.isEmpty()) {
            c();
            return;
        }
        com.google.ar.sceneform.rendering.i iVar = this.f40074j;
        if (iVar == null) {
            try {
                com.google.ar.sceneform.rendering.i iVar2 = (com.google.ar.sceneform.rendering.i) ((i.a) com.google.ar.sceneform.rendering.i.q().s(this.f40078n)).h(this.f40065a).get();
                this.f40074j = iVar2;
                iVar2.n(false);
                this.f40074j.o(true);
                this.f40075k = this.f40074j.a(this.f40065a, this.f40066b.d(), this.f40066b.e(), this);
            } catch (InterruptedException | ExecutionException unused) {
                throw new AssertionError("Unable to create plane renderable.");
            }
        } else {
            iVar.p(this.f40078n);
        }
        if (this.f40075k != null && listI.size() > 1) {
            this.f40075k.r(0, 0);
            this.f40075k.r(1, 1);
        }
        this.f40075k.q(this.f40065a);
        TransformManager transformManager = this.f40065a.getTransformManager();
        transformManager.setTransform(transformManager.getInstance(this.f40075k.j()), this.f40075k.p().f43961a);
    }

    public final boolean k() {
        FloatBuffer polygon = this.f40068d.getPolygon();
        int i10 = 0;
        if (polygon == null) {
            return false;
        }
        polygon.rewind();
        int iLimit = polygon.limit() / 2;
        if (iLimit == 0) {
            return false;
        }
        this.f40076l.clear();
        this.f40076l.ensureCapacity(iLimit * 2);
        int i11 = iLimit - 2;
        this.f40077m.clear();
        this.f40077m.ensureCapacity((iLimit * 6) + (i11 * 3));
        rb.p pVarW = rb.p.w();
        while (polygon.hasRemaining()) {
            this.f40076l.add(u.a().g(new rb.p(polygon.get(), 0.0f, polygon.get())).f(pVarW).e());
        }
        polygon.rewind();
        while (polygon.hasRemaining()) {
            float f10 = polygon.get();
            float f11 = polygon.get();
            float fHypot = (float) Math.hypot(f10, f11);
            float fMin = fHypot != 0.0f ? 1.0f - Math.min(0.2f / fHypot, 0.2f) : 0.8f;
            this.f40076l.add(u.a().g(new rb.p(f10 * fMin, 1.0f, f11 * fMin)).f(pVarW).e());
        }
        short s10 = (short) iLimit;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f40077m.add(Integer.valueOf(s10));
            int i13 = s10 + i12;
            this.f40077m.add(Integer.valueOf(i13 + 1));
            this.f40077m.add(Integer.valueOf(i13 + 2));
        }
        while (i10 < iLimit) {
            int i14 = i10 + 1;
            int i15 = i14 % iLimit;
            int i16 = s10 + i10;
            this.f40077m.add(Integer.valueOf(i10));
            this.f40077m.add(Integer.valueOf(i15));
            this.f40077m.add(Integer.valueOf(i16));
            this.f40077m.add(Integer.valueOf(i16));
            this.f40077m.add(Integer.valueOf(i15));
            this.f40077m.add(Integer.valueOf(s10 + i15));
            i10 = i14;
        }
        return true;
    }

    @Override // rb.o
    public rb.j p() {
        return this.f40069e;
    }
}
