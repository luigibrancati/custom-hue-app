package io.sentry.android.replay;

import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.v;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class ReplayCache$ongoingSegmentFile$2 extends v implements InterfaceC6082a {
    final /* synthetic */ ReplayCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReplayCache$ongoingSegmentFile$2(ReplayCache replayCache) {
        super(0);
        this.this$0 = replayCache;
    }

    @Override // vc.InterfaceC6082a
    public final File invoke() throws IOException {
        if (this.this$0.getReplayCacheDir$sentry_android_replay_release() == null) {
            return null;
        }
        File file = new File(this.this$0.getReplayCacheDir$sentry_android_replay_release(), ReplayCache.ONGOING_SEGMENT);
        if (!file.exists()) {
            file.createNewFile();
        }
        return file;
    }
}
