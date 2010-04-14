!SLIDE center
# Business Logic
![Service Focus](service_focus.png)

!SLIDE center smaller
# Fully Armed and Operational Programming Language <br /><a href="http://www.flickr.com/photos/flying_cloud/2667225198/"><img src="death_star.jpg" height="384" /></a>
[_http://www.flickr.com/photos/flying_cloud/2667225198_](http://www.flickr.com/photos/flying_cloud/2667225198)

!SLIDE small
# Hard to control Learning Curve

    @@@ Scala
    class PersonService {
      this: PersonDAO with UtilityDAO => 

      def login(name:String, password:String) = {
        if (checkPassword(name,password)) 
          val token = recordLogin(name)
          Some(token)
        else
          None
      }
    }

!SLIDE small
# Hard to control Learning Curve

    @@@ Scala
    class PersonService {
      this: PersonDAO with UtilityDAO => 
    //^^^^^ What is this even called?!^^^
      def login(name:String, password:String) = {
        if (checkPassword(name,password)) 
          val token = recordLogin(name)
          Some(token)
        else
          None
      }
    }

!SLIDE
<img src="thisroll.jpg" height="577" />

!SLIDE bullets incremental
# High Risk 
* (though arguably high value)
* A win in the long term
* Productivity, Maintainability, Learnability hits in the short term
* Requires on-site or in-house experts (expensive)

