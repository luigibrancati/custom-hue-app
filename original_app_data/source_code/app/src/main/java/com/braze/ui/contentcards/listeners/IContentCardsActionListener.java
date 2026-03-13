package com.braze.ui.contentcards.listeners;

import android.content.Context;
import com.braze.models.cards.Card;
import com.braze.ui.actions.IAction;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/braze/ui/contentcards/listeners/IContentCardsActionListener;", "", "Landroid/content/Context;", "context", "Lcom/braze/models/cards/Card;", "card", "Lcom/braze/ui/actions/IAction;", "cardAction", "", "onContentCardClicked", "(Landroid/content/Context;Lcom/braze/models/cards/Card;Lcom/braze/ui/actions/IAction;)Z", "Lfc/H;", "onContentCardDismissed", "(Landroid/content/Context;Lcom/braze/models/cards/Card;)V", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IContentCardsActionListener {
    default boolean onContentCardClicked(Context context, Card card, IAction cardAction) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(card, "card");
        return false;
    }

    default void onContentCardDismissed(Context context, Card card) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(card, "card");
    }
}
