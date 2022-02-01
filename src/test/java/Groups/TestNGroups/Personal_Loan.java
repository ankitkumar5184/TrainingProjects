package Groups.TestNGroups;

import org.testng.annotations.Test;

public class Personal_Loan {
    @Test(groups = {"Smoke Test"})
    public void WebLoginPersonalLoan(){
        System.out.println("Web login personal loan");
    }
@Test
    public void MobileLoginPersonalLoan(){
    System.out.println("Mobile login personal loan");
}
    @Test
    public void APILoginPersonalLoan()
    {
        System.out.println("API Login Personal Loan");
    }
}
