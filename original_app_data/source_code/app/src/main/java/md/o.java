package md;

import java.io.IOException;
import java.io.OutputStream;
import java.util.NoSuchElementException;
import md.AbstractC5050d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class o extends AbstractC5050d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f40355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f40356c = 0;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements AbstractC5050d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f40357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f40358b;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f40357a < this.f40358b;
        }

        @Override // md.AbstractC5050d.a
        public byte nextByte() {
            try {
                byte[] bArr = o.this.f40355b;
                int i10 = this.f40357a;
                this.f40357a = i10 + 1;
                return bArr[i10];
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new NoSuchElementException(e10.getMessage());
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public b() {
            this.f40357a = 0;
            this.f40358b = o.this.size();
        }
    }

    public o(byte[] bArr) {
        this.f40355b = bArr;
    }

    public static int J(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    @Override // md.AbstractC5050d
    public void E(OutputStream outputStream, int i10, int i11) throws IOException {
        outputStream.write(this.f40355b, I() + i10, i11);
    }

    public boolean H(o oVar, int i10, int i11) {
        if (i11 > oVar.size()) {
            int size = size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(size);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i10 + i11 > oVar.size()) {
            int size2 = oVar.size();
            StringBuilder sb3 = new StringBuilder(59);
            sb3.append("Ran off end of other: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            sb3.append(", ");
            sb3.append(size2);
            throw new IllegalArgumentException(sb3.toString());
        }
        byte[] bArr = this.f40355b;
        byte[] bArr2 = oVar.f40355b;
        int I10 = I() + i11;
        int I11 = I();
        int I12 = oVar.I() + i10;
        while (I11 < I10) {
            if (bArr[I11] != bArr2[I12]) {
                return false;
            }
            I11++;
            I12++;
        }
        return true;
    }

    public int I() {
        return 0;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public AbstractC5050d.a iterator() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5050d) || size() != ((AbstractC5050d) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof o) {
            return H((o) obj, 0, size());
        }
        if (obj instanceof t) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
        sb2.append("Has a new type of ByteString been created? Found ");
        sb2.append(strValueOf);
        throw new IllegalArgumentException(sb2.toString());
    }

    public int hashCode() {
        int iV = this.f40356c;
        if (iV == 0) {
            int size = size();
            iV = v(size, 0, size);
            if (iV == 0) {
                iV = 1;
            }
            this.f40356c = iV;
        }
        return iV;
    }

    @Override // md.AbstractC5050d
    public void n(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f40355b, i10, bArr, i11, i12);
    }

    @Override // md.AbstractC5050d
    public int p() {
        return 0;
    }

    @Override // md.AbstractC5050d
    public boolean r() {
        return true;
    }

    @Override // md.AbstractC5050d
    public boolean s() {
        int I10 = I();
        return x.f(this.f40355b, I10, size() + I10);
    }

    @Override // md.AbstractC5050d
    public int size() {
        return this.f40355b.length;
    }

    @Override // md.AbstractC5050d
    public int v(int i10, int i11, int i12) {
        return J(i10, this.f40355b, I() + i11, i12);
    }

    @Override // md.AbstractC5050d
    public int w(int i10, int i11, int i12) {
        int I10 = I() + i11;
        return x.g(i10, this.f40355b, I10, i12 + I10);
    }

    @Override // md.AbstractC5050d
    public int x() {
        return this.f40356c;
    }

    @Override // md.AbstractC5050d
    public String z(String str) {
        return new String(this.f40355b, I(), size(), str);
    }
}
