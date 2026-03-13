package x;

import E.AbstractC0807p0;
import L.EnumC1121s;
import L.EnumC1123t;
import L.EnumC1125u;
import L.EnumC1127v;
import L.EnumC1129w;
import L.EnumC1131x;
import L.InterfaceC1133y;
import M.h;
import android.hardware.camera2.CaptureResult;
import java.nio.BufferUnderflowException;

/* JADX INFO: renamed from: x.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C6219f implements InterfaceC1133y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L.k1 f46997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CaptureResult f46998b;

    public C6219f(L.k1 k1Var, CaptureResult captureResult) {
        this.f46997a = k1Var;
        this.f46998b = captureResult;
    }

    @Override // L.InterfaceC1133y
    public void a(h.b bVar) {
        super.a(bVar);
        try {
            Integer num = (Integer) this.f46998b.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                bVar.m(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            AbstractC0807p0.l("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l10 = (Long) this.f46998b.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l10 != null) {
            bVar.f(l10.longValue());
        }
        Float f10 = (Float) this.f46998b.get(CaptureResult.LENS_APERTURE);
        if (f10 != null) {
            bVar.l(f10.floatValue());
        }
        Integer numValueOf = (Integer) this.f46998b.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            if (((Integer) this.f46998b.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (r1.intValue() / 100.0f)));
            }
            bVar.k(numValueOf.intValue());
        }
        Float f11 = (Float) this.f46998b.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f11 != null) {
            bVar.h(f11.floatValue());
        }
        Integer num2 = (Integer) this.f46998b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num2 != null) {
            h.c cVar = h.c.AUTO;
            if (num2.intValue() == 0) {
                cVar = h.c.MANUAL;
            }
            bVar.n(cVar);
        }
    }

    @Override // L.InterfaceC1133y
    public EnumC1131x b() {
        Integer num = (Integer) this.f46998b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return EnumC1131x.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            return EnumC1131x.NONE;
        }
        if (iIntValue == 2) {
            return EnumC1131x.READY;
        }
        if (iIntValue == 3 || iIntValue == 4) {
            return EnumC1131x.FIRED;
        }
        AbstractC0807p0.c("C2CameraCaptureResult", "Undefined flash state: " + num);
        return EnumC1131x.UNKNOWN;
    }

    @Override // L.InterfaceC1133y
    public L.k1 c() {
        return this.f46997a;
    }

    @Override // L.InterfaceC1133y
    public EnumC1127v d() {
        Integer num = (Integer) this.f46998b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num == null) {
            return EnumC1127v.UNKNOWN;
        }
        switch (num.intValue()) {
        }
        return EnumC1127v.UNKNOWN;
    }

    @Override // L.InterfaceC1133y
    public CaptureResult e() {
        return this.f46998b;
    }

    @Override // L.InterfaceC1133y
    public L.r f() {
        Integer num = (Integer) this.f46998b.get(CaptureResult.CONTROL_AE_MODE);
        if (num == null) {
            return L.r.UNKNOWN;
        }
        int iIntValue = num.intValue();
        return iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? iIntValue != 4 ? iIntValue != 5 ? L.r.UNKNOWN : L.r.ON_EXTERNAL_FLASH : L.r.ON_AUTO_FLASH_REDEYE : L.r.ON_ALWAYS_FLASH : L.r.ON_AUTO_FLASH : L.r.ON : L.r.OFF;
    }

    @Override // L.InterfaceC1133y
    public EnumC1125u g() {
        Integer num = (Integer) this.f46998b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return EnumC1125u.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                break;
            case 1:
            case 3:
                break;
            case 2:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                AbstractC0807p0.c("C2CameraCaptureResult", "Undefined af state: " + num);
                break;
        }
        return EnumC1125u.UNKNOWN;
    }

    @Override // L.InterfaceC1133y
    public long getTimestamp() {
        Long l10 = (Long) this.f46998b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l10 == null) {
            return -1L;
        }
        return l10.longValue();
    }

    @Override // L.InterfaceC1133y
    public EnumC1129w h() {
        Integer num = (Integer) this.f46998b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return EnumC1129w.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC1129w.INACTIVE;
        }
        if (iIntValue == 1) {
            return EnumC1129w.METERING;
        }
        if (iIntValue == 2) {
            return EnumC1129w.CONVERGED;
        }
        if (iIntValue == 3) {
            return EnumC1129w.LOCKED;
        }
        AbstractC0807p0.c("C2CameraCaptureResult", "Undefined awb state: " + num);
        return EnumC1129w.UNKNOWN;
    }

    @Override // L.InterfaceC1133y
    public EnumC1123t i() {
        Integer num = (Integer) this.f46998b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return EnumC1123t.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1 || iIntValue == 2) {
                return EnumC1123t.ON_MANUAL_AUTO;
            }
            if (iIntValue == 3 || iIntValue == 4) {
                return EnumC1123t.ON_CONTINUOUS_AUTO;
            }
            if (iIntValue != 5) {
                AbstractC0807p0.c("C2CameraCaptureResult", "Undefined af mode: " + num);
                return EnumC1123t.UNKNOWN;
            }
        }
        return EnumC1123t.OFF;
    }

    @Override // L.InterfaceC1133y
    public EnumC1121s j() {
        Integer num = (Integer) this.f46998b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return EnumC1121s.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC1121s.INACTIVE;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return EnumC1121s.CONVERGED;
            }
            if (iIntValue == 3) {
                return EnumC1121s.LOCKED;
            }
            if (iIntValue == 4) {
                return EnumC1121s.FLASH_REQUIRED;
            }
            if (iIntValue != 5) {
                AbstractC0807p0.c("C2CameraCaptureResult", "Undefined ae state: " + num);
                return EnumC1121s.UNKNOWN;
            }
        }
        return EnumC1121s.SEARCHING;
    }

    public C6219f(CaptureResult captureResult) {
        this(L.k1.b(), captureResult);
    }
}
