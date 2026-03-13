package com.braze.events.internal;

import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.JsonUtils;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.triggers.events.b f27737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.triggers.actions.h f27738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IInAppMessage f27739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f27740d;

    public m(com.braze.triggers.events.b triggerEvent, com.braze.triggers.actions.h triggeredAction, IInAppMessage inAppMessage, String str) {
        AbstractC4862t.e(triggerEvent, "triggerEvent");
        AbstractC4862t.e(triggeredAction, "triggeredAction");
        AbstractC4862t.e(inAppMessage, "inAppMessage");
        this.f27737a = triggerEvent;
        this.f27738b = triggeredAction;
        this.f27739c = inAppMessage;
        this.f27740d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return AbstractC4862t.a(this.f27737a, mVar.f27737a) && AbstractC4862t.a(this.f27738b, mVar.f27738b) && AbstractC4862t.a(this.f27739c, mVar.f27739c) && AbstractC4862t.a(this.f27740d, mVar.f27740d);
    }

    public final int hashCode() {
        int iHashCode = (this.f27739c.hashCode() + ((this.f27738b.hashCode() + (this.f27737a.hashCode() * 31)) * 31)) * 31;
        String str = this.f27740d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return Od.v.n("\n             " + JsonUtils.getPrettyPrintedString(this.f27739c.getJsonKey()) + "\n             Triggered Action Id: " + this.f27738b.c() + "\n             Trigger Event: " + this.f27737a + "\n             User Id: " + this.f27740d + "\n        ");
    }
}
