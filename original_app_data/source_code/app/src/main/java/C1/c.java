package C1;

import android.app.PendingIntent;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.core.app.j;
import androidx.core.app.m;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class c extends m.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediaSessionCompat.Token f877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PendingIntent f880e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f876a = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f881f = false;

    @Override // androidx.core.app.m.k
    public void apply(j jVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            a.d(jVar.a(), a.b(b.a(a.a(), this.f878c, this.f879d, this.f880e, Boolean.valueOf(this.f881f)), this.f876a, this.f877b));
        } else {
            a.d(jVar.a(), a.b(a.a(), this.f876a, this.f877b));
        }
    }

    @Override // androidx.core.app.m.k
    public RemoteViews makeBigContentView(j jVar) {
        return null;
    }

    @Override // androidx.core.app.m.k
    public RemoteViews makeContentView(j jVar) {
        return null;
    }
}
