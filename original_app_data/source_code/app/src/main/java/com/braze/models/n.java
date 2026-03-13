package com.braze.models;

import com.braze.support.DateTimeUtils;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class n extends p {
    public n() {
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC4862t.d(uuidRandomUUID, "randomUUID(...)");
        q sessionId = new q(uuidRandomUUID);
        double dNowInSecondsPrecise = DateTimeUtils.nowInSecondsPrecise();
        AbstractC4862t.e(sessionId, "sessionId");
        super(sessionId, dNowInSecondsPrecise, null, false);
    }

    @Override // com.braze.models.p
    public final Double e() {
        return this.f28109c;
    }

    @Override // com.braze.models.p
    public final String toString() {
        return "\nMutableSession(sessionId=" + f() + ", startTime=" + g() + ", endTime=" + this.f28109c + ", isSealed=" + h() + ", duration=" + d() + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q sessionId, double d10, Double d11, boolean z10) {
        super(sessionId, d10, d11, z10);
        AbstractC4862t.e(sessionId, "sessionId");
    }
}
