package com.braze.ui.actions;

import Od.F;
import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.braze.BrazeInternal;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.Channel;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.BrazeWebViewActivity;
import com.braze.ui.actions.UriAction;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import com.braze.ui.support.UriUtils;
import gc.C4179C;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0013\b\u0016\u0018\u00002\u00020\u0001B+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0012J)\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0012J)\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0012J)\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0004¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0019\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0005¢\u0006\u0004\b\u0019\u0010\u0018J7\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u001d2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/braze/ui/actions/UriAction;", "Lcom/braze/ui/actions/IAction;", "Landroid/net/Uri;", "uri", "Landroid/os/Bundle;", "extras", "", "useWebView", "Lcom/braze/enums/Channel;", "channel", "<init>", "(Landroid/net/Uri;Landroid/os/Bundle;ZLcom/braze/enums/Channel;)V", "Landroid/content/Context;", "context", "Lfc/H;", "execute", "(Landroid/content/Context;)V", "openUriWithWebViewActivity", "(Landroid/content/Context;Landroid/net/Uri;Landroid/os/Bundle;)V", "openUriWithActionView", "openUriWithWebViewActivityFromPush", "openUriWithActionViewFromPush", "Landroid/content/Intent;", "getWebViewActivityIntent", "(Landroid/content/Context;Landroid/net/Uri;Landroid/os/Bundle;)Landroid/content/Intent;", "getActionViewIntent", "targetIntent", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "", "getIntentArrayWithConfiguredBackStack", "(Landroid/content/Context;Landroid/os/Bundle;Landroid/content/Intent;Lcom/braze/configuration/BrazeConfigurationProvider;)[Landroid/content/Intent;", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;", "Lcom/braze/enums/Channel;", "getChannel", "()Lcom/braze/enums/Channel;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "Z", "getUseWebView", "()Z", "setUseWebView", "(Z)V", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class UriAction implements IAction {
    private final Channel channel;
    private final Bundle extras;
    private Uri uri;
    private boolean useWebView;

    public UriAction(Uri uri, Bundle bundle, boolean z10, Channel channel) {
        AbstractC4862t.e(uri, "uri");
        AbstractC4862t.e(channel, "channel");
        this.uri = uri;
        this.extras = bundle;
        this.useWebView = z10;
        this.channel = channel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$0(UriAction uriAction) {
        return "Not executing local Uri: " + uriAction.uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$1(UriAction uriAction) {
        return "Executing BrazeActions uri:\n'" + uriAction.uri + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$2(UriAction uriAction) {
        return "Executing Uri action from channel " + uriAction.channel + ": " + uriAction.uri + ". UseWebView: " + uriAction.useWebView + ". Extras: " + uriAction.extras;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getActionViewIntent$lambda$8(ResolveInfo resolveInfo) {
        return "Setting deep link intent package to " + resolveInfo.activityInfo.packageName + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getIntentArrayWithConfiguredBackStack$lambda$10(String str) {
        return "Adding custom back stack activity while opening uri from push: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getIntentArrayWithConfiguredBackStack$lambda$12(String str) {
        return "Not adding unregistered activity to the back stack while opening uri from push: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getIntentArrayWithConfiguredBackStack$lambda$13() {
        return "Not adding back stack activity while opening uri from push due to disabled configuration setting.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getIntentArrayWithConfiguredBackStack$lambda$9() {
        return "Adding main activity intent to back stack while opening uri from push";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getWebViewActivityIntent$lambda$7(String str) {
        return "Launching custom WebView Activity with class name: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openUriWithActionView$lambda$4(Uri uri, Bundle bundle) {
        return "Failed to handle uri " + uri + " with extras: " + bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openUriWithActionViewFromPush$lambda$6(Uri uri) {
        return "Could not find appropriate activity to open for deep link " + uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openUriWithWebViewActivity$lambda$3() {
        return "BrazeWebViewActivity not opened successfully.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openUriWithWebViewActivityFromPush$lambda$5() {
        return "Braze WebView Activity not opened successfully.";
    }

    @Override // com.braze.ui.actions.IAction
    public void execute(Context context) {
        AbstractC4862t.e(context, "context");
        if (BrazeFileUtils.isLocalUri(this.uri)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: z5.a
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return UriAction.execute$lambda$0(this.f48774a);
                }
            }, 7, (Object) null);
            return;
        }
        BrazeActionParser brazeActionParser = BrazeActionParser.INSTANCE;
        if (brazeActionParser.isBrazeActionUri(this.uri)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: z5.e
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return UriAction.execute$lambda$1(this.f48777a);
                }
            }, 6, (Object) null);
            brazeActionParser.execute(context, this.uri, this.channel);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: z5.f
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return UriAction.execute$lambda$2(this.f48778a);
            }
        }, 7, (Object) null);
        if (this.useWebView && C4179C.Y(BrazeFileUtils.REMOTE_SCHEMES, this.uri.getScheme())) {
            if (this.channel == Channel.PUSH) {
                openUriWithWebViewActivityFromPush(context, this.uri, this.extras);
                return;
            } else {
                openUriWithWebViewActivity(context, this.uri, this.extras);
                return;
            }
        }
        if (this.channel == Channel.PUSH) {
            openUriWithActionViewFromPush(context, this.uri, this.extras);
        } else {
            openUriWithActionView(context, this.uri, this.extras);
        }
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    public final Intent getActionViewIntent(Context context, Uri uri, Bundle extras) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(uri, "uri");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        if (extras != null) {
            intent.putExtras(extras);
        }
        List<ResolveInfo> listQueryIntentActivities = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0L)) : context.getPackageManager().queryIntentActivities(intent, 0);
        AbstractC4862t.b(listQueryIntentActivities);
        if (listQueryIntentActivities.size() > 1) {
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                final ResolveInfo next = it.next();
                if (AbstractC4862t.a(next.activityInfo.packageName, context.getPackageName())) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: z5.k
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return UriAction.getActionViewIntent$lambda$8(next);
                        }
                    }, 7, (Object) null);
                    intent.setPackage(next.activityInfo.packageName);
                    break;
                }
            }
        }
        return intent;
    }

    public final Intent[] getIntentArrayWithConfiguredBackStack(Context context, Bundle extras, Intent targetIntent, BrazeConfigurationProvider configurationProvider) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(targetIntent, "targetIntent");
        AbstractC4862t.e(configurationProvider, "configurationProvider");
        Intent mainActivityIntent = null;
        if (configurationProvider.isPushDeepLinkBackStackActivityEnabled()) {
            final String pushDeepLinkBackStackActivityClassName = configurationProvider.getPushDeepLinkBackStackActivityClassName();
            if (pushDeepLinkBackStackActivityClassName == null || F.k0(pushDeepLinkBackStackActivityClassName)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: z5.m
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return UriAction.getIntentArrayWithConfiguredBackStack$lambda$9();
                    }
                }, 6, (Object) null);
                mainActivityIntent = UriUtils.getMainActivityIntent(context, extras);
            } else if (UriUtils.isActivityRegisteredInManifest(context, pushDeepLinkBackStackActivityClassName)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: z5.b
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return UriAction.getIntentArrayWithConfiguredBackStack$lambda$10(pushDeepLinkBackStackActivityClassName);
                    }
                }, 6, (Object) null);
                if (extras != null) {
                    mainActivityIntent = new Intent().setClassName(context, pushDeepLinkBackStackActivityClassName).setFlags(BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_GET_ROOT_INTENT)).putExtras(extras);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: z5.c
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return UriAction.getIntentArrayWithConfiguredBackStack$lambda$12(pushDeepLinkBackStackActivityClassName);
                    }
                }, 6, (Object) null);
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: z5.d
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return UriAction.getIntentArrayWithConfiguredBackStack$lambda$13();
                }
            }, 6, (Object) null);
        }
        if (mainActivityIntent != null) {
            return new Intent[]{mainActivityIntent, targetIntent};
        }
        targetIntent.setFlags(BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT));
        return new Intent[]{targetIntent};
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final Intent getWebViewActivityIntent(Context context, Uri uri, Bundle extras) {
        Intent intent;
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(uri, "uri");
        final String customHtmlWebViewActivityClassName = BrazeInternal.INSTANCE.getConfigurationProvider(context).getCustomHtmlWebViewActivityClassName();
        if (customHtmlWebViewActivityClassName == null || F.k0(customHtmlWebViewActivityClassName) || !UriUtils.isActivityRegisteredInManifest(context, customHtmlWebViewActivityClassName)) {
            intent = new Intent(context, (Class<?>) BrazeWebViewActivity.class);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: z5.l
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return UriAction.getWebViewActivityIntent$lambda$7(customHtmlWebViewActivityClassName);
                }
            }, 7, (Object) null);
            intent = new Intent().setClassName(context, customHtmlWebViewActivityClassName);
            AbstractC4862t.b(intent);
        }
        if (extras != null) {
            intent.putExtras(extras);
        }
        intent.putExtra("url", uri.toString());
        return intent;
    }

    public void openUriWithActionView(Context context, final Uri uri, final Bundle extras) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(uri, "uri");
        Intent actionViewIntent = getActionViewIntent(context, uri, extras);
        actionViewIntent.setFlags(BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_ACTION_VIEW));
        try {
            context.startActivity(actionViewIntent);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: z5.j
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return UriAction.openUriWithActionView$lambda$4(uri, extras);
                }
            }, 4, (Object) null);
        }
    }

    public void openUriWithActionViewFromPush(Context context, final Uri uri, Bundle extras) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(uri, "uri");
        try {
            context.startActivities(getIntentArrayWithConfiguredBackStack(context, extras, getActionViewIntent(context, uri, extras), BrazeInternal.INSTANCE.getConfigurationProvider(context)));
        } catch (ActivityNotFoundException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: z5.h
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return UriAction.openUriWithActionViewFromPush$lambda$6(uri);
                }
            }, 4, (Object) null);
        }
    }

    public void openUriWithWebViewActivity(Context context, Uri uri, Bundle extras) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(uri, "uri");
        Intent webViewActivityIntent = getWebViewActivityIntent(context, uri, extras);
        webViewActivityIntent.setFlags(BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY));
        try {
            context.startActivity(webViewActivityIntent);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: z5.g
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return UriAction.openUriWithWebViewActivity$lambda$3();
                }
            }, 4, (Object) null);
        }
    }

    public void openUriWithWebViewActivityFromPush(Context context, Uri uri, Bundle extras) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(uri, "uri");
        try {
            context.startActivities(getIntentArrayWithConfiguredBackStack(context, extras, getWebViewActivityIntent(context, uri, extras), BrazeInternal.INSTANCE.getConfigurationProvider(context)));
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: z5.i
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return UriAction.openUriWithWebViewActivityFromPush$lambda$5();
                }
            }, 4, (Object) null);
        }
    }
}
