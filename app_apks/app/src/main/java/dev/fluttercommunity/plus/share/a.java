package dev.fluttercommunity.plus.share;

import android.content.Context;
import android.content.Intent;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements PluginRegistry.ActivityResultListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0414a f33491d = new C0414a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f33492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MethodChannel.Result f33493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AtomicBoolean f33494c;

    /* JADX INFO: renamed from: dev.fluttercommunity.plus.share.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0414a {
        public /* synthetic */ C0414a(AbstractC4854k abstractC4854k) {
            this();
        }

        public C0414a() {
        }
    }

    public a(Context context) {
        AbstractC4862t.e(context, "context");
        this.f33492a = context;
        this.f33494c = new AtomicBoolean(true);
    }

    public final void a() {
        this.f33494c.set(true);
        this.f33493b = null;
    }

    public final void b(String str) {
        MethodChannel.Result result;
        if (!this.f33494c.compareAndSet(false, true) || (result = this.f33493b) == null) {
            return;
        }
        AbstractC4862t.b(result);
        result.success(str);
        this.f33493b = null;
    }

    public final void c(MethodChannel.Result callback) {
        AbstractC4862t.e(callback, "callback");
        if (this.f33494c.compareAndSet(true, false)) {
            SharePlusPendingIntent.INSTANCE.b("");
            this.f33494c.set(false);
            this.f33493b = callback;
        } else {
            MethodChannel.Result result = this.f33493b;
            if (result != null) {
                result.success("dev.fluttercommunity.plus/share/unavailable");
            }
            SharePlusPendingIntent.INSTANCE.b("");
            this.f33494c.set(false);
            this.f33493b = callback;
        }
    }

    public final void d() {
        b("dev.fluttercommunity.plus/share/unavailable");
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        if (i10 != 22643) {
            return false;
        }
        b(SharePlusPendingIntent.INSTANCE.a());
        return true;
    }
}
