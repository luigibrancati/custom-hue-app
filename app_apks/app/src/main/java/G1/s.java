package G1;

import D1.m;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0860h f4322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f4323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f4324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f4325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f4326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f4327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f4328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4329h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4330i;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void invoke(Object obj);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void a(Object obj, D1.m mVar);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f4331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public m.b f4332b = new m.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f4333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f4334d;

        public c(Object obj) {
            this.f4331a = obj;
        }

        public void a(int i10, a aVar) {
            if (this.f4334d) {
                return;
            }
            if (i10 != -1) {
                this.f4332b.a(i10);
            }
            this.f4333c = true;
            aVar.invoke(this.f4331a);
        }

        public void b(b bVar) {
            if (this.f4334d || !this.f4333c) {
                return;
            }
            D1.m mVarE = this.f4332b.e();
            this.f4332b = new m.b();
            this.f4333c = false;
            bVar.a(this.f4331a, mVarE);
        }

        public void c(b bVar) {
            this.f4334d = true;
            if (this.f4333c) {
                this.f4333c = false;
                bVar.a(this.f4331a, this.f4332b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f4331a.equals(((c) obj).f4331a);
        }

        public int hashCode() {
            return this.f4331a.hashCode();
        }
    }

    public s(Looper looper, InterfaceC0860h interfaceC0860h, b bVar) {
        this(new CopyOnWriteArraySet(), looper, interfaceC0860h, bVar, true);
    }

    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i10, aVar);
        }
    }

    public void c(Object obj) {
        AbstractC0853a.e(obj);
        synchronized (this.f4328g) {
            try {
                if (this.f4329h) {
                    return;
                }
                this.f4325d.add(new c(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public s d(Looper looper, InterfaceC0860h interfaceC0860h, b bVar) {
        return new s(this.f4325d, looper, interfaceC0860h, bVar, this.f4330i);
    }

    public s e(Looper looper, b bVar) {
        return d(looper, this.f4322a, bVar);
    }

    public void f() {
        k();
        if (this.f4327f.isEmpty()) {
            return;
        }
        if (!this.f4323b.b(1)) {
            p pVar = this.f4323b;
            pVar.c(pVar.a(1));
        }
        boolean zIsEmpty = this.f4326e.isEmpty();
        this.f4326e.addAll(this.f4327f);
        this.f4327f.clear();
        if (zIsEmpty) {
            while (!this.f4326e.isEmpty()) {
                ((Runnable) this.f4326e.peekFirst()).run();
                this.f4326e.removeFirst();
            }
        }
    }

    public final boolean g(Message message) {
        Iterator it = this.f4325d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b(this.f4324c);
            if (this.f4323b.b(1)) {
                break;
            }
        }
        return true;
    }

    public void h(final int i10, final a aVar) {
        k();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f4325d);
        this.f4327f.add(new Runnable() { // from class: G1.r
            @Override // java.lang.Runnable
            public final void run() {
                s.a(copyOnWriteArraySet, i10, aVar);
            }
        });
    }

    public void i() {
        k();
        synchronized (this.f4328g) {
            this.f4329h = true;
        }
        Iterator it = this.f4325d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).c(this.f4324c);
        }
        this.f4325d.clear();
    }

    public void j(int i10, a aVar) {
        h(i10, aVar);
        f();
    }

    public final void k() {
        if (this.f4330i) {
            AbstractC0853a.g(Thread.currentThread() == this.f4323b.g().getThread());
        }
    }

    public s(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, InterfaceC0860h interfaceC0860h, b bVar, boolean z10) {
        this.f4322a = interfaceC0860h;
        this.f4325d = copyOnWriteArraySet;
        this.f4324c = bVar;
        this.f4328g = new Object();
        this.f4326e = new ArrayDeque();
        this.f4327f = new ArrayDeque();
        this.f4323b = interfaceC0860h.e(looper, new Handler.Callback() { // from class: G1.q
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f4318a.g(message);
            }
        });
        this.f4330i = z10;
    }
}
