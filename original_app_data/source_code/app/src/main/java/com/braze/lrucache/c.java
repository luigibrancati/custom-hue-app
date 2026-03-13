package com.braze.lrucache;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c extends FilterOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f27797a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, FileOutputStream fileOutputStream) {
        super(fileOutputStream);
        this.f27797a = dVar;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            ((FilterOutputStream) this).out.close();
        } catch (IOException unused) {
            this.f27797a.f27800c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() {
        try {
            ((FilterOutputStream) this).out.flush();
        } catch (IOException unused) {
            this.f27797a.f27800c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i10) {
        try {
            ((FilterOutputStream) this).out.write(i10);
        } catch (IOException unused) {
            this.f27797a.f27800c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        try {
            ((FilterOutputStream) this).out.write(bArr, i10, i11);
        } catch (IOException unused) {
            this.f27797a.f27800c = true;
        }
    }
}
