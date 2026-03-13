package Z5;

import Z5.d;
import a6.AbstractC2643a;
import a6.n;
import a6.o;
import a6.p;
import a6.q;
import a6.r;
import a6.s;
import a6.t;
import a6.u;
import a6.v;
import a6.w;
import a6.x;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import b6.AbstractC2840i;
import b6.C2839h;
import c6.f;
import c6.g;
import c6.m;
import f6.AbstractC3996a;
import g6.AbstractC4157b;
import g6.InterfaceC4156a;
import g6.InterfaceC4158c;
import io.sentry.SentryEvent;
import io.sentry.protocol.Device;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import l6.InterfaceC4957a;
import org.apache.tika.metadata.HttpHeaders;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H8.a f20278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f20279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f20280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final URL f20281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC4957a f20282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC4957a f20283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f20284g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final URL f20285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n f20286b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f20287c;

        public a(URL url, n nVar, String str) {
            this.f20285a = url;
            this.f20286b = nVar;
            this.f20287c = str;
        }

        public a a(URL url) {
            return new a(url, this.f20286b, this.f20287c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final URL f20289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f20290c;

        public b(int i10, URL url, long j10) {
            this.f20288a = i10;
            this.f20289b = url;
            this.f20290c = j10;
        }
    }

    public d(Context context, InterfaceC4957a interfaceC4957a, InterfaceC4957a interfaceC4957a2, int i10) {
        this.f20278a = n.b();
        this.f20280c = context;
        this.f20279b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f20281d = n(Z5.a.f20269c);
        this.f20282e = interfaceC4957a2;
        this.f20283f = interfaceC4957a;
        this.f20284g = i10;
    }

    public static /* synthetic */ a d(a aVar, b bVar) {
        URL url = bVar.f20289b;
        if (url == null) {
            return null;
        }
        AbstractC3996a.a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f20289b);
    }

    public static String f(Context context) {
        String simOperator = k(context).getSimOperator();
        return simOperator != null ? simOperator : "";
    }

    public static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return w.b.UNKNOWN_MOBILE_SUBTYPE.b();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return w.b.COMBINED.b();
        }
        if (w.b.a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    public static int h(NetworkInfo networkInfo) {
        return networkInfo == null ? w.c.NONE.b() : networkInfo.getType();
    }

    public static int i(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            AbstractC3996a.c("CctTransportBackend", "Unable to find version code for package", e10);
            return -1;
        }
    }

    public static TelephonyManager k(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static long l() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    public static InputStream m(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    public static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    @Override // c6.m
    public g a(f fVar) {
        n nVarJ = j(fVar);
        URL urlN = this.f20281d;
        if (fVar.c() != null) {
            try {
                Z5.a aVarC = Z5.a.c(fVar.c());
                strD = aVarC.d() != null ? aVarC.d() : null;
                if (aVarC.e() != null) {
                    urlN = n(aVarC.e());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) AbstractC4157b.a(5, new a(urlN, nVarJ, strD), new InterfaceC4156a() { // from class: Z5.b
                @Override // g6.InterfaceC4156a
                public final Object apply(Object obj) {
                    return this.f20277a.e((d.a) obj);
                }
            }, new InterfaceC4158c() { // from class: Z5.c
                @Override // g6.InterfaceC4158c
                public final Object a(Object obj, Object obj2) {
                    return d.d((d.a) obj, (d.b) obj2);
                }
            });
            int i10 = bVar.f20288a;
            if (i10 == 200) {
                return g.e(bVar.f20290c);
            }
            if (i10 < 500 && i10 != 404) {
                return i10 == 400 ? g.d() : g.a();
            }
            return g.f();
        } catch (IOException e10) {
            AbstractC3996a.c("CctTransportBackend", "Could not make request to the backend", e10);
            return g.f();
        }
    }

    @Override // c6.m
    public AbstractC2840i b(AbstractC2840i abstractC2840i) {
        NetworkInfo activeNetworkInfo = this.f20279b.getActiveNetworkInfo();
        return abstractC2840i.p().a("sdk-version", Build.VERSION.SDK_INT).c(Device.JsonKeys.MODEL, Build.MODEL).c("hardware", Build.HARDWARE).c(Device.TYPE, Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c(Device.JsonKeys.MANUFACTURER, Build.MANUFACTURER).c(SentryEvent.JsonKeys.FINGERPRINT, Build.FINGERPRINT).b("tz-offset", l()).a("net-type", h(activeNetworkInfo)).a("mobile-subtype", g(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c(Device.JsonKeys.LOCALE, Locale.getDefault().getLanguage()).c("mcc_mnc", f(this.f20280c)).c("application_build", Integer.toString(i(this.f20280c))).d();
    }

    public final b e(a aVar) throws IOException {
        AbstractC3996a.e("CctTransportBackend", "Making request to: %s", aVar.f20285a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f20285a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f20284g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.3.0"));
        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_ENCODING, "gzip");
        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f20287c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f20278a.a(aVar.f20286b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    AbstractC3996a.e("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    AbstractC3996a.a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField(HttpHeaders.CONTENT_TYPE));
                    AbstractC3996a.a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField(HttpHeaders.CONTENT_ENCODING));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField(HttpHeaders.LOCATION)), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamM = m(inputStream, httpURLConnection.getHeaderField(HttpHeaders.CONTENT_ENCODING));
                        try {
                            b bVar = new b(responseCode, null, v.b(new BufferedReader(new InputStreamReader(inputStreamM))).c());
                            if (inputStreamM != null) {
                                inputStreamM.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (H8.c | IOException e10) {
            AbstractC3996a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e10);
            return new b(400, null, 0L);
        } catch (ConnectException | UnknownHostException e11) {
            AbstractC3996a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e11);
            return new b(500, null, 0L);
        }
    }

    public final n j(f fVar) {
        t.a aVarL;
        HashMap map = new HashMap();
        for (AbstractC2840i abstractC2840i : fVar.b()) {
            String strN = abstractC2840i.n();
            if (map.containsKey(strN)) {
                ((List) map.get(strN)).add(abstractC2840i);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(abstractC2840i);
                map.put(strN, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            AbstractC2840i abstractC2840i2 = (AbstractC2840i) ((List) entry.getValue()).get(0);
            u.a aVarB = u.a().f(x.DEFAULT).g(this.f20283f.a()).h(this.f20282e.a()).b(o.a().c(o.b.ANDROID_FIREBASE).b(AbstractC2643a.a().m(Integer.valueOf(abstractC2840i2.i("sdk-version"))).j(abstractC2840i2.b(Device.JsonKeys.MODEL)).f(abstractC2840i2.b("hardware")).d(abstractC2840i2.b(Device.TYPE)).l(abstractC2840i2.b("product")).k(abstractC2840i2.b("os-uild")).h(abstractC2840i2.b(Device.JsonKeys.MANUFACTURER)).e(abstractC2840i2.b(SentryEvent.JsonKeys.FINGERPRINT)).c(abstractC2840i2.b("country")).g(abstractC2840i2.b(Device.JsonKeys.LOCALE)).i(abstractC2840i2.b("mcc_mnc")).b(abstractC2840i2.b("application_build")).a()).a());
            try {
                aVarB.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aVarB.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC2840i abstractC2840i3 : (List) entry.getValue()) {
                C2839h c2839hE = abstractC2840i3.e();
                Y5.c cVarB = c2839hE.b();
                if (cVarB.equals(Y5.c.b("proto"))) {
                    aVarL = t.l(c2839hE.a());
                } else if (cVarB.equals(Y5.c.b("json"))) {
                    aVarL = t.k(new String(c2839hE.a(), Charset.forName("UTF-8")));
                } else {
                    AbstractC3996a.f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", cVarB);
                }
                aVarL.d(abstractC2840i3.f()).e(abstractC2840i3.o()).j(abstractC2840i3.j("tz-offset")).g(w.a().c(w.c.a(abstractC2840i3.i("net-type"))).b(w.b.a(abstractC2840i3.i("mobile-subtype"))).a());
                if (abstractC2840i3.d() != null) {
                    aVarL.c(abstractC2840i3.d());
                }
                if (abstractC2840i3.l() != null) {
                    aVarL.b(p.a().b(s.a().b(r.a().b(abstractC2840i3.l()).a()).a()).c(p.b.EVENT_OVERRIDE).a());
                }
                if (abstractC2840i3.g() != null || abstractC2840i3.h() != null) {
                    q.a aVarA = q.a();
                    if (abstractC2840i3.g() != null) {
                        aVarA.b(abstractC2840i3.g());
                    }
                    if (abstractC2840i3.h() != null) {
                        aVarA.c(abstractC2840i3.h());
                    }
                    aVarL.f(aVarA.a());
                }
                arrayList3.add(aVarL.a());
            }
            aVarB.c(arrayList3);
            arrayList2.add(aVarB.a());
        }
        return n.a(arrayList2);
    }

    public d(Context context, InterfaceC4957a interfaceC4957a, InterfaceC4957a interfaceC4957a2) {
        this(context, interfaceC4957a, interfaceC4957a2, 130000);
    }
}
