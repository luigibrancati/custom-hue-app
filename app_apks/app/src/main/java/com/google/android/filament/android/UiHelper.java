package com.google.android.filament.android;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class UiHelper {
    private static final boolean LOGGING = false;
    private static final String LOG_TAG = "UiHelper";
    private int mDesiredHeight;
    private int mDesiredWidth;
    private boolean mHasSwapChain;
    private Object mNativeWindow;
    private boolean mOpaque;
    private boolean mOverlay;
    private RendererCallback mRenderCallback;
    private RenderSurface mRenderSurface;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum ContextErrorPolicy {
        CHECK,
        DONT_CHECK
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface RenderSurface {
        void detach();

        void resize(int i10, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface RendererCallback {
        void onDetachedFromSurface();

        void onNativeWindowChanged(Surface surface);

        void onResized(int i10, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class SurfaceHolderHandler implements RenderSurface, SurfaceHolder.Callback {
        private final SurfaceHolder mSurfaceHolder;

        public SurfaceHolderHandler(SurfaceHolder surfaceHolder) {
            this.mSurfaceHolder = surfaceHolder;
            surfaceHolder.addCallback(this);
            if (UiHelper.this.mDesiredWidth > 0 && UiHelper.this.mDesiredHeight > 0) {
                surfaceHolder.setFixedSize(UiHelper.this.mDesiredWidth, UiHelper.this.mDesiredHeight);
            }
            Surface surface = surfaceHolder.getSurface();
            if (surface == null || !surface.isValid()) {
                return;
            }
            surfaceCreated(surfaceHolder);
            surfaceChanged(surfaceHolder, 1, surfaceHolder.getSurfaceFrame().width(), surfaceHolder.getSurfaceFrame().height());
        }

        @Override // com.google.android.filament.android.UiHelper.RenderSurface
        public void detach() {
            this.mSurfaceHolder.removeCallback(this);
        }

        @Override // com.google.android.filament.android.UiHelper.RenderSurface
        public void resize(int i10, int i11) {
            this.mSurfaceHolder.setFixedSize(i10, i11);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            if (UiHelper.this.mRenderCallback != null) {
                UiHelper.this.mRenderCallback.onResized(i11, i12);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            UiHelper.this.createSwapChain(surfaceHolder.getSurface());
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            UiHelper.this.destroySwapChain();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class SurfaceViewHandler implements RenderSurface, SurfaceHolder.Callback {
        private final SurfaceView mSurfaceView;

        public SurfaceViewHandler(SurfaceView surfaceView) {
            this.mSurfaceView = surfaceView;
            SurfaceHolder holder = surfaceView.getHolder();
            holder.addCallback(this);
            if (UiHelper.this.mDesiredWidth > 0 && UiHelper.this.mDesiredHeight > 0) {
                holder.setFixedSize(UiHelper.this.mDesiredWidth, UiHelper.this.mDesiredHeight);
            }
            Surface surface = holder.getSurface();
            if (surface == null || !surface.isValid()) {
                return;
            }
            surfaceCreated(holder);
            surfaceChanged(holder, 1, holder.getSurfaceFrame().width(), holder.getSurfaceFrame().height());
        }

        @Override // com.google.android.filament.android.UiHelper.RenderSurface
        public void detach() {
            this.mSurfaceView.getHolder().removeCallback(this);
        }

        @Override // com.google.android.filament.android.UiHelper.RenderSurface
        public void resize(int i10, int i11) {
            this.mSurfaceView.getHolder().setFixedSize(i10, i11);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            if (UiHelper.this.mRenderCallback != null) {
                UiHelper.this.mRenderCallback.onResized(i11, i12);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            UiHelper.this.createSwapChain(surfaceHolder.getSurface());
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            UiHelper.this.destroySwapChain();
        }
    }

    public UiHelper() {
        this(ContextErrorPolicy.CHECK);
    }

    private boolean attach(Object obj) {
        Object obj2 = this.mNativeWindow;
        if (obj2 != null) {
            if (obj2 == obj) {
                return false;
            }
            RenderSurface renderSurface = this.mRenderSurface;
            if (renderSurface != null) {
                renderSurface.detach();
                this.mRenderSurface = null;
            }
            destroySwapChain();
        }
        this.mNativeWindow = obj;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createSwapChain(Surface surface) {
        RendererCallback rendererCallback = this.mRenderCallback;
        if (rendererCallback != null) {
            rendererCallback.onNativeWindowChanged(surface);
        }
        this.mHasSwapChain = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroySwapChain() {
        RendererCallback rendererCallback = this.mRenderCallback;
        if (rendererCallback != null) {
            rendererCallback.onDetachedFromSurface();
        }
        this.mHasSwapChain = false;
    }

    public void attachTo(SurfaceView surfaceView) {
        if (attach(surfaceView)) {
            boolean z10 = !isOpaque();
            if (isMediaOverlay()) {
                surfaceView.setZOrderMediaOverlay(z10);
            } else {
                surfaceView.setZOrderOnTop(z10);
            }
            surfaceView.getHolder().setFormat(isOpaque() ? -1 : -3);
            this.mRenderSurface = new SurfaceViewHandler(surfaceView);
        }
    }

    public void detach() {
        RenderSurface renderSurface = this.mRenderSurface;
        if (renderSurface != null) {
            renderSurface.detach();
        }
        destroySwapChain();
        this.mNativeWindow = null;
        this.mRenderSurface = null;
    }

    public int getDesiredHeight() {
        return this.mDesiredHeight;
    }

    public int getDesiredWidth() {
        return this.mDesiredWidth;
    }

    public RendererCallback getRenderCallback() {
        return this.mRenderCallback;
    }

    public long getSwapChainFlags() {
        return isOpaque() ? 0L : 1L;
    }

    public boolean isMediaOverlay() {
        return this.mOverlay;
    }

    public boolean isOpaque() {
        return this.mOpaque;
    }

    public boolean isReadyToRender() {
        return this.mHasSwapChain;
    }

    public void setDesiredSize(int i10, int i11) {
        this.mDesiredWidth = i10;
        this.mDesiredHeight = i11;
        RenderSurface renderSurface = this.mRenderSurface;
        if (renderSurface != null) {
            renderSurface.resize(i10, i11);
        }
    }

    public void setMediaOverlay(boolean z10) {
        this.mOverlay = z10;
    }

    public void setOpaque(boolean z10) {
        this.mOpaque = z10;
    }

    public void setRenderCallback(RendererCallback rendererCallback) {
        this.mRenderCallback = rendererCallback;
    }

    public UiHelper(ContextErrorPolicy contextErrorPolicy) {
        this.mOpaque = true;
        this.mOverlay = false;
    }

    public void attachTo(TextureView textureView) {
        if (attach(textureView)) {
            textureView.setOpaque(isOpaque());
            this.mRenderSurface = new TextureViewHandler(textureView);
        }
    }

    public void attachTo(SurfaceHolder surfaceHolder) {
        if (attach(surfaceHolder)) {
            surfaceHolder.setFormat(isOpaque() ? -1 : -3);
            this.mRenderSurface = new SurfaceHolderHandler(surfaceHolder);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class TextureViewHandler implements RenderSurface, TextureView.SurfaceTextureListener {
        private Surface mSurface;
        private final TextureView mTextureView;

        public TextureViewHandler(TextureView textureView) {
            SurfaceTexture surfaceTexture;
            this.mTextureView = textureView;
            textureView.setSurfaceTextureListener(this);
            if (!textureView.isAvailable() || (surfaceTexture = textureView.getSurfaceTexture()) == null) {
                return;
            }
            onSurfaceTextureAvailable(surfaceTexture, UiHelper.this.mDesiredWidth, UiHelper.this.mDesiredHeight);
        }

        private Surface getSurface() {
            return this.mSurface;
        }

        private void setSurface(Surface surface) {
            Surface surface2;
            if (surface == null && (surface2 = this.mSurface) != null) {
                surface2.release();
            }
            this.mSurface = surface;
        }

        @Override // com.google.android.filament.android.UiHelper.RenderSurface
        public void detach() {
            this.mTextureView.setSurfaceTextureListener(null);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            if (UiHelper.this.mDesiredWidth > 0 && UiHelper.this.mDesiredHeight > 0) {
                surfaceTexture.setDefaultBufferSize(UiHelper.this.mDesiredWidth, UiHelper.this.mDesiredHeight);
            }
            Surface surface = new Surface(surfaceTexture);
            setSurface(surface);
            UiHelper.this.createSwapChain(surface);
            if (UiHelper.this.mRenderCallback != null) {
                UiHelper.this.mRenderCallback.onResized(i10, i11);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            setSurface(null);
            UiHelper.this.destroySwapChain();
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            if (UiHelper.this.mRenderCallback != null) {
                if (UiHelper.this.mDesiredWidth <= 0 || UiHelper.this.mDesiredHeight <= 0) {
                    UiHelper.this.mRenderCallback.onResized(i10, i11);
                } else {
                    surfaceTexture.setDefaultBufferSize(UiHelper.this.mDesiredWidth, UiHelper.this.mDesiredHeight);
                    UiHelper.this.mRenderCallback.onResized(UiHelper.this.mDesiredWidth, UiHelper.this.mDesiredHeight);
                }
                Surface surface = getSurface();
                if (surface != null) {
                    UiHelper.this.mRenderCallback.onNativeWindowChanged(surface);
                }
            }
        }

        @Override // com.google.android.filament.android.UiHelper.RenderSurface
        public void resize(int i10, int i11) {
            SurfaceTexture surfaceTexture = this.mTextureView.getSurfaceTexture();
            if (surfaceTexture != null) {
                surfaceTexture.setDefaultBufferSize(i10, i11);
            }
            if (UiHelper.this.mRenderCallback != null) {
                UiHelper.this.mRenderCallback.onResized(i10, i11);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }
}
