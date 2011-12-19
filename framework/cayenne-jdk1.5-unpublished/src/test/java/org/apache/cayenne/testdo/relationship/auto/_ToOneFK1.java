package org.apache.cayenne.testdo.relationship.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.testdo.relationship.ToOneFK2;

/**
 * Class _ToOneFK1 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ToOneFK1 extends CayenneDataObject {

    public static final String TO_PK_PROPERTY = "toPK";

    public static final String TO_ONEFK1_PK_PK_COLUMN = "TO_ONEFK1_PK";

    public void setToPK(ToOneFK2 toPK) {
        setToOneTarget(TO_PK_PROPERTY, toPK, true);
    }

    public ToOneFK2 getToPK() {
        return (ToOneFK2)readProperty(TO_PK_PROPERTY);
    }


}
