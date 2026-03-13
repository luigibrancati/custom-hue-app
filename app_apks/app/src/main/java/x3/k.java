package x3;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import w3.AbstractC6122d;
import w3.AbstractC6123e;
import x3.AbstractC6295a;
import x3.i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC6295a.b f47385a = new AbstractC6295a.b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC6295a.b f47387b = new AbstractC6295a.b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC6295a.e f47389c = new AbstractC6295a.e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC6295a.c f47391d = new AbstractC6295a.c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC6295a.f f47393e = new AbstractC6295a.f("START_SAFE_BROWSING", "START_SAFE_BROWSING");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC6295a.f f47395f = new AbstractC6295a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AbstractC6295a.f f47397g = new AbstractC6295a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AbstractC6295a.f f47399h = new AbstractC6295a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AbstractC6295a.f f47401i = new AbstractC6295a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final AbstractC6295a.f f47403j = new AbstractC6295a.f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AbstractC6295a.c f47405k = new AbstractC6295a.c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AbstractC6295a.c f47407l = new AbstractC6295a.c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AbstractC6295a.c f47409m = new AbstractC6295a.c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AbstractC6295a.c f47411n = new AbstractC6295a.c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AbstractC6295a.c f47413o = new AbstractC6295a.c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AbstractC6295a.c f47415p = new AbstractC6295a.c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final AbstractC6295a.b f47417q = new AbstractC6295a.b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final AbstractC6295a.b f47419r = new AbstractC6295a.b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AbstractC6295a.c f47421s = new AbstractC6295a.c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AbstractC6295a.f f47423t = new AbstractC6295a.f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final AbstractC6295a.c f47425u = new AbstractC6295a.c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final AbstractC6295a.b f47427v = new AbstractC6295a.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final AbstractC6295a.b f47428w = new AbstractC6295a.b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final AbstractC6295a.f f47429x = new AbstractC6295a.f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final AbstractC6295a.f f47430y = new AbstractC6295a.f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final AbstractC6295a.f f47431z = new AbstractC6295a.f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final AbstractC6295a.b f47359A = new AbstractC6295a.b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final AbstractC6295a.b f47360B = new AbstractC6295a.b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final AbstractC6295a.d f47361C = new AbstractC6295a.d("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final AbstractC6295a.b f47362D = new AbstractC6295a.b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final AbstractC6295a.b f47363E = new AbstractC6295a.b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final AbstractC6295a.b f47364F = new AbstractC6295a.b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final AbstractC6295a.b f47365G = new AbstractC6295a.b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final AbstractC6295a.e f47366H = new AbstractC6295a.e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final AbstractC6295a.e f47367I = new AbstractC6295a.e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final AbstractC6295a.h f47368J = new AbstractC6295a.h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final AbstractC6295a.h f47369K = new AbstractC6295a.h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final AbstractC6295a.g f47370L = new AbstractC6295a.g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final i.b f47371M = new i.b("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final i.a f47372N = new i.a("STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS", "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final i.a f47373O = new i.a("STARTUP_FEATURE_CONFIGURE_PARTITIONED_COOKIES", "STARTUP_FEATURE_CONFIGURE_PARTITIONED_COOKIES");

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final AbstractC6295a.h f47374P = new AbstractC6295a.h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final AbstractC6295a.i f47375Q = new a("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final AbstractC6295a.d f47376R = new AbstractC6295a.d("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final AbstractC6295a.d f47377S = new AbstractC6295a.d("MULTI_PROCESS", "MULTI_PROCESS_QUERY");

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final AbstractC6295a.h f47378T = new AbstractC6295a.h("FORCE_DARK", "FORCE_DARK");

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final AbstractC6295a.d f47379U = new AbstractC6295a.d("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final AbstractC6295a.d f47380V = new AbstractC6295a.d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final AbstractC6295a.d f47381W = new AbstractC6295a.d("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final AbstractC6295a.d f47382X = new AbstractC6295a.d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final AbstractC6295a.d f47383Y = new AbstractC6295a.d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final AbstractC6295a.d f47384Z = new AbstractC6295a.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final AbstractC6295a.d f47386a0 = new AbstractC6295a.d("GET_COOKIE_INFO", "GET_COOKIE_INFO");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final AbstractC6295a.d f47388b0 = new AbstractC6295a.d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final AbstractC6295a.d f47390c0 = new AbstractC6295a.d("USER_AGENT_METADATA", "USER_AGENT_METADATA");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final AbstractC6295a.d f47392d0 = new b("MULTI_PROFILE", "MULTI_PROFILE");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final AbstractC6295a.d f47394e0 = new AbstractC6295a.d("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final AbstractC6295a.d f47396f0 = new AbstractC6295a.d("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final AbstractC6295a.d f47398g0 = new AbstractC6295a.d("MUTE_AUDIO", "MUTE_AUDIO");

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final AbstractC6295a.d f47400h0 = new AbstractC6295a.d("WEB_AUTHENTICATION", "WEB_AUTHENTICATION");

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final AbstractC6295a.d f47402i0 = new AbstractC6295a.d("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING");

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final AbstractC6295a.d f47404j0 = new AbstractC6295a.d("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE");

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final AbstractC6295a.d f47406k0 = new AbstractC6295a.d("DELETE_BROWSING_DATA", "WEB_STORAGE_DELETE_BROWSING_DATA");

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final AbstractC6295a.d f47408l0 = new c("PREFETCH_URL_V4", "PREFETCH_URL_V4");

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final AbstractC6295a.d f47410m0 = new AbstractC6295a.d("IMPLEMENTATION_ONLY_FEATURE", "ASYNC_WEBVIEW_STARTUP");

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final AbstractC6295a.d f47412n0 = new AbstractC6295a.d("DEFAULT_TRAFFICSTATS_TAGGING", "DEFAULT_TRAFFICSTATS_TAGGING");

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final AbstractC6295a.d f47414o0 = new AbstractC6295a.d("PRERENDER_URL_V2", "PRERENDER_URL_V2");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final AbstractC6295a.d f47416p0 = new AbstractC6295a.d("SPECULATIVE_LOADING_CONFIG_V2", "SPECULATIVE_LOADING_CONFIG_V2");

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final AbstractC6295a.d f47418q0 = new AbstractC6295a.d("SAVE_STATE", "SAVE_STATE");

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final AbstractC6295a.d f47420r0 = new AbstractC6295a.d("WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE", "WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE");

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final AbstractC6295a.d f47422s0 = new AbstractC6295a.d("CACHE_PROVIDER", "PROVIDER_WEAKLY_REF_WEBVIEW");

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final AbstractC6295a.d f47424t0 = new AbstractC6295a.d("PAYMENT_REQUEST", "PAYMENT_REQUEST");

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final AbstractC6295a.d f47426u0 = new AbstractC6295a.d("WEBVIEW_BUILDER", "WEBVIEW_BUILDER");

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends AbstractC6295a.i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Pattern f47432d;

        public a(String str, String str2) {
            super(str, str2);
            this.f47432d = Pattern.compile("\\A\\d+");
        }

        @Override // x3.AbstractC6295a
        public boolean c() {
            return super.c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends AbstractC6295a.d {
        public b(String str, String str2) {
            super(str, str2);
        }

        @Override // x3.AbstractC6295a
        public boolean c() {
            if (super.c() && AbstractC6123e.a("MULTI_PROCESS")) {
                return AbstractC6122d.b();
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends AbstractC6295a.d {
        public c(String str, String str2) {
            super(str, str2);
        }

        @Override // x3.AbstractC6295a
        public boolean c() {
            if (AbstractC6123e.a("MULTI_PROFILE")) {
                return super.c();
            }
            return false;
        }
    }

    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static boolean b(String str) {
        return c(str, AbstractC6295a.d());
    }

    public static boolean c(String str, Collection collection) {
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (fVar.a().equals(str)) {
                hashSet.add(fVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature " + str);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            if (((f) it2.next()).isSupported()) {
                return true;
            }
        }
        return false;
    }
}
