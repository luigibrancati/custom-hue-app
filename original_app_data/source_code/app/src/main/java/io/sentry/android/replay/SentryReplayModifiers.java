package io.sentry.android.replay;

import kotlin.Metadata;
import x0.C6288h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/sentry/android/replay/SentryReplayModifiers;", "", "<init>", "()V", "Lx0/h;", "", "SentryPrivacy", "Lx0/h;", "getSentryPrivacy", "()Lx0/h;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SentryReplayModifiers {
    public static final SentryReplayModifiers INSTANCE = new SentryReplayModifiers();
    private static final C6288h SentryPrivacy = new C6288h("SentryPrivacy", SentryReplayModifiers$SentryPrivacy$1.INSTANCE);
    public static final int $stable = C6288h.f47331e;

    private SentryReplayModifiers() {
    }

    public final C6288h getSentryPrivacy() {
        return SentryPrivacy;
    }
}
