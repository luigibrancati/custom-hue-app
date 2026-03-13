package com.braze.storage;

import Rd.M;
import com.braze.support.BrazeLogger;
import fc.AbstractC4036s;
import fc.C4015H;
import g1.InterfaceC4099i;
import java.util.Map;
import java.util.Set;
import k1.AbstractC4789l;
import lc.InterfaceC4988e;
import mc.C5046c;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class s extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataStoreProvider f28558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f28559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Set f28560d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(DataStoreProvider dataStoreProvider, Map map, Set set, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f28558b = dataStoreProvider;
        this.f28559c = map;
        this.f28560d = set;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new s(this.f28558b, this.f28559c, this.f28560d, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((M) obj, (InterfaceC4988e) obj2)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = C5046c.f();
        int i10 = this.f28557a;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                return obj;
            }
            AbstractC4036s.b(obj);
            InterfaceC4099i dataStore = this.f28558b.getDataStore();
            r rVar = new r(this.f28560d, this.f28559c, null);
            this.f28557a = 1;
            Object objA = AbstractC4789l.a(dataStore, rVar, this);
            return objA == objF ? objF : objA;
        } catch (Exception e10) {
            final String str = "Failed to perform batch update with updates:" + this.f28559c + " and removals:" + this.f28560d;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.U2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.s.a(str);
                }
            }, 8, (Object) null);
            this.f28558b.publishException(str, e10);
            return C4015H.f34254a;
        }
    }

    public static final String a(String str) {
        return str;
    }
}
