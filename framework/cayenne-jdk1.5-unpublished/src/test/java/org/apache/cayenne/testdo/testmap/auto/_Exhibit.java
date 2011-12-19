package org.apache.cayenne.testdo.testmap.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.testdo.testmap.ArtistExhibit;
import org.apache.cayenne.testdo.testmap.Gallery;

/**
 * Class _Exhibit was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Exhibit extends CayenneDataObject {

    public static final String CLOSING_DATE_PROPERTY = "closingDate";
    public static final String OPENING_DATE_PROPERTY = "openingDate";
    public static final String ARTIST_EXHIBIT_ARRAY_PROPERTY = "artistExhibitArray";
    public static final String TO_GALLERY_PROPERTY = "toGallery";

    public static final String EXHIBIT_ID_PK_COLUMN = "EXHIBIT_ID";

    public void setClosingDate(Date closingDate) {
        writeProperty(CLOSING_DATE_PROPERTY, closingDate);
    }
    public Date getClosingDate() {
        return (Date)readProperty(CLOSING_DATE_PROPERTY);
    }

    public void setOpeningDate(Date openingDate) {
        writeProperty(OPENING_DATE_PROPERTY, openingDate);
    }
    public Date getOpeningDate() {
        return (Date)readProperty(OPENING_DATE_PROPERTY);
    }

    public void addToArtistExhibitArray(ArtistExhibit obj) {
        addToManyTarget(ARTIST_EXHIBIT_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromArtistExhibitArray(ArtistExhibit obj) {
        removeToManyTarget(ARTIST_EXHIBIT_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ArtistExhibit> getArtistExhibitArray() {
        return (List<ArtistExhibit>)readProperty(ARTIST_EXHIBIT_ARRAY_PROPERTY);
    }


    public void setToGallery(Gallery toGallery) {
        setToOneTarget(TO_GALLERY_PROPERTY, toGallery, true);
    }

    public Gallery getToGallery() {
        return (Gallery)readProperty(TO_GALLERY_PROPERTY);
    }


}
