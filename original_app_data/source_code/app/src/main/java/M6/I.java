package M6;

import R9.AbstractC2105c;
import R9.C2109g;
import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Callable;
import v6.C6053h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class I {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AbstractC1218i f9308i = AbstractC1218i.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f9311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final R9.m f9312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Task f9313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Task f9314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f9315g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9316h;

    public I(Context context, final R9.m mVar, B b10, String str) {
        new HashMap();
        new HashMap();
        this.f9309a = context.getPackageName();
        this.f9310b = AbstractC2105c.a(context);
        this.f9312d = mVar;
        this.f9311c = b10;
        T.a();
        this.f9315g = str;
        this.f9313e = C2109g.a().b(new Callable() { // from class: M6.G
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f9306a.a();
            }
        });
        C2109g c2109gA = C2109g.a();
        Objects.requireNonNull(mVar);
        this.f9314f = c2109gA.b(new Callable() { // from class: M6.H
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return mVar.a();
            }
        });
        AbstractC1218i abstractC1218i = f9308i;
        this.f9316h = abstractC1218i.containsKey(str) ? DynamiteModule.c(context, (String) abstractC1218i.get(str)) : -1;
    }

    public final /* synthetic */ String a() {
        return C6053h.a().b(this.f9315g);
    }
}
