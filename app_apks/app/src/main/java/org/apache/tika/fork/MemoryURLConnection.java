package org.apache.tika.fork;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class MemoryURLConnection extends URLConnection {
    private final byte[] data;

    public MemoryURLConnection(URL url, byte[] bArr) {
        super(url);
        this.data = bArr;
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        return new ByteArrayInputStream(this.data);
    }

    @Override // java.net.URLConnection
    public void connect() {
    }
}
