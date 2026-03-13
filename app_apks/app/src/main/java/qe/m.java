package qe;

import Fe.A;
import Fe.AbstractC0849k;
import Fe.C0843e;
import Fe.C0846h;
import Fe.InterfaceC0844f;
import Fe.InterfaceC0845g;
import Fe.y;
import Od.C;
import Od.F;
import fc.C4022e;
import gc.C4204q;
import gc.C4205s;
import io.sentry.util.HttpUtils;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4846c;
import kotlin.jvm.internal.AbstractC4862t;
import pe.B;
import pe.D;
import pe.u;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f43470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f43471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f43472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final B f43473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final D f43474e;

    static {
        byte[] bArr = new byte[0];
        f43470a = bArr;
        y.a aVar = y.f4158d;
        C0846h.a aVar2 = C0846h.f4117d;
        f43471b = aVar.d(aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe"), aVar2.b("0000ffff"), aVar2.b("ffff0000"));
        f43472c = u.f42870b.a(new String[0]);
        f43473d = B.a.b(B.f42562a, bArr, null, 0, 0, 7, null);
        f43474e = D.a.c(D.f42596a, bArr, null, 1, null);
    }

    public static final boolean A(String name) {
        AbstractC4862t.e(name, "name");
        return C.E(name, "Authorization", true) || C.E(name, HttpUtils.COOKIE_HEADER_NAME, true) || C.E(name, "Proxy-Authorization", true) || C.E(name, "Set-Cookie", true);
    }

    public static final Od.k B(Od.o oVar, CharSequence input, int i10) {
        AbstractC4862t.e(oVar, "<this>");
        AbstractC4862t.e(input, "input");
        Od.k kVarC = oVar.c(input, i10);
        if (kVarC != null && kVarC.c().c() == i10) {
            return kVarC;
        }
        return null;
    }

    public static final int C(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }

    public static final int D(InterfaceC0845g interfaceC0845g) {
        AbstractC4862t.e(interfaceC0845g, "<this>");
        return b(interfaceC0845g.readByte(), 255) | (b(interfaceC0845g.readByte(), 255) << 16) | (b(interfaceC0845g.readByte(), 255) << 8);
    }

    public static final int E(C0843e c0843e, byte b10) throws EOFException {
        AbstractC4862t.e(c0843e, "<this>");
        int i10 = 0;
        while (!c0843e.z0() && c0843e.q(0L) == b10) {
            i10++;
            c0843e.readByte();
        }
        return i10;
    }

    public static final long F(String str, long j10) {
        AbstractC4862t.e(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final int G(String str, int i10) {
        if (str != null) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j10 < 0) {
                    return 0;
                }
                return (int) j10;
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public static final String H(String str, int i10, int i11) {
        AbstractC4862t.e(str, "<this>");
        int iS = s(str, i10, i11);
        String strSubstring = str.substring(iS, u(str, iS, i11));
        AbstractC4862t.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String I(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return H(str, i10, i11);
    }

    public static final Throwable J(Exception exc, List suppressed) {
        AbstractC4862t.e(exc, "<this>");
        AbstractC4862t.e(suppressed, "suppressed");
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            C4022e.a(exc, (Exception) it.next());
        }
        return exc;
    }

    public static final void K(InterfaceC0844f interfaceC0844f, int i10) {
        AbstractC4862t.e(interfaceC0844f, "<this>");
        interfaceC0844f.writeByte((i10 >>> 16) & 255);
        interfaceC0844f.writeByte((i10 >>> 8) & 255);
        interfaceC0844f.writeByte(i10 & 255);
    }

    public static final void a(List list, Object obj) {
        AbstractC4862t.e(list, "<this>");
        if (list.contains(obj)) {
            return;
        }
        list.add(obj);
    }

    public static final int b(byte b10, int i10) {
        return b10 & i10;
    }

    public static final int c(short s10, int i10) {
        return s10 & i10;
    }

    public static final long d(int i10, long j10) {
        return ((long) i10) & j10;
    }

    public static final void e(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("length=" + j10 + ", offset=" + j11 + ", count=" + j11);
        }
    }

    public static final void f(Closeable closeable) {
        AbstractC4862t.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final String[] g(String[] strArr, String value) {
        AbstractC4862t.e(strArr, "<this>");
        AbstractC4862t.e(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        AbstractC4862t.d(objArrCopyOf, "copyOf(...)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[C4204q.a0(strArr2)] = value;
        return strArr2;
    }

    public static final void h(AbstractC0849k abstractC0849k, A directory) throws IOException {
        AbstractC4862t.e(abstractC0849k, "<this>");
        AbstractC4862t.e(directory, "directory");
        try {
            IOException iOException = null;
            for (A a10 : abstractC0849k.k(directory)) {
                try {
                    if (abstractC0849k.l(a10).e()) {
                        h(abstractC0849k, a10);
                    }
                    abstractC0849k.h(a10);
                } catch (IOException e10) {
                    if (iOException == null) {
                        iOException = e10;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void i(AbstractC0849k abstractC0849k, A path) {
        AbstractC4862t.e(abstractC0849k, "<this>");
        AbstractC4862t.e(path, "path");
        try {
            abstractC0849k.h(path);
        } catch (FileNotFoundException unused) {
        }
    }

    public static final int j(String str, char c10, int i10, int i11) {
        AbstractC4862t.e(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int k(String str, String delimiters, int i10, int i11) {
        AbstractC4862t.e(str, "<this>");
        AbstractC4862t.e(delimiters, "delimiters");
        while (i10 < i11) {
            if (F.U(delimiters, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int l(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return j(str, c10, i10, i11);
    }

    public static final u m() {
        return f43472c;
    }

    public static final B n() {
        return f43473d;
    }

    public static final D o() {
        return f43474e;
    }

    public static final boolean p(String[] strArr, String[] strArr2, Comparator comparator) {
        AbstractC4862t.e(strArr, "<this>");
        AbstractC4862t.e(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator itA = AbstractC4846c.a(strArr2);
                while (itA.hasNext()) {
                    if (comparator.compare(str, (String) itA.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int q(String[] strArr, String value, Comparator comparator) {
        AbstractC4862t.e(strArr, "<this>");
        AbstractC4862t.e(value, "value");
        AbstractC4862t.e(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], value) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int r(String str) {
        AbstractC4862t.e(str, "<this>");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (AbstractC4862t.f(cCharAt, 31) <= 0 || AbstractC4862t.f(cCharAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int s(String str, int i10, int i11) {
        AbstractC4862t.e(str, "<this>");
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int t(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return s(str, i10, i11);
    }

    public static final int u(String str, int i10, int i11) {
        AbstractC4862t.e(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char cCharAt = str.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12--;
            }
        }
        return i10;
    }

    public static /* synthetic */ int v(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return u(str, i10, i11);
    }

    public static final int w(String str, int i10) {
        AbstractC4862t.e(str, "<this>");
        int length = str.length();
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public static final List x(Iterable a10, Iterable b10) {
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        Iterator it = a10.iterator();
        Iterator it2 = b10.iterator();
        List listC = C4205s.c();
        while (true) {
            if (!it.hasNext() && !it2.hasNext()) {
                return C4205s.a(listC);
            }
            if (it.hasNext()) {
                listC.add(it.next());
            }
            if (it2.hasNext()) {
                listC.add(it2.next());
            }
        }
    }

    public static final String[] y(String[] strArr, String[] other, Comparator comparator) {
        AbstractC4862t.e(strArr, "<this>");
        AbstractC4862t.e(other, "other");
        AbstractC4862t.e(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i10]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i10++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean z(Fe.AbstractC0849k r2, Fe.A r3) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.AbstractC4862t.e(r2, r0)
            java.lang.String r0 = "file"
            kotlin.jvm.internal.AbstractC4862t.e(r3, r0)
            Fe.H r0 = r2.o(r3)
            r2.h(r3)     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1a
            r2 = 1
            if (r0 == 0) goto L17
            r0.close()     // Catch: java.lang.Throwable -> L17
        L17:
            return r2
        L18:
            r1 = move-exception
            goto L26
        L1a:
            fc.H r1 = fc.C4015H.f34254a     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L24
            r0.close()     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r0 = move-exception
            goto L31
        L24:
            r0 = 0
            goto L31
        L26:
            if (r0 == 0) goto L30
            r0.close()     // Catch: java.lang.Throwable -> L2c
            goto L30
        L2c:
            r0 = move-exception
            fc.C4022e.a(r1, r0)
        L30:
            r0 = r1
        L31:
            if (r0 != 0) goto L38
            r2.h(r3)
            r2 = 0
            return r2
        L38:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.m.z(Fe.k, Fe.A):boolean");
    }
}
