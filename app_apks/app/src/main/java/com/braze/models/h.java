package com.braze.models;

import Nd.t;
import com.braze.enums.CardKey;
import com.braze.enums.CardType;
import com.braze.managers.m0;
import com.braze.managers.r;
import com.braze.models.cards.CaptionedImageCard;
import com.braze.models.cards.Card;
import com.braze.models.cards.ControlCard;
import com.braze.models.cards.ImageOnlyCard;
import com.braze.models.cards.ShortNewsCard;
import com.braze.models.cards.TextAnnouncementCard;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.BrazeLogger;
import gc.C4179C;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONArray;
import org.json.JSONObject;
import vc.InterfaceC6082a;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f28055a = new h();

    public static final Card a(m0 m0Var, ICardStorageProvider iCardStorageProvider, com.braze.analytics.b bVar, final JSONArray jSONArray, final Object it) {
        AbstractC4862t.e(it, "it");
        try {
            return a(new JSONObject(it.toString()), m0Var, iCardStorageProvider, bVar);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f28055a, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: d5.k
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.models.h.a(it, jSONArray);
                }
            }, 4, (Object) null);
            return null;
        }
    }

    public static final String a(Object obj, JSONArray jSONArray) {
        return "Unable to create Card JSON in array. Ignoring. Was on element: " + obj + " of json array: " + jSONArray;
    }

    public static final Card a(JSONObject jsonObject, m0 brazeManager, ICardStorageProvider cardStorageProvider, com.braze.analytics.b cardAnalyticsProvider) {
        AbstractC4862t.e(jsonObject, "jsonObject");
        AbstractC4862t.e(brazeManager, "brazeManager");
        AbstractC4862t.e(cardStorageProvider, "cardStorageProvider");
        AbstractC4862t.e(cardAnalyticsProvider, "cardAnalyticsProvider");
        CardType cardTypeFromJson = CardKey.INSTANCE.getCardTypeFromJson(jsonObject);
        int i10 = cardTypeFromJson == null ? -1 : e.f28052a[cardTypeFromJson.ordinal()];
        if (i10 == 1) {
            return new ImageOnlyCard(jsonObject, brazeManager, cardStorageProvider, cardAnalyticsProvider);
        }
        if (i10 == 2) {
            return new CaptionedImageCard(jsonObject, brazeManager, cardStorageProvider, cardAnalyticsProvider);
        }
        if (i10 == 3) {
            return new ShortNewsCard(jsonObject, brazeManager, cardStorageProvider, cardAnalyticsProvider);
        }
        if (i10 == 4) {
            return new TextAnnouncementCard(jsonObject, brazeManager, cardStorageProvider, cardAnalyticsProvider);
        }
        if (i10 != 5) {
            return null;
        }
        return new ControlCard(jsonObject, brazeManager, cardStorageProvider, cardAnalyticsProvider);
    }

    public static final List a(final JSONArray cardJsonStringArray, final r brazeManager, final com.braze.storage.p cardStorageProvider, final com.braze.analytics.a cardAnalyticsProvider) {
        AbstractC4862t.e(cardJsonStringArray, "cardJsonStringArray");
        AbstractC4862t.e(brazeManager, "brazeManager");
        AbstractC4862t.e(cardStorageProvider, "cardStorageProvider");
        AbstractC4862t.e(cardAnalyticsProvider, "cardAnalyticsProvider");
        return t.O(t.J(Nd.q.g(t.I(t.y(C4179C.X(Bc.k.p(0, cardJsonStringArray.length())), new f(cardJsonStringArray)), new g(cardJsonStringArray)).iterator()), new l() { // from class: d5.j
            @Override // vc.l
            public final Object invoke(Object obj) {
                return com.braze.models.h.a(brazeManager, cardStorageProvider, cardAnalyticsProvider, cardJsonStringArray, obj);
            }
        }));
    }
}
