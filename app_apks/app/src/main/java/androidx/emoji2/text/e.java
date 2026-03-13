package androidx.emoji2.text;

import U0.m;
import V0.g;
import X0.h;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import androidx.emoji2.text.c;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import n1.AbstractC5071b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class e extends c.AbstractC0290c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f22978k = new a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public Typeface a(Context context, g.b bVar) {
            return g.a(context, null, new g.b[]{bVar});
        }

        public g.a b(Context context, V0.e eVar) {
            return g.b(context, null, eVar);
        }

        public void c(Context context, Uri uri, ContentObserver contentObserver) {
            context.getContentResolver().registerContentObserver(uri, false, contentObserver);
        }

        public void d(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b implements c.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f22979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final V0.e f22980b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f22981c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f22982d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Handler f22983e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Executor f22984f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ThreadPoolExecutor f22985g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public c f22986h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public c.i f22987i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public ContentObserver f22988j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Runnable f22989k;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a extends ContentObserver {
            public a(Handler handler) {
                super(handler);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z10, Uri uri) {
                b.this.d();
            }
        }

        public b(Context context, V0.e eVar, a aVar) {
            h.h(context, "Context cannot be null");
            h.h(eVar, "FontRequest cannot be null");
            this.f22979a = context.getApplicationContext();
            this.f22980b = eVar;
            this.f22981c = aVar;
        }

        @Override // androidx.emoji2.text.c.h
        public void a(c.i iVar) {
            h.h(iVar, "LoaderCallback cannot be null");
            synchronized (this.f22982d) {
                this.f22987i = iVar;
            }
            d();
        }

        public final void b() {
            synchronized (this.f22982d) {
                try {
                    this.f22987i = null;
                    ContentObserver contentObserver = this.f22988j;
                    if (contentObserver != null) {
                        this.f22981c.d(this.f22979a, contentObserver);
                        this.f22988j = null;
                    }
                    Handler handler = this.f22983e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f22989k);
                    }
                    this.f22983e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f22985g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f22984f = null;
                    this.f22985g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void c() {
            synchronized (this.f22982d) {
                try {
                    if (this.f22987i == null) {
                        return;
                    }
                    try {
                        g.b bVarE = e();
                        int iB = bVarE.b();
                        if (iB == 2) {
                            synchronized (this.f22982d) {
                                try {
                                    c cVar = this.f22986h;
                                    if (cVar != null) {
                                        long jA = cVar.a();
                                        if (jA >= 0) {
                                            f(bVarE.e(), jA);
                                            return;
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                        if (iB != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iB + ")");
                        }
                        try {
                            m.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceA = this.f22981c.a(this.f22979a, bVarE);
                            ByteBuffer byteBufferA = O0.h.a(this.f22979a, null, bVarE.e());
                            if (byteBufferA == null || typefaceA == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            f fVarB = f.b(typefaceA, byteBufferA);
                            m.b();
                            synchronized (this.f22982d) {
                                try {
                                    c.i iVar = this.f22987i;
                                    if (iVar != null) {
                                        iVar.b(fVarB);
                                    }
                                } finally {
                                }
                            }
                            b();
                        } catch (Throwable th) {
                            m.b();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        synchronized (this.f22982d) {
                            try {
                                c.i iVar2 = this.f22987i;
                                if (iVar2 != null) {
                                    iVar2.a(th2);
                                }
                                b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public void d() {
            synchronized (this.f22982d) {
                try {
                    if (this.f22987i == null) {
                        return;
                    }
                    if (this.f22984f == null) {
                        ThreadPoolExecutor threadPoolExecutorB = AbstractC5071b.b("emojiCompat");
                        this.f22985g = threadPoolExecutorB;
                        this.f22984f = threadPoolExecutorB;
                    }
                    this.f22984f.execute(new Runnable() { // from class: n1.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f40502a.c();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final g.b e() {
            try {
                g.a aVarB = this.f22981c.b(this.f22979a, this.f22980b);
                if (aVarB.e() == 0) {
                    g.b[] bVarArrC = aVarB.c();
                    if (bVarArrC == null || bVarArrC.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return bVarArrC[0];
                }
                throw new RuntimeException("fetchFonts failed (" + aVarB.e() + ")");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }

        public final void f(Uri uri, long j10) {
            synchronized (this.f22982d) {
                try {
                    Handler handlerC = this.f22983e;
                    if (handlerC == null) {
                        handlerC = AbstractC5071b.c();
                        this.f22983e = handlerC;
                    }
                    if (this.f22988j == null) {
                        a aVar = new a(handlerC);
                        this.f22988j = aVar;
                        this.f22981c.c(this.f22979a, uri, aVar);
                    }
                    if (this.f22989k == null) {
                        this.f22989k = new Runnable() { // from class: n1.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f40503a.d();
                            }
                        };
                    }
                    handlerC.postDelayed(this.f22989k, j10);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void g(Executor executor) {
            synchronized (this.f22982d) {
                this.f22984f = executor;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class c {
        public abstract long a();
    }

    public e(Context context, V0.e eVar) {
        super(new b(context, eVar, f22978k));
    }

    public e c(Executor executor) {
        ((b) a()).g(executor);
        return this;
    }
}
