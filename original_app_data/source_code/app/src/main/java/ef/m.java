package ef;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.Looper;
import ef.a;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class m implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f34042f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a.b f34044h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Runnable f34045i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioRecord f34037a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f34038b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f34039c = 0.0d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f34040d = 0.0d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f34043g = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k f34046j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FileOutputStream f34047k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Handler f34048l = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f34049m = {1, 10, 0, 0, 9, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 4};

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f34050a;

        public a(ArrayList arrayList) {
            this.f34050a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            m.this.f34046j.n(this.f34050a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f34052a;

        public b(byte[] bArr) {
            this.f34052a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            m.this.f34046j.m(this.f34052a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f34054a;

        public c(byte[] bArr) {
            this.f34054a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            m.this.f34046j.m(this.f34054a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f34056a;

        public d(ArrayList arrayList) {
            this.f34056a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            m.this.f34046j.o(this.f34056a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Integer f34058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Boolean f34059b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f34060c;

        public e(Integer num, Boolean bool, int i10) {
            this.f34058a = num;
            this.f34059b = bool;
            this.f34060c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (m.this.f34038b) {
                m mVar = m.this;
                mVar.m(mVar.f34044h, this.f34058a, this.f34059b, this.f34060c);
            }
        }
    }

    @Override // ef.n
    public double a() {
        if (this.f34041e > 0) {
            this.f34040d = this.f34039c;
            this.f34039c = 0.0d;
            this.f34041e = 0;
        }
        return this.f34040d;
    }

    @Override // ef.n
    public void b() throws IOException {
        AudioRecord audioRecord = this.f34037a;
        if (audioRecord != null) {
            try {
                audioRecord.stop();
            } catch (Exception unused) {
            }
            try {
                this.f34038b = false;
                this.f34037a.release();
            } catch (Exception unused2) {
            }
            this.f34037a = null;
        }
        g(this.f34042f);
    }

    @Override // ef.n
    public void c(Integer num, Boolean bool, Integer num2, Integer num3, Integer num4, a.b bVar, String str, int i10, k kVar) throws Exception {
        this.f34046j = kVar;
        this.f34044h = bVar;
        int i11 = num.intValue() == 1 ? 16 : 12;
        int i12 = this.f34049m[this.f34044h.ordinal()];
        int iMax = Math.max(AudioRecord.getMinBufferSize(num2.intValue(), i11, this.f34049m[this.f34044h.ordinal()]) * 2, num4.intValue());
        AudioRecord audioRecord = new AudioRecord(i10, num2.intValue(), i11, i12, iMax);
        this.f34037a = audioRecord;
        if (audioRecord.getState() != 1) {
            throw new Exception("Cannot initialize the AudioRecord");
        }
        this.f34037a.startRecording();
        this.f34038b = true;
        try {
            l(this.f34044h, num2.intValue(), num.intValue(), str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        e eVar = new e(num, bool, iMax);
        this.f34045i = eVar;
        this.f34048l.post(eVar);
    }

    @Override // ef.n
    public boolean d() {
        try {
            this.f34037a.startRecording();
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    @Override // ef.n
    public boolean e() {
        try {
            this.f34037a.stop();
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public void g(String str) throws IOException {
        FileOutputStream fileOutputStream = this.f34047k;
        if (fileOutputStream != null) {
            fileOutputStream.close();
            if (this.f34044h == a.b.pcm16WAV) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.f34042f, "rw");
                randomAccessFile.seek(4L);
                int i10 = this.f34043g + 36;
                randomAccessFile.write(i10);
                randomAccessFile.write(i10 >> 8);
                randomAccessFile.write(i10 >> 16);
                randomAccessFile.write(i10 >> 24);
                randomAccessFile.seek(40L);
                randomAccessFile.write(this.f34043g);
                randomAccessFile.write(this.f34043g >> 8);
                randomAccessFile.write(this.f34043g >> 16);
                randomAccessFile.write(this.f34043g >> 24);
                randomAccessFile.close();
            }
        }
    }

    public void h(ByteBuffer byteBuffer) {
        byte[] bArrArray = byteBuffer.array();
        int length = bArrArray.length;
        for (int i10 = 0; i10 < length / 2; i10++) {
            int i11 = i10 * 2;
            double dAbs = Math.abs((int) j(bArrArray[i11], bArrArray[i11 + 1]));
            if (dAbs > this.f34039c) {
                this.f34039c = dAbs;
            }
        }
        this.f34041e++;
    }

    public void i(float[] fArr) {
        int length = fArr.length;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < length / 2; i10++) {
            float fAbs = Math.abs(fArr[i10]);
            if (fAbs > f10) {
                f10 = fAbs;
            }
        }
        double d10 = f10 * 32767.0f;
        if (d10 > this.f34039c) {
            this.f34039c = d10;
        }
        this.f34041e++;
    }

    public final short j(byte b10, byte b11) {
        return (short) ((b11 << 8) | b10);
    }

    public ArrayList k(Integer num, byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        for (int i10 = 0; i10 < num.intValue(); i10++) {
            int iIntValue = length / num.intValue();
            byte[] bArr2 = new byte[iIntValue];
            for (int i11 = 0; i11 < iIntValue / 2; i11++) {
                int iIntValue2 = ((num.intValue() * i11) + i10) * 2;
                int i12 = i11 * 2;
                bArr2[i12] = bArr[iIntValue2];
                bArr2[i12 + 1] = bArr[iIntValue2 + 1];
            }
            arrayList.add(bArr2);
        }
        return arrayList;
    }

    public final void l(a.b bVar, int i10, int i11, String str) throws IOException {
        System.out.println("---> writeAudioDataToFile");
        this.f34043g = 0;
        this.f34047k = null;
        this.f34042f = str;
        if (str != null) {
            this.f34047k = new FileOutputStream(this.f34042f);
            if (bVar == a.b.pcm16WAV) {
                new p((short) 1, (short) i11, i10, (short) 16, 100000).a(this.f34047k);
            }
        }
        System.out.println("<--- writeAudioDataToFile");
    }

    public int m(a.b bVar, Integer num, Boolean bool, int i10) {
        while (this.f34038b) {
            try {
                int iN = (bVar == a.b.pcm16 || bVar == a.b.pcm16WAV) ? n(bVar, num, bool, i10) : bool.booleanValue() ? p(bVar, num, bool, i10) : o(bVar, num, bool, i10);
                if (this.f34038b) {
                    this.f34048l.post(this.f34045i);
                }
                if (iN == 0) {
                    return 1;
                }
            } catch (Exception e10) {
                System.out.println(e10);
                return 1;
            }
        }
        return 1;
    }

    public int n(a.b bVar, Integer num, Boolean bool, int i10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
        int i11 = this.f34037a.read(byteBufferAllocate.array(), 0, i10, 1);
        if (i11 == 0) {
            return 0;
        }
        if (bool.booleanValue()) {
            this.f34048l.post(new c(Arrays.copyOfRange(byteBufferAllocate.array(), 0, i11)));
        } else {
            this.f34048l.post(new d(k(num, Arrays.copyOfRange(byteBufferAllocate.array(), 0, i11))));
        }
        h(byteBufferAllocate);
        return i11;
    }

    public int o(a.b bVar, Integer num, Boolean bool, int i10) {
        int i11 = i10 / 4;
        FloatBuffer floatBufferAllocate = FloatBuffer.allocate(i11);
        int i12 = this.f34037a.read(floatBufferAllocate.array(), 0, i11, 1);
        if (i12 > 0) {
            this.f34043g += i12;
            ArrayList arrayList = new ArrayList();
            for (int i13 = 0; i13 < num.intValue(); i13++) {
                int iIntValue = i12 / num.intValue();
                FloatBuffer floatBufferAllocate2 = FloatBuffer.allocate(iIntValue);
                for (int i14 = 0; i14 < iIntValue; i14++) {
                    floatBufferAllocate2.array()[i14] = floatBufferAllocate.array()[(num.intValue() * i14) + i13];
                }
                arrayList.add(floatBufferAllocate2.array());
            }
            this.f34048l.post(new a(arrayList));
            i(floatBufferAllocate.array());
        }
        return i12;
    }

    public int p(a.b bVar, Integer num, Boolean bool, int i10) {
        int i11 = i10 / 4;
        FloatBuffer floatBufferAllocate = FloatBuffer.allocate(i11);
        int i12 = this.f34037a.read(floatBufferAllocate.array(), 0, i11, 1) * 4;
        if (i12 > 0) {
            this.f34043g += i12;
            if (!bool.booleanValue()) {
                FloatBuffer floatBufferAllocate2 = FloatBuffer.allocate(i11);
                int iIntValue = i12 / num.intValue();
                for (int i13 = 0; i13 < num.intValue(); i13++) {
                    int iIntValue2 = i12 / (num.intValue() * 4);
                    for (int i14 = 0; i14 < iIntValue2; i14++) {
                        floatBufferAllocate2.array()[(i13 * iIntValue2) + i14] = floatBufferAllocate.array()[(num.intValue() * i14) + i13];
                    }
                }
                floatBufferAllocate = floatBufferAllocate2;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
            byteBufferAllocate.rewind();
            byteBufferAllocate.order(ByteOrder.nativeOrder());
            floatBufferAllocate.rewind();
            byteBufferAllocate.rewind();
            byteBufferAllocate.asFloatBuffer().put(floatBufferAllocate);
            this.f34048l.post(new b(Arrays.copyOfRange(byteBufferAllocate.array(), 0, i12)));
            i(floatBufferAllocate.array());
        }
        return i12;
    }
}
