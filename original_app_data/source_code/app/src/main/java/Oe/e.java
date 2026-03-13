package Oe;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends Oe.a {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends Ke.d {
        public e k() {
            return new e(this);
        }
    }

    public static b i() {
        return new b();
    }

    @Override // Oe.a
    public byte[] b() {
        return c();
    }

    public int j() {
        return this.f12465b;
    }

    @Override // Oe.a, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException(String.format("offset=%,d, length=%,d", Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        if (i11 == 0) {
            return;
        }
        h(bArr, i10, i11);
    }

    @Deprecated
    public e() {
        this(RecognitionOptions.UPC_E);
    }

    public e(b bVar) {
        this(bVar.g());
    }

    public e(int i10) {
        if (i10 >= 0) {
            a(i10);
            return;
        }
        throw new IllegalArgumentException("Negative initial size: " + i10);
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        g(i10);
    }
}
