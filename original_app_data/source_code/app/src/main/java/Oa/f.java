package Oa;

import Oa.c;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends a {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(Context context, boolean z10, AudioManager.OnAudioFocusChangeListener audioFocusChangeListener, List preferredDeviceList) {
        this(context, audioFocusChangeListener, new Pa.c(z10), preferredDeviceList, null, null, null, null, 240, null);
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(audioFocusChangeListener, "audioFocusChangeListener");
        AbstractC4862t.e(preferredDeviceList, "preferredDeviceList");
    }

    @Override // Ra.b.a
    public void a(c audioDevice) {
        AbstractC4862t.e(audioDevice, "audioDevice");
        k().a("AudioSwitch", "onDeviceDisconnected(" + audioDevice + ')');
        boolean zRemove = i().remove(audioDevice);
        if (AbstractC4862t.a(n(), audioDevice)) {
            C(null);
        }
        if ((audioDevice instanceof c.d) && f().e()) {
            zRemove = i().add(new c.b(null, 1, null)) || zRemove;
        }
        a.s(this, zRemove, null, 2, null);
    }

    @Override // Oa.a
    public void p(c audioDevice) {
        AbstractC4862t.e(audioDevice, "audioDevice");
        k().a("AudioSwitch", "onActivate(" + audioDevice + ')');
        if (audioDevice instanceof c.a) {
            f().c(false);
            f().b(true);
        } else if ((audioDevice instanceof c.b) || (audioDevice instanceof c.d)) {
            f().c(false);
            f().b(false);
        } else if (audioDevice instanceof c.C0158c) {
            f().b(false);
            f().c(true);
        }
    }

    @Override // Oa.a
    public void q() {
        k().a("AudioSwitch", "onDeactivate");
        if (m() instanceof c.a) {
            f().b(false);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ f(android.content.Context r11, android.media.AudioManager.OnAudioFocusChangeListener r12, Pa.b r13, java.util.List r14, android.media.AudioManager r15, Oa.d r16, android.os.Handler r17, Ra.b r18, int r19, kotlin.jvm.internal.AbstractC4854k r20) {
        /*
            r10 = this;
            r0 = r19
            r1 = r0 & 16
            if (r1 == 0) goto L1a
            java.lang.String r1 = "audio"
            java.lang.Object r1 = r11.getSystemService(r1)
            if (r1 == 0) goto L12
            android.media.AudioManager r1 = (android.media.AudioManager) r1
            r5 = r1
            goto L1b
        L12:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r11 = "null cannot be cast to non-null type android.media.AudioManager"
            r10.<init>(r11)
            throw r10
        L1a:
            r5 = r15
        L1b:
            r1 = r0 & 32
            if (r1 == 0) goto L2f
            Oa.d r1 = new Oa.d
            r8 = 24
            r9 = 0
            r4 = r5
            r5 = 0
            r6 = 0
            r2 = r11
            r7 = r12
            r3 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r6 = r1
            goto L32
        L2f:
            r4 = r5
            r6 = r16
        L32:
            r1 = r0 & 64
            if (r1 == 0) goto L41
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r7 = r1
            goto L43
        L41:
            r7 = r17
        L43:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L54
            Ra.a r0 = new Ra.a
            r0.<init>(r4, r7)
            r8 = r0
            r1 = r11
            r2 = r12
            r3 = r13
            r5 = r4
            r0 = r10
        L52:
            r4 = r14
            goto L5c
        L54:
            r8 = r18
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r5 = r4
            goto L52
        L5c:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Oa.f.<init>(android.content.Context, android.media.AudioManager$OnAudioFocusChangeListener, Pa.b, java.util.List, android.media.AudioManager, Oa.d, android.os.Handler, Ra.b, int, kotlin.jvm.internal.k):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, AudioManager.OnAudioFocusChangeListener audioFocusChangeListener, Pa.b logger, List preferredDeviceList, AudioManager audioManager, d audioDeviceManager, Handler handler, Ra.b scanner) {
        super(context, audioFocusChangeListener, scanner, false, logger, preferredDeviceList, audioDeviceManager, 8, null);
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(audioFocusChangeListener, "audioFocusChangeListener");
        AbstractC4862t.e(logger, "logger");
        AbstractC4862t.e(preferredDeviceList, "preferredDeviceList");
        AbstractC4862t.e(audioManager, "audioManager");
        AbstractC4862t.e(audioDeviceManager, "audioDeviceManager");
        AbstractC4862t.e(handler, "handler");
        AbstractC4862t.e(scanner, "scanner");
    }
}
