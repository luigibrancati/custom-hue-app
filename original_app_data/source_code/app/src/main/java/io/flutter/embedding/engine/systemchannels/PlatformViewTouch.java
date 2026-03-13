package io.flutter.embedding.engine.systemchannels;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class PlatformViewTouch {
    public final int action;
    public final int buttonState;
    public final int deviceId;
    public final Number downTime;
    public final int edgeFlags;
    public final Number eventTime;
    public final int flags;
    public final int metaState;
    public final long motionEventId;
    public final int pointerCount;
    public final Object rawPointerCoords;
    public final Object rawPointerPropertiesList;
    public final int source;
    public final int viewId;
    public final float xPrecision;
    public final float yPrecision;

    public PlatformViewTouch(int i10, Number number, Number number2, int i11, int i12, Object obj, Object obj2, int i13, int i14, float f10, float f11, int i15, int i16, int i17, int i18, long j10) {
        this.viewId = i10;
        this.downTime = number;
        this.eventTime = number2;
        this.action = i11;
        this.pointerCount = i12;
        this.rawPointerPropertiesList = obj;
        this.rawPointerCoords = obj2;
        this.metaState = i13;
        this.buttonState = i14;
        this.xPrecision = f10;
        this.yPrecision = f11;
        this.deviceId = i15;
        this.edgeFlags = i16;
        this.source = i17;
        this.flags = i18;
        this.motionEventId = j10;
    }
}
