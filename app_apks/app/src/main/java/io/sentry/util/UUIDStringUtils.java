package io.sentry.util;

import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class UUIDStringUtils {
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final long[] HEX_VALUES;
    private static final int SENTRY_SPAN_UUID_STRING_LENGTH = 16;
    private static final int SENTRY_UUID_STRING_LENGTH = 32;

    static {
        long[] jArr = new long[128];
        HEX_VALUES = jArr;
        Arrays.fill(jArr, -1L);
        jArr[48] = 0;
        jArr[49] = 1;
        jArr[50] = 2;
        jArr[51] = 3;
        jArr[52] = 4;
        jArr[53] = 5;
        jArr[54] = 6;
        jArr[55] = 7;
        jArr[56] = 8;
        jArr[57] = 9;
        jArr[97] = 10;
        jArr[98] = 11;
        jArr[99] = 12;
        jArr[100] = 13;
        jArr[101] = 14;
        jArr[102] = 15;
        jArr[65] = 10;
        jArr[66] = 11;
        jArr[67] = 12;
        jArr[68] = 13;
        jArr[69] = 14;
        jArr[70] = 15;
    }

    private static void fillMostSignificantBits(char[] cArr, long j10) {
        char[] cArr2 = HEX_DIGITS;
        cArr[0] = cArr2[(int) (((-1152921504606846976L) & j10) >>> 60)];
        cArr[1] = cArr2[(int) ((1080863910568919040L & j10) >>> 56)];
        cArr[2] = cArr2[(int) ((67553994410557440L & j10) >>> 52)];
        cArr[3] = cArr2[(int) ((4222124650659840L & j10) >>> 48)];
        cArr[4] = cArr2[(int) ((263882790666240L & j10) >>> 44)];
        cArr[5] = cArr2[(int) ((16492674416640L & j10) >>> 40)];
        cArr[6] = cArr2[(int) ((1030792151040L & j10) >>> 36)];
        cArr[7] = cArr2[(int) ((64424509440L & j10) >>> 32)];
        cArr[8] = cArr2[(int) ((4026531840L & j10) >>> 28)];
        cArr[9] = cArr2[(int) ((251658240 & j10) >>> 24)];
        cArr[10] = cArr2[(int) ((15728640 & j10) >>> 20)];
        cArr[11] = cArr2[(int) ((983040 & j10) >>> 16)];
        cArr[12] = cArr2[(int) ((61440 & j10) >>> 12)];
        cArr[13] = cArr2[(int) ((3840 & j10) >>> 8)];
        cArr[14] = cArr2[(int) ((240 & j10) >>> 4)];
        cArr[15] = cArr2[(int) (j10 & 15)];
    }

    public static String toSentryIdString(UUID uuid) {
        return toSentryIdString(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    public static String toSentrySpanIdString(UUID uuid) {
        return toSentrySpanIdString(uuid.getMostSignificantBits());
    }

    public static String toSentrySpanIdString(long j10) {
        char[] cArr = new char[16];
        fillMostSignificantBits(cArr, j10);
        return new String(cArr);
    }

    public static String toSentryIdString(long j10, long j11) {
        char[] cArr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, cArr[(int) (((-1152921504606846976L) & j11) >>> 60)], cArr[(int) ((1080863910568919040L & j11) >>> 56)], cArr[(int) ((67553994410557440L & j11) >>> 52)], cArr[(int) ((4222124650659840L & j11) >>> 48)], cArr[(int) ((263882790666240L & j11) >>> 44)], cArr[(int) ((16492674416640L & j11) >>> 40)], cArr[(int) ((1030792151040L & j11) >>> 36)], cArr[(int) ((64424509440L & j11) >>> 32)], cArr[(int) ((4026531840L & j11) >>> 28)], cArr[(int) ((251658240 & j11) >>> 24)], cArr[(int) ((15728640 & j11) >>> 20)], cArr[(int) ((983040 & j11) >>> 16)], cArr[(int) ((61440 & j11) >>> 12)], cArr[(int) ((3840 & j11) >>> 8)], cArr[(int) ((240 & j11) >>> 4)], cArr[(int) (j11 & 15)]};
        fillMostSignificantBits(cArr, j10);
        char[] cArr2 = HEX_DIGITS;
        return new String(cArr);
    }
}
