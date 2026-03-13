package F2;

import G1.InterfaceC0864l;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static int a(k kVar, long j10) {
        if (j10 == -9223372036854775807L) {
            return 0;
        }
        int iA = kVar.a(j10);
        if (iA == -1) {
            iA = kVar.p();
        }
        return (iA <= 0 || kVar.j(iA + (-1)) != j10) ? iA : iA - 1;
    }

    public static void b(k kVar, int i10, InterfaceC0864l interfaceC0864l) {
        long j10 = kVar.j(i10);
        List listB = kVar.b(j10);
        if (listB.isEmpty()) {
            return;
        }
        if (i10 == kVar.p() - 1) {
            throw new IllegalStateException();
        }
        long j11 = kVar.j(i10 + 1) - kVar.j(i10);
        if (j11 > 0) {
            interfaceC0864l.accept(new e(listB, j10, j11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(F2.k r11, F2.s.b r12, G1.InterfaceC0864l r13) {
        /*
            long r0 = r12.f3688a
            int r0 = a(r11, r0)
            long r1 = r12.f3688a
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L3a
            int r1 = r11.p()
            if (r0 >= r1) goto L3a
            long r3 = r12.f3688a
            java.util.List r6 = r11.b(r3)
            long r3 = r11.j(r0)
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L3a
            long r7 = r12.f3688a
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 >= 0) goto L3a
            F2.e r5 = new F2.e
            long r9 = r3 - r7
            r5.<init>(r6, r7, r9)
            r13.accept(r5)
            r1 = 1
            goto L3b
        L3a:
            r1 = r2
        L3b:
            r3 = r0
        L3c:
            int r4 = r11.p()
            if (r3 >= r4) goto L48
            b(r11, r3, r13)
            int r3 = r3 + 1
            goto L3c
        L48:
            boolean r3 = r12.f3689b
            if (r3 == 0) goto L74
            if (r1 == 0) goto L50
            int r0 = r0 + (-1)
        L50:
            if (r2 >= r0) goto L58
            b(r11, r2, r13)
            int r2 = r2 + 1
            goto L50
        L58:
            if (r1 == 0) goto L74
            F2.e r3 = new F2.e
            long r1 = r12.f3688a
            java.util.List r4 = r11.b(r1)
            long r5 = r11.j(r0)
            long r1 = r12.f3688a
            long r11 = r11.j(r0)
            long r7 = r1 - r11
            r3.<init>(r4, r5, r7)
            r13.accept(r3)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.i.c(F2.k, F2.s$b, G1.l):void");
    }
}
