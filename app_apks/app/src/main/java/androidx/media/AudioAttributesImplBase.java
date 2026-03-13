package androidx.media;

import androidx.media.AudioAttributesImpl;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23506d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements AudioAttributesImpl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23507a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f23508b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f23509c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f23510d = -1;

        @Override // androidx.media.AudioAttributesImpl.a
        public AudioAttributesImpl build() {
            return new AudioAttributesImplBase(this.f23508b, this.f23509c, this.f23507a, this.f23510d);
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(int i10) {
            if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                this.f23508b = i10;
                return this;
            }
            this.f23508b = 0;
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a c(int i10) {
            this.f23509c = (i10 & 1023) | this.f23509c;
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a a(int i10) {
            switch (i10) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    this.f23507a = i10;
                    break;
                case 16:
                    this.f23507a = 12;
                    break;
                default:
                    this.f23507a = 0;
                    break;
            }
            return this;
        }
    }

    public AudioAttributesImplBase() {
        this.f23503a = 0;
        this.f23504b = 0;
        this.f23505c = 0;
        this.f23506d = -1;
    }

    @Override // androidx.media.AudioAttributesImpl
    public Object a() {
        return null;
    }

    public int b() {
        return this.f23504b;
    }

    public int c() {
        int i10 = this.f23505c;
        int iD = d();
        if (iD == 6) {
            i10 |= 4;
        } else if (iD == 7) {
            i10 |= 1;
        }
        return i10 & 273;
    }

    public int d() {
        int i10 = this.f23506d;
        return i10 != -1 ? i10 : AudioAttributesCompat.b(false, this.f23505c, this.f23503a);
    }

    public int e() {
        return this.f23503a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f23504b == audioAttributesImplBase.b() && this.f23505c == audioAttributesImplBase.c() && this.f23503a == audioAttributesImplBase.e() && this.f23506d == audioAttributesImplBase.f23506d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f23504b), Integer.valueOf(this.f23505c), Integer.valueOf(this.f23503a), Integer.valueOf(this.f23506d)});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f23506d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f23506d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.d(this.f23503a));
        sb2.append(" content=");
        sb2.append(this.f23504b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f23505c).toUpperCase());
        return sb2.toString();
    }

    public AudioAttributesImplBase(int i10, int i11, int i12, int i13) {
        this.f23504b = i10;
        this.f23505c = i11;
        this.f23503a = i12;
        this.f23506d = i13;
    }
}
