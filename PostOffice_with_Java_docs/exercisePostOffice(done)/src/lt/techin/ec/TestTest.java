package lt.techin.ec;

import lt.vtvpmc.java.postoffice.AbstractPostOfficeTest;
import lt.vtvpmc.java.postoffice.PostOffice;

public class TestTest extends AbstractPostOfficeTest {

    @Override
    protected PostOffice getPostOffice() {
        return new MyPostOffice();
    }
}
