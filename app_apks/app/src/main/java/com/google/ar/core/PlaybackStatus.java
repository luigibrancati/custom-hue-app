package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public enum PlaybackStatus {
    NONE(0),
    OK(1),
    IO_ERROR(2),
    FINISHED(3);

    final int nativeCode;

    PlaybackStatus(int i10) {
        this.nativeCode = i10;
    }

    public static PlaybackStatus forNumber(int i10) {
        for (PlaybackStatus playbackStatus : values()) {
            if (playbackStatus.nativeCode == i10) {
                return playbackStatus;
            }
        }
        throw new FatalException(p.b((byte) 50, i10, "Unexpected value for native PlaybackStatus, value="));
    }
}
