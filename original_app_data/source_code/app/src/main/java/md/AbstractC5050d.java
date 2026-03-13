package md;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: md.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5050d implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC5050d f40294a = new o(new byte[0]);

    /* JADX INFO: renamed from: md.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a extends Iterator {
        byte nextByte();
    }

    public static AbstractC5050d c(Iterator it, int i10) {
        if (i10 == 1) {
            return (AbstractC5050d) it.next();
        }
        int i11 = i10 >>> 1;
        return c(it, i11).d(c(it, i10 - i11));
    }

    public static AbstractC5050d e(Iterable iterable) {
        Collection arrayList;
        if (iterable instanceof Collection) {
            arrayList = (Collection) iterable;
        } else {
            arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add((AbstractC5050d) it.next());
            }
        }
        return arrayList.isEmpty() ? f40294a : c(arrayList.iterator(), arrayList.size());
    }

    public static AbstractC5050d f(byte[] bArr) {
        return h(bArr, 0, bArr.length);
    }

    public static AbstractC5050d h(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new o(bArr2);
    }

    public static AbstractC5050d k(String str) {
        try {
            return new o(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    public static b t() {
        return new b(128);
    }

    public String A() {
        try {
            return z("UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    public void B(OutputStream outputStream, int i10, int i11) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i12 = i10 + i11;
        if (i12 <= size()) {
            if (i11 > 0) {
                E(outputStream, i10, i11);
            }
        } else {
            StringBuilder sb4 = new StringBuilder(39);
            sb4.append("Source end offset exceeded: ");
            sb4.append(i12);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
    }

    public abstract void E(OutputStream outputStream, int i10, int i11);

    public AbstractC5050d d(AbstractC5050d abstractC5050d) {
        int size = size();
        int size2 = abstractC5050d.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            return t.L(this, abstractC5050d);
        }
        StringBuilder sb2 = new StringBuilder(53);
        sb2.append("ByteString would be too long: ");
        sb2.append(size);
        sb2.append("+");
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void l(byte[] bArr, int i10, int i11, int i12) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Target offset < 0: ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        if (i12 < 0) {
            StringBuilder sb4 = new StringBuilder(23);
            sb4.append("Length < 0: ");
            sb4.append(i12);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i13 = i10 + i12;
        if (i13 > size()) {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Source end offset < 0: ");
            sb5.append(i13);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
        int i14 = i11 + i12;
        if (i14 <= bArr.length) {
            if (i12 > 0) {
                n(bArr, i10, i11, i12);
            }
        } else {
            StringBuilder sb6 = new StringBuilder(34);
            sb6.append("Target end offset < 0: ");
            sb6.append(i14);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
    }

    public abstract void n(byte[] bArr, int i10, int i11, int i12);

    public abstract int p();

    public abstract boolean r();

    public abstract boolean s();

    public abstract int size();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract int v(int i10, int i11, int i12);

    public abstract int w(int i10, int i11, int i12);

    public abstract int x();

    public byte[] y() {
        int size = size();
        if (size == 0) {
            return j.f40349a;
        }
        byte[] bArr = new byte[size];
        n(bArr, 0, 0, size);
        return bArr;
    }

    public abstract String z(String str);

    /* JADX INFO: renamed from: md.d$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends OutputStream {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final byte[] f40295f = new byte[0];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f40296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f40297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f40298c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f40299d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f40300e;

        public b(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f40296a = i10;
            this.f40297b = new ArrayList();
            this.f40299d = new byte[i10];
        }

        public final byte[] a(byte[] bArr, int i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
            return bArr2;
        }

        public final void b(int i10) {
            this.f40297b.add(new o(this.f40299d));
            int length = this.f40298c + this.f40299d.length;
            this.f40298c = length;
            this.f40299d = new byte[Math.max(this.f40296a, Math.max(i10, length >>> 1))];
            this.f40300e = 0;
        }

        public final void c() {
            int i10 = this.f40300e;
            byte[] bArr = this.f40299d;
            if (i10 >= bArr.length) {
                this.f40297b.add(new o(this.f40299d));
                this.f40299d = f40295f;
            } else if (i10 > 0) {
                this.f40297b.add(new o(a(bArr, i10)));
            }
            this.f40298c += this.f40300e;
            this.f40300e = 0;
        }

        public synchronized int d() {
            return this.f40298c + this.f40300e;
        }

        public synchronized AbstractC5050d f() {
            c();
            return AbstractC5050d.e(this.f40297b);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(d()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i10) {
            try {
                if (this.f40300e == this.f40299d.length) {
                    b(1);
                }
                byte[] bArr = this.f40299d;
                int i11 = this.f40300e;
                this.f40300e = i11 + 1;
                bArr[i11] = (byte) i10;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i10, int i11) {
            try {
                byte[] bArr2 = this.f40299d;
                int length = bArr2.length;
                int i12 = this.f40300e;
                if (i11 <= length - i12) {
                    System.arraycopy(bArr, i10, bArr2, i12, i11);
                    this.f40300e += i11;
                } else {
                    int length2 = bArr2.length - i12;
                    System.arraycopy(bArr, i10, bArr2, i12, length2);
                    int i13 = i11 - length2;
                    b(i13);
                    System.arraycopy(bArr, i10 + length2, this.f40299d, 0, i13);
                    this.f40300e = i13;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
