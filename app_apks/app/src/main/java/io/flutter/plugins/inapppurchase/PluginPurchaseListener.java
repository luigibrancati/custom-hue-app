package io.flutter.plugins.inapppurchase;

import O4.InterfaceC1618v;
import com.android.billingclient.api.Purchase;
import io.flutter.Log;
import io.flutter.plugins.inapppurchase.Messages;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class PluginPurchaseListener implements InterfaceC1618v {
    private final Messages.InAppPurchaseCallbackApi callbackApi;

    public PluginPurchaseListener(Messages.InAppPurchaseCallbackApi inAppPurchaseCallbackApi) {
        this.callbackApi = inAppPurchaseCallbackApi;
    }

    @Override // O4.InterfaceC1618v
    public void onPurchasesUpdated(com.android.billingclient.api.a aVar, List<Purchase> list) {
        this.callbackApi.onPurchasesUpdated(new Messages.PlatformPurchasesResponse.Builder().setBillingResult(Translator.fromBillingResult(aVar)).setPurchases(Translator.fromPurchasesList(list)).build(), new Messages.VoidResult() { // from class: io.flutter.plugins.inapppurchase.PluginPurchaseListener.1
            @Override // io.flutter.plugins.inapppurchase.Messages.VoidResult
            public void error(Throwable th) {
                Log.e("IN_APP_PURCHASE", "onPurchaseUpdated handler error: " + th);
            }

            @Override // io.flutter.plugins.inapppurchase.Messages.VoidResult
            public void success() {
            }
        });
    }
}
