package Yd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.L;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20071b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20072c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20073d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20074e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f20075a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final h a(h hVar, boolean z10) {
        if (z10) {
            return b(hVar);
        }
        h hVar2 = (h) f20071b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final h b(h hVar) {
        if (e() == 127) {
            return hVar;
        }
        if (hVar.f20062b) {
            f20074e.incrementAndGet(this);
        }
        int i10 = f20072c.get(this) & 127;
        while (this.f20075a.get(i10) != null) {
            Thread.yield();
        }
        this.f20075a.lazySet(i10, hVar);
        f20072c.incrementAndGet(this);
        return null;
    }

    public final void c(h hVar) {
        if (hVar == null || !hVar.f20062b) {
            return;
        }
        f20074e.decrementAndGet(this);
    }

    public final int e() {
        return f20072c.get(this) - f20073d.get(this);
    }

    public final int i() {
        Object obj = f20071b.get(this);
        int iE = e();
        return obj != null ? iE + 1 : iE;
    }

    public final void j(d dVar) {
        h hVar = (h) f20071b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        while (n(dVar)) {
        }
    }

    public final h k() {
        h hVar = (h) f20071b.getAndSet(this, null);
        return hVar == null ? m() : hVar;
    }

    public final h l() {
        return o(true);
    }

    public final h m() {
        h hVar;
        while (true) {
            int i10 = f20073d.get(this);
            if (i10 - f20072c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f20073d.compareAndSet(this, i10, i10 + 1) && (hVar = (h) this.f20075a.getAndSet(i11, null)) != null) {
                c(hVar);
                return hVar;
            }
        }
    }

    public final boolean n(d dVar) {
        h hVarM = m();
        if (hVarM == null) {
            return false;
        }
        dVar.a(hVarM);
        return true;
    }

    public final h o(boolean z10) {
        h hVar;
        do {
            hVar = (h) f20071b.get(this);
            if (hVar == null || hVar.f20062b != z10) {
                int i10 = f20073d.get(this);
                int i11 = f20072c.get(this);
                while (i10 != i11) {
                    if (z10 && f20074e.get(this) == 0) {
                        return null;
                    }
                    i11--;
                    h hVarQ = q(i11, z10);
                    if (hVarQ != null) {
                        return hVarQ;
                    }
                }
                return null;
            }
        } while (!B0.b.a(f20071b, this, hVar, null));
        return hVar;
    }

    public final h p(int i10) {
        int i11 = f20073d.get(this);
        int i12 = f20072c.get(this);
        boolean z10 = i10 == 1;
        while (i11 != i12) {
            if (z10 && f20074e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            h hVarQ = q(i11, z10);
            if (hVarQ != null) {
                return hVarQ;
            }
            i11 = i13;
        }
        return null;
    }

    public final h q(int i10, boolean z10) {
        int i11 = i10 & 127;
        h hVar = (h) this.f20075a.get(i11);
        if (hVar == null || hVar.f20062b != z10 || !Td.l.a(this.f20075a, i11, hVar, null)) {
            return null;
        }
        if (z10) {
            f20074e.decrementAndGet(this);
        }
        return hVar;
    }

    public final long r(int i10, L l10) {
        h hVarM = i10 == 3 ? m() : p(i10);
        if (hVarM == null) {
            return s(i10, l10);
        }
        l10.f39776a = hVarM;
        return -1L;
    }

    public final long s(int i10, L l10) {
        h hVar;
        do {
            hVar = (h) f20071b.get(this);
            if (hVar == null) {
                return -2L;
            }
            if (((hVar.f20062b ? 1 : 2) & i10) == 0) {
                return -2L;
            }
            long jA = j.f20069f.a() - hVar.f20061a;
            long j10 = j.f20065b;
            if (jA < j10) {
                return j10 - jA;
            }
        } while (!B0.b.a(f20071b, this, hVar, null));
        l10.f39776a = hVar;
        return -1L;
    }
}
