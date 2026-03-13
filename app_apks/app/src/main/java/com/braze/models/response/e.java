package com.braze.models.response;

import com.braze.requests.o;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f28122b;

    public e(String str, o originalRequest) {
        AbstractC4862t.e(originalRequest, "originalRequest");
        this.f28121a = str;
        this.f28122b = originalRequest;
    }

    @Override // com.braze.models.response.d
    public final String a() {
        return this.f28121a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return AbstractC4862t.a(this.f28121a, eVar.f28121a) && AbstractC4862t.a(this.f28122b, eVar.f28122b);
    }

    public final int hashCode() {
        String str = this.f28121a;
        return this.f28122b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "InvalidApiKeyError(errorMessage=" + this.f28121a + ", originalRequest=" + this.f28122b + ")";
    }
}
