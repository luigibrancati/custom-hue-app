package x8;

import io.flutter.plugins.firebase.crashlytics.Constants;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryEvent;
import io.sentry.SentryLockReason;
import io.sentry.cache.EnvelopeCache;
import io.sentry.protocol.App;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.Device;
import io.sentry.protocol.OperatingSystem;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.SentryThread;
import io.sentry.rrweb.RRWebVideoEvent;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import x8.F;

/* JADX INFO: renamed from: x8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6322a implements I8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I8.a f47539a = new C6322a();

    /* JADX INFO: renamed from: x8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0664a implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0664a f47540a = new C0664a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f47541b = H8.d.d(DebugImage.JsonKeys.ARCH);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H8.d f47542c = H8.d.d("libraryName");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final H8.d f47543d = H8.d.d(Constants.BUILD_ID);

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.a.AbstractC0646a abstractC0646a, H8.f fVar) {
            fVar.e(f47541b, abstractC0646a.b());
            fVar.e(f47542c, abstractC0646a.d());
            fVar.e(f47543d, abstractC0646a.c());
        }
    }

    /* JADX INFO: renamed from: x8.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47544a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f47545b = H8.d.d("pid");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H8.d f47546c = H8.d.d("processName");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final H8.d f47547d = H8.d.d("reasonCode");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final H8.d f47548e = H8.d.d("importance");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final H8.d f47549f = H8.d.d("pss");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final H8.d f47550g = H8.d.d("rss");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final H8.d f47551h = H8.d.d("timestamp");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final H8.d f47552i = H8.d.d("traceFile");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final H8.d f47553j = H8.d.d("buildIdMappingForArch");

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.a aVar, H8.f fVar) {
            fVar.c(f47545b, aVar.d());
            fVar.e(f47546c, aVar.e());
            fVar.c(f47547d, aVar.g());
            fVar.c(f47548e, aVar.c());
            fVar.b(f47549f, aVar.f());
            fVar.b(f47550g, aVar.h());
            fVar.b(f47551h, aVar.i());
            fVar.e(f47552i, aVar.j());
            fVar.e(f47553j, aVar.b());
        }
    }

    /* JADX INFO: renamed from: x8.a$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f47554a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f47555b = H8.d.d("key");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H8.d f47556c = H8.d.d("value");

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.c cVar, H8.f fVar) {
            fVar.e(f47555b, cVar.b());
            fVar.e(f47556c, cVar.c());
        }
    }

    /* JADX INFO: renamed from: x8.a$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f47557a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f47558b = H8.d.d("sdkVersion");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H8.d f47559c = H8.d.d("gmpAppId");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final H8.d f47560d = H8.d.d("platform");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final H8.d f47561e = H8.d.d("installationUuid");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final H8.d f47562f = H8.d.d("firebaseInstallationId");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final H8.d f47563g = H8.d.d("firebaseAuthenticationToken");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final H8.d f47564h = H8.d.d("appQualitySessionId");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final H8.d f47565i = H8.d.d("buildVersion");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final H8.d f47566j = H8.d.d("displayVersion");

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final H8.d f47567k = H8.d.d(EnvelopeCache.PREFIX_CURRENT_SESSION_FILE);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final H8.d f47568l = H8.d.d("ndkPayload");

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final H8.d f47569m = H8.d.d("appExitInfo");

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F f10, H8.f fVar) {
            fVar.e(f47558b, f10.m());
            fVar.e(f47559c, f10.i());
            fVar.c(f47560d, f10.l());
            fVar.e(f47561e, f10.j());
            fVar.e(f47562f, f10.h());
            fVar.e(f47563g, f10.g());
            fVar.e(f47564h, f10.d());
            fVar.e(f47565i, f10.e());
            fVar.e(f47566j, f10.f());
            fVar.e(f47567k, f10.n());
            fVar.e(f47568l, f10.k());
            fVar.e(f47569m, f10.c());
        }
    }

    /* JADX INFO: renamed from: x8.a$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f47570a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f47571b = H8.d.d("files");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H8.d f47572c = H8.d.d("orgId");

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.d dVar, H8.f fVar) {
            fVar.e(f47571b, dVar.b());
            fVar.e(f47572c, dVar.c());
        }
    }

    /* JADX INFO: renamed from: x8.a$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f47573a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f47574b = H8.d.d("filename");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H8.d f47575c = H8.d.d("contents");

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.d.b bVar, H8.f fVar) {
            fVar.e(f47574b, bVar.c());
            fVar.e(f47575c, bVar.b());
        }
    }

    /* JADX INFO: renamed from: x8.a$g */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f47576a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f47577b = H8.d.d("identifier");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H8.d f47578c = H8.d.d("version");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final H8.d f47579d = H8.d.d("displayVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final H8.d f47580e = H8.d.d("organization");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final H8.d f47581f = H8.d.d("installationUuid");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final H8.d f47582g = H8.d.d("developmentPlatform");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final H8.d f47583h = H8.d.d("developmentPlatformVersion");

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.a aVar, H8.f fVar) {
            fVar.e(f47577b, aVar.e());
            fVar.e(f47578c, aVar.h());
            fVar.e(f47579d, aVar.d());
            fVar.e(f47580e, aVar.g());
            fVar.e(f47581f, aVar.f());
            fVar.e(f47582g, aVar.b());
            fVar.e(f47583h, aVar.c());
        }
    }

    /* JADX INFO: renamed from: x8.a$h */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class h implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f47584a = new h();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f47585b = H8.d.d("clsId");

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.a.b bVar, H8.f fVar) {
            fVar.e(f47585b, bVar.a());
        }
    }

    /* JADX INFO: renamed from: x8.a$i */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class i implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f47586a = new i();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f47587b = H8.d.d(DebugImage.JsonKeys.ARCH);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H8.d f47588c = H8.d.d(Device.JsonKeys.MODEL);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final H8.d f47589d = H8.d.d("cores");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final H8.d f47590e = H8.d.d("ram");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final H8.d f47591f = H8.d.d("diskSpace");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final H8.d f47592g = H8.d.d(Device.JsonKeys.SIMULATOR);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final H8.d f47593h = H8.d.d(SentryThread.JsonKeys.STATE);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final H8.d f47594i = H8.d.d(Device.JsonKeys.MANUFACTURER);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final H8.d f47595j = H8.d.d("modelClass");

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.c cVar, H8.f fVar) {
            fVar.c(f47587b, cVar.b());
            fVar.e(f47588c, cVar.f());
            fVar.c(f47589d, cVar.c());
            fVar.b(f47590e, cVar.h());
            fVar.b(f47591f, cVar.d());
            fVar.a(f47592g, cVar.j());
            fVar.c(f47593h, cVar.i());
            fVar.e(f47594i, cVar.e());
            fVar.e(f47595j, cVar.g());
        }
    }

    /* JADX INFO: renamed from: x8.a$j */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class j implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f47596a = new j();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f47597b = H8.d.d("generator");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H8.d f47598c = H8.d.d("identifier");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final H8.d f47599d = H8.d.d("appQualitySessionId");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final H8.d f47600e = H8.d.d("startedAt");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final H8.d f47601f = H8.d.d("endedAt");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final H8.d f47602g = H8.d.d(SentryThread.JsonKeys.CRASHED);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final H8.d f47603h = H8.d.d(App.TYPE);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final H8.d f47604i = H8.d.d(SentryBaseEvent.JsonKeys.USER);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final H8.d f47605j = H8.d.d(OperatingSystem.TYPE);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final H8.d f47606k = H8.d.d(Device.TYPE);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final H8.d f47607l = H8.d.d("events");

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final H8.d f47608m = H8.d.d("generatorType");

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e eVar, H8.f fVar) {
            fVar.e(f47597b, eVar.g());
            fVar.e(f47598c, eVar.j());
            fVar.e(f47599d, eVar.c());
            fVar.b(f47600e, eVar.l());
            fVar.e(f47601f, eVar.e());
            fVar.a(f47602g, eVar.n());
            fVar.e(f47603h, eVar.b());
            fVar.e(f47604i, eVar.m());
            fVar.e(f47605j, eVar.k());
            fVar.e(f47606k, eVar.d());
            fVar.e(f47607l, eVar.f());
            fVar.c(f47608m, eVar.h());
        }
    }

    /* JADX INFO: renamed from: x8.a$k */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class k implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f47609a = new k();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f47610b = H8.d.d("execution");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H8.d f47611c = H8.d.d("customAttributes");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final H8.d f47612d = H8.d.d("internalKeys");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final H8.d f47613e = H8.d.d("background");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final H8.d f47614f = H8.d.d("currentProcessDetails");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final H8.d f47615g = H8.d.d("appProcessDetails");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final H8.d f47616h = H8.d.d("uiOrientation");

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a aVar, H8.f fVar) {
            fVar.e(f47610b, aVar.f());
            fVar.e(f47611c, aVar.e());
            fVar.e(f47612d, aVar.g());
            fVar.e(f47613e, aVar.c());
            fVar.e(f47614f, aVar.d());
            fVar.e(f47615g, aVar.b());
            fVar.c(f47616h, aVar.h());
        }
    }

    /* JADX INFO: renamed from: x8.a$l */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class l implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f47617a = new l();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f47618b = H8.d.d("baseAddress");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H8.d f47619c = H8.d.d(RRWebVideoEvent.JsonKeys.SIZE);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final H8.d f47620d = H8.d.d("name");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final H8.d f47621e = H8.d.d(DebugImage.JsonKeys.UUID);

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b.AbstractC0650a abstractC0650a, H8.f fVar) {
            fVar.b(f47618b, abstractC0650a.b());
            fVar.b(f47619c, abstractC0650a.d());
            fVar.e(f47620d, abstractC0650a.c());
            fVar.e(f47621e, abstractC0650a.f());
        }
    }

    /* JADX INFO: renamed from: x8.a$m */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class m implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f47622a = new m();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f47623b = H8.d.d(SentryEvent.JsonKeys.THREADS);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H8.d f47624c = H8.d.d("exception");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final H8.d f47625d = H8.d.d("appExitInfo");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final H8.d f47626e = H8.d.d("signal");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final H8.d f47627f = H8.d.d("binaries");

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b bVar, H8.f fVar) {
            fVar.e(f47623b, bVar.f());
            fVar.e(f47624c, bVar.d());
            fVar.e(f47625d, bVar.b());
            fVar.e(f47626e, bVar.e());
            fVar.e(f47627f, bVar.c());
        }
    }

    /* JADX INFO: renamed from: x8.a$n */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class n implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f47628a = new n();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f47629b = H8.d.d("type");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H8.d f47630c = H8.d.d("reason");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final H8.d f47631d = H8.d.d("frames");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final H8.d f47632e = H8.d.d("causedBy");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final H8.d f47633f = H8.d.d("overflowCount");

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b.c cVar, H8.f fVar) {
            fVar.e(f47629b, cVar.f());
            fVar.e(f47630c, cVar.e());
            fVar.e(f47631d, cVar.c());
            fVar.e(f47632e, cVar.b());
            fVar.c(f47633f, cVar.d());
        }
    }

    /* JADX INFO: renamed from: x8.a$o */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class o implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f47634a = new o();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f47635b = H8.d.d("name");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H8.d f47636c = H8.d.d("code");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final H8.d f47637d = H8.d.d(SentryLockReason.JsonKeys.ADDRESS);

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b.AbstractC0654d abstractC0654d, H8.f fVar) {
            fVar.e(f47635b, abstractC0654d.d());
            fVar.e(f47636c, abstractC0654d.c());
            fVar.b(f47637d, abstractC0654d.b());
        }
    }

    /* JADX INFO: renamed from: x8.a$p */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class p implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f47638a = new p();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f47639b = H8.d.d("name");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H8.d f47640c = H8.d.d("importance");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final H8.d f47641d = H8.d.d("frames");

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b.AbstractC0656e abstractC0656e, H8.f fVar) {
            fVar.e(f47639b, abstractC0656e.d());
            fVar.c(f47640c, abstractC0656e.c());
            fVar.e(f47641d, abstractC0656e.b());
        }
    }

    /* JADX INFO: renamed from: x8.a$q */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class q implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f47642a = new q();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f47643b = H8.d.d("pc");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H8.d f47644c = H8.d.d(SentryStackFrame.JsonKeys.SYMBOL);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final H8.d f47645d = H8.d.d(Constants.FILE);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final H8.d f47646e = H8.d.d(MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final H8.d f47647f = H8.d.d("importance");

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b.AbstractC0656e.AbstractC0658b abstractC0658b, H8.f fVar) {
            fVar.b(f47643b, abstractC0658b.e());
            fVar.e(f47644c, abstractC0658b.f());
            fVar.e(f47645d, abstractC0658b.b());
            fVar.b(f47646e, abstractC0658b.d());
            fVar.c(f47647f, abstractC0658b.c());
        }
    }

    /* JADX INFO: renamed from: x8.a$r */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class r implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f47648a = new r();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f47649b = H8.d.d("processName");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H8.d f47650c = H8.d.d("pid");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final H8.d f47651d = H8.d.d("importance");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final H8.d f47652e = H8.d.d("defaultProcess");

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.c cVar, H8.f fVar) {
            fVar.e(f47649b, cVar.d());
            fVar.c(f47650c, cVar.c());
            fVar.c(f47651d, cVar.b());
            fVar.a(f47652e, cVar.e());
        }
    }

    /* JADX INFO: renamed from: x8.a$s */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class s implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f47653a = new s();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f47654b = H8.d.d("batteryLevel");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H8.d f47655c = H8.d.d("batteryVelocity");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final H8.d f47656d = H8.d.d("proximityOn");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final H8.d f47657e = H8.d.d(Device.JsonKeys.ORIENTATION);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final H8.d f47658f = H8.d.d("ramUsed");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final H8.d f47659g = H8.d.d("diskUsed");

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.c cVar, H8.f fVar) {
            fVar.e(f47654b, cVar.b());
            fVar.c(f47655c, cVar.c());
            fVar.a(f47656d, cVar.g());
            fVar.c(f47657e, cVar.e());
            fVar.b(f47658f, cVar.f());
            fVar.b(f47659g, cVar.d());
        }
    }

    /* JADX INFO: renamed from: x8.a$t */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class t implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t f47660a = new t();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f47661b = H8.d.d("timestamp");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H8.d f47662c = H8.d.d("type");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final H8.d f47663d = H8.d.d(App.TYPE);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final H8.d f47664e = H8.d.d(Device.TYPE);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final H8.d f47665f = H8.d.d("log");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final H8.d f47666g = H8.d.d("rollouts");

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d dVar, H8.f fVar) {
            fVar.b(f47661b, dVar.f());
            fVar.e(f47662c, dVar.g());
            fVar.e(f47663d, dVar.b());
            fVar.e(f47664e, dVar.c());
            fVar.e(f47665f, dVar.d());
            fVar.e(f47666g, dVar.e());
        }
    }

    /* JADX INFO: renamed from: x8.a$u */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class u implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final u f47667a = new u();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f47668b = H8.d.d("content");

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.AbstractC0661d abstractC0661d, H8.f fVar) {
            fVar.e(f47668b, abstractC0661d.b());
        }
    }

    /* JADX INFO: renamed from: x8.a$v */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class v implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v f47669a = new v();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f47670b = H8.d.d("rolloutVariant");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H8.d f47671c = H8.d.d("parameterKey");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final H8.d f47672d = H8.d.d("parameterValue");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final H8.d f47673e = H8.d.d("templateVersion");

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.AbstractC0662e abstractC0662e, H8.f fVar) {
            fVar.e(f47670b, abstractC0662e.d());
            fVar.e(f47671c, abstractC0662e.b());
            fVar.e(f47672d, abstractC0662e.c());
            fVar.b(f47673e, abstractC0662e.e());
        }
    }

    /* JADX INFO: renamed from: x8.a$w */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class w implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final w f47674a = new w();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f47675b = H8.d.d("rolloutId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H8.d f47676c = H8.d.d("variantId");

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.AbstractC0662e.b bVar, H8.f fVar) {
            fVar.e(f47675b, bVar.b());
            fVar.e(f47676c, bVar.c());
        }
    }

    /* JADX INFO: renamed from: x8.a$x */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class x implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final x f47677a = new x();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f47678b = H8.d.d("assignments");

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.f fVar, H8.f fVar2) {
            fVar2.e(f47678b, fVar.b());
        }
    }

    /* JADX INFO: renamed from: x8.a$y */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class y implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final y f47679a = new y();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f47680b = H8.d.d("platform");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H8.d f47681c = H8.d.d("version");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final H8.d f47682d = H8.d.d("buildVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final H8.d f47683e = H8.d.d("jailbroken");

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.AbstractC0663e abstractC0663e, H8.f fVar) {
            fVar.c(f47680b, abstractC0663e.c());
            fVar.e(f47681c, abstractC0663e.d());
            fVar.e(f47682d, abstractC0663e.b());
            fVar.a(f47683e, abstractC0663e.e());
        }
    }

    /* JADX INFO: renamed from: x8.a$z */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class z implements H8.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final z f47684a = new z();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H8.d f47685b = H8.d.d("identifier");

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.f fVar, H8.f fVar2) {
            fVar2.e(f47685b, fVar.b());
        }
    }

    @Override // I8.a
    public void a(I8.b bVar) {
        d dVar = d.f47557a;
        bVar.a(F.class, dVar);
        bVar.a(C6323b.class, dVar);
        j jVar = j.f47596a;
        bVar.a(F.e.class, jVar);
        bVar.a(x8.h.class, jVar);
        g gVar = g.f47576a;
        bVar.a(F.e.a.class, gVar);
        bVar.a(x8.i.class, gVar);
        h hVar = h.f47584a;
        bVar.a(F.e.a.b.class, hVar);
        bVar.a(x8.j.class, hVar);
        z zVar = z.f47684a;
        bVar.a(F.e.f.class, zVar);
        bVar.a(C6318A.class, zVar);
        y yVar = y.f47679a;
        bVar.a(F.e.AbstractC0663e.class, yVar);
        bVar.a(x8.z.class, yVar);
        i iVar = i.f47586a;
        bVar.a(F.e.c.class, iVar);
        bVar.a(x8.k.class, iVar);
        t tVar = t.f47660a;
        bVar.a(F.e.d.class, tVar);
        bVar.a(x8.l.class, tVar);
        k kVar = k.f47609a;
        bVar.a(F.e.d.a.class, kVar);
        bVar.a(x8.m.class, kVar);
        m mVar = m.f47622a;
        bVar.a(F.e.d.a.b.class, mVar);
        bVar.a(x8.n.class, mVar);
        p pVar = p.f47638a;
        bVar.a(F.e.d.a.b.AbstractC0656e.class, pVar);
        bVar.a(x8.r.class, pVar);
        q qVar = q.f47642a;
        bVar.a(F.e.d.a.b.AbstractC0656e.AbstractC0658b.class, qVar);
        bVar.a(x8.s.class, qVar);
        n nVar = n.f47628a;
        bVar.a(F.e.d.a.b.c.class, nVar);
        bVar.a(x8.p.class, nVar);
        b bVar2 = b.f47544a;
        bVar.a(F.a.class, bVar2);
        bVar.a(C6324c.class, bVar2);
        C0664a c0664a = C0664a.f47540a;
        bVar.a(F.a.AbstractC0646a.class, c0664a);
        bVar.a(C6325d.class, c0664a);
        o oVar = o.f47634a;
        bVar.a(F.e.d.a.b.AbstractC0654d.class, oVar);
        bVar.a(x8.q.class, oVar);
        l lVar = l.f47617a;
        bVar.a(F.e.d.a.b.AbstractC0650a.class, lVar);
        bVar.a(x8.o.class, lVar);
        c cVar = c.f47554a;
        bVar.a(F.c.class, cVar);
        bVar.a(C6326e.class, cVar);
        r rVar = r.f47648a;
        bVar.a(F.e.d.a.c.class, rVar);
        bVar.a(x8.t.class, rVar);
        s sVar = s.f47653a;
        bVar.a(F.e.d.c.class, sVar);
        bVar.a(x8.u.class, sVar);
        u uVar = u.f47667a;
        bVar.a(F.e.d.AbstractC0661d.class, uVar);
        bVar.a(x8.v.class, uVar);
        x xVar = x.f47677a;
        bVar.a(F.e.d.f.class, xVar);
        bVar.a(x8.y.class, xVar);
        v vVar = v.f47669a;
        bVar.a(F.e.d.AbstractC0662e.class, vVar);
        bVar.a(x8.w.class, vVar);
        w wVar = w.f47674a;
        bVar.a(F.e.d.AbstractC0662e.b.class, wVar);
        bVar.a(x8.x.class, wVar);
        e eVar = e.f47570a;
        bVar.a(F.d.class, eVar);
        bVar.a(C6327f.class, eVar);
        f fVar = f.f47573a;
        bVar.a(F.d.b.class, fVar);
        bVar.a(C6328g.class, fVar);
    }
}
