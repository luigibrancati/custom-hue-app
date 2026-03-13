package d9;

import android.content.Context;
import b9.C2898a;
import com.google.firebase.perf.util.m;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.net.URI;

/* JADX INFO: renamed from: d9.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3842c extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2898a f33169d = C2898a.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NetworkRequestMetric f33170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f33171c;

    public C3842c(NetworkRequestMetric networkRequestMetric, Context context) {
        this.f33171c = context;
        this.f33170b = networkRequestMetric;
    }

    @Override // d9.e
    public boolean c() {
        if (j(this.f33170b.getUrl())) {
            f33169d.j("URL is missing:" + this.f33170b.getUrl());
            return false;
        }
        URI uriG = g(this.f33170b.getUrl());
        if (uriG == null) {
            f33169d.j("URL cannot be parsed");
            return false;
        }
        if (!h(uriG, this.f33171c)) {
            f33169d.j("URL fails allowlist rule: " + uriG);
            return false;
        }
        if (!k(uriG.getHost())) {
            f33169d.j("URL host is null or invalid");
            return false;
        }
        if (!p(uriG.getScheme())) {
            f33169d.j("URL scheme is null or invalid");
            return false;
        }
        if (!r(uriG.getUserInfo())) {
            f33169d.j("URL user info is null");
            return false;
        }
        if (!o(uriG.getPort())) {
            f33169d.j("URL port is less than or equal to 0");
            return false;
        }
        if (!l(this.f33170b.hasHttpMethod() ? this.f33170b.getHttpMethod() : null)) {
            f33169d.j("HTTP Method is null or invalid: " + this.f33170b.getHttpMethod());
            return false;
        }
        if (this.f33170b.hasHttpResponseCode() && !m(this.f33170b.getHttpResponseCode())) {
            f33169d.j("HTTP ResponseCode is a negative value:" + this.f33170b.getHttpResponseCode());
            return false;
        }
        if (this.f33170b.hasRequestPayloadBytes() && !n(this.f33170b.getRequestPayloadBytes())) {
            f33169d.j("Request Payload is a negative value:" + this.f33170b.getRequestPayloadBytes());
            return false;
        }
        if (this.f33170b.hasResponsePayloadBytes() && !n(this.f33170b.getResponsePayloadBytes())) {
            f33169d.j("Response Payload is a negative value:" + this.f33170b.getResponsePayloadBytes());
            return false;
        }
        if (!this.f33170b.hasClientStartTimeUs() || this.f33170b.getClientStartTimeUs() <= 0) {
            f33169d.j("Start time of the request is null, or zero, or a negative value:" + this.f33170b.getClientStartTimeUs());
            return false;
        }
        if (this.f33170b.hasTimeToRequestCompletedUs() && !q(this.f33170b.getTimeToRequestCompletedUs())) {
            f33169d.j("Time to complete the request is a negative value:" + this.f33170b.getTimeToRequestCompletedUs());
            return false;
        }
        if (this.f33170b.hasTimeToResponseInitiatedUs() && !q(this.f33170b.getTimeToResponseInitiatedUs())) {
            f33169d.j("Time from the start of the request to the start of the response is null or a negative value:" + this.f33170b.getTimeToResponseInitiatedUs());
            return false;
        }
        if (this.f33170b.hasTimeToResponseCompletedUs() && this.f33170b.getTimeToResponseCompletedUs() > 0) {
            if (this.f33170b.hasHttpResponseCode()) {
                return true;
            }
            f33169d.j("Did not receive a HTTP Response Code");
            return false;
        }
        f33169d.j("Time from the start of the request to the end of the response is null, negative or zero:" + this.f33170b.getTimeToResponseCompletedUs());
        return false;
    }

    public final URI g(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e10) {
            f33169d.k("getResultUrl throws exception %s", e10.getMessage());
            return null;
        }
    }

    public final boolean h(URI uri, Context context) {
        if (uri == null) {
            return false;
        }
        return m.a(uri, context);
    }

    public final boolean i(String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }

    public final boolean j(String str) {
        return i(str);
    }

    public final boolean k(String str) {
        return (str == null || i(str) || str.length() > 255) ? false : true;
    }

    public boolean l(NetworkRequestMetric.d dVar) {
        return (dVar == null || dVar == NetworkRequestMetric.d.HTTP_METHOD_UNKNOWN) ? false : true;
    }

    public final boolean m(int i10) {
        return i10 > 0;
    }

    public final boolean n(long j10) {
        return j10 >= 0;
    }

    public final boolean o(int i10) {
        return i10 == -1 || i10 > 0;
    }

    public final boolean p(String str) {
        if (str == null) {
            return false;
        }
        return "http".equalsIgnoreCase(str) || "https".equalsIgnoreCase(str);
    }

    public final boolean q(long j10) {
        return j10 >= 0;
    }

    public final boolean r(String str) {
        return str == null;
    }
}
