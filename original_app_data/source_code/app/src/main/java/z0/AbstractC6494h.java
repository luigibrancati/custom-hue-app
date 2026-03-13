package z0;

import io.flutter.embedding.android.KeyboardMap;
import n0.AbstractC5066d;

/* JADX INFO: renamed from: z0.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6494h {
    public static final long a(long j10, long j11) {
        return AbstractC5066d.b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32)) - AbstractC6493g.e(j11))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & KeyboardMap.kValueMask)) - AbstractC6493g.f(j11))) & KeyboardMap.kValueMask));
    }

    public static final long b(long j10, long j11) {
        return AbstractC5066d.b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32)) + AbstractC6493g.e(j11))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & KeyboardMap.kValueMask)) + AbstractC6493g.f(j11))) & KeyboardMap.kValueMask));
    }

    public static final long c(long j10) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j10 >> 32)));
        return AbstractC6493g.c((((long) Math.round(Float.intBitsToFloat((int) (j10 & KeyboardMap.kValueMask)))) & KeyboardMap.kValueMask) | (((long) iRound) << 32));
    }
}
