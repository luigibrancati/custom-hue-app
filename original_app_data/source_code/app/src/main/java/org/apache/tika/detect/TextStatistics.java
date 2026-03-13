package org.apache.tika.detect;

import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class TextStatistics {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final int[] counts = new int[256];
    private int total = 0;

    private int countSafeControl() {
        return count(9) + count(10) + count(13) + count(12) + count(27);
    }

    public void addData(byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            int[] iArr = this.counts;
            int i13 = bArr[i10 + i12] & ForkServer.ERROR;
            iArr[i13] = iArr[i13] + 1;
            this.total++;
        }
    }

    public int count() {
        return this.total;
    }

    public int countControl() {
        return count(0, 32) - countSafeControl();
    }

    public int countEightBit() {
        return count(128, 256);
    }

    public int countSafeAscii() {
        return count(32, 128) + countSafeControl();
    }

    public boolean isMostlyAscii() {
        int iCount = count(0, 32);
        int iCount2 = count(32, 128);
        int iCountSafeControl = countSafeControl();
        int i10 = this.total;
        return i10 > 0 && (iCount - iCountSafeControl) * 100 < i10 * 2 && (iCount2 + iCountSafeControl) * 100 > i10 * 90;
    }

    public boolean looksLikeUTF8() {
        int iCount = count(0, 32);
        int iCount2 = count(32, 128);
        int iCountSafeControl = countSafeControl();
        int[] iArr = {count(192, 224), count(224, 240), count(240, 248)};
        int i10 = 0;
        int i11 = 0;
        while (i10 < 3) {
            int i12 = iArr[i10];
            iCount2 += i12;
            i10++;
            i11 += i12 * i10;
        }
        int iCount3 = count(128, 192);
        return iCount2 > 0 && iCount3 <= i11 && iCount3 >= i11 - 3 && count(248, 256) == 0 && (iCount - iCountSafeControl) * 100 < iCount2 * 2;
    }

    public int count(int i10) {
        return this.counts[i10 & 255];
    }

    private int count(int i10, int i11) {
        int i12 = 0;
        while (i10 < i11) {
            i12 += this.counts[i10];
            i10++;
        }
        return i12;
    }
}
