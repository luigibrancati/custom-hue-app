package com.spotify.sdk.android.auth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.spotify.sdk.android.auth.a;
import com.spotify.sdk.android.auth.d;
import io.sentry.SentryBaseEvent;
import io.sentry.protocol.Response;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class LoginActivity extends Activity implements a.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f32674b = "com.spotify.sdk.android.auth.LoginActivity";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f32675a = new a(this);

    public static Intent c(Activity activity, c cVar) {
        if (activity == null || cVar == null) {
            throw new IllegalArgumentException("Context activity or request can't be null");
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable(SentryBaseEvent.JsonKeys.REQUEST, cVar);
        Intent intent = new Intent(activity, (Class<?>) LoginActivity.class);
        intent.putExtra("EXTRA_AUTH_REQUEST", bundle);
        return intent;
    }

    public static d e(Intent intent) {
        Bundle bundleExtra;
        if (intent == null || (bundleExtra = intent.getBundleExtra("EXTRA_AUTH_RESPONSE")) == null) {
            return null;
        }
        return (d) bundleExtra.getParcelable(Response.TYPE);
    }

    @Override // com.spotify.sdk.android.auth.a.b
    public void a() {
        Log.w(f32674b, "Spotify Auth cancelled due to LoginActivity being finished");
        setResult(0);
    }

    @Override // com.spotify.sdk.android.auth.a.b
    public void b(d dVar) {
        Intent intent = new Intent();
        Log.i(f32674b, String.format("Spotify auth completing. The response is in EXTRA with key '%s'", Response.TYPE));
        Bundle bundle = new Bundle();
        bundle.putParcelable(Response.TYPE, dVar);
        intent.putExtra("EXTRA_AUTH_RESPONSE", bundle);
        setResult(-1, intent);
        finish();
    }

    public final c d() {
        Bundle bundleExtra = getIntent().getBundleExtra("EXTRA_AUTH_REQUEST");
        if (bundleExtra == null) {
            return null;
        }
        return (c) bundleExtra.getParcelable(SentryBaseEvent.JsonKeys.REQUEST);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1138) {
            d.b bVar = new d.b();
            if (i11 == -2) {
                bVar.g(d.c.ERROR);
                String stringExtra = intent == null ? "Invalid message format" : intent.getStringExtra("ERROR");
                if (stringExtra == null) {
                    stringExtra = "Unknown error";
                }
                bVar.d(stringExtra);
            } else if (i11 == -1) {
                Bundle bundle = (Bundle) intent.getParcelableExtra("REPLY");
                if (bundle == null) {
                    bVar.g(d.c.ERROR);
                    bVar.d("Missing response data");
                } else {
                    String string = bundle.getString("RESPONSE_TYPE", "unknown");
                    Log.d(f32674b, "Response: " + string);
                    bVar.f(bundle.getString("STATE", null));
                    string.getClass();
                    if (string.equals("code")) {
                        String string2 = bundle.getString("AUTHORIZATION_CODE");
                        bVar.g(d.c.CODE);
                        bVar.c(string2);
                    } else if (string.equals("token")) {
                        String string3 = bundle.getString("ACCESS_TOKEN");
                        int i12 = bundle.getInt("EXPIRES_IN");
                        bVar.g(d.c.TOKEN);
                        bVar.b(string3);
                        bVar.e(i12);
                    } else {
                        bVar.g(d.c.UNKNOWN);
                    }
                }
            } else {
                bVar.g(d.c.EMPTY);
            }
            this.f32675a.j(this);
            this.f32675a.d(bVar.a());
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(Ia.b.f5673a);
        c cVarD = d();
        this.f32675a.j(this);
        if (getCallingActivity() == null) {
            Log.e(f32674b, "Can't use LoginActivity with a null caller. Possible reasons: calling activity has a singleInstance mode or LoginActivity is in a singleInstance/singleTask mode");
            finish();
        } else if (cVarD == null) {
            Log.e(f32674b, "No authorization request");
            setResult(0);
            finish();
        } else if (bundle == null) {
            Log.d(f32674b, String.format("Spotify Auth starting with the request [%s]", cVarD.h().toString()));
            this.f32675a.a(cVarD);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.f32675a.b();
        this.f32675a.j(null);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f32675a.d(d.a(intent.getData()));
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.f32675a.g();
    }
}
