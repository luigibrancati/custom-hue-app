package com.braze.ui.banners;

import Od.C1823c;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.managers.IBannerView;
import com.braze.models.Banner;
import com.braze.ui.R$styleable;
import com.braze.ui.banners.BannerView;
import com.braze.ui.banners.jsinterface.BannerJavascriptInterface;
import com.braze.ui.banners.listeners.DefaultBannerWebViewClientListener;
import com.braze.ui.banners.utils.BannerWebViewClient;
import com.braze.ui.support.WebViewUtilsKt;
import fc.C4015H;
import io.sentry.Session;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0011R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R0\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001dR(\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010#\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\u0011¨\u0006'"}, d2 = {"Lcom/braze/ui/banners/BannerView;", "Landroid/webkit/WebView;", "Lcom/braze/managers/IBannerView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", Session.JsonKeys.ATTRS, "", "defStyle", "Lfc/H;", Session.JsonKeys.INIT, "(Landroid/util/AttributeSet;I)V", "", "placementId", "configureWebView", "(Ljava/lang/String;)V", "loadHtmlData", "setWebviewToEmpty", "()V", "initBanner", "_placementId", "Ljava/lang/String;", "loadedHtml", "currentUserId", "Lkotlin/Function1;", "", "heightCallback", "Lvc/l;", "getHeightCallback", "()Lvc/l;", "setHeightCallback", "(Lvc/l;)V", "internalHeightCallback", "value", "getPlacementId", "()Ljava/lang/String;", "setPlacementId", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BannerView extends WebView implements IBannerView {
    private String _placementId;
    private String currentUserId;
    private l heightCallback;
    private final l internalHeightCallback;
    private String loadedHtml;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerView(Context context) {
        super(context);
        AbstractC4862t.e(context, "context");
        this.internalHeightCallback = new l() { // from class: C5.a
            @Override // vc.l
            public final Object invoke(Object obj) {
                return BannerView.internalHeightCallback$lambda$0(this.f1155a, ((Double) obj).doubleValue());
            }
        };
        init(null, 0);
    }

    private final void configureWebView(String placementId) {
        WebSettings settings = getSettings();
        AbstractC4862t.d(settings, "getSettings(...)");
        Context context = getContext();
        AbstractC4862t.d(context, "getContext(...)");
        WebViewUtilsKt.setWebViewSettings(settings, context);
        setLayerType(2, null);
        setBackgroundColor(0);
        DefaultBannerWebViewClientListener defaultBannerWebViewClientListener = new DefaultBannerWebViewClientListener();
        Context context2 = getContext();
        AbstractC4862t.d(context2, "getContext(...)");
        setWebViewClient(new BannerWebViewClient(context2, defaultBannerWebViewClientListener));
        Context context3 = getContext();
        AbstractC4862t.d(context3, "getContext(...)");
        addJavascriptInterface(new BannerJavascriptInterface(context3, placementId, this.internalHeightCallback), "brazeInternalBridge");
    }

    private final void init(AttributeSet attrs, int defStyle) {
        setBackgroundColor(0);
        Context context = getContext();
        AbstractC4862t.d(context, "getContext(...)");
        int[] BannerView = R$styleable.BannerView;
        AbstractC4862t.d(BannerView, "BannerView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, BannerView, defStyle, 0);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.BannerView_placementId)) {
            this._placementId = typedArrayObtainStyledAttributes.getString(R$styleable.BannerView_placementId);
        }
        typedArrayObtainStyledAttributes.recycle();
        initBanner(get_placementId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H internalHeightCallback$lambda$0(BannerView bannerView, double d10) {
        l lVar = bannerView.heightCallback;
        if (lVar != null) {
            lVar.invoke(Double.valueOf(d10));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadHtmlData(String placementId) {
        configureWebView(placementId);
        String str = this.loadedHtml;
        if (str != null) {
            byte[] bytes = str.getBytes(C1823c.f12394b);
            AbstractC4862t.d(bytes, "getBytes(...)");
            String strEncodeToString = Base64.encodeToString(bytes, 1);
            if (strEncodeToString == null) {
                strEncodeToString = "";
            }
            loadData(strEncodeToString, "text/html", "base64");
            invalidate();
        }
    }

    private final void setWebviewToEmpty() {
        this.loadedHtml = null;
        if (!AbstractC4862t.a(Looper.myLooper(), Looper.getMainLooper())) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: C5.c
                @Override // java.lang.Runnable
                public final void run() {
                    BannerView.setWebviewToEmpty$lambda$5(this.f1158a);
                }
            });
            return;
        }
        loadData("", "text/html", "base64");
        invalidate();
        this.internalHeightCallback.invoke(Double.valueOf(0.0d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setWebviewToEmpty$lambda$5(BannerView bannerView) {
        bannerView.loadData("", "text/html", "base64");
        bannerView.invalidate();
        bannerView.internalHeightCallback.invoke(Double.valueOf(0.0d));
    }

    public final l getHeightCallback() {
        return this.heightCallback;
    }

    /* JADX INFO: renamed from: getPlacementId, reason: from getter */
    public final String get_placementId() {
        return this._placementId;
    }

    @Override // com.braze.managers.IBannerView
    public void initBanner(final String placementId) {
        Banner banner;
        if (placementId != null) {
            Braze.Companion companion = Braze.INSTANCE;
            Context context = getContext();
            AbstractC4862t.d(context, "getContext(...)");
            banner = companion.getInstance(context).getBanner(placementId);
        } else {
            banner = null;
        }
        if (banner == null) {
            this.currentUserId = null;
            setWebviewToEmpty();
            if (placementId != null) {
                BrazeInternal.INSTANCE.addBannerViewMonitor(placementId, this, true);
                return;
            }
            return;
        }
        if (AbstractC4862t.a(banner.getHtml(), this.loadedHtml) && AbstractC4862t.a(banner.getUserId(), this.currentUserId)) {
            return;
        }
        this.loadedHtml = banner.getHtml();
        this.currentUserId = banner.getUserId();
        if (banner.getIsControl()) {
            setWebviewToEmpty();
        } else if (AbstractC4862t.a(Looper.myLooper(), Looper.getMainLooper())) {
            loadHtmlData(placementId);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: C5.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1156a.loadHtmlData(placementId);
                }
            });
        }
        BrazeInternal.INSTANCE.addBannerViewMonitor(banner.getPlacementId(), this, false);
    }

    public final void setHeightCallback(l lVar) {
        this.heightCallback = lVar;
    }

    public final void setPlacementId(String str) {
        this._placementId = str;
        initBanner(str);
    }
}
