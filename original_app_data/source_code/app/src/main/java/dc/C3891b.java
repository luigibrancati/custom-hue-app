package dc;

import Eb.p;
import bc.AbstractC2904a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: dc.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3891b extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a[] f33332c = new a[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a[] f33333d = new a[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f33334a = new AtomicReference(f33333d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f33335b;

    /* JADX INFO: renamed from: dc.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicBoolean implements Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f33336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C3891b f33337b;

        public a(p pVar, C3891b c3891b) {
            this.f33336a = pVar;
            this.f33337b = c3891b;
        }

        public void a() {
            if (get()) {
                return;
            }
            this.f33336a.a();
        }

        public void b(Throwable th) {
            if (get()) {
                AbstractC2904a.q(th);
            } else {
                this.f33336a.onError(th);
            }
        }

        public void c(Object obj) {
            if (get()) {
                return;
            }
            this.f33336a.c(obj);
        }

        @Override // Hb.c
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f33337b.R0(this);
            }
        }

        @Override // Hb.c
        public boolean j() {
            return get();
        }
    }

    public static C3891b Q0() {
        return new C3891b();
    }

    public boolean P0(a aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.f33334a.get();
            if (aVarArr == f33332c) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!T1.e.a(this.f33334a, aVarArr, aVarArr2));
        return true;
    }

    public void R0(a aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.f33334a.get();
            if (aVarArr == f33332c || aVarArr == f33333d) {
                return;
            }
            int length = aVarArr.length;
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
            if (length == 1) {
                aVarArr2 = f33333d;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!T1.e.a(this.f33334a, aVarArr, aVarArr2));
    }

    @Override // Eb.p
    public void a() {
        Object obj = this.f33334a.get();
        Object obj2 = f33332c;
        if (obj == obj2) {
            return;
        }
        a[] aVarArr = (a[]) this.f33334a.getAndSet(obj2);
        for (a aVar : aVarArr) {
            aVar.a();
        }
    }

    @Override // Eb.p
    public void b(Hb.c cVar) {
        if (this.f33334a.get() == f33332c) {
            cVar.dispose();
        }
    }

    @Override // Eb.p
    public void c(Object obj) {
        Lb.b.e(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (a aVar : (a[]) this.f33334a.get()) {
            aVar.c(obj);
        }
    }

    @Override // Eb.p
    public void onError(Throwable th) {
        Lb.b.e(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object obj = this.f33334a.get();
        Object obj2 = f33332c;
        if (obj == obj2) {
            AbstractC2904a.q(th);
            return;
        }
        this.f33335b = th;
        a[] aVarArr = (a[]) this.f33334a.getAndSet(obj2);
        for (a aVar : aVarArr) {
            aVar.b(th);
        }
    }

    @Override // Eb.k
    public void v0(p pVar) {
        a aVar = new a(pVar, this);
        pVar.b(aVar);
        if (P0(aVar)) {
            if (aVar.j()) {
                R0(aVar);
            }
        } else {
            Throwable th = this.f33335b;
            if (th != null) {
                pVar.onError(th);
            } else {
                pVar.a();
            }
        }
    }
}
