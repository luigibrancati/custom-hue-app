package com.braze.models;

import java.util.UUID;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class q implements IPutIntoJson {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f28111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28112b;

    public q(UUID sessionIdUuid) {
        AbstractC4862t.e(sessionIdUuid, "sessionIdUuid");
        this.f28111a = sessionIdUuid;
        String string = sessionIdUuid.toString();
        AbstractC4862t.d(string, "toString(...)");
        this.f28112b = string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && AbstractC4862t.a(this.f28111a, ((q) obj).f28111a);
    }

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        return this.f28112b;
    }

    public final int hashCode() {
        return this.f28111a.hashCode();
    }

    public final String toString() {
        return this.f28112b;
    }
}
