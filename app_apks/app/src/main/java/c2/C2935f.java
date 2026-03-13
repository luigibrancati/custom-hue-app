package c2;

import K7.A;
import K7.AbstractC1081v;
import java.util.ArrayList;

/* JADX INFO: renamed from: c2.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2935f implements InterfaceC2930a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f25557a = new ArrayList();

    @Override // c2.InterfaceC2930a
    public AbstractC1081v a(long j10) {
        int iF = f(j10);
        if (iF == 0) {
            return AbstractC1081v.z();
        }
        F2.e eVar = (F2.e) this.f25557a.get(iF - 1);
        long j11 = eVar.f3662d;
        return (j11 == -9223372036854775807L || j10 < j11) ? eVar.f3659a : AbstractC1081v.z();
    }

    @Override // c2.InterfaceC2930a
    public long b(long j10) {
        if (this.f25557a.isEmpty() || j10 < ((F2.e) this.f25557a.get(0)).f3660b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < this.f25557a.size(); i10++) {
            long j11 = ((F2.e) this.f25557a.get(i10)).f3660b;
            if (j10 == j11) {
                return j11;
            }
            if (j10 < j11) {
                F2.e eVar = (F2.e) this.f25557a.get(i10 - 1);
                long j12 = eVar.f3662d;
                return (j12 == -9223372036854775807L || j12 > j10) ? eVar.f3660b : j12;
            }
        }
        F2.e eVar2 = (F2.e) A.d(this.f25557a);
        long j13 = eVar2.f3662d;
        return (j13 == -9223372036854775807L || j10 < j13) ? eVar2.f3660b : j13;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // c2.InterfaceC2930a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(F2.e r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f3660b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r4 = 1
            if (r0 == 0) goto Lf
            r0 = r4
            goto L10
        Lf:
            r0 = r1
        L10:
            G1.AbstractC0853a.a(r0)
            long r5 = r10.f3660b
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 > 0) goto L25
            long r5 = r10.f3662d
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L23
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 >= 0) goto L25
        L23:
            r0 = r4
            goto L26
        L25:
            r0 = r1
        L26:
            java.util.ArrayList r2 = r9.f25557a
            int r2 = r2.size()
            int r2 = r2 - r4
        L2d:
            if (r2 < 0) goto L58
            long r5 = r10.f3660b
            java.util.ArrayList r3 = r9.f25557a
            java.lang.Object r3 = r3.get(r2)
            F2.e r3 = (F2.e) r3
            long r7 = r3.f3660b
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L46
            java.util.ArrayList r9 = r9.f25557a
            int r2 = r2 + r4
            r9.add(r2, r10)
            return r0
        L46:
            java.util.ArrayList r3 = r9.f25557a
            java.lang.Object r3 = r3.get(r2)
            F2.e r3 = (F2.e) r3
            long r5 = r3.f3660b
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 > 0) goto L55
            r0 = r1
        L55:
            int r2 = r2 + (-1)
            goto L2d
        L58:
            java.util.ArrayList r9 = r9.f25557a
            r9.add(r1, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.C2935f.c(F2.e, long):boolean");
    }

    @Override // c2.InterfaceC2930a
    public void clear() {
        this.f25557a.clear();
    }

    @Override // c2.InterfaceC2930a
    public long d(long j10) {
        if (this.f25557a.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < ((F2.e) this.f25557a.get(0)).f3660b) {
            return ((F2.e) this.f25557a.get(0)).f3660b;
        }
        for (int i10 = 1; i10 < this.f25557a.size(); i10++) {
            F2.e eVar = (F2.e) this.f25557a.get(i10);
            if (j10 < eVar.f3660b) {
                long j11 = ((F2.e) this.f25557a.get(i10 - 1)).f3662d;
                return (j11 == -9223372036854775807L || j11 <= j10 || j11 >= eVar.f3660b) ? eVar.f3660b : j11;
            }
        }
        long j12 = ((F2.e) A.d(this.f25557a)).f3662d;
        if (j12 == -9223372036854775807L || j10 >= j12) {
            return Long.MIN_VALUE;
        }
        return j12;
    }

    @Override // c2.InterfaceC2930a
    public void e(long j10) {
        int iF = f(j10);
        if (iF == 0) {
            return;
        }
        long j11 = ((F2.e) this.f25557a.get(iF - 1)).f3662d;
        if (j11 == -9223372036854775807L || j11 >= j10) {
            iF--;
        }
        this.f25557a.subList(0, iF).clear();
    }

    public final int f(long j10) {
        for (int i10 = 0; i10 < this.f25557a.size(); i10++) {
            if (j10 < ((F2.e) this.f25557a.get(i10)).f3660b) {
                return i10;
            }
        }
        return this.f25557a.size();
    }
}
