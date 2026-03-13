package io.flutter.plugins.inapppurchase;

import O4.AbstractC1591h;
import android.content.Context;
import io.flutter.plugins.inapppurchase.Messages;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
interface BillingClientFactory {
    AbstractC1591h createBillingClient(Context context, Messages.InAppPurchaseCallbackApi inAppPurchaseCallbackApi, Messages.PlatformBillingChoiceMode platformBillingChoiceMode, Messages.PlatformPendingPurchasesParams platformPendingPurchasesParams);
}
