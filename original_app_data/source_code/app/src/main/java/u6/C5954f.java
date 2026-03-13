package u6;

import android.app.Activity;
import androidx.fragment.app.ActivityC2740v;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: u6.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5954f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f45174a;

    public C5954f(Activity activity) {
        AbstractC6056k.m(activity, "Activity must not be null");
        this.f45174a = activity;
    }

    public final boolean a() {
        return this.f45174a instanceof ActivityC2740v;
    }

    public final boolean b() {
        return this.f45174a instanceof Activity;
    }

    public final Activity c() {
        return (Activity) this.f45174a;
    }

    public final ActivityC2740v d() {
        return (ActivityC2740v) this.f45174a;
    }
}
