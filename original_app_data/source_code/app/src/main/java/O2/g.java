package O2;

import D1.w;
import F2.s;
import G1.C;
import G1.InterfaceC0864l;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f10907a = new C();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f10908b = new b();

    public static int d(C c10) {
        int i10 = -1;
        int iG = 0;
        while (i10 == -1) {
            iG = c10.g();
            String strW = c10.w();
            i10 = strW == null ? 0 : "STYLE".equals(strW) ? 2 : strW.startsWith("NOTE") ? 1 : 3;
        }
        c10.a0(iG);
        return i10;
    }

    public static void e(C c10) {
        while (!TextUtils.isEmpty(c10.w())) {
        }
    }

    @Override // F2.s
    public int b() {
        return 1;
    }

    @Override // F2.s
    public void c(byte[] bArr, int i10, int i11, s.b bVar, InterfaceC0864l interfaceC0864l) {
        d dVarN;
        this.f10907a.Y(bArr, i11 + i10);
        this.f10907a.a0(i10);
        ArrayList arrayList = new ArrayList();
        try {
            h.e(this.f10907a);
            while (!TextUtils.isEmpty(this.f10907a.w())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int iD = d(this.f10907a);
                if (iD == 0) {
                    F2.i.c(new j(arrayList2), bVar, interfaceC0864l);
                    return;
                }
                if (iD == 1) {
                    e(this.f10907a);
                } else if (iD == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.f10907a.w();
                    arrayList.addAll(this.f10908b.d(this.f10907a));
                } else if (iD == 3 && (dVarN = e.n(this.f10907a, arrayList)) != null) {
                    arrayList2.add(dVarN);
                }
            }
        } catch (w e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
