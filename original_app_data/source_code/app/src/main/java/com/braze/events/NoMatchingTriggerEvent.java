package com.braze.events;

import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/braze/events/NoMatchingTriggerEvent;", "", "", "sourceEventType", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSourceEventType", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NoMatchingTriggerEvent {
    private final String sourceEventType;

    public NoMatchingTriggerEvent(String sourceEventType) {
        AbstractC4862t.e(sourceEventType, "sourceEventType");
        this.sourceEventType = sourceEventType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NoMatchingTriggerEvent) && AbstractC4862t.a(this.sourceEventType, ((NoMatchingTriggerEvent) other).sourceEventType);
    }

    public int hashCode() {
        return this.sourceEventType.hashCode();
    }

    public String toString() {
        return "NoMatchingTriggerEvent(sourceEventType=" + this.sourceEventType + ")";
    }
}
