!SLIDE
# What we did

!SLIDE center
# Web Testing
![Web Testing](web_testing.png)
 
!SLIDE bullets incremental
# Low Risk, High Value
* Web Testing new
* Testing API new
* Something to learn anyway
* Why not some Scala?

!SLIDE smaller
# HTMLUnit/JWebUnit is assembly language

    @@@ Java
    public void testLogin {
      tester = new WebTester();
      tester.gotoURL(HOME_PAGE);
      tester.gotoURL(PROTECTED_PAGE);
      tester.assertOnForm("login");
      tester.setValue("user","dave@blah.com");
      tester.setValue("pass","foobar69");
      tester.submit();
      tester.assertOn(PROTECTED_PAGE);
    }

!SLIDE
# The ultimate DSL?

    @@@ Scala
    def someTest = {
      go home and login as "dave@blah.com"
        with password "foobar69"
      should be on page 'protected
      should see <h1>Hello Dave</h1>
    }
