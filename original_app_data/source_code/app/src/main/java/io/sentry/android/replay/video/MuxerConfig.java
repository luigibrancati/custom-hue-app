package io.sentry.android.replay.video;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.sentry.protocol.Request;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\nHÖ\u0001R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u0015¨\u0006$"}, d2 = {"Lio/sentry/android/replay/video/MuxerConfig;", "", Constants.FILE, "Ljava/io/File;", "recordingWidth", "", "recordingHeight", RRWebVideoEvent.JsonKeys.FRAME_RATE, "bitRate", "mimeType", "", "(Ljava/io/File;IIIILjava/lang/String;)V", "getBitRate", "()I", "getFile", "()Ljava/io/File;", "getFrameRate", "getMimeType", "()Ljava/lang/String;", "getRecordingHeight", "setRecordingHeight", "(I)V", "getRecordingWidth", "setRecordingWidth", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", Request.JsonKeys.OTHER, "hashCode", "toString", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"UseRequiresApi"})
@TargetApi(24)
public final /* data */ class MuxerConfig {
    public static final int $stable = 8;
    private final int bitRate;
    private final File file;
    private final int frameRate;
    private final String mimeType;
    private int recordingHeight;
    private int recordingWidth;

    public MuxerConfig(File file, int i10, int i11, int i12, int i13, String mimeType) {
        AbstractC4862t.e(file, "file");
        AbstractC4862t.e(mimeType, "mimeType");
        this.file = file;
        this.recordingWidth = i10;
        this.recordingHeight = i11;
        this.frameRate = i12;
        this.bitRate = i13;
        this.mimeType = mimeType;
    }

    public static /* synthetic */ MuxerConfig copy$default(MuxerConfig muxerConfig, File file, int i10, int i11, int i12, int i13, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            file = muxerConfig.file;
        }
        if ((i14 & 2) != 0) {
            i10 = muxerConfig.recordingWidth;
        }
        if ((i14 & 4) != 0) {
            i11 = muxerConfig.recordingHeight;
        }
        if ((i14 & 8) != 0) {
            i12 = muxerConfig.frameRate;
        }
        if ((i14 & 16) != 0) {
            i13 = muxerConfig.bitRate;
        }
        if ((i14 & 32) != 0) {
            str = muxerConfig.mimeType;
        }
        int i15 = i13;
        String str2 = str;
        return muxerConfig.copy(file, i10, i11, i12, i15, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRecordingWidth() {
        return this.recordingWidth;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRecordingHeight() {
        return this.recordingHeight;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getFrameRate() {
        return this.frameRate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getBitRate() {
        return this.bitRate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    public final MuxerConfig copy(File file, int recordingWidth, int recordingHeight, int frameRate, int bitRate, String mimeType) {
        AbstractC4862t.e(file, "file");
        AbstractC4862t.e(mimeType, "mimeType");
        return new MuxerConfig(file, recordingWidth, recordingHeight, frameRate, bitRate, mimeType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MuxerConfig)) {
            return false;
        }
        MuxerConfig muxerConfig = (MuxerConfig) other;
        return AbstractC4862t.a(this.file, muxerConfig.file) && this.recordingWidth == muxerConfig.recordingWidth && this.recordingHeight == muxerConfig.recordingHeight && this.frameRate == muxerConfig.frameRate && this.bitRate == muxerConfig.bitRate && AbstractC4862t.a(this.mimeType, muxerConfig.mimeType);
    }

    public final int getBitRate() {
        return this.bitRate;
    }

    public final File getFile() {
        return this.file;
    }

    public final int getFrameRate() {
        return this.frameRate;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final int getRecordingHeight() {
        return this.recordingHeight;
    }

    public final int getRecordingWidth() {
        return this.recordingWidth;
    }

    public int hashCode() {
        return (((((((((this.file.hashCode() * 31) + Integer.hashCode(this.recordingWidth)) * 31) + Integer.hashCode(this.recordingHeight)) * 31) + Integer.hashCode(this.frameRate)) * 31) + Integer.hashCode(this.bitRate)) * 31) + this.mimeType.hashCode();
    }

    public final void setRecordingHeight(int i10) {
        this.recordingHeight = i10;
    }

    public final void setRecordingWidth(int i10) {
        this.recordingWidth = i10;
    }

    public String toString() {
        return "MuxerConfig(file=" + this.file + ", recordingWidth=" + this.recordingWidth + ", recordingHeight=" + this.recordingHeight + ", frameRate=" + this.frameRate + ", bitRate=" + this.bitRate + ", mimeType=" + this.mimeType + ')';
    }

    public /* synthetic */ MuxerConfig(File file, int i10, int i11, int i12, int i13, String str, int i14, AbstractC4854k abstractC4854k) {
        this(file, i10, i11, i12, i13, (i14 & 32) != 0 ? "video/avc" : str);
    }
}
