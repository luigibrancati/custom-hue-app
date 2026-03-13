package com.braze.ui;

import Od.A;
import Od.B;
import android.content.Context;
import android.webkit.JavascriptInterface;
import com.braze.Braze;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.ui.JavascriptInterfaceBase;
import io.flutter.plugins.firebase.analytics.Constants;
import io.sentry.clientreport.DiscardedEvent;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0011\u0010\fJ#\u0010\u0014\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0010J=\u0010\u0019\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/braze/ui/JavascriptInterfaceBase;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "buttonId", "Lfc/H;", "logButtonClick", "(Ljava/lang/String;)V", "logClick", "()V", Constants.USER_ID, "sdkAuthSignature", "changeUser", "(Ljava/lang/String;Ljava/lang/String;)V", "requestImmediateDataFlush", Constants.EVENT_NAME, "propertiesJSON", "logCustomEventWithJSON", "productId", "price", "currencyCode", DiscardedEvent.JsonKeys.QUANTITY, "logPurchaseWithJSON", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/braze/models/outgoing/BrazeProperties;", "parseProperties", "(Ljava/lang/String;)Lcom/braze/models/outgoing/BrazeProperties;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class JavascriptInterfaceBase {
    private final Context context;

    public JavascriptInterfaceBase(Context context) {
        AbstractC4862t.e(context, "context");
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPurchaseWithJSON$lambda$0(String str) {
        return "Failed to parse logPurchaseWithJSON price value '" + str + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPurchaseWithJSON$lambda$1(String str) {
        return "Failed to parse logPurchaseWithJSON quantity value '" + str + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parseProperties$lambda$2(String str) {
        return "Failed to parse properties JSON String: " + str;
    }

    @JavascriptInterface
    public final void changeUser(String userId, String sdkAuthSignature) {
        AbstractC4862t.e(userId, "userId");
        Braze.INSTANCE.getInstance(this.context).changeUser(userId, sdkAuthSignature);
    }

    public final Context getContext() {
        return this.context;
    }

    @JavascriptInterface
    public abstract void logButtonClick(String buttonId);

    @JavascriptInterface
    public abstract void logClick();

    @JavascriptInterface
    public final void logCustomEventWithJSON(String eventName, String propertiesJSON) {
        Braze.INSTANCE.getInstance(this.context).logCustomEvent(eventName, parseProperties(propertiesJSON));
    }

    @JavascriptInterface
    public final void logPurchaseWithJSON(String productId, final String price, String currencyCode, final String quantity, String propertiesJSON) {
        AbstractC4862t.e(price, "price");
        AbstractC4862t.e(quantity, "quantity");
        BrazeProperties properties = parseProperties(propertiesJSON);
        Double dS = A.s(price);
        if (dS == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: y5.o
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return JavascriptInterfaceBase.logPurchaseWithJSON$lambda$0(price);
                }
            }, 6, (Object) null);
            return;
        }
        Integer numU = B.u(quantity);
        if (numU == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: y5.p
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return JavascriptInterfaceBase.logPurchaseWithJSON$lambda$1(quantity);
                }
            }, 6, (Object) null);
        } else {
            Braze.INSTANCE.getInstance(this.context).logPurchase(productId, currencyCode, new BigDecimal(dS.toString()), numU.intValue(), properties);
        }
    }

    public final BrazeProperties parseProperties(final String propertiesJSON) {
        if (propertiesJSON == null) {
            return null;
        }
        try {
            if (AbstractC4862t.a(propertiesJSON, "undefined") || AbstractC4862t.a(propertiesJSON, "null")) {
                return null;
            }
            return new BrazeProperties(new JSONObject(propertiesJSON));
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: y5.n
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return JavascriptInterfaceBase.parseProperties$lambda$2(propertiesJSON);
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @JavascriptInterface
    public final void requestImmediateDataFlush() {
        Braze.INSTANCE.getInstance(this.context).requestImmediateDataFlush();
    }
}
