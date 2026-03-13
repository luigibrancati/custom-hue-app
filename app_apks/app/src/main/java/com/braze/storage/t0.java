package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DelayedInitializationAnalyticsBehavior;
import com.braze.support.BrazeLogger;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f28571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f28572b;

    public t0(Context context) {
        AbstractC4862t.e(context, "context");
        this.f28571a = new s0(context);
        this.f28572b = new CopyOnWriteArrayList();
    }

    public static final String a(boolean z10) {
        return "Setting delayed initialization enabled to: " + z10;
    }

    public final void b(final boolean z10) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.Z2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.t0.a(z10);
            }
        }, 6, (Object) null);
        this.f28571a.writeData(DataStoreKey.DELAYED_INIT_ENABLED, Boolean.valueOf(z10));
    }

    public final boolean c() {
        return AbstractC4862t.a(this.f28571a.readBoolean(DataStoreKey.DELAYED_INIT_ENABLED, Boolean.FALSE), Boolean.TRUE);
    }

    public static final String a(DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) {
        return "Setting delayed initialization analytics behavior to: " + delayedInitializationAnalyticsBehavior.getValue();
    }

    public final void c(final DelayedInitializationAnalyticsBehavior analyticsBehavior) {
        AbstractC4862t.e(analyticsBehavior, "analyticsBehavior");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.Y2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.t0.a(analyticsBehavior);
            }
        }, 6, (Object) null);
        this.f28571a.writeData(DataStoreKey.DELAYED_INIT_ANALYTICS_BEHAVIOR_FLAG, analyticsBehavior.getValue());
    }

    public static final String b() {
        return "Enqueuing push analytics event";
    }

    public final void a(com.braze.models.k pushEvent) {
        AbstractC4862t.e(pushEvent, "pushEvent");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.a3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.t0.b();
            }
        }, 6, (Object) null);
        if (DelayedInitializationAnalyticsBehavior.INSTANCE.fromString(this.f28571a.readString(DataStoreKey.DELAYED_INIT_ANALYTICS_BEHAVIOR_FLAG, "")) == DelayedInitializationAnalyticsBehavior.QUEUE) {
            this.f28572b.add(pushEvent);
        }
    }
}
