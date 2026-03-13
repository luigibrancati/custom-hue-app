package Fe;

import gc.C4202o;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: renamed from: Fe.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C0846h implements Serializable, Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f4117d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0846h f4118e = new C0846h(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f4119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int f4120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient String f4121c;

    /* JADX INFO: renamed from: Fe.h$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public static /* synthetic */ C0846h f(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = AbstractC0840b.c();
            }
            return aVar.e(bArr, i10, i11);
        }

        public final C0846h a(String str) {
            AbstractC4862t.e(str, "<this>");
            byte[] bArrA = AbstractC0839a.a(str);
            if (bArrA != null) {
                return new C0846h(bArrA);
            }
            return null;
        }

        public final C0846h b(String str) {
            AbstractC4862t.e(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) ((Ge.b.e(str.charAt(i11)) << 4) + Ge.b.e(str.charAt(i11 + 1)));
            }
            return new C0846h(bArr);
        }

        public final C0846h c(String str, Charset charset) {
            AbstractC4862t.e(str, "<this>");
            AbstractC4862t.e(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            AbstractC4862t.d(bytes, "getBytes(...)");
            return new C0846h(bytes);
        }

        public final C0846h d(String str) {
            AbstractC4862t.e(str, "<this>");
            C0846h c0846h = new C0846h(N.a(str));
            c0846h.L(str);
            return c0846h;
        }

        public final C0846h e(byte[] bArr, int i10, int i11) {
            AbstractC4862t.e(bArr, "<this>");
            int iE = AbstractC0840b.e(bArr, i11);
            AbstractC0840b.b(bArr.length, i10, iE);
            return new C0846h(C4202o.s(bArr, i10, iE + i10));
        }

        public a() {
        }
    }

    public C0846h(byte[] data) {
        AbstractC4862t.e(data, "data");
        this.f4119a = data;
    }

    public static /* synthetic */ int A(C0846h c0846h, C0846h c0846h2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return c0846h.y(c0846h2, i10);
    }

    public static /* synthetic */ int F(C0846h c0846h, C0846h c0846h2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = AbstractC0840b.c();
        }
        return c0846h.D(c0846h2, i10);
    }

    public static /* synthetic */ C0846h P(C0846h c0846h, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = AbstractC0840b.c();
        }
        return c0846h.O(i10, i11);
    }

    public byte[] B() {
        return s();
    }

    public byte C(int i10) {
        return s()[i10];
    }

    public final int D(C0846h other, int i10) {
        AbstractC4862t.e(other, "other");
        return E(other.B(), i10);
    }

    public int E(byte[] other, int i10) {
        AbstractC4862t.e(other, "other");
        for (int iMin = Math.min(AbstractC0840b.d(this, i10), s().length - other.length); -1 < iMin; iMin--) {
            if (AbstractC0840b.a(s(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public final C0846h G() {
        return j("MD5");
    }

    public boolean I(int i10, C0846h other, int i11, int i12) {
        AbstractC4862t.e(other, "other");
        return other.J(i11, s(), i10, i12);
    }

    public boolean J(int i10, byte[] other, int i11, int i12) {
        AbstractC4862t.e(other, "other");
        return i10 >= 0 && i10 <= s().length - i12 && i11 >= 0 && i11 <= other.length - i12 && AbstractC0840b.a(s(), i10, other, i11, i12);
    }

    public final void K(int i10) {
        this.f4120b = i10;
    }

    public final void L(String str) {
        this.f4121c = str;
    }

    public final C0846h M() {
        return j("SHA-256");
    }

    public final boolean N(C0846h prefix) {
        AbstractC4862t.e(prefix, "prefix");
        return I(0, prefix, 0, prefix.size());
    }

    public C0846h O(int i10, int i11) {
        int iD = AbstractC0840b.d(this, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (iD <= s().length) {
            if (iD - i10 >= 0) {
                return (i10 == 0 && iD == s().length) ? this : new C0846h(C4202o.s(s(), i10, iD));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException(("endIndex > length(" + s().length + ')').toString());
    }

    public C0846h Q() {
        for (int i10 = 0; i10 < s().length; i10++) {
            byte b10 = s()[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArrS = s();
                byte[] bArrCopyOf = Arrays.copyOf(bArrS, bArrS.length);
                AbstractC4862t.d(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new C0846h(bArrCopyOf);
            }
        }
        return this;
    }

    public String R() {
        String strW = w();
        if (strW != null) {
            return strW;
        }
        String strC = N.c(B());
        L(strC);
        return strC;
    }

    public void S(C0843e buffer, int i10, int i11) {
        AbstractC4862t.e(buffer, "buffer");
        Ge.b.d(this, buffer, i10, i11);
    }

    public String a() {
        return AbstractC0839a.c(s(), null, 1, null);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(C0846h other) {
        AbstractC4862t.e(other, "other");
        int size = size();
        int size2 = other.size();
        int iMin = Math.min(size, size2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iQ = q(i10) & ForkServer.ERROR;
            int iQ2 = other.q(i10) & ForkServer.ERROR;
            if (iQ != iQ2) {
                return iQ < iQ2 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0846h) {
            C0846h c0846h = (C0846h) obj;
            if (c0846h.size() == s().length && c0846h.J(0, s(), 0, s().length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iU = u();
        if (iU != 0) {
            return iU;
        }
        int iHashCode = Arrays.hashCode(s());
        K(iHashCode);
        return iHashCode;
    }

    public C0846h j(String algorithm) throws NoSuchAlgorithmException {
        AbstractC4862t.e(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f4119a, 0, size());
        byte[] bArrDigest = messageDigest.digest();
        AbstractC4862t.b(bArrDigest);
        return new C0846h(bArrDigest);
    }

    public final boolean p(C0846h suffix) {
        AbstractC4862t.e(suffix, "suffix");
        return I(size() - suffix.size(), suffix, 0, suffix.size());
    }

    public final byte q(int i10) {
        return C(i10);
    }

    public final byte[] s() {
        return this.f4119a;
    }

    public final int size() {
        return v();
    }

    public String toString() {
        if (s().length == 0) {
            return "[size=0]";
        }
        int iC = Ge.b.c(s(), 64);
        if (iC != -1) {
            String strR = R();
            String strSubstring = strR.substring(0, iC);
            AbstractC4862t.d(strSubstring, "substring(...)");
            String strL = Od.C.L(Od.C.L(Od.C.L(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (iC >= strR.length()) {
                return "[text=" + strL + ']';
            }
            return "[size=" + s().length + " text=" + strL + "…]";
        }
        if (s().length <= 64) {
            return "[hex=" + x() + ']';
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[size=");
        sb2.append(s().length);
        sb2.append(" hex=");
        C0846h c0846h = this;
        int iD = AbstractC0840b.d(c0846h, 64);
        if (iD > c0846h.s().length) {
            throw new IllegalArgumentException(("endIndex > length(" + c0846h.s().length + ')').toString());
        }
        if (iD < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (iD != c0846h.s().length) {
            c0846h = new C0846h(C4202o.s(c0846h.s(), 0, iD));
        }
        sb2.append(c0846h.x());
        sb2.append("…]");
        return sb2.toString();
    }

    public final int u() {
        return this.f4120b;
    }

    public int v() {
        return s().length;
    }

    public final String w() {
        return this.f4121c;
    }

    public String x() {
        char[] cArr = new char[s().length * 2];
        int i10 = 0;
        for (byte b10 : s()) {
            int i11 = i10 + 1;
            cArr[i10] = Ge.b.f()[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = Ge.b.f()[b10 & 15];
        }
        return Od.C.y(cArr);
    }

    public final int y(C0846h other, int i10) {
        AbstractC4862t.e(other, "other");
        return z(other.B(), i10);
    }

    public int z(byte[] other, int i10) {
        AbstractC4862t.e(other, "other");
        int length = s().length - other.length;
        int iMax = Math.max(i10, 0);
        if (iMax > length) {
            return -1;
        }
        while (!AbstractC0840b.a(s(), iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }
}
