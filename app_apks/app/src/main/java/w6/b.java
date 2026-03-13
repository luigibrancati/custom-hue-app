package w6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            int iDataPosition = parcel.dataPosition();
            int iDataSize = parcel.dataSize();
            int length = String.valueOf(str).length();
            StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(iDataPosition).length() + 6 + String.valueOf(iDataSize).length());
            sb2.append(str);
            sb2.append(" Parcel: pos=");
            sb2.append(iDataPosition);
            sb2.append(" size=");
            sb2.append(iDataSize);
            super(sb2.toString());
        }
    }

    public static Long A(Parcel parcel, int i10) {
        int iC = C(parcel, i10);
        if (iC == 0) {
            return null;
        }
        G(parcel, i10, iC, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static short B(Parcel parcel, int i10) {
        F(parcel, i10, 4);
        return (short) parcel.readInt();
    }

    public static int C(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void D(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + C(parcel, i10));
    }

    public static int E(Parcel parcel) {
        int iU = u(parcel);
        int iC = C(parcel, iU);
        int iM = m(iU);
        int iDataPosition = parcel.dataPosition();
        if (iM != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(iU))), parcel);
        }
        int i10 = iC + iDataPosition;
        if (i10 >= iDataPosition && i10 <= parcel.dataSize()) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i10).length());
        sb2.append("Size read is invalid start=");
        sb2.append(iDataPosition);
        sb2.append(" end=");
        sb2.append(i10);
        throw new a(sb2.toString(), parcel);
    }

    public static void F(Parcel parcel, int i10, int i11) {
        int iC = C(parcel, i10);
        if (iC == i11) {
            return;
        }
        String hexString = Integer.toHexString(iC);
        int length = String.valueOf(i11).length();
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(iC).length() + 4 + String.valueOf(hexString).length() + 1);
        sb2.append("Expected size ");
        sb2.append(i11);
        sb2.append(" got ");
        sb2.append(iC);
        sb2.append(" (0x");
        sb2.append(hexString);
        sb2.append(")");
        throw new a(sb2.toString(), parcel);
    }

    public static void G(Parcel parcel, int i10, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        String hexString = Integer.toHexString(i11);
        int length = String.valueOf(i12).length();
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(i11).length() + 4 + String.valueOf(hexString).length() + 1);
        sb2.append("Expected size ");
        sb2.append(i12);
        sb2.append(" got ");
        sb2.append(i11);
        sb2.append(" (0x");
        sb2.append(hexString);
        sb2.append(")");
        throw new a(sb2.toString(), parcel);
    }

    public static Bundle a(Parcel parcel, int i10) {
        int iC = C(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iC);
        return bundle;
    }

    public static byte[] b(Parcel parcel, int i10) {
        int iC = C(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iC);
        return bArrCreateByteArray;
    }

    public static float[] c(Parcel parcel, int i10) {
        int iC = C(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        float[] fArrCreateFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(iDataPosition + iC);
        return fArrCreateFloatArray;
    }

    public static int[] d(Parcel parcel, int i10) {
        int iC = C(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iC);
        return iArrCreateIntArray;
    }

    public static ArrayList e(Parcel parcel, int i10) {
        int iC = C(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iC);
        return arrayList;
    }

    public static Parcelable f(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iC = C(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iC);
        return parcelable;
    }

    public static String g(Parcel parcel, int i10) {
        int iC = C(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iC);
        return string;
    }

    public static String[] h(Parcel parcel, int i10) {
        int iC = C(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iC);
        return strArrCreateStringArray;
    }

    public static ArrayList i(Parcel parcel, int i10) {
        int iC = C(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iC);
        return arrayListCreateStringArrayList;
    }

    public static Object[] j(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iC = C(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iC);
        return objArrCreateTypedArray;
    }

    public static ArrayList k(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iC = C(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iC);
        return arrayListCreateTypedArrayList;
    }

    public static void l(Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 26);
        sb2.append("Overread allowed size end=");
        sb2.append(i10);
        throw new a(sb2.toString(), parcel);
    }

    public static int m(int i10) {
        return (char) i10;
    }

    public static boolean n(Parcel parcel, int i10) {
        F(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean o(Parcel parcel, int i10) {
        int iC = C(parcel, i10);
        if (iC == 0) {
            return null;
        }
        G(parcel, i10, iC, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static byte p(Parcel parcel, int i10) {
        F(parcel, i10, 4);
        return (byte) parcel.readInt();
    }

    public static double q(Parcel parcel, int i10) {
        F(parcel, i10, 8);
        return parcel.readDouble();
    }

    public static Double r(Parcel parcel, int i10) {
        int iC = C(parcel, i10);
        if (iC == 0) {
            return null;
        }
        G(parcel, i10, iC, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float s(Parcel parcel, int i10) {
        F(parcel, i10, 4);
        return parcel.readFloat();
    }

    public static Float t(Parcel parcel, int i10) {
        int iC = C(parcel, i10);
        if (iC == 0) {
            return null;
        }
        G(parcel, i10, iC, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int u(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder v(Parcel parcel, int i10) {
        int iC = C(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iC);
        return strongBinder;
    }

    public static int w(Parcel parcel, int i10) {
        F(parcel, i10, 4);
        return parcel.readInt();
    }

    public static Integer x(Parcel parcel, int i10) {
        int iC = C(parcel, i10);
        if (iC == 0) {
            return null;
        }
        G(parcel, i10, iC, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static void y(Parcel parcel, int i10, List list, ClassLoader classLoader) {
        int iC = C(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return;
        }
        parcel.readList(list, classLoader);
        parcel.setDataPosition(iDataPosition + iC);
    }

    public static long z(Parcel parcel, int i10) {
        F(parcel, i10, 8);
        return parcel.readLong();
    }
}
