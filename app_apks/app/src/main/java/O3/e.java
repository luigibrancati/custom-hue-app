package O3;

import I3.AbstractC0890u;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class e extends h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BroadcastReceiver f10915f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AbstractC4862t.e(context, "context");
            AbstractC4862t.e(intent, "intent");
            e.this.k(intent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, S3.b taskExecutor) {
        super(context, taskExecutor);
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(taskExecutor, "taskExecutor");
        this.f10915f = new a();
    }

    @Override // O3.h
    public void h() {
        AbstractC0890u.e().a(f.f10917a, getClass().getSimpleName() + ": registering receiver");
        d().registerReceiver(this.f10915f, j());
    }

    @Override // O3.h
    public void i() {
        AbstractC0890u.e().a(f.f10917a, getClass().getSimpleName() + ": unregistering receiver");
        d().unregisterReceiver(this.f10915f);
    }

    public abstract IntentFilter j();

    public abstract void k(Intent intent);
}
