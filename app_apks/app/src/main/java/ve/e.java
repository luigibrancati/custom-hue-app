package ve;

import Fe.C0843e;
import Fe.C0846h;
import Od.C;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import pe.n;
import pe.o;
import pe.u;
import pe.v;
import qe.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0846h f46040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0846h f46041b;

    static {
        C0846h.a aVar = C0846h.f4117d;
        f46040a = aVar.d("\"\\");
        f46041b = aVar.d("\t ,=");
    }

    public static final List a(u uVar, String headerName) {
        AbstractC4862t.e(uVar, "<this>");
        AbstractC4862t.e(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = uVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (C.E(headerName, uVar.e(i10), true)) {
                try {
                    c(new C0843e().T(uVar.h(i10)), arrayList);
                } catch (EOFException e10) {
                    Ae.h.f493a.g().k("Unable to parse challenge", 5, e10);
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(pe.C c10) {
        AbstractC4862t.e(c10, "<this>");
        if (AbstractC4862t.a(c10.K().i(), "HEAD")) {
            return false;
        }
        int iG = c10.g();
        return (((iG >= 100 && iG < 200) || iG == 204 || iG == 304) && p.i(c10) == -1 && !C.E("chunked", pe.C.m(c10, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00bc, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bc, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(Fe.C0843e r7, java.util.List r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Lf
            g(r7)
            java.lang.String r1 = e(r7)
            if (r1 != 0) goto Lf
            goto Lb9
        Lf:
            boolean r2 = g(r7)
            java.lang.String r3 = e(r7)
            if (r3 != 0) goto L2e
            boolean r7 = r7.z0()
            if (r7 != 0) goto L21
            goto Lb9
        L21:
            pe.h r7 = new pe.h
            java.util.Map r0 = gc.Q.i()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2e:
            r4 = 61
            int r5 = qe.m.E(r7, r4)
            boolean r6 = g(r7)
            if (r2 != 0) goto L69
            if (r6 != 0) goto L42
            boolean r2 = r7.z0()
            if (r2 == 0) goto L69
        L42:
            pe.h r2 = new pe.h
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "="
            java.lang.String r3 = Od.C.H(r3, r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "singletonMap(...)"
            kotlin.jvm.internal.AbstractC4862t.d(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L69:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = qe.m.E(r7, r4)
            int r5 = r5 + r6
        L73:
            if (r3 != 0) goto L83
            java.lang.String r3 = e(r7)
            boolean r5 = g(r7)
            if (r5 != 0) goto Lbc
            int r5 = qe.m.E(r7, r4)
        L83:
            if (r5 == 0) goto Lbc
            r6 = 1
            if (r5 <= r6) goto L89
            goto Lb9
        L89:
            boolean r6 = g(r7)
            if (r6 == 0) goto L90
            goto Lb9
        L90:
            r6 = 34
            boolean r6 = h(r7, r6)
            if (r6 == 0) goto L9d
            java.lang.String r6 = d(r7)
            goto La1
        L9d:
            java.lang.String r6 = e(r7)
        La1:
            if (r6 != 0) goto La4
            goto Lb9
        La4:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lad
            goto Lb9
        Lad:
            boolean r3 = g(r7)
            if (r3 != 0) goto Lba
            boolean r3 = r7.z0()
            if (r3 != 0) goto Lba
        Lb9:
            return
        Lba:
            r3 = r0
            goto L73
        Lbc:
            pe.h r4 = new pe.h
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: ve.e.c(Fe.e, java.util.List):void");
    }

    public static final String d(C0843e c0843e) throws EOFException {
        if (c0843e.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C0843e c0843e2 = new C0843e();
        while (true) {
            long jC = c0843e.C(f46040a);
            if (jC == -1) {
                return null;
            }
            if (c0843e.q(jC) == 34) {
                c0843e2.J(c0843e, jC);
                c0843e.readByte();
                return c0843e2.p0();
            }
            if (c0843e.size() == jC + 1) {
                return null;
            }
            c0843e2.J(c0843e, jC);
            c0843e.readByte();
            c0843e2.J(c0843e, 1L);
        }
    }

    public static final String e(C0843e c0843e) {
        long jC = c0843e.C(f46041b);
        if (jC == -1) {
            jC = c0843e.size();
        }
        if (jC != 0) {
            return c0843e.o0(jC);
        }
        return null;
    }

    public static final void f(o oVar, v url, u headers) {
        AbstractC4862t.e(oVar, "<this>");
        AbstractC4862t.e(url, "url");
        AbstractC4862t.e(headers, "headers");
        if (oVar == o.f42847b) {
            return;
        }
        List listE = n.f42831k.e(url, headers);
        if (listE.isEmpty()) {
            return;
        }
        oVar.b(url, listE);
    }

    public static final boolean g(C0843e c0843e) throws EOFException {
        boolean z10 = false;
        while (!c0843e.z0()) {
            byte bQ = c0843e.q(0L);
            if (bQ == 44) {
                c0843e.readByte();
                z10 = true;
            } else {
                if (bQ != 32 && bQ != 9) {
                    break;
                }
                c0843e.readByte();
            }
        }
        return z10;
    }

    public static final boolean h(C0843e c0843e, byte b10) {
        return !c0843e.z0() && c0843e.q(0L) == b10;
    }
}
