package com.braze.events.internal;

import com.braze.managers.d1;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1 f27747a;

    public t(d1 debugConfig) {
        AbstractC4862t.e(debugConfig, "debugConfig");
        this.f27747a = debugConfig;
    }

    public final d1 a() {
        return this.f27747a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && AbstractC4862t.a(this.f27747a, ((t) obj).f27747a);
    }

    public final int hashCode() {
        return this.f27747a.hashCode();
    }

    public final String toString() {
        return "SdkDebuggerConfigUpdateEvent(debugConfig=" + this.f27747a + ")";
    }
}
