package e9;

import com.google.firebase.perf.util.l;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class f implements ResponseHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResponseHandler f33860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f33861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.h f33862c;

    public f(ResponseHandler responseHandler, l lVar, c9.h hVar) {
        this.f33860a = responseHandler;
        this.f33861b = lVar;
        this.f33862c = hVar;
    }

    @Override // org.apache.http.client.ResponseHandler
    public Object handleResponse(HttpResponse httpResponse) {
        this.f33862c.t(this.f33861b.c());
        this.f33862c.k(httpResponse.getStatusLine().getStatusCode());
        Long lA = h.a(httpResponse);
        if (lA != null) {
            this.f33862c.q(lA.longValue());
        }
        String strB = h.b(httpResponse);
        if (strB != null) {
            this.f33862c.o(strB);
        }
        this.f33862c.b();
        return this.f33860a.handleResponse(httpResponse);
    }
}
