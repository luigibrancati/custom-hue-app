package ve;

import Od.B;
import Od.C;
import java.net.ProtocolException;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import pe.z;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f46058d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f46059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46061c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final k a(String statusLine) throws ProtocolException {
            z zVar;
            int i10;
            String strSubstring;
            AbstractC4862t.e(statusLine, "statusLine");
            if (C.P(statusLine, "HTTP/1.", false, 2, null)) {
                i10 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    zVar = z.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    zVar = z.HTTP_1_1;
                }
            } else if (C.P(statusLine, "ICY ", false, 2, null)) {
                zVar = z.HTTP_1_0;
                i10 = 4;
            } else {
                if (!C.P(statusLine, "SOURCETABLE ", false, 2, null)) {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                zVar = z.HTTP_1_1;
                i10 = 12;
            }
            int i11 = i10 + 3;
            if (statusLine.length() < i11) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            String strSubstring2 = statusLine.substring(i10, i11);
            AbstractC4862t.d(strSubstring2, "substring(...)");
            Integer numU = B.u(strSubstring2);
            if (numU == null) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            int iIntValue = numU.intValue();
            if (statusLine.length() <= i11) {
                strSubstring = "";
            } else {
                if (statusLine.charAt(i11) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                strSubstring = statusLine.substring(i10 + 4);
                AbstractC4862t.d(strSubstring, "substring(...)");
            }
            return new k(zVar, iIntValue, strSubstring);
        }

        public a() {
        }
    }

    public k(z protocol, int i10, String message) {
        AbstractC4862t.e(protocol, "protocol");
        AbstractC4862t.e(message, "message");
        this.f46059a = protocol;
        this.f46060b = i10;
        this.f46061c = message;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f46059a == z.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f46060b);
        sb2.append(' ');
        sb2.append(this.f46061c);
        String string = sb2.toString();
        AbstractC4862t.d(string, "toString(...)");
        return string;
    }
}
