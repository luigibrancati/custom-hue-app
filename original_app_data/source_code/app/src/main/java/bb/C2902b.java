package bb;

import android.app.Activity;
import defpackage.d;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: bb.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2902b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f25484a;

    public final boolean a() {
        Activity activity = this.f25484a;
        AbstractC4862t.b(activity);
        return (activity.getWindow().getAttributes().flags & 128) != 0;
    }

    public final defpackage.c b() throws C2901a {
        if (this.f25484a != null) {
            return new defpackage.c(Boolean.valueOf(a()));
        }
        throw new C2901a();
    }

    public final void c(Activity activity) {
        this.f25484a = activity;
    }

    public final void d(d message) throws C2901a {
        AbstractC4862t.e(message, "message");
        Activity activity = this.f25484a;
        if (activity == null) {
            throw new C2901a();
        }
        AbstractC4862t.b(activity);
        boolean zA = a();
        Boolean boolA = message.a();
        AbstractC4862t.b(boolA);
        if (boolA.booleanValue()) {
            if (zA) {
                return;
            }
            activity.getWindow().addFlags(128);
        } else if (zA) {
            activity.getWindow().clearFlags(128);
        }
    }
}
