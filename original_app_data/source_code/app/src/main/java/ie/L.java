package ie;

import fc.C4025h;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class L extends J {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(String source) {
        super(source);
        AbstractC4862t.e(source, "source");
    }

    @Override // ie.AbstractC4379a
    public byte F() {
        String strC = C();
        int iJ = J();
        if (iJ >= strC.length() || iJ == -1) {
            return (byte) 10;
        }
        this.f37518a = iJ;
        return AbstractC4380b.a(strC.charAt(iJ));
    }

    @Override // ie.J, ie.AbstractC4379a
    public int J() {
        int i10;
        int iH0 = this.f37518a;
        if (iH0 == -1) {
            return iH0;
        }
        String strC = C();
        while (iH0 < strC.length()) {
            char cCharAt = strC.charAt(iH0);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt != '/' || (i10 = iH0 + 1) >= strC.length()) {
                    break;
                }
                char cCharAt2 = strC.charAt(i10);
                if (cCharAt2 == '*') {
                    int iI0 = Od.F.i0(strC, "*/", iH0 + 2, false, 4, null);
                    if (iI0 == -1) {
                        this.f37518a = strC.length();
                        AbstractC4379a.z(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
                        throw new C4025h();
                    }
                    iH0 = iI0 + 2;
                } else {
                    if (cCharAt2 != '/') {
                        break;
                    }
                    iH0 = Od.F.h0(strC, '\n', iH0 + 2, false, 4, null);
                    if (iH0 == -1) {
                        iH0 = strC.length();
                    }
                }
            }
            iH0++;
        }
        this.f37518a = iH0;
        return iH0;
    }

    @Override // ie.J, ie.AbstractC4379a
    public boolean f() {
        int iJ = J();
        if (iJ >= C().length() || iJ == -1) {
            return false;
        }
        return D(C().charAt(iJ));
    }

    @Override // ie.J, ie.AbstractC4379a
    public byte k() {
        String strC = C();
        int iJ = J();
        if (iJ >= strC.length() || iJ == -1) {
            return (byte) 10;
        }
        this.f37518a = iJ + 1;
        return AbstractC4380b.a(strC.charAt(iJ));
    }

    @Override // ie.J, ie.AbstractC4379a
    public void m(char c10) {
        String strC = C();
        int iJ = J();
        if (iJ >= strC.length() || iJ == -1) {
            this.f37518a = -1;
            P(c10);
        }
        char cCharAt = strC.charAt(iJ);
        this.f37518a = iJ + 1;
        if (cCharAt == c10) {
            return;
        }
        P(c10);
    }
}
