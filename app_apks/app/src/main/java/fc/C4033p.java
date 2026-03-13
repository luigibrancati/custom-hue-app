package fc;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: fc.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4033p extends Error {
    public C4033p() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4033p(String message) {
        super(message);
        AbstractC4862t.e(message, "message");
    }

    public /* synthetic */ C4033p(String str, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? "An operation is not implemented." : str);
    }
}
