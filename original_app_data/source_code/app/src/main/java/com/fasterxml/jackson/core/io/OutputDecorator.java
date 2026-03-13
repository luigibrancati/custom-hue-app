package com.fasterxml.jackson.core.io;

import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class OutputDecorator implements Serializable {
    public abstract OutputStream decorate(IOContext iOContext, OutputStream outputStream);

    public abstract Writer decorate(IOContext iOContext, Writer writer);
}
