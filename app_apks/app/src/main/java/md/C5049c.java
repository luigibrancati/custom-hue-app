package md;

import java.util.NoSuchElementException;
import md.AbstractC5050d;

/* JADX INFO: renamed from: md.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5049c extends o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40290e;

    /* JADX INFO: renamed from: md.c$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements AbstractC5050d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f40291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f40292b;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f40291a < this.f40292b;
        }

        @Override // md.AbstractC5050d.a
        public byte nextByte() {
            int i10 = this.f40291a;
            if (i10 >= this.f40292b) {
                throw new NoSuchElementException();
            }
            byte[] bArr = C5049c.this.f40355b;
            this.f40291a = i10 + 1;
            return bArr[i10];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public b() {
            int I10 = C5049c.this.I();
            this.f40291a = I10;
            this.f40292b = I10 + C5049c.this.size();
        }
    }

    public C5049c(byte[] bArr, int i10, int i11) {
        super(bArr);
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Offset too small: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(29);
            sb3.append("Length too small: ");
            sb3.append(i10);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (((long) i10) + ((long) i11) <= bArr.length) {
            this.f40289d = i10;
            this.f40290e = i11;
            return;
        }
        StringBuilder sb4 = new StringBuilder(48);
        sb4.append("Offset+Length too large: ");
        sb4.append(i10);
        sb4.append("+");
        sb4.append(i11);
        throw new IllegalArgumentException(sb4.toString());
    }

    @Override // md.o
    public int I() {
        return this.f40289d;
    }

    @Override // md.o, java.lang.Iterable
    /* JADX INFO: renamed from: L */
    public AbstractC5050d.a iterator() {
        return new b();
    }

    @Override // md.o, md.AbstractC5050d
    public void n(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f40355b, I() + i10, bArr, i11, i12);
    }

    @Override // md.o, md.AbstractC5050d
    public int size() {
        return this.f40290e;
    }
}
