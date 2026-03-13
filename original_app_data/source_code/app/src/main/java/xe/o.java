package xe;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f48306a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(b errorCode) {
        super("stream was reset: " + errorCode);
        AbstractC4862t.e(errorCode, "errorCode");
        this.f48306a = errorCode;
    }
}
