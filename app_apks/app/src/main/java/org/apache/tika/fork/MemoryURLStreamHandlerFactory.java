package org.apache.tika.fork;

import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class MemoryURLStreamHandlerFactory implements URLStreamHandlerFactory {
    @Override // java.net.URLStreamHandlerFactory
    public URLStreamHandler createURLStreamHandler(String str) {
        if ("tika-in-memory".equals(str)) {
            return new MemoryURLStreamHandler();
        }
        return null;
    }
}
