package io.sentry.android.replay;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.v;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lio/sentry/android/replay/ReplayFrame;", "invoke", "(Lio/sentry/android/replay/ReplayFrame;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class ReplayCache$rotate$1$1 extends v implements l {
    final /* synthetic */ L $screen;
    final /* synthetic */ long $until;
    final /* synthetic */ ReplayCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReplayCache$rotate$1$1(long j10, ReplayCache replayCache, L l10) {
        super(1);
        this.$until = j10;
        this.this$0 = replayCache;
        this.$screen = l10;
    }

    @Override // vc.l
    public final Boolean invoke(ReplayFrame it) {
        AbstractC4862t.e(it, "it");
        if (it.getTimestamp() < this.$until) {
            this.this$0.deleteFile(it.getScreenshot());
            return Boolean.TRUE;
        }
        L l10 = this.$screen;
        if (l10.f39776a == null) {
            l10.f39776a = it.getScreen();
        }
        return Boolean.FALSE;
    }
}
