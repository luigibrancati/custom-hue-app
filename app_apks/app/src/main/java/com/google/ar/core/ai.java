package com.google.ar.core;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
enum ai {
    BASE_TRACKABLE(1095893248, Trackable.class),
    UNKNOWN_TO_JAVA(-1, null),
    PLANE(1095893249, Plane.class),
    POINT(1095893250, Point.class),
    AUGMENTED_IMAGE(1095893252, AugmentedImage.class),
    FACE(1095893253, AugmentedFace.class),
    STREETSCAPE_GEOMETRY(1095893251, StreetscapeGeometry.class),
    EARTH(1095893257, Earth.class),
    DEPTH_POINT(1095893265, DepthPoint.class),
    INSTANT_PLACEMENT_POINT(1095893266, InstantPlacementPoint.class);


    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final int f31168k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Class f31169l;

    ai(int i10, Class cls) {
        this.f31168k = i10;
        this.f31169l = cls;
    }

    public static ai a(Class cls) {
        for (ai aiVar : values()) {
            Class cls2 = aiVar.f31169l;
            if (cls2 != null && cls2.equals(cls)) {
                return aiVar;
            }
        }
        return UNKNOWN_TO_JAVA;
    }
}
