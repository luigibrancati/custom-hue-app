package com.braze.communication;

import gc.Q;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f27522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f27523c;

    public d(int i10, Map responseHeaders, JSONObject jSONObject) {
        AbstractC4862t.e(responseHeaders, "responseHeaders");
        this.f27521a = i10;
        this.f27522b = responseHeaders;
        this.f27523c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f27521a == dVar.f27521a && AbstractC4862t.a(this.f27522b, dVar.f27522b) && AbstractC4862t.a(this.f27523c, dVar.f27523c);
    }

    public final int hashCode() {
        int iHashCode = (this.f27522b.hashCode() + (Integer.hashCode(this.f27521a) * 31)) * 31;
        JSONObject jSONObject = this.f27523c;
        return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public final String toString() {
        return "HttpConnectorResult(responseCode=" + this.f27521a + ", responseHeaders=" + this.f27522b + ", jsonResponse=" + this.f27523c + ")";
    }

    public /* synthetic */ d(int i10, Map map, int i11) {
        this(i10, (i11 & 2) != 0 ? Q.i() : map, (JSONObject) null);
    }
}
