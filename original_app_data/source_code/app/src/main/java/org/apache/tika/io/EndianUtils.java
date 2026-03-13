package org.apache.tika.io;

import io.flutter.embedding.android.KeyboardMap;
import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.exception.TikaException;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class EndianUtils {
    private static final int LONG_SIZE = 8;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class BufferUnderrunException extends TikaException {
        private static final long serialVersionUID = 8358288231138076276L;

        public BufferUnderrunException() {
            super("Insufficient data left in stream for required read");
        }
    }

    public static int getIntBE(byte[] bArr) {
        return getIntBE(bArr, 0);
    }

    public static int getIntLE(byte[] bArr) {
        return getIntLE(bArr, 0);
    }

    public static long getLongLE(byte[] bArr, int i10) {
        long j10 = 0;
        for (int i11 = i10 + 7; i11 >= i10; i11--) {
            j10 = (j10 << 8) | ((long) (bArr[i11] & ForkServer.ERROR));
        }
        return j10;
    }

    public static short getShortBE(byte[] bArr) {
        return getShortBE(bArr, 0);
    }

    public static short getShortLE(byte[] bArr) {
        return getShortLE(bArr, 0);
    }

    public static short getUByte(byte[] bArr, int i10) {
        return (short) (bArr[i10] & ForkServer.ERROR);
    }

    public static long getUIntBE(byte[] bArr) {
        return getUIntBE(bArr, 0);
    }

    public static long getUIntLE(byte[] bArr) {
        return getUIntLE(bArr, 0);
    }

    public static int getUShortBE(byte[] bArr) {
        return getUShortBE(bArr, 0);
    }

    public static int getUShortLE(byte[] bArr) {
        return getUShortLE(bArr, 0);
    }

    public static int readIntBE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i10 = inputStream.read();
        int i11 = inputStream.read();
        int i12 = inputStream.read();
        int i13 = inputStream.read();
        if ((i10 | i11 | i12 | i13) >= 0) {
            return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
        }
        throw new BufferUnderrunException();
    }

    public static int readIntLE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i10 = inputStream.read();
        int i11 = inputStream.read();
        int i12 = inputStream.read();
        int i13 = inputStream.read();
        if ((i10 | i11 | i12 | i13) >= 0) {
            return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
        }
        throw new BufferUnderrunException();
    }

    public static int readIntME(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i10 = inputStream.read();
        int i11 = inputStream.read();
        int i12 = inputStream.read();
        int i13 = inputStream.read();
        if ((i10 | i11 | i12 | i13) >= 0) {
            return (i11 << 24) + (i10 << 16) + (i13 << 8) + i12;
        }
        throw new BufferUnderrunException();
    }

    public static long readLongBE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i10 = inputStream.read();
        int i11 = inputStream.read();
        int i12 = inputStream.read();
        int i13 = inputStream.read();
        int i14 = inputStream.read();
        int i15 = inputStream.read();
        int i16 = inputStream.read();
        int i17 = inputStream.read();
        if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) >= 0) {
            return (((long) i10) << 56) + (((long) i11) << 48) + (((long) i12) << 40) + (((long) i13) << 32) + (((long) i14) << 24) + ((long) (i15 << 16)) + ((long) (i16 << 8)) + ((long) i17);
        }
        throw new BufferUnderrunException();
    }

    public static long readLongLE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i10 = inputStream.read();
        int i11 = inputStream.read();
        int i12 = inputStream.read();
        int i13 = inputStream.read();
        int i14 = inputStream.read();
        int i15 = inputStream.read();
        int i16 = inputStream.read();
        int i17 = inputStream.read();
        if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) >= 0) {
            return (((long) i17) << 56) + (((long) i16) << 48) + (((long) i15) << 40) + (((long) i14) << 32) + (((long) i13) << 24) + ((long) (i12 << 16)) + ((long) (i11 << 8)) + ((long) i10);
        }
        throw new BufferUnderrunException();
    }

    public static short readShortBE(InputStream inputStream) {
        return (short) readUShortBE(inputStream);
    }

    public static short readShortLE(InputStream inputStream) {
        return (short) readUShortLE(inputStream);
    }

    public static long readUE7(InputStream inputStream) throws IOException {
        int i10;
        long j10 = 0;
        int i11 = 0;
        while (true) {
            i10 = inputStream.read();
            if (i10 < 0) {
                break;
            }
            int i12 = i11 + 1;
            if (i11 >= 6) {
                break;
            }
            long j11 = j10 << 7;
            if ((i10 & 128) != 128) {
                j10 = j11 + ((long) i10);
                break;
            }
            j10 = j11 + ((long) (i10 & 127));
            i11 = i12;
        }
        if (i10 >= 0) {
            return j10;
        }
        throw new IOException("Buffer underun; expected one more byte");
    }

    public static long readUIntBE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i10 = inputStream.read();
        int i11 = inputStream.read();
        int i12 = inputStream.read();
        int i13 = inputStream.read();
        if ((i10 | i11 | i12 | i13) >= 0) {
            return ((long) ((i10 << 24) + (i11 << 16) + (i12 << 8) + i13)) & KeyboardMap.kValueMask;
        }
        throw new BufferUnderrunException();
    }

    public static long readUIntLE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i10 = inputStream.read();
        int i11 = inputStream.read();
        int i12 = inputStream.read();
        int i13 = inputStream.read();
        if ((i10 | i11 | i12 | i13) >= 0) {
            return ((long) ((i13 << 24) + (i12 << 16) + (i11 << 8) + i10)) & KeyboardMap.kValueMask;
        }
        throw new BufferUnderrunException();
    }

    public static int readUShortBE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i10 = inputStream.read();
        int i11 = inputStream.read();
        if ((i10 | i11) >= 0) {
            return (i10 << 8) + i11;
        }
        throw new BufferUnderrunException();
    }

    public static int readUShortLE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i10 = inputStream.read();
        int i11 = inputStream.read();
        if ((i10 | i11) >= 0) {
            return (i11 << 8) + i10;
        }
        throw new BufferUnderrunException();
    }

    public static int ubyteToInt(byte b10) {
        return b10 & ForkServer.ERROR;
    }

    public static int getIntBE(byte[] bArr, int i10) {
        int i11 = bArr[i10] & ForkServer.ERROR;
        int i12 = bArr[i10 + 1] & ForkServer.ERROR;
        int i13 = bArr[i10 + 2] & ForkServer.ERROR;
        return (i11 << 24) + (i12 << 16) + (i13 << 8) + (bArr[i10 + 3] & ForkServer.ERROR);
    }

    public static int getIntLE(byte[] bArr, int i10) {
        int i11 = bArr[i10] & ForkServer.ERROR;
        int i12 = bArr[i10 + 1] & ForkServer.ERROR;
        return ((bArr[i10 + 3] & ForkServer.ERROR) << 24) + ((bArr[i10 + 2] & ForkServer.ERROR) << 16) + (i12 << 8) + i11;
    }

    public static short getShortBE(byte[] bArr, int i10) {
        return (short) getUShortBE(bArr, i10);
    }

    public static short getShortLE(byte[] bArr, int i10) {
        return (short) getUShortLE(bArr, i10);
    }

    public static long getUIntBE(byte[] bArr, int i10) {
        return ((long) getIntBE(bArr, i10)) & KeyboardMap.kValueMask;
    }

    public static long getUIntLE(byte[] bArr, int i10) {
        return ((long) getIntLE(bArr, i10)) & KeyboardMap.kValueMask;
    }

    public static int getUShortBE(byte[] bArr, int i10) {
        int i11 = bArr[i10] & ForkServer.ERROR;
        return (i11 << 8) + (bArr[i10 + 1] & ForkServer.ERROR);
    }

    public static int getUShortLE(byte[] bArr, int i10) {
        return ((bArr[i10 + 1] & ForkServer.ERROR) << 8) + (bArr[i10] & ForkServer.ERROR);
    }
}
