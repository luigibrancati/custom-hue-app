package com.hiennv.flutter_callkit_incoming;

import android.app.Notification;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/hiennv/flutter_callkit_incoming/CallkitNotification;", "", "id", "", "notification", "Landroid/app/Notification;", "<init>", "(ILandroid/app/Notification;)V", "getId", "()I", "getNotification", "()Landroid/app/Notification;", "component1", "component2", "copy", "equals", "", Request.JsonKeys.OTHER, "hashCode", "toString", "", "flutter_callkit_incoming_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CallkitNotification {
    private final int id;
    private final Notification notification;

    public CallkitNotification(int i10, Notification notification) {
        AbstractC4862t.e(notification, "notification");
        this.id = i10;
        this.notification = notification;
    }

    public static /* synthetic */ CallkitNotification copy$default(CallkitNotification callkitNotification, int i10, Notification notification, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = callkitNotification.id;
        }
        if ((i11 & 2) != 0) {
            notification = callkitNotification.notification;
        }
        return callkitNotification.copy(i10, notification);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Notification getNotification() {
        return this.notification;
    }

    public final CallkitNotification copy(int id2, Notification notification) {
        AbstractC4862t.e(notification, "notification");
        return new CallkitNotification(id2, notification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallkitNotification)) {
            return false;
        }
        CallkitNotification callkitNotification = (CallkitNotification) other;
        return this.id == callkitNotification.id && AbstractC4862t.a(this.notification, callkitNotification.notification);
    }

    public final int getId() {
        return this.id;
    }

    public final Notification getNotification() {
        return this.notification;
    }

    public int hashCode() {
        return (Integer.hashCode(this.id) * 31) + this.notification.hashCode();
    }

    public String toString() {
        return "CallkitNotification(id=" + this.id + ", notification=" + this.notification + ')';
    }
}
