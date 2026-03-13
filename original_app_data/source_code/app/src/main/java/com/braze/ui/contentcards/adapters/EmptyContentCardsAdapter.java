package com.braze.ui.contentcards.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.braze.ui.R$layout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/braze/ui/contentcards/adapters/EmptyContentCardsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$E;", "<init>", "()V", "Landroid/view/ViewGroup;", "viewGroup", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$E;", "viewHolder", "position", "Lfc/H;", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$E;I)V", "getItemCount", "()I", "NetworkUnavailableViewHolder", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class EmptyContentCardsAdapter extends RecyclerView.h {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/braze/ui/contentcards/adapters/EmptyContentCardsAdapter$NetworkUnavailableViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$E;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NetworkUnavailableViewHolder extends RecyclerView.E {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkUnavailableViewHolder(View view) {
            super(view);
            AbstractC4862t.e(view, "view");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.E viewHolder, int position) {
        AbstractC4862t.e(viewHolder, "viewHolder");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.E onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        AbstractC4862t.e(viewGroup, "viewGroup");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.com_braze_content_cards_empty, viewGroup, false);
        AbstractC4862t.b(viewInflate);
        return new NetworkUnavailableViewHolder(viewInflate);
    }
}
