package u6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: u6.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5956g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5958h f45179a;

    public AbstractC5956g(InterfaceC5958h interfaceC5958h) {
        this.f45179a = interfaceC5958h;
    }

    public static InterfaceC5958h c(Activity activity) {
        return d(new C5954f(activity));
    }

    public static InterfaceC5958h d(C5954f c5954f) {
        if (c5954f.a()) {
            return C5965k0.l(c5954f.d());
        }
        if (c5954f.b()) {
            return FragmentC5959h0.d(c5954f.c());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    public Activity b() {
        Activity activityC = this.f45179a.c();
        AbstractC6056k.l(activityC);
        return activityC;
    }

    public void g() {
    }

    public void h() {
    }

    public void j() {
    }

    public void k() {
    }

    public void f(Bundle bundle) {
    }

    public void i(Bundle bundle) {
    }

    public void e(int i10, int i11, Intent intent) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
