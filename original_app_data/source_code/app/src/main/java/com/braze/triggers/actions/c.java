package com.braze.triggers.actions;

import android.content.Context;
import com.braze.enums.inappmessage.MessageType;
import com.braze.events.internal.m;
import com.braze.managers.r;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.s;
import gc.Q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c extends h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InAppMessageBase f28660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final JSONObject f28661h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r f28662i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(final JSONObject json, r brazeManager) throws JSONException {
        super(json);
        AbstractC4862t.e(json, "json");
        AbstractC4862t.e(brazeManager, "brazeManager");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: u5.a
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.triggers.actions.c.a(json);
            }
        }, 6, (Object) null);
        JSONObject jSONObject = json.getJSONObject("data");
        this.f28662i = brazeManager;
        this.f28661h = jSONObject;
        AbstractC4862t.b(jSONObject);
        InAppMessageBase inAppMessageBaseA = s.a(jSONObject, brazeManager);
        this.f28660g = inAppMessageBaseA;
        if (inAppMessageBaseA != null) {
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: u5.b
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.triggers.actions.c.f();
            }
        }, 6, (Object) null);
        throw new IllegalArgumentException("Failed to parse in-app message triggered action with JSON: " + JsonUtils.getPrettyPrintedString(json));
    }

    public static final String a(c cVar) {
        InAppMessageBase inAppMessageBase = cVar.f28660g;
        return "Failed to return remote paths to assets for type: " + (inAppMessageBase != null ? inAppMessageBase.getMessageType() : null);
    }

    public static final String c(com.braze.triggers.events.b bVar) {
        return "Cannot perform triggered action for " + bVar + " due to in-app message json being null";
    }

    public static final String d(com.braze.triggers.events.b bVar) {
        return "Cannot perform triggered action for " + bVar + " due to deserialized in-app message being null";
    }

    public static final String e() {
        return "In-app message has no remote assets for prefetch. Returning empty list.";
    }

    public static final String f() {
        return "Failed to parse in-app message triggered action.";
    }

    public static final String g() {
        return "Caught exception while performing triggered action.";
    }

    @Override // com.braze.triggers.actions.a
    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        InAppMessageBase inAppMessageBase = this.f28660g;
        List<String> remoteAssetPathsForPrefetch = inAppMessageBase != null ? inAppMessageBase.getRemoteAssetPathsForPrefetch() : null;
        if (remoteAssetPathsForPrefetch == null || remoteAssetPathsForPrefetch.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: u5.h
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.actions.c.e();
                }
            }, 7, (Object) null);
            return arrayList;
        }
        InAppMessageBase inAppMessageBase2 = this.f28660g;
        MessageType messageType = inAppMessageBase2 != null ? inAppMessageBase2.getMessageType() : null;
        int i10 = messageType == null ? -1 : b.f28659a[messageType.ordinal()];
        if (i10 == 1) {
            arrayList.add(new com.braze.triggers.utils.a(com.braze.triggers.enums.b.f28707a, remoteAssetPathsForPrefetch.get(0)));
            return arrayList;
        }
        if (i10 == 2 || i10 == 3 || i10 == 4) {
            arrayList.add(new com.braze.triggers.utils.a(com.braze.triggers.enums.b.f28708b, remoteAssetPathsForPrefetch.get(0)));
            return arrayList;
        }
        if (i10 != 5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: u5.g
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.actions.c.a(this.f45075a);
                }
            }, 6, (Object) null);
            return arrayList;
        }
        Iterator<String> it = remoteAssetPathsForPrefetch.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.braze.triggers.utils.a(com.braze.triggers.enums.b.f28709c, it.next()));
        }
        return arrayList;
    }

    @Override // com.braze.triggers.actions.g, com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final Object getKey() {
        try {
            JSONObject key = super.getKey();
            if (key != null) {
                InAppMessageBase inAppMessageBase = this.f28660g;
                key.put("data", inAppMessageBase != null ? inAppMessageBase.getKey() : null);
                key.put("type", "inapp");
                return key;
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public static final String a(JSONObject jSONObject) {
        return "Attempting to parse in-app message triggered action with JSON: " + JsonUtils.getPrettyPrintedString(jSONObject);
    }

    @Override // com.braze.triggers.actions.a
    public final void a(Context context, com.braze.events.e internalEventPublisher, final com.braze.triggers.events.b triggerEvent, long j10) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(internalEventPublisher, "internalEventPublisher");
        AbstractC4862t.e(triggerEvent, "triggerEvent");
        try {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: u5.c
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.actions.c.b(this.f45072a);
                }
            }, 7, (Object) null);
            JSONObject jSONObject = this.f28661h;
            if (jSONObject == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: u5.d
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.triggers.actions.c.c(triggerEvent);
                    }
                }, 6, (Object) null);
                return;
            }
            InAppMessageBase inAppMessageBaseA = s.a(jSONObject, this.f28662i);
            String strA = triggerEvent.a();
            int i10 = com.braze.triggers.events.h.f28716g;
            if (AbstractC4862t.a(strA, "test")) {
                if (inAppMessageBaseA != null) {
                    inAppMessageBaseA.setTestSend(true);
                }
                this.f28661h.put("is_test_send", true);
            }
            if (inAppMessageBaseA == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: u5.e
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.triggers.actions.c.d(triggerEvent);
                    }
                }, 6, (Object) null);
                return;
            }
            inAppMessageBaseA.setLocalPrefetchedAssetPaths(Q.u(this.f28674f));
            inAppMessageBaseA.setExpirationTimestamp(j10);
            ((com.braze.events.d) internalEventPublisher).b(new m(triggerEvent, this, inAppMessageBaseA, this.f28662i.f27967b), m.class);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: u5.f
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.actions.c.g();
                }
            }, 4, (Object) null);
        }
    }

    public static final String b(c cVar) {
        return "Attempting to publish in-app message after delay of " + cVar.d().d() + " seconds.";
    }
}
