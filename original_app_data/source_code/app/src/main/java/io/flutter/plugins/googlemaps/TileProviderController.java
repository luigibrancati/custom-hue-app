package io.flutter.plugins.googlemaps;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import io.flutter.plugins.googlemaps.Messages;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class TileProviderController implements U6.L {
    private static final String TAG = "TileProviderController";
    protected final Messages.MapsCallbackApi flutterApi;
    protected final Handler handler = new Handler(Looper.getMainLooper());
    protected final String tileOverlayId;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class Worker implements Messages.Result<Messages.PlatformTile> {
        private final CountDownLatch countDownLatch = new CountDownLatch(1);
        private Messages.PlatformTile result;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final int f37875x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final int f37876y;
        private final int zoom;

        public Worker(int i10, int i11, int i12) {
            this.f37875x = i10;
            this.f37876y = i11;
            this.zoom = i12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$getTile$0(Messages.PlatformPoint platformPoint) {
            TileProviderController tileProviderController = TileProviderController.this;
            tileProviderController.flutterApi.getTileOverlayTile(tileProviderController.tileOverlayId, platformPoint, Long.valueOf(this.zoom), this);
        }

        @Override // io.flutter.plugins.googlemaps.Messages.Result
        public void error(Throwable th) {
            if (th instanceof Messages.FlutterError) {
                Messages.FlutterError flutterError = (Messages.FlutterError) th;
                Log.e(TileProviderController.TAG, "Can't get tile: errorCode = " + flutterError.code + ", errorMessage = " + flutterError.getMessage() + ", date = " + flutterError.details);
            } else {
                Log.e(TileProviderController.TAG, "Can't get tile: " + th);
            }
            this.result = null;
            this.countDownLatch.countDown();
        }

        public U6.I getTile() {
            final Messages.PlatformPoint platformPointBuild = new Messages.PlatformPoint.Builder().setX(Long.valueOf(this.f37875x)).setY(Long.valueOf(this.f37876y)).build();
            TileProviderController.this.handler.post(new Runnable() { // from class: io.flutter.plugins.googlemaps.m0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37908a.lambda$getTile$0(platformPointBuild);
                }
            });
            try {
                this.countDownLatch.await();
                try {
                    Messages.PlatformTile platformTile = this.result;
                    if (platformTile != null) {
                        return Convert.tileFromPigeon(platformTile);
                    }
                    Log.e(TileProviderController.TAG, String.format("Did not receive tile data for tile: x = %d, y= %d, zoom = %d", Integer.valueOf(this.f37875x), Integer.valueOf(this.f37876y), Integer.valueOf(this.zoom)));
                    return U6.L.f16658a;
                } catch (Exception e10) {
                    Log.e(TileProviderController.TAG, "Can't parse tile data", e10);
                    return U6.L.f16658a;
                }
            } catch (InterruptedException e11) {
                Log.e(TileProviderController.TAG, String.format("countDownLatch: can't get tile: x = %d, y= %d, zoom = %d", Integer.valueOf(this.f37875x), Integer.valueOf(this.f37876y), Integer.valueOf(this.zoom)), e11);
                return U6.L.f16658a;
            }
        }

        @Override // io.flutter.plugins.googlemaps.Messages.Result
        public void success(Messages.PlatformTile platformTile) {
            this.result = platformTile;
            this.countDownLatch.countDown();
        }
    }

    public TileProviderController(Messages.MapsCallbackApi mapsCallbackApi, String str) {
        this.tileOverlayId = str;
        this.flutterApi = mapsCallbackApi;
    }

    @Override // U6.L
    public U6.I getTile(int i10, int i11, int i12) {
        return new Worker(i10, i11, i12).getTile();
    }
}
