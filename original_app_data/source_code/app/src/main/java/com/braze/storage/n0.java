package com.braze.storage;

import Rd.M;
import com.braze.support.BrazeLogger;
import fc.AbstractC4036s;
import fc.C4015H;
import g1.InterfaceC4099i;
import k1.AbstractC4785h;
import k1.AbstractC4789l;
import lc.InterfaceC4988e;
import mc.C5046c;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataStoreProvider f28500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC4785h.a f28502d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(DataStoreProvider dataStoreProvider, Object obj, AbstractC4785h.a aVar, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f28500b = dataStoreProvider;
        this.f28501c = obj;
        this.f28502d = aVar;
    }

    public static final String a(String str) {
        return str;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new n0(this.f28500b, this.f28501c, this.f28502d, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((n0) create((M) obj, (InterfaceC4988e) obj2)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = C5046c.f();
        int i10 = this.f28499a;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                return obj;
            }
            AbstractC4036s.b(obj);
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            String tag = DataStoreProvider.INSTANCE.getTAG();
            BrazeLogger.Priority priority = BrazeLogger.Priority.f28627V;
            final Object obj2 = this.f28501c;
            final AbstractC4785h.a aVar = this.f28502d;
            BrazeLogger.brazelog$default(brazeLogger, tag, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.V1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.n0.a(obj2, aVar);
                }
            }, 12, (Object) null);
            InterfaceC4099i dataStore = this.f28500b.getDataStore();
            m0 m0Var = new m0(this.f28502d, this.f28501c, null);
            this.f28499a = 1;
            Object objA = AbstractC4789l.a(dataStore, m0Var, this);
            return objA == objF ? objF : objA;
        } catch (Exception e10) {
            final String str = "Failed to write data:" + this.f28501c + " for key: " + this.f28502d.a() + ".";
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.W1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.n0.a(str);
                }
            }, 8, (Object) null);
            this.f28500b.publishException(str, e10);
            return C4015H.f34254a;
        }
    }

    public static final String a(Object obj, AbstractC4785h.a aVar) {
        return "Writing data:" + obj + " for key: " + aVar.a() + ".";
    }
}
