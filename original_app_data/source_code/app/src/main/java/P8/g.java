package P8;

import P8.i;
import R8.d;
import R8.f;
import android.text.TextUtils;
import b7.C2878l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import h8.C4288f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import o8.w;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class g implements h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f13182m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ThreadFactory f13183n = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4288f f13184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R8.c f13185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q8.c f13186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f13187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f13188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f13189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f13190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f13191h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f13192i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f13193j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Set f13194k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f13195l;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f13196a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f13196a.getAndIncrement())));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f13198b;

        static {
            int[] iArr = new int[f.b.values().length];
            f13198b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13198b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13198b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f13197a = iArr2;
            try {
                iArr2[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13197a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public g(final C4288f c4288f, O8.b bVar, ExecutorService executorService, Executor executor) {
        this(executorService, executor, c4288f, new R8.c(c4288f.m(), bVar), new Q8.c(c4288f), p.c(), new w(new O8.b() { // from class: P8.c
            @Override // O8.b
            public final Object get() {
                return g.e(c4288f);
            }
        }), new n());
    }

    public static /* synthetic */ Q8.b e(C4288f c4288f) {
        return new Q8.b(c4288f);
    }

    public static g p() {
        return q(C4288f.o());
    }

    public static g q(C4288f c4288f) {
        AbstractC6056k.b(c4288f != null, "Null is not a valid value of FirebaseApp.");
        return (g) c4288f.k(h.class);
    }

    public final synchronized void A(String str) {
        this.f13193j = str;
    }

    public final synchronized void B(Q8.d dVar, Q8.d dVar2) {
        if (this.f13194k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            Iterator it = this.f13194k.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.a.a(it.next());
                dVar2.d();
                throw null;
            }
        }
    }

    @Override // P8.h
    public Task a(final boolean z10) {
        v();
        Task taskF = f();
        this.f13191h.execute(new Runnable() { // from class: P8.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f13178a.j(z10);
            }
        });
        return taskF;
    }

    public final Task f() {
        C2878l c2878l = new C2878l();
        h(new k(this.f13187d, c2878l));
        return c2878l.a();
    }

    public final Task g() {
        C2878l c2878l = new C2878l();
        h(new l(c2878l));
        return c2878l.a();
    }

    @Override // P8.h
    public Task getId() {
        v();
        String strN = n();
        if (strN != null) {
            return Tasks.e(strN);
        }
        Task taskG = g();
        this.f13191h.execute(new Runnable() { // from class: P8.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f13177a.j(false);
            }
        });
        return taskG;
    }

    public final void h(o oVar) {
        synchronized (this.f13190g) {
            this.f13195l.add(oVar);
        }
    }

    public final void i(boolean z10) {
        Q8.d dVarX;
        Q8.d dVarR = r();
        try {
            if (dVarR.i() || dVarR.l()) {
                dVarX = x(dVarR);
            } else {
                if (!z10 && !this.f13187d.f(dVarR)) {
                    return;
                }
                dVarX = k(dVarR);
            }
            u(dVarX);
            B(dVarR, dVarX);
            if (dVarX.k()) {
                A(dVarX.d());
            }
            if (dVarX.i()) {
                y(new i(i.a.BAD_CONFIG));
            } else if (dVarX.j()) {
                y(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            } else {
                z(dVarX);
            }
        } catch (i e10) {
            y(e10);
        }
    }

    public final void j(final boolean z10) {
        Q8.d dVarS = s();
        if (z10) {
            dVarS = dVarS.p();
        }
        z(dVarS);
        this.f13192i.execute(new Runnable() { // from class: P8.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f13180a.i(z10);
            }
        });
    }

    public final Q8.d k(Q8.d dVar) throws i {
        R8.f fVarE = this.f13185b.e(l(), dVar.d(), t(), dVar.f());
        int i10 = b.f13198b[fVarE.b().ordinal()];
        if (i10 == 1) {
            return dVar.o(fVarE.c(), fVarE.d(), this.f13187d.b());
        }
        if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i10 != 3) {
            throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
        }
        A(null);
        return dVar.r();
    }

    public String l() {
        return this.f13184a.r().b();
    }

    public String m() {
        return this.f13184a.r().c();
    }

    public final synchronized String n() {
        return this.f13193j;
    }

    public final Q8.b o() {
        return (Q8.b) this.f13188e.get();
    }

    /* JADX WARN: Finally extract failed */
    public final Q8.d r() {
        Q8.d dVarD;
        synchronized (f13182m) {
            try {
                P8.b bVarA = P8.b.a(this.f13184a.m(), "generatefid.lock");
                try {
                    dVarD = this.f13186c.d();
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVarD;
    }

    /* JADX WARN: Finally extract failed */
    public final Q8.d s() {
        Q8.d dVarD;
        synchronized (f13182m) {
            try {
                P8.b bVarA = P8.b.a(this.f13184a.m(), "generatefid.lock");
                try {
                    dVarD = this.f13186c.d();
                    if (dVarD.j()) {
                        dVarD = this.f13186c.b(dVarD.t(w(dVarD)));
                    }
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVarD;
    }

    public String t() {
        return this.f13184a.r().g();
    }

    /* JADX WARN: Finally extract failed */
    public final void u(Q8.d dVar) {
        synchronized (f13182m) {
            try {
                P8.b bVarA = P8.b.a(this.f13184a.m(), "generatefid.lock");
                try {
                    this.f13186c.b(dVar);
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void v() {
        AbstractC6056k.g(m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC6056k.g(t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC6056k.g(l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC6056k.b(p.h(m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC6056k.b(p.g(l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public final String w(Q8.d dVar) {
        if ((!this.f13184a.q().equals("CHIME_ANDROID_SDK") && !this.f13184a.y()) || !dVar.m()) {
            return this.f13189f.a();
        }
        String strF = o().f();
        return TextUtils.isEmpty(strF) ? this.f13189f.a() : strF;
    }

    public final Q8.d x(Q8.d dVar) throws i {
        R8.d dVarD = this.f13185b.d(l(), dVar.d(), t(), m(), (dVar.d() == null || dVar.d().length() != 11) ? null : o().i());
        int i10 = b.f13197a[dVarD.e().ordinal()];
        if (i10 == 1) {
            return dVar.s(dVarD.c(), dVarD.d(), this.f13187d.b(), dVarD.b().c(), dVarD.b().d());
        }
        if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
    }

    public final void y(Exception exc) {
        synchronized (this.f13190g) {
            try {
                Iterator it = this.f13195l.iterator();
                while (it.hasNext()) {
                    if (((o) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(Q8.d dVar) {
        synchronized (this.f13190g) {
            try {
                Iterator it = this.f13195l.iterator();
                while (it.hasNext()) {
                    if (((o) it.next()).b(dVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public g(ExecutorService executorService, Executor executor, C4288f c4288f, R8.c cVar, Q8.c cVar2, p pVar, w wVar, n nVar) {
        this.f13190g = new Object();
        this.f13194k = new HashSet();
        this.f13195l = new ArrayList();
        this.f13184a = c4288f;
        this.f13185b = cVar;
        this.f13186c = cVar2;
        this.f13187d = pVar;
        this.f13188e = wVar;
        this.f13189f = nVar;
        this.f13191h = executorService;
        this.f13192i = executor;
    }
}
