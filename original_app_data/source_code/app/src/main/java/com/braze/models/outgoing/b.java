package com.braze.models.outgoing;

import com.braze.models.IPutIntoJson;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b implements IPutIntoJson {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28070a;

    public b(String apiKey) {
        AbstractC4862t.e(apiKey, "apiKey");
        this.f28070a = apiKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && AbstractC4862t.a(this.f28070a, ((b) obj).f28070a);
    }

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        return this.f28070a;
    }

    public final int hashCode() {
        return this.f28070a.hashCode();
    }

    public final String toString() {
        return this.f28070a;
    }
}
