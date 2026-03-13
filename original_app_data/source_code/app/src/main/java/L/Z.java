package L;

import E.AbstractC0807p0;
import E.InterfaceC0800m;
import F.a;
import L.J;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import s3.AbstractC5712a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class Z implements a.InterfaceC0051a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f7966a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F.a f7969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f7970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7971f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public J.a f7972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f7973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f7974c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c f7975d;

        public a(J.a aVar, Executor executor, b bVar, c cVar) {
            this.f7972a = aVar;
            this.f7973b = executor;
            this.f7974c = bVar;
            this.f7975d = cVar;
        }

        public J.a a() {
            return this.f7972a;
        }

        public void b() {
            try {
                Executor executor = this.f7973b;
                final b bVar = this.f7974c;
                Objects.requireNonNull(bVar);
                executor.execute(new Runnable() { // from class: L.Y
                    @Override // java.lang.Runnable
                    public final void run() {
                        bVar.a();
                    }
                });
            } catch (RejectedExecutionException e10) {
                AbstractC0807p0.d("CameraStateRegistry", "Unable to notify camera to configure.", e10);
            }
        }

        public void c() {
            try {
                Executor executor = this.f7973b;
                final c cVar = this.f7975d;
                Objects.requireNonNull(cVar);
                executor.execute(new Runnable() { // from class: L.X
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.a();
                    }
                });
            } catch (RejectedExecutionException e10) {
                AbstractC0807p0.d("CameraStateRegistry", "Unable to notify camera to open.", e10);
            }
        }

        public J.a d(J.a aVar) {
            J.a aVar2 = this.f7972a;
            this.f7972a = aVar;
            return aVar2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c {
        void a();
    }

    public Z(F.a aVar, int i10) {
        Object obj = new Object();
        this.f7967b = obj;
        this.f7970e = new HashMap();
        this.f7968c = i10;
        synchronized (obj) {
            this.f7969d = aVar;
            this.f7971f = this.f7968c;
        }
    }

    public static boolean d(J.a aVar) {
        return aVar != null && aVar.b();
    }

    public static void h(InterfaceC0800m interfaceC0800m, J.a aVar) {
        if (AbstractC5712a.e()) {
            AbstractC5712a.f("CX:State[" + interfaceC0800m + "]", aVar.ordinal());
        }
    }

    @Override // F.a.InterfaceC0051a
    public void a(int i10, int i11) {
        synchronized (this.f7967b) {
            boolean z10 = true;
            this.f7968c = i11 == 2 ? 2 : 1;
            boolean z11 = i10 != 2 && i11 == 2;
            if (i10 != 2 || i11 == 2) {
                z10 = false;
            }
            if (z11 || z10) {
                f();
            }
        }
    }

    public final a b(String str) {
        for (InterfaceC0800m interfaceC0800m : this.f7970e.keySet()) {
            if (str.equals(((I) interfaceC0800m.b()).d())) {
                return (a) this.f7970e.get(interfaceC0800m);
            }
        }
        return null;
    }

    public boolean c() {
        synchronized (this.f7967b) {
            try {
                Iterator it = this.f7970e.entrySet().iterator();
                while (it.hasNext()) {
                    if (((a) ((Map.Entry) it.next()).getValue()).a() == J.a.CLOSING) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(E.InterfaceC0800m r6, L.J.a r7, boolean r8) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f7967b
            monitor-enter(r0)
            int r1 = r5.f7971f     // Catch: java.lang.Throwable -> Le
            L.J$a r2 = L.J.a.RELEASED     // Catch: java.lang.Throwable -> Le
            if (r7 != r2) goto L11
            L.J$a r2 = r5.k(r6)     // Catch: java.lang.Throwable -> Le
            goto L15
        Le:
            r5 = move-exception
            goto Lbf
        L11:
            L.J$a r2 = r5.l(r6, r7)     // Catch: java.lang.Throwable -> Le
        L15:
            if (r2 != r7) goto L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        L19:
            F.a r2 = r5.f7969d     // Catch: java.lang.Throwable -> Le
            int r2 = r2.c()     // Catch: java.lang.Throwable -> Le
            r3 = 2
            r4 = 0
            if (r2 != r3) goto L3e
            L.J$a r2 = L.J.a.CONFIGURED     // Catch: java.lang.Throwable -> Le
            if (r7 != r2) goto L3e
            E.u r2 = r6.b()     // Catch: java.lang.Throwable -> Le
            L.I r2 = (L.I) r2     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = r2.d()     // Catch: java.lang.Throwable -> Le
            F.a r3 = r5.f7969d     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = r3.b(r2)     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto L3e
            L.Z$a r2 = r5.b(r2)     // Catch: java.lang.Throwable -> Le
            goto L3f
        L3e:
            r2 = r4
        L3f:
            r3 = 1
            if (r1 >= r3) goto L7f
            int r1 = r5.f7971f     // Catch: java.lang.Throwable -> Le
            if (r1 <= 0) goto L7f
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> Le
            r4.<init>()     // Catch: java.lang.Throwable -> Le
            java.util.Map r5 = r5.f7970e     // Catch: java.lang.Throwable -> Le
            java.util.Set r5 = r5.entrySet()     // Catch: java.lang.Throwable -> Le
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> Le
        L55:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Throwable -> Le
            if (r7 == 0) goto L97
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> Le
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Throwable -> Le
            java.lang.Object r1 = r7.getValue()     // Catch: java.lang.Throwable -> Le
            L.Z$a r1 = (L.Z.a) r1     // Catch: java.lang.Throwable -> Le
            L.J$a r1 = r1.a()     // Catch: java.lang.Throwable -> Le
            L.J$a r3 = L.J.a.PENDING_OPEN     // Catch: java.lang.Throwable -> Le
            if (r1 != r3) goto L55
            java.lang.Object r1 = r7.getKey()     // Catch: java.lang.Throwable -> Le
            E.m r1 = (E.InterfaceC0800m) r1     // Catch: java.lang.Throwable -> Le
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> Le
            L.Z$a r7 = (L.Z.a) r7     // Catch: java.lang.Throwable -> Le
            r4.put(r1, r7)     // Catch: java.lang.Throwable -> Le
            goto L55
        L7f:
            L.J$a r1 = L.J.a.PENDING_OPEN     // Catch: java.lang.Throwable -> Le
            if (r7 != r1) goto L97
            int r7 = r5.f7971f     // Catch: java.lang.Throwable -> Le
            if (r7 <= 0) goto L97
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> Le
            r4.<init>()     // Catch: java.lang.Throwable -> Le
            java.util.Map r5 = r5.f7970e     // Catch: java.lang.Throwable -> Le
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Throwable -> Le
            L.Z$a r5 = (L.Z.a) r5     // Catch: java.lang.Throwable -> Le
            r4.put(r6, r5)     // Catch: java.lang.Throwable -> Le
        L97:
            if (r4 == 0) goto L9e
            if (r8 != 0) goto L9e
            r4.remove(r6)     // Catch: java.lang.Throwable -> Le
        L9e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            if (r4 == 0) goto Lb9
            java.util.Collection r5 = r4.values()
            java.util.Iterator r5 = r5.iterator()
        La9:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lb9
            java.lang.Object r6 = r5.next()
            L.Z$a r6 = (L.Z.a) r6
            r6.c()
            goto La9
        Lb9:
            if (r2 == 0) goto Lbe
            r2.b()
        Lbe:
            return
        Lbf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: L.Z.e(E.m, L.J$a, boolean):void");
    }

    public final void f() {
        if (AbstractC0807p0.f("CameraStateRegistry")) {
            this.f7966a.setLength(0);
            this.f7966a.append("Recalculating open cameras:\n");
            this.f7966a.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.f7966a.append("-------------------------------------------------------------------\n");
        }
        int i10 = 0;
        for (Map.Entry entry : this.f7970e.entrySet()) {
            if (AbstractC0807p0.f("CameraStateRegistry")) {
                this.f7966a.append(String.format(Locale.US, "%-45s%-22s\n", ((InterfaceC0800m) entry.getKey()).toString(), ((a) entry.getValue()).a() != null ? ((a) entry.getValue()).a().toString() : "UNKNOWN"));
            }
            if (d(((a) entry.getValue()).a())) {
                i10++;
            }
        }
        if (AbstractC0807p0.f("CameraStateRegistry")) {
            this.f7966a.append("-------------------------------------------------------------------\n");
            this.f7966a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i10), Integer.valueOf(this.f7968c)));
            AbstractC0807p0.a("CameraStateRegistry", this.f7966a.toString());
        }
        this.f7971f = Math.max(this.f7968c - i10, 0);
    }

    public void g(InterfaceC0800m interfaceC0800m, Executor executor, b bVar, c cVar) {
        synchronized (this.f7967b) {
            X0.h.j(!this.f7970e.containsKey(interfaceC0800m), "Camera is already registered: " + interfaceC0800m);
            this.f7970e.put(interfaceC0800m, new a(null, executor, bVar, cVar));
        }
    }

    public boolean i(InterfaceC0800m interfaceC0800m) {
        boolean z10;
        synchronized (this.f7967b) {
            try {
                a aVar = (a) X0.h.h((a) this.f7970e.get(interfaceC0800m), "Camera must first be registered with registerCamera()");
                z10 = false;
                if (AbstractC0807p0.f("CameraStateRegistry")) {
                    this.f7966a.setLength(0);
                    this.f7966a.append(String.format(Locale.US, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", interfaceC0800m, Integer.valueOf(this.f7971f), Boolean.valueOf(d(aVar.a())), aVar.a()));
                }
                if (this.f7971f > 0 || d(aVar.a())) {
                    J.a aVar2 = J.a.OPENING;
                    aVar.d(aVar2);
                    h(interfaceC0800m, aVar2);
                    z10 = true;
                }
                if (AbstractC0807p0.f("CameraStateRegistry")) {
                    this.f7966a.append(String.format(Locale.US, " --> %s", z10 ? "SUCCESS" : "FAIL"));
                    AbstractC0807p0.a("CameraStateRegistry", this.f7966a.toString());
                }
                if (z10) {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    public boolean j(String str, String str2) {
        synchronized (this.f7967b) {
            try {
                boolean z10 = true;
                if (this.f7969d.c() != 2) {
                    return true;
                }
                a aVarB = b(str);
                J.a aVarA = aVarB != null ? aVarB.a() : null;
                a aVarB2 = str2 != null ? b(str2) : null;
                J.a aVarA2 = aVarB2 != null ? aVarB2.a() : null;
                J.a aVar = J.a.OPEN;
                boolean z11 = aVar.equals(aVarA) || J.a.CONFIGURED.equals(aVarA);
                boolean z12 = aVar.equals(aVarA2) || J.a.CONFIGURED.equals(aVarA2);
                if (!z11 || !z12) {
                    z10 = false;
                }
                return z10;
            } finally {
            }
        }
    }

    public final J.a k(InterfaceC0800m interfaceC0800m) {
        a aVar = (a) this.f7970e.remove(interfaceC0800m);
        if (aVar == null) {
            return null;
        }
        f();
        return aVar.a();
    }

    public final J.a l(InterfaceC0800m interfaceC0800m, J.a aVar) {
        J.a aVarD = ((a) X0.h.h((a) this.f7970e.get(interfaceC0800m), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).d(aVar);
        J.a aVar2 = J.a.OPENING;
        if (aVar == aVar2) {
            X0.h.j(d(aVar) || aVarD == aVar2, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (aVarD != aVar) {
            h(interfaceC0800m, aVar);
            f();
        }
        return aVarD;
    }
}
