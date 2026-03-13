package com.hiennv.flutter_callkit_incoming;

import Od.C;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonPointer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001-B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\rJ\r\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\bJ\r\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010'\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u001a\u0010+\u001a\u00060*R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/hiennv/flutter_callkit_incoming/CallkitSoundPlayerManager;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lfc/H;", "prepare", "()V", "playVibrator", "Landroid/os/Bundle;", "data", "playSound", "(Landroid/os/Bundle;)V", "", "fileName", "Landroid/net/Uri;", "getRingtoneUri", "(Ljava/lang/String;)Landroid/net/Uri;", "", "useSystemDefault", "getDefaultRingtoneUri", "(Z)Landroid/net/Uri;", "getSafeSystemRingtoneUri", "()Landroid/net/Uri;", "play", "stop", "destroy", "Landroid/content/Context;", "Landroid/os/Vibrator;", "vibrator", "Landroid/os/Vibrator;", "Landroid/media/AudioManager;", "audioManager", "Landroid/media/AudioManager;", "Landroid/media/Ringtone;", "ringtone", "Landroid/media/Ringtone;", "value", "isPlaying", "Z", "()Z", "Lcom/hiennv/flutter_callkit_incoming/CallkitSoundPlayerManager$ScreenOffCallkitIncomingBroadcastReceiver;", "screenOffCallkitIncomingBroadcastReceiver", "Lcom/hiennv/flutter_callkit_incoming/CallkitSoundPlayerManager$ScreenOffCallkitIncomingBroadcastReceiver;", "ScreenOffCallkitIncomingBroadcastReceiver", "flutter_callkit_incoming_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CallkitSoundPlayerManager {
    private AudioManager audioManager;
    private final Context context;
    private boolean isPlaying;
    private Ringtone ringtone;
    private ScreenOffCallkitIncomingBroadcastReceiver screenOffCallkitIncomingBroadcastReceiver;
    private Vibrator vibrator;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/hiennv/flutter_callkit_incoming/CallkitSoundPlayerManager$ScreenOffCallkitIncomingBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lcom/hiennv/flutter_callkit_incoming/CallkitSoundPlayerManager;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lfc/H;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "flutter_callkit_incoming_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class ScreenOffCallkitIncomingBroadcastReceiver extends BroadcastReceiver {
        public ScreenOffCallkitIncomingBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AbstractC4862t.e(context, "context");
            AbstractC4862t.e(intent, "intent");
            if (CallkitSoundPlayerManager.this.getIsPlaying()) {
                CallkitSoundPlayerManager.this.stop();
            }
        }
    }

    public CallkitSoundPlayerManager(Context context) {
        AbstractC4862t.e(context, "context");
        this.context = context;
        this.screenOffCallkitIncomingBroadcastReceiver = new ScreenOffCallkitIncomingBroadcastReceiver();
    }

    private final Uri getDefaultRingtoneUri(boolean useSystemDefault) {
        if (!useSystemDefault) {
            try {
                int identifier = this.context.getResources().getIdentifier("ringtone_default", "raw", this.context.getPackageName());
                if (identifier != 0) {
                    return Uri.parse("android.resource://" + this.context.getPackageName() + JsonPointer.SEPARATOR + identifier);
                }
            } catch (Exception unused) {
                return getSafeSystemRingtoneUri();
            }
        }
        return RingtoneManager.getActualDefaultRingtoneUri(this.context, 1);
    }

    public static /* synthetic */ Uri getDefaultRingtoneUri$default(CallkitSoundPlayerManager callkitSoundPlayerManager, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return callkitSoundPlayerManager.getDefaultRingtoneUri(z10);
    }

    private final Uri getRingtoneUri(String fileName) {
        if (TextUtils.isEmpty(fileName)) {
            return getDefaultRingtoneUri$default(this, false, 1, null);
        }
        if (C.E(fileName, "system_ringtone_default", true)) {
            return getDefaultRingtoneUri(true);
        }
        try {
            int identifier = this.context.getResources().getIdentifier(fileName, "raw", this.context.getPackageName());
            if (identifier == 0) {
                return getDefaultRingtoneUri$default(this, false, 1, null);
            }
            return Uri.parse("android.resource://" + this.context.getPackageName() + JsonPointer.SEPARATOR + identifier);
        } catch (Exception unused) {
            return getDefaultRingtoneUri$default(this, false, 1, null);
        }
    }

    private final Uri getSafeSystemRingtoneUri() {
        try {
            Uri actualDefaultRingtoneUri = RingtoneManager.getActualDefaultRingtoneUri(this.context, 1);
            RingtoneManager ringtoneManager = new RingtoneManager(this.context);
            ringtoneManager.setType(1);
            Cursor cursor = ringtoneManager.getCursor();
            if (actualDefaultRingtoneUri != null && cursor != null) {
                while (cursor.moveToNext()) {
                    if (AbstractC4862t.a(ringtoneManager.getRingtoneUri(cursor.getPosition()), actualDefaultRingtoneUri)) {
                        cursor.close();
                        return actualDefaultRingtoneUri;
                    }
                }
            }
            if (cursor == null || !cursor.moveToFirst()) {
                return null;
            }
            Uri ringtoneUri = ringtoneManager.getRingtoneUri(cursor.getPosition());
            cursor.close();
            return ringtoneUri;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private final void playSound(Bundle data) {
        String string = data != null ? data.getString(CallkitConstants.EXTRA_CALLKIT_RINGTONE_PATH, "") : null;
        Uri ringtoneUri = string != null ? getRingtoneUri(string) : null;
        if (ringtoneUri == null) {
            return;
        }
        try {
            this.ringtone = RingtoneManager.getRingtone(this.context, ringtoneUri);
            AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setContentType(4).setUsage(6).setLegacyStreamType(2).build();
            Ringtone ringtone = this.ringtone;
            if (ringtone != null) {
                ringtone.setAudioAttributes(audioAttributesBuild);
            }
            Ringtone ringtone2 = this.ringtone;
            if (ringtone2 != null) {
                ringtone2.setLooping(true);
            }
            Ringtone ringtone3 = this.ringtone;
            if (ringtone3 != null) {
                ringtone3.play();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void playVibrator() {
        Vibrator vibrator;
        Object systemService = this.context.getSystemService("vibrator_manager");
        AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.os.VibratorManager");
        this.vibrator = ((VibratorManager) systemService).getDefaultVibrator();
        Object systemService2 = this.context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        AbstractC4862t.c(systemService2, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService2;
        this.audioManager = audioManager;
        Integer numValueOf = audioManager != null ? Integer.valueOf(audioManager.getRingerMode()) : null;
        if ((numValueOf != null && numValueOf.intValue() == 0) || (vibrator = this.vibrator) == null) {
            return;
        }
        vibrator.vibrate(VibrationEffect.createWaveform(new long[]{1000, 1000}, 0), new AudioAttributes.Builder().setUsage(6).setContentType(4).build());
    }

    private final void prepare() {
        Ringtone ringtone = this.ringtone;
        if (ringtone != null) {
            ringtone.stop();
        }
        Vibrator vibrator = this.vibrator;
        if (vibrator != null) {
            vibrator.cancel();
        }
    }

    public final void destroy() {
        this.isPlaying = false;
        Ringtone ringtone = this.ringtone;
        if (ringtone != null) {
            ringtone.stop();
        }
        Vibrator vibrator = this.vibrator;
        if (vibrator != null) {
            vibrator.cancel();
        }
        this.ringtone = null;
        this.vibrator = null;
        try {
            this.context.unregisterReceiver(this.screenOffCallkitIncomingBroadcastReceiver);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: isPlaying, reason: from getter */
    public final boolean getIsPlaying() {
        return this.isPlaying;
    }

    public final void play(Bundle data) {
        AbstractC4862t.e(data, "data");
        this.isPlaying = true;
        prepare();
        playSound(data);
        playVibrator();
        this.context.registerReceiver(this.screenOffCallkitIncomingBroadcastReceiver, new IntentFilter("android.intent.action.SCREEN_OFF"));
    }

    public final void stop() {
        this.isPlaying = false;
        Ringtone ringtone = this.ringtone;
        if (ringtone != null) {
            ringtone.stop();
        }
        Vibrator vibrator = this.vibrator;
        if (vibrator != null) {
            vibrator.cancel();
        }
        this.ringtone = null;
        this.vibrator = null;
        try {
            this.context.unregisterReceiver(this.screenOffCallkitIncomingBroadcastReceiver);
        } catch (Exception unused) {
        }
    }
}
