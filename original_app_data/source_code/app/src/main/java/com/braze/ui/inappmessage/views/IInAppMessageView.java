package com.braze.ui.inappmessage.views;

import Y0.S;
import android.view.View;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lcom/braze/ui/inappmessage/views/IInAppMessageView;", "", "LY0/S;", "insets", "Lfc/H;", "applyWindowInsets", "(LY0/S;)V", "Landroid/view/View;", "getMessageClickableView", "()Landroid/view/View;", "messageClickableView", "", "getHasAppliedWindowInsets", "()Z", "setHasAppliedWindowInsets", "(Z)V", "hasAppliedWindowInsets", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IInAppMessageView {
    void applyWindowInsets(S insets);

    boolean getHasAppliedWindowInsets();

    View getMessageClickableView();
}
