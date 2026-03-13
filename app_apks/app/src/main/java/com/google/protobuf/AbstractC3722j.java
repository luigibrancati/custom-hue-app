package com.google.protobuf;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: renamed from: com.google.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3722j implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC3722j f32236b = new C0384j(N.f32142d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f32237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Comparator f32238d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f32239a = 0;

    /* JADX INFO: renamed from: com.google.protobuf.j$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f32240a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f32241b;

        public a() {
            this.f32241b = AbstractC3722j.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f32240a < this.f32241b;
        }

        @Override // com.google.protobuf.AbstractC3722j.g
        public byte nextByte() {
            int i10 = this.f32240a;
            if (i10 >= this.f32241b) {
                throw new NoSuchElementException();
            }
            this.f32240a = i10 + 1;
            return AbstractC3722j.this.r(i10);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.j$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC3722j abstractC3722j, AbstractC3722j abstractC3722j2) {
            g gVarT = abstractC3722j.t();
            g gVarT2 = abstractC3722j2.t();
            while (gVarT.hasNext() && gVarT2.hasNext()) {
                int iCompareTo = Integer.valueOf(AbstractC3722j.B(gVarT.nextByte())).compareTo(Integer.valueOf(AbstractC3722j.B(gVarT2.nextByte())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(abstractC3722j.size()).compareTo(Integer.valueOf(abstractC3722j2.size()));
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.j$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class c implements g {
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.j$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d implements f {
        public d() {
        }

        @Override // com.google.protobuf.AbstractC3722j.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.j$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends C0384j {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f32243f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f32244g;

        public e(byte[] bArr, int i10, int i11) {
            super(bArr);
            AbstractC3722j.h(i10, i10 + i11, bArr.length);
            this.f32243f = i10;
            this.f32244g = i11;
        }

        @Override // com.google.protobuf.AbstractC3722j.C0384j
        public int R() {
            return this.f32243f;
        }

        @Override // com.google.protobuf.AbstractC3722j.C0384j, com.google.protobuf.AbstractC3722j
        public byte e(int i10) {
            AbstractC3722j.f(i10, size());
            return this.f32247e[this.f32243f + i10];
        }

        @Override // com.google.protobuf.AbstractC3722j.C0384j, com.google.protobuf.AbstractC3722j
        public void p(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f32247e, R() + i10, bArr, i11, i12);
        }

        @Override // com.google.protobuf.AbstractC3722j.C0384j, com.google.protobuf.AbstractC3722j
        public byte r(int i10) {
            return this.f32247e[this.f32243f + i10];
        }

        @Override // com.google.protobuf.AbstractC3722j.C0384j, com.google.protobuf.AbstractC3722j
        public int size() {
            return this.f32244g;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.j$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* JADX INFO: renamed from: com.google.protobuf.j$g */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface g extends Iterator {
        byte nextByte();
    }

    /* JADX INFO: renamed from: com.google.protobuf.j$h */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC3728m f32245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f32246b;

        public /* synthetic */ h(int i10, a aVar) {
            this(i10);
        }

        public AbstractC3722j a() {
            this.f32245a.d();
            return new C0384j(this.f32246b);
        }

        public AbstractC3728m b() {
            return this.f32245a;
        }

        public h(int i10) {
            byte[] bArr = new byte[i10];
            this.f32246b = bArr;
            this.f32245a = AbstractC3728m.f0(bArr);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.j$i */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class i extends AbstractC3722j {
        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.t();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.j$j, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class C0384j extends i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f32247e;

        public C0384j(byte[] bArr) {
            bArr.getClass();
            this.f32247e = bArr;
        }

        @Override // com.google.protobuf.AbstractC3722j
        public final String I(Charset charset) {
            return new String(this.f32247e, R(), size(), charset);
        }

        @Override // com.google.protobuf.AbstractC3722j
        public final void P(AbstractC3720i abstractC3720i) {
            abstractC3720i.b(this.f32247e, R(), size());
        }

        public final boolean Q(AbstractC3722j abstractC3722j, int i10, int i11) {
            if (i11 > abstractC3722j.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > abstractC3722j.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + abstractC3722j.size());
            }
            if (!(abstractC3722j instanceof C0384j)) {
                return abstractC3722j.z(i10, i12).equals(z(0, i11));
            }
            C0384j c0384j = (C0384j) abstractC3722j;
            byte[] bArr = this.f32247e;
            byte[] bArr2 = c0384j.f32247e;
            int iR = R() + i11;
            int iR2 = R();
            int iR3 = c0384j.R() + i10;
            while (iR2 < iR) {
                if (bArr[iR2] != bArr2[iR3]) {
                    return false;
                }
                iR2++;
                iR3++;
            }
            return true;
        }

        public int R() {
            return 0;
        }

        @Override // com.google.protobuf.AbstractC3722j
        public final ByteBuffer d() {
            return ByteBuffer.wrap(this.f32247e, R(), size()).asReadOnlyBuffer();
        }

        @Override // com.google.protobuf.AbstractC3722j
        public byte e(int i10) {
            return this.f32247e[i10];
        }

        @Override // com.google.protobuf.AbstractC3722j
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC3722j) || size() != ((AbstractC3722j) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C0384j)) {
                return obj.equals(this);
            }
            C0384j c0384j = (C0384j) obj;
            int iY = y();
            int iY2 = c0384j.y();
            if (iY == 0 || iY2 == 0 || iY == iY2) {
                return Q(c0384j, 0, size());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractC3722j
        public void p(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f32247e, i10, bArr, i11, i12);
        }

        @Override // com.google.protobuf.AbstractC3722j
        public byte r(int i10) {
            return this.f32247e[i10];
        }

        @Override // com.google.protobuf.AbstractC3722j
        public final boolean s() {
            int iR = R();
            return O0.t(this.f32247e, iR, size() + iR);
        }

        @Override // com.google.protobuf.AbstractC3722j
        public int size() {
            return this.f32247e.length;
        }

        @Override // com.google.protobuf.AbstractC3722j
        public final AbstractC3724k w() {
            return AbstractC3724k.n(this.f32247e, R(), size(), true);
        }

        @Override // com.google.protobuf.AbstractC3722j
        public final int x(int i10, int i11, int i12) {
            return N.i(i10, this.f32247e, R() + i11, i12);
        }

        @Override // com.google.protobuf.AbstractC3722j
        public final AbstractC3722j z(int i10, int i11) {
            int iH = AbstractC3722j.h(i10, i11, size());
            return iH == 0 ? AbstractC3722j.f32236b : new e(this.f32247e, R() + i10, iH);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.j$k */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class k implements f {
        public k() {
        }

        @Override // com.google.protobuf.AbstractC3722j.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }

        public /* synthetic */ k(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f32237c = AbstractC3710d.c() ? new k(aVar) : new d(aVar);
        f32238d = new b();
    }

    public static int B(byte b10) {
        return b10 & ForkServer.ERROR;
    }

    public static AbstractC3722j M(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new C3737q0(byteBuffer);
        }
        return O(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    public static AbstractC3722j N(byte[] bArr) {
        return new C0384j(bArr);
    }

    public static AbstractC3722j O(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    public static void f(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    public static int h(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static AbstractC3722j k(byte[] bArr) {
        return l(bArr, 0, bArr.length);
    }

    public static AbstractC3722j l(byte[] bArr, int i10, int i11) {
        h(i10, i10 + i11, bArr.length);
        return new C0384j(f32237c.a(bArr, i10, i11));
    }

    public static AbstractC3722j n(String str) {
        return new C0384j(str.getBytes(N.f32140b));
    }

    public static h v(int i10) {
        return new h(i10, null);
    }

    public final byte[] A() {
        int size = size();
        if (size == 0) {
            return N.f32142d;
        }
        byte[] bArr = new byte[size];
        p(bArr, 0, 0, size);
        return bArr;
    }

    public final String E(Charset charset) {
        return size() == 0 ? "" : I(charset);
    }

    public abstract String I(Charset charset);

    public final String J() {
        return E(N.f32140b);
    }

    public final String L() {
        if (size() <= 50) {
            return G0.a(this);
        }
        return G0.a(z(0, 47)) + "...";
    }

    public abstract void P(AbstractC3720i abstractC3720i);

    public abstract ByteBuffer d();

    public abstract byte e(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iX = this.f32239a;
        if (iX == 0) {
            int size = size();
            iX = x(size, 0, size);
            if (iX == 0) {
                iX = 1;
            }
            this.f32239a = iX;
        }
        return iX;
    }

    public abstract void p(byte[] bArr, int i10, int i11, int i12);

    public abstract byte r(int i10);

    public abstract boolean s();

    public abstract int size();

    public g t() {
        return new a();
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), L());
    }

    public abstract AbstractC3724k w();

    public abstract int x(int i10, int i11, int i12);

    public final int y() {
        return this.f32239a;
    }

    public abstract AbstractC3722j z(int i10, int i11);
}
