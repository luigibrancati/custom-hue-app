package io.flutter.plugins.webviewflutter;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ViewProxyApi extends PigeonApiView {

    /* JADX INFO: renamed from: io.flutter.plugins.webviewflutter.ViewProxyApi$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$webviewflutter$OverScrollMode;

        static {
            int[] iArr = new int[OverScrollMode.values().length];
            $SwitchMap$io$flutter$plugins$webviewflutter$OverScrollMode = iArr;
            try {
                iArr[OverScrollMode.ALWAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$plugins$webviewflutter$OverScrollMode[OverScrollMode.IF_CONTENT_SCROLLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$plugins$webviewflutter$OverScrollMode[OverScrollMode.NEVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$flutter$plugins$webviewflutter$OverScrollMode[OverScrollMode.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public ViewProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiView
    public WebViewPoint getScrollPosition(View view) {
        return new WebViewPoint(view.getScrollX(), view.getScrollY());
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiView
    public void scrollBy(View view, long j10, long j11) {
        view.scrollBy((int) j10, (int) j11);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiView
    public void scrollTo(View view, long j10, long j11) {
        view.scrollTo((int) j10, (int) j11);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiView
    public void setHorizontalScrollBarEnabled(View view, boolean z10) {
        view.setHorizontalScrollBarEnabled(z10);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiView
    public void setOverScrollMode(View view, OverScrollMode overScrollMode) {
        int i10 = AnonymousClass1.$SwitchMap$io$flutter$plugins$webviewflutter$OverScrollMode[overScrollMode.ordinal()];
        if (i10 == 1) {
            view.setOverScrollMode(0);
            return;
        }
        if (i10 == 2) {
            view.setOverScrollMode(1);
        } else if (i10 == 3) {
            view.setOverScrollMode(2);
        } else if (i10 == 4) {
            throw getPigeonRegistrar().createUnknownEnumException(OverScrollMode.UNKNOWN);
        }
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiView
    public void setVerticalScrollBarEnabled(View view, boolean z10) {
        view.setVerticalScrollBarEnabled(z10);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiView
    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }
}
