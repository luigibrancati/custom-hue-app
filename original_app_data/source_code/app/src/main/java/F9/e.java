package F9;

import b0.t;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class e extends F9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f3778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f3779c = new t(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReadWriteLock f3780d = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f3781e = Executors.newCachedThreadPool();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3782a;

        public a(int i10) {
            this.f3782a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep((long) ((Math.random() * 500.0d) + 500.0d));
            } catch (InterruptedException unused) {
            }
            e.this.j(this.f3782a);
        }
    }

    public e(b bVar) {
        this.f3778b = bVar;
    }

    @Override // F9.b
    public boolean b(E9.b bVar) {
        boolean zB = this.f3778b.b(bVar);
        if (zB) {
            i();
        }
        return zB;
    }

    @Override // F9.b
    public void c() {
        this.f3778b.c();
        i();
    }

    @Override // F9.b
    public Set e(float f10) {
        int i10 = (int) f10;
        Set setJ = j(i10);
        int i11 = i10 + 1;
        if (this.f3779c.d(Integer.valueOf(i11)) == null) {
            this.f3781e.execute(new a(i11));
        }
        int i12 = i10 - 1;
        if (this.f3779c.d(Integer.valueOf(i12)) == null) {
            this.f3781e.execute(new a(i12));
        }
        return setJ;
    }

    @Override // F9.b
    public boolean f(E9.b bVar) {
        boolean zF = this.f3778b.f(bVar);
        if (zF) {
            i();
        }
        return zF;
    }

    @Override // F9.b
    public int g() {
        return this.f3778b.g();
    }

    public final void i() {
        this.f3779c.c();
    }

    public final Set j(int i10) {
        this.f3780d.readLock().lock();
        Set setE = (Set) this.f3779c.d(Integer.valueOf(i10));
        this.f3780d.readLock().unlock();
        if (setE == null) {
            this.f3780d.writeLock().lock();
            setE = (Set) this.f3779c.d(Integer.valueOf(i10));
            if (setE == null) {
                setE = this.f3778b.e(i10);
                this.f3779c.f(Integer.valueOf(i10), setE);
            }
            this.f3780d.writeLock().unlock();
        }
        return setE;
    }
}
