package io.flutter.plugins.googlemaps;

import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugins.googlemaps.Messages;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class Messages {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.CLASS)
    public @interface CanIgnoreReturnValue {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class FlutterError extends RuntimeException {
        public final String code;
        public final Object details;

        public FlutterError(String str, String str2, Object obj) {
            super(str2);
            this.code = str;
            this.details = obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface MapsApi {
        static /* synthetic */ void A(MapsApi mapsApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                mapsApi.updatePolygons((List) arrayList2.get(0), (List) arrayList2.get(1), (List) arrayList2.get(2));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void B(MapsApi mapsApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, mapsApi.getScreenCoordinate((PlatformLatLng) ((ArrayList) obj).get(0)));
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void E(MapsApi mapsApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                mapsApi.updateMarkers((List) arrayList2.get(0), (List) arrayList2.get(1), (List) arrayList2.get(2));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void H(MapsApi mapsApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                mapsApi.clearTileCache((String) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void I(MapsApi mapsApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                mapsApi.showInfoWindow((String) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void J(MapsApi mapsApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            mapsApi.waitForMap(new VoidResult() { // from class: io.flutter.plugins.googlemaps.Messages.MapsApi.1
                @Override // io.flutter.plugins.googlemaps.Messages.VoidResult
                public void error(Throwable th) {
                    reply.reply(Messages.wrapError(th));
                }

                @Override // io.flutter.plugins.googlemaps.Messages.VoidResult
                public void success() {
                    arrayList.add(0, null);
                    reply.reply(arrayList);
                }
            });
        }

        static /* synthetic */ void L(MapsApi mapsApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                mapsApi.animateCamera((PlatformCameraUpdate) arrayList2.get(0), (Long) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void M(MapsApi mapsApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, mapsApi.didLastStyleSucceed());
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void N(MapsApi mapsApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                mapsApi.updateHeatmaps((List) arrayList2.get(0), (List) arrayList2.get(1), (List) arrayList2.get(2));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void a(MapsApi mapsApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                mapsApi.updatePolylines((List) arrayList2.get(0), (List) arrayList2.get(1), (List) arrayList2.get(2));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void b(MapsApi mapsApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                mapsApi.hideInfoWindow((String) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void c(MapsApi mapsApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            mapsApi.takeSnapshot(new Result<byte[]>() { // from class: io.flutter.plugins.googlemaps.Messages.MapsApi.2
                @Override // io.flutter.plugins.googlemaps.Messages.Result
                public void error(Throwable th) {
                    reply.reply(Messages.wrapError(th));
                }

                @Override // io.flutter.plugins.googlemaps.Messages.Result
                public void success(byte[] bArr) {
                    arrayList.add(0, bArr);
                    reply.reply(arrayList);
                }
            });
        }

        static /* synthetic */ void f(MapsApi mapsApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                mapsApi.updateTileOverlays((List) arrayList2.get(0), (List) arrayList2.get(1), (List) arrayList2.get(2));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static MessageCodec<Object> getCodec() {
            return PigeonCodec.INSTANCE;
        }

        static /* synthetic */ void h(MapsApi mapsApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, mapsApi.getLatLng((PlatformPoint) ((ArrayList) obj).get(0)));
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void k(MapsApi mapsApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, mapsApi.isInfoWindowShown((String) ((ArrayList) obj).get(0)));
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void o(MapsApi mapsApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, mapsApi.isAdvancedMarkersAvailable());
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void q(MapsApi mapsApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                mapsApi.updateClusterManagers((List) arrayList2.get(0), (List) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void s(MapsApi mapsApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                mapsApi.updateGroundOverlays((List) arrayList2.get(0), (List) arrayList2.get(1), (List) arrayList2.get(2));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static void setUp(BinaryMessenger binaryMessenger, MapsApi mapsApi) {
            setUp(binaryMessenger, "", mapsApi);
        }

        static /* synthetic */ void t(MapsApi mapsApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                mapsApi.updateMapConfiguration((PlatformMapConfiguration) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void u(MapsApi mapsApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, mapsApi.getZoomLevel());
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void w(MapsApi mapsApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                mapsApi.updateCircles((List) arrayList2.get(0), (List) arrayList2.get(1), (List) arrayList2.get(2));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void x(MapsApi mapsApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                mapsApi.moveCamera((PlatformCameraUpdate) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void y(MapsApi mapsApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, mapsApi.getVisibleRegion());
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void z(MapsApi mapsApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, mapsApi.setStyle((String) ((ArrayList) obj).get(0)));
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        void animateCamera(PlatformCameraUpdate platformCameraUpdate, Long l10);

        void clearTileCache(String str);

        Boolean didLastStyleSucceed();

        PlatformLatLng getLatLng(PlatformPoint platformPoint);

        PlatformPoint getScreenCoordinate(PlatformLatLng platformLatLng);

        PlatformLatLngBounds getVisibleRegion();

        Double getZoomLevel();

        void hideInfoWindow(String str);

        Boolean isAdvancedMarkersAvailable();

        Boolean isInfoWindowShown(String str);

        void moveCamera(PlatformCameraUpdate platformCameraUpdate);

        Boolean setStyle(String str);

        void showInfoWindow(String str);

        void takeSnapshot(Result<byte[]> result);

        void updateCircles(List<PlatformCircle> list, List<PlatformCircle> list2, List<String> list3);

        void updateClusterManagers(List<PlatformClusterManager> list, List<String> list2);

        void updateGroundOverlays(List<PlatformGroundOverlay> list, List<PlatformGroundOverlay> list2, List<String> list3);

        void updateHeatmaps(List<PlatformHeatmap> list, List<PlatformHeatmap> list2, List<String> list3);

        void updateMapConfiguration(PlatformMapConfiguration platformMapConfiguration);

        void updateMarkers(List<PlatformMarker> list, List<PlatformMarker> list2, List<String> list3);

        void updatePolygons(List<PlatformPolygon> list, List<PlatformPolygon> list2, List<String> list3);

        void updatePolylines(List<PlatformPolyline> list, List<PlatformPolyline> list2, List<String> list3);

        void updateTileOverlays(List<PlatformTileOverlay> list, List<PlatformTileOverlay> list2, List<String> list3);

        void waitForMap(VoidResult voidResult);

        static void setUp(BinaryMessenger binaryMessenger, String str, final MapsApi mapsApi) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsApi.waitForMap" + str2, getCodec());
            if (mapsApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.e
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsApi.J(this.f37891a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsApi.updateMapConfiguration" + str2, getCodec());
            if (mapsApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.g
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsApi.t(this.f37895a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsApi.updateCircles" + str2, getCodec());
            if (mapsApi != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.l
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsApi.w(this.f37905a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsApi.updateHeatmaps" + str2, getCodec());
            if (mapsApi != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.m
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsApi.N(this.f37907a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsApi.updateClusterManagers" + str2, getCodec());
            if (mapsApi != null) {
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.n
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsApi.q(this.f37910a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsApi.updateMarkers" + str2, getCodec());
            if (mapsApi != null) {
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.o
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsApi.E(this.f37911a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsApi.updatePolygons" + str2, getCodec());
            if (mapsApi != null) {
                basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.q
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsApi.A(this.f37913a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsApi.updatePolylines" + str2, getCodec());
            if (mapsApi != null) {
                basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.r
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsApi.a(this.f37914a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsApi.updateTileOverlays" + str2, getCodec());
            if (mapsApi != null) {
                basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.s
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsApi.f(this.f37915a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsApi.updateGroundOverlays" + str2, getCodec());
            if (mapsApi != null) {
                basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.t
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsApi.s(this.f37916a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel10.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsApi.getScreenCoordinate" + str2, getCodec());
            if (mapsApi != null) {
                basicMessageChannel11.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.p
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsApi.B(this.f37912a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel11.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsApi.getLatLng" + str2, getCodec());
            if (mapsApi != null) {
                basicMessageChannel12.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.u
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsApi.h(this.f37917a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel12.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsApi.getVisibleRegion" + str2, getCodec());
            if (mapsApi != null) {
                basicMessageChannel13.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.v
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsApi.y(this.f37918a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel13.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsApi.moveCamera" + str2, getCodec());
            if (mapsApi != null) {
                basicMessageChannel14.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.w
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsApi.x(this.f37919a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel14.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel15 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsApi.animateCamera" + str2, getCodec());
            if (mapsApi != null) {
                basicMessageChannel15.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.x
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsApi.L(this.f37920a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel15.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel16 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsApi.getZoomLevel" + str2, getCodec());
            if (mapsApi != null) {
                basicMessageChannel16.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.y
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsApi.u(this.f37921a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel16.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel17 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsApi.showInfoWindow" + str2, getCodec());
            if (mapsApi != null) {
                basicMessageChannel17.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.z
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsApi.I(this.f37922a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel17.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel18 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsApi.hideInfoWindow" + str2, getCodec());
            if (mapsApi != null) {
                basicMessageChannel18.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.A
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsApi.b(this.f37831a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel18.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel19 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsApi.isInfoWindowShown" + str2, getCodec());
            if (mapsApi != null) {
                basicMessageChannel19.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.B
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsApi.k(this.f37832a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel19.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel20 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsApi.setStyle" + str2, getCodec());
            if (mapsApi != null) {
                basicMessageChannel20.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.f
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsApi.z(this.f37893a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel20.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel21 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsApi.didLastStyleSucceed" + str2, getCodec());
            if (mapsApi != null) {
                basicMessageChannel21.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.h
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsApi.M(this.f37897a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel21.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel22 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsApi.isAdvancedMarkersAvailable" + str2, getCodec());
            if (mapsApi != null) {
                basicMessageChannel22.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.i
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsApi.o(this.f37899a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel22.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel23 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsApi.clearTileCache" + str2, getCodec());
            if (mapsApi != null) {
                basicMessageChannel23.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.j
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsApi.H(this.f37901a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel23.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel24 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsApi.takeSnapshot" + str2, getCodec());
            if (mapsApi != null) {
                basicMessageChannel24.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.k
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsApi.c(this.f37903a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel24.setMessageHandler(null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class MapsCallbackApi {
        private final BinaryMessenger binaryMessenger;
        private final String messageChannelSuffix;

        public MapsCallbackApi(BinaryMessenger binaryMessenger) {
            this(binaryMessenger, "");
        }

        public static /* synthetic */ void a(VoidResult voidResult, String str, Object obj) {
            if (!(obj instanceof List)) {
                voidResult.error(Messages.createConnectionError(str));
                return;
            }
            List list = (List) obj;
            if (list.size() > 1) {
                voidResult.error(new FlutterError((String) list.get(0), (String) list.get(1), list.get(2)));
            } else {
                voidResult.success();
            }
        }

        public static /* synthetic */ void b(Result result, String str, Object obj) {
            if (!(obj instanceof List)) {
                result.error(Messages.createConnectionError(str));
                return;
            }
            List list = (List) obj;
            if (list.size() > 1) {
                result.error(new FlutterError((String) list.get(0), (String) list.get(1), list.get(2)));
            } else if (list.get(0) == null) {
                result.error(new FlutterError("null-error", "Flutter api returned null value for non-null return value.", ""));
            } else {
                result.success((PlatformTile) list.get(0));
            }
        }

        public static /* synthetic */ void c(VoidResult voidResult, String str, Object obj) {
            if (!(obj instanceof List)) {
                voidResult.error(Messages.createConnectionError(str));
                return;
            }
            List list = (List) obj;
            if (list.size() > 1) {
                voidResult.error(new FlutterError((String) list.get(0), (String) list.get(1), list.get(2)));
            } else {
                voidResult.success();
            }
        }

        public static /* synthetic */ void d(VoidResult voidResult, String str, Object obj) {
            if (!(obj instanceof List)) {
                voidResult.error(Messages.createConnectionError(str));
                return;
            }
            List list = (List) obj;
            if (list.size() > 1) {
                voidResult.error(new FlutterError((String) list.get(0), (String) list.get(1), list.get(2)));
            } else {
                voidResult.success();
            }
        }

        public static /* synthetic */ void e(VoidResult voidResult, String str, Object obj) {
            if (!(obj instanceof List)) {
                voidResult.error(Messages.createConnectionError(str));
                return;
            }
            List list = (List) obj;
            if (list.size() > 1) {
                voidResult.error(new FlutterError((String) list.get(0), (String) list.get(1), list.get(2)));
            } else {
                voidResult.success();
            }
        }

        public static /* synthetic */ void f(VoidResult voidResult, String str, Object obj) {
            if (!(obj instanceof List)) {
                voidResult.error(Messages.createConnectionError(str));
                return;
            }
            List list = (List) obj;
            if (list.size() > 1) {
                voidResult.error(new FlutterError((String) list.get(0), (String) list.get(1), list.get(2)));
            } else {
                voidResult.success();
            }
        }

        public static /* synthetic */ void g(VoidResult voidResult, String str, Object obj) {
            if (!(obj instanceof List)) {
                voidResult.error(Messages.createConnectionError(str));
                return;
            }
            List list = (List) obj;
            if (list.size() > 1) {
                voidResult.error(new FlutterError((String) list.get(0), (String) list.get(1), list.get(2)));
            } else {
                voidResult.success();
            }
        }

        public static MessageCodec<Object> getCodec() {
            return PigeonCodec.INSTANCE;
        }

        public static /* synthetic */ void h(VoidResult voidResult, String str, Object obj) {
            if (!(obj instanceof List)) {
                voidResult.error(Messages.createConnectionError(str));
                return;
            }
            List list = (List) obj;
            if (list.size() > 1) {
                voidResult.error(new FlutterError((String) list.get(0), (String) list.get(1), list.get(2)));
            } else {
                voidResult.success();
            }
        }

        public static /* synthetic */ void i(VoidResult voidResult, String str, Object obj) {
            if (!(obj instanceof List)) {
                voidResult.error(Messages.createConnectionError(str));
                return;
            }
            List list = (List) obj;
            if (list.size() > 1) {
                voidResult.error(new FlutterError((String) list.get(0), (String) list.get(1), list.get(2)));
            } else {
                voidResult.success();
            }
        }

        public static /* synthetic */ void j(VoidResult voidResult, String str, Object obj) {
            if (!(obj instanceof List)) {
                voidResult.error(Messages.createConnectionError(str));
                return;
            }
            List list = (List) obj;
            if (list.size() > 1) {
                voidResult.error(new FlutterError((String) list.get(0), (String) list.get(1), list.get(2)));
            } else {
                voidResult.success();
            }
        }

        public static /* synthetic */ void k(VoidResult voidResult, String str, Object obj) {
            if (!(obj instanceof List)) {
                voidResult.error(Messages.createConnectionError(str));
                return;
            }
            List list = (List) obj;
            if (list.size() > 1) {
                voidResult.error(new FlutterError((String) list.get(0), (String) list.get(1), list.get(2)));
            } else {
                voidResult.success();
            }
        }

        public static /* synthetic */ void l(VoidResult voidResult, String str, Object obj) {
            if (!(obj instanceof List)) {
                voidResult.error(Messages.createConnectionError(str));
                return;
            }
            List list = (List) obj;
            if (list.size() > 1) {
                voidResult.error(new FlutterError((String) list.get(0), (String) list.get(1), list.get(2)));
            } else {
                voidResult.success();
            }
        }

        public static /* synthetic */ void m(VoidResult voidResult, String str, Object obj) {
            if (!(obj instanceof List)) {
                voidResult.error(Messages.createConnectionError(str));
                return;
            }
            List list = (List) obj;
            if (list.size() > 1) {
                voidResult.error(new FlutterError((String) list.get(0), (String) list.get(1), list.get(2)));
            } else {
                voidResult.success();
            }
        }

        public static /* synthetic */ void n(VoidResult voidResult, String str, Object obj) {
            if (!(obj instanceof List)) {
                voidResult.error(Messages.createConnectionError(str));
                return;
            }
            List list = (List) obj;
            if (list.size() > 1) {
                voidResult.error(new FlutterError((String) list.get(0), (String) list.get(1), list.get(2)));
            } else {
                voidResult.success();
            }
        }

        public static /* synthetic */ void o(VoidResult voidResult, String str, Object obj) {
            if (!(obj instanceof List)) {
                voidResult.error(Messages.createConnectionError(str));
                return;
            }
            List list = (List) obj;
            if (list.size() > 1) {
                voidResult.error(new FlutterError((String) list.get(0), (String) list.get(1), list.get(2)));
            } else {
                voidResult.success();
            }
        }

        public static /* synthetic */ void p(VoidResult voidResult, String str, Object obj) {
            if (!(obj instanceof List)) {
                voidResult.error(Messages.createConnectionError(str));
                return;
            }
            List list = (List) obj;
            if (list.size() > 1) {
                voidResult.error(new FlutterError((String) list.get(0), (String) list.get(1), list.get(2)));
            } else {
                voidResult.success();
            }
        }

        public void getTileOverlayTile(String str, PlatformPoint platformPoint, Long l10, final Result<PlatformTile> result) {
            final String str2 = "dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.getTileOverlayTile" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str2, getCodec()).send(new ArrayList(Arrays.asList(str, platformPoint, l10)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.googlemaps.S
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    Messages.MapsCallbackApi.b(result, str2, obj);
                }
            });
        }

        public void onCameraIdle(final VoidResult voidResult) {
            final String str = "dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onCameraIdle" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str, getCodec()).send(null, new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.googlemaps.F
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    Messages.MapsCallbackApi.f(voidResult, str, obj);
                }
            });
        }

        public void onCameraMove(PlatformCameraPosition platformCameraPosition, final VoidResult voidResult) {
            final String str = "dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onCameraMove" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str, getCodec()).send(new ArrayList(Collections.singletonList(platformCameraPosition)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.googlemaps.L
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    Messages.MapsCallbackApi.c(voidResult, str, obj);
                }
            });
        }

        public void onCameraMoveStarted(final VoidResult voidResult) {
            final String str = "dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onCameraMoveStarted" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str, getCodec()).send(null, new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.googlemaps.O
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    Messages.MapsCallbackApi.a(voidResult, str, obj);
                }
            });
        }

        public void onCircleTap(String str, final VoidResult voidResult) {
            final String str2 = "dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onCircleTap" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str2, getCodec()).send(new ArrayList(Collections.singletonList(str)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.googlemaps.G
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    Messages.MapsCallbackApi.o(voidResult, str2, obj);
                }
            });
        }

        public void onClusterTap(PlatformCluster platformCluster, final VoidResult voidResult) {
            final String str = "dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onClusterTap" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str, getCodec()).send(new ArrayList(Collections.singletonList(platformCluster)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.googlemaps.N
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    Messages.MapsCallbackApi.e(voidResult, str, obj);
                }
            });
        }

        public void onGroundOverlayTap(String str, final VoidResult voidResult) {
            final String str2 = "dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onGroundOverlayTap" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str2, getCodec()).send(new ArrayList(Collections.singletonList(str)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.googlemaps.I
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    Messages.MapsCallbackApi.p(voidResult, str2, obj);
                }
            });
        }

        public void onInfoWindowTap(String str, final VoidResult voidResult) {
            final String str2 = "dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onInfoWindowTap" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str2, getCodec()).send(new ArrayList(Collections.singletonList(str)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.googlemaps.H
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    Messages.MapsCallbackApi.g(voidResult, str2, obj);
                }
            });
        }

        public void onLongPress(PlatformLatLng platformLatLng, final VoidResult voidResult) {
            final String str = "dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onLongPress" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str, getCodec()).send(new ArrayList(Collections.singletonList(platformLatLng)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.googlemaps.J
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    Messages.MapsCallbackApi.h(voidResult, str, obj);
                }
            });
        }

        public void onMarkerDrag(String str, PlatformLatLng platformLatLng, final VoidResult voidResult) {
            final String str2 = "dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onMarkerDrag" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str2, getCodec()).send(new ArrayList(Arrays.asList(str, platformLatLng)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.googlemaps.D
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    Messages.MapsCallbackApi.l(voidResult, str2, obj);
                }
            });
        }

        public void onMarkerDragEnd(String str, PlatformLatLng platformLatLng, final VoidResult voidResult) {
            final String str2 = "dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onMarkerDragEnd" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str2, getCodec()).send(new ArrayList(Arrays.asList(str, platformLatLng)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.googlemaps.C
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    Messages.MapsCallbackApi.i(voidResult, str2, obj);
                }
            });
        }

        public void onMarkerDragStart(String str, PlatformLatLng platformLatLng, final VoidResult voidResult) {
            final String str2 = "dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onMarkerDragStart" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str2, getCodec()).send(new ArrayList(Arrays.asList(str, platformLatLng)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.googlemaps.M
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    Messages.MapsCallbackApi.m(voidResult, str2, obj);
                }
            });
        }

        public void onMarkerTap(String str, final VoidResult voidResult) {
            final String str2 = "dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onMarkerTap" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str2, getCodec()).send(new ArrayList(Collections.singletonList(str)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.googlemaps.Q
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    Messages.MapsCallbackApi.n(voidResult, str2, obj);
                }
            });
        }

        public void onPolygonTap(String str, final VoidResult voidResult) {
            final String str2 = "dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onPolygonTap" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str2, getCodec()).send(new ArrayList(Collections.singletonList(str)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.googlemaps.E
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    Messages.MapsCallbackApi.k(voidResult, str2, obj);
                }
            });
        }

        public void onPolylineTap(String str, final VoidResult voidResult) {
            final String str2 = "dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onPolylineTap" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str2, getCodec()).send(new ArrayList(Collections.singletonList(str)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.googlemaps.K
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    Messages.MapsCallbackApi.d(voidResult, str2, obj);
                }
            });
        }

        public void onTap(PlatformLatLng platformLatLng, final VoidResult voidResult) {
            final String str = "dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onTap" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str, getCodec()).send(new ArrayList(Collections.singletonList(platformLatLng)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.googlemaps.P
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    Messages.MapsCallbackApi.j(voidResult, str, obj);
                }
            });
        }

        public MapsCallbackApi(BinaryMessenger binaryMessenger, String str) {
            String str2;
            this.binaryMessenger = binaryMessenger;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            this.messageChannelSuffix = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface MapsInitializerApi {
        static /* synthetic */ void a(MapsInitializerApi mapsInitializerApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            mapsInitializerApi.initializeWithPreferredRenderer((PlatformRendererType) ((ArrayList) obj).get(0), new Result<PlatformRendererType>() { // from class: io.flutter.plugins.googlemaps.Messages.MapsInitializerApi.1
                @Override // io.flutter.plugins.googlemaps.Messages.Result
                public void error(Throwable th) {
                    reply.reply(Messages.wrapError(th));
                }

                @Override // io.flutter.plugins.googlemaps.Messages.Result
                public void success(PlatformRendererType platformRendererType) {
                    arrayList.add(0, platformRendererType);
                    reply.reply(arrayList);
                }
            });
        }

        static /* synthetic */ void b(MapsInitializerApi mapsInitializerApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                mapsInitializerApi.warmup();
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static MessageCodec<Object> getCodec() {
            return PigeonCodec.INSTANCE;
        }

        static void setUp(BinaryMessenger binaryMessenger, MapsInitializerApi mapsInitializerApi) {
            setUp(binaryMessenger, "", mapsInitializerApi);
        }

        void initializeWithPreferredRenderer(PlatformRendererType platformRendererType, Result<PlatformRendererType> result);

        void warmup();

        static void setUp(BinaryMessenger binaryMessenger, String str, final MapsInitializerApi mapsInitializerApi) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsInitializerApi.initializeWithPreferredRenderer" + str2, getCodec());
            if (mapsInitializerApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.T
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsInitializerApi.a(this.f37874a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsInitializerApi.warmup" + str2, getCodec());
            if (mapsInitializerApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.U
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsInitializerApi.b(this.f37877a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface MapsInspectorApi {
        static /* synthetic */ void C(MapsInspectorApi mapsInspectorApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, mapsInspectorApi.areRotateGesturesEnabled());
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void D(MapsInspectorApi mapsInspectorApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, mapsInspectorApi.areZoomControlsEnabled());
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void F(MapsInspectorApi mapsInspectorApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, mapsInspectorApi.getTileOverlayInfo((String) ((ArrayList) obj).get(0)));
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void G(MapsInspectorApi mapsInspectorApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, mapsInspectorApi.areZoomGesturesEnabled());
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void K(MapsInspectorApi mapsInspectorApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, mapsInspectorApi.isMapToolbarEnabled());
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void O(MapsInspectorApi mapsInspectorApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, mapsInspectorApi.isTrafficEnabled());
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void e(MapsInspectorApi mapsInspectorApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, mapsInspectorApi.getZoomRange());
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void g(MapsInspectorApi mapsInspectorApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, mapsInspectorApi.areBuildingsEnabled());
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static MessageCodec<Object> getCodec() {
            return PigeonCodec.INSTANCE;
        }

        static /* synthetic */ void i(MapsInspectorApi mapsInspectorApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, mapsInspectorApi.isMyLocationButtonEnabled());
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void j(MapsInspectorApi mapsInspectorApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, mapsInspectorApi.areScrollGesturesEnabled());
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void l(MapsInspectorApi mapsInspectorApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, mapsInspectorApi.isCompassEnabled());
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void m(MapsInspectorApi mapsInspectorApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, mapsInspectorApi.isLiteModeEnabled());
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void n(MapsInspectorApi mapsInspectorApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, mapsInspectorApi.areTiltGesturesEnabled());
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void p(MapsInspectorApi mapsInspectorApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, mapsInspectorApi.getClusters((String) ((ArrayList) obj).get(0)));
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static /* synthetic */ void r(MapsInspectorApi mapsInspectorApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, mapsInspectorApi.getGroundOverlayInfo((String) ((ArrayList) obj).get(0)));
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static void setUp(BinaryMessenger binaryMessenger, MapsInspectorApi mapsInspectorApi) {
            setUp(binaryMessenger, "", mapsInspectorApi);
        }

        static /* synthetic */ void v(MapsInspectorApi mapsInspectorApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, mapsInspectorApi.getCameraPosition());
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        Boolean areBuildingsEnabled();

        Boolean areRotateGesturesEnabled();

        Boolean areScrollGesturesEnabled();

        Boolean areTiltGesturesEnabled();

        Boolean areZoomControlsEnabled();

        Boolean areZoomGesturesEnabled();

        PlatformCameraPosition getCameraPosition();

        List<PlatformCluster> getClusters(String str);

        PlatformGroundOverlay getGroundOverlayInfo(String str);

        PlatformTileLayer getTileOverlayInfo(String str);

        PlatformZoomRange getZoomRange();

        Boolean isCompassEnabled();

        Boolean isLiteModeEnabled();

        Boolean isMapToolbarEnabled();

        Boolean isMyLocationButtonEnabled();

        Boolean isTrafficEnabled();

        static void setUp(BinaryMessenger binaryMessenger, String str, final MapsInspectorApi mapsInspectorApi) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsInspectorApi.areBuildingsEnabled" + str2, getCodec());
            if (mapsInspectorApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.V
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsInspectorApi.g(this.f37878a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsInspectorApi.areRotateGesturesEnabled" + str2, getCodec());
            if (mapsInspectorApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.i0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsInspectorApi.C(this.f37900a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsInspectorApi.areZoomControlsEnabled" + str2, getCodec());
            if (mapsInspectorApi != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.j0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsInspectorApi.D(this.f37902a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsInspectorApi.areScrollGesturesEnabled" + str2, getCodec());
            if (mapsInspectorApi != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.k0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsInspectorApi.j(this.f37904a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsInspectorApi.areTiltGesturesEnabled" + str2, getCodec());
            if (mapsInspectorApi != null) {
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.W
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsInspectorApi.n(this.f37879a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsInspectorApi.areZoomGesturesEnabled" + str2, getCodec());
            if (mapsInspectorApi != null) {
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.X
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsInspectorApi.G(this.f37880a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsInspectorApi.isCompassEnabled" + str2, getCodec());
            if (mapsInspectorApi != null) {
                basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.Y
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsInspectorApi.l(this.f37881a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsInspectorApi.isLiteModeEnabled" + str2, getCodec());
            if (mapsInspectorApi != null) {
                basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.Z
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsInspectorApi.m(this.f37882a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsInspectorApi.isMapToolbarEnabled" + str2, getCodec());
            if (mapsInspectorApi != null) {
                basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.a0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsInspectorApi.K(this.f37884a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsInspectorApi.isMyLocationButtonEnabled" + str2, getCodec());
            if (mapsInspectorApi != null) {
                basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.b0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsInspectorApi.i(this.f37886a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel10.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsInspectorApi.isTrafficEnabled" + str2, getCodec());
            if (mapsInspectorApi != null) {
                basicMessageChannel11.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.c0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsInspectorApi.O(this.f37888a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel11.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsInspectorApi.getTileOverlayInfo" + str2, getCodec());
            if (mapsInspectorApi != null) {
                basicMessageChannel12.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.d0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsInspectorApi.F(this.f37890a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel12.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsInspectorApi.getGroundOverlayInfo" + str2, getCodec());
            if (mapsInspectorApi != null) {
                basicMessageChannel13.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.e0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsInspectorApi.r(this.f37892a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel13.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsInspectorApi.getZoomRange" + str2, getCodec());
            if (mapsInspectorApi != null) {
                basicMessageChannel14.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.f0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsInspectorApi.e(this.f37894a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel14.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel15 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsInspectorApi.getClusters" + str2, getCodec());
            if (mapsInspectorApi != null) {
                basicMessageChannel15.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.g0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsInspectorApi.p(this.f37896a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel15.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel16 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsInspectorApi.getCameraPosition" + str2, getCodec());
            if (mapsInspectorApi != null) {
                basicMessageChannel16.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.h0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsInspectorApi.v(this.f37898a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel16.setMessageHandler(null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface MapsPlatformViewApi {
        static /* synthetic */ void a(MapsPlatformViewApi mapsPlatformViewApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                mapsPlatformViewApi.createView((PlatformMapViewCreationParams) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static MessageCodec<Object> getCodec() {
            return PigeonCodec.INSTANCE;
        }

        static void setUp(BinaryMessenger binaryMessenger, MapsPlatformViewApi mapsPlatformViewApi) {
            setUp(binaryMessenger, "", mapsPlatformViewApi);
        }

        void createView(PlatformMapViewCreationParams platformMapViewCreationParams);

        static void setUp(BinaryMessenger binaryMessenger, String str, final MapsPlatformViewApi mapsPlatformViewApi) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.google_maps_flutter_android.MapsPlatformViewApi.createView" + str2, getCodec());
            if (mapsPlatformViewApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlemaps.l0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.MapsPlatformViewApi.a(this.f37906a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface NullableResult<T> {
        void error(Throwable th);

        void success(T t10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class PigeonCodec extends StandardMessageCodec {
        public static final PigeonCodec INSTANCE = new PigeonCodec();

        private PigeonCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b10, ByteBuffer byteBuffer) {
            switch (b10) {
                case -127:
                    Object value = readValue(byteBuffer);
                    if (value == null) {
                        return null;
                    }
                    return PlatformMapType.values()[((Long) value).intValue()];
                case -126:
                    Object value2 = readValue(byteBuffer);
                    if (value2 == null) {
                        return null;
                    }
                    return PlatformRendererType.values()[((Long) value2).intValue()];
                case -125:
                    Object value3 = readValue(byteBuffer);
                    if (value3 == null) {
                        return null;
                    }
                    return PlatformMarkerCollisionBehavior.values()[((Long) value3).intValue()];
                case -124:
                    Object value4 = readValue(byteBuffer);
                    if (value4 == null) {
                        return null;
                    }
                    return PlatformJointType.values()[((Long) value4).intValue()];
                case -123:
                    Object value5 = readValue(byteBuffer);
                    if (value5 == null) {
                        return null;
                    }
                    return PlatformCapType.values()[((Long) value5).intValue()];
                case -122:
                    Object value6 = readValue(byteBuffer);
                    if (value6 == null) {
                        return null;
                    }
                    return PlatformPatternItemType.values()[((Long) value6).intValue()];
                case -121:
                    Object value7 = readValue(byteBuffer);
                    if (value7 == null) {
                        return null;
                    }
                    return PlatformMarkerType.values()[((Long) value7).intValue()];
                case -120:
                    Object value8 = readValue(byteBuffer);
                    if (value8 == null) {
                        return null;
                    }
                    return PlatformMapBitmapScaling.values()[((Long) value8).intValue()];
                case -119:
                    return PlatformCameraPosition.fromList((ArrayList) readValue(byteBuffer));
                case -118:
                    return PlatformCameraUpdate.fromList((ArrayList) readValue(byteBuffer));
                case -117:
                    return PlatformCameraUpdateNewCameraPosition.fromList((ArrayList) readValue(byteBuffer));
                case -116:
                    return PlatformCameraUpdateNewLatLng.fromList((ArrayList) readValue(byteBuffer));
                case -115:
                    return PlatformCameraUpdateNewLatLngBounds.fromList((ArrayList) readValue(byteBuffer));
                case -114:
                    return PlatformCameraUpdateNewLatLngZoom.fromList((ArrayList) readValue(byteBuffer));
                case -113:
                    return PlatformCameraUpdateScrollBy.fromList((ArrayList) readValue(byteBuffer));
                case -112:
                    return PlatformCameraUpdateZoomBy.fromList((ArrayList) readValue(byteBuffer));
                case -111:
                    return PlatformCameraUpdateZoom.fromList((ArrayList) readValue(byteBuffer));
                case -110:
                    return PlatformCameraUpdateZoomTo.fromList((ArrayList) readValue(byteBuffer));
                case -109:
                    return PlatformCircle.fromList((ArrayList) readValue(byteBuffer));
                case -108:
                    return PlatformHeatmap.fromList((ArrayList) readValue(byteBuffer));
                case -107:
                    return PlatformHeatmapGradient.fromList((ArrayList) readValue(byteBuffer));
                case -106:
                    return PlatformWeightedLatLng.fromList((ArrayList) readValue(byteBuffer));
                case -105:
                    return PlatformClusterManager.fromList((ArrayList) readValue(byteBuffer));
                case -104:
                    return PlatformDoublePair.fromList((ArrayList) readValue(byteBuffer));
                case -103:
                    return PlatformColor.fromList((ArrayList) readValue(byteBuffer));
                case -102:
                    return PlatformInfoWindow.fromList((ArrayList) readValue(byteBuffer));
                case -101:
                    return PlatformMarker.fromList((ArrayList) readValue(byteBuffer));
                case -100:
                    return PlatformPolygon.fromList((ArrayList) readValue(byteBuffer));
                case -99:
                    return PlatformPolyline.fromList((ArrayList) readValue(byteBuffer));
                case -98:
                    return PlatformCap.fromList((ArrayList) readValue(byteBuffer));
                case -97:
                    return PlatformPatternItem.fromList((ArrayList) readValue(byteBuffer));
                case -96:
                    return PlatformTile.fromList((ArrayList) readValue(byteBuffer));
                case -95:
                    return PlatformTileOverlay.fromList((ArrayList) readValue(byteBuffer));
                case -94:
                    return PlatformEdgeInsets.fromList((ArrayList) readValue(byteBuffer));
                case -93:
                    return PlatformLatLng.fromList((ArrayList) readValue(byteBuffer));
                case -92:
                    return PlatformLatLngBounds.fromList((ArrayList) readValue(byteBuffer));
                case -91:
                    return PlatformCluster.fromList((ArrayList) readValue(byteBuffer));
                case -90:
                    return PlatformGroundOverlay.fromList((ArrayList) readValue(byteBuffer));
                case -89:
                    return PlatformCameraTargetBounds.fromList((ArrayList) readValue(byteBuffer));
                case -88:
                    return PlatformMapViewCreationParams.fromList((ArrayList) readValue(byteBuffer));
                case -87:
                    return PlatformMapConfiguration.fromList((ArrayList) readValue(byteBuffer));
                case -86:
                    return PlatformPoint.fromList((ArrayList) readValue(byteBuffer));
                case -85:
                    return PlatformTileLayer.fromList((ArrayList) readValue(byteBuffer));
                case -84:
                    return PlatformZoomRange.fromList((ArrayList) readValue(byteBuffer));
                case -83:
                    return PlatformBitmap.fromList((ArrayList) readValue(byteBuffer));
                case -82:
                    return PlatformBitmapDefaultMarker.fromList((ArrayList) readValue(byteBuffer));
                case -81:
                    return PlatformBitmapBytes.fromList((ArrayList) readValue(byteBuffer));
                case -80:
                    return PlatformBitmapAsset.fromList((ArrayList) readValue(byteBuffer));
                case -79:
                    return PlatformBitmapAssetImage.fromList((ArrayList) readValue(byteBuffer));
                case -78:
                    return PlatformBitmapAssetMap.fromList((ArrayList) readValue(byteBuffer));
                case -77:
                    return PlatformBitmapBytesMap.fromList((ArrayList) readValue(byteBuffer));
                case -76:
                    return PlatformBitmapPinConfig.fromList((ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b10, byteBuffer);
            }
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof PlatformMapType) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, Integer.valueOf(((PlatformMapType) obj).index));
                return;
            }
            if (obj instanceof PlatformRendererType) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, Integer.valueOf(((PlatformRendererType) obj).index));
                return;
            }
            if (obj instanceof PlatformMarkerCollisionBehavior) {
                byteArrayOutputStream.write(131);
                writeValue(byteArrayOutputStream, Integer.valueOf(((PlatformMarkerCollisionBehavior) obj).index));
                return;
            }
            if (obj instanceof PlatformJointType) {
                byteArrayOutputStream.write(132);
                writeValue(byteArrayOutputStream, Integer.valueOf(((PlatformJointType) obj).index));
                return;
            }
            if (obj instanceof PlatformCapType) {
                byteArrayOutputStream.write(133);
                writeValue(byteArrayOutputStream, Integer.valueOf(((PlatformCapType) obj).index));
                return;
            }
            if (obj instanceof PlatformPatternItemType) {
                byteArrayOutputStream.write(134);
                writeValue(byteArrayOutputStream, Integer.valueOf(((PlatformPatternItemType) obj).index));
                return;
            }
            if (obj instanceof PlatformMarkerType) {
                byteArrayOutputStream.write(135);
                writeValue(byteArrayOutputStream, Integer.valueOf(((PlatformMarkerType) obj).index));
                return;
            }
            if (obj instanceof PlatformMapBitmapScaling) {
                byteArrayOutputStream.write(136);
                writeValue(byteArrayOutputStream, Integer.valueOf(((PlatformMapBitmapScaling) obj).index));
                return;
            }
            if (obj instanceof PlatformCameraPosition) {
                byteArrayOutputStream.write(137);
                writeValue(byteArrayOutputStream, ((PlatformCameraPosition) obj).toList());
                return;
            }
            if (obj instanceof PlatformCameraUpdate) {
                byteArrayOutputStream.write(138);
                writeValue(byteArrayOutputStream, ((PlatformCameraUpdate) obj).toList());
                return;
            }
            if (obj instanceof PlatformCameraUpdateNewCameraPosition) {
                byteArrayOutputStream.write(139);
                writeValue(byteArrayOutputStream, ((PlatformCameraUpdateNewCameraPosition) obj).toList());
                return;
            }
            if (obj instanceof PlatformCameraUpdateNewLatLng) {
                byteArrayOutputStream.write(140);
                writeValue(byteArrayOutputStream, ((PlatformCameraUpdateNewLatLng) obj).toList());
                return;
            }
            if (obj instanceof PlatformCameraUpdateNewLatLngBounds) {
                byteArrayOutputStream.write(141);
                writeValue(byteArrayOutputStream, ((PlatformCameraUpdateNewLatLngBounds) obj).toList());
                return;
            }
            if (obj instanceof PlatformCameraUpdateNewLatLngZoom) {
                byteArrayOutputStream.write(142);
                writeValue(byteArrayOutputStream, ((PlatformCameraUpdateNewLatLngZoom) obj).toList());
                return;
            }
            if (obj instanceof PlatformCameraUpdateScrollBy) {
                byteArrayOutputStream.write(143);
                writeValue(byteArrayOutputStream, ((PlatformCameraUpdateScrollBy) obj).toList());
                return;
            }
            if (obj instanceof PlatformCameraUpdateZoomBy) {
                byteArrayOutputStream.write(144);
                writeValue(byteArrayOutputStream, ((PlatformCameraUpdateZoomBy) obj).toList());
                return;
            }
            if (obj instanceof PlatformCameraUpdateZoom) {
                byteArrayOutputStream.write(145);
                writeValue(byteArrayOutputStream, ((PlatformCameraUpdateZoom) obj).toList());
                return;
            }
            if (obj instanceof PlatformCameraUpdateZoomTo) {
                byteArrayOutputStream.write(146);
                writeValue(byteArrayOutputStream, ((PlatformCameraUpdateZoomTo) obj).toList());
                return;
            }
            if (obj instanceof PlatformCircle) {
                byteArrayOutputStream.write(147);
                writeValue(byteArrayOutputStream, ((PlatformCircle) obj).toList());
                return;
            }
            if (obj instanceof PlatformHeatmap) {
                byteArrayOutputStream.write(148);
                writeValue(byteArrayOutputStream, ((PlatformHeatmap) obj).toList());
                return;
            }
            if (obj instanceof PlatformHeatmapGradient) {
                byteArrayOutputStream.write(149);
                writeValue(byteArrayOutputStream, ((PlatformHeatmapGradient) obj).toList());
                return;
            }
            if (obj instanceof PlatformWeightedLatLng) {
                byteArrayOutputStream.write(150);
                writeValue(byteArrayOutputStream, ((PlatformWeightedLatLng) obj).toList());
                return;
            }
            if (obj instanceof PlatformClusterManager) {
                byteArrayOutputStream.write(151);
                writeValue(byteArrayOutputStream, ((PlatformClusterManager) obj).toList());
                return;
            }
            if (obj instanceof PlatformDoublePair) {
                byteArrayOutputStream.write(152);
                writeValue(byteArrayOutputStream, ((PlatformDoublePair) obj).toList());
                return;
            }
            if (obj instanceof PlatformColor) {
                byteArrayOutputStream.write(153);
                writeValue(byteArrayOutputStream, ((PlatformColor) obj).toList());
                return;
            }
            if (obj instanceof PlatformInfoWindow) {
                byteArrayOutputStream.write(154);
                writeValue(byteArrayOutputStream, ((PlatformInfoWindow) obj).toList());
                return;
            }
            if (obj instanceof PlatformMarker) {
                byteArrayOutputStream.write(ModuleDescriptor.MODULE_VERSION);
                writeValue(byteArrayOutputStream, ((PlatformMarker) obj).toList());
                return;
            }
            if (obj instanceof PlatformPolygon) {
                byteArrayOutputStream.write(156);
                writeValue(byteArrayOutputStream, ((PlatformPolygon) obj).toList());
                return;
            }
            if (obj instanceof PlatformPolyline) {
                byteArrayOutputStream.write(157);
                writeValue(byteArrayOutputStream, ((PlatformPolyline) obj).toList());
                return;
            }
            if (obj instanceof PlatformCap) {
                byteArrayOutputStream.write(158);
                writeValue(byteArrayOutputStream, ((PlatformCap) obj).toList());
                return;
            }
            if (obj instanceof PlatformPatternItem) {
                byteArrayOutputStream.write(159);
                writeValue(byteArrayOutputStream, ((PlatformPatternItem) obj).toList());
                return;
            }
            if (obj instanceof PlatformTile) {
                byteArrayOutputStream.write(160);
                writeValue(byteArrayOutputStream, ((PlatformTile) obj).toList());
                return;
            }
            if (obj instanceof PlatformTileOverlay) {
                byteArrayOutputStream.write(161);
                writeValue(byteArrayOutputStream, ((PlatformTileOverlay) obj).toList());
                return;
            }
            if (obj instanceof PlatformEdgeInsets) {
                byteArrayOutputStream.write(162);
                writeValue(byteArrayOutputStream, ((PlatformEdgeInsets) obj).toList());
                return;
            }
            if (obj instanceof PlatformLatLng) {
                byteArrayOutputStream.write(163);
                writeValue(byteArrayOutputStream, ((PlatformLatLng) obj).toList());
                return;
            }
            if (obj instanceof PlatformLatLngBounds) {
                byteArrayOutputStream.write(164);
                writeValue(byteArrayOutputStream, ((PlatformLatLngBounds) obj).toList());
                return;
            }
            if (obj instanceof PlatformCluster) {
                byteArrayOutputStream.write(165);
                writeValue(byteArrayOutputStream, ((PlatformCluster) obj).toList());
                return;
            }
            if (obj instanceof PlatformGroundOverlay) {
                byteArrayOutputStream.write(166);
                writeValue(byteArrayOutputStream, ((PlatformGroundOverlay) obj).toList());
                return;
            }
            if (obj instanceof PlatformCameraTargetBounds) {
                byteArrayOutputStream.write(167);
                writeValue(byteArrayOutputStream, ((PlatformCameraTargetBounds) obj).toList());
                return;
            }
            if (obj instanceof PlatformMapViewCreationParams) {
                byteArrayOutputStream.write(168);
                writeValue(byteArrayOutputStream, ((PlatformMapViewCreationParams) obj).toList());
                return;
            }
            if (obj instanceof PlatformMapConfiguration) {
                byteArrayOutputStream.write(169);
                writeValue(byteArrayOutputStream, ((PlatformMapConfiguration) obj).toList());
                return;
            }
            if (obj instanceof PlatformPoint) {
                byteArrayOutputStream.write(170);
                writeValue(byteArrayOutputStream, ((PlatformPoint) obj).toList());
                return;
            }
            if (obj instanceof PlatformTileLayer) {
                byteArrayOutputStream.write(171);
                writeValue(byteArrayOutputStream, ((PlatformTileLayer) obj).toList());
                return;
            }
            if (obj instanceof PlatformZoomRange) {
                byteArrayOutputStream.write(172);
                writeValue(byteArrayOutputStream, ((PlatformZoomRange) obj).toList());
                return;
            }
            if (obj instanceof PlatformBitmap) {
                byteArrayOutputStream.write(173);
                writeValue(byteArrayOutputStream, ((PlatformBitmap) obj).toList());
                return;
            }
            if (obj instanceof PlatformBitmapDefaultMarker) {
                byteArrayOutputStream.write(174);
                writeValue(byteArrayOutputStream, ((PlatformBitmapDefaultMarker) obj).toList());
                return;
            }
            if (obj instanceof PlatformBitmapBytes) {
                byteArrayOutputStream.write(175);
                writeValue(byteArrayOutputStream, ((PlatformBitmapBytes) obj).toList());
                return;
            }
            if (obj instanceof PlatformBitmapAsset) {
                byteArrayOutputStream.write(176);
                writeValue(byteArrayOutputStream, ((PlatformBitmapAsset) obj).toList());
                return;
            }
            if (obj instanceof PlatformBitmapAssetImage) {
                byteArrayOutputStream.write(177);
                writeValue(byteArrayOutputStream, ((PlatformBitmapAssetImage) obj).toList());
                return;
            }
            if (obj instanceof PlatformBitmapAssetMap) {
                byteArrayOutputStream.write(178);
                writeValue(byteArrayOutputStream, ((PlatformBitmapAssetMap) obj).toList());
            } else if (obj instanceof PlatformBitmapBytesMap) {
                byteArrayOutputStream.write(179);
                writeValue(byteArrayOutputStream, ((PlatformBitmapBytesMap) obj).toList());
            } else if (!(obj instanceof PlatformBitmapPinConfig)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(180);
                writeValue(byteArrayOutputStream, ((PlatformBitmapPinConfig) obj).toList());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformBitmap {
        private Object bitmap;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private Object bitmap;

            public PlatformBitmap build() {
                PlatformBitmap platformBitmap = new PlatformBitmap();
                platformBitmap.setBitmap(this.bitmap);
                return platformBitmap;
            }

            @CanIgnoreReturnValue
            public Builder setBitmap(Object obj) {
                this.bitmap = obj;
                return this;
            }
        }

        public static PlatformBitmap fromList(ArrayList<Object> arrayList) {
            PlatformBitmap platformBitmap = new PlatformBitmap();
            platformBitmap.setBitmap(arrayList.get(0));
            return platformBitmap;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformBitmap.class != obj.getClass()) {
                return false;
            }
            return this.bitmap.equals(((PlatformBitmap) obj).bitmap);
        }

        public Object getBitmap() {
            return this.bitmap;
        }

        public int hashCode() {
            return Objects.hash(this.bitmap);
        }

        public void setBitmap(Object obj) {
            if (obj == null) {
                throw new IllegalStateException("Nonnull field \"bitmap\" is null.");
            }
            this.bitmap = obj;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.bitmap);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformBitmapAsset {
        private String name;
        private String pkg;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private String name;
            private String pkg;

            public PlatformBitmapAsset build() {
                PlatformBitmapAsset platformBitmapAsset = new PlatformBitmapAsset();
                platformBitmapAsset.setName(this.name);
                platformBitmapAsset.setPkg(this.pkg);
                return platformBitmapAsset;
            }

            @CanIgnoreReturnValue
            public Builder setName(String str) {
                this.name = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPkg(String str) {
                this.pkg = str;
                return this;
            }
        }

        public static PlatformBitmapAsset fromList(ArrayList<Object> arrayList) {
            PlatformBitmapAsset platformBitmapAsset = new PlatformBitmapAsset();
            platformBitmapAsset.setName((String) arrayList.get(0));
            platformBitmapAsset.setPkg((String) arrayList.get(1));
            return platformBitmapAsset;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformBitmapAsset.class == obj.getClass()) {
                PlatformBitmapAsset platformBitmapAsset = (PlatformBitmapAsset) obj;
                if (this.name.equals(platformBitmapAsset.name) && Objects.equals(this.pkg, platformBitmapAsset.pkg)) {
                    return true;
                }
            }
            return false;
        }

        public String getName() {
            return this.name;
        }

        public String getPkg() {
            return this.pkg;
        }

        public int hashCode() {
            return Objects.hash(this.name, this.pkg);
        }

        public void setName(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"name\" is null.");
            }
            this.name = str;
        }

        public void setPkg(String str) {
            this.pkg = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.name);
            arrayList.add(this.pkg);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformBitmapAssetImage {
        private String name;
        private Double scale;
        private PlatformDoublePair size;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private String name;
            private Double scale;
            private PlatformDoublePair size;

            public PlatformBitmapAssetImage build() {
                PlatformBitmapAssetImage platformBitmapAssetImage = new PlatformBitmapAssetImage();
                platformBitmapAssetImage.setName(this.name);
                platformBitmapAssetImage.setScale(this.scale);
                platformBitmapAssetImage.setSize(this.size);
                return platformBitmapAssetImage;
            }

            @CanIgnoreReturnValue
            public Builder setName(String str) {
                this.name = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setScale(Double d10) {
                this.scale = d10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setSize(PlatformDoublePair platformDoublePair) {
                this.size = platformDoublePair;
                return this;
            }
        }

        public static PlatformBitmapAssetImage fromList(ArrayList<Object> arrayList) {
            PlatformBitmapAssetImage platformBitmapAssetImage = new PlatformBitmapAssetImage();
            platformBitmapAssetImage.setName((String) arrayList.get(0));
            platformBitmapAssetImage.setScale((Double) arrayList.get(1));
            platformBitmapAssetImage.setSize((PlatformDoublePair) arrayList.get(2));
            return platformBitmapAssetImage;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformBitmapAssetImage.class == obj.getClass()) {
                PlatformBitmapAssetImage platformBitmapAssetImage = (PlatformBitmapAssetImage) obj;
                if (this.name.equals(platformBitmapAssetImage.name) && this.scale.equals(platformBitmapAssetImage.scale) && Objects.equals(this.size, platformBitmapAssetImage.size)) {
                    return true;
                }
            }
            return false;
        }

        public String getName() {
            return this.name;
        }

        public Double getScale() {
            return this.scale;
        }

        public PlatformDoublePair getSize() {
            return this.size;
        }

        public int hashCode() {
            return Objects.hash(this.name, this.scale, this.size);
        }

        public void setName(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"name\" is null.");
            }
            this.name = str;
        }

        public void setScale(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"scale\" is null.");
            }
            this.scale = d10;
        }

        public void setSize(PlatformDoublePair platformDoublePair) {
            this.size = platformDoublePair;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.name);
            arrayList.add(this.scale);
            arrayList.add(this.size);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformBitmapAssetMap {
        private String assetName;
        private PlatformMapBitmapScaling bitmapScaling;
        private Double height;
        private Double imagePixelRatio;
        private Double width;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private String assetName;
            private PlatformMapBitmapScaling bitmapScaling;
            private Double height;
            private Double imagePixelRatio;
            private Double width;

            public PlatformBitmapAssetMap build() {
                PlatformBitmapAssetMap platformBitmapAssetMap = new PlatformBitmapAssetMap();
                platformBitmapAssetMap.setAssetName(this.assetName);
                platformBitmapAssetMap.setBitmapScaling(this.bitmapScaling);
                platformBitmapAssetMap.setImagePixelRatio(this.imagePixelRatio);
                platformBitmapAssetMap.setWidth(this.width);
                platformBitmapAssetMap.setHeight(this.height);
                return platformBitmapAssetMap;
            }

            @CanIgnoreReturnValue
            public Builder setAssetName(String str) {
                this.assetName = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setBitmapScaling(PlatformMapBitmapScaling platformMapBitmapScaling) {
                this.bitmapScaling = platformMapBitmapScaling;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setHeight(Double d10) {
                this.height = d10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setImagePixelRatio(Double d10) {
                this.imagePixelRatio = d10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setWidth(Double d10) {
                this.width = d10;
                return this;
            }
        }

        public static PlatformBitmapAssetMap fromList(ArrayList<Object> arrayList) {
            PlatformBitmapAssetMap platformBitmapAssetMap = new PlatformBitmapAssetMap();
            platformBitmapAssetMap.setAssetName((String) arrayList.get(0));
            platformBitmapAssetMap.setBitmapScaling((PlatformMapBitmapScaling) arrayList.get(1));
            platformBitmapAssetMap.setImagePixelRatio((Double) arrayList.get(2));
            platformBitmapAssetMap.setWidth((Double) arrayList.get(3));
            platformBitmapAssetMap.setHeight((Double) arrayList.get(4));
            return platformBitmapAssetMap;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformBitmapAssetMap.class == obj.getClass()) {
                PlatformBitmapAssetMap platformBitmapAssetMap = (PlatformBitmapAssetMap) obj;
                if (this.assetName.equals(platformBitmapAssetMap.assetName) && this.bitmapScaling.equals(platformBitmapAssetMap.bitmapScaling) && this.imagePixelRatio.equals(platformBitmapAssetMap.imagePixelRatio) && Objects.equals(this.width, platformBitmapAssetMap.width) && Objects.equals(this.height, platformBitmapAssetMap.height)) {
                    return true;
                }
            }
            return false;
        }

        public String getAssetName() {
            return this.assetName;
        }

        public PlatformMapBitmapScaling getBitmapScaling() {
            return this.bitmapScaling;
        }

        public Double getHeight() {
            return this.height;
        }

        public Double getImagePixelRatio() {
            return this.imagePixelRatio;
        }

        public Double getWidth() {
            return this.width;
        }

        public int hashCode() {
            return Objects.hash(this.assetName, this.bitmapScaling, this.imagePixelRatio, this.width, this.height);
        }

        public void setAssetName(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"assetName\" is null.");
            }
            this.assetName = str;
        }

        public void setBitmapScaling(PlatformMapBitmapScaling platformMapBitmapScaling) {
            if (platformMapBitmapScaling == null) {
                throw new IllegalStateException("Nonnull field \"bitmapScaling\" is null.");
            }
            this.bitmapScaling = platformMapBitmapScaling;
        }

        public void setHeight(Double d10) {
            this.height = d10;
        }

        public void setImagePixelRatio(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"imagePixelRatio\" is null.");
            }
            this.imagePixelRatio = d10;
        }

        public void setWidth(Double d10) {
            this.width = d10;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(5);
            arrayList.add(this.assetName);
            arrayList.add(this.bitmapScaling);
            arrayList.add(this.imagePixelRatio);
            arrayList.add(this.width);
            arrayList.add(this.height);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformBitmapBytes {
        private byte[] byteData;
        private PlatformDoublePair size;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private byte[] byteData;
            private PlatformDoublePair size;

            public PlatformBitmapBytes build() {
                PlatformBitmapBytes platformBitmapBytes = new PlatformBitmapBytes();
                platformBitmapBytes.setByteData(this.byteData);
                platformBitmapBytes.setSize(this.size);
                return platformBitmapBytes;
            }

            @CanIgnoreReturnValue
            public Builder setByteData(byte[] bArr) {
                this.byteData = bArr;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setSize(PlatformDoublePair platformDoublePair) {
                this.size = platformDoublePair;
                return this;
            }
        }

        public static PlatformBitmapBytes fromList(ArrayList<Object> arrayList) {
            PlatformBitmapBytes platformBitmapBytes = new PlatformBitmapBytes();
            platformBitmapBytes.setByteData((byte[]) arrayList.get(0));
            platformBitmapBytes.setSize((PlatformDoublePair) arrayList.get(1));
            return platformBitmapBytes;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformBitmapBytes.class == obj.getClass()) {
                PlatformBitmapBytes platformBitmapBytes = (PlatformBitmapBytes) obj;
                if (Arrays.equals(this.byteData, platformBitmapBytes.byteData) && Objects.equals(this.size, platformBitmapBytes.size)) {
                    return true;
                }
            }
            return false;
        }

        public byte[] getByteData() {
            return this.byteData;
        }

        public PlatformDoublePair getSize() {
            return this.size;
        }

        public int hashCode() {
            return (Objects.hash(this.size) * 31) + Arrays.hashCode(this.byteData);
        }

        public void setByteData(byte[] bArr) {
            if (bArr == null) {
                throw new IllegalStateException("Nonnull field \"byteData\" is null.");
            }
            this.byteData = bArr;
        }

        public void setSize(PlatformDoublePair platformDoublePair) {
            this.size = platformDoublePair;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.byteData);
            arrayList.add(this.size);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformBitmapBytesMap {
        private PlatformMapBitmapScaling bitmapScaling;
        private byte[] byteData;
        private Double height;
        private Double imagePixelRatio;
        private Double width;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private PlatformMapBitmapScaling bitmapScaling;
            private byte[] byteData;
            private Double height;
            private Double imagePixelRatio;
            private Double width;

            public PlatformBitmapBytesMap build() {
                PlatformBitmapBytesMap platformBitmapBytesMap = new PlatformBitmapBytesMap();
                platformBitmapBytesMap.setByteData(this.byteData);
                platformBitmapBytesMap.setBitmapScaling(this.bitmapScaling);
                platformBitmapBytesMap.setImagePixelRatio(this.imagePixelRatio);
                platformBitmapBytesMap.setWidth(this.width);
                platformBitmapBytesMap.setHeight(this.height);
                return platformBitmapBytesMap;
            }

            @CanIgnoreReturnValue
            public Builder setBitmapScaling(PlatformMapBitmapScaling platformMapBitmapScaling) {
                this.bitmapScaling = platformMapBitmapScaling;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setByteData(byte[] bArr) {
                this.byteData = bArr;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setHeight(Double d10) {
                this.height = d10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setImagePixelRatio(Double d10) {
                this.imagePixelRatio = d10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setWidth(Double d10) {
                this.width = d10;
                return this;
            }
        }

        public static PlatformBitmapBytesMap fromList(ArrayList<Object> arrayList) {
            PlatformBitmapBytesMap platformBitmapBytesMap = new PlatformBitmapBytesMap();
            platformBitmapBytesMap.setByteData((byte[]) arrayList.get(0));
            platformBitmapBytesMap.setBitmapScaling((PlatformMapBitmapScaling) arrayList.get(1));
            platformBitmapBytesMap.setImagePixelRatio((Double) arrayList.get(2));
            platformBitmapBytesMap.setWidth((Double) arrayList.get(3));
            platformBitmapBytesMap.setHeight((Double) arrayList.get(4));
            return platformBitmapBytesMap;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformBitmapBytesMap.class == obj.getClass()) {
                PlatformBitmapBytesMap platformBitmapBytesMap = (PlatformBitmapBytesMap) obj;
                if (Arrays.equals(this.byteData, platformBitmapBytesMap.byteData) && this.bitmapScaling.equals(platformBitmapBytesMap.bitmapScaling) && this.imagePixelRatio.equals(platformBitmapBytesMap.imagePixelRatio) && Objects.equals(this.width, platformBitmapBytesMap.width) && Objects.equals(this.height, platformBitmapBytesMap.height)) {
                    return true;
                }
            }
            return false;
        }

        public PlatformMapBitmapScaling getBitmapScaling() {
            return this.bitmapScaling;
        }

        public byte[] getByteData() {
            return this.byteData;
        }

        public Double getHeight() {
            return this.height;
        }

        public Double getImagePixelRatio() {
            return this.imagePixelRatio;
        }

        public Double getWidth() {
            return this.width;
        }

        public int hashCode() {
            return (Objects.hash(this.bitmapScaling, this.imagePixelRatio, this.width, this.height) * 31) + Arrays.hashCode(this.byteData);
        }

        public void setBitmapScaling(PlatformMapBitmapScaling platformMapBitmapScaling) {
            if (platformMapBitmapScaling == null) {
                throw new IllegalStateException("Nonnull field \"bitmapScaling\" is null.");
            }
            this.bitmapScaling = platformMapBitmapScaling;
        }

        public void setByteData(byte[] bArr) {
            if (bArr == null) {
                throw new IllegalStateException("Nonnull field \"byteData\" is null.");
            }
            this.byteData = bArr;
        }

        public void setHeight(Double d10) {
            this.height = d10;
        }

        public void setImagePixelRatio(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"imagePixelRatio\" is null.");
            }
            this.imagePixelRatio = d10;
        }

        public void setWidth(Double d10) {
            this.width = d10;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(5);
            arrayList.add(this.byteData);
            arrayList.add(this.bitmapScaling);
            arrayList.add(this.imagePixelRatio);
            arrayList.add(this.width);
            arrayList.add(this.height);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformBitmapDefaultMarker {
        private Double hue;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private Double hue;

            public PlatformBitmapDefaultMarker build() {
                PlatformBitmapDefaultMarker platformBitmapDefaultMarker = new PlatformBitmapDefaultMarker();
                platformBitmapDefaultMarker.setHue(this.hue);
                return platformBitmapDefaultMarker;
            }

            @CanIgnoreReturnValue
            public Builder setHue(Double d10) {
                this.hue = d10;
                return this;
            }
        }

        public static PlatformBitmapDefaultMarker fromList(ArrayList<Object> arrayList) {
            PlatformBitmapDefaultMarker platformBitmapDefaultMarker = new PlatformBitmapDefaultMarker();
            platformBitmapDefaultMarker.setHue((Double) arrayList.get(0));
            return platformBitmapDefaultMarker;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformBitmapDefaultMarker.class != obj.getClass()) {
                return false;
            }
            return Objects.equals(this.hue, ((PlatformBitmapDefaultMarker) obj).hue);
        }

        public Double getHue() {
            return this.hue;
        }

        public int hashCode() {
            return Objects.hash(this.hue);
        }

        public void setHue(Double d10) {
            this.hue = d10;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.hue);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformBitmapPinConfig {
        private PlatformColor backgroundColor;
        private PlatformColor borderColor;
        private PlatformBitmap glyphBitmap;
        private PlatformColor glyphColor;
        private String glyphText;
        private PlatformColor glyphTextColor;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private PlatformColor backgroundColor;
            private PlatformColor borderColor;
            private PlatformBitmap glyphBitmap;
            private PlatformColor glyphColor;
            private String glyphText;
            private PlatformColor glyphTextColor;

            public PlatformBitmapPinConfig build() {
                PlatformBitmapPinConfig platformBitmapPinConfig = new PlatformBitmapPinConfig();
                platformBitmapPinConfig.setBackgroundColor(this.backgroundColor);
                platformBitmapPinConfig.setBorderColor(this.borderColor);
                platformBitmapPinConfig.setGlyphColor(this.glyphColor);
                platformBitmapPinConfig.setGlyphBitmap(this.glyphBitmap);
                platformBitmapPinConfig.setGlyphText(this.glyphText);
                platformBitmapPinConfig.setGlyphTextColor(this.glyphTextColor);
                return platformBitmapPinConfig;
            }

            @CanIgnoreReturnValue
            public Builder setBackgroundColor(PlatformColor platformColor) {
                this.backgroundColor = platformColor;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setBorderColor(PlatformColor platformColor) {
                this.borderColor = platformColor;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setGlyphBitmap(PlatformBitmap platformBitmap) {
                this.glyphBitmap = platformBitmap;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setGlyphColor(PlatformColor platformColor) {
                this.glyphColor = platformColor;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setGlyphText(String str) {
                this.glyphText = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setGlyphTextColor(PlatformColor platformColor) {
                this.glyphTextColor = platformColor;
                return this;
            }
        }

        public static PlatformBitmapPinConfig fromList(ArrayList<Object> arrayList) {
            PlatformBitmapPinConfig platformBitmapPinConfig = new PlatformBitmapPinConfig();
            platformBitmapPinConfig.setBackgroundColor((PlatformColor) arrayList.get(0));
            platformBitmapPinConfig.setBorderColor((PlatformColor) arrayList.get(1));
            platformBitmapPinConfig.setGlyphColor((PlatformColor) arrayList.get(2));
            platformBitmapPinConfig.setGlyphBitmap((PlatformBitmap) arrayList.get(3));
            platformBitmapPinConfig.setGlyphText((String) arrayList.get(4));
            platformBitmapPinConfig.setGlyphTextColor((PlatformColor) arrayList.get(5));
            return platformBitmapPinConfig;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformBitmapPinConfig.class == obj.getClass()) {
                PlatformBitmapPinConfig platformBitmapPinConfig = (PlatformBitmapPinConfig) obj;
                if (Objects.equals(this.backgroundColor, platformBitmapPinConfig.backgroundColor) && Objects.equals(this.borderColor, platformBitmapPinConfig.borderColor) && Objects.equals(this.glyphColor, platformBitmapPinConfig.glyphColor) && Objects.equals(this.glyphBitmap, platformBitmapPinConfig.glyphBitmap) && Objects.equals(this.glyphText, platformBitmapPinConfig.glyphText) && Objects.equals(this.glyphTextColor, platformBitmapPinConfig.glyphTextColor)) {
                    return true;
                }
            }
            return false;
        }

        public PlatformColor getBackgroundColor() {
            return this.backgroundColor;
        }

        public PlatformColor getBorderColor() {
            return this.borderColor;
        }

        public PlatformBitmap getGlyphBitmap() {
            return this.glyphBitmap;
        }

        public PlatformColor getGlyphColor() {
            return this.glyphColor;
        }

        public String getGlyphText() {
            return this.glyphText;
        }

        public PlatformColor getGlyphTextColor() {
            return this.glyphTextColor;
        }

        public int hashCode() {
            return Objects.hash(this.backgroundColor, this.borderColor, this.glyphColor, this.glyphBitmap, this.glyphText, this.glyphTextColor);
        }

        public void setBackgroundColor(PlatformColor platformColor) {
            this.backgroundColor = platformColor;
        }

        public void setBorderColor(PlatformColor platformColor) {
            this.borderColor = platformColor;
        }

        public void setGlyphBitmap(PlatformBitmap platformBitmap) {
            this.glyphBitmap = platformBitmap;
        }

        public void setGlyphColor(PlatformColor platformColor) {
            this.glyphColor = platformColor;
        }

        public void setGlyphText(String str) {
            this.glyphText = str;
        }

        public void setGlyphTextColor(PlatformColor platformColor) {
            this.glyphTextColor = platformColor;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(6);
            arrayList.add(this.backgroundColor);
            arrayList.add(this.borderColor);
            arrayList.add(this.glyphColor);
            arrayList.add(this.glyphBitmap);
            arrayList.add(this.glyphText);
            arrayList.add(this.glyphTextColor);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformCameraPosition {
        private Double bearing;
        private PlatformLatLng target;
        private Double tilt;
        private Double zoom;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private Double bearing;
            private PlatformLatLng target;
            private Double tilt;
            private Double zoom;

            public PlatformCameraPosition build() {
                PlatformCameraPosition platformCameraPosition = new PlatformCameraPosition();
                platformCameraPosition.setBearing(this.bearing);
                platformCameraPosition.setTarget(this.target);
                platformCameraPosition.setTilt(this.tilt);
                platformCameraPosition.setZoom(this.zoom);
                return platformCameraPosition;
            }

            @CanIgnoreReturnValue
            public Builder setBearing(Double d10) {
                this.bearing = d10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setTarget(PlatformLatLng platformLatLng) {
                this.target = platformLatLng;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setTilt(Double d10) {
                this.tilt = d10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setZoom(Double d10) {
                this.zoom = d10;
                return this;
            }
        }

        public static PlatformCameraPosition fromList(ArrayList<Object> arrayList) {
            PlatformCameraPosition platformCameraPosition = new PlatformCameraPosition();
            platformCameraPosition.setBearing((Double) arrayList.get(0));
            platformCameraPosition.setTarget((PlatformLatLng) arrayList.get(1));
            platformCameraPosition.setTilt((Double) arrayList.get(2));
            platformCameraPosition.setZoom((Double) arrayList.get(3));
            return platformCameraPosition;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformCameraPosition.class == obj.getClass()) {
                PlatformCameraPosition platformCameraPosition = (PlatformCameraPosition) obj;
                if (this.bearing.equals(platformCameraPosition.bearing) && this.target.equals(platformCameraPosition.target) && this.tilt.equals(platformCameraPosition.tilt) && this.zoom.equals(platformCameraPosition.zoom)) {
                    return true;
                }
            }
            return false;
        }

        public Double getBearing() {
            return this.bearing;
        }

        public PlatformLatLng getTarget() {
            return this.target;
        }

        public Double getTilt() {
            return this.tilt;
        }

        public Double getZoom() {
            return this.zoom;
        }

        public int hashCode() {
            return Objects.hash(this.bearing, this.target, this.tilt, this.zoom);
        }

        public void setBearing(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"bearing\" is null.");
            }
            this.bearing = d10;
        }

        public void setTarget(PlatformLatLng platformLatLng) {
            if (platformLatLng == null) {
                throw new IllegalStateException("Nonnull field \"target\" is null.");
            }
            this.target = platformLatLng;
        }

        public void setTilt(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"tilt\" is null.");
            }
            this.tilt = d10;
        }

        public void setZoom(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"zoom\" is null.");
            }
            this.zoom = d10;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.bearing);
            arrayList.add(this.target);
            arrayList.add(this.tilt);
            arrayList.add(this.zoom);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformCameraTargetBounds {
        private PlatformLatLngBounds bounds;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private PlatformLatLngBounds bounds;

            public PlatformCameraTargetBounds build() {
                PlatformCameraTargetBounds platformCameraTargetBounds = new PlatformCameraTargetBounds();
                platformCameraTargetBounds.setBounds(this.bounds);
                return platformCameraTargetBounds;
            }

            @CanIgnoreReturnValue
            public Builder setBounds(PlatformLatLngBounds platformLatLngBounds) {
                this.bounds = platformLatLngBounds;
                return this;
            }
        }

        public static PlatformCameraTargetBounds fromList(ArrayList<Object> arrayList) {
            PlatformCameraTargetBounds platformCameraTargetBounds = new PlatformCameraTargetBounds();
            platformCameraTargetBounds.setBounds((PlatformLatLngBounds) arrayList.get(0));
            return platformCameraTargetBounds;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformCameraTargetBounds.class != obj.getClass()) {
                return false;
            }
            return Objects.equals(this.bounds, ((PlatformCameraTargetBounds) obj).bounds);
        }

        public PlatformLatLngBounds getBounds() {
            return this.bounds;
        }

        public int hashCode() {
            return Objects.hash(this.bounds);
        }

        public void setBounds(PlatformLatLngBounds platformLatLngBounds) {
            this.bounds = platformLatLngBounds;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.bounds);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformCameraUpdate {
        private Object cameraUpdate;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private Object cameraUpdate;

            public PlatformCameraUpdate build() {
                PlatformCameraUpdate platformCameraUpdate = new PlatformCameraUpdate();
                platformCameraUpdate.setCameraUpdate(this.cameraUpdate);
                return platformCameraUpdate;
            }

            @CanIgnoreReturnValue
            public Builder setCameraUpdate(Object obj) {
                this.cameraUpdate = obj;
                return this;
            }
        }

        public static PlatformCameraUpdate fromList(ArrayList<Object> arrayList) {
            PlatformCameraUpdate platformCameraUpdate = new PlatformCameraUpdate();
            platformCameraUpdate.setCameraUpdate(arrayList.get(0));
            return platformCameraUpdate;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformCameraUpdate.class != obj.getClass()) {
                return false;
            }
            return this.cameraUpdate.equals(((PlatformCameraUpdate) obj).cameraUpdate);
        }

        public Object getCameraUpdate() {
            return this.cameraUpdate;
        }

        public int hashCode() {
            return Objects.hash(this.cameraUpdate);
        }

        public void setCameraUpdate(Object obj) {
            if (obj == null) {
                throw new IllegalStateException("Nonnull field \"cameraUpdate\" is null.");
            }
            this.cameraUpdate = obj;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.cameraUpdate);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformCameraUpdateNewCameraPosition {
        private PlatformCameraPosition cameraPosition;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private PlatformCameraPosition cameraPosition;

            public PlatformCameraUpdateNewCameraPosition build() {
                PlatformCameraUpdateNewCameraPosition platformCameraUpdateNewCameraPosition = new PlatformCameraUpdateNewCameraPosition();
                platformCameraUpdateNewCameraPosition.setCameraPosition(this.cameraPosition);
                return platformCameraUpdateNewCameraPosition;
            }

            @CanIgnoreReturnValue
            public Builder setCameraPosition(PlatformCameraPosition platformCameraPosition) {
                this.cameraPosition = platformCameraPosition;
                return this;
            }
        }

        public static PlatformCameraUpdateNewCameraPosition fromList(ArrayList<Object> arrayList) {
            PlatformCameraUpdateNewCameraPosition platformCameraUpdateNewCameraPosition = new PlatformCameraUpdateNewCameraPosition();
            platformCameraUpdateNewCameraPosition.setCameraPosition((PlatformCameraPosition) arrayList.get(0));
            return platformCameraUpdateNewCameraPosition;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformCameraUpdateNewCameraPosition.class != obj.getClass()) {
                return false;
            }
            return this.cameraPosition.equals(((PlatformCameraUpdateNewCameraPosition) obj).cameraPosition);
        }

        public PlatformCameraPosition getCameraPosition() {
            return this.cameraPosition;
        }

        public int hashCode() {
            return Objects.hash(this.cameraPosition);
        }

        public void setCameraPosition(PlatformCameraPosition platformCameraPosition) {
            if (platformCameraPosition == null) {
                throw new IllegalStateException("Nonnull field \"cameraPosition\" is null.");
            }
            this.cameraPosition = platformCameraPosition;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.cameraPosition);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformCameraUpdateNewLatLng {
        private PlatformLatLng latLng;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private PlatformLatLng latLng;

            public PlatformCameraUpdateNewLatLng build() {
                PlatformCameraUpdateNewLatLng platformCameraUpdateNewLatLng = new PlatformCameraUpdateNewLatLng();
                platformCameraUpdateNewLatLng.setLatLng(this.latLng);
                return platformCameraUpdateNewLatLng;
            }

            @CanIgnoreReturnValue
            public Builder setLatLng(PlatformLatLng platformLatLng) {
                this.latLng = platformLatLng;
                return this;
            }
        }

        public static PlatformCameraUpdateNewLatLng fromList(ArrayList<Object> arrayList) {
            PlatformCameraUpdateNewLatLng platformCameraUpdateNewLatLng = new PlatformCameraUpdateNewLatLng();
            platformCameraUpdateNewLatLng.setLatLng((PlatformLatLng) arrayList.get(0));
            return platformCameraUpdateNewLatLng;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformCameraUpdateNewLatLng.class != obj.getClass()) {
                return false;
            }
            return this.latLng.equals(((PlatformCameraUpdateNewLatLng) obj).latLng);
        }

        public PlatformLatLng getLatLng() {
            return this.latLng;
        }

        public int hashCode() {
            return Objects.hash(this.latLng);
        }

        public void setLatLng(PlatformLatLng platformLatLng) {
            if (platformLatLng == null) {
                throw new IllegalStateException("Nonnull field \"latLng\" is null.");
            }
            this.latLng = platformLatLng;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.latLng);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformCameraUpdateNewLatLngBounds {
        private PlatformLatLngBounds bounds;
        private Double padding;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private PlatformLatLngBounds bounds;
            private Double padding;

            public PlatformCameraUpdateNewLatLngBounds build() {
                PlatformCameraUpdateNewLatLngBounds platformCameraUpdateNewLatLngBounds = new PlatformCameraUpdateNewLatLngBounds();
                platformCameraUpdateNewLatLngBounds.setBounds(this.bounds);
                platformCameraUpdateNewLatLngBounds.setPadding(this.padding);
                return platformCameraUpdateNewLatLngBounds;
            }

            @CanIgnoreReturnValue
            public Builder setBounds(PlatformLatLngBounds platformLatLngBounds) {
                this.bounds = platformLatLngBounds;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPadding(Double d10) {
                this.padding = d10;
                return this;
            }
        }

        public static PlatformCameraUpdateNewLatLngBounds fromList(ArrayList<Object> arrayList) {
            PlatformCameraUpdateNewLatLngBounds platformCameraUpdateNewLatLngBounds = new PlatformCameraUpdateNewLatLngBounds();
            platformCameraUpdateNewLatLngBounds.setBounds((PlatformLatLngBounds) arrayList.get(0));
            platformCameraUpdateNewLatLngBounds.setPadding((Double) arrayList.get(1));
            return platformCameraUpdateNewLatLngBounds;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformCameraUpdateNewLatLngBounds.class == obj.getClass()) {
                PlatformCameraUpdateNewLatLngBounds platformCameraUpdateNewLatLngBounds = (PlatformCameraUpdateNewLatLngBounds) obj;
                if (this.bounds.equals(platformCameraUpdateNewLatLngBounds.bounds) && this.padding.equals(platformCameraUpdateNewLatLngBounds.padding)) {
                    return true;
                }
            }
            return false;
        }

        public PlatformLatLngBounds getBounds() {
            return this.bounds;
        }

        public Double getPadding() {
            return this.padding;
        }

        public int hashCode() {
            return Objects.hash(this.bounds, this.padding);
        }

        public void setBounds(PlatformLatLngBounds platformLatLngBounds) {
            if (platformLatLngBounds == null) {
                throw new IllegalStateException("Nonnull field \"bounds\" is null.");
            }
            this.bounds = platformLatLngBounds;
        }

        public void setPadding(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"padding\" is null.");
            }
            this.padding = d10;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.bounds);
            arrayList.add(this.padding);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformCameraUpdateNewLatLngZoom {
        private PlatformLatLng latLng;
        private Double zoom;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private PlatformLatLng latLng;
            private Double zoom;

            public PlatformCameraUpdateNewLatLngZoom build() {
                PlatformCameraUpdateNewLatLngZoom platformCameraUpdateNewLatLngZoom = new PlatformCameraUpdateNewLatLngZoom();
                platformCameraUpdateNewLatLngZoom.setLatLng(this.latLng);
                platformCameraUpdateNewLatLngZoom.setZoom(this.zoom);
                return platformCameraUpdateNewLatLngZoom;
            }

            @CanIgnoreReturnValue
            public Builder setLatLng(PlatformLatLng platformLatLng) {
                this.latLng = platformLatLng;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setZoom(Double d10) {
                this.zoom = d10;
                return this;
            }
        }

        public static PlatformCameraUpdateNewLatLngZoom fromList(ArrayList<Object> arrayList) {
            PlatformCameraUpdateNewLatLngZoom platformCameraUpdateNewLatLngZoom = new PlatformCameraUpdateNewLatLngZoom();
            platformCameraUpdateNewLatLngZoom.setLatLng((PlatformLatLng) arrayList.get(0));
            platformCameraUpdateNewLatLngZoom.setZoom((Double) arrayList.get(1));
            return platformCameraUpdateNewLatLngZoom;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformCameraUpdateNewLatLngZoom.class == obj.getClass()) {
                PlatformCameraUpdateNewLatLngZoom platformCameraUpdateNewLatLngZoom = (PlatformCameraUpdateNewLatLngZoom) obj;
                if (this.latLng.equals(platformCameraUpdateNewLatLngZoom.latLng) && this.zoom.equals(platformCameraUpdateNewLatLngZoom.zoom)) {
                    return true;
                }
            }
            return false;
        }

        public PlatformLatLng getLatLng() {
            return this.latLng;
        }

        public Double getZoom() {
            return this.zoom;
        }

        public int hashCode() {
            return Objects.hash(this.latLng, this.zoom);
        }

        public void setLatLng(PlatformLatLng platformLatLng) {
            if (platformLatLng == null) {
                throw new IllegalStateException("Nonnull field \"latLng\" is null.");
            }
            this.latLng = platformLatLng;
        }

        public void setZoom(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"zoom\" is null.");
            }
            this.zoom = d10;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.latLng);
            arrayList.add(this.zoom);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformCameraUpdateScrollBy {
        private Double dx;
        private Double dy;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private Double dx;
            private Double dy;

            public PlatformCameraUpdateScrollBy build() {
                PlatformCameraUpdateScrollBy platformCameraUpdateScrollBy = new PlatformCameraUpdateScrollBy();
                platformCameraUpdateScrollBy.setDx(this.dx);
                platformCameraUpdateScrollBy.setDy(this.dy);
                return platformCameraUpdateScrollBy;
            }

            @CanIgnoreReturnValue
            public Builder setDx(Double d10) {
                this.dx = d10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setDy(Double d10) {
                this.dy = d10;
                return this;
            }
        }

        public static PlatformCameraUpdateScrollBy fromList(ArrayList<Object> arrayList) {
            PlatformCameraUpdateScrollBy platformCameraUpdateScrollBy = new PlatformCameraUpdateScrollBy();
            platformCameraUpdateScrollBy.setDx((Double) arrayList.get(0));
            platformCameraUpdateScrollBy.setDy((Double) arrayList.get(1));
            return platformCameraUpdateScrollBy;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformCameraUpdateScrollBy.class == obj.getClass()) {
                PlatformCameraUpdateScrollBy platformCameraUpdateScrollBy = (PlatformCameraUpdateScrollBy) obj;
                if (this.dx.equals(platformCameraUpdateScrollBy.dx) && this.dy.equals(platformCameraUpdateScrollBy.dy)) {
                    return true;
                }
            }
            return false;
        }

        public Double getDx() {
            return this.dx;
        }

        public Double getDy() {
            return this.dy;
        }

        public int hashCode() {
            return Objects.hash(this.dx, this.dy);
        }

        public void setDx(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"dx\" is null.");
            }
            this.dx = d10;
        }

        public void setDy(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"dy\" is null.");
            }
            this.dy = d10;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.dx);
            arrayList.add(this.dy);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformCameraUpdateZoom {
        private Boolean out;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private Boolean out;

            public PlatformCameraUpdateZoom build() {
                PlatformCameraUpdateZoom platformCameraUpdateZoom = new PlatformCameraUpdateZoom();
                platformCameraUpdateZoom.setOut(this.out);
                return platformCameraUpdateZoom;
            }

            @CanIgnoreReturnValue
            public Builder setOut(Boolean bool) {
                this.out = bool;
                return this;
            }
        }

        public static PlatformCameraUpdateZoom fromList(ArrayList<Object> arrayList) {
            PlatformCameraUpdateZoom platformCameraUpdateZoom = new PlatformCameraUpdateZoom();
            platformCameraUpdateZoom.setOut((Boolean) arrayList.get(0));
            return platformCameraUpdateZoom;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformCameraUpdateZoom.class != obj.getClass()) {
                return false;
            }
            return this.out.equals(((PlatformCameraUpdateZoom) obj).out);
        }

        public Boolean getOut() {
            return this.out;
        }

        public int hashCode() {
            return Objects.hash(this.out);
        }

        public void setOut(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"out\" is null.");
            }
            this.out = bool;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.out);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformCameraUpdateZoomBy {
        private Double amount;
        private PlatformDoublePair focus;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private Double amount;
            private PlatformDoublePair focus;

            public PlatformCameraUpdateZoomBy build() {
                PlatformCameraUpdateZoomBy platformCameraUpdateZoomBy = new PlatformCameraUpdateZoomBy();
                platformCameraUpdateZoomBy.setAmount(this.amount);
                platformCameraUpdateZoomBy.setFocus(this.focus);
                return platformCameraUpdateZoomBy;
            }

            @CanIgnoreReturnValue
            public Builder setAmount(Double d10) {
                this.amount = d10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setFocus(PlatformDoublePair platformDoublePair) {
                this.focus = platformDoublePair;
                return this;
            }
        }

        public static PlatformCameraUpdateZoomBy fromList(ArrayList<Object> arrayList) {
            PlatformCameraUpdateZoomBy platformCameraUpdateZoomBy = new PlatformCameraUpdateZoomBy();
            platformCameraUpdateZoomBy.setAmount((Double) arrayList.get(0));
            platformCameraUpdateZoomBy.setFocus((PlatformDoublePair) arrayList.get(1));
            return platformCameraUpdateZoomBy;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformCameraUpdateZoomBy.class == obj.getClass()) {
                PlatformCameraUpdateZoomBy platformCameraUpdateZoomBy = (PlatformCameraUpdateZoomBy) obj;
                if (this.amount.equals(platformCameraUpdateZoomBy.amount) && Objects.equals(this.focus, platformCameraUpdateZoomBy.focus)) {
                    return true;
                }
            }
            return false;
        }

        public Double getAmount() {
            return this.amount;
        }

        public PlatformDoublePair getFocus() {
            return this.focus;
        }

        public int hashCode() {
            return Objects.hash(this.amount, this.focus);
        }

        public void setAmount(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"amount\" is null.");
            }
            this.amount = d10;
        }

        public void setFocus(PlatformDoublePair platformDoublePair) {
            this.focus = platformDoublePair;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.amount);
            arrayList.add(this.focus);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformCameraUpdateZoomTo {
        private Double zoom;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private Double zoom;

            public PlatformCameraUpdateZoomTo build() {
                PlatformCameraUpdateZoomTo platformCameraUpdateZoomTo = new PlatformCameraUpdateZoomTo();
                platformCameraUpdateZoomTo.setZoom(this.zoom);
                return platformCameraUpdateZoomTo;
            }

            @CanIgnoreReturnValue
            public Builder setZoom(Double d10) {
                this.zoom = d10;
                return this;
            }
        }

        public static PlatformCameraUpdateZoomTo fromList(ArrayList<Object> arrayList) {
            PlatformCameraUpdateZoomTo platformCameraUpdateZoomTo = new PlatformCameraUpdateZoomTo();
            platformCameraUpdateZoomTo.setZoom((Double) arrayList.get(0));
            return platformCameraUpdateZoomTo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformCameraUpdateZoomTo.class != obj.getClass()) {
                return false;
            }
            return this.zoom.equals(((PlatformCameraUpdateZoomTo) obj).zoom);
        }

        public Double getZoom() {
            return this.zoom;
        }

        public int hashCode() {
            return Objects.hash(this.zoom);
        }

        public void setZoom(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"zoom\" is null.");
            }
            this.zoom = d10;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.zoom);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformCap {
        private PlatformBitmap bitmapDescriptor;
        private Double refWidth;
        private PlatformCapType type;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private PlatformBitmap bitmapDescriptor;
            private Double refWidth;
            private PlatformCapType type;

            public PlatformCap build() {
                PlatformCap platformCap = new PlatformCap();
                platformCap.setType(this.type);
                platformCap.setBitmapDescriptor(this.bitmapDescriptor);
                platformCap.setRefWidth(this.refWidth);
                return platformCap;
            }

            @CanIgnoreReturnValue
            public Builder setBitmapDescriptor(PlatformBitmap platformBitmap) {
                this.bitmapDescriptor = platformBitmap;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setRefWidth(Double d10) {
                this.refWidth = d10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setType(PlatformCapType platformCapType) {
                this.type = platformCapType;
                return this;
            }
        }

        public static PlatformCap fromList(ArrayList<Object> arrayList) {
            PlatformCap platformCap = new PlatformCap();
            platformCap.setType((PlatformCapType) arrayList.get(0));
            platformCap.setBitmapDescriptor((PlatformBitmap) arrayList.get(1));
            platformCap.setRefWidth((Double) arrayList.get(2));
            return platformCap;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformCap.class == obj.getClass()) {
                PlatformCap platformCap = (PlatformCap) obj;
                if (this.type.equals(platformCap.type) && Objects.equals(this.bitmapDescriptor, platformCap.bitmapDescriptor) && Objects.equals(this.refWidth, platformCap.refWidth)) {
                    return true;
                }
            }
            return false;
        }

        public PlatformBitmap getBitmapDescriptor() {
            return this.bitmapDescriptor;
        }

        public Double getRefWidth() {
            return this.refWidth;
        }

        public PlatformCapType getType() {
            return this.type;
        }

        public int hashCode() {
            return Objects.hash(this.type, this.bitmapDescriptor, this.refWidth);
        }

        public void setBitmapDescriptor(PlatformBitmap platformBitmap) {
            this.bitmapDescriptor = platformBitmap;
        }

        public void setRefWidth(Double d10) {
            this.refWidth = d10;
        }

        public void setType(PlatformCapType platformCapType) {
            if (platformCapType == null) {
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            }
            this.type = platformCapType;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.type);
            arrayList.add(this.bitmapDescriptor);
            arrayList.add(this.refWidth);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum PlatformCapType {
        BUTT_CAP(0),
        ROUND_CAP(1),
        SQUARE_CAP(2),
        CUSTOM_CAP(3);

        final int index;

        PlatformCapType(int i10) {
            this.index = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformCircle {
        private PlatformLatLng center;
        private String circleId;
        private Boolean consumeTapEvents;
        private PlatformColor fillColor;
        private Double radius;
        private PlatformColor strokeColor;
        private Long strokeWidth;
        private Boolean visible;
        private Double zIndex;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private PlatformLatLng center;
            private String circleId;
            private Boolean consumeTapEvents;
            private PlatformColor fillColor;
            private Double radius;
            private PlatformColor strokeColor;
            private Long strokeWidth;
            private Boolean visible;
            private Double zIndex;

            public PlatformCircle build() {
                PlatformCircle platformCircle = new PlatformCircle();
                platformCircle.setConsumeTapEvents(this.consumeTapEvents);
                platformCircle.setFillColor(this.fillColor);
                platformCircle.setStrokeColor(this.strokeColor);
                platformCircle.setVisible(this.visible);
                platformCircle.setStrokeWidth(this.strokeWidth);
                platformCircle.setZIndex(this.zIndex);
                platformCircle.setCenter(this.center);
                platformCircle.setRadius(this.radius);
                platformCircle.setCircleId(this.circleId);
                return platformCircle;
            }

            @CanIgnoreReturnValue
            public Builder setCenter(PlatformLatLng platformLatLng) {
                this.center = platformLatLng;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setCircleId(String str) {
                this.circleId = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setConsumeTapEvents(Boolean bool) {
                this.consumeTapEvents = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setFillColor(PlatformColor platformColor) {
                this.fillColor = platformColor;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setRadius(Double d10) {
                this.radius = d10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setStrokeColor(PlatformColor platformColor) {
                this.strokeColor = platformColor;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setStrokeWidth(Long l10) {
                this.strokeWidth = l10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setVisible(Boolean bool) {
                this.visible = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setZIndex(Double d10) {
                this.zIndex = d10;
                return this;
            }
        }

        public static PlatformCircle fromList(ArrayList<Object> arrayList) {
            PlatformCircle platformCircle = new PlatformCircle();
            platformCircle.setConsumeTapEvents((Boolean) arrayList.get(0));
            platformCircle.setFillColor((PlatformColor) arrayList.get(1));
            platformCircle.setStrokeColor((PlatformColor) arrayList.get(2));
            platformCircle.setVisible((Boolean) arrayList.get(3));
            platformCircle.setStrokeWidth((Long) arrayList.get(4));
            platformCircle.setZIndex((Double) arrayList.get(5));
            platformCircle.setCenter((PlatformLatLng) arrayList.get(6));
            platformCircle.setRadius((Double) arrayList.get(7));
            platformCircle.setCircleId((String) arrayList.get(8));
            return platformCircle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformCircle.class == obj.getClass()) {
                PlatformCircle platformCircle = (PlatformCircle) obj;
                if (this.consumeTapEvents.equals(platformCircle.consumeTapEvents) && this.fillColor.equals(platformCircle.fillColor) && this.strokeColor.equals(platformCircle.strokeColor) && this.visible.equals(platformCircle.visible) && this.strokeWidth.equals(platformCircle.strokeWidth) && this.zIndex.equals(platformCircle.zIndex) && this.center.equals(platformCircle.center) && this.radius.equals(platformCircle.radius) && this.circleId.equals(platformCircle.circleId)) {
                    return true;
                }
            }
            return false;
        }

        public PlatformLatLng getCenter() {
            return this.center;
        }

        public String getCircleId() {
            return this.circleId;
        }

        public Boolean getConsumeTapEvents() {
            return this.consumeTapEvents;
        }

        public PlatformColor getFillColor() {
            return this.fillColor;
        }

        public Double getRadius() {
            return this.radius;
        }

        public PlatformColor getStrokeColor() {
            return this.strokeColor;
        }

        public Long getStrokeWidth() {
            return this.strokeWidth;
        }

        public Boolean getVisible() {
            return this.visible;
        }

        public Double getZIndex() {
            return this.zIndex;
        }

        public int hashCode() {
            return Objects.hash(this.consumeTapEvents, this.fillColor, this.strokeColor, this.visible, this.strokeWidth, this.zIndex, this.center, this.radius, this.circleId);
        }

        public void setCenter(PlatformLatLng platformLatLng) {
            if (platformLatLng == null) {
                throw new IllegalStateException("Nonnull field \"center\" is null.");
            }
            this.center = platformLatLng;
        }

        public void setCircleId(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"circleId\" is null.");
            }
            this.circleId = str;
        }

        public void setConsumeTapEvents(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"consumeTapEvents\" is null.");
            }
            this.consumeTapEvents = bool;
        }

        public void setFillColor(PlatformColor platformColor) {
            if (platformColor == null) {
                throw new IllegalStateException("Nonnull field \"fillColor\" is null.");
            }
            this.fillColor = platformColor;
        }

        public void setRadius(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"radius\" is null.");
            }
            this.radius = d10;
        }

        public void setStrokeColor(PlatformColor platformColor) {
            if (platformColor == null) {
                throw new IllegalStateException("Nonnull field \"strokeColor\" is null.");
            }
            this.strokeColor = platformColor;
        }

        public void setStrokeWidth(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"strokeWidth\" is null.");
            }
            this.strokeWidth = l10;
        }

        public void setVisible(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"visible\" is null.");
            }
            this.visible = bool;
        }

        public void setZIndex(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"zIndex\" is null.");
            }
            this.zIndex = d10;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(9);
            arrayList.add(this.consumeTapEvents);
            arrayList.add(this.fillColor);
            arrayList.add(this.strokeColor);
            arrayList.add(this.visible);
            arrayList.add(this.strokeWidth);
            arrayList.add(this.zIndex);
            arrayList.add(this.center);
            arrayList.add(this.radius);
            arrayList.add(this.circleId);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformCluster {
        private PlatformLatLngBounds bounds;
        private String clusterManagerId;
        private List<String> markerIds;
        private PlatformLatLng position;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private PlatformLatLngBounds bounds;
            private String clusterManagerId;
            private List<String> markerIds;
            private PlatformLatLng position;

            public PlatformCluster build() {
                PlatformCluster platformCluster = new PlatformCluster();
                platformCluster.setClusterManagerId(this.clusterManagerId);
                platformCluster.setPosition(this.position);
                platformCluster.setBounds(this.bounds);
                platformCluster.setMarkerIds(this.markerIds);
                return platformCluster;
            }

            @CanIgnoreReturnValue
            public Builder setBounds(PlatformLatLngBounds platformLatLngBounds) {
                this.bounds = platformLatLngBounds;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setClusterManagerId(String str) {
                this.clusterManagerId = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMarkerIds(List<String> list) {
                this.markerIds = list;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPosition(PlatformLatLng platformLatLng) {
                this.position = platformLatLng;
                return this;
            }
        }

        public static PlatformCluster fromList(ArrayList<Object> arrayList) {
            PlatformCluster platformCluster = new PlatformCluster();
            platformCluster.setClusterManagerId((String) arrayList.get(0));
            platformCluster.setPosition((PlatformLatLng) arrayList.get(1));
            platformCluster.setBounds((PlatformLatLngBounds) arrayList.get(2));
            platformCluster.setMarkerIds((List) arrayList.get(3));
            return platformCluster;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformCluster.class == obj.getClass()) {
                PlatformCluster platformCluster = (PlatformCluster) obj;
                if (this.clusterManagerId.equals(platformCluster.clusterManagerId) && this.position.equals(platformCluster.position) && this.bounds.equals(platformCluster.bounds) && this.markerIds.equals(platformCluster.markerIds)) {
                    return true;
                }
            }
            return false;
        }

        public PlatformLatLngBounds getBounds() {
            return this.bounds;
        }

        public String getClusterManagerId() {
            return this.clusterManagerId;
        }

        public List<String> getMarkerIds() {
            return this.markerIds;
        }

        public PlatformLatLng getPosition() {
            return this.position;
        }

        public int hashCode() {
            return Objects.hash(this.clusterManagerId, this.position, this.bounds, this.markerIds);
        }

        public void setBounds(PlatformLatLngBounds platformLatLngBounds) {
            if (platformLatLngBounds == null) {
                throw new IllegalStateException("Nonnull field \"bounds\" is null.");
            }
            this.bounds = platformLatLngBounds;
        }

        public void setClusterManagerId(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"clusterManagerId\" is null.");
            }
            this.clusterManagerId = str;
        }

        public void setMarkerIds(List<String> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"markerIds\" is null.");
            }
            this.markerIds = list;
        }

        public void setPosition(PlatformLatLng platformLatLng) {
            if (platformLatLng == null) {
                throw new IllegalStateException("Nonnull field \"position\" is null.");
            }
            this.position = platformLatLng;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.clusterManagerId);
            arrayList.add(this.position);
            arrayList.add(this.bounds);
            arrayList.add(this.markerIds);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformClusterManager {
        private String identifier;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private String identifier;

            public PlatformClusterManager build() {
                PlatformClusterManager platformClusterManager = new PlatformClusterManager();
                platformClusterManager.setIdentifier(this.identifier);
                return platformClusterManager;
            }

            @CanIgnoreReturnValue
            public Builder setIdentifier(String str) {
                this.identifier = str;
                return this;
            }
        }

        public static PlatformClusterManager fromList(ArrayList<Object> arrayList) {
            PlatformClusterManager platformClusterManager = new PlatformClusterManager();
            platformClusterManager.setIdentifier((String) arrayList.get(0));
            return platformClusterManager;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformClusterManager.class != obj.getClass()) {
                return false;
            }
            return this.identifier.equals(((PlatformClusterManager) obj).identifier);
        }

        public String getIdentifier() {
            return this.identifier;
        }

        public int hashCode() {
            return Objects.hash(this.identifier);
        }

        public void setIdentifier(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"identifier\" is null.");
            }
            this.identifier = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.identifier);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformColor {
        private Long argbValue;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private Long argbValue;

            public PlatformColor build() {
                PlatformColor platformColor = new PlatformColor();
                platformColor.setArgbValue(this.argbValue);
                return platformColor;
            }

            @CanIgnoreReturnValue
            public Builder setArgbValue(Long l10) {
                this.argbValue = l10;
                return this;
            }
        }

        public static PlatformColor fromList(ArrayList<Object> arrayList) {
            PlatformColor platformColor = new PlatformColor();
            platformColor.setArgbValue((Long) arrayList.get(0));
            return platformColor;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformColor.class != obj.getClass()) {
                return false;
            }
            return this.argbValue.equals(((PlatformColor) obj).argbValue);
        }

        public Long getArgbValue() {
            return this.argbValue;
        }

        public int hashCode() {
            return Objects.hash(this.argbValue);
        }

        public void setArgbValue(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"argbValue\" is null.");
            }
            this.argbValue = l10;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.argbValue);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformDoublePair {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private Double f37856x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private Double f37857y;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            private Double f37858x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            private Double f37859y;

            public PlatformDoublePair build() {
                PlatformDoublePair platformDoublePair = new PlatformDoublePair();
                platformDoublePair.setX(this.f37858x);
                platformDoublePair.setY(this.f37859y);
                return platformDoublePair;
            }

            @CanIgnoreReturnValue
            public Builder setX(Double d10) {
                this.f37858x = d10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setY(Double d10) {
                this.f37859y = d10;
                return this;
            }
        }

        public static PlatformDoublePair fromList(ArrayList<Object> arrayList) {
            PlatformDoublePair platformDoublePair = new PlatformDoublePair();
            platformDoublePair.setX((Double) arrayList.get(0));
            platformDoublePair.setY((Double) arrayList.get(1));
            return platformDoublePair;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformDoublePair.class == obj.getClass()) {
                PlatformDoublePair platformDoublePair = (PlatformDoublePair) obj;
                if (this.f37856x.equals(platformDoublePair.f37856x) && this.f37857y.equals(platformDoublePair.f37857y)) {
                    return true;
                }
            }
            return false;
        }

        public Double getX() {
            return this.f37856x;
        }

        public Double getY() {
            return this.f37857y;
        }

        public int hashCode() {
            return Objects.hash(this.f37856x, this.f37857y);
        }

        public void setX(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"x\" is null.");
            }
            this.f37856x = d10;
        }

        public void setY(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"y\" is null.");
            }
            this.f37857y = d10;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.f37856x);
            arrayList.add(this.f37857y);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformEdgeInsets {
        private Double bottom;
        private Double left;
        private Double right;
        private Double top;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private Double bottom;
            private Double left;
            private Double right;
            private Double top;

            public PlatformEdgeInsets build() {
                PlatformEdgeInsets platformEdgeInsets = new PlatformEdgeInsets();
                platformEdgeInsets.setTop(this.top);
                platformEdgeInsets.setBottom(this.bottom);
                platformEdgeInsets.setLeft(this.left);
                platformEdgeInsets.setRight(this.right);
                return platformEdgeInsets;
            }

            @CanIgnoreReturnValue
            public Builder setBottom(Double d10) {
                this.bottom = d10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setLeft(Double d10) {
                this.left = d10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setRight(Double d10) {
                this.right = d10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setTop(Double d10) {
                this.top = d10;
                return this;
            }
        }

        public static PlatformEdgeInsets fromList(ArrayList<Object> arrayList) {
            PlatformEdgeInsets platformEdgeInsets = new PlatformEdgeInsets();
            platformEdgeInsets.setTop((Double) arrayList.get(0));
            platformEdgeInsets.setBottom((Double) arrayList.get(1));
            platformEdgeInsets.setLeft((Double) arrayList.get(2));
            platformEdgeInsets.setRight((Double) arrayList.get(3));
            return platformEdgeInsets;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformEdgeInsets.class == obj.getClass()) {
                PlatformEdgeInsets platformEdgeInsets = (PlatformEdgeInsets) obj;
                if (this.top.equals(platformEdgeInsets.top) && this.bottom.equals(platformEdgeInsets.bottom) && this.left.equals(platformEdgeInsets.left) && this.right.equals(platformEdgeInsets.right)) {
                    return true;
                }
            }
            return false;
        }

        public Double getBottom() {
            return this.bottom;
        }

        public Double getLeft() {
            return this.left;
        }

        public Double getRight() {
            return this.right;
        }

        public Double getTop() {
            return this.top;
        }

        public int hashCode() {
            return Objects.hash(this.top, this.bottom, this.left, this.right);
        }

        public void setBottom(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"bottom\" is null.");
            }
            this.bottom = d10;
        }

        public void setLeft(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"left\" is null.");
            }
            this.left = d10;
        }

        public void setRight(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"right\" is null.");
            }
            this.right = d10;
        }

        public void setTop(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"top\" is null.");
            }
            this.top = d10;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.top);
            arrayList.add(this.bottom);
            arrayList.add(this.left);
            arrayList.add(this.right);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformGroundOverlay {
        private PlatformDoublePair anchor;
        private Double bearing;
        private PlatformLatLngBounds bounds;
        private Boolean clickable;
        private String groundOverlayId;
        private Double height;
        private PlatformBitmap image;
        private PlatformLatLng position;
        private Double transparency;
        private Boolean visible;
        private Double width;
        private Long zIndex;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private PlatformDoublePair anchor;
            private Double bearing;
            private PlatformLatLngBounds bounds;
            private Boolean clickable;
            private String groundOverlayId;
            private Double height;
            private PlatformBitmap image;
            private PlatformLatLng position;
            private Double transparency;
            private Boolean visible;
            private Double width;
            private Long zIndex;

            public PlatformGroundOverlay build() {
                PlatformGroundOverlay platformGroundOverlay = new PlatformGroundOverlay();
                platformGroundOverlay.setGroundOverlayId(this.groundOverlayId);
                platformGroundOverlay.setImage(this.image);
                platformGroundOverlay.setPosition(this.position);
                platformGroundOverlay.setBounds(this.bounds);
                platformGroundOverlay.setWidth(this.width);
                platformGroundOverlay.setHeight(this.height);
                platformGroundOverlay.setAnchor(this.anchor);
                platformGroundOverlay.setTransparency(this.transparency);
                platformGroundOverlay.setBearing(this.bearing);
                platformGroundOverlay.setZIndex(this.zIndex);
                platformGroundOverlay.setVisible(this.visible);
                platformGroundOverlay.setClickable(this.clickable);
                return platformGroundOverlay;
            }

            @CanIgnoreReturnValue
            public Builder setAnchor(PlatformDoublePair platformDoublePair) {
                this.anchor = platformDoublePair;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setBearing(Double d10) {
                this.bearing = d10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setBounds(PlatformLatLngBounds platformLatLngBounds) {
                this.bounds = platformLatLngBounds;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setClickable(Boolean bool) {
                this.clickable = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setGroundOverlayId(String str) {
                this.groundOverlayId = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setHeight(Double d10) {
                this.height = d10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setImage(PlatformBitmap platformBitmap) {
                this.image = platformBitmap;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPosition(PlatformLatLng platformLatLng) {
                this.position = platformLatLng;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setTransparency(Double d10) {
                this.transparency = d10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setVisible(Boolean bool) {
                this.visible = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setWidth(Double d10) {
                this.width = d10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setZIndex(Long l10) {
                this.zIndex = l10;
                return this;
            }
        }

        public static PlatformGroundOverlay fromList(ArrayList<Object> arrayList) {
            PlatformGroundOverlay platformGroundOverlay = new PlatformGroundOverlay();
            platformGroundOverlay.setGroundOverlayId((String) arrayList.get(0));
            platformGroundOverlay.setImage((PlatformBitmap) arrayList.get(1));
            platformGroundOverlay.setPosition((PlatformLatLng) arrayList.get(2));
            platformGroundOverlay.setBounds((PlatformLatLngBounds) arrayList.get(3));
            platformGroundOverlay.setWidth((Double) arrayList.get(4));
            platformGroundOverlay.setHeight((Double) arrayList.get(5));
            platformGroundOverlay.setAnchor((PlatformDoublePair) arrayList.get(6));
            platformGroundOverlay.setTransparency((Double) arrayList.get(7));
            platformGroundOverlay.setBearing((Double) arrayList.get(8));
            platformGroundOverlay.setZIndex((Long) arrayList.get(9));
            platformGroundOverlay.setVisible((Boolean) arrayList.get(10));
            platformGroundOverlay.setClickable((Boolean) arrayList.get(11));
            return platformGroundOverlay;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformGroundOverlay.class == obj.getClass()) {
                PlatformGroundOverlay platformGroundOverlay = (PlatformGroundOverlay) obj;
                if (this.groundOverlayId.equals(platformGroundOverlay.groundOverlayId) && this.image.equals(platformGroundOverlay.image) && Objects.equals(this.position, platformGroundOverlay.position) && Objects.equals(this.bounds, platformGroundOverlay.bounds) && Objects.equals(this.width, platformGroundOverlay.width) && Objects.equals(this.height, platformGroundOverlay.height) && Objects.equals(this.anchor, platformGroundOverlay.anchor) && this.transparency.equals(platformGroundOverlay.transparency) && this.bearing.equals(platformGroundOverlay.bearing) && this.zIndex.equals(platformGroundOverlay.zIndex) && this.visible.equals(platformGroundOverlay.visible) && this.clickable.equals(platformGroundOverlay.clickable)) {
                    return true;
                }
            }
            return false;
        }

        public PlatformDoublePair getAnchor() {
            return this.anchor;
        }

        public Double getBearing() {
            return this.bearing;
        }

        public PlatformLatLngBounds getBounds() {
            return this.bounds;
        }

        public Boolean getClickable() {
            return this.clickable;
        }

        public String getGroundOverlayId() {
            return this.groundOverlayId;
        }

        public Double getHeight() {
            return this.height;
        }

        public PlatformBitmap getImage() {
            return this.image;
        }

        public PlatformLatLng getPosition() {
            return this.position;
        }

        public Double getTransparency() {
            return this.transparency;
        }

        public Boolean getVisible() {
            return this.visible;
        }

        public Double getWidth() {
            return this.width;
        }

        public Long getZIndex() {
            return this.zIndex;
        }

        public int hashCode() {
            return Objects.hash(this.groundOverlayId, this.image, this.position, this.bounds, this.width, this.height, this.anchor, this.transparency, this.bearing, this.zIndex, this.visible, this.clickable);
        }

        public void setAnchor(PlatformDoublePair platformDoublePair) {
            this.anchor = platformDoublePair;
        }

        public void setBearing(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"bearing\" is null.");
            }
            this.bearing = d10;
        }

        public void setBounds(PlatformLatLngBounds platformLatLngBounds) {
            this.bounds = platformLatLngBounds;
        }

        public void setClickable(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"clickable\" is null.");
            }
            this.clickable = bool;
        }

        public void setGroundOverlayId(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"groundOverlayId\" is null.");
            }
            this.groundOverlayId = str;
        }

        public void setHeight(Double d10) {
            this.height = d10;
        }

        public void setImage(PlatformBitmap platformBitmap) {
            if (platformBitmap == null) {
                throw new IllegalStateException("Nonnull field \"image\" is null.");
            }
            this.image = platformBitmap;
        }

        public void setPosition(PlatformLatLng platformLatLng) {
            this.position = platformLatLng;
        }

        public void setTransparency(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"transparency\" is null.");
            }
            this.transparency = d10;
        }

        public void setVisible(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"visible\" is null.");
            }
            this.visible = bool;
        }

        public void setWidth(Double d10) {
            this.width = d10;
        }

        public void setZIndex(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"zIndex\" is null.");
            }
            this.zIndex = l10;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(12);
            arrayList.add(this.groundOverlayId);
            arrayList.add(this.image);
            arrayList.add(this.position);
            arrayList.add(this.bounds);
            arrayList.add(this.width);
            arrayList.add(this.height);
            arrayList.add(this.anchor);
            arrayList.add(this.transparency);
            arrayList.add(this.bearing);
            arrayList.add(this.zIndex);
            arrayList.add(this.visible);
            arrayList.add(this.clickable);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformHeatmap {
        private List<PlatformWeightedLatLng> data;
        private PlatformHeatmapGradient gradient;
        private String heatmapId;
        private Double maxIntensity;
        private Double opacity;
        private Long radius;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private List<PlatformWeightedLatLng> data;
            private PlatformHeatmapGradient gradient;
            private String heatmapId;
            private Double maxIntensity;
            private Double opacity;
            private Long radius;

            public PlatformHeatmap build() {
                PlatformHeatmap platformHeatmap = new PlatformHeatmap();
                platformHeatmap.setHeatmapId(this.heatmapId);
                platformHeatmap.setData(this.data);
                platformHeatmap.setGradient(this.gradient);
                platformHeatmap.setOpacity(this.opacity);
                platformHeatmap.setRadius(this.radius);
                platformHeatmap.setMaxIntensity(this.maxIntensity);
                return platformHeatmap;
            }

            @CanIgnoreReturnValue
            public Builder setData(List<PlatformWeightedLatLng> list) {
                this.data = list;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setGradient(PlatformHeatmapGradient platformHeatmapGradient) {
                this.gradient = platformHeatmapGradient;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setHeatmapId(String str) {
                this.heatmapId = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMaxIntensity(Double d10) {
                this.maxIntensity = d10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setOpacity(Double d10) {
                this.opacity = d10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setRadius(Long l10) {
                this.radius = l10;
                return this;
            }
        }

        public static PlatformHeatmap fromList(ArrayList<Object> arrayList) {
            PlatformHeatmap platformHeatmap = new PlatformHeatmap();
            platformHeatmap.setHeatmapId((String) arrayList.get(0));
            platformHeatmap.setData((List) arrayList.get(1));
            platformHeatmap.setGradient((PlatformHeatmapGradient) arrayList.get(2));
            platformHeatmap.setOpacity((Double) arrayList.get(3));
            platformHeatmap.setRadius((Long) arrayList.get(4));
            platformHeatmap.setMaxIntensity((Double) arrayList.get(5));
            return platformHeatmap;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformHeatmap.class == obj.getClass()) {
                PlatformHeatmap platformHeatmap = (PlatformHeatmap) obj;
                if (this.heatmapId.equals(platformHeatmap.heatmapId) && this.data.equals(platformHeatmap.data) && Objects.equals(this.gradient, platformHeatmap.gradient) && this.opacity.equals(platformHeatmap.opacity) && this.radius.equals(platformHeatmap.radius) && Objects.equals(this.maxIntensity, platformHeatmap.maxIntensity)) {
                    return true;
                }
            }
            return false;
        }

        public List<PlatformWeightedLatLng> getData() {
            return this.data;
        }

        public PlatformHeatmapGradient getGradient() {
            return this.gradient;
        }

        public String getHeatmapId() {
            return this.heatmapId;
        }

        public Double getMaxIntensity() {
            return this.maxIntensity;
        }

        public Double getOpacity() {
            return this.opacity;
        }

        public Long getRadius() {
            return this.radius;
        }

        public int hashCode() {
            return Objects.hash(this.heatmapId, this.data, this.gradient, this.opacity, this.radius, this.maxIntensity);
        }

        public void setData(List<PlatformWeightedLatLng> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"data\" is null.");
            }
            this.data = list;
        }

        public void setGradient(PlatformHeatmapGradient platformHeatmapGradient) {
            this.gradient = platformHeatmapGradient;
        }

        public void setHeatmapId(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"heatmapId\" is null.");
            }
            this.heatmapId = str;
        }

        public void setMaxIntensity(Double d10) {
            this.maxIntensity = d10;
        }

        public void setOpacity(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"opacity\" is null.");
            }
            this.opacity = d10;
        }

        public void setRadius(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"radius\" is null.");
            }
            this.radius = l10;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(6);
            arrayList.add(this.heatmapId);
            arrayList.add(this.data);
            arrayList.add(this.gradient);
            arrayList.add(this.opacity);
            arrayList.add(this.radius);
            arrayList.add(this.maxIntensity);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformHeatmapGradient {
        private Long colorMapSize;
        private List<PlatformColor> colors;
        private List<Double> startPoints;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private Long colorMapSize;
            private List<PlatformColor> colors;
            private List<Double> startPoints;

            public PlatformHeatmapGradient build() {
                PlatformHeatmapGradient platformHeatmapGradient = new PlatformHeatmapGradient();
                platformHeatmapGradient.setColors(this.colors);
                platformHeatmapGradient.setStartPoints(this.startPoints);
                platformHeatmapGradient.setColorMapSize(this.colorMapSize);
                return platformHeatmapGradient;
            }

            @CanIgnoreReturnValue
            public Builder setColorMapSize(Long l10) {
                this.colorMapSize = l10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setColors(List<PlatformColor> list) {
                this.colors = list;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setStartPoints(List<Double> list) {
                this.startPoints = list;
                return this;
            }
        }

        public static PlatformHeatmapGradient fromList(ArrayList<Object> arrayList) {
            PlatformHeatmapGradient platformHeatmapGradient = new PlatformHeatmapGradient();
            platformHeatmapGradient.setColors((List) arrayList.get(0));
            platformHeatmapGradient.setStartPoints((List) arrayList.get(1));
            platformHeatmapGradient.setColorMapSize((Long) arrayList.get(2));
            return platformHeatmapGradient;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformHeatmapGradient.class == obj.getClass()) {
                PlatformHeatmapGradient platformHeatmapGradient = (PlatformHeatmapGradient) obj;
                if (this.colors.equals(platformHeatmapGradient.colors) && this.startPoints.equals(platformHeatmapGradient.startPoints) && this.colorMapSize.equals(platformHeatmapGradient.colorMapSize)) {
                    return true;
                }
            }
            return false;
        }

        public Long getColorMapSize() {
            return this.colorMapSize;
        }

        public List<PlatformColor> getColors() {
            return this.colors;
        }

        public List<Double> getStartPoints() {
            return this.startPoints;
        }

        public int hashCode() {
            return Objects.hash(this.colors, this.startPoints, this.colorMapSize);
        }

        public void setColorMapSize(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"colorMapSize\" is null.");
            }
            this.colorMapSize = l10;
        }

        public void setColors(List<PlatformColor> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"colors\" is null.");
            }
            this.colors = list;
        }

        public void setStartPoints(List<Double> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"startPoints\" is null.");
            }
            this.startPoints = list;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.colors);
            arrayList.add(this.startPoints);
            arrayList.add(this.colorMapSize);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformInfoWindow {
        private PlatformDoublePair anchor;
        private String snippet;
        private String title;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private PlatformDoublePair anchor;
            private String snippet;
            private String title;

            public PlatformInfoWindow build() {
                PlatformInfoWindow platformInfoWindow = new PlatformInfoWindow();
                platformInfoWindow.setTitle(this.title);
                platformInfoWindow.setSnippet(this.snippet);
                platformInfoWindow.setAnchor(this.anchor);
                return platformInfoWindow;
            }

            @CanIgnoreReturnValue
            public Builder setAnchor(PlatformDoublePair platformDoublePair) {
                this.anchor = platformDoublePair;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setSnippet(String str) {
                this.snippet = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setTitle(String str) {
                this.title = str;
                return this;
            }
        }

        public static PlatformInfoWindow fromList(ArrayList<Object> arrayList) {
            PlatformInfoWindow platformInfoWindow = new PlatformInfoWindow();
            platformInfoWindow.setTitle((String) arrayList.get(0));
            platformInfoWindow.setSnippet((String) arrayList.get(1));
            platformInfoWindow.setAnchor((PlatformDoublePair) arrayList.get(2));
            return platformInfoWindow;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformInfoWindow.class == obj.getClass()) {
                PlatformInfoWindow platformInfoWindow = (PlatformInfoWindow) obj;
                if (Objects.equals(this.title, platformInfoWindow.title) && Objects.equals(this.snippet, platformInfoWindow.snippet) && this.anchor.equals(platformInfoWindow.anchor)) {
                    return true;
                }
            }
            return false;
        }

        public PlatformDoublePair getAnchor() {
            return this.anchor;
        }

        public String getSnippet() {
            return this.snippet;
        }

        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Objects.hash(this.title, this.snippet, this.anchor);
        }

        public void setAnchor(PlatformDoublePair platformDoublePair) {
            if (platformDoublePair == null) {
                throw new IllegalStateException("Nonnull field \"anchor\" is null.");
            }
            this.anchor = platformDoublePair;
        }

        public void setSnippet(String str) {
            this.snippet = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.title);
            arrayList.add(this.snippet);
            arrayList.add(this.anchor);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum PlatformJointType {
        MITERED(0),
        BEVEL(1),
        ROUND(2);

        final int index;

        PlatformJointType(int i10) {
            this.index = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformLatLng {
        private Double latitude;
        private Double longitude;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private Double latitude;
            private Double longitude;

            public PlatformLatLng build() {
                PlatformLatLng platformLatLng = new PlatformLatLng();
                platformLatLng.setLatitude(this.latitude);
                platformLatLng.setLongitude(this.longitude);
                return platformLatLng;
            }

            @CanIgnoreReturnValue
            public Builder setLatitude(Double d10) {
                this.latitude = d10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setLongitude(Double d10) {
                this.longitude = d10;
                return this;
            }
        }

        public static PlatformLatLng fromList(ArrayList<Object> arrayList) {
            PlatformLatLng platformLatLng = new PlatformLatLng();
            platformLatLng.setLatitude((Double) arrayList.get(0));
            platformLatLng.setLongitude((Double) arrayList.get(1));
            return platformLatLng;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformLatLng.class == obj.getClass()) {
                PlatformLatLng platformLatLng = (PlatformLatLng) obj;
                if (this.latitude.equals(platformLatLng.latitude) && this.longitude.equals(platformLatLng.longitude)) {
                    return true;
                }
            }
            return false;
        }

        public Double getLatitude() {
            return this.latitude;
        }

        public Double getLongitude() {
            return this.longitude;
        }

        public int hashCode() {
            return Objects.hash(this.latitude, this.longitude);
        }

        public void setLatitude(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"latitude\" is null.");
            }
            this.latitude = d10;
        }

        public void setLongitude(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"longitude\" is null.");
            }
            this.longitude = d10;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.latitude);
            arrayList.add(this.longitude);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformLatLngBounds {
        private PlatformLatLng northeast;
        private PlatformLatLng southwest;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private PlatformLatLng northeast;
            private PlatformLatLng southwest;

            public PlatformLatLngBounds build() {
                PlatformLatLngBounds platformLatLngBounds = new PlatformLatLngBounds();
                platformLatLngBounds.setNortheast(this.northeast);
                platformLatLngBounds.setSouthwest(this.southwest);
                return platformLatLngBounds;
            }

            @CanIgnoreReturnValue
            public Builder setNortheast(PlatformLatLng platformLatLng) {
                this.northeast = platformLatLng;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setSouthwest(PlatformLatLng platformLatLng) {
                this.southwest = platformLatLng;
                return this;
            }
        }

        public static PlatformLatLngBounds fromList(ArrayList<Object> arrayList) {
            PlatformLatLngBounds platformLatLngBounds = new PlatformLatLngBounds();
            platformLatLngBounds.setNortheast((PlatformLatLng) arrayList.get(0));
            platformLatLngBounds.setSouthwest((PlatformLatLng) arrayList.get(1));
            return platformLatLngBounds;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformLatLngBounds.class == obj.getClass()) {
                PlatformLatLngBounds platformLatLngBounds = (PlatformLatLngBounds) obj;
                if (this.northeast.equals(platformLatLngBounds.northeast) && this.southwest.equals(platformLatLngBounds.southwest)) {
                    return true;
                }
            }
            return false;
        }

        public PlatformLatLng getNortheast() {
            return this.northeast;
        }

        public PlatformLatLng getSouthwest() {
            return this.southwest;
        }

        public int hashCode() {
            return Objects.hash(this.northeast, this.southwest);
        }

        public void setNortheast(PlatformLatLng platformLatLng) {
            if (platformLatLng == null) {
                throw new IllegalStateException("Nonnull field \"northeast\" is null.");
            }
            this.northeast = platformLatLng;
        }

        public void setSouthwest(PlatformLatLng platformLatLng) {
            if (platformLatLng == null) {
                throw new IllegalStateException("Nonnull field \"southwest\" is null.");
            }
            this.southwest = platformLatLng;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.northeast);
            arrayList.add(this.southwest);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum PlatformMapBitmapScaling {
        AUTO(0),
        NONE(1);

        final int index;

        PlatformMapBitmapScaling(int i10) {
            this.index = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformMapConfiguration {
        private Boolean buildingsEnabled;
        private PlatformCameraTargetBounds cameraTargetBounds;
        private Boolean compassEnabled;
        private Boolean indoorViewEnabled;
        private Boolean liteModeEnabled;
        private String mapId;
        private Boolean mapToolbarEnabled;
        private PlatformMapType mapType;
        private PlatformMarkerType markerType;
        private PlatformZoomRange minMaxZoomPreference;
        private Boolean myLocationButtonEnabled;
        private Boolean myLocationEnabled;
        private PlatformEdgeInsets padding;
        private Boolean rotateGesturesEnabled;
        private Boolean scrollGesturesEnabled;
        private String style;
        private Boolean tiltGesturesEnabled;
        private Boolean trackCameraPosition;
        private Boolean trafficEnabled;
        private Boolean zoomControlsEnabled;
        private Boolean zoomGesturesEnabled;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private Boolean buildingsEnabled;
            private PlatformCameraTargetBounds cameraTargetBounds;
            private Boolean compassEnabled;
            private Boolean indoorViewEnabled;
            private Boolean liteModeEnabled;
            private String mapId;
            private Boolean mapToolbarEnabled;
            private PlatformMapType mapType;
            private PlatformMarkerType markerType;
            private PlatformZoomRange minMaxZoomPreference;
            private Boolean myLocationButtonEnabled;
            private Boolean myLocationEnabled;
            private PlatformEdgeInsets padding;
            private Boolean rotateGesturesEnabled;
            private Boolean scrollGesturesEnabled;
            private String style;
            private Boolean tiltGesturesEnabled;
            private Boolean trackCameraPosition;
            private Boolean trafficEnabled;
            private Boolean zoomControlsEnabled;
            private Boolean zoomGesturesEnabled;

            public PlatformMapConfiguration build() {
                PlatformMapConfiguration platformMapConfiguration = new PlatformMapConfiguration();
                platformMapConfiguration.setCompassEnabled(this.compassEnabled);
                platformMapConfiguration.setCameraTargetBounds(this.cameraTargetBounds);
                platformMapConfiguration.setMapType(this.mapType);
                platformMapConfiguration.setMinMaxZoomPreference(this.minMaxZoomPreference);
                platformMapConfiguration.setMapToolbarEnabled(this.mapToolbarEnabled);
                platformMapConfiguration.setRotateGesturesEnabled(this.rotateGesturesEnabled);
                platformMapConfiguration.setScrollGesturesEnabled(this.scrollGesturesEnabled);
                platformMapConfiguration.setTiltGesturesEnabled(this.tiltGesturesEnabled);
                platformMapConfiguration.setTrackCameraPosition(this.trackCameraPosition);
                platformMapConfiguration.setZoomControlsEnabled(this.zoomControlsEnabled);
                platformMapConfiguration.setZoomGesturesEnabled(this.zoomGesturesEnabled);
                platformMapConfiguration.setMyLocationEnabled(this.myLocationEnabled);
                platformMapConfiguration.setMyLocationButtonEnabled(this.myLocationButtonEnabled);
                platformMapConfiguration.setPadding(this.padding);
                platformMapConfiguration.setIndoorViewEnabled(this.indoorViewEnabled);
                platformMapConfiguration.setTrafficEnabled(this.trafficEnabled);
                platformMapConfiguration.setBuildingsEnabled(this.buildingsEnabled);
                platformMapConfiguration.setLiteModeEnabled(this.liteModeEnabled);
                platformMapConfiguration.setMarkerType(this.markerType);
                platformMapConfiguration.setMapId(this.mapId);
                platformMapConfiguration.setStyle(this.style);
                return platformMapConfiguration;
            }

            @CanIgnoreReturnValue
            public Builder setBuildingsEnabled(Boolean bool) {
                this.buildingsEnabled = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setCameraTargetBounds(PlatformCameraTargetBounds platformCameraTargetBounds) {
                this.cameraTargetBounds = platformCameraTargetBounds;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setCompassEnabled(Boolean bool) {
                this.compassEnabled = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setIndoorViewEnabled(Boolean bool) {
                this.indoorViewEnabled = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setLiteModeEnabled(Boolean bool) {
                this.liteModeEnabled = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMapId(String str) {
                this.mapId = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMapToolbarEnabled(Boolean bool) {
                this.mapToolbarEnabled = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMapType(PlatformMapType platformMapType) {
                this.mapType = platformMapType;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMarkerType(PlatformMarkerType platformMarkerType) {
                this.markerType = platformMarkerType;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMinMaxZoomPreference(PlatformZoomRange platformZoomRange) {
                this.minMaxZoomPreference = platformZoomRange;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMyLocationButtonEnabled(Boolean bool) {
                this.myLocationButtonEnabled = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMyLocationEnabled(Boolean bool) {
                this.myLocationEnabled = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPadding(PlatformEdgeInsets platformEdgeInsets) {
                this.padding = platformEdgeInsets;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setRotateGesturesEnabled(Boolean bool) {
                this.rotateGesturesEnabled = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setScrollGesturesEnabled(Boolean bool) {
                this.scrollGesturesEnabled = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setStyle(String str) {
                this.style = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setTiltGesturesEnabled(Boolean bool) {
                this.tiltGesturesEnabled = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setTrackCameraPosition(Boolean bool) {
                this.trackCameraPosition = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setTrafficEnabled(Boolean bool) {
                this.trafficEnabled = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setZoomControlsEnabled(Boolean bool) {
                this.zoomControlsEnabled = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setZoomGesturesEnabled(Boolean bool) {
                this.zoomGesturesEnabled = bool;
                return this;
            }
        }

        public static PlatformMapConfiguration fromList(ArrayList<Object> arrayList) {
            PlatformMapConfiguration platformMapConfiguration = new PlatformMapConfiguration();
            platformMapConfiguration.setCompassEnabled((Boolean) arrayList.get(0));
            platformMapConfiguration.setCameraTargetBounds((PlatformCameraTargetBounds) arrayList.get(1));
            platformMapConfiguration.setMapType((PlatformMapType) arrayList.get(2));
            platformMapConfiguration.setMinMaxZoomPreference((PlatformZoomRange) arrayList.get(3));
            platformMapConfiguration.setMapToolbarEnabled((Boolean) arrayList.get(4));
            platformMapConfiguration.setRotateGesturesEnabled((Boolean) arrayList.get(5));
            platformMapConfiguration.setScrollGesturesEnabled((Boolean) arrayList.get(6));
            platformMapConfiguration.setTiltGesturesEnabled((Boolean) arrayList.get(7));
            platformMapConfiguration.setTrackCameraPosition((Boolean) arrayList.get(8));
            platformMapConfiguration.setZoomControlsEnabled((Boolean) arrayList.get(9));
            platformMapConfiguration.setZoomGesturesEnabled((Boolean) arrayList.get(10));
            platformMapConfiguration.setMyLocationEnabled((Boolean) arrayList.get(11));
            platformMapConfiguration.setMyLocationButtonEnabled((Boolean) arrayList.get(12));
            platformMapConfiguration.setPadding((PlatformEdgeInsets) arrayList.get(13));
            platformMapConfiguration.setIndoorViewEnabled((Boolean) arrayList.get(14));
            platformMapConfiguration.setTrafficEnabled((Boolean) arrayList.get(15));
            platformMapConfiguration.setBuildingsEnabled((Boolean) arrayList.get(16));
            platformMapConfiguration.setLiteModeEnabled((Boolean) arrayList.get(17));
            platformMapConfiguration.setMarkerType((PlatformMarkerType) arrayList.get(18));
            platformMapConfiguration.setMapId((String) arrayList.get(19));
            platformMapConfiguration.setStyle((String) arrayList.get(20));
            return platformMapConfiguration;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformMapConfiguration.class == obj.getClass()) {
                PlatformMapConfiguration platformMapConfiguration = (PlatformMapConfiguration) obj;
                if (Objects.equals(this.compassEnabled, platformMapConfiguration.compassEnabled) && Objects.equals(this.cameraTargetBounds, platformMapConfiguration.cameraTargetBounds) && Objects.equals(this.mapType, platformMapConfiguration.mapType) && Objects.equals(this.minMaxZoomPreference, platformMapConfiguration.minMaxZoomPreference) && Objects.equals(this.mapToolbarEnabled, platformMapConfiguration.mapToolbarEnabled) && Objects.equals(this.rotateGesturesEnabled, platformMapConfiguration.rotateGesturesEnabled) && Objects.equals(this.scrollGesturesEnabled, platformMapConfiguration.scrollGesturesEnabled) && Objects.equals(this.tiltGesturesEnabled, platformMapConfiguration.tiltGesturesEnabled) && Objects.equals(this.trackCameraPosition, platformMapConfiguration.trackCameraPosition) && Objects.equals(this.zoomControlsEnabled, platformMapConfiguration.zoomControlsEnabled) && Objects.equals(this.zoomGesturesEnabled, platformMapConfiguration.zoomGesturesEnabled) && Objects.equals(this.myLocationEnabled, platformMapConfiguration.myLocationEnabled) && Objects.equals(this.myLocationButtonEnabled, platformMapConfiguration.myLocationButtonEnabled) && Objects.equals(this.padding, platformMapConfiguration.padding) && Objects.equals(this.indoorViewEnabled, platformMapConfiguration.indoorViewEnabled) && Objects.equals(this.trafficEnabled, platformMapConfiguration.trafficEnabled) && Objects.equals(this.buildingsEnabled, platformMapConfiguration.buildingsEnabled) && Objects.equals(this.liteModeEnabled, platformMapConfiguration.liteModeEnabled) && this.markerType.equals(platformMapConfiguration.markerType) && Objects.equals(this.mapId, platformMapConfiguration.mapId) && Objects.equals(this.style, platformMapConfiguration.style)) {
                    return true;
                }
            }
            return false;
        }

        public Boolean getBuildingsEnabled() {
            return this.buildingsEnabled;
        }

        public PlatformCameraTargetBounds getCameraTargetBounds() {
            return this.cameraTargetBounds;
        }

        public Boolean getCompassEnabled() {
            return this.compassEnabled;
        }

        public Boolean getIndoorViewEnabled() {
            return this.indoorViewEnabled;
        }

        public Boolean getLiteModeEnabled() {
            return this.liteModeEnabled;
        }

        public String getMapId() {
            return this.mapId;
        }

        public Boolean getMapToolbarEnabled() {
            return this.mapToolbarEnabled;
        }

        public PlatformMapType getMapType() {
            return this.mapType;
        }

        public PlatformMarkerType getMarkerType() {
            return this.markerType;
        }

        public PlatformZoomRange getMinMaxZoomPreference() {
            return this.minMaxZoomPreference;
        }

        public Boolean getMyLocationButtonEnabled() {
            return this.myLocationButtonEnabled;
        }

        public Boolean getMyLocationEnabled() {
            return this.myLocationEnabled;
        }

        public PlatformEdgeInsets getPadding() {
            return this.padding;
        }

        public Boolean getRotateGesturesEnabled() {
            return this.rotateGesturesEnabled;
        }

        public Boolean getScrollGesturesEnabled() {
            return this.scrollGesturesEnabled;
        }

        public String getStyle() {
            return this.style;
        }

        public Boolean getTiltGesturesEnabled() {
            return this.tiltGesturesEnabled;
        }

        public Boolean getTrackCameraPosition() {
            return this.trackCameraPosition;
        }

        public Boolean getTrafficEnabled() {
            return this.trafficEnabled;
        }

        public Boolean getZoomControlsEnabled() {
            return this.zoomControlsEnabled;
        }

        public Boolean getZoomGesturesEnabled() {
            return this.zoomGesturesEnabled;
        }

        public int hashCode() {
            return Objects.hash(this.compassEnabled, this.cameraTargetBounds, this.mapType, this.minMaxZoomPreference, this.mapToolbarEnabled, this.rotateGesturesEnabled, this.scrollGesturesEnabled, this.tiltGesturesEnabled, this.trackCameraPosition, this.zoomControlsEnabled, this.zoomGesturesEnabled, this.myLocationEnabled, this.myLocationButtonEnabled, this.padding, this.indoorViewEnabled, this.trafficEnabled, this.buildingsEnabled, this.liteModeEnabled, this.markerType, this.mapId, this.style);
        }

        public void setBuildingsEnabled(Boolean bool) {
            this.buildingsEnabled = bool;
        }

        public void setCameraTargetBounds(PlatformCameraTargetBounds platformCameraTargetBounds) {
            this.cameraTargetBounds = platformCameraTargetBounds;
        }

        public void setCompassEnabled(Boolean bool) {
            this.compassEnabled = bool;
        }

        public void setIndoorViewEnabled(Boolean bool) {
            this.indoorViewEnabled = bool;
        }

        public void setLiteModeEnabled(Boolean bool) {
            this.liteModeEnabled = bool;
        }

        public void setMapId(String str) {
            this.mapId = str;
        }

        public void setMapToolbarEnabled(Boolean bool) {
            this.mapToolbarEnabled = bool;
        }

        public void setMapType(PlatformMapType platformMapType) {
            this.mapType = platformMapType;
        }

        public void setMarkerType(PlatformMarkerType platformMarkerType) {
            if (platformMarkerType == null) {
                throw new IllegalStateException("Nonnull field \"markerType\" is null.");
            }
            this.markerType = platformMarkerType;
        }

        public void setMinMaxZoomPreference(PlatformZoomRange platformZoomRange) {
            this.minMaxZoomPreference = platformZoomRange;
        }

        public void setMyLocationButtonEnabled(Boolean bool) {
            this.myLocationButtonEnabled = bool;
        }

        public void setMyLocationEnabled(Boolean bool) {
            this.myLocationEnabled = bool;
        }

        public void setPadding(PlatformEdgeInsets platformEdgeInsets) {
            this.padding = platformEdgeInsets;
        }

        public void setRotateGesturesEnabled(Boolean bool) {
            this.rotateGesturesEnabled = bool;
        }

        public void setScrollGesturesEnabled(Boolean bool) {
            this.scrollGesturesEnabled = bool;
        }

        public void setStyle(String str) {
            this.style = str;
        }

        public void setTiltGesturesEnabled(Boolean bool) {
            this.tiltGesturesEnabled = bool;
        }

        public void setTrackCameraPosition(Boolean bool) {
            this.trackCameraPosition = bool;
        }

        public void setTrafficEnabled(Boolean bool) {
            this.trafficEnabled = bool;
        }

        public void setZoomControlsEnabled(Boolean bool) {
            this.zoomControlsEnabled = bool;
        }

        public void setZoomGesturesEnabled(Boolean bool) {
            this.zoomGesturesEnabled = bool;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(21);
            arrayList.add(this.compassEnabled);
            arrayList.add(this.cameraTargetBounds);
            arrayList.add(this.mapType);
            arrayList.add(this.minMaxZoomPreference);
            arrayList.add(this.mapToolbarEnabled);
            arrayList.add(this.rotateGesturesEnabled);
            arrayList.add(this.scrollGesturesEnabled);
            arrayList.add(this.tiltGesturesEnabled);
            arrayList.add(this.trackCameraPosition);
            arrayList.add(this.zoomControlsEnabled);
            arrayList.add(this.zoomGesturesEnabled);
            arrayList.add(this.myLocationEnabled);
            arrayList.add(this.myLocationButtonEnabled);
            arrayList.add(this.padding);
            arrayList.add(this.indoorViewEnabled);
            arrayList.add(this.trafficEnabled);
            arrayList.add(this.buildingsEnabled);
            arrayList.add(this.liteModeEnabled);
            arrayList.add(this.markerType);
            arrayList.add(this.mapId);
            arrayList.add(this.style);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum PlatformMapType {
        NONE(0),
        NORMAL(1),
        SATELLITE(2),
        TERRAIN(3),
        HYBRID(4);

        final int index;

        PlatformMapType(int i10) {
            this.index = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformMapViewCreationParams {
        private PlatformCameraPosition initialCameraPosition;
        private List<PlatformCircle> initialCircles;
        private List<PlatformClusterManager> initialClusterManagers;
        private List<PlatformGroundOverlay> initialGroundOverlays;
        private List<PlatformHeatmap> initialHeatmaps;
        private List<PlatformMarker> initialMarkers;
        private List<PlatformPolygon> initialPolygons;
        private List<PlatformPolyline> initialPolylines;
        private List<PlatformTileOverlay> initialTileOverlays;
        private PlatformMapConfiguration mapConfiguration;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private PlatformCameraPosition initialCameraPosition;
            private List<PlatformCircle> initialCircles;
            private List<PlatformClusterManager> initialClusterManagers;
            private List<PlatformGroundOverlay> initialGroundOverlays;
            private List<PlatformHeatmap> initialHeatmaps;
            private List<PlatformMarker> initialMarkers;
            private List<PlatformPolygon> initialPolygons;
            private List<PlatformPolyline> initialPolylines;
            private List<PlatformTileOverlay> initialTileOverlays;
            private PlatformMapConfiguration mapConfiguration;

            public PlatformMapViewCreationParams build() {
                PlatformMapViewCreationParams platformMapViewCreationParams = new PlatformMapViewCreationParams();
                platformMapViewCreationParams.setInitialCameraPosition(this.initialCameraPosition);
                platformMapViewCreationParams.setMapConfiguration(this.mapConfiguration);
                platformMapViewCreationParams.setInitialCircles(this.initialCircles);
                platformMapViewCreationParams.setInitialMarkers(this.initialMarkers);
                platformMapViewCreationParams.setInitialPolygons(this.initialPolygons);
                platformMapViewCreationParams.setInitialPolylines(this.initialPolylines);
                platformMapViewCreationParams.setInitialHeatmaps(this.initialHeatmaps);
                platformMapViewCreationParams.setInitialTileOverlays(this.initialTileOverlays);
                platformMapViewCreationParams.setInitialClusterManagers(this.initialClusterManagers);
                platformMapViewCreationParams.setInitialGroundOverlays(this.initialGroundOverlays);
                return platformMapViewCreationParams;
            }

            @CanIgnoreReturnValue
            public Builder setInitialCameraPosition(PlatformCameraPosition platformCameraPosition) {
                this.initialCameraPosition = platformCameraPosition;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setInitialCircles(List<PlatformCircle> list) {
                this.initialCircles = list;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setInitialClusterManagers(List<PlatformClusterManager> list) {
                this.initialClusterManagers = list;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setInitialGroundOverlays(List<PlatformGroundOverlay> list) {
                this.initialGroundOverlays = list;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setInitialHeatmaps(List<PlatformHeatmap> list) {
                this.initialHeatmaps = list;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setInitialMarkers(List<PlatformMarker> list) {
                this.initialMarkers = list;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setInitialPolygons(List<PlatformPolygon> list) {
                this.initialPolygons = list;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setInitialPolylines(List<PlatformPolyline> list) {
                this.initialPolylines = list;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setInitialTileOverlays(List<PlatformTileOverlay> list) {
                this.initialTileOverlays = list;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMapConfiguration(PlatformMapConfiguration platformMapConfiguration) {
                this.mapConfiguration = platformMapConfiguration;
                return this;
            }
        }

        public static PlatformMapViewCreationParams fromList(ArrayList<Object> arrayList) {
            PlatformMapViewCreationParams platformMapViewCreationParams = new PlatformMapViewCreationParams();
            platformMapViewCreationParams.setInitialCameraPosition((PlatformCameraPosition) arrayList.get(0));
            platformMapViewCreationParams.setMapConfiguration((PlatformMapConfiguration) arrayList.get(1));
            platformMapViewCreationParams.setInitialCircles((List) arrayList.get(2));
            platformMapViewCreationParams.setInitialMarkers((List) arrayList.get(3));
            platformMapViewCreationParams.setInitialPolygons((List) arrayList.get(4));
            platformMapViewCreationParams.setInitialPolylines((List) arrayList.get(5));
            platformMapViewCreationParams.setInitialHeatmaps((List) arrayList.get(6));
            platformMapViewCreationParams.setInitialTileOverlays((List) arrayList.get(7));
            platformMapViewCreationParams.setInitialClusterManagers((List) arrayList.get(8));
            platformMapViewCreationParams.setInitialGroundOverlays((List) arrayList.get(9));
            return platformMapViewCreationParams;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformMapViewCreationParams.class == obj.getClass()) {
                PlatformMapViewCreationParams platformMapViewCreationParams = (PlatformMapViewCreationParams) obj;
                if (this.initialCameraPosition.equals(platformMapViewCreationParams.initialCameraPosition) && this.mapConfiguration.equals(platformMapViewCreationParams.mapConfiguration) && this.initialCircles.equals(platformMapViewCreationParams.initialCircles) && this.initialMarkers.equals(platformMapViewCreationParams.initialMarkers) && this.initialPolygons.equals(platformMapViewCreationParams.initialPolygons) && this.initialPolylines.equals(platformMapViewCreationParams.initialPolylines) && this.initialHeatmaps.equals(platformMapViewCreationParams.initialHeatmaps) && this.initialTileOverlays.equals(platformMapViewCreationParams.initialTileOverlays) && this.initialClusterManagers.equals(platformMapViewCreationParams.initialClusterManagers) && this.initialGroundOverlays.equals(platformMapViewCreationParams.initialGroundOverlays)) {
                    return true;
                }
            }
            return false;
        }

        public PlatformCameraPosition getInitialCameraPosition() {
            return this.initialCameraPosition;
        }

        public List<PlatformCircle> getInitialCircles() {
            return this.initialCircles;
        }

        public List<PlatformClusterManager> getInitialClusterManagers() {
            return this.initialClusterManagers;
        }

        public List<PlatformGroundOverlay> getInitialGroundOverlays() {
            return this.initialGroundOverlays;
        }

        public List<PlatformHeatmap> getInitialHeatmaps() {
            return this.initialHeatmaps;
        }

        public List<PlatformMarker> getInitialMarkers() {
            return this.initialMarkers;
        }

        public List<PlatformPolygon> getInitialPolygons() {
            return this.initialPolygons;
        }

        public List<PlatformPolyline> getInitialPolylines() {
            return this.initialPolylines;
        }

        public List<PlatformTileOverlay> getInitialTileOverlays() {
            return this.initialTileOverlays;
        }

        public PlatformMapConfiguration getMapConfiguration() {
            return this.mapConfiguration;
        }

        public int hashCode() {
            return Objects.hash(this.initialCameraPosition, this.mapConfiguration, this.initialCircles, this.initialMarkers, this.initialPolygons, this.initialPolylines, this.initialHeatmaps, this.initialTileOverlays, this.initialClusterManagers, this.initialGroundOverlays);
        }

        public void setInitialCameraPosition(PlatformCameraPosition platformCameraPosition) {
            if (platformCameraPosition == null) {
                throw new IllegalStateException("Nonnull field \"initialCameraPosition\" is null.");
            }
            this.initialCameraPosition = platformCameraPosition;
        }

        public void setInitialCircles(List<PlatformCircle> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"initialCircles\" is null.");
            }
            this.initialCircles = list;
        }

        public void setInitialClusterManagers(List<PlatformClusterManager> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"initialClusterManagers\" is null.");
            }
            this.initialClusterManagers = list;
        }

        public void setInitialGroundOverlays(List<PlatformGroundOverlay> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"initialGroundOverlays\" is null.");
            }
            this.initialGroundOverlays = list;
        }

        public void setInitialHeatmaps(List<PlatformHeatmap> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"initialHeatmaps\" is null.");
            }
            this.initialHeatmaps = list;
        }

        public void setInitialMarkers(List<PlatformMarker> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"initialMarkers\" is null.");
            }
            this.initialMarkers = list;
        }

        public void setInitialPolygons(List<PlatformPolygon> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"initialPolygons\" is null.");
            }
            this.initialPolygons = list;
        }

        public void setInitialPolylines(List<PlatformPolyline> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"initialPolylines\" is null.");
            }
            this.initialPolylines = list;
        }

        public void setInitialTileOverlays(List<PlatformTileOverlay> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"initialTileOverlays\" is null.");
            }
            this.initialTileOverlays = list;
        }

        public void setMapConfiguration(PlatformMapConfiguration platformMapConfiguration) {
            if (platformMapConfiguration == null) {
                throw new IllegalStateException("Nonnull field \"mapConfiguration\" is null.");
            }
            this.mapConfiguration = platformMapConfiguration;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(10);
            arrayList.add(this.initialCameraPosition);
            arrayList.add(this.mapConfiguration);
            arrayList.add(this.initialCircles);
            arrayList.add(this.initialMarkers);
            arrayList.add(this.initialPolygons);
            arrayList.add(this.initialPolylines);
            arrayList.add(this.initialHeatmaps);
            arrayList.add(this.initialTileOverlays);
            arrayList.add(this.initialClusterManagers);
            arrayList.add(this.initialGroundOverlays);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformMarker {
        private Double alpha;
        private PlatformDoublePair anchor;
        private String clusterManagerId;
        private PlatformMarkerCollisionBehavior collisionBehavior;
        private Boolean consumeTapEvents;
        private Boolean draggable;
        private Boolean flat;
        private PlatformBitmap icon;
        private PlatformInfoWindow infoWindow;
        private String markerId;
        private PlatformLatLng position;
        private Double rotation;
        private Boolean visible;
        private Double zIndex;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private Double alpha;
            private PlatformDoublePair anchor;
            private String clusterManagerId;
            private PlatformMarkerCollisionBehavior collisionBehavior;
            private Boolean consumeTapEvents;
            private Boolean draggable;
            private Boolean flat;
            private PlatformBitmap icon;
            private PlatformInfoWindow infoWindow;
            private String markerId;
            private PlatformLatLng position;
            private Double rotation;
            private Boolean visible;
            private Double zIndex;

            public PlatformMarker build() {
                PlatformMarker platformMarker = new PlatformMarker();
                platformMarker.setAlpha(this.alpha);
                platformMarker.setAnchor(this.anchor);
                platformMarker.setConsumeTapEvents(this.consumeTapEvents);
                platformMarker.setDraggable(this.draggable);
                platformMarker.setFlat(this.flat);
                platformMarker.setIcon(this.icon);
                platformMarker.setInfoWindow(this.infoWindow);
                platformMarker.setPosition(this.position);
                platformMarker.setRotation(this.rotation);
                platformMarker.setVisible(this.visible);
                platformMarker.setZIndex(this.zIndex);
                platformMarker.setMarkerId(this.markerId);
                platformMarker.setClusterManagerId(this.clusterManagerId);
                platformMarker.setCollisionBehavior(this.collisionBehavior);
                return platformMarker;
            }

            @CanIgnoreReturnValue
            public Builder setAlpha(Double d10) {
                this.alpha = d10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAnchor(PlatformDoublePair platformDoublePair) {
                this.anchor = platformDoublePair;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setClusterManagerId(String str) {
                this.clusterManagerId = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setCollisionBehavior(PlatformMarkerCollisionBehavior platformMarkerCollisionBehavior) {
                this.collisionBehavior = platformMarkerCollisionBehavior;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setConsumeTapEvents(Boolean bool) {
                this.consumeTapEvents = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setDraggable(Boolean bool) {
                this.draggable = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setFlat(Boolean bool) {
                this.flat = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setIcon(PlatformBitmap platformBitmap) {
                this.icon = platformBitmap;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setInfoWindow(PlatformInfoWindow platformInfoWindow) {
                this.infoWindow = platformInfoWindow;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMarkerId(String str) {
                this.markerId = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPosition(PlatformLatLng platformLatLng) {
                this.position = platformLatLng;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setRotation(Double d10) {
                this.rotation = d10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setVisible(Boolean bool) {
                this.visible = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setZIndex(Double d10) {
                this.zIndex = d10;
                return this;
            }
        }

        public static PlatformMarker fromList(ArrayList<Object> arrayList) {
            PlatformMarker platformMarker = new PlatformMarker();
            platformMarker.setAlpha((Double) arrayList.get(0));
            platformMarker.setAnchor((PlatformDoublePair) arrayList.get(1));
            platformMarker.setConsumeTapEvents((Boolean) arrayList.get(2));
            platformMarker.setDraggable((Boolean) arrayList.get(3));
            platformMarker.setFlat((Boolean) arrayList.get(4));
            platformMarker.setIcon((PlatformBitmap) arrayList.get(5));
            platformMarker.setInfoWindow((PlatformInfoWindow) arrayList.get(6));
            platformMarker.setPosition((PlatformLatLng) arrayList.get(7));
            platformMarker.setRotation((Double) arrayList.get(8));
            platformMarker.setVisible((Boolean) arrayList.get(9));
            platformMarker.setZIndex((Double) arrayList.get(10));
            platformMarker.setMarkerId((String) arrayList.get(11));
            platformMarker.setClusterManagerId((String) arrayList.get(12));
            platformMarker.setCollisionBehavior((PlatformMarkerCollisionBehavior) arrayList.get(13));
            return platformMarker;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformMarker.class == obj.getClass()) {
                PlatformMarker platformMarker = (PlatformMarker) obj;
                if (this.alpha.equals(platformMarker.alpha) && this.anchor.equals(platformMarker.anchor) && this.consumeTapEvents.equals(platformMarker.consumeTapEvents) && this.draggable.equals(platformMarker.draggable) && this.flat.equals(platformMarker.flat) && this.icon.equals(platformMarker.icon) && this.infoWindow.equals(platformMarker.infoWindow) && this.position.equals(platformMarker.position) && this.rotation.equals(platformMarker.rotation) && this.visible.equals(platformMarker.visible) && this.zIndex.equals(platformMarker.zIndex) && this.markerId.equals(platformMarker.markerId) && Objects.equals(this.clusterManagerId, platformMarker.clusterManagerId) && this.collisionBehavior.equals(platformMarker.collisionBehavior)) {
                    return true;
                }
            }
            return false;
        }

        public Double getAlpha() {
            return this.alpha;
        }

        public PlatformDoublePair getAnchor() {
            return this.anchor;
        }

        public String getClusterManagerId() {
            return this.clusterManagerId;
        }

        public PlatformMarkerCollisionBehavior getCollisionBehavior() {
            return this.collisionBehavior;
        }

        public Boolean getConsumeTapEvents() {
            return this.consumeTapEvents;
        }

        public Boolean getDraggable() {
            return this.draggable;
        }

        public Boolean getFlat() {
            return this.flat;
        }

        public PlatformBitmap getIcon() {
            return this.icon;
        }

        public PlatformInfoWindow getInfoWindow() {
            return this.infoWindow;
        }

        public String getMarkerId() {
            return this.markerId;
        }

        public PlatformLatLng getPosition() {
            return this.position;
        }

        public Double getRotation() {
            return this.rotation;
        }

        public Boolean getVisible() {
            return this.visible;
        }

        public Double getZIndex() {
            return this.zIndex;
        }

        public int hashCode() {
            return Objects.hash(this.alpha, this.anchor, this.consumeTapEvents, this.draggable, this.flat, this.icon, this.infoWindow, this.position, this.rotation, this.visible, this.zIndex, this.markerId, this.clusterManagerId, this.collisionBehavior);
        }

        public void setAlpha(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"alpha\" is null.");
            }
            this.alpha = d10;
        }

        public void setAnchor(PlatformDoublePair platformDoublePair) {
            if (platformDoublePair == null) {
                throw new IllegalStateException("Nonnull field \"anchor\" is null.");
            }
            this.anchor = platformDoublePair;
        }

        public void setClusterManagerId(String str) {
            this.clusterManagerId = str;
        }

        public void setCollisionBehavior(PlatformMarkerCollisionBehavior platformMarkerCollisionBehavior) {
            if (platformMarkerCollisionBehavior == null) {
                throw new IllegalStateException("Nonnull field \"collisionBehavior\" is null.");
            }
            this.collisionBehavior = platformMarkerCollisionBehavior;
        }

        public void setConsumeTapEvents(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"consumeTapEvents\" is null.");
            }
            this.consumeTapEvents = bool;
        }

        public void setDraggable(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"draggable\" is null.");
            }
            this.draggable = bool;
        }

        public void setFlat(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"flat\" is null.");
            }
            this.flat = bool;
        }

        public void setIcon(PlatformBitmap platformBitmap) {
            if (platformBitmap == null) {
                throw new IllegalStateException("Nonnull field \"icon\" is null.");
            }
            this.icon = platformBitmap;
        }

        public void setInfoWindow(PlatformInfoWindow platformInfoWindow) {
            if (platformInfoWindow == null) {
                throw new IllegalStateException("Nonnull field \"infoWindow\" is null.");
            }
            this.infoWindow = platformInfoWindow;
        }

        public void setMarkerId(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"markerId\" is null.");
            }
            this.markerId = str;
        }

        public void setPosition(PlatformLatLng platformLatLng) {
            if (platformLatLng == null) {
                throw new IllegalStateException("Nonnull field \"position\" is null.");
            }
            this.position = platformLatLng;
        }

        public void setRotation(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"rotation\" is null.");
            }
            this.rotation = d10;
        }

        public void setVisible(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"visible\" is null.");
            }
            this.visible = bool;
        }

        public void setZIndex(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"zIndex\" is null.");
            }
            this.zIndex = d10;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(14);
            arrayList.add(this.alpha);
            arrayList.add(this.anchor);
            arrayList.add(this.consumeTapEvents);
            arrayList.add(this.draggable);
            arrayList.add(this.flat);
            arrayList.add(this.icon);
            arrayList.add(this.infoWindow);
            arrayList.add(this.position);
            arrayList.add(this.rotation);
            arrayList.add(this.visible);
            arrayList.add(this.zIndex);
            arrayList.add(this.markerId);
            arrayList.add(this.clusterManagerId);
            arrayList.add(this.collisionBehavior);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum PlatformMarkerCollisionBehavior {
        REQUIRED_DISPLAY(0),
        OPTIONAL_AND_HIDES_LOWER_PRIORITY(1),
        REQUIRED_AND_HIDES_OPTIONAL(2);

        final int index;

        PlatformMarkerCollisionBehavior(int i10) {
            this.index = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum PlatformMarkerType {
        MARKER(0),
        ADVANCED_MARKER(1);

        final int index;

        PlatformMarkerType(int i10) {
            this.index = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformPatternItem {
        private Double length;
        private PlatformPatternItemType type;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private Double length;
            private PlatformPatternItemType type;

            public PlatformPatternItem build() {
                PlatformPatternItem platformPatternItem = new PlatformPatternItem();
                platformPatternItem.setType(this.type);
                platformPatternItem.setLength(this.length);
                return platformPatternItem;
            }

            @CanIgnoreReturnValue
            public Builder setLength(Double d10) {
                this.length = d10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setType(PlatformPatternItemType platformPatternItemType) {
                this.type = platformPatternItemType;
                return this;
            }
        }

        public static PlatformPatternItem fromList(ArrayList<Object> arrayList) {
            PlatformPatternItem platformPatternItem = new PlatformPatternItem();
            platformPatternItem.setType((PlatformPatternItemType) arrayList.get(0));
            platformPatternItem.setLength((Double) arrayList.get(1));
            return platformPatternItem;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformPatternItem.class == obj.getClass()) {
                PlatformPatternItem platformPatternItem = (PlatformPatternItem) obj;
                if (this.type.equals(platformPatternItem.type) && Objects.equals(this.length, platformPatternItem.length)) {
                    return true;
                }
            }
            return false;
        }

        public Double getLength() {
            return this.length;
        }

        public PlatformPatternItemType getType() {
            return this.type;
        }

        public int hashCode() {
            return Objects.hash(this.type, this.length);
        }

        public void setLength(Double d10) {
            this.length = d10;
        }

        public void setType(PlatformPatternItemType platformPatternItemType) {
            if (platformPatternItemType == null) {
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            }
            this.type = platformPatternItemType;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.type);
            arrayList.add(this.length);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum PlatformPatternItemType {
        DOT(0),
        DASH(1),
        GAP(2);

        final int index;

        PlatformPatternItemType(int i10) {
            this.index = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformPoint {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private Long f37860x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private Long f37861y;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            private Long f37862x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            private Long f37863y;

            public PlatformPoint build() {
                PlatformPoint platformPoint = new PlatformPoint();
                platformPoint.setX(this.f37862x);
                platformPoint.setY(this.f37863y);
                return platformPoint;
            }

            @CanIgnoreReturnValue
            public Builder setX(Long l10) {
                this.f37862x = l10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setY(Long l10) {
                this.f37863y = l10;
                return this;
            }
        }

        public static PlatformPoint fromList(ArrayList<Object> arrayList) {
            PlatformPoint platformPoint = new PlatformPoint();
            platformPoint.setX((Long) arrayList.get(0));
            platformPoint.setY((Long) arrayList.get(1));
            return platformPoint;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformPoint.class == obj.getClass()) {
                PlatformPoint platformPoint = (PlatformPoint) obj;
                if (this.f37860x.equals(platformPoint.f37860x) && this.f37861y.equals(platformPoint.f37861y)) {
                    return true;
                }
            }
            return false;
        }

        public Long getX() {
            return this.f37860x;
        }

        public Long getY() {
            return this.f37861y;
        }

        public int hashCode() {
            return Objects.hash(this.f37860x, this.f37861y);
        }

        public void setX(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"x\" is null.");
            }
            this.f37860x = l10;
        }

        public void setY(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"y\" is null.");
            }
            this.f37861y = l10;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.f37860x);
            arrayList.add(this.f37861y);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformPolygon {
        private Boolean consumesTapEvents;
        private PlatformColor fillColor;
        private Boolean geodesic;
        private List<List<PlatformLatLng>> holes;
        private List<PlatformLatLng> points;
        private String polygonId;
        private PlatformColor strokeColor;
        private Long strokeWidth;
        private Boolean visible;
        private Long zIndex;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private Boolean consumesTapEvents;
            private PlatformColor fillColor;
            private Boolean geodesic;
            private List<List<PlatformLatLng>> holes;
            private List<PlatformLatLng> points;
            private String polygonId;
            private PlatformColor strokeColor;
            private Long strokeWidth;
            private Boolean visible;
            private Long zIndex;

            public PlatformPolygon build() {
                PlatformPolygon platformPolygon = new PlatformPolygon();
                platformPolygon.setPolygonId(this.polygonId);
                platformPolygon.setConsumesTapEvents(this.consumesTapEvents);
                platformPolygon.setFillColor(this.fillColor);
                platformPolygon.setGeodesic(this.geodesic);
                platformPolygon.setPoints(this.points);
                platformPolygon.setHoles(this.holes);
                platformPolygon.setVisible(this.visible);
                platformPolygon.setStrokeColor(this.strokeColor);
                platformPolygon.setStrokeWidth(this.strokeWidth);
                platformPolygon.setZIndex(this.zIndex);
                return platformPolygon;
            }

            @CanIgnoreReturnValue
            public Builder setConsumesTapEvents(Boolean bool) {
                this.consumesTapEvents = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setFillColor(PlatformColor platformColor) {
                this.fillColor = platformColor;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setGeodesic(Boolean bool) {
                this.geodesic = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setHoles(List<List<PlatformLatLng>> list) {
                this.holes = list;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPoints(List<PlatformLatLng> list) {
                this.points = list;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPolygonId(String str) {
                this.polygonId = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setStrokeColor(PlatformColor platformColor) {
                this.strokeColor = platformColor;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setStrokeWidth(Long l10) {
                this.strokeWidth = l10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setVisible(Boolean bool) {
                this.visible = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setZIndex(Long l10) {
                this.zIndex = l10;
                return this;
            }
        }

        public static PlatformPolygon fromList(ArrayList<Object> arrayList) {
            PlatformPolygon platformPolygon = new PlatformPolygon();
            platformPolygon.setPolygonId((String) arrayList.get(0));
            platformPolygon.setConsumesTapEvents((Boolean) arrayList.get(1));
            platformPolygon.setFillColor((PlatformColor) arrayList.get(2));
            platformPolygon.setGeodesic((Boolean) arrayList.get(3));
            platformPolygon.setPoints((List) arrayList.get(4));
            platformPolygon.setHoles((List) arrayList.get(5));
            platformPolygon.setVisible((Boolean) arrayList.get(6));
            platformPolygon.setStrokeColor((PlatformColor) arrayList.get(7));
            platformPolygon.setStrokeWidth((Long) arrayList.get(8));
            platformPolygon.setZIndex((Long) arrayList.get(9));
            return platformPolygon;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformPolygon.class == obj.getClass()) {
                PlatformPolygon platformPolygon = (PlatformPolygon) obj;
                if (this.polygonId.equals(platformPolygon.polygonId) && this.consumesTapEvents.equals(platformPolygon.consumesTapEvents) && this.fillColor.equals(platformPolygon.fillColor) && this.geodesic.equals(platformPolygon.geodesic) && this.points.equals(platformPolygon.points) && this.holes.equals(platformPolygon.holes) && this.visible.equals(platformPolygon.visible) && this.strokeColor.equals(platformPolygon.strokeColor) && this.strokeWidth.equals(platformPolygon.strokeWidth) && this.zIndex.equals(platformPolygon.zIndex)) {
                    return true;
                }
            }
            return false;
        }

        public Boolean getConsumesTapEvents() {
            return this.consumesTapEvents;
        }

        public PlatformColor getFillColor() {
            return this.fillColor;
        }

        public Boolean getGeodesic() {
            return this.geodesic;
        }

        public List<List<PlatformLatLng>> getHoles() {
            return this.holes;
        }

        public List<PlatformLatLng> getPoints() {
            return this.points;
        }

        public String getPolygonId() {
            return this.polygonId;
        }

        public PlatformColor getStrokeColor() {
            return this.strokeColor;
        }

        public Long getStrokeWidth() {
            return this.strokeWidth;
        }

        public Boolean getVisible() {
            return this.visible;
        }

        public Long getZIndex() {
            return this.zIndex;
        }

        public int hashCode() {
            return Objects.hash(this.polygonId, this.consumesTapEvents, this.fillColor, this.geodesic, this.points, this.holes, this.visible, this.strokeColor, this.strokeWidth, this.zIndex);
        }

        public void setConsumesTapEvents(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"consumesTapEvents\" is null.");
            }
            this.consumesTapEvents = bool;
        }

        public void setFillColor(PlatformColor platformColor) {
            if (platformColor == null) {
                throw new IllegalStateException("Nonnull field \"fillColor\" is null.");
            }
            this.fillColor = platformColor;
        }

        public void setGeodesic(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"geodesic\" is null.");
            }
            this.geodesic = bool;
        }

        public void setHoles(List<List<PlatformLatLng>> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"holes\" is null.");
            }
            this.holes = list;
        }

        public void setPoints(List<PlatformLatLng> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"points\" is null.");
            }
            this.points = list;
        }

        public void setPolygonId(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"polygonId\" is null.");
            }
            this.polygonId = str;
        }

        public void setStrokeColor(PlatformColor platformColor) {
            if (platformColor == null) {
                throw new IllegalStateException("Nonnull field \"strokeColor\" is null.");
            }
            this.strokeColor = platformColor;
        }

        public void setStrokeWidth(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"strokeWidth\" is null.");
            }
            this.strokeWidth = l10;
        }

        public void setVisible(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"visible\" is null.");
            }
            this.visible = bool;
        }

        public void setZIndex(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"zIndex\" is null.");
            }
            this.zIndex = l10;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(10);
            arrayList.add(this.polygonId);
            arrayList.add(this.consumesTapEvents);
            arrayList.add(this.fillColor);
            arrayList.add(this.geodesic);
            arrayList.add(this.points);
            arrayList.add(this.holes);
            arrayList.add(this.visible);
            arrayList.add(this.strokeColor);
            arrayList.add(this.strokeWidth);
            arrayList.add(this.zIndex);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformPolyline {
        private PlatformColor color;
        private Boolean consumesTapEvents;
        private PlatformCap endCap;
        private Boolean geodesic;
        private PlatformJointType jointType;
        private List<PlatformPatternItem> patterns;
        private List<PlatformLatLng> points;
        private String polylineId;
        private PlatformCap startCap;
        private Boolean visible;
        private Long width;
        private Long zIndex;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private PlatformColor color;
            private Boolean consumesTapEvents;
            private PlatformCap endCap;
            private Boolean geodesic;
            private PlatformJointType jointType;
            private List<PlatformPatternItem> patterns;
            private List<PlatformLatLng> points;
            private String polylineId;
            private PlatformCap startCap;
            private Boolean visible;
            private Long width;
            private Long zIndex;

            public PlatformPolyline build() {
                PlatformPolyline platformPolyline = new PlatformPolyline();
                platformPolyline.setPolylineId(this.polylineId);
                platformPolyline.setConsumesTapEvents(this.consumesTapEvents);
                platformPolyline.setColor(this.color);
                platformPolyline.setGeodesic(this.geodesic);
                platformPolyline.setJointType(this.jointType);
                platformPolyline.setPatterns(this.patterns);
                platformPolyline.setPoints(this.points);
                platformPolyline.setStartCap(this.startCap);
                platformPolyline.setEndCap(this.endCap);
                platformPolyline.setVisible(this.visible);
                platformPolyline.setWidth(this.width);
                platformPolyline.setZIndex(this.zIndex);
                return platformPolyline;
            }

            @CanIgnoreReturnValue
            public Builder setColor(PlatformColor platformColor) {
                this.color = platformColor;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setConsumesTapEvents(Boolean bool) {
                this.consumesTapEvents = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setEndCap(PlatformCap platformCap) {
                this.endCap = platformCap;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setGeodesic(Boolean bool) {
                this.geodesic = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setJointType(PlatformJointType platformJointType) {
                this.jointType = platformJointType;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPatterns(List<PlatformPatternItem> list) {
                this.patterns = list;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPoints(List<PlatformLatLng> list) {
                this.points = list;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPolylineId(String str) {
                this.polylineId = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setStartCap(PlatformCap platformCap) {
                this.startCap = platformCap;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setVisible(Boolean bool) {
                this.visible = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setWidth(Long l10) {
                this.width = l10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setZIndex(Long l10) {
                this.zIndex = l10;
                return this;
            }
        }

        public static PlatformPolyline fromList(ArrayList<Object> arrayList) {
            PlatformPolyline platformPolyline = new PlatformPolyline();
            platformPolyline.setPolylineId((String) arrayList.get(0));
            platformPolyline.setConsumesTapEvents((Boolean) arrayList.get(1));
            platformPolyline.setColor((PlatformColor) arrayList.get(2));
            platformPolyline.setGeodesic((Boolean) arrayList.get(3));
            platformPolyline.setJointType((PlatformJointType) arrayList.get(4));
            platformPolyline.setPatterns((List) arrayList.get(5));
            platformPolyline.setPoints((List) arrayList.get(6));
            platformPolyline.setStartCap((PlatformCap) arrayList.get(7));
            platformPolyline.setEndCap((PlatformCap) arrayList.get(8));
            platformPolyline.setVisible((Boolean) arrayList.get(9));
            platformPolyline.setWidth((Long) arrayList.get(10));
            platformPolyline.setZIndex((Long) arrayList.get(11));
            return platformPolyline;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformPolyline.class == obj.getClass()) {
                PlatformPolyline platformPolyline = (PlatformPolyline) obj;
                if (this.polylineId.equals(platformPolyline.polylineId) && this.consumesTapEvents.equals(platformPolyline.consumesTapEvents) && this.color.equals(platformPolyline.color) && this.geodesic.equals(platformPolyline.geodesic) && this.jointType.equals(platformPolyline.jointType) && this.patterns.equals(platformPolyline.patterns) && this.points.equals(platformPolyline.points) && this.startCap.equals(platformPolyline.startCap) && this.endCap.equals(platformPolyline.endCap) && this.visible.equals(platformPolyline.visible) && this.width.equals(platformPolyline.width) && this.zIndex.equals(platformPolyline.zIndex)) {
                    return true;
                }
            }
            return false;
        }

        public PlatformColor getColor() {
            return this.color;
        }

        public Boolean getConsumesTapEvents() {
            return this.consumesTapEvents;
        }

        public PlatformCap getEndCap() {
            return this.endCap;
        }

        public Boolean getGeodesic() {
            return this.geodesic;
        }

        public PlatformJointType getJointType() {
            return this.jointType;
        }

        public List<PlatformPatternItem> getPatterns() {
            return this.patterns;
        }

        public List<PlatformLatLng> getPoints() {
            return this.points;
        }

        public String getPolylineId() {
            return this.polylineId;
        }

        public PlatformCap getStartCap() {
            return this.startCap;
        }

        public Boolean getVisible() {
            return this.visible;
        }

        public Long getWidth() {
            return this.width;
        }

        public Long getZIndex() {
            return this.zIndex;
        }

        public int hashCode() {
            return Objects.hash(this.polylineId, this.consumesTapEvents, this.color, this.geodesic, this.jointType, this.patterns, this.points, this.startCap, this.endCap, this.visible, this.width, this.zIndex);
        }

        public void setColor(PlatformColor platformColor) {
            if (platformColor == null) {
                throw new IllegalStateException("Nonnull field \"color\" is null.");
            }
            this.color = platformColor;
        }

        public void setConsumesTapEvents(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"consumesTapEvents\" is null.");
            }
            this.consumesTapEvents = bool;
        }

        public void setEndCap(PlatformCap platformCap) {
            if (platformCap == null) {
                throw new IllegalStateException("Nonnull field \"endCap\" is null.");
            }
            this.endCap = platformCap;
        }

        public void setGeodesic(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"geodesic\" is null.");
            }
            this.geodesic = bool;
        }

        public void setJointType(PlatformJointType platformJointType) {
            if (platformJointType == null) {
                throw new IllegalStateException("Nonnull field \"jointType\" is null.");
            }
            this.jointType = platformJointType;
        }

        public void setPatterns(List<PlatformPatternItem> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"patterns\" is null.");
            }
            this.patterns = list;
        }

        public void setPoints(List<PlatformLatLng> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"points\" is null.");
            }
            this.points = list;
        }

        public void setPolylineId(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"polylineId\" is null.");
            }
            this.polylineId = str;
        }

        public void setStartCap(PlatformCap platformCap) {
            if (platformCap == null) {
                throw new IllegalStateException("Nonnull field \"startCap\" is null.");
            }
            this.startCap = platformCap;
        }

        public void setVisible(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"visible\" is null.");
            }
            this.visible = bool;
        }

        public void setWidth(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"width\" is null.");
            }
            this.width = l10;
        }

        public void setZIndex(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"zIndex\" is null.");
            }
            this.zIndex = l10;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(12);
            arrayList.add(this.polylineId);
            arrayList.add(this.consumesTapEvents);
            arrayList.add(this.color);
            arrayList.add(this.geodesic);
            arrayList.add(this.jointType);
            arrayList.add(this.patterns);
            arrayList.add(this.points);
            arrayList.add(this.startCap);
            arrayList.add(this.endCap);
            arrayList.add(this.visible);
            arrayList.add(this.width);
            arrayList.add(this.zIndex);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum PlatformRendererType {
        LEGACY(0),
        LATEST(1);

        final int index;

        PlatformRendererType(int i10) {
            this.index = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformTile {
        private byte[] data;
        private Long height;
        private Long width;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private byte[] data;
            private Long height;
            private Long width;

            public PlatformTile build() {
                PlatformTile platformTile = new PlatformTile();
                platformTile.setWidth(this.width);
                platformTile.setHeight(this.height);
                platformTile.setData(this.data);
                return platformTile;
            }

            @CanIgnoreReturnValue
            public Builder setData(byte[] bArr) {
                this.data = bArr;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setHeight(Long l10) {
                this.height = l10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setWidth(Long l10) {
                this.width = l10;
                return this;
            }
        }

        public static PlatformTile fromList(ArrayList<Object> arrayList) {
            PlatformTile platformTile = new PlatformTile();
            platformTile.setWidth((Long) arrayList.get(0));
            platformTile.setHeight((Long) arrayList.get(1));
            platformTile.setData((byte[]) arrayList.get(2));
            return platformTile;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformTile.class == obj.getClass()) {
                PlatformTile platformTile = (PlatformTile) obj;
                if (this.width.equals(platformTile.width) && this.height.equals(platformTile.height) && Arrays.equals(this.data, platformTile.data)) {
                    return true;
                }
            }
            return false;
        }

        public byte[] getData() {
            return this.data;
        }

        public Long getHeight() {
            return this.height;
        }

        public Long getWidth() {
            return this.width;
        }

        public int hashCode() {
            return (Objects.hash(this.width, this.height) * 31) + Arrays.hashCode(this.data);
        }

        public void setData(byte[] bArr) {
            this.data = bArr;
        }

        public void setHeight(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"height\" is null.");
            }
            this.height = l10;
        }

        public void setWidth(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"width\" is null.");
            }
            this.width = l10;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.width);
            arrayList.add(this.height);
            arrayList.add(this.data);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformTileLayer {
        private Boolean fadeIn;
        private Double transparency;
        private Boolean visible;
        private Double zIndex;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private Boolean fadeIn;
            private Double transparency;
            private Boolean visible;
            private Double zIndex;

            public PlatformTileLayer build() {
                PlatformTileLayer platformTileLayer = new PlatformTileLayer();
                platformTileLayer.setVisible(this.visible);
                platformTileLayer.setFadeIn(this.fadeIn);
                platformTileLayer.setTransparency(this.transparency);
                platformTileLayer.setZIndex(this.zIndex);
                return platformTileLayer;
            }

            @CanIgnoreReturnValue
            public Builder setFadeIn(Boolean bool) {
                this.fadeIn = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setTransparency(Double d10) {
                this.transparency = d10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setVisible(Boolean bool) {
                this.visible = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setZIndex(Double d10) {
                this.zIndex = d10;
                return this;
            }
        }

        public static PlatformTileLayer fromList(ArrayList<Object> arrayList) {
            PlatformTileLayer platformTileLayer = new PlatformTileLayer();
            platformTileLayer.setVisible((Boolean) arrayList.get(0));
            platformTileLayer.setFadeIn((Boolean) arrayList.get(1));
            platformTileLayer.setTransparency((Double) arrayList.get(2));
            platformTileLayer.setZIndex((Double) arrayList.get(3));
            return platformTileLayer;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformTileLayer.class == obj.getClass()) {
                PlatformTileLayer platformTileLayer = (PlatformTileLayer) obj;
                if (this.visible.equals(platformTileLayer.visible) && this.fadeIn.equals(platformTileLayer.fadeIn) && this.transparency.equals(platformTileLayer.transparency) && this.zIndex.equals(platformTileLayer.zIndex)) {
                    return true;
                }
            }
            return false;
        }

        public Boolean getFadeIn() {
            return this.fadeIn;
        }

        public Double getTransparency() {
            return this.transparency;
        }

        public Boolean getVisible() {
            return this.visible;
        }

        public Double getZIndex() {
            return this.zIndex;
        }

        public int hashCode() {
            return Objects.hash(this.visible, this.fadeIn, this.transparency, this.zIndex);
        }

        public void setFadeIn(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"fadeIn\" is null.");
            }
            this.fadeIn = bool;
        }

        public void setTransparency(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"transparency\" is null.");
            }
            this.transparency = d10;
        }

        public void setVisible(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"visible\" is null.");
            }
            this.visible = bool;
        }

        public void setZIndex(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"zIndex\" is null.");
            }
            this.zIndex = d10;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.visible);
            arrayList.add(this.fadeIn);
            arrayList.add(this.transparency);
            arrayList.add(this.zIndex);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformTileOverlay {
        private Boolean fadeIn;
        private String tileOverlayId;
        private Long tileSize;
        private Double transparency;
        private Boolean visible;
        private Long zIndex;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private Boolean fadeIn;
            private String tileOverlayId;
            private Long tileSize;
            private Double transparency;
            private Boolean visible;
            private Long zIndex;

            public PlatformTileOverlay build() {
                PlatformTileOverlay platformTileOverlay = new PlatformTileOverlay();
                platformTileOverlay.setTileOverlayId(this.tileOverlayId);
                platformTileOverlay.setFadeIn(this.fadeIn);
                platformTileOverlay.setTransparency(this.transparency);
                platformTileOverlay.setZIndex(this.zIndex);
                platformTileOverlay.setVisible(this.visible);
                platformTileOverlay.setTileSize(this.tileSize);
                return platformTileOverlay;
            }

            @CanIgnoreReturnValue
            public Builder setFadeIn(Boolean bool) {
                this.fadeIn = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setTileOverlayId(String str) {
                this.tileOverlayId = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setTileSize(Long l10) {
                this.tileSize = l10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setTransparency(Double d10) {
                this.transparency = d10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setVisible(Boolean bool) {
                this.visible = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setZIndex(Long l10) {
                this.zIndex = l10;
                return this;
            }
        }

        public static PlatformTileOverlay fromList(ArrayList<Object> arrayList) {
            PlatformTileOverlay platformTileOverlay = new PlatformTileOverlay();
            platformTileOverlay.setTileOverlayId((String) arrayList.get(0));
            platformTileOverlay.setFadeIn((Boolean) arrayList.get(1));
            platformTileOverlay.setTransparency((Double) arrayList.get(2));
            platformTileOverlay.setZIndex((Long) arrayList.get(3));
            platformTileOverlay.setVisible((Boolean) arrayList.get(4));
            platformTileOverlay.setTileSize((Long) arrayList.get(5));
            return platformTileOverlay;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformTileOverlay.class == obj.getClass()) {
                PlatformTileOverlay platformTileOverlay = (PlatformTileOverlay) obj;
                if (this.tileOverlayId.equals(platformTileOverlay.tileOverlayId) && this.fadeIn.equals(platformTileOverlay.fadeIn) && this.transparency.equals(platformTileOverlay.transparency) && this.zIndex.equals(platformTileOverlay.zIndex) && this.visible.equals(platformTileOverlay.visible) && this.tileSize.equals(platformTileOverlay.tileSize)) {
                    return true;
                }
            }
            return false;
        }

        public Boolean getFadeIn() {
            return this.fadeIn;
        }

        public String getTileOverlayId() {
            return this.tileOverlayId;
        }

        public Long getTileSize() {
            return this.tileSize;
        }

        public Double getTransparency() {
            return this.transparency;
        }

        public Boolean getVisible() {
            return this.visible;
        }

        public Long getZIndex() {
            return this.zIndex;
        }

        public int hashCode() {
            return Objects.hash(this.tileOverlayId, this.fadeIn, this.transparency, this.zIndex, this.visible, this.tileSize);
        }

        public void setFadeIn(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"fadeIn\" is null.");
            }
            this.fadeIn = bool;
        }

        public void setTileOverlayId(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"tileOverlayId\" is null.");
            }
            this.tileOverlayId = str;
        }

        public void setTileSize(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"tileSize\" is null.");
            }
            this.tileSize = l10;
        }

        public void setTransparency(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"transparency\" is null.");
            }
            this.transparency = d10;
        }

        public void setVisible(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"visible\" is null.");
            }
            this.visible = bool;
        }

        public void setZIndex(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"zIndex\" is null.");
            }
            this.zIndex = l10;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(6);
            arrayList.add(this.tileOverlayId);
            arrayList.add(this.fadeIn);
            arrayList.add(this.transparency);
            arrayList.add(this.zIndex);
            arrayList.add(this.visible);
            arrayList.add(this.tileSize);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformWeightedLatLng {
        private PlatformLatLng point;
        private Double weight;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private PlatformLatLng point;
            private Double weight;

            public PlatformWeightedLatLng build() {
                PlatformWeightedLatLng platformWeightedLatLng = new PlatformWeightedLatLng();
                platformWeightedLatLng.setPoint(this.point);
                platformWeightedLatLng.setWeight(this.weight);
                return platformWeightedLatLng;
            }

            @CanIgnoreReturnValue
            public Builder setPoint(PlatformLatLng platformLatLng) {
                this.point = platformLatLng;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setWeight(Double d10) {
                this.weight = d10;
                return this;
            }
        }

        public static PlatformWeightedLatLng fromList(ArrayList<Object> arrayList) {
            PlatformWeightedLatLng platformWeightedLatLng = new PlatformWeightedLatLng();
            platformWeightedLatLng.setPoint((PlatformLatLng) arrayList.get(0));
            platformWeightedLatLng.setWeight((Double) arrayList.get(1));
            return platformWeightedLatLng;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformWeightedLatLng.class == obj.getClass()) {
                PlatformWeightedLatLng platformWeightedLatLng = (PlatformWeightedLatLng) obj;
                if (this.point.equals(platformWeightedLatLng.point) && this.weight.equals(platformWeightedLatLng.weight)) {
                    return true;
                }
            }
            return false;
        }

        public PlatformLatLng getPoint() {
            return this.point;
        }

        public Double getWeight() {
            return this.weight;
        }

        public int hashCode() {
            return Objects.hash(this.point, this.weight);
        }

        public void setPoint(PlatformLatLng platformLatLng) {
            if (platformLatLng == null) {
                throw new IllegalStateException("Nonnull field \"point\" is null.");
            }
            this.point = platformLatLng;
        }

        public void setWeight(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"weight\" is null.");
            }
            this.weight = d10;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.point);
            arrayList.add(this.weight);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class PlatformZoomRange {
        private Double max;
        private Double min;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Builder {
            private Double max;
            private Double min;

            public PlatformZoomRange build() {
                PlatformZoomRange platformZoomRange = new PlatformZoomRange();
                platformZoomRange.setMin(this.min);
                platformZoomRange.setMax(this.max);
                return platformZoomRange;
            }

            @CanIgnoreReturnValue
            public Builder setMax(Double d10) {
                this.max = d10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMin(Double d10) {
                this.min = d10;
                return this;
            }
        }

        public static PlatformZoomRange fromList(ArrayList<Object> arrayList) {
            PlatformZoomRange platformZoomRange = new PlatformZoomRange();
            platformZoomRange.setMin((Double) arrayList.get(0));
            platformZoomRange.setMax((Double) arrayList.get(1));
            return platformZoomRange;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformZoomRange.class == obj.getClass()) {
                PlatformZoomRange platformZoomRange = (PlatformZoomRange) obj;
                if (Objects.equals(this.min, platformZoomRange.min) && Objects.equals(this.max, platformZoomRange.max)) {
                    return true;
                }
            }
            return false;
        }

        public Double getMax() {
            return this.max;
        }

        public Double getMin() {
            return this.min;
        }

        public int hashCode() {
            return Objects.hash(this.min, this.max);
        }

        public void setMax(Double d10) {
            this.max = d10;
        }

        public void setMin(Double d10) {
            this.min = d10;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.min);
            arrayList.add(this.max);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface Result<T> {
        void error(Throwable th);

        void success(T t10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface VoidResult {
        void error(Throwable th);

        void success();
    }

    public static FlutterError createConnectionError(String str) {
        return new FlutterError("channel-error", "Unable to establish connection on channel: " + str + ".", "");
    }

    public static ArrayList<Object> wrapError(Throwable th) {
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) th;
            arrayList.add(flutterError.code);
            arrayList.add(flutterError.getMessage());
            arrayList.add(flutterError.details);
            return arrayList;
        }
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }
}
