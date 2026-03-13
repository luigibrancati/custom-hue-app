package i2;

import D1.InterfaceC0749g;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.ar.core.ImageMetadata;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: renamed from: i2.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4330j implements InterfaceC4337q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0749g f37001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f37002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f37003d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f37006g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f37004e = new byte[ImageMetadata.CONTROL_AE_ANTIBANDING_MODE];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f37000a = new byte[RecognitionOptions.AZTEC];

    static {
        D1.s.a("media3.extractor");
    }

    public C4330j(InterfaceC0749g interfaceC0749g, long j10, long j11) {
        this.f37001b = interfaceC0749g;
        this.f37003d = j10;
        this.f37002c = j11;
    }

    @Override // i2.InterfaceC4337q
    public int a(int i10) throws EOFException, InterruptedIOException {
        C4330j c4330j;
        int iW = w(i10);
        if (iW == 0) {
            byte[] bArr = this.f37000a;
            c4330j = this;
            iW = c4330j.v(bArr, 0, Math.min(i10, bArr.length), 0, true);
        } else {
            c4330j = this;
        }
        c4330j.l(iW);
        return iW;
    }

    @Override // i2.InterfaceC4337q
    public boolean d(int i10, boolean z10) throws EOFException, InterruptedIOException {
        int iW = w(i10);
        while (iW < i10 && iW != -1) {
            iW = v(this.f37000a, -iW, Math.min(i10, this.f37000a.length + iW), iW, z10);
        }
        l(iW);
        return iW != -1;
    }

    @Override // i2.InterfaceC4337q
    public boolean e(byte[] bArr, int i10, int i11, boolean z10) {
        if (!r(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f37004e, this.f37005f - i11, bArr, i10, i11);
        return true;
    }

    @Override // i2.InterfaceC4337q
    public long getLength() {
        return this.f37002c;
    }

    @Override // i2.InterfaceC4337q
    public long getPosition() {
        return this.f37003d;
    }

    @Override // i2.InterfaceC4337q
    public void i() {
        this.f37005f = 0;
    }

    @Override // i2.InterfaceC4337q
    public boolean j(byte[] bArr, int i10, int i11, boolean z10) throws EOFException, InterruptedIOException {
        int iU = u(bArr, i10, i11);
        while (iU < i11 && iU != -1) {
            iU = v(bArr, i10, i11, iU, z10);
        }
        l(iU);
        return iU != -1;
    }

    public final void l(int i10) {
        if (i10 != -1) {
            this.f37003d += (long) i10;
        }
    }

    @Override // i2.InterfaceC4337q
    public long m() {
        return this.f37003d + ((long) this.f37005f);
    }

    @Override // i2.InterfaceC4337q
    public void o(int i10) throws EOFException, InterruptedIOException {
        r(i10, false);
    }

    @Override // i2.InterfaceC4337q
    public int p(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        C4330j c4330j;
        int iMin;
        t(i11);
        int i12 = this.f37006g;
        int i13 = this.f37005f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            c4330j = this;
            iMin = c4330j.v(this.f37004e, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            c4330j.f37006g += iMin;
        } else {
            c4330j = this;
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(c4330j.f37004e, c4330j.f37005f, bArr, i10, iMin);
        c4330j.f37005f += iMin;
        return iMin;
    }

    @Override // i2.InterfaceC4337q
    public void q(int i10) throws EOFException, InterruptedIOException {
        d(i10, false);
    }

    @Override // i2.InterfaceC4337q
    public boolean r(int i10, boolean z10) throws EOFException, InterruptedIOException {
        t(i10);
        int iV = this.f37006g - this.f37005f;
        while (iV < i10) {
            C4330j c4330j = this;
            int i11 = i10;
            boolean z11 = z10;
            iV = c4330j.v(this.f37004e, this.f37005f, i11, iV, z11);
            if (iV == -1) {
                return false;
            }
            c4330j.f37006g = c4330j.f37005f + iV;
            this = c4330j;
            i10 = i11;
            z10 = z11;
        }
        this.f37005f += i10;
        return true;
    }

    @Override // i2.InterfaceC4337q, D1.InterfaceC0749g
    public int read(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        C4330j c4330j;
        int iU = u(bArr, i10, i11);
        if (iU == 0) {
            c4330j = this;
            iU = c4330j.v(bArr, i10, i11, 0, true);
        } else {
            c4330j = this;
        }
        c4330j.l(iU);
        return iU;
    }

    @Override // i2.InterfaceC4337q
    public void readFully(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        j(bArr, i10, i11, false);
    }

    @Override // i2.InterfaceC4337q
    public void s(byte[] bArr, int i10, int i11) {
        e(bArr, i10, i11, false);
    }

    public final void t(int i10) {
        int i11 = this.f37005f + i10;
        byte[] bArr = this.f37004e;
        if (i11 > bArr.length) {
            this.f37004e = Arrays.copyOf(this.f37004e, G1.M.o(bArr.length * 2, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE + i11, i11 + ImageMetadata.LENS_APERTURE));
        }
    }

    public final int u(byte[] bArr, int i10, int i11) {
        int i12 = this.f37006g;
        if (i12 == 0) {
            return 0;
        }
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f37004e, 0, bArr, i10, iMin);
        x(iMin);
        return iMin;
    }

    public final int v(byte[] bArr, int i10, int i11, int i12, boolean z10) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i13 = this.f37001b.read(bArr, i10 + i12, i11 - i12);
        if (i13 != -1) {
            return i12 + i13;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    public final int w(int i10) {
        int iMin = Math.min(this.f37006g, i10);
        x(iMin);
        return iMin;
    }

    public final void x(int i10) {
        int i11 = this.f37006g - i10;
        this.f37006g = i11;
        this.f37005f = 0;
        byte[] bArr = this.f37004e;
        byte[] bArr2 = i11 < bArr.length - ImageMetadata.LENS_APERTURE ? new byte[ImageMetadata.CONTROL_AE_ANTIBANDING_MODE + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f37004e = bArr2;
    }
}
