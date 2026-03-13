package com.github.dart_lang.jni;

import Rd.C2123d0;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class PortContinuation<T> implements InterfaceC4988e {
    private final long port;

    static {
        System.loadLibrary("dartjni");
    }

    public PortContinuation(long j10) {
        this.port = j10;
    }

    private native void _resumeWith(long j10, Object obj);

    @Override // lc.InterfaceC4988e
    public InterfaceC4992i getContext() {
        return C2123d0.b();
    }

    @Override // lc.InterfaceC4988e
    public void resumeWith(Object obj) {
        _resumeWith(this.port, obj);
    }
}
