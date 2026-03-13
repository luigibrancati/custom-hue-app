package org.apache.tika.fork;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class ClassLoaderResource implements ForkResource {
    private final ClassLoader loader;

    public ClassLoaderResource(ClassLoader classLoader) {
        this.loader = classLoader;
    }

    private void writeAndCloseStream(DataOutputStream dataOutputStream, InputStream inputStream) throws IOException {
        try {
            byte[] bArr = new byte[65535];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    dataOutputStream.writeShort(0);
                    inputStream.close();
                    return;
                } else {
                    dataOutputStream.writeShort(i10);
                    dataOutputStream.write(bArr, 0, i10);
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    @Override // org.apache.tika.fork.ForkResource
    public Throwable process(DataInputStream dataInputStream, DataOutputStream dataOutputStream) throws IOException {
        byte b10 = dataInputStream.readByte();
        String utf = dataInputStream.readUTF();
        if (b10 == 1) {
            InputStream resourceAsStream = this.loader.getResourceAsStream(utf);
            if (resourceAsStream != null) {
                dataOutputStream.writeBoolean(true);
                writeAndCloseStream(dataOutputStream, resourceAsStream);
            } else {
                dataOutputStream.writeBoolean(false);
            }
        } else if (b10 == 2) {
            Enumeration<URL> resources = this.loader.getResources(utf);
            while (resources.hasMoreElements()) {
                dataOutputStream.writeBoolean(true);
                writeAndCloseStream(dataOutputStream, FirebasePerfUrlConnection.openStream(resources.nextElement()));
            }
            dataOutputStream.writeBoolean(false);
        }
        dataOutputStream.flush();
        return null;
    }
}
