package c2;

import G1.AbstractC0853a;
import K7.AbstractC1081v;
import K7.M;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: c2.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2934e implements InterfaceC2930a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final M f25555b = M.d().f(new J7.f() { // from class: c2.c
        @Override // J7.f
        public final Object apply(Object obj) {
            return Long.valueOf(((F2.e) obj).f3660b);
        }
    }).a(M.d().g().f(new J7.f() { // from class: c2.d
        @Override // J7.f
        public final Object apply(Object obj) {
            return Long.valueOf(((F2.e) obj).f3661c);
        }
    }));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25556a = new ArrayList();

    @Override // c2.InterfaceC2930a
    public AbstractC1081v a(long j10) {
        if (!this.f25556a.isEmpty()) {
            if (j10 >= ((F2.e) this.f25556a.get(0)).f3660b) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.f25556a.size(); i10++) {
                    F2.e eVar = (F2.e) this.f25556a.get(i10);
                    if (j10 >= eVar.f3660b && j10 < eVar.f3662d) {
                        arrayList.add(eVar);
                    }
                    if (j10 < eVar.f3660b) {
                        break;
                    }
                }
                AbstractC1081v abstractC1081vM = AbstractC1081v.M(f25555b, arrayList);
                AbstractC1081v.a aVarR = AbstractC1081v.r();
                for (int i11 = 0; i11 < abstractC1081vM.size(); i11++) {
                    aVarR.j(((F2.e) abstractC1081vM.get(i11)).f3659a);
                }
                return aVarR.k();
            }
        }
        return AbstractC1081v.z();
    }

    @Override // c2.InterfaceC2930a
    public long b(long j10) {
        if (this.f25556a.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j10 < ((F2.e) this.f25556a.get(0)).f3660b) {
            return -9223372036854775807L;
        }
        long jMax = ((F2.e) this.f25556a.get(0)).f3660b;
        for (int i10 = 0; i10 < this.f25556a.size(); i10++) {
            long j11 = ((F2.e) this.f25556a.get(i10)).f3660b;
            long j12 = ((F2.e) this.f25556a.get(i10)).f3662d;
            if (j12 > j10) {
                if (j11 > j10) {
                    break;
                }
                jMax = Math.max(jMax, j11);
            } else {
                jMax = Math.max(jMax, j12);
            }
        }
        return jMax;
    }

    @Override // c2.InterfaceC2930a
    public boolean c(F2.e eVar, long j10) {
        AbstractC0853a.a(eVar.f3660b != -9223372036854775807L);
        AbstractC0853a.a(eVar.f3661c != -9223372036854775807L);
        boolean z10 = eVar.f3660b <= j10 && j10 < eVar.f3662d;
        for (int size = this.f25556a.size() - 1; size >= 0; size--) {
            if (eVar.f3660b >= ((F2.e) this.f25556a.get(size)).f3660b) {
                this.f25556a.add(size + 1, eVar);
                return z10;
            }
        }
        this.f25556a.add(0, eVar);
        return z10;
    }

    @Override // c2.InterfaceC2930a
    public void clear() {
        this.f25556a.clear();
    }

    @Override // c2.InterfaceC2930a
    public long d(long j10) {
        int i10 = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            if (i10 >= this.f25556a.size()) {
                break;
            }
            long j11 = ((F2.e) this.f25556a.get(i10)).f3660b;
            long j12 = ((F2.e) this.f25556a.get(i10)).f3662d;
            if (j10 < j11) {
                jMin = jMin == -9223372036854775807L ? j11 : Math.min(jMin, j11);
            } else {
                if (j10 < j12) {
                    jMin = jMin == -9223372036854775807L ? j12 : Math.min(jMin, j12);
                }
                i10++;
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // c2.InterfaceC2930a
    public void e(long j10) {
        int i10 = 0;
        while (i10 < this.f25556a.size()) {
            long j11 = ((F2.e) this.f25556a.get(i10)).f3660b;
            if (j10 > j11 && j10 > ((F2.e) this.f25556a.get(i10)).f3662d) {
                this.f25556a.remove(i10);
                i10--;
            } else if (j10 < j11) {
                return;
            }
            i10++;
        }
    }
}
