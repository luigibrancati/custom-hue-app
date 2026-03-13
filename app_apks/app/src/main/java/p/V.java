package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class V extends AbstractC5337P {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f41889b;

    public V(Context context, Resources resources) {
        super(resources);
        this.f41889b = new WeakReference(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10) {
        Drawable drawableA = a(i10);
        Context context = (Context) this.f41889b.get();
        if (drawableA != null && context != null) {
            C5336O.g().w(context, i10, drawableA);
        }
        return drawableA;
    }
}
