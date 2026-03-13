package g1;

import android.os.Parcel;
import android.os.Process;
import android.util.Log;
import fc.C4022e;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: g1.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4107q {
    public static final boolean a(Throwable th) {
        AbstractC4862t.e(th, "<this>");
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            AbstractC4862t.d(method, "getMethod(...)");
            Object objInvoke = method.invoke(null, "sys.user." + b() + ".ce_available", "false");
            AbstractC4862t.c(objInvoke, "null cannot be cast to non-null type kotlin.String");
            return AbstractC4862t.a((String) objInvoke, "true");
        } catch (Throwable th2) {
            C4022e.a(th, th2);
            return false;
        }
    }

    public static final int b() {
        try {
            Parcel parcelObtain = Parcel.obtain();
            AbstractC4862t.d(parcelObtain, "obtain(...)");
            Process.myUserHandle().writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            return parcelObtain.readInt();
        } catch (Throwable unused) {
            Log.d("DirectBootExceptionUtil", "Error when reading current user id. Selected default user id `0`.");
            return 0;
        }
    }

    public static final Exception c(String str, Exception exception) {
        AbstractC4862t.e(exception, "exception");
        if (a(exception) || str == null) {
            return exception;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return exception;
        } catch (IOException unused) {
            return new C4108r(exception);
        } finally {
            file.delete();
        }
    }
}
