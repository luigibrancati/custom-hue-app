package U;

import B0.c;
import E.AbstractC0807p0;
import E.J0;
import E.V0;
import W.d;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import fc.C4039v;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import s.InterfaceC5702a;

/* JADX INFO: renamed from: U.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C2271t implements P, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f16542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f16543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f16544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f16545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f16546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f16547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f16548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f16549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16550i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f16551j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f16552k;

    /* JADX INFO: renamed from: U.t$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static InterfaceC5702a f16553a = new InterfaceC5702a() { // from class: U.s
            @Override // s.InterfaceC5702a
            public final Object apply(Object obj) {
                return new C2271t((E.J) obj);
            }
        };

        public static P a(E.J j10) {
            return (P) f16553a.apply(j10);
        }
    }

    /* JADX INFO: renamed from: U.t$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class b {
        public static C2253a d(int i10, int i11, c.a aVar) {
            return new C2253a(i10, i11, aVar);
        }

        public abstract c.a a();

        public abstract int b();

        public abstract int c();
    }

    public C2271t(E.J j10) {
        this(j10, Collections.EMPTY_MAP);
    }

    public static /* synthetic */ void e(C2271t c2271t, V0 v02, SurfaceTexture surfaceTexture, Surface surface, V0.g gVar) {
        c2271t.getClass();
        v02.k();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        c2271t.f16550i--;
        c2271t.q();
    }

    public static /* synthetic */ void f(C2271t c2271t) {
        c2271t.f16551j = true;
        c2271t.q();
    }

    public static /* synthetic */ void g(C2271t c2271t, E.J j10, Map map, c.a aVar) {
        c2271t.getClass();
        try {
            c2271t.f16542a.h(j10, map);
            aVar.c(null);
        } catch (RuntimeException e10) {
            aVar.f(e10);
        }
    }

    public static /* synthetic */ Object h(final C2271t c2271t, int i10, int i11, final c.a aVar) {
        c2271t.getClass();
        final C2253a c2253aD = b.d(i10, i11, aVar);
        c2271t.s(new Runnable() { // from class: U.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f16536a.f16552k.add(c2253aD);
            }
        }, new Runnable() { // from class: U.q
            @Override // java.lang.Runnable
            public final void run() {
                aVar.f(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
            }
        });
        return "DefaultSurfaceProcessor#snapshot";
    }

    public static /* synthetic */ void i(C2271t c2271t, V0 v02, V0.h hVar) {
        c2271t.getClass();
        d.e eVar = d.e.DEFAULT;
        if (v02.m().d() && hVar.e()) {
            eVar = d.e.YUV;
        }
        c2271t.f16542a.o(eVar);
    }

    public static /* synthetic */ void j(final C2271t c2271t, final J0 j02) {
        Surface surfaceM0 = j02.m0(c2271t.f16544c, new X0.a() { // from class: U.d
            @Override // X0.a
            public final void accept(Object obj) {
                C2271t.k(this.f16511a, j02, (J0.b) obj);
            }
        });
        c2271t.f16542a.j(surfaceM0);
        c2271t.f16549h.put(j02, surfaceM0);
    }

    public static /* synthetic */ void k(C2271t c2271t, J0 j02, J0.b bVar) {
        c2271t.getClass();
        j02.close();
        Surface surface = (Surface) c2271t.f16549h.remove(j02);
        if (surface != null) {
            c2271t.f16542a.r(surface);
        }
    }

    public static /* synthetic */ Object l(final C2271t c2271t, final E.J j10, final Map map, final c.a aVar) {
        c2271t.getClass();
        c2271t.r(new Runnable() { // from class: U.l
            @Override // java.lang.Runnable
            public final void run() {
                C2271t.g(this.f16526a, j10, map, aVar);
            }
        });
        return "Init GlRenderer";
    }

    public static /* synthetic */ void o(final C2271t c2271t, final V0 v02) {
        c2271t.f16550i++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(c2271t.f16542a.g());
        surfaceTexture.setDefaultBufferSize(v02.n().getWidth(), v02.n().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        v02.s(c2271t.f16544c, new V0.i() { // from class: U.j
            @Override // E.V0.i
            public final void a(V0.h hVar) {
                C2271t.i(this.f16520a, v02, hVar);
            }
        });
        v02.r(surface, c2271t.f16544c, new X0.a() { // from class: U.k
            @Override // X0.a
            public final void accept(Object obj) {
                C2271t.e(this.f16522a, v02, surfaceTexture, surface, (V0.g) obj);
            }
        });
        surfaceTexture.setOnFrameAvailableListener(c2271t, c2271t.f16545d);
    }

    public static /* synthetic */ void p(C2271t c2271t, Runnable runnable, Runnable runnable2) {
        if (c2271t.f16551j) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    @Override // U.P
    public O7.e a(final int i10, final int i11) {
        return O.n.s(B0.c.a(new c.InterfaceC0018c() { // from class: U.o
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar) {
                return C2271t.h(this.f16533a, i10, i11, aVar);
            }
        }));
    }

    @Override // E.K0
    public void b(final V0 v02) {
        if (this.f16546e.get()) {
            v02.u();
            return;
        }
        Runnable runnable = new Runnable() { // from class: U.g
            @Override // java.lang.Runnable
            public final void run() {
                C2271t.o(this.f16516a, v02);
            }
        };
        Objects.requireNonNull(v02);
        s(runnable, new RunnableC2260h(v02));
    }

    @Override // E.K0
    public void c(final J0 j02) {
        if (this.f16546e.get()) {
            j02.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: U.e
            @Override // java.lang.Runnable
            public final void run() {
                C2271t.j(this.f16513a, j02);
            }
        };
        Objects.requireNonNull(j02);
        s(runnable, new RunnableC2258f(j02));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.f16546e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(this.f16547f);
        C4039v c4039v = null;
        for (Map.Entry entry : this.f16549h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            J0 j02 = (J0) entry.getKey();
            j02.t0(this.f16548g, this.f16547f);
            if (j02.getFormat() == 34) {
                try {
                    this.f16542a.n(surfaceTexture.getTimestamp(), this.f16548g, surface);
                } catch (RuntimeException e10) {
                    AbstractC0807p0.d("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e10);
                }
            } else {
                X0.h.j(j02.getFormat() == 256, "Unsupported format: " + j02.getFormat());
                X0.h.j(c4039v == null, "Only one JPEG output is supported.");
                c4039v = new C4039v(surface, j02.getSize(), (float[]) this.f16548g.clone());
            }
        }
        try {
            w(c4039v);
        } catch (RuntimeException e11) {
            t(e11);
        }
    }

    public final void q() {
        if (this.f16551j && this.f16550i == 0) {
            Iterator it = this.f16549h.keySet().iterator();
            while (it.hasNext()) {
                ((J0) it.next()).close();
            }
            Iterator it2 = this.f16552k.iterator();
            while (it2.hasNext()) {
                ((b) it2.next()).a().f(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            this.f16549h.clear();
            this.f16542a.k();
            this.f16543b.quit();
        }
    }

    public final void r(Runnable runnable) {
        s(runnable, new Runnable() { // from class: U.m
            @Override // java.lang.Runnable
            public final void run() {
                C2271t.m();
            }
        });
    }

    @Override // U.P
    public void release() {
        if (this.f16546e.getAndSet(true)) {
            return;
        }
        r(new Runnable() { // from class: U.i
            @Override // java.lang.Runnable
            public final void run() {
                C2271t.f(this.f16519a);
            }
        });
    }

    public final void s(final Runnable runnable, final Runnable runnable2) {
        try {
            this.f16544c.execute(new Runnable() { // from class: U.n
                @Override // java.lang.Runnable
                public final void run() {
                    C2271t.p(this.f16530a, runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e10) {
            AbstractC0807p0.m("DefaultSurfaceProcessor", "Unable to executor runnable", e10);
            runnable2.run();
        }
    }

    public final void t(Throwable th) {
        Iterator it = this.f16552k.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a().f(th);
        }
        this.f16552k.clear();
    }

    public final Bitmap u(Size size, float[] fArr, int i10) {
        float[] fArr2 = (float[]) fArr.clone();
        M.r.c(fArr2, i10, 0.5f, 0.5f);
        M.r.d(fArr2, 0.5f);
        return this.f16542a.p(M.y.n(size, i10), fArr2);
    }

    public final void v(final E.J j10, final Map map) {
        try {
            B0.c.a(new c.InterfaceC0018c() { // from class: U.r
                @Override // B0.c.InterfaceC0018c
                public final Object a(c.a aVar) {
                    return C2271t.l(this.f16539a, j10, map, aVar);
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

    public final void w(C4039v c4039v) {
        if (this.f16552k.isEmpty()) {
            return;
        }
        if (c4039v == null) {
            t(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = this.f16552k.iterator();
                int iC = -1;
                int iB = -1;
                Bitmap bitmapU = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    if (iC != bVar.c() || bitmapU == null) {
                        iC = bVar.c();
                        if (bitmapU != null) {
                            bitmapU.recycle();
                        }
                        bitmapU = u((Size) c4039v.e(), (float[]) c4039v.f(), iC);
                        iB = -1;
                    }
                    if (iB != bVar.b()) {
                        byteArrayOutputStream.reset();
                        iB = bVar.b();
                        bitmapU.compress(Bitmap.CompressFormat.JPEG, iB, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                    }
                    Surface surface = (Surface) c4039v.d();
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.q(surface, byteArray);
                    bVar.a().c(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } finally {
            }
        } catch (IOException e10) {
            t(e10);
        }
    }

    public C2271t(E.J j10, Map map) {
        this.f16546e = new AtomicBoolean(false);
        this.f16547f = new float[16];
        this.f16548g = new float[16];
        this.f16549h = new LinkedHashMap();
        this.f16550i = 0;
        this.f16551j = false;
        this.f16552k = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.f16543b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f16545d = handler;
        this.f16544c = N.a.e(handler);
        this.f16542a = new x();
        try {
            v(j10, map);
        } catch (RuntimeException e10) {
            release();
            throw e10;
        }
    }

    public static /* synthetic */ void m() {
    }
}
