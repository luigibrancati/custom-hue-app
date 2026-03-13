package com.braze.storage;

import Od.F;
import Rd.AbstractC2130h;
import ae.AbstractC2693g;
import ae.InterfaceC2687a;
import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import de.AbstractC3918a;
import ge.M;
import ge.Q;
import he.AbstractC4304b;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.C4847d;
import kotlin.jvm.internal.C4855l;
import kotlin.jvm.internal.C4856m;
import kotlin.jvm.internal.C4861s;
import kotlin.jvm.internal.S;
import kotlin.jvm.internal.T;
import org.json.JSONException;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f28562c = TimeUnit.DAYS.toMillis(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u1 f28563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2687a f28564b;

    public s1(Context context, String str, String apiKey) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(apiKey, "apiKey");
        this.f28563a = new u1(context, str, apiKey);
        this.f28564b = AbstractC2693g.b(false, 1, null);
        b();
    }

    public static final String b(com.braze.models.k kVar) {
        return "Event already seen in cache. Ignoring duplicate: " + kVar;
    }

    public final boolean a(final com.braze.models.k event) throws JSONException {
        AbstractC4862t.e(event, "event");
        if (((com.braze.models.outgoing.event.b) event).f28073a != com.braze.enums.d.f27634h) {
            return true;
        }
        b();
        String eventKey = o1.a(event);
        if (a().containsKey(eventKey)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.V2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.s1.b(event);
                }
            }, 7, (Object) null);
            return false;
        }
        long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds() + f28562c;
        AbstractC4862t.e(eventKey, "eventKey");
        AbstractC2130h.b(null, new p1(this, eventKey, jNowInMilliseconds, null), 1, null);
        return true;
    }

    public final void b() {
        long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        for (final Map.Entry entry : a().entrySet()) {
            try {
                if (jNowInMilliseconds >= ((Number) entry.getValue()).longValue()) {
                    AbstractC2130h.b(null, new q1(this, (String) entry.getKey(), null), 1, null);
                }
            } catch (Exception e10) {
                s1 s1Var = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) s1Var, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.W2
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.storage.s1.a(entry);
                    }
                }, 4, (Object) null);
                AbstractC2130h.b(null, new q1(s1Var, (String) entry.getKey(), null), 1, null);
                this = s1Var;
            }
        }
    }

    public static final void a(s1 s1Var, Map map) {
        String strB;
        u1 u1Var = s1Var.f28563a;
        DataStoreKey dataStoreKey = DataStoreKey.EVENT_DUPLICATION_VALIDATION_STORAGE_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new q0(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                aVar.d();
                strB = aVar.b(new M(ge.w0.f35762a, Q.f35675a), map);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                strB = "{}";
            }
            u1Var.writeData(dataStoreKey, strB);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new r0(dataStoreKey), 8, (Object) null);
        }
    }

    public final Map a() {
        Map mapI;
        ce.b bVarI;
        u1 u1Var = this.f28563a;
        DataStoreKey dataStoreKey = DataStoreKey.EVENT_DUPLICATION_VALIDATION_STORAGE_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new k0(dataStoreKey), 12, (Object) null);
            return new LinkedHashMap();
        }
        try {
            Object data = u1Var.readData(dataStoreKey, "");
            AbstractC4862t.c(data, "null cannot be cast to non-null type kotlin.String");
            String str = (String) data;
            if (F.k0(str)) {
                return new LinkedHashMap();
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            if (F.k0(str) || AbstractC4862t.a(F.e1(str).toString(), "null")) {
                mapI = gc.Q.i();
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
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) r1.f28554a, 6, (Object) null);
                        mapI = gc.Q.i();
                    }
                    Object objA = AbstractC4304b.f36582d.a(bVarI, str);
                    AbstractC4862t.c(objA, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                    mapI = (Map) objA;
                } catch (Exception e10) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) new com.braze.support.f(str), 4, (Object) null);
                    mapI = gc.Q.i();
                }
            }
            Map mapW = gc.Q.w(mapI);
            AbstractC4862t.c(mapW, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
            return T.c(mapW);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new l0(dataStoreKey), 8, (Object) null);
            return new LinkedHashMap();
        }
    }

    public static final String a(Map.Entry entry) {
        return "Failed to get expiration time. Deleting entry: " + entry;
    }
}
