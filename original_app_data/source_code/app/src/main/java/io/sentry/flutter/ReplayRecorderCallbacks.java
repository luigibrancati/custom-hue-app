package io.sentry.flutter;

import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\nJ'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lio/sentry/flutter/ReplayRecorderCallbacks;", "", "", "replayId", "", "replayIsBuffering", "Lfc/H;", "replayStarted", "(Ljava/lang/String;Z)V", "replayResumed", "()V", "replayPaused", "replayStopped", "replayReset", "", "width", "height", RRWebVideoEvent.JsonKeys.FRAME_RATE, "replayConfigChanged", "(III)V", "sentry_flutter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ReplayRecorderCallbacks {
    void replayConfigChanged(int width, int height, int frameRate);

    void replayPaused();

    void replayReset();

    void replayResumed();

    void replayStarted(String replayId, boolean replayIsBuffering);

    void replayStopped();
}
