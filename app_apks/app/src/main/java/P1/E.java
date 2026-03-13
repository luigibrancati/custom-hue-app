package P1;

import C2.p;
import D1.AbstractC0747e;
import D1.C0753k;
import G1.AbstractC0853a;
import L1.B0;
import P1.A;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class E implements A {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final A.c f12555d = new A.c() { // from class: P1.C
        @Override // P1.A.c
        public final A a(UUID uuid) {
            return E.n(uuid);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f12556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaDrm f12557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12558c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static boolean a(MediaDrm mediaDrm, String str, int i10) {
            return mediaDrm.requiresSecureDecoder(str, i10);
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, B0 b02) {
            LogSessionId logSessionIdA = b02.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            ((MediaDrm.PlaybackComponent) AbstractC0853a.e(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(logSessionIdA);
        }
    }

    public E(UUID uuid) {
        AbstractC0853a.e(uuid);
        AbstractC0853a.b(!AbstractC0747e.f1685b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f12556a = uuid;
        MediaDrm mediaDrm = new MediaDrm(u(uuid));
        this.f12557b = mediaDrm;
        this.f12558c = 1;
        if (AbstractC0747e.f1687d.equals(uuid) && B()) {
            x(mediaDrm);
        }
    }

    public static boolean B() {
        return "ASUS_Z00AD".equals(Build.MODEL);
    }

    public static E C(UUID uuid) throws J {
        try {
            return new E(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new J(1, e10);
        } catch (Exception e11) {
            throw new J(2, e11);
        }
    }

    public static /* synthetic */ A n(UUID uuid) {
        try {
            return C(uuid);
        } catch (J unused) {
            G1.t.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new y();
        }
    }

    public static /* synthetic */ void o(E e10, A.b bVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        e10.getClass();
        bVar.a(e10, bArr, i10, i11, bArr2);
    }

    public static byte[] p(byte[] bArr) {
        G1.C c10 = new G1.C(bArr);
        int iY = c10.y();
        short sA = c10.A();
        short sA2 = c10.A();
        if (sA != 1 || sA2 != 1) {
            G1.t.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short sA3 = c10.A();
        Charset charset = StandardCharsets.UTF_16LE;
        String strJ = c10.J(sA3, charset);
        if (strJ.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = strJ.indexOf("</DATA>");
        if (iIndexOf == -1) {
            G1.t.h("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = strJ.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strJ.substring(iIndexOf);
        int i10 = iY + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i10);
        byteBufferAllocate.putShort(sA);
        byteBufferAllocate.putShort(sA2);
        byteBufferAllocate.putShort((short) (str.length() * 2));
        byteBufferAllocate.put(str.getBytes(charset));
        return byteBufferAllocate.array();
    }

    public static byte[] r(UUID uuid, byte[] bArr) {
        return AbstractC0747e.f1686c.equals(uuid) ? AbstractC1830a.a(bArr) : bArr;
    }

    public static byte[] s(UUID uuid, byte[] bArr) {
        byte[] bArrE;
        p.a aVarD;
        UUID uuid2 = AbstractC0747e.f1688e;
        if (uuid2.equals(uuid)) {
            byte[] bArrE2 = C2.p.e(bArr, uuid);
            if (bArrE2 != null) {
                bArr = bArrE2;
            }
            bArr = C2.p.a(uuid2, p(bArr));
        }
        if (v(uuid) && (aVarD = C2.p.d(bArr)) != null) {
            bArr = C2.p.b(AbstractC0747e.f1685b, aVarD.f1045d, aVarD.f1044c);
        }
        if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if (("AFTB".equals(str) || "AFTS".equals(str) || "AFTM".equals(str) || "AFTT".equals(str)) && (bArrE = C2.p.e(bArr, uuid)) != null) {
                return bArrE;
            }
        }
        return bArr;
    }

    public static UUID u(UUID uuid) {
        return v(uuid) ? AbstractC0747e.f1685b : uuid;
    }

    public static boolean v(UUID uuid) {
        return false;
    }

    public static void x(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    public static C0753k.b z(UUID uuid, List list) {
        if (!AbstractC0747e.f1687d.equals(uuid)) {
            return (C0753k.b) list.get(0);
        }
        if (list.size() > 1) {
            C0753k.b bVar = (C0753k.b) list.get(0);
            int length = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                C0753k.b bVar2 = (C0753k.b) list.get(i10);
                byte[] bArr = (byte[]) AbstractC0853a.e(bVar2.f1732e);
                if (Objects.equals(bVar2.f1731d, bVar.f1731d) && Objects.equals(bVar2.f1730c, bVar.f1730c) && C2.p.c(bArr)) {
                    length += bArr.length;
                }
            }
            byte[] bArr2 = new byte[length];
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                byte[] bArr3 = (byte[]) AbstractC0853a.e(((C0753k.b) list.get(i12)).f1732e);
                int length2 = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i11, length2);
                i11 += length2;
            }
            return bVar.b(bArr2);
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            C0753k.b bVar3 = (C0753k.b) list.get(i13);
            if (C2.p.g((byte[]) AbstractC0853a.e(bVar3.f1732e)) == 1) {
                return bVar3;
            }
        }
        return (C0753k.b) list.get(0);
    }

    public final boolean A() {
        if (!this.f12556a.equals(AbstractC0747e.f1687d)) {
            return this.f12556a.equals(AbstractC0747e.f1686c);
        }
        String strY = y("version");
        return (strY.startsWith("v5.") || strY.startsWith("14.") || strY.startsWith("15.") || strY.startsWith("16.0")) ? false : true;
    }

    @Override // P1.A
    public Map a(byte[] bArr) {
        return this.f12557b.queryKeyStatus(bArr);
    }

    @Override // P1.A
    public A.d b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f12557b.getProvisionRequest();
        return new A.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // P1.A
    public byte[] c() {
        return this.f12557b.openSession();
    }

    @Override // P1.A
    public void d(byte[] bArr, byte[] bArr2) {
        this.f12557b.restoreKeys(bArr, bArr2);
    }

    @Override // P1.A
    public void e(byte[] bArr) throws DeniedByServerException {
        this.f12557b.provideProvisionResponse(bArr);
    }

    @Override // P1.A
    public int f() {
        return 2;
    }

    @Override // P1.A
    public void g(byte[] bArr, B0 b02) {
        try {
            a.b(this.f12557b, bArr, b02);
        } catch (UnsupportedOperationException unused) {
            G1.t.h("FrameworkMediaDrm", "setLogSessionId failed.");
        }
    }

    @Override // P1.A
    public void h(final A.b bVar) {
        this.f12557b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: P1.D
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                E.o(this.f12553a, bVar, mediaDrm, bArr, i10, i11, bArr2);
            }
        });
    }

    @Override // P1.A
    public boolean j(byte[] bArr, String str) throws Throwable {
        if (A()) {
            MediaDrm mediaDrm = this.f12557b;
            return a.a(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
        }
        MediaCrypto mediaCrypto = null;
        try {
            try {
                MediaCrypto mediaCrypto2 = new MediaCrypto(u(this.f12556a), bArr);
                try {
                    boolean zRequiresSecureDecoderComponent = mediaCrypto2.requiresSecureDecoderComponent(str);
                    mediaCrypto2.release();
                    return zRequiresSecureDecoderComponent;
                } catch (MediaCryptoException unused) {
                    mediaCrypto = mediaCrypto2;
                    boolean z10 = !this.f12556a.equals(AbstractC0747e.f1686c);
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    return z10;
                } catch (Throwable th) {
                    th = th;
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (MediaCryptoException unused2) {
        }
    }

    @Override // P1.A
    public void k(byte[] bArr) {
        this.f12557b.closeSession(bArr);
    }

    @Override // P1.A
    public byte[] l(byte[] bArr, byte[] bArr2) {
        if (AbstractC0747e.f1686c.equals(this.f12556a)) {
            bArr2 = AbstractC1830a.b(bArr2);
        }
        return this.f12557b.provideKeyResponse(bArr, bArr2);
    }

    @Override // P1.A
    public A.a m(byte[] bArr, List list, int i10, HashMap map) throws NotProvisionedException {
        C0753k.b bVarZ;
        byte[] bArrS;
        String strT;
        if (list != null) {
            bVarZ = z(this.f12556a, list);
            bArrS = s(this.f12556a, (byte[]) AbstractC0853a.e(bVarZ.f1732e));
            strT = t(this.f12556a, bVarZ.f1731d);
        } else {
            bVarZ = null;
            bArrS = null;
            strT = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f12557b.getKeyRequest(bArr, bArrS, strT, i10, map);
        byte[] bArrR = r(this.f12556a, keyRequest.getData());
        String strQ = q(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(strQ) && bVarZ != null && !TextUtils.isEmpty(bVarZ.f1730c)) {
            strQ = bVarZ.f1730c;
        }
        return new A.a(bArrR, strQ, keyRequest.getRequestType());
    }

    public final String q(String str) {
        if ("<LA_URL>https://x</LA_URL>".equals(str)) {
            return "";
        }
        if (Build.VERSION.SDK_INT >= 33 && "https://default.url".equals(str)) {
            String strY = y("version");
            if (Objects.equals(strY, "1.2") || Objects.equals(strY, "aidl-1")) {
                return "";
            }
        }
        return str;
    }

    @Override // P1.A
    public synchronized void release() {
        int i10 = this.f12558c - 1;
        this.f12558c = i10;
        if (i10 == 0) {
            this.f12557b.release();
        }
    }

    @Override // P1.A
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public B i(byte[] bArr) {
        return new B(u(this.f12556a), bArr);
    }

    public String y(String str) {
        return this.f12557b.getPropertyString(str);
    }

    public static String t(UUID uuid, String str) {
        return str;
    }
}
