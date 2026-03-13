package i4;

import java.util.UUID;
import k4.InterfaceC4798d;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class o implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f37191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4798d f37192b;

    public o(UUID requestId, InterfaceC4798d target) {
        AbstractC4862t.e(requestId, "requestId");
        AbstractC4862t.e(target, "target");
        this.f37191a = requestId;
        this.f37192b = target;
    }
}
