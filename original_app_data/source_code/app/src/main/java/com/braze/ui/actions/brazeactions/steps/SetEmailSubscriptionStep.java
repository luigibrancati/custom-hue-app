package com.braze.ui.actions.brazeactions.steps;

import android.content.Context;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.support.BrazeLogger;
import com.braze.ui.actions.brazeactions.steps.SetEmailSubscriptionStep;
import fc.C4015H;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/braze/ui/actions/brazeactions/steps/SetEmailSubscriptionStep;", "Lcom/braze/ui/actions/brazeactions/steps/BaseBrazeActionStep;", "<init>", "()V", "Lcom/braze/ui/actions/brazeactions/steps/StepData;", "data", "", "isValid", "(Lcom/braze/ui/actions/brazeactions/steps/StepData;)Z", "Landroid/content/Context;", "context", "Lfc/H;", "run", "(Landroid/content/Context;Lcom/braze/ui/actions/brazeactions/steps/StepData;)V", "", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SetEmailSubscriptionStep extends BaseBrazeActionStep {
    public static final SetEmailSubscriptionStep INSTANCE;
    private static final String TAG;

    static {
        SetEmailSubscriptionStep setEmailSubscriptionStep = new SetEmailSubscriptionStep();
        INSTANCE = setEmailSubscriptionStep;
        TAG = BrazeLogger.INSTANCE.brazeLogTag(setEmailSubscriptionStep);
    }

    private SetEmailSubscriptionStep() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String run$lambda$1(StepData stepData) {
        return "Could not parse subscription type from data: " + stepData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H run$lambda$2(NotificationSubscriptionType notificationSubscriptionType, BrazeUser it) {
        AbstractC4862t.e(it, "it");
        it.setEmailNotificationSubscriptionType(notificationSubscriptionType);
        return C4015H.f34254a;
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(StepData data) {
        AbstractC4862t.e(data, "data");
        return StepData.isArgCountInBounds$default(data, 1, null, 2, null) && data.isArgString(0);
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(Context context, final StepData data) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(data, "data");
        final NotificationSubscriptionType notificationSubscriptionTypeFromValue = NotificationSubscriptionType.INSTANCE.fromValue(String.valueOf(data.getFirstArg()));
        if (notificationSubscriptionTypeFromValue == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: B5.g
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return SetEmailSubscriptionStep.run$lambda$1(data);
                }
            }, 7, (Object) null);
        } else {
            BaseBrazeActionStep.INSTANCE.runOnUser$android_sdk_ui_release(Braze.INSTANCE.getInstance(context), new l() { // from class: B5.h
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return SetEmailSubscriptionStep.run$lambda$2(notificationSubscriptionTypeFromValue, (BrazeUser) obj);
                }
            });
        }
    }
}
