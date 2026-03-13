package com.signify.widgets;

import Ga.WidgetItem;
import Ga.f;
import Ga.l;
import Ga.n;
import Ga.q;
import Ga.u;
import Rd.AbstractC2130h;
import Rd.AbstractC2132i;
import Rd.C2123d0;
import Rd.M;
import Rd.Y0;
import Rd.a1;
import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.widget.Toast;
import com.google.android.libraries.barhopper.RecognitionOptions;
import fc.AbstractC4036s;
import fc.AbstractC4040w;
import fc.C4015H;
import fc.C4035r;
import gc.Q;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.view.FlutterCallbackInformation;
import io.sentry.SentryEvent;
import io.sentry.protocol.FeatureFlag;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import lc.C4994k;
import lc.InterfaceC4988e;
import mc.C5045b;
import mc.C5046c;
import nc.AbstractC5158b;
import nc.h;
import nc.m;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u0019\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0012\u0010\u000bJ\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0004R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/signify/widgets/WidgetsIntentService;", "Landroid/app/IntentService;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "<init>", "()V", "Lfc/H;", "onCreate", "onDestroy", "Landroid/content/Intent;", "intent", "onHandleIntent", "(Landroid/content/Intent;)V", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", FeatureFlag.JsonKeys.RESULT, "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "c", "d", "Lio/flutter/plugin/common/MethodChannel;", "a", "Lio/flutter/plugin/common/MethodChannel;", "backgroundChannel", "Lio/flutter/embedding/engine/FlutterEngine;", "b", "Lio/flutter/embedding/engine/FlutterEngine;", "backgroundFlutterEngine", "LGa/n;", "LGa/n;", SentryEvent.JsonKeys.LOGGER, "native_widgets_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WidgetsIntentService extends IntentService implements MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public MethodChannel backgroundChannel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public FlutterEngine backgroundFlutterEngine;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public n logger;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f32644j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ WidgetItem f32646l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f32647m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f32648n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ long f32649o;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends m implements p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public Object f32650j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public Object f32651k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public Object f32652l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public long f32653m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public int f32654n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f32655o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public final /* synthetic */ WidgetsIntentService f32656p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public final /* synthetic */ long f32657q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ String f32658r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ WidgetItem f32659s;

            /* JADX INFO: renamed from: com.signify.widgets.WidgetsIntentService$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public static final class C0389a extends m implements p {

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public int f32660j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ WidgetsIntentService f32661k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ long f32662l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ String f32663m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public final /* synthetic */ WidgetItem f32664n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ InterfaceC4988e f32665o;

                /* JADX INFO: renamed from: com.signify.widgets.WidgetsIntentService$b$a$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
                public static final class C0390a implements MethodChannel.Result {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ WidgetsIntentService f32666a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ InterfaceC4988e f32667b;

                    public C0390a(WidgetsIntentService widgetsIntentService, InterfaceC4988e interfaceC4988e) {
                        this.f32666a = widgetsIntentService;
                        this.f32667b = interfaceC4988e;
                    }

                    @Override // io.flutter.plugin.common.MethodChannel.Result
                    public void error(String errorCode, String str, Object obj) {
                        AbstractC4862t.e(errorCode, "errorCode");
                        n nVar = this.f32666a.logger;
                        if (nVar == null) {
                            AbstractC4862t.p(SentryEvent.JsonKeys.LOGGER);
                            nVar = null;
                        }
                        nVar.c("WidgetsIntentService: callback error " + str);
                        InterfaceC4988e interfaceC4988e = this.f32667b;
                        C4035r.a aVar = C4035r.f34274b;
                        interfaceC4988e.resumeWith(C4035r.b(C4015H.f34254a));
                    }

                    @Override // io.flutter.plugin.common.MethodChannel.Result
                    public void notImplemented() {
                        n nVar = this.f32666a.logger;
                        if (nVar == null) {
                            AbstractC4862t.p(SentryEvent.JsonKeys.LOGGER);
                            nVar = null;
                        }
                        nVar.c("WidgetsIntentService: callback not implemented");
                        InterfaceC4988e interfaceC4988e = this.f32667b;
                        C4035r.a aVar = C4035r.f34274b;
                        interfaceC4988e.resumeWith(C4035r.b(C4015H.f34254a));
                    }

                    @Override // io.flutter.plugin.common.MethodChannel.Result
                    public void success(Object obj) {
                        n nVar = this.f32666a.logger;
                        if (nVar == null) {
                            AbstractC4862t.p(SentryEvent.JsonKeys.LOGGER);
                            nVar = null;
                        }
                        nVar.a("WidgetsIntentService: callback success");
                        InterfaceC4988e interfaceC4988e = this.f32667b;
                        C4035r.a aVar = C4035r.f34274b;
                        interfaceC4988e.resumeWith(C4035r.b(C4015H.f34254a));
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0389a(WidgetsIntentService widgetsIntentService, long j10, String str, WidgetItem widgetItem, InterfaceC4988e interfaceC4988e, InterfaceC4988e interfaceC4988e2) {
                    super(2, interfaceC4988e2);
                    this.f32661k = widgetsIntentService;
                    this.f32662l = j10;
                    this.f32663m = str;
                    this.f32664n = widgetItem;
                    this.f32665o = interfaceC4988e;
                }

                @Override // nc.AbstractC5157a
                public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                    return new C0389a(this.f32661k, this.f32662l, this.f32663m, this.f32664n, this.f32665o, interfaceC4988e);
                }

                @Override // vc.p
                public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
                    return ((C0389a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
                }

                @Override // nc.AbstractC5157a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C5046c.f();
                    if (this.f32660j != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4036s.b(obj);
                    MethodChannel methodChannel = this.f32661k.backgroundChannel;
                    if (methodChannel != null) {
                        methodChannel.invokeMethod("widgets", Q.l(AbstractC4040w.a("appCallbackHandle", AbstractC5158b.d(this.f32662l)), AbstractC4040w.a("widgetItemId", this.f32663m), AbstractC4040w.a("shouldTurnOff", AbstractC5158b.a(this.f32664n.getShouldTurnOff()))), new C0390a(this.f32661k, this.f32665o));
                    }
                    return C4015H.f34254a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WidgetsIntentService widgetsIntentService, long j10, String str, WidgetItem widgetItem, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f32656p = widgetsIntentService;
                this.f32657q = j10;
                this.f32658r = str;
                this.f32659s = widgetItem;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                a aVar = new a(this.f32656p, this.f32657q, this.f32658r, this.f32659s, interfaceC4988e);
                aVar.f32655o = obj;
                return aVar;
            }

            @Override // vc.p
            public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
                return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                M m10 = (M) this.f32655o;
                Object objF = C5046c.f();
                int i10 = this.f32654n;
                if (i10 == 0) {
                    AbstractC4036s.b(obj);
                    WidgetsIntentService widgetsIntentService = this.f32656p;
                    long j10 = this.f32657q;
                    String str = this.f32658r;
                    WidgetItem widgetItem = this.f32659s;
                    this.f32655o = m10;
                    this.f32650j = widgetsIntentService;
                    this.f32651k = str;
                    this.f32652l = widgetItem;
                    this.f32653m = j10;
                    this.f32654n = 1;
                    C4994k c4994k = new C4994k(C5045b.c(this));
                    AbstractC2132i.d(m10, C2123d0.c(), null, new C0389a(widgetsIntentService, j10, str, widgetItem, c4994k, null), 2, null);
                    Object objA = c4994k.a();
                    if (objA == C5046c.f()) {
                        h.c(this);
                    }
                    if (objA == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4036s.b(obj);
                }
                return C4015H.f34254a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(WidgetItem widgetItem, String str, int i10, long j10, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f32646l = widgetItem;
            this.f32647m = str;
            this.f32648n = i10;
            this.f32649o = j10;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return WidgetsIntentService.this.new b(this.f32646l, this.f32647m, this.f32648n, this.f32649o, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((b) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f32644j;
            n nVar = null;
            try {
                if (i10 == 0) {
                    AbstractC4036s.b(obj);
                    a aVar = new a(WidgetsIntentService.this, this.f32649o, this.f32647m, this.f32646l, null);
                    this.f32644j = 1;
                    if (a1.c(10000L, aVar, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4036s.b(obj);
                }
            } catch (Y0 unused) {
                n nVar2 = WidgetsIntentService.this.logger;
                if (nVar2 == null) {
                    AbstractC4862t.p(SentryEvent.JsonKeys.LOGGER);
                    nVar2 = null;
                }
                nVar2.c("WidgetsIntentService: callback timeout");
            }
            n nVar3 = WidgetsIntentService.this.logger;
            if (nVar3 == null) {
                AbstractC4862t.p(SentryEvent.JsonKeys.LOGGER);
                nVar3 = null;
            }
            nVar3.a("WidgetsIntentService: dart method call finished");
            if (this.f32646l.getType() == Ga.m.sceneRecall) {
                Context applicationContext = WidgetsIntentService.this.getApplicationContext();
                AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
                new u(applicationContext).j(this.f32647m, !this.f32646l.getShouldTurnOff());
                if (!this.f32646l.getShouldTurnOff()) {
                    Intent intent = new Intent(WidgetsIntentService.this, (Class<?>) WidgetItemResetReceiver.class);
                    String str = this.f32647m;
                    int i11 = this.f32648n;
                    WidgetsIntentService widgetsIntentService = WidgetsIntentService.this;
                    intent.setIdentifier(str);
                    intent.putExtra("widgetIdParam", i11);
                    intent.putExtra("widgetItemIdActionParam", str);
                    PendingIntent broadcast = PendingIntent.getBroadcast(widgetsIntentService, 0, intent, 167772160);
                    Object systemService = WidgetsIntentService.this.getSystemService("alarm");
                    AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
                    ((AlarmManager) systemService).set(2, SystemClock.elapsedRealtime() + 10000, broadcast);
                    n nVar4 = WidgetsIntentService.this.logger;
                    if (nVar4 == null) {
                        AbstractC4862t.p(SentryEvent.JsonKeys.LOGGER);
                        nVar4 = null;
                    }
                    nVar4.a("WidgetsIntentService: created reset alarm");
                }
            }
            WidgetsIntentService widgetsIntentService2 = WidgetsIntentService.this;
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(widgetsIntentService2);
            AbstractC4862t.d(appWidgetManager, "getInstance(...)");
            int i12 = this.f32648n;
            l lVar = l.Idle;
            n nVar5 = WidgetsIntentService.this.logger;
            if (nVar5 == null) {
                AbstractC4862t.p(SentryEvent.JsonKeys.LOGGER);
            } else {
                nVar = nVar5;
            }
            Ga.h.c(widgetsIntentService2, appWidgetManager, i12, lVar, nVar);
            return C4015H.f34254a;
        }
    }

    public WidgetsIntentService() {
        super("WidgetsIntentService");
    }

    public final void c(Intent intent) {
        String stringExtra = intent.getStringExtra("widgetItemIdActionParam");
        AbstractC4862t.b(stringExtra);
        int intExtra = intent.getIntExtra("widgetIdParam", 0);
        Context applicationContext = getApplicationContext();
        AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
        u uVar = new u(applicationContext);
        long jE = uVar.e();
        WidgetItem widgetItemC = uVar.c(stringExtra);
        AbstractC4862t.b(widgetItemC);
        n nVar = this.logger;
        if (nVar == null) {
            AbstractC4862t.p(SentryEvent.JsonKeys.LOGGER);
            nVar = null;
        }
        nVar.a("WidgetsIntentService: STARTED handling ToggleLightsIntent, widgetItemId=" + stringExtra + ", callbackHandle: " + jE);
        new q().e(this, f.f4644e);
        AbstractC2130h.b(null, new b(widgetItemC, stringExtra, intExtra, jE, null), 1, null);
    }

    public final void d() {
        q qVar = new q();
        startForeground(qVar.c(), q.b(qVar, this, 0, 2, null), RecognitionOptions.PDF417);
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        FlutterCallbackInformation flutterCallbackInformationLookupCallbackInformation;
        super.onCreate();
        d();
        FlutterLoader flutterLoader = new FlutterLoader();
        flutterLoader.startInitialization(getApplicationContext());
        flutterLoader.ensureInitializationComplete(getApplicationContext(), new String[0]);
        this.logger = new n(getApplicationContext().getSharedPreferences("widgets_plugin_cache", 0).getBoolean("showWidgetLogs", false));
        Context applicationContext = getApplicationContext();
        AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
        n nVar = null;
        try {
            flutterCallbackInformationLookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(new u(applicationContext).f());
        } catch (IllegalStateException unused) {
            n nVar2 = this.logger;
            if (nVar2 == null) {
                AbstractC4862t.p(SentryEvent.JsonKeys.LOGGER);
                nVar2 = null;
            }
            nVar2.b("WidgetsIntentService: Fatal: failed to find callback");
            flutterCallbackInformationLookupCallbackInformation = null;
        }
        if (flutterCallbackInformationLookupCallbackInformation != null) {
            this.backgroundFlutterEngine = new FlutterEngine(getApplicationContext());
            DartExecutor.DartCallback dartCallback = new DartExecutor.DartCallback(getApplicationContext().getAssets(), flutterLoader.findAppBundlePath(), flutterCallbackInformationLookupCallbackInformation);
            FlutterEngine flutterEngine = this.backgroundFlutterEngine;
            AbstractC4862t.b(flutterEngine);
            flutterEngine.getDartExecutor().executeDartCallback(dartCallback);
            FlutterEngine flutterEngine2 = this.backgroundFlutterEngine;
            AbstractC4862t.b(flutterEngine2);
            MethodChannel methodChannel = new MethodChannel(flutterEngine2.getDartExecutor().getBinaryMessenger(), "com.signify.widgets.callback");
            methodChannel.setMethodCallHandler(this);
            this.backgroundChannel = methodChannel;
        }
        n nVar3 = this.logger;
        if (nVar3 == null) {
            AbstractC4862t.p(SentryEvent.JsonKeys.LOGGER);
        } else {
            nVar = nVar3;
        }
        nVar.a("WidgetsIntentService: WidgetsIntentService.onCreate");
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        FlutterEngine flutterEngine = this.backgroundFlutterEngine;
        if (flutterEngine != null) {
            flutterEngine.destroy();
        }
        n nVar = this.logger;
        if (nVar == null) {
            AbstractC4862t.p(SentryEvent.JsonKeys.LOGGER);
            nVar = null;
        }
        nVar.a("WidgetsIntentService: WidgetsIntentService.onDestroy");
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        String action;
        if (intent == null || (action = intent.getAction()) == null) {
            return;
        }
        if (AbstractC4862t.a(action, "lightControlAction")) {
            c(intent);
            return;
        }
        n nVar = this.logger;
        if (nVar == null) {
            AbstractC4862t.p(SentryEvent.JsonKeys.LOGGER);
            nVar = null;
        }
        nVar.c("WidgetsIntentService: Some unknown action is executed");
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        int i10;
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(result, "result");
        if (!AbstractC4862t.a(call.method, "showErrorMessage")) {
            result.notImplemented();
            return;
        }
        Object objArgument = call.argument("errorCode");
        AbstractC4862t.b(objArgument);
        int iIntValue = ((Number) objArgument).intValue();
        if (iIntValue == 1000) {
            i10 = f.f4641b;
        } else if (iIntValue == 2000) {
            i10 = f.f4640a;
        } else if (iIntValue == 3000) {
            i10 = f.f4643d;
        } else {
            if (iIntValue != 4000) {
                throw new IllegalArgumentException("Invalid error code");
            }
            i10 = f.f4642c;
        }
        Toast.makeText(this, i10, 1).show();
        result.success(0);
    }
}
