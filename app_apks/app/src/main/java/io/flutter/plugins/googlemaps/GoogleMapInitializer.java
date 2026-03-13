package io.flutter.plugins.googlemaps;

import S6.C2198d;
import S6.f;
import android.content.Context;
import android.util.Log;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.googlemaps.Messages;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class GoogleMapInitializer implements S6.h, Messages.MapsInitializerApi {
    private static final String TAG = "GoogleMapInitializer";
    private static Messages.Result<Messages.PlatformRendererType> initializationResult;
    private final Context context;
    private boolean rendererInitialized = false;

    /* JADX INFO: renamed from: io.flutter.plugins.googlemaps.GoogleMapInitializer$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$gms$maps$MapsInitializer$Renderer;

        static {
            int[] iArr = new int[f.a.values().length];
            $SwitchMap$com$google$android$gms$maps$MapsInitializer$Renderer = iArr;
            try {
                iArr[f.a.LATEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$gms$maps$MapsInitializer$Renderer[f.a.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public GoogleMapInitializer(Context context, BinaryMessenger binaryMessenger) {
        this.context = context;
        Messages.MapsInitializerApi.setUp(binaryMessenger, this);
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsInitializerApi
    public void initializeWithPreferredRenderer(Messages.PlatformRendererType platformRendererType, Messages.Result<Messages.PlatformRendererType> result) {
        if (this.rendererInitialized || initializationResult != null) {
            result.error(new Messages.FlutterError("Renderer already initialized", "Renderer initialization called multiple times", null));
        } else {
            initializationResult = result;
            initializeWithRendererRequest(Convert.toMapRendererType(platformRendererType));
        }
    }

    public void initializeWithRendererRequest(f.a aVar) {
        S6.f.b(this.context, aVar, this);
    }

    @Override // S6.h
    public void onMapsSdkInitialized(f.a aVar) {
        this.rendererInitialized = true;
        if (initializationResult != null) {
            int i10 = AnonymousClass1.$SwitchMap$com$google$android$gms$maps$MapsInitializer$Renderer[aVar.ordinal()];
            if (i10 == 1) {
                initializationResult.success(Messages.PlatformRendererType.LATEST);
            } else if (i10 != 2) {
                initializationResult.error(new Messages.FlutterError("Unknown renderer type", "Initialized with unknown renderer type", aVar.name()));
            } else {
                initializationResult.success(Messages.PlatformRendererType.LEGACY);
            }
            initializationResult = null;
        }
    }

    @Override // io.flutter.plugins.googlemaps.Messages.MapsInitializerApi
    public void warmup() {
        Log.i(TAG, "Google Maps warmup started.");
        try {
            C2198d c2198d = new C2198d(this.context);
            c2198d.b(null);
            c2198d.e();
            c2198d.d();
            c2198d.c();
            Log.i(TAG, "Maps warmup complete.");
        } catch (Exception e10) {
            throw new Messages.FlutterError("Could not warm up", e10.toString(), null);
        }
    }
}
