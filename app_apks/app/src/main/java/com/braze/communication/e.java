package com.braze.communication;

import Od.v;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.q;
import fc.C4029l;
import fc.InterfaceC4028k;
import gc.C4179C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f27563a;

    public e(b httpConnector) {
        AbstractC4862t.e(httpConnector, "httpConnector");
        this.f27563a = httpConnector;
    }

    public static final String b() {
        return "Exception while logging result: ";
    }

    public final d a(final com.braze.requests.util.d requestTarget, final HashMap requestHeaders, final JSONObject payload) {
        AbstractC4862t.e(requestTarget, "requestTarget");
        AbstractC4862t.e(requestHeaders, "requestHeaders");
        AbstractC4862t.e(payload, "payload");
        InterfaceC4028k interfaceC4028kB = C4029l.b(new InterfaceC6082a() { // from class: T4.f
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.communication.e.a(requestTarget, requestHeaders, payload);
            }
        });
        a(requestTarget, requestHeaders, interfaceC4028kB, payload);
        long jCurrentTimeMillis = System.currentTimeMillis();
        d dVarA = this.f27563a.a(requestTarget, requestHeaders, payload);
        a(interfaceC4028kB, requestTarget, dVarA.f27522b, dVarA.f27523c, System.currentTimeMillis() - jCurrentTimeMillis);
        return dVarA;
    }

    public static final String a(com.braze.requests.util.d dVar, Map map, JSONObject jSONObject) {
        Object[] requestArgs = {dVar, map, jSONObject};
        String str = q.f28646a;
        AbstractC4862t.e(requestArgs, "requestArgs");
        long jHashCode = 1;
        for (int i10 = 0; i10 < 3; i10++) {
            jHashCode *= (long) requestArgs[i10].hashCode();
        }
        String hexString = Long.toHexString(jHashCode);
        AbstractC4862t.d(hexString, "toHexString(...)");
        return hexString;
    }

    public final void a(final com.braze.requests.util.d dVar, final HashMap map, final InterfaceC4028k interfaceC4028k, final JSONObject jSONObject) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, dVar.f28350d, new InterfaceC6082a() { // from class: T4.b
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.communication.e.a(interfaceC4028k, dVar, this, map, jSONObject);
                }
            }, 3, (Object) null);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: T4.c
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.communication.e.a();
                }
            }, 4, (Object) null);
        }
    }

    public static final String a(InterfaceC4028k interfaceC4028k, com.braze.requests.util.d dVar, e eVar, Map map, JSONObject jSONObject) {
        String str;
        Object value = interfaceC4028k.getValue();
        eVar.getClass();
        String strA = a(map);
        if (jSONObject == null) {
            str = "";
        } else {
            str = "and JSON :\n" + JsonUtils.getPrettyPrintedString(jSONObject);
        }
        return v.p("\n                |Making request with id => \"" + value + "\"\n                |to url: " + dVar + "\n                \n                |with headers:\n                " + strA + "\n                |\n                |" + str + "\n                ", null, 1, null);
    }

    public static final String a() {
        return "Exception while logging request: ";
    }

    public final void a(final InterfaceC4028k interfaceC4028k, final com.braze.requests.util.d dVar, final Map map, final JSONObject jSONObject, final long j10) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: T4.d
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.communication.e.a(interfaceC4028k, dVar, j10, this, map, jSONObject);
                }
            }, 7, (Object) null);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: T4.e
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.communication.e.b();
                }
            }, 4, (Object) null);
        }
    }

    public static final String a(InterfaceC4028k interfaceC4028k, com.braze.requests.util.d dVar, long j10, e eVar, Map map, JSONObject jSONObject) {
        Object value = interfaceC4028k.getValue();
        eVar.getClass();
        return v.p("\n                |Made request with id => \"" + value + "\"\n                |to url: " + dVar + "\n                |took: " + j10 + "ms\n                \n                |with response headers:\n                " + a(map) + "\n                |\n                |and response JSON:\n                |" + JsonUtils.getPrettyPrintedString(jSONObject) + "\n                ", null, 1, null);
    }

    public static String a(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add("|\"" + ((String) entry.getKey()) + "\" => \"" + ((String) entry.getValue()) + "\"");
        }
        return C4179C.q0(arrayList, "\n", null, null, 0, null, null, 62, null);
    }
}
