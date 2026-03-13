package com.braze.triggers.managers;

import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final boolean a(com.braze.triggers.events.b triggerEvent, com.braze.triggers.actions.g action, long j10, final long j11) {
        long j12;
        AbstractC4862t.e(triggerEvent, "triggerEvent");
        AbstractC4862t.e(action, "action");
        if (triggerEvent instanceof com.braze.triggers.events.h) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.B
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.managers.c.a();
                }
            }, 7, (Object) null);
            return true;
        }
        long jNowInSeconds = DateTimeUtils.nowInSeconds();
        com.braze.triggers.config.c cVar = action.f28670b;
        final long j13 = jNowInSeconds + ((long) cVar.f28697d);
        final int i10 = cVar.f28700g;
        if (i10 != -1) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.C
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.managers.c.a(i10);
                }
            }, 7, (Object) null);
            j12 = j10 + ((long) i10);
        } else {
            j12 = j10 + j11;
        }
        final long j14 = j12;
        if (j13 >= j14) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.D
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.managers.c.a(j13, j14);
                }
            }, 6, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.E
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.triggers.managers.c.a(j11, j14, j13);
            }
        }, 6, (Object) null);
        return false;
    }

    public static final String a() {
        return "Ignoring minimum time interval between triggered actions because the trigger event is a test.";
    }

    public static final String a(int i10) {
        return "Using override minimum display interval: " + i10;
    }

    public static final String a(long j10, long j11) {
        return "Minimum time interval requirement met for matched trigger. Action display time: " + j10 + " . Next viable display time: " + j11;
    }

    public static final String a(long j10, long j11, long j12) {
        return "Minimum time interval requirement and triggered action override time interval requirement of " + j10 + " not met for matched trigger. Returning null. Next viable display time: " + j11 + ". Action display time: " + j12;
    }
}
