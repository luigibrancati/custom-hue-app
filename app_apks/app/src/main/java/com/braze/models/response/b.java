package com.braze.models.response;

import com.braze.requests.o;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f28116b;

    public b(String str, o originalRequest) {
        AbstractC4862t.e(originalRequest, "originalRequest");
        this.f28115a = str;
        this.f28116b = originalRequest;
    }

    @Override // com.braze.models.response.d
    public final String a() {
        return this.f28115a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return AbstractC4862t.a(this.f28115a, bVar.f28115a) && AbstractC4862t.a(this.f28116b, bVar.f28116b);
    }

    public final int hashCode() {
        String str = this.f28115a;
        return this.f28116b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "BasicResponseError(errorMessage=" + this.f28115a + ", originalRequest=" + this.f28116b + ")";
    }
}
