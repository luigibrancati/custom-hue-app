package u8;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h8.C4288f;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import r8.InterfaceC5672a;
import s8.InterfaceC5810a;
import t8.InterfaceC5858a;
import w8.C6169f;

/* JADX INFO: renamed from: u8.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5983B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f45234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4288f f45235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H f45236c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C f45239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C f45240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f45241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C5999p f45242i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final M f45243j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final A8.g f45244k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t8.b f45245l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceC5810a f45246m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C5996m f45247n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC5672a f45248o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r8.k f45249p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v8.i f45250q;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f45238e = System.currentTimeMillis();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S f45237d = new S();

    public C5983B(C4288f c4288f, M m10, InterfaceC5672a interfaceC5672a, H h10, t8.b bVar, InterfaceC5810a interfaceC5810a, A8.g gVar, C5996m c5996m, r8.k kVar, v8.i iVar) {
        this.f45235b = c4288f;
        this.f45236c = h10;
        this.f45234a = c4288f.m();
        this.f45243j = m10;
        this.f45248o = interfaceC5672a;
        this.f45245l = bVar;
        this.f45246m = interfaceC5810a;
        this.f45244k = gVar;
        this.f45247n = c5996m;
        this.f45249p = kVar;
        this.f45250q = iVar;
    }

    public static /* synthetic */ void c(C5983B c5983b, Throwable th) {
        c5983b.f45242i.W("com.crashlytics.on-demand.recorded-exceptions", Integer.toString(c5983b.f45237d.b()));
        c5983b.f45242i.W("com.crashlytics.on-demand.dropped-exceptions", Integer.toString(c5983b.f45237d.a()));
        c5983b.f45242i.O(Thread.currentThread(), th);
    }

    public static String s() {
        return "20.0.3";
    }

    public static boolean t(String str, boolean z10) {
        if (!z10) {
            r8.g.f().i("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".     |  | ");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
        Log.e("FirebaseCrashlytics", ".    \\    /");
        Log.e("FirebaseCrashlytics", ".     \\  /");
        Log.e("FirebaseCrashlytics", ".      \\/");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".      /\\");
        Log.e("FirebaseCrashlytics", ".     /  \\");
        Log.e("FirebaseCrashlytics", ".    /    \\");
        Log.e("FirebaseCrashlytics", ".   / |  | \\");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".");
        return false;
    }

    public Task A() {
        return this.f45242i.U();
    }

    public void B(Boolean bool) {
        this.f45236c.h(bool);
    }

    public void C(final String str, final String str2) {
        this.f45250q.f45901a.e(new Runnable() { // from class: u8.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f45393a.f45242i.V(str, str2);
            }
        });
    }

    public void D(final String str, final String str2) {
        this.f45250q.f45901a.e(new Runnable() { // from class: u8.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f45396a.f45242i.W(str, str2);
            }
        });
    }

    public void E(final String str) {
        this.f45250q.f45901a.e(new Runnable() { // from class: u8.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f45391a.f45242i.X(str);
            }
        });
    }

    public final void k() {
        try {
            this.f45241h = Boolean.TRUE.equals((Boolean) this.f45250q.f45901a.d().submit(new Callable() { // from class: u8.x
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(this.f45402a.f45242i.t());
                }
            }).get(3L, TimeUnit.SECONDS));
        } catch (Exception unused) {
            this.f45241h = false;
        }
    }

    public Task l() {
        return this.f45242i.n();
    }

    public Task m() {
        return this.f45242i.s();
    }

    public boolean n() {
        return this.f45241h;
    }

    public boolean o() {
        return this.f45239f.c();
    }

    public final void p(C8.j jVar) {
        v8.i.c();
        y();
        try {
            try {
                this.f45245l.a(new InterfaceC5858a() { // from class: u8.A
                    @Override // t8.InterfaceC5858a
                    public final void a(String str) {
                        this.f45233a.u(str);
                    }
                });
                this.f45242i.T();
                if (!jVar.b().f1171b.f1178a) {
                    r8.g.f().b("Collection of crash reports disabled in Crashlytics settings.");
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.f45242i.A(jVar)) {
                    r8.g.f().k("Previous sessions could not be finalized.");
                }
                this.f45242i.Y(jVar.a());
                x();
            } catch (Exception e10) {
                r8.g.f().e("Crashlytics encountered a problem during asynchronous initialization.", e10);
                x();
            }
        } catch (Throwable th) {
            x();
            throw th;
        }
    }

    public Task q(final C8.j jVar) {
        return this.f45250q.f45901a.e(new Runnable() { // from class: u8.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f45384a.p(jVar);
            }
        });
    }

    public final void r(final C8.j jVar) {
        Future<?> futureSubmit = this.f45250q.f45901a.d().submit(new Runnable() { // from class: u8.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f45406a.p(jVar);
            }
        });
        r8.g.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            r8.g.f().e("Crashlytics was interrupted during initialization.", e10);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e11) {
            r8.g.f().e("Crashlytics encountered a problem during initialization.", e11);
        } catch (TimeoutException e12) {
            r8.g.f().e("Crashlytics timed out during initialization.", e12);
        }
    }

    public void u(final String str) {
        final long jCurrentTimeMillis = System.currentTimeMillis() - this.f45238e;
        this.f45250q.f45901a.e(new Runnable() { // from class: u8.y
            @Override // java.lang.Runnable
            public final void run() {
                C5983B c5983b = this.f45403a;
                c5983b.f45250q.f45902b.e(new Runnable() { // from class: u8.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f45386a.f45242i.c0(j, str);
                    }
                });
            }
        });
    }

    public void v(final Throwable th, final Map map) {
        this.f45250q.f45901a.e(new Runnable() { // from class: u8.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f45399a.f45242i.b0(Thread.currentThread(), th, map);
            }
        });
    }

    public void w(final Throwable th) {
        r8.g.f().b("Recorded on-demand fatal events: " + this.f45237d.b());
        r8.g.f().b("Dropped on-demand fatal events: " + this.f45237d.a());
        this.f45250q.f45901a.e(new Runnable() { // from class: u8.s
            @Override // java.lang.Runnable
            public final void run() {
                C5983B.c(this.f45389a, th);
            }
        });
    }

    public void x() {
        v8.i.c();
        try {
            if (this.f45239f.d()) {
                return;
            }
            r8.g.f().k("Initialization marker file was not properly removed.");
        } catch (Exception e10) {
            r8.g.f().e("Problem encountered deleting Crashlytics initialization marker.", e10);
        }
    }

    public void y() {
        v8.i.c();
        this.f45239f.a();
        r8.g.f().i("Initialization marker file was created.");
    }

    public boolean z(C5984a c5984a, C8.j jVar) {
        if (!t(c5984a.f45314b, C5992i.i(this.f45234a, "com.crashlytics.RequireBuildId", true))) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        String strC = new C5991h().c();
        try {
            this.f45240g = new C("crash_marker", this.f45244k);
            this.f45239f = new C("initialization_marker", this.f45244k);
            w8.p pVar = new w8.p(strC, this.f45244k, this.f45250q);
            C6169f c6169f = new C6169f(this.f45244k);
            D8.a aVar = new D8.a(RecognitionOptions.UPC_E, new D8.c(10));
            this.f45249p.b(pVar);
            this.f45242i = new C5999p(this.f45234a, this.f45243j, this.f45236c, this.f45244k, this.f45240g, c5984a, pVar, c6169f, W.j(this.f45234a, this.f45243j, this.f45244k, c5984a, c6169f, pVar, aVar, jVar, this.f45237d, this.f45247n, this.f45250q), this.f45248o, this.f45246m, this.f45247n, this.f45250q);
            boolean zO = o();
            k();
            this.f45242i.y(strC, Thread.getDefaultUncaughtExceptionHandler(), jVar);
            if (!zO || !C5992i.d(this.f45234a)) {
                r8.g.f().b("Successfully configured exception handler.");
                return true;
            }
            r8.g.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            r(jVar);
            return false;
        } catch (Exception e10) {
            r8.g.f().e("Crashlytics was not started due to an exception during initialization", e10);
            this.f45242i = null;
            return false;
        }
    }
}
