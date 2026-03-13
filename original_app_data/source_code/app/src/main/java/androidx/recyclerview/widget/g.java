package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f24441e = new ThreadLocal();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Comparator f24442f = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f24444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f24445c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f24443a = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f24446d = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f24454d;
            if ((recyclerView == null) != (cVar2.f24454d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f24451a;
            if (z10 != cVar2.f24451a) {
                return z10 ? -1 : 1;
            }
            int i10 = cVar2.f24452b - cVar.f24452b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f24453c - cVar2.f24453c;
            if (i11 != 0) {
                return i11;
            }
            return 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b implements RecyclerView.p.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int[] f24449c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f24450d;

        @Override // androidx.recyclerview.widget.RecyclerView.p.c
        public void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i12 = this.f24450d;
            int i13 = i12 * 2;
            int[] iArr = this.f24449c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f24449c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i13 >= iArr.length) {
                int[] iArr3 = new int[i12 * 4];
                this.f24449c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f24449c;
            iArr4[i13] = i10;
            iArr4[i13 + 1] = i11;
            this.f24450d++;
        }

        public void b() {
            int[] iArr = this.f24449c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f24450d = 0;
        }

        public void c(RecyclerView recyclerView, boolean z10) {
            this.f24450d = 0;
            int[] iArr = this.f24449c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.f24126m;
            if (recyclerView.f24124l == null || pVar == null || !pVar.v0()) {
                return;
            }
            if (z10) {
                if (!recyclerView.f24115d.p()) {
                    pVar.q(recyclerView.f24124l.getItemCount(), this);
                }
            } else if (!recyclerView.o0()) {
                pVar.p(this.f24447a, this.f24448b, recyclerView.f24149x0, this);
            }
            int i10 = this.f24450d;
            if (i10 > pVar.f24222m) {
                pVar.f24222m = i10;
                pVar.f24223n = z10;
                recyclerView.f24113b.K();
            }
        }

        public boolean d(int i10) {
            if (this.f24449c != null) {
                int i11 = this.f24450d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f24449c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void e(int i10, int i11) {
            this.f24447a = i10;
            this.f24448b = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f24451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24453c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RecyclerView f24454d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f24455e;

        public void a() {
            this.f24451a = false;
            this.f24452b = 0;
            this.f24453c = 0;
            this.f24454d = null;
            this.f24455e = 0;
        }
    }

    public static boolean e(RecyclerView recyclerView, int i10) {
        int iJ = recyclerView.f24116e.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            RecyclerView.E eI0 = RecyclerView.i0(recyclerView.f24116e.i(i11));
            if (eI0.mPosition == i10 && !eI0.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    public void a(RecyclerView recyclerView) {
        this.f24443a.add(recyclerView);
    }

    public final void b() {
        c cVar;
        int size = this.f24443a.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = (RecyclerView) this.f24443a.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f24147w0.c(recyclerView, false);
                i10 += recyclerView.f24147w0.f24450d;
            }
        }
        this.f24446d.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f24443a.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f24147w0;
                int iAbs = Math.abs(bVar.f24447a) + Math.abs(bVar.f24448b);
                for (int i14 = 0; i14 < bVar.f24450d * 2; i14 += 2) {
                    if (i12 >= this.f24446d.size()) {
                        cVar = new c();
                        this.f24446d.add(cVar);
                    } else {
                        cVar = (c) this.f24446d.get(i12);
                    }
                    int[] iArr = bVar.f24449c;
                    int i15 = iArr[i14 + 1];
                    cVar.f24451a = i15 <= iAbs;
                    cVar.f24452b = iAbs;
                    cVar.f24453c = i15;
                    cVar.f24454d = recyclerView2;
                    cVar.f24455e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f24446d, f24442f);
    }

    public final void c(c cVar, long j10) {
        RecyclerView.E eI = i(cVar.f24454d, cVar.f24455e, cVar.f24451a ? Long.MAX_VALUE : j10);
        if (eI == null || eI.mNestedRecyclerView == null || !eI.isBound() || eI.isInvalid()) {
            return;
        }
        h(eI.mNestedRecyclerView.get(), j10);
    }

    public final void d(long j10) {
        for (int i10 = 0; i10 < this.f24446d.size(); i10++) {
            c cVar = (c) this.f24446d.get(i10);
            if (cVar.f24454d == null) {
                return;
            }
            c(cVar, j10);
            cVar.a();
        }
    }

    public void f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f24444b == 0) {
            this.f24444b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f24147w0.e(i10, i11);
    }

    public void g(long j10) {
        b();
        d(j10);
    }

    public final void h(RecyclerView recyclerView, long j10) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f24084D && recyclerView.f24116e.j() != 0) {
            recyclerView.X0();
        }
        b bVar = recyclerView.f24147w0;
        bVar.c(recyclerView, true);
        if (bVar.f24450d != 0) {
            try {
                U0.m.a("RV Nested Prefetch");
                recyclerView.f24149x0.f(recyclerView.f24124l);
                for (int i10 = 0; i10 < bVar.f24450d * 2; i10 += 2) {
                    i(recyclerView, bVar.f24449c[i10], j10);
                }
            } finally {
                U0.m.b();
            }
        }
    }

    public final RecyclerView.E i(RecyclerView recyclerView, int i10, long j10) {
        if (e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.w wVar = recyclerView.f24113b;
        try {
            recyclerView.J0();
            RecyclerView.E eI = wVar.I(i10, false, j10);
            if (eI != null) {
                if (!eI.isBound() || eI.isInvalid()) {
                    wVar.a(eI, false);
                } else {
                    wVar.B(eI.itemView);
                }
            }
            recyclerView.L0(false);
            return eI;
        } catch (Throwable th) {
            recyclerView.L0(false);
            throw th;
        }
    }

    public void j(RecyclerView recyclerView) {
        this.f24443a.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            U0.m.a("RV Prefetch");
            if (!this.f24443a.isEmpty()) {
                int size = this.f24443a.size();
                long jMax = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = (RecyclerView) this.f24443a.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f24445c);
                }
            }
        } finally {
            this.f24444b = 0L;
            U0.m.b();
        }
    }
}
