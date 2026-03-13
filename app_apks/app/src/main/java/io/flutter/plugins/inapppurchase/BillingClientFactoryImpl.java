package io.flutter.plugins.inapppurchase;

import O4.AbstractC1591h;
import O4.InterfaceC1626z;
import android.content.Context;
import io.flutter.Log;
import io.flutter.plugins.inapppurchase.Messages;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class BillingClientFactoryImpl implements BillingClientFactory {

    /* JADX INFO: renamed from: io.flutter.plugins.inapppurchase.BillingClientFactoryImpl$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformBillingChoiceMode;

        static {
            int[] iArr = new int[Messages.PlatformBillingChoiceMode.values().length];
            $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformBillingChoiceMode = iArr;
            try {
                iArr[Messages.PlatformBillingChoiceMode.ALTERNATIVE_BILLING_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformBillingChoiceMode[Messages.PlatformBillingChoiceMode.USER_CHOICE_BILLING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformBillingChoiceMode[Messages.PlatformBillingChoiceMode.PLAY_BILLING_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createUserChoiceBillingListener$0(Messages.InAppPurchaseCallbackApi inAppPurchaseCallbackApi, O4.A a10) {
        inAppPurchaseCallbackApi.userSelectedalternativeBilling(Translator.fromUserChoiceDetails(a10), new Messages.VoidResult() { // from class: io.flutter.plugins.inapppurchase.BillingClientFactoryImpl.1
            @Override // io.flutter.plugins.inapppurchase.Messages.VoidResult
            public void error(Throwable th) {
                Log.e("IN_APP_PURCHASE", "userSelectedalternativeBilling handler error: " + th);
            }

            @Override // io.flutter.plugins.inapppurchase.Messages.VoidResult
            public void success() {
            }
        });
    }

    @Override // io.flutter.plugins.inapppurchase.BillingClientFactory
    public AbstractC1591h createBillingClient(Context context, Messages.InAppPurchaseCallbackApi inAppPurchaseCallbackApi, Messages.PlatformBillingChoiceMode platformBillingChoiceMode, Messages.PlatformPendingPurchasesParams platformPendingPurchasesParams) {
        AbstractC1591h.a aVarC = AbstractC1591h.j(context).c(Translator.toPendingPurchasesParams(platformPendingPurchasesParams));
        int i10 = AnonymousClass2.$SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformBillingChoiceMode[platformBillingChoiceMode.ordinal()];
        if (i10 == 1) {
            aVarC.b();
        } else if (i10 == 2) {
            aVarC.d(createUserChoiceBillingListener(inAppPurchaseCallbackApi));
        } else if (i10 != 3) {
            Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + platformBillingChoiceMode + ", Defaulting to PLAY_BILLING_ONLY");
        }
        return aVarC.e(new PluginPurchaseListener(inAppPurchaseCallbackApi)).a();
    }

    public InterfaceC1626z createUserChoiceBillingListener(final Messages.InAppPurchaseCallbackApi inAppPurchaseCallbackApi) {
        return new InterfaceC1626z() { // from class: io.flutter.plugins.inapppurchase.a
            @Override // O4.InterfaceC1626z
            public final void a(O4.A a10) {
                this.f37953a.lambda$createUserChoiceBillingListener$0(inAppPurchaseCallbackApi, a10);
            }
        };
    }
}
