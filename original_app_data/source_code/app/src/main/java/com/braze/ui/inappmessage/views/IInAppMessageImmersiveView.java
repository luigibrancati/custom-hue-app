package com.braze.ui.inappmessage.views;

import android.view.View;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/braze/ui/inappmessage/views/IInAppMessageImmersiveView;", "Lcom/braze/ui/inappmessage/views/IInAppMessageView;", "", "numButtons", "", "Landroid/view/View;", "getMessageButtonViews", "(I)Ljava/util/List;", "getMessageCloseButtonView", "()Landroid/view/View;", "messageCloseButtonView", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IInAppMessageImmersiveView extends IInAppMessageView {
    List<View> getMessageButtonViews(int numButtons);

    View getMessageCloseButtonView();
}
