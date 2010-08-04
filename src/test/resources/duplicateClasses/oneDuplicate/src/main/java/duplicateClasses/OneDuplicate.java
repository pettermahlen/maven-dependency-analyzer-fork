/**
 * Copyright (C) 2004 - 2009 Shopzilla, Inc. 
 * All rights reserved. Unauthorized disclosure or distribution is prohibited.
 */

package duplicateClasses;

import duplicateClasses.project1.NotDuplicated1;
import duplicateClasses.project2.NotDuplicated2;

/**
 * TODO: document this class!
 *
 * @author Petter Måhlén
 * @since Jul 25, 2010
 */
public class OneDuplicate {
    public OneDuplicate() {
        NotDuplicated1 dependOn1 = new NotDuplicated1();
        NotDuplicated2 dependOn2 = new NotDuplicated2();
    }
}
