package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class r extends Service implements InterfaceC2758n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L f23477a = new L(this);

    @Override // androidx.lifecycle.InterfaceC2758n
    public AbstractC2754j getLifecycle() {
        return this.f23477a.a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        AbstractC4862t.e(intent, "intent");
        this.f23477a.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f23477a.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f23477a.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i10) {
        this.f23477a.e();
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
