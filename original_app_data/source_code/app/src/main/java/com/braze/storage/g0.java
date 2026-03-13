package com.braze.storage;

import Ud.AbstractC2315g;
import Ud.InterfaceC2313e;
import com.braze.support.BrazeLogger;
import fc.AbstractC4036s;
import fc.C4015H;
import gc.Q;
import k1.AbstractC4785h;
import lc.InterfaceC4988e;
import mc.C5046c;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataStoreProvider f28438b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(DataStoreProvider dataStoreProvider, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f28438b = dataStoreProvider;
    }

    public static final String a(String str) {
        return str;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new g0(this.f28438b, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return new g0(this.f28438b, (InterfaceC4988e) obj2).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = C5046c.f();
        int i10 = this.f28437a;
        try {
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.r1
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.storage.g0.a();
                    }
                }, 12, (Object) null);
                InterfaceC2313e data = this.f28438b.getDataStore().getData();
                this.f28437a = 1;
                obj = AbstractC2315g.q(data, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            return ((AbstractC4785h) obj).a();
        } catch (Exception e10) {
            final String str = "Failed to read all data from DataStore";
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.s1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.g0.a(str);
                }
            }, 8, (Object) null);
            this.f28438b.publishException("Failed to read all data from DataStore", e10);
            return Q.i();
        }
    }

    public static final String a() {
        return "Reading all data from DataStore.";
    }
}
