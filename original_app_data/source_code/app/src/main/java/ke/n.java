package ke;

import android.content.Intent;
import android.net.Uri;
import io.sentry.SentryBaseEvent;
import io.sentry.protocol.SentryThread;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class n extends AbstractC4843e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f39743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39744b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public m f39745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f39746b;

        public b(m mVar) {
            c(mVar);
        }

        public n a() {
            return new n(this.f39745a, this.f39746b);
        }

        public b b(Uri uri) {
            d(uri.getQueryParameter(SentryThread.JsonKeys.STATE));
            return this;
        }

        public b c(m mVar) {
            this.f39745a = (m) p.e(mVar, "request cannot be null");
            return this;
        }

        public b d(String str) {
            this.f39746b = p.f(str, "state must not be empty");
            return this;
        }
    }

    public static n e(Intent intent) {
        p.e(intent, "dataIntent must not be null");
        if (!intent.hasExtra("net.openid.appauth.EndSessionResponse")) {
            return null;
        }
        try {
            return f(intent.getStringExtra("net.openid.appauth.EndSessionResponse"));
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Intent contains malformed auth response", e10);
        }
    }

    public static n f(String str) {
        return g(new JSONObject(str));
    }

    public static n g(JSONObject jSONObject) {
        if (jSONObject.has(SentryBaseEvent.JsonKeys.REQUEST)) {
            return new n(m.c(jSONObject.getJSONObject(SentryBaseEvent.JsonKeys.REQUEST)), net.openid.appauth.f.e(jSONObject, SentryThread.JsonKeys.STATE));
        }
        throw new IllegalArgumentException("authorization request not provided and not found in JSON");
    }

    @Override // ke.AbstractC4843e
    public String a() {
        return this.f39744b;
    }

    @Override // ke.AbstractC4843e
    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        net.openid.appauth.f.m(jSONObject, SentryBaseEvent.JsonKeys.REQUEST, this.f39743a.d());
        net.openid.appauth.f.p(jSONObject, SentryThread.JsonKeys.STATE, this.f39744b);
        return jSONObject;
    }

    @Override // ke.AbstractC4843e
    public Intent d() {
        Intent intent = new Intent();
        intent.putExtra("net.openid.appauth.EndSessionResponse", c());
        return intent;
    }

    public n(m mVar, String str) {
        this.f39743a = mVar;
        this.f39744b = str;
    }
}
