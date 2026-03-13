package com.braze.models.response;

import com.braze.requests.o;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f28123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.communication.d f28124b;

    public f(o originalRequest, com.braze.communication.d connectionResult) {
        AbstractC4862t.e(originalRequest, "originalRequest");
        AbstractC4862t.e(connectionResult, "connectionResult");
        this.f28123a = originalRequest;
        this.f28124b = connectionResult;
    }

    @Override // com.braze.models.response.d
    public final String a() {
        return "An error occurred during request processing, resulting in no valid response being received. Check the error log for more details.";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return AbstractC4862t.a(this.f28123a, fVar.f28123a) && AbstractC4862t.a("An error occurred during request processing, resulting in no valid response being received. Check the error log for more details.", "An error occurred during request processing, resulting in no valid response being received. Check the error log for more details.") && AbstractC4862t.a(this.f28124b, fVar.f28124b);
    }

    public final int hashCode() {
        return this.f28124b.hashCode() + (((this.f28123a.hashCode() * 31) - 525898564) * 31);
    }

    public final String toString() {
        return "NetworkCommunicationFailureResponseError(originalRequest=" + this.f28123a + ", errorMessage=An error occurred during request processing, resulting in no valid response being received. Check the error log for more details., connectionResult=" + this.f28124b + ")";
    }
}
