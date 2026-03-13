package com.braze.storage;

import Od.F;
import Rd.M;
import ae.InterfaceC2687a;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import de.AbstractC3918a;
import fc.AbstractC4036s;
import fc.C4015H;
import gc.Q;
import he.AbstractC4304b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.C4847d;
import kotlin.jvm.internal.C4855l;
import kotlin.jvm.internal.C4856m;
import kotlin.jvm.internal.C4861s;
import kotlin.jvm.internal.S;
import kotlin.jvm.internal.T;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5158b;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC2687a f28458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j1 f28459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f28460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f28461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j1 f28463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f28464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f28465h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(j1 j1Var, String str, long j10, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f28463f = j1Var;
        this.f28464g = str;
        this.f28465h = j10;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new i1(this.f28463f, this.f28464g, this.f28465h, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i1) create((M) obj, (InterfaceC4988e) obj2)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC2687a interfaceC2687a;
        j1 j1Var;
        long j10;
        String str;
        Map linkedHashMap;
        Map mapI;
        ce.b bVarI;
        String strB;
        Object objF = C5046c.f();
        int i10 = this.f28462e;
        if (i10 == 0) {
            AbstractC4036s.b(obj);
            interfaceC2687a = this.f28463f.f28470a;
            j1Var = this.f28463f;
            String str2 = this.f28464g;
            j10 = this.f28465h;
            this.f28458a = interfaceC2687a;
            this.f28459b = j1Var;
            this.f28460c = str2;
            this.f28461d = j10;
            this.f28462e = 1;
            if (interfaceC2687a.a(null, this) == objF) {
                return objF;
            }
            str = str2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j11 = this.f28461d;
            str = this.f28460c;
            j1Var = this.f28459b;
            InterfaceC2687a interfaceC2687a2 = this.f28458a;
            AbstractC4036s.b(obj);
            j10 = j11;
            interfaceC2687a = interfaceC2687a2;
        }
        try {
            DataStoreKey dataStoreKey = DataStoreKey.ENDPOINT_LAST_REQUEST_MAP;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new k0(dataStoreKey), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object data = j1Var.readData(dataStoreKey, "");
                    AbstractC4862t.c(data, "null cannot be cast to non-null type kotlin.String");
                    String str3 = (String) data;
                    if (F.k0(str3)) {
                        linkedHashMap = new LinkedHashMap();
                    } else {
                        DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                        if (F.k0(str3) || AbstractC4862t.a(F.e1(str3).toString(), "null")) {
                            mapI = Q.i();
                        } else {
                            try {
                                Cc.d dVarB = kotlin.jvm.internal.M.b(Long.class);
                                if (AbstractC4862t.a(dVarB, kotlin.jvm.internal.M.b(String.class))) {
                                    S s10 = S.f39781a;
                                    bVarI = AbstractC3918a.i(AbstractC3918a.G(s10), AbstractC3918a.G(s10));
                                } else if (AbstractC4862t.a(dVarB, kotlin.jvm.internal.M.b(Long.TYPE))) {
                                    bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.E(kotlin.jvm.internal.w.f39797a));
                                } else if (AbstractC4862t.a(dVarB, kotlin.jvm.internal.M.b(Boolean.TYPE))) {
                                    bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.y(C4847d.f39786a));
                                } else if (AbstractC4862t.a(dVarB, kotlin.jvm.internal.M.b(Integer.TYPE))) {
                                    bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.D(C4861s.f39796a));
                                } else if (AbstractC4862t.a(dVarB, kotlin.jvm.internal.M.b(Double.TYPE))) {
                                    bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.B(C4855l.f39794a));
                                } else if (AbstractC4862t.a(dVarB, kotlin.jvm.internal.M.b(Float.TYPE))) {
                                    bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.C(C4856m.f39795a));
                                } else {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) h1.f28450a, 6, (Object) null);
                                    mapI = Q.i();
                                }
                                Object objA = AbstractC4304b.f36582d.a(bVarI, str3);
                                AbstractC4862t.c(objA, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                                mapI = (Map) objA;
                            } catch (Exception e10) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) new com.braze.support.f(str3), 4, (Object) null);
                                mapI = Q.i();
                            }
                        }
                        Map mapW = Q.w(mapI);
                        AbstractC4862t.c(mapW, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                        linkedHashMap = T.c(mapW);
                    }
                } catch (Exception e11) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new l0(dataStoreKey), 8, (Object) null);
                    linkedHashMap = new LinkedHashMap();
                }
            }
            linkedHashMap.put(str, AbstractC5158b.d(j10));
            DataStoreKey dataStoreKey2 = DataStoreKey.ENDPOINT_LAST_REQUEST_MAP;
            if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new q0(dataStoreKey2), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    try {
                        AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                        aVar.d();
                        strB = aVar.b(new ge.M(ge.w0.f35762a, ge.Q.f35675a), linkedHashMap);
                    } catch (Exception e12) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.f28625E, (Throwable) e12, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                        strB = "{}";
                    }
                    j1Var.writeData(dataStoreKey2, strB);
                } catch (Exception e13) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e13, false, (InterfaceC6082a) new r0(dataStoreKey2), 8, (Object) null);
                }
            }
            return C4015H.f34254a;
        } finally {
            interfaceC2687a.h(null);
        }
    }
}
