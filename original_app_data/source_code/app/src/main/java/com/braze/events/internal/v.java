package com.braze.events.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f27748a;

    public v(ArrayList logs) {
        AbstractC4862t.e(logs, "logs");
        this.f27748a = logs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && AbstractC4862t.a(this.f27748a, ((v) obj).f27748a);
    }

    public final int hashCode() {
        return this.f27748a.hashCode();
    }

    public final String toString() {
        return "SdkDebuggerSendLogEvent(logs=" + this.f27748a + ")";
    }
}
