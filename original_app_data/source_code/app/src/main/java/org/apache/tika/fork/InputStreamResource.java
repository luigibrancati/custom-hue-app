package org.apache.tika.fork;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class InputStreamResource implements ForkResource {
    private final InputStream stream;

    public InputStreamResource(InputStream inputStream) {
        this.stream = inputStream;
    }

    @Override // org.apache.tika.fork.ForkResource
    public Throwable process(DataInputStream dataInputStream, DataOutputStream dataOutputStream) throws IOException {
        int i10;
        byte[] bArr = new byte[dataInputStream.readInt()];
        try {
            i10 = this.stream.read(bArr);
        } catch (IOException e10) {
            e10.printStackTrace();
            i10 = -1;
        }
        dataOutputStream.writeInt(i10);
        if (i10 > 0) {
            dataOutputStream.write(bArr, 0, i10);
        }
        dataOutputStream.flush();
        return null;
    }
}
