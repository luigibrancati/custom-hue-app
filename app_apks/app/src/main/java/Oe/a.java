package Oe;

import Je.f;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends OutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f12466c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12468e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12464a = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12467d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12469f = true;

    public void a(int i10) {
        if (this.f12467d < this.f12464a.size() - 1) {
            this.f12468e += this.f12466c.length;
            int i11 = this.f12467d + 1;
            this.f12467d = i11;
            this.f12466c = (byte[]) this.f12464a.get(i11);
            return;
        }
        byte[] bArr = this.f12466c;
        if (bArr == null) {
            if (i10 <= 0) {
                i10 = RecognitionOptions.UPC_E;
            }
            this.f12468e = 0;
        } else {
            i10 = Math.max(bArr.length << 1, i10 - this.f12468e);
            this.f12468e += this.f12466c.length;
        }
        this.f12467d++;
        byte[] bArrE = f.e(i10);
        this.f12466c = bArrE;
        this.f12464a.add(bArrE);
    }

    public abstract byte[] b();

    public byte[] c() {
        int i10 = this.f12465b;
        if (i10 == 0) {
            return f.f6498b;
        }
        byte[] bArrE = f.e(i10);
        int i11 = 0;
        for (byte[] bArr : this.f12464a) {
            int iMin = Math.min(bArr.length, i10);
            System.arraycopy(bArr, 0, bArrE, i11, iMin);
            i11 += iMin;
            i10 -= iMin;
            if (i10 == 0) {
                break;
            }
        }
        return bArrE;
    }

    public String d(String str) {
        return new String(b(), str);
    }

    public String f(Charset charset) {
        return new String(b(), charset);
    }

    public void g(int i10) {
        int i11 = this.f12465b;
        int i12 = i11 - this.f12468e;
        if (i12 == this.f12466c.length) {
            a(i11 + 1);
            i12 = 0;
        }
        this.f12466c[i12] = (byte) i10;
        this.f12465b++;
    }

    public void h(byte[] bArr, int i10, int i11) {
        int i12 = this.f12465b;
        int i13 = i12 + i11;
        int i14 = i12 - this.f12468e;
        int i15 = i11;
        while (i15 > 0) {
            int iMin = Math.min(i15, this.f12466c.length - i14);
            System.arraycopy(bArr, (i10 + i11) - i15, this.f12466c, i14, iMin);
            i15 -= iMin;
            if (i15 > 0) {
                a(i13);
                i14 = 0;
            }
        }
        this.f12465b = i13;
    }

    public String toString() {
        return new String(b(), Charset.defaultCharset());
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public abstract void write(byte[] bArr, int i10, int i11);

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
