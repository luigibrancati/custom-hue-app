package com.braze.ui.inappmessage.factories;

import android.R;
import android.content.res.Resources;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.braze.enums.inappmessage.SlideFrom;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageSlideup;
import com.braze.ui.inappmessage.IInAppMessageAnimationFactory;
import com.braze.ui.support.AnimationUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/braze/ui/inappmessage/factories/DefaultInAppMessageAnimationFactory;", "Lcom/braze/ui/inappmessage/IInAppMessageAnimationFactory;", "<init>", "()V", "shortAnimationDurationMs", "", "getOpeningAnimation", "Landroid/view/animation/Animation;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "getClosingAnimation", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class DefaultInAppMessageAnimationFactory implements IInAppMessageAnimationFactory {
    private final long shortAnimationDurationMs = Resources.getSystem().getInteger(R.integer.config_shortAnimTime);

    @Override // com.braze.ui.inappmessage.IInAppMessageAnimationFactory
    public Animation getClosingAnimation(IInAppMessage inAppMessage) {
        AbstractC4862t.e(inAppMessage, "inAppMessage");
        return inAppMessage instanceof InAppMessageSlideup ? ((InAppMessageSlideup) inAppMessage).getSlideFrom() == SlideFrom.TOP ? AnimationUtils.createVerticalAnimation(0.0f, -1.0f, this.shortAnimationDurationMs, false) : AnimationUtils.createVerticalAnimation(0.0f, 1.0f, this.shortAnimationDurationMs, false) : AnimationUtils.setAnimationParams(new AlphaAnimation(1.0f, 0.0f), this.shortAnimationDurationMs, false);
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageAnimationFactory
    public Animation getOpeningAnimation(IInAppMessage inAppMessage) {
        AbstractC4862t.e(inAppMessage, "inAppMessage");
        return inAppMessage instanceof InAppMessageSlideup ? ((InAppMessageSlideup) inAppMessage).getSlideFrom() == SlideFrom.TOP ? AnimationUtils.createVerticalAnimation(-1.0f, 0.0f, this.shortAnimationDurationMs, false) : AnimationUtils.createVerticalAnimation(1.0f, 0.0f, this.shortAnimationDurationMs, false) : AnimationUtils.setAnimationParams(new AlphaAnimation(0.0f, 1.0f), this.shortAnimationDurationMs, true);
    }
}
