package ea;

import Eb.p;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a[] f33887b = new a[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f33888a = new AtomicReference(f33887b);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicBoolean implements Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f33889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f33890b;

        public a(p pVar, c cVar) {
            this.f33889a = pVar;
            this.f33890b = cVar;
        }

        public void a(Object obj) {
            if (get()) {
                return;
            }
            this.f33889a.c(obj);
        }

        @Override // Hb.c
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f33890b.S0(this);
            }
        }

        @Override // Hb.c
        public boolean j() {
            return get();
        }
    }

    public static c R0() {
        return new c();
    }

    @Override // ea.d
    public boolean O0() {
        return ((a[]) this.f33888a.get()).length != 0;
    }

    public void Q0(a aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.f33888a.get();
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!T1.e.a(this.f33888a, aVarArr, aVarArr2));
    }

    public void S0(a aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.f33888a.get();
            if (aVarArr == f33887b) {
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
                aVarArr2 = f33887b;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!T1.e.a(this.f33888a, aVarArr, aVarArr2));
    }

    @Override // ea.d, Jb.d
    public void accept(Object obj) {
        if (obj == null) {
            throw new NullPointerException("value == null");
        }
        for (a aVar : (a[]) this.f33888a.get()) {
            aVar.a(obj);
        }
    }

    @Override // Eb.k
    public void v0(p pVar) {
        a aVar = new a(pVar, this);
        pVar.b(aVar);
        Q0(aVar);
        if (aVar.j()) {
            S0(aVar);
        }
    }
}
