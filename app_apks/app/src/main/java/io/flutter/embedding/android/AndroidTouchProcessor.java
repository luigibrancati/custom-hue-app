package io.flutter.embedding.android;

import android.R;
import android.content.Context;
import android.graphics.Matrix;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class AndroidTouchProcessor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int BYTES_PER_FIELD = 8;
    static final int DEFAULT_HORIZONTAL_SCROLL_FACTOR = 48;
    static final int DEFAULT_VERTICAL_SCROLL_FACTOR = 48;
    private static final Matrix IDENTITY_TRANSFORM = new Matrix();
    private static final int IMPLICIT_VIEW_ID = 0;
    static final int POINTER_DATA_FIELD_COUNT = 36;
    private static final int POINTER_DATA_FLAG_BATCHED = 1;
    private static final String TAG = "AndroidTouchProcessor";
    private static final int TOOL_TYPE_BITS = 3;
    private static final int TOOL_TYPE_MASK = 7;
    private int cachedVerticalScrollFactor;
    private final FlutterRenderer renderer;
    private final boolean trackMotionEvents;
    private final Map<Integer, float[]> ongoingPans = new HashMap();
    private final MotionEventTracker motionEventTracker = MotionEventTracker.getInstance();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public @interface PointerChange {
        public static final int ADD = 1;
        public static final int CANCEL = 0;
        public static final int DOWN = 4;
        public static final int HOVER = 3;
        public static final int MOVE = 5;
        public static final int PAN_ZOOM_END = 9;
        public static final int PAN_ZOOM_START = 7;
        public static final int PAN_ZOOM_UPDATE = 8;
        public static final int REMOVE = 2;
        public static final int UP = 6;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public @interface PointerDeviceKind {
        public static final int INVERTED_STYLUS = 3;
        public static final int MOUSE = 1;
        public static final int STYLUS = 2;
        public static final int TOUCH = 0;
        public static final int TRACKPAD = 4;
        public static final int UNKNOWN = 5;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public @interface PointerSignalKind {
        public static final int NONE = 0;
        public static final int SCALE = 3;
        public static final int SCROLL = 1;
        public static final int SCROLL_INERTIA_CANCEL = 2;
        public static final int UNKNOWN = 4;
    }

    public AndroidTouchProcessor(FlutterRenderer flutterRenderer, boolean z10) {
        this.renderer = flutterRenderer;
        this.trackMotionEvents = z10;
    }

    private void addPointerForIndex(MotionEvent motionEvent, int i10, int i11, int i12, Matrix matrix, ByteBuffer byteBuffer) {
        addPointerForIndex(motionEvent, i10, i11, i12, matrix, byteBuffer, null);
    }

    private float getHorizontalScrollFactor(Context context) {
        return ViewConfiguration.get(context).getScaledHorizontalScrollFactor();
    }

    @PointerChange
    private int getPointerChangeForAction(int i10) {
        if (i10 == 0) {
            return 4;
        }
        if (i10 == 1) {
            return 6;
        }
        if (i10 == 5) {
            return 4;
        }
        if (i10 == 6) {
            return 6;
        }
        if (i10 == 2) {
            return 5;
        }
        if (i10 == 7) {
            return 3;
        }
        if (i10 == 3) {
            return 0;
        }
        return i10 == 8 ? 3 : -1;
    }

    @PointerChange
    private int getPointerChangeForPanZoom(int i10) {
        if (i10 == 4) {
            return 7;
        }
        if (i10 == 5) {
            return 8;
        }
        return (i10 == 6 || i10 == 0) ? 9 : -1;
    }

    @PointerDeviceKind
    private int getPointerDeviceTypeForToolType(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 != 3) {
            return i10 != 4 ? 5 : 3;
        }
        return 1;
    }

    private float getVerticalScrollFactor(Context context) {
        return getVerticalScrollFactorAbove26(context);
    }

    private float getVerticalScrollFactorAbove26(Context context) {
        return ViewConfiguration.get(context).getScaledVerticalScrollFactor();
    }

    private int getVerticalScrollFactorPre26(Context context) {
        if (this.cachedVerticalScrollFactor == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                return 48;
            }
            this.cachedVerticalScrollFactor = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.cachedVerticalScrollFactor;
    }

    private int uniquePointerIdByType(MotionEvent motionEvent, int i10) {
        return (motionEvent.getPointerId(i10) << 3) | (motionEvent.getToolType(i10) & 7);
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent, Context context) {
        boolean zIsFromSource = motionEvent.isFromSource(2);
        boolean z10 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (!zIsFromSource || !z10) {
            return false;
        }
        int pointerChangeForAction = getPointerChangeForAction(motionEvent.getActionMasked());
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        addPointerForIndex(motionEvent, motionEvent.getActionIndex(), pointerChangeForAction, 0, IDENTITY_TRANSFORM, byteBufferAllocateDirect, context);
        if (byteBufferAllocateDirect.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary.");
        }
        this.renderer.dispatchPointerDataPacket(byteBufferAllocateDirect, byteBufferAllocateDirect.position());
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent, IDENTITY_TRANSFORM);
    }

    private void addPointerForIndex(MotionEvent motionEvent, int i10, int i11, int i12, Matrix matrix, ByteBuffer byteBuffer, Context context) {
        int i13;
        int i14;
        long j10;
        long buttonState;
        double min;
        double max;
        double horizontalScrollFactor;
        double verticalScrollFactor;
        InputDevice.MotionRange motionRange;
        int i15 = -1;
        if (i11 == -1) {
            return;
        }
        int iUniquePointerIdByType = uniquePointerIdByType(motionEvent, i10);
        int pointerDeviceTypeForToolType = getPointerDeviceTypeForToolType(motionEvent.getToolType(i10));
        float[] fArr = {motionEvent.getX(i10), motionEvent.getY(i10)};
        matrix.mapPoints(fArr);
        if (pointerDeviceTypeForToolType == 1) {
            i14 = 0;
            j10 = 0;
            long buttonState2 = motionEvent.getButtonState() & 31;
            if (buttonState2 == 0) {
                i13 = 1;
                if (motionEvent.getSource() == 8194 && i11 == 4) {
                    this.ongoingPans.put(Integer.valueOf(iUniquePointerIdByType), fArr);
                }
            } else {
                i13 = 1;
            }
            buttonState = buttonState2;
        } else {
            i13 = 1;
            i14 = 0;
            j10 = 0;
            buttonState = pointerDeviceTypeForToolType == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        boolean zContainsKey = this.ongoingPans.containsKey(Integer.valueOf(iUniquePointerIdByType));
        if (zContainsKey) {
            int pointerChangeForPanZoom = getPointerChangeForPanZoom(i11);
            if (pointerChangeForPanZoom == -1) {
                return;
            } else {
                i15 = pointerChangeForPanZoom;
            }
        }
        long id2 = this.trackMotionEvents ? this.motionEventTracker.track(motionEvent).getId() : j10;
        int i16 = motionEvent.getActionMasked() == 8 ? i13 : i14;
        long eventTime = motionEvent.getEventTime() * 1000;
        byteBuffer.putLong(id2);
        byteBuffer.putLong(eventTime);
        if (zContainsKey) {
            byteBuffer.putLong(i15);
            byteBuffer.putLong(4L);
        } else {
            byteBuffer.putLong(i11);
            byteBuffer.putLong(pointerDeviceTypeForToolType);
        }
        byteBuffer.putLong(i16);
        byteBuffer.putLong(iUniquePointerIdByType);
        byteBuffer.putLong(j10);
        if (zContainsKey) {
            float[] fArr2 = this.ongoingPans.get(Integer.valueOf(iUniquePointerIdByType));
            byteBuffer.putDouble(fArr2[i14]);
            byteBuffer.putDouble(fArr2[i13]);
        } else {
            byteBuffer.putDouble(fArr[i14]);
            byteBuffer.putDouble(fArr[i13]);
        }
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putLong(buttonState);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i10));
        if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
            min = 0.0d;
            max = 1.0d;
        } else {
            min = motionRange.getMin();
            max = motionRange.getMax();
        }
        byteBuffer.putDouble(min);
        byteBuffer.putDouble(max);
        if (pointerDeviceTypeForToolType == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(24, i10));
            byteBuffer.putDouble(0.0d);
        } else {
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(motionEvent.getSize(i10));
        byteBuffer.putDouble(motionEvent.getToolMajor(i10));
        byteBuffer.putDouble(motionEvent.getToolMinor(i10));
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(motionEvent.getAxisValue(8, i10));
        if (pointerDeviceTypeForToolType == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(25, i10));
        } else {
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putLong(i12);
        if (i16 == i13) {
            if (context != null) {
                horizontalScrollFactor = getHorizontalScrollFactor(context);
                verticalScrollFactor = getVerticalScrollFactor(context);
            } else {
                horizontalScrollFactor = 48.0d;
                verticalScrollFactor = 48.0d;
            }
            double d10 = horizontalScrollFactor * ((double) (-motionEvent.getAxisValue(10, i10)));
            double d11 = verticalScrollFactor * ((double) (-motionEvent.getAxisValue(9, i10)));
            byteBuffer.putDouble(d10);
            byteBuffer.putDouble(d11);
        } else {
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        if (zContainsKey) {
            float[] fArr3 = this.ongoingPans.get(Integer.valueOf(iUniquePointerIdByType));
            byteBuffer.putDouble(fArr[i14] - fArr3[i14]);
            byteBuffer.putDouble(fArr[1] - fArr3[1]);
        } else {
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(1.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putLong(0L);
        if (zContainsKey && i15 == 9) {
            this.ongoingPans.remove(Integer.valueOf(iUniquePointerIdByType));
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent, Matrix matrix) {
        int actionMasked = motionEvent.getActionMasked();
        int pointerChangeForAction = getPointerChangeForAction(motionEvent.getActionMasked());
        boolean z10 = actionMasked == 0 || actionMasked == 5;
        boolean z11 = !z10 && (actionMasked == 1 || actionMasked == 6);
        int i10 = (z11 && getPointerDeviceTypeForToolType(motionEvent.getToolType(motionEvent.getActionIndex())) == 0) ? 1 : 0;
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((pointerCount + i10) * 288);
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (z10) {
            addPointerForIndex(motionEvent, motionEvent.getActionIndex(), pointerChangeForAction, 0, matrix, byteBufferAllocateDirect);
        } else if (z11) {
            for (int i11 = 0; i11 < pointerCount; i11++) {
                if (i11 != motionEvent.getActionIndex() && motionEvent.getToolType(i11) == 1) {
                    addPointerForIndex(motionEvent, i11, 5, 1, matrix, byteBufferAllocateDirect);
                }
            }
            addPointerForIndex(motionEvent, motionEvent.getActionIndex(), pointerChangeForAction, 0, matrix, byteBufferAllocateDirect);
            if (i10 != 0) {
                addPointerForIndex(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, byteBufferAllocateDirect);
            }
        } else {
            for (int i12 = 0; i12 < pointerCount; i12++) {
                addPointerForIndex(motionEvent, i12, pointerChangeForAction, 0, matrix, byteBufferAllocateDirect);
            }
        }
        if (byteBufferAllocateDirect.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        this.renderer.dispatchPointerDataPacket(byteBufferAllocateDirect, byteBufferAllocateDirect.position());
        return true;
    }
}
