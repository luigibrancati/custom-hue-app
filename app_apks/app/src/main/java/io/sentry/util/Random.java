package io.sentry.util;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class Random implements Serializable {
    private static final double DOUBLE_MASK = 9.007199254740992E15d;
    private static final float FLOAT_UNIT = 1.6777216E7f;
    private static final long INTEGER_MASK = 4294967295L;
    private static final long MULT_64 = 6364136223846793005L;
    static final AtomicLong UNIQUE_SEED = new AtomicLong(System.nanoTime());
    private static final long serialVersionUID = -4257915988930727506L;
    private boolean gausAvailable;
    private long inc;
    private double nextGaus;
    private long state;

    public Random() {
        this(getRandomSeed(), getRandomSeed());
    }

    private static long getRandomSeed() {
        AtomicLong atomicLong;
        long j10;
        long j11;
        do {
            atomicLong = UNIQUE_SEED;
            j10 = atomicLong.get();
            long j12 = (j10 >> 12) ^ j10;
            long j13 = j12 ^ (j12 << 25);
            j11 = (j13 ^ (j13 >> 27)) * 2685821657736338717L;
        } while (!atomicLong.compareAndSet(j10, j11));
        return j11;
    }

    private void setInc(long j10) {
        if (j10 != 0 && j10 % 2 != 0) {
            this.inc = j10;
            return;
        }
        throw new IllegalArgumentException("Increment may not be 0 or even. Value: " + j10);
    }

    private void setState(long j10) {
        this.state = j10;
    }

    public boolean nextBoolean() {
        long j10 = (this.state * MULT_64) + this.inc;
        this.state = j10;
        return (((((j10 >>> 22) ^ j10) >>> ((int) ((j10 >>> 61) + 22))) & 4294967295L) >>> 31) != 0;
    }

    public byte nextByte() {
        this.state = (this.state * MULT_64) + this.inc;
        return (byte) ((((r0 >>> 22) ^ r0) >>> ((int) ((r0 >>> 61) + 22))) >>> 24);
    }

    public void nextBytes(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            this.state = (this.state * MULT_64) + this.inc;
            bArr[i10] = (byte) ((((r1 >>> 22) ^ r1) >>> ((int) ((r1 >>> 61) + 22))) >>> 24);
        }
    }

    public char nextChar() {
        this.state = (this.state * MULT_64) + this.inc;
        return (char) ((((r0 >>> 22) ^ r0) >>> ((int) ((r0 >>> 61) + 22))) >>> 16);
    }

    public double nextDouble() {
        long j10 = this.state * MULT_64;
        long j11 = this.inc;
        long j12 = j10 + j11;
        long j13 = (((j12 >>> 22) ^ j12) >>> ((int) ((j12 >>> 61) + 22))) & 4294967295L;
        this.state = (j12 * MULT_64) + j11;
        return (((j13 >>> 6) << 27) + (((((r0 >>> 22) ^ r0) >>> ((int) ((r0 >>> 61) + 22))) & 4294967295L) >>> 5)) / DOUBLE_MASK;
    }

    public float nextFloat() {
        this.state = (this.state * MULT_64) + this.inc;
        return (((((r0 >>> 22) ^ r0) >>> ((int) ((r0 >>> 61) + 22))) & 4294967295L) >>> 8) / FLOAT_UNIT;
    }

    public int nextInt() {
        long j10 = (this.state * MULT_64) + this.inc;
        this.state = j10;
        return (int) (((j10 >>> 22) ^ j10) >>> ((int) ((j10 >>> 61) + 22)));
    }

    public long nextLong() {
        long j10 = this.state * MULT_64;
        long j11 = this.inc;
        long j12 = j10 + j11;
        long j13 = ((j12 >>> 22) ^ j12) >>> ((int) ((j12 >>> 61) + 22));
        long j14 = (j12 * MULT_64) + j11;
        this.state = j14;
        return (j13 << 32) + ((long) ((int) (((j14 >>> 22) ^ j14) >>> ((int) ((j14 >>> 61) + 22)))));
    }

    public short nextShort() {
        this.state = (this.state * MULT_64) + this.inc;
        return (short) ((((r0 >>> 22) ^ r0) >>> ((int) ((r0 >>> 61) + 22))) >>> 16);
    }

    public void setSeed(long j10, long j11) {
        long j12 = (j11 << 1) | 1;
        this.inc = j12;
        this.state = j12 + j10;
    }

    public Random(long j10, long j11) {
        setSeed(j10, j11);
    }

    public boolean nextBoolean(double d10) {
        if (d10 < 0.0d || d10 > 1.0d) {
            throw new IllegalArgumentException("probability must be between 0.0 and 1.0 inclusive.");
        }
        if (d10 == 0.0d) {
            return false;
        }
        if (d10 == 1.0d) {
            return true;
        }
        long j10 = this.state * MULT_64;
        long j11 = this.inc;
        long j12 = j10 + j11;
        long j13 = (((j12 >>> 22) ^ j12) >>> ((int) ((j12 >>> 61) + 22))) & 4294967295L;
        long j14 = (j12 * MULT_64) + j11;
        this.state = j14;
        return ((double) (((j13 >>> 6) << 27) + (((((j14 >>> 22) ^ j14) >>> ((int) ((j14 >>> 61) + 22))) & 4294967295L) >>> 5))) / DOUBLE_MASK < d10;
    }

    public float nextFloat(boolean z10, boolean z11) {
        float f10;
        while (true) {
            long j10 = this.state * MULT_64;
            long j11 = this.inc;
            long j12 = j10 + j11;
            this.state = j12;
            f10 = (((((j12 >>> 22) ^ j12) >>> ((int) ((j12 >>> 61) + 22))) & 4294967295L) >>> 8) / FLOAT_UNIT;
            if (z11) {
                long j13 = (j12 * MULT_64) + j11;
                this.state = j13;
                if ((((((j13 >>> 22) ^ j13) >>> ((int) ((j13 >>> 61) + 22))) & 4294967295L) >>> 31) != 0) {
                    f10 += 1.0f;
                }
            }
            if (f10 <= 1.0f && (z10 || f10 != 0.0f)) {
                break;
            }
        }
        return f10;
    }

    public int nextInt(int i10) {
        long j10 = (this.state * MULT_64) + this.inc;
        this.state = j10;
        int i11 = ((int) (((j10 >>> 22) ^ j10) >>> ((int) ((j10 >>> 61) + 22)))) >>> 1;
        int i12 = i10 - 1;
        if ((i10 & i12) == 0) {
            return (int) ((((long) i10) * ((long) i11)) >> 31);
        }
        while (true) {
            int i13 = i11 % i10;
            if ((i11 - i13) + i12 >= 0) {
                return i13;
            }
            long j11 = (this.state * MULT_64) + this.inc;
            this.state = j11;
            i11 = ((int) (((j11 >>> 22) ^ j11) >>> ((int) ((j11 >>> 61) + 22)))) >>> 1;
        }
    }

    public double nextDouble(boolean z10, boolean z11) {
        double d10;
        while (true) {
            long j10 = this.state * MULT_64;
            long j11 = this.inc;
            long j12 = j10 + j11;
            long j13 = (((j12 >>> 22) ^ j12) >>> ((int) ((j12 >>> 61) + 22))) & 4294967295L;
            long j14 = (j12 * MULT_64) + j11;
            this.state = j14;
            d10 = (((j13 >>> 6) << 27) + (((((j14 >>> 22) ^ j14) >>> ((int) ((j14 >>> 61) + 22))) & 4294967295L) >>> 5)) / DOUBLE_MASK;
            if (z11) {
                long j15 = (j14 * MULT_64) + j11;
                this.state = j15;
                if ((((((j15 >>> 22) ^ j15) >>> ((int) ((j15 >>> 61) + 22))) & 4294967295L) >>> 31) != 0) {
                    d10 += 1.0d;
                }
            }
            if (d10 <= 1.0d && (z10 || d10 != 0.0d)) {
                break;
            }
        }
        return d10;
    }

    public long nextLong(long j10) {
        long j11;
        long j12;
        if (j10 == 0) {
            throw new IllegalArgumentException("n has to be greater than 0");
        }
        do {
            long j13 = this.state * MULT_64;
            long j14 = this.inc;
            long j15 = j13 + j14;
            long j16 = ((j15 >>> 22) ^ j15) >>> ((int) ((j15 >>> 61) + 22));
            long j17 = (j15 * MULT_64) + j14;
            this.state = j17;
            j11 = ((j16 << 32) + ((long) ((int) (((j17 >>> 22) ^ j17) >>> ((int) ((j17 >>> 61) + 22)))))) >>> 1;
            j12 = j11 % j10;
        } while ((j11 - j12) + (j10 - 1) < 0);
        return j12;
    }

    private Random(long j10, long j11, boolean z10) {
        setState(j10);
        setInc(j11);
    }
}
