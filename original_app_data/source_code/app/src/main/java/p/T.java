package p;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class T extends ContextWrapper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f41881c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ArrayList f41882d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f41883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f41884b;

    public T(Context context) {
        super(context);
        if (!b0.c()) {
            this.f41883a = new V(this, context.getResources());
            this.f41884b = null;
            return;
        }
        b0 b0Var = new b0(this, context.getResources());
        this.f41883a = b0Var;
        Resources.Theme themeNewTheme = b0Var.newTheme();
        this.f41884b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    public static boolean a(Context context) {
        return ((context instanceof T) || (context.getResources() instanceof V) || (context.getResources() instanceof b0) || !b0.c()) ? false : true;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f41881c) {
            try {
                ArrayList arrayList = f41882d;
                if (arrayList == null) {
                    f41882d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f41882d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f41882d.remove(size);
                        }
                    }
                    for (int size2 = f41882d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f41882d.get(size2);
                        T t10 = weakReference2 != null ? (T) weakReference2.get() : null;
                        if (t10 != null && t10.getBaseContext() == context) {
                            return t10;
                        }
                    }
                }
                T t11 = new T(context);
                f41882d.add(new WeakReference(t11));
                return t11;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f41883a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f41883a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f41884b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f41884b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
