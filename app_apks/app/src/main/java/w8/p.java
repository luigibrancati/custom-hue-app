package w8;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import u8.C5992i;
import w8.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6170g f46383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v8.i f46384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f46385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f46386d = new a(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f46387e = new a(true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f46388f = new k(128);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicMarkableReference f46389g = new AtomicMarkableReference(null, false);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicMarkableReference f46390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference f46391b = new AtomicReference(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f46392c;

        public a(boolean z10) {
            this.f46392c = z10;
            this.f46390a = new AtomicMarkableReference(new C6168e(64, z10 ? 8192 : RecognitionOptions.UPC_E), false);
        }

        public static /* synthetic */ void a(a aVar) {
            aVar.f46391b.set(null);
            aVar.d();
        }

        public Map b() {
            return ((C6168e) this.f46390a.getReference()).a();
        }

        public final void c() {
            Runnable runnable = new Runnable() { // from class: w8.o
                @Override // java.lang.Runnable
                public final void run() {
                    p.a.a(this.f46382a);
                }
            };
            if (T1.e.a(this.f46391b, null, runnable)) {
                p.this.f46384b.f45902b.e(runnable);
            }
        }

        public final void d() {
            Map mapA;
            synchronized (this) {
                try {
                    if (this.f46390a.isMarked()) {
                        mapA = ((C6168e) this.f46390a.getReference()).a();
                        AtomicMarkableReference atomicMarkableReference = this.f46390a;
                        atomicMarkableReference.set((C6168e) atomicMarkableReference.getReference(), false);
                    } else {
                        mapA = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (mapA != null) {
                p.this.f46383a.r(p.this.f46385c, mapA, this.f46392c);
            }
        }

        public boolean e(String str, String str2) {
            synchronized (this) {
                try {
                    if (!((C6168e) this.f46390a.getReference()).d(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference atomicMarkableReference = this.f46390a;
                    atomicMarkableReference.set((C6168e) atomicMarkableReference.getReference(), true);
                    c();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public p(String str, A8.g gVar, v8.i iVar) {
        this.f46385c = str;
        this.f46383a = new C6170g(gVar);
        this.f46384b = iVar;
    }

    public static /* synthetic */ void c(p pVar, String str, Map map, List list) {
        if (pVar.j() != null) {
            pVar.f46383a.t(str, pVar.j());
        }
        if (!map.isEmpty()) {
            pVar.f46383a.q(str, map);
        }
        if (list.isEmpty()) {
            return;
        }
        pVar.f46383a.s(str, list);
    }

    public static p k(String str, A8.g gVar, v8.i iVar) {
        C6170g c6170g = new C6170g(gVar);
        p pVar = new p(str, gVar, iVar);
        ((C6168e) pVar.f46386d.f46390a.getReference()).e(c6170g.i(str, false));
        ((C6168e) pVar.f46387e.f46390a.getReference()).e(c6170g.i(str, true));
        pVar.f46389g.set(c6170g.k(str), false);
        pVar.f46388f.c(c6170g.j(str));
        return pVar;
    }

    public static String l(String str, A8.g gVar) {
        return new C6170g(gVar).k(str);
    }

    public Map g(Map map) {
        if (map.isEmpty()) {
            return this.f46386d.b();
        }
        HashMap map2 = new HashMap(this.f46386d.b());
        int i10 = 0;
        for (Map.Entry entry : map.entrySet()) {
            String strC = C6168e.c((String) entry.getKey(), RecognitionOptions.UPC_E);
            if (map2.size() < 64 || map2.containsKey(strC)) {
                map2.put(strC, C6168e.c((String) entry.getValue(), RecognitionOptions.UPC_E));
            } else {
                i10++;
            }
        }
        if (i10 > 0) {
            r8.g.f().k("Ignored " + i10 + " keys when adding event specific keys. Maximum allowable: " + RecognitionOptions.UPC_E);
        }
        return Collections.unmodifiableMap(map2);
    }

    public Map h() {
        return this.f46387e.b();
    }

    public List i() {
        return this.f46388f.a();
    }

    public String j() {
        return (String) this.f46389g.getReference();
    }

    public final void m() {
        boolean z10;
        String strJ;
        synchronized (this.f46389g) {
            try {
                z10 = false;
                if (this.f46389g.isMarked()) {
                    strJ = j();
                    this.f46389g.set(strJ, false);
                    z10 = true;
                } else {
                    strJ = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            this.f46383a.t(this.f46385c, strJ);
        }
    }

    public boolean n(String str, String str2) {
        return this.f46386d.e(str, str2);
    }

    public boolean o(String str, String str2) {
        return this.f46387e.e(str, str2);
    }

    public void p(final String str) {
        synchronized (this.f46385c) {
            this.f46385c = str;
            final Map mapB = this.f46386d.b();
            final List listB = this.f46388f.b();
            this.f46384b.f45902b.e(new Runnable() { // from class: w8.l
                @Override // java.lang.Runnable
                public final void run() {
                    p.c(this.f46375a, str, mapB, listB);
                }
            });
        }
    }

    public void q(String str) {
        String strC = C6168e.c(str, RecognitionOptions.UPC_E);
        synchronized (this.f46389g) {
            try {
                if (C5992i.z(strC, (String) this.f46389g.getReference())) {
                    return;
                }
                this.f46389g.set(strC, true);
                this.f46384b.f45902b.e(new Runnable() { // from class: w8.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f46381a.m();
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean r(List list) {
        synchronized (this.f46388f) {
            try {
                if (!this.f46388f.c(list)) {
                    return false;
                }
                final List listB = this.f46388f.b();
                this.f46384b.f45902b.e(new Runnable() { // from class: w8.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        p pVar = this.f46379a;
                        pVar.f46383a.s(pVar.f46385c, listB);
                    }
                });
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
