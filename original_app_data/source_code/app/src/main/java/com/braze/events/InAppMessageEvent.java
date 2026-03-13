package com.braze.events;

import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.JsonUtils;
import io.flutter.plugins.firebase.analytics.Constants;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010\r¨\u0006 "}, d2 = {"Lcom/braze/events/InAppMessageEvent;", "", "Lcom/braze/triggers/events/b;", "triggerEvent", "Lcom/braze/triggers/actions/a;", "triggerAction", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "", Constants.USER_ID, "<init>", "(Lcom/braze/triggers/events/b;Lcom/braze/triggers/actions/a;Lcom/braze/models/inappmessage/IInAppMessage;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/braze/triggers/events/b;", "getTriggerEvent", "()Lcom/braze/triggers/events/b;", "Lcom/braze/triggers/actions/a;", "getTriggerAction", "()Lcom/braze/triggers/actions/a;", "Lcom/braze/models/inappmessage/IInAppMessage;", "getInAppMessage", "()Lcom/braze/models/inappmessage/IInAppMessage;", "Ljava/lang/String;", "getUserId", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InAppMessageEvent {
    private final IInAppMessage inAppMessage;
    private final com.braze.triggers.actions.a triggerAction;
    private final com.braze.triggers.events.b triggerEvent;
    private final String userId;

    public InAppMessageEvent(com.braze.triggers.events.b triggerEvent, com.braze.triggers.actions.a triggerAction, IInAppMessage inAppMessage, String str) {
        AbstractC4862t.e(triggerEvent, "triggerEvent");
        AbstractC4862t.e(triggerAction, "triggerAction");
        AbstractC4862t.e(inAppMessage, "inAppMessage");
        this.triggerEvent = triggerEvent;
        this.triggerAction = triggerAction;
        this.inAppMessage = inAppMessage;
        this.userId = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InAppMessageEvent)) {
            return false;
        }
        InAppMessageEvent inAppMessageEvent = (InAppMessageEvent) other;
        return AbstractC4862t.a(this.triggerEvent, inAppMessageEvent.triggerEvent) && AbstractC4862t.a(this.triggerAction, inAppMessageEvent.triggerAction) && AbstractC4862t.a(this.inAppMessage, inAppMessageEvent.inAppMessage) && AbstractC4862t.a(this.userId, inAppMessageEvent.userId);
    }

    public final IInAppMessage getInAppMessage() {
        return this.inAppMessage;
    }

    public final com.braze.triggers.actions.a getTriggerAction() {
        return this.triggerAction;
    }

    public final com.braze.triggers.events.b getTriggerEvent() {
        return this.triggerEvent;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = (this.inAppMessage.hashCode() + ((this.triggerAction.hashCode() + (this.triggerEvent.hashCode() * 31)) * 31)) * 31;
        String str = this.userId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return JsonUtils.getPrettyPrintedString(this.inAppMessage.getJsonKey());
    }
}
