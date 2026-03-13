package io.sentry.android.replay.util;

import io.sentry.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"sample", "", "Lio/sentry/util/Random;", "rate", "", "(Lio/sentry/util/Random;Ljava/lang/Double;)Z", "sentry-android-replay_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SamplingKt {
    public static final boolean sample(Random random, Double d10) {
        AbstractC4862t.e(random, "<this>");
        return d10 != null && d10.doubleValue() >= random.nextDouble();
    }
}
