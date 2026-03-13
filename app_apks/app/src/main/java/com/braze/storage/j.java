package com.braze.storage;

import Od.F;
import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import de.AbstractC3918a;
import gc.Q;
import he.AbstractC4304b;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.C4847d;
import kotlin.jvm.internal.C4855l;
import kotlin.jvm.internal.C4856m;
import kotlin.jvm.internal.C4861s;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.S;
import kotlin.jvm.internal.T;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1 f28467a;

    public j(Context context, String str, String str2) {
        AbstractC4862t.e(context, "context");
        this.f28467a = new n1(context, str, str2);
    }

    public static final String a(String str, String str2) {
        return "Could not create BrazeEvent from [serialized event string=" + str + ", unique identifier=" + str2 + "] ... Deleting!";
    }

    public static final String c(com.braze.models.k kVar) {
        return "Adding event to storage with uid " + ((com.braze.models.outgoing.event.b) kVar).e();
    }

    public final Collection b() {
        Map linkedHashMap;
        Map mapI;
        ce.b bVarI;
        Object linkedHashMap2;
        Map mapI2;
        ce.b bVarI2;
        String strB;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        n1 n1Var = this.f28467a;
        DataStoreKey dataStoreKey = DataStoreKey.EVENT_STORAGE_MAP;
        DataStoreValueType type = dataStoreKey.getType();
        DataStoreValueType dataStoreValueType = DataStoreValueType.MAP;
        Class cls = Float.TYPE;
        Class cls2 = Double.TYPE;
        Class cls3 = Integer.TYPE;
        Class cls4 = Boolean.TYPE;
        Class cls5 = Long.TYPE;
        String str = "null";
        String str2 = "null cannot be cast to non-null type kotlin.String";
        String str3 = "";
        if (type != dataStoreValueType) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new k0(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object data = n1Var.readData(dataStoreKey, "");
                AbstractC4862t.c(data, "null cannot be cast to non-null type kotlin.String");
                String str4 = (String) data;
                if (F.k0(str4)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (F.k0(str4) || AbstractC4862t.a(F.e1(str4).toString(), "null")) {
                        mapI = Q.i();
                    } else {
                        try {
                            Cc.d dVarB = M.b(String.class);
                            if (AbstractC4862t.a(dVarB, M.b(String.class))) {
                                S s10 = S.f39781a;
                                bVarI = AbstractC3918a.i(AbstractC3918a.G(s10), AbstractC3918a.G(s10));
                            } else if (AbstractC4862t.a(dVarB, M.b(cls5))) {
                                bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.E(kotlin.jvm.internal.w.f39797a));
                            } else if (AbstractC4862t.a(dVarB, M.b(cls4))) {
                                bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.y(C4847d.f39786a));
                            } else if (AbstractC4862t.a(dVarB, M.b(cls3))) {
                                bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.D(C4861s.f39796a));
                            } else if (AbstractC4862t.a(dVarB, M.b(cls2))) {
                                bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.B(C4855l.f39794a));
                            } else if (AbstractC4862t.a(dVarB, M.b(cls))) {
                                bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.C(C4856m.f39795a));
                            } else {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) i.f28456a, 6, (Object) null);
                                mapI = Q.i();
                            }
                            Object objA = AbstractC4304b.f36582d.a(bVarI, str4);
                            AbstractC4862t.c(objA, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                            mapI = (Map) objA;
                        } catch (Exception e10) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) new com.braze.support.f(str4), 4, (Object) null);
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
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            final String str5 = (String) entry.getKey();
            final String str6 = (String) entry.getValue();
            try {
                com.braze.models.k kVarE = com.braze.models.outgoing.event.b.f28071g.e(str6, str5);
                if (kVarE != null) {
                    linkedHashSet.add(kVarE);
                }
            } catch (Exception e12) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.Priority priority = BrazeLogger.Priority.f28625E;
                String str7 = str;
                InterfaceC6082a interfaceC6082a = new InterfaceC6082a() { // from class: r5.D1
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.storage.j.a(str6, str5);
                    }
                };
                String str8 = str2;
                String str9 = str3;
                LinkedHashSet linkedHashSet2 = linkedHashSet;
                Class cls6 = cls;
                Class cls7 = cls2;
                Class cls8 = cls3;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) e12, false, interfaceC6082a, 4, (Object) null);
                n1 n1Var2 = this.f28467a;
                DataStoreKey dataStoreKey2 = DataStoreKey.EVENT_STORAGE_MAP;
                if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
                    BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), priority, (Throwable) null, false, (InterfaceC6082a) new k0(dataStoreKey2), 12, (Object) null);
                    linkedHashMap2 = new LinkedHashMap();
                } else {
                    try {
                        Object data2 = n1Var2.readData(dataStoreKey2, str9);
                        AbstractC4862t.c(data2, str8);
                        String str10 = (String) data2;
                        if (F.k0(str10)) {
                            linkedHashMap2 = new LinkedHashMap();
                        } else {
                            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                            if (F.k0(str10) || AbstractC4862t.a(F.e1(str10).toString(), str7)) {
                                mapI2 = Q.i();
                            } else {
                                try {
                                    Cc.d dVarB2 = M.b(String.class);
                                    if (AbstractC4862t.a(dVarB2, M.b(String.class))) {
                                        S s11 = S.f39781a;
                                        bVarI2 = AbstractC3918a.i(AbstractC3918a.G(s11), AbstractC3918a.G(s11));
                                    } else if (AbstractC4862t.a(dVarB2, M.b(cls5))) {
                                        bVarI2 = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.E(kotlin.jvm.internal.w.f39797a));
                                    } else if (AbstractC4862t.a(dVarB2, M.b(cls4))) {
                                        bVarI2 = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.y(C4847d.f39786a));
                                    } else if (AbstractC4862t.a(dVarB2, M.b(cls8))) {
                                        bVarI2 = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.D(C4861s.f39796a));
                                    } else if (AbstractC4862t.a(dVarB2, M.b(cls7))) {
                                        bVarI2 = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.B(C4855l.f39794a));
                                    } else if (AbstractC4862t.a(dVarB2, M.b(cls6))) {
                                        bVarI2 = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.C(C4856m.f39795a));
                                    } else {
                                        BrazeLogger.brazelog$default(brazeLogger, (Object) dataStoreUtils2, priority, (Throwable) null, false, (InterfaceC6082a) g.f28436a, 6, (Object) null);
                                        mapI2 = Q.i();
                                    }
                                    Object objA2 = AbstractC4304b.f36582d.a(bVarI2, str10);
                                    AbstractC4862t.c(objA2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                                    mapI2 = (Map) objA2;
                                } catch (Exception e13) {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.f28625E, (Throwable) e13, false, (InterfaceC6082a) new com.braze.support.f(str10), 4, (Object) null);
                                    mapI2 = Q.i();
                                }
                            }
                            Map mapW2 = Q.w(mapI2);
                            AbstractC4862t.c(mapW2, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                            linkedHashMap2 = T.c(mapW2);
                        }
                    } catch (Exception e14) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e14, false, (InterfaceC6082a) new l0(dataStoreKey2), 8, (Object) null);
                        linkedHashMap2 = new LinkedHashMap();
                    }
                }
                Object obj = linkedHashMap2;
                T.c(obj).remove(str5);
                n1 n1Var3 = this.f28467a;
                DataStoreKey dataStoreKey3 = DataStoreKey.EVENT_STORAGE_MAP;
                if (dataStoreKey3.getType() != DataStoreValueType.MAP) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new q0(dataStoreKey3), 12, (Object) null);
                } else {
                    try {
                        DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                        try {
                            AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                            aVar.d();
                            ge.w0 w0Var = ge.w0.f35762a;
                            strB = aVar.b(new ge.M(w0Var, w0Var), obj);
                        } catch (Exception e15) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.f28625E, (Throwable) e15, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                            strB = "{}";
                            if (obj == null && (obj instanceof List)) {
                                strB = "[]";
                            }
                        }
                        n1Var3.writeData(dataStoreKey3, strB);
                    } catch (Exception e16) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e16, false, (InterfaceC6082a) new r0(dataStoreKey3), 8, (Object) null);
                        str = str7;
                        str2 = str8;
                        str3 = str9;
                        linkedHashSet = linkedHashSet2;
                        cls = cls6;
                        cls2 = cls7;
                        cls3 = cls8;
                    }
                }
                str = str7;
                str2 = str8;
                str3 = str9;
                linkedHashSet = linkedHashSet2;
                cls = cls6;
                cls2 = cls7;
                cls3 = cls8;
            }
        }
        return linkedHashSet;
    }

    public final void a(final com.braze.models.k event) {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map mapI;
        Cc.d dVarB;
        ce.b bVarI;
        String strB;
        AbstractC4862t.e(event, "event");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.E1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.j.c(event);
            }
        }, 7, (Object) null);
        n1 n1Var = this.f28467a;
        DataStoreKey dataStoreKey = DataStoreKey.EVENT_STORAGE_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new k0(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object data = n1Var.readData(dataStoreKey, "");
                AbstractC4862t.c(data, "null cannot be cast to non-null type kotlin.String");
                String str = (String) data;
                if (F.k0(str)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    if (F.k0(str) || AbstractC4862t.a(F.e1(str).toString(), "null")) {
                        mapI = Q.i();
                    } else {
                        try {
                            dVarB = M.b(String.class);
                            try {
                            } catch (Exception e10) {
                                exc = e10;
                                dataStoreUtils = dataStoreUtils2;
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) exc, false, (InterfaceC6082a) new com.braze.support.f(str), 4, (Object) null);
                                mapI = Q.i();
                            }
                        } catch (Exception e11) {
                            e = e11;
                            dataStoreUtils = dataStoreUtils2;
                        }
                        if (AbstractC4862t.a(dVarB, M.b(String.class))) {
                            S s10 = S.f39781a;
                            bVarI = AbstractC3918a.i(AbstractC3918a.G(s10), AbstractC3918a.G(s10));
                        } else if (AbstractC4862t.a(dVarB, M.b(Long.TYPE))) {
                            bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.E(kotlin.jvm.internal.w.f39797a));
                        } else if (AbstractC4862t.a(dVarB, M.b(Boolean.TYPE))) {
                            bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.y(C4847d.f39786a));
                        } else if (AbstractC4862t.a(dVarB, M.b(Integer.TYPE))) {
                            bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.D(C4861s.f39796a));
                        } else if (AbstractC4862t.a(dVarB, M.b(Double.TYPE))) {
                            bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.B(C4855l.f39794a));
                        } else {
                            if (AbstractC4862t.a(dVarB, M.b(Float.TYPE))) {
                                bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.C(C4856m.f39795a));
                            } else {
                                BrazeLogger.brazelog$default(brazeLogger, (Object) dataStoreUtils2, BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) f.f28428a, 6, (Object) null);
                                dataStoreUtils = dataStoreUtils2;
                                try {
                                    mapI = Q.i();
                                } catch (Exception e12) {
                                    e = e12;
                                    exc = e;
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) exc, false, (InterfaceC6082a) new com.braze.support.f(str), 4, (Object) null);
                                    mapI = Q.i();
                                }
                            }
                            exc = e;
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) exc, false, (InterfaceC6082a) new com.braze.support.f(str), 4, (Object) null);
                            mapI = Q.i();
                        }
                        Object objA = AbstractC4304b.f36582d.a(bVarI, str);
                        AbstractC4862t.c(objA, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                        mapI = (Map) objA;
                    }
                    Map mapW = Q.w(mapI);
                    AbstractC4862t.c(mapW, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                    linkedHashMap = T.c(mapW);
                }
            } catch (Exception e13) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e13, false, (InterfaceC6082a) new l0(dataStoreKey), 8, (Object) null);
                linkedHashMap = new LinkedHashMap();
            }
        }
        com.braze.models.outgoing.event.b bVar = (com.braze.models.outgoing.event.b) event;
        linkedHashMap.put(bVar.e(), bVar.a());
        n1 n1Var2 = this.f28467a;
        DataStoreKey dataStoreKey2 = DataStoreKey.EVENT_STORAGE_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new q0(dataStoreKey2), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
            try {
                AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                aVar.d();
                ge.w0 w0Var = ge.w0.f35762a;
                strB = aVar.b(new ge.M(w0Var, w0Var), linkedHashMap);
            } catch (Exception e14) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.f28625E, (Throwable) e14, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                strB = "{}";
            }
            n1Var2.writeData(dataStoreKey2, strB);
        } catch (Exception e15) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e15, false, (InterfaceC6082a) new r0(dataStoreKey2), 8, (Object) null);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(Set events) {
        Map linkedHashMap;
        Map mapI;
        ce.b bVarI;
        String strB;
        AbstractC4862t.e(events, "events");
        n1 n1Var = this.f28467a;
        DataStoreKey dataStoreKey = DataStoreKey.EVENT_STORAGE_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new k0(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object data = n1Var.readData(dataStoreKey, "");
                AbstractC4862t.c(data, "null cannot be cast to non-null type kotlin.String");
                String str = (String) data;
                if (F.k0(str)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (F.k0(str) || AbstractC4862t.a(F.e1(str).toString(), "null")) {
                        mapI = Q.i();
                    } else {
                        try {
                            Cc.d dVarB = M.b(String.class);
                            if (AbstractC4862t.a(dVarB, M.b(String.class))) {
                                S s10 = S.f39781a;
                                bVarI = AbstractC3918a.i(AbstractC3918a.G(s10), AbstractC3918a.G(s10));
                            } else if (AbstractC4862t.a(dVarB, M.b(Long.TYPE))) {
                                bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.E(kotlin.jvm.internal.w.f39797a));
                            } else if (AbstractC4862t.a(dVarB, M.b(Boolean.TYPE))) {
                                bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.y(C4847d.f39786a));
                            } else if (AbstractC4862t.a(dVarB, M.b(Integer.TYPE))) {
                                bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.D(C4861s.f39796a));
                            } else if (AbstractC4862t.a(dVarB, M.b(Double.TYPE))) {
                                bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.B(C4855l.f39794a));
                            } else if (AbstractC4862t.a(dVarB, M.b(Float.TYPE))) {
                                bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.C(C4856m.f39795a));
                            } else {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) h.f28448a, 6, (Object) null);
                                mapI = Q.i();
                            }
                            Object objA = AbstractC4304b.f36582d.a(bVarI, str);
                            AbstractC4862t.c(objA, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                            mapI = (Map) objA;
                        } catch (Exception e10) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) new com.braze.support.f(str), 4, (Object) null);
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
        Map map = linkedHashMap;
        Iterator it = events.iterator();
        while (it.hasNext()) {
            final String strE = ((com.braze.models.outgoing.event.b) ((com.braze.models.k) it.next())).e();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.F1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.j.a(strE);
                }
            }, 7, (Object) null);
            map.remove(strE);
        }
        n1 n1Var2 = this.f28467a;
        DataStoreKey dataStoreKey2 = DataStoreKey.EVENT_STORAGE_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new q0(dataStoreKey2), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            try {
                AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                aVar.d();
                ge.w0 w0Var = ge.w0.f35762a;
                strB = aVar.b(new ge.M(w0Var, w0Var), map);
            } catch (Exception e12) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.f28625E, (Throwable) e12, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                strB = "{}";
                if (map == null && (map instanceof List)) {
                    strB = "[]";
                }
            }
            n1Var2.writeData(dataStoreKey2, strB);
        } catch (Exception e13) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e13, false, (InterfaceC6082a) new r0(dataStoreKey2), 8, (Object) null);
        }
    }

    public static final String a(String str) {
        return "Deleting event from storage with uid " + str;
    }
}
