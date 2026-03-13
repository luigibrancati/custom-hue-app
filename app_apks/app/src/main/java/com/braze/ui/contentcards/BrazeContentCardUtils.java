package com.braze.ui.contentcards;

import android.os.Bundle;
import com.braze.enums.Channel;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.UriAction;
import com.braze.ui.actions.brazeactions.BrazeActionUtils;
import com.braze.ui.contentcards.BrazeContentCardUtils;
import gc.C4179C;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/braze/ui/contentcards/BrazeContentCardUtils;", "", "<init>", "()V", "", "Lcom/braze/models/cards/Card;", "cards", "defaultCardHandling", "(Ljava/util/List;)Ljava/util/List;", "card", "Lcom/braze/ui/actions/UriAction;", "getUriActionForCard", "(Lcom/braze/models/cards/Card;)Lcom/braze/ui/actions/UriAction;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BrazeContentCardUtils {
    public static final BrazeContentCardUtils INSTANCE = new BrazeContentCardUtils();

    private BrazeContentCardUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int defaultCardHandling$lambda$0(Card cardA, Card cardB) {
        AbstractC4862t.e(cardA, "cardA");
        AbstractC4862t.e(cardB, "cardB");
        if (cardA.getIsPinned() && !cardB.getIsPinned()) {
            return -1;
        }
        if (!cardA.getIsPinned() && cardB.getIsPinned()) {
            return 1;
        }
        if (cardA.getCreated() > cardB.getCreated()) {
            return -1;
        }
        if (cardA.getCreated() < cardB.getCreated()) {
            return 1;
        }
        if (cardA.getId().compareTo(cardB.getId()) > 0) {
            return -1;
        }
        return cardA.getId().compareTo(cardB.getId()) < 0 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getUriActionForCard$lambda$2() {
        return "Card URL is null, returning null for getUriActionForCard";
    }

    public final List<Card> defaultCardHandling(List<? extends Card> cards) {
        AbstractC4862t.e(cards, "cards");
        Comparator comparator = new Comparator() { // from class: F5.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return BrazeContentCardUtils.defaultCardHandling$lambda$0((Card) obj, (Card) obj2);
            }
        };
        ArrayList arrayList = new ArrayList();
        for (Object obj : cards) {
            if (!BrazeActionUtils.containsInvalidBrazeAction((Card) obj)) {
                arrayList.add(obj);
            }
        }
        return C4179C.J0(arrayList, comparator);
    }

    public final UriAction getUriActionForCard(Card card) {
        AbstractC4862t.e(card, "card");
        String url = card.getUrl();
        if (url == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: F5.a
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeContentCardUtils.getUriActionForCard$lambda$2();
                }
            }, 6, (Object) null);
            return null;
        }
        Bundle bundle = new Bundle();
        for (String str : card.getExtras().keySet()) {
            bundle.putString(str, card.getExtras().get(str));
        }
        return BrazeDeeplinkHandler.INSTANCE.getInstance().createUriActionFromUrlString(url, bundle, card.getOpenUriInWebView(), Channel.CONTENT_CARD);
    }
}
