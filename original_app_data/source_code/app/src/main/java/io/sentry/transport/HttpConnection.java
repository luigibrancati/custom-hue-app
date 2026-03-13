package io.sentry.transport;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.sentry.ILogger;
import io.sentry.RequestDetails;
import io.sentry.SentryEnvelope;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.tika.metadata.HttpHeaders;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class HttpConnection {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final SentryOptions options;
    private final Proxy proxy;
    private final RateLimiter rateLimiter;
    private final RequestDetails requestDetails;

    public HttpConnection(SentryOptions sentryOptions, RequestDetails requestDetails, RateLimiter rateLimiter) {
        this(sentryOptions, requestDetails, AuthenticatorWrapper.getInstance(), rateLimiter);
    }

    private void closeAndDisconnect(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    private HttpURLConnection createConnection() throws IOException {
        HttpURLConnection httpURLConnectionOpen = open();
        for (Map.Entry<String, String> entry : this.requestDetails.getHeaders().entrySet()) {
            httpURLConnectionOpen.setRequestProperty(entry.getKey(), entry.getValue());
        }
        httpURLConnectionOpen.setRequestMethod("POST");
        httpURLConnectionOpen.setDoOutput(true);
        httpURLConnectionOpen.setRequestProperty(HttpHeaders.CONTENT_ENCODING, "gzip");
        httpURLConnectionOpen.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-sentry-envelope");
        httpURLConnectionOpen.setRequestProperty("Accept", "application/json");
        httpURLConnectionOpen.setRequestProperty("Connection", "close");
        httpURLConnectionOpen.setConnectTimeout(this.options.getConnectionTimeoutMillis());
        httpURLConnectionOpen.setReadTimeout(this.options.getReadTimeoutMillis());
        SSLSocketFactory sslSocketFactory = this.options.getSslSocketFactory();
        if ((httpURLConnectionOpen instanceof HttpsURLConnection) && sslSocketFactory != null) {
            ((HttpsURLConnection) httpURLConnectionOpen).setSSLSocketFactory(sslSocketFactory);
        }
        httpURLConnectionOpen.connect();
        return httpURLConnectionOpen;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String getErrorMessageFromStream(java.net.HttpURLConnection r4) {
        /*
            r3 = this;
            java.io.InputStream r3 = r4.getErrorStream()     // Catch: java.io.IOException -> L4e
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L38
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L38
            java.nio.charset.Charset r1 = io.sentry.transport.HttpConnection.UTF_8     // Catch: java.lang.Throwable -> L38
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L38
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r0.<init>()     // Catch: java.lang.Throwable -> L24
            r1 = 1
        L16:
            java.lang.String r2 = r4.readLine()     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L2b
            if (r1 != 0) goto L26
            java.lang.String r1 = "\n"
            r0.append(r1)     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r0 = move-exception
            goto L3a
        L26:
            r0.append(r2)     // Catch: java.lang.Throwable -> L24
            r1 = 0
            goto L16
        L2b:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L24
            r4.close()     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L37
            r3.close()     // Catch: java.io.IOException -> L4e
        L37:
            return r0
        L38:
            r4 = move-exception
            goto L43
        L3a:
            r4.close()     // Catch: java.lang.Throwable -> L3e
            goto L42
        L3e:
            r4 = move-exception
            r0.addSuppressed(r4)     // Catch: java.lang.Throwable -> L38
        L42:
            throw r0     // Catch: java.lang.Throwable -> L38
        L43:
            if (r3 == 0) goto L4d
            r3.close()     // Catch: java.lang.Throwable -> L49
            goto L4d
        L49:
            r3 = move-exception
            r4.addSuppressed(r3)     // Catch: java.io.IOException -> L4e
        L4d:
            throw r4     // Catch: java.io.IOException -> L4e
        L4e:
            java.lang.String r3 = "Failed to obtain error message while analyzing send failure."
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.transport.HttpConnection.getErrorMessageFromStream(java.net.HttpURLConnection):java.lang.String");
    }

    private boolean isSuccessfulResponseCode(int i10) {
        return i10 == 200;
    }

    private TransportResult readAndLog(HttpURLConnection httpURLConnection) {
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                updateRetryAfterLimits(httpURLConnection, responseCode);
                if (isSuccessfulResponseCode(responseCode)) {
                    this.options.getLogger().log(SentryLevel.DEBUG, "Envelope sent successfully.", new Object[0]);
                    TransportResult transportResultSuccess = TransportResult.success();
                    closeAndDisconnect(httpURLConnection);
                    return transportResultSuccess;
                }
                ILogger logger = this.options.getLogger();
                SentryLevel sentryLevel = SentryLevel.ERROR;
                logger.log(sentryLevel, "Request failed, API returned %s", Integer.valueOf(responseCode));
                if (this.options.isDebug()) {
                    this.options.getLogger().log(sentryLevel, "%s", getErrorMessageFromStream(httpURLConnection));
                }
                TransportResult transportResultError = TransportResult.error(responseCode);
                closeAndDisconnect(httpURLConnection);
                return transportResultError;
            } catch (IOException e10) {
                this.options.getLogger().log(SentryLevel.ERROR, e10, "Error reading and logging the response stream", new Object[0]);
                closeAndDisconnect(httpURLConnection);
                return TransportResult.error();
            }
        } catch (Throwable th) {
            closeAndDisconnect(httpURLConnection);
            throw th;
        }
    }

    private Proxy resolveProxy(SentryOptions.Proxy proxy) {
        if (proxy == null) {
            return null;
        }
        String port = proxy.getPort();
        String host = proxy.getHost();
        if (port == null || host == null) {
            return null;
        }
        try {
            return new Proxy(proxy.getType() != null ? proxy.getType() : Proxy.Type.HTTP, new InetSocketAddress(host, Integer.parseInt(port)));
        } catch (NumberFormatException e10) {
            this.options.getLogger().log(SentryLevel.ERROR, e10, "Failed to parse Sentry Proxy port: " + proxy.getPort() + ". Proxy is ignored", new Object[0]);
            return null;
        }
    }

    public Proxy getProxy() {
        return this.proxy;
    }

    public HttpURLConnection open() {
        return (HttpURLConnection) (this.proxy == null ? (URLConnection) FirebasePerfUrlConnection.instrument(this.requestDetails.getUrl().openConnection()) : (URLConnection) FirebasePerfUrlConnection.instrument(this.requestDetails.getUrl().openConnection(this.proxy)));
    }

    public TransportResult send(SentryEnvelope sentryEnvelope) {
        TransportResult andLog;
        this.options.getSocketTagger().tagSockets();
        try {
            OutputStream outputStream = createConnection().getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.options.getSerializer().serialize(sentryEnvelope, gZIPOutputStream);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } finally {
                }
            } finally {
            }
        } finally {
            try {
            } finally {
            }
        }
        return andLog;
    }

    public void updateRetryAfterLimits(HttpURLConnection httpURLConnection, int i10) {
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        this.rateLimiter.updateRetryAfterLimits(httpURLConnection.getHeaderField("X-Sentry-Rate-Limits"), headerField, i10);
    }

    public HttpConnection(SentryOptions sentryOptions, RequestDetails requestDetails, AuthenticatorWrapper authenticatorWrapper, RateLimiter rateLimiter) {
        this.requestDetails = requestDetails;
        this.options = sentryOptions;
        this.rateLimiter = rateLimiter;
        Proxy proxyResolveProxy = resolveProxy(sentryOptions.getProxy());
        this.proxy = proxyResolveProxy;
        if (proxyResolveProxy == null || sentryOptions.getProxy() == null) {
            return;
        }
        String user = sentryOptions.getProxy().getUser();
        String pass = sentryOptions.getProxy().getPass();
        if (user == null || pass == null) {
            return;
        }
        authenticatorWrapper.setDefault(new ProxyAuthenticator(user, pass));
    }
}
