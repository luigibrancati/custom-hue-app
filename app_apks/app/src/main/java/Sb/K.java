package Sb;

import bc.AbstractC2904a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class K extends Zb.a implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Eb.n f15496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f15497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Eb.n f15498c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicReference implements Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15499a;

        public a(Eb.p pVar) {
            this.f15499a = pVar;
        }

        public void a(b bVar) {
            if (compareAndSet(null, bVar)) {
                return;
            }
            bVar.e(this);
        }

        @Override // Hb.c
        public void dispose() {
            Object andSet = getAndSet(this);
            if (andSet == null || andSet == this) {
                return;
            }
            ((b) andSet).e(this);
        }

        @Override // Hb.c
        public boolean j() {
            return get() == this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a[] f15500e = new a[0];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a[] f15501f = new a[0];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReference f15502a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReference f15505d = new AtomicReference();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference f15503b = new AtomicReference(f15500e);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f15504c = new AtomicBoolean();

        public b(AtomicReference atomicReference) {
            this.f15502a = atomicReference;
        }

        @Override // Eb.p
        public void a() {
            T1.e.a(this.f15502a, this, null);
            for (a aVar : (a[]) this.f15503b.getAndSet(f15501f)) {
                aVar.f15499a.a();
            }
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            Kb.c.u(this.f15505d, cVar);
        }

        @Override // Eb.p
        public void c(Object obj) {
            for (a aVar : (a[]) this.f15503b.get()) {
                aVar.f15499a.c(obj);
            }
        }

        public boolean d(a aVar) {
            a[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = (a[]) this.f15503b.get();
                if (aVarArr == f15501f) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!T1.e.a(this.f15503b, aVarArr, aVarArr2));
            return true;
        }

        @Override // Hb.c
        public void dispose() {
            AtomicReference atomicReference = this.f15503b;
            a[] aVarArr = f15501f;
            if (((a[]) atomicReference.getAndSet(aVarArr)) != aVarArr) {
                T1.e.a(this.f15502a, this, null);
                Kb.c.a(this.f15505d);
            }
        }

        public void e(a aVar) {
            a[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = (a[]) this.f15503b.get();
                int length = aVarArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (aVarArr[i10].equals(aVar)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr2 = f15500e;
                } else {
                    a[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                    System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!T1.e.a(this.f15503b, aVarArr, aVarArr2));
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15503b.get() == f15501f;
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            T1.e.a(this.f15502a, this, null);
            a[] aVarArr = (a[]) this.f15503b.getAndSet(f15501f);
            if (aVarArr.length == 0) {
                AbstractC2904a.q(th);
                return;
            }
            for (a aVar : aVarArr) {
                aVar.f15499a.onError(th);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements Eb.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReference f15506a;

        public c(AtomicReference atomicReference) {
            this.f15506a = atomicReference;
        }

        @Override // Eb.n
        public void f(Eb.p pVar) {
            a aVar = new a(pVar);
            pVar.b(aVar);
            while (true) {
                b bVar = (b) this.f15506a.get();
                if (bVar == null || bVar.j()) {
                    b bVar2 = new b(this.f15506a);
                    if (T1.e.a(this.f15506a, bVar, bVar2)) {
                        bVar = bVar2;
                    } else {
                        continue;
                    }
                }
                if (bVar.d(aVar)) {
                    aVar.a(bVar);
                    return;
                }
            }
        }
    }

    public K(Eb.n nVar, Eb.n nVar2, AtomicReference atomicReference) {
        this.f15498c = nVar;
        this.f15496a = nVar2;
        this.f15497b = atomicReference;
    }

    public static Zb.a T0(Eb.n nVar) {
        AtomicReference atomicReference = new AtomicReference();
        return AbstractC2904a.o(new K(new c(atomicReference), nVar, atomicReference));
    }

    @Override // Zb.a
    public void Q0(Jb.d dVar) {
        b bVar;
        while (true) {
            bVar = (b) this.f15497b.get();
            if (bVar != null && !bVar.j()) {
                break;
            }
            b bVar2 = new b(this.f15497b);
            if (T1.e.a(this.f15497b, bVar, bVar2)) {
                bVar = bVar2;
                break;
            }
        }
        boolean z10 = false;
        if (!bVar.f15504c.get() && bVar.f15504c.compareAndSet(false, true)) {
            z10 = true;
        }
        try {
            dVar.accept(bVar);
            if (z10) {
                this.f15496a.f(bVar);
            }
        } catch (Throwable th) {
            Ib.b.b(th);
            throw Yb.f.d(th);
        }
    }

    @Override // Sb.M
    public Eb.n e() {
        return this.f15496a;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        this.f15498c.f(pVar);
    }
}
