package com.braze.models.cards;

import Od.F;
import Od.v;
import com.braze.analytics.b;
import com.braze.enums.CardKey;
import com.braze.enums.CardType;
import com.braze.managers.m0;
import com.braze.managers.r;
import com.braze.models.IPutIntoJson;
import com.braze.models.cards.Card;
import com.braze.models.k;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import io.sentry.protocol.Request;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0017\u0018\u0000 U2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001VB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0015\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u001a\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R#\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010&\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0014R\u0017\u0010*\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010.\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0017\u00100\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u0010\u000eR\"\u00102\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00101\u001a\u0004\b2\u0010\u000e\"\u0004\b3\u00104R$\u00106\u001a\u00020\f2\u0006\u00105\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b6\u0010\u000eR\u001d\u00107\u001a\u00020\f8\u0006¢\u0006\u0012\n\u0004\b7\u00101\u0012\u0004\b9\u0010:\u001a\u0004\b8\u0010\u000eR\"\u0010;\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u00101\u001a\u0004\b;\u0010\u000e\"\u0004\b<\u00104R\"\u0010=\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00101\u001a\u0004\b=\u0010\u000e\"\u0004\b>\u00104R\u001c\u0010?\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010'\u001a\u0004\b@\u0010\u0014R\u001a\u0010B\u001a\u00020A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u00101R\u0016\u0010G\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u00101R\u0016\u0010H\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u00101R$\u0010J\u001a\u00020\f2\u0006\u0010I\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010\u000e\"\u0004\bK\u00104R*\u0010L\u001a\u00020\f2\u0006\u0010L\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\u0012\u0012\u0004\bN\u0010:\u001a\u0004\bL\u0010\u000e\"\u0004\bM\u00104R*\u0010O\u001a\u00020\f2\u0006\u0010O\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\u0012\u0012\u0004\bR\u0010:\u001a\u0004\bP\u0010\u000e\"\u0004\bQ\u00104R\u0011\u0010S\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bS\u0010\u000eR\u0011\u0010T\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bT\u0010\u000e¨\u0006W"}, d2 = {"Lcom/braze/models/cards/Card;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "jsonObject", "Lcom/braze/managers/m0;", "brazeManager", "Lcom/braze/storage/ICardStorageProvider;", "cardStorage", "Lcom/braze/analytics/b;", "cardAnalytics", "<init>", "(Lorg/json/JSONObject;Lcom/braze/managers/m0;Lcom/braze/storage/ICardStorageProvider;Lcom/braze/analytics/b;)V", "", "logImpression", "()Z", "logClick", "forJsonPut", "()Lorg/json/JSONObject;", "", "toString", "()Ljava/lang/String;", "isValidCard", "", Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lorg/json/JSONObject;", "Lcom/braze/managers/m0;", "Lcom/braze/storage/ICardStorageProvider;", "Lcom/braze/analytics/b;", "", "extras", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "id", "Ljava/lang/String;", "getId", "", "created", "J", "getCreated", "()J", "expiresAt", "getExpiresAt", "isRemoved", "Z", "isPinned", "setPinned", "(Z)V", "value", "isClicked", "openUriInWebView", "getOpenUriInWebView", "getOpenUriInWebView$annotations", "()V", "isDismissibleByUser", "setDismissibleByUser", "isTest", "setTest", "url", "getUrl", "Lcom/braze/enums/CardType;", "cardType", "Lcom/braze/enums/CardType;", "getCardType", "()Lcom/braze/enums/CardType;", "wasViewedInternal", "isIndicatorHighlightedInternal", "isDismissedInternal", "enabled", "isIndicatorHighlighted", "setIndicatorHighlighted", "isDismissed", "setDismissed", "isDismissed$annotations", "viewed", "getViewed", "setViewed", "getViewed$annotations", "isExpired", "isControl", "Companion", "com/braze/models/cards/a", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class Card implements IPutIntoJson<JSONObject> {
    public static final a Companion = new a();
    private final m0 brazeManager;
    private final b cardAnalytics;
    private final ICardStorageProvider<?> cardStorage;
    private final CardType cardType;
    private final long created;
    private final long expiresAt;
    private final Map<String, String> extras;
    private final String id;
    private boolean isClicked;
    private boolean isDismissedInternal;
    private boolean isDismissibleByUser;
    private boolean isIndicatorHighlightedInternal;
    private boolean isPinned;
    private final boolean isRemoved;
    private boolean isTest;
    private final JSONObject jsonObject;
    private final boolean openUriInWebView;
    private final String url;
    private boolean wasViewedInternal;

    public Card(JSONObject jsonObject, m0 m0Var, ICardStorageProvider<?> iCardStorageProvider, b bVar) throws JSONException {
        AbstractC4862t.e(jsonObject, "jsonObject");
        this.jsonObject = jsonObject;
        this.brazeManager = m0Var;
        this.cardStorage = iCardStorageProvider;
        this.cardAnalytics = bVar;
        this.extras = JsonUtils.convertJSONObjectToMap(jsonObject.optJSONObject(CardKey.EXTRAS.getKey()));
        String string = jsonObject.getString(CardKey.ID.getKey());
        AbstractC4862t.d(string, "getString(...)");
        this.id = string;
        this.cardType = CardType.DEFAULT;
        this.wasViewedInternal = jsonObject.optBoolean(CardKey.VIEWED.getKey());
        this.isDismissedInternal = jsonObject.optBoolean(CardKey.DISMISSED.getKey(), false);
        this.isPinned = jsonObject.optBoolean(CardKey.PINNED.getKey(), false);
        this.created = jsonObject.getLong(CardKey.CREATED.getKey());
        this.expiresAt = jsonObject.optLong(CardKey.EXPIRES_AT.getKey(), -1L);
        this.openUriInWebView = jsonObject.optBoolean(CardKey.OPEN_URI_IN_WEBVIEW.getKey(), false);
        this.isRemoved = jsonObject.optBoolean(CardKey.REMOVED.getKey(), false);
        this.isDismissibleByUser = jsonObject.optBoolean(CardKey.DISMISSIBLE.getKey(), false);
        this.isIndicatorHighlightedInternal = jsonObject.optBoolean(CardKey.READ.getKey(), this.wasViewedInternal);
        this.isClicked = jsonObject.optBoolean(CardKey.CLICKED.getKey(), false);
        this.isTest = jsonObject.optBoolean(CardKey.IS_TEST.getKey(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_isDismissed_$lambda$1() {
        return "Cannot dismiss a card more than once. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_isDismissed_$lambda$3() {
        return "Failed to log card as dismissed.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_isIndicatorHighlighted_$lambda$0() {
        return "Failed to mark card indicator as highlighted.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidCard$lambda$13() {
        return "Card ID cannot be null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logClick$lambda$10(Card card) {
        return "Logged click for card with id: " + card.id;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logClick$lambda$11(Card card) {
        return "Failed to log card clicked for id: " + card.id;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logClick$lambda$12(Card card) {
        return "Failed to log card as clicked for id: " + card.id;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$4(Card card) {
        return "Logging impression event for card with id: " + card.id;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$6(Card card) {
        return "Logging control impression event for card with id: " + card.id;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$8(Card card) {
        return "Failed to log card impression for card id: " + card.id;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && AbstractC4862t.a(getClass(), other.getClass())) {
            Card card = (Card) other;
            if (this.created == card.created && AbstractC4862t.a(this.id, card.id)) {
                return true;
            }
        }
        return false;
    }

    public abstract CardType getCardType();

    public final long getCreated() {
        return this.created;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getOpenUriInWebView() {
        return this.openUriInWebView;
    }

    public String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: getViewed, reason: from getter */
    public final boolean getWasViewedInternal() {
        return this.wasViewedInternal;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        long j10 = this.created;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final boolean isControl() {
        return getCardType() == CardType.CONTROL;
    }

    /* JADX INFO: renamed from: isDismissibleByUser, reason: from getter */
    public final boolean getIsDismissibleByUser() {
        return this.isDismissibleByUser;
    }

    public final boolean isExpired() {
        long j10 = this.expiresAt;
        return j10 != -1 && j10 <= DateTimeUtils.nowInSeconds();
    }

    /* JADX INFO: renamed from: isIndicatorHighlighted, reason: from getter */
    public final boolean getIsIndicatorHighlightedInternal() {
        return this.isIndicatorHighlightedInternal;
    }

    /* JADX INFO: renamed from: isPinned, reason: from getter */
    public final boolean getIsPinned() {
        return this.isPinned;
    }

    public final boolean isValidCard() {
        if (!F.k0(this.id)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: e5.j
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Card.isValidCard$lambda$13();
            }
        }, 6, (Object) null);
        return false;
    }

    public final boolean logClick() {
        try {
            this.isClicked = true;
            if (this.brazeManager == null || this.cardAnalytics == null || this.cardStorage == null || !isValidCard()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: e5.c
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Card.logClick$lambda$11(this.f33742a);
                    }
                }, 6, (Object) null);
                return false;
            }
            b bVar = this.cardAnalytics;
            String cardId = this.id;
            ((com.braze.analytics.a) bVar).getClass();
            AbstractC4862t.e(cardId, "cardId");
            k kVarC = com.braze.models.outgoing.event.b.f28071g.c(cardId);
            if (kVarC != null) {
                ((r) this.brazeManager).a(kVarC);
            }
            this.cardStorage.markCardAsClicked(this.id);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: e5.b
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Card.logClick$lambda$10(this.f33741a);
                }
            }, 7, (Object) null);
            return true;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: e5.d
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Card.logClick$lambda$12(this.f33743a);
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean logImpression() {
        try {
            if (this.brazeManager == null || this.cardAnalytics == null || this.cardStorage == null || !isValidCard()) {
                return false;
            }
            if (isControl()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: e5.f
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Card.logImpression$lambda$6(this.f33745a);
                    }
                }, 6, (Object) null);
                b bVar = this.cardAnalytics;
                String cardId = this.id;
                ((com.braze.analytics.a) bVar).getClass();
                AbstractC4862t.e(cardId, "cardId");
                k kVarE = com.braze.models.outgoing.event.b.f28071g.e(cardId);
                if (kVarE != null) {
                    ((r) this.brazeManager).a(kVarE);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: e5.e
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Card.logImpression$lambda$4(this.f33744a);
                    }
                }, 6, (Object) null);
                b bVar2 = this.cardAnalytics;
                String cardId2 = this.id;
                ((com.braze.analytics.a) bVar2).getClass();
                AbstractC4862t.e(cardId2, "cardId");
                k kVarI = com.braze.models.outgoing.event.b.f28071g.i(cardId2);
                if (kVarI != null) {
                    ((r) this.brazeManager).a(kVarI);
                }
            }
            this.cardStorage.markCardAsViewed(this.id);
            return true;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: e5.g
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Card.logImpression$lambda$8(this.f33746a);
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final void setDismissed(boolean z10) {
        if (this.isDismissedInternal && z10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: e5.h
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Card._set_isDismissed_$lambda$1();
                }
            }, 6, (Object) null);
            return;
        }
        this.isDismissedInternal = z10;
        ICardStorageProvider<?> iCardStorageProvider = this.cardStorage;
        if (iCardStorageProvider != null) {
            iCardStorageProvider.markCardAsDismissed(this.id);
        }
        if (z10) {
            try {
                if (this.brazeManager == null || this.cardAnalytics == null || !isValidCard()) {
                    return;
                }
                b bVar = this.cardAnalytics;
                String cardId = this.id;
                ((com.braze.analytics.a) bVar).getClass();
                AbstractC4862t.e(cardId, "cardId");
                k kVarG = com.braze.models.outgoing.event.b.f28071g.g(cardId);
                if (kVarG != null) {
                    ((r) this.brazeManager).a(kVarG);
                }
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: e5.i
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Card._set_isDismissed_$lambda$3();
                    }
                }, 4, (Object) null);
            }
        }
    }

    public final void setIndicatorHighlighted(boolean z10) {
        ICardStorageProvider<?> iCardStorageProvider;
        this.isIndicatorHighlightedInternal = z10;
        if (!z10 || (iCardStorageProvider = this.cardStorage) == null) {
            return;
        }
        try {
            iCardStorageProvider.markCardAsVisuallyRead(this.id);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28624D, (Throwable) e10, false, new InterfaceC6082a() { // from class: e5.a
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Card._set_isIndicatorHighlighted_$lambda$0();
                }
            }, 4, (Object) null);
        }
    }

    public final void setViewed(boolean z10) {
        this.wasViewedInternal = z10;
        ICardStorageProvider<?> iCardStorageProvider = this.cardStorage;
        if (iCardStorageProvider != null) {
            iCardStorageProvider.markCardAsViewed(this.id);
        }
    }

    public String toString() {
        return v.n("\n            Card{\n            extras=" + this.extras + "\n            id='" + this.id + "'\n            created=" + this.created + "\n            expiresAt=" + this.expiresAt + "\n            viewed=" + this.wasViewedInternal + "\n            isRead=" + this.isIndicatorHighlightedInternal + "\n            isDismissed=" + this.isDismissedInternal + "\n            isRemoved=" + this.isRemoved + "\n            isPinned=" + this.isPinned + "\n            isClicked=" + this.isClicked + "\n            openUriInWebview=" + this.openUriInWebView + "\n            isDismissibleByUser=" + this.isDismissibleByUser + "\n            isTest=" + this.isTest + "\n            json=" + JsonUtils.getPrettyPrintedString(this.jsonObject) + "\n            }\n\n        ");
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut, reason: avoid collision after fix types in other method and from getter */
    public JSONObject getPropertiesJSONObject() {
        return this.jsonObject;
    }
}
