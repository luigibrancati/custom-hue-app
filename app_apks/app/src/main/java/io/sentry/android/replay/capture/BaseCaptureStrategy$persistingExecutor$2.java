package io.sentry.android.replay.capture;

import io.sentry.android.replay.capture.BaseCaptureStrategy;
import io.sentry.android.replay.util.ReplayExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lio/sentry/android/replay/util/ReplayExecutorService;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class BaseCaptureStrategy$persistingExecutor$2 extends v implements InterfaceC6082a {
    final /* synthetic */ BaseCaptureStrategy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCaptureStrategy$persistingExecutor$2(BaseCaptureStrategy baseCaptureStrategy) {
        super(0);
        this.this$0 = baseCaptureStrategy;
    }

    @Override // vc.InterfaceC6082a
    public final ReplayExecutorService invoke() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new BaseCaptureStrategy.ReplayPersistingExecutorServiceThreadFactory());
        AbstractC4862t.b(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
        return new ReplayExecutorService(scheduledExecutorServiceNewSingleThreadScheduledExecutor, this.this$0.options);
    }
}
