package hb;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import ke.C4840b;
import ke.g;
import ke.j;
import ke.m;
import ke.n;
import ke.r;
import me.C5055b;
import me.InterfaceC5054a;
import net.openid.appauth.a;
import net.openid.appauth.b;
import net.openid.appauth.c;
import org.apache.tika.utils.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: hb.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C4294a implements FlutterPlugin, MethodChannel.MethodCallHandler, PluginRegistry.ActivityResultListener, ActivityAware {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36421a = 65030;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36422b = 65031;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36423c = 65032;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f36424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Activity f36425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f36426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f36427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f36428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public net.openid.appauth.b f36429i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public net.openid.appauth.b f36430j;

    /* JADX INFO: renamed from: hb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0471a implements c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f36431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f36432b;

        public C0471a(f fVar, boolean z10) {
            this.f36431a = fVar;
            this.f36432b = z10;
        }

        @Override // net.openid.appauth.c.b
        public void a(net.openid.appauth.c cVar, net.openid.appauth.a aVar) {
            if (aVar != null) {
                C4294a.this.n(aVar);
                return;
            }
            C4294a c4294a = C4294a.this;
            f fVar = this.f36431a;
            c4294a.z(cVar, fVar.f36457a, fVar.f36461e, fVar.f36460d, fVar.f36441n, fVar.f36465i, fVar.f36468l, this.f36432b, fVar.f36442o, fVar.f36443p);
        }
    }

    /* JADX INFO: renamed from: hb.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f36434a;

        public b(i iVar) {
            this.f36434a = iVar;
        }

        @Override // net.openid.appauth.c.b
        public void a(net.openid.appauth.c cVar, net.openid.appauth.a aVar) {
            if (aVar == null) {
                C4294a.this.B(cVar, this.f36434a);
            } else {
                C4294a.this.n(aVar);
            }
        }
    }

    /* JADX INFO: renamed from: hb.a$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements b.InterfaceC0545b {
        public c() {
        }

        @Override // net.openid.appauth.b.InterfaceC0545b
        public void a(net.openid.appauth.g gVar, net.openid.appauth.a aVar) {
            if (gVar == null) {
                C4294a.this.r(aVar);
            } else {
                C4294a.this.q(C4294a.this.H(gVar, null));
            }
        }
    }

    /* JADX INFO: renamed from: hb.a$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f36437a;

        public d(g gVar) {
            this.f36437a = gVar;
        }

        @Override // net.openid.appauth.c.b
        public void a(net.openid.appauth.c cVar, net.openid.appauth.a aVar) {
            if (aVar == null) {
                C4294a.this.A(cVar, this.f36437a);
            } else {
                C4294a.this.n(aVar);
            }
        }
    }

    /* JADX INFO: renamed from: hb.a$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class e implements b.InterfaceC0545b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ke.h f36439a;

        public e(ke.h hVar) {
            this.f36439a = hVar;
        }

        @Override // net.openid.appauth.b.InterfaceC0545b
        public void a(net.openid.appauth.g gVar, net.openid.appauth.a aVar) {
            if (gVar == null) {
                C4294a.this.p("authorize_and_exchange_code_failed", String.format("Failed to authorize: [error: %s, description: %s]", aVar.f40880c, aVar.f40881d), aVar);
            } else {
                C4294a c4294a = C4294a.this;
                c4294a.q(c4294a.H(gVar, this.f36439a));
            }
        }
    }

    /* JADX INFO: renamed from: hb.a$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class f extends i {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f36441n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final ArrayList f36442o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final String f36443p;

        public /* synthetic */ f(C4294a c4294a, String str, String str2, String str3, ArrayList arrayList, String str4, Map map, Map map2, String str5, String str6, ArrayList arrayList2, String str7, C0471a c0471a) {
            this(str, str2, str3, arrayList, str4, map, map2, str5, str6, arrayList2, str7);
        }

        public f(String str, String str2, String str3, ArrayList arrayList, String str4, Map map, Map map2, String str5, String str6, ArrayList arrayList2, String str7) {
            super(C4294a.this, str, str2, str3, arrayList, str4, null, null, null, str6, null, map, map2, null);
            this.f36441n = str5;
            this.f36442o = arrayList2;
            this.f36443p = str7;
        }
    }

    /* JADX INFO: renamed from: hb.a$g */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f36445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f36446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f36447c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f36448d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f36449e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f36450f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Map f36451g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Map f36452h;

        public /* synthetic */ g(C4294a c4294a, String str, String str2, String str3, String str4, String str5, boolean z10, Map map, Map map2, C0471a c0471a) {
            this(str, str2, str3, str4, str5, z10, map, map2);
        }

        public g(String str, String str2, String str3, String str4, String str5, boolean z10, Map map, Map map2) {
            this.f36445a = str;
            this.f36446b = str2;
            this.f36447c = str3;
            this.f36448d = str4;
            this.f36449e = str5;
            this.f36450f = z10;
            this.f36451g = map;
            this.f36452h = map2;
        }
    }

    /* JADX INFO: renamed from: hb.a$h */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f36454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MethodChannel.Result f36455b;

        public h(String str, MethodChannel.Result result) {
            this.f36454a = str;
            this.f36455b = result;
        }
    }

    /* JADX INFO: renamed from: hb.a$i */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f36457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f36458b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f36459c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList f36460d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f36461e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f36462f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f36463g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f36464h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f36465i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f36466j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Map f36467k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Map f36468l;

        public /* synthetic */ i(C4294a c4294a, String str, String str2, String str3, ArrayList arrayList, String str4, String str5, String str6, String str7, String str8, String str9, Map map, Map map2, C0471a c0471a) {
            this(str, str2, str3, arrayList, str4, str5, str6, str7, str8, str9, map, map2);
        }

        public i(String str, String str2, String str3, ArrayList arrayList, String str4, String str5, String str6, String str7, String str8, String str9, Map map, Map map2) {
            this.f36457a = str;
            this.f36458b = str2;
            this.f36459c = str3;
            this.f36460d = arrayList;
            this.f36461e = str4;
            this.f36462f = str5;
            this.f36466j = str6;
            this.f36464h = str7;
            this.f36465i = str8;
            this.f36463g = str9;
            this.f36467k = map;
            this.f36468l = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(Object obj) {
        h hVar = this.f36426f;
        if (hVar != null) {
            hVar.f36455b.success(obj);
            this.f36426f = null;
        }
    }

    private void y(Context context, BinaryMessenger binaryMessenger) {
        this.f36424d = context;
        k();
        new MethodChannel(binaryMessenger, "crossingthestreams.io/flutter_appauth").setMethodCallHandler(this);
    }

    public final void A(net.openid.appauth.c cVar, g gVar) {
        m.b bVar = new m.b(cVar);
        String str = gVar.f36445a;
        if (str != null) {
            bVar.d(str);
        }
        String str2 = gVar.f36446b;
        if (str2 != null) {
            bVar.e(Uri.parse(str2));
        }
        String str3 = gVar.f36447c;
        if (str3 != null) {
            bVar.f(str3);
        }
        Map map = gVar.f36452h;
        if (map != null) {
            bVar.b(map);
        }
        try {
            this.f36425e.startActivityForResult(s().f(bVar.a()), 65032);
        } catch (NullPointerException e10) {
            p("null_activity", "Failed to authorize: Null activity received", e10);
        }
    }

    public final void B(net.openid.appauth.c cVar, i iVar) {
        r.b bVarJ = new r.b(cVar, iVar.f36457a).k(iVar.f36462f).d(iVar.f36466j).f(iVar.f36464h).j(Uri.parse(iVar.f36461e));
        String str = iVar.f36465i;
        if (str != null) {
            bVarJ.i(str);
        }
        String str2 = iVar.f36463g;
        if (str2 != null) {
            bVarJ.h(str2);
        }
        ArrayList arrayList = iVar.f36460d;
        if (arrayList != null) {
            bVarJ.l(arrayList);
        }
        Map map = iVar.f36468l;
        if (map != null && !map.isEmpty()) {
            bVarJ.c(iVar.f36468l);
        }
        c cVar2 = new c();
        r rVarA = bVarJ.a();
        net.openid.appauth.b bVarS = s();
        String str3 = this.f36427g;
        if (str3 == null) {
            bVarS.i(rVarA, cVar2);
        } else {
            bVarS.h(rVarA, new j(str3), cVar2);
        }
    }

    public final void C(ke.h hVar, net.openid.appauth.a aVar, boolean z10) {
        if (aVar != null) {
            p(z10 ? "authorize_and_exchange_code_failed" : "authorize_failed", String.format("Failed to authorize: [error: %s, description: %s]", aVar.f40880c, aVar.f40881d), aVar);
            return;
        }
        if (!z10) {
            q(i(hVar));
            return;
        }
        net.openid.appauth.b bVarS = s();
        e eVar = new e(hVar);
        if (this.f36427g == null) {
            bVarS.i(hVar.f(), eVar);
        } else {
            bVarS.h(hVar.f(), new j(this.f36427g), eVar);
        }
    }

    public final f D(Map map) {
        String str = (String) map.get("clientId");
        String str2 = (String) map.get("issuer");
        String str3 = (String) map.get("discoveryUrl");
        String str4 = (String) map.get("redirectUrl");
        String str5 = (String) map.get("loginHint");
        String str6 = (String) map.get("nonce");
        this.f36427g = (String) map.get("clientSecret");
        ArrayList arrayList = (ArrayList) map.get("scopes");
        ArrayList arrayList2 = (ArrayList) map.get("promptValues");
        Map map2 = (Map) map.get("serviceConfiguration");
        Map map3 = (Map) map.get("additionalParameters");
        this.f36428h = ((Boolean) map.get("allowInsecureConnections")).booleanValue();
        return new f(this, str, str2, str3, arrayList, str4, map2, map3, str5, str6, arrayList2, (String) map.get("responseMode"), null);
    }

    public final g E(Map map) {
        return new g(this, (String) map.get("idTokenHint"), (String) map.get("postLogoutRedirectUrl"), (String) map.get(SentryThread.JsonKeys.STATE), (String) map.get("issuer"), (String) map.get("discoveryUrl"), ((Boolean) map.get("allowInsecureConnections")).booleanValue(), (Map) map.get("serviceConfiguration"), (Map) map.get("additionalParameters"), null);
    }

    public final net.openid.appauth.c F(Map map) {
        String str = (String) map.get("endSessionEndpoint");
        return new net.openid.appauth.c(Uri.parse((String) map.get("authorizationEndpoint")), Uri.parse((String) map.get("tokenEndpoint")), null, str == null ? null : Uri.parse(str));
    }

    public final i G(Map map) {
        String str = (String) map.get("clientId");
        String str2 = (String) map.get("issuer");
        String str3 = (String) map.get("discoveryUrl");
        String str4 = (String) map.get("redirectUrl");
        String str5 = (String) map.get("grantType");
        this.f36427g = (String) map.get("clientSecret");
        String str6 = map.containsKey("refreshToken") ? (String) map.get("refreshToken") : null;
        String str7 = map.containsKey("authorizationCode") ? (String) map.get("authorizationCode") : null;
        String str8 = map.containsKey("codeVerifier") ? (String) map.get("codeVerifier") : null;
        String str9 = map.containsKey("nonce") ? (String) map.get("nonce") : null;
        ArrayList arrayList = (ArrayList) map.get("scopes");
        Map map2 = (Map) map.get("serviceConfiguration");
        Map map3 = (Map) map.get("additionalParameters");
        this.f36428h = ((Boolean) map.get("allowInsecureConnections")).booleanValue();
        return new i(this, str, str2, str3, arrayList, str4, str6, str7, str8, str9, str5, map2, map3, null);
    }

    public final Map H(net.openid.appauth.g gVar, ke.h hVar) {
        HashMap map = new HashMap();
        map.put("accessToken", gVar.f40991c);
        Long l10 = gVar.f40992d;
        map.put("accessTokenExpirationTime", l10 != null ? Double.valueOf(l10.doubleValue()) : null);
        map.put("refreshToken", gVar.f40994f);
        map.put("idToken", gVar.f40993e);
        map.put("tokenType", gVar.f40990b);
        String str = gVar.f40995g;
        map.put("scopes", str != null ? Arrays.asList(str.split(StringUtils.SPACE)) : null);
        if (hVar != null) {
            map.put("authorizationAdditionalParameters", hVar.f39718i);
        }
        map.put("tokenAdditionalParameters", gVar.f40996h);
        return map;
    }

    public final Map i(ke.h hVar) {
        HashMap map = new HashMap();
        map.put("codeVerifier", hVar.f39710a.f39684l);
        map.put("nonce", hVar.f39710a.f39683k);
        map.put("authorizationCode", hVar.f39713d);
        map.put("authorizationAdditionalParameters", hVar.f39718i);
        return map;
    }

    public final void j(String str, MethodChannel.Result result) {
        if (this.f36426f == null) {
            this.f36426f = new h(str, result);
            return;
        }
        throw new IllegalStateException("Concurrent operations detected: " + this.f36426f.f36454a + ", " + str);
    }

    public final void k() {
        if (this.f36429i == null) {
            this.f36429i = new net.openid.appauth.b(this.f36424d);
        }
        if (this.f36430j == null) {
            C4840b.C0518b c0518b = new C4840b.C0518b();
            c0518b.b(C4295b.f36470a);
            c0518b.c(Boolean.TRUE);
            this.f36430j = new net.openid.appauth.b(this.f36424d, c0518b.a());
        }
    }

    public final Map l(Exception exc) {
        net.openid.appauth.a aVar = exc instanceof net.openid.appauth.a ? (net.openid.appauth.a) exc : null;
        HashMap map = new HashMap();
        map.put("legacy_error_details", t(exc));
        if (aVar != null) {
            boolean zEquals = aVar.equals(a.b.f40895b);
            map.put("type", String.valueOf(aVar.f40878a));
            map.put("code", String.valueOf(aVar.f40879b));
            map.put("error", aVar.f40880c);
            map.put("error_description", aVar.f40881d);
            Uri uri = aVar.f40882e;
            map.put("error_uri", uri == null ? null : uri.toString());
            map.put("root_cause_debug_description", aVar.getCause() != null ? aVar.getCause().toString() : null);
            map.put("error_debug_description", aVar.toString());
            map.put("user_did_cancel", String.valueOf(zEquals));
        }
        return map;
    }

    public final void m() {
        this.f36429i.c();
        this.f36430j.c();
        this.f36429i = null;
        this.f36430j = null;
    }

    public final void n(net.openid.appauth.a aVar) {
        p("discovery_failed", String.format("Error retrieving discovery document: [error: %s, description: %s]", aVar.f40880c, aVar.f40881d), aVar);
    }

    public final void o(net.openid.appauth.a aVar) {
        p("end_session_failed", String.format("Failed to end session: [error: %s, description: %s]", aVar.f40880c, aVar.f40881d), aVar);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        if (this.f36426f == null) {
            return false;
        }
        if (i10 == 65030 || i10 == 65031) {
            if (intent == null) {
                p("null_intent", "Failed to authorize: Null intent received", null);
            } else {
                C(ke.h.h(intent), net.openid.appauth.a.g(intent), i10 == 65030);
            }
            return true;
        }
        if (i10 != 65032) {
            return false;
        }
        if (intent == null) {
            p("null_intent", "Failed to authorize: Null intent received", null);
        } else {
            n nVarE = n.e(intent);
            net.openid.appauth.a aVarG = net.openid.appauth.a.g(intent);
            if (aVarG != null) {
                o(aVarG);
            } else {
                HashMap map = new HashMap();
                map.put(SentryThread.JsonKeys.STATE, nVarE.f39744b);
                q(map);
            }
        }
        return true;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        activityPluginBinding.addActivityResultListener(this);
        this.f36425e = activityPluginBinding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        y(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f36425e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f36425e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m();
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Map map;
        map = (Map) methodCall.arguments();
        String str = methodCall.method;
        str.getClass();
        switch (str) {
            case "endSession":
                try {
                    j(methodCall.method, result);
                    w(map);
                    break;
                } catch (Exception e10) {
                    p("end_session_failed", e10.getLocalizedMessage(), e10);
                    return;
                }
                break;
            case "authorizeAndExchangeCode":
                try {
                    j(methodCall.method, result);
                    v(map, true);
                    break;
                } catch (Exception e11) {
                    p("authorize_and_exchange_code_failed", e11.getLocalizedMessage(), e11);
                    return;
                }
                break;
            case "token":
                try {
                    j(methodCall.method, result);
                    x(map);
                    break;
                } catch (Exception e12) {
                    p("token_failed", e12.getLocalizedMessage(), e12);
                    return;
                }
                break;
            case "authorize":
                try {
                    j(methodCall.method, result);
                    v(map, false);
                    break;
                } catch (Exception e13) {
                    p("authorize_failed", e13.getLocalizedMessage(), e13);
                    return;
                }
                break;
            default:
                result.notImplemented();
                break;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        activityPluginBinding.addActivityResultListener(this);
        this.f36425e = activityPluginBinding.getActivity();
    }

    public final void p(String str, String str2, Exception exc) {
        h hVar = this.f36426f;
        if (hVar != null) {
            hVar.f36455b.error(str, str2, l(exc));
            this.f36426f = null;
        }
    }

    public final void r(net.openid.appauth.a aVar) {
        p("token_failed", String.format("Failed to get token: [error: %s, description: %s]", aVar.f40880c, aVar.f40881d), aVar);
    }

    public final net.openid.appauth.b s() {
        k();
        return this.f36428h ? this.f36430j : this.f36429i;
    }

    public final String t(Exception exc) {
        if (exc == null) {
            return "";
        }
        Throwable cause = exc.getCause();
        if (cause != null) {
            return cause.getMessage();
        }
        return null;
    }

    public final InterfaceC5054a u() {
        return this.f36428h ? C4295b.f36470a : C5055b.f40400a;
    }

    public final void v(Map map, boolean z10) {
        f fVarD = D(map);
        Map map2 = fVarD.f36467k;
        if (map2 != null) {
            z(F(map2), fVarD.f36457a, fVarD.f36461e, fVarD.f36460d, fVarD.f36441n, fVarD.f36465i, fVarD.f36468l, z10, fVarD.f36442o, fVarD.f36443p);
            return;
        }
        C0471a c0471a = new C0471a(fVarD, z10);
        String str = fVarD.f36459c;
        if (str != null) {
            net.openid.appauth.c.c(Uri.parse(str), c0471a, u());
        } else {
            net.openid.appauth.c.b(Uri.parse(fVarD.f36458b), c0471a, u());
        }
    }

    public final void w(Map map) {
        g gVarE = E(map);
        Map map2 = gVarE.f36451g;
        if (map2 != null) {
            A(F(map2), gVarE);
            return;
        }
        d dVar = new d(gVarE);
        String str = gVarE.f36449e;
        if (str != null) {
            net.openid.appauth.c.c(Uri.parse(str), dVar, u());
        } else {
            net.openid.appauth.c.b(Uri.parse(gVarE.f36448d), dVar, u());
        }
    }

    public final void x(Map map) {
        i iVarG = G(map);
        Map map2 = iVarG.f36467k;
        if (map2 != null) {
            B(F(map2), iVarG);
            return;
        }
        b bVar = new b(iVarG);
        String str = iVarG.f36459c;
        if (str != null) {
            net.openid.appauth.c.c(Uri.parse(str), bVar, u());
        } else {
            net.openid.appauth.c.b(Uri.parse(iVarG.f36458b), bVar, u());
        }
    }

    public final void z(net.openid.appauth.c cVar, String str, String str2, ArrayList arrayList, String str3, String str4, Map map, boolean z10, ArrayList arrayList2, String str5) {
        g.b bVar = new g.b(cVar, str, "code", Uri.parse(str2));
        if (arrayList != null && !arrayList.isEmpty()) {
            bVar.m(arrayList);
        }
        if (str3 != null) {
            bVar.g(str3);
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            bVar.i(arrayList2);
        }
        if (str5 != null) {
            bVar.k(str5);
        }
        if (str4 != null) {
            bVar.h(str4);
        }
        if (map != null && !map.isEmpty()) {
            if (map.containsKey("ui_locales")) {
                bVar.o((String) map.get("ui_locales"));
                map.remove("ui_locales");
            }
            if (map.containsKey("claims")) {
                try {
                    bVar.d(new JSONObject((String) map.get("claims")));
                    map.remove("claims");
                } catch (JSONException e10) {
                    p("invalid_claims", e10.getLocalizedMessage(), e10);
                    return;
                }
            }
            bVar.b(map);
        }
        try {
            this.f36425e.startActivityForResult(s().d(bVar.a()), z10 ? 65030 : 65031);
        } catch (ActivityNotFoundException e11) {
            p("no_browser_available", "Failed to authorize: No suitable browser is available", e11);
        } catch (NullPointerException e12) {
            p("null_activity", "Failed to authorize: Null activity received", e12);
        }
    }
}
