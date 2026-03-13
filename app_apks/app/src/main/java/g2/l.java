package g2;

import G1.AbstractC0853a;
import G1.RunnableC0866n;
import G1.o;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class l extends Surface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f35247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f35248e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f35250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f35251c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RunnableC0866n f35252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Handler f35253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Error f35254c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RuntimeException f35255d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public l f35256e;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        public l a(int i10) {
            boolean z10;
            start();
            this.f35253b = new Handler(getLooper(), this);
            this.f35252a = new RunnableC0866n(this.f35253b);
            synchronized (this) {
                z10 = false;
                this.f35253b.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f35256e == null && this.f35255d == null && this.f35254c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f35255d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f35254c;
            if (error == null) {
                return (l) AbstractC0853a.e(this.f35256e);
            }
            throw error;
        }

        public final void b(int i10) throws o.a {
            AbstractC0853a.e(this.f35252a);
            this.f35252a.h(i10);
            this.f35256e = new l(this, this.f35252a.g(), i10 != 0);
        }

        public void c() {
            AbstractC0853a.e(this.f35253b);
            this.f35253b.sendEmptyMessage(2);
        }

        public final void d() {
            AbstractC0853a.e(this.f35252a);
            this.f35252a.i();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        d();
                    } finally {
                        try {
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (o.a e10) {
                    G1.t.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f35255d = new IllegalStateException(e10);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e11) {
                    G1.t.d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f35254c = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e12) {
                    G1.t.d("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.f35255d = e12;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }
    }

    public static int a(Context context) {
        try {
            if (G1.o.h(context)) {
                return G1.o.i() ? 1 : 2;
            }
            return 0;
        } catch (o.a e10) {
            G1.t.c("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e10.getMessage());
            return 0;
        }
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!f35248e) {
                f35247d = a(context);
                f35248e = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f35247d != 0;
    }

    public static l c(Context context, boolean z10) {
        AbstractC0853a.g(!z10 || b(context));
        return new b().a(z10 ? f35247d : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f35250b) {
            try {
                if (!this.f35251c) {
                    this.f35250b.c();
                    this.f35251c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public l(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f35250b = bVar;
        this.f35249a = z10;
    }
}
