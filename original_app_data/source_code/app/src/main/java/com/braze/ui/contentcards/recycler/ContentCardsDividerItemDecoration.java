package com.braze.ui.contentcards.recycler;

import Bc.k;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.braze.ui.R$dimen;
import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import io.sentry.protocol.SentryThread;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/braze/ui/contentcards/recycler/ContentCardsDividerItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "parentWidth", "getSidePaddingValue", "(I)I", "Landroid/graphics/Rect;", "itemViewOutputRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$B;", SentryThread.JsonKeys.STATE, "Lfc/H;", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$B;)V", "appContext", "Landroid/content/Context;", "itemDividerHeight", "I", "contentCardsItemMaxWidth", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ContentCardsDividerItemDecoration extends RecyclerView.o {
    private final Context appContext;
    private final int contentCardsItemMaxWidth;
    private final int itemDividerHeight;

    public ContentCardsDividerItemDecoration(Context context) {
        AbstractC4862t.e(context, "context");
        Context applicationContext = context.getApplicationContext();
        AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
        this.appContext = applicationContext;
        this.itemDividerHeight = applicationContext.getResources().getDimensionPixelSize(R$dimen.com_braze_content_cards_divider_height);
        this.contentCardsItemMaxWidth = applicationContext.getResources().getDimensionPixelSize(R$dimen.com_braze_content_cards_max_width);
    }

    private final int getSidePaddingValue(int parentWidth) {
        return k.e((parentWidth - this.contentCardsItemMaxWidth) / 2, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(Rect itemViewOutputRect, View view, RecyclerView parent, RecyclerView.B state) {
        boolean zIsControlCardAtPosition;
        AbstractC4862t.e(itemViewOutputRect, "itemViewOutputRect");
        AbstractC4862t.e(view, "view");
        AbstractC4862t.e(parent, "parent");
        AbstractC4862t.e(state, "state");
        super.getItemOffsets(itemViewOutputRect, view, parent, state);
        int iF0 = parent.f0(view);
        if (parent.getAdapter() instanceof ContentCardAdapter) {
            RecyclerView.h adapter = parent.getAdapter();
            AbstractC4862t.c(adapter, "null cannot be cast to non-null type com.braze.ui.contentcards.adapters.ContentCardAdapter");
            zIsControlCardAtPosition = ((ContentCardAdapter) adapter).isControlCardAtPosition(iF0);
        } else {
            zIsControlCardAtPosition = false;
        }
        itemViewOutputRect.top = iF0 == 0 ? this.itemDividerHeight : 0;
        itemViewOutputRect.bottom = zIsControlCardAtPosition ? 0 : this.itemDividerHeight;
        int sidePaddingValue = getSidePaddingValue(parent.getWidth());
        itemViewOutputRect.left = sidePaddingValue;
        itemViewOutputRect.right = sidePaddingValue;
    }
}
