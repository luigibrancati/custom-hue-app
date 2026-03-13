package com.braze.storage;

import Ud.AbstractC2315g;
import com.braze.support.BrazeLogger;
import fc.AbstractC4036s;
import fc.C4015H;
import k1.AbstractC4785h;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5158b;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataStoreProvider f28385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC4785h.a f28386c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(DataStoreProvider dataStoreProvider, AbstractC4785h.a aVar, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f28385b = dataStoreProvider;
        this.f28386c = aVar;
    }

    public static final String a(String str) {
        return str;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new a0(this.f28385b, this.f28386c, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return new a0(this.f28385b, this.f28386c, (InterfaceC4988e) obj2).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = C5046c.f();
        int i10 = this.f28384a;
        boolean z10 = false;
        try {
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                String tag = DataStoreProvider.INSTANCE.getTAG();
                BrazeLogger.Priority priority = BrazeLogger.Priority.f28627V;
                final AbstractC4785h.a aVar = this.f28386c;
                BrazeLogger.brazelog$default(brazeLogger, tag, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.E0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.storage.a0.a(aVar);
                    }
                }, 12, (Object) null);
                z zVar = new z(this.f28385b.getDataStore().getData(), this.f28386c);
                this.f28384a = 1;
                obj = AbstractC2315g.r(zVar, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            if (obj != null) {
                z10 = true;
            }
        } catch (Exception e10) {
            final String str = "Failed to check if data store contains key: " + this.f28386c.a() + ". Using default value: false.";
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.F0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.a0.a(str);
                }
            }, 8, (Object) null);
            this.f28385b.publishException(str, e10);
        }
        return AbstractC5158b.a(z10);
    }

    public static final String a(AbstractC4785h.a aVar) {
        return "Checking if data store contains data for key: " + aVar.a() + ".";
    }
}
