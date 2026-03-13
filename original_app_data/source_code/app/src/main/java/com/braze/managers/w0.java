package com.braze.managers;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f28019b;

    public w0(String id2, long j10) {
        AbstractC4862t.e(id2, "id");
        this.f28018a = id2;
        this.f28019b = j10;
    }

    public final String a() {
        return this.f28018a;
    }

    public final long b() {
        return this.f28019b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return AbstractC4862t.a(this.f28018a, w0Var.f28018a) && this.f28019b == w0Var.f28019b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f28019b) + (this.f28018a.hashCode() * 31);
    }

    public final String toString() {
        return "CampaignData(id=" + this.f28018a + ", timestamp=" + this.f28019b + ")";
    }
}
