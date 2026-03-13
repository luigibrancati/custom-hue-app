package com.braze.events.internal;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27732c;

    public h(String mite, String host, String auth) {
        AbstractC4862t.e(mite, "mite");
        AbstractC4862t.e(host, "host");
        AbstractC4862t.e(auth, "auth");
        this.f27730a = mite;
        this.f27731b = host;
        this.f27732c = auth;
    }

    public final String a() {
        return this.f27731b;
    }

    public final String b() {
        return this.f27730a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return AbstractC4862t.a(this.f27730a, hVar.f27730a) && AbstractC4862t.a(this.f27731b, hVar.f27731b) && AbstractC4862t.a(this.f27732c, hVar.f27732c);
    }

    public final int hashCode() {
        return this.f27732c.hashCode() + ((this.f27731b.hashCode() + (this.f27730a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DustConfigReceivedEvent(mite=" + this.f27730a + ", host=" + this.f27731b + ", auth=" + this.f27732c + ")";
    }
}
