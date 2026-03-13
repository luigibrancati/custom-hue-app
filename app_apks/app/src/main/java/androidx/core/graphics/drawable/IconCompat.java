package androidx.core.graphics.drawable;

import X0.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f22665k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f22667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f22668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f22669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f22672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f22673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f22674i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f22675j;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static IconCompat a(Object obj) {
            h.g(obj);
            int iD = d(obj);
            if (iD == 2) {
                return IconCompat.k(null, c(obj), b(obj));
            }
            if (iD == 4) {
                return IconCompat.g(e(obj));
            }
            if (iD == 6) {
                return IconCompat.d(e(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f22667b = obj;
            return iconCompat;
        }

        public static int b(Object obj) {
            return c.a(obj);
        }

        public static String c(Object obj) {
            return c.b(obj);
        }

        public static int d(Object obj) {
            return c.c(obj);
        }

        public static Uri e(Object obj) {
            return c.d(obj);
        }

        public static Icon f(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f22666a) {
                case -1:
                    return (Icon) iconCompat.f22667b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f22667b);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.m(), iconCompat.f22670e);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f22667b, iconCompat.f22670e, iconCompat.f22671f);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f22667b);
                    break;
                case 5:
                    iconCreateWithBitmap = b.a((Bitmap) iconCompat.f22667b);
                    break;
                case 6:
                    iconCreateWithBitmap = d.a(iconCompat.o());
                    break;
            }
            ColorStateList colorStateList = iconCompat.f22672g;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f22673h;
            if (mode != IconCompat.f22665k) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {
        public static Icon a(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d {
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f22666a = -1;
        this.f22668c = null;
        this.f22669d = null;
        this.f22670e = 0;
        this.f22671f = 0;
        this.f22672g = null;
        this.f22673h = f22665k;
        this.f22674i = null;
    }

    public static IconCompat b(Bundle bundle) {
        int i10 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i10);
        iconCompat.f22670e = bundle.getInt("int1");
        iconCompat.f22671f = bundle.getInt("int2");
        iconCompat.f22675j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f22672g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f22673h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i10) {
            case -1:
            case 1:
            case 5:
                iconCompat.f22667b = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                Log.w("IconCompat", "Unknown type " + i10);
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.f22667b = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.f22667b = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    public static IconCompat c(Icon icon) {
        return a.a(icon);
    }

    public static IconCompat d(Uri uri) {
        X0.c.c(uri);
        return e(uri.toString());
    }

    public static IconCompat e(String str) {
        X0.c.c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f22667b = str;
        return iconCompat;
    }

    public static IconCompat f(Bitmap bitmap) {
        X0.c.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f22667b = bitmap;
        return iconCompat;
    }

    public static IconCompat g(Uri uri) {
        X0.c.c(uri);
        return h(uri.toString());
    }

    public static IconCompat h(String str) {
        X0.c.c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f22667b = str;
        return iconCompat;
    }

    public static IconCompat i(byte[] bArr, int i10, int i11) {
        X0.c.c(bArr);
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.f22667b = bArr;
        iconCompat.f22670e = i10;
        iconCompat.f22671f = i11;
        return iconCompat;
    }

    public static IconCompat j(Context context, int i10) {
        X0.c.c(context);
        return k(context.getResources(), context.getPackageName(), i10);
    }

    public static IconCompat k(Resources resources, String str, int i10) {
        X0.c.c(str);
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f22670e = i10;
        if (resources != null) {
            try {
                iconCompat.f22667b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f22667b = str;
        }
        iconCompat.f22675j = str;
        return iconCompat;
    }

    public static String u(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public int l() {
        int i10 = this.f22666a;
        if (i10 == -1) {
            return a.b(this.f22667b);
        }
        if (i10 == 2) {
            return this.f22670e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String m() {
        int i10 = this.f22666a;
        if (i10 == -1) {
            return a.c(this.f22667b);
        }
        if (i10 == 2) {
            String str = this.f22675j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f22667b).split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, -1)[0] : this.f22675j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int n() {
        int i10 = this.f22666a;
        return i10 == -1 ? a.d(this.f22667b) : i10;
    }

    public Uri o() {
        int i10 = this.f22666a;
        if (i10 == -1) {
            return a.e(this.f22667b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f22667b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public void p() {
        this.f22673h = PorterDuff.Mode.valueOf(this.f22674i);
        switch (this.f22666a) {
            case -1:
                Parcelable parcelable = this.f22669d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f22667b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f22669d;
                if (parcelable2 != null) {
                    this.f22667b = parcelable2;
                    return;
                }
                byte[] bArr = this.f22668c;
                this.f22667b = bArr;
                this.f22666a = 3;
                this.f22670e = 0;
                this.f22671f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f22668c, Charset.forName("UTF-16"));
                this.f22667b = str;
                if (this.f22666a == 2 && this.f22675j == null) {
                    this.f22675j = str.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, -1)[0];
                    return;
                }
                return;
            case 3:
                this.f22667b = this.f22668c;
                return;
        }
    }

    public void q(boolean z10) {
        this.f22674i = this.f22673h.name();
        switch (this.f22666a) {
            case -1:
                if (z10) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f22669d = (Parcelable) this.f22667b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z10) {
                    this.f22669d = (Parcelable) this.f22667b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f22667b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f22668c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f22668c = ((String) this.f22667b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f22668c = (byte[]) this.f22667b;
                return;
            case 4:
            case 6:
                this.f22668c = this.f22667b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    public Bundle r() {
        Bundle bundle = new Bundle();
        switch (this.f22666a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f22667b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f22667b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f22667b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f22667b);
                break;
        }
        bundle.putInt("type", this.f22666a);
        bundle.putInt("int1", this.f22670e);
        bundle.putInt("int2", this.f22671f);
        bundle.putString("string1", this.f22675j);
        ColorStateList colorStateList = this.f22672g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f22673h;
        if (mode != f22665k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    public Icon s() {
        return t(null);
    }

    public Icon t(Context context) {
        return a.f(this, context);
    }

    public String toString() {
        if (this.f22666a == -1) {
            return String.valueOf(this.f22667b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(u(this.f22666a));
        switch (this.f22666a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f22667b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f22667b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f22675j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(l())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f22670e);
                if (this.f22671f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f22671f);
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f22667b);
                break;
        }
        if (this.f22672g != null) {
            sb2.append(" tint=");
            sb2.append(this.f22672g);
        }
        if (this.f22673h != f22665k) {
            sb2.append(" mode=");
            sb2.append(this.f22673h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i10) {
        this.f22668c = null;
        this.f22669d = null;
        this.f22670e = 0;
        this.f22671f = 0;
        this.f22672g = null;
        this.f22673h = f22665k;
        this.f22674i = null;
        this.f22666a = i10;
    }
}
