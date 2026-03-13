package io.sentry.android.replay.capture;

import fc.C4015H;
import io.sentry.rrweb.RRWebEvent;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/rrweb/RRWebEvent;", "event", "Lfc/H;", "invoke", "(Lio/sentry/rrweb/RRWebEvent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class CaptureStrategy$Companion$buildReplay$4 extends v implements l {
    final /* synthetic */ List<RRWebEvent> $recordingPayload;
    final /* synthetic */ Date $segmentTimestamp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureStrategy$Companion$buildReplay$4(Date date, List<RRWebEvent> list) {
        super(1);
        this.$segmentTimestamp = date;
        this.$recordingPayload = list;
    }

    @Override // vc.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((RRWebEvent) obj);
        return C4015H.f34254a;
    }

    public final void invoke(RRWebEvent event) {
        AbstractC4862t.e(event, "event");
        if (event.getTimestamp() >= this.$segmentTimestamp.getTime()) {
            this.$recordingPayload.add(event);
        }
    }
}
