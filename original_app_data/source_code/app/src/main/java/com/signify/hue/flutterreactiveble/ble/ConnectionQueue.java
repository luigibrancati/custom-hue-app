package com.signify.hue.flutterreactiveble.ble;

import dc.C3890a;
import gc.C4179C;
import gc.C4206t;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\rR.\u0010\u0012\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/signify/hue/flutterreactiveble/ble/ConnectionQueue;", "", "<init>", "()V", "Ldc/a;", "", "", "kotlin.jvm.PlatformType", "observeQueue", "()Ldc/a;", "deviceId", "Lfc/H;", "addToQueue", "(Ljava/lang/String;)V", "getCurrentQueue$reactive_ble_mobile_release", "()Ljava/util/List;", "getCurrentQueue", "removeFromQueue", "queueSubject", "Ldc/a;", "reactive_ble_mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConnectionQueue {
    private final C3890a queueSubject;

    public ConnectionQueue() {
        C3890a c3890aR0 = C3890a.R0(C4206t.k());
        AbstractC4862t.d(c3890aR0, "createDefault(...)");
        this.queueSubject = c3890aR0;
    }

    public final void addToQueue(String deviceId) {
        List list;
        AbstractC4862t.e(deviceId, "deviceId");
        List list2 = (List) this.queueSubject.S0();
        Object obj = null;
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (AbstractC4862t.a((String) next, deviceId)) {
                    obj = next;
                    break;
                }
            }
            obj = (String) obj;
        }
        if (obj != null || (list = (List) this.queueSubject.S0()) == null) {
            return;
        }
        List listX0 = C4179C.X0(list);
        listX0.add(deviceId);
        this.queueSubject.c(listX0);
    }

    public final List<String> getCurrentQueue$reactive_ble_mobile_release() {
        return (List) this.queueSubject.S0();
    }

    /* JADX INFO: renamed from: observeQueue, reason: from getter */
    public final C3890a getQueueSubject() {
        return this.queueSubject;
    }

    public final void removeFromQueue(String deviceId) {
        AbstractC4862t.e(deviceId, "deviceId");
        List list = (List) this.queueSubject.S0();
        if (list != null) {
            List listX0 = C4179C.X0(list);
            listX0.remove(deviceId);
            this.queueSubject.c(listX0);
        }
    }
}
