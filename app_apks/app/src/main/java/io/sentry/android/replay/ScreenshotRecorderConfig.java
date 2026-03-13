package io.sentry.android.replay;

import android.content.Context;
import fc.AbstractC4040w;
import fc.C4034q;
import io.sentry.SentryReplayOptions;
import io.sentry.protocol.Request;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import xc.C6361d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u0017\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B5\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\""}, d2 = {"Lio/sentry/android/replay/ScreenshotRecorderConfig;", "", "scaleFactorX", "", "scaleFactorY", "(FF)V", "recordingWidth", "", "recordingHeight", RRWebVideoEvent.JsonKeys.FRAME_RATE, "bitRate", "(IIFFII)V", "getBitRate", "()I", "getFrameRate", "getRecordingHeight", "getRecordingWidth", "getScaleFactorX", "()F", "getScaleFactorY", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", Request.JsonKeys.OTHER, "hashCode", "toString", "", "Companion", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ScreenshotRecorderConfig {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int bitRate;
    private final int frameRate;
    private final int recordingHeight;
    private final int recordingWidth;
    private final float scaleFactorX;
    private final float scaleFactorY;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\f\u0010\f\u001a\u00020\n*\u00020\nH\u0002¨\u0006\r"}, d2 = {"Lio/sentry/android/replay/ScreenshotRecorderConfig$Companion;", "", "()V", "fromSize", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "context", "Landroid/content/Context;", "sessionReplay", "Lio/sentry/SentryReplayOptions;", "windowWidth", "", "windowHeight", "adjustToBlockSize", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        private final int adjustToBlockSize(int i10) {
            int i11 = i10 % 16;
            return i11 <= 8 ? Math.max(16, i10 - i11) : i10 + (16 - i11);
        }

        public final ScreenshotRecorderConfig fromSize(Context context, SentryReplayOptions sessionReplay, int windowWidth, int windowHeight) {
            AbstractC4862t.e(context, "context");
            AbstractC4862t.e(sessionReplay, "sessionReplay");
            float f10 = windowHeight;
            float f11 = windowWidth;
            C4034q c4034qA = AbstractC4040w.a(Integer.valueOf(adjustToBlockSize(C6361d.c((f10 / context.getResources().getDisplayMetrics().density) * sessionReplay.getQuality().sizeScale))), Integer.valueOf(adjustToBlockSize(C6361d.c((f11 / context.getResources().getDisplayMetrics().density) * sessionReplay.getQuality().sizeScale))));
            int iIntValue = ((Number) c4034qA.a()).intValue();
            int iIntValue2 = ((Number) c4034qA.b()).intValue();
            return new ScreenshotRecorderConfig(iIntValue2, iIntValue, iIntValue2 / f11, iIntValue / f10, sessionReplay.getFrameRate(), sessionReplay.getQuality().bitRate);
        }

        private Companion() {
        }
    }

    public ScreenshotRecorderConfig(int i10, int i11, float f10, float f11, int i12, int i13) {
        this.recordingWidth = i10;
        this.recordingHeight = i11;
        this.scaleFactorX = f10;
        this.scaleFactorY = f11;
        this.frameRate = i12;
        this.bitRate = i13;
    }

    public static /* synthetic */ ScreenshotRecorderConfig copy$default(ScreenshotRecorderConfig screenshotRecorderConfig, int i10, int i11, float f10, float f11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = screenshotRecorderConfig.recordingWidth;
        }
        if ((i14 & 2) != 0) {
            i11 = screenshotRecorderConfig.recordingHeight;
        }
        if ((i14 & 4) != 0) {
            f10 = screenshotRecorderConfig.scaleFactorX;
        }
        if ((i14 & 8) != 0) {
            f11 = screenshotRecorderConfig.scaleFactorY;
        }
        if ((i14 & 16) != 0) {
            i12 = screenshotRecorderConfig.frameRate;
        }
        if ((i14 & 32) != 0) {
            i13 = screenshotRecorderConfig.bitRate;
        }
        int i15 = i12;
        int i16 = i13;
        return screenshotRecorderConfig.copy(i10, i11, f10, f11, i15, i16);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRecordingWidth() {
        return this.recordingWidth;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRecordingHeight() {
        return this.recordingHeight;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getScaleFactorX() {
        return this.scaleFactorX;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getScaleFactorY() {
        return this.scaleFactorY;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getFrameRate() {
        return this.frameRate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getBitRate() {
        return this.bitRate;
    }

    public final ScreenshotRecorderConfig copy(int recordingWidth, int recordingHeight, float scaleFactorX, float scaleFactorY, int frameRate, int bitRate) {
        return new ScreenshotRecorderConfig(recordingWidth, recordingHeight, scaleFactorX, scaleFactorY, frameRate, bitRate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreenshotRecorderConfig)) {
            return false;
        }
        ScreenshotRecorderConfig screenshotRecorderConfig = (ScreenshotRecorderConfig) other;
        return this.recordingWidth == screenshotRecorderConfig.recordingWidth && this.recordingHeight == screenshotRecorderConfig.recordingHeight && Float.compare(this.scaleFactorX, screenshotRecorderConfig.scaleFactorX) == 0 && Float.compare(this.scaleFactorY, screenshotRecorderConfig.scaleFactorY) == 0 && this.frameRate == screenshotRecorderConfig.frameRate && this.bitRate == screenshotRecorderConfig.bitRate;
    }

    public final int getBitRate() {
        return this.bitRate;
    }

    public final int getFrameRate() {
        return this.frameRate;
    }

    public final int getRecordingHeight() {
        return this.recordingHeight;
    }

    public final int getRecordingWidth() {
        return this.recordingWidth;
    }

    public final float getScaleFactorX() {
        return this.scaleFactorX;
    }

    public final float getScaleFactorY() {
        return this.scaleFactorY;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.recordingWidth) * 31) + Integer.hashCode(this.recordingHeight)) * 31) + Float.hashCode(this.scaleFactorX)) * 31) + Float.hashCode(this.scaleFactorY)) * 31) + Integer.hashCode(this.frameRate)) * 31) + Integer.hashCode(this.bitRate);
    }

    public String toString() {
        return "ScreenshotRecorderConfig(recordingWidth=" + this.recordingWidth + ", recordingHeight=" + this.recordingHeight + ", scaleFactorX=" + this.scaleFactorX + ", scaleFactorY=" + this.scaleFactorY + ", frameRate=" + this.frameRate + ", bitRate=" + this.bitRate + ')';
    }

    public ScreenshotRecorderConfig(float f10, float f11) {
        this(0, 0, f10, f11, 0, 0);
    }
}
