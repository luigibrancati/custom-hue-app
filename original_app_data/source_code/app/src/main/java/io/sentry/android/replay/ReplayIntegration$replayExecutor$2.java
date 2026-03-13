package io.sentry.android.replay;

import io.sentry.SentryOptions;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.util.ReplayExecutorService;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lio/sentry/android/replay/util/ReplayExecutorService;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class ReplayIntegration$replayExecutor$2 extends v implements InterfaceC6082a {
    final /* synthetic */ ReplayIntegration this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReplayIntegration$replayExecutor$2(ReplayIntegration replayIntegration) {
        super(0);
        this.this$0 = replayIntegration;
    }

    @Override // vc.InterfaceC6082a
    public final ReplayExecutorService invoke() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ReplayIntegration.ReplayExecutorServiceThreadFactory());
        AbstractC4862t.b(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
        SentryOptions sentryOptions = this.this$0.options;
        if (sentryOptions == null) {
            AbstractC4862t.p(RRWebOptionsEvent.EVENT_TAG);
            sentryOptions = null;
        }
        return new ReplayExecutorService(scheduledExecutorServiceNewSingleThreadScheduledExecutor, sentryOptions);
    }
}
