package org.apache.cayenne.testdo.toone.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.toone.TooneDep;

/**
 * Class _TooneMaster was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TooneMaster extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<TooneDep> TO_DEPENDENT = Property.create("toDependent", TooneDep.class);

    public void setToDependent(TooneDep toDependent) {
        setToOneTarget("toDependent", toDependent, true);
    }

    public TooneDep getToDependent() {
        return (TooneDep)readProperty("toDependent");
    }


}
