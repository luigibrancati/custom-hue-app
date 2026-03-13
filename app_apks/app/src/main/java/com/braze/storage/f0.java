package com.braze.storage;

import Rd.M;
import Ud.AbstractC2315g;
import com.braze.support.BrazeLogger;
import fc.AbstractC4036s;
import fc.C4015H;
import k1.AbstractC4785h;
import lc.InterfaceC4988e;
import mc.C5046c;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataStoreProvider f28430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC4785h.a f28431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28432d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(DataStoreProvider dataStoreProvider, AbstractC4785h.a aVar, Object obj, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f28430b = dataStoreProvider;
        this.f28431c = aVar;
        this.f28432d = obj;
    }

    public static final String a(String str) {
        return str;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new f0(this.f28430b, this.f28431c, this.f28432d, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((M) obj, (InterfaceC4988e) obj2)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = C5046c.f();
        int i10 = this.f28429a;
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
            final AbstractC4785h.a aVar = this.f28431c;
            BrazeLogger.brazelog$default(brazeLogger, tag, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.p1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.f0.a(aVar);
                }
            }, 12, (Object) null);
            e0 e0Var = new e0(this.f28430b.getDataStore().getData(), this.f28431c, this.f28432d);
            this.f28429a = 1;
            Object objQ = AbstractC2315g.q(e0Var, this);
            return objQ == objF ? objF : objQ;
        } catch (Exception e10) {
            final String str = "Failed to read data for key: " + this.f28431c.a() + ". Using default value: " + this.f28432d + ".";
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.q1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.f0.a(str);
                }
            }, 8, (Object) null);
            this.f28430b.publishException(str, e10);
            return this.f28432d;
        }
    }

    public static final String a(AbstractC4785h.a aVar) {
        return "Reading data for key: " + aVar.a() + ".";
    }
}
