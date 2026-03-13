package com.braze.models.cards;

import Od.v;
import com.braze.analytics.b;
import com.braze.enums.CardKey;
import com.braze.enums.CardType;
import com.braze.managers.m0;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.JsonUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000eR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0013\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/braze/models/cards/ImageOnlyCard;", "Lcom/braze/models/cards/Card;", "Lorg/json/JSONObject;", "jsonObject", "Lcom/braze/managers/m0;", "manager", "Lcom/braze/storage/ICardStorageProvider;", "cardStorageProvider", "Lcom/braze/analytics/b;", "cardAnalyticsProvider", "<init>", "(Lorg/json/JSONObject;Lcom/braze/managers/m0;Lcom/braze/storage/ICardStorageProvider;Lcom/braze/analytics/b;)V", "", "toString", "()Ljava/lang/String;", "imageUrl", "Ljava/lang/String;", "getImageUrl", "altImageText", "getAltImageText", "url", "getUrl", "", "aspectRatio", "F", "getAspectRatio", "()F", "Lcom/braze/enums/CardType;", "cardType", "Lcom/braze/enums/CardType;", "getCardType", "()Lcom/braze/enums/CardType;", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImageOnlyCard extends Card {
    private final String altImageText;
    private final float aspectRatio;
    private final CardType cardType;
    private final String imageUrl;
    private final String url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageOnlyCard(JSONObject jsonObject, m0 m0Var, ICardStorageProvider<?> iCardStorageProvider, b bVar) throws JSONException {
        super(jsonObject, m0Var, iCardStorageProvider, bVar);
        AbstractC4862t.e(jsonObject, "jsonObject");
        String string = jsonObject.getString(CardKey.IMAGE_ONLY_IMAGE.getKey());
        AbstractC4862t.d(string, "getString(...)");
        this.imageUrl = string;
        this.altImageText = JsonUtils.getOptionalString(jsonObject, CardKey.IMAGE_ONLY_ALT_IMAGE.getKey());
        this.url = JsonUtils.getOptionalString(jsonObject, CardKey.IMAGE_ONLY_URL.getKey());
        this.aspectRatio = (float) jsonObject.optDouble(CardKey.IMAGE_ONLY_ASPECT_RATIO.getKey(), 0.0d);
        this.cardType = CardType.IMAGE;
    }

    public final String getAltImageText() {
        return this.altImageText;
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    @Override // com.braze.models.cards.Card
    public CardType getCardType() {
        return this.cardType;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Override // com.braze.models.cards.Card
    public String getUrl() {
        return this.url;
    }

    @Override // com.braze.models.cards.Card
    public String toString() {
        return v.n("\n            ImageOnlyCard{imageUrl='" + this.imageUrl + "'\n            url='" + getUrl() + "'\n            aspectRatio=" + this.aspectRatio + "\n            " + super.toString() + "}\n            \n        ");
    }
}
