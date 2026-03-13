package M;

import M.h;
import com.google.ar.core.ImageMetadata;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i extends FilterOutputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f8854g = "Exif\u0000\u0000".getBytes(g.f8823e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f8855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f8856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteBuffer f8857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8860f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public static boolean a(short s10) {
            return (s10 < -64 || s10 > -49 || s10 == -60 || s10 == -56 || s10 == -52) ? false : true;
        }
    }

    public i(OutputStream outputStream, h hVar) {
        super(new BufferedOutputStream(outputStream, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE));
        this.f8856b = new byte[1];
        this.f8857c = ByteBuffer.allocate(4);
        this.f8858d = 0;
        this.f8855a = hVar;
    }

    public final int a(int i10, byte[] bArr, int i11, int i12) {
        int iMin = Math.min(i12, i10 - this.f8857c.position());
        this.f8857c.put(bArr, i11, iMin);
        return iMin;
    }

    public final void b(b bVar) throws IOException {
        j[][] jVarArr = h.f8837i;
        int[] iArr = new int[jVarArr.length];
        int[] iArr2 = new int[jVarArr.length];
        for (j jVar : h.f8835g) {
            for (int i10 = 0; i10 < h.f8837i.length; i10++) {
                this.f8855a.d(i10).remove(jVar.f8862b);
            }
        }
        if (!this.f8855a.d(1).isEmpty()) {
            this.f8855a.d(0).put(h.f8835g[1].f8862b, g.f(0L, this.f8855a.e()));
        }
        if (!this.f8855a.d(2).isEmpty()) {
            this.f8855a.d(0).put(h.f8835g[2].f8862b, g.f(0L, this.f8855a.e()));
        }
        if (!this.f8855a.d(3).isEmpty()) {
            this.f8855a.d(1).put(h.f8835g[3].f8862b, g.f(0L, this.f8855a.e()));
        }
        for (int i11 = 0; i11 < h.f8837i.length; i11++) {
            Iterator it = this.f8855a.d(i11).entrySet().iterator();
            int i12 = 0;
            while (it.hasNext()) {
                int iJ = ((g) ((Map.Entry) it.next()).getValue()).j();
                if (iJ > 4) {
                    i12 += iJ;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int size = 8;
        for (int i13 = 0; i13 < h.f8837i.length; i13++) {
            if (!this.f8855a.d(i13).isEmpty()) {
                iArr[i13] = size;
                size += (this.f8855a.d(i13).size() * 12) + 6 + iArr2[i13];
            }
        }
        int i14 = size + 8;
        if (!this.f8855a.d(1).isEmpty()) {
            this.f8855a.d(0).put(h.f8835g[1].f8862b, g.f(iArr[1], this.f8855a.e()));
        }
        if (!this.f8855a.d(2).isEmpty()) {
            this.f8855a.d(0).put(h.f8835g[2].f8862b, g.f(iArr[2], this.f8855a.e()));
        }
        if (!this.f8855a.d(3).isEmpty()) {
            this.f8855a.d(1).put(h.f8835g[3].f8862b, g.f(iArr[3], this.f8855a.e()));
        }
        bVar.g(i14);
        bVar.write(f8854g);
        bVar.d(this.f8855a.e() == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        bVar.a(this.f8855a.e());
        bVar.g(42);
        bVar.f(8L);
        for (int i15 = 0; i15 < h.f8837i.length; i15++) {
            if (!this.f8855a.d(i15).isEmpty()) {
                bVar.g(this.f8855a.d(i15).size());
                int size2 = iArr[i15] + 2 + (this.f8855a.d(i15).size() * 12) + 4;
                for (Map.Entry entry : this.f8855a.d(i15).entrySet()) {
                    int i16 = ((j) X0.h.h((j) ((HashMap) h.b.f8846f.get(i15)).get(entry.getKey()), "Tag not supported: " + ((String) entry.getKey()) + ". Tag needs to be ported from ExifInterface to ExifData.")).f8861a;
                    g gVar = (g) entry.getValue();
                    int iJ2 = gVar.j();
                    bVar.g(i16);
                    bVar.g(gVar.f8827a);
                    bVar.c(gVar.f8828b);
                    if (iJ2 > 4) {
                        bVar.f(size2);
                        size2 += iJ2;
                    } else {
                        bVar.write(gVar.f8830d);
                        if (iJ2 < 4) {
                            while (iJ2 < 4) {
                                bVar.b(0);
                                iJ2++;
                            }
                        }
                    }
                }
                bVar.f(0L);
                Iterator it2 = this.f8855a.d(i15).entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = ((g) ((Map.Entry) it2.next()).getValue()).f8830d;
                    if (bArr.length > 4) {
                        bVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        bVar.a(ByteOrder.BIG_ENDIAN);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (r9 <= 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010a, code lost:
    
        ((java.io.FilterOutputStream) r6).out.write(r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void write(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M.i.write(byte[], int, int):void");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f8856b;
        bArr[0] = (byte) (i10 & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
