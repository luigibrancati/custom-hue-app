package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2700f implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC2700f f22793b = new j(AbstractC2714u.f22909d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InterfaceC0286f f22794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Comparator f22795d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22796a = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22797a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f22798b;

        public a() {
            this.f22798b = AbstractC2700f.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22797a < this.f22798b;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2700f.g
        public byte nextByte() {
            int i10 = this.f22797a;
            if (i10 >= this.f22798b) {
                throw new NoSuchElementException();
            }
            this.f22797a = i10 + 1;
            return AbstractC2700f.this.p(i10);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC2700f abstractC2700f, AbstractC2700f abstractC2700f2) {
            g gVarR = abstractC2700f.r();
            g gVarR2 = abstractC2700f2.r();
            while (gVarR.hasNext() && gVarR2.hasNext()) {
                int iCompareTo = Integer.valueOf(AbstractC2700f.z(gVarR.nextByte())).compareTo(Integer.valueOf(AbstractC2700f.z(gVarR2.nextByte())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(abstractC2700f.size()).compareTo(Integer.valueOf(abstractC2700f2.size()));
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$c */
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

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d implements InterfaceC0286f {
        public d() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2700f.InterfaceC0286f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends j {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f22800f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f22801g;

        public e(byte[] bArr, int i10, int i11) {
            super(bArr);
            AbstractC2700f.f(i10, i10 + i11, bArr.length);
            this.f22800f = i10;
            this.f22801g = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2700f.j
        public int L() {
            return this.f22800f;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2700f.j, androidx.datastore.preferences.protobuf.AbstractC2700f
        public byte d(int i10) {
            AbstractC2700f.e(i10, size());
            return this.f22804e[this.f22800f + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2700f.j, androidx.datastore.preferences.protobuf.AbstractC2700f
        public void n(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f22804e, L() + i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2700f.j, androidx.datastore.preferences.protobuf.AbstractC2700f
        public byte p(int i10) {
            return this.f22804e[this.f22800f + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2700f.j, androidx.datastore.preferences.protobuf.AbstractC2700f
        public int size() {
            return this.f22801g;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface InterfaceC0286f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$g */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface g extends Iterator {
        byte nextByte();
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$h */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC2703i f22802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f22803b;

        public /* synthetic */ h(int i10, a aVar) {
            this(i10);
        }

        public AbstractC2700f a() {
            this.f22802a.c();
            return new j(this.f22803b);
        }

        public AbstractC2703i b() {
            return this.f22802a;
        }

        public h(int i10) {
            byte[] bArr = new byte[i10];
            this.f22803b = bArr;
            this.f22802a = AbstractC2703i.c0(bArr);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$i */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class i extends AbstractC2700f {
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

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$j */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class j extends i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f22804e;

        public j(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.f22804e = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2700f
        public final void I(AbstractC2699e abstractC2699e) {
            abstractC2699e.a(this.f22804e, L(), size());
        }

        public final boolean J(AbstractC2700f abstractC2700f, int i10, int i11) {
            if (i11 > abstractC2700f.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > abstractC2700f.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + abstractC2700f.size());
            }
            if (!(abstractC2700f instanceof j)) {
                return abstractC2700f.x(i10, i12).equals(x(0, i11));
            }
            j jVar = (j) abstractC2700f;
            byte[] bArr = this.f22804e;
            byte[] bArr2 = jVar.f22804e;
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

        @Override // androidx.datastore.preferences.protobuf.AbstractC2700f
        public byte d(int i10) {
            return this.f22804e[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2700f
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC2700f) || size() != ((AbstractC2700f) obj).size()) {
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

        @Override // androidx.datastore.preferences.protobuf.AbstractC2700f
        public void n(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f22804e, i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2700f
        public byte p(int i10) {
            return this.f22804e[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2700f
        public int size() {
            return this.f22804e.length;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2700f
        public final AbstractC2701g t() {
            return AbstractC2701g.k(this.f22804e, L(), size(), true);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2700f
        public final int v(int i10, int i11, int i12) {
            return AbstractC2714u.g(i10, this.f22804e, L() + i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2700f
        public final AbstractC2700f x(int i10, int i11) {
            int iF = AbstractC2700f.f(i10, i11, size());
            return iF == 0 ? AbstractC2700f.f22793b : new e(this.f22804e, L() + i10, iF);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$k */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class k implements InterfaceC0286f {
        public k() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2700f.InterfaceC0286f
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
        f22794c = AbstractC2698d.c() ? new k(aVar) : new d(aVar);
        f22795d = new b();
    }

    public static AbstractC2700f B(byte[] bArr) {
        return new j(bArr);
    }

    public static AbstractC2700f E(byte[] bArr, int i10, int i11) {
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

    public static AbstractC2700f h(byte[] bArr) {
        return k(bArr, 0, bArr.length);
    }

    public static AbstractC2700f k(byte[] bArr, int i10, int i11) {
        f(i10, i10 + i11, bArr.length);
        return new j(f22794c.a(bArr, i10, i11));
    }

    public static AbstractC2700f l(String str) {
        return new j(str.getBytes(AbstractC2714u.f22907b));
    }

    public static h s(int i10) {
        return new h(i10, null);
    }

    public static int z(byte b10) {
        return b10 & ForkServer.ERROR;
    }

    public final String A() {
        if (size() <= 50) {
            return e0.a(this);
        }
        return e0.a(x(0, 47)) + "...";
    }

    public abstract void I(AbstractC2699e abstractC2699e);

    public abstract byte d(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iV = this.f22796a;
        if (iV == 0) {
            int size = size();
            iV = v(size, 0, size);
            if (iV == 0) {
                iV = 1;
            }
            this.f22796a = iV;
        }
        return iV;
    }

    public abstract void n(byte[] bArr, int i10, int i11, int i12);

    public abstract byte p(int i10);

    public g r() {
        return new a();
    }

    public abstract int size();

    public abstract AbstractC2701g t();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), A());
    }

    public abstract int v(int i10, int i11, int i12);

    public final int w() {
        return this.f22796a;
    }

    public abstract AbstractC2700f x(int i10, int i11);

    public final byte[] y() {
        int size = size();
        if (size == 0) {
            return AbstractC2714u.f22909d;
        }
        byte[] bArr = new byte[size];
        n(bArr, 0, 0, size);
        return bArr;
    }
}
