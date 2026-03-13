package com.google.android.filament.utils;

import android.view.MotionEvent;
import android.view.View;
import gc.C4179C;
import io.sentry.protocol.Request;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002)*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0082D¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020!8\u0002X\u0082D¢\u0006\u0006\n\u0004\b%\u0010#R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/google/android/filament/utils/GestureDetector;", "", "Landroid/view/View;", "view", "Lcom/google/android/filament/utils/Manipulator;", "manipulator", "<init>", "(Landroid/view/View;Lcom/google/android/filament/utils/Manipulator;)V", "Lfc/H;", "endGesture", "()V", "", "isOrbitGesture", "()Z", "isPanGesture", "isZoomGesture", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)V", "Landroid/view/View;", "Lcom/google/android/filament/utils/Manipulator;", "Lcom/google/android/filament/utils/GestureDetector$Gesture;", "currentGesture", "Lcom/google/android/filament/utils/GestureDetector$Gesture;", "Lcom/google/android/filament/utils/GestureDetector$TouchPair;", "previousTouch", "Lcom/google/android/filament/utils/GestureDetector$TouchPair;", "Ljava/util/ArrayList;", "tentativePanEvents", "Ljava/util/ArrayList;", "tentativeOrbitEvents", "tentativeZoomEvents", "", "kGestureConfidenceCount", "I", "kPanConfidenceDistance", "kZoomConfidenceDistance", "", "kZoomSpeed", "F", "Gesture", "TouchPair", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GestureDetector {
    private Gesture currentGesture;
    private final int kGestureConfidenceCount;
    private final int kPanConfidenceDistance;
    private final int kZoomConfidenceDistance;
    private final float kZoomSpeed;
    private final Manipulator manipulator;
    private TouchPair previousTouch;
    private final ArrayList<TouchPair> tentativeOrbitEvents;
    private final ArrayList<TouchPair> tentativePanEvents;
    private final ArrayList<TouchPair> tentativeZoomEvents;
    private final View view;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/google/android/filament/utils/GestureDetector$Gesture;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "ORBIT", "PAN", "ZOOM", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Gesture {
        private static final /* synthetic */ InterfaceC5276a $ENTRIES;
        private static final /* synthetic */ Gesture[] $VALUES;
        public static final Gesture NONE = new Gesture("NONE", 0);
        public static final Gesture ORBIT = new Gesture("ORBIT", 1);
        public static final Gesture PAN = new Gesture("PAN", 2);
        public static final Gesture ZOOM = new Gesture("ZOOM", 3);

        private static final /* synthetic */ Gesture[] $values() {
            return new Gesture[]{NONE, ORBIT, PAN, ZOOM};
        }

        static {
            Gesture[] gestureArr$values = $values();
            $VALUES = gestureArr$values;
            $ENTRIES = AbstractC5277b.a(gestureArr$values);
        }

        private Gesture(String str, int i10) {
        }

        public static InterfaceC5276a getEntries() {
            return $ENTRIES;
        }

        public static Gesture valueOf(String str) {
            return (Gesture) Enum.valueOf(Gesture.class, str);
        }

        public static Gesture[] values() {
            return (Gesture[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J'\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0006HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000fR\u0011\u0010\u001e\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010 \u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b!\u0010\u0015¨\u0006,"}, d2 = {"Lcom/google/android/filament/utils/GestureDetector$TouchPair;", "", "pt0", "Lcom/google/android/filament/utils/Float2;", "pt1", "count", "", "<init>", "(Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;I)V", "()V", "me", "Landroid/view/MotionEvent;", "height", "(Landroid/view/MotionEvent;I)V", "getPt0", "()Lcom/google/android/filament/utils/Float2;", "setPt0", "(Lcom/google/android/filament/utils/Float2;)V", "getPt1", "setPt1", "getCount", "()I", "setCount", "(I)V", "separation", "", "getSeparation", "()F", "midpoint", "getMidpoint", "x", "getX", "y", "getY", "component1", "component2", "component3", "copy", "equals", "", Request.JsonKeys.OTHER, "hashCode", "toString", "", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TouchPair {
        private int count;
        private Float2 pt0;
        private Float2 pt1;

        public TouchPair(Float2 pt0, Float2 pt1, int i10) {
            AbstractC4862t.e(pt0, "pt0");
            AbstractC4862t.e(pt1, "pt1");
            this.pt0 = pt0;
            this.pt1 = pt1;
            this.count = i10;
        }

        public static /* synthetic */ TouchPair copy$default(TouchPair touchPair, Float2 float2, Float2 float22, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                float2 = touchPair.pt0;
            }
            if ((i11 & 2) != 0) {
                float22 = touchPair.pt1;
            }
            if ((i11 & 4) != 0) {
                i10 = touchPair.count;
            }
            return touchPair.copy(float2, float22, i10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Float2 getPt0() {
            return this.pt0;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Float2 getPt1() {
            return this.pt1;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        public final TouchPair copy(Float2 pt0, Float2 pt1, int count) {
            AbstractC4862t.e(pt0, "pt0");
            AbstractC4862t.e(pt1, "pt1");
            return new TouchPair(pt0, pt1, count);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TouchPair)) {
                return false;
            }
            TouchPair touchPair = (TouchPair) other;
            return AbstractC4862t.a(this.pt0, touchPair.pt0) && AbstractC4862t.a(this.pt1, touchPair.pt1) && this.count == touchPair.count;
        }

        public final int getCount() {
            return this.count;
        }

        public final Float2 getMidpoint() {
            Float2 float2 = this.pt0;
            Float2 float22 = this.pt1;
            return new Float2((float2.getX() * 0.5f) + (float22.getX() * 0.5f), (float2.getY() * 0.5f) + (float22.getY() * 0.5f));
        }

        public final Float2 getPt0() {
            return this.pt0;
        }

        public final Float2 getPt1() {
            return this.pt1;
        }

        public final float getSeparation() {
            Float2 float2 = this.pt0;
            Float2 float22 = this.pt1;
            Float2 float23 = new Float2(float2.getX() - float22.getX(), float2.getY() - float22.getY());
            return (float) Math.sqrt((float23.getX() * float23.getX()) + (float23.getY() * float23.getY()));
        }

        public final int getX() {
            return (int) getMidpoint().getX();
        }

        public final int getY() {
            return (int) getMidpoint().getY();
        }

        public int hashCode() {
            return (((this.pt0.hashCode() * 31) + this.pt1.hashCode()) * 31) + Integer.hashCode(this.count);
        }

        public final void setCount(int i10) {
            this.count = i10;
        }

        public final void setPt0(Float2 float2) {
            AbstractC4862t.e(float2, "<set-?>");
            this.pt0 = float2;
        }

        public final void setPt1(Float2 float2) {
            AbstractC4862t.e(float2, "<set-?>");
            this.pt1 = float2;
        }

        public String toString() {
            return "TouchPair(pt0=" + this.pt0 + ", pt1=" + this.pt1 + ", count=" + this.count + ")";
        }

        public TouchPair() {
            this(new Float2(0.0f), new Float2(0.0f), 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TouchPair(MotionEvent me2, int i10) {
            this();
            AbstractC4862t.e(me2, "me");
            if (me2.getPointerCount() >= 1) {
                Float2 float2 = new Float2(me2.getX(0), i10 - me2.getY(0));
                this.pt0 = float2;
                this.pt1 = float2;
                this.count++;
            }
            if (me2.getPointerCount() >= 2) {
                this.pt1 = new Float2(me2.getX(1), i10 - me2.getY(1));
                this.count++;
            }
        }
    }

    public GestureDetector(View view, Manipulator manipulator) {
        AbstractC4862t.e(view, "view");
        AbstractC4862t.e(manipulator, "manipulator");
        this.view = view;
        this.manipulator = manipulator;
        this.currentGesture = Gesture.NONE;
        this.previousTouch = new TouchPair();
        this.tentativePanEvents = new ArrayList<>();
        this.tentativeOrbitEvents = new ArrayList<>();
        this.tentativeZoomEvents = new ArrayList<>();
        this.kGestureConfidenceCount = 2;
        this.kPanConfidenceDistance = 4;
        this.kZoomConfidenceDistance = 10;
        this.kZoomSpeed = 0.1f;
    }

    private final void endGesture() {
        this.tentativePanEvents.clear();
        this.tentativeOrbitEvents.clear();
        this.tentativeZoomEvents.clear();
        this.currentGesture = Gesture.NONE;
        this.manipulator.grabEnd();
    }

    private final boolean isOrbitGesture() {
        return this.tentativeOrbitEvents.size() > this.kGestureConfidenceCount;
    }

    private final boolean isPanGesture() {
        if (this.tentativePanEvents.size() <= this.kGestureConfidenceCount) {
            return false;
        }
        Float2 midpoint = ((TouchPair) C4179C.h0(this.tentativePanEvents)).getMidpoint();
        Float2 midpoint2 = ((TouchPair) C4179C.s0(this.tentativePanEvents)).getMidpoint();
        Float2 float2 = new Float2(midpoint.getX() - midpoint2.getX(), midpoint.getY() - midpoint2.getY());
        return ((float) Math.sqrt((double) ((float2.getX() * float2.getX()) + (float2.getY() * float2.getY())))) > ((float) this.kPanConfidenceDistance);
    }

    private final boolean isZoomGesture() {
        if (this.tentativeZoomEvents.size() <= this.kGestureConfidenceCount) {
            return false;
        }
        return Math.abs(((TouchPair) C4179C.s0(this.tentativeZoomEvents)).getSeparation() - ((TouchPair) C4179C.h0(this.tentativeZoomEvents)).getSeparation()) > ((float) this.kZoomConfidenceDistance);
    }

    public final void onTouchEvent(MotionEvent event) {
        AbstractC4862t.e(event, "event");
        TouchPair touchPair = new TouchPair(event, this.view.getHeight());
        int actionMasked = event.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if ((event.getPointerCount() != 1 && this.currentGesture == Gesture.ORBIT) || ((event.getPointerCount() != 2 && this.currentGesture == Gesture.PAN) || (event.getPointerCount() != 2 && this.currentGesture == Gesture.ZOOM))) {
                    endGesture();
                    return;
                }
                Gesture gesture = this.currentGesture;
                Gesture gesture2 = Gesture.ZOOM;
                if (gesture == gesture2) {
                    this.manipulator.scroll(touchPair.getX(), touchPair.getY(), (this.previousTouch.getSeparation() - touchPair.getSeparation()) * this.kZoomSpeed);
                    this.previousTouch = touchPair;
                    return;
                }
                if (gesture != Gesture.NONE) {
                    this.manipulator.grabUpdate(touchPair.getX(), touchPair.getY());
                    return;
                }
                if (event.getPointerCount() == 1) {
                    this.tentativeOrbitEvents.add(touchPair);
                }
                if (event.getPointerCount() == 2) {
                    this.tentativePanEvents.add(touchPair);
                    this.tentativeZoomEvents.add(touchPair);
                }
                if (isOrbitGesture()) {
                    this.manipulator.grabBegin(touchPair.getX(), touchPair.getY(), false);
                    this.currentGesture = Gesture.ORBIT;
                    return;
                } else if (isZoomGesture()) {
                    this.currentGesture = gesture2;
                    this.previousTouch = touchPair;
                    return;
                } else {
                    if (isPanGesture()) {
                        this.manipulator.grabBegin(touchPair.getX(), touchPair.getY(), true);
                        this.currentGesture = Gesture.PAN;
                        return;
                    }
                    return;
                }
            }
            if (actionMasked != 3) {
                return;
            }
        }
        endGesture();
    }
}
