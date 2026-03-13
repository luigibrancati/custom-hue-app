package w7;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import b7.C2878l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements InterfaceC6160c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f46312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f46313b = new Handler(Looper.getMainLooper());

    public h(m mVar) {
        this.f46312a = mVar;
    }

    @Override // w7.InterfaceC6160c
    public final Task a(Activity activity, AbstractC6159b abstractC6159b) {
        if (abstractC6159b.b()) {
            return Tasks.e(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", abstractC6159b.a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        C2878l c2878l = new C2878l();
        intent.putExtra("result_receiver", new g(this, this.f46313b, c2878l));
        activity.startActivity(intent);
        return c2878l.a();
    }

    @Override // w7.InterfaceC6160c
    public final Task b() {
        return this.f46312a.a();
    }
}
