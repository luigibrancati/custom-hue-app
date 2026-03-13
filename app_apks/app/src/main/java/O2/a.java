package O2;

import F1.a;
import F2.s;
import G1.AbstractC0853a;
import G1.C;
import G1.InterfaceC0864l;
import G1.M;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f10858a = new C();

    public static F1.a d(C c10, int i10) {
        CharSequence charSequenceR = null;
        a.b bVarP = null;
        while (i10 > 0) {
            AbstractC0853a.b(i10 >= 8, "Incomplete vtt cue box header found.");
            int iU = c10.u();
            int iU2 = c10.u();
            int i11 = iU - 8;
            String strI = M.I(c10.f(), c10.g(), i11);
            c10.b0(i11);
            i10 = (i10 - 8) - i11;
            if (iU2 == 1937011815) {
                bVarP = e.p(strI);
            } else if (iU2 == 1885436268) {
                charSequenceR = e.r(null, strI.trim(), Collections.EMPTY_LIST);
            }
        }
        if (charSequenceR == null) {
            charSequenceR = "";
        }
        return bVarP != null ? bVarP.o(charSequenceR).a() : e.m(charSequenceR);
    }

    @Override // F2.s
    public int b() {
        return 2;
    }

    @Override // F2.s
    public void c(byte[] bArr, int i10, int i11, s.b bVar, InterfaceC0864l interfaceC0864l) {
        this.f10858a.Y(bArr, i11 + i10);
        this.f10858a.a0(i10);
        ArrayList arrayList = new ArrayList();
        while (this.f10858a.a() > 0) {
            AbstractC0853a.b(this.f10858a.a() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iU = this.f10858a.u();
            if (this.f10858a.u() == 1987343459) {
                arrayList.add(d(this.f10858a, iU - 8));
            } else {
                this.f10858a.b0(iU - 8);
            }
        }
        interfaceC0864l.accept(new F2.e(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
