package Ub;

import Mb.g;
import Yb.j;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f16824i = Integer.getInteger("jctools.spsc.max.lookahead.step", RecognitionOptions.AZTEC).intValue();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f16825j = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AtomicReferenceArray f16830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AtomicReferenceArray f16832g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f16826a = new AtomicLong();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicLong f16833h = new AtomicLong();

    public c(int i10) {
        int iA = j.a(Math.max(8, i10));
        int i11 = iA - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(iA + 1);
        this.f16830e = atomicReferenceArray;
        this.f16829d = i11;
        a(iA);
        this.f16832g = atomicReferenceArray;
        this.f16831f = i11;
        this.f16828c = iA - 2;
        o(0L);
    }

    public static int c(long j10, int i10) {
        return b(((int) j10) & i10);
    }

    public static Object g(AtomicReferenceArray atomicReferenceArray, int i10) {
        return atomicReferenceArray.get(i10);
    }

    private void l(long j10) {
        this.f16833h.lazySet(j10);
    }

    public static void m(AtomicReferenceArray atomicReferenceArray, int i10, Object obj) {
        atomicReferenceArray.lazySet(i10, obj);
    }

    private void o(long j10) {
        this.f16826a.lazySet(j10);
    }

    public final void a(int i10) {
        this.f16827b = Math.min(i10 / 4, f16824i);
    }

    @Override // Mb.h
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public final long d() {
        return this.f16833h.get();
    }

    public final long e() {
        return this.f16826a.get();
    }

    public final long f() {
        return this.f16833h.get();
    }

    public final AtomicReferenceArray h(AtomicReferenceArray atomicReferenceArray, int i10) {
        int iB = b(i10);
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) g(atomicReferenceArray, iB);
        m(atomicReferenceArray, iB, null);
        return atomicReferenceArray2;
    }

    public final long i() {
        return this.f16826a.get();
    }

    @Override // Mb.h
    public boolean isEmpty() {
        return i() == f();
    }

    public final Object j(AtomicReferenceArray atomicReferenceArray, long j10, int i10) {
        this.f16832g = atomicReferenceArray;
        int iC = c(j10, i10);
        Object objG = g(atomicReferenceArray, iC);
        if (objG != null) {
            m(atomicReferenceArray, iC, null);
            l(j10 + 1);
        }
        return objG;
    }

    public final void k(AtomicReferenceArray atomicReferenceArray, long j10, int i10, Object obj, long j11) {
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f16830e = atomicReferenceArray2;
        this.f16828c = (j11 + j10) - 1;
        m(atomicReferenceArray2, i10, obj);
        n(atomicReferenceArray, atomicReferenceArray2);
        m(atomicReferenceArray, i10, f16825j);
        o(j10 + 1);
    }

    public final void n(AtomicReferenceArray atomicReferenceArray, AtomicReferenceArray atomicReferenceArray2) {
        m(atomicReferenceArray, b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    @Override // Mb.h
    public boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.f16830e;
        long jE = e();
        int i10 = this.f16829d;
        int iC = c(jE, i10);
        if (jE < this.f16828c) {
            return p(atomicReferenceArray, obj, jE, iC);
        }
        long j10 = ((long) this.f16827b) + jE;
        if (g(atomicReferenceArray, c(j10, i10)) == null) {
            this.f16828c = j10 - 1;
            return p(atomicReferenceArray, obj, jE, iC);
        }
        if (g(atomicReferenceArray, c(jE + 1, i10)) == null) {
            return p(atomicReferenceArray, obj, jE, iC);
        }
        k(atomicReferenceArray, jE, iC, obj, i10);
        return true;
    }

    public final boolean p(AtomicReferenceArray atomicReferenceArray, Object obj, long j10, int i10) {
        m(atomicReferenceArray, i10, obj);
        o(j10 + 1);
        return true;
    }

    @Override // Mb.g, Mb.h
    public Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.f16832g;
        long jD = d();
        int i10 = this.f16831f;
        int iC = c(jD, i10);
        Object objG = g(atomicReferenceArray, iC);
        boolean z10 = objG == f16825j;
        if (objG == null || z10) {
            if (z10) {
                return j(h(atomicReferenceArray, i10 + 1), jD, i10);
            }
            return null;
        }
        m(atomicReferenceArray, iC, null);
        l(jD + 1);
        return objG;
    }

    public static int b(int i10) {
        return i10;
    }
}
