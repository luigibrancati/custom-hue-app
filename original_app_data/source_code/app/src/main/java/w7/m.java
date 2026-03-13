package w7;

import android.content.Context;
import android.content.Intent;
import b7.C2878l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import x7.q;
import x7.t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x7.f f46319c = new x7.f("ReviewService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f46320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46321b;

    /* JADX WARN: Type inference failed for: r7v0, types: [w7.i] */
    public m(Context context) {
        this.f46321b = context.getPackageName();
        if (t.a(context)) {
            this.f46320a = new q(context, f46319c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), new Object() { // from class: w7.i
            }, null);
        }
    }

    public final Task a() {
        String str = this.f46321b;
        x7.f fVar = f46319c;
        fVar.c("requestInAppReview (%s)", str);
        if (this.f46320a == null) {
            fVar.a("Play Store app is either not installed or not the official version", new Object[0]);
            return Tasks.d(new C6158a(-1));
        }
        C2878l c2878l = new C2878l();
        this.f46320a.s(new j(this, c2878l, c2878l), c2878l);
        return c2878l.a();
    }
}
