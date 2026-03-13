package com.braze.push.support;

import Od.F;
import android.text.Html;
import android.text.Spanned;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.push.support.HtmlUtils;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TAG", "", "getHtmlSpannedTextIfEnabled", "", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "android-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class HtmlUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("HtmlUtils");

    public static final CharSequence getHtmlSpannedTextIfEnabled(String str, BrazeConfigurationProvider configurationProvider) {
        AbstractC4862t.e(str, "<this>");
        AbstractC4862t.e(configurationProvider, "configurationProvider");
        if (F.k0(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: m5.a
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return HtmlUtils.getHtmlSpannedTextIfEnabled$lambda$0();
                }
            }, 14, (Object) null);
            return str;
        }
        if (!configurationProvider.isPushNotificationHtmlRenderingEnabled()) {
            return str;
        }
        Spanned spannedFromHtml = Html.fromHtml(str, 0);
        AbstractC4862t.b(spannedFromHtml);
        return spannedFromHtml;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getHtmlSpannedTextIfEnabled$lambda$0() {
        return "Cannot create html spanned text on blank text. Returning blank string.";
    }
}
