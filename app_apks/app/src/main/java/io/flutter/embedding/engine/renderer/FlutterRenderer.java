package io.flutter.embedding.engine.renderer;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import androidx.annotation.Keep;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.view.TextureRegistry;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FlutterRenderer implements TextureRegistry {
    private static final String TAG = "FlutterRenderer";
    public static boolean debugDisableSurfaceClear = false;
    public static boolean debugForceSurfaceProducerGlTextures = false;
    private final FlutterJNI flutterJNI;
    private final FlutterUiDisplayListener flutterUiDisplayListener;
    private Surface surface;
    private final AtomicLong nextTextureId = new AtomicLong(0);
    private boolean isDisplayingFlutterUi = false;
    private final Handler handler = new Handler();
    private final Set<WeakReference<TextureRegistry.OnTrimMemoryListener>> onTrimMemoryListeners = new HashSet();
    private final List<ImageReaderSurfaceProducer> imageReaderProducers = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class DisplayFeature {
        public final Rect bounds;
        public final DisplayFeatureState state;
        public final DisplayFeatureType type;

        public DisplayFeature(Rect rect, DisplayFeatureType displayFeatureType, DisplayFeatureState displayFeatureState) {
            this.bounds = rect;
            this.type = displayFeatureType;
            this.state = displayFeatureState;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum DisplayFeatureState {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);

        public final int encodedValue;

        DisplayFeatureState(int i10) {
            this.encodedValue = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum DisplayFeatureType {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);

        public final int encodedValue;

        DisplayFeatureType(int i10) {
            this.encodedValue = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Keep
    public final class ImageReaderSurfaceProducer implements TextureRegistry.SurfaceProducer, TextureRegistry.ImageConsumer, TextureRegistry.OnTrimMemoryListener {
        private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
        private static final int MAX_DEQUEUED_IMAGES = 2;
        private static final int MAX_IMAGES = 7;
        private static final String TAG = "ImageReaderSurfaceProducer";
        private static final boolean VERBOSE_LOGS = false;
        private static final boolean trimOnMemoryPressure = true;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final long f37593id;
        private boolean released;
        private boolean ignoringFence = false;
        private int requestedWidth = 1;
        private int requestedHeight = 1;
        private boolean createNewReader = true;
        boolean notifiedDestroy = false;
        private long lastDequeueTime = 0;
        private long lastQueueTime = 0;
        private long lastScheduleTime = 0;
        private int numTrims = 0;
        private final Object lock = new Object();
        private final ArrayDeque<PerImageReader> imageReaderQueue = new ArrayDeque<>();
        private final HashMap<ImageReader, PerImageReader> perImageReaders = new HashMap<>();
        private ArrayList<PerImage> lastDequeuedImage = new ArrayList<>();
        private PerImageReader lastReaderDequeuedFrom = null;
        TextureRegistry.SurfaceProducer.Callback callback = null;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class PerImage {
            public final Image image;
            public final long queuedTime;

            public PerImage(Image image, long j10) {
                this.image = image;
                this.queuedTime = j10;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class PerImageReader {
            public final ImageReader reader;
            private final ArrayDeque<PerImage> imageQueue = new ArrayDeque<>();
            private boolean closed = false;

            public PerImageReader(ImageReader imageReader) {
                this.reader = imageReader;
                imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: io.flutter.embedding.engine.renderer.d
                    @Override // android.media.ImageReader.OnImageAvailableListener
                    public final void onImageAvailable(ImageReader imageReader2) {
                        FlutterRenderer.ImageReaderSurfaceProducer.PerImageReader.a(this.f37599a, imageReader2);
                    }
                }, new Handler(Looper.getMainLooper()));
            }

            public static /* synthetic */ void a(PerImageReader perImageReader, ImageReader imageReader) {
                Image imageAcquireLatestImage;
                perImageReader.getClass();
                try {
                    imageAcquireLatestImage = imageReader.acquireLatestImage();
                } catch (IllegalStateException e10) {
                    Log.e(ImageReaderSurfaceProducer.TAG, "onImageAvailable acquireLatestImage failed: " + e10);
                    imageAcquireLatestImage = null;
                }
                if (imageAcquireLatestImage == null) {
                    return;
                }
                if (ImageReaderSurfaceProducer.this.released || perImageReader.closed) {
                    imageAcquireLatestImage.close();
                } else {
                    ImageReaderSurfaceProducer.this.onImage(imageReader, imageAcquireLatestImage);
                }
            }

            public boolean canPrune() {
                return this.imageQueue.isEmpty() && ImageReaderSurfaceProducer.this.lastReaderDequeuedFrom != this;
            }

            public void close() {
                this.closed = true;
                this.reader.close();
                this.imageQueue.clear();
            }

            public PerImage dequeueImage() {
                if (this.imageQueue.isEmpty()) {
                    return null;
                }
                return this.imageQueue.removeFirst();
            }

            public boolean imageQueueIsEmpty() {
                return this.imageQueue.isEmpty();
            }

            public PerImage queueImage(Image image) {
                if (this.closed) {
                    return null;
                }
                PerImage perImage = ImageReaderSurfaceProducer.this.new PerImage(image, System.nanoTime());
                this.imageQueue.add(perImage);
                while (this.imageQueue.size() > 2) {
                    this.imageQueue.removeFirst().image.close();
                }
                return perImage;
            }
        }

        public ImageReaderSurfaceProducer(long j10) {
            this.f37593id = j10;
        }

        public static /* synthetic */ void a(ImageReaderSurfaceProducer imageReaderSurfaceProducer) {
            if (imageReaderSurfaceProducer.released) {
                return;
            }
            FlutterRenderer.this.scheduleEngineFrame();
        }

        private void cleanup() {
            synchronized (this.lock) {
                try {
                    for (PerImageReader perImageReader : this.perImageReaders.values()) {
                        if (this.lastReaderDequeuedFrom == perImageReader) {
                            this.lastReaderDequeuedFrom = null;
                        }
                        perImageReader.close();
                    }
                    this.perImageReaders.clear();
                    if (this.lastDequeuedImage.size() > 0) {
                        Iterator<PerImage> it = this.lastDequeuedImage.iterator();
                        while (it.hasNext()) {
                            it.next().image.close();
                        }
                        this.lastDequeuedImage.clear();
                    }
                    PerImageReader perImageReader2 = this.lastReaderDequeuedFrom;
                    if (perImageReader2 != null) {
                        perImageReader2.close();
                        this.lastReaderDequeuedFrom = null;
                    }
                    this.imageReaderQueue.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private ImageReader createImageReader29() {
            return ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 7, 256L);
        }

        private ImageReader createImageReader33() {
            b.a();
            ImageReader.Builder builderA = a.a(this.requestedWidth, this.requestedHeight);
            builderA.setMaxImages(7);
            builderA.setImageFormat(34);
            builderA.setUsage(256L);
            return builderA.build();
        }

        private PerImageReader getActiveReader() {
            synchronized (this.lock) {
                try {
                    if (!this.createNewReader) {
                        PerImageReader perImageReaderPeekLast = this.imageReaderQueue.peekLast();
                        if (perImageReaderPeekLast.reader.getSurface().isValid()) {
                            return perImageReaderPeekLast;
                        }
                    }
                    this.createNewReader = false;
                    return getOrCreatePerImageReader(createImageReader());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private PerImageReader getOrCreatePerImageReader(ImageReader imageReader) {
            PerImageReader perImageReader = this.perImageReaders.get(imageReader);
            if (perImageReader != null) {
                return perImageReader;
            }
            PerImageReader perImageReaderCreatePerImageReader = createPerImageReader(imageReader);
            this.perImageReaders.put(imageReader, perImageReaderCreatePerImageReader);
            this.imageReaderQueue.add(perImageReaderCreatePerImageReader);
            return perImageReaderCreatePerImageReader;
        }

        private void maybeWaitOnFence(Image image) {
            if (image == null || this.ignoringFence) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image);
            } else {
                this.ignoringFence = true;
                Log.d(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
            }
        }

        private void releaseInternal() {
            cleanup();
            this.released = true;
            FlutterRenderer.this.removeOnTrimMemoryListener(this);
            FlutterRenderer.this.imageReaderProducers.remove(this);
        }

        private void waitOnFence(Image image) {
            try {
                image.getFence().awaitForever();
            } catch (IOException unused) {
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageConsumer
        public Image acquireLatestImage() {
            PerImage perImageDequeueImage = dequeueImage();
            if (perImageDequeueImage == null) {
                return null;
            }
            maybeWaitOnFence(perImageDequeueImage.image);
            return perImageDequeueImage.image;
        }

        public ImageReader createImageReader() {
            return Build.VERSION.SDK_INT >= 33 ? createImageReader33() : createImageReader29();
        }

        public PerImageReader createPerImageReader(ImageReader imageReader) {
            return new PerImageReader(imageReader);
        }

        public double deltaMillis(long j10) {
            return j10 / 1000000.0d;
        }

        public PerImage dequeueImage() {
            PerImage perImage;
            boolean z10;
            synchronized (this.lock) {
                try {
                    Iterator<PerImageReader> it = this.imageReaderQueue.iterator();
                    perImage = null;
                    while (true) {
                        z10 = false;
                        if (!it.hasNext()) {
                            break;
                        }
                        PerImageReader next = it.next();
                        PerImage perImageDequeueImage = next.dequeueImage();
                        if (perImageDequeueImage == null) {
                            perImage = perImageDequeueImage;
                        } else {
                            while (this.lastDequeuedImage.size() > 2) {
                                this.lastDequeuedImage.remove(0).image.close();
                            }
                            this.lastDequeuedImage.add(perImageDequeueImage);
                            this.lastReaderDequeuedFrom = next;
                            perImage = perImageDequeueImage;
                        }
                    }
                    pruneImageReaderQueue();
                    Iterator<PerImageReader> it2 = this.imageReaderQueue.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (!it2.next().imageQueueIsEmpty()) {
                            z10 = true;
                            break;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z10) {
                FlutterRenderer.this.handler.post(new Runnable() { // from class: io.flutter.embedding.engine.renderer.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        FlutterRenderer.ImageReaderSurfaceProducer.a(this.f37598a);
                    }
                });
            }
            return perImage;
        }

        public void disableFenceForTest() {
            this.ignoringFence = true;
        }

        public void finalize() throws Throwable {
            try {
                if (this.released) {
                    return;
                }
                releaseInternal();
                FlutterRenderer.this.handler.post(new TextureFinalizerRunnable(this.f37593id, FlutterRenderer.this.flutterJNI));
            } finally {
                super.finalize();
            }
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public Surface getForcedNewSurface() {
            this.createNewReader = true;
            return getSurface();
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public int getHeight() {
            return this.requestedHeight;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public Surface getSurface() {
            return getActiveReader().reader.getSurface();
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public int getWidth() {
            return this.requestedWidth;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public boolean handlesCropAndRotation() {
            return false;
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        public long id() {
            return this.f37593id;
        }

        public int numImageReaders() {
            int size;
            synchronized (this.lock) {
                size = this.imageReaderQueue.size();
            }
            return size;
        }

        public int numImages() {
            int size;
            synchronized (this.lock) {
                try {
                    Iterator<PerImageReader> it = this.imageReaderQueue.iterator();
                    size = 0;
                    while (it.hasNext()) {
                        size += it.next().imageQueue.size();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return size;
        }

        public int numTrims() {
            int i10;
            synchronized (this.lock) {
                i10 = this.numTrims;
            }
            return i10;
        }

        public void onImage(ImageReader imageReader, Image image) {
            PerImage perImageQueueImage;
            synchronized (this.lock) {
                perImageQueueImage = getOrCreatePerImageReader(imageReader).queueImage(image);
            }
            if (perImageQueueImage == null) {
                return;
            }
            FlutterRenderer.this.scheduleEngineFrame();
        }

        @Override // io.flutter.view.TextureRegistry.OnTrimMemoryListener
        public void onTrimMemory(int i10) {
            if (i10 < 40) {
                return;
            }
            synchronized (this.lock) {
                this.numTrims++;
            }
            TextureRegistry.SurfaceProducer.Callback callback = this.callback;
            if (callback != null) {
                this.notifiedDestroy = true;
                callback.onSurfaceCleanup();
            }
            cleanup();
            this.createNewReader = true;
        }

        public int pendingDequeuedImages() {
            return this.lastDequeuedImage.size();
        }

        public void pruneImageReaderQueue() {
            PerImageReader perImageReaderPeekFirst;
            while (this.imageReaderQueue.size() > 1 && (perImageReaderPeekFirst = this.imageReaderQueue.peekFirst()) != null && perImageReaderPeekFirst.canPrune()) {
                this.imageReaderQueue.removeFirst();
                this.perImageReaders.remove(perImageReaderPeekFirst.reader);
                perImageReaderPeekFirst.close();
            }
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        public void release() {
            if (this.released) {
                return;
            }
            releaseInternal();
            FlutterRenderer.this.unregisterTexture(this.f37593id);
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void scheduleFrame() {
            FlutterRenderer.this.scheduleEngineFrame();
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void setCallback(TextureRegistry.SurfaceProducer.Callback callback) {
            this.callback = callback;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void setSize(int i10, int i11) {
            int iMax = Math.max(1, i10);
            int iMax2 = Math.max(1, i11);
            if (this.requestedWidth == iMax && this.requestedHeight == iMax2) {
                return;
            }
            this.createNewReader = true;
            this.requestedHeight = iMax2;
            this.requestedWidth = iMax;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Keep
    public final class ImageTextureRegistryEntry implements TextureRegistry.ImageTextureEntry, TextureRegistry.ImageConsumer {
        private static final String TAG = "ImageTextureRegistryEntry";

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final long f37594id;
        private boolean ignoringFence = false;
        private Image image;
        private boolean released;

        public ImageTextureRegistryEntry(long j10) {
            this.f37594id = j10;
        }

        private void maybeWaitOnFence(Image image) {
            if (image == null || this.ignoringFence) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image);
            } else {
                this.ignoringFence = true;
                Log.d(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
            }
        }

        private void waitOnFence(Image image) {
            try {
                image.getFence().awaitForever();
            } catch (IOException unused) {
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageConsumer
        public Image acquireLatestImage() {
            Image image;
            synchronized (this) {
                image = this.image;
                this.image = null;
            }
            maybeWaitOnFence(image);
            return image;
        }

        public void finalize() throws Throwable {
            try {
                if (this.released) {
                    super.finalize();
                    return;
                }
                Image image = this.image;
                if (image != null) {
                    image.close();
                    this.image = null;
                }
                this.released = true;
                FlutterRenderer.this.handler.post(new TextureFinalizerRunnable(this.f37594id, FlutterRenderer.this.flutterJNI));
                super.finalize();
            } catch (Throwable th) {
                super.finalize();
                throw th;
            }
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        public long id() {
            return this.f37594id;
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
        public void pushImage(Image image) {
            Image image2;
            if (this.released) {
                return;
            }
            synchronized (this) {
                image2 = this.image;
                this.image = image;
            }
            if (image2 != null) {
                Log.e(TAG, "Dropping PlatformView Frame");
                image2.close();
            }
            if (image != null) {
                FlutterRenderer.this.scheduleEngineFrame();
            }
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        public void release() {
            if (this.released) {
                return;
            }
            this.released = true;
            Image image = this.image;
            if (image != null) {
                image.close();
                this.image = null;
            }
            FlutterRenderer.this.unregisterTexture(this.f37594id);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class SurfaceTextureRegistryEntry implements TextureRegistry.SurfaceTextureEntry, TextureRegistry.OnTrimMemoryListener {
        private TextureRegistry.OnFrameConsumedListener frameConsumedListener;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final long f37595id;
        private boolean released;
        private final SurfaceTextureWrapper textureWrapper;
        private TextureRegistry.OnTrimMemoryListener trimMemoryListener;

        public SurfaceTextureRegistryEntry(long j10, SurfaceTexture surfaceTexture) {
            this.f37595id = j10;
            this.textureWrapper = new SurfaceTextureWrapper(surfaceTexture, new Runnable() { // from class: io.flutter.embedding.engine.renderer.e
                @Override // java.lang.Runnable
                public final void run() {
                    FlutterRenderer.SurfaceTextureRegistryEntry.b(this.f37600a);
                }
            });
            surfaceTexture().setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: io.flutter.embedding.engine.renderer.f
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    FlutterRenderer.SurfaceTextureRegistryEntry.a(this.f37601a, surfaceTexture2);
                }
            }, new Handler());
        }

        public static /* synthetic */ void a(SurfaceTextureRegistryEntry surfaceTextureRegistryEntry, SurfaceTexture surfaceTexture) {
            if (surfaceTextureRegistryEntry.released || !FlutterRenderer.this.flutterJNI.isAttached()) {
                return;
            }
            surfaceTextureRegistryEntry.textureWrapper.markDirty();
            FlutterRenderer.this.scheduleEngineFrame();
        }

        public static /* synthetic */ void b(SurfaceTextureRegistryEntry surfaceTextureRegistryEntry) {
            TextureRegistry.OnFrameConsumedListener onFrameConsumedListener = surfaceTextureRegistryEntry.frameConsumedListener;
            if (onFrameConsumedListener != null) {
                onFrameConsumedListener.onFrameConsumed();
            }
        }

        private void removeListener() {
            FlutterRenderer.this.removeOnTrimMemoryListener(this);
        }

        public void finalize() throws Throwable {
            try {
                if (this.released) {
                    return;
                }
                FlutterRenderer.this.handler.post(new TextureFinalizerRunnable(this.f37595id, FlutterRenderer.this.flutterJNI));
            } finally {
                super.finalize();
            }
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        public long id() {
            return this.f37595id;
        }

        @Override // io.flutter.view.TextureRegistry.OnTrimMemoryListener
        public void onTrimMemory(int i10) {
            TextureRegistry.OnTrimMemoryListener onTrimMemoryListener = this.trimMemoryListener;
            if (onTrimMemoryListener != null) {
                onTrimMemoryListener.onTrimMemory(i10);
            }
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        public void release() {
            if (this.released) {
                return;
            }
            Log.v(FlutterRenderer.TAG, "Releasing a SurfaceTexture (" + this.f37595id + ").");
            this.textureWrapper.release();
            FlutterRenderer.this.unregisterTexture(this.f37595id);
            removeListener();
            this.released = true;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public void setOnFrameConsumedListener(TextureRegistry.OnFrameConsumedListener onFrameConsumedListener) {
            this.frameConsumedListener = onFrameConsumedListener;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public void setOnTrimMemoryListener(TextureRegistry.OnTrimMemoryListener onTrimMemoryListener) {
            this.trimMemoryListener = onTrimMemoryListener;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public SurfaceTexture surfaceTexture() {
            return this.textureWrapper.surfaceTexture();
        }

        public SurfaceTextureWrapper textureWrapper() {
            return this.textureWrapper;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class TextureFinalizerRunnable implements Runnable {
        private final FlutterJNI flutterJNI;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final long f37596id;

        public TextureFinalizerRunnable(long j10, FlutterJNI flutterJNI) {
            this.f37596id = j10;
            this.flutterJNI = flutterJNI;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.flutterJNI.isAttached()) {
                Log.v(FlutterRenderer.TAG, "Releasing a Texture (" + this.f37596id + ").");
                this.flutterJNI.unregisterTexture(this.f37596id);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class ViewportMetrics {
        public static final int unsetValue = -1;
        public float devicePixelRatio = 1.0f;
        public int width = 0;
        public int height = 0;
        public int viewPaddingTop = 0;
        public int viewPaddingRight = 0;
        public int viewPaddingBottom = 0;
        public int viewPaddingLeft = 0;
        public int viewInsetTop = 0;
        public int viewInsetRight = 0;
        public int viewInsetBottom = 0;
        public int viewInsetLeft = 0;
        public int systemGestureInsetTop = 0;
        public int systemGestureInsetRight = 0;
        public int systemGestureInsetBottom = 0;
        public int systemGestureInsetLeft = 0;
        public int physicalTouchSlop = -1;
        private final List<DisplayFeature> displayFeatures = new ArrayList();
        private final List<DisplayFeature> displayCutouts = new ArrayList();

        public List<DisplayFeature> getDisplayCutouts() {
            return this.displayCutouts;
        }

        public List<DisplayFeature> getDisplayFeatures() {
            return this.displayFeatures;
        }

        public void setDisplayCutouts(List<DisplayFeature> list) {
            this.displayCutouts.clear();
            this.displayCutouts.addAll(list);
        }

        public void setDisplayFeatures(List<DisplayFeature> list) {
            this.displayFeatures.clear();
            this.displayFeatures.addAll(list);
        }

        public boolean validate() {
            return this.width > 0 && this.height > 0 && this.devicePixelRatio > 0.0f;
        }
    }

    public FlutterRenderer(FlutterJNI flutterJNI) {
        FlutterUiDisplayListener flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.engine.renderer.FlutterRenderer.1
            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                FlutterRenderer.this.isDisplayingFlutterUi = true;
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                FlutterRenderer.this.isDisplayingFlutterUi = false;
            }
        };
        this.flutterUiDisplayListener = flutterUiDisplayListener;
        this.flutterJNI = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(flutterUiDisplayListener);
    }

    private void clearDeadListeners() {
        Iterator<WeakReference<TextureRegistry.OnTrimMemoryListener>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            if (it.next().get() == null) {
                it.remove();
            }
        }
    }

    private void registerImageTexture(long j10, TextureRegistry.ImageConsumer imageConsumer, boolean z10) {
        this.flutterJNI.registerImageTexture(j10, imageConsumer, z10);
    }

    private void registerTexture(long j10, SurfaceTextureWrapper surfaceTextureWrapper) {
        this.flutterJNI.registerTexture(j10, surfaceTextureWrapper);
    }

    private void translateFeatureBounds(int[] iArr, int i10, Rect rect) {
        iArr[i10] = rect.left;
        iArr[i10 + 1] = rect.top;
        iArr[i10 + 2] = rect.right;
        iArr[i10 + 3] = rect.bottom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unregisterTexture(long j10) {
        this.flutterJNI.unregisterTexture(j10);
    }

    public void addIsDisplayingFlutterUiListener(FlutterUiDisplayListener flutterUiDisplayListener) {
        this.flutterJNI.addIsDisplayingFlutterUiListener(flutterUiDisplayListener);
        if (this.isDisplayingFlutterUi) {
            flutterUiDisplayListener.onFlutterUiDisplayed();
        }
    }

    public void addOnTrimMemoryListener(TextureRegistry.OnTrimMemoryListener onTrimMemoryListener) {
        clearDeadListeners();
        this.onTrimMemoryListeners.add(new WeakReference<>(onTrimMemoryListener));
    }

    @Override // io.flutter.view.TextureRegistry
    public TextureRegistry.ImageTextureEntry createImageTexture() {
        ImageTextureRegistryEntry imageTextureRegistryEntry = new ImageTextureRegistryEntry(this.nextTextureId.getAndIncrement());
        Log.v(TAG, "New ImageTextureEntry ID: " + imageTextureRegistryEntry.id());
        registerImageTexture(imageTextureRegistryEntry.id(), imageTextureRegistryEntry, false);
        return imageTextureRegistryEntry;
    }

    @Override // io.flutter.view.TextureRegistry
    public TextureRegistry.SurfaceProducer createSurfaceProducer(TextureRegistry.SurfaceLifecycle surfaceLifecycle) {
        if (debugForceSurfaceProducerGlTextures) {
            TextureRegistry.SurfaceTextureEntry surfaceTextureEntryCreateSurfaceTexture = createSurfaceTexture();
            SurfaceTextureSurfaceProducer surfaceTextureSurfaceProducer = new SurfaceTextureSurfaceProducer(surfaceTextureEntryCreateSurfaceTexture.id(), this.handler, this.flutterJNI, surfaceTextureEntryCreateSurfaceTexture);
            Log.v(TAG, "New SurfaceTextureSurfaceProducer ID: " + surfaceTextureEntryCreateSurfaceTexture.id());
            return surfaceTextureSurfaceProducer;
        }
        long andIncrement = this.nextTextureId.getAndIncrement();
        ImageReaderSurfaceProducer imageReaderSurfaceProducer = new ImageReaderSurfaceProducer(andIncrement);
        boolean z10 = surfaceLifecycle == TextureRegistry.SurfaceLifecycle.resetInBackground;
        registerImageTexture(andIncrement, imageReaderSurfaceProducer, z10);
        if (z10) {
            addOnTrimMemoryListener(imageReaderSurfaceProducer);
        }
        this.imageReaderProducers.add(imageReaderSurfaceProducer);
        Log.v(TAG, "New ImageReaderSurfaceProducer ID: " + andIncrement);
        return imageReaderSurfaceProducer;
    }

    @Override // io.flutter.view.TextureRegistry
    public TextureRegistry.SurfaceTextureEntry createSurfaceTexture() {
        Log.v(TAG, "Creating a SurfaceTexture.");
        return registerSurfaceTexture(new SurfaceTexture(0));
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i10) {
        this.flutterJNI.dispatchPointerDataPacket(byteBuffer, i10);
    }

    public void dispatchSemanticsAction(int i10, int i11, ByteBuffer byteBuffer, int i12) {
        this.flutterJNI.dispatchSemanticsAction(i10, i11, byteBuffer, i12);
    }

    public Bitmap getBitmap() {
        return this.flutterJNI.getBitmap();
    }

    public boolean isDisplayingFlutterUi() {
        return this.isDisplayingFlutterUi;
    }

    public boolean isSoftwareRenderingEnabled() {
        return this.flutterJNI.getIsSoftwareRenderingEnabled();
    }

    @Override // io.flutter.view.TextureRegistry
    public void onTrimMemory(int i10) {
        Iterator<WeakReference<TextureRegistry.OnTrimMemoryListener>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            TextureRegistry.OnTrimMemoryListener onTrimMemoryListener = it.next().get();
            if (onTrimMemoryListener != null) {
                onTrimMemoryListener.onTrimMemory(i10);
            } else {
                it.remove();
            }
        }
    }

    @Override // io.flutter.view.TextureRegistry
    public TextureRegistry.SurfaceTextureEntry registerSurfaceTexture(SurfaceTexture surfaceTexture) {
        return registerSurfaceTexture(this.nextTextureId.getAndIncrement(), surfaceTexture);
    }

    public void removeIsDisplayingFlutterUiListener(FlutterUiDisplayListener flutterUiDisplayListener) {
        this.flutterJNI.removeIsDisplayingFlutterUiListener(flutterUiDisplayListener);
    }

    public void removeOnTrimMemoryListener(TextureRegistry.OnTrimMemoryListener onTrimMemoryListener) {
        for (WeakReference<TextureRegistry.OnTrimMemoryListener> weakReference : this.onTrimMemoryListeners) {
            if (weakReference.get() == onTrimMemoryListener) {
                this.onTrimMemoryListeners.remove(weakReference);
                return;
            }
        }
    }

    public void restoreSurfaceProducers() {
        Log.v(TAG, "restoreSurfaceProducers called; notifying SurfaceProducers");
        for (ImageReaderSurfaceProducer imageReaderSurfaceProducer : this.imageReaderProducers) {
            TextureRegistry.SurfaceProducer.Callback callback = imageReaderSurfaceProducer.callback;
            if (callback != null && imageReaderSurfaceProducer.notifiedDestroy) {
                imageReaderSurfaceProducer.notifiedDestroy = false;
                callback.onSurfaceAvailable();
            }
        }
    }

    public void scheduleEngineFrame() {
        this.flutterJNI.scheduleFrame();
    }

    public void setAccessibilityFeatures(int i10) {
        this.flutterJNI.setAccessibilityFeatures(i10);
    }

    public void setSemanticsEnabled(boolean z10) {
        this.flutterJNI.setSemanticsEnabled(z10);
    }

    public void setViewportMetrics(ViewportMetrics viewportMetrics) {
        if (viewportMetrics.validate()) {
            Log.v(TAG, "Setting viewport metrics\nSize: " + viewportMetrics.width + " x " + viewportMetrics.height + "\nPadding - L: " + viewportMetrics.viewPaddingLeft + ", T: " + viewportMetrics.viewPaddingTop + ", R: " + viewportMetrics.viewPaddingRight + ", B: " + viewportMetrics.viewPaddingBottom + "\nInsets - L: " + viewportMetrics.viewInsetLeft + ", T: " + viewportMetrics.viewInsetTop + ", R: " + viewportMetrics.viewInsetRight + ", B: " + viewportMetrics.viewInsetBottom + "\nSystem Gesture Insets - L: " + viewportMetrics.systemGestureInsetLeft + ", T: " + viewportMetrics.systemGestureInsetTop + ", R: " + viewportMetrics.systemGestureInsetRight + ", B: " + viewportMetrics.systemGestureInsetRight + "\nDisplay Features: " + viewportMetrics.displayFeatures.size() + "\nDisplay Cutouts: " + viewportMetrics.displayCutouts.size());
            int size = viewportMetrics.displayFeatures.size() + viewportMetrics.displayCutouts.size();
            int[] iArr = new int[size * 4];
            int[] iArr2 = new int[size];
            int[] iArr3 = new int[size];
            for (int i10 = 0; i10 < viewportMetrics.displayFeatures.size(); i10++) {
                DisplayFeature displayFeature = (DisplayFeature) viewportMetrics.displayFeatures.get(i10);
                translateFeatureBounds(iArr, i10 * 4, displayFeature.bounds);
                iArr2[i10] = displayFeature.type.encodedValue;
                iArr3[i10] = displayFeature.state.encodedValue;
            }
            int size2 = viewportMetrics.displayFeatures.size() * 4;
            for (int i11 = 0; i11 < viewportMetrics.displayCutouts.size(); i11++) {
                DisplayFeature displayFeature2 = (DisplayFeature) viewportMetrics.displayCutouts.get(i11);
                translateFeatureBounds(iArr, (i11 * 4) + size2, displayFeature2.bounds);
                iArr2[viewportMetrics.displayFeatures.size() + i11] = displayFeature2.type.encodedValue;
                iArr3[viewportMetrics.displayFeatures.size() + i11] = displayFeature2.state.encodedValue;
            }
            this.flutterJNI.setViewportMetrics(viewportMetrics.devicePixelRatio, viewportMetrics.width, viewportMetrics.height, viewportMetrics.viewPaddingTop, viewportMetrics.viewPaddingRight, viewportMetrics.viewPaddingBottom, viewportMetrics.viewPaddingLeft, viewportMetrics.viewInsetTop, viewportMetrics.viewInsetRight, viewportMetrics.viewInsetBottom, viewportMetrics.viewInsetLeft, viewportMetrics.systemGestureInsetTop, viewportMetrics.systemGestureInsetRight, viewportMetrics.systemGestureInsetBottom, viewportMetrics.systemGestureInsetLeft, viewportMetrics.physicalTouchSlop, iArr, iArr2, iArr3);
        }
    }

    public void startRenderingToSurface(Surface surface, boolean z10) {
        if (!z10) {
            stopRenderingToSurface();
        }
        this.surface = surface;
        if (z10) {
            this.flutterJNI.onSurfaceWindowChanged(surface);
        } else {
            this.flutterJNI.onSurfaceCreated(surface);
        }
    }

    public void stopRenderingToSurface() {
        if (this.surface != null) {
            this.flutterJNI.onSurfaceDestroyed();
            if (this.isDisplayingFlutterUi) {
                this.flutterUiDisplayListener.onFlutterUiNoLongerDisplayed();
            }
            this.isDisplayingFlutterUi = false;
            this.surface = null;
        }
    }

    public void surfaceChanged(int i10, int i11) {
        this.flutterJNI.onSurfaceChanged(i10, i11);
    }

    public void swapSurface(Surface surface) {
        this.surface = surface;
        this.flutterJNI.onSurfaceWindowChanged(surface);
    }

    private TextureRegistry.SurfaceTextureEntry registerSurfaceTexture(long j10, SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        SurfaceTextureRegistryEntry surfaceTextureRegistryEntry = new SurfaceTextureRegistryEntry(j10, surfaceTexture);
        Log.v(TAG, "New SurfaceTexture ID: " + surfaceTextureRegistryEntry.id());
        registerTexture(surfaceTextureRegistryEntry.id(), surfaceTextureRegistryEntry.textureWrapper());
        addOnTrimMemoryListener(surfaceTextureRegistryEntry);
        return surfaceTextureRegistryEntry;
    }
}
