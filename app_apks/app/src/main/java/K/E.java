package K;

import E.G0;
import L.InterfaceC1134y0;
import L.k1;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class E implements InterfaceC1134y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1134y0 f6509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Q f6510b;

    public E(InterfaceC1134y0 interfaceC1134y0) {
        this.f6509a = interfaceC1134y0;
    }

    public static /* synthetic */ void a(E e10, InterfaceC1134y0.a aVar, InterfaceC1134y0 interfaceC1134y0) {
        e10.getClass();
        aVar.a(e10);
    }

    @Override // L.InterfaceC1134y0
    public androidx.camera.core.d acquireLatestImage() {
        return i(this.f6509a.acquireLatestImage());
    }

    @Override // L.InterfaceC1134y0
    public int b() {
        return this.f6509a.b();
    }

    @Override // L.InterfaceC1134y0
    public void c() {
        this.f6509a.c();
    }

    @Override // L.InterfaceC1134y0
    public void close() {
        this.f6509a.close();
    }

    @Override // L.InterfaceC1134y0
    public void d(final InterfaceC1134y0.a aVar, Executor executor) {
        this.f6509a.d(new InterfaceC1134y0.a() { // from class: K.D
            @Override // L.InterfaceC1134y0.a
            public final void a(InterfaceC1134y0 interfaceC1134y0) {
                E.a(this.f6507a, aVar, interfaceC1134y0);
            }
        }, executor);
    }

    @Override // L.InterfaceC1134y0
    public int e() {
        return this.f6509a.e();
    }

    @Override // L.InterfaceC1134y0
    public androidx.camera.core.d f() {
        return i(this.f6509a.f());
    }

    public void g(Q q10) {
        X0.h.j(this.f6510b == null, "Pending request should be null");
        this.f6510b = q10;
    }

    @Override // L.InterfaceC1134y0
    public int getHeight() {
        return this.f6509a.getHeight();
    }

    @Override // L.InterfaceC1134y0
    public Surface getSurface() {
        return this.f6509a.getSurface();
    }

    @Override // L.InterfaceC1134y0
    public int getWidth() {
        return this.f6509a.getWidth();
    }

    public void h() {
        this.f6510b = null;
    }

    public final androidx.camera.core.d i(androidx.camera.core.d dVar) {
        if (dVar == null) {
            return null;
        }
        k1 k1VarB = this.f6510b == null ? k1.b() : k1.a(new Pair(this.f6510b.j(), this.f6510b.i().get(0)));
        this.f6510b = null;
        return new G0(dVar, new Size(dVar.getWidth(), dVar.getHeight()), new P.c(new Y.k(k1VarB, dVar.L0().getTimestamp())));
    }
}
