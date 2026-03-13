package s6;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import v6.AbstractC6056k;
import v6.Z;

/* JADX INFO: renamed from: s6.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC5802u extends zzw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44174a;

    public AbstractBinderC5802u(byte[] bArr) {
        AbstractC6056k.a(bArr.length == 25);
        this.f44174a = Arrays.hashCode(bArr);
    }

    public static byte[] X(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public abstract byte[] K();

    @Override // v6.Z
    public final IObjectWrapper c() {
        return ObjectWrapper.wrap(K());
    }

    @Override // v6.Z
    public final int d() {
        return this.f44174a;
    }

    public final boolean equals(Object obj) {
        IObjectWrapper iObjectWrapperC;
        if (!(obj instanceof Z)) {
            return false;
        }
        try {
            Z z10 = (Z) obj;
            if (z10.d() == this.f44174a && (iObjectWrapperC = z10.c()) != null) {
                return Arrays.equals(K(), (byte[]) ObjectWrapper.unwrap(iObjectWrapperC));
            }
            return false;
        } catch (RemoteException e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            return false;
        }
    }

    public final int hashCode() {
        return this.f44174a;
    }
}
