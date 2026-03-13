package com.fasterxml.jackson.core.io;

import java.io.DataInput;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class InputDecorator implements Serializable {
    private static final long serialVersionUID = 1;

    public DataInput decorate(IOContext iOContext, DataInput dataInput) {
        throw new UnsupportedOperationException();
    }

    public abstract InputStream decorate(IOContext iOContext, InputStream inputStream);

    public abstract InputStream decorate(IOContext iOContext, byte[] bArr, int i10, int i11);

    public abstract Reader decorate(IOContext iOContext, Reader reader);
}
