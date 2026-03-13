package io.flutter.plugins.inapppurchase;

import O4.AbstractC1591h;
import O4.C1579b;
import O4.C1587f;
import O4.C1597k;
import O4.C1601m;
import O4.C1603n;
import O4.C1607p;
import O4.C1620w;
import O4.C1622x;
import O4.C1624y;
import O4.InterfaceC1581c;
import O4.InterfaceC1583d;
import O4.InterfaceC1585e;
import O4.InterfaceC1589g;
import O4.InterfaceC1595j;
import O4.InterfaceC1599l;
import O4.InterfaceC1605o;
import O4.InterfaceC1612s;
import O4.InterfaceC1614t;
import O4.InterfaceC1616u;
import O4.r;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import io.flutter.plugins.inapppurchase.Messages;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class MethodCallHandlerImpl implements Application.ActivityLifecycleCallbacks, Messages.InAppPurchaseApi {
    static final String ACTIVITY_UNAVAILABLE = "ACTIVITY_UNAVAILABLE";
    private static final String LOAD_PRODUCT_DOC_URL = "https://github.com/flutter/packages/blob/main/packages/in_app_purchase/in_app_purchase/README.md#loading-products-for-sale";
    static final Messages.PlatformReplacementMode REPLACEMENT_MODE_UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY = Messages.PlatformReplacementMode.UNKNOWN_REPLACEMENT_MODE;
    private static final String TAG = "InAppPurchasePlugin";
    private Activity activity;
    private final Context applicationContext;
    private AbstractC1591h billingClient;
    private final BillingClientFactory billingClientFactory;
    private final HashMap<String, O4.r> cachedProducts = new HashMap<>();
    final Messages.InAppPurchaseCallbackApi callbackApi;

    public MethodCallHandlerImpl(Activity activity, Context context, Messages.InAppPurchaseCallbackApi inAppPurchaseCallbackApi, BillingClientFactory billingClientFactory) {
        this.billingClientFactory = billingClientFactory;
        this.applicationContext = context;
        this.activity = activity;
        this.callbackApi = inAppPurchaseCallbackApi;
    }

    private void endBillingClientConnection() {
        AbstractC1591h abstractC1591h = this.billingClient;
        if (abstractC1591h != null) {
            abstractC1591h.d();
            this.billingClient = null;
        }
    }

    private Messages.FlutterError getNullBillingClientError() {
        return new Messages.FlutterError("UNAVAILABLE", "BillingClient is unset. Try reconnecting.", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryProductDetailsAsync$4(Messages.Result result, com.android.billingclient.api.a aVar, List list) {
        updateCachedProducts(list);
        result.success(new Messages.PlatformProductDetailsResponse.Builder().setBillingResult(Translator.fromBillingResult(aVar)).setProductDetails(Translator.fromProductDetailsList(list)).build());
    }

    @Override // io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi
    public void acknowledgePurchase(String str, final Messages.Result<Messages.PlatformBillingResult> result) {
        if (this.billingClient == null) {
            result.error(getNullBillingClientError());
            return;
        }
        try {
            this.billingClient.a(C1579b.b().b(str).a(), new InterfaceC1581c() { // from class: io.flutter.plugins.inapppurchase.w
                @Override // O4.InterfaceC1581c
                public final void a(com.android.billingclient.api.a aVar) {
                    result.success(Translator.fromBillingResult(aVar));
                }
            });
        } catch (RuntimeException e10) {
            result.error(new Messages.FlutterError("error", e10.getMessage(), Log.getStackTraceString(e10)));
        }
    }

    @Override // io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi
    public void consumeAsync(String str, final Messages.Result<Messages.PlatformBillingResult> result) {
        if (this.billingClient == null) {
            result.error(getNullBillingClientError());
            return;
        }
        try {
            InterfaceC1605o interfaceC1605o = new InterfaceC1605o() { // from class: io.flutter.plugins.inapppurchase.v
                @Override // O4.InterfaceC1605o
                public final void a(com.android.billingclient.api.a aVar, String str2) {
                    result.success(Translator.fromBillingResult(aVar));
                }
            };
            this.billingClient.b(C1603n.b().b(str).a(), interfaceC1605o);
        } catch (RuntimeException e10) {
            result.error(new Messages.FlutterError("error", e10.getMessage(), Log.getStackTraceString(e10)));
        }
    }

    @Override // io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi
    public void createAlternativeBillingOnlyReportingDetailsAsync(final Messages.Result<Messages.PlatformAlternativeBillingOnlyReportingDetailsResponse> result) {
        AbstractC1591h abstractC1591h = this.billingClient;
        if (abstractC1591h == null) {
            result.error(getNullBillingClientError());
            return;
        }
        try {
            abstractC1591h.c(new InterfaceC1589g() { // from class: io.flutter.plugins.inapppurchase.t
                @Override // O4.InterfaceC1589g
                public final void a(com.android.billingclient.api.a aVar, C1587f c1587f) {
                    result.success(Translator.fromAlternativeBillingOnlyReportingDetails(aVar, c1587f));
                }
            });
        } catch (RuntimeException e10) {
            result.error(new Messages.FlutterError("error", e10.getMessage(), Log.getStackTraceString(e10)));
        }
    }

    @Override // io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi
    public void endConnection() {
        endBillingClientConnection();
    }

    @Override // io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi
    public void getBillingConfigAsync(final Messages.Result<Messages.PlatformBillingConfigResponse> result) {
        AbstractC1591h abstractC1591h = this.billingClient;
        if (abstractC1591h == null) {
            result.error(getNullBillingClientError());
            return;
        }
        try {
            abstractC1591h.e(C1607p.a().a(), new InterfaceC1599l() { // from class: io.flutter.plugins.inapppurchase.z
                @Override // O4.InterfaceC1599l
                public final void a(com.android.billingclient.api.a aVar, C1597k c1597k) {
                    result.success(Translator.fromBillingConfig(aVar, c1597k));
                }
            });
        } catch (RuntimeException e10) {
            result.error(new Messages.FlutterError("error", e10.getMessage(), Log.getStackTraceString(e10)));
        }
    }

    @Override // io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi
    public void isAlternativeBillingOnlyAvailableAsync(final Messages.Result<Messages.PlatformBillingResult> result) {
        AbstractC1591h abstractC1591h = this.billingClient;
        if (abstractC1591h == null) {
            result.error(getNullBillingClientError());
            return;
        }
        try {
            abstractC1591h.f(new InterfaceC1583d() { // from class: io.flutter.plugins.inapppurchase.x
                @Override // O4.InterfaceC1583d
                public final void a(com.android.billingclient.api.a aVar) {
                    result.success(Translator.fromBillingResult(aVar));
                }
            });
        } catch (RuntimeException e10) {
            result.error(new Messages.FlutterError("error", e10.getMessage(), Log.getStackTraceString(e10)));
        }
    }

    @Override // io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi
    public Boolean isFeatureSupported(Messages.PlatformBillingClientFeature platformBillingClientFeature) {
        AbstractC1591h abstractC1591h = this.billingClient;
        if (abstractC1591h != null) {
            return Boolean.valueOf(abstractC1591h.g(Translator.toBillingClientFeature(platformBillingClientFeature)).b() == 0);
        }
        throw getNullBillingClientError();
    }

    @Override // io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi
    public Boolean isReady() {
        AbstractC1591h abstractC1591h = this.billingClient;
        if (abstractC1591h != null) {
            return Boolean.valueOf(abstractC1591h.h());
        }
        throw getNullBillingClientError();
    }

    @Override // io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi
    public Messages.PlatformBillingResult launchBillingFlow(Messages.PlatformBillingFlowParams platformBillingFlowParams) {
        if (this.billingClient == null) {
            throw getNullBillingClientError();
        }
        O4.r rVar = this.cachedProducts.get(platformBillingFlowParams.getProduct());
        if (rVar == null) {
            throw new Messages.FlutterError("NOT_FOUND", "Details for product " + platformBillingFlowParams.getProduct() + " are not available. It might because products were not fetched prior to the call. Please fetch the products first. An example of how to fetch the products could be found here: " + LOAD_PRODUCT_DOC_URL, null);
        }
        List<r.e> listF = rVar.f();
        if (listF != null) {
            for (r.e eVar : listF) {
                if (platformBillingFlowParams.getOfferToken() == null || !platformBillingFlowParams.getOfferToken().equals(eVar.e())) {
                }
            }
            throw new Messages.FlutterError("INVALID_OFFER_TOKEN", "Offer token " + platformBillingFlowParams.getOfferToken() + " for product " + platformBillingFlowParams.getProduct() + " is not valid. Make sure to only pass offer tokens that belong to the product. To obtain offer tokens for a product, fetch the products. An example of how to fetch the products could be found here: " + LOAD_PRODUCT_DOC_URL, null);
        }
        if (platformBillingFlowParams.getOldProduct() == null && platformBillingFlowParams.getReplacementMode() != REPLACEMENT_MODE_UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY) {
            throw new Messages.FlutterError("IN_APP_PURCHASE_REQUIRE_OLD_PRODUCT", "launchBillingFlow failed because oldProduct is null. You must provide a valid oldProduct in order to use a replacement mode.", null);
        }
        if (platformBillingFlowParams.getOldProduct() != null && !this.cachedProducts.containsKey(platformBillingFlowParams.getOldProduct())) {
            throw new Messages.FlutterError("IN_APP_PURCHASE_INVALID_OLD_PRODUCT", "Details for product " + platformBillingFlowParams.getOldProduct() + " are not available. It might because products were not fetched prior to the call. Please fetch the products first. An example of how to fetch the products could be found here: " + LOAD_PRODUCT_DOC_URL, null);
        }
        if (this.activity == null) {
            throw new Messages.FlutterError(ACTIVITY_UNAVAILABLE, "Details for product " + platformBillingFlowParams.getProduct() + " are not available. This method must be run with the app in foreground.", null);
        }
        C1601m.b.a aVarA = C1601m.b.a();
        aVarA.c(rVar);
        if (platformBillingFlowParams.getOfferToken() != null) {
            aVarA.b(platformBillingFlowParams.getOfferToken());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVarA.a());
        C1601m.a aVarD = C1601m.a().d(arrayList);
        if (platformBillingFlowParams.getAccountId() != null && !platformBillingFlowParams.getAccountId().isEmpty()) {
            aVarD.b(platformBillingFlowParams.getAccountId());
        }
        if (platformBillingFlowParams.getObfuscatedProfileId() != null && !platformBillingFlowParams.getObfuscatedProfileId().isEmpty()) {
            aVarD.c(platformBillingFlowParams.getObfuscatedProfileId());
        }
        C1601m.c.a aVarA2 = C1601m.c.a();
        if (platformBillingFlowParams.getOldProduct() != null && !platformBillingFlowParams.getOldProduct().isEmpty() && platformBillingFlowParams.getPurchaseToken() != null) {
            aVarA2.b(platformBillingFlowParams.getPurchaseToken());
            if (platformBillingFlowParams.getReplacementMode() != REPLACEMENT_MODE_UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY) {
                aVarA2.d(Translator.toReplacementMode(platformBillingFlowParams.getReplacementMode()));
            }
            aVarD.e(aVarA2.a());
        }
        return Translator.fromBillingResult(this.billingClient.i(this.activity, aVarD.a()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Context context;
        if (this.activity != activity || (context = this.applicationContext) == null) {
            return;
        }
        ((Application) context).unregisterActivityLifecycleCallbacks(this);
        endBillingClientConnection();
    }

    public void onDetachedFromActivity() {
        endBillingClientConnection();
    }

    @Override // io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi
    public void queryProductDetailsAsync(List<Messages.PlatformQueryProduct> list, final Messages.Result<Messages.PlatformProductDetailsResponse> result) {
        if (this.billingClient == null) {
            result.error(getNullBillingClientError());
            return;
        }
        try {
            this.billingClient.k(C1620w.a().b(Translator.toProductList(list)).a(), new InterfaceC1612s() { // from class: io.flutter.plugins.inapppurchase.A
                @Override // O4.InterfaceC1612s
                public final void a(com.android.billingclient.api.a aVar, List list2) {
                    this.f37949a.lambda$queryProductDetailsAsync$4(result, aVar, list2);
                }
            });
        } catch (RuntimeException e10) {
            result.error(new Messages.FlutterError("error", e10.getMessage(), Log.getStackTraceString(e10)));
        }
    }

    @Override // io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi
    @Deprecated
    public void queryPurchaseHistoryAsync(Messages.PlatformProductType platformProductType, final Messages.Result<Messages.PlatformPurchaseHistoryResponse> result) {
        AbstractC1591h abstractC1591h = this.billingClient;
        if (abstractC1591h == null) {
            result.error(getNullBillingClientError());
            return;
        }
        try {
            abstractC1591h.l(C1622x.a().b(Translator.toProductTypeString(platformProductType)).a(), new InterfaceC1614t() { // from class: io.flutter.plugins.inapppurchase.u
                @Override // O4.InterfaceC1614t
                public final void a(com.android.billingclient.api.a aVar, List list) {
                    result.success(new Messages.PlatformPurchaseHistoryResponse.Builder().setBillingResult(Translator.fromBillingResult(aVar)).setPurchases(Translator.fromPurchaseHistoryRecordList(list)).build());
                }
            });
        } catch (RuntimeException e10) {
            result.error(new Messages.FlutterError("error", e10.getMessage(), Log.getStackTraceString(e10)));
        }
    }

    @Override // io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi
    public void queryPurchasesAsync(Messages.PlatformProductType platformProductType, final Messages.Result<Messages.PlatformPurchasesResponse> result) {
        if (this.billingClient == null) {
            result.error(getNullBillingClientError());
            return;
        }
        try {
            C1624y.a aVarA = C1624y.a();
            aVarA.b(Translator.toProductTypeString(platformProductType));
            this.billingClient.m(aVarA.a(), new InterfaceC1616u() { // from class: io.flutter.plugins.inapppurchase.s
                @Override // O4.InterfaceC1616u
                public final void a(com.android.billingclient.api.a aVar, List list) {
                    result.success(new Messages.PlatformPurchasesResponse.Builder().setBillingResult(Translator.fromBillingResult(aVar)).setPurchases(Translator.fromPurchasesList(list)).build());
                }
            });
        } catch (RuntimeException e10) {
            result.error(new Messages.FlutterError("error", e10.getMessage(), Log.getStackTraceString(e10)));
        }
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override // io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi
    public void showAlternativeBillingOnlyInformationDialog(final Messages.Result<Messages.PlatformBillingResult> result) {
        AbstractC1591h abstractC1591h = this.billingClient;
        if (abstractC1591h == null) {
            result.error(getNullBillingClientError());
            return;
        }
        Activity activity = this.activity;
        if (activity == null) {
            result.error(new Messages.FlutterError(ACTIVITY_UNAVAILABLE, "Not attempting to show dialog", null));
            return;
        }
        try {
            abstractC1591h.n(activity, new InterfaceC1585e() { // from class: io.flutter.plugins.inapppurchase.y
                @Override // O4.InterfaceC1585e
                public final void a(com.android.billingclient.api.a aVar) {
                    result.success(Translator.fromBillingResult(aVar));
                }
            });
        } catch (RuntimeException e10) {
            result.error(new Messages.FlutterError("error", e10.getMessage(), Log.getStackTraceString(e10)));
        }
    }

    @Override // io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi
    public void startConnection(final Long l10, Messages.PlatformBillingChoiceMode platformBillingChoiceMode, Messages.PlatformPendingPurchasesParams platformPendingPurchasesParams, final Messages.Result<Messages.PlatformBillingResult> result) {
        if (this.billingClient == null) {
            this.billingClient = this.billingClientFactory.createBillingClient(this.applicationContext, this.callbackApi, platformBillingChoiceMode, platformPendingPurchasesParams);
        }
        try {
            this.billingClient.o(new InterfaceC1595j() { // from class: io.flutter.plugins.inapppurchase.MethodCallHandlerImpl.1
                private boolean alreadyFinished = false;

                @Override // O4.InterfaceC1595j
                public void onBillingServiceDisconnected() {
                    MethodCallHandlerImpl.this.callbackApi.onBillingServiceDisconnected(l10, new Messages.VoidResult() { // from class: io.flutter.plugins.inapppurchase.MethodCallHandlerImpl.1.1
                        @Override // io.flutter.plugins.inapppurchase.Messages.VoidResult
                        public void error(Throwable th) {
                            io.flutter.Log.e("IN_APP_PURCHASE", "onBillingServiceDisconnected handler error: " + th);
                        }

                        @Override // io.flutter.plugins.inapppurchase.Messages.VoidResult
                        public void success() {
                        }
                    });
                }

                @Override // O4.InterfaceC1595j
                public void onBillingSetupFinished(com.android.billingclient.api.a aVar) {
                    if (this.alreadyFinished) {
                        Log.d(MethodCallHandlerImpl.TAG, "Tried to call onBillingSetupFinished multiple times.");
                    } else {
                        this.alreadyFinished = true;
                        result.success(Translator.fromBillingResult(aVar));
                    }
                }
            });
        } catch (RuntimeException e10) {
            result.error(new Messages.FlutterError("error", e10.getMessage(), Log.getStackTraceString(e10)));
        }
    }

    public void updateCachedProducts(List<O4.r> list) {
        if (list == null) {
            return;
        }
        for (O4.r rVar : list) {
            this.cachedProducts.put(rVar.d(), rVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
