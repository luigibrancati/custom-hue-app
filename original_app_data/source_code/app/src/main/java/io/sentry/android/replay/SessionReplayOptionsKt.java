package io.sentry.android.replay;

import io.sentry.SentryReplayOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\"(\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\"(\u0010\b\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"value", "", "maskAllImages", "Lio/sentry/SentryReplayOptions;", "getMaskAllImages", "(Lio/sentry/SentryReplayOptions;)Z", "setMaskAllImages", "(Lio/sentry/SentryReplayOptions;Z)V", "maskAllText", "getMaskAllText", "setMaskAllText", "sentry-android-replay_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SessionReplayOptionsKt {
    public static final boolean getMaskAllImages(SentryReplayOptions sentryReplayOptions) {
        AbstractC4862t.e(sentryReplayOptions, "<this>");
        throw new IllegalStateException("Getter not supported");
    }

    public static final boolean getMaskAllText(SentryReplayOptions sentryReplayOptions) {
        AbstractC4862t.e(sentryReplayOptions, "<this>");
        throw new IllegalStateException("Getter not supported");
    }

    public static final void setMaskAllImages(SentryReplayOptions sentryReplayOptions, boolean z10) {
        AbstractC4862t.e(sentryReplayOptions, "<this>");
        sentryReplayOptions.setMaskAllImages(z10);
    }

    public static final void setMaskAllText(SentryReplayOptions sentryReplayOptions, boolean z10) {
        AbstractC4862t.e(sentryReplayOptions, "<this>");
        sentryReplayOptions.setMaskAllText(z10);
    }
}
