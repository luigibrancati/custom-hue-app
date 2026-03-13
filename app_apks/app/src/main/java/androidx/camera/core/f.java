package androidx.camera.core;

import E.H0;
import L.InterfaceC1134y0;
import android.view.Surface;
import androidx.camera.core.b;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class f implements InterfaceC1134y0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1134y0 f22009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Surface f22010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b.a f22011f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f22006a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22007b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22008c = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b.a f22012g = new b.a() { // from class: E.D0
        @Override // androidx.camera.core.b.a
        public final void a(androidx.camera.core.d dVar) {
            androidx.camera.core.f.g(this.f2727a, dVar);
        }
    };

    public f(InterfaceC1134y0 interfaceC1134y0) {
        this.f22009d = interfaceC1134y0;
        this.f22010e = interfaceC1134y0.getSurface();
    }

    public static /* synthetic */ void a(f fVar, InterfaceC1134y0.a aVar, InterfaceC1134y0 interfaceC1134y0) {
        fVar.getClass();
        aVar.a(fVar);
    }

    public static /* synthetic */ void g(f fVar, d dVar) {
        b.a aVar;
        synchronized (fVar.f22006a) {
            try {
                int i10 = fVar.f22007b - 1;
                fVar.f22007b = i10;
                if (fVar.f22008c && i10 == 0) {
                    fVar.close();
                }
                aVar = fVar.f22011f;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.a(dVar);
        }
    }

    @Override // L.InterfaceC1134y0
    public d acquireLatestImage() {
        d dVarK;
        synchronized (this.f22006a) {
            dVarK = k(this.f22009d.acquireLatestImage());
        }
        return dVarK;
    }

    @Override // L.InterfaceC1134y0
    public int b() {
        int iB;
        synchronized (this.f22006a) {
            iB = this.f22009d.b();
        }
        return iB;
    }

    @Override // L.InterfaceC1134y0
    public void c() {
        synchronized (this.f22006a) {
            this.f22009d.c();
        }
    }

    @Override // L.InterfaceC1134y0
    public void close() {
        synchronized (this.f22006a) {
            try {
                Surface surface = this.f22010e;
                if (surface != null) {
                    surface.release();
                }
                this.f22009d.close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // L.InterfaceC1134y0
    public void d(final InterfaceC1134y0.a aVar, Executor executor) {
        synchronized (this.f22006a) {
            this.f22009d.d(new InterfaceC1134y0.a() { // from class: E.C0
                @Override // L.InterfaceC1134y0.a
                public final void a(InterfaceC1134y0 interfaceC1134y0) {
                    androidx.camera.core.f.a(this.f2723a, aVar, interfaceC1134y0);
                }
            }, executor);
        }
    }

    @Override // L.InterfaceC1134y0
    public int e() {
        int iE;
        synchronized (this.f22006a) {
            iE = this.f22009d.e();
        }
        return iE;
    }

    @Override // L.InterfaceC1134y0
    public d f() {
        d dVarK;
        synchronized (this.f22006a) {
            dVarK = k(this.f22009d.f());
        }
        return dVarK;
    }

    @Override // L.InterfaceC1134y0
    public int getHeight() {
        int height;
        synchronized (this.f22006a) {
            height = this.f22009d.getHeight();
        }
        return height;
    }

    @Override // L.InterfaceC1134y0
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f22006a) {
            surface = this.f22009d.getSurface();
        }
        return surface;
    }

    @Override // L.InterfaceC1134y0
    public int getWidth() {
        int width;
        synchronized (this.f22006a) {
            width = this.f22009d.getWidth();
        }
        return width;
    }

    public int h() {
        int iE;
        synchronized (this.f22006a) {
            iE = this.f22009d.e() - this.f22007b;
        }
        return iE;
    }

    public void i() {
        synchronized (this.f22006a) {
            try {
                this.f22008c = true;
                this.f22009d.c();
                if (this.f22007b == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(b.a aVar) {
        synchronized (this.f22006a) {
            this.f22011f = aVar;
        }
    }

    public final d k(d dVar) {
        if (dVar == null) {
            return null;
        }
        this.f22007b++;
        H0 h02 = new H0(dVar);
        h02.a(this.f22012g);
        return h02;
    }
}
