package io.sentry.android.replay;

import io.sentry.SentryReplayEvent;
import io.sentry.protocol.Request;
import io.sentry.rrweb.RRWebEvent;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0002\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003Ja\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\tHÖ\u0001J\t\u00101\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00062"}, d2 = {"Lio/sentry/android/replay/LastSegmentData;", "", "recorderConfig", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "cache", "Lio/sentry/android/replay/ReplayCache;", "timestamp", "Ljava/util/Date;", "id", "", "duration", "", "replayType", "Lio/sentry/SentryReplayEvent$ReplayType;", "screenAtStart", "", "events", "", "Lio/sentry/rrweb/RRWebEvent;", "(Lio/sentry/android/replay/ScreenshotRecorderConfig;Lio/sentry/android/replay/ReplayCache;Ljava/util/Date;IJLio/sentry/SentryReplayEvent$ReplayType;Ljava/lang/String;Ljava/util/List;)V", "getCache", "()Lio/sentry/android/replay/ReplayCache;", "getDuration", "()J", "getEvents", "()Ljava/util/List;", "getId", "()I", "getRecorderConfig", "()Lio/sentry/android/replay/ScreenshotRecorderConfig;", "getReplayType", "()Lio/sentry/SentryReplayEvent$ReplayType;", "getScreenAtStart", "()Ljava/lang/String;", "getTimestamp", "()Ljava/util/Date;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", Request.JsonKeys.OTHER, "hashCode", "toString", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LastSegmentData {
    public static final int $stable = 8;
    private final ReplayCache cache;
    private final long duration;
    private final List<RRWebEvent> events;
    private final int id;
    private final ScreenshotRecorderConfig recorderConfig;
    private final SentryReplayEvent.ReplayType replayType;
    private final String screenAtStart;
    private final Date timestamp;

    /* JADX WARN: Multi-variable type inference failed */
    public LastSegmentData(ScreenshotRecorderConfig recorderConfig, ReplayCache cache, Date timestamp, int i10, long j10, SentryReplayEvent.ReplayType replayType, String str, List<? extends RRWebEvent> events) {
        AbstractC4862t.e(recorderConfig, "recorderConfig");
        AbstractC4862t.e(cache, "cache");
        AbstractC4862t.e(timestamp, "timestamp");
        AbstractC4862t.e(replayType, "replayType");
        AbstractC4862t.e(events, "events");
        this.recorderConfig = recorderConfig;
        this.cache = cache;
        this.timestamp = timestamp;
        this.id = i10;
        this.duration = j10;
        this.replayType = replayType;
        this.screenAtStart = str;
        this.events = events;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LastSegmentData copy$default(LastSegmentData lastSegmentData, ScreenshotRecorderConfig screenshotRecorderConfig, ReplayCache replayCache, Date date, int i10, long j10, SentryReplayEvent.ReplayType replayType, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            screenshotRecorderConfig = lastSegmentData.recorderConfig;
        }
        if ((i11 & 2) != 0) {
            replayCache = lastSegmentData.cache;
        }
        if ((i11 & 4) != 0) {
            date = lastSegmentData.timestamp;
        }
        if ((i11 & 8) != 0) {
            i10 = lastSegmentData.id;
        }
        if ((i11 & 16) != 0) {
            j10 = lastSegmentData.duration;
        }
        if ((i11 & 32) != 0) {
            replayType = lastSegmentData.replayType;
        }
        if ((i11 & 64) != 0) {
            str = lastSegmentData.screenAtStart;
        }
        if ((i11 & 128) != 0) {
            list = lastSegmentData.events;
        }
        List list2 = list;
        SentryReplayEvent.ReplayType replayType2 = replayType;
        long j11 = j10;
        Date date2 = date;
        int i12 = i10;
        return lastSegmentData.copy(screenshotRecorderConfig, replayCache, date2, i12, j11, replayType2, str, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ScreenshotRecorderConfig getRecorderConfig() {
        return this.recorderConfig;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ReplayCache getCache() {
        return this.cache;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SentryReplayEvent.ReplayType getReplayType() {
        return this.replayType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getScreenAtStart() {
        return this.screenAtStart;
    }

    public final List<RRWebEvent> component8() {
        return this.events;
    }

    public final LastSegmentData copy(ScreenshotRecorderConfig recorderConfig, ReplayCache cache, Date timestamp, int id2, long duration, SentryReplayEvent.ReplayType replayType, String screenAtStart, List<? extends RRWebEvent> events) {
        AbstractC4862t.e(recorderConfig, "recorderConfig");
        AbstractC4862t.e(cache, "cache");
        AbstractC4862t.e(timestamp, "timestamp");
        AbstractC4862t.e(replayType, "replayType");
        AbstractC4862t.e(events, "events");
        return new LastSegmentData(recorderConfig, cache, timestamp, id2, duration, replayType, screenAtStart, events);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LastSegmentData)) {
            return false;
        }
        LastSegmentData lastSegmentData = (LastSegmentData) other;
        return AbstractC4862t.a(this.recorderConfig, lastSegmentData.recorderConfig) && AbstractC4862t.a(this.cache, lastSegmentData.cache) && AbstractC4862t.a(this.timestamp, lastSegmentData.timestamp) && this.id == lastSegmentData.id && this.duration == lastSegmentData.duration && this.replayType == lastSegmentData.replayType && AbstractC4862t.a(this.screenAtStart, lastSegmentData.screenAtStart) && AbstractC4862t.a(this.events, lastSegmentData.events);
    }

    public final ReplayCache getCache() {
        return this.cache;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final List<RRWebEvent> getEvents() {
        return this.events;
    }

    public final int getId() {
        return this.id;
    }

    public final ScreenshotRecorderConfig getRecorderConfig() {
        return this.recorderConfig;
    }

    public final SentryReplayEvent.ReplayType getReplayType() {
        return this.replayType;
    }

    public final String getScreenAtStart() {
        return this.screenAtStart;
    }

    public final Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.recorderConfig.hashCode() * 31) + this.cache.hashCode()) * 31) + this.timestamp.hashCode()) * 31) + Integer.hashCode(this.id)) * 31) + Long.hashCode(this.duration)) * 31) + this.replayType.hashCode()) * 31;
        String str = this.screenAtStart;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.events.hashCode();
    }

    public String toString() {
        return "LastSegmentData(recorderConfig=" + this.recorderConfig + ", cache=" + this.cache + ", timestamp=" + this.timestamp + ", id=" + this.id + ", duration=" + this.duration + ", replayType=" + this.replayType + ", screenAtStart=" + this.screenAtStart + ", events=" + this.events + ')';
    }
}
