package io.sentry.android.replay;

import Od.o;
import kotlin.Metadata;
import kotlin.jvm.internal.v;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LOd/o;", "invoke", "()LOd/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class DefaultReplayBreadcrumbConverter$Companion$snakecasePattern$2 extends v implements InterfaceC6082a {
    public static final DefaultReplayBreadcrumbConverter$Companion$snakecasePattern$2 INSTANCE = new DefaultReplayBreadcrumbConverter$Companion$snakecasePattern$2();

    public DefaultReplayBreadcrumbConverter$Companion$snakecasePattern$2() {
        super(0);
    }

    @Override // vc.InterfaceC6082a
    public final o invoke() {
        return new o("_[a-z]");
    }
}
