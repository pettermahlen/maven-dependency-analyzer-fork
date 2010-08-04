/**
 * Copyright (C) 2004 - 2009 Shopzilla, Inc. 
 * All rights reserved. Unauthorized disclosure or distribution is prohibited.
 */

package duplicateClasses;

import duplicateClasses.project1.NotDuplicated1;
import duplicateClasses.project4.NotDuplicated4;

/**
 * TODO: document this class!
 *
 * @author Petter Måhlén
 * @since Jul 25, 2010
 */
public class TransitiveDuplicate {
    public TransitiveDuplicate() {
        NotDuplicated1 dependOn1 = new NotDuplicated1();
        NotDuplicated4 dependOn4 = new NotDuplicated4();
    }
}
