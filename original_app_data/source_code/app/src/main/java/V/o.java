package V;

import B0.c;
import E.AbstractC0807p0;
import E.I;
import E.J;
import E.J0;
import E.V0;
import U.P;
import U.RunnableC2258f;
import U.RunnableC2260h;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class o implements P, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f17164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f17165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f17166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f17167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f17170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f17171h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SurfaceTexture f17172i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SurfaceTexture f17173j;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static vc.q f17174a = new vc.q() { // from class: V.n
            @Override // vc.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return new o((J) obj, (I) obj2, (I) obj3);
            }
        };

        public static P a(J j10, I i10, I i11) {
            return (P) f17174a.invoke(j10, i10, i11);
        }
    }

    public o(J j10, I i10, I i11) {
        this(j10, Collections.EMPTY_MAP, i10, i11);
    }

    public static /* synthetic */ void d(o oVar, Runnable runnable, Runnable runnable2) {
        if (oVar.f17169f) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    public static /* synthetic */ void f(o oVar, SurfaceTexture surfaceTexture, Surface surface, V0.g gVar) {
        oVar.getClass();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        oVar.f17168e--;
        oVar.m();
    }

    public static /* synthetic */ void g(o oVar) {
        oVar.f17169f = true;
        oVar.m();
    }

    public static /* synthetic */ void h(o oVar, J0 j02, J0.b bVar) {
        oVar.getClass();
        j02.close();
        Surface surface = (Surface) oVar.f17171h.remove(j02);
        if (surface != null) {
            oVar.f17164a.r(surface);
        }
    }

    public static /* synthetic */ void i(final o oVar, final J0 j02) {
        Surface surfaceM0 = j02.m0(oVar.f17166c, new X0.a() { // from class: V.f
            @Override // X0.a
            public final void accept(Object obj) {
                o.h(this.f17148a, j02, (J0.b) obj);
            }
        });
        oVar.f17164a.j(surfaceM0);
        oVar.f17171h.put(j02, surfaceM0);
    }

    public static /* synthetic */ void j(final o oVar, V0 v02) {
        oVar.f17168e++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(oVar.f17164a.t(v02.q()));
        surfaceTexture.setDefaultBufferSize(v02.n().getWidth(), v02.n().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        v02.r(surface, oVar.f17166c, new X0.a() { // from class: V.i
            @Override // X0.a
            public final void accept(Object obj) {
                o.f(this.f17153a, surfaceTexture, surface, (V0.g) obj);
            }
        });
        if (v02.q()) {
            oVar.f17172i = surfaceTexture;
        } else {
            oVar.f17173j = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(oVar, oVar.f17167d);
        }
    }

    public static /* synthetic */ void k(o oVar, J j10, Map map, c.a aVar) {
        oVar.getClass();
        try {
            oVar.f17164a.h(j10, map);
            aVar.c(null);
        } catch (RuntimeException e10) {
            aVar.f(e10);
        }
    }

    public static /* synthetic */ Object l(final o oVar, final J j10, final Map map, final c.a aVar) {
        oVar.getClass();
        oVar.n(new Runnable() { // from class: V.e
            @Override // java.lang.Runnable
            public final void run() {
                o.k(this.f17144a, j10, map, aVar);
            }
        });
        return "Init GlRenderer";
    }

    private void m() {
        if (this.f17169f && this.f17168e == 0) {
            Iterator it = this.f17171h.keySet().iterator();
            while (it.hasNext()) {
                ((J0) it.next()).close();
            }
            this.f17171h.clear();
            this.f17164a.k();
            this.f17165b.quit();
        }
    }

    private void n(Runnable runnable) {
        o(runnable, new Runnable() { // from class: V.h
            @Override // java.lang.Runnable
            public final void run() {
                o.e();
            }
        });
    }

    private void o(final Runnable runnable, final Runnable runnable2) {
        try {
            this.f17166c.execute(new Runnable() { // from class: V.g
                @Override // java.lang.Runnable
                public final void run() {
                    o.d(this.f17150a, runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e10) {
            AbstractC0807p0.m("DualSurfaceProcessor", "Unable to executor runnable", e10);
            runnable2.run();
        }
    }

    private void p(final J j10, final Map map) {
        try {
            B0.c.a(new c.InterfaceC0018c() { // from class: V.l
                @Override // B0.c.InterfaceC0018c
                public final Object a(c.a aVar) {
                    return o.l(this.f17159a, j10, map, aVar);
                }
            }).get();
        } catch (InterruptedException | ExecutionException e10) {
            e = e10;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (!(e instanceof RuntimeException)) {
                throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
            }
            throw ((RuntimeException) e);
        }
    }

    @Override // E.K0
    public void b(final V0 v02) {
        if (this.f17170g.get()) {
            v02.u();
            return;
        }
        Runnable runnable = new Runnable() { // from class: V.k
            @Override // java.lang.Runnable
            public final void run() {
                o.j(this.f17157a, v02);
            }
        };
        Objects.requireNonNull(v02);
        o(runnable, new RunnableC2260h(v02));
    }

    @Override // E.K0
    public void c(final J0 j02) {
        if (this.f17170g.get()) {
            j02.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: V.m
            @Override // java.lang.Runnable
            public final void run() {
                o.i(this.f17162a, j02);
            }
        };
        Objects.requireNonNull(j02);
        o(runnable, new RunnableC2258f(j02));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.f17170g.get() || (surfaceTexture2 = this.f17172i) == null || this.f17173j == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.f17173j.updateTexImage();
        for (Map.Entry entry : this.f17171h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            J0 j02 = (J0) entry.getKey();
            if (j02.getFormat() == 34) {
                try {
                    this.f17164a.v(surfaceTexture.getTimestamp(), surface, j02, this.f17172i, this.f17173j);
                } catch (RuntimeException e10) {
                    AbstractC0807p0.d("DualSurfaceProcessor", "Failed to render with OpenGL.", e10);
                }
            }
        }
    }

    @Override // U.P
    public void release() {
        if (this.f17170g.getAndSet(true)) {
            return;
        }
        n(new Runnable() { // from class: V.j
            @Override // java.lang.Runnable
            public final void run() {
                o.g(this.f17156a);
            }
        });
    }

    public o(J j10, Map map, I i10, I i11) {
        this.f17168e = 0;
        this.f17169f = false;
        this.f17170g = new AtomicBoolean(false);
        this.f17171h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.f17165b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f17167d = handler;
        this.f17166c = N.a.e(handler);
        this.f17164a = new c(i10, i11);
        try {
            p(j10, map);
        } catch (RuntimeException e10) {
            release();
            throw e10;
        }
    }

    public static /* synthetic */ void e() {
    }
}
