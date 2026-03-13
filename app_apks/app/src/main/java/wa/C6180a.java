package wa;

import android.content.Context;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: wa.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C6180a implements MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0638a f46467c = new C0638a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C6182c f46468d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BinaryMessenger f46469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MethodChannel f46470b;

    /* JADX INFO: renamed from: wa.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0638a {
        public /* synthetic */ C0638a(AbstractC4854k abstractC4854k) {
            this();
        }

        public C0638a() {
        }
    }

    public C6180a(Context applicationContext, BinaryMessenger messenger) {
        AbstractC4862t.e(applicationContext, "applicationContext");
        AbstractC4862t.e(messenger, "messenger");
        if (f46468d == null) {
            f46468d = new C6182c(applicationContext);
        }
        this.f46469a = messenger;
        this.f46470b = new MethodChannel(messenger, "com.ryanheise.android_audio_manager");
        C6182c c6182c = f46468d;
        AbstractC4862t.b(c6182c);
        c6182c.c(this);
        MethodChannel methodChannel = this.f46470b;
        AbstractC4862t.b(methodChannel);
        methodChannel.setMethodCallHandler(this);
    }

    public final void a() {
        MethodChannel methodChannel = this.f46470b;
        AbstractC4862t.b(methodChannel);
        methodChannel.setMethodCallHandler(null);
        C6182c c6182c = f46468d;
        AbstractC4862t.b(c6182c);
        c6182c.O(this);
        C6182c c6182c2 = f46468d;
        AbstractC4862t.b(c6182c2);
        if (c6182c2.D()) {
            C6182c c6182c3 = f46468d;
            AbstractC4862t.b(c6182c3);
            c6182c3.j();
            f46468d = null;
        }
        this.f46470b = null;
        this.f46469a = null;
    }

    public final MethodChannel b() {
        return this.f46470b;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(result, "result");
        try {
            Object obj = call.arguments;
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) obj;
            String str = call.method;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1758921066:
                        if (str.equals("getCommunicationDevice")) {
                            C6182c c6182c = f46468d;
                            AbstractC4862t.b(c6182c);
                            result.success(c6182c.o());
                            return;
                        }
                        break;
                    case -1698305881:
                        if (str.equals("getDevices")) {
                            C6182c c6182c2 = f46468d;
                            AbstractC4862t.b(c6182c2);
                            Object obj2 = list.get(0);
                            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.Int");
                            result.success(c6182c2.p(((Integer) obj2).intValue()));
                            return;
                        }
                        break;
                    case -1679670739:
                        if (str.equals("isMicrophoneMute")) {
                            C6182c c6182c3 = f46468d;
                            AbstractC4862t.b(c6182c3);
                            result.success(c6182c3.F());
                            return;
                        }
                        break;
                    case -1582239800:
                        if (str.equals("getStreamMaxVolume")) {
                            C6182c c6182c4 = f46468d;
                            AbstractC4862t.b(c6182c4);
                            Object obj3 = list.get(0);
                            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Int");
                            result.success(c6182c4.v(((Integer) obj3).intValue()));
                            return;
                        }
                        break;
                    case -1562927400:
                        if (str.equals("isSpeakerphoneOn")) {
                            C6182c c6182c5 = f46468d;
                            AbstractC4862t.b(c6182c5);
                            result.success(c6182c5.H());
                            return;
                        }
                        break;
                    case -1524320654:
                        if (str.equals("isHapticPlaybackSupported")) {
                            C6182c c6182c6 = f46468d;
                            AbstractC4862t.b(c6182c6);
                            result.success(c6182c6.E());
                            return;
                        }
                        break;
                    case -1504647535:
                        if (str.equals("requestAudioFocus")) {
                            C6182c c6182c7 = f46468d;
                            AbstractC4862t.b(c6182c7);
                            result.success(Boolean.valueOf(c6182c7.P(list)));
                            return;
                        }
                        break;
                    case -1413157019:
                        if (str.equals("setMicrophoneMute")) {
                            C6182c c6182c8 = f46468d;
                            AbstractC4862t.b(c6182c8);
                            Object obj4 = list.get(0);
                            AbstractC4862t.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            result.success(c6182c8.U(((Boolean) obj4).booleanValue()));
                            return;
                        }
                        break;
                    case -1296413680:
                        if (str.equals("setSpeakerphoneOn")) {
                            C6182c c6182c9 = f46468d;
                            AbstractC4862t.b(c6182c9);
                            Object obj5 = list.get(0);
                            AbstractC4862t.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            result.success(c6182c9.Y(((Boolean) obj5).booleanValue()));
                            return;
                        }
                        break;
                    case -1285190630:
                        if (str.equals("isBluetoothScoOn")) {
                            C6182c c6182c10 = f46468d;
                            AbstractC4862t.b(c6182c10);
                            result.success(c6182c10.C());
                            return;
                        }
                        break;
                    case -1197068311:
                        if (str.equals("adjustStreamVolume")) {
                            C6182c c6182c11 = f46468d;
                            AbstractC4862t.b(c6182c11);
                            Object obj6 = list.get(0);
                            AbstractC4862t.c(obj6, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue = ((Integer) obj6).intValue();
                            Object obj7 = list.get(1);
                            AbstractC4862t.c(obj7, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue2 = ((Integer) obj7).intValue();
                            Object obj8 = list.get(2);
                            AbstractC4862t.c(obj8, "null cannot be cast to non-null type kotlin.Int");
                            result.success(c6182c11.d(iIntValue, iIntValue2, ((Integer) obj8).intValue()));
                            return;
                        }
                        break;
                    case -1091382445:
                        if (str.equals("getMicrophones")) {
                            C6182c c6182c12 = f46468d;
                            AbstractC4862t.b(c6182c12);
                            result.success(c6182c12.q());
                            return;
                        }
                        break;
                    case -1079290158:
                        if (str.equals("setAllowedCapturePolicy")) {
                            C6182c c6182c13 = f46468d;
                            AbstractC4862t.b(c6182c13);
                            Object obj9 = list.get(0);
                            AbstractC4862t.c(obj9, "null cannot be cast to non-null type kotlin.Int");
                            result.success(c6182c13.R(((Integer) obj9).intValue()));
                            return;
                        }
                        break;
                    case -1018676910:
                        if (str.equals("setBluetoothScoOn")) {
                            C6182c c6182c14 = f46468d;
                            AbstractC4862t.b(c6182c14);
                            Object obj10 = list.get(0);
                            AbstractC4862t.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            result.success(c6182c14.S(((Boolean) obj10).booleanValue()));
                            return;
                        }
                        break;
                    case -809761226:
                        if (str.equals("getStreamMinVolume")) {
                            C6182c c6182c15 = f46468d;
                            AbstractC4862t.b(c6182c15);
                            Object obj11 = list.get(0);
                            AbstractC4862t.c(obj11, "null cannot be cast to non-null type kotlin.Int");
                            result.success(c6182c15.w(((Integer) obj11).intValue()));
                            return;
                        }
                        break;
                    case -763512583:
                        if (str.equals("loadSoundEffects")) {
                            C6182c c6182c16 = f46468d;
                            AbstractC4862t.b(c6182c16);
                            result.success(c6182c16.K());
                            return;
                        }
                        break;
                    case -694417919:
                        if (str.equals("isMusicActive")) {
                            C6182c c6182c17 = f46468d;
                            AbstractC4862t.b(c6182c17);
                            result.success(c6182c17.G());
                            return;
                        }
                        break;
                    case -580980717:
                        if (str.equals("startBluetoothSco")) {
                            C6182c c6182c18 = f46468d;
                            AbstractC4862t.b(c6182c18);
                            result.success(c6182c18.a0());
                            return;
                        }
                        break;
                    case -445792758:
                        if (str.equals("setCommunicationDevice")) {
                            C6182c c6182c19 = f46468d;
                            AbstractC4862t.b(c6182c19);
                            Object obj12 = list.get(0);
                            AbstractC4862t.c(obj12, "null cannot be cast to non-null type kotlin.Int");
                            result.success(Boolean.valueOf(c6182c19.T(((Integer) obj12).intValue())));
                            return;
                        }
                        break;
                    case -380792370:
                        if (str.equals("getStreamVolumeDb")) {
                            C6182c c6182c20 = f46468d;
                            AbstractC4862t.b(c6182c20);
                            Object obj13 = list.get(0);
                            AbstractC4862t.c(obj13, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue3 = ((Integer) obj13).intValue();
                            Object obj14 = list.get(1);
                            AbstractC4862t.c(obj14, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue4 = ((Integer) obj14).intValue();
                            Object obj15 = list.get(2);
                            AbstractC4862t.c(obj15, "null cannot be cast to non-null type kotlin.Int");
                            result.success(c6182c20.y(iIntValue3, iIntValue4, ((Integer) obj15).intValue()));
                            return;
                        }
                        break;
                    case -75324903:
                        if (str.equals("getMode")) {
                            C6182c c6182c21 = f46468d;
                            AbstractC4862t.b(c6182c21);
                            result.success(c6182c21.r());
                            return;
                        }
                        break;
                    case 152385829:
                        if (str.equals("dispatchMediaKeyEvent")) {
                            C6182c c6182c22 = f46468d;
                            AbstractC4862t.b(c6182c22);
                            Object obj16 = list.get(0);
                            AbstractC4862t.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                            result.success(c6182c22.i((Map) obj16));
                            return;
                        }
                        break;
                    case 160987616:
                        if (str.equals("getParameters")) {
                            C6182c c6182c23 = f46468d;
                            AbstractC4862t.b(c6182c23);
                            result.success(c6182c23.s((String) list.get(0)));
                            return;
                        }
                        break;
                    case 186762163:
                        if (str.equals("stopBluetoothSco")) {
                            C6182c c6182c24 = f46468d;
                            AbstractC4862t.b(c6182c24);
                            result.success(c6182c24.b0());
                            return;
                        }
                        break;
                    case 276698416:
                        if (str.equals("getStreamVolume")) {
                            C6182c c6182c25 = f46468d;
                            AbstractC4862t.b(c6182c25);
                            Object obj17 = list.get(0);
                            AbstractC4862t.c(obj17, "null cannot be cast to non-null type kotlin.Int");
                            result.success(c6182c25.x(((Integer) obj17).intValue()));
                            return;
                        }
                        break;
                    case 469094495:
                        if (str.equals("isBluetoothScoAvailableOffCall")) {
                            C6182c c6182c26 = f46468d;
                            AbstractC4862t.b(c6182c26);
                            result.success(c6182c26.B());
                            return;
                        }
                        break;
                    case 623794710:
                        if (str.equals("getRingerMode")) {
                            C6182c c6182c27 = f46468d;
                            AbstractC4862t.b(c6182c27);
                            result.success(c6182c27.u());
                            return;
                        }
                        break;
                    case 935118828:
                        if (str.equals("setParameters")) {
                            C6182c c6182c28 = f46468d;
                            AbstractC4862t.b(c6182c28);
                            result.success(c6182c28.W((String) list.get(0)));
                            return;
                        }
                        break;
                    case 954131337:
                        if (str.equals("adjustVolume")) {
                            C6182c c6182c29 = f46468d;
                            AbstractC4862t.b(c6182c29);
                            Object obj18 = list.get(0);
                            AbstractC4862t.c(obj18, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue5 = ((Integer) obj18).intValue();
                            Object obj19 = list.get(1);
                            AbstractC4862t.c(obj19, "null cannot be cast to non-null type kotlin.Int");
                            result.success(c6182c29.f(iIntValue5, ((Integer) obj19).intValue()));
                            return;
                        }
                        break;
                    case 976310915:
                        if (str.equals("isStreamMute")) {
                            C6182c c6182c30 = f46468d;
                            AbstractC4862t.b(c6182c30);
                            Object obj20 = list.get(0);
                            AbstractC4862t.c(obj20, "null cannot be cast to non-null type kotlin.Int");
                            result.success(c6182c30.I(((Integer) obj20).intValue()));
                            return;
                        }
                        break;
                    case 1084758859:
                        if (str.equals("getProperty")) {
                            C6182c c6182c31 = f46468d;
                            AbstractC4862t.b(c6182c31);
                            result.success(c6182c31.t((String) list.get(0)));
                            return;
                        }
                        break;
                    case 1163405254:
                        if (str.equals("getAllowedCapturePolicy")) {
                            C6182c c6182c32 = f46468d;
                            AbstractC4862t.b(c6182c32);
                            result.success(c6182c32.m());
                            return;
                        }
                        break;
                    case 1187450940:
                        if (str.equals("setStreamVolume")) {
                            C6182c c6182c33 = f46468d;
                            AbstractC4862t.b(c6182c33);
                            Object obj21 = list.get(0);
                            AbstractC4862t.c(obj21, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue6 = ((Integer) obj21).intValue();
                            Object obj22 = list.get(1);
                            AbstractC4862t.c(obj22, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue7 = ((Integer) obj22).intValue();
                            Object obj23 = list.get(2);
                            AbstractC4862t.c(obj23, "null cannot be cast to non-null type kotlin.Int");
                            result.success(c6182c33.Z(iIntValue6, iIntValue7, ((Integer) obj23).intValue()));
                            return;
                        }
                        break;
                    case 1241312831:
                        if (str.equals("clearCommunicationDevice")) {
                            C6182c c6182c34 = f46468d;
                            AbstractC4862t.b(c6182c34);
                            result.success(c6182c34.g());
                            return;
                        }
                        break;
                    case 1258134830:
                        if (str.equals("adjustSuggestedStreamVolume")) {
                            C6182c c6182c35 = f46468d;
                            AbstractC4862t.b(c6182c35);
                            Object obj24 = list.get(0);
                            AbstractC4862t.c(obj24, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue8 = ((Integer) obj24).intValue();
                            Object obj25 = list.get(1);
                            AbstractC4862t.c(obj25, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue9 = ((Integer) obj25).intValue();
                            Object obj26 = list.get(2);
                            AbstractC4862t.c(obj26, "null cannot be cast to non-null type kotlin.Int");
                            result.success(c6182c35.e(iIntValue8, iIntValue9, ((Integer) obj26).intValue()));
                            return;
                        }
                        break;
                    case 1357290231:
                        if (str.equals("abandonAudioFocus")) {
                            C6182c c6182c36 = f46468d;
                            AbstractC4862t.b(c6182c36);
                            result.success(Boolean.valueOf(c6182c36.b()));
                            return;
                        }
                        break;
                    case 1378317714:
                        if (str.equals("unloadSoundEffects")) {
                            C6182c c6182c37 = f46468d;
                            AbstractC4862t.b(c6182c37);
                            result.success(c6182c37.c0());
                            return;
                        }
                        break;
                    case 1397925922:
                        if (str.equals("setRingerMode")) {
                            C6182c c6182c38 = f46468d;
                            AbstractC4862t.b(c6182c38);
                            Object obj27 = list.get(0);
                            AbstractC4862t.c(obj27, "null cannot be cast to non-null type kotlin.Int");
                            result.success(c6182c38.X(((Integer) obj27).intValue()));
                            return;
                        }
                        break;
                    case 1504508844:
                        if (str.equals("playSoundEffect")) {
                            C6182c c6182c39 = f46468d;
                            AbstractC4862t.b(c6182c39);
                            Object obj28 = list.get(0);
                            AbstractC4862t.c(obj28, "null cannot be cast to non-null type kotlin.Int");
                            result.success(c6182c39.L(((Integer) obj28).intValue(), (Double) list.get(1)));
                            return;
                        }
                        break;
                    case 1570996442:
                        if (str.equals("getAvailableCommunicationDevices")) {
                            C6182c c6182c40 = f46468d;
                            AbstractC4862t.b(c6182c40);
                            result.success(c6182c40.n());
                            return;
                        }
                        break;
                    case 1984784677:
                        if (str.equals("setMode")) {
                            C6182c c6182c41 = f46468d;
                            AbstractC4862t.b(c6182c41);
                            Object obj29 = list.get(0);
                            AbstractC4862t.c(obj29, "null cannot be cast to non-null type kotlin.Int");
                            result.success(c6182c41.V(((Integer) obj29).intValue()));
                            return;
                        }
                        break;
                    case 1986792688:
                        if (str.equals("isVolumeFixed")) {
                            C6182c c6182c42 = f46468d;
                            AbstractC4862t.b(c6182c42);
                            result.success(c6182c42.J());
                            return;
                        }
                        break;
                    case 2093966320:
                        if (str.equals("generateAudioSessionId")) {
                            C6182c c6182c43 = f46468d;
                            AbstractC4862t.b(c6182c43);
                            result.success(c6182c43.l());
                            return;
                        }
                        break;
                }
            }
            result.notImplemented();
        } catch (Exception e10) {
            e10.printStackTrace();
            result.error("Error: " + e10, null, null);
        }
    }
}
