package Q3;

import I3.C0874d;
import I3.EnumC0871a;
import I3.EnumC0891v;
import I3.L;
import android.net.NetworkRequest;
import android.net.Uri;
import fc.C4015H;
import fc.C4032o;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0 f13746a = new w0();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f13748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f13749c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f13750d;

        static {
            int[] iArr = new int[L.c.values().length];
            try {
                iArr[L.c.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[L.c.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[L.c.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[L.c.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[L.c.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[L.c.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f13747a = iArr;
            int[] iArr2 = new int[EnumC0871a.values().length];
            try {
                iArr2[EnumC0871a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC0871a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f13748b = iArr2;
            int[] iArr3 = new int[EnumC0891v.values().length];
            try {
                iArr3[EnumC0891v.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[EnumC0891v.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[EnumC0891v.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[EnumC0891v.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[EnumC0891v.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            f13749c = iArr3;
            int[] iArr4 = new int[I3.D.values().length];
            try {
                iArr4[I3.D.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[I3.D.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            f13750d = iArr4;
        }
    }

    public static final int a(EnumC0871a backoffPolicy) {
        AbstractC4862t.e(backoffPolicy, "backoffPolicy");
        int i10 = a.f13748b[backoffPolicy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new C4032o();
    }

    public static final Set b(byte[] bytes) throws IOException {
        AbstractC4862t.e(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i10 = objectInputStream.readInt();
                    for (int i11 = 0; i11 < i10; i11++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z10 = objectInputStream.readBoolean();
                        AbstractC4862t.b(uri);
                        linkedHashSet.add(new C0874d.c(uri, z10));
                    }
                    C4015H c4015h = C4015H.f34254a;
                    sc.c.a(objectInputStream, null);
                } finally {
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            C4015H c4015h2 = C4015H.f34254a;
            sc.c.a(byteArrayInputStream, null);
            return linkedHashSet;
        } finally {
        }
    }

    public static final byte[] c(R3.p requestCompat) throws IOException {
        AbstractC4862t.e(requestCompat, "requestCompat");
        NetworkRequest networkRequestB = requestCompat.b();
        if (networkRequestB == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                int[] iArrC = R3.q.c(networkRequestB);
                int[] iArrB = R3.q.b(networkRequestB);
                objectOutputStream.writeInt(iArrC.length);
                for (int i10 : iArrC) {
                    objectOutputStream.writeInt(i10);
                }
                objectOutputStream.writeInt(iArrB.length);
                for (int i11 : iArrB) {
                    objectOutputStream.writeInt(i11);
                }
                C4015H c4015h = C4015H.f34254a;
                sc.c.a(objectOutputStream, null);
                sc.c.a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                AbstractC4862t.d(byteArray, "toByteArray(...)");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final EnumC0871a d(int i10) {
        if (i10 == 0) {
            return EnumC0871a.EXPONENTIAL;
        }
        if (i10 == 1) {
            return EnumC0871a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to BackoffPolicy");
    }

    public static final EnumC0891v e(int i10) {
        if (i10 == 0) {
            return EnumC0891v.NOT_REQUIRED;
        }
        if (i10 == 1) {
            return EnumC0891v.CONNECTED;
        }
        if (i10 == 2) {
            return EnumC0891v.UNMETERED;
        }
        if (i10 == 3) {
            return EnumC0891v.NOT_ROAMING;
        }
        if (i10 == 4) {
            return EnumC0891v.METERED;
        }
        if (i10 == 5) {
            return EnumC0891v.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to NetworkType");
    }

    public static final I3.D f(int i10) {
        if (i10 == 0) {
            return I3.D.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i10 == 1) {
            return I3.D.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to OutOfQuotaPolicy");
    }

    public static final L.c g(int i10) {
        if (i10 == 0) {
            return L.c.ENQUEUED;
        }
        if (i10 == 1) {
            return L.c.RUNNING;
        }
        if (i10 == 2) {
            return L.c.SUCCEEDED;
        }
        if (i10 == 3) {
            return L.c.FAILED;
        }
        if (i10 == 4) {
            return L.c.BLOCKED;
        }
        if (i10 == 5) {
            return L.c.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to State");
    }

    public static final int h(EnumC0891v networkType) {
        AbstractC4862t.e(networkType, "networkType");
        int i10 = a.f13749c[networkType.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 4;
        }
        if (networkType == EnumC0891v.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + networkType + " to int");
    }

    public static final int i(I3.D policy) {
        AbstractC4862t.e(policy, "policy");
        int i10 = a.f13750d[policy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new C4032o();
    }

    public static final byte[] j(Set triggers) throws IOException {
        AbstractC4862t.e(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                Iterator it = triggers.iterator();
                while (it.hasNext()) {
                    C0874d.c cVar = (C0874d.c) it.next();
                    objectOutputStream.writeUTF(cVar.a().toString());
                    objectOutputStream.writeBoolean(cVar.b());
                }
                C4015H c4015h = C4015H.f34254a;
                sc.c.a(objectOutputStream, null);
                sc.c.a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                AbstractC4862t.d(byteArray, "toByteArray(...)");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final int k(L.c state) {
        AbstractC4862t.e(state, "state");
        switch (a.f13747a[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new C4032o();
        }
    }

    public static final R3.p l(byte[] bytes) throws IOException {
        AbstractC4862t.e(bytes, "bytes");
        if (bytes.length == 0) {
            return new R3.p(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i10 = objectInputStream.readInt();
                int[] iArr = new int[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    iArr[i11] = objectInputStream.readInt();
                }
                int i12 = objectInputStream.readInt();
                int[] iArr2 = new int[i12];
                for (int i13 = 0; i13 < i12; i13++) {
                    iArr2[i13] = objectInputStream.readInt();
                }
                R3.p pVarB = R3.n.f14536a.b(iArr2, iArr);
                sc.c.a(objectInputStream, null);
                sc.c.a(byteArrayInputStream, null);
                return pVarB;
            } finally {
            }
        } finally {
        }
    }
}
