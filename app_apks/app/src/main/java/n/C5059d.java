package n;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* JADX INFO: renamed from: n.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5059d extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Configuration f40406f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f40408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f40409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Configuration f40410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Resources f40411e;

    public C5059d() {
        super(null);
    }

    public static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f40406f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f40406f = configuration2;
        }
        return configuration.equals(f40406f);
    }

    public void a(Configuration configuration) {
        if (this.f40411e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f40410d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f40410d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final Resources b() {
        if (this.f40411e == null) {
            Configuration configuration = this.f40410d;
            if (configuration == null || e(configuration)) {
                this.f40411e = super.getResources();
            } else {
                this.f40411e = createConfigurationContext(this.f40410d).getResources();
            }
        }
        return this.f40411e;
    }

    public int c() {
        return this.f40407a;
    }

    public final void d() {
        boolean z10 = this.f40408b == null;
        if (z10) {
            this.f40408b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f40408b.setTo(theme);
            }
        }
        f(this.f40408b, this.f40407a, z10);
    }

    public void f(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f40409c == null) {
            this.f40409c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f40409c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f40408b;
        if (theme != null) {
            return theme;
        }
        if (this.f40407a == 0) {
            this.f40407a = h.i.f35940c;
        }
        d();
        return this.f40408b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f40407a != i10) {
            this.f40407a = i10;
            d();
        }
    }

    public C5059d(Context context, int i10) {
        super(context);
        this.f40407a = i10;
    }

    public C5059d(Context context, Resources.Theme theme) {
        super(context);
        this.f40408b = theme;
    }
}
