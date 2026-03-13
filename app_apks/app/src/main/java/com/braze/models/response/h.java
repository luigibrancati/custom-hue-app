package com.braze.models.response;

import com.braze.requests.o;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f28140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f28143d;

    public h(o originalRequest, int i10, String str, String str2) {
        AbstractC4862t.e(originalRequest, "originalRequest");
        this.f28140a = originalRequest;
        this.f28141b = i10;
        this.f28142c = str;
        this.f28143d = str2;
    }

    @Override // com.braze.models.response.d
    public final String a() {
        return this.f28143d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return AbstractC4862t.a(this.f28140a, hVar.f28140a) && this.f28141b == hVar.f28141b && AbstractC4862t.a(this.f28142c, hVar.f28142c) && AbstractC4862t.a(this.f28143d, hVar.f28143d);
    }

    public final int hashCode() {
        int iHashCode = (Integer.hashCode(this.f28141b) + (this.f28140a.hashCode() * 31)) * 31;
        String str = this.f28142c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f28143d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "{code = " + this.f28141b + ", reason = " + this.f28142c + ", message = " + this.f28143d + "}";
    }
}
