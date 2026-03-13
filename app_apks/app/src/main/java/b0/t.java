package b0;

import fc.C4015H;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0.c f24946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0.b f24947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24952h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24953i;

    public t(int i10) {
        this.f24945a = i10;
        if (!(i10 > 0)) {
            c0.d.a("maxSize <= 0");
        }
        this.f24946b = new c0.c(0, 0.75f);
        this.f24947c = new c0.b();
    }

    public Object a(Object key) {
        AbstractC4862t.e(key, "key");
        return null;
    }

    public void b(boolean z10, Object key, Object oldValue, Object obj) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(oldValue, "oldValue");
    }

    public final void c() {
        l(-1);
    }

    public final Object d(Object key) {
        Object objD;
        AbstractC4862t.e(key, "key");
        synchronized (this.f24947c) {
            Object objA = this.f24946b.a(key);
            if (objA != null) {
                this.f24952h++;
                return objA;
            }
            this.f24953i++;
            Object objA2 = a(key);
            if (objA2 == null) {
                return null;
            }
            synchronized (this.f24947c) {
                try {
                    this.f24950f++;
                    objD = this.f24946b.d(key, objA2);
                    if (objD != null) {
                        this.f24946b.d(key, objD);
                    } else {
                        this.f24948d += h(key, objA2);
                        C4015H c4015h = C4015H.f34254a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objD != null) {
                b(false, key, objA2, objD);
                return objD;
            }
            l(this.f24945a);
            return objA2;
        }
    }

    public final int e() {
        int i10;
        synchronized (this.f24947c) {
            i10 = this.f24945a;
        }
        return i10;
    }

    public final Object f(Object key, Object value) {
        Object objD;
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(value, "value");
        synchronized (this.f24947c) {
            try {
                this.f24949e++;
                this.f24948d += h(key, value);
                objD = this.f24946b.d(key, value);
                if (objD != null) {
                    this.f24948d -= h(key, objD);
                }
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objD != null) {
            b(false, key, objD, value);
        }
        l(this.f24945a);
        return objD;
    }

    public final Object g(Object key) {
        Object objE;
        AbstractC4862t.e(key, "key");
        synchronized (this.f24947c) {
            try {
                objE = this.f24946b.e(key);
                if (objE != null) {
                    this.f24948d -= h(key, objE);
                }
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objE != null) {
            b(false, key, objE, null);
        }
        return objE;
    }

    public final int h(Object obj, Object obj2) {
        int iJ = j(obj, obj2);
        if (!(iJ >= 0)) {
            c0.d.b("Negative size: " + obj + '=' + obj2);
        }
        return iJ;
    }

    public final int i() {
        int i10;
        synchronized (this.f24947c) {
            i10 = this.f24948d;
        }
        return i10;
    }

    public int j(Object key, Object value) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(value, "value");
        return 1;
    }

    public final Map k() {
        LinkedHashMap linkedHashMap;
        synchronized (this.f24947c) {
            linkedHashMap = new LinkedHashMap(this.f24946b.b().size());
            for (Map.Entry entry : this.f24946b.b()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(int r7) {
        /*
            r6 = this;
        L0:
            c0.b r0 = r6.f24947c
            monitor-enter(r0)
            int r1 = r6.f24948d     // Catch: java.lang.Throwable -> L15
            r2 = 1
            if (r1 < 0) goto L19
            c0.c r1 = r6.f24946b     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L17
            int r1 = r6.f24948d     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L19
            goto L17
        L15:
            r6 = move-exception
            goto L61
        L17:
            r1 = r2
            goto L1a
        L19:
            r1 = 0
        L1a:
            if (r1 != 0) goto L21
            java.lang.String r1 = "LruCache.sizeOf() is reporting inconsistent results!"
            c0.d.b(r1)     // Catch: java.lang.Throwable -> L15
        L21:
            int r1 = r6.f24948d     // Catch: java.lang.Throwable -> L15
            if (r1 <= r7) goto L5f
            c0.c r1 = r6.f24946b     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L2e
            goto L5f
        L2e:
            c0.c r1 = r6.f24946b     // Catch: java.lang.Throwable -> L15
            java.util.Set r1 = r1.b()     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = gc.C4179C.i0(r1)     // Catch: java.lang.Throwable -> L15
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L3e
            monitor-exit(r0)
            return
        L3e:
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L15
            c0.c r4 = r6.f24946b     // Catch: java.lang.Throwable -> L15
            r4.e(r3)     // Catch: java.lang.Throwable -> L15
            int r4 = r6.f24948d     // Catch: java.lang.Throwable -> L15
            int r5 = r6.h(r3, r1)     // Catch: java.lang.Throwable -> L15
            int r4 = r4 - r5
            r6.f24948d = r4     // Catch: java.lang.Throwable -> L15
            int r4 = r6.f24951g     // Catch: java.lang.Throwable -> L15
            int r4 = r4 + r2
            r6.f24951g = r4     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)
            r0 = 0
            r6.b(r2, r3, r1, r0)
            goto L0
        L5f:
            monitor-exit(r0)
            return
        L61:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.t.l(int):void");
    }

    public String toString() {
        String str;
        synchronized (this.f24947c) {
            try {
                int i10 = this.f24952h;
                int i11 = this.f24953i + i10;
                str = "LruCache[maxSize=" + this.f24945a + ",hits=" + this.f24952h + ",misses=" + this.f24953i + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
