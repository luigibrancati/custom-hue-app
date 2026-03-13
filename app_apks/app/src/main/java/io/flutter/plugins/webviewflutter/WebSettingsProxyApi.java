package io.flutter.plugins.webviewflutter;

import android.webkit.WebSettings;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class WebSettingsProxyApi extends PigeonApiWebSettings {

    /* JADX INFO: renamed from: io.flutter.plugins.webviewflutter.WebSettingsProxyApi$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$webviewflutter$MixedContentMode;

        static {
            int[] iArr = new int[MixedContentMode.values().length];
            $SwitchMap$io$flutter$plugins$webviewflutter$MixedContentMode = iArr;
            try {
                iArr[MixedContentMode.ALWAYS_ALLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$plugins$webviewflutter$MixedContentMode[MixedContentMode.COMPATIBILITY_MODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$plugins$webviewflutter$MixedContentMode[MixedContentMode.NEVER_ALLOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public WebSettingsProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public String getUserAgentString(WebSettings webSettings) {
        return webSettings.getUserAgentString();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setAllowContentAccess(WebSettings webSettings, boolean z10) {
        webSettings.setAllowContentAccess(z10);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setAllowFileAccess(WebSettings webSettings, boolean z10) {
        webSettings.setAllowFileAccess(z10);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setBuiltInZoomControls(WebSettings webSettings, boolean z10) {
        webSettings.setBuiltInZoomControls(z10);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setDisplayZoomControls(WebSettings webSettings, boolean z10) {
        webSettings.setDisplayZoomControls(z10);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setDomStorageEnabled(WebSettings webSettings, boolean z10) {
        webSettings.setDomStorageEnabled(z10);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setGeolocationEnabled(WebSettings webSettings, boolean z10) {
        webSettings.setGeolocationEnabled(z10);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setJavaScriptCanOpenWindowsAutomatically(WebSettings webSettings, boolean z10) {
        webSettings.setJavaScriptCanOpenWindowsAutomatically(z10);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setJavaScriptEnabled(WebSettings webSettings, boolean z10) {
        webSettings.setJavaScriptEnabled(z10);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setLoadWithOverviewMode(WebSettings webSettings, boolean z10) {
        webSettings.setLoadWithOverviewMode(z10);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setMediaPlaybackRequiresUserGesture(WebSettings webSettings, boolean z10) {
        webSettings.setMediaPlaybackRequiresUserGesture(z10);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setMixedContentMode(WebSettings webSettings, MixedContentMode mixedContentMode) {
        int i10 = AnonymousClass1.$SwitchMap$io$flutter$plugins$webviewflutter$MixedContentMode[mixedContentMode.ordinal()];
        if (i10 == 1) {
            webSettings.setMixedContentMode(0);
        } else if (i10 == 2) {
            webSettings.setMixedContentMode(2);
        } else {
            if (i10 != 3) {
                return;
            }
            webSettings.setMixedContentMode(1);
        }
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setSupportMultipleWindows(WebSettings webSettings, boolean z10) {
        webSettings.setSupportMultipleWindows(z10);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setSupportZoom(WebSettings webSettings, boolean z10) {
        webSettings.setSupportZoom(z10);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setTextZoom(WebSettings webSettings, long j10) {
        webSettings.setTextZoom((int) j10);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setUseWideViewPort(WebSettings webSettings, boolean z10) {
        webSettings.setUseWideViewPort(z10);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettings
    public void setUserAgentString(WebSettings webSettings, String str) {
        webSettings.setUserAgentString(str);
    }
}
