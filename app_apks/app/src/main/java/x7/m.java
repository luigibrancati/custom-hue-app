package x7;

import android.os.IBinder;
import com.google.android.play.core.review.internal.zze;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IBinder f47496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f47497c;

    public m(o oVar, IBinder iBinder) {
        this.f47496b = iBinder;
        this.f47497c = oVar;
    }

    @Override // x7.g
    public final void a() {
        this.f47497c.f47499a.f47513m = zze.zzb(this.f47496b);
        q.q(this.f47497c.f47499a);
        this.f47497c.f47499a.f47507g = false;
        Iterator it = this.f47497c.f47499a.f47504d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f47497c.f47499a.f47504d.clear();
    }
}
