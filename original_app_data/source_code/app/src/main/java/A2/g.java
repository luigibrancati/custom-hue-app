package A2;

import i2.InterfaceC4337q;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f137d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f138a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f140c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= ~f137d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public static int c(int i10) {
        int i11 = 0;
        while (true) {
            long[] jArr = f137d;
            if (i11 >= jArr.length) {
                return -1;
            }
            if ((jArr[i11] & ((long) i10)) != 0) {
                return i11 + 1;
            }
            i11++;
        }
    }

    public int b() {
        return this.f140c;
    }

    public long d(InterfaceC4337q interfaceC4337q, boolean z10, boolean z11, int i10) {
        if (this.f139b == 0) {
            if (!interfaceC4337q.j(this.f138a, 0, 1, z10)) {
                return -1L;
            }
            int iC = c(this.f138a[0] & ForkServer.ERROR);
            this.f140c = iC;
            if (iC == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f139b = 1;
        }
        int i11 = this.f140c;
        if (i11 > i10) {
            this.f139b = 0;
            return -2L;
        }
        if (i11 != 1) {
            interfaceC4337q.readFully(this.f138a, 1, i11 - 1);
        }
        this.f139b = 0;
        return a(this.f138a, this.f140c, z11);
    }

    public void e() {
        this.f139b = 0;
        this.f140c = 0;
    }
}
