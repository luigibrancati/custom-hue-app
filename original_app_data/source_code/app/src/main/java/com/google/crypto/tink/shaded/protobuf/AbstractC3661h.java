package com.google.crypto.tink.shaded.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3661h implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC3661h f31448b = new j(AbstractC3678z.f31580d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f31449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Comparator f31450d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31451a = 0;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f31452a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f31453b;

        public a() {
            this.f31453b = AbstractC3661h.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31452a < this.f31453b;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3661h.g
        public byte nextByte() {
            int i10 = this.f31452a;
            if (i10 >= this.f31453b) {
                throw new NoSuchElementException();
            }
            this.f31452a = i10 + 1;
            return AbstractC3661h.this.p(i10);
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC3661h abstractC3661h, AbstractC3661h abstractC3661h2) {
            g gVarR = abstractC3661h.r();
            g gVarR2 = abstractC3661h2.r();
            while (gVarR.hasNext() && gVarR2.hasNext()) {
                int iCompare = Integer.compare(AbstractC3661h.z(gVarR.nextByte()), AbstractC3661h.z(gVarR2.nextByte()));
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return Integer.compare(abstractC3661h.size(), abstractC3661h2.size());
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h$c */
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

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d implements f {
        public d() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3661h.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends j {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f31455f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f31456g;

        public e(byte[] bArr, int i10, int i11) {
            super(bArr);
            AbstractC3661h.f(i10, i10 + i11, bArr.length);
            this.f31455f = i10;
            this.f31456g = i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3661h.j
        public int L() {
            return this.f31455f;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3661h.j, com.google.crypto.tink.shaded.protobuf.AbstractC3661h
        public byte d(int i10) {
            AbstractC3661h.e(i10, size());
            return this.f31459e[this.f31455f + i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3661h.j, com.google.crypto.tink.shaded.protobuf.AbstractC3661h
        public void n(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f31459e, L() + i10, bArr, i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3661h.j, com.google.crypto.tink.shaded.protobuf.AbstractC3661h
        public byte p(int i10) {
            return this.f31459e[this.f31455f + i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3661h.j, com.google.crypto.tink.shaded.protobuf.AbstractC3661h
        public int size() {
            return this.f31456g;
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h$g */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface g extends Iterator {
        byte nextByte();
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h$h, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0369h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC3664k f31457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f31458b;

        public /* synthetic */ C0369h(int i10, a aVar) {
            this(i10);
        }

        public AbstractC3661h a() {
            this.f31457a.c();
            return new j(this.f31458b);
        }

        public AbstractC3664k b() {
            return this.f31457a;
        }

        public C0369h(int i10) {
            byte[] bArr = new byte[i10];
            this.f31458b = bArr;
            this.f31457a = AbstractC3664k.W(bArr);
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h$i */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class i extends AbstractC3661h {
        public /* synthetic */ i(a aVar) {
            this();
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.r();
        }

        public i() {
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h$j */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class j extends i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f31459e;

        public j(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.f31459e = bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3661h
        public final void I(AbstractC3660g abstractC3660g) {
            abstractC3660g.a(this.f31459e, L(), size());
        }

        public final boolean J(AbstractC3661h abstractC3661h, int i10, int i11) {
            if (i11 > abstractC3661h.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > abstractC3661h.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + abstractC3661h.size());
            }
            if (!(abstractC3661h instanceof j)) {
                return abstractC3661h.x(i10, i12).equals(x(0, i11));
            }
            j jVar = (j) abstractC3661h;
            byte[] bArr = this.f31459e;
            byte[] bArr2 = jVar.f31459e;
            int iL = L() + i11;
            int iL2 = L();
            int iL3 = jVar.L() + i10;
            while (iL2 < iL) {
                if (bArr[iL2] != bArr2[iL3]) {
                    return false;
                }
                iL2++;
                iL3++;
            }
            return true;
        }

        public int L() {
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3661h
        public byte d(int i10) {
            return this.f31459e[i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3661h
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC3661h) || size() != ((AbstractC3661h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int iW = w();
            int iW2 = jVar.w();
            if (iW == 0 || iW2 == 0 || iW == iW2) {
                return J(jVar, 0, size());
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3661h
        public void n(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f31459e, i10, bArr, i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3661h
        public byte p(int i10) {
            return this.f31459e[i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3661h
        public int size() {
            return this.f31459e.length;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3661h
        public final AbstractC3662i t() {
            return AbstractC3662i.l(this.f31459e, L(), size(), true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3661h
        public final int v(int i10, int i11, int i12) {
            return AbstractC3678z.g(i10, this.f31459e, L() + i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3661h
        public final AbstractC3661h x(int i10, int i11) {
            int iF = AbstractC3661h.f(i10, i11, size());
            return iF == 0 ? AbstractC3661h.f31448b : new e(this.f31459e, L() + i10, iF);
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h$k */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class k implements f {
        public k() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3661h.f
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
        f31449c = AbstractC3657d.c() ? new k(aVar) : new d(aVar);
        f31450d = new b();
    }

    public static AbstractC3661h B(byte[] bArr) {
        return new j(bArr);
    }

    public static AbstractC3661h E(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    public static void e(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    public static int f(int i10, int i11, int i12) {
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

    public static AbstractC3661h h(byte[] bArr) {
        return k(bArr, 0, bArr.length);
    }

    public static AbstractC3661h k(byte[] bArr, int i10, int i11) {
        f(i10, i10 + i11, bArr.length);
        return new j(f31449c.a(bArr, i10, i11));
    }

    public static AbstractC3661h l(String str) {
        return new j(str.getBytes(AbstractC3678z.f31578b));
    }

    public static C0369h s(int i10) {
        return new C0369h(i10, null);
    }

    public static int z(byte b10) {
        return b10 & ForkServer.ERROR;
    }

    public final String A() {
        if (size() <= 50) {
            return k0.a(this);
        }
        return k0.a(x(0, 47)) + "...";
    }

    public abstract void I(AbstractC3660g abstractC3660g);

    public abstract byte d(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iV = this.f31451a;
        if (iV == 0) {
            int size = size();
            iV = v(size, 0, size);
            if (iV == 0) {
                iV = 1;
            }
            this.f31451a = iV;
        }
        return iV;
    }

    public abstract void n(byte[] bArr, int i10, int i11, int i12);

    public abstract byte p(int i10);

    public g r() {
        return new a();
    }

    public abstract int size();

    public abstract AbstractC3662i t();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), A());
    }

    public abstract int v(int i10, int i11, int i12);

    public final int w() {
        return this.f31451a;
    }

    public abstract AbstractC3661h x(int i10, int i11);

    public final byte[] y() {
        int size = size();
        if (size == 0) {
            return AbstractC3678z.f31580d;
        }
        byte[] bArr = new byte[size];
        n(bArr, 0, 0, size);
        return bArr;
    }
}
