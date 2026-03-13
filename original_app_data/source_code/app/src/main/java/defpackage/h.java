package defpackage;

import defpackage.h;
import fc.C4029l;
import fc.InterfaceC4028k;
import gc.C4205s;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface h {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final a f35779O = a.f35780a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f35780a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final InterfaceC4028k f35781b = C4029l.b(new InterfaceC6082a() { // from class: e
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return h.a.d();
            }
        });

        public static final i d() {
            return new i();
        }

        public static /* synthetic */ void g(a aVar, BinaryMessenger binaryMessenger, h hVar, String str, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                str = "";
            }
            aVar.f(binaryMessenger, hVar, str);
        }

        public static final void h(h hVar, Object obj, BasicMessageChannel.Reply reply) {
            List listB;
            AbstractC4862t.e(reply, "reply");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type <root>.ToggleMessage");
            try {
                hVar.a((d) obj2);
                listB = C4205s.d(null);
            } catch (Throwable th) {
                listB = j.f38859a.b(th);
            }
            reply.reply(listB);
        }

        public static final void i(h hVar, Object obj, BasicMessageChannel.Reply reply) {
            List listB;
            AbstractC4862t.e(reply, "reply");
            try {
                listB = C4205s.d(hVar.isEnabled());
            } catch (Throwable th) {
                listB = j.f38859a.b(th);
            }
            reply.reply(listB);
        }

        public final MessageCodec e() {
            return (MessageCodec) f35781b.getValue();
        }

        public final void f(BinaryMessenger binaryMessenger, final h hVar, String messageChannelSuffix) {
            String str;
            AbstractC4862t.e(binaryMessenger, "binaryMessenger");
            AbstractC4862t.e(messageChannelSuffix, "messageChannelSuffix");
            if (messageChannelSuffix.length() > 0) {
                str = "." + messageChannelSuffix;
            } else {
                str = "";
            }
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.wakelock_plus_platform_interface.WakelockPlusApi.toggle" + str, e());
            if (hVar != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: f
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        h.a.h(hVar, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.wakelock_plus_platform_interface.WakelockPlusApi.isEnabled" + str, e());
            if (hVar != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: g
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        h.a.i(hVar, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
        }
    }

    void a(d dVar);

    c isEnabled();
}
