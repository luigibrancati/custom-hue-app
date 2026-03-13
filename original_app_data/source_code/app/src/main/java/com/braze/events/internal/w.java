package com.braze.events.internal;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.models.response.m f27749a;

    public w(com.braze.models.response.m serverConfig) {
        AbstractC4862t.e(serverConfig, "serverConfig");
        this.f27749a = serverConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && AbstractC4862t.a(this.f27749a, ((w) obj).f27749a);
    }

    public final int hashCode() {
        return this.f27749a.hashCode();
    }

    public final String toString() {
        return "ServerConfigReceivedEvent(serverConfig=" + this.f27749a + ")";
    }
}
