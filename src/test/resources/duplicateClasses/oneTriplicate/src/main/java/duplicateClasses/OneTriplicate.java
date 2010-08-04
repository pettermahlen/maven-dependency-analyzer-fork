/**
 * Copyright (C) 2004 - 2009 Shopzilla, Inc. 
 * All rights reserved. Unauthorized disclosure or distribution is prohibited.
 */

package duplicateClasses;

import duplicateClasses.project1.NotDuplicated1;
import duplicateClasses.project2.NotDuplicated2;
import duplicateClasses.project3.NotDuplicated3;

/**
 * TODO: document this class!
 *
 * @author Petter Måhlén
 * @since Jul 25, 2010
 */
public class OneTriplicate {
    public OneTriplicate() {
        NotDuplicated1 dependOn1 = new NotDuplicated1();
        NotDuplicated2 dependOn2 = new NotDuplicated2();
        NotDuplicated3 dependOn3 = new NotDuplicated3();
    }
}
