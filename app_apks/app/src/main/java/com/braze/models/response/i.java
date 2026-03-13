package com.braze.models.response;

import com.braze.requests.o;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f28144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28146c;

    public i(o originalRequest, int i10, String str) {
        AbstractC4862t.e(originalRequest, "originalRequest");
        this.f28144a = originalRequest;
        this.f28145b = i10;
        this.f28146c = str;
    }

    @Override // com.braze.models.response.d
    public final String a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return AbstractC4862t.a(this.f28144a, iVar.f28144a) && this.f28145b == iVar.f28145b && AbstractC4862t.a(this.f28146c, iVar.f28146c);
    }

    public final int hashCode() {
        int iHashCode = (Integer.hashCode(this.f28145b) + (this.f28144a.hashCode() * 31)) * 31;
        String str = this.f28146c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "{code = " + this.f28145b + ", reason = " + this.f28146c + "}";
    }
}
