package Sb;

import bc.AbstractC2904a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: Sb.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2201b extends Eb.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Eb.n[] f15630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterable f15631b;

    /* JADX INFO: renamed from: Sb.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C0190b[] f15633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicInteger f15634c = new AtomicInteger();

        public a(Eb.p pVar, int i10) {
            this.f15632a = pVar;
            this.f15633b = new C0190b[i10];
        }

        public void a(Eb.n[] nVarArr) {
            C0190b[] c0190bArr = this.f15633b;
            int length = c0190bArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                c0190bArr[i10] = new C0190b(this, i11, this.f15632a);
                i10 = i11;
            }
            this.f15634c.lazySet(0);
            this.f15632a.b(this);
            for (int i12 = 0; i12 < length && this.f15634c.get() == 0; i12++) {
                nVarArr[i12].f(c0190bArr[i12]);
            }
        }

        public boolean b(int i10) {
            int i11 = this.f15634c.get();
            int i12 = 0;
            if (i11 != 0) {
                return i11 == i10;
            }
            if (!this.f15634c.compareAndSet(0, i10)) {
                return false;
            }
            C0190b[] c0190bArr = this.f15633b;
            int length = c0190bArr.length;
            while (i12 < length) {
                int i13 = i12 + 1;
                if (i13 != i10) {
                    c0190bArr[i12].d();
                }
                i12 = i13;
            }
            return true;
        }

        @Override // Hb.c
        public void dispose() {
            if (this.f15634c.get() != -1) {
                this.f15634c.lazySet(-1);
                for (C0190b c0190b : this.f15633b) {
                    c0190b.d();
                }
            }
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15634c.get() == -1;
        }
    }

    /* JADX INFO: renamed from: Sb.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0190b extends AtomicReference implements Eb.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f15635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f15636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Eb.p f15637c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f15638d;

        public C0190b(a aVar, int i10, Eb.p pVar) {
            this.f15635a = aVar;
            this.f15636b = i10;
            this.f15637c = pVar;
        }

        @Override // Eb.p
        public void a() {
            if (this.f15638d) {
                this.f15637c.a();
            } else if (this.f15635a.b(this.f15636b)) {
                this.f15638d = true;
                this.f15637c.a();
            }
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            Kb.c.u(this, cVar);
        }

        @Override // Eb.p
        public void c(Object obj) {
            if (this.f15638d) {
                this.f15637c.c(obj);
            } else if (!this.f15635a.b(this.f15636b)) {
                ((Hb.c) get()).dispose();
            } else {
                this.f15638d = true;
                this.f15637c.c(obj);
            }
        }

        public void d() {
            Kb.c.a(this);
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            if (this.f15638d) {
                this.f15637c.onError(th);
            } else if (!this.f15635a.b(this.f15636b)) {
                AbstractC2904a.q(th);
            } else {
                this.f15638d = true;
                this.f15637c.onError(th);
            }
        }
    }

    public C2201b(Eb.n[] nVarArr, Iterable iterable) {
        this.f15630a = nVarArr;
        this.f15631b = iterable;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        int length;
        Eb.n[] nVarArr = this.f15630a;
        if (nVarArr == null) {
            nVarArr = new Eb.n[8];
            try {
                length = 0;
                for (Eb.n nVar : this.f15631b) {
                    if (nVar == null) {
                        Kb.d.p(new NullPointerException("One of the sources is null"), pVar);
                        return;
                    }
                    if (length == nVarArr.length) {
                        Eb.n[] nVarArr2 = new Eb.n[(length >> 2) + length];
                        System.arraycopy(nVarArr, 0, nVarArr2, 0, length);
                        nVarArr = nVarArr2;
                    }
                    int i10 = length + 1;
                    nVarArr[length] = nVar;
                    length = i10;
                }
            } catch (Throwable th) {
                Ib.b.b(th);
                Kb.d.p(th, pVar);
                return;
            }
        } else {
            length = nVarArr.length;
        }
        if (length == 0) {
            Kb.d.a(pVar);
        } else if (length == 1) {
            nVarArr[0].f(pVar);
        } else {
            new a(pVar, length).a(nVarArr);
        }
    }
}
