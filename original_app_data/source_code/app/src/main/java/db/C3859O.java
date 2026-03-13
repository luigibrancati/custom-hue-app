package db;

import android.app.Activity;
import fc.C4015H;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.view.TextureRegistry;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4860q;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: db.O, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0004R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Ldb/O;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "<init>", "()V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "Lfc/H;", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "onDetachedFromEngine", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "activityPluginBinding", "onAttachedToActivity", "(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V", "onDetachedFromActivity", "onReattachedToActivityForConfigChanges", "onDetachedFromActivityForConfigChanges", "a", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "b", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "flutterPluginBinding", "Ldb/L;", "c", "Ldb/L;", "methodCallHandler", "mobile_scanner_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class C3859O implements FlutterPlugin, ActivityAware {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public ActivityPluginBinding activityPluginBinding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public FlutterPlugin.FlutterPluginBinding flutterPluginBinding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public C3856L methodCallHandler;

    /* JADX INFO: renamed from: db.O$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a extends AbstractC4860q implements vc.l {
        public a(Object obj) {
            super(1, obj, ActivityPluginBinding.class, "addRequestPermissionsResultListener", "addRequestPermissionsResultListener(Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;)V", 0);
        }

        public final void i(PluginRegistry.RequestPermissionsResultListener p02) {
            AbstractC4862t.e(p02, "p0");
            ((ActivityPluginBinding) this.receiver).addRequestPermissionsResultListener(p02);
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            i((PluginRegistry.RequestPermissionsResultListener) obj);
            return C4015H.f34254a;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        AbstractC4862t.e(activityPluginBinding, "activityPluginBinding");
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding = this.flutterPluginBinding;
        AbstractC4862t.b(flutterPluginBinding);
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        AbstractC4862t.d(binaryMessenger, "getBinaryMessenger(...)");
        Activity activity = activityPluginBinding.getActivity();
        AbstractC4862t.d(activity, "getActivity(...)");
        C3869f c3869f = new C3869f(binaryMessenger);
        C3857M c3857m = new C3857M();
        a aVar = new a(activityPluginBinding);
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding2 = this.flutterPluginBinding;
        AbstractC4862t.b(flutterPluginBinding2);
        TextureRegistry textureRegistry = flutterPluginBinding2.getTextureRegistry();
        AbstractC4862t.d(textureRegistry, "getTextureRegistry(...)");
        this.methodCallHandler = new C3856L(activity, c3869f, binaryMessenger, c3857m, aVar, textureRegistry);
        this.activityPluginBinding = activityPluginBinding;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        this.flutterPluginBinding = binding;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() throws C3866c {
        C3856L c3856l = this.methodCallHandler;
        if (c3856l != null) {
            ActivityPluginBinding activityPluginBinding = this.activityPluginBinding;
            AbstractC4862t.b(activityPluginBinding);
            c3856l.v(activityPluginBinding);
        }
        this.methodCallHandler = null;
        this.activityPluginBinding = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() throws C3866c {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        this.flutterPluginBinding = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        onAttachedToActivity(binding);
    }
}
