package com.braze.storage;

import Od.F;
import android.content.Context;
import com.braze.enums.CardKey;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import fc.AbstractC4040w;
import fc.C4034q;
import gc.C4179C;
import gc.C4206t;
import gc.Q;
import gc.U;
import ge.C4231e;
import he.AbstractC4304b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.L;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class p implements ICardStorageProvider {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Set f28522k = U.h(CardKey.VIEWED.getKey(), CardKey.DISMISSED.getKey());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.managers.r f28524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f28525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f28526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f28527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f28528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashSet f28529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashSet f28530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map f28531i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.braze.analytics.a f28532j;

    public p(Context context, String userId, String apiKey, com.braze.managers.r brazeManager, final String currentSdkVersion) {
        List arrayList;
        List listK;
        List arrayList2;
        List listK2;
        List arrayList3;
        List listK3;
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(userId, "userId");
        AbstractC4862t.e(apiKey, "apiKey");
        AbstractC4862t.e(brazeManager, "brazeManager");
        AbstractC4862t.e(currentSdkVersion, "currentSdkVersion");
        this.f28523a = userId;
        this.f28524b = brazeManager;
        m mVar = new m(context, userId, apiKey);
        this.f28525c = mVar;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f28528f = linkedHashSet;
        this.f28529g = new LinkedHashSet();
        this.f28530h = new LinkedHashSet();
        this.f28531i = new LinkedHashMap();
        this.f28532j = new com.braze.analytics.a();
        c();
        DataStoreKey dataStoreKey = DataStoreKey.DISMISSED_CARDS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new h0(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object data = mVar.readData(dataStoreKey, "");
                AbstractC4862t.c(data, "null cannot be cast to non-null type kotlin.String");
                String str = (String) data;
                if (F.k0(str)) {
                    arrayList = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (F.k0(str) || AbstractC4862t.a(F.e1(str).toString(), "null")) {
                        listK = C4206t.k();
                    } else {
                        try {
                            AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                            aVar.d();
                            listK = (List) aVar.a(new C4231e(ge.w0.f35762a), str);
                        } catch (Exception e10) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) new com.braze.support.e(str), 4, (Object) null);
                            listK = C4206t.k();
                        }
                    }
                    arrayList = C4179C.X0(listK);
                }
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new i0(dataStoreKey), 8, (Object) null);
                arrayList = new ArrayList();
            }
        }
        linkedHashSet.addAll(arrayList);
        LinkedHashSet linkedHashSet2 = this.f28530h;
        m mVar2 = this.f28525c;
        DataStoreKey dataStoreKey2 = DataStoreKey.EXPIRED_CARDS;
        if (dataStoreKey2.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new h0(dataStoreKey2), 12, (Object) null);
            arrayList2 = new ArrayList();
        } else {
            try {
                Object data2 = mVar2.readData(dataStoreKey2, "");
                AbstractC4862t.c(data2, "null cannot be cast to non-null type kotlin.String");
                String str2 = (String) data2;
                if (F.k0(str2)) {
                    arrayList2 = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    if (F.k0(str2) || AbstractC4862t.a(F.e1(str2).toString(), "null")) {
                        listK2 = C4206t.k();
                    } else {
                        try {
                            AbstractC4304b.a aVar2 = AbstractC4304b.f36582d;
                            aVar2.d();
                            listK2 = (List) aVar2.a(new C4231e(ge.w0.f35762a), str2);
                        } catch (Exception e12) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.f28625E, (Throwable) e12, false, (InterfaceC6082a) new com.braze.support.e(str2), 4, (Object) null);
                            listK2 = C4206t.k();
                        }
                    }
                    arrayList2 = C4179C.X0(listK2);
                }
            } catch (Exception e13) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e13, false, (InterfaceC6082a) new i0(dataStoreKey2), 8, (Object) null);
                arrayList2 = new ArrayList();
            }
        }
        linkedHashSet2.addAll(arrayList2);
        LinkedHashSet linkedHashSet3 = this.f28529g;
        m mVar3 = this.f28525c;
        DataStoreKey dataStoreKey3 = DataStoreKey.TEST_CARDS;
        if (dataStoreKey3.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new h0(dataStoreKey3), 12, (Object) null);
            arrayList3 = new ArrayList();
        } else {
            try {
                Object data3 = mVar3.readData(dataStoreKey3, "");
                AbstractC4862t.c(data3, "null cannot be cast to non-null type kotlin.String");
                String str3 = (String) data3;
                if (F.k0(str3)) {
                    arrayList3 = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                    if (F.k0(str3) || AbstractC4862t.a(F.e1(str3).toString(), "null")) {
                        listK3 = C4206t.k();
                    } else {
                        try {
                            AbstractC4304b.a aVar3 = AbstractC4304b.f36582d;
                            aVar3.d();
                            listK3 = (List) aVar3.a(new C4231e(ge.w0.f35762a), str3);
                        } catch (Exception e14) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.f28625E, (Throwable) e14, false, (InterfaceC6082a) new com.braze.support.e(str3), 4, (Object) null);
                            listK3 = C4206t.k();
                        }
                    }
                    arrayList3 = C4179C.X0(listK3);
                }
            } catch (Exception e15) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e15, false, (InterfaceC6082a) new i0(dataStoreKey3), 8, (Object) null);
                arrayList3 = new ArrayList();
            }
        }
        linkedHashSet3.addAll(arrayList3);
        m mVar4 = this.f28525c;
        DataStoreKey dataStoreKey4 = DataStoreKey.LAST_ACCESSED_SDK_VERSION;
        Object data4 = mVar4.readData(dataStoreKey4, "");
        AbstractC4862t.c(data4, "null cannot be cast to non-null type kotlin.String");
        final String str4 = (String) data4;
        if (!AbstractC4862t.a(currentSdkVersion, str4)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.w2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.p.a(str4, currentSdkVersion);
                }
            }, 6, (Object) null);
            this.f28525c.writeData(DataStoreKey.LAST_FULL_CARD_SYNC_AT, 0L);
            this.f28525c.writeData(dataStoreKey4, currentSdkVersion);
        }
        Object data5 = this.f28525c.readData(DataStoreKey.LAST_CARD_UPDATED_AT, 0L);
        AbstractC4862t.c(data5, "null cannot be cast to non-null type kotlin.Long");
        this.f28526d = ((Long) data5).longValue();
        Object data6 = this.f28525c.readData(DataStoreKey.LAST_FULL_CARD_SYNC_AT, 0L);
        AbstractC4862t.c(data6, "null cannot be cast to non-null type kotlin.Long");
        this.f28527e = ((Long) data6).longValue();
    }

    public static final String a(String str, String str2) {
        return "Detected SDK update from '" + str + "' -> '" + str2 + "'. Clearing config update time.";
    }

    public static final String b(JSONObject jSONObject) {
        return "Server card json: " + jSONObject;
    }

    public static final String c(JSONObject jSONObject) {
        return "Cached card json: " + jSONObject;
    }

    public static final String d() {
        return "The server card received is older than the cached card. Not updating the cached card.";
    }

    public static final String e(JSONObject jSONObject) {
        return "Server card has expired already. Not adding card to storage. Server card: " + jSONObject;
    }

    public static final String g(String str) {
        return "Card not present in storage for id: " + str;
    }

    public static final String h(String str) {
        return "Failed to read card json from storage. Json: " + str;
    }

    public static final String j(String str) {
        return "Removing card from test cache: " + str;
    }

    public static final String k(String str) {
        return "Removing card from storage with id: " + str;
    }

    public static final String l(String str) {
        return "Server card is marked as removed. Removing from card storage with id: " + str;
    }

    public static final String m(String str) {
        return "Server card is marked as dismissed. Adding to dismissed cached and removing from card storage with id: " + str;
    }

    public static final String n(String str) {
        return "Can't update card field. Json cannot be parsed from disk or is not present. Id: " + str;
    }

    public static final String o(String str) {
        return "Removing card from storage with id: " + str;
    }

    public static final String p(String str) {
        return "Writing card to storage with id: " + str;
    }

    public final JSONObject f(final String cardId) {
        AbstractC4862t.e(cardId, "cardId");
        final String str = (String) this.f28531i.get(cardId);
        if (str == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.H2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.p.g(cardId);
                }
            }, 7, (Object) null);
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.I2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.p.h(str);
                }
            }, 4, (Object) null);
            return null;
        }
    }

    public final void i(final String cardId) {
        String strB;
        AbstractC4862t.e(cardId, "cardId");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.B2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.p.j(cardId);
            }
        }, 6, (Object) null);
        LinkedHashSet linkedHashSet = this.f28529g;
        linkedHashSet.remove(cardId);
        m mVar = this.f28525c;
        DataStoreKey dataStoreKey = DataStoreKey.TEST_CARDS;
        List listV0 = C4179C.V0(linkedHashSet);
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new o0(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                aVar.d();
                strB = aVar.b(new C4231e(ge.w0.f35762a), listV0);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                strB = ((listV0 instanceof Map) || listV0 == null) ? "{}" : "[]";
            }
            mVar.writeData(dataStoreKey, strB);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new p0(dataStoreKey), 8, (Object) null);
        }
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsClicked(String cardId) {
        AbstractC4862t.e(cardId, "cardId");
        a(cardId, CardKey.CLICKED);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsDismissed(String cardId) {
        AbstractC4862t.e(cardId, "cardId");
        a(cardId);
        a(cardId, (JSONObject) null);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsViewed(String cardId) {
        AbstractC4862t.e(cardId, "cardId");
        a(cardId, CardKey.VIEWED);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsVisuallyRead(String cardId) {
        AbstractC4862t.e(cardId, "cardId");
        a(cardId, CardKey.READ);
    }

    public static final String c(String str) {
        return "Adding card to test cache: " + str;
    }

    public static final String d(JSONObject jSONObject) {
        return "Server card was locally dismissed already. Not adding card to storage. Server card: " + jSONObject;
    }

    public static final String e() {
        return "Input user id was null. Defaulting to the empty user id";
    }

    public final void a(final JSONObject json) throws JSONException {
        JSONObject jSONObject;
        String strB;
        Set setZ0 = C4179C.Z0(this.f28528f);
        Set setZ02 = C4179C.Z0(this.f28530h);
        final String cardId = json.getString(CardKey.ID.getKey());
        AbstractC4862t.b(cardId);
        final JSONObject jSONObjectF = f(cardId);
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.s2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.p.b(json);
            }
        }, 7, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.t2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.p.c(jSONObjectF);
            }
        }, 7, (Object) null);
        AbstractC4862t.e(json, "serverCard");
        if (jSONObjectF != null) {
            String key = CardKey.CREATED.getKey();
            if (jSONObjectF.has(key) && json.has(key) && jSONObjectF.getLong(key) > json.getLong(key)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.u2
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.storage.p.d();
                    }
                }, 6, (Object) null);
                return;
            }
        }
        CardKey cardKey = CardKey.REMOVED;
        AbstractC4862t.e(json, "json");
        AbstractC4862t.e(cardKey, "cardKey");
        String key2 = cardKey.getKey();
        if (json.has(key2) ? json.getBoolean(key2) : false) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.v2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.p.l(cardId);
                }
            }, 7, (Object) null);
            AbstractC4862t.e(cardId, "cardId");
            this.f28528f.remove(cardId);
            m mVar = this.f28525c;
            DataStoreKey dataStoreKey = DataStoreKey.DISMISSED_CARDS;
            List listV0 = C4179C.V0(this.f28528f);
            if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new o0(dataStoreKey), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    try {
                        AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                        aVar.d();
                        strB = aVar.b(new C4231e(ge.w0.f35762a), listV0);
                    } catch (Exception e10) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                        strB = ((listV0 instanceof Map) || listV0 == null) ? "{}" : "[]";
                    }
                    mVar.writeData(dataStoreKey, strB);
                } catch (Exception e11) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new p0(dataStoreKey), 8, (Object) null);
                }
            }
            i(cardId);
            a(cardId, (JSONObject) null);
            return;
        }
        if (setZ0.contains(cardId)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.x2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.p.d(json);
                }
            }, 7, (Object) null);
            return;
        }
        if (setZ02.contains(cardId)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.y2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.p.e(json);
                }
            }, 7, (Object) null);
            return;
        }
        CardKey cardKey2 = CardKey.DISMISSED;
        AbstractC4862t.e(json, "json");
        AbstractC4862t.e(cardKey2, "cardKey");
        String key3 = cardKey2.getKey();
        if (json.has(key3) ? json.getBoolean(key3) : false) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.z2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.p.m(cardId);
                }
            }, 7, (Object) null);
            a(cardId);
            a(cardId, (JSONObject) null);
            return;
        }
        AbstractC4862t.e(json, "serverCard");
        if (jSONObjectF == null) {
            jSONObject = json;
        } else {
            jSONObject = new JSONObject();
            Iterator<String> itKeys = jSONObjectF.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObjectF.get(next));
            }
            Iterator<String> itKeys2 = json.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                if (f28522k.contains(next2)) {
                    jSONObject.put(next2, jSONObjectF.getBoolean(next2) || json.getBoolean(next2));
                } else {
                    jSONObject.put(next2, json.get(next2));
                }
            }
        }
        a(cardId, jSONObject);
        CardKey cardKey3 = CardKey.IS_TEST;
        AbstractC4862t.e(json, "json");
        AbstractC4862t.e(cardKey3, "cardKey");
        String key4 = cardKey3.getKey();
        if (json.has(key4) ? json.getBoolean(key4) : false) {
            b(cardId);
        }
    }

    public final void b(final String cardId) {
        String strB;
        AbstractC4862t.e(cardId, "cardId");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.A2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.p.c(cardId);
            }
        }, 6, (Object) null);
        LinkedHashSet linkedHashSet = this.f28529g;
        linkedHashSet.add(cardId);
        m mVar = this.f28525c;
        DataStoreKey dataStoreKey = DataStoreKey.TEST_CARDS;
        List listV0 = C4179C.V0(linkedHashSet);
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new o0(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                aVar.d();
                strB = aVar.b(new C4231e(ge.w0.f35762a), listV0);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                strB = ((listV0 instanceof Map) || listV0 == null) ? "{}" : "[]";
            }
            mVar.writeData(dataStoreKey, strB);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new p0(dataStoreKey), 8, (Object) null);
        }
    }

    public static final String d(String str) {
        return "Failed to parse card JSON, skipping: " + str;
    }

    public static final String e(String str) {
        return "Deleting expired card from storage with id: " + str;
    }

    public final void c() {
        Iterable<String> arrayList;
        List listK;
        p pVar;
        C4034q c4034qA;
        m mVar = this.f28525c;
        DataStoreKey dataStoreKey = DataStoreKey.CONTENT_CARDS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new h0(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object data = mVar.readData(dataStoreKey, "");
                AbstractC4862t.c(data, "null cannot be cast to non-null type kotlin.String");
                String str = (String) data;
                if (F.k0(str)) {
                    arrayList = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (F.k0(str) || AbstractC4862t.a(F.e1(str).toString(), "null")) {
                        listK = C4206t.k();
                    } else {
                        try {
                            AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                            aVar.d();
                            listK = (List) aVar.a(new C4231e(ge.w0.f35762a), str);
                        } catch (Exception e10) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) new com.braze.support.e(str), 4, (Object) null);
                            listK = C4206t.k();
                        }
                    }
                    arrayList = C4179C.X0(listK);
                }
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new i0(dataStoreKey), 8, (Object) null);
                arrayList = new ArrayList();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (final String str2 : arrayList) {
            try {
                c4034qA = AbstractC4040w.a(new JSONObject(str2).getString(CardKey.ID.getKey()), str2);
                pVar = this;
            } catch (JSONException e12) {
                pVar = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) pVar, BrazeLogger.Priority.f28625E, (Throwable) e12, false, new InterfaceC6082a() { // from class: r5.C2
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.storage.p.d(str2);
                    }
                }, 4, (Object) null);
                c4034qA = null;
            }
            if (c4034qA != null) {
                arrayList2.add(c4034qA);
            }
            this = pVar;
        }
        this.f28531i = Q.w(Q.s(arrayList2));
    }

    public static final String b() {
        return "Clearing content card storage.";
    }

    public final ContentCardsUpdatedEvent a(com.braze.models.response.c contentCardsResponse, String str) {
        final p pVar;
        String strB;
        AbstractC4862t.e(contentCardsResponse, "contentCardsResponse");
        final L l10 = new L();
        l10.f39776a = str;
        if (str == null) {
            pVar = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) pVar, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.m2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.p.e();
                }
            }, 7, (Object) null);
            l10.f39776a = "";
        } else {
            pVar = this;
        }
        if (!AbstractC4862t.a(pVar.f28523a, l10.f39776a)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) pVar, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.n2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.p.a(l10, pVar);
                }
            }, 6, (Object) null);
            return null;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.o2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.p.a(l10);
            }
        }, 6, (Object) null);
        AbstractC4862t.e(contentCardsResponse, "contentCardsResponse");
        long j10 = contentCardsResponse.f28117a;
        if (j10 != -1) {
            this.f28526d = j10;
            this.f28525c.writeData(DataStoreKey.LAST_CARD_UPDATED_AT, Long.valueOf(j10));
        }
        long j11 = contentCardsResponse.f28118b;
        if (j11 != -1) {
            this.f28527e = j11;
            this.f28525c.writeData(DataStoreKey.LAST_FULL_CARD_SYNC_AT, Long.valueOf(j11));
        }
        this.f28525c.writeData(DataStoreKey.LAST_CARD_STORAGE_UPDATE_TIMESTAMP, Long.valueOf(DateTimeUtils.nowInSeconds()));
        LinkedHashSet cardIdsToRetain = new LinkedHashSet();
        JSONArray jSONArray = contentCardsResponse.f28120d;
        if (jSONArray != null && jSONArray.length() != 0) {
            for (JSONObject jSONObject : Nd.t.I(Nd.t.y(C4179C.X(Bc.k.p(0, jSONArray.length())), new n(jSONArray)), new o(jSONArray))) {
                a(jSONObject);
                String string = jSONObject.getString(CardKey.ID.getKey());
                AbstractC4862t.d(string, "getString(...)");
                cardIdsToRetain.add(string);
            }
        }
        if (contentCardsResponse.f28119c) {
            AbstractC4862t.e(cardIdsToRetain, "cardIdsToRetain");
            this.f28528f.retainAll(cardIdsToRetain);
            m mVar = this.f28525c;
            DataStoreKey dataStoreKey = DataStoreKey.DISMISSED_CARDS;
            List listV0 = C4179C.V0(this.f28528f);
            String strB2 = "[]";
            if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new o0(dataStoreKey), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    try {
                        AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                        aVar.d();
                        strB = aVar.b(new C4231e(ge.w0.f35762a), listV0);
                    } catch (Exception e10) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                        strB = ((listV0 instanceof Map) || listV0 == null) ? "{}" : "[]";
                    }
                    mVar.writeData(dataStoreKey, strB);
                } catch (Exception e11) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new p0(dataStoreKey), 8, (Object) null);
                }
            }
            AbstractC4862t.e(cardIdsToRetain, "cardIdsToRetain");
            LinkedHashSet linkedHashSet = this.f28530h;
            linkedHashSet.retainAll(cardIdsToRetain);
            m mVar2 = this.f28525c;
            DataStoreKey dataStoreKey2 = DataStoreKey.EXPIRED_CARDS;
            List listV02 = C4179C.V0(linkedHashSet);
            if (dataStoreKey2.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new o0(dataStoreKey2), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    try {
                        AbstractC4304b.a aVar2 = AbstractC4304b.f36582d;
                        aVar2.d();
                        strB2 = aVar2.b(new C4231e(ge.w0.f35762a), listV02);
                    } catch (Exception e12) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.f28625E, (Throwable) e12, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                        if ((listV02 instanceof Map) || listV02 == null) {
                            strB2 = "{}";
                        }
                    }
                    mVar2.writeData(dataStoreKey2, strB2);
                } catch (Exception e13) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e13, false, (InterfaceC6082a) new p0(dataStoreKey2), 8, (Object) null);
                }
            }
            cardIdsToRetain.addAll(this.f28529g);
            a(cardIdsToRetain);
        }
        return a(false, (Long) null);
    }

    public static final String a(L l10, p pVar) {
        return "The received cards are for user " + l10.f39776a + " and the current user is " + pVar.f28523a + " , the cards will be discarded and no changes will be made.";
    }

    public static final String a(L l10) {
        return "Updating offline Content Cards for user with id: " + l10.f39776a;
    }

    public final ContentCardsUpdatedEvent a(boolean z10, Long l10) {
        long jLongValue;
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f28531i.values().iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        List listA = com.braze.models.h.a(jSONArray, this.f28524b, this, this.f28532j);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listA) {
            if (((Card) obj).isExpired()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        C4034q c4034q = new C4034q(arrayList, arrayList2);
        List list = (List) c4034q.a();
        List list2 = (List) c4034q.b();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            a((Card) it2.next());
        }
        String str = this.f28523a;
        if (l10 != null) {
            jLongValue = l10.longValue();
        } else {
            Object data = this.f28525c.readData(DataStoreKey.LAST_CARD_STORAGE_UPDATE_TIMESTAMP, 0L);
            AbstractC4862t.c(data, "null cannot be cast to non-null type kotlin.Long");
            jLongValue = ((Long) data).longValue();
        }
        return new ContentCardsUpdatedEvent(list2, str, jLongValue, z10);
    }

    public final void a(Card card) {
        String strB;
        AbstractC4862t.e(card, "card");
        final String cardId = card.getId();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.l2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.p.e(cardId);
            }
        }, 7, (Object) null);
        a(cardId, (JSONObject) null);
        AbstractC4862t.e(cardId, "cardId");
        this.f28530h.add(cardId);
        m mVar = this.f28525c;
        DataStoreKey dataStoreKey = DataStoreKey.EXPIRED_CARDS;
        List listV0 = C4179C.V0(this.f28530h);
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new o0(dataStoreKey), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                try {
                    AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                    aVar.d();
                    strB = aVar.b(new C4231e(ge.w0.f35762a), listV0);
                } catch (Exception e10) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                    strB = ((listV0 instanceof Map) || listV0 == null) ? "{}" : "[]";
                }
                mVar.writeData(dataStoreKey, strB);
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new p0(dataStoreKey), 8, (Object) null);
            }
        }
        i(cardId);
    }

    public final void a(final String cardId, final CardKey cardKey) {
        final Boolean value = Boolean.TRUE;
        AbstractC4862t.e(cardId, "cardId");
        AbstractC4862t.e(cardKey, "cardKey");
        AbstractC4862t.e(value, "value");
        JSONObject jSONObjectF = f(cardId);
        if (jSONObjectF == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.F2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.p.n(cardId);
                }
            }, 7, (Object) null);
            return;
        }
        try {
            jSONObjectF.put(cardKey.getKey(), value);
            a(cardId, jSONObjectF);
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.G2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.p.a(value, cardKey);
                }
            }, 4, (Object) null);
        }
    }

    public static final String a(Object obj, CardKey cardKey) {
        return "Failed to update card json field to " + obj + " with key: " + cardKey;
    }

    public final void a(final String cardId, JSONObject jSONObject) {
        p pVar;
        String strB;
        AbstractC4862t.e(cardId, "cardId");
        if (jSONObject == null) {
            pVar = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) pVar, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.D2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.p.o(cardId);
                }
            }, 7, (Object) null);
            pVar.f28531i.remove(cardId);
        } else {
            pVar = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) pVar, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.E2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.p.p(cardId);
                }
            }, 7, (Object) null);
            pVar.f28531i.put(cardId, jSONObject.toString());
        }
        List listV0 = C4179C.V0(pVar.f28531i.values());
        m mVar = pVar.f28525c;
        DataStoreKey dataStoreKey = DataStoreKey.CONTENT_CARDS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new o0(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                aVar.d();
                strB = aVar.b(new C4231e(ge.w0.f35762a), listV0);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                strB = ((listV0 instanceof Map) || listV0 == null) ? "{}" : "[]";
            }
            mVar.writeData(dataStoreKey, strB);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new p0(dataStoreKey), 8, (Object) null);
        }
    }

    public final void a(String cardId) {
        String strB;
        AbstractC4862t.e(cardId, "cardId");
        this.f28528f.add(cardId);
        m mVar = this.f28525c;
        DataStoreKey dataStoreKey = DataStoreKey.DISMISSED_CARDS;
        List listV0 = C4179C.V0(this.f28528f);
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new o0(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                aVar.d();
                strB = aVar.b(new C4231e(ge.w0.f35762a), listV0);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                strB = ((listV0 instanceof Map) || listV0 == null) ? "{}" : "[]";
            }
            mVar.writeData(dataStoreKey, strB);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new p0(dataStoreKey), 8, (Object) null);
        }
    }

    public final void a(final LinkedHashSet cardIdsToRetain) {
        String strB;
        AbstractC4862t.e(cardIdsToRetain, "cardIdsToRetain");
        final Set setKeySet = this.f28531i.keySet();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.q2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.p.a(cardIdsToRetain, setKeySet);
            }
        }, 7, (Object) null);
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (!cardIdsToRetain.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        for (final String str : arrayList) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.r2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.p.k(str);
                }
            }, 7, (Object) null);
            this.f28531i.remove(str);
        }
        List listV0 = C4179C.V0(this.f28531i.values());
        m mVar = this.f28525c;
        DataStoreKey dataStoreKey = DataStoreKey.CONTENT_CARDS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new o0(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                aVar.d();
                strB = aVar.b(new C4231e(ge.w0.f35762a), listV0);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                strB = ((listV0 instanceof Map) || listV0 == null) ? "{}" : "[]";
            }
            mVar.writeData(dataStoreKey, strB);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new p0(dataStoreKey), 8, (Object) null);
        }
    }

    public static final String a(Set set, Set set2) {
        return "Retaining card ids: " + set + " among cached card ids: " + set2;
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.p2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.p.b();
            }
        }, 7, (Object) null);
        this.f28531i.clear();
        this.f28530h.clear();
        this.f28525c.clearAllData();
    }
}
