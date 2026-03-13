package org.apache.tika.metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface TIFF {
    public static final Property BITS_PER_SAMPLE = Property.internalIntegerSequence("tiff:BitsPerSample");
    public static final Property IMAGE_LENGTH = Property.internalInteger("tiff:ImageLength");
    public static final Property IMAGE_WIDTH = Property.internalInteger("tiff:ImageWidth");
    public static final Property SAMPLES_PER_PIXEL = Property.internalInteger("tiff:SamplesPerPixel");
    public static final Property FLASH_FIRED = Property.internalBoolean("exif:Flash");
    public static final Property EXPOSURE_TIME = Property.internalRational("exif:ExposureTime");
    public static final Property F_NUMBER = Property.internalRational("exif:FNumber");
    public static final Property FOCAL_LENGTH = Property.internalRational("exif:FocalLength");
    public static final Property ISO_SPEED_RATINGS = Property.internalIntegerSequence("exif:IsoSpeedRatings");
    public static final Property EQUIPMENT_MAKE = Property.internalText("tiff:Make");
    public static final Property EQUIPMENT_MODEL = Property.internalText("tiff:Model");
    public static final Property SOFTWARE = Property.internalText("tiff:Software");
    public static final Property ORIENTATION = Property.internalClosedChoise("tiff:Orientation", "1", "2", "3", "4", "5", "6", "7", "8");
    public static final Property RESOLUTION_HORIZONTAL = Property.internalRational("tiff:XResolution");
    public static final Property RESOLUTION_VERTICAL = Property.internalRational("tiff:YResolution");
    public static final Property RESOLUTION_UNIT = Property.internalClosedChoise("tiff:ResolutionUnit", "Inch", "cm");
    public static final Property ORIGINAL_DATE = Property.internalDate("exif:DateTimeOriginal");
    public static final Property EXIF_PAGE_COUNT = Property.externalInteger("exif:PageCount");
}
