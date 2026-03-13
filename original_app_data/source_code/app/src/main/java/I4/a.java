package I4;

import D4.d;
import D4.f;
import K4.e;
import Rd.I;
import Rd.M;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0094a f5648j = new C0094a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f5650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f5651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final I f5652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final I f5653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f5654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f5655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final A4.a f5656h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap f5657i;

    /* JADX INFO: renamed from: I4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0094a {
        public /* synthetic */ C0094a(AbstractC4854k abstractC4854k) {
            this();
        }

        public C0094a() {
        }
    }

    public a(String apiKey, d serverZone, M coroutineScope, I networkIODispatcher, I storageIODispatcher, f storage, e httpClient, A4.a logger) {
        AbstractC4862t.e(apiKey, "apiKey");
        AbstractC4862t.e(serverZone, "serverZone");
        AbstractC4862t.e(coroutineScope, "coroutineScope");
        AbstractC4862t.e(networkIODispatcher, "networkIODispatcher");
        AbstractC4862t.e(storageIODispatcher, "storageIODispatcher");
        AbstractC4862t.e(storage, "storage");
        AbstractC4862t.e(httpClient, "httpClient");
        AbstractC4862t.e(logger, "logger");
        this.f5649a = apiKey;
        this.f5650b = serverZone;
        this.f5651c = coroutineScope;
        this.f5652d = networkIODispatcher;
        this.f5653e = storageIODispatcher;
        this.f5654f = storage;
        this.f5655g = httpClient;
        this.f5656h = logger;
        this.f5657i = new ConcurrentHashMap();
    }
}
