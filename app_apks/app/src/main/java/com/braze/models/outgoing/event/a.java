package com.braze.models.outgoing.event;

import Od.H;
import Od.v;
import com.braze.enums.c;
import com.braze.enums.d;
import com.braze.enums.g;
import com.braze.models.FeatureFlag;
import com.braze.models.IBrazeLocation;
import com.braze.models.k;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.models.q;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import fc.C4032o;
import io.sentry.TraceContext;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final k b(String str, BrazeProperties brazeProperties) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("n", str);
        if (brazeProperties != null && brazeProperties.getSize() > 0) {
            jSONObjectPut.put("p", brazeProperties.getKey());
        }
        d dVar = d.f27631e;
        AbstractC4862t.b(jSONObjectPut);
        return new b(dVar, jSONObjectPut, 0.0d, 12);
    }

    public static final k d(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new b(d.f27638l, jSONObject, 0.0d, 12);
    }

    public static final k f(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new b(d.f27640n, jSONObject, 0.0d, 12);
    }

    public static final k h(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new b(d.f27641o, jSONObject, 0.0d, 12);
    }

    public static final k j(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new b(d.f27639m, jSONObject, 0.0d, 12);
    }

    public static final k l(String str, String str2) {
        return new b(d.f27647u, b.f28071g.a(str, (String) null, str2), 0.0d, 12);
    }

    public static final k n(String str, String str2) {
        return new b(d.f27646t, b.f28071g.a(str, (String) null, str2), 0.0d, 12);
    }

    public static final k p(String str, String str2) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("cid", str).put("a", str2);
        d dVar = d.f27633g;
        AbstractC4862t.b(jSONObjectPut);
        return new b(dVar, jSONObjectPut, 0.0d, 12);
    }

    public static final k r(String str, String str2) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("key", str).put("value", str2);
        d dVar = d.f27644r;
        AbstractC4862t.b(jSONObjectPut);
        return new b(dVar, jSONObjectPut, 0.0d, 12);
    }

    public static final k t(String str, String str2) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("a", str).put("l", str2);
        d dVar = d.f27650x;
        AbstractC4862t.b(jSONObjectPut);
        return new b(dVar, jSONObjectPut, 0.0d, 12);
    }

    public final k a(final String eventName, final BrazeProperties brazeProperties) {
        AbstractC4862t.e(eventName, "eventName");
        return a(new InterfaceC6082a() { // from class: i5.y
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.b(eventName, brazeProperties);
            }
        });
    }

    public final k c(final String cardId) {
        AbstractC4862t.e(cardId, "cardId");
        return a(new InterfaceC6082a() { // from class: i5.o
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.d(cardId);
            }
        });
    }

    public final k e(final String cardId) {
        AbstractC4862t.e(cardId, "cardId");
        return a(new InterfaceC6082a() { // from class: i5.q
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.f(cardId);
            }
        });
    }

    public final k g(final String cardId) {
        AbstractC4862t.e(cardId, "cardId");
        return a(new InterfaceC6082a() { // from class: i5.r
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.h(cardId);
            }
        });
    }

    public final k i(final String cardId) {
        AbstractC4862t.e(cardId, "cardId");
        return a(new InterfaceC6082a() { // from class: i5.j
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.j(cardId);
            }
        });
    }

    public final k k(final String triggerId, final String str) {
        AbstractC4862t.e(triggerId, "triggerId");
        return a(new InterfaceC6082a() { // from class: i5.m
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.l(triggerId, str);
            }
        });
    }

    public final k m(final String triggerId, final String str) {
        AbstractC4862t.e(triggerId, "triggerId");
        return a(new InterfaceC6082a() { // from class: i5.a
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.n(triggerId, str);
            }
        });
    }

    public final k o(final String campaignId, final String pageId) {
        AbstractC4862t.e(campaignId, "campaignId");
        AbstractC4862t.e(pageId, "pageId");
        return a(new InterfaceC6082a() { // from class: i5.k
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.p(campaignId, pageId);
            }
        });
    }

    public final k q(final String key, final String value) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(value, "value");
        return a(new InterfaceC6082a() { // from class: i5.A
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.r(key, value);
            }
        });
    }

    public final k s(final String alias, final String label) {
        AbstractC4862t.e(alias, "alias");
        AbstractC4862t.e(label, "label");
        return a(new InterfaceC6082a() { // from class: i5.b
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.t(alias, label);
            }
        });
    }

    public static final k l(String str) {
        return new b(d.f27648v, b.f28071g.a(str, (String) null, (String) null), 0.0d, 12);
    }

    public final k a(final String productId, final String currencyCode, final BigDecimal price, final int i10, final BrazeProperties brazeProperties) {
        AbstractC4862t.e(productId, "productId");
        AbstractC4862t.e(currencyCode, "currencyCode");
        AbstractC4862t.e(price, "price");
        return a(new InterfaceC6082a() { // from class: i5.x
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.a(brazeProperties, productId, currencyCode, price, i10);
            }
        });
    }

    public final k c(final String trackingId, final String str) {
        AbstractC4862t.e(trackingId, "trackingId");
        return a(new InterfaceC6082a() { // from class: i5.g
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.d(trackingId, str);
            }
        });
    }

    public final k e(final String serializedEvent, final String uniqueIdentifier) {
        AbstractC4862t.e(serializedEvent, "serializedEvent");
        AbstractC4862t.e(uniqueIdentifier, "uniqueIdentifier");
        return a(new InterfaceC6082a() { // from class: i5.s
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.f(serializedEvent, uniqueIdentifier);
            }
        });
    }

    public final k i(final String triggerId, final String buttonId) {
        AbstractC4862t.e(triggerId, "triggerId");
        AbstractC4862t.e(buttonId, "buttonId");
        return a(new InterfaceC6082a() { // from class: i5.l
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.j(triggerId, buttonId);
            }
        });
    }

    public final k k(final String triggerId) {
        AbstractC4862t.e(triggerId, "triggerId");
        return a(new InterfaceC6082a() { // from class: i5.z
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.l(triggerId);
            }
        });
    }

    public static final k a(BrazeProperties brazeProperties, String str, String str2, BigDecimal bigDecimal, int i10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pid", str);
        jSONObject.put("c", str2);
        AbstractC4862t.e(bigDecimal, "<this>");
        BigDecimal scale = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        AbstractC4862t.d(scale, "setScale(...)");
        jSONObject.put("p", scale.doubleValue());
        jSONObject.put("q", i10);
        if (brazeProperties != null && brazeProperties.getSize() > 0) {
            jSONObject.put("pr", brazeProperties.getKey());
        }
        return new b(d.f27632f, jSONObject, 0.0d, 12);
    }

    public static final k b(IBrazeLocation iBrazeLocation) {
        return new b(d.f27630d, iBrazeLocation.getKey(), 0.0d, 12);
    }

    public static final k d(String str, String str2) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("id", str);
        if (str2 != null && str2.length() > 0) {
            jSONObjectPut.put("bid", str2);
        }
        d dVar = d.f27624G;
        AbstractC4862t.b(jSONObjectPut);
        return new b(dVar, jSONObjectPut, 0.0d, 12);
    }

    public static final k f(String str, String uniqueIdentifier) throws JSONException {
        q qVar;
        JSONObject jSONObject = new JSONObject(str);
        String value = jSONObject.getString("name");
        c cVar = d.f27628b;
        AbstractC4862t.b(value);
        cVar.getClass();
        AbstractC4862t.e(value, "value");
        Object obj = d.f27629c.get(value);
        if (obj == null) {
            obj = d.f27626I;
        }
        d eventType = (d) obj;
        JSONObject eventData = jSONObject.getJSONObject("data");
        double d10 = jSONObject.getDouble("time");
        String optionalString = JsonUtils.getOptionalString(jSONObject, TraceContext.JsonKeys.USER_ID);
        String sessionId = JsonUtils.getOptionalString(jSONObject, "session_id");
        AbstractC4862t.b(eventData);
        AbstractC4862t.e(eventType, "eventType");
        AbstractC4862t.e(eventData, "eventData");
        AbstractC4862t.e(uniqueIdentifier, "uniqueIdentifier");
        b bVar = new b(eventType, eventData, d10, uniqueIdentifier);
        bVar.f28077e.setValue(bVar, b.f28072h[0], optionalString);
        if (sessionId != null) {
            AbstractC4862t.e(sessionId, "sessionId");
            UUID uuidFromString = UUID.fromString(sessionId);
            AbstractC4862t.d(uuidFromString, "fromString(...)");
            qVar = new q(uuidFromString);
        } else {
            qVar = null;
        }
        bVar.a(qVar);
        return bVar;
    }

    public static final k j(String str, String str2) {
        return new b(d.f27649w, b.f28071g.a(str, str2, (String) null), 0.0d, 12);
    }

    public static final k b(Throwable throwable, q qVar, boolean z10) throws JSONException {
        String str;
        String name = throwable.getClass().getName();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        if (qVar != null) {
            str = "session_id: " + qVar;
        } else {
            str = null;
        }
        b.f28071g.getClass();
        AbstractC4862t.e(throwable, "throwable");
        StringWriter stringWriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        AbstractC4862t.d(string, "toString(...)");
        JSONObject jSONObjectPut = new JSONObject().put("e", v.n("\n                original_sdk_version: 41.0.0\n                exception_class: " + name + "\n                available_cpus: " + iAvailableProcessors + "\n                " + str + "\n                " + H.m1(string, 5000) + "\n            "));
        if (!z10) {
            jSONObjectPut.put("nop", true);
        }
        d dVar = d.f27636j;
        AbstractC4862t.b(jSONObjectPut);
        return new b(dVar, jSONObjectPut, 0.0d, 12);
    }

    public final k a(final IBrazeLocation location) {
        AbstractC4862t.e(location, "location");
        return a(new InterfaceC6082a() { // from class: i5.p
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.b(location);
            }
        });
    }

    public final k a(final Throwable throwable, final q qVar, final boolean z10) {
        AbstractC4862t.e(throwable, "throwable");
        return a(new InterfaceC6082a() { // from class: i5.u
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.b(throwable, qVar, z10);
            }
        });
    }

    public final k a(final FeatureFlag ff2) {
        AbstractC4862t.e(ff2, "ff");
        return a(new InterfaceC6082a() { // from class: i5.d
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.b(ff2);
            }
        });
    }

    public final k a(final String trackingId) {
        AbstractC4862t.e(trackingId, "trackingId");
        return a(new InterfaceC6082a() { // from class: i5.c
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.b(trackingId);
            }
        });
    }

    public final k a(final String customUserAttributeKey, final int i10) {
        AbstractC4862t.e(customUserAttributeKey, "customUserAttributeKey");
        return a(new InterfaceC6082a() { // from class: i5.f
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.b(customUserAttributeKey, i10);
            }
        });
    }

    public final k a(final String key, final String value) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(value, "value");
        return a(new InterfaceC6082a() { // from class: i5.h
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.b(key, value);
            }
        });
    }

    public final k a(final String key, final String[] strArr) {
        AbstractC4862t.e(key, "key");
        return a(new InterfaceC6082a() { // from class: i5.e
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.b(key, strArr);
            }
        });
    }

    public final k a(final q sessionId) {
        AbstractC4862t.e(sessionId, "sessionId");
        return a(new InterfaceC6082a() { // from class: i5.t
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.b(sessionId);
            }
        });
    }

    public final k a(final long j10) {
        return a(new InterfaceC6082a() { // from class: i5.n
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.b(j10);
            }
        });
    }

    public static final k b(FeatureFlag featureFlag) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("fid", featureFlag.getId()).put("fts", featureFlag.getTrackingString());
        d dVar = d.f27622E;
        AbstractC4862t.b(jSONObjectPut);
        return new b(dVar, jSONObjectPut, 0.0d, 12);
    }

    public final k a(final String key, final double d10, final double d11) {
        AbstractC4862t.e(key, "key");
        return a(new InterfaceC6082a() { // from class: i5.i
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.b(key, d10, d11);
            }
        });
    }

    public final k a(final String key, final JSONObject json) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(json, "json");
        return a(new InterfaceC6082a() { // from class: i5.B
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.b(key, json);
            }
        });
    }

    public final k a(final String subscriptionGroupId, final g subscriptionGroupStatus) {
        AbstractC4862t.e(subscriptionGroupId, "subscriptionGroupId");
        AbstractC4862t.e(subscriptionGroupStatus, "subscriptionGroupStatus");
        return a(new InterfaceC6082a() { // from class: i5.C
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.b(subscriptionGroupId, subscriptionGroupStatus);
            }
        });
    }

    public final JSONObject a(String str, String str2, String str3) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (str != null && str.length() != 0) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            jSONObject.put("trigger_ids", jSONArray);
        }
        if (str2 != null && str2.length() != 0) {
            jSONObject.put("bid", str2);
        }
        if (str3 != null) {
            jSONObject.put("message_extras", str3);
            return jSONObject;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: i5.w
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.a();
            }
        }, 6, (Object) null);
        return jSONObject;
    }

    public static final k b(String str) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("ids", JsonUtils.constructJsonArray(new String[]{str}));
        d dVar = d.f27623F;
        AbstractC4862t.b(jSONObjectPut);
        return new b(dVar, jSONObjectPut, 0.0d, 12);
    }

    public static final k b(String str, int i10) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("key", str).put("value", i10);
        d dVar = d.f27642p;
        AbstractC4862t.b(jSONObjectPut);
        return new b(dVar, jSONObjectPut, 0.0d, 12);
    }

    public static final k b(String str, String str2) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("key", str).put("value", str2);
        d dVar = d.f27643q;
        AbstractC4862t.b(jSONObjectPut);
        return new b(dVar, jSONObjectPut, 0.0d, 12);
    }

    public static final String a() {
        return "Message extras are null, not adding to event";
    }

    public final k a(InterfaceC6082a interfaceC6082a) {
        try {
            return (k) interfaceC6082a.invoke();
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: i5.v
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.models.outgoing.event.a.b();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    public static final k b(String str, String[] strArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", str);
        if (strArr == null) {
            jSONObject.put("value", JSONObject.NULL);
        } else {
            jSONObject.put("value", JsonUtils.constructJsonArray(strArr));
        }
        return new b(d.f27645s, jSONObject, 0.0d, 12);
    }

    public static final k b(q qVar) {
        b bVar = new b(d.f27651y, (JSONObject) null, 0.0d, 14);
        bVar.a(qVar);
        return bVar;
    }

    public static final k b(long j10) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("d", j10);
        d dVar = d.f27652z;
        AbstractC4862t.b(jSONObjectPut);
        return new b(dVar, jSONObjectPut, 0.0d, 12);
    }

    public static final k b(String str, double d10, double d11) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("key", str).put("latitude", d10).put("longitude", d11);
        d dVar = d.f27618A;
        AbstractC4862t.b(jSONObjectPut);
        return new b(dVar, jSONObjectPut, 0.0d, 12);
    }

    public static final k b(String str, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("key", str).put("value", jSONObject);
        d dVar = d.f27620C;
        AbstractC4862t.b(jSONObjectPut);
        return new b(dVar, jSONObjectPut, 0.0d, 12);
    }

    public static final k b(String str, g gVar) throws JSONException {
        String str2;
        JSONObject jSONObjectPut = new JSONObject().put("group_id", str);
        int iOrdinal = gVar.ordinal();
        if (iOrdinal == 0) {
            str2 = "subscribed";
        } else if (iOrdinal == 1) {
            str2 = "unsubscribed";
        } else {
            throw new C4032o();
        }
        JSONObject jSONObjectPut2 = jSONObjectPut.put("status", str2);
        d dVar = d.f27621D;
        AbstractC4862t.b(jSONObjectPut2);
        return new b(dVar, jSONObjectPut2, 0.0d, 12);
    }

    public static final String b() {
        return "Failed to create event";
    }
}
