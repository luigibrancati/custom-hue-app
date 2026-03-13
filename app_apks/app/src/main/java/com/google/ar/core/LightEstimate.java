package com.google.ar.core;

import android.media.Image;
import com.google.ar.core.exceptions.FatalException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class LightEstimate {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum State {
        NOT_VALID(0),
        VALID(1);

        final int nativeCode;

        State(int i10) {
            this.nativeCode = i10;
        }

        public static State forNumber(int i10) {
            for (State state : values()) {
                if (state.nativeCode == i10) {
                    return state;
                }
            }
            throw new FatalException(p.b((byte) 55, i10, "Unexpected value for native LightEstimate.State, value="));
        }
    }

    public LightEstimate() {
        this.nativeHandle = 0L;
        this.session = null;
        this.nativeSymbolTableHandle = 0L;
    }

    private native long[] nativeAcquireEnvironmentalHdrCubeMap(long j10, long j11);

    private static native long nativeCreateLightEstimate(long j10);

    private static native void nativeDestroyLightEstimate(long j10, long j11);

    private native void nativeGetColorCorrection(long j10, long j11, float[] fArr, int i10);

    private native void nativeGetEnvironmentalHdrAmbientSphericalHarmonics(long j10, long j11, float[] fArr);

    private native void nativeGetEnvironmentalHdrMainLightDirection(long j10, long j11, float[] fArr);

    private native void nativeGetEnvironmentalHdrMainLightIntensity(long j10, long j11, float[] fArr);

    private native float nativeGetPixelIntensity(long j10, long j11);

    private native int nativeGetState(long j10, long j11);

    private native long nativeGetTimestamp(long j10, long j11);

    public Image[] acquireEnvironmentalHdrCubeMap() {
        long[] jArrNativeAcquireEnvironmentalHdrCubeMap = nativeAcquireEnvironmentalHdrCubeMap(this.session.nativeWrapperHandle, this.nativeHandle);
        ArImage[] arImageArr = new ArImage[jArrNativeAcquireEnvironmentalHdrCubeMap.length];
        for (int i10 = 0; i10 < jArrNativeAcquireEnvironmentalHdrCubeMap.length; i10++) {
            arImageArr[i10] = new ArImage(this.session, jArrNativeAcquireEnvironmentalHdrCubeMap[i10]);
        }
        return arImageArr;
    }

    public void finalize() throws Throwable {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeDestroyLightEstimate(this.nativeSymbolTableHandle, j10);
        }
        super.finalize();
    }

    public void getColorCorrection(float[] fArr, int i10) {
        nativeGetColorCorrection(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i10);
    }

    public float[] getEnvironmentalHdrAmbientSphericalHarmonics() {
        float[] fArr = new float[27];
        nativeGetEnvironmentalHdrAmbientSphericalHarmonics(this.session.nativeWrapperHandle, this.nativeHandle, fArr);
        return fArr;
    }

    public float[] getEnvironmentalHdrMainLightDirection() {
        float[] fArr = new float[3];
        nativeGetEnvironmentalHdrMainLightDirection(this.session.nativeWrapperHandle, this.nativeHandle, fArr);
        return fArr;
    }

    public float[] getEnvironmentalHdrMainLightIntensity() {
        float[] fArr = new float[3];
        nativeGetEnvironmentalHdrMainLightIntensity(this.session.nativeWrapperHandle, this.nativeHandle, fArr);
        return fArr;
    }

    public float getPixelIntensity() {
        return nativeGetPixelIntensity(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public State getState() {
        return State.forNumber(nativeGetState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public long getTimestamp() {
        return nativeGetTimestamp(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public LightEstimate(Session session) {
        this.nativeHandle = 0L;
        this.session = session;
        this.nativeHandle = nativeCreateLightEstimate(session.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }
}
