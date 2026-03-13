package J1;

import G1.AbstractC0853a;
import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f5864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f5865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f5867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f5868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5871h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f5872i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f5873j;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f5874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaCodec.CryptoInfo.Pattern f5875b;

        public final void b(int i10, int i11) {
            this.f5875b.set(i10, i11);
            this.f5874a.setPattern(this.f5875b);
        }

        public b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f5874a = cryptoInfo;
            this.f5875b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f5872i = cryptoInfo;
        this.f5873j = new b(cryptoInfo);
    }

    public MediaCodec.CryptoInfo a() {
        return this.f5872i;
    }

    public void b(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f5867d == null) {
            int[] iArr = new int[1];
            this.f5867d = iArr;
            this.f5872i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f5867d;
        iArr2[0] = iArr2[0] + i10;
    }

    public void c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f5869f = i10;
        this.f5867d = iArr;
        this.f5868e = iArr2;
        this.f5865b = bArr;
        this.f5864a = bArr2;
        this.f5866c = i11;
        this.f5870g = i12;
        this.f5871h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f5872i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        ((b) AbstractC0853a.e(this.f5873j)).b(i12, i13);
    }
}
