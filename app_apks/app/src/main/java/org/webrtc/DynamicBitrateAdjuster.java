package org.webrtc;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
class DynamicBitrateAdjuster extends BaseBitrateAdjuster {
    private static final double BITRATE_ADJUSTMENT_MAX_SCALE = 4.0d;
    private static final double BITRATE_ADJUSTMENT_SEC = 3.0d;
    private static final int BITRATE_ADJUSTMENT_STEPS = 20;
    private static final double BITS_PER_BYTE = 8.0d;
    private int bitrateAdjustmentScaleExp;
    private double deviationBytes;
    private double timeSinceLastAdjustmentMs;

    private double getBitrateAdjustmentScale() {
        return Math.pow(BITRATE_ADJUSTMENT_MAX_SCALE, ((double) this.bitrateAdjustmentScaleExp) / 20.0d);
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public int getAdjustedBitrateBps() {
        return (int) (((double) this.targetBitrateBps) * getBitrateAdjustmentScale());
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void reportEncodedFrame(int i10) {
        double d10 = this.targetFramerateFps;
        if (d10 == 0.0d) {
            return;
        }
        int i11 = this.targetBitrateBps;
        double d11 = this.deviationBytes + (((double) i10) - ((((double) i11) / BITS_PER_BYTE) / d10));
        this.deviationBytes = d11;
        this.timeSinceLastAdjustmentMs += 1000.0d / d10;
        double d12 = ((double) i11) / BITS_PER_BYTE;
        double d13 = BITRATE_ADJUSTMENT_SEC * d12;
        double dMin = Math.min(d11, d13);
        this.deviationBytes = dMin;
        double dMax = Math.max(dMin, -d13);
        this.deviationBytes = dMax;
        if (this.timeSinceLastAdjustmentMs <= 3000.0d) {
            return;
        }
        if (dMax > d12) {
            int i12 = this.bitrateAdjustmentScaleExp - ((int) ((dMax / d12) + 0.5d));
            this.bitrateAdjustmentScaleExp = i12;
            this.bitrateAdjustmentScaleExp = Math.max(i12, -20);
            this.deviationBytes = d12;
        } else {
            double d14 = -d12;
            if (dMax < d14) {
                int i13 = this.bitrateAdjustmentScaleExp + ((int) (((-dMax) / d12) + 0.5d));
                this.bitrateAdjustmentScaleExp = i13;
                this.bitrateAdjustmentScaleExp = Math.min(i13, 20);
                this.deviationBytes = d14;
            }
        }
        this.timeSinceLastAdjustmentMs = 0.0d;
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void setTargets(int i10, double d10) {
        int i11 = this.targetBitrateBps;
        if (i11 > 0 && i10 < i11) {
            this.deviationBytes = (this.deviationBytes * ((double) i10)) / ((double) i11);
        }
        super.setTargets(i10, d10);
    }
}
