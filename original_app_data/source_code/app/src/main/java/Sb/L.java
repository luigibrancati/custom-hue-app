package Sb;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class L extends Zb.a implements Kb.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Eb.n f15507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f15508b = new AtomicReference();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicReference implements Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15509a;

        public a(Eb.p pVar, b bVar) {
            this.f15509a = pVar;
            lazySet(bVar);
        }

        @Override // Hb.c
        public void dispose() {
            b bVar = (b) getAndSet(null);
            if (bVar != null) {
                bVar.e(this);
            }
        }

        @Override // Hb.c
        public boolean j() {
            return get() == null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AtomicReference implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a[] f15510e = new a[0];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a[] f15511f = new a[0];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference f15513b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Throwable f15515d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f15512a = new AtomicBoolean();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReference f15514c = new AtomicReference();

        public b(AtomicReference atomicReference) {
            this.f15513b = atomicReference;
            lazySet(f15510e);
        }

        @Override // Eb.p
        public void a() {
            this.f15514c.lazySet(Kb.c.DISPOSED);
            for (a aVar : (a[]) getAndSet(f15511f)) {
                aVar.f15509a.a();
            }
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            Kb.c.u(this.f15514c, cVar);
        }

        @Override // Eb.p
        public void c(Object obj) {
            for (a aVar : (a[]) get()) {
                aVar.f15509a.c(obj);
            }
        }

        public boolean d(a aVar) {
            a[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = (a[]) get();
                if (aVarArr == f15511f) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        @Override // Hb.c
        public void dispose() {
            getAndSet(f15511f);
            T1.e.a(this.f15513b, this, null);
            Kb.c.a(this.f15514c);
        }

        public void e(a aVar) {
            a[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = (a[]) get();
                int length = aVarArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (aVarArr[i10] == aVar) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                aVarArr2 = f15510e;
                if (length != 1) {
                    aVarArr2 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, i10);
                    System.arraycopy(aVarArr, i10 + 1, aVarArr2, i10, (length - i10) - 1);
                }
            } while (!compareAndSet(aVarArr, aVarArr2));
        }

        @Override // Hb.c
        public boolean j() {
            return get() == f15511f;
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            this.f15515d = th;
            this.f15514c.lazySet(Kb.c.DISPOSED);
            for (a aVar : (a[]) getAndSet(f15511f)) {
                aVar.f15509a.onError(th);
            }
        }
    }

    public L(Eb.n nVar) {
        this.f15507a = nVar;
    }

    @Override // Zb.a
    public void Q0(Jb.d dVar) {
        b bVar;
        while (true) {
            bVar = (b) this.f15508b.get();
            if (bVar != null && !bVar.j()) {
                break;
            }
            b bVar2 = new b(this.f15508b);
            if (T1.e.a(this.f15508b, bVar, bVar2)) {
                bVar = bVar2;
                break;
            }
        }
        boolean z10 = false;
        if (!bVar.f15512a.get() && bVar.f15512a.compareAndSet(false, true)) {
            z10 = true;
        }
        try {
            dVar.accept(bVar);
            if (z10) {
                this.f15507a.f(bVar);
            }
        } catch (Throwable th) {
            Ib.b.b(th);
            throw Yb.f.d(th);
        }
    }

    @Override // Kb.f
    public void d(Hb.c cVar) {
        T1.e.a(this.f15508b, (b) cVar, null);
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        b bVar;
        while (true) {
            bVar = (b) this.f15508b.get();
            if (bVar != null) {
                break;
            }
            b bVar2 = new b(this.f15508b);
            if (T1.e.a(this.f15508b, bVar, bVar2)) {
                bVar = bVar2;
                break;
            }
        }
        a aVar = new a(pVar, bVar);
        pVar.b(aVar);
        if (bVar.d(aVar)) {
            if (aVar.j()) {
                bVar.e(aVar);
            }
        } else {
            Throwable th = bVar.f15515d;
            if (th != null) {
                pVar.onError(th);
            } else {
                pVar.a();
            }
        }
    }
}
