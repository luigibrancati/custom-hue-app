package com.braze.ui.actions.brazeactions.steps;

import Bc.f;
import android.content.Context;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.UriAction;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/braze/ui/actions/brazeactions/steps/OpenLinkExternallyStep;", "Lcom/braze/ui/actions/brazeactions/steps/BaseBrazeActionStep;", "<init>", "()V", "Lcom/braze/ui/actions/brazeactions/steps/StepData;", "data", "", "isValid", "(Lcom/braze/ui/actions/brazeactions/steps/StepData;)Z", "Landroid/content/Context;", "context", "Lfc/H;", "run", "(Landroid/content/Context;Lcom/braze/ui/actions/brazeactions/steps/StepData;)V", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OpenLinkExternallyStep extends BaseBrazeActionStep {
    public static final OpenLinkExternallyStep INSTANCE = new OpenLinkExternallyStep();

    private OpenLinkExternallyStep() {
        super(null);
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(StepData data) {
        AbstractC4862t.e(data, "data");
        return StepData.isArgCountInBounds$default(data, 0, new f(1, 2), 1, null) && data.isArgString(0);
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(Context context, StepData data) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(data, "data");
        String strValueOf = String.valueOf(data.getFirstArg());
        IBrazeDeeplinkHandler companion = BrazeDeeplinkHandler.INSTANCE.getInstance();
        UriAction uriActionCreateUriActionFromUrlString = companion.createUriActionFromUrlString(strValueOf, null, false, data.getChannel());
        if (uriActionCreateUriActionFromUrlString != null) {
            companion.gotoUri(context, uriActionCreateUriActionFromUrlString);
        }
    }
}
