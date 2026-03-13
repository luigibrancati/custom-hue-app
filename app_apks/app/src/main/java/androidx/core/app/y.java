package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class y implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f22663a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f22664b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        Intent a();
    }

    public y(Context context) {
        this.f22664b = context;
    }

    public static y f(Context context) {
        return new y(context);
    }

    public y c(Intent intent) {
        this.f22663a.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y d(Activity activity) {
        Intent intentA = activity instanceof a ? ((a) activity).a() : null;
        if (intentA == null) {
            intentA = i.a(activity);
        }
        if (intentA != null) {
            ComponentName component = intentA.getComponent();
            if (component == null) {
                component = intentA.resolveActivity(this.f22664b.getPackageManager());
            }
            e(component);
            c(intentA);
        }
        return this;
    }

    public y e(ComponentName componentName) {
        int size = this.f22663a.size();
        try {
            Intent intentB = i.b(this.f22664b, componentName);
            while (intentB != null) {
                this.f22663a.add(size, intentB);
                intentB = i.b(this.f22664b, intentB.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public void h() {
        k(null);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f22663a.iterator();
    }

    public void k(Bundle bundle) {
        if (this.f22663a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f22663a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (L0.a.o(this.f22664b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f22664b.startActivity(intent);
    }
}
