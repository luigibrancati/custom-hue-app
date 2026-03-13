package io.flutter.plugins.googlemaps;

import S6.AbstractC2196b;
import S6.C2195a;
import S6.f;
import U6.AbstractC2277d;
import U6.C2276c;
import U6.C2278e;
import U6.C2279f;
import U6.C2282i;
import U6.C2283j;
import U6.C2284k;
import U6.C2286m;
import U6.C2287n;
import U6.C2292t;
import U6.C2293u;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import io.flutter.FlutterInjector;
import io.flutter.plugins.googlemaps.Messages;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class Convert {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    /* JADX INFO: renamed from: io.flutter.plugins.googlemaps.Convert$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformCapType;
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformJointType;
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformMapBitmapScaling;
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformMapType;
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformMarkerCollisionBehavior;
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformPatternItemType;
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformRendererType;

        static {
            int[] iArr = new int[Messages.PlatformCapType.values().length];
            $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformCapType = iArr;
            try {
                iArr[Messages.PlatformCapType.BUTT_CAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformCapType[Messages.PlatformCapType.ROUND_CAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformCapType[Messages.PlatformCapType.SQUARE_CAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformCapType[Messages.PlatformCapType.CUSTOM_CAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Messages.PlatformPatternItemType.values().length];
            $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformPatternItemType = iArr2;
            try {
                iArr2[Messages.PlatformPatternItemType.DOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformPatternItemType[Messages.PlatformPatternItemType.DASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformPatternItemType[Messages.PlatformPatternItemType.GAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[Messages.PlatformMarkerCollisionBehavior.values().length];
            $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformMarkerCollisionBehavior = iArr3;
            try {
                iArr3[Messages.PlatformMarkerCollisionBehavior.REQUIRED_DISPLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformMarkerCollisionBehavior[Messages.PlatformMarkerCollisionBehavior.OPTIONAL_AND_HIDES_LOWER_PRIORITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformMarkerCollisionBehavior[Messages.PlatformMarkerCollisionBehavior.REQUIRED_AND_HIDES_OPTIONAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr4 = new int[Messages.PlatformJointType.values().length];
            $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformJointType = iArr4;
            try {
                iArr4[Messages.PlatformJointType.MITERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformJointType[Messages.PlatformJointType.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformJointType[Messages.PlatformJointType.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr5 = new int[Messages.PlatformRendererType.values().length];
            $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformRendererType = iArr5;
            try {
                iArr5[Messages.PlatformRendererType.LATEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformRendererType[Messages.PlatformRendererType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr6 = new int[Messages.PlatformMapType.values().length];
            $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformMapType = iArr6;
            try {
                iArr6[Messages.PlatformMapType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformMapType[Messages.PlatformMapType.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformMapType[Messages.PlatformMapType.SATELLITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformMapType[Messages.PlatformMapType.TERRAIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformMapType[Messages.PlatformMapType.HYBRID.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            int[] iArr7 = new int[Messages.PlatformMapBitmapScaling.values().length];
            $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformMapBitmapScaling = iArr7;
            try {
                iArr7[Messages.PlatformMapBitmapScaling.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformMapBitmapScaling[Messages.PlatformMapBitmapScaling.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class BitmapDescriptorFactoryWrapper {
        public C2276c fromAsset(String str) {
            return AbstractC2277d.c(str);
        }

        public C2276c fromBitmap(Bitmap bitmap) {
            return AbstractC2277d.d(bitmap);
        }

        public C2276c fromPinConfig(C2293u c2293u) {
            return AbstractC2277d.e(c2293u);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class FlutterInjectorWrapper {
        public String getLookupKeyForAsset(String str) {
            return FlutterInjector.instance().flutterLoader().getLookupKeyForAsset(str);
        }
    }

    private static <T> void applyIfNotNull(T t10, Consumer<T> consumer) {
        if (t10 != null) {
            consumer.accept(t10);
        }
    }

    public static Messages.PlatformDoublePair buildGroundOverlayAnchorForPigeon(C2287n c2287n) {
        Messages.PlatformDoublePair.Builder builder = new Messages.PlatformDoublePair.Builder();
        LatLng latLngE = c2287n.e();
        LatLngBounds latLngBoundsB = c2287n.b();
        LatLng latLng = latLngBoundsB.f30353b;
        double d10 = latLng.f30350a;
        LatLng latLng2 = latLngBoundsB.f30352a;
        double d11 = latLng2.f30350a;
        double d12 = 1.0d - ((latLngE.f30350a - d11) / (d10 - d11));
        double d13 = latLng2.f30351b;
        double d14 = latLng.f30351b;
        double d15 = d13 <= d14 ? d14 - d13 : 360.0d - (d13 - d14);
        double d16 = latLngE.f30351b;
        if (d16 < d13) {
            d16 += 360.0d;
        }
        builder.setX(Double.valueOf((d16 - d13) / d15));
        builder.setY(Double.valueOf(d12));
        return builder.build();
    }

    private static C2293u.b buildPinGlyph(Messages.PlatformBitmapPinConfig platformBitmapPinConfig, AssetManager assetManager, float f10, BitmapDescriptorFactoryWrapper bitmapDescriptorFactoryWrapper) {
        String glyphText = platformBitmapPinConfig.getGlyphText();
        if (glyphText != null) {
            Integer numNullableColor = nullableColor(platformBitmapPinConfig.getGlyphTextColor());
            return numNullableColor != null ? new C2293u.b(glyphText, numNullableColor.intValue()) : new C2293u.b(glyphText);
        }
        Messages.PlatformBitmap glyphBitmap = platformBitmapPinConfig.getGlyphBitmap();
        if (glyphBitmap != null) {
            return new C2293u.b(toBitmapDescriptor(glyphBitmap, assetManager, f10, bitmapDescriptorFactoryWrapper));
        }
        Integer numNullableColor2 = nullableColor(platformBitmapPinConfig.getGlyphColor());
        if (numNullableColor2 != null) {
            return new C2293u.b(numNullableColor2.intValue());
        }
        return null;
    }

    public static CameraPosition cameraPositionFromPigeon(Messages.PlatformCameraPosition platformCameraPosition) {
        CameraPosition.a aVarD = CameraPosition.d();
        aVarD.a(platformCameraPosition.getBearing().floatValue());
        aVarD.c(latLngFromPigeon(platformCameraPosition.getTarget()));
        aVarD.d(platformCameraPosition.getTilt().floatValue());
        aVarD.e(platformCameraPosition.getZoom().floatValue());
        return aVarD.b();
    }

    public static Messages.PlatformCameraPosition cameraPositionToPigeon(CameraPosition cameraPosition) {
        return new Messages.PlatformCameraPosition.Builder().setBearing(Double.valueOf(cameraPosition.f30345d)).setTarget(latLngToPigeon(cameraPosition.f30342a)).setTilt(Double.valueOf(cameraPosition.f30344c)).setZoom(Double.valueOf(cameraPosition.f30343b)).build();
    }

    public static C2195a cameraUpdateFromPigeon(Messages.PlatformCameraUpdate platformCameraUpdate, float f10) {
        Object cameraUpdate = platformCameraUpdate.getCameraUpdate();
        if (cameraUpdate instanceof Messages.PlatformCameraUpdateNewCameraPosition) {
            return AbstractC2196b.a(cameraPositionFromPigeon(((Messages.PlatformCameraUpdateNewCameraPosition) cameraUpdate).getCameraPosition()));
        }
        if (cameraUpdate instanceof Messages.PlatformCameraUpdateNewLatLng) {
            return AbstractC2196b.b(latLngFromPigeon(((Messages.PlatformCameraUpdateNewLatLng) cameraUpdate).getLatLng()));
        }
        if (cameraUpdate instanceof Messages.PlatformCameraUpdateNewLatLngZoom) {
            Messages.PlatformCameraUpdateNewLatLngZoom platformCameraUpdateNewLatLngZoom = (Messages.PlatformCameraUpdateNewLatLngZoom) cameraUpdate;
            return AbstractC2196b.d(latLngFromPigeon(platformCameraUpdateNewLatLngZoom.getLatLng()), platformCameraUpdateNewLatLngZoom.getZoom().floatValue());
        }
        if (cameraUpdate instanceof Messages.PlatformCameraUpdateNewLatLngBounds) {
            Messages.PlatformCameraUpdateNewLatLngBounds platformCameraUpdateNewLatLngBounds = (Messages.PlatformCameraUpdateNewLatLngBounds) cameraUpdate;
            return AbstractC2196b.c(latLngBoundsFromPigeon(platformCameraUpdateNewLatLngBounds.getBounds()), (int) (platformCameraUpdateNewLatLngBounds.getPadding().doubleValue() * ((double) f10)));
        }
        if (cameraUpdate instanceof Messages.PlatformCameraUpdateScrollBy) {
            Messages.PlatformCameraUpdateScrollBy platformCameraUpdateScrollBy = (Messages.PlatformCameraUpdateScrollBy) cameraUpdate;
            return AbstractC2196b.e(platformCameraUpdateScrollBy.getDx().floatValue() * f10, platformCameraUpdateScrollBy.getDy().floatValue() * f10);
        }
        if (cameraUpdate instanceof Messages.PlatformCameraUpdateZoomBy) {
            Messages.PlatformCameraUpdateZoomBy platformCameraUpdateZoomBy = (Messages.PlatformCameraUpdateZoomBy) cameraUpdate;
            Point pointPointFromPigeon = pointFromPigeon(platformCameraUpdateZoomBy.getFocus(), f10);
            return pointPointFromPigeon != null ? AbstractC2196b.g(platformCameraUpdateZoomBy.getAmount().floatValue(), pointPointFromPigeon) : AbstractC2196b.f(platformCameraUpdateZoomBy.getAmount().floatValue());
        }
        if (cameraUpdate instanceof Messages.PlatformCameraUpdateZoomTo) {
            return AbstractC2196b.j(((Messages.PlatformCameraUpdateZoomTo) cameraUpdate).getZoom().floatValue());
        }
        if (cameraUpdate instanceof Messages.PlatformCameraUpdateZoom) {
            return ((Messages.PlatformCameraUpdateZoom) cameraUpdate).getOut().booleanValue() ? AbstractC2196b.i() : AbstractC2196b.h();
        }
        throw new IllegalArgumentException("PlatformCameraUpdate's cameraUpdate field must be one of the PlatformCameraUpdate... case classes.");
    }

    private static C2279f capFromPigeon(Messages.PlatformCap platformCap, AssetManager assetManager, float f10) {
        int i10 = AnonymousClass1.$SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformCapType[platformCap.getType().ordinal()];
        if (i10 == 1) {
            return new C2278e();
        }
        if (i10 == 2) {
            return new U6.A();
        }
        if (i10 == 3) {
            return new U6.C();
        }
        if (i10 == 4) {
            if (platformCap.getRefWidth() != null) {
                return new C2282i(toBitmapDescriptor(platformCap.getBitmapDescriptor(), assetManager, f10), platformCap.getRefWidth().floatValue());
            }
            throw new IllegalArgumentException("A Custom Cap must specify a refWidth value.");
        }
        throw new IllegalArgumentException("Unrecognized PlatformCap type: " + platformCap.getType());
    }

    public static Messages.PlatformCluster clusterToPigeon(String str, E9.a aVar) {
        int size = aVar.getSize();
        String[] strArr = new String[size];
        MarkerBuilder[] markerBuilderArr = (MarkerBuilder[]) aVar.b().toArray(new MarkerBuilder[size]);
        LatLngBounds.a aVarD = LatLngBounds.d();
        for (int i10 = 0; i10 < size; i10++) {
            MarkerBuilder markerBuilder = markerBuilderArr[i10];
            aVarD.b(markerBuilder.getPosition());
            strArr[i10] = markerBuilder.markerId();
        }
        return new Messages.PlatformCluster.Builder().setClusterManagerId(str).setPosition(latLngToPigeon(aVar.getPosition())).setBounds(latLngBoundsToPigeon(aVarD.a())).setMarkerIds(Arrays.asList(strArr)).build();
    }

    public static int collisionBehaviorFromPigeon(Messages.PlatformMarkerCollisionBehavior platformMarkerCollisionBehavior) {
        int i10 = AnonymousClass1.$SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformMarkerCollisionBehavior[platformMarkerCollisionBehavior.ordinal()];
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 2;
    }

    public static C2276c getBitmapFromAsset(Messages.PlatformBitmapAssetMap platformBitmapAssetMap, AssetManager assetManager, float f10, BitmapDescriptorFactoryWrapper bitmapDescriptorFactoryWrapper, FlutterInjectorWrapper flutterInjectorWrapper) {
        C2276c c2276cFromBitmap;
        String assetName = platformBitmapAssetMap.getAssetName();
        String lookupKeyForAsset = flutterInjectorWrapper.getLookupKeyForAsset(assetName);
        if (AnonymousClass1.$SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformMapBitmapScaling[platformBitmapAssetMap.getBitmapScaling().ordinal()] != 1) {
            return bitmapDescriptorFactoryWrapper.fromAsset(lookupKeyForAsset);
        }
        Double width = platformBitmapAssetMap.getWidth();
        Double height = platformBitmapAssetMap.getHeight();
        InputStream inputStream = null;
        try {
            try {
                InputStream inputStreamOpen = assetManager.open(lookupKeyForAsset);
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                if (width == null && height == null) {
                    c2276cFromBitmap = bitmapDescriptorFactoryWrapper.fromBitmap(toScaledBitmap(bitmapDecodeStream, f10 / platformBitmapAssetMap.getImagePixelRatio().floatValue()));
                    if (inputStreamOpen != null) {
                    }
                    return c2276cFromBitmap;
                }
                int width2 = width != null ? toInt(Double.valueOf(width.doubleValue() * ((double) f10))) : bitmapDecodeStream.getWidth();
                int height2 = height != null ? toInt(Double.valueOf(height.doubleValue() * ((double) f10))) : bitmapDecodeStream.getHeight();
                if (width != null && height == null) {
                    height2 = (int) (((double) width2) * (((double) bitmapDecodeStream.getHeight()) / ((double) bitmapDecodeStream.getWidth())));
                } else if (height != null && width == null) {
                    width2 = (int) (((double) height2) * (((double) bitmapDecodeStream.getWidth()) / ((double) bitmapDecodeStream.getHeight())));
                }
                c2276cFromBitmap = bitmapDescriptorFactoryWrapper.fromBitmap(toScaledBitmap(bitmapDecodeStream, width2, height2));
                if (inputStreamOpen == null) {
                    return c2276cFromBitmap;
                }
                try {
                    inputStreamOpen.close();
                    return c2276cFromBitmap;
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            } catch (Exception e11) {
                throw new IllegalArgumentException("'asset' cannot open asset: " + assetName, e11);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static C2276c getBitmapFromBytes(Messages.PlatformBitmapBytesMap platformBitmapBytesMap, float f10, BitmapDescriptorFactoryWrapper bitmapDescriptorFactoryWrapper) {
        try {
            Bitmap bitmap = toBitmap(platformBitmapBytesMap.getByteData());
            if (AnonymousClass1.$SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformMapBitmapScaling[platformBitmapBytesMap.getBitmapScaling().ordinal()] != 1) {
                return bitmapDescriptorFactoryWrapper.fromBitmap(bitmap);
            }
            Double width = platformBitmapBytesMap.getWidth();
            Double height = platformBitmapBytesMap.getHeight();
            if (width == null && height == null) {
                return bitmapDescriptorFactoryWrapper.fromBitmap(toScaledBitmap(bitmap, f10 / platformBitmapBytesMap.getImagePixelRatio().floatValue()));
            }
            int width2 = width != null ? toInt(Double.valueOf(width.doubleValue() * ((double) f10))) : bitmap.getWidth();
            int height2 = height != null ? toInt(Double.valueOf(height.doubleValue() * ((double) f10))) : bitmap.getHeight();
            if (width != null && height == null) {
                height2 = (int) (((double) width2) * (((double) bitmap.getHeight()) / ((double) bitmap.getWidth())));
            } else if (height != null && width == null) {
                width2 = (int) (((double) height2) * (((double) bitmap.getWidth()) / ((double) bitmap.getHeight())));
            }
            return bitmapDescriptorFactoryWrapper.fromBitmap(toScaledBitmap(bitmap, width2, height2));
        } catch (Exception e10) {
            throw new IllegalArgumentException("Unable to interpret bytes as a valid image.", e10);
        }
    }

    private static C2276c getBitmapFromBytesLegacy(Messages.PlatformBitmapBytes platformBitmapBytes) {
        try {
            return AbstractC2277d.d(toBitmap(platformBitmapBytes.getByteData()));
        } catch (Exception e10) {
            throw new IllegalArgumentException("Unable to interpret bytes as a valid image.", e10);
        }
    }

    public static C2276c getBitmapFromPinConfigBuilder(Messages.PlatformBitmapPinConfig platformBitmapPinConfig, AssetManager assetManager, float f10, BitmapDescriptorFactoryWrapper bitmapDescriptorFactoryWrapper) {
        try {
            return bitmapDescriptorFactoryWrapper.fromPinConfig(getPinConfigFromPlatformPinConfig(platformBitmapPinConfig, assetManager, f10, bitmapDescriptorFactoryWrapper));
        } catch (U6.B | IllegalArgumentException e10) {
            throw new IllegalArgumentException("Unable to interpret pin config as a valid image.", e10);
        }
    }

    public static C2293u getPinConfigFromPlatformPinConfig(Messages.PlatformBitmapPinConfig platformBitmapPinConfig, AssetManager assetManager, float f10, BitmapDescriptorFactoryWrapper bitmapDescriptorFactoryWrapper) {
        Integer numNullableColor = nullableColor(platformBitmapPinConfig.getBackgroundColor());
        Integer numNullableColor2 = nullableColor(platformBitmapPinConfig.getBorderColor());
        C2293u.b bVarBuildPinGlyph = buildPinGlyph(platformBitmapPinConfig, assetManager, f10, bitmapDescriptorFactoryWrapper);
        final C2293u.a aVarD = C2293u.d();
        Objects.requireNonNull(aVarD);
        applyIfNotNull(numNullableColor, new Consumer() { // from class: io.flutter.plugins.googlemaps.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                aVarD.b(((Integer) obj).intValue());
            }
        });
        applyIfNotNull(numNullableColor2, new Consumer() { // from class: io.flutter.plugins.googlemaps.b
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                aVarD.c(((Integer) obj).intValue());
            }
        });
        applyIfNotNull(bVarBuildPinGlyph, new Consumer() { // from class: io.flutter.plugins.googlemaps.c
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                aVarD.d((C2293u.b) obj);
            }
        });
        return aVarD.a();
    }

    public static J9.a gradientFromPigeon(Messages.PlatformHeatmapGradient platformHeatmapGradient) {
        List<Messages.PlatformColor> colors = platformHeatmapGradient.getColors();
        int[] iArr = new int[colors.size()];
        for (int i10 = 0; i10 < colors.size(); i10++) {
            iArr[i10] = colors.get(i10).getArgbValue().intValue();
        }
        List<Double> startPoints = platformHeatmapGradient.getStartPoints();
        float[] fArr = new float[startPoints.size()];
        for (int i11 = 0; i11 < startPoints.size(); i11++) {
            fArr[i11] = startPoints.get(i11).floatValue();
        }
        return new J9.a(iArr, fArr, platformHeatmapGradient.getColorMapSize().intValue());
    }

    public static Messages.PlatformGroundOverlay groundOverlayToPigeon(C2287n c2287n, String str, boolean z10) {
        Messages.PlatformGroundOverlay.Builder clickable = new Messages.PlatformGroundOverlay.Builder().setGroundOverlayId(str).setImage(new Messages.PlatformBitmap.Builder().setBitmap(new Messages.PlatformBitmapBytesMap.Builder().setByteData(new byte[]{0}).setImagePixelRatio(Double.valueOf(1.0d)).setBitmapScaling(Messages.PlatformMapBitmapScaling.NONE).build()).build()).setWidth(Double.valueOf(c2287n.g())).setHeight(Double.valueOf(c2287n.c())).setBearing(Double.valueOf(c2287n.a())).setTransparency(Double.valueOf(c2287n.f())).setZIndex(Long.valueOf((long) c2287n.h())).setVisible(Boolean.valueOf(c2287n.j())).setClickable(Boolean.valueOf(c2287n.i()));
        if (z10) {
            clickable.setBounds(latLngBoundsToPigeon(c2287n.b()));
        } else {
            clickable.setPosition(latLngToPigeon(c2287n.e()));
        }
        clickable.setAnchor(buildGroundOverlayAnchorForPigeon(c2287n));
        return clickable.build();
    }

    public static String interpretCircleOptions(Messages.PlatformCircle platformCircle, CircleOptionsSink circleOptionsSink) {
        circleOptionsSink.setConsumeTapEvents(platformCircle.getConsumeTapEvents().booleanValue());
        circleOptionsSink.setFillColor(platformCircle.getFillColor().getArgbValue().intValue());
        circleOptionsSink.setStrokeColor(platformCircle.getStrokeColor().getArgbValue().intValue());
        circleOptionsSink.setStrokeWidth(platformCircle.getStrokeWidth().longValue());
        circleOptionsSink.setZIndex(platformCircle.getZIndex().floatValue());
        circleOptionsSink.setCenter(latLngFromPigeon(platformCircle.getCenter()));
        circleOptionsSink.setRadius(platformCircle.getRadius().doubleValue());
        circleOptionsSink.setVisible(platformCircle.getVisible().booleanValue());
        return platformCircle.getCircleId();
    }

    public static String interpretGroundOverlayOptions(Messages.PlatformGroundOverlay platformGroundOverlay, GroundOverlaySink groundOverlaySink, AssetManager assetManager, float f10, BitmapDescriptorFactoryWrapper bitmapDescriptorFactoryWrapper) {
        groundOverlaySink.setTransparency(platformGroundOverlay.getTransparency().floatValue());
        groundOverlaySink.setZIndex(platformGroundOverlay.getZIndex().floatValue());
        groundOverlaySink.setVisible(platformGroundOverlay.getVisible().booleanValue());
        if (platformGroundOverlay.getAnchor() != null) {
            groundOverlaySink.setAnchor(platformGroundOverlay.getAnchor().getX().floatValue(), platformGroundOverlay.getAnchor().getY().floatValue());
        }
        groundOverlaySink.setBearing(platformGroundOverlay.getBearing().floatValue());
        groundOverlaySink.setClickable(platformGroundOverlay.getClickable().booleanValue());
        groundOverlaySink.setImage(toBitmapDescriptor(platformGroundOverlay.getImage(), assetManager, f10, bitmapDescriptorFactoryWrapper));
        if (platformGroundOverlay.getPosition() != null) {
            if (platformGroundOverlay.getWidth() == null) {
                throw new Messages.FlutterError("Invalid GroundOverlay", "Width is required when using a ground overlay with a position.", null);
            }
            groundOverlaySink.setPosition(latLngFromPigeon(platformGroundOverlay.getPosition()), Float.valueOf(platformGroundOverlay.getWidth().floatValue()), platformGroundOverlay.getHeight() != null ? Float.valueOf(platformGroundOverlay.getHeight().floatValue()) : null);
        } else if (platformGroundOverlay.getBounds() != null) {
            groundOverlaySink.setPositionFromBounds(latLngBoundsFromPigeon(platformGroundOverlay.getBounds()));
        }
        return platformGroundOverlay.getGroundOverlayId();
    }

    public static String interpretHeatmapOptions(Messages.PlatformHeatmap platformHeatmap, HeatmapOptionsSink heatmapOptionsSink) {
        heatmapOptionsSink.setWeightedData(weightedDataFromPigeon(platformHeatmap.getData()));
        Messages.PlatformHeatmapGradient gradient = platformHeatmap.getGradient();
        if (gradient != null) {
            heatmapOptionsSink.setGradient(gradientFromPigeon(gradient));
        }
        Double maxIntensity = platformHeatmap.getMaxIntensity();
        if (maxIntensity != null) {
            heatmapOptionsSink.setMaxIntensity(maxIntensity.doubleValue());
        }
        heatmapOptionsSink.setOpacity(platformHeatmap.getOpacity().doubleValue());
        heatmapOptionsSink.setRadius(platformHeatmap.getRadius().intValue());
        return platformHeatmap.getHeatmapId();
    }

    private static void interpretInfoWindowOptions(MarkerOptionsSink markerOptionsSink, Messages.PlatformInfoWindow platformInfoWindow) {
        String title = platformInfoWindow.getTitle();
        if (title != null) {
            markerOptionsSink.setInfoWindowText(title, platformInfoWindow.getSnippet());
        }
        Messages.PlatformDoublePair anchor = platformInfoWindow.getAnchor();
        markerOptionsSink.setInfoWindowAnchor(anchor.getX().floatValue(), anchor.getY().floatValue());
    }

    public static void interpretMapConfiguration(Messages.PlatformMapConfiguration platformMapConfiguration, GoogleMapOptionsSink googleMapOptionsSink) {
        Messages.PlatformCameraTargetBounds cameraTargetBounds = platformMapConfiguration.getCameraTargetBounds();
        if (cameraTargetBounds != null) {
            Messages.PlatformLatLngBounds bounds = cameraTargetBounds.getBounds();
            googleMapOptionsSink.setCameraTargetBounds(bounds == null ? null : latLngBoundsFromPigeon(bounds));
        }
        Boolean compassEnabled = platformMapConfiguration.getCompassEnabled();
        if (compassEnabled != null) {
            googleMapOptionsSink.setCompassEnabled(compassEnabled.booleanValue());
        }
        Boolean mapToolbarEnabled = platformMapConfiguration.getMapToolbarEnabled();
        if (mapToolbarEnabled != null) {
            googleMapOptionsSink.setMapToolbarEnabled(mapToolbarEnabled.booleanValue());
        }
        Messages.PlatformMapType mapType = platformMapConfiguration.getMapType();
        if (mapType != null) {
            googleMapOptionsSink.setMapType(toMapType(mapType));
        }
        Messages.PlatformZoomRange minMaxZoomPreference = platformMapConfiguration.getMinMaxZoomPreference();
        if (minMaxZoomPreference != null) {
            googleMapOptionsSink.setMinMaxZoomPreference(nullableDoubleToFloat(minMaxZoomPreference.getMin()), nullableDoubleToFloat(minMaxZoomPreference.getMax()));
        }
        Messages.PlatformEdgeInsets padding = platformMapConfiguration.getPadding();
        if (padding != null) {
            googleMapOptionsSink.setPadding(padding.getTop().floatValue(), padding.getLeft().floatValue(), padding.getBottom().floatValue(), padding.getRight().floatValue());
        }
        Boolean rotateGesturesEnabled = platformMapConfiguration.getRotateGesturesEnabled();
        if (rotateGesturesEnabled != null) {
            googleMapOptionsSink.setRotateGesturesEnabled(rotateGesturesEnabled.booleanValue());
        }
        Boolean scrollGesturesEnabled = platformMapConfiguration.getScrollGesturesEnabled();
        if (scrollGesturesEnabled != null) {
            googleMapOptionsSink.setScrollGesturesEnabled(scrollGesturesEnabled.booleanValue());
        }
        Boolean tiltGesturesEnabled = platformMapConfiguration.getTiltGesturesEnabled();
        if (tiltGesturesEnabled != null) {
            googleMapOptionsSink.setTiltGesturesEnabled(tiltGesturesEnabled.booleanValue());
        }
        Boolean trackCameraPosition = platformMapConfiguration.getTrackCameraPosition();
        if (trackCameraPosition != null) {
            googleMapOptionsSink.setTrackCameraPosition(trackCameraPosition.booleanValue());
        }
        Boolean zoomGesturesEnabled = platformMapConfiguration.getZoomGesturesEnabled();
        if (zoomGesturesEnabled != null) {
            googleMapOptionsSink.setZoomGesturesEnabled(zoomGesturesEnabled.booleanValue());
        }
        Boolean liteModeEnabled = platformMapConfiguration.getLiteModeEnabled();
        if (liteModeEnabled != null) {
            googleMapOptionsSink.setLiteModeEnabled(liteModeEnabled.booleanValue());
        }
        Boolean myLocationEnabled = platformMapConfiguration.getMyLocationEnabled();
        if (myLocationEnabled != null) {
            googleMapOptionsSink.setMyLocationEnabled(myLocationEnabled.booleanValue());
        }
        Boolean zoomControlsEnabled = platformMapConfiguration.getZoomControlsEnabled();
        if (zoomControlsEnabled != null) {
            googleMapOptionsSink.setZoomControlsEnabled(zoomControlsEnabled.booleanValue());
        }
        Boolean myLocationButtonEnabled = platformMapConfiguration.getMyLocationButtonEnabled();
        if (myLocationButtonEnabled != null) {
            googleMapOptionsSink.setMyLocationButtonEnabled(myLocationButtonEnabled.booleanValue());
        }
        Boolean indoorViewEnabled = platformMapConfiguration.getIndoorViewEnabled();
        if (indoorViewEnabled != null) {
            googleMapOptionsSink.setIndoorEnabled(indoorViewEnabled.booleanValue());
        }
        Boolean trafficEnabled = platformMapConfiguration.getTrafficEnabled();
        if (trafficEnabled != null) {
            googleMapOptionsSink.setTrafficEnabled(trafficEnabled.booleanValue());
        }
        Boolean buildingsEnabled = platformMapConfiguration.getBuildingsEnabled();
        if (buildingsEnabled != null) {
            googleMapOptionsSink.setBuildingsEnabled(buildingsEnabled.booleanValue());
        }
        String style = platformMapConfiguration.getStyle();
        if (style != null) {
            googleMapOptionsSink.setMapStyle(style);
        }
    }

    public static void interpretMarkerOptions(Messages.PlatformMarker platformMarker, MarkerOptionsSink markerOptionsSink, AssetManager assetManager, float f10, BitmapDescriptorFactoryWrapper bitmapDescriptorFactoryWrapper) {
        markerOptionsSink.setAlpha(platformMarker.getAlpha().floatValue());
        markerOptionsSink.setAnchor(platformMarker.getAnchor().getX().floatValue(), platformMarker.getAnchor().getY().floatValue());
        markerOptionsSink.setConsumeTapEvents(platformMarker.getConsumeTapEvents().booleanValue());
        markerOptionsSink.setDraggable(platformMarker.getDraggable().booleanValue());
        markerOptionsSink.setFlat(platformMarker.getFlat().booleanValue());
        markerOptionsSink.setIcon(toBitmapDescriptor(platformMarker.getIcon(), assetManager, f10, bitmapDescriptorFactoryWrapper));
        interpretInfoWindowOptions(markerOptionsSink, platformMarker.getInfoWindow());
        markerOptionsSink.setPosition(latLngFromPigeon(platformMarker.getPosition()));
        markerOptionsSink.setRotation(platformMarker.getRotation().floatValue());
        markerOptionsSink.setVisible(platformMarker.getVisible().booleanValue());
        markerOptionsSink.setZIndex(platformMarker.getZIndex().floatValue());
        markerOptionsSink.setCollisionBehavior(collisionBehaviorFromPigeon(platformMarker.getCollisionBehavior()));
    }

    public static String interpretPolygonOptions(Messages.PlatformPolygon platformPolygon, PolygonOptionsSink polygonOptionsSink) {
        polygonOptionsSink.setConsumeTapEvents(platformPolygon.getConsumesTapEvents().booleanValue());
        polygonOptionsSink.setGeodesic(platformPolygon.getGeodesic().booleanValue());
        polygonOptionsSink.setVisible(platformPolygon.getVisible().booleanValue());
        polygonOptionsSink.setFillColor(platformPolygon.getFillColor().getArgbValue().intValue());
        polygonOptionsSink.setStrokeColor(platformPolygon.getStrokeColor().getArgbValue().intValue());
        polygonOptionsSink.setStrokeWidth(platformPolygon.getStrokeWidth().longValue());
        polygonOptionsSink.setZIndex(platformPolygon.getZIndex().longValue());
        polygonOptionsSink.setPoints(pointsFromPigeon(platformPolygon.getPoints()));
        polygonOptionsSink.setHoles(toHoles(platformPolygon.getHoles()));
        return platformPolygon.getPolygonId();
    }

    public static String interpretPolylineOptions(Messages.PlatformPolyline platformPolyline, PolylineOptionsSink polylineOptionsSink, AssetManager assetManager, float f10) {
        polylineOptionsSink.setConsumeTapEvents(platformPolyline.getConsumesTapEvents().booleanValue());
        polylineOptionsSink.setColor(platformPolyline.getColor().getArgbValue().intValue());
        polylineOptionsSink.setEndCap(capFromPigeon(platformPolyline.getEndCap(), assetManager, f10));
        polylineOptionsSink.setStartCap(capFromPigeon(platformPolyline.getStartCap(), assetManager, f10));
        polylineOptionsSink.setGeodesic(platformPolyline.getGeodesic().booleanValue());
        polylineOptionsSink.setJointType(jointTypeFromPigeon(platformPolyline.getJointType()));
        polylineOptionsSink.setVisible(platformPolyline.getVisible().booleanValue());
        polylineOptionsSink.setWidth(platformPolyline.getWidth().longValue());
        polylineOptionsSink.setZIndex(platformPolyline.getZIndex().longValue());
        polylineOptionsSink.setPoints(pointsFromPigeon(platformPolyline.getPoints()));
        polylineOptionsSink.setPattern(patternFromPigeon(platformPolyline.getPatterns()));
        return platformPolyline.getPolylineId();
    }

    public static String interpretTileOverlayOptions(Messages.PlatformTileOverlay platformTileOverlay, TileOverlaySink tileOverlaySink) {
        tileOverlaySink.setFadeIn(platformTileOverlay.getFadeIn().booleanValue());
        tileOverlaySink.setTransparency(platformTileOverlay.getTransparency().floatValue());
        tileOverlaySink.setZIndex(platformTileOverlay.getZIndex().longValue());
        tileOverlaySink.setVisible(platformTileOverlay.getVisible().booleanValue());
        return platformTileOverlay.getTileOverlayId();
    }

    public static int jointTypeFromPigeon(Messages.PlatformJointType platformJointType) {
        int i10 = AnonymousClass1.$SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformJointType[platformJointType.ordinal()];
        if (i10 != 2) {
            return i10 != 3 ? 0 : 2;
        }
        return 1;
    }

    public static LatLngBounds latLngBoundsFromPigeon(Messages.PlatformLatLngBounds platformLatLngBounds) {
        return new LatLngBounds(latLngFromPigeon(platformLatLngBounds.getSouthwest()), latLngFromPigeon(platformLatLngBounds.getNortheast()));
    }

    public static Messages.PlatformLatLngBounds latLngBoundsToPigeon(LatLngBounds latLngBounds) {
        return new Messages.PlatformLatLngBounds.Builder().setNortheast(latLngToPigeon(latLngBounds.f30353b)).setSouthwest(latLngToPigeon(latLngBounds.f30352a)).build();
    }

    public static LatLng latLngFromPigeon(Messages.PlatformLatLng platformLatLng) {
        return new LatLng(platformLatLng.getLatitude().doubleValue(), platformLatLng.getLongitude().doubleValue());
    }

    public static Messages.PlatformLatLng latLngToPigeon(LatLng latLng) {
        return new Messages.PlatformLatLng.Builder().setLatitude(Double.valueOf(latLng.f30350a)).setLongitude(Double.valueOf(latLng.f30351b)).build();
    }

    private static Integer nullableColor(Messages.PlatformColor platformColor) {
        if (platformColor == null) {
            return null;
        }
        return Integer.valueOf(platformColor.getArgbValue().intValue());
    }

    private static Float nullableDoubleToFloat(Double d10) {
        if (d10 == null) {
            return null;
        }
        return Float.valueOf(d10.floatValue());
    }

    private static List<C2292t> patternFromPigeon(List<Messages.PlatformPatternItem> list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Messages.PlatformPatternItem platformPatternItem : list) {
            int i10 = AnonymousClass1.$SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformPatternItemType[platformPatternItem.getType().ordinal()];
            if (i10 == 1) {
                arrayList.add(new C2284k());
            } else if (i10 == 2) {
                arrayList.add(new C2283j(platformPatternItem.getLength().floatValue()));
            } else if (i10 == 3) {
                arrayList.add(new C2286m(platformPatternItem.getLength().floatValue()));
            }
        }
        return arrayList;
    }

    public static Point pointFromPigeon(Messages.PlatformPoint platformPoint) {
        return new Point(platformPoint.getX().intValue(), platformPoint.getY().intValue());
    }

    public static Messages.PlatformPoint pointToPigeon(Point point) {
        return new Messages.PlatformPoint.Builder().setX(Long.valueOf(point.x)).setY(Long.valueOf(point.y)).build();
    }

    public static List<LatLng> pointsFromPigeon(List<Messages.PlatformLatLng> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Messages.PlatformLatLng platformLatLng : list) {
            arrayList.add(new LatLng(platformLatLng.getLatitude().doubleValue(), platformLatLng.getLongitude().doubleValue()));
        }
        return arrayList;
    }

    public static U6.I tileFromPigeon(Messages.PlatformTile platformTile) {
        return new U6.I(platformTile.getWidth().intValue(), platformTile.getHeight().intValue(), platformTile.getData());
    }

    private static Bitmap toBitmap(byte[] bArr) {
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        throw new IllegalArgumentException("Unable to decode bytes as a valid bitmap.");
    }

    private static C2276c toBitmapDescriptor(Messages.PlatformBitmap platformBitmap, AssetManager assetManager, float f10) {
        return toBitmapDescriptor(platformBitmap, assetManager, f10, new BitmapDescriptorFactoryWrapper());
    }

    private static List<List<LatLng>> toHoles(List<List<Messages.PlatformLatLng>> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<List<Messages.PlatformLatLng>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(pointsFromPigeon(it.next()));
        }
        return arrayList;
    }

    private static int toInt(Object obj) {
        return ((Number) obj).intValue();
    }

    public static f.a toMapRendererType(Messages.PlatformRendererType platformRendererType) {
        if (platformRendererType == null) {
            return null;
        }
        int i10 = AnonymousClass1.$SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformRendererType[platformRendererType.ordinal()];
        if (i10 == 1) {
            return f.a.LATEST;
        }
        if (i10 != 2) {
            return null;
        }
        return f.a.LEGACY;
    }

    public static int toMapType(Messages.PlatformMapType platformMapType) {
        int i10 = AnonymousClass1.$SwitchMap$io$flutter$plugins$googlemaps$Messages$PlatformMapType[platformMapType.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 != 4) {
            return i10 != 5 ? 1 : 4;
        }
        return 3;
    }

    private static Bitmap toScaledBitmap(Bitmap bitmap, float f10) {
        return (Math.abs(f10 - 1.0f) <= 0.001f || f10 <= 0.0f) ? bitmap : toScaledBitmap(bitmap, (int) (bitmap.getWidth() * f10), (int) (bitmap.getHeight() * f10));
    }

    public static List<J9.c> weightedDataFromPigeon(List<Messages.PlatformWeightedLatLng> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Messages.PlatformWeightedLatLng> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(weightedLatLngFromPigeon(it.next()));
        }
        return arrayList;
    }

    public static J9.c weightedLatLngFromPigeon(Messages.PlatformWeightedLatLng platformWeightedLatLng) {
        return new J9.c(latLngFromPigeon(platformWeightedLatLng.getPoint()), platformWeightedLatLng.getWeight().doubleValue());
    }

    public static Point pointFromPigeon(Messages.PlatformDoublePair platformDoublePair, float f10) {
        if (platformDoublePair == null) {
            return null;
        }
        double d10 = f10;
        return new Point((int) (platformDoublePair.getX().doubleValue() * d10), (int) (platformDoublePair.getY().doubleValue() * d10));
    }

    private static C2276c toBitmapDescriptor(Messages.PlatformBitmap platformBitmap, AssetManager assetManager, float f10, BitmapDescriptorFactoryWrapper bitmapDescriptorFactoryWrapper) {
        Object bitmap = platformBitmap.getBitmap();
        if (bitmap instanceof Messages.PlatformBitmapDefaultMarker) {
            Messages.PlatformBitmapDefaultMarker platformBitmapDefaultMarker = (Messages.PlatformBitmapDefaultMarker) bitmap;
            return platformBitmapDefaultMarker.getHue() == null ? AbstractC2277d.a() : AbstractC2277d.b(platformBitmapDefaultMarker.getHue().floatValue());
        }
        if (bitmap instanceof Messages.PlatformBitmapAsset) {
            Messages.PlatformBitmapAsset platformBitmapAsset = (Messages.PlatformBitmapAsset) bitmap;
            String name = platformBitmapAsset.getName();
            String pkg = platformBitmapAsset.getPkg();
            return pkg == null ? AbstractC2277d.c(FlutterInjector.instance().flutterLoader().getLookupKeyForAsset(name)) : AbstractC2277d.c(FlutterInjector.instance().flutterLoader().getLookupKeyForAsset(name, pkg));
        }
        if (bitmap instanceof Messages.PlatformBitmapAssetImage) {
            return AbstractC2277d.c(FlutterInjector.instance().flutterLoader().getLookupKeyForAsset(((Messages.PlatformBitmapAssetImage) bitmap).getName()));
        }
        if (bitmap instanceof Messages.PlatformBitmapBytes) {
            return getBitmapFromBytesLegacy((Messages.PlatformBitmapBytes) bitmap);
        }
        if (bitmap instanceof Messages.PlatformBitmapAssetMap) {
            return getBitmapFromAsset((Messages.PlatformBitmapAssetMap) bitmap, assetManager, f10, bitmapDescriptorFactoryWrapper, new FlutterInjectorWrapper());
        }
        if (bitmap instanceof Messages.PlatformBitmapBytesMap) {
            return getBitmapFromBytes((Messages.PlatformBitmapBytesMap) bitmap, f10, bitmapDescriptorFactoryWrapper);
        }
        if (bitmap instanceof Messages.PlatformBitmapPinConfig) {
            return getBitmapFromPinConfigBuilder((Messages.PlatformBitmapPinConfig) bitmap, assetManager, f10, bitmapDescriptorFactoryWrapper);
        }
        throw new IllegalArgumentException("PlatformBitmap did not contain a supported subtype.");
    }

    private static Bitmap toScaledBitmap(Bitmap bitmap, int i10, int i11) {
        return (i10 <= 0 || i11 <= 0) ? bitmap : (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) ? bitmap : Bitmap.createScaledBitmap(bitmap, i10, i11, true);
    }
}
