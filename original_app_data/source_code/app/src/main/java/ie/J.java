package ie;

import com.fasterxml.jackson.core.JsonFactory;
import fc.C4025h;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class J extends AbstractC4379a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f37515e;

    public J(String source) {
        AbstractC4862t.e(source, "source");
        this.f37515e = source;
    }

    @Override // ie.AbstractC4379a
    public String E(String keyToMatch, boolean z10) {
        AbstractC4862t.e(keyToMatch, "keyToMatch");
        int i10 = this.f37518a;
        try {
            if (k() == 6 && AbstractC4862t.a(G(z10), keyToMatch)) {
                v();
                if (k() == 5) {
                    return G(z10);
                }
            }
            return null;
        } finally {
            this.f37518a = i10;
            v();
        }
    }

    @Override // ie.AbstractC4379a
    public int H(int i10) {
        if (i10 < C().length()) {
            return i10;
        }
        return -1;
    }

    @Override // ie.AbstractC4379a
    public int J() {
        char cCharAt;
        int i10 = this.f37518a;
        if (i10 == -1) {
            return i10;
        }
        String strC = C();
        while (i10 < strC.length() && ((cCharAt = strC.charAt(i10)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i10++;
        }
        this.f37518a = i10;
        return i10;
    }

    @Override // ie.AbstractC4379a
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public String C() {
        return this.f37515e;
    }

    @Override // ie.AbstractC4379a
    public boolean f() {
        int i10 = this.f37518a;
        if (i10 == -1) {
            return false;
        }
        String strC = C();
        while (i10 < strC.length()) {
            char cCharAt = strC.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f37518a = i10;
                return D(cCharAt);
            }
            i10++;
        }
        this.f37518a = i10;
        return false;
    }

    @Override // ie.AbstractC4379a
    public String j() {
        m(JsonFactory.DEFAULT_QUOTE_CHAR);
        int i10 = this.f37518a;
        int iH0 = Od.F.h0(C(), JsonFactory.DEFAULT_QUOTE_CHAR, i10, false, 4, null);
        if (iH0 != -1) {
            for (int i11 = i10; i11 < iH0; i11++) {
                if (C().charAt(i11) == '\\') {
                    return r(C(), this.f37518a, i11);
                }
            }
            this.f37518a = iH0 + 1;
            String strSubstring = C().substring(i10, iH0);
            AbstractC4862t.d(strSubstring, "substring(...)");
            return strSubstring;
        }
        s();
        String strC = AbstractC4380b.c((byte) 1);
        int i12 = this.f37518a;
        AbstractC4379a.z(this, "Expected " + strC + ", but had '" + ((i12 == C().length() || i12 < 0) ? "EOF" : String.valueOf(C().charAt(i12))) + "' instead", i12, null, 4, null);
        throw new C4025h();
    }

    @Override // ie.AbstractC4379a
    public byte k() {
        String strC = C();
        int i10 = this.f37518a;
        while (i10 != -1 && i10 < strC.length()) {
            int i11 = i10 + 1;
            char cCharAt = strC.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f37518a = i11;
                return AbstractC4380b.a(cCharAt);
            }
            i10 = i11;
        }
        this.f37518a = strC.length();
        return (byte) 10;
    }

    @Override // ie.AbstractC4379a
    public void m(char c10) {
        if (this.f37518a == -1) {
            P(c10);
        }
        String strC = C();
        int i10 = this.f37518a;
        while (i10 < strC.length()) {
            int i11 = i10 + 1;
            char cCharAt = strC.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f37518a = i11;
                if (cCharAt == c10) {
                    return;
                } else {
                    P(c10);
                }
            }
            i10 = i11;
        }
        this.f37518a = -1;
        P(c10);
    }
}
