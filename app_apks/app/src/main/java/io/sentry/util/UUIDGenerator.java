package io.sentry.util;

import java.util.UUID;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class UUIDGenerator {
    public static long randomHalfLengthUUID() {
        byte[] bArr = new byte[8];
        SentryRandom.current().nextBytes(bArr);
        byte b10 = (byte) (bArr[6] & 15);
        bArr[6] = b10;
        bArr[6] = (byte) (b10 | 64);
        long j10 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            j10 = (j10 << 8) | ((long) (bArr[i10] & ForkServer.ERROR));
        }
        return j10;
    }

    public static UUID randomUUID() {
        byte[] bArr = new byte[16];
        SentryRandom.current().nextBytes(bArr);
        byte b10 = (byte) (bArr[6] & 15);
        bArr[6] = b10;
        bArr[6] = (byte) (b10 | 64);
        byte b11 = (byte) (bArr[8] & 63);
        bArr[8] = b11;
        bArr[8] = (byte) (b11 | 128);
        long j10 = 0;
        long j11 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            j11 = (j11 << 8) | ((long) (bArr[i10] & ForkServer.ERROR));
        }
        for (int i11 = 8; i11 < 16; i11++) {
            j10 = (j10 << 8) | ((long) (bArr[i11] & ForkServer.ERROR));
        }
        return new UUID(j11, j10);
    }
}
