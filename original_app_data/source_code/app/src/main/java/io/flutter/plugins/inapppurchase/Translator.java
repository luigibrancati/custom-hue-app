package io.flutter.plugins.inapppurchase;

import O4.A;
import O4.C1577a;
import O4.C1587f;
import O4.C1597k;
import O4.C1609q;
import O4.C1620w;
import O4.r;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import io.flutter.plugins.inapppurchase.Messages;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class Translator {

    /* JADX INFO: renamed from: io.flutter.plugins.inapppurchase.Translator$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformBillingClientFeature;
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformProductType;
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformReplacementMode;

        static {
            int[] iArr = new int[Messages.PlatformReplacementMode.values().length];
            $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformReplacementMode = iArr;
            try {
                iArr[Messages.PlatformReplacementMode.CHARGE_FULL_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformReplacementMode[Messages.PlatformReplacementMode.CHARGE_PRORATED_PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformReplacementMode[Messages.PlatformReplacementMode.DEFERRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformReplacementMode[Messages.PlatformReplacementMode.WITHOUT_PRORATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformReplacementMode[Messages.PlatformReplacementMode.WITH_TIME_PRORATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformReplacementMode[Messages.PlatformReplacementMode.UNKNOWN_REPLACEMENT_MODE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[Messages.PlatformBillingClientFeature.values().length];
            $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformBillingClientFeature = iArr2;
            try {
                iArr2[Messages.PlatformBillingClientFeature.ALTERNATIVE_BILLING_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformBillingClientFeature[Messages.PlatformBillingClientFeature.BILLING_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformBillingClientFeature[Messages.PlatformBillingClientFeature.EXTERNAL_OFFER.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformBillingClientFeature[Messages.PlatformBillingClientFeature.IN_APP_MESSAGING.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformBillingClientFeature[Messages.PlatformBillingClientFeature.PRICE_CHANGE_CONFIRMATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformBillingClientFeature[Messages.PlatformBillingClientFeature.PRODUCT_DETAILS.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformBillingClientFeature[Messages.PlatformBillingClientFeature.SUBSCRIPTIONS.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformBillingClientFeature[Messages.PlatformBillingClientFeature.SUBSCRIPTIONS_UPDATE.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr3 = new int[Messages.PlatformProductType.values().length];
            $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformProductType = iArr3;
            try {
                iArr3[Messages.PlatformProductType.INAPP.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformProductType[Messages.PlatformProductType.SUBS.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public static String currencySymbolFromCode(String str) {
        return Currency.getInstance(str).getSymbol();
    }

    public static Messages.PlatformAlternativeBillingOnlyReportingDetailsResponse fromAlternativeBillingOnlyReportingDetails(com.android.billingclient.api.a aVar, C1587f c1587f) {
        return new Messages.PlatformAlternativeBillingOnlyReportingDetailsResponse.Builder().setBillingResult(fromBillingResult(aVar)).setExternalTransactionToken(c1587f == null ? "" : c1587f.a()).build();
    }

    public static Messages.PlatformBillingConfigResponse fromBillingConfig(com.android.billingclient.api.a aVar, C1597k c1597k) {
        return new Messages.PlatformBillingConfigResponse.Builder().setBillingResult(fromBillingResult(aVar)).setCountryCode(c1597k == null ? "" : c1597k.a()).build();
    }

    public static Messages.PlatformBillingResponse fromBillingResponseCode(int i10) {
        if (i10 == 12) {
            return Messages.PlatformBillingResponse.NETWORK_ERROR;
        }
        switch (i10) {
            case -2:
                return Messages.PlatformBillingResponse.FEATURE_NOT_SUPPORTED;
            case -1:
                return Messages.PlatformBillingResponse.SERVICE_DISCONNECTED;
            case 0:
                return Messages.PlatformBillingResponse.OK;
            case 1:
                return Messages.PlatformBillingResponse.USER_CANCELED;
            case 2:
                return Messages.PlatformBillingResponse.SERVICE_UNAVAILABLE;
            case 3:
                return Messages.PlatformBillingResponse.BILLING_UNAVAILABLE;
            case 4:
                return Messages.PlatformBillingResponse.ITEM_UNAVAILABLE;
            case 5:
                return Messages.PlatformBillingResponse.DEVELOPER_ERROR;
            case 6:
                return Messages.PlatformBillingResponse.ERROR;
            case 7:
                return Messages.PlatformBillingResponse.ITEM_ALREADY_OWNED;
            case 8:
                return Messages.PlatformBillingResponse.ITEM_NOT_OWNED;
            default:
                return Messages.PlatformBillingResponse.ERROR;
        }
    }

    public static Messages.PlatformBillingResult fromBillingResult(com.android.billingclient.api.a aVar) {
        return new Messages.PlatformBillingResult.Builder().setResponseCode(fromBillingResponseCode(aVar.b())).setDebugMessage(aVar.a()).build();
    }

    public static Messages.PlatformInstallmentPlanDetails fromInstallmentPlanDetails(r.a aVar) {
        if (aVar == null) {
            return null;
        }
        return new Messages.PlatformInstallmentPlanDetails.Builder().setCommitmentPaymentsCount(Long.valueOf(aVar.a())).setSubsequentCommitmentPaymentsCount(Long.valueOf(aVar.b())).build();
    }

    public static Messages.PlatformOneTimePurchaseOfferDetails fromOneTimePurchaseOfferDetails(r.b bVar) {
        if (bVar == null) {
            return null;
        }
        return new Messages.PlatformOneTimePurchaseOfferDetails.Builder().setPriceAmountMicros(Long.valueOf(bVar.b())).setPriceCurrencyCode(bVar.c()).setFormattedPrice(bVar.a()).build();
    }

    public static Messages.PlatformPendingPurchaseUpdate fromPendingPurchaseUpdate(Purchase.a aVar) {
        if (aVar == null) {
            return null;
        }
        return new Messages.PlatformPendingPurchaseUpdate.Builder().setPurchaseToken(aVar.b()).setProducts(aVar.a()).build();
    }

    public static Messages.PlatformPricingPhase fromPricingPhase(r.c cVar) {
        return new Messages.PlatformPricingPhase.Builder().setFormattedPrice(cVar.c()).setPriceCurrencyCode(cVar.e()).setPriceAmountMicros(Long.valueOf(cVar.d())).setBillingCycleCount(Long.valueOf(cVar.a())).setBillingPeriod(cVar.b()).setRecurrenceMode(toPlatformRecurrenceMode(cVar.f())).build();
    }

    public static List<Messages.PlatformPricingPhase> fromPricingPhases(r.d dVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = dVar.a().iterator();
        while (it.hasNext()) {
            arrayList.add(fromPricingPhase((r.c) it.next()));
        }
        return arrayList;
    }

    public static Messages.PlatformProductDetails fromProductDetail(O4.r rVar) {
        return new Messages.PlatformProductDetails.Builder().setTitle(rVar.g()).setDescription(rVar.a()).setProductId(rVar.d()).setProductType(toPlatformProductType(rVar.e())).setName(rVar.b()).setOneTimePurchaseOfferDetails(fromOneTimePurchaseOfferDetails(rVar.c())).setSubscriptionOfferDetails(fromSubscriptionOfferDetailsList(rVar.f())).build();
    }

    public static List<Messages.PlatformProductDetails> fromProductDetailsList(List<O4.r> list) {
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<O4.r> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(fromProductDetail(it.next()));
        }
        return arrayList;
    }

    public static Messages.PlatformPurchase fromPurchase(Purchase purchase) {
        Messages.PlatformPurchase.Builder quantity = new Messages.PlatformPurchase.Builder().setOrderId(purchase.c()).setPackageName(purchase.e()).setPurchaseTime(Long.valueOf(purchase.i())).setPurchaseToken(purchase.j()).setSignature(purchase.l()).setProducts(purchase.g()).setIsAutoRenewing(Boolean.valueOf(purchase.n())).setOriginalJson(purchase.d()).setDeveloperPayload(purchase.b()).setIsAcknowledged(Boolean.valueOf(purchase.m())).setPurchaseState(toPlatformPurchaseState(purchase.h())).setQuantity(Long.valueOf(purchase.k()));
        C1577a c1577aA = purchase.a();
        if (c1577aA != null) {
            quantity.setAccountIdentifiers(new Messages.PlatformAccountIdentifiers.Builder().setObfuscatedAccountId(c1577aA.a()).setObfuscatedProfileId(c1577aA.b()).build());
        }
        Purchase.a aVarF = purchase.f();
        if (aVarF != null) {
            quantity.setPendingPurchaseUpdate(fromPendingPurchaseUpdate(aVarF));
        }
        return quantity.build();
    }

    public static Messages.PlatformPurchaseHistoryRecord fromPurchaseHistoryRecord(PurchaseHistoryRecord purchaseHistoryRecord) {
        return new Messages.PlatformPurchaseHistoryRecord.Builder().setPurchaseTime(Long.valueOf(purchaseHistoryRecord.d())).setPurchaseToken(purchaseHistoryRecord.e()).setSignature(purchaseHistoryRecord.g()).setProducts(purchaseHistoryRecord.c()).setDeveloperPayload(purchaseHistoryRecord.a()).setOriginalJson(purchaseHistoryRecord.b()).setQuantity(Long.valueOf(purchaseHistoryRecord.f())).build();
    }

    public static List<Messages.PlatformPurchaseHistoryRecord> fromPurchaseHistoryRecordList(List<PurchaseHistoryRecord> list) {
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<PurchaseHistoryRecord> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(fromPurchaseHistoryRecord(it.next()));
        }
        return arrayList;
    }

    public static List<Messages.PlatformPurchase> fromPurchasesList(List<Purchase> list) {
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Purchase> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(fromPurchase(it.next()));
        }
        return arrayList;
    }

    public static Messages.PlatformSubscriptionOfferDetails fromSubscriptionOfferDetails(r.e eVar) {
        return new Messages.PlatformSubscriptionOfferDetails.Builder().setOfferId(eVar.c()).setBasePlanId(eVar.a()).setOfferTags(eVar.d()).setOfferToken(eVar.e()).setPricingPhases(fromPricingPhases(eVar.f())).setInstallmentPlanDetails(fromInstallmentPlanDetails(eVar.b())).build();
    }

    public static List<Messages.PlatformSubscriptionOfferDetails> fromSubscriptionOfferDetailsList(List<r.e> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<r.e> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(fromSubscriptionOfferDetails(it.next()));
        }
        return arrayList;
    }

    public static Messages.PlatformUserChoiceDetails fromUserChoiceDetails(O4.A a10) {
        return new Messages.PlatformUserChoiceDetails.Builder().setExternalTransactionToken(a10.a()).setOriginalExternalTransactionId(a10.b()).setProducts(fromUserChoiceProductsList(a10.c())).build();
    }

    public static Messages.PlatformUserChoiceProduct fromUserChoiceProduct(A.a aVar) {
        return new Messages.PlatformUserChoiceProduct.Builder().setId(aVar.a()).setOfferToken(aVar.b()).setType(toPlatformProductType(aVar.c())).build();
    }

    public static List<Messages.PlatformUserChoiceProduct> fromUserChoiceProductsList(List<A.a> list) {
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<A.a> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(fromUserChoiceProduct(it.next()));
        }
        return arrayList;
    }

    public static String toBillingClientFeature(Messages.PlatformBillingClientFeature platformBillingClientFeature) {
        switch (AnonymousClass1.$SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformBillingClientFeature[platformBillingClientFeature.ordinal()]) {
            case 1:
                return "jjj";
            case 2:
                return "ggg";
            case 3:
                return "kkk";
            case 4:
                return "bbb";
            case 5:
                return "priceChangeConfirmation";
            case 6:
                return "fff";
            case 7:
                return "subscriptions";
            case 8:
                return "subscriptionsUpdate";
            default:
                throw new Messages.FlutterError("UNKNOWN_FEATURE", "Unknown client feature: " + platformBillingClientFeature, null);
        }
    }

    public static C1609q toPendingPurchasesParams(Messages.PlatformPendingPurchasesParams platformPendingPurchasesParams) {
        C1609q.a aVarB = C1609q.c().b();
        if (platformPendingPurchasesParams != null && platformPendingPurchasesParams.getEnablePrepaidPlans().booleanValue()) {
            aVarB.c();
        }
        return aVarB.a();
    }

    public static Messages.PlatformProductType toPlatformProductType(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 3541555) {
            if (iHashCode == 100343516) {
                str.equals("inapp");
            }
        } else if (str.equals("subs")) {
            return Messages.PlatformProductType.SUBS;
        }
        return Messages.PlatformProductType.INAPP;
    }

    public static Messages.PlatformPurchaseState toPlatformPurchaseState(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? Messages.PlatformPurchaseState.UNSPECIFIED : Messages.PlatformPurchaseState.PENDING : Messages.PlatformPurchaseState.PURCHASED : Messages.PlatformPurchaseState.UNSPECIFIED;
    }

    public static Messages.PlatformRecurrenceMode toPlatformRecurrenceMode(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? Messages.PlatformRecurrenceMode.NON_RECURRING : Messages.PlatformRecurrenceMode.NON_RECURRING : Messages.PlatformRecurrenceMode.FINITE_RECURRING : Messages.PlatformRecurrenceMode.INFINITE_RECURRING;
    }

    public static C1620w.b toProduct(Messages.PlatformQueryProduct platformQueryProduct) {
        return C1620w.b.a().b(platformQueryProduct.getProductId()).c(toProductTypeString(platformQueryProduct.getProductType())).a();
    }

    public static List<C1620w.b> toProductList(List<Messages.PlatformQueryProduct> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Messages.PlatformQueryProduct> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toProduct(it.next()));
        }
        return arrayList;
    }

    public static String toProductTypeString(Messages.PlatformProductType platformProductType) {
        int i10 = AnonymousClass1.$SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformProductType[platformProductType.ordinal()];
        if (i10 == 1) {
            return "inapp";
        }
        if (i10 == 2) {
            return "subs";
        }
        throw new Messages.FlutterError("UNKNOWN_TYPE", "Unknown product type: " + platformProductType, null);
    }

    public static int toReplacementMode(Messages.PlatformReplacementMode platformReplacementMode) {
        int i10 = AnonymousClass1.$SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformReplacementMode[platformReplacementMode.ordinal()];
        if (i10 == 1) {
            return 5;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 == 3) {
            return 6;
        }
        if (i10 != 4) {
            return i10 != 5 ? 0 : 1;
        }
        return 3;
    }
}
