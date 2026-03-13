package org.apache.tika.fork;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class InputStreamProxy extends InputStream implements ForkProxy {
    private static final long serialVersionUID = 4350939227765568438L;
    private transient DataInputStream input;
    private transient DataOutputStream output;
    private final int resource;

    public InputStreamProxy(int i10) {
        this.resource = i10;
    }

    @Override // org.apache.tika.fork.ForkProxy
    public void init(DataInputStream dataInputStream, DataOutputStream dataOutputStream) {
        this.input = dataInputStream;
        this.output = dataOutputStream;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        this.output.writeByte(3);
        this.output.writeByte(this.resource);
        this.output.writeInt(1);
        this.output.flush();
        int i10 = this.input.readInt();
        return i10 == 1 ? this.input.readUnsignedByte() : i10;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        this.output.writeByte(3);
        this.output.writeByte(this.resource);
        this.output.writeInt(i11);
        this.output.flush();
        int i12 = this.input.readInt();
        if (i12 > 0) {
            this.input.readFully(bArr, i10, i12);
        }
        return i12;
    }
}
