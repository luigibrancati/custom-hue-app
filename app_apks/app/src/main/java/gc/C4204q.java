package gc;

import fc.AbstractC4040w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4846c;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;
import wc.InterfaceC6184a;

/* JADX INFO: renamed from: gc.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C4204q extends C4202o {

    /* JADX INFO: renamed from: gc.q$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Iterable, InterfaceC6184a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object[] f35614a;

        public a(Object[] objArr) {
            this.f35614a = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return AbstractC4846c.a(this.f35614a);
        }
    }

    /* JADX INFO: renamed from: gc.q$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements Nd.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object[] f35615a;

        public b(Object[] objArr) {
            this.f35615a = objArr;
        }

        @Override // Nd.h
        public Iterator iterator() {
            return AbstractC4846c.a(this.f35615a);
        }
    }

    public static List A0(float[] fArr, Bc.f indices) {
        AbstractC4862t.e(fArr, "<this>");
        AbstractC4862t.e(indices, "indices");
        return indices.isEmpty() ? C4206t.k() : C4202o.f(C4202o.t(fArr, indices.n().intValue(), indices.l().intValue() + 1));
    }

    public static byte[] B0(byte[] bArr, Bc.f indices) {
        AbstractC4862t.e(bArr, "<this>");
        AbstractC4862t.e(indices, "indices");
        return indices.isEmpty() ? new byte[0] : C4202o.s(bArr, indices.n().intValue(), indices.l().intValue() + 1);
    }

    public static final Object[] C0(Object[] objArr, Comparator comparator) {
        AbstractC4862t.e(objArr, "<this>");
        AbstractC4862t.e(comparator, "comparator");
        if (objArr.length == 0) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC4862t.d(objArrCopyOf, "copyOf(...)");
        C4202o.F(objArrCopyOf, comparator);
        return objArrCopyOf;
    }

    public static List D0(Object[] objArr, Comparator comparator) {
        AbstractC4862t.e(objArr, "<this>");
        AbstractC4862t.e(comparator, "comparator");
        return C4202o.h(C0(objArr, comparator));
    }

    public static List E0(int[] iArr, int i10) {
        AbstractC4862t.e(iArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return C4206t.k();
        }
        if (i10 >= iArr.length) {
            return M0(iArr);
        }
        if (i10 == 1) {
            return C4205s.d(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (int i12 : iArr) {
            arrayList.add(Integer.valueOf(i12));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    public static final List F0(Object[] objArr, int i10) {
        AbstractC4862t.e(objArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return C4206t.k();
        }
        int length = objArr.length;
        if (i10 >= length) {
            return O0(objArr);
        }
        if (i10 == 1) {
            return C4205s.d(objArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(objArr[i11]);
        }
        return arrayList;
    }

    public static final Collection G0(int[] iArr, Collection destination) {
        AbstractC4862t.e(iArr, "<this>");
        AbstractC4862t.e(destination, "destination");
        for (int i10 : iArr) {
            destination.add(Integer.valueOf(i10));
        }
        return destination;
    }

    public static Collection H0(Object[] objArr, Collection destination) {
        AbstractC4862t.e(objArr, "<this>");
        AbstractC4862t.e(destination, "destination");
        for (Object obj : objArr) {
            destination.add(obj);
        }
        return destination;
    }

    public static Iterable I(Object[] objArr) {
        AbstractC4862t.e(objArr, "<this>");
        return objArr.length == 0 ? C4206t.k() : new a(objArr);
    }

    public static List I0(byte[] bArr) {
        AbstractC4862t.e(bArr, "<this>");
        int length = bArr.length;
        return length != 0 ? length != 1 ? R0(bArr) : C4205s.d(Byte.valueOf(bArr[0])) : C4206t.k();
    }

    public static Nd.h J(Object[] objArr) {
        AbstractC4862t.e(objArr, "<this>");
        return objArr.length == 0 ? Nd.q.i() : new b(objArr);
    }

    public static List J0(char[] cArr) {
        AbstractC4862t.e(cArr, "<this>");
        int length = cArr.length;
        return length != 0 ? length != 1 ? S0(cArr) : C4205s.d(Character.valueOf(cArr[0])) : C4206t.k();
    }

    public static double K(float[] fArr) {
        AbstractC4862t.e(fArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (float f10 : fArr) {
            d10 += (double) f10;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    public static List K0(double[] dArr) {
        AbstractC4862t.e(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? T0(dArr) : C4205s.d(Double.valueOf(dArr[0])) : C4206t.k();
    }

    public static boolean L(byte[] bArr, byte b10) {
        AbstractC4862t.e(bArr, "<this>");
        return e0(bArr, b10) >= 0;
    }

    public static List L0(float[] fArr) {
        AbstractC4862t.e(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? U0(fArr) : C4205s.d(Float.valueOf(fArr[0])) : C4206t.k();
    }

    public static boolean M(char[] cArr, char c10) {
        AbstractC4862t.e(cArr, "<this>");
        return f0(cArr, c10) >= 0;
    }

    public static List M0(int[] iArr) {
        AbstractC4862t.e(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? V0(iArr) : C4205s.d(Integer.valueOf(iArr[0])) : C4206t.k();
    }

    public static boolean N(int[] iArr, int i10) {
        AbstractC4862t.e(iArr, "<this>");
        return g0(iArr, i10) >= 0;
    }

    public static List N0(long[] jArr) {
        AbstractC4862t.e(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? W0(jArr) : C4205s.d(Long.valueOf(jArr[0])) : C4206t.k();
    }

    public static boolean O(long[] jArr, long j10) {
        AbstractC4862t.e(jArr, "<this>");
        return h0(jArr, j10) >= 0;
    }

    public static List O0(Object[] objArr) {
        AbstractC4862t.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? X0(objArr) : C4205s.d(objArr[0]) : C4206t.k();
    }

    public static boolean P(Object[] objArr, Object obj) {
        AbstractC4862t.e(objArr, "<this>");
        return i0(objArr, obj) >= 0;
    }

    public static List P0(short[] sArr) {
        AbstractC4862t.e(sArr, "<this>");
        int length = sArr.length;
        return length != 0 ? length != 1 ? Y0(sArr) : C4205s.d(Short.valueOf(sArr[0])) : C4206t.k();
    }

    public static boolean Q(short[] sArr, short s10) {
        AbstractC4862t.e(sArr, "<this>");
        return j0(sArr, s10) >= 0;
    }

    public static List Q0(boolean[] zArr) {
        AbstractC4862t.e(zArr, "<this>");
        int length = zArr.length;
        return length != 0 ? length != 1 ? Z0(zArr) : C4205s.d(Boolean.valueOf(zArr[0])) : C4206t.k();
    }

    public static List R(Object[] objArr, int i10) {
        AbstractC4862t.e(objArr, "<this>");
        if (i10 >= 0) {
            return F0(objArr, Bc.k.e(objArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static final List R0(byte[] bArr) {
        AbstractC4862t.e(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b10 : bArr) {
            arrayList.add(Byte.valueOf(b10));
        }
        return arrayList;
    }

    public static List S(Object[] objArr) {
        AbstractC4862t.e(objArr, "<this>");
        return (List) T(objArr, new ArrayList());
    }

    public static final List S0(char[] cArr) {
        AbstractC4862t.e(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c10 : cArr) {
            arrayList.add(Character.valueOf(c10));
        }
        return arrayList;
    }

    public static final Collection T(Object[] objArr, Collection destination) {
        AbstractC4862t.e(objArr, "<this>");
        AbstractC4862t.e(destination, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static final List T0(double[] dArr) {
        AbstractC4862t.e(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d10 : dArr) {
            arrayList.add(Double.valueOf(d10));
        }
        return arrayList;
    }

    public static Object U(Object[] objArr) {
        AbstractC4862t.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final List U0(float[] fArr) {
        AbstractC4862t.e(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    public static Object V(Object[] objArr) {
        AbstractC4862t.e(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static final List V0(int[] iArr) {
        AbstractC4862t.e(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    public static Bc.f W(Object[] objArr) {
        AbstractC4862t.e(objArr, "<this>");
        return new Bc.f(0, a0(objArr));
    }

    public static final List W0(long[] jArr) {
        AbstractC4862t.e(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static final int X(float[] fArr) {
        AbstractC4862t.e(fArr, "<this>");
        return fArr.length - 1;
    }

    public static List X0(Object[] objArr) {
        AbstractC4862t.e(objArr, "<this>");
        return new ArrayList(C4206t.h(objArr, false, 1, null));
    }

    public static final int Y(int[] iArr) {
        AbstractC4862t.e(iArr, "<this>");
        return iArr.length - 1;
    }

    public static final List Y0(short[] sArr) {
        AbstractC4862t.e(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s10 : sArr) {
            arrayList.add(Short.valueOf(s10));
        }
        return arrayList;
    }

    public static int Z(long[] jArr) {
        AbstractC4862t.e(jArr, "<this>");
        return jArr.length - 1;
    }

    public static final List Z0(boolean[] zArr) {
        AbstractC4862t.e(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z10 : zArr) {
            arrayList.add(Boolean.valueOf(z10));
        }
        return arrayList;
    }

    public static int a0(Object[] objArr) {
        AbstractC4862t.e(objArr, "<this>");
        return objArr.length - 1;
    }

    public static Set a1(int[] iArr) {
        AbstractC4862t.e(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? (Set) G0(iArr, new LinkedHashSet(P.e(iArr.length))) : T.c(Integer.valueOf(iArr[0])) : U.d();
    }

    public static Float b0(float[] fArr, int i10) {
        AbstractC4862t.e(fArr, "<this>");
        if (i10 < 0 || i10 >= fArr.length) {
            return null;
        }
        return Float.valueOf(fArr[i10]);
    }

    public static Set b1(Object[] objArr) {
        AbstractC4862t.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? (Set) H0(objArr, new LinkedHashSet(P.e(objArr.length))) : T.c(objArr[0]) : U.d();
    }

    public static Integer c0(int[] iArr, int i10) {
        AbstractC4862t.e(iArr, "<this>");
        if (i10 < 0 || i10 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i10]);
    }

    public static Iterable c1(final Object[] objArr) {
        AbstractC4862t.e(objArr, "<this>");
        return new C4187K(new InterfaceC6082a() { // from class: gc.p
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return C4204q.d1(objArr);
            }
        });
    }

    public static Object d0(Object[] objArr, int i10) {
        AbstractC4862t.e(objArr, "<this>");
        if (i10 < 0 || i10 >= objArr.length) {
            return null;
        }
        return objArr[i10];
    }

    public static final Iterator d1(Object[] objArr) {
        return AbstractC4846c.a(objArr);
    }

    public static final int e0(byte[] bArr, byte b10) {
        AbstractC4862t.e(bArr, "<this>");
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (b10 == bArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static List e1(Object[] objArr, Object[] other) {
        AbstractC4862t.e(objArr, "<this>");
        AbstractC4862t.e(other, "other");
        int iMin = Math.min(objArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(AbstractC4040w.a(objArr[i10], other[i10]));
        }
        return arrayList;
    }

    public static final int f0(char[] cArr, char c10) {
        AbstractC4862t.e(cArr, "<this>");
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (c10 == cArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final int g0(int[] iArr, int i10) {
        AbstractC4862t.e(iArr, "<this>");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public static final int h0(long[] jArr, long j10) {
        AbstractC4862t.e(jArr, "<this>");
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (j10 == jArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static int i0(Object[] objArr, Object obj) {
        AbstractC4862t.e(objArr, "<this>");
        int i10 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i10 < length2) {
            if (AbstractC4862t.a(obj, objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final int j0(short[] sArr, short s10) {
        AbstractC4862t.e(sArr, "<this>");
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (s10 == sArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final Appendable k0(byte[] bArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, vc.l lVar) throws IOException {
        AbstractC4862t.e(bArr, "<this>");
        AbstractC4862t.e(buffer, "buffer");
        AbstractC4862t.e(separator, "separator");
        AbstractC4862t.e(prefix, "prefix");
        AbstractC4862t.e(postfix, "postfix");
        AbstractC4862t.e(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (byte b10 : bArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                buffer.append((CharSequence) lVar.invoke(Byte.valueOf(b10)));
            } else {
                buffer.append(String.valueOf((int) b10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Appendable l0(Object[] objArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, vc.l lVar) throws IOException {
        AbstractC4862t.e(objArr, "<this>");
        AbstractC4862t.e(buffer, "buffer");
        AbstractC4862t.e(separator, "separator");
        AbstractC4862t.e(prefix, "prefix");
        AbstractC4862t.e(postfix, "postfix");
        AbstractC4862t.e(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : objArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            Od.r.a(buffer, obj, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String n0(byte[] bArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, vc.l lVar) {
        AbstractC4862t.e(bArr, "<this>");
        AbstractC4862t.e(separator, "separator");
        AbstractC4862t.e(prefix, "prefix");
        AbstractC4862t.e(postfix, "postfix");
        AbstractC4862t.e(truncated, "truncated");
        return ((StringBuilder) k0(bArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
    }

    public static final String o0(Object[] objArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, vc.l lVar) {
        AbstractC4862t.e(objArr, "<this>");
        AbstractC4862t.e(separator, "separator");
        AbstractC4862t.e(prefix, "prefix");
        AbstractC4862t.e(postfix, "postfix");
        AbstractC4862t.e(truncated, "truncated");
        return ((StringBuilder) l0(objArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
    }

    public static /* synthetic */ String p0(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, vc.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        vc.l lVar2 = lVar;
        return n0(bArr, charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    public static /* synthetic */ String q0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, vc.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        vc.l lVar2 = lVar;
        return o0(objArr, charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    public static float r0(float[] fArr) {
        AbstractC4862t.e(fArr, "<this>");
        if (fArr.length != 0) {
            return fArr[X(fArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static int s0(int[] iArr) {
        AbstractC4862t.e(iArr, "<this>");
        if (iArr.length != 0) {
            return iArr[Y(iArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object t0(Object[] objArr) {
        AbstractC4862t.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[a0(objArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int u0(byte[] bArr, byte b10) {
        AbstractC4862t.e(bArr, "<this>");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (b10 == bArr[length]) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    public static final int v0(int[] iArr, int i10) {
        AbstractC4862t.e(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (i10 == iArr[length]) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    public static List w0(Object[] objArr, vc.l transform) {
        AbstractC4862t.e(objArr, "<this>");
        AbstractC4862t.e(transform, "transform");
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(transform.invoke(obj));
        }
        return arrayList;
    }

    public static char x0(char[] cArr) {
        AbstractC4862t.e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object y0(Object[] objArr) {
        AbstractC4862t.e(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object z0(Object[] objArr) {
        AbstractC4862t.e(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }
}
