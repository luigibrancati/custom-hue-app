package S6;

import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.FrameLayout;
import com.google.android.gms.maps.GoogleMapOptions;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: S6.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C2198d extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f15394a;

    public C2198d(Context context) {
        super(context);
        this.f15394a = new q(this, context, null);
        setClickable(true);
    }

    public void a(g gVar) {
        AbstractC6056k.e("getMapAsync() must be called on the main thread");
        AbstractC6056k.m(gVar, "callback must not be null.");
        this.f15394a.q(gVar);
    }

    public void b(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            q qVar = this.f15394a;
            qVar.c(bundle);
            if (qVar.b() == null) {
                E6.a.j(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void c() {
        this.f15394a.d();
    }

    public void d() {
        this.f15394a.e();
    }

    public void e() {
        this.f15394a.f();
    }

    public void f(Bundle bundle) {
        this.f15394a.g(bundle);
    }

    public void g() {
        this.f15394a.h();
    }

    public void h() {
        this.f15394a.i();
    }

    public C2198d(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.f15394a = new q(this, context, googleMapOptions);
        setClickable(true);
    }
}
