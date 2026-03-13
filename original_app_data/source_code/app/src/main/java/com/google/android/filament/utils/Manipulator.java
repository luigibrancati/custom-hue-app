package com.google.android.filament.utils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class Manipulator {
    private static final Mode[] sModeValues = Mode.values();
    private final long mNativeObject;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Builder {
        private final BuilderFinalizer mFinalizer;
        private final long mNativeBuilder;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class BuilderFinalizer {
            private final long mNativeObject;

            public BuilderFinalizer(long j10) {
                this.mNativeObject = j10;
            }

            public void finalize() {
                try {
                    super.finalize();
                } catch (Throwable unused) {
                }
                Manipulator.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder() {
            long jNCreateBuilder = Manipulator.nCreateBuilder();
            this.mNativeBuilder = jNCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(jNCreateBuilder);
        }

        public Manipulator build(Mode mode) {
            long jNBuilderBuild = Manipulator.nBuilderBuild(this.mNativeBuilder, mode.ordinal());
            if (jNBuilderBuild != 0) {
                return new Manipulator(jNBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create Manipulator");
        }

        public Builder farPlane(float f10) {
            Manipulator.nBuilderFarPlane(this.mNativeBuilder, f10);
            return this;
        }

        public Builder flightMaxMoveSpeed(float f10) {
            Manipulator.nBuilderFlightMaxMoveSpeed(this.mNativeBuilder, f10);
            return this;
        }

        public Builder flightMoveDamping(float f10) {
            Manipulator.nBuilderFlightMoveDamping(this.mNativeBuilder, f10);
            return this;
        }

        public Builder flightPanSpeed(float f10, float f11) {
            Manipulator.nBuilderFlightPanSpeed(this.mNativeBuilder, f10, f11);
            return this;
        }

        public Builder flightSpeedSteps(int i10) {
            Manipulator.nBuilderFlightSpeedSteps(this.mNativeBuilder, i10);
            return this;
        }

        public Builder flightStartOrientation(float f10, float f11) {
            Manipulator.nBuilderFlightStartOrientation(this.mNativeBuilder, f10, f11);
            return this;
        }

        public Builder flightStartPosition(float f10, float f11, float f12) {
            Manipulator.nBuilderFlightStartPosition(this.mNativeBuilder, f10, f11, f12);
            return this;
        }

        public Builder fovDegrees(float f10) {
            Manipulator.nBuilderFovDegrees(this.mNativeBuilder, f10);
            return this;
        }

        public Builder fovDirection(Fov fov) {
            Manipulator.nBuilderFovDirection(this.mNativeBuilder, fov.ordinal());
            return this;
        }

        public Builder groundPlane(float f10, float f11, float f12, float f13) {
            Manipulator.nBuilderGroundPlane(this.mNativeBuilder, f10, f11, f12, f13);
            return this;
        }

        public Builder mapExtent(float f10, float f11) {
            Manipulator.nBuilderMapExtent(this.mNativeBuilder, f10, f11);
            return this;
        }

        public Builder mapMinDistance(float f10) {
            Manipulator.nBuilderMapMinDistance(this.mNativeBuilder, f10);
            return this;
        }

        public Builder orbitHomePosition(float f10, float f11, float f12) {
            Manipulator.nBuilderOrbitHomePosition(this.mNativeBuilder, f10, f11, f12);
            return this;
        }

        public Builder orbitSpeed(float f10, float f11) {
            Manipulator.nBuilderOrbitSpeed(this.mNativeBuilder, f10, f11);
            return this;
        }

        public Builder panning(Boolean bool) {
            Manipulator.nBuilderPanning(this.mNativeBuilder, bool);
            return this;
        }

        public Builder targetPosition(float f10, float f11, float f12) {
            Manipulator.nBuilderTargetPosition(this.mNativeBuilder, f10, f11, f12);
            return this;
        }

        public Builder upVector(float f10, float f11, float f12) {
            Manipulator.nBuilderUpVector(this.mNativeBuilder, f10, f11, f12);
            return this;
        }

        public Builder viewport(int i10, int i11) {
            Manipulator.nBuilderViewport(this.mNativeBuilder, i10, i11);
            return this;
        }

        public Builder zoomSpeed(float f10) {
            Manipulator.nBuilderZoomSpeed(this.mNativeBuilder, f10);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum Fov {
        VERTICAL,
        HORIZONTAL
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum Key {
        FORWARD,
        LEFT,
        BACKWARD,
        RIGHT,
        UP,
        DOWN
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum Mode {
        ORBIT,
        MAP,
        FREE_FLIGHT
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFarPlane(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFlightMaxMoveSpeed(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFlightMoveDamping(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFlightPanSpeed(long j10, float f10, float f11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFlightSpeedSteps(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFlightStartOrientation(long j10, float f10, float f11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFlightStartPosition(long j10, float f10, float f11, float f12);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFovDegrees(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFovDirection(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderGroundPlane(long j10, float f10, float f11, float f12, float f13);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderMapExtent(long j10, float f10, float f11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderMapMinDistance(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderOrbitHomePosition(long j10, float f10, float f11, float f12);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderOrbitSpeed(long j10, float f10, float f11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderPanning(long j10, Boolean bool);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderTargetPosition(long j10, float f10, float f11, float f12);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderUpVector(long j10, float f10, float f11, float f12);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderViewport(long j10, int i10, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderZoomSpeed(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native void nDestroyManipulator(long j10);

    private static native long nGetCurrentBookmark(long j10);

    private static native long nGetHomeBookmark(long j10);

    private static native void nGetLookAtDouble(long j10, double[] dArr, double[] dArr2, double[] dArr3);

    private static native void nGetLookAtFloat(long j10, float[] fArr, float[] fArr2, float[] fArr3);

    private static native int nGetMode(long j10);

    private static native void nGrabBegin(long j10, int i10, int i11, boolean z10);

    private static native void nGrabEnd(long j10);

    private static native void nGrabUpdate(long j10, int i10, int i11);

    private static native void nJumpToBookmark(long j10, long j11);

    private static native void nKeyDown(long j10, int i10);

    private static native void nKeyUp(long j10, int i10);

    private static native void nRaycast(long j10, int i10, int i11, float[] fArr);

    private static native void nScroll(long j10, int i10, int i11, float f10);

    private static native void nSetViewport(long j10, int i10, int i11);

    private static native void nUpdate(long j10, float f10);

    public void finalize() {
        try {
            super.finalize();
        } catch (Throwable unused) {
        }
        nDestroyManipulator(this.mNativeObject);
    }

    public Bookmark getCurrentBookmark() {
        return new Bookmark(nGetCurrentBookmark(this.mNativeObject));
    }

    public Bookmark getHomeBookmark() {
        return new Bookmark(nGetHomeBookmark(this.mNativeObject));
    }

    public void getLookAt(float[] fArr, float[] fArr2, float[] fArr3) {
        nGetLookAtFloat(this.mNativeObject, fArr, fArr2, fArr3);
    }

    public Mode getMode() {
        return sModeValues[nGetMode(this.mNativeObject)];
    }

    public void grabBegin(int i10, int i11, boolean z10) {
        nGrabBegin(this.mNativeObject, i10, i11, z10);
    }

    public void grabEnd() {
        nGrabEnd(this.mNativeObject);
    }

    public void grabUpdate(int i10, int i11) {
        nGrabUpdate(this.mNativeObject, i10, i11);
    }

    public void jumpToBookmark(Bookmark bookmark) {
        nJumpToBookmark(this.mNativeObject, bookmark.getNativeObject());
    }

    public void keyDown(Key key) {
        nKeyDown(this.mNativeObject, key.ordinal());
    }

    public void keyUp(Key key) {
        nKeyUp(this.mNativeObject, key.ordinal());
    }

    public float[] raycast(int i10, int i11) {
        float[] fArr = new float[3];
        nRaycast(this.mNativeObject, i10, i11, fArr);
        return fArr;
    }

    public void scroll(int i10, int i11, float f10) {
        nScroll(this.mNativeObject, i10, i11, f10);
    }

    public void setViewport(int i10, int i11) {
        nSetViewport(this.mNativeObject, i10, i11);
    }

    public void update(float f10) {
        nUpdate(this.mNativeObject, f10);
    }

    private Manipulator(long j10) {
        this.mNativeObject = j10;
    }

    public void getLookAt(double[] dArr, double[] dArr2, double[] dArr3) {
        nGetLookAtDouble(this.mNativeObject, dArr, dArr2, dArr3);
    }
}
