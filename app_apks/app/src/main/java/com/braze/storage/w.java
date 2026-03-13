package com.braze.storage;

import com.braze.support.BrazeLogger;
import fc.AbstractC4036s;
import fc.C4015H;
import g1.InterfaceC4099i;
import k1.AbstractC4789l;
import lc.InterfaceC4988e;
import mc.C5046c;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class w extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataStoreProvider f28598b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(DataStoreProvider dataStoreProvider, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f28598b = dataStoreProvider;
    }

    public static final String a(String str) {
        return str;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new w(this.f28598b, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return new w(this.f28598b, (InterfaceC4988e) obj2).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = C5046c.f();
        int i10 = this.f28597a;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                return obj;
            }
            AbstractC4036s.b(obj);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.r3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.w.a();
                }
            }, 12, (Object) null);
            InterfaceC4099i dataStore = this.f28598b.getDataStore();
            v vVar = new v(null);
            this.f28597a = 1;
            Object objA = AbstractC4789l.a(dataStore, vVar, this);
            return objA == objF ? objF : objA;
        } catch (Exception e10) {
            final String str = "Failed to clear all data in file.";
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.s3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.w.a(str);
                }
            }, 8, (Object) null);
            this.f28598b.publishException("Failed to clear all data in file.", e10);
            return C4015H.f34254a;
        }
    }

    public static final String a() {
        return "Clearing all data in file.";
    }
}
