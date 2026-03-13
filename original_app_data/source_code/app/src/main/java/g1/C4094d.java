package g1;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: g1.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4094d extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4094d(String message, Throwable th) {
        super(message, th);
        AbstractC4862t.e(message, "message");
    }

    public /* synthetic */ C4094d(String str, Throwable th, int i10, AbstractC4854k abstractC4854k) {
        this(str, (i10 & 2) != 0 ? null : th);
    }
}
