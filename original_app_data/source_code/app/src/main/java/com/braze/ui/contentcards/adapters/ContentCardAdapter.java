package com.braze.ui.contentcards.adapters;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler;
import com.braze.ui.contentcards.listeners.IContentCardsActionListener;
import com.braze.ui.contentcards.managers.BrazeContentCardsManager;
import com.braze.ui.contentcards.recycler.ItemTouchHelperAdapter;
import com.braze.ui.contentcards.view.ContentCardViewHolder;
import gc.C4179C;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001IB-\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b$\u0010\u0013J\u0017\u0010&\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010'J\u0017\u0010*\u001a\u00020)2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b*\u0010+J\u001b\u0010.\u001a\u00020\u001b2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0,¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u001b¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u000f¢\u0006\u0004\b3\u0010\u0013J\u0019\u00104\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u000fH\u0007¢\u0006\u0004\b6\u0010\u0013J\u0019\u00108\u001a\u00020\u001b2\b\u00107\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b8\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010;R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010<R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001c\u0010C\u001a\b\u0012\u0004\u0012\u00020B0A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR0\u0010E\u001a\b\u0012\u0004\u0012\u00020B0,2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020B0,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010/¨\u0006J"}, d2 = {"Lcom/braze/ui/contentcards/adapters/ContentCardAdapter;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "Lcom/braze/ui/contentcards/recycler/ItemTouchHelperAdapter;", "Landroid/content/Context;", "context", "Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", "", "Lcom/braze/models/cards/Card;", "cardData", "Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "contentCardsViewBindingHandler", "<init>", "(Landroid/content/Context;Landroidx/recyclerview/widget/LinearLayoutManager;Ljava/util/List;Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;)V", "", "index", "", "isInvalidIndex", "(I)Z", "Landroid/view/ViewGroup;", "viewGroup", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "viewHolder", "position", "Lfc/H;", "onBindViewHolder", "(Lcom/braze/ui/contentcards/view/ContentCardViewHolder;I)V", "getItemViewType", "(I)I", "getItemCount", "()I", "onItemDismiss", "(I)V", "isItemDismissable", "holder", "onViewAttachedToWindow", "(Lcom/braze/ui/contentcards/view/ContentCardViewHolder;)V", "onViewDetachedFromWindow", "", "getItemId", "(I)J", "", "newCardData", "replaceCards", "(Ljava/util/List;)V", "markOnScreenCardsAsRead", "()V", "adapterPosition", "isControlCardAtPosition", "getCardAtIndex", "(I)Lcom/braze/models/cards/Card;", "isAdapterPositionOnScreen", "card", "logImpression", "(Lcom/braze/models/cards/Card;)V", "Landroid/content/Context;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Ljava/util/List;", "Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "", "", "impressedCardIdsInternal", "Ljava/util/Set;", "impressedCardIds", "getImpressedCardIds", "()Ljava/util/List;", "setImpressedCardIds", "CardListDiffCallback", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ContentCardAdapter extends RecyclerView.h implements ItemTouchHelperAdapter {
    private final List<Card> cardData;
    private final IContentCardsViewBindingHandler contentCardsViewBindingHandler;
    private final Context context;
    private final Handler handler;
    private Set<String> impressedCardIdsInternal;
    private final LinearLayoutManager layoutManager;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/braze/ui/contentcards/adapters/ContentCardAdapter$CardListDiffCallback;", "Landroidx/recyclerview/widget/e$b;", "", "Lcom/braze/models/cards/Card;", "oldCards", "newCards", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "oldItemPosition", "newItemPosition", "", "doItemsShareIds", "(II)Z", "getOldListSize", "()I", "getNewListSize", "areItemsTheSame", "areContentsTheSame", "Ljava/util/List;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CardListDiffCallback extends e.b {
        private final List<Card> newCards;
        private final List<Card> oldCards;

        /* JADX WARN: Multi-variable type inference failed */
        public CardListDiffCallback(List<? extends Card> oldCards, List<? extends Card> newCards) {
            AbstractC4862t.e(oldCards, "oldCards");
            AbstractC4862t.e(newCards, "newCards");
            this.oldCards = oldCards;
            this.newCards = newCards;
        }

        private final boolean doItemsShareIds(int oldItemPosition, int newItemPosition) {
            return AbstractC4862t.a(this.oldCards.get(oldItemPosition).getId(), this.newCards.get(newItemPosition).getId());
        }

        @Override // androidx.recyclerview.widget.e.b
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            return doItemsShareIds(oldItemPosition, newItemPosition);
        }

        @Override // androidx.recyclerview.widget.e.b
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
            return doItemsShareIds(oldItemPosition, newItemPosition);
        }

        @Override // androidx.recyclerview.widget.e.b
        public int getNewListSize() {
            return this.newCards.size();
        }

        @Override // androidx.recyclerview.widget.e.b
        public int getOldListSize() {
            return this.oldCards.size();
        }
    }

    public ContentCardAdapter(Context context, LinearLayoutManager layoutManager, List<Card> cardData, IContentCardsViewBindingHandler contentCardsViewBindingHandler) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(layoutManager, "layoutManager");
        AbstractC4862t.e(cardData, "cardData");
        AbstractC4862t.e(contentCardsViewBindingHandler, "contentCardsViewBindingHandler");
        this.context = context;
        this.layoutManager = layoutManager;
        this.cardData = cardData;
        this.contentCardsViewBindingHandler = contentCardsViewBindingHandler;
        this.handler = new Handler(Looper.getMainLooper());
        this.impressedCardIdsInternal = new LinkedHashSet();
        setHasStableIds(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCardAtIndex$lambda$7(int i10, ContentCardAdapter contentCardAdapter) {
        return "Cannot return card at index: " + i10 + " in cards list of size: " + contentCardAdapter.cardData.size();
    }

    private final boolean isInvalidIndex(int index) {
        return index < 0 || index >= this.cardData.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$8(Card card) {
        return "Logged impression for card " + card.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$9(Card card) {
        return "Already counted impression for card " + card.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String markOnScreenCardsAsRead$lambda$4() {
        return "Card list is empty. Not marking on-screen cards as read.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String markOnScreenCardsAsRead$lambda$5(int i10, int i11) {
        return "Not marking all on-screen cards as read. Either the first or last index is negative. First visible: " + i10 + " . Last visible: " + i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void markOnScreenCardsAsRead$lambda$6(int i10, int i11, ContentCardAdapter contentCardAdapter) {
        contentCardAdapter.notifyItemRangeChanged(i11, (i10 - i11) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onItemDismiss$lambda$0(int i10, ContentCardAdapter contentCardAdapter) {
        return "Cannot dismiss card at index: " + i10 + " in cards list of size: " + contentCardAdapter.cardData.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onViewAttachedToWindow$lambda$1(int i10) {
        return "The card at position " + i10 + " isn't on screen or does not have a valid adapter position. Not logging impression.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onViewDetachedFromWindow$lambda$2(int i10) {
        return "The card at position " + i10 + " isn't on screen or does not have a valid adapter position. Not marking as read.";
    }

    public final Card getCardAtIndex(final int index) {
        if (!isInvalidIndex(index)) {
            return this.cardData.get(index);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: G5.c
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return ContentCardAdapter.getCardAtIndex$lambda$7(index, this);
            }
        }, 7, (Object) null);
        return null;
    }

    public final List<String> getImpressedCardIds() {
        return C4179C.V0(this.impressedCardIdsInternal);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.cardData.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int position) {
        String id2;
        Card cardAtIndex = getCardAtIndex(position);
        if (cardAtIndex == null || (id2 = cardAtIndex.getId()) == null) {
            return 0L;
        }
        return id2.hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int position) {
        return this.contentCardsViewBindingHandler.getItemViewType(this.context, this.cardData, position);
    }

    public final boolean isAdapterPositionOnScreen(int adapterPosition) {
        return Math.min(this.layoutManager.a2(), this.layoutManager.W1()) <= adapterPosition && adapterPosition <= Math.max(this.layoutManager.d2(), this.layoutManager.b2());
    }

    public final boolean isControlCardAtPosition(int adapterPosition) {
        Card cardAtIndex = getCardAtIndex(adapterPosition);
        return cardAtIndex != null && cardAtIndex.isControl();
    }

    @Override // com.braze.ui.contentcards.recycler.ItemTouchHelperAdapter
    public boolean isItemDismissable(int position) {
        if (this.cardData.isEmpty() || isInvalidIndex(position)) {
            return false;
        }
        return this.cardData.get(position).getIsDismissibleByUser();
    }

    public final void logImpression(final Card card) {
        if (card == null) {
            return;
        }
        if (this.impressedCardIdsInternal.contains(card.getId())) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: G5.g
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return ContentCardAdapter.logImpression$lambda$9(card);
                }
            }, 6, (Object) null);
        } else {
            card.logImpression();
            this.impressedCardIdsInternal.add(card.getId());
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: G5.f
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return ContentCardAdapter.logImpression$lambda$8(card);
                }
            }, 6, (Object) null);
        }
        if (card.getWasViewedInternal()) {
            return;
        }
        card.setViewed(true);
    }

    public final void markOnScreenCardsAsRead() {
        if (this.cardData.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: G5.h
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return ContentCardAdapter.markOnScreenCardsAsRead$lambda$4();
                }
            }, 7, (Object) null);
            return;
        }
        final int iA2 = this.layoutManager.a2();
        final int iD2 = this.layoutManager.d2();
        if (iA2 < 0 || iD2 < 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: G5.i
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return ContentCardAdapter.markOnScreenCardsAsRead$lambda$5(iA2, iD2);
                }
            }, 7, (Object) null);
            return;
        }
        if (iA2 <= iD2) {
            int i10 = iA2;
            while (true) {
                Card cardAtIndex = getCardAtIndex(i10);
                if (cardAtIndex != null) {
                    cardAtIndex.setIndicatorHighlighted(true);
                }
                if (i10 == iD2) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.handler.post(new Runnable() { // from class: G5.j
            @Override // java.lang.Runnable
            public final void run() {
                ContentCardAdapter.markOnScreenCardsAsRead$lambda$6(iD2, iA2, this);
            }
        });
    }

    @Override // com.braze.ui.contentcards.recycler.ItemTouchHelperAdapter
    public void onItemDismiss(final int position) {
        if (isInvalidIndex(position)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: G5.b
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return ContentCardAdapter.onItemDismiss$lambda$0(position, this);
                }
            }, 7, (Object) null);
            return;
        }
        Card cardRemove = this.cardData.remove(position);
        cardRemove.setDismissed(true);
        notifyItemRemoved(position);
        IContentCardsActionListener contentCardsActionListener = BrazeContentCardsManager.INSTANCE.getInstance().getContentCardsActionListener();
        if (contentCardsActionListener != null) {
            contentCardsActionListener.onContentCardDismissed(this.context, cardRemove);
        }
    }

    public final synchronized void replaceCards(List<? extends Card> newCardData) {
        AbstractC4862t.e(newCardData, "newCardData");
        e.C0311e c0311eB = e.b(new CardListDiffCallback(this.cardData, newCardData));
        AbstractC4862t.d(c0311eB, "calculateDiff(...)");
        this.cardData.clear();
        this.cardData.addAll(newCardData);
        c0311eB.c(this);
    }

    public final void setImpressedCardIds(List<String> impressedCardIds) {
        AbstractC4862t.e(impressedCardIds, "impressedCardIds");
        this.impressedCardIdsInternal = C4179C.Y0(impressedCardIds);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(ContentCardViewHolder viewHolder, int position) {
        AbstractC4862t.e(viewHolder, "viewHolder");
        this.contentCardsViewBindingHandler.onBindViewHolder(this.context, this.cardData, viewHolder, position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public ContentCardViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        AbstractC4862t.e(viewGroup, "viewGroup");
        return this.contentCardsViewBindingHandler.onCreateViewHolder(this.context, this.cardData, viewGroup, viewType);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewAttachedToWindow(ContentCardViewHolder holder) {
        AbstractC4862t.e(holder, "holder");
        super.onViewAttachedToWindow((RecyclerView.E) holder);
        if (this.cardData.isEmpty()) {
            return;
        }
        final int bindingAdapterPosition = holder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1 || !isAdapterPositionOnScreen(bindingAdapterPosition)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: G5.a
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return ContentCardAdapter.onViewAttachedToWindow$lambda$1(bindingAdapterPosition);
                }
            }, 6, (Object) null);
        } else {
            logImpression(getCardAtIndex(bindingAdapterPosition));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewDetachedFromWindow(ContentCardViewHolder holder) {
        AbstractC4862t.e(holder, "holder");
        super.onViewDetachedFromWindow((RecyclerView.E) holder);
        if (this.cardData.isEmpty()) {
            return;
        }
        final int bindingAdapterPosition = holder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1 || !isAdapterPositionOnScreen(bindingAdapterPosition)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: G5.d
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return ContentCardAdapter.onViewDetachedFromWindow$lambda$2(bindingAdapterPosition);
                }
            }, 6, (Object) null);
            return;
        }
        Card cardAtIndex = getCardAtIndex(bindingAdapterPosition);
        if (cardAtIndex == null || cardAtIndex.getIsIndicatorHighlightedInternal()) {
            return;
        }
        cardAtIndex.setIndicatorHighlighted(true);
        this.handler.post(new Runnable() { // from class: G5.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f4524a.notifyItemChanged(bindingAdapterPosition);
            }
        });
    }
}
