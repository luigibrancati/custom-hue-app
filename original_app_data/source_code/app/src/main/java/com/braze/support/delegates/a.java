package com.braze.support.delegates;

import Cc.l;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;
import yc.InterfaceC6462d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a implements InterfaceC6462d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f28635a;

    public static final String a(Object obj, l lVar) {
        return "Cannot assign " + obj + " to only-set-once property " + lVar.getName();
    }

    @Override // yc.InterfaceC6462d, yc.InterfaceC6461c
    public final Object getValue(Object thisRef, l property) {
        AbstractC4862t.e(thisRef, "thisRef");
        AbstractC4862t.e(property, "property");
        return this.f28635a;
    }

    @Override // yc.InterfaceC6462d
    public final void setValue(Object thisRef, final l property, final Object obj) {
        AbstractC4862t.e(thisRef, "thisRef");
        AbstractC4862t.e(property, "property");
        Object obj2 = this.f28635a;
        if (obj2 == null) {
            this.f28635a = obj;
        } else {
            if (AbstractC4862t.a(obj2, obj)) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: t5.a
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.support.delegates.a.a(obj, property);
                }
            }, 7, (Object) null);
        }
    }
}
