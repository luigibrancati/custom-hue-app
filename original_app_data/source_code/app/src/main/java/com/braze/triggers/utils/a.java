package com.braze.triggers.utils;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.triggers.enums.b f28757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28758b;

    public a(com.braze.triggers.enums.b pathType, String remoteUrl) {
        AbstractC4862t.e(pathType, "pathType");
        AbstractC4862t.e(remoteUrl, "remoteUrl");
        this.f28757a = pathType;
        this.f28758b = remoteUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f28757a == aVar.f28757a && AbstractC4862t.a(this.f28758b, aVar.f28758b);
    }

    public final int hashCode() {
        return this.f28758b.hashCode() + (this.f28757a.hashCode() * 31);
    }

    public final String toString() {
        return "RemotePath(pathType=" + this.f28757a + ", remoteUrl=" + this.f28758b + ")";
    }
}
