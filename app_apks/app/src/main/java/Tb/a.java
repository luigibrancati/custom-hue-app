package Tb;

import Eb.v;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends Eb.r implements Eb.t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0199a[] f16279f = new C0199a[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0199a[] f16280g = new C0199a[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f16281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f16282b = new AtomicInteger();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f16283c = new AtomicReference(f16279f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f16284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Throwable f16285e;

    /* JADX INFO: renamed from: Tb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0199a extends AtomicBoolean implements Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.t f16286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f16287b;

        public C0199a(Eb.t tVar, a aVar) {
            this.f16286a = tVar;
            this.f16287b = aVar;
        }

        @Override // Hb.c
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f16287b.N(this);
            }
        }

        @Override // Hb.c
        public boolean j() {
            return get();
        }
    }

    public a(v vVar) {
        this.f16281a = vVar;
    }

    @Override // Eb.r
    public void C(Eb.t tVar) {
        C0199a c0199a = new C0199a(tVar, this);
        tVar.b(c0199a);
        if (M(c0199a)) {
            if (c0199a.j()) {
                N(c0199a);
            }
            if (this.f16282b.getAndIncrement() == 0) {
                this.f16281a.c(this);
                return;
            }
            return;
        }
        Throwable th = this.f16285e;
        if (th != null) {
            tVar.onError(th);
        } else {
            tVar.onSuccess(this.f16284d);
        }
    }

    public boolean M(C0199a c0199a) {
        C0199a[] c0199aArr;
        C0199a[] c0199aArr2;
        do {
            c0199aArr = (C0199a[]) this.f16283c.get();
            if (c0199aArr == f16280g) {
                return false;
            }
            int length = c0199aArr.length;
            c0199aArr2 = new C0199a[length + 1];
            System.arraycopy(c0199aArr, 0, c0199aArr2, 0, length);
            c0199aArr2[length] = c0199a;
        } while (!T1.e.a(this.f16283c, c0199aArr, c0199aArr2));
        return true;
    }

    public void N(C0199a c0199a) {
        C0199a[] c0199aArr;
        C0199a[] c0199aArr2;
        do {
            c0199aArr = (C0199a[]) this.f16283c.get();
            int length = c0199aArr.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (c0199aArr[i10] == c0199a) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                c0199aArr2 = f16279f;
            } else {
                C0199a[] c0199aArr3 = new C0199a[length - 1];
                System.arraycopy(c0199aArr, 0, c0199aArr3, 0, i10);
                System.arraycopy(c0199aArr, i10 + 1, c0199aArr3, i10, (length - i10) - 1);
                c0199aArr2 = c0199aArr3;
            }
        } while (!T1.e.a(this.f16283c, c0199aArr, c0199aArr2));
    }

    @Override // Eb.t
    public void onError(Throwable th) {
        this.f16285e = th;
        for (C0199a c0199a : (C0199a[]) this.f16283c.getAndSet(f16280g)) {
            if (!c0199a.j()) {
                c0199a.f16286a.onError(th);
            }
        }
    }

    @Override // Eb.t
    public void onSuccess(Object obj) {
        this.f16284d = obj;
        for (C0199a c0199a : (C0199a[]) this.f16283c.getAndSet(f16280g)) {
            if (!c0199a.j()) {
                c0199a.f16286a.onSuccess(obj);
            }
        }
    }

    @Override // Eb.t
    public void b(Hb.c cVar) {
    }
}
