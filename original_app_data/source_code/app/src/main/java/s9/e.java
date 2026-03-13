package s9;

import Rd.AbstractC2128g;
import Rd.M;
import android.net.Uri;
import fc.C4015H;
import io.sentry.ProfileChunk;
import java.net.URL;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5046c;
import p9.C5426b;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements InterfaceC5812a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f44349c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5426b f44350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4992i f44351b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f44352j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Map f44354l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ p f44355m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ p f44356n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Map map, p pVar, p pVar2, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f44354l = map;
            this.f44355m = pVar;
            this.f44356n = pVar2;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return e.this.new b(this.f44354l, this.f44355m, this.f44356n, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((b) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00cb, code lost:
        
            if (r8.invoke(r1, r7) == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00e0, code lost:
        
            if (r1.invoke(r3, r7) != r0) goto L37;
         */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 230
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: s9.e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public e(C5426b appInfo, InterfaceC4992i blockingDispatcher) {
        AbstractC4862t.e(appInfo, "appInfo");
        AbstractC4862t.e(blockingDispatcher, "blockingDispatcher");
        this.f44350a = appInfo;
        this.f44351b = blockingDispatcher;
    }

    @Override // s9.InterfaceC5812a
    public Object a(Map map, p pVar, p pVar2, InterfaceC4988e interfaceC4988e) {
        Object objG = AbstractC2128g.g(this.f44351b, new b(map, pVar, pVar2, null), interfaceC4988e);
        return objG == C5046c.f() ? objG : C4015H.f34254a;
    }

    public final URL c() {
        return new URL(new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath(ProfileChunk.PLATFORM_ANDROID).appendPath("gmp").appendPath(this.f44350a.b()).appendPath("settings").appendQueryParameter("build_version", this.f44350a.a().a()).appendQueryParameter("display_version", this.f44350a.a().f()).build().toString());
    }
}
