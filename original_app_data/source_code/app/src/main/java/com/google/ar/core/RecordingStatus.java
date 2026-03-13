package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public enum RecordingStatus {
    NONE(0),
    OK(1),
    IO_ERROR(2);

    final int nativeCode;

    RecordingStatus(int i10) {
        this.nativeCode = i10;
    }

    public static RecordingStatus forNumber(int i10) {
        for (RecordingStatus recordingStatus : values()) {
            if (recordingStatus.nativeCode == i10) {
                return recordingStatus;
            }
        }
        throw new FatalException(p.b((byte) 51, i10, "Unexpected value for native RecordingStatus, value="));
    }
}
