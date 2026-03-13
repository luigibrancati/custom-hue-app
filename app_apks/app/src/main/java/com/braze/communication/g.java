package com.braze.communication;

import com.braze.support.BrazeLogger;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f27565a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f27566b;

    static {
        try {
            f27566b = new f();
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f27565a, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: T4.h
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.communication.g.a();
                }
            }, 4, (Object) null);
        }
    }

    public static final String a() {
        return "Exception initializing static TLS socket factory.";
    }

    public static final String b() {
        return "Exception setting TLS socket factory on url connection.";
    }

    public final HttpURLConnection a(URL url) {
        AbstractC4862t.e(url, "url");
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
        if (AbstractC4862t.a(url.getProtocol(), "https")) {
            try {
                AbstractC4862t.c(uRLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
                f fVar = f27566b;
                if (fVar == null) {
                    AbstractC4862t.p("socketFactory");
                    fVar = null;
                }
                httpsURLConnection.setSSLSocketFactory(fVar);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: T4.i
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.communication.g.b();
                    }
                }, 4, (Object) null);
            }
        }
        AbstractC4862t.c(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) uRLConnection;
    }
}
